package net.sf.ictalive.eventlog.server;

import net.sf.ictalive.eventbus.EventBus;
import net.sf.ictalive.eventbus.exception.EventBusConnectionException;
import net.sf.ictalive.eventlog.EventLogException;
import net.sf.ictalive.eventlog.db.CassandraEventDB;
import net.sf.ictalive.eventlog.db.IEventDB;
import net.sf.ictalive.runtime.event.Event;

import org.apache.thrift.transport.TTransportException;

public class EventLogServer extends Thread
{
	private EventBus			eb;
	private IEventDB			db;
	private boolean				finished;
	
	public EventLogServer(String ebIP, String elIP) throws EventLogException
	{
		try
		{
			eb = new EventBus(ebIP);
			db = new CassandraEventDB(elIP, 9160);
		}
		catch (EventBusConnectionException e)
		{
			throw new EventLogException(e);
		}
		catch (TTransportException e)
		{
			throw new EventLogException(e);
		}
	}
	
	public EventLogServer(String destination) throws TTransportException
	{
		db = new CassandraEventDB(destination, 9160);
//		if(destination == null)
//		{
//			db = new CassandraEventDB("127.0.0.1", 9160);
//		}
//		else
//		{
//			db = new SednaEventDB(destination);
//		}
	}

	public void run()
	{
		Event	ev;
		
		finished = false;
		
		while(!finished)
		{
			try
			{
				ev = eb.take();
				try
				{
					db.store(ev);
				}
				catch(Exception npe)
				{
					System.out.println(npe.getMessage());
					npe.printStackTrace();
				}
				System.out.println("Remaining in queue: " + eb.available());
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void clean()
	{
		db.clear();
	}

	public void store(Event ev) throws Exception
	{
		db.store(ev);
	}
	
	public static void main(String args[]) throws EventBusConnectionException, TTransportException, EventLogException
	{
		EventLogServer	els;
		
		els = new EventLogServer("147.83.200.118", "alive.lsi.upc.edu");
		els.clean();
		els.start();
	}

	public synchronized void setFinished(boolean finished)
	{
		this.finished = true;
	}
}
