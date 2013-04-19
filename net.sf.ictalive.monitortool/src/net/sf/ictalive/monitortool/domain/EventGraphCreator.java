package net.sf.ictalive.monitortool.domain;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import net.sf.ictalive.monitortool.Configuration.Singleton;
import net.sf.ictalive.monitortool.views.StandaloneGraphView;
import net.sf.ictalive.operetta.OM.Atom;
import net.sf.ictalive.operetta.OM.OMFactory;
import net.sf.ictalive.runtime.event.Event;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.zest.core.widgets.GraphNode;


public class EventGraphCreator implements IGraphCreator
{

	@Override
	public void generate(StandaloneGraphView sgv)
	{
		sgv.emptyGraph();
	}

	@Override
	public void update(StandaloneGraphView sgv, Event event)
	{
		Map<EObject,GraphNode>	visited;
		
		visited = new HashMap<EObject,GraphNode>();
		draw(sgv, event, null, null, visited, true);
	}

	private void draw(StandaloneGraphView sgv, EObject e, GraphNode parent,
			String label, Map<EObject,GraphNode> visited, boolean isFirst)
	{
		EList<EObject>		el;
		Iterator<EObject>	it;
		EObject				recurse;
		GraphNode			gn;
		String				connection;
		
		
		
		if(e != null && (isFirst || !(e instanceof Event)))
		{
			if ( !Singleton.forbidden_EventGrahp_concepts.contains(e.getClass().getCanonicalName()))
			{
				//System.out.println("-->" + e.getClass().getCanonicalName());
				
				gn = visited.get(e);
				if(gn == null)
				{
					gn = sgv.createEObject(e);
				}
				
				if (parent != null)
				{
					if(label == null)
					{
						sgv.createLink(parent, gn);
					}
					else
					{
						System.out.println("Label: " + label);
						sgv.createLink(parent, gn, label);
					}
				}
		
				if(visited.get(e) == null)
				{
					visited.put(e, gn);
					
					Method[] ms = e.getClass().getMethods();				
					for(int i=0;i<ms.length;i++)
					{
						
						if(ms[i].getName().startsWith("get") && !ms[i].getName().equals("getClass") && EObject.class.isAssignableFrom(ms[i].getReturnType()))
						{
							try
							{							
								connection = ms[i].getName().substring(3, 4).toLowerCase() + ms[i].getName().substring(4);
								draw(sgv, (EObject)ms[i].invoke(e, (Object[])null), gn, connection, visited, false);
							}
							catch (IllegalArgumentException e1)
							{
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							catch (IllegalAccessException e1)
							{
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							catch (InvocationTargetException e1)
							{
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						else if(ms[i].getName().startsWith("get") && !ms[i].getName().equals("getClass") && EList.class.isAssignableFrom(ms[i].getReturnType()))
						{						
							connection = ms[i].getName().substring(3, 4).toLowerCase() + ms[i].getName().substring(4);
							EList<EObject> elist;
							try
							{
								elist = (EList<EObject>) ms[i].invoke(e, (Object[])null);
								Iterator<EObject> objs = elist.iterator();
								while(objs.hasNext())
								{
									Object actual = objs.next();
									//System.out.println("----------->" + actual.getClass().getCanonicalName());
									try
									{
										draw(sgv, (EObject)actual, gn, connection, visited, false);
									}
									catch(java.lang.ClassCastException E)
									{
										OMFactory		of = OMFactory.eINSTANCE;
										Atom		a;		
										
										a = of.createAtom();
										a.setPredicate("String when expecting EObject!! '" + (String)actual + "'");
										
										draw(sgv, a, gn, connection, visited, false);
									}
									
									
								}
							}
							catch (IllegalArgumentException e1)
							{
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							catch (IllegalAccessException e1)
							{
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							catch (InvocationTargetException e1)
							{
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
		
		//			el = e.eCrossReferences();
		//			it = el.iterator();
		//			while (it.hasNext())
		//			{
		//				recurse = it.next();
		//				draw(sgv, recurse, gn, visited);
		//			}
		//
		//			it = e.eContents().iterator();
		//			while (it.hasNext())
		//			{
		//				recurse = it.next();
		//				draw(sgv, recurse, gn, visited);
		//			}
				}
			}
		}
	}
}
