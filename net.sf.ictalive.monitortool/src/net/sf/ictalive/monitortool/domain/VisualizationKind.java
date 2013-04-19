package net.sf.ictalive.monitortool.domain;

import net.sf.ictalive.runtime.event.Event;

public class VisualizationKind
{
	private String			name;
	private IGraphCreator	gc;
	private Event event;

	public VisualizationKind(String name, IGraphCreator gc)
	{
		this.name = name;
		this.gc = gc;
	}

	@Override
	public String toString()
	{
		return name;
	}

	public String getName()
	{
		return name;
	}

	public IGraphCreator getGraphCreator()
	{
		return gc;
	}
}
