package net.sf.ictalive.svcrepo.tests;

import java.io.File;
import java.net.URI;

import net.sf.ictalive.service.tool.AliveRepoManagerHook;
import net.sf.ictalive.service.tool.FileSystemRepositoryCallbackImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.service.Service;


/**
 * Simple test demonstrating the use of a local callback to resolve OWL-S
 * dependencies (imported ontologies) from a local file.
 * 
 * 
 * This test expects all of the imported ontologies for the service to be stored
 * in the specified local directory (example-services/).
 * 
 * Where a file is imported the file in the specified directory must have the
 * same local part name as the URI of the ontology (possibly suffixecd with
 * ".owl")
 * 
 * e.g.
 * 
 * if the URI is http://www.foo.org/ontologies/bar-ontology.owl
 * 
 * then the file which will be used will be :
 * 
 * example-services/bar-ontology.owl
 * 
 * likewise for: http://www.w3c.org/srwl/swrl
 * 
 * the file will be
 * 
 * example-services/swrl.owl
 * 
 * 
 * @author occ
 * 
 */
public class FileLoading {

	@Before
	public void setup() {
		AliveRepoManagerHook.reset();
	}

	@Test
	public void testLoadingServiceFromURI() throws Exception {
		OWLKnowledgeBase kb = OWLFactory.createKB();

		URI uri = URI
				.create("http://deliver.cj.usecases.istalive.eu/DeliverEmail.owls");

		// kb.setReasoner("Pellet");
		// construct the callback object

		FileSystemRepositoryCallbackImpl callback = new FileSystemRepositoryCallbackImpl(
				new File[] { new File("example-services/") });
		AliveRepoManagerHook.setup(true);
		AliveRepoManagerHook.addLocatorCallback(callback);

		Service s = kb.readService(uri);
		Assert.assertNotNull(s);
		System.out.println(s);

	}

	@Test
	public void testOntologyFromURI() throws Exception {
		OWLKnowledgeBase kb = OWLFactory.createKB();

		URI uri = URI
				.create("http://deliver.cj.usecases.istalive.eu/DeliverEmail.owls");

		// kb.setReasoner("Pellet");
		// construct the callback object

		FileSystemRepositoryCallbackImpl callback = new FileSystemRepositoryCallbackImpl(
				new File[] { new File("example-services/") });
		AliveRepoManagerHook.setup(true);
		AliveRepoManagerHook.addLocatorCallback(callback);

		OWLOntology s = kb.read(uri);
		Assert.assertNotNull(s);
		System.out.println(s);

	}

	/**
	 * Loads a single service, resolving all imports from a given local
	 * directory
	 * 
	 * @throws Exception
	 */
	@Test
	public void testLoadingFilesfromLocalDirectory() throws Exception {
		OWLKnowledgeBase kb = OWLFactory.createKB();
		// kb.setReasoner("Pellet");
		// construct the callback object
		FileSystemRepositoryCallbackImpl callback = new FileSystemRepositoryCallbackImpl();

		// Set the static set of search directo
		callback.setServiceDirectories(new File[] { new File(
				"example-services/") });

		// Construct the custom OWL reader

		// Set the Reader as the knowledgebase's default reader.
		AliveRepoManagerHook.setup(true);
		AliveRepoManagerHook.addLocatorCallback(callback);
		Service s = kb.readService(new File(
				"example-services/DeliverEmail.owls").toURI());

		Assert.assertNotNull(s);
		System.out.println("Read service " + s);
	}

	/**
	 * Loads all .owls files in a given directory, resolving all imports from a
	 * given local directory
	 * 
	 * @throws Exception
	 */

	@Test
	public void testLoadAllFilesfromLocalDirectory() throws Exception {
		OWLKnowledgeBase kb = OWLFactory.createKB();
		// kb.setReasoner("Pellet");
		// construct the callback object
		FileSystemRepositoryCallbackImpl callback = new FileSystemRepositoryCallbackImpl();

		// Set the static set of search directo
		callback.setServiceDirectories(new File[] { new File(
				"example-services/") });

		// Construct the custom OWL reader
		AliveRepoManagerHook.setup();
		AliveRepoManagerHook.addLocatorCallback(callback);

		File dir = new File("example-services/");
		Assert.assertTrue(dir.isDirectory());
		for (File f : dir.listFiles()) {

			// only read files ending in owls
			if (!f.getName().endsWith(".owls")) {
				System.out.println("Skipping " + f);
			}

			System.out.println("Reading service from " + f);
			Service s = kb.readService(new File(
					"example-services/DeliverEmail.owls").toURI());

			Assert.assertNotNull(s);
			System.out.println("Read service " + s);

		}

	}
}
