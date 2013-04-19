package net.sf.ictalive.monitortool.views;

import net.sf.ictalive.monitortool.domain.EventBusNode;
import net.sf.ictalive.monitortool.domain.VisualizationKind;
import net.sf.ictalive.monitortool.eventbus.EventProvider;
import net.sf.ictalive.runtime.event.Event;

public class EventViewData
{

	private static EventProvider location;
	private static VisualizationKind vk;
	private static Event event;

	public static synchronized void setData(EventProvider location, VisualizationKind vk)
	{
		EventViewData.location = location;
		EventViewData.vk = vk;
	}

	public static EventProvider getLocation()
	{
		return location;
	}

	public static VisualizationKind getVisualizationKind()
	{
		return vk;
	}

	public static void setEvent(Event obj)
	{
		event = obj;
	}

	public static Event getEvent()
	{
		return event;
	}

}
