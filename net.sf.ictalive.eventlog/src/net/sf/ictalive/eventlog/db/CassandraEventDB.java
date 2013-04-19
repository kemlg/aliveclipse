package net.sf.ictalive.eventlog.db;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.Vector;

import net.sf.ictalive.metamodel.utils.Serialiser;
import net.sf.ictalive.operetta.OM.Objective;
import net.sf.ictalive.operetta.OM.Role;
import net.sf.ictalive.runtime.event.Event;
import net.sf.ictalive.runtime.event.EventPackage;
import net.sf.ictalive.runtime.fact.DeadlineViolation;
import net.sf.ictalive.runtime.fact.Fact;
import net.sf.ictalive.runtime.fact.LandmarkFulfilment;
import net.sf.ictalive.runtime.fact.NormInstanceActivated;
import net.sf.ictalive.runtime.fact.NormInstanceExpired;
import net.sf.ictalive.runtime.fact.NormInstanceViolated;
import net.sf.ictalive.runtime.fact.ObjectiveFulfilment;
import net.sf.ictalive.runtime.fact.TaskViolation;

import org.apache.cassandra.thrift.Cassandra;
import org.apache.cassandra.thrift.Column;
import org.apache.cassandra.thrift.ColumnOrSuperColumn;
import org.apache.cassandra.thrift.ColumnParent;
import org.apache.cassandra.thrift.ColumnPath;
import org.apache.cassandra.thrift.ConsistencyLevel;
import org.apache.cassandra.thrift.InvalidRequestException;
import org.apache.cassandra.thrift.KeyRange;
import org.apache.cassandra.thrift.KeySlice;
import org.apache.cassandra.thrift.SlicePredicate;
import org.apache.cassandra.thrift.SliceRange;
import org.apache.cassandra.thrift.SuperColumn;
import org.apache.cassandra.thrift.TimedOutException;
import org.apache.cassandra.thrift.UnavailableException;
import org.apache.cassandra.thrift.Cassandra.Client;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

public class CassandraEventDB implements IEventDB
{
	private Client client;
	private String keyspace = "EventLog";
	private Serialiser<Event> s;

	public CassandraEventDB(String host) throws TTransportException
	{
		TTransport tr;
		TProtocol proto;

		s = new Serialiser<Event>(EventPackage.class);

		tr = new TSocket(host, 9160);
		proto = new TBinaryProtocol(tr);
		client = new Cassandra.Client(proto);
		tr.open();
	}

	public CassandraEventDB(String host, int port) throws TTransportException
	{
		TTransport tr;
		TProtocol proto;

		s = new Serialiser<Event>(EventPackage.class);

		tr = new TSocket(host, port);
		proto = new TBinaryProtocol(tr);
		client = new Cassandra.Client(proto);
		tr.open();
	}

	@Override
	public void clear()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<Event> query(String query) throws Exception
	{
		SlicePredicate predicate = new SlicePredicate();
		predicate.setSlice_range(new SliceRange(new byte[0], new byte[0],
				false, 10));
		ColumnParent parent = new ColumnParent("Asserters");
		List<ColumnOrSuperColumn> results = client.get_slice("EventLog", "1",
				parent, predicate, ConsistencyLevel.ONE);
		for (ColumnOrSuperColumn result : results)
		{
			SuperColumn column = result.super_column; // .column;
			System.out.println(new String(column.name, "UTF-8")); // + " -> " +
																	// new
																	// String(column.value,
																	// "UTF-8"));
		}

		return null;
	}

	@Override
	public void store(Event ev) throws Exception
	{
		String					key;
		UUID					keyb;
		Fact					f;
		DeadlineViolation		dv;
		TaskViolation			tv;
		NormInstanceViolated	niv;
		NormInstanceActivated	nia;
		NormInstanceExpired		nie;
		LandmarkFulfilment		lf;
		ObjectiveFulfilment		of;
		String					factName, who, norm, task, instance, landmark, objective;
		Date					timestamp;
		Iterator<Role>			it;
		Iterator<Objective>		ito;

		key = ev.getAsserter().getUrl() + ":" + ev.getLocalKey().getId();

		System.out.println("Key: " + key);
		keyb = UUID.randomUUID();
		System.out.println("Keyb: " + UUID.randomUUID().toString());
		
		f = ev.getContent().getFact();
		factName = f.getClass().getName();
		timestamp = ev.getTimestamp();
		
		storeInSuperColumn("Asserters", ev.getAsserter().getName(), keyb, key, timestamp);
		storeInSuperColumn("FactTypes", factName, keyb, key, timestamp);
		
		if(f instanceof DeadlineViolation)
		{
			dv = (DeadlineViolation)f;
			who = dv.getWho().getUrl();
			norm = dv.getNorm().getNormID();
			
			storeInSuperColumn("Actors", who, keyb, key, timestamp);
			storeInSuperColumn("Norms", norm, keyb, key, timestamp);
			
			it = dv.getWho().getAgent().getHasRole().iterator();
			while(it.hasNext())
			{
				storeInSuperColumn("Roles", it.next().getName(), keyb, key, timestamp);
			}
		}
		else if(f instanceof TaskViolation)
		{
			tv = (TaskViolation)f;
			who = tv.getWho().getUrl();
			norm = tv.getNorm().getNormID();
			task = tv.getTask().getName();
			
			storeInSuperColumn("Actors", who, keyb, key, timestamp);
			storeInSuperColumn("Norms", norm, keyb, key, timestamp);
			storeInSuperColumn("Tasks", task, keyb, key, timestamp);
			
			ito = tv.getUnmetRequirement().iterator();
			while(ito.hasNext())
			{
				storeInSuperColumn("Objectives", ito.next().getName(), keyb, key, timestamp);
			}
		}
		else if(f instanceof NormInstanceViolated)
		{
			niv = (NormInstanceViolated)f;
			instance = niv.getNormInstance().getName();
			norm = niv.getNormInstance().getNorm().getNormID();
			
			storeInSuperColumn("Norms", norm, keyb, key, timestamp);
			storeInSuperColumn("NormInstances", instance, keyb, key, timestamp);
		}
		else if(f instanceof NormInstanceActivated)
		{
			nia = (NormInstanceActivated)f;
			instance = nia.getNormInstance().getName();
			norm = nia.getNormInstance().getNorm().getNormID();
			
			storeInSuperColumn("Norms", norm, keyb, key, timestamp);
			storeInSuperColumn("NormInstances", instance, keyb, key, timestamp);
		}
		else if(f instanceof NormInstanceExpired)
		{
			nie = (NormInstanceExpired)f;
			instance = nie.getNormInstance().getName();
			norm = nie.getNormInstance().getNorm().getNormID();
			
			storeInSuperColumn("Norms", norm, keyb, key, timestamp);
			storeInSuperColumn("NormInstances", instance, keyb, key, timestamp);
		}
		else if(f instanceof LandmarkFulfilment)
		{
			lf = (LandmarkFulfilment)f;
			landmark = lf.getLandmark().getName();
			
			storeInSuperColumn("Landmarks", landmark, keyb, key, timestamp);
			
			ito = lf.getLandmark().getEntails().iterator();
			while(ito.hasNext())
			{
				storeInSuperColumn("Objectives", ito.next().getName(), keyb, key, timestamp);
			}
		}
		else if(f instanceof ObjectiveFulfilment)
		{
			of = (ObjectiveFulfilment)f;
			objective = of.getObjective().getName();
			
			storeInSuperColumn("Objectives", objective, keyb, key, timestamp);
		}
		
		storeInColumn("Events", key, s.serialise(ev), timestamp);
	}

	private void storeInColumn(String table, String column, String value,
			Date timestamp) throws UnsupportedEncodingException, InvalidRequestException, UnavailableException, TimedOutException, TException
	{
		ColumnPath colPathName;

		colPathName = new ColumnPath(table);
		colPathName.setColumn(column.getBytes("UTF-8"));
		client.insert(keyspace, column, colPathName, value.getBytes("UTF-8"), timestamp.getTime(), ConsistencyLevel.ANY);
	}

	private void storeInSuperColumn(String table, String superColumn, UUID column,
			String value, Date timestamp) throws UnsupportedEncodingException, InvalidRequestException, UnavailableException, TimedOutException, TException
	{
		ColumnPath colPathName;
		
		colPathName = new ColumnPath(table);
		colPathName.setSuper_column(superColumn.getBytes("UTF-8"));
		colPathName.setColumn(asByteArray(column));
		client.insert(keyspace, superColumn, colPathName, value.getBytes("UTF-8"),
				timestamp.getTime(), ConsistencyLevel.ANY);
	}

	private static byte[] asByteArray(java.util.UUID uuid)
	{
		long msb = uuid.getMostSignificantBits();
		long lsb = uuid.getLeastSignificantBits();
		byte[] buffer = new byte[16];

		for (int i = 0; i < 8; i++)
		{
			buffer[i] = (byte) (msb >>> 8 * (7 - i));
		}
		for (int i = 8; i < 16; i++)
		{
			buffer[i] = (byte) (lsb >>> 8 * (7 - i));
		}

		return buffer;
	}

	@Override
	public Collection<Event> queryByFactType(String name) throws Exception
	{
		List<Event> le;
		long t;

		t = System.currentTimeMillis();
		le = new Vector<Event>();
		SlicePredicate predicate = new SlicePredicate();
		predicate.setSlice_range(new SliceRange(new byte[0], new byte[0],
				false, 10));
		ColumnParent parent = new ColumnParent("FactTypes");
		List<ColumnOrSuperColumn> results = client.get_slice("EventLog", name,
				parent, predicate, ConsistencyLevel.ONE);
		for (ColumnOrSuperColumn result : results)
		{
			SuperColumn column = result.super_column; // .column;
			Iterator<Column> it = column.columns.iterator();
			while (it.hasNext())
			{
				SlicePredicate pred = new SlicePredicate();
				pred.setSlice_range(new SliceRange(new byte[0], new byte[0],
						false, 10));
				ColumnParent par = new ColumnParent("Events");
				List<ColumnOrSuperColumn> res = client.get_slice("EventLog",
						new String(it.next().getValue()), par, pred,
						ConsistencyLevel.ONE);
				for (ColumnOrSuperColumn r : res)
				{
					SuperColumn c = r.super_column;
					le.add(s.deserialise(new String(c.getColumns().get(0)
							.getValue())));
				}
			}
		}
		System.out.println("Time: " + (System.currentTimeMillis() - t));

		return le;
	}

	@Override
	public Collection<Event> queryAll() throws Exception
	{
		List<Event> le = new Vector<Event>();
		ColumnParent columnParent = new ColumnParent("Events");
		SlicePredicate slicePredicate = new SlicePredicate();

		/**
		 * this effect how many columns we are want to retrieve also check
		 * slicePredicate.setColumn_names(java.util.List<byte[]> column_names)
		 * .setColumn_names(new ArrayList<byte[]>()); no columns retrievied at
		 * all
		 */
		SliceRange columnRange = new SliceRange();
		columnRange.setStart(new byte[0]);
		columnRange.setFinish(new byte[0]);
		// effect on columns order
		columnRange.setReversed(false);

		slicePredicate.setSlice_range(columnRange);

		// count of max retrieving keys
		KeyRange keyRange = new KeyRange(200000);
		keyRange.setStart_key("");
		keyRange.setEnd_key("");
		List<KeySlice> map = client.get_range_slices("EventLog", columnParent,
				slicePredicate, keyRange, ConsistencyLevel.ANY);

		// printing keys with columns
		for (KeySlice k : map)
		{
			// System.out.println(new
			// String(k.getColumns().get(0).getColumn().getValue()));
			try
			{
				le.add(s.deserialise(new String(k.getColumns().get(0)
						.getColumn().getValue())));
			}
			catch (Exception e)
			{
			}
		}

		return le;
	}

	@Override
	public Collection<Event> executeQuery(HashMap<String, String> params) throws InvalidRequestException, UnavailableException, TimedOutException, TException
	{
		Iterator<String>	tables;
		String				table;
		Collection<Event>	le;
		Set<String>			set, intersect;
		
		tables = params.keySet().iterator();
		intersect = null;
		while(tables.hasNext() && !(intersect != null && intersect.isEmpty()))
		{
			table = tables.next();
			set = retrieveKeys(table, params.get(table));
			if(intersect == null)
			{
				intersect = set;
			}
			else
			{
				intersect.retainAll(set); // Join procedure!
			}
		}

		if(intersect.isEmpty())
		{
			le = new Vector<Event>();
		}
		else
		{
			le = queryEvents(intersect);
		}
		
		return le;
	}

	private Collection<Event> queryEvents(Set<String> keys) throws InvalidRequestException, UnavailableException, TimedOutException, TException
	{
		ColumnParent					columnParent;
		SlicePredicate					slicePredicate;
		List<KeySlice>					map;
		Iterator<String>				its;
		Collection<Event>				le;
		
		columnParent = new ColumnParent("Events");
		slicePredicate = new SlicePredicate();
		
		its = keys.iterator();
		while(its.hasNext())
		{
			slicePredicate.addToColumn_names(its.next().getBytes());
		}
		
		// count of max retrieving keys
		KeyRange keyRange = new KeyRange(20000);
		keyRange.setStart_key("");
		keyRange.setEnd_key("");

		map = client.get_range_slices("EventLog", columnParent, slicePredicate,
				keyRange, ConsistencyLevel.ANY);
		
		le = new Vector<Event>();
		
		// printing keys with columns
		for (KeySlice k : map)
		{
			// System.out.println(new
			// String(k.getColumns().get(0).getColumn().getValue()));
			try
			{
				le.add(s.deserialise(new String(k.getColumns().get(0)
						.getColumn().getValue())));
			}
			catch (Exception e)
			{
			}
		}
		
		return le;
	}

	private Set<String> retrieveKeys(String table, String superColumn) throws InvalidRequestException, UnavailableException, TimedOutException, TException
	{
		ColumnParent					columnParent;
		SlicePredicate					slicePredicate;
		SliceRange						columnRange;
		List<KeySlice>					map;
		KeySlice						k;
		Iterator<ColumnOrSuperColumn>	it;
		Set<String>						set;
		
		System.out.println("retrieveKeys: " + table + "(" + superColumn + ")");
		columnParent = new ColumnParent(table);
		columnParent.setSuper_column(superColumn.getBytes());
		slicePredicate = new SlicePredicate();
		
		columnRange = new SliceRange();
		columnRange.setStart(new byte[0]);
		columnRange.setFinish(new byte[0]);
		// effect on columns order
		columnRange.setReversed(false);

		slicePredicate.setSlice_range(columnRange);

		// count of max retrieving keys
		KeyRange keyRange = new KeyRange(200000);
		keyRange.setStart_key(superColumn);
		keyRange.setEnd_key(superColumn);

		map = client.get_range_slices("EventLog", columnParent, slicePredicate,
				keyRange, ConsistencyLevel.ANY);
		
		set = new TreeSet<String>();
		if(!map.isEmpty())
		{
			k = map.get(0);
			it = k.getColumns().iterator();
			while(it.hasNext())
			{
				set.add(new String(it.next().getColumn().getValue()));
			}
		}
		
		return set;
	}

	@Override
	public Collection<String> queryKeys(String table) throws InvalidRequestException, UnavailableException, TimedOutException, TException
	{
		ColumnParent					columnParent;
		SlicePredicate					slicePredicate;
		SliceRange						columnRange;
		List<KeySlice>					map;
		KeySlice						k;
		Iterator<KeySlice>				itk;
		Vector<String>					set;
		
		System.out.println("queryKeys: " + table);
		columnParent = new ColumnParent(table);
		slicePredicate = new SlicePredicate();
		
		columnRange = new SliceRange();
		columnRange.setStart(new byte[0]);
		columnRange.setFinish(new byte[0]);
		// effect on columns order
		columnRange.setReversed(false);

		slicePredicate.setSlice_range(columnRange);

		// count of max retrieving keys
		KeyRange keyRange = new KeyRange(200000);
		keyRange.setStart_key("");
		keyRange.setEnd_key("");

		map = client.get_range_slices("EventLog", columnParent, slicePredicate,
				keyRange, ConsistencyLevel.ANY);
		
		set = new Vector<String>();
		itk = map.iterator();
		while(itk.hasNext())
		{
			k = itk.next();
			set.add(k.getKey());
		}
		
		return set;
	}
}
