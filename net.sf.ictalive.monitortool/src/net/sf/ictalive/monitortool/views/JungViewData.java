package net.sf.ictalive.monitortool.views;

import javax.swing.JPanel;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;

import net.sf.ictalive.monitortool.JungVisualization.EventTypeNotSupportedException;
import net.sf.ictalive.monitortool.JungVisualization.JungEventGraphBuilder;
import net.sf.ictalive.monitortool.JungVisualization.JungViewBuilder;
import net.sf.ictalive.runtime.event.Event;

public class JungViewData
{

	private static Event event;	
	private static JPanel panel;
	

	public static void setEvent(Event obj) throws EventTypeNotSupportedException
	{
		event = obj;
		panel = buildJPanel();
	}

	public static Event getEvent()
	{
		return event;
	}
	
	public static JPanel getPanel()
	{
		return panel;
	}
	
	private static JPanel buildJPanel() throws EventTypeNotSupportedException
	{				 
		 JungViewBuilder sl = new JungViewBuilder();
		 
		 JungEventGraphBuilder se = new JungEventGraphBuilder();
		 sl.initView(se.event_graph(event), event.getLocalKey().getId() + "@" + event.getTimestamp().toString());
		 
		 JPanel jp = sl.getGraphJPanel();
   	 	
   	 	 return jp;
   	 
	}

}
