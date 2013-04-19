package net.sf.ictalive.monitortool.eventbus;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import net.sf.ictalive.eventbus.EventBus;
import net.sf.ictalive.eventbus.EventBusListener;
import net.sf.ictalive.eventbus.exception.EventBusConnectionException;
import net.sf.ictalive.runtime.event.Event;

public class EventBusController implements EventBusListener
{
	private static final int EBC_CONNECTING = 1;
	private static final int EBC_EVENT = 2;
	
	private static EventBusController				instance;
	private static Set<EventBusControllerListener>	listeners;
	private static String ip;
	private static EventBus	eb;
	
	static
	{
		instance = new EventBusController();
	}

	private EventBusController()
	{
		eb = null;
		listeners = new HashSet<EventBusControllerListener>();
	}
	
	public void addListener(EventBusControllerListener listener)
	{
		listeners.add(listener);
	}

	public synchronized void setIp(String ip) throws EventBusConnectionException
	{
		// Close current EventBus
		if(eb != null)
		{
			eb.removeListener(this);
		}
		
		EventBusController.ip = ip;
		eb = new EventBus(ip, this);
		
		updateListeners(EBC_CONNECTING);
	}

	private void updateListeners(int ebcConnecting, Object... objs)
	{
		Iterator<EventBusControllerListener>	it;
		
		it = listeners.iterator();
		while(it.hasNext())
		{
			if(ebcConnecting == EBC_CONNECTING)
			{
				it.next().updateConnecting();
			}
			else if(ebcConnecting == EBC_EVENT)
			{
				it.next().submitEvent((Event)objs[0]);
			}
		}
	}

	@Override
	public void onEvent(Event ev)
	{
		updateListeners(EBC_EVENT, ev);
	}

	public static EventBusController getInstance()
	{
		return instance;
	}
}
