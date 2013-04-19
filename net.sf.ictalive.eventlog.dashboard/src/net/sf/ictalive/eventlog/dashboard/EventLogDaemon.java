/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.sf.ictalive.eventlog.dashboard;

import java.io.File;
import java.io.IOException;

import org.apache.cassandra.config.DatabaseDescriptor;
import org.apache.cassandra.db.CompactionManager;
import org.apache.cassandra.db.Table;
import org.apache.cassandra.db.commitlog.CommitLog;
import org.apache.cassandra.service.StorageService;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.thrift.transport.TTransportException;

/**
 * This class supports two methods for creating a Cassandra node daemon,
 * invoking the class's main method, and using the jsvc wrapper from
 * commons-daemon, (for more information on using this class with the jsvc
 * wrapper, see the <a href="http://commons.apache.org/daemon/jsvc.html">Commons
 * Daemon</a> documentation).
 */

public class EventLogDaemon
{
	private static Logger logger = Logger.getLogger(EventLogDaemon.class);
	private String baseDir;
	private boolean initialized;
	private EventLogSocket socket;

	public EventLogDaemon(String baseDir)
	{
		this.baseDir = baseDir;
		initialized = false;
		socket = null;
	}

	void setup() throws IOException, TTransportException
	{
		// log4j
		String file = System.getProperty("storage-config") + File.separator
				+ "log4j.properties";
		PropertyConfigurator.configure(file);

		Thread
				.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler()
				{
					public void uncaughtException(Thread t, Throwable e)
					{
						logger.error("Fatal exception in thread " + t, e);
						if (e instanceof OutOfMemoryError)
						{
							System.exit(100);
						}
					}
				});

		// initialize keyspaces
		for (String table : DatabaseDescriptor.getTables())
		{
			if (logger.isDebugEnabled())
				logger.debug("opening keyspace " + table);
			Table.open(table);
		}

		// replay the log if necessary and check for compaction candidates
		CommitLog.recover();
		CompactionManager.instance.checkAllColumnFamilies();

		// start server internals
		StorageService.instance.initServer();
	}

	/** hook for JSVC */
	public void init(String[] args) throws IOException, TTransportException
	{
		setup();
	}

	/** hook for JSVC */
	public void run()
	{
		if (socket == null)
		{
			try
			{
				String pidFile;

				System.setProperty("storage-config", ConfCreator
						.createStorageConf(baseDir));

				pidFile = System.getProperty("cassandra-pidfile");

				if (!initialized)
				{
					setup();
					initialized = true;
				}

				socket = new EventLogSocket();
				socket.start();

				if (pidFile != null)
				{
					new File(pidFile).deleteOnExit();
				}

				// if (System.getProperty("cassandra-foreground") == null)
				// {
				// System.out.close();
				// System.err.close();
				// }
			}
			catch (TTransportException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/** hook for JSVC */
	public void shutdown()
	{
		// this doesn't entirely shut down Cassandra, just the Thrift server.
		// jsvc takes care of taking the rest down
		if (socket != null)
		{
			System.out.println("Cassandra shutting down...");
			socket.shutdown();
			socket = null;
		}
	}

	/** hook for JSVC */
	public void destroy()
	{
		// this is supposed to "destroy any object created in init", but
		// StorageService et al. are crash-only, so we no-op here.
	}
}
