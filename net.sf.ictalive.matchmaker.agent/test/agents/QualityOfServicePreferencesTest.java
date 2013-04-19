package agents;

import com.google.common.collect.Iterables;
import edu.bath.matchmaker.InputMatchers;
import edu.bath.matchmaker.Match;
import edu.bath.matchmaker.MatchMaker;
import edu.bath.matchmaker.OutputMatchers;
import edu.bath.matchmaker.ServiceDescriptor;
import java.net.URI;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.mindswap.owl.OWLOntology;
import static org.junit.Assert.*;

/**
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class QualityOfServicePreferencesTest {
    /**
     * Shows that the QualityOfServiceAggregator, through the MatchDecorator created by
     * QualityOfServicePreferences.createMatchDecorator(), *does* decorate the matches
     * of a matchmaker, using the updated QoS metrics.
     */
    @Test
    public void test() {
        QualityOfServiceAggregator aggr = new QualityOfServiceAggregator();
        MatchMaker mm = new MatchMaker(QualityOfServicePreferences.createMatchDecorator(aggr));

        URI uri = URI.create("service");
        ServiceDescriptor s = ServiceDescriptor.fromInputsOutputs(uri,
                Collections.<URI, URI>emptyMap(),
                Collections.<URI, URI>emptyMap());
        OWLOntology onto = s.toOwls("").getOntology();

        mm.registerService(onto);

        Match m1 = Iterables.getOnlyElement(mm.match(onto, InputMatchers.EXACT, OutputMatchers.EXACT));

        assertEquals(Long.MAX_VALUE, m1.getDecoration(QualityOfServicePreferences.PERFORMANCE).longValue());
        assertEquals(0.0, m1.getDecoration(QualityOfServicePreferences.RELIABILITY).doubleValue(), 0.0);

        aggr.serviceSucceeded(uri, 100, TimeUnit.MICROSECONDS);
        aggr.serviceFailed(uri);

        Match m2 = Iterables.getOnlyElement(mm.match(onto, InputMatchers.EXACT, OutputMatchers.EXACT));

        assertEquals(100L, m2.getDecoration(QualityOfServicePreferences.PERFORMANCE).longValue());
        assertEquals(0.5, m2.getDecoration(QualityOfServicePreferences.RELIABILITY).doubleValue(), 0.0);
    }
}