package net.sf.ictalive.monitortool.domain;

import java.net.MalformedURLException;
import java.net.URL;

import net.sf.ictalive.coordination.tasks.ActionGrounding;
import net.sf.ictalive.coordination.tasks.ActionGroundingList;
import net.sf.ictalive.coordination.tasks.PlansCollection;
import net.sf.ictalive.coordination.tasks.TasksPackage;
import net.sf.ictalive.metamodel.utils.Serialiser;
import net.sf.ictalive.monitortool.views.StandaloneGraphView;
import net.sf.ictalive.runtime.event.Event;

import org.eclipse.swt.SWT;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;

public class CoordinationGraphCreator implements IGraphCreator
{
	@Override
	public void update(StandaloneGraphView standaloneGraphView, Event event)
	{
		// TODO Auto-generated method stub		
	}

	@Override
	public void generate(StandaloneGraphView sgv)
	{
//		Serialiser<PlansCollection>		s;
//		PlansCollection					ac;
//		ActionGrounding					p;
//		ActionGroundingList				rest;
//		GraphNode						v1, v2;
//		
//		s = new Serialiser<PlansCollection>(TasksPackage.class);
//		try
//		{
//			ac = s.deserialise(new URL("http://ict-alive.svn.sourceforge.net/viewvc/ict-alive/UseCases/TMT/trunk/DelftModel/Sergio/ContentAdaptionScenePlans/ContentAdaptionScenePlan_39.plans"));
//			p = ac.getPlans().get(0).getHasAtomicProcessGroundingList().getFirst();
//			
//			v1 = sgv.createTask(p.getOwlsProcess().getName());
//			
//			rest = ac.getPlans().get(0).getHasAtomicProcessGroundingList().getRest();
//			while(rest != null)
//			{
//				p = rest.getFirst();
//				
//				v2 = sgv.createTask(p.getOwlsProcess().getName());
//				sgv.createLink(v1, v2);
//				v1 = v2;
//				
//				rest = rest.getRest();
//			}
//		}
//		catch (MalformedURLException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
