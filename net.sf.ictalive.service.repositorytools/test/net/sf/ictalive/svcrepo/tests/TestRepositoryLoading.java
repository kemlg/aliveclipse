package net.sf.ictalive.svcrepo.tests;

import java.io.File;
import java.io.FileInputStream;
import java.net.URI;

import net.sf.ictalive.service.tool.AliveRepoManagerHook;
import net.sf.ictalive.service.tool.FileSystemRepositoryCallbackImpl;
import net.sf.ictalive.svcrepo.StaticFileSystemServiceRepo;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.service.Service;


public class TestRepositoryLoading {
	Logger log = Logger.getLogger(this.getClass());

	@Before

	public void setup() {
		AliveRepoManagerHook.reset();
	}

	@Test
	public void testLoadingSingleService() throws Exception {
		OWLKnowledgeBase owlKB = OWLFactory.createKB();
		File[] dirs = new File[] { new File("example-services") };
		AliveRepoManagerHook.setup();
		AliveRepoManagerHook
				.addLocatorCallback(new FileSystemRepositoryCallbackImpl(dirs));
		Service svc = owlKB
				.readService(
						new FileInputStream(
								"example-services/DeliverEmail.owls"),
						URI
								.create("http://www.ist-alive.eu/services/CJSENDMSG/0.1/CJSENDMSG-email.owl"));
		Assert.assertNotNull(svc);
		System.out.println("preconditions " + svc.getProfile().getConditions());
		System.out.println("result " + svc.getProfile().getResults());
		System.out.println("Service " + svc);
	}

	@Test
	public void testLoadingStaticOntologies() throws Exception {
		StaticFileSystemServiceRepo repo = new StaticFileSystemServiceRepo();
		repo.setServiceDirectories(new File[] { new File("example-services") });
		repo.loadAllFiles();

		Assert.assertTrue(repo.getAllServices().size() > 0);
		System.err.println("Loaded " + repo.getAllServices().size()
				+ " services ");

		for (Service s : repo.getAllServices()) {
			System.err.println("Loadded service " + s.getURI());
			System.err.println("Profile : " + s.getProfile());
			System.err.println("Process: " + s.getProcess());
			System.err.println("Grounding : " + s.getGrounding());
			System.out.println("preconditions "
					+ s.getProfile().getConditions());
			System.out.println("preconditions " + s.getProfile().getResult());

		}
		for (OWLOntology o : repo.getAllOntologies()) {
			System.err.println("Loadded ontology " + o.getURI());
		}
	}
}
