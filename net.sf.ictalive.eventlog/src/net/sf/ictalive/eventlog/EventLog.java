package net.sf.ictalive.eventlog;

import java.util.Collection;

import net.sf.ictalive.eventbus.EventBus;
import net.sf.ictalive.eventlog.client.EventLogClient;
import net.sf.ictalive.runtime.NormInstances.NormInstancesPackage;
import net.sf.ictalive.runtime.event.Event;

public class EventLog
{
	static
	{
		// TODO: Hotfix! Warn Thanos
		NormInstancesPackage.eINSTANCE.eClass();
	}
	
	/**
	 * @param args
	 * @throws Exception 
	 * @throws XQException 
	 */
	public static void main(String[] args) throws Exception
	{
		EventLogClient			elc;
		Collection<Event>		lev;
		Collection<String>		cs;
		EventBus				eb;
		
		elc = new EventLogClient("alive.lsi.upc.edu");
//		eb = new EventBus("127.0.0.1");
		cs = elc.queryKeys("Asserters");
		for(String st : cs)
		{
			System.out.println("Key: " + st);
		}
//		lev = elc.queryNormInstanceActivations(null, null);
		lev = elc.queryNormInstanceViolations("N1", null);
//		lev = elc.querySendActs(null);
		for(Event ev : lev)
		{
//			eb.publish(ev);
			System.out.println("Event " + ev + " with date " + ev.getTimestamp());
			System.out.println(ev.getAsserter().getName());
		}
	}
}
