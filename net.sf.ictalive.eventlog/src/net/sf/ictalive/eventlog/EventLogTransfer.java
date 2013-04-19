package net.sf.ictalive.eventlog;

import java.util.Collection;
import java.util.Iterator;

import net.sf.ictalive.eventlog.client.EventLogClient;
import net.sf.ictalive.eventlog.server.EventLogServer;
import net.sf.ictalive.runtime.NormInstances.NormInstancesPackage;
import net.sf.ictalive.runtime.event.Event;

public class EventLogTransfer
{
	public static final String	source = "alive.lsi.upc.edu";
	public static final String	destination = "127.0.0.1";
	
	static
	{
		// TODO: Hotfix! Warn Thanos
		NormInstancesPackage.eINSTANCE.eClass();
	}
	
	public static void main(String args[]) throws Exception
	{
		EventLogServer	els;
		EventLogClient	elc;
		Iterator<Event>	it;
		Event			ev;
		
		elc = new EventLogClient(source); // source);
		els = new EventLogServer(destination); // destination);
		els.clean();
		
		Collection<Event> qq = elc.queryAll();
		long start = System.currentTimeMillis();
		it = qq.iterator();
		while(it.hasNext())
		{
			ev = it.next();
			System.out.println("Recording " + ev);
			els.store(ev);
		}
		System.out.println("That was " + qq.size() + " events, processed in " + (System.currentTimeMillis() - start) + " ms!");
//		qq = elc.queryNormInstanceActivations(null, null);
//		start = System.currentTimeMillis();
//		it = qq.iterator();
//		while(it.hasNext())
//		{
//			ev = it.next();
//			System.out.println("Recording " + ev);
//			els.store(ev);
//		}
//		System.out.println("That was " + qq.size() + " events, processed in " + (System.currentTimeMillis() - start) + " ms!");
//		qq = elc.queryNormInstanceViolations(null, null);
//		start = System.currentTimeMillis();
//		it = qq.iterator();
//		while(it.hasNext())
//		{
//			ev = it.next();
//			System.out.println("Recording " + ev);
//			els.store(ev);
//		}
//		System.out.println("That was " + qq.size() + " events, processed in " + (System.currentTimeMillis() - start) + " ms!");
	}
}
