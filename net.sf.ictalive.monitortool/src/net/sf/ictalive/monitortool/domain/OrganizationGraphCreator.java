package net.sf.ictalive.monitortool.domain;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import net.sf.ictalive.metamodel.utils.Serialiser;
import net.sf.ictalive.monitortool.views.StandaloneGraphView;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.OperAModel;
import net.sf.ictalive.runtime.event.Event;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.swt.widgets.Shell;



public class OrganizationGraphCreator implements IGraphCreator
{
	@Override
	public void update(StandaloneGraphView standaloneGraphView, Event event)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generate(StandaloneGraphView sgv)
	{
		Serialiser<OperAModel>	s;
		OperAModel				ac;
		GraphNode				v1, v2;
		
		s = new Serialiser<OperAModel>(OMPackage.class);
		try
		{								
						
			showMessage("Please, select the file containing your organizational model");
			String filename = chooseOrganizationalModelFile();
			
			ac = s.deserialise(new URL("file:" + filename));				
			Map<EObject,GraphNode>	visited;			
			visited = new HashMap<EObject,GraphNode>();
						
			
			if(ac.getOm().getNs().getNorms().size() <= 0)
			{				
				showMessage("There are no norms available on the model ' " + filename + " '");
			}			
			else
			{
				//TODO Load model here
				
				draw(sgv, ac.getOm().getNs().getNorms().get(0), null, null, visited);							
			}
			
			
		}
		catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void showMessage(String message)
	{
		MessageDialog.openInformation(null,
				"Sample View", message);
	}

	private String chooseOrganizationalModelFile()
	{
		Shell dialogShower = new Shell();
		FileDialog dialog = new FileDialog(dialogShower, SWT.OPEN);

		String filename = dialog.open();
		
		return filename;
	}
	
	private void draw(StandaloneGraphView sgv, EObject e, GraphNode parent,
			String label, Map<EObject,GraphNode> visited)
	{
		EList<EObject>		el;
		Iterator<EObject>	it;
		EObject				recurse;
		GraphNode			gn;
		String				connection;		
		
		if(e != null)
		{
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
							draw(sgv, (EObject)ms[i].invoke(e, (Object[])null), gn, connection, visited);
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
								draw(sgv, objs.next(), gn, connection, visited);
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
