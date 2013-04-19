package net.sf.ictalive.eventlog.client;

import java.util.Collection;
import java.util.HashMap;

import net.sf.ictalive.eventlog.db.CassandraEventDB;
import net.sf.ictalive.eventlog.db.IEventDB;
import net.sf.ictalive.runtime.event.Event;
import net.sf.ictalive.runtime.fact.impl.DeadlineViolationImpl;
import net.sf.ictalive.runtime.fact.impl.ExecutedActImpl;
import net.sf.ictalive.runtime.fact.impl.FailureActImpl;
import net.sf.ictalive.runtime.fact.impl.LandmarkFulfilmentImpl;
import net.sf.ictalive.runtime.fact.impl.NormInstanceActivatedImpl;
import net.sf.ictalive.runtime.fact.impl.NormInstanceExpiredImpl;
import net.sf.ictalive.runtime.fact.impl.NormInstanceViolatedImpl;
import net.sf.ictalive.runtime.fact.impl.ObjectiveFulfilmentImpl;
import net.sf.ictalive.runtime.fact.impl.SendActImpl;
import net.sf.ictalive.runtime.fact.impl.TaskViolationImpl;

import org.apache.thrift.transport.TTransportException;

public class EventLogClient extends Thread
{
	private IEventDB			db;
	
	public EventLogClient(String elIP) throws TTransportException
	{
		db = new CassandraEventDB(elIP);
	}
	
	@Deprecated
	public Collection<Event> query(String query) throws Exception
	{
		return db.query(query);
	}
	
	public Collection<Event> queryAll() throws Exception
	{
		return db.queryAll();
	}
	
	@Deprecated
	public Collection<Event> queryInstantiations() throws Exception
	{
		return db.queryByFactType(NormInstanceActivatedImpl.class.getName());
	}
	
	public Collection<Event> queryTaskViolations(String actorUrl, String normID, String taskName, String objectiveName) throws Exception
	{
		HashMap<String,String>	params;
		
		params = new HashMap<String,String>();
		params.put("FactTypes", TaskViolationImpl.class.getName());
		addToMap(params, "Norms", normID);
		addToMap(params, "Tasks", taskName);
		addToMap(params, "Actors", actorUrl);
		addToMap(params, "Objectives", objectiveName);
		
		return db.executeQuery(params);
	}

	public Collection<Event> queryLandmarkFulfilments(String landmarkName, String objectiveName) throws Exception
	{
		HashMap<String,String>	params;
		
		params = new HashMap<String,String>();
		params.put("FactTypes", LandmarkFulfilmentImpl.class.getName());
		addToMap(params, "Landmarks", landmarkName);
		addToMap(params, "Objectives", objectiveName);
		
		return db.executeQuery(params);
	}

	public Collection<Event> queryObjectiveFulfilments(String objectiveName) throws Exception
	{
		HashMap<String,String>	params;
		
		params = new HashMap<String,String>();
		params.put("FactTypes", ObjectiveFulfilmentImpl.class.getName());
		addToMap(params, "Objectives", objectiveName);
		
		return db.executeQuery(params);
	}

	public Collection<Event> queryNormInstanceExpirations(String normID, String normInstanceName) throws Exception
	{
		HashMap<String,String>	params;
		
		params = new HashMap<String,String>();
		params.put("FactTypes", NormInstanceExpiredImpl.class.getName());
		addToMap(params, "Norms", normID);
		addToMap(params, "NormInstances", normInstanceName);
		
		return db.executeQuery(params);
	}

	public Collection<Event> queryNormInstanceActivations(String normID, String normInstanceName) throws Exception
	{
		HashMap<String,String>	params;
		
		params = new HashMap<String,String>();
		params.put("FactTypes", NormInstanceActivatedImpl.class.getName());
		addToMap(params, "Norms", normID);
		addToMap(params, "NormInstances", normInstanceName);
		
		return db.executeQuery(params);
	}

	public Collection<Event> queryNormInstanceViolations(String normID, String normInstanceName) throws Exception
	{
		HashMap<String,String>	params;
		
		params = new HashMap<String,String>();
		params.put("FactTypes", NormInstanceViolatedImpl.class.getName());
		addToMap(params, "Norms", normID);
		addToMap(params, "NormInstances", normInstanceName);
		
		return db.executeQuery(params);
	}

	public Collection<Event> queryDeadlineViolations(String actorUrl, String normID, String roleName) throws Exception
	{
		HashMap<String,String>	params;
		
		params = new HashMap<String,String>();
		params.put("FactTypes", DeadlineViolationImpl.class.getName());
		addToMap(params, "Norms", normID);
		addToMap(params, "Roles", roleName);
		addToMap(params, "Actors", actorUrl);
		
		return db.executeQuery(params);
	}

	public Collection<Event> querySendActs(String asserterUrl) throws Exception
	{
		HashMap<String,String>	params;
		
		params = new HashMap<String,String>();
		params.put("FactTypes", SendActImpl.class.getName());
		addToMap(params, "Asserters", asserterUrl);
		
		return db.executeQuery(params);
	}
	
	public Collection<Event> queryExecutedActs(String asserterUrl) throws Exception
	{
		HashMap<String,String>	params;
		
		params = new HashMap<String,String>();
		params.put("FactTypes", ExecutedActImpl.class.getName());
		addToMap(params, "Asserters", asserterUrl);
		
		return db.executeQuery(params);
	}
	
	public Collection<Event> queryFailureActs(String asserterUrl) throws Exception
	{
		HashMap<String,String>	params;
		
		params = new HashMap<String,String>();
		params.put("FactTypes", FailureActImpl.class.getName());
		addToMap(params, "Asserters", asserterUrl);
		
		return db.executeQuery(params);
	}
	
	public Collection<String> queryKeys(String table) throws Exception
	{
		return db.queryKeys(table);
	}

	private void addToMap(HashMap<String, String> params, String key, String value)
	{
		if(value != null && !value.trim().equals(""))
		{
			params.put(key, value);
		}
	}

	@Deprecated
	public Collection<Event> queryViolations() throws Exception
	{
		return db.query("" +
				"for $x in //xmi:XMI\n" +
				"where $x/event:Event/content/fact/@xsi:type = \"fact:NormInstanceViolated\"\n" +
				"return $x");
	}

	public void clear()
	{
		db.clear();
	}
}
