package test.svcrepo;

import java.io.File;

import net.sf.ictalive.svcrepo.StaticFileSystemServiceRepo;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.mindswap.owls.service.Service;


public class TestServiceLoading {
	Logger log = Logger.getLogger(this.getClass());

	@Test
	public void testLoadingStaticOntologies() throws Exception {
		StaticFileSystemServiceRepo repo = new StaticFileSystemServiceRepo();
		repo.setServiceDirectories(new File[] { new File("example-services") });
		repo.loadAllFiles();
		Assert.assertTrue(repo.getAllServices().size() > 0);
		System.err.println("Loadded " + repo.getAllServices().size() + " services ");

		for (Service s : repo.getAllServices()) {
			System.err.println("Loadded service " + s);
		}
	}
}
