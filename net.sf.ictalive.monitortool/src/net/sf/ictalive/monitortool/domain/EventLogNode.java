package net.sf.ictalive.monitortool.domain;

import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.apache.thrift.transport.TTransportException;

import net.sf.ictalive.eventlog.client.EventLogClient;
import net.sf.ictalive.monitortool.eventbus.EventBusControllerListener;
import net.sf.ictalive.monitortool.eventbus.EventProvider;
import net.sf.ictalive.monitortool.views.EventView;
import net.sf.ictalive.runtime.event.Event;

public class EventLogNode implements EventProvider
{

	private boolean								connected;
	private String								location;
	private BlockingQueue<Event>				queue;
	private Vector<EventBusControllerListener>	listeners;
	private EventLogClient el;

	public EventLogNode(String location)
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

	@Override
	public void onEvent(Event ev)
	{
		
	}
	
	public void connect() throws Exception
	{
		Iterator<EventBusControllerListener>	it;
		EventBusControllerListener				ebcl;

		el = new EventLogClient(location);
		queue = new LinkedBlockingQueue<Event>();
		Iterator<Event> evs = el.queryAll().iterator();
		while(evs.hasNext())
		{
			queue.add(evs.next());
		}
	}

	public void addListener(EventBusControllerListener ebcl)
	{
		this.listeners.add(ebcl);
		Iterator<Event> evs = queue.iterator();
		while(evs.hasNext())
		{
			System.out.println("Sending to listener: " + ebcl);
			ebcl.submitEvent(evs.next());
		}
	}
}
