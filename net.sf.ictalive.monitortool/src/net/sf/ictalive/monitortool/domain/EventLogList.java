package net.sf.ictalive.monitortool.domain;

import java.util.Vector;

public class EventLogList
{
	private Vector<EventLogNode>	nodes;
	
	public EventLogList()
	{
		nodes = new Vector<EventLogNode>();
	}
	
	public EventLogNode[] getEventLogNodes()
	{
		System.out.println("1");
		return nodes.toArray(new EventLogNode[0]);
	}

	public void addNode(EventLogNode node)
	{
		nodes.add(node);
	}

	public void removeNode(EventLogNode node)
	{
		nodes.remove(node);
	}
}
