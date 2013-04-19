package net.sf.ictalive.svcrepo.tests;

import java.io.File;
import java.net.URI;

import net.sf.ictalive.svcrepo.OntologyRepository;
import net.sf.ictalive.svcrepo.ServiceRepository;

public class RepositoryTests {
	ServiceRepository serviceRepository;
	OntologyRepository ontologyRepository;

	File loadServices[] = new File[] {new File("example-services/CalicoJack.owl")};
	URI testServiceURI;
	URI testOntologyURI;

}
