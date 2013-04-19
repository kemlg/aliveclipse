package net.sf.ictalive.log.analysis_v2.pages;

import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Sash;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

public class TestPage extends WizardPage {

	Tree tabList;
	//Canvas canvas;
	Composite controlPanel, tabPanel;

	
	public TestPage(String s) {
		super("Page3");
		setTitle("Test Service Invocation");
		setDescription("Test Service invocation with throughput time and results");
		
		
	}
	
	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(final Composite parent) {
		
	    GridLayout layout = new GridLayout(3, false);
	    layout.horizontalSpacing = 1;
	    parent.setLayout(layout);
	    
	    createTabList(parent);
	    final Sash sash = new Sash(parent, SWT.VERTICAL);
	    createTabPanel(parent);
	    
	    GridData data;
//	    data = new GridData(SWT.FILL, SWT.CENTER, true, false);
//	    data.horizontalSpan = 3;	    
//	    toolBar.setLayoutData(data);
/* 	    data = new GridData(SWT.CENTER, SWT.FILL, false, true);
	    data.widthHint = tabList.computeSize(SWT.DEFAULT, SWT.DEFAULT).x + 50;
	    tabList.setLayoutData(data);*/
	    
	    data = new GridData(SWT.CENTER, SWT.FILL, false, true);
	    sash.setLayoutData(data);
	    data = new GridData(SWT.FILL, SWT.FILL, true, true);
	    tabPanel.setLayoutData(data);
/*	    sash.addListener(SWT.Selection, new Listener() {
	      public void handleEvent(Event event) {
	        if (event.detail != SWT.DRAG) {
	          GridData data = (GridData) tabList.getLayoutData();
	          data.widthHint = event.x
	              - tabList.computeTrim(0, 0, 0, 0).width;
	          parent.layout(true);
//	          animate = pauseItem.getEnabled();
	        } else {
	//          animate = false;
	        }
	      }
	    });*/
	    
	}
	
	static String getResourceString(String key) {
	      return "key";
	  }
	
	  void createTabList(Composite parent) {
		  new Label (parent, SWT.NONE).setText("Date From:");
		  tabList = new Tree(parent, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL
			        | SWT.BORDER);
	  }
	  
	  void createTabPanel(Composite parent) {
		    tabPanel = new Composite(parent, SWT.NONE);
		    GridData data;
		    GridLayout layout = new GridLayout(1, false);
		    layout.marginHeight = layout.marginWidth = 0;
		    tabPanel.setLayout(layout);
//		    createCanvas(tabPanel);
		    createControlPanel(tabPanel);
//		    data = new GridData(SWT.FILL, SWT.FILL, true, true);
//		    canvas.setLayoutData(data);
		    data = new GridData(SWT.FILL, SWT.CENTER, true, false);
		    controlPanel.setLayoutData(data);
		  }
	  
	void createControlPanel(Composite parent) {
		    Group group;
		    controlPanel = group = new Group(parent, SWT.NONE);
		    group.setText(getResourceString("Settings")); //$NON-NLS-1$
		    controlPanel.setLayout(new RowLayout());
	}
	
/*	void createCanvas(Composite parent) {
		canvas = new Canvas(parent, SWT.NO_BACKGROUND);
		  new Label (parent, SWT.NONE).setText("Create Canvas");
	}*/
}
