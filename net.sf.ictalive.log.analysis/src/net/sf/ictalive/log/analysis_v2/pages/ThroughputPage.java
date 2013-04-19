package net.sf.ictalive.log.analysis_v2.pages;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.log.analysis_v2.LoadEventData;
import net.sf.ictalive.log.analysis_v2.plan.PlanInfo;

import org.eclipse.draw2d.ActionEvent;
import org.eclipse.draw2d.ActionListener;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class ThroughputPage extends WizardPage{
	
	LoadEventData loadEvent;
	boolean flag = true;
	List<PlanInfo> planList;
	List<ProcessFigure> processFigureList = new ArrayList<ProcessFigure>();
	ChartFigure flowchart;
	
	Table actionTable, actionResTable;
	Group actionGroup, planGroup;
	Table planTable, planResTable;
	Group group1 ; // the group on the RHS
	 
	int[] comboStyles = { SWT.SIMPLE, SWT.DROP_DOWN, SWT.READ_ONLY };
	
	public ThroughputPage(String arg0, LoadEventData le) {
		super(arg0);
		setTitle("Plan with actions information");
		setDescription("describes the throughtput and results of plans and actions");
		loadEvent = le;
	}
	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {

	    // create the composite to hold the widgets
		Composite composite = new Composite(parent, SWT.NONE);

	    // create the desired layout for this wizard page
		FillLayout fl = new FillLayout();
		fl.type = SWT.HORIZONTAL;//.VERTICAL;
		
		GridLayout gl = new GridLayout();
		int ncol = 2;
		gl.numColumns = ncol;
		gl.makeColumnsEqualWidth=false;
		composite.setLayout(fl);
		
		// the group on the LHS
		Group group0 = new Group (composite, SWT.SHADOW_IN);
		group0.setText ("Plan with actions");
		group0.setLayout(gl);//new FillLayout(SWT.VERTICAL));
		group0.setSize(600, 600);
		
		
		addPlanActionsDiagram(group0);
		
		// starting on the group of RHS
		group1 = new Group (composite, SWT.SHADOW_IN);
		group1.setText ("More information");
		GridLayout grid = new GridLayout();
		grid.numColumns = ncol;
		group1.setLayout(new RowLayout(SWT.VERTICAL));

		new Label (group1, SWT.NONE).setText("Choose one of the plans to view details:");
		final Combo combo = new Combo(group1, SWT.SIMPLE | SWT.DROP_DOWN | SWT.READ_ONLY);
	   
		addEnactmentList(combo);
		
	    combo.select(0);
	    combo.addSelectionListener(new SelectionAdapter() {
	    	public void widgetSelected(SelectionEvent e) {
				for(int i=0; i<planList.size(); i++){
					if(combo.getText().equals(planList.get(i).getName())){
						updatePlanDiagram(planList.get(i));
						updatePlanTable(planList.get(i));
					}
				}
			}
		});
	    
		addPlanTable(group1, planList.get(0));
	    addPlanResultTable(group1, planList.get(0));
	    addActionTable(group1, "handle_im");
	    addActionResultTable(group1 );
	    
		setControl(composite);
	}
	
	// display the plan with actions on the LHS when the combo of plans is changed
	private void updatePlanDiagram(PlanInfo planInfo){
		// ****** Clear the diagram before drawing anything
		flowchart.erase();
		flowchart.removeAll();
		processFigureList.clear();
		int y1 = 80;
		for(int i=0; i<planInfo.getActionList().size(); i++){
			ProcessFigure p1 = new ProcessFigure();
			p1.setName(planInfo.getActionList().get(i).getName());
			p1.setBounds(new Rectangle(80, y1, 180, 20));
			y1 = y1 + 80;
			final String name1 = p1.getName();
			final int[] through = p1.getThroughtput();
			final int[] res = p1.getResult();
			p1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					
					updateActionTables(name1, through, res);
					
				}
			});
			processFigureList.add(p1);
			flowchart.add(p1);
			new Dnd(p1);
		}// end for loop
		
		if(processFigureList.size() > 1)
			for(int i=0; i<processFigureList.size(); i++){
				ProcessFigure p1 = processFigureList.get(i);
				if( processFigureList.size() == (i+1)) break;

				ProcessFigure p2 = processFigureList.get(i+1);
				PathFigure path1 = new PathFigure(""); //the name of the label
				path1.setSourceAnchor(p1.outAnchor);
				path1.setTargetAnchor(p2.inAnchor);
				flowchart.add(path1);
			}
		flowchart.repaint();
	}

	
	private void addEnactmentList(Combo combo){
		for(int k=0; k< planList.size(); k++){
			PlanInfo plan = planList.get(k);
			combo.add(plan.getName());
			System.out.println("Plan: " + plan.getName());
		}
	}
	
	private void addPlanActionsDiagram(Group group){
		Canvas canvas = new Canvas(group, SWT.BORDER);
		GridData gridData = new GridData(GridData.FILL, GridData.FILL, true,
				true);
		gridData.widthHint = 80;
		gridData.heightHint = 380;
		gridData.verticalSpan = 3;
		canvas.setLayoutData(gridData);
		
		LightweightSystem lws = new LightweightSystem(canvas);
	    flowchart = new ChartFigure();
		lws.setContents(flowchart);
		
		planList = loadEvent.getEnactmentList();
		updatePlanDiagram(planList.get(0));
	}
	
	private void updateActionTables(String actionName, int[] through, int[] res){
		actionTable.removeAll();
		actionResTable.removeAll();
		
		//addActionTable(group1, actionName);
		//addActionResultTable(group1, actionName);
		actionGroup.setText("Action: " + actionName);
		TableItem[] items = new TableItem[3];
		for (int i = 0; i < 3; i++) 
		      items[i] = new TableItem(actionTable, SWT.NONE);
		items[0].setText(0, "avg");
		items[0].setText(1, Integer.toString(through[0]));
		items[1].setText(0, "max");
		items[1].setText(1, Integer.toString(through[1]));
		items[2].setText(0, "min");
		items[2].setText(1, Integer.toString(through[2]));
		
		TableItem[] items2 = new TableItem[3];
		for (int i = 0; i < 3; i++) 
		      items2[i] = new TableItem(actionResTable, SWT.NONE);
		items2[0].setText(0, "failed");
		items2[0].setText(1, Integer.toString(res[0]));
		items2[1].setText(0, "succeeded");
		items2[1].setText(1, Integer.toString(res[1]));
		items2[2].setText(0, "aborted");
		items2[2].setText(1, Integer.toString(res[2]));
	}
	
	
	private void addPlanTable(Group group, PlanInfo plan){
		planGroup = new Group (group, SWT.SHADOW_IN);
		planGroup.setText ("Plan: " + plan.getName());
		planGroup.setLayout(new RowLayout(SWT.VERTICAL));
		
		planTable = new Table (planGroup, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		planTable.setLinesVisible (true);
		planTable.setHeaderVisible (true);
		//GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		RowData data = new RowData();
		//data.heightHint = 40;
		planTable.setLayoutData(data);
		String[] titles = {" ", "Plan Throughtput  "};
		for (int i=0; i<titles.length; i++) {
			TableColumn column = new TableColumn (planTable, SWT.NONE);
			column.setText (titles [i]);
		}	
		TableItem item = new TableItem (planTable, SWT.NONE);
		item.setText (0, "average");
		item.setText (1, Float.toString(plan.getThroughtput_avg()));
		item = new TableItem (planTable, SWT.NONE);
		item.setText (0, "max");
		item.setText (1, Float.toString(plan.getThroughtput_max()));
		item = new TableItem (planTable, SWT.NONE);
		item.setText (0, "min");
		item.setText (1, Float.toString(plan.getThroughtput_min()));
		for (int i=0; i<titles.length; i++) {
			planTable.getColumn (i).pack ();
		}	
	}
	
	private void updatePlanTable(PlanInfo plan){
		planTable.removeAll();
		planResTable.removeAll();
		
		//addActionTable(group1, actionName);
		//addActionResultTable(group1, actionName);
		planGroup.setText("Plan: " + plan.getName());
		TableItem[] items = new TableItem[3];
		for (int i = 0; i < 3; i++) 
		      items[i] = new TableItem(planTable, SWT.NONE);
		items[0].setText(0, "avg");
		items[0].setText(1, Float.toString(plan.getThroughtput_avg()));
		items[1].setText(0, "max");
		items[1].setText(1, Float.toString(plan.getThroughtput_max()));
		items[2].setText(0, "min");
		items[2].setText(1, Float.toString(plan.getThroughtput_min()));
		
		TableItem[] items2 = new TableItem[3];
		for (int i = 0; i < 3; i++) 
		      items2[i] = new TableItem(planResTable, SWT.NONE);
		items2[0].setText(0, "failed");
		items2[0].setText(1, Float.toString(plan.getResult_fail()));
		items2[1].setText(0, "succeeded");
		items2[1].setText(1, Float.toString(plan.getResult_succ()));
		items2[2].setText(0, "aborted");
		items2[2].setText(1, Float.toString(plan.getResult_abort()));
	
	}
	
	private void addPlanResultTable(Group group, PlanInfo plan){
		planResTable = new Table (planGroup, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		planResTable.setLinesVisible (true);
		planResTable.setHeaderVisible (true);
//		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		RowData data = new RowData();
		//data.heightHint = 40;
		planResTable.setLayoutData(data);
		String[] titles = {"Plan Result  ", "      "};
		for (int i=0; i<titles.length; i++) {
			TableColumn column = new TableColumn (planResTable, SWT.NONE);
			column.setText (titles [i]);
		}	
		TableItem item = new TableItem (planResTable, SWT.NONE);
		item.setText (0, "failed");
		item.setText (1, Float.toString(plan.getResult_fail()));
		item = new TableItem (planResTable, SWT.NONE);
		item.setText (0, "succeeded");
		item.setText (1, Float.toString(plan.getResult_succ()));
		item = new TableItem (planResTable, SWT.NONE);
		item.setText (0, "aborted");
		item.setText (1, Float.toString(plan.getResult_abort()));
		for (int i=0; i<titles.length; i++) {
			planResTable.getColumn (i).pack ();
		}	
	}
	private void addActionTable(Group group, String name){
		actionGroup = new Group (group, SWT.SHADOW_IN);
		actionGroup.setText (name);
		actionGroup.setLayout(new RowLayout(SWT.VERTICAL));

		actionTable = new Table (actionGroup, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		actionTable.setLinesVisible (true);
		actionTable.setHeaderVisible (true);
//		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		RowData data = new RowData();
		//data.heightHint = 40;
		actionTable.setLayoutData(data);
		String[] titles = {"  ", "Action Throughtput  "};
		for (int i=0; i<titles.length; i++) {
			TableColumn column = new TableColumn (actionTable, SWT.NONE);
			column.setText (titles [i]);
		}	
		TableItem item = new TableItem (actionTable, SWT.NONE);
		item.setText (0, "average");
		item.setText (1, "13.4");
		item = new TableItem (actionTable, SWT.NONE);
		item.setText (0, "max");
		item.setText (1, "24.2");
		item = new TableItem (actionTable, SWT.NONE);
		item.setText (0, "min");
		item.setText (1, "11.3");
		for (int i=0; i<titles.length; i++) {
			actionTable.getColumn (i).pack ();
		}
		
	}
	
	private void addActionResultTable(Group group){
		actionResTable = new Table (actionGroup, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		actionResTable.setLinesVisible (true);
		actionResTable.setHeaderVisible (true);
//		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		RowData data = new RowData();
		//data.heightHint = 40;
		actionResTable.setLayoutData(data);
		String[] titles = {"  ", "Action Result  "};
		for (int i=0; i<titles.length; i++) {
			TableColumn column = new TableColumn (actionResTable, SWT.NONE);
			column.setText (titles [i]);
		}	
		TableItem item = new TableItem (actionResTable, SWT.NONE);
		item.setText (0, "failed");
		item.setText (1, "0");
		item = new TableItem (actionResTable, SWT.NONE);
		item.setText (0, "succeeded");
		item.setText (1, "33");
		item = new TableItem (actionResTable, SWT.NONE);
		item.setText (0, "aborted");
		item.setText (1, "0");
		for (int i=0; i<titles.length; i++) {
			actionResTable.getColumn (i).pack ();
		}	
	}
	
	private JFreeChart createChart(CategoryDataset dataset) {
		JFreeChart chart = ChartFactory.createBarChart
		 ("Enactment Throughput Time","Enactments", "Time (hours)", dataset,
		 PlotOrientation.VERTICAL, false, true, false);
		chart.setBackgroundPaint(Color.lightGray);
		chart.getTitle().setPaint(Color.blue);
		CategoryPlot plot = (CategoryPlot) chart.getPlot(); //chart.getCategoryPlot();
		plot.setRangeGridlinePaint(Color.red);
		
/*		JFreeChart chart = ChartFactory.createBarChart("Throughput Time Bar Chart", // chart
				// title
				"Enactment", // domain axis label
				"Time", // range axis label
				dataset, // data
				PlotOrientation.VERTICAL, // orientation
				true, // include legend
				true, // tooltips?
				false // URLs?
				);

		CategoryPlot plot = (CategoryPlot) chart.getPlot();
		plot.setBackgroundPaint(Color.lightGray);
		plot.setDomainGridlinePaint(Color.white);
		plot.setDomainGridlinesVisible(true);
		plot.setRangeGridlinePaint(Color.white);*/
		return chart;

	}
	
	private CategoryDataset createDataset() {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		/*
		ArrayList<QueryResult> res = model.queryThroughputTime();
		for(int i=0; i<res.size(); i++){
			QueryResult qr = res.get(i);
			String enact = (String)qr.get(0);
			dataset.setValue(Double.parseDouble((String)qr.get(1)), "Time (hours)", enact.substring(5, enact.length()));
		}*/
		dataset.setValue(2, "Time", "Enactment1");
		dataset.setValue(7, "Time", "Vinod");
		dataset.setValue(4, "Time", "Deepak");
		dataset.setValue(9, "Time", "Prashant");
		dataset.setValue(6, "Time", "Chandan");
		// row keys...
		String series1 = "First";
		String series2 = "Second";

		// column keys...
		String category1 = "Label 1";
		String category2 = "Label 2";
		String category3 = "Label  3";

		dataset.addValue(1.0, series1, category1);
		dataset.addValue(4.0, series1, category2);
		dataset.addValue(3.0, series1, category3);

		dataset.addValue(5.0, series2, category1);
		dataset.addValue(7.0, series2, category2);
		dataset.addValue(6.0, series2, category3);

		return dataset;
	}
    /*
     * Process the events: when the user has entered all information
     * the wizard can be finished
     */
	public void handleEvent(Event e)
	{
		getWizard().getContainer().updateButtons();		
	}

	public boolean canFlipToNextPage()
	{
		// no next page for this path through the wizard
		return false;
	}

	/*
	 * Sets the completed field on the wizard class when all the information 
	 * is entered and the wizard can be completed
	 */	 
	public boolean isPageComplete()
	{ return true;}
}
