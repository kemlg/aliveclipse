package net.sf.ictalive.service.enactment.simpleevents;

import java.io.Serializable;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ServiceSuccessEvent extends SimpleEnactmentEvent implements
		Serializable {

	Map<URI, String> outputs = new HashMap<URI, String>();
	{
		setStatusMessage("success");
	}

	public Map<URI, String> getOutputs() {
		return outputs;
	}

	public void setOutputs(Map<URI, String> outputs) {
		this.outputs = outputs;
	}

	public String toString() {
		String result = dateStarted.toString() + ":SUCCESS:"
				+ getStatusMessage() + ":" + service + ":" + process + ":{";

		Iterator<Entry<URI, String>> in_iterator = inputs.entrySet().iterator();
		while (in_iterator.hasNext()) {
			Entry<URI, String> entry = in_iterator.next();
			result += entry.getKey() + "=>" + entry.getValue();
			if (in_iterator.hasNext())
				result += ",";

		}
		result += "}:{";
		Iterator<Entry<URI, String>> out_iterator = outputs.entrySet()
				.iterator();
		while (out_iterator.hasNext()) {
			Entry<URI, String> entry = out_iterator.next();
			result += entry.getKey() + "=>" + entry.getValue();
			if (out_iterator.hasNext())
				result += ",";

		}
		result += "}";
		return result;
	}
}
