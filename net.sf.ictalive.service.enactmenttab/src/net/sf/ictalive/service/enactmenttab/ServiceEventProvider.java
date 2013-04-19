package net.sf.ictalive.service.enactmenttab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.sf.ictalive.service.enactment.simpleevents.SimpleEnactmentEvent;


public class ServiceEventProvider {
	List<SimpleEnactmentEvent> events = new ArrayList<SimpleEnactmentEvent>();

	public List<SimpleEnactmentEvent> getEvents() {
		return events;
	}

	public void setEvents(List<SimpleEnactmentEvent> events) {
		this.events = events;
	}

	public List<SimpleEnactmentEvent> getAllEnactmentEvents() {
		return Collections.unmodifiableList(events);

	}
}
