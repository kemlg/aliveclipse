package enacteventgeneration;

import static org.junit.Assert.assertNotNull;
import impl.jena.OWLKnowledgeBaseImpl;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URI;

import net.sf.ictalive.eventbus.EventBus;
import net.sf.ictalive.service.enactment.EventBusEnactmentListener;
import net.sf.ictalive.service.enactment.simpleevents.SimpleSerializationEnactmentListener;
import net.sf.ictalive.svcrepo.StaticFileSystemServiceRepo;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mindswap.exceptions.ExecutionException;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owl.OWLValue;
import org.mindswap.owls.OWLSFactory;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.process.execution.ProcessExecutionEngine;
import org.mindswap.owls.process.variable.Input;
import org.mindswap.owls.process.variable.Output;
import org.mindswap.owls.service.Service;
import org.mindswap.query.ValueMap;


public class testDeliverOWLS {
	public static final String SERVICE_DIRECTORY = "/home/occ/workspace/alive-service-repository-tools/example-services/";

	public static final String CJDOMAIN_URI = "http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl";

	public static final String DOMAIN_URI = "http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl";
	public static final String SERVICE_URI = "http://www.ist-alive.eu/services/CJSENDMSG/0.1/CJSENDMSG-email.owl#DeliverMessageService";
	public static final String EXAMPLE_URI = "http://www.ist-alive.eu/ontologies/CJSENDMSG/0.1/CJSENDMSG-example.owl";

	public static final String BOB = EXAMPLE_URI + "#bob_email_only";
	public static final String ALICE = EXAMPLE_URI + "#alice_phone_only";
	public static final String MSG_TO_ALICE = EXAMPLE_URI + "#msg_to_alice";
	public static final String CHANNEL_EMAIL = CJDOMAIN_URI + "#Email";
	public static final String CHANNEL_POTS = CJDOMAIN_URI + "#POTS";
	public static final String CHANNEL_IM = CJDOMAIN_URI + "#IM";

	Logger log = Logger.getLogger(testDeliverOWLS.class);

	@BeforeClass
	public static void init() {
		org.apache.log4j.BasicConfigurator.resetConfiguration();

		org.apache.log4j.PropertyConfigurator
				.configure("conf/log4j.properties");

	}

	/**
	 * @param args
	 */
	@Test
	public void testInvokeDeliverService() throws Exception {

		Service service;
		Process process;
		ValueMap<Input, OWLValue> inputs;
		ValueMap<Output, OWLValue> outputs;
		ProcessExecutionEngine exec;

		// create an execution engine
		exec = OWLSFactory.createExecutionEngine();

		EventBusEnactmentListener listener = new EventBusEnactmentListener();
		listener.setEventBus(new EventBus());
		exec.addMonitor(listener);

		StaticFileSystemServiceRepo serviceRepository = new StaticFileSystemServiceRepo();
		OWLKnowledgeBase owlKB = OWLFactory.createKB();
		owlKB.setReasoner("Pellet");
		serviceRepository.setOwlKB(owlKB);

		serviceRepository.setServiceDirectories(new File[] { new File(
				SERVICE_DIRECTORY) });

		serviceRepository.loadAllFiles();
		// Attach a listener to the execution engine
		FileOutputStream fos = new FileOutputStream("testlog", true);

		SimpleSerializationEnactmentListener sel = new SimpleSerializationEnactmentListener(
				fos);

		exec.addMonitor(sel);

		System.out.println("Creating OWLKnowledgeBase...");
		final OWLKnowledgeBase kb = serviceRepository.getOwlKB();
		log.debug("loaded ontologies " + serviceRepository.getAllOntologies());
		OWLOntology oDomain = serviceRepository.getOWLOntologyFromURI(URI
				.create(DOMAIN_URI));
		assertNotNull(oDomain);

		OWLOntology oExample = serviceRepository.getOWLOntologyFromURI(URI
				.create(EXAMPLE_URI));

		assertNotNull(oExample);

		OWLIndividual test_msg = oExample.getIndividual(URI
				.create(MSG_TO_ALICE));
		log.debug("loaded message" + test_msg);
		oExample.write(System.out, URI.create(MSG_TO_ALICE));
		assertNotNull("Cant' find test message object", test_msg);

		OWLIndividual email_channel = kb.getIndividual(URI
				.create(CHANNEL_EMAIL));
		assertNotNull("Can't load email channel", email_channel);
		OWLIndividual pots_channel = kb.getIndividual(URI.create(CHANNEL_POTS));
		assertNotNull("Can't load  pots channel", email_channel);
		OWLIndividual im_channel = kb.getIndividual(URI.create(CHANNEL_IM));
		assertNotNull("Can't load  IM channel", email_channel);

		log.debug("Loaded services " + kb.getServices(true));
		service = kb.getService(URI.create(SERVICE_URI));
		assertNotNull(service);

		System.out.println("Got service " + service);
		System.out.println("Getting process...");
		process = service.getProcess();
		assertNotNull(process);
		log.debug("got proceess " + process);
		System.out.println("Calling service..." + process);

		inputs = new ValueMap<Input, OWLValue>();
		log.debug("service has inputs" + process.getInputs());

		inputs.setValue(process.getInput("MessageIn"), (OWLValue) test_msg);
		try {
			outputs = exec.execute(process, inputs, kb);
		} catch (ExecutionException e) {
			sel.executionFailed(e);
			throw e;
		}
		log.debug("got outputs" + outputs);
		/* Can now do something with 'outputs' if you want */

	}
}
