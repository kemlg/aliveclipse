package net.sf.ictalive.eventlog;

import net.sf.ictalive.eventlog.server.EventLogServer;
import net.sf.ictalive.runtime.NormInstances.NormInstancesPackage;

import org.apache.thrift.transport.TTransportException;

public class EventLogCleaner
{
	static
	{
		// TODO: Hotfix! Warn Thanos
		NormInstancesPackage.eINSTANCE.eClass();
	}
	
	public static void main(String args[]) throws TTransportException
	{
		EventLogServer	els;
		
		els = new EventLogServer("147.83.200.118");
		els.clean();
		System.out.println("Cleaned.");
	}
}
