package net.sf.ictalive.monitortool.domain;

import net.sf.ictalive.monitortool.views.StandaloneGraphView;
import net.sf.ictalive.runtime.event.Event;
import net.sf.ictalive.runtime.event.EventFactory;

import org.eclipse.zest.core.widgets.GraphNode;


public class GeneralGraphCreator implements IGraphCreator
{
	@Override
	public void update(StandaloneGraphView sgv, Event ev)
	{
		String		as;
		GraphNode	gn, ge;
		
		as = ev.getAsserter().getName();
		if(sgv.getAsserter(as) == null)
		{
			gn = sgv.createAsserter(as);
		}
		else
		{
			gn = sgv.getAsserter(as);
		}
		
		ge = sgv.createEvent("lala");
		sgv.createLink(gn, ge);
	}

	@Override
	public void generate(StandaloneGraphView sgv)
	{
		// TODO Auto-generated method stub
		
	}
}
