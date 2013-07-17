package net.sf.ictalive.eventlog.dashboard;

import java.net.InetAddress;
import java.net.InetSocketAddress;

import org.apache.cassandra.config.DatabaseDescriptor;
import org.apache.cassandra.thrift.Cassandra;
import org.apache.cassandra.thrift.CassandraServer;
import org.apache.cassandra.utils.FBUtilities;
import org.apache.log4j.Logger;
import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;
import org.apache.thrift.transport.TTransportFactory;

public class EventLogSocket extends Thread
{
    private static Logger logger = Logger.getLogger(EventLogSocket.class);
	private TThreadPoolServer serverEngine;
    
	public void run()
    {
        System.out.println("Cassandra starting up...");

        int listenPort = DatabaseDescriptor.getThriftPort();
        InetAddress listenAddr = DatabaseDescriptor.getThriftAddress();
        
        /* 
         * If ThriftAddress was left completely unconfigured, then assume
         * the same default as ListenAddress
         */
        if (listenAddr == null)
            listenAddr = FBUtilities.getLocalAddress();
        
        // Transport
        TServerSocket tServerSocket;
		try
		{
			tServerSocket = new TServerSocket(new InetSocketAddress(listenAddr, listenPort));
	        
	        logger.info(String.format("Binding thrift service to %s:%s", listenAddr, listenPort));

	        // Protocol factory
	        TProtocolFactory tProtocolFactory = new TBinaryProtocol.Factory();
	        
	        // Transport factory
	        TTransportFactory inTransportFactory, outTransportFactory;
	        if (DatabaseDescriptor.isThriftFramed())
	        {
	            inTransportFactory = new TFramedTransport.Factory();
	            outTransportFactory = new TFramedTransport.Factory();
	            
	        }
	        else
	        {
	            inTransportFactory = new TTransportFactory();
	            outTransportFactory = new TTransportFactory();
	        }

	        // now we start listening for clients
	        CassandraServer cassandraServer = new CassandraServer();
	        Cassandra.Processor processor = new Cassandra.Processor(cassandraServer);

	        // ThreadPool Server
	        TThreadPoolServer.Options options = new TThreadPoolServer.Options();
	        options.minWorkerThreads = 64;
	        serverEngine = new TThreadPoolServer(new TProcessorFactory(processor),
	                                             tServerSocket,
	                                             inTransportFactory,
	                                             outTransportFactory,
	                                             tProtocolFactory,
	                                             tProtocolFactory,
	                                             options);
			serverEngine.serve();
		}
		catch (TTransportException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

//	@Override
//	protected void finalize() throws Throwable
//	{
//		System.out.println("Bye!");
//		super.finalize();
//	}

	public void shutdown()
	{
		serverEngine.stop();
	}
}
