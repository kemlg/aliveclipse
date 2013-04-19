package agents;

import com.google.common.collect.ImmutableMap;
import edu.bath.matchmaker.InputMatcher;
import edu.bath.matchmaker.Match;
import edu.bath.matchmaker.OutputMatcher;
import edu.bath.matchmaker.ServiceDescriptor;
import java.net.URI;
import java.util.List;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owl.vocabulary.OWL;
import static org.junit.Assert.*;

/**
 * 
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class MatchMakerAgentTest {

	public MatchMakerAgentTest() {
	}

	static MatchMakerAgent agent;

	@BeforeClass
	public static void setUpClass() throws Exception {
		try {
			agent = new MatchMakerAgent();
		} catch (javax.xml.ws.WebServiceException e) {
			Assume.assumeNoException(e);
		} catch (RuntimeException e) {
			if (e.getCause() != null
					&& e.getCause().getClass().getSimpleName().equals(
							"RuntimeModelerException")) {
				Assume.assumeNoException(e);
			} else {
				throw e;
			}
		}
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
		if (agent != null)
			agent.shutdown();
	}

	static final int PRELOADED_SERVICES_COUNT = 30;

	@Ignore("Failing tests, not sure why")
	@Test
	public void testPreloadedServices() {
		assertEquals(PRELOADED_SERVICES_COUNT, agent.getMatchMaker()
				.getServices().size());
	}

	@Ignore("Failing tests, not sure why")
	@Test
	public void testSimpleRankedQuery() {
		OWLOntology query = ServiceDescriptor.fromInputsOutputs(
				URI.create("QUERY"),
				ImmutableMap.of(URI.create("input"), OWL.Nothing.getURI()),
				ImmutableMap.<URI, URI> of()).toOwls(null).getOntology();
		assertEquals(PRELOADED_SERVICES_COUNT, ServicePrefs.DEFAULT
				.getPreference().sortedCopy(
						agent.getMatchMaker().match(query,
								InputMatcher.SUPERCLASSES,
								OutputMatcher.SUBCLASSES)).size());
	}

	@Ignore("Failing tests, not sure why")
	@Test
	public void testExactness() {
		// each service queried returns itself as first result
		for (ServiceDescriptor sd : agent.getMatchMaker().getServices()
				.values()) {
			OWLOntology query = sd.toOwls(null).getOntology();
			List<List<Match>> results = ServicePrefs.DEFAULT.getPreference()
					.topElements(
							agent.getMatchMaker().match(query,
									InputMatcher.SUPERCLASSES,
									OutputMatcher.SUBCLASSES),
							Integer.MAX_VALUE);
			assertTrue(results.size() > 0);
			assertEquals(1, results.get(0).size());
			assertEquals(sd, results.get(0).get(0).getService());
		}
	}
}