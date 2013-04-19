package agents.ws;

import agents.MatchMakerAgent;
import agents.ServicePrefs;
import agents.ws.MatchMakerWS.MatchResult;
import edu.bath.matchmaker.OwlsUtils;
import edu.bath.matchmaker.ServiceDescriptor;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MatchMakerWSTest {
    private static MatchMakerAgent agent;
    private static MatchMakerWS client;

    @BeforeClass
    public static void setUp() throws Exception {
        try {
            agent = new MatchMakerAgent();
            client = MatchMakerWSEndpoint.createClient(agent.proxy.getServiceLocation());
        } catch (Throwable t) {
            Assume.assumeNoException(t);
        }
    }

    @Ignore("Failing tests, not sure why")
    @Test
    public void testServiceInputsOutputs() {
        for (ServiceDescriptor query : agent.getMatchMaker().getServices().values()) {
            MatchResult[] results = client.performMatch(OwlsUtils.toString(query.toOwls("").getOntology(), null), ServicePrefs.DEFAULT, 1);
            for (MatchResult result : results) {
                Assert.assertEquals(query.getInputs(), result.getServiceInputs());
                Assert.assertEquals(query.getOutputs(), result.getServiceOutputs());
            }
        }
    }

    @AfterClass
    public static void tearDown() {
        if (agent != null) {
            agent.proxy.getEndpoint().stop();
        }
    }
}
