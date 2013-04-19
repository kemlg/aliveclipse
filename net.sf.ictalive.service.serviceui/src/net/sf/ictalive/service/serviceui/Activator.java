package net.sf.ictalive.service.serviceui;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import javax.xml.ws.BindingProvider;

import net.sf.ictalive.service.discovery.ObjectDescriptor;
import net.sf.ictalive.service.discovery.ObjectNotFound;
import net.sf.ictalive.service.discovery.ObjectRepository;
import net.sf.ictalive.service.discovery.WebServiceRepository;
import net.sf.ictalive.service.discovery.client.RepositoryFactory;
import net.sf.ictalive.service.discovery.client.WebServiceClientFactory;
import net.sf.ictalive.service.serviceui.preferences.PreferenceConstants;

import net.sf.ictalive.service.tool.AliveRepoManagerHook;
import net.sf.ictalive.service.tool.RemoteWebServiceRepositoryCallback;

import org.apache.log4j.PropertyConfigurator;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.service.Service;
import org.mindswap.utils.URIUtils;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
	public static final String REPO_MARKER_ID = "net.sf.ictalive.service.serviceui.repomarker";
	Logger log = LoggerFactory.getLogger(Activator.class);
	// The plug-in ID
	public static final String PLUGIN_ID = "net.sf.ictalive.service.serviceui";
	public static final String TEMPLATE_SECTION = "templates";
	ObjectRepository repository;

	List<Runnable> servicesChanged = new LinkedList<Runnable>();

	public void notifyServicesChanged() {
		for (Runnable r : servicesChanged) {
			r.run();
		}
	}

	public void addServicesChangedNotifier(Runnable r) {
		servicesChanged.add(r);
	}

	// The shared instance
	private static Activator plugin;

	OWLKnowledgeBase knowledgeBase;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	ServiceSearchCache serviceSearchCache = new ServiceSearchCache();

	public ServiceSearchCache getServiceSearchCache() {
		return serviceSearchCache;
	}

	public RepositoryFactory getRepositoryFactory() {
		return new RepositoryFactory() {

			@Override
			public ObjectRepository createRepository() {

				return getRepository();
			}
		};
	}

	synchronized public ObjectRepository getRepository(
			IProgressMonitor withProgress) {

		withProgress.beginTask("Getting repository", 1);
		try {
			if (repository == null) {
				BuildRepositoryRunnable runnable = new BuildRepositoryRunnable();
				try {
					runnable.run(new SubProgressMonitor(withProgress, 1));
					repository = runnable.getRepository();
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				}
			}
			return repository;
		} finally {
			withProgress.done();
		}

	}

	/**
	 * Gets the current ontology/service repository
	 * 
	 * @return
	 */
	synchronized public ObjectRepository getRepository() {
		if (repository == null) {
			Display.getDefault().syncExec(new Runnable() {
				@Override
				public void run() {
					try {

						ProgressMonitorDialog pmd = new ProgressMonitorDialog(
								new Shell());
						BuildRepositoryRunnable runnable = new BuildRepositoryRunnable();
						pmd.run(false, false, runnable);
						repository = runnable.getRepository();
					} catch (Exception e) {
						log.error("Error loading service repository {}", e);
						e.printStackTrace(System.err);
					}
				}
			});

		}
		return repository;
	}

	public OWLKnowledgeBase getDefaultOWLKB() {
		if (knowledgeBase == null) {
			knowledgeBase = OWLFactory.createKB();
		}
		return knowledgeBase;
	}

	public void setupHook() {

		AliveRepoManagerHook.setup(true);
		AliveRepoManagerHook
				.addLocatorCallback(new RemoteWebServiceRepositoryCallback(
						new RepositoryFactory() {

							@Override
							public ObjectRepository createRepository() {
								return getRepository();
							}
						}));
	}

	/**
	 * Loads a service from the URI (e.g. using the repository)
	 * 
	 * returns the service defined in its own KB
	 * 
	 * @param uri
	 * @return
	 */
	public Service loadServiceFromURI(URI uri) {
		return loadServiceFromURI(uri, null);
	}

	/**
	 * Reeads a service from
	 * 
	 * @param uri
	 * @param owlKB
	 * @return
	 */
	public Service loadServiceFromURI(URI uri, OWLKnowledgeBase owlKB) {
		if (owlKB == null)
			owlKB = OWLFactory.createKB();
		Service svc;
		OWLOntology owlo = loadOntologyFromURI(URIUtils.standardURI(uri), owlKB);
		if (owlo != null) {
			return owlo.getService(uri);
		}
		return null;
	}

	/**
	 * @see #loadOntologyFromURI(URI, OWLKnowledgeBase)
	 * @param uri
	 * @return
	 */
	public OWLOntology loadOntologyFromURI(URI uri) {
		return loadOntologyFromURI(uri, null);
	}

	/**
	 * Loads an ontology "From the right place" into a given knowledge base
	 * 
	 * This will typically happen from the connected service/ontology repository
	 * 
	 * @param uri
	 *            ontology URI
	 * 
	 * @param owlKB
	 *            knowledge base - may be null
	 */
	public OWLOntology loadOntologyFromURI(URI uri, OWLKnowledgeBase owlKB) {
		if (owlKB == null)
			owlKB = OWLFactory.createKB();
		OWLOntology ontology;
		if ((ontology = owlKB.getOntology(uri)) != null) {
			return ontology;
		}
		ObjectRepository or = getRepository();
		URI ontURI = URIUtils.standardURI(uri);
		try {
			ObjectDescriptor desObject = or.fetchObjectDescriptor(ontURI);
			OWLOntology owlo = owlKB.read(desObject.getResourceURL().toURL()
					.openStream(), uri);
			return owlo;
		} catch (Exception oe) {
			log.error("Service {} not found  {} ", uri, oe);
			try {
				return owlKB.read(uri);

			} catch (IOException e) {
				log.error(
						"Failed to read service {} from default location: {}",
						uri, e);

				return null;
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		Properties p = new Properties();
		p.load(getClass().getClassLoader().getResourceAsStream(
				"log4j.properties"));

		PropertyConfigurator.configure(p);

		getPreferenceStore().addPropertyChangeListener(
				new IPropertyChangeListener() {

					@Override
					public void propertyChange(PropertyChangeEvent pce) {
						if (pce.getProperty().equals(
								PreferenceConstants.P_SVCREPOURL))
							repository = null;
					}
				});

		setupHook();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);

	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path
	 * 
	 * @param path
	 *            the path
	 * @return the image descriptor \
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	class BuildRepositoryRunnable implements IRunnableWithProgress {
		WebServiceRepository localRepo;

		public WebServiceRepository getRepository() {
			return localRepo;
		}

		@Override
		public void run(IProgressMonitor monitor)
				throws InvocationTargetException, InterruptedException {

			monitor.beginTask("Building Web service repository",
					IProgressMonitor.UNKNOWN);

			monitor.worked(1);
			WebServiceClientFactory cf = new WebServiceClientFactory() {
				@Override
				public WebServiceRepository createRepository() {
					WebServiceRepository wsr = super.createRepository();
					((BindingProvider) wsr).getRequestContext().put(
							"com.sun.xml.ws.connect.timeout", 5000);
					((BindingProvider) wsr).getRequestContext().put(
							"com.sun.xml.ws.request.timeout", 5000);

					// TODO Auto-generated method stub
					return super.createRepository();
				}
			};
			URL repoURL;
			try {
				repoURL = new URL(Activator.getDefault().getPreferenceStore()
						.getString(PreferenceConstants.P_SVCREPOURL));
			} catch (MalformedURLException e) {
				monitor.done();
				throw new RuntimeException(e);
			}
			cf.setWsdlLocation(repoURL);
			localRepo = cf.createRepository();
			monitor.worked(1);
			monitor.done();
		}
	}

	public static enum MM_MATCH {
		SUBCLASSES {
			@Override
			public String toString() {
				return "Any sub-class";
			}
		},
		EXACT {
			@Override
			public String toString() {
				return "Exact match";
			}
		},
		SUPERCLASSES {
			@Override
			public String toString() {
				return "Any super-class";
			}
		},

		IMMEDIATE_SUPERCLASSES {
			@Override
			public String toString() {
				return "Immediate sub-class";
			}
		},
		IMMEDIATE_SUBCLASSES {
			@Override
			public String toString() {
				return "Immediate super-class";
			}
		}
	}

	public static enum MMPREF {
		IOPR {
			@Override
			public String toString() {
				return "IOPR Only";
			}
		},
		IOPR_SIM {
			@Override
			public String toString() {
				return "IOPR + Similarity";
			}
		},
		IOPR_SIM_QOS {
			@Override
			public String toString() {
				return "IOPR + Similarity >  QoS";
			}
		},

		IOPR_OOS_SIM {
			@Override
			public String toString() {
				return "QoS > IOPR + Similarity";
			}
		}
	}

	public String[][] getMatchMakerInConfigurationNames() {
		String[][] vals = new String[MM_MATCH.values().length][2];

		for (int i = 0; i < vals.length; i++) {
			vals[i][1] = MM_MATCH.values()[i].name();
			vals[i][0] = MM_MATCH.values()[i].toString();

		}

		return vals;
	}

	public String[][] getMatchMakerOutConfigurationNames() {
		return getMatchMakerInConfigurationNames();
	}

	public String[][] getMatchMakerPrefConfigurationNames() {
		String[][] vals = new String[MMPREF.values().length][2];

		for (int i = 0; i < vals.length; i++) {
			vals[i][1] = MMPREF.values()[i].name();
			vals[i][0] = MMPREF.values()[i].toString();

		}

		return vals;
	}

	public MM_MATCH getInputMatch() {
		String name = getPreferenceStore().getString(
				PreferenceConstants.P_MM_INUPUTMATCH);
		MM_MATCH m = null;
		if (name == null) {
			m = MM_MATCH.valueOf(name);
		}
		if (m == null)
			return MM_MATCH.SUBCLASSES;
		return m;
	}

	public MM_MATCH getOutputMatch() {
		String name = getPreferenceStore().getString(
				PreferenceConstants.P_MM_OUTPUTMATCH);
		MM_MATCH m = null;
		if (name == null) {
			m = MM_MATCH.valueOf(name);
		}
		if (m == null)
			return MM_MATCH.SUBCLASSES;
		return m;
	}

	public MMPREF getMMPref() {
		String name = getPreferenceStore().getString(
				PreferenceConstants.P_MM_PREFERENCES);
		MMPREF m = null;
		if (name != null) {
			m = MMPREF.valueOf(name);
		}
		if (m == null)
			return MMPREF.IOPR_SIM;
		return m;
	}
}
