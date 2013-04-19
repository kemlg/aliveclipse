package net.sf.ictalive.service.matchmakertab;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;

import javax.management.RuntimeErrorException;
import javax.xml.bind.JAXBException;

import net.sf.ictalive.coordination.actions.Action;
import net.sf.ictalive.service.discovery.query.DiscoverySearch;
import net.sf.ictalive.service.serviceui.Activator.MMPREF;
import net.sf.ictalive.service.serviceui.Activator.MM_MATCH;
import net.sf.ictalive.service.serviceui.preferences.PreferenceConstants;
import net.sf.ictalive.service.tool.AliveRepoManagerHook;
import net.sf.ictalive.service.tool.FileSystemRepositoryCallbackImpl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import agents.QualityOfServiceAggregator;
import agents.QualityOfServicePreferences;
import agents.ReloadableMatchMaker;
import agents.ServicePrefs;
import agents.WebServiceRepositorySynchronizer;
import agents.qos.QoSRemoteSynchonizer;
import agents.ws.MatchMakerWS;
import agents.ws.MatchMakerWSImpl;
import agents.ws.MatchMakerWS.MatchResult;
import agents.ws.MatchMakerWSEndpoint.Proxy;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import edu.bath.matchmaker.InputMatcher;
import edu.bath.matchmaker.MatchMaker;
import edu.bath.matchmaker.OutputMatcher;
import edu.bath.matchmaker.Preferences;
import edu.bath.matchmaker.ServiceDescriptor;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	Logger log = LoggerFactory.getLogger(Activator.class);
	// The plug-in ID
	public static final String PLUGIN_ID = "net.sf.ictalive.service.matchmakertab";

	Map<Action, MatchResult[]> matchMakerResults = new HashMap<Action, MatchResult[]>();
	OWLKnowledgeBase resultsKB = null;

	Map<MMPREF, Callable<MatchMaker>> initialMMFactory = new HashMap<MMPREF, Callable<MatchMaker>>();

	{
		initialMMFactory.put(MMPREF.IOPR, new Callable<MatchMaker>() {
			@Override
			public MatchMaker call() throws Exception {
				return new MatchMaker(new Preferences.ParamExactnessDecorator());
			}
		});
		initialMMFactory.put(MMPREF.IOPR_SIM, new Callable<MatchMaker>() {
			@Override
			public MatchMaker call() throws Exception {
				return new MatchMaker(
						new Preferences.ParamExactnessDecorator(),
						new Preferences.DescriptionSimilarityDecorator(),
						new Preferences.PostconditionSimilarityDecorator(),
						new Preferences.PreconditionSimilarityDecorator());
			}
		});

		initialMMFactory.put(MMPREF.IOPR_SIM_QOS, new Callable<MatchMaker>() {
			@Override
			public MatchMaker call() throws Exception {
				return new MatchMaker(
						new Preferences.ParamExactnessDecorator(),
						new Preferences.DescriptionSimilarityDecorator(),
						new Preferences.PostconditionSimilarityDecorator(),
						new Preferences.PreconditionSimilarityDecorator(),
						QualityOfServicePreferences
								.createMatchDecorator(getQualityOfServiceAggregator()));
			}
		});

		initialMMFactory.put(MMPREF.IOPR_OOS_SIM, new Callable<MatchMaker>() {
			@Override
			public MatchMaker call() throws Exception {
				return new MatchMaker(
						new Preferences.ParamExactnessDecorator(),
						new Preferences.DescriptionSimilarityDecorator(),
						new Preferences.PostconditionSimilarityDecorator(),
						new Preferences.PreconditionSimilarityDecorator(),
						QualityOfServicePreferences
								.createMatchDecorator(getQualityOfServiceAggregator()));
			}
		});

	}

	QualityOfServiceAggregator getQualityOfServiceAggregator() {
		String qosFile = net.sf.ictalive.service.serviceui.Activator
				.getDefault().getPreferenceStore().getString(
						PreferenceConstants.P_QOS_DATA_FILE);

		QualityOfServiceAggregator qosa = new QualityOfServiceAggregator();
		File qosaf;
		if (qosFile == null || qosFile.isEmpty()
				|| !(qosaf = new File(qosFile)).exists()) {
			log.debug("No QOS file set - returning empty aggregator");
			return qosa;
		}

		QoSRemoteSynchonizer sync = new QoSRemoteSynchonizer(qosaf);
		try {
			sync.initializeMap(qosa.getMap());
		} catch (JAXBException e) {

			e.printStackTrace();
		}
		return qosa;
	}

	public Map<Action, MatchResult[]> getMatchMakerResults() {
		return matchMakerResults;
	}

	ReloadableMatchMaker reloadableMatchMaker;
	private MatchMaker localTemplateMatchmaker;

	public void setMatchMakerResults(
			Map<Action, MatchResult[]> matchMakerResults) {
		this.matchMakerResults = matchMakerResults;
	}

	public OWLKnowledgeBase getResultsKB() {
		return resultsKB;
	}

	public void setResultsKB(OWLKnowledgeBase owlkb) {
		resultsKB = owlkb;
	}

	MatchMaker localMatchMaker = null;

	public void resetLocalMatchMaker() {
		localMatchMaker = null;
		localTemplateMatchmaker = null;
	}

	public MatchMaker createEmptyMatchmaker() {

		MMPREF pref = net.sf.ictalive.service.serviceui.Activator.getDefault()
				.getMMPref();
		Callable<MatchMaker> mm = initialMMFactory.get(pref);
		if (mm == null) {
			log.warn("No matchmaker constructor found");
			return new MatchMaker(new Preferences.ParamExactnessDecorator(),
					new Preferences.DescriptionSimilarityDecorator(),
					new Preferences.PostconditionSimilarityDecorator(),
					new Preferences.PreconditionSimilarityDecorator());
		} else {
			try {
				return mm.call();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

	}

	static class SyncException extends RuntimeException {
	}

	IRunnableWithProgress refreshTemplateMatchMakerRunnable = new IRunnableWithProgress() {
		@Override
		public void run(final IProgressMonitor monitor)
				throws InvocationTargetException, InterruptedException {

			log.debug("Refreshing template matchmaker");
			if (localTemplateMatchmaker == null) {
				localTemplateMatchmaker = createEmptyMatchmaker();
			}
			synchronized (localTemplateMatchmaker) {
				doSynchronizeMatchmaker(
						localTemplateMatchmaker,
						WebServiceRepositorySynchronizer.DEFAULT_TEMPLATE_SEARCH,
						monitor);

			}

			log.debug("Finished refreshing template matchmaker");

		}

	};

	Map<MMPREF, ServicePrefs> prefs = new EnumMap<MMPREF, ServicePrefs>(
			MMPREF.class);

	{
		prefs.put(MMPREF.IOPR, ServicePrefs.BEST_INPUTS_AND_OUTPUTS);
		prefs.put(MMPREF.IOPR_SIM,
				ServicePrefs.BEST_INPUTS_AND_OUTPUTS_SIMILARITY);
		prefs.put(MMPREF.IOPR_SIM_QOS,
				ServicePrefs.BEST_INPUTS_AND_OUTPUTS_SIMILARITY_PERF);
		prefs.put(MMPREF.IOPR_OOS_SIM, ServicePrefs.BEST_PERF_INPUTS_OUTPUTS);
	}

	ServicePrefs getCurrentPrefs() {
		MMPREF pref = net.sf.ictalive.service.serviceui.Activator.getDefault()
				.getMMPref();
		return prefs.get(pref);

	}

	Map<MM_MATCH, InputMatcher> inputMatchPref = new EnumMap<MM_MATCH, InputMatcher>(
			MM_MATCH.class);
	Map<MM_MATCH, OutputMatcher> outputMatchPref = new EnumMap<MM_MATCH, OutputMatcher>(
			MM_MATCH.class);

	{
		inputMatchPref.put(MM_MATCH.EXACT, InputMatcher.EXACT);
		inputMatchPref.put(MM_MATCH.IMMEDIATE_SUBCLASSES,
				InputMatcher.IMMEDIATE_SUBCLASSES);
		inputMatchPref.put(MM_MATCH.IMMEDIATE_SUPERCLASSES,
				InputMatcher.IMMEDIATE_SUPERCLASSES);
		inputMatchPref.put(MM_MATCH.SUBCLASSES, InputMatcher.SUBCLASSES);
		inputMatchPref.put(MM_MATCH.SUPERCLASSES, InputMatcher.SUPERCLASSES);

		outputMatchPref.put(MM_MATCH.EXACT, OutputMatcher.EXACT);
		outputMatchPref.put(MM_MATCH.IMMEDIATE_SUBCLASSES,
				OutputMatcher.IMMEDIATE_SUBCLASSES);
		outputMatchPref.put(MM_MATCH.IMMEDIATE_SUPERCLASSES,
				OutputMatcher.IMMEDIATE_SUPERCLASSES);
		outputMatchPref.put(MM_MATCH.SUPERCLASSES, OutputMatcher.SUPERCLASSES);

		outputMatchPref.put(MM_MATCH.SUBCLASSES, OutputMatcher.SUBCLASSES);

	}

	InputMatcher getInputMatcher() {
		return Preconditions.checkNotNull(inputMatchPref
				.get(net.sf.ictalive.service.serviceui.Activator.getDefault()
						.getInputMatch()));
	}

	OutputMatcher getOutputMatcher() {
		return Preconditions.checkNotNull(outputMatchPref
				.get(net.sf.ictalive.service.serviceui.Activator.getDefault()
						.getOutputMatch()));
	}

	IRunnableWithProgress refreshMatchMakerRunnable = new IRunnableWithProgress() {
		@Override
		public void run(final IProgressMonitor monitor)
				throws InvocationTargetException, InterruptedException {
			// Placeholder to tag throws from delegates

			log.debug("refreshing service matchmaker");
			if (localMatchMaker == null) {
				localMatchMaker = createEmptyMatchmaker();
			}

			synchronized (localMatchMaker) {
				if (getPreferenceStore()
						.getBoolean(
								net.sf.ictalive.service.serviceui.preferences.PreferenceConstants.P_USE_LOCAL_MATCHMAKER_FILES)) {

					// Load Services from directory
					String localPath = getPreferenceStore()
							.getString(
									net.sf.ictalive.service.serviceui.preferences.PreferenceConstants.P_LOCAL_SERVICES_PATH);
					OWLKnowledgeBase owlKB = OWLFactory.createKB();
					log.debug("Loading service from local directory {}",
							localPath);
					if (localPath != null && !localPath.equals("")) {
						// OWLKnowledgeBase owlKB = OWLFactory.createKB();
						File dir = new File(localPath);

						if (!dir.exists()) {
							return;
						}

						// create callback to try and resolve URIs that can't be
						// found to
						// this local directory
						FileSystemRepositoryCallbackImpl fscb = new FileSystemRepositoryCallbackImpl(
								new File[] { dir });
						AliveRepoManagerHook.setup(true);
						AliveRepoManagerHook.addLocatorCallback(fscb);

						log.debug("dir: " + dir.toString());

						File[] serviceFiles = dir
								.listFiles(new FilenameFilter() {

									@Override
									public boolean accept(File dir, String name) {
										return name.endsWith(".owls");
									}
								});
						monitor.subTask("Loading services from "
								+ dir.toString());

						for (File f : serviceFiles) {

							try {
								System.out.println("Loading: " + f.toString());
								OWLOntology owlo = owlKB.read(f.toURI());
								log.debug("read ontology {}", owlo.getURI());
							} catch (IOException ioex) {
								System.err.println("Error Reading owls: "
										+ ioex.toString());
							}
							monitor.worked(1);
						}
					}

					if (usingDummyServices()) {
						log.debug("loading dummy services");
						for (int i = 0; i < 20; i++) {
							OWLOntology oo = createDummyService().toOwls("")
									.getOntology();

							localMatchMaker.registerService(oo);
							log.debug("registered dummy service {}", oo
									.getURI());
							monitor.subTask("Registered " + oo.getURI());

						}
					}

					for (OWLOntology onto : owlKB.getOntologies(false)) {
						if (!onto.getServices(true).isEmpty()) {
							log.debug("registered service {}", onto.getURI());
							localMatchMaker.registerService(onto);
							monitor.subTask("Registered " + onto.getURI());
						}
					}

				} else {
					doSynchronizeMatchmaker(
							localMatchMaker,
							WebServiceRepositorySynchronizer.DEFAULT_SERVICE_SEARCH,
							monitor);
				}
			}

		}
	};

	WebServiceRepositorySynchronizer wsRepoSynchronizer;

	/**
	 * Gets the current ws repo syncer which should be used for cached
	 * matchmaker updates
	 * 
	 * @return
	 */
	public synchronized WebServiceRepositorySynchronizer getRepoSynchronizer() {
		if (wsRepoSynchronizer != null
				&& net.sf.ictalive.service.serviceui.Activator.getDefault()
						.getRepository() == wsRepoSynchronizer.getRepository()) {
			return wsRepoSynchronizer;
		} else {
			wsRepoSynchronizer = new WebServiceRepositorySynchronizer(
					net.sf.ictalive.service.serviceui.Activator.getDefault()
							.getRepository());
			return wsRepoSynchronizer;
		}

	}

	/***
	 * Actually synchronizes a given matchmaker with the repository content
	 * described in a given search
	 * 
	 * This should be called within a progress monitored environment
	 * 
	 * @param mm
	 * @param source
	 * @param monitor
	 * @throws SyncException
	 */
	private void doSynchronizeMatchmaker(final MatchMaker mm,
			final DiscoverySearch source, final IProgressMonitor monitor)
			throws SyncException {

		log.debug("Synchronizing matchmaker {} with search {} ", mm, source);
		monitor.beginTask(
				"Synchronizing local matchmaker services with repository",
				IProgressMonitor.UNKNOWN);

		monitor.subTask("Starting matchmaker sync ");

		WebServiceRepositorySynchronizer webRepoSyncer = getRepoSynchronizer();

		try {
			webRepoSyncer.pollAndRegister(mm, source,
					new WebServiceRepositorySynchronizer.SyncListener() {
						@Override
						public void serviceSynced(URI uri) {
							if (monitor.isCanceled())
								throw new SyncException();
							monitor.worked(100);
							monitor.subTask("Synchronized " + uri);
							log.debug("synced {}", uri);

						}
					});

			log.debug("Sync complete");
		} catch (IOException e) {

			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			monitor.done();
		}
	}

	public IRunnableWithProgress getRefreshMatchMakerRunnable() {
		return refreshMatchMakerRunnable;
	}

	/**
	 * Refreshes the current matchmaker (fires up a progress dialog)
	 */
	public void refreshLocalMatchmakerWithProgressDialog() {

		IWorkbench wb = getWorkbench();
		Shell shell = null;
		if (wb != null) {
			if (null != wb.getActiveWorkbenchWindow()) {

				shell = wb.getActiveWorkbenchWindow().getShell();
			}
		}
		if (shell == null) {
			NullProgressMonitor npm = new NullProgressMonitor();

			try {
				refreshMatchMakerRunnable.run(npm);
			} catch (Exception e) {
			}
		} else {
			ProgressMonitorDialog pmd = new ProgressMonitorDialog(shell);

			pmd.setCancelable(true);
			try {

				pmd.run(false, true, refreshMatchMakerRunnable);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void refreshTemplateMatchmakerWithProgressDialog() {
		ProgressMonitorDialog pmd = new ProgressMonitorDialog(getWorkbench()
				.getActiveWorkbenchWindow().getShell());

		pmd.setCancelable(true);
		try {
			pmd.run(false, true, refreshTemplateMatchMakerRunnable);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns the current matchmaker, should be used transiently, may fire up a
	 * progress bar
	 * 
	 * @return
	 */
	public synchronized MatchMaker getLocalMatchmakerInstance() {
		if (localMatchMaker != null) {
			return localMatchMaker;
		} else {
			refreshLocalMatchmakerWithProgressDialog();
			return localMatchMaker;
		}
	}

	MatchMakerWS matchMakerWS = null;
	Proxy proxy = null;
	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {

	}

	public void resetMMWebService() {
		matchMakerWS = null;
	}

	public MatchResult[] getAllServices() {
		ServiceDescriptor sd = ServiceDescriptor.query(ImmutableSet
				.of(org.mindswap.owl.vocabulary.OWL.Nothing.getURI()),
				ImmutableSet.<URI> of());

		MatchMakerWS mmws = getMatchMakerWebService();

		StringWriter sw = new StringWriter();
		sd.toOwls("").getOntology().write(sw, null);
		String query = sw.toString();

		MatchResult[] results = mmws.performMatch(query, ServicePrefs.DEFAULT,
				5);

		return results;

	}

	public MatchMakerWS getMatchMakerWebService() {

		if (matchMakerWS == null) {
			MatchMakerWSImpl wsImpl = new MatchMakerWSImpl(
					new ReloadableMatchMaker() {

						@Override
						public void reload() {
							refreshLocalMatchmakerWithProgressDialog();

						}

						@Override
						public MatchMaker getMatchMaker() {
							return getLocalMatchmakerInstance();
						}
					});

			matchMakerWS = wsImpl;
		}
		return matchMakerWS;
	}

	public boolean usingDummyServices() {
		boolean useDummy = getPreferenceStore()
				.getBoolean(
						net.sf.ictalive.service.serviceui.preferences.PreferenceConstants.P_CREATE_DUMMY_SERVICES);
		return useDummy;
	}

	private int serviceNum = 0;

	public ServiceDescriptor createDummyService() {

		String prefix = MatchMakerWS.TARGET_NAMESPACE;

		URI[] URIs = new URI[] { URI.create(prefix + "/A"),
				URI.create(prefix + "/B"), URI.create(prefix + "/C"),
				URI.create(prefix + "/D"), URI.create(prefix + "/E") };

		Random rand = new Random();

		int argnum = 0;

		ImmutableMap.Builder<URI, URI> inputBuilder = ImmutableMap.builder();

		int max = rand.nextInt(2) + 1;

		for (int i = 0; i < max; i++) {
			inputBuilder.put(URI.create(prefix + "/arg" + argnum), URIs[rand
					.nextInt(URIs.length)]);
			argnum++;
		}

		ImmutableMap.Builder<URI, URI> outputBuilder = ImmutableMap.builder();

		max = rand.nextInt(2) + 1;

		for (int i = 0; i < max; i++) {
			outputBuilder.put(URI.create(prefix + "/arg" + argnum), URIs[rand
					.nextInt(URIs.length)]);
			argnum++;
		}

		URI name = URI.create(prefix + "/Test/" + serviceNum);

		serviceNum++;

		return ServiceDescriptor.fromInputsOutputs(name, inputBuilder.build(),
				outputBuilder.build());
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

		net.sf.ictalive.service.serviceui.Activator.getDefault()
				.getPreferenceStore().addPropertyChangeListener(
						new IPropertyChangeListener() {

							@Override
							public void propertyChange(PropertyChangeEvent pce) {
								resetLocalMatchMaker();
								resetMMWebService();
							}
						});

		net.sf.ictalive.service.serviceui.Activator.getDefault()
				.addServicesChangedNotifier(new Runnable() {
					public void run() {
						resetLocalMatchMaker();
						resetMMWebService();
					}
				});
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
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	public synchronized MatchMaker getTemplateMatchmaker() {
		if (localTemplateMatchmaker != null) {
			return localTemplateMatchmaker;
		} else {
			refreshTemplateMatchmakerWithProgressDialog();
		}
		return localTemplateMatchmaker;

	}
}
