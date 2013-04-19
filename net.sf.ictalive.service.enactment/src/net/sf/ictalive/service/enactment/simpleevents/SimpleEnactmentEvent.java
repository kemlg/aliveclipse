package net.sf.ictalive.service.enactment.simpleevents;

import java.io.Serializable;
import java.net.URI;
import java.util.Date;
import java.util.Map;

public abstract class SimpleEnactmentEvent implements Serializable {
	Date dateStarted = new Date();
	URI process;
	URI service;
	Map<URI, String> inputs;
	String statusMessage;

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public Date getDateStarted() {
		return dateStarted;
	}

	public void setDateStarted(Date dateStarted) {
		this.dateStarted = dateStarted;
	}

	public URI getProcess() {
		return process;
	}

	public void setProcess(URI process) {
		this.process = process;
	}

	public Map<URI, String> getInputs() {
		return inputs;
	}

	public void setInputs(Map<URI, String> inputs) {
		this.inputs = inputs;
	}

	public URI getService() {
		return service;
	}

	public void setService(URI service) {
		this.service = service;
	}

}
