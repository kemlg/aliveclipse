package net.sf.ictalive.eventcollector.dashboard;

import net.sf.ictalive.eventlog.EventLogException;
import net.sf.ictalive.eventlog.dashboard.IComponent;
import net.sf.ictalive.eventlog.server.EventLogServer;

public class EventCollectorComponent implements IComponent
{
	private EventLogServer	els;
	private boolean			running;
	
	public EventCollectorComponent(String ebIP, String elIP) throws EventLogException
	{
		els = new EventLogServer(ebIP, elIP);
		running = false;
	}
	
	@Override
	public void start()
	{
		els.start();
		running = true;
	}

	@Override
	public void stop()
	{
		els.setFinished(true);
		running = false;
	}
	
	/**
	 * @param args
	 * @throws EventLogException 
	 */
	public static void main(String[] args) throws EventLogException
	{
		EventCollectorComponent	ec;
		
		ec = new EventCollectorComponent("127.0.0.1", "127.0.0.1");
		ec.start();
	}

	public boolean isRunning()
	{
		return running;
	}
}
