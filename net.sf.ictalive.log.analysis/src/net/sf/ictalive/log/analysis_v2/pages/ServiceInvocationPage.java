package net.sf.ictalive.log.analysis_v2.pages;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.Clickable;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayeredPane;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.ActionEvent;
import org.eclipse.draw2d.ActionListener;

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class ServiceInvocationPage extends WizardPage{
	
	Table actionTable;
	Group actionGroup;
	Table actionResTable;
	Group serviceGroup;
	Group group1 ; // the group on the RHS
	 
	int[] comboStyles = { SWT.SIMPLE, SWT.DROP_DOWN, SWT.READ_ONLY };
	
	public ServiceInvocationPage(String arg0) {
		super(arg0);
		setTitle("Service Invocation Information");
		setDescription("a combination of service, queueing and waiting times");
		
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
		group0.setText ("Plan with services");
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
		Combo combo = new Combo(group1, SWT.SIMPLE | SWT.DROP_DOWN | SWT.READ_ONLY);
	    combo.add("Plan1230201023");
	    combo.add("Plan5234134562");
	    combo.add("Plan5313472344");
	    combo.select(0);
	      
		addServiceTable(group1, "Plan1230201023");
	    addPlanResultTable(group1);
	    addActionTable(group1, "handle_im");
	    addActionResultTable(group1 );
	    
		setControl(composite);
	}
	
	private void addPlanActionsDiagram(Group group){
		Canvas canvas = new Canvas(group, SWT.BORDER);
		GridData gridData = new GridData(GridData.FILL, GridData.FILL, true,
				true);
		gridData.widthHint = 80;
		gridData.heightHint = 380;
		gridData.verticalSpan = 3;
//		gridData.horizontalSpan = 3;
		canvas.setLayoutData(gridData);
		
		LightweightSystem lws = new LightweightSystem(canvas);
		ChartFigure flowchart = new ChartFigure();
		lws.setContents(flowchart);
		
		ProcessFigure p1 = new ProcessFigure();
		p1.setName("handle_im");
		p1.setBounds(new Rectangle(80, 80, 80, 20));
		ProcessFigure p2 = new ProcessFigure();
		p2.setName("perform_asr");
		p2.setBounds(new Rectangle(80, 170, 100, 20));
		ProcessFigure p3 = new ProcessFigure();
		p3.setName("deliver_sms");
		p3.setBounds(new Rectangle(80, 280, 90, 20));	
		
		TerminatorFigure act1 = new TerminatorFigure();
		act1.setName("Send IM");
		act1.setBounds(new Rectangle(180, 80, 180, 20));
		
		TerminatorFigure act2 = new TerminatorFigure();
		act2.setName("Check ASR");
		act2.setBounds(new Rectangle(180, 170, 200, 20));
		
		TerminatorFigure act3 = new TerminatorFigure();
		act3.setName("Deliver SMS");
		act3.setBounds(new Rectangle(180, 280, 190, 20));
		
		final String name1 = p1.getName();
		final String serviceName = act1.getName();
		final int[] through = p1.getThroughtput();
		final int[] res = p1.getResult();
		p1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				updateServiceActionTables(name1, serviceName, through, res);
				
			}
		});
		final String name2 = p2.getName();
		final String serviceName2 = act2.getName();
		final int[] through2 = p2.getThroughtput();
		final int[] res2 = p2.getResult();
		p2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				updateServiceActionTables(name2, serviceName2, through2, res2);
			}
		});
		final String name3 = p3.getName();
		final String serviceName3 = act3.getName();
		final int[] through3 = p3.getThroughtput();
		final int[] res3 = p3.getResult();
		p3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				updateServiceActionTables(name3, serviceName3, through3, res3);
			}
		});
		

		PathFigure path1 = new PathFigure(""); //the name of the label
		path1.setSourceAnchor(p1.outAnchor);
		path1.setTargetAnchor(p2.inAnchor);

		PathFigure path11 = new PathFigure("service"); //the name of the label
		path11.setSourceAnchor(act1.outAnchor);
		path11.setTargetAnchor(p1.inAnchor);

		
		PathFigure path2 = new PathFigure(""); // the label
		path2.setSourceAnchor(p2.outAnchor);
		path2.setTargetAnchor(p3.inAnchor);
		
		PathFigure path22 = new PathFigure("service"); // the label
		path22.setSourceAnchor(act2.outAnchor);
		path22.setTargetAnchor(p2.inAnchor);
		
		PathFigure path33 = new PathFigure("service"); // the label
		path33.setSourceAnchor(act3.outAnchor);
		path33.setTargetAnchor(p3.inAnchor);
		
		flowchart.add(p1);
		flowchart.add(p2);
		flowchart.add(p3);
		flowchart.add(act1);
		flowchart.add(act2);
		flowchart.add(act3);
		flowchart.add(path1);
		flowchart.add(path2);
		flowchart.add(path11);
		flowchart.add(path22);
		flowchart.add(path33);
		new Dnd(p1);
		new Dnd(p2);
		new Dnd(p3);
		new Dnd(act1);
		new Dnd(act2);
		new Dnd(act3);
	}
	
	private void updateServiceActionTables(String actionName, String serviceName, int[] through, int[] res){
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
	
	
	private void addServiceTable(Group group, String name){
		serviceGroup = new Group (group, SWT.SHADOW_IN);
		serviceGroup.setText (name);
		serviceGroup.setLayout(new RowLayout(SWT.VERTICAL));
		
		
		Table serviceTable = new Table (serviceGroup, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		serviceTable.setLinesVisible (true);
		serviceTable.setHeaderVisible (true);
		//GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		RowData data = new RowData();
		//data.heightHint = 40;
		serviceTable.setLayoutData(data);
		String[] titles = {" ", "Service Throughtput  "};
		for (int i=0; i<titles.length; i++) {
			TableColumn column = new TableColumn (serviceTable, SWT.NONE);
			column.setText (titles [i]);
		}	
		TableItem item = new TableItem (serviceTable, SWT.NONE);
		item.setText (0, "average");
		item.setText (1, "12.3");
		item = new TableItem (serviceTable, SWT.NONE);
		item.setText (0, "max");
		item.setText (1, "23.6");
		item = new TableItem (serviceTable, SWT.NONE);
		item.setText (0, "min");
		item.setText (1, "4.22");
		for (int i=0; i<titles.length; i++) {
			serviceTable.getColumn (i).pack ();
		}	
	}
	
	
	private void addPlanResultTable(Group group){
		Table serviceTable = new Table (serviceGroup, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		serviceTable.setLinesVisible (true);
		serviceTable.setHeaderVisible (true);
//		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		RowData data = new RowData();
		//data.heightHint = 40;
		serviceTable.setLayoutData(data);
		String[] titles = {"Service Result  ", " "};
		for (int i=0; i<titles.length; i++) {
			TableColumn column = new TableColumn (serviceTable, SWT.NONE);
			column.setText (titles [i]);
		}	
		TableItem item = new TableItem (serviceTable, SWT.NONE);
		item.setText (0, "failed");
		item.setText (1, "1");
		item = new TableItem (serviceTable, SWT.NONE);
		item.setText (0, "succeeded");
		item.setText (1, "26");
		item = new TableItem (serviceTable, SWT.NONE);
		item.setText (0, "aborted");
		item.setText (1, "1");
		for (int i=0; i<titles.length; i++) {
			serviceTable.getColumn (i).pack ();
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
		item.setText (1, "3.8");
		item = new TableItem (actionTable, SWT.NONE);
		item.setText (0, "max");
		item.setText (1, "4.9");
		item = new TableItem (actionTable, SWT.NONE);
		item.setText (0, "min");
		item.setText (1, "1.5");
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
/////////////////////////////////////////////////////////////
/////////////// additional classes //////////////////////////


class ChartFigure extends FreeformLayeredPane {
	public ChartFigure() {
		setLayoutManager(new FreeformLayout());
		setBorder(new MarginBorder(5));
		setBackgroundColor(ColorConstants.white);
		setOpaque(true);
	}
}

class TerminatorFigure extends ActivityFigure {
	FixedAnchor inAnchor, outAnchor;

	public TerminatorFigure() {
		inAnchor = new FixedAnchor(this);
		inAnchor.place = new Point(1, 0);
		targetAnchors.put("in_term", inAnchor);
		outAnchor = new FixedAnchor(this);
		outAnchor.place = new Point(1, 2);
		sourceAnchors.put("out_term", outAnchor);
	}

	public void paintFigure(Graphics g) {
		Rectangle r = bounds;
		g.drawArc(r.x + r.width / 8, r.y, r.width / 4, r.height - 1, 90, 180);
		g.drawLine(r.x + r.width / 4, r.y, r.x + 3 * r.width / 4, r.y);
		g.drawLine(r.x + r.width / 4, r.y + r.height - 1,
				r.x + 3 * r.width / 4, r.y + r.height - 1);
		g.drawArc(r.x + 5 * r.width / 8, r.y, r.width / 4, r.height - 1, 270, 180);
		g.drawText(message, r.x + r.width/4, r.y + r.height/8);
	}
}

class Dnd extends MouseMotionListener.Stub implements MouseListener {
	public Dnd(IFigure figure) {
		figure.addMouseMotionListener(this);
		figure.addMouseListener(this);
	}

	Point start;

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseDoubleClicked(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
		start = e.getLocation();
	}

	public void mouseDragged(MouseEvent e) {
		Point p = e.getLocation();
		Dimension d = p.getDifference(start);
		start = p;
		Figure f = ((Figure) e.getSource());
		f.setBounds(f.getBounds().getTranslated(d.width, d.height));
	}
}

class FixedAnchor extends AbstractConnectionAnchor {
	Point place;

	public FixedAnchor(IFigure owner) {
		super(owner);
	}

	public Point getLocation(Point loc) {
		Rectangle r = getOwner().getBounds();
		int x = r.x + place.x * r.width / 2;
		int y = r.y + place.y * r.height / 2;
		Point p = new PrecisionPoint(x, y);
		getOwner().translateToAbsolute(p);
		return p;
	}
}

class DecisionFigure extends ActivityFigure {
	FixedAnchor inAnchor, yesAnchor, noAnchor;

	public DecisionFigure() {
		inAnchor = new FixedAnchor(this);
		inAnchor.place = new Point(1, 0);
		targetAnchors.put("in_dec", inAnchor);
		noAnchor = new FixedAnchor(this);
		noAnchor.place = new Point(2, 1);
		sourceAnchors.put("no", noAnchor);
		yesAnchor = new FixedAnchor(this);
		yesAnchor.place = new Point(1, 2);
		sourceAnchors.put("yes", yesAnchor);
	}

	public void paintFigure(Graphics g) {
		Rectangle r = bounds;
		PointList pl = new PointList(4);
		pl.addPoint(r.x + r.width / 2, r.y);
		pl.addPoint(r.x, r.y + r.height / 2);
		pl.addPoint(r.x + r.width / 2, r.y + r.height - 1);
		pl.addPoint(r.x + r.width, r.y + r.height / 2);
		g.drawPolygon(pl);
		g.drawText(message, r.x + r.width / 4 + 5, r.y + 3 * r.height / 8);
		g.drawText("N", r.x + 7 * r.width / 8, r.y + 3 * r.height / 8);
		g.drawText("Y", r.x + r.width / 2 - 2, r.y + 3 * r.height / 4);
	}
}

class PathFigure extends PolylineConnection {
	public PathFigure(String text) {
		setTargetDecoration(new PolylineDecoration());
		setConnectionRouter(ConnectionRouter.NULL);
		
		org.eclipse.draw2d.Label label = new org.eclipse.draw2d.Label(text);
		label.setOpaque(true);
		label.setBackgroundColor(ColorConstants.menuBackground);		
		this.add(label, new org.eclipse.draw2d.MidpointLocator(this, 0));
	}
}

class ProcessFigure extends ActivityFigure {
	FixedAnchor inAnchor, outAnchor;

	public ProcessFigure() {
		inAnchor = new FixedAnchor(this);
		inAnchor.place = new Point(1, 0);
		targetAnchors.put("in_proc", inAnchor);
		outAnchor = new FixedAnchor(this);
		outAnchor.place = new Point(1, 2);
		sourceAnchors.put("out_proc", outAnchor);
	}

	public void paintFigure(Graphics g) {
		Rectangle r = bounds;
		g.drawText(message, r.x + r.width / 4, r.y + r.height / 4);
		g.drawRectangle(r.x, r.y, r.width - 1, r.height - 1);
	}
	
	public int[] getThroughtput(){
		int[] result = new int[3];
		Random rand = new Random();
		result[0] = rand.nextInt(30); // average
		result[1] = rand.nextInt(50); // max
		result[2] = rand.nextInt(30); // min
		while(result[0] >= result[1])
			result[0] = rand.nextInt(30); // average
		while(result[2] >= result[1])
			result[2] = rand.nextInt(30); // min

		return result;
	}
	
	public int[] getResult(){
		int[] result = new int[3];
		Random rand = new Random();
		result[0] = rand.nextInt(20); // failed
		result[1] = rand.nextInt(50); // succeeded
		result[2] = rand.nextInt(20); // aborted
		while(result[0] >= result[1])
			result[0] = rand.nextInt(20); // failed
		while(result[2] >= result[1])
			result[2] = rand.nextInt(20); // abored
			return result;
	}
}

abstract class ActivityFigure extends Clickable {
	Rectangle r = new Rectangle();

	Hashtable targetAnchors = new Hashtable();

	Hashtable sourceAnchors = new Hashtable();

	String message = new String();

	public void setName(String msg) {
		message = msg;
		repaint();
	}
	
	public String getName(){ return message;}
	
	public ConnectionAnchor ConnectionAnchorAt(Point p) {
		ConnectionAnchor closest = null;
		long min = Long.MAX_VALUE;
		Hashtable conn = getSourceConnectionAnchors();
		conn.putAll(getTargetConnectionAnchors());
		Enumeration e = conn.elements();
		while (e.hasMoreElements()) {
			ConnectionAnchor c = (ConnectionAnchor) e.nextElement();
			Point p2 = c.getLocation(null);
			long d = p.getDistance2(p2);
			if (d < min) {
				min = d;
				closest = c;
			}
		}
		return closest;
	}

	public ConnectionAnchor getSourceConnectionAnchor(String name) {
		return (ConnectionAnchor) sourceAnchors.get(name);
	}

	public ConnectionAnchor getTargetConnectionAnchor(String name) {
		return (ConnectionAnchor) targetAnchors.get(name);
	}

	public String getSourceAnchorName(ConnectionAnchor c) {
		Enumeration e = sourceAnchors.keys();
		String name;
		while (e.hasMoreElements()) {
			name = (String) e.nextElement();
			if (sourceAnchors.get(name).equals(c))
				return name;
		}
		return null;
	}

	public String getTargetAnchorName(ConnectionAnchor c) {
		Enumeration e = targetAnchors.keys();
		String name;
		while (e.hasMoreElements()) {
			name = (String) e.nextElement();
			if (targetAnchors.get(name).equals(c))
				return name;
		}
		return null;
	}

	public ConnectionAnchor getSourceConnectionAnchorAt(Point p) {
		ConnectionAnchor closest = null;
		long min = Long.MAX_VALUE;
		Enumeration e = getSourceConnectionAnchors().elements();
		while (e.hasMoreElements()) {
			ConnectionAnchor c = (ConnectionAnchor) e.nextElement();
			Point p2 = c.getLocation(null);
			long d = p.getDistance2(p2);
			if (d < min) {
				min = d;
				closest = c;
			}
		}
		return closest;
	}

	public Hashtable getSourceConnectionAnchors() {
		return sourceAnchors;
	}

	public ConnectionAnchor getTargetConnectionAnchorAt(Point p) {
		ConnectionAnchor closest = null;
		long min = Long.MAX_VALUE;
		Enumeration e = getTargetConnectionAnchors().elements();
		while (e.hasMoreElements()) {
			ConnectionAnchor c = (ConnectionAnchor) e.nextElement();
			Point p2 = c.getLocation(null);
			long d = p.getDistance2(p2);
			if (d < min) {
				min = d;
				closest = c;
			}
		}
		return closest;
	}

	public Hashtable getTargetConnectionAnchors() {
		return targetAnchors;
	}
}

class FigureFactory {
	public static IFigure createTerminatorFigure() {
		return new TerminatorFigure();
	}

	public static IFigure createDecisionFigure() {
		return new DecisionFigure();
	}

	public static IFigure createProcessFigure() {
		return new ProcessFigure();
	}

	public static PathFigure createPathFigure() {
		return new PathFigure("");
	}

	public static ChartFigure createChartFigure() {
		return new ChartFigure();
	}
}
