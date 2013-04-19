package net.sf.ictalive.svcrepo.tests;

import java.net.URI;
import java.net.URL;
import java.util.Collection;

import junit.framework.Assert;
import net.sf.ictalive.service.discovery.WebServiceRepository;
import net.sf.ictalive.service.discovery.client.WebServiceClientFactory;
import net.sf.ictalive.service.tool.AliveRepoManagerHook;
import net.sf.ictalive.service.tool.RemoteWebServiceRepositoryCallback;
import net.sf.ictalive.svcrepo.RemoteWebserviceRepository;
import net.sf.ictalive.svcrepo.RepositoryBase;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.service.Service;

/**
 * TODO : refactor this to use a non-live
 * 
 * @author occ
 * 
 */
public class TestWebserviceRepositoryLoading {
	Logger log = Logger.getLogger(this.getClass());

	public static String TEST_WSDL = "http://147.83.200.118:8080/repo/ws/ObjectRepo?wsdl";
	public static String TEST_SERVICE = "http://tts.cj.usecases.istalive.eu/TTSWrapperServiceImpl#translateText";
	public static String TEST_GOOD_ONTOLOGY = "http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl";
	public static String TEST_BAD_ONTOLOGY = "http://adsadfsafgas/TTSsdasdaServiceImpl";
	RepositoryBase serviceRepository;

	@Before
	public void setup() throws Exception {

		// Create repository client - needs WSDL Location
		WebServiceClientFactory wscf = new WebServiceClientFactory();
		wscf.setWsdlLocation(new URL(TEST_WSDL));

		// Set up the repository calback hook - this is used to locate
		// ontologies which are imported to services
		AliveRepoManagerHook.reset();
		// Set up the basic Jena Hooks
		AliveRepoManagerHook.setup(true);
		// Add a web service repository callback
		AliveRepoManagerHook
				.addLocatorCallback(new RemoteWebServiceRepositoryCallback(wscf));

		// Finally create a web service repository
		WebServiceRepository wsr = wscf.createRepository();
		RepositoryBase rwsr;
		serviceRepository = rwsr = new RemoteWebserviceRepository(wsr,
				OWLFactory.createKB());

	}

	@Test
	/**
	 * Load a single service (by service URI from the repository) 
	 */
	public void testLoadingSingleService() throws Exception {
		Service svc = serviceRepository.getServiceFromURI(URI
				.create(TEST_SERVICE));
		Assert.assertNotNull(svc);

	}

	@Test
	public void testLoadingSingleOntology() throws Exception {
		OWLOntology owlo = serviceRepository.getOWLOntologyFromURI(URI
				.create(TEST_GOOD_ONTOLOGY));
		;
		Assert.assertNotNull(owlo);
		Assert.assertEquals(URI.create(TEST_GOOD_ONTOLOGY), owlo.getURI());
	}

	@Test
	public void testLoadingBadOntology() throws Exception {
		OWLOntology owlo = serviceRepository.getOWLOntologyFromURI(URI
				.create(TEST_BAD_ONTOLOGY));
		Assert.assertNull(owlo);

	}

	@Test
	public void testListingOntologies() throws Exception {
		Collection<OWLOntology> ontologies = serviceRepository
				.getAllOntologies();

		boolean found = false;
		for (OWLOntology owlo : ontologies) {
			if (owlo.getURI().equals(URI.create(TEST_GOOD_ONTOLOGY)))
				found = true;

		}
		Assert.assertTrue(found);
	}

	/**
	 * Load all available services from the repository
	 */
	@Test
	public void testListingServices() throws Exception {
		Collection<Service> services = serviceRepository.getAllServices();
		System.err.println("Got " + services.size() + " services");

		boolean found = false;
		for (Service s : services) {
			if (s.getURI().equals(URI.create(TEST_SERVICE))) {
				found = true;
			}
		}
		Assert.assertTrue(found);
	}

}
