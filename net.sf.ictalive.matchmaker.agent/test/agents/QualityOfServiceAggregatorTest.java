package agents;

import agents.QualityOfServiceAggregator.Stats;
import java.net.URI;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class QualityOfServiceAggregatorTest {
	@Test
	public void testSomeMethod() {
		QualityOfServiceAggregator aggr = new QualityOfServiceAggregator();

		aggr.serviceSucceeded(URI.create("s1"), 100, TimeUnit.MICROSECONDS);
		aggr.serviceSucceeded(URI.create("s1"), 200, TimeUnit.MICROSECONDS);
		aggr.serviceFailed(URI.create("s1"));
		aggr.serviceFailed(URI.create("s2"));

		Stats s1 = aggr.getServiceMetrics(URI.create("s1"));
		Stats s2 = aggr.getServiceMetrics(URI.create("s2"));

		assertEquals(150L, s1.avgTime());
		assertEquals(Long.MAX_VALUE, s2.avgTime());

		assertEquals(2, s1.successes);
		assertEquals(1, s1.fails);

		assertEquals(0, s2.successes);
		assertEquals(1, s2.fails);

		assertSame(s1, aggr.getServiceMetrics(URI.create("s1")));
		assertSame(s2, aggr.getServiceMetrics(URI.create("s2")));

		aggr.serviceFailed(URI.create("s1"));
		aggr.serviceSucceeded(URI.create("s2"), 300, TimeUnit.MICROSECONDS);

		assertNotSame(s1, aggr.getServiceMetrics(URI.create("s1")));
		assertNotSame(s2, aggr.getServiceMetrics(URI.create("s2")));
	}
}