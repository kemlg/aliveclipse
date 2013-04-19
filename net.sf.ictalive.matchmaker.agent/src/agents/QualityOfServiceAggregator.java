package agents;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMaker;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import net.sf.ictalive.runtime.action.Action;
import net.sf.ictalive.runtime.action.ServiceInvocation;
import net.sf.ictalive.runtime.enactment.Enactment;
import net.sf.ictalive.runtime.event.Event;
import net.sf.ictalive.runtime.fact.Content;
import net.sf.ictalive.runtime.fact.Fact;
import net.sf.ictalive.runtime.fact.FailureAct;

/**
 * Thread-safe quality-of-service aggregator.
 * 
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class QualityOfServiceAggregator {
	/*
	 * This implementation aggregates *all* events it saw - it only forgets
	 * statistics about services that it hasn't heard of in a long time. A more
	 * involved approach would be to have a sliding window of K-last (e.g. 100)
	 * events, and have the statistics be (incrementally) computed over that
	 * window.
	 * 
	 * Stats are a bit sloppy - no overflow checks for instance (I guess this is
	 * not going to run long enough :) )
	 */
	private final ConcurrentMap<URI, Stats> map = new MapMaker().expiration(2,
			TimeUnit.DAYS).makeComputingMap(new Function<URI, Stats>() {
		public Stats apply(URI uri) {
			return new Stats();
		}
	});

	void serviceFailed(URI service) {
		while (true) {
			Stats stats = map.get(service);
			Stats newStats = stats.fail();
			if (map.replace(service, stats, newStats))
				break;
		}
	}

	void serviceSucceeded(URI service, long duration, TimeUnit timeUnit) {
		while (true) {
			Stats stats = map.get(service);
			Stats newStats = stats.succeed(duration, timeUnit);
			if (map.replace(service, stats, newStats))
				break;
		}
	}

	Stats getServiceMetrics(URI service) {
		return map.get(Preconditions.checkNotNull(service));
	}

	void startQoSEventProcessing(final EventManager eventManager,
			ScheduledExecutorService scheduledThreadPoolExecutor, int period,
			TimeUnit timeUnit) {
		if (!eventManager.isActive()) {
			return;
		}
		scheduledThreadPoolExecutor.scheduleAtFixedRate(new Runnable() {
			public void run() {
				Event event = null;
				while ((event = eventManager.pollEvent()) != null) {
					processEvent(event);
				}
			}
		}, 0, period, timeUnit);
	}

	void processEvent(Event event) {
		Content content = event.getContent();
		if (content == null)
			return;
		Fact fact = content.getFact();
		if (fact == null)
			return;
		Action effect = fact.getEffect();
		if (!(effect instanceof ServiceInvocation))
			return;
		ServiceInvocation si = (ServiceInvocation) effect;
		URI serviceURI = URI.create(si.getServiceURI());
		if (content.getFact() instanceof FailureAct) {
			System.out.println("Service failed: " + serviceURI);
			serviceFailed(serviceURI);
		} else {
			// event.getContent().getFact().getEffect().getEnactment()
			Enactment enactment = si.getEnactment().get(0);
			if (enactment == null)
				return;

			Date start = enactment.getStartTime();
			Date finish = enactment.getFinishTime();

			if (start == null || finish == null) {
				System.err.println("Bad event: startTime=" + start
						+ ", finishTime=" + finish);
				return;
			}
			long diff = finish.getTime() - start.getTime();
			if (diff < 0) {
				System.err.println("Bad event: elapsed time= " + diff
						+ "ms (negative!)");
				return;
			}
			System.out.println("Service succeeded: " + serviceURI + " in "
					+ diff + "ms");
			serviceSucceeded(serviceURI, diff, TimeUnit.MILLISECONDS);
		}
	}

	public static class Stats {
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (fails ^ (fails >>> 32));
			result = prime * result + (int) (successes ^ (successes >>> 32));
			result = prime * result
					+ (int) (totalTimeMicros ^ (totalTimeMicros >>> 32));
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Stats other = (Stats) obj;
			if (fails != other.fails)
				return false;
			if (successes != other.successes)
				return false;
			if (totalTimeMicros != other.totalTimeMicros)
				return false;
			return true;
		}

		long successes;

		public void setSuccesses(long successes) {
			this.successes = successes;
		}

		public void setFails(long fails) {
			this.fails = fails;
		}

		public void setTotalTimeMicros(long totalTimeMicros) {
			this.totalTimeMicros = totalTimeMicros;
		}

		public long getSuccesses() {
			return successes;
		}

		public long getFails() {
			return fails;
		}

		public long getTotalTimeMicros() {
			return totalTimeMicros;
		}

		long fails;
		long totalTimeMicros;

		Stats() {
			this(0L, 0L, 0L);
		}

		public Stats(long successes, long fails, long totalTimeMicros) {
			this.successes = successes;
			this.fails = fails;
			this.totalTimeMicros = totalTimeMicros;
		}

		private Stats succeed(long duration, TimeUnit timeUnit) {
			return new Stats(successes + 1, fails, totalTimeMicros
					+ timeUnit.toMicros(duration));
		}

		private Stats fail() {
			return new Stats(successes, fails + 1, totalTimeMicros);
		}

		/**
		 * Returns the average time (in microseconds) of successful invocations
		 * of the service, or -1 if the service has never succeeded.
		 * 
		 * @return the average time (in microseconds) of successful invocations
		 *         of the service, or {@code Long.MAX_VALUE} if the service has
		 *         never succeeded
		 */
		long avgTime() {
			return (successes > 0) ? totalTimeMicros / successes
					: Long.MAX_VALUE;
		}

		/**
		 * Returns the number of successes divided by the number of total
		 * invocations (successes plus fails).
		 * 
		 * @return the number of successes divided by the number of total
		 *         invocations
		 */
		double successRatio() {
			if (successes == 0)
				return 0.0;
			return (double) successes / (successes + fails);
		}

		@Override
		public String toString() {
			return "[Successes: " + successes + ", fails: " + fails
					+ ", totalTime (μs): " + totalTimeMicros + "]";
		}
	}

	public Map<URI, Stats> getMap() {
		return map;
		
	}
}
