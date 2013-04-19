package net.sf.ictalive.service.enactmenttab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import net.sf.ictalive.service.enactment.simpleevents.SimpleEnactmentEvent;
import net.sf.ictalive.svcrepo.ServiceRepository;
import net.sf.ictalive.svcrepo.StaticFileSystemServiceRepo;

import org.apache.log4j.Logger;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLKnowledgeBase;
import org.osgi.framework.BundleContext;

import com.hp.hpl.jena.reasoner.ReasonerRegistry;


/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	Logger log = Logger.getLogger(Activator.class);
	// The plug-in ID
	public static final String PLUGIN_ID = "alive_service_enactment_tab";
	ReasonerRegistry rr;
	// The shared instance
	private static Activator plugin;
	String eventLogFile = "/home/occ/workspace/CalicoJack/testlog";
	ServiceEventProvider serviceEventProvider;

	public ServiceEventProvider getServiceEventProvider() {
		return serviceEventProvider;
	}

	OWLKnowledgeBase owlKB;

	public OWLKnowledgeBase getOwlKB() {
		return owlKB;
	}

	public void setOwlKB(OWLKnowledgeBase owlKB) {
		this.owlKB = owlKB;
	}

	public ServiceRepository getServiceRepository() {
		return serviceRepository;
	}

	public void setServiceRepository(
			StaticFileSystemServiceRepo serviceRepository) {
		this.serviceRepository = serviceRepository;
	}

	StaticFileSystemServiceRepo serviceRepository;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	public void loadEvents() {
		List<SimpleEnactmentEvent> events = new ArrayList<SimpleEnactmentEvent>();
		try {
			FileInputStream fis = new FileInputStream(eventLogFile);

			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			JAXBContext jc = JAXBContext
					.newInstance("eu.istalive.service.enactment.simpleevents");
			Unmarshaller unmarshaller = jc.createUnmarshaller();

			String xmlString = null;
			while (null != (xmlString = br.readLine())) {
				SimpleEnactmentEvent see = (SimpleEnactmentEvent) unmarshaller
						.unmarshal(new StringReader(xmlString));
				log.debug("loaded event " + see);
				events.add(see);
			}
			serviceEventProvider.setEvents(events);
		} catch (Exception e) {
			log.error(e);
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
		owlKB = OWLFactory.createKB();
		serviceRepository = new StaticFileSystemServiceRepo();
		serviceRepository
				.setServiceDirectories(new File[] { new File(
						"/home/occ/workspace/alive-service-repository-tools/example-services/") });
		serviceRepository.loadAllFiles();

		serviceEventProvider = new ServiceEventProvider();
		loadEvents();
		// serviceEventProvider.setEvents();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
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
}
