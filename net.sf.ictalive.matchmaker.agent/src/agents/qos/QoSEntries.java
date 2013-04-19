package agents.qos;

import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlRootElement
public class QoSEntries {
	List<QoSEntry> entries = new LinkedList<QoSEntry>();

	public List<QoSEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<QoSEntry> entries) {
		this.entries = entries;
	}
}
