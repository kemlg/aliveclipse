package net.sf.ictalive.monitortool.eventbus;

import net.sf.ictalive.runtime.event.Event;

public interface EventBusControllerListener
{

	void updateConnecting();

	void submitEvent(Event event);

}
