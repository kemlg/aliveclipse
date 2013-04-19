package net.sf.ictalive.service.enactment.simpleevents;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ServiceFailedEvent extends SimpleEnactmentEvent implements
		Serializable {

	public String toString() {
		String result = dateStarted.toString() + ":FAILED:"
				+ getStatusMessage();
		return result;
	}
}
