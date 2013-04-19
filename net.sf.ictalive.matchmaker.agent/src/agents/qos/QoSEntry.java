package agents.qos;

import javax.xml.bind.annotation.XmlType;

@XmlType()
public class QoSEntry {
	public String getServiceURI() {
		return serviceURI;
	}

	public void setServiceURI(String serviceURI) {
		this.serviceURI = serviceURI;
	}

	public long getSuccesses() {
		return successes;
	}

	public void setSuccesses(long successes) {
		this.successes = successes;
	}

	public long getFailures() {
		return failures;
	}

	public void setFailures(long failures) {
		this.failures = failures;
	}

	public long getTotalTimeMicros() {
		return totalTimeMicros;
	}

	public void setTotalTimeMicros(long totalTimeMicros) {
		this.totalTimeMicros = totalTimeMicros;
	}

	String serviceURI;
	long successes;
	long failures;
	long totalTimeMicros;

}
