package agents.qos;

import java.net.URI;
import java.util.Map;
import java.util.Map.Entry;

import agents.QualityOfServiceAggregator.Stats;

public class QoSHelper {
	public static QoSEntries fromMap(Map<URI, Stats> map) {
		QoSEntries entries = new QoSEntries();
		for (Entry<URI, Stats> e : map.entrySet()) {
			QoSEntry entry = new QoSEntry();
			Stats s = e.getValue();
			entry.setServiceURI(e.getKey().toString());
			entry.setSuccesses(s.getSuccesses());
			entry.setFailures(s.getFails());
			entry.setTotalTimeMicros(s.getTotalTimeMicros());
			entries.getEntries().add(entry);
		}
		return entries;
	}

	public static void toMap(Map<URI, Stats> map, QoSEntries entries) {
		for (QoSEntry e : entries.getEntries()) {
			Stats s = new Stats(e.getSuccesses(), e.getFailures(), e
					.getTotalTimeMicros());
			map.put(URI.create(e.getServiceURI()), s);
		}
	}
}
