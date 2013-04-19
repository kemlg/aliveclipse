package net.sf.ictalive.monitortool.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import net.sf.ictalive.monitortool.JungVisualization.EventTypeNotSupportedException;
import net.sf.ictalive.monitortool.JungVisualization.JungEventGraphBuilder;
import net.sf.ictalive.monitortool.JungVisualization.JungViewBuilder;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.part.ViewPart;

public class JungView extends ViewPart 
{
		public static final String ID = "monitortool.views.JungView";
		java.awt.Frame f;

		net.sf.ictalive.runtime.event.Event actual_event;
		
		
        public JungView() 
        {
                super();
        }
                
        
     public void createPartControl(Composite parent)
     {    	     	     	
    		 Composite composite = new Composite(parent, SWT.EMBEDDED);
        	 f = SWT_AWT.new_Frame(composite);    		    		     		 
        	 JPanel jp = JungViewData.getPanel();        	         	 
             f.add(jp);

        }
	@Override
	public void setFocus() 
	{	
		
	}

}