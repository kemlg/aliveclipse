package net.sf.ictalive.monitortool.domain;

import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import net.sf.ictalive.eventbus.EventBus;
import net.sf.ictalive.eventbus.exception.EventBusConnectionException;
import net.sf.ictalive.monitortool.eventbus.EventBusControllerListener;
import net.sf.ictalive.monitortool.eventbus.EventProvider;
import net.sf.ictalive.runtime.event.Event;

public class EventBusNode implements EventProvider
{

	private boolean								connected;
	private String								location;
	private EventBus							eb;
	private BlockingQueue<Event>				queue;
	private Vector<EventBusControllerListener>	listeners;

	public EventBusNode(String location)
	{
		this.location = location;
		listeners = new Vector<EventBusControllerListener>();
	}

	public boolean isConnected()
	{
		return connected;
	}

	public void setConnected(boolean connected)
	{
		this.connected = connected;
	}

	public String getName()
	{
		return location;
	}

	@Override
	public String toString()
	{
		String res;
		
		res = location;
		if(connected)
		{
			res = res + " (connected)";
		}
		
		return res;
	}

	public void connect() throws EventBusConnectionException
	{
		eb = new EventBus(location, this);
		queue = new LinkedBlockingQueue<Event>();
	}

	@Override
	public void onEvent(Event ev)
	{
		Iterator<EventBusControllerListener>	it;
		EventBusControllerListener				ebcl;
		
		queue.add(ev);
		it = listeners.iterator();
		while(it.hasNext())
		{
			ebcl = it.next();
			System.out.println("Sending to listener: " + ebcl);
			ebcl.submitEvent(ev);
		}
	}

	public void addListener(EventBusControllerListener ebcl)
	{
		this.listeners.add(ebcl);
	}
}
