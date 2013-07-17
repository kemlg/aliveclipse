/*
 * Copyright (c) 2003, the JUNG Project and the Regents of the University of
 * California All rights reserved.
 * 
 * This software is open-source under the BSD license; see either "license.txt"
 * or http://jung.sourceforge.net/license.txt for a description.
 */
package net.sf.ictalive.monitortool.JungVisualization;


import java.awt.BasicStroke;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

import java.util.List;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

import org.apache.commons.collections15.Factory;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.FRLayout;
import edu.uci.ics.jung.algorithms.layout.ISOMLayout;
import edu.uci.ics.jung.algorithms.layout.KKLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.algorithms.layout.SpringLayout;
import edu.uci.ics.jung.algorithms.layout.SpringLayout2;
import edu.uci.ics.jung.algorithms.layout.util.Relaxer;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.CrossoverScalingControl;
import edu.uci.ics.jung.visualization.control.DefaultModalGraphMouse;
import edu.uci.ics.jung.visualization.control.ScalingControl;
import edu.uci.ics.jung.visualization.decorators.PickableVertexPaintTransformer;
import edu.uci.ics.jung.visualization.layout.LayoutTransition;
import edu.uci.ics.jung.visualization.renderers.DefaultEdgeLabelRenderer;
import edu.uci.ics.jung.visualization.renderers.DefaultVertexLabelRenderer;
import edu.uci.ics.jung.visualization.renderers.GradientVertexRenderer;
import edu.uci.ics.jung.visualization.renderers.VertexLabelAsShapeRenderer;
import edu.uci.ics.jung.visualization.util.Animator;
import edu.uci.ics.jung.graph.util.EdgeType;

import org.apache.commons.collections15.Transformer;
import java.awt.Paint;
import java.awt.Color;

import java.util.Vector;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.border.TitledBorder;
import javax.swing.JLabel;

import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import org.apache.commons.collections15.functors.ChainedTransformer;
import org.apache.commons.collections15.functors.ConstantTransformer;

import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;




/** 
 * @author Ignasi Gómez-Sebastià (ignasi.gomez@lsi.upc.edu)
 */
@SuppressWarnings("serial")
public class JungViewBuilder extends JApplet {
    protected static Graph<? extends Object, ? extends Object> current_graph = null;    
    protected static String eventID = "";
    protected static JFrame jf;
    protected static JPanel jp;
    protected static JComboBox jcb;    
    protected static Vector<String> argumentVector = new Vector<String>();        
    

    protected static int QUERY_ACCEPTED_AT_LEAST_ONE = 0;
    protected static int QUERY_ACCEPTED_ALL = 1;
    protected static int QUERY_WHICH_ACCEPTED = 2;
    protected static int QUERY_WHICH_REJECTED = 3;

    protected static JComboBox questionChooser;
    protected static JComboBox argumentChooser;

    public void initView(Graph<? extends Object, ? extends Object> _current_graph, String _eventID)
    {
    	current_graph = _current_graph;
    	this.eventID = _eventID;
    }            
	
       

    /**
	 * 
	 * @author igomez
	 */	        
        
	private static final class LayoutChooser implements ActionListener
    {
        private final JComboBox jcb;
        protected final VisualizationViewer<String,String> vv;

        private LayoutChooser(JComboBox jcb, VisualizationViewer<String,String> vv)
        {
            super();
            this.jcb = jcb;
            this.vv = vv;
        }

        public void actionPerformed(ActionEvent arg0)
        {            
            Object[] constructorArgs =
                { current_graph};

            Class<? extends Layout<Integer,Number>> layoutC = 
                (Class<? extends Layout<Integer,Number>>) jcb.getSelectedItem();
//            Class lay = layoutC;          
            try
            {
                Constructor<? extends Layout<Integer, Number>> constructor = layoutC
                        .getConstructor(new Class[] {Graph.class});
                Object o = constructor.newInstance(constructorArgs);
                Layout<String,String> l = (Layout<String,String>) o;
                l.setInitializer(vv.getGraphLayout());
                l.setSize(vv.getSize());
                
				LayoutTransition<String,String> lt =
					new LayoutTransition<String,String>(vv, vv.getGraphLayout(), l);
				Animator animator = new Animator(lt);
				animator.start();
				vv.getRenderContext().getMultiLayerTransformer().setToIdentity();
				vv.repaint();
                
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
        


    private static JPanel getGraphPanel()
    {

        
    	if (current_graph == null)
    	{
    		current_graph = init_graphs();
    	}
    	                
        
    	Factory<Graph<String,String>> graphFactory =
    		new Factory<Graph<String,String>>() {
    		public Graph<String,String> create() {
    			return new SparseMultigraph<String,String>();
    		}
    	};
    	
        Graph<? extends Object, ? extends Object> g = current_graph;     // initial graph
        
        Dimension preferredSize = new Dimension(1600,800);
        
        final VisualizationViewer<String,String> vv = 
            new VisualizationViewer<String,String>(new FRLayout(g),preferredSize);
        
        VertexLabelAsShapeRenderer<String,String> vlasr = new VertexLabelAsShapeRenderer<String,String>(vv.getRenderContext());

        // customize the render context
        vv.getRenderContext().setVertexLabelTransformer(
        		// this chains together Transformers so that the html tags
        		// are prepended to the toString method output
        		new ChainedTransformer<String,String>(new Transformer[]{
        		new ToStringLabeller<String>(),
        		new Transformer<String,String>() {
					public String transform(String input) {
						return input;
					}}}));
        
        vv.getRenderContext().setEdgeLabelTransformer(new ChainedTransformer<String,String>(new Transformer[]{
        		new ToStringLabeller<String>(),
        		new Transformer<String,String>() {
					public String transform(String input) {
						return "<html><b><H4>" + input + "</H4></b></html>";
					}}}));
        vv.getRenderContext().setVertexShapeTransformer(vlasr);
        vv.getRenderContext().setVertexLabelRenderer(new DefaultVertexLabelRenderer(Color.red));
        vv.getRenderContext().setEdgeLabelRenderer(new DefaultEdgeLabelRenderer(Color.white));
        vv.getRenderContext().setEdgeDrawPaintTransformer(new ConstantTransformer(Color.gray));
        vv.getRenderContext().setEdgeStrokeTransformer(new ConstantTransformer(new BasicStroke(2.5f)));

        // customize the renderer      
        Float h = new Float(56);
        Float s = new Float(100);
        Float b = new Float(59);        
        vv.getRenderer().setVertexRenderer(new GradientVertexRenderer<String,String>(Color.getHSBColor(h, s, b), Color.white, true));
        vv.getRenderer().setVertexLabelRenderer(vlasr);

        vv.setBackground(Color.white);

        // add a listener for ToolTips
        vv.setVertexToolTipTransformer(new ToStringLabeller<String>());        
        
        final DefaultModalGraphMouse<Integer,Number> graphMouse = new DefaultModalGraphMouse<Integer,Number>();
        vv.setGraphMouse(graphMouse);
        
        final ScalingControl scaler = new CrossoverScalingControl();

        JButton plus = new JButton("+");
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                scaler.scale(vv, 1.1f, vv.getCenter());
            }
        });
        JButton minus = new JButton("-");
        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                scaler.scale(vv, 1/1.1f, vv.getCenter());
            }
        });
        JButton reset = new JButton("reset");
        reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Layout<String,String> layout = vv.getGraphLayout();
				layout.initialize();
				Relaxer relaxer = vv.getModel().getRelaxer();
				if(relaxer != null) {
//				if(layout instanceof IterativeContext) {
					relaxer.stop();
					relaxer.prerelax();
					relaxer.relax();
				}
			}});
        
        JComboBox modeBox = graphMouse.getModeComboBox();
        modeBox.addItemListener(((DefaultModalGraphMouse<String,String>)vv.getGraphMouse()).getModeListener());

        JPanel jp = new JPanel();
        jp.setBackground(Color.WHITE);
        jp.setLayout(new BorderLayout());
        jp.add(vv, BorderLayout.CENTER);
        Class[] combos = getCombos();
        jcb = new JComboBox(combos);        
        // use a renderer to shorten the layout name presentation
        jcb.setRenderer(new DefaultListCellRenderer() {
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                String valueString = value.toString();
                valueString = valueString.substring(valueString.lastIndexOf('.')+1);
                return super.getListCellRendererComponent(list, valueString, index, isSelected,
                        cellHasFocus);
            }
        });
        jcb.addActionListener(new LayoutChooser(jcb, vv));
        jcb.setSelectedItem(CircleLayout.class);                                
        
        JPanel control_panel = new JPanel(new GridLayout(1,1));
        JPanel topControls = new JPanel();
        topControls.setBorder(new TitledBorder("Framework Layout Controls") );        
        control_panel.add(topControls);
        jp.add(control_panel, BorderLayout.NORTH);
        
        
        
        JLabel jcb_label = new JLabel("Layout algorithms");
        topControls.add(jcb_label);        
        topControls.add(jcb);        
        topControls.add(plus);
        topControls.add(minus);
        topControls.add(modeBox);
        topControls.add(reset);
     
        return jp;
    }   

    public void start()
    {
        this.getContentPane().add(getGraphPanel());
    }

    /**
     * @return
     */
    @SuppressWarnings("unchecked")
    private static Class<? extends Layout>[] getCombos()
    {
        List<Class<? extends Layout>> layouts = new ArrayList<Class<? extends Layout>>();
        layouts.add(KKLayout.class);
        layouts.add(FRLayout.class);
        layouts.add(CircleLayout.class);
        layouts.add(SpringLayout.class);
        layouts.add(SpringLayout2.class);
        layouts.add(ISOMLayout.class);
        return layouts.toArray(new Class[0]);
    }

    public static void main(String[] args)
    {
        jp = getGraphPanel();
        
        jf = new JFrame();
        jf.setTitle("Visualizing event '" + eventID + "'");
        jf.getContentPane().add(jp);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);             

    }
    
    public JPanel getGraphJPanel()
    {              
    	jp = getGraphPanel();
    	
        return jp;

    }
    
    //Builds a sample graph
    private  static Graph<? extends Object,? extends Object> init_graphs()
    {
        Graph<String, String> g;        
        
        // Create a dummy graph 1
        g = new SparseMultigraph<String, String>();
        // Add some vertices
        g.addVertex("<html><b>IGNASI!!</b><hr>7 Caballos que vienen de bonanzarl! Jorl, finstro pecadol, me cago en tus muelas cobardel!!!<HR><center>Vertex<p> A");
        g.addVertex("<html><b>IGNASI!!</b><hr>7 Caballos que vienen de bonanzarl! Jorl, finstro pecadol, me cago en tus muelas cobardel!!!<HR><center>Vertex<p> B");
        g.addVertex("<html><b>IGNASI!!</b><hr>7 Caballos que vienen de bonanzarl! Jorl, finstro pecadol, me cago en tus muelas cobardel!!!<HR><center>Vertex<p> C");
        g.addEdge("TROLOLOLOROLORLO", "<html><b>IGNASI!!</b><hr>7 Caballos que vienen de bonanzarl! Jorl, finstro pecadol, me cago en tus muelas cobardel!!!<HR><center>Vertex<p> A", "<html><b>IGNASI!!</b><hr>7 Caballos que vienen de bonanzarl! Jorl, finstro pecadol, me cago en tus muelas cobardel!!!<HR><center>Vertex<p> B",EdgeType.DIRECTED);
        g.addEdge("LOROLOROLORO", "<html><b>IGNASI!!</b><hr>7 Caballos que vienen de bonanzarl! Jorl, finstro pecadol, me cago en tus muelas cobardel!!!<HR><center>Vertex<p> B", "<html><b>IGNASI!!</b><hr>7 Caballos que vienen de bonanzarl! Jorl, finstro pecadol, me cago en tus muelas cobardel!!!<HR><center>Vertex<p> C",EdgeType.DIRECTED);
        g.addEdge("JIJIJI,JAJAJA", "<html><b>IGNASI!!</b><hr>7 Caballos que vienen de bonanzarl! Jorl, finstro pecadol, me cago en tus muelas cobardel!!!<HR><center>Vertex<p> C", "<html><b>IGNASI!!</b><hr>7 Caballos que vienen de bonanzarl! Jorl, finstro pecadol, me cago en tus muelas cobardel!!!<HR><center>Vertex<p> A",EdgeType.DIRECTED);                                 
        
        
        return g;
    }
          
    
}
