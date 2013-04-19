package monitortool.views;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;

import net.sf.ictalive.coordination.tasks.ActionGrounding;
import net.sf.ictalive.coordination.tasks.ActionGroundingList;
import net.sf.ictalive.coordination.tasks.PlansCollection;
import net.sf.ictalive.coordination.tasks.TasksPackage;
import net.sf.ictalive.metamodel.utils.Serialiser;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

public class StandaloneMXGraphView
{
	mxGraph graph;
	mxGraphComponent graphComponent;
	
	public StandaloneMXGraphView()
	{
		graph = new mxGraph();

		graph.getModel().beginUpdate();
		graph.getModel().endUpdate();

		graphComponent = new mxGraphComponent(graph);
		graphComponent.setEnabled(true);
		graphComponent.setEventsEnabled(true);
		graphComponent.setFocusable(true);
	}
	
	public JRootPane createPane()
	{
		JRootPane root;
		
		root = new JRootPane();
		Container contentPane = root.getContentPane();
		JScrollPane scrollPane = new JScrollPane(graphComponent);
		contentPane.setLayout(new BorderLayout());
		contentPane.add(scrollPane);
		
		return root;
	}

	public mxGraph getGraph()
	{
		return graph;
	}
	
	public void generateGraph() throws IOException
	{
		Serialiser<PlansCollection>		s;
		PlansCollection					ac;
		ActionGrounding					p;
		ActionGroundingList				rest;
		
		s = new Serialiser<PlansCollection>(TasksPackage.class);
		ac = s.deserialise(new File("/Users/sergio/Documents/Alive/Implementation/MonitorTool/src/tmt/ContentAdaptionScenePlans/ContentAdaptionScenePlan_39.plans"));
		p = ac.getPlans().get(0).getHasAtomicProcessGroundingList().getFirst();
		
		Object parent1 = graph.getDefaultParent();
		graph.getModel().beginUpdate();
		
		try
		{
			Object v1 = graph.insertVertex(parent1, null, p.getOwlsProcess().getId(), 60, 60, 80,
					30);
			
			rest = ac.getPlans().get(0).getHasAtomicProcessGroundingList().getRest();
			while(rest != null)
			{
				p = rest.getFirst();
				
				Object v2 = graph.insertVertex(parent1, null, p.getOwlsProcess().getId(), 60, 60, 80,
						30);
				graph.insertEdge(parent1, null, "Edge", v1, v2);
				v1 = v2;
				
				rest = rest.getRest();
			}
		}
		finally
		{
			graph.getModel().endUpdate();
		}
	}
	
	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws InterruptedException, IOException
	{
		JFrame							jf;
		StandaloneMXGraphView				sgv;
		Serialiser<PlansCollection>		s;
		PlansCollection					ac;
		ActionGrounding					p;
		ActionGroundingList				rest;
		
		s = new Serialiser<PlansCollection>(TasksPackage.class);
		ac = s.deserialise(new File("/Users/sergio/Documents/Alive/Implementation/MonitorTool/src/tmt/ContentAdaptionScenePlans/ContentAdaptionScenePlan_39.plans"));
		p = ac.getPlans().get(0).getHasAtomicProcessGroundingList().getFirst();
		
		sgv = new StandaloneMXGraphView();
		Object parent1 = sgv.getGraph().getDefaultParent();
		sgv.getGraph().getModel().beginUpdate();
		
		try
		{
			Object v1 = sgv.getGraph().insertVertex(parent1, null, p.getOwlsProcess().getName(), 60, 60, 80,
					30);
			
			rest = ac.getPlans().get(0).getHasAtomicProcessGroundingList().getRest();
			while(rest != null)
			{
				p = rest.getFirst();
				
				Object v2 = sgv.getGraph().insertVertex(parent1, null, p.getOwlsProcess().getName(), 60, 60, 80,
						30);
				sgv.getGraph().insertEdge(parent1, null, "Edge", v1, v2);
				v1 = v2;
				
				rest = rest.getRest();
			}
		}
		finally
		{
			sgv.getGraph().getModel().endUpdate();
		}
		
		jf = new JFrame("GraphView");
		jf.getContentPane().add(sgv.getGraphComponent(), BorderLayout.CENTER);
		jf.pack();
		jf.setVisible(true);
	}

	private Component getGraphComponent()
	{
		return graphComponent;
	}
	
	public final static String demo = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + 
			"<actions:ActionsCollection xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:actions=\"http://alive/coordinationLevel/actions\" xmlns:pr=\"http://alive/owls/process\">\n" + 
			"  <actions xsi:type=\"actions:AtomicAction\" name=\"getMovieSuggestion\" hasInput=\"//@parameters.2 //@parameters.3 //@parameters.14 //@parameters.6\" hasOutput=\"//@parameters.4\">\n" + 
			"    <performedByRole>Content_Provider</performedByRole>\n" + 
			"  </actions>\n" + 
			"  <actions xsi:type=\"actions:AtomicAction\" name=\"getTime\" hasOutput=\"//@parameters.5\">\n" + 
			"    <performedByRole>Interface</performedByRole>\n" + 
			"  </actions>\n" + 
			"  <actions xsi:type=\"actions:AtomicAction\" name=\"getUserLocation\" hasOutput=\"//@parameters.7\">\n" + 
			"    <performedByRole>Interface</performedByRole>\n" + 
			"  </actions>\n" + 
			"  <actions xsi:type=\"actions:AtomicAction\" name=\"getWeatherForecast\" hasInput=\"//@parameters.2\" hasOutput=\"//@parameters.9\">\n" + 
			"    <performedByRole>Environmental_Context_Manager</performedByRole>\n" + 
			"  </actions>\n" + 
			"  <actions xsi:type=\"actions:AtomicAction\" name=\"getLegalAdultAge\" hasInput=\"//@parameters.2\" hasOutput=\"//@parameters.10\">\n" + 
			"    <performedByRole>Legal_Info_Manager</performedByRole>\n" + 
			"  </actions>\n" + 
			"  <actions xsi:type=\"actions:AtomicAction\" name=\"getRestaurantSuggestion\" hasInput=\"//@parameters.2 //@parameters.13 //@parameters.14 //@parameters.12 //@parameters.0\" hasOutput=\"//@parameters.11\">\n" + 
			"    <performedByRole>Content_Provider</performedByRole>\n" + 
			"  </actions>\n" + 
			"  <actions xsi:type=\"actions:AtomicAction\" name=\"getUserCinemaPreferences\" hasInput=\"//@parameters.8\" hasOutput=\"//@parameters.18\">\n" + 
			"    <performedByRole>User_Modeler</performedByRole>\n" + 
			"  </actions>\n" + 
			"  <actions xsi:type=\"actions:AtomicAction\" name=\"getUserRestaurantPreferences\" hasInput=\"//@parameters.8\" hasOutput=\"//@parameters.16\">\n" + 
			"    <performedByRole>User_Modeler</performedByRole>\n" + 
			"  </actions>\n" + 
			"  <actions xsi:type=\"actions:AtomicAction\" name=\"getUserRequirements\" hasInput=\"//@parameters.8\" hasOutput=\"//@parameters.17\">\n" + 
			"    <performedByRole>User_Modeler</performedByRole>\n" + 
			"  </actions>\n" + 
			"  <actions xsi:type=\"actions:AtomicAction\" name=\"getUserAge\" hasInput=\"//@parameters.8\" hasOutput=\"//@parameters.19\">\n" + 
			"    <performedByRole>User_Modeler</performedByRole>\n" + 
			"  </actions>\n" + 
			"  <actions xsi:type=\"actions:CompositeAction\" name=\"gatherUserPersonalData\" hasInput=\"//@parameters.8\">\n" + 
			"    <composedOf xsi:type=\"pr:AnyOrder\">\n" + 
			"      <components>\n" + 
			"        <first xsi:type=\"pr:Perform\" process=\"//@actions.9\" name=\"getUserAge\"/>\n" + 
			"      </components>\n" + 
			"    </composedOf>\n" + 
			"  </actions>\n" + 
			"  <actions xsi:type=\"actions:CompositeAction\" name=\"gatherUserContext\">\n" + 
			"    <composedOf xsi:type=\"pr:AnyOrder\">\n" + 
			"      <components>\n" + 
			"        <first xsi:type=\"pr:Perform\" process=\"//@actions.2\" name=\"getUserLocation\"/>\n" + 
			"        <rest>\n" + 
			"          <first xsi:type=\"pr:Perform\" process=\"//@actions.1\" name=\"getTime\"/>\n" + 
			"        </rest>\n" + 
			"      </components>\n" + 
			"    </composedOf>\n" + 
			"  </actions>\n" + 
			"  <actions xsi:type=\"actions:CompositeAction\" name=\"gatherExternalInfo\" hasInput=\"//@parameters.2\">\n" + 
			"    <composedOf xsi:type=\"pr:AnyOrder\">\n" + 
			"      <components>\n" + 
			"        <first xsi:type=\"pr:Perform\" process=\"//@actions.3\" name=\"\"/>\n" + 
			"        <rest>\n" + 
			"          <first xsi:type=\"pr:Perform\" process=\"//@actions.4\" name=\"\"/>\n" + 
			"        </rest>\n" + 
			"      </components>\n" + 
			"    </composedOf>\n" + 
			"  </actions>\n" + 
			"  <actions xsi:type=\"actions:CompositeAction\" name=\"personaliseContentToBeProvided\">\n" + 
			"    <composedOf xsi:type=\"pr:AnyOrder\">\n" + 
			"      <components>\n" + 
			"        <first xsi:type=\"pr:Perform\" process=\"//@actions.14\" name=\"\"/>\n" + 
			"        <rest>\n" + 
			"          <first xsi:type=\"pr:Perform\" process=\"//@actions.15\" name=\"\"/>\n" + 
			"        </rest>\n" + 
			"      </components>\n" + 
			"    </composedOf>\n" + 
			"  </actions>\n" + 
			"  <actions xsi:type=\"actions:AtomicAction\" name=\"getIsUserUnderage\">\n" + 
			"    <performedByRole>Content_Adaptor</performedByRole>\n" + 
			"  </actions>\n" + 
			"  <actions xsi:type=\"actions:AtomicAction\" name=\"getIsMealTime\">\n" + 
			"    <performedByRole>Content_Adaptor</performedByRole>\n" + 
			"  </actions>\n" + 
			"  <actions xsi:type=\"actions:CompositeAction\" name=\"gatherUserRequirementsAndPreferences\">\n" + 
			"    <composedOf xsi:type=\"pr:AnyOrder\">\n" + 
			"      <components>\n" + 
			"        <first xsi:type=\"pr:Perform\" process=\"//@actions.8\" name=\"\"/>\n" + 
			"        <rest>\n" + 
			"          <first xsi:type=\"pr:Perform\" process=\"//@actions.6\" name=\"\"/>\n" + 
			"          <rest>\n" + 
			"            <first xsi:type=\"pr:IfThenElse\">\n" + 
			"              <ifCondition name=\"(lunchtime)\"/>\n" + 
			"              <then xsi:type=\"pr:Perform\" process=\"//@actions.7\" name=\"\"/>\n" + 
			"            </first>\n" + 
			"          </rest>\n" + 
			"        </rest>\n" + 
			"      </components>\n" + 
			"    </composedOf>\n" + 
			"  </actions>\n" + 
			"  <actions xsi:type=\"actions:CompositeAction\" name=\"collectContent\" hasInput=\"//@parameters.2 //@parameters.3 //@parameters.14 //@parameters.6 //@parameters.13 //@parameters.12 //@parameters.0\" hasOutput=\"//@parameters.4\">\n" + 
			"    <composedOf xsi:type=\"pr:AnyOrder\">\n" + 
			"      <components>\n" + 
			"        <first xsi:type=\"pr:Perform\" process=\"//@actions.0\" name=\"\"/>\n" + 
			"        <rest>\n" + 
			"          <first xsi:type=\"pr:IfThenElse\">\n" + 
			"            <ifCondition name=\"(lunchtime)\"/>\n" + 
			"            <then xsi:type=\"pr:Perform\" process=\"//@actions.5\" name=\"\"/>\n" + 
			"          </first>\n" + 
			"        </rest>\n" + 
			"      </components>\n" + 
			"    </composedOf>\n" + 
			"  </actions>\n" + 
			"  <actions xsi:type=\"actions:CompositeAction\" name=\"composeAndProvideContent\">\n" + 
			"    <composedOf xsi:type=\"pr:IfThenElse\">\n" + 
			"      <ifCondition name=\"(lunchtime)\"/>\n" + 
			"      <then xsi:type=\"pr:AnyOrder\">\n" + 
			"        <components>\n" + 
			"          <first xsi:type=\"pr:Perform\" process=\"//@actions.19\" name=\"\"/>\n" + 
			"          <rest>\n" + 
			"            <first xsi:type=\"pr:Perform\" process=\"//@actions.20\" name=\"\"/>\n" + 
			"          </rest>\n" + 
			"        </components>\n" + 
			"      </then>\n" + 
			"      <else xsi:type=\"pr:Perform\" process=\"//@actions.20\" name=\"\"/>\n" + 
			"    </composedOf>\n" + 
			"  </actions>\n" + 
			"  <actions xsi:type=\"actions:AtomicAction\" name=\"composeAndProvideCinema\">\n" + 
			"    <performedByRole>Interaction_Task_Manager</performedByRole>\n" + 
			"  </actions>\n" + 
			"  <actions xsi:type=\"actions:AtomicAction\" name=\"composeAndProvideRestaurant\">\n" + 
			"    <performedByRole>Interaction_Task_Manager</performedByRole>\n" + 
			"  </actions>\n" + 
			"  <parameters xsi:type=\"pr:Input\" name=\"mealType\"/>\n" + 
			"  <parameters xsi:type=\"pr:Input\" name=\"PremierDate\">\n" + 
			"    <parameterType>hasTime</parameterType>\n" + 
			"  </parameters>\n" + 
			"  <parameters xsi:type=\"pr:Input\" name=\"userlocation\">\n" + 
			"    <parameterType>hasDistrict</parameterType>\n" + 
			"  </parameters>\n" + 
			"  <parameters xsi:type=\"pr:Input\" name=\"UserCinemaPreferences\">\n" + 
			"    <parameterType>hasPreferences</parameterType>\n" + 
			"  </parameters>\n" + 
			"  <parameters xsi:type=\"pr:Output\" name=\"moviecinemacontent\">\n" + 
			"    <parameterType>MovieCinema</parameterType>\n" + 
			"  </parameters>\n" + 
			"  <parameters xsi:type=\"pr:Output\" name=\"currentTime\">\n" + 
			"    <parameterType>hasTime</parameterType>\n" + 
			"  </parameters>\n" + 
			"  <parameters xsi:type=\"pr:Input\" name=\"currentTime\"/>\n" + 
			"  <parameters xsi:type=\"pr:Output\" name=\"districtlocation\">\n" + 
			"    <parameterType>hasDistrict</parameterType>\n" + 
			"  </parameters>\n" + 
			"  <parameters xsi:type=\"pr:Input\" name=\"userName\">\n" + 
			"    <parameterType>hasUserName</parameterType>\n" + 
			"  </parameters>\n" + 
			"  <parameters xsi:type=\"pr:Output\" name=\"weatherForecast\">\n" + 
			"    <parameterType>hasWeatherDescription</parameterType>\n" + 
			"  </parameters>\n" + 
			"  <parameters xsi:type=\"pr:Output\" name=\"adultAge\">\n" + 
			"    <parameterType>hasAdultAge</parameterType>\n" + 
			"  </parameters>\n" + 
			"  <parameters xsi:type=\"pr:Output\" name=\"restaurantqueryresult\">\n" + 
			"    <parameterType>Food_and_drink</parameterType>\n" + 
			"  </parameters>\n" + 
			"  <parameters xsi:type=\"pr:Input\" name=\"isunderage\">\n" + 
			"    <parameterType>hasAdultAge</parameterType>\n" + 
			"  </parameters>\n" + 
			"  <parameters xsi:type=\"pr:Input\" name=\"userRestaurantPreferences\">\n" + 
			"    <parameterType>hasPreferences</parameterType>\n" + 
			"  </parameters>\n" + 
			"  <parameters xsi:type=\"pr:Input\" name=\"userRequirements\">\n" + 
			"    <parameterType>hasRequirements</parameterType>\n" + 
			"  </parameters>\n" + 
			"  <parameters xsi:type=\"pr:Input\" name=\"MealTimePreferences\">\n" + 
			"    <parameterType>hasMealTimePreferences</parameterType>\n" + 
			"  </parameters>\n" + 
			"  <parameters xsi:type=\"pr:Output\" name=\"userRestaurantPreferences\">\n" + 
			"    <parameterType>hasPreferences</parameterType>\n" + 
			"  </parameters>\n" + 
			"  <parameters xsi:type=\"pr:Output\" name=\"userRequirements\">\n" + 
			"    <parameterType>hasRequirements</parameterType>\n" + 
			"  </parameters>\n" + 
			"  <parameters xsi:type=\"pr:Output\" name=\"userCinemaPreferences\">\n" + 
			"    <parameterType>hasPreferences</parameterType>\n" + 
			"  </parameters>\n" + 
			"  <parameters xsi:type=\"pr:Output\" name=\"userAge\">\n" + 
			"    <parameterType>hasAge</parameterType>\n" + 
			"  </parameters>\n" + 
			"</actions:ActionsCollection>\n" + 
			"";
}
