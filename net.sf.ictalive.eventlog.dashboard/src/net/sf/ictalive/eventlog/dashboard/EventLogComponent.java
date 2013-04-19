package net.sf.ictalive.eventlog.dashboard;

import java.io.IOException;

import org.apache.thrift.transport.TTransportException;

public class EventLogComponent implements IComponent
{
	private EventLogDaemon	daemon;
	private boolean			running;

	public EventLogComponent(String baseDir) throws TTransportException, IOException
	{
		daemon = new EventLogDaemon(baseDir);
		running = false;
	}

	@Override
	public void start()
	{
		daemon.run();
		running = true;
	}

	@Override
	public void stop()
	{
		daemon.shutdown();
		running = false;
	}

	public static void main(String args[]) throws TTransportException, IOException, InterruptedException
	{
		EventLogComponent elc;

		elc = new EventLogComponent("/tmp/cassandra/");
		while(true)
		{
			elc.start();
			System.out.println("ZzzZZzZZZZzzZZ");
			Thread.sleep(10000);
			elc.stop();
			Thread.sleep(10000);
		}
	}

	public boolean isRunning()
	{
		return running;
	}
}
