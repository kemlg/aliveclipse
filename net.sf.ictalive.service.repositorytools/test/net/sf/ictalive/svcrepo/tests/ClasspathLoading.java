package net.sf.ictalive.svcrepo.tests;

import static org.junit.Assert.assertNotNull;

import java.net.URI;

import net.sf.ictalive.service.tool.AliveRepoManagerHook;
import net.sf.ictalive.service.tool.ClassPathRepositoryCallback;

import org.junit.Before;
import org.junit.Test;
import org.mindswap.owl.OWLClass;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;


public class ClasspathLoading {
	@Before
public void setup() {
	AliveRepoManagerHook.reset();
}

	@Test
	public void testClassPathLoading() throws Exception {
		ClassPathRepositoryCallback cb = new ClassPathRepositoryCallback();
		cb.addClassResourcePath(getClass().getClassLoader(), "testOntology/");
		OWLKnowledgeBase kb = OWLFactory.createKB();
		// kb.setReasoner("Pellet");
		AliveRepoManagerHook.setup(false);
		AliveRepoManagerHook.addLocatorCallback(cb);

		// Set the Reader as the knowledgebase's default reader.

		OWLOntology owlo = kb
				.read(URI
						.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl"));

		assertNotNull(owlo);
		OWLClass clazz = owlo
				.getClass(URI
						.create("http://www.csd.abdn.ac.uk/~dcorsar/ALIVE/CalicoJack.owl#Message"));
		assertNotNull(clazz);
	}
}
