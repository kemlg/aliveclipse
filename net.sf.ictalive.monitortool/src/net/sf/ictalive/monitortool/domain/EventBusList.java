package net.sf.ictalive.monitortool.domain;

import java.util.Vector;

public class EventBusList
{
	private Vector<EventBusNode>	nodes;
	
	public EventBusList()
	{
		nodes = new Vector<EventBusNode>();
	}
	
	public EventBusNode[] getEventBusNodes()
	{
		return nodes.toArray(new EventBusNode[0]);
	}

	public void addNode(EventBusNode node)
	{
		nodes.add(node);
	}

	public void removeNode(EventBusNode node)
	{
		nodes.remove(node);
	}
}
