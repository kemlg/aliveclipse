package net.sf.ictalive.monitortool.domain;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.zest.core.widgets.GraphNode;

import net.sf.ictalive.monitortool.views.StandaloneGraphView;
import net.sf.ictalive.runtime.event.Event;

public class AsserterGraphCreator implements IGraphCreator {

	@Override
	public void generate(StandaloneGraphView sgv) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void update(StandaloneGraphView standaloneGraphView, Event event) 
	{
		// TODO Auto-generated method stub
		GraphNode	gn, ge;
		String as;
		double sizeH, sizeW;	
		
		int limit = 300;
		
		as = "Mola!";
		if(standaloneGraphView.getAsserter(as) == null)
		{
			gn = standaloneGraphView.createAsserter(as);			
		}
		else
		{
			gn = standaloneGraphView.getAsserter(as);
			sizeH = gn.getSize().preciseHeight();
			sizeW = gn.getSize().preciseHeight();				
			
			if (sizeH < limit)
			{
				sizeH = sizeH + 1;
			}
			if (sizeW < limit)
			{
				sizeW = sizeW + 1;
			}
			
			gn.setSize(sizeW,sizeH);
		}
		as = "Tio!";
		if(standaloneGraphView.getAsserter(as) == null)
		{
			ge = standaloneGraphView.createAsserter(as);
		}		
		else
		{
			ge = standaloneGraphView.getAsserter(as);
			
			sizeH = ge.getSize().preciseHeight();
			sizeW = ge.getSize().preciseWidth();
			
			if (sizeH < limit)
			{
				sizeH = sizeH + 1;
			}
			if (sizeW < limit)
			{
				sizeW = sizeW + 1;
			}
			
			ge.setSize(sizeW,sizeH);
		}
		standaloneGraphView.createLink(gn, ge);
		
	}
		

}
