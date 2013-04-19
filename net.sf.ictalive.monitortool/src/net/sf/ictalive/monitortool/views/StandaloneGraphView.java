package net.sf.ictalive.monitortool.views;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

import net.sf.ictalive.monitortool.domain.IGraphCreator;
import net.sf.ictalive.monitortool.domain.UMLClassFigure;
import net.sf.ictalive.monitortool.domain.UMLNode;
import net.sf.ictalive.runtime.event.Event;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Locator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;


public class StandaloneGraphView
{
	Graph						graph;
//	mxGraphComponent			graphComponent;
	TreeMap<String,GraphNode>	mapAsserters;
	Map<String,GraphConnection>	mapLinks;
	Map<String,Label>			mapLabels;
	
	private static Font classFont;
	private static Image classImage;
	private static Image privateField;
	private static Image publicField;
	
	private int last_posx, last_posy = 0;
	private int increment_x = 50;
	private int increment_y = 50;
	private int max_x = 5;
	int count_x = 0;		
	
	static
	{
		classFont = new Font(null, "Arial", 12, SWT.BOLD);
		classImage = new Image(Display.getDefault(), UMLClassFigure.class.getResourceAsStream("/class_obj.gif"));
		privateField = new Image(Display.getDefault(), UMLClassFigure.class.getResourceAsStream("/field_private_obj.gif"));
		publicField = new Image(Display.getDefault(), UMLClassFigure.class.getResourceAsStream("/methpub_obj.gif"));
	}

	public StandaloneGraphView(Composite parent)
	{
		graph = new Graph(parent, SWT.NONE);
		
		
		mapAsserters = new TreeMap<String,GraphNode>();
		mapLinks = new TreeMap<String,GraphConnection>();
		mapLabels = new TreeMap<String,Label>();
		graph.setLayoutAlgorithm(new SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);				
					
	}
	
	public void generateGraphAndScroll(IGraphCreator gc,int x_scroll) throws IOException
	{
		final StandaloneGraphView	sgv = this;
		final IGraphCreator			g = gc;
		final Graph					gr = graph;
		final int 					final_x_scroll =  x_scroll;
		
		Display.getDefault().syncExec(
				new Runnable ()	{
					public void run()	{
						g.generate(sgv);
//						gr.setLayoutAlgorithm(new SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);	
						gr.scrollTo(final_x_scroll, 0);
					}
				}
			);
	}
	
	public void generateGraph(IGraphCreator gc) throws IOException
	{
		final StandaloneGraphView	sgv = this;
		final IGraphCreator			g = gc;
		final Graph					gr = graph;
		
		Display.getDefault().syncExec(
				new Runnable ()	{
					public void run()	{
						g.generate(sgv);
//						gr.setLayoutAlgorithm(new SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);						
					}
				}
			);
	}
	
	public void generateSrpingLayoutGraph(IGraphCreator gc) throws IOException
	{
		final StandaloneGraphView	sgv = this;
		final IGraphCreator			g = gc;
		final Graph					gr = graph;
		
		Display.getDefault().syncExec(
				new Runnable ()	{
					public void run()	{
						g.generate(sgv);						
						gr.setLayoutAlgorithm(new SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);							
						gr.setHorizontalScrollBarVisibility(org.eclipse.draw2d.FigureCanvas.ALWAYS);
						gr.setVerticalScrollBarVisibility(org.eclipse.draw2d.FigureCanvas.ALWAYS);
					}
				}
			);
	}
	
	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws InterruptedException, IOException
	{
		Display d = new Display();
		Shell shell = new Shell(d);
		shell.setText("GraphSnippet1");
		shell.setLayout(new FillLayout());
		shell.setSize(400, 400);
		
		new StandaloneGraphView(shell);
//		sgv.generateGraph();
		
		shell.open();
		while (!shell.isDisposed()) {
			while (!d.readAndDispatch()) {
				d.sleep();
			}
		}
	}

	public void updateGraph(Event event, IGraphCreator gc)
	{
		final StandaloneGraphView	sgv = this;
		final IGraphCreator			g = gc;
		final Event					ev = event;
		final Graph					gr = graph;
		
		Display.getDefault().syncExec(
				new Runnable ()	{
					public void run()	{
						g.update(sgv, ev);
//						gr.setLayoutAlgorithm(new SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
					}
				}
			);
	}

	public GraphNode getAsserter(String as)
	{
		return mapAsserters.get(as);
	}

	public GraphNode createAsserter(String as)
	{
		GraphNode	gn;
		
		gn = new GraphNode(graph, SWT.NONE, as);
		mapAsserters.put(as, gn);
		
		return gn;
	}

	public GraphNode createEvent(String name)
	{
		GraphNode	gn;
		
		gn = new GraphNode(graph, SWT.NONE, name);
		
		return gn;
	}
		
	
	public GraphNode createToolTipEventOnPosition(String name, String toolTip, int xPos, int yPos, int colour)
	{
		GraphNode	gn;
		
		gn = new GraphNode(graph, SWT.NONE, name);		
		gn.setLocation(xPos, yPos);		
		gn.setText(name);
		if (colour != -1)
		{
			Color my_color = Display.getCurrent().getSystemColor(colour);
		
			gn.setBackgroundColor(my_color);			
			gn.setHighlightColor(my_color);			
			if (colour == SWT.COLOR_RED)
			{
				Color my_colorF = Display.getCurrent().getSystemColor(SWT.COLOR_GRAY);
				gn.setForegroundColor(my_colorF);
			}
		}
			
		Label toolTipFigure = new Label();
		//toolTipFigure.setText(toolTip + "\n" + "\n" + xPos + "|" + yPos);
		toolTipFigure.setText(toolTip);
		gn.setTooltip(toolTipFigure);
		return gn;
	}
	
	public GraphNode createIncrementalEvent(String name, String toolTip)
	{
		GraphNode	gn;
		
		gn = new GraphNode(graph, SWT.NONE, name);
		
		gn.setLocation(last_posx, last_posy);
		last_posx = last_posx + increment_x;
		count_x ++;
		if (count_x % max_x == 0)
		{
			last_posx = 0;
			last_posy = last_posy + increment_y;
		}
		gn.setText(name);
		Label toolTipFigure = new Label();
		toolTipFigure.setText(toolTip);
		gn.setTooltip(toolTipFigure);
		return gn;
	}

	public void createLink(GraphNode g1, GraphNode g2)
	{
		GraphConnection	gc;
		
		gc = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, g1, g2);
		gc.changeLineColor(ColorConstants.black);
	}
	
	public void createBoundLink(GraphNode g1, GraphNode g2)
	{
		GraphConnection	gc;
		
		gc = new GraphConnection(graph, ZestStyles.CONNECTIONS_SOLID, g1, g2);
		gc.setLineWidth(5);
		gc.changeLineColor(ColorConstants.black);		
	}

	public GraphNode createTask(String name)
	{
		GraphNode	gn;
		
		gn = new GraphNode(graph, SWT.NONE, name);
		
		return gn;
	}

	public GraphNode createEObject(EObject e)
	{
		UMLNode	n;
		
		n = new UMLNode(graph, SWT.NONE, createClassFigure1(e, publicField, privateField));
		
		return n;
	}
	
	public IFigure createClassFigure1(EObject e, Image publicField, Image privateField) {
		Label label;
		Label classLabel1 = new Label(e.eClass().getInstanceTypeName().substring(e.eClass().getInstanceTypeName().lastIndexOf('.') + 1), classImage);
		classLabel1.setFont(classFont);

		Vector<Label> labels = new Vector<Label>();
		Method[] ms = e.getClass().getMethods();
		for(int i=0;i<ms.length;i++)
		{
			if(ms[i].getName().startsWith("get") && !ms[i].getName().equals("getClass") && !EObject.class.isAssignableFrom(ms[i].getReturnType()) && !EList.class.isAssignableFrom(ms[i].getReturnType()))
			{
				try
				{
					label = new Label(ms[i].getName().substring(3, 4).toLowerCase() + ms[i].getName().substring(4) + " = " + ms[i].invoke(e, (Object[])null), privateField);
					labels.add(label);
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
		
		UMLClassFigure classFigure = new UMLClassFigure(classLabel1);
//		Label attribute1 = new Label("columns: Column[]", privateField);
//
//		Label attribute2 = new Label("rows: Row[]", privateField);

//		Label method1 = new Label("getColumns(): Column[]", publicField);
//		Label method2 = new Label("getRows(): Row[]", publicField);
		Iterator<Label> it = labels.iterator();
		while(it.hasNext())
		{
			classFigure.getAttributesCompartment().add(it.next());
		}
//		classFigure.getAttributesCompartment().add(attribute2);
//		classFigure.getMethodsCompartment().add(method1);
//		classFigure.getMethodsCompartment().add(method2);
		classFigure.setSize(-1, -1);

		return classFigure;
	}

	public void createLinkOrtogonal(GraphNode g1, GraphNode g2, String label)
	{
		GraphConnection		gc;
		Locator				l;
		Connection			c;
		String				hash;
		Label				pld;
		
		hash = g1.hashCode() + ":" + g2.hashCode();
		if(mapLinks.get(hash) == null)
		{
			gc = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, g1, g2);
			//gc.setCurveDepth(100);
						
			gc.changeLineColor(ColorConstants.black);
			
			
			c = gc.getConnectionFigure();
			
			pld = new PolylineLabelDecoration();
			pld.setText(label);
			pld.setFont(gc.getFont());
			l = new PolylineLabelLocator(c);
			c.add(pld, l);
			
			mapLinks.put(hash, gc);
			mapLabels.put(hash, pld);
		}
		else
		{
			pld = mapLabels.get(hash);
			pld.setText(pld.getText() + " + " + label);
		}
	}
	
	public void createLink(GraphNode g1, GraphNode g2, String label)
	{
		GraphConnection		gc;
		Locator				l;
		Connection			c;
		String				hash;
		Label				pld;
		
		hash = g1.hashCode() + ":" + g2.hashCode();
		if(mapLinks.get(hash) == null)
		{
			gc = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, g1, g2);
			gc.changeLineColor(ColorConstants.black);
			
			c = gc.getConnectionFigure();
			
			pld = new PolylineLabelDecoration();
			pld.setText(label);
			pld.setFont(gc.getFont());
			l = new PolylineLabelLocator(c);
			c.add(pld, l);
			
			mapLinks.put(hash, gc);
			mapLabels.put(hash, pld);
		}
		else
		{
			pld = mapLabels.get(hash);
			pld.setText(pld.getText() + " + " + label);
		}
	}

	@SuppressWarnings("unchecked")
	public void emptyGraph()
	{
		List<GraphNode>	ll = graph.getNodes();
		Iterator<GraphNode> it = ll.iterator();
		while(it.hasNext())
		{
			it.next().dispose();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<GraphNode> getGraphNodes()
	{	
		return (List<GraphNode>)this.graph.getNodes();
	}
	
	public void enableMouseDoubleClickListenerOnGraph()
	{
		this.graph.addMouseListener(new nodeDoubleClickListener());
		
	}
	
	public void zoom(boolean b)
	{
		
	}
	
	private class nodeDoubleClickListener implements MouseListener
	{
		
		@SuppressWarnings("unchecked")
		@Override
		public void mouseDoubleClick(MouseEvent e) 
		{
			
			Iterator<GraphNode> it = graph.getSelection().iterator();
			while (it.hasNext())
			{
				GraphNode actual = it.next();		
				
				Display.getDefault().asyncExec(
						  new EventTypeChoosingMenu(actual));
							
			}
			
			
		}
		
		private class EventTypeChoosingMenu implements Runnable
		{
			GraphNode actual;
			
			public EventTypeChoosingMenu(GraphNode node)
			{
				this.actual = node;
			}
			public void run()
			{
						
				Label tooltip =  (Label)this.actual.getTooltip();
				String replicaText = this.actual.getText() + "\n" + tooltip.getText();
				final Shell shell = new Shell(Display.getDefault());			    
			    shell.setText("Event type selection");
			    shell.setToolTipText("Select the type of events you want to include on the visualization");			    
				shell.setLayout(new FillLayout());
								
				Graph replica = new Graph(shell,SWT.NONE);
				GraphNode n = new GraphNode(replica, SWT.NONE, replicaText);
				n.setLocation(5, 5);
				n.setBackgroundColor(this.actual.getBackgroundColor());
				n.setForegroundColor(this.actual.getForegroundColor());
				
				shell.setSize(n.getSize().width + 50, n.getSize().height + 50);
							    
			    shell.open();
			}
		}
		private void showMessage(String message)
		{			
			MessageDialog.openInformation(null,
					"Sample View", message);
		}
		
		@Override
		public void mouseDown(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseUp(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

	}
	
}
