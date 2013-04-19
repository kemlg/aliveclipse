package net.sf.ictalive.eventlog.db;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;

import net.sf.ictalive.runtime.event.Event;

public interface IEventDB
{
	void store(Event ev) throws Exception;
	Collection<Event> query(String query) throws IOException, Exception;
	void clear();
	Collection<Event> queryByFactType(String name) throws Exception;
	Collection<Event> queryAll() throws Exception;
	Collection<Event> executeQuery(HashMap<String, String> params) throws Exception;
	Collection<String> queryKeys(String table) throws Exception;
}
