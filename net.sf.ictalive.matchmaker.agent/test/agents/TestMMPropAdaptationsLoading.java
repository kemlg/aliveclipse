package agents;

import java.net.URI;
import java.util.Collection;
import java.util.Properties;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import agents.WebServiceRepositorySynchronizer.PropertyAdaptation;

public class TestMMPropAdaptationsLoading {
	Properties testp;

	@Before
	public void before() {
		testp = new Properties();
	}

	@Test
	public void testLoadingAdaptation() throws Exception {

		testp.setProperty("a1.fromClass", "urn:fromClass");
		testp.setProperty("a1.toClass", "urn:toClass");
		testp.setProperty("a1.viaProperty", "urn:viaProperty");
		testp.setProperty("a1.reliability", "0.4");

		Collection<PropertyAdaptation> adaptors = WebServiceRepositorySynchronizer
				.parsePropertyAdaptationFile(testp, "urn:testService");

		Assert.assertEquals(1, adaptors.size());
		PropertyAdaptation pa = adaptors.iterator().next();
		Assert.assertEquals(URI.create("urn:testService#a1"), pa.source);
		Assert.assertEquals(URI.create("urn:fromClass"), pa.fromClass);
		Assert.assertEquals(URI.create("urn:toClass"), pa.toClass);
		Assert.assertEquals(URI.create("urn:viaProperty"), pa.viaProperty);
		Assert.assertEquals(0.4D, pa.reliability);

	}

	@Test
	public void testLoadingIncomplete() throws Exception {
		testp.setProperty("a1.fromClass", "urn:fromClass");
		testp.setProperty("a1.toClass", "urn:toClass");

		Assert.assertTrue(WebServiceRepositorySynchronizer
				.parsePropertyAdaptationFile(testp, "urn:base").isEmpty());
	}
}
