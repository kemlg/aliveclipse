package net.sf.ictalive.eventlog.db;

import java.io.IOException;
import java.util.LinkedList;

import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.base.Resource;
import org.xmldb.api.base.ResourceIterator;
import org.xmldb.api.base.ResourceSet;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.CollectionManagementService;
import org.xmldb.api.modules.XQueryService;

import ru.ispras.sedna.driver.DriverException;
import ru.ispras.sedna.driver.SednaConnection;
import ru.ispras.sedna.driver.SednaStatement;

import net.sf.ictalive.metamodel.utils.Serialiser;
import net.sf.ictalive.runtime.event.Event;
import net.sf.ictalive.runtime.event.EventPackage;

public class SednaEventDB implements IEventDB
{
	private Collection			rootCollection, parent;
	private Serialiser<Event>	se;
	private XQueryService		xqs;
	private SednaConnection		sc;
	
	public SednaEventDB(String host)
	{
		String				dbname, user, password;
		Database			dbDriver;
		
		se = new Serialiser<Event>(EventPackage.class);
		
		dbname = "eventlog";  
		user = "SYSTEM";  
		password = "MANAGER";  

		try
		{
			dbDriver = (Database)Class.forName("net.cfoster.sedna.DatabaseImpl").newInstance();
			DatabaseManager.registerDatabase(dbDriver);
			rootCollection = DatabaseManager.getCollection("xmldb:sedna://" + host + "/" + dbname, user, password); 
			parent = rootCollection.getChildCollection("myCollection");
			if(parent == null)
			{
				parent = createChildCollection(rootCollection, "myCollection");
				rootCollection = createChildCollection(parent, "mySub");
			}
			else
			{
				rootCollection = parent.getChildCollection("mySub");
			}
			xqs = (XQueryService)rootCollection.getService("XQueryService", "1.0");
			xqs.setNamespace("xmi", "http://www.omg.org/XMI");
			xqs.setNamespace("event", "http://ict-alive.sourceforge.net/RunTime/events");
			xqs.setNamespace("fact", "http://ict-alive.sourceforge.net/RunTime/facts");
			
			sc = ru.ispras.sedna.driver.DatabaseManager.getConnection(host, dbname, user, password);
  		}
		catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (XMLDBException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (DriverException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Collection createChildCollection(Collection collection,
			String collectionName) throws XMLDBException
	{
		CollectionManagementService cms = (CollectionManagementService) collection
				.getService("CollectionManagementService", "1.0");
		return cms.createCollection(collectionName);
	}

	public void deleteCollection(Collection collection, String collectionName)
			throws XMLDBException
	{
		CollectionManagementService cms = (CollectionManagementService) collection
				.getService("CollectionManagementService", "1.0");
		cms.removeCollection(collectionName);
	}

	@Override
	public void store(Event ev)
	{
		String			xml;
		SednaStatement	ss;
//		long			time;
	
		try
		{
			xml = se.serialise(ev);
			xml = xml.replace("ASCII", "UTF-8"); // TODO: Check (and fix?) this
//			time = System.currentTimeMillis();
			sc.begin();
//			System.out.println("sc.begin(): " + (System.currentTimeMillis() - time) + "ms");
//			time = System.currentTimeMillis();
			ss = sc.createStatement();
//			System.out.println("createStatement(): " + (System.currentTimeMillis() - time) + "ms");
//			time = System.currentTimeMillis();
			ss.loadDocument(xml, ev.getAsserter().getName() + "_" + ev.getLocalKey().getId(), "myCollection/mySub");
//			System.out.println("loadDocument(): " + (System.currentTimeMillis() - time) + "ms");
//			time = System.currentTimeMillis();
			sc.commit();
//			System.out.println("commit(): " + (System.currentTimeMillis() - time) + "ms");
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (DriverException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public java.util.Collection<Event> query(String query) throws XMLDBException, IOException
	{
		ResourceSet			rs;
		ResourceIterator	it;
		Resource			r;
		LinkedList<Event>	lev;

		lev = new LinkedList<Event>();
		rs = xqs.query(query);
		it = rs.getIterator();
		while(it.hasMoreResources())
		{
			r = it.nextResource();
//			System.out.println(r.toString());
			lev.add(se.deserialiseAndFree(r.toString()));
		}
		
		return lev;
	}

	@Override
	public void clear() throws XMLDBException
	{
		deleteCollection(parent, "mySub");
		createChildCollection(parent, "mySub");
	}

	@Override
	public java.util.Collection<Event> queryByFactType(String name)
	{
		return null;
	}

	@Override
	public java.util.Collection<Event> queryAll()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
