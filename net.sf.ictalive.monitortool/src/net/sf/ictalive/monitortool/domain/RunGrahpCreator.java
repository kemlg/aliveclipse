package net.sf.ictalive.monitortool.domain;

import java.io.IOException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;
import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.zest.core.widgets.GraphNode;

import java.util.Random;

import net.sf.ictalive.coordination.tasks.ActionGrounding;
import net.sf.ictalive.coordination.tasks.ActionGroundingList;
import net.sf.ictalive.coordination.tasks.InputMessageMap;
import net.sf.ictalive.monitortool.views.StandaloneGraphView;
import net.sf.ictalive.operetta.OM.Atom;
import net.sf.ictalive.operetta.OM.Objective;
import net.sf.ictalive.operetta.OM.PartialStateDescription;
import net.sf.ictalive.operetta.OM.Role;
import net.sf.ictalive.owls.process.Input;
import net.sf.ictalive.owls.process.Output;
import net.sf.ictalive.runtime.action.Action;
import net.sf.ictalive.runtime.action.AgentReplan;
import net.sf.ictalive.runtime.action.CoordinationAction;
import net.sf.ictalive.runtime.action.MatchmakerQuery;
import net.sf.ictalive.runtime.action.MatchmakerResponse;
import net.sf.ictalive.runtime.action.MatchmakerResult;
import net.sf.ictalive.runtime.action.PlanningActions;
import net.sf.ictalive.runtime.action.ServiceInvocation;
import net.sf.ictalive.runtime.enactment.Enactment;
import net.sf.ictalive.runtime.enactment.PlanEnactment;
import net.sf.ictalive.runtime.event.Event;
import net.sf.ictalive.runtime.fact.Content;
import net.sf.ictalive.runtime.fact.FailureAct;
import net.sf.ictalive.runtime.fact.NormInstanceAct;
import net.sf.ictalive.runtime.fact.impl.DisasterImpl;
import net.sf.ictalive.runtime.fact.impl.LandmarkFulfilmentImpl;
import net.sf.ictalive.runtime.fact.impl.SendActImpl;
import net.sf.ictalive.runtime.fact.impl.StartedActImpl;

public class RunGrahpCreator implements IGraphCreator 
{
	
	boolean menu_displayed = false;
	boolean listener_set = false;
	
	@Override
	public void generate(StandaloneGraphView standaloneGraphView) 
	{	
		if (!menu_displayed)
		{
			Display.getDefault().syncExec(
					  new EventTypeChoosingMenu());
			menu_displayed = true;
		}
		
		if (!listener_set)
		{
			standaloneGraphView.enableMouseDoubleClickListenerOnGraph();
			listener_set = true;
		}
		
		
		
		
		

	}
	
	boolean timeFilter;
	Date initialStamp, finalStamp;
	int y_orgCoordinate = 30;
	int y_coordCoordinate = 280;
	int y_serviceCoordinate = 530;
	int last_y = 0;
	int y_increment = 130;
	int x_increment_big = 80;
	int x_increment_small = 155;
	int x_last= 5;
	Vector<GraphNode> eventSet = new Vector<GraphNode>();
	Vector<String> violatedNorms = new Vector<String>();
	
	HashMap<String,Integer> TypeModelMap = initTypeModelMap();
	HashMap<String,Boolean> TypeAllowedMap = initTypeAllowedMap();
	
	boolean init_done = false;

	@Override
	public void update(StandaloneGraphView standaloneGraphView, Event event) 
	{
		String		as;
		GraphNode	gn, ge;
		
		String eventCode = "";
		String eventTip = "";
		
		if (!timeStampMatch(event))
		{
			return;
		}
		
		generateModelBounds(standaloneGraphView);							
		
		//System.out.println("----------->" + event.getContent().getFact().getClass().getSimpleName());
		
		//showMessage("Please, select the name of the asserters");
		//String asserters = chooseAsserters();
		
		int colour = -1;
		int[] coordinates = new int[2];
		String[] eventText = new String[2];
		
		//System.out.println("-------->" + event.getContent().getFact().getClass().getSimpleName() + "|" + event.getContent().getFact().getDueTo().getClass().getSimpleName());
		
		/*
			if (eventMatches(event, "SendActImpl",""))
			{
				
				coordinates = generateCoordRandom();
				
				eventCode = generateEventNameRandom(coordinates) + "\n";
				eventCode = eventCode + "On: " + event.getTimestamp().toString();				
				eventTip = "From the opening line of his breakthrough cyberpunk novel Snow Crash\n, Neal Stephenson plunges the reader into a not-too-distant future.\n It is a world where the Mafia controls pizza delivery,\n the United States exists as a patchwork\n of corporate-franchise city-states, and the Internet--incarnate\n as the Metaverse--looks something like last year's hype\n would lead you to believe it should. Enter Hiro\n Protagonist--hacker, samurai swordsman,\n and pizza-delivery driver. When his best friend fries\n his brain on a new designer drug called Snow\n Crash and his beautiful, brainy ex-girlfriend\n asks for his help, what's a guy with\n a name like that to do? He rushes to the rescue.\n A breakneck-paced 21st-century novel,\n Snow Crash interweaves everything from Sumerian myth\n to visions of a postmodern civilization on the\n brink of collapse. Faster than the speed\n of television and a whole lot more fun,\n Snow Crash is the portrayal of a future that is bizarre\n enough to be plausible.";
				
				
			}
		*/	
			
			if (eventMatches(event, "NormInstanceViolatedImpl",""))
			{
				
				coordinates = generateCoord(event.getContent().getFact().getClass().getSimpleName());
				eventText = generateEventTextNormInstanceAct(event);	
				eventCode = eventText[0];
				eventTip = eventText[1];		
				colour = SWT.COLOR_RED;		
				NormInstanceAct content = (NormInstanceAct)event.getContent().getFact();
				violatedNorms.add(content.getNormInstance().getNorm().getNormID());
				
			}
			
			
			if (eventMatches(event, "NormInstanceExpiredImpl",""))
			{
				
				coordinates = generateCoord(event.getContent().getFact().getClass().getSimpleName());
				eventText = generateEventTextNormInstanceAct(event);	
				eventCode = eventText[0];
				eventTip = eventText[1];		
				
				NormInstanceAct content = (NormInstanceAct)event.getContent().getFact();
				String normId = content.getNormInstance().getNorm().getNormID();
				if (violatedNorms.contains(normId))		
				{
					colour = SWT.COLOR_GRAY;
				}
				else
				{
					colour = SWT.COLOR_GREEN;
				}
				
				
			}
			
			
			if (eventMatches(event, "NormInstanceActivatedImpl",""))
			{
				
				coordinates = generateCoord(event.getContent().getFact().getClass().getSimpleName());
				eventText = generateEventTextNormInstanceAct(event);	
				eventCode = eventText[0];
				eventTip = eventText[1];		
				colour = SWT.COLOR_YELLOW;
			}
			
			
			if (eventMatches(event, "LandmarkFulfilmentImpl",""))
			{
				
					
					coordinates = generateCoord(event.getContent().getFact().getClass().getSimpleName());
					eventText = generateEventTextLandMarkFulfillment(event);	
					eventCode = eventText[0];
					eventTip = eventText[1];	
					LandmarkFulfilmentImpl content = (LandmarkFulfilmentImpl)event.getContent().getFact();
					if (content.isSatisfy())
					{
						colour = SWT.COLOR_GREEN;
					}
					else
					{
						colour = SWT.COLOR_RED;
					}
				
			}
						
			
			if (eventMatches(event, "PlanScheduleImpl","ExecutedActImpl")  || eventMatches(event, "PlanScheduleImpl","FailureActImpl") || eventMatches(event, "PlanScheduleImpl","StartedActImpl"))
			{
									
					coordinates = generateCoord(event.getContent().getFact().getDueTo().getClass().getSimpleName());
					eventText = generateEventTextPlan(event);	
					eventCode = eventText[0];
					eventTip = eventText[1];		
					
					if (eventMatches(event, "PlanScheduleImpl","ExecutedActImpl"))
					{
						colour = SWT.COLOR_GREEN;
						eventCode = "Succes on: " + eventCode;
					}
					if (eventMatches(event, "PlanScheduleImpl","FailureActImpl"))
					{
						colour = SWT.COLOR_RED;
						eventCode = "Failure on: " + eventCode;
					}
					if (eventMatches(event, "PlanScheduleImpl","StartedActImpl"))
					{
						colour = SWT.COLOR_YELLOW;
						eventCode = "Started: " + eventCode;
					}
									
			}
						
			if (eventMatches(event, "PlanExecutionImpl","ExecutedActImpl")  || eventMatches(event, "PlanExecutionImpl","FailureActImpl") || eventMatches(event, "PlanExecutionImpl","StartedActImpl"))
			{
								
					coordinates = generateCoord(event.getContent().getFact().getDueTo().getClass().getSimpleName());
					eventText = generateEventTextPlan(event);	
					eventCode = eventText[0];
					eventTip = eventText[1];		
					if (eventMatches(event, "PlanExecutionImpl","ExecutedActImpl"))
					{
						colour = SWT.COLOR_GREEN;
						eventCode = "Succes on: " + eventCode;
					}
					if (eventMatches(event, "PlanExecutionImpl","FailureActImpl"))
					{
						colour = SWT.COLOR_RED;
						eventCode = "Failure on: " + eventCode;
					}
					if (eventMatches(event, "PlanExecutionImpl","StartedActImpl"))
					{
						colour = SWT.COLOR_YELLOW;
						eventCode = "Started: " + eventCode;
					}
					
					
				
			}	
			
			
			if (eventMatches(event, "PlanDistributionImpl","SendActImpl"))
			{								
					coordinates = generateCoord(event.getContent().getFact().getDueTo().getClass().getSimpleName());
					eventText = generateEventTextPlan(event);	
					eventCode = eventText[0];
					eventTip = eventText[1];		
					
					colour = SWT.COLOR_CYAN;
									
			}
			
			
			if (eventMatches(event, "PlanSynthesisImpl","ExecutedActImpl"))
			{
									
					coordinates = generateCoord(event.getContent().getFact().getDueTo().getClass().getSimpleName());
					eventText = generateEventTextPlan(event);	
					eventCode = eventText[0];
					eventTip = eventText[1];		
					
					colour = SWT.COLOR_GRAY;
									
			}
			
			
			if (eventMatches(event, "AgentReplanImpl","SendActImpl"))
			{
									
					coordinates = generateCoord(event.getContent().getFact().getDueTo().getClass().getSimpleName());
					eventText = generateEventTextRePlan(event);	
					eventCode = eventText[0];
					eventTip = eventText[1];		
					
					colour = SWT.COLOR_RED;
									
			}
						
			if (eventMatches(event, "MatchmakerQueryImpl","SendActImpl"))
			{
								
					coordinates = generateCoord(event.getContent().getFact().getDueTo().getClass().getSimpleName());
					eventText = generateEventTextMatchMaquerQuery(event);	
					eventCode = eventText[0];
					eventTip = eventText[1];		
					
					colour = SWT.COLOR_GRAY;
					
				
			}
			
			if (eventMatches(event, "MatchmakerResponseImpl","ReceiveActImpl"))
			{
				
									
					coordinates = generateCoord(event.getContent().getFact().getDueTo().getClass().getSimpleName());
					eventText = generateEventTextMatchMaquerResponse(event);	
					eventCode = eventText[0];
					eventTip = eventText[1];		
					
					colour = SWT.COLOR_CYAN;
					
				
			}
			
			if (eventMatches(event, "ServiceInvocationImpl","ExecutedActImpl") || eventMatches(event, "ServiceInvocationImpl","FailureActImpl") || eventMatches(event, "ServiceInvocationImpl","StartedActImpl"))
			{					
					coordinates = generateCoord(event.getContent().getFact().getDueTo().getClass().getSimpleName());
					eventText = generateEventTextServiceInvocation(event);	
					eventCode = eventText[0];
					eventTip = eventText[1];		
					
					if (eventMatches(event, "ServiceInvocationImpl","ExecutedActImpl"))
					{
						colour = SWT.COLOR_GREEN;
						eventCode = "Succes on: " + eventCode;
					}
					if (eventMatches(event, "ServiceInvocationImpl","FailureActImpl"))
					{
						colour = SWT.COLOR_RED;
						eventCode = "Failure on: " + eventCode;						
					}
					if (eventMatches(event, "ServiceInvocationImpl","StartedActImpl"))
					{
						colour = SWT.COLOR_YELLOW;
						eventCode = "Started: " + eventCode;
					}
					
				
			}	
				
			if (eventMatches(event, "CoordinationActionImpl","FailureActImpl"))
			{
				
									
					coordinates = generateCoord(event.getContent().getFact().getDueTo().getClass().getSimpleName());
					eventText = generateEventCoordinationAction(event);	
					eventCode = eventText[0];
					eventTip = eventText[1];		
					
					colour = SWT.COLOR_RED;
					
				
			}
			
			if (!eventCode.equalsIgnoreCase(""))
			{
				
				GraphNode actual_node = standaloneGraphView.createToolTipEventOnPosition(eventCode,eventTip,coordinates[0],coordinates[1], colour);								
				GraphNode random_node = null;
				
				
				if (eventSet.size() > 1)
				{
					
//					 Random randomGenerator = new Random();
//					    
//					 int randomInt = randomGenerator.nextInt(5) + 1;
//					
//					int random_pos = eventSet.size() - randomInt;
//					random_node = (GraphNode) eventSet.get(random_pos);
//					standaloneGraphView.createLink(random_node, actual_node, "Ignasi!");
					random_node = (GraphNode) eventSet.get(eventSet.size() -1 );
					standaloneGraphView.createLinkOrtogonal(random_node, actual_node, "");
					
				}
				
				eventSet.add(actual_node);
				
				try {
					
					int scroll_location = 0;
					if (actual_node.getLocation().x > 0)
					{
						scroll_location = actual_node.getLocation().x - 1000;
						standaloneGraphView.generateGraphAndScroll(this,scroll_location);
					}
					standaloneGraphView.generateGraphAndScroll(this,scroll_location);
								
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
	}
	private String generateEventNameRandom(int[] coordinates)
	{
		if (coordinates[1] == this.y_coordCoordinate)
		{
			return "Plan Agreement";
		}
		if (coordinates[1] == this.y_orgCoordinate)
		{
			return "LandMark Achieved";
		}
		if (coordinates[1] == this.y_serviceCoordinate)
		{
			return "Service enacted";
		}
		return "Comorl!";
	}
	
	private int[] generateCoord(String eventType)
	{
		int[] result = new int[2];
				
		result[1] = TypeModelMap.get(eventType);		
		if (result[1] == this.last_y)
		{
			result[1] = result[1] + this.y_increment;
			
		}

		this.last_y = result[1];						
		if (eventSet.size() > 0)
		{
			if (eventSet.get(eventSet.size() - 1).getLocation().y == result[1])
			{				
				result[0] = eventSet.get(eventSet.size() - 1).getLocation().x + eventSet.get(eventSet.size() - 1).getSize().width + this.x_increment_big;
			}
			else
			{			
				result[0] = eventSet.get(eventSet.size() - 1).getLocation().x + this.x_increment_small;
				if (eventSet.size() > 1)
				{
					if (eventSet.get(eventSet.size() - 2).getLocation().y == result[1])
					{
						if ( (eventSet.get(eventSet.size() - 2).getLocation().x + eventSet.get(eventSet.size() - 2).getSize().width) > (result[0] - this.x_increment_small))
						{
							result[0] = eventSet.get(eventSet.size() - 2).getLocation().x + eventSet.get(eventSet.size() - 2).getSize().width + this.x_increment_big;
						}
					}
				}
			}
		}				
		
		this.x_last = result[0];
		
		
		/*
		if (result[1] == this.y_coordCoordinate)
		{
			result[0] = this.x_last_coord;
			this.x_last = this.x_last + this.x_increment;
		}
		if (result[1] == this.y_orgCoordinate)
		{
			result[0] = this.x_last_org;
			this.x_last_org = this.x_last_org + this.x_last_org;
		}
		if (result[1] == this.y_serviceCoordinate)
		{
			result[0] = this.x_last_serv;
			this.x_last_serv = this.x_last_serv + this.x_last_serv;
		}
		*/
		
		return result;
		
		
	}
	
	private int[] generateCoordRandom()
	{
		int[] result = new int[2];
				
		result[1] = generateRandomModelBelongsTo();
								
		if (eventSet.size() > 0)
		{
			if (eventSet.get(eventSet.size() - 1).getLocation().y == result[1])
			{				
				this.x_last = eventSet.get(eventSet.size() - 1).getLocation().x + eventSet.get(eventSet.size() - 1).getSize().width + this.x_increment_big;
			}
			else
			{			
				this.x_last = eventSet.get(eventSet.size() - 1).getLocation().x + this.x_increment_small;
			}
		}				
		result[0] = this.x_last;
		
		/*
		if (result[1] == this.y_coordCoordinate)
		{
			result[0] = this.x_last_coord;
			this.x_last = this.x_last + this.x_increment;
		}
		if (result[1] == this.y_orgCoordinate)
		{
			result[0] = this.x_last_org;
			this.x_last_org = this.x_last_org + this.x_last_org;
		}
		if (result[1] == this.y_serviceCoordinate)
		{
			result[0] = this.x_last_serv;
			this.x_last_serv = this.x_last_serv + this.x_last_serv;
		}
		*/
		
		return result;
		
		
	}
	
	private void generateModelBounds(StandaloneGraphView standaloneGraphView)
	{
		if (!init_done)
		{
			this.init_done = true;
			
		}
		else
		{
			return;
		}
		
		GraphNode g1 = standaloneGraphView.createToolTipEventOnPosition("Organisational Events","Organisational Events",0,0, -1);
		GraphNode g2 = standaloneGraphView.createToolTipEventOnPosition("End of Organisational Events","End of Organisational Events",999999,0, -1);
		standaloneGraphView.createBoundLink(g1, g2);
		
		GraphNode g3 = standaloneGraphView.createToolTipEventOnPosition("Coordination Events","Coordination Events",0,250, -1);
		GraphNode g4 = standaloneGraphView.createToolTipEventOnPosition("End of Coordination Events","End of Coordination Events",999999,250, -1);
		standaloneGraphView.createBoundLink(g3, g4);
		
		GraphNode g5 = standaloneGraphView.createToolTipEventOnPosition("Service Events","Service Model",0,500, -1);
		GraphNode g6 = standaloneGraphView.createToolTipEventOnPosition("End of Service Model","End of Service Events",999999,500, -1);
		standaloneGraphView.createBoundLink(g5, g6);
		try {
			standaloneGraphView.generateGraph(this);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private int generateRandomModelBelongsTo()
	{
		
		 Random randomGenerator = new Random();
		    
		 int randomInt = randomGenerator.nextInt(3);
		 
		 if (randomInt == 0)
		 {
			 return this.y_coordCoordinate;
		 }
		 if (randomInt == 1)
		 {
			 return this.y_orgCoordinate;
		 }
		 if (randomInt == 2)
		 {
			 return this.y_serviceCoordinate;
		 }
		 
		 return this.y_coordCoordinate;
		      

	}
	
	private String[] generateEventTextNormInstanceAct(Event actual_event)
	{
		String[] res = new String[2];
		
		String code = "";
		String tip = "";

		
		NormInstanceAct content = (NormInstanceAct)actual_event.getContent().getFact();
		
		code = code + actual_event.getContent().getFact().getClass().getSimpleName() + "\n";
		code = code + "By : '" + actual_event.getAsserter().getName() + "@" + actual_event.getAsserter().getUrl() + "'\n";
		code = code + "On : '" + actual_event.getTimestamp() + "'\n";
		code = code + "Norm : '" + content.getNormInstance().getName() + "'\n";
		code = code + "On state : '" + content.getNormInstance().getPartialStateDescriptionInstance().toString() + "'\n";				
			
		tip = tip + "Activation condition : '" + content.getNormInstance().getNorm().getActivatingCondition().getID() + "'\n";
		tip = tip + "Expiration condition : '" + content.getNormInstance().getNorm().getDeactivatingCondition().getID() + "'\n";
		tip = tip + "Mainteinance condition : '" + content.getNormInstance().getNorm().getMaintenanceCondition().getID() + "'\n";
		tip = tip + "Repair condition : '" + content.getNormInstance().getNorm().getRepairCondition().getID() + "'\n";
		if (content.getNormInstance().getNorm().getTimeout() != null)
		{
			tip = tip + "Timeout : '"  + content.getNormInstance().getNorm().getTimeout().getID() + "'\n";
		}
		tip = tip + "Deontics : '" + content.getNormInstance().getNorm().getDeontics().getModality() + " " + content.getNormInstance().getNorm().getDeontics().getWhat().getID() + "'\n";
			
		
		res[0] = code;
		res[1] = tip;
		return res;
	}
	
	private String[] generateEventTextLandMarkFulfillment(Event actual_event)
	{
		String[] res = new String[2];
		
		String code = "";
		String tip = "";

		
		LandmarkFulfilmentImpl content = (LandmarkFulfilmentImpl)actual_event.getContent().getFact();
		
		
		code = code + actual_event.getContent().getFact().getClass().getSimpleName() + "\n";
		code = code + "By : '" + actual_event.getAsserter().getName() + "@" + actual_event.getAsserter().getUrl() + "'\n";
		code = code + "On : '" + actual_event.getTimestamp() + "'\n";
		code = code + "Land Mark : '" + content.getLandmark().getName() + "'\n";
		
		try
		{
			tip = tip + "On state : '" + content.getLandmark().getStateDescription().getID() + "'\n";
		}
		catch (java.lang.NullPointerException noStateDescriptionException)
		{
			tip = tip + "On state : ' '\n";
		}
		
		String objectives = "";
		Iterator<Objective> it = content.getLandmark().getEntails().iterator();
		while (it.hasNext())
		{
			Objective dummy = it.next();
			objectives = dummy.getName() + " , ";
		}
		if (objectives.contains(" , "))
		{
			objectives = objectives.substring(0, objectives.length() - " , ".length());
		}
		tip = tip + "Objectives entailed : '" + objectives + "'\n";		
		
		res[0] = code;
		res[1] = tip;
		return res;
	}
	
	private String[] generateEventTextPlan(Event actual_event)
	{
		String[] res = new String[2];
		
		String code = "";
		String tip = "";

		
		PlanningActions content = (PlanningActions)actual_event.getContent().getFact().getDueTo();
		
		
		code = code + actual_event.getContent().getFact().getDueTo().getClass().getSimpleName() + "\n";
		code = code + "By : '" + actual_event.getAsserter().getName() + "@" + actual_event.getAsserter().getUrl() + "'\n";
		code = code + "On : '" + actual_event.getTimestamp() + "'\n";
		code = code + "Plan : '" + content.getPlan().getName() + "'\n";
			
		String taskInputs = "";
		if (content.getPlan().getForTask() != null)
		{
			if (content.getPlan().getForTask().getInput() != null)
			{
				Iterator<InputMessageMap> itTaskInputs = content.getPlan().getForTask().getInput().iterator();
				while (itTaskInputs.hasNext())
				{
					InputMessageMap actual = itTaskInputs.next();
					taskInputs = taskInputs + actual.getParameter().getName() + " , ";
				}
				if (taskInputs.contains(" , "))
				{
					taskInputs = taskInputs.substring(0, taskInputs.length() - " , ".length());
				}					
			}
			tip = tip + "For task : '" + content.getPlan().getForTask().getName() + "(" + taskInputs + ")'\n";
		}
						
		String aglString = "";
		ActionGroundingList agl = content.getPlan().getHasAtomicProcessGroundingList();
		while (agl != null)
		{
			if (!aglString.equalsIgnoreCase(""))
			{
				aglString = aglString + "\n";
			}
			String inputs = "";
			String outputs = "";
			
			ActionGrounding ag = agl.getFirst();
			Iterator<Input> itInput = ag.getOwlsProcess().getHasInput().iterator();
			while (itInput.hasNext())
			{
				if (!inputs.equalsIgnoreCase(""))
				{
					inputs = inputs + " , ";
				}
				Input dummy = itInput.next();
				inputs = inputs + dummy.getName();
			}
			Iterator<Output> itOutput = ag.getOwlsProcess().getHasOutput().iterator();
			while (itOutput.hasNext())
			{
				if (!outputs.equalsIgnoreCase(""))
				{
					outputs = outputs + " , ";
				}
				Output dummy = itOutput.next();
				outputs = outputs + dummy.getName();
			}
			
			aglString = aglString  + "	� Action: '" + ag.getOwlsProcess().getName() + "'\n";			
			aglString = aglString  + "		� With inputs: '" + inputs + "'\n";			
			aglString = aglString  + "		� With outputs: '" + outputs + "'\n";			
			agl = agl.getRest();
		}
		
		tip = tip + "For actions : \n" + aglString;
		
		res[0] = code;
		res[1] = tip;
		return res;
	}
	
	
	private String[] generateEventTextRePlan(Event actual_event)
	{
		String[] res = new String[2];
		
		String code = "";
		String tip = "";

		
		AgentReplan content = (AgentReplan)actual_event.getContent().getFact().getDueTo();
		
		String roles = "";
		Iterator<Role> itRole = content.getAgent().getHasRole().iterator();
		while (itRole.hasNext())
		{
			Role dummy = itRole.next();
			if (!roles.equals(""))
			{
				roles = roles + " , ";
			}
			roles = roles + dummy.getName();
		}
		
		code = code + actual_event.getContent().getFact().getDueTo().getClass().getSimpleName() + "\n";
		code = code + "By : '" + actual_event.getAsserter().getName() + "@" + actual_event.getAsserter().getUrl() + "'\n";
		code = code + "On : '" + actual_event.getTimestamp() + "'\n";
		code = code + "Plan : '" + content.getFailedPlan().getName() + "'\n";
		code = code + "Agent Name : '" + content.getAgent().getName()+ "'\n";
		code = code + "Agent Role : '" + roles + "'\n";
			
		String taskInputs = "";
		Iterator<InputMessageMap> itTaskInputs = content.getFailedPlan().getForTask().getInput().iterator();
		while (itTaskInputs.hasNext())
		{
			InputMessageMap actual = itTaskInputs.next();
			taskInputs = taskInputs + actual.getParameter().getName() + " , ";
		}
		if (taskInputs.contains(" , "))
		{
			taskInputs = taskInputs.substring(0, taskInputs.length() - " , ".length());
		}
		tip = tip + "For task : '" + content.getFailedPlan().getForTask().getName() + "(" + taskInputs + ")'\n";				
		
		String aglString = "";
		ActionGroundingList agl = content.getFailedPlan().getHasAtomicProcessGroundingList();
		while (agl != null)
		{
			if (!aglString.equalsIgnoreCase(""))
			{
				aglString = aglString + "\n";
			}
			String inputs = "";
			String outputs = "";
			
			ActionGrounding ag = agl.getFirst();
			Iterator<Input> itInput = ag.getOwlsProcess().getHasInput().iterator();
			while (itInput.hasNext())
			{
				if (!inputs.equalsIgnoreCase(""))
				{
					inputs = inputs + " , ";
				}
				Input dummy = itInput.next();
				inputs = inputs + dummy.getName();
			}
			Iterator<Output> itOutput = ag.getOwlsProcess().getHasOutput().iterator();
			while (itOutput.hasNext())
			{
				if (!outputs.equalsIgnoreCase(""))
				{
					outputs = outputs + " , ";
				}
				Output dummy = itOutput.next();
				outputs = outputs + dummy.getName();
			}
			
			aglString = aglString  + "	� Action: '" + ag.getOwlsProcess().getName() + "'\n";			
			aglString = aglString  + "		� With inputs: '" + inputs + "'\n";			
			aglString = aglString  + "		� With outputs: '" + outputs + "'\n";			
			agl = agl.getRest();
		}
		
		tip = tip + "For actions : \n" + aglString;
		
		res[0] = code;
		res[1] = tip;
		return res;
	}
	
	
	private String[] generateEventTextMatchMaquerQuery(Event actual_event)
	{
		String[] res = new String[2];
		
		String code = "";
		String tip = "";

		MatchmakerQuery content = (MatchmakerQuery)actual_event.getContent().getFact().getDueTo();
				
		code = code + actual_event.getContent().getFact().getDueTo().getClass().getSimpleName() + "\n";
		code = code + "By : '" + actual_event.getAsserter().getName() + "@" + actual_event.getAsserter().getUrl() + "'\n";
		code = code + "On : '" + actual_event.getTimestamp() + "'\n";
		code = code + "Query : '" + content.getQuery() + "'\n";
		
		res[0] = code;
		res[1] = tip;
		return res;
	}
	
	private String[] generateEventTextMatchMaquerResponse(Event actual_event)
	{
		String[] res = new String[2];
		
		String code = "";
		String tip = "";

		MatchmakerResponse content = (MatchmakerResponse)actual_event.getContent().getFact().getDueTo();
			
		String result_small = "";
		String result_extended = "";
		Iterator<MatchmakerResult> itResult = content.getQueryResult().iterator();
		while (itResult.hasNext())
		{
			MatchmakerResult dummy = itResult.next();
			if (!result_small.equalsIgnoreCase(""))
			{
				result_small = result_small + " , ";
			}
			result_small = result_small + dummy.getServiceURI();
			
			if (!result_extended.equalsIgnoreCase(""))
			{
				result_extended = result_extended + "\n";
			}
			result_extended = result_extended + "Service URI : '" + dummy.getServiceURI() + "'\n";
			result_extended = result_extended + "Service Performance : '" + dummy.getPerformance() + "'\n";
			result_extended = result_extended + "Service Reliability : '" + dummy.getReliability() + "'\n";
		}
		
		code = code + actual_event.getContent().getFact().getDueTo().getClass().getSimpleName() + "\n";
		code = code + "By : '" + actual_event.getAsserter().getName() + "@" + actual_event.getAsserter().getUrl() + "'\n";
		code = code + "On : '" + actual_event.getTimestamp() + "'\n";
		code = code + "Query : '" + content.getQuery().getQuery() + "'\n";
		code = code + "Result : '" + result_small + "'\n";
		
		tip = result_extended;
		
		res[0] = code;
		res[1] = tip;
		return res;
	}	
	
	private String[] generateEventTextServiceInvocation(Event actual_event)
	{
		String[] res = new String[2];
		
		String code = "";
		String tip = "";

		ServiceInvocation content = (ServiceInvocation)actual_event.getContent().getFact().getDueTo();					
		
		String roles = "";
		Iterator<Role> itRole = content.getEnactingAgent().getHasRole().iterator();
		while (itRole.hasNext())
		{
			Role dummy = itRole.next();
			if (!roles.equals(""))
			{
				roles = roles + " , ";
			}
			roles = roles + dummy.getName();
		}
		
		code = code + actual_event.getContent().getFact().getDueTo().getClass().getSimpleName() + "\n";
		code = code + "By : '" + actual_event.getAsserter().getName() + "@" + actual_event.getAsserter().getUrl() + "'\n";
		code = code + "On : '" + actual_event.getTimestamp() + "'\n";
		code = code + "Service : '" + content.getServiceURI() + "'\n";
		code = code + "Agent Name : '" + content.getEnactingAgent().getName() + "'\n";
		code = code + "Agent Role : '" + roles + "'\n";
		
		String inputs = "";
		String outputs = "";
		if (content.getCorrelatedAction() != null)
		{
			if (content.getCorrelatedAction().getOwlsProcess() != null)
			{
				Iterator<Input> itInput = content.getCorrelatedAction().getOwlsProcess().getHasInput().iterator();
				while (itInput.hasNext())
				{
					if (!inputs.equalsIgnoreCase(""))
					{
						inputs = inputs + " , ";
					}
					Input dummy = itInput.next();
					inputs = inputs + dummy.getName();
				}
				Iterator<Output> itOutput = content.getCorrelatedAction().getOwlsProcess().getHasOutput().iterator();
				while (itOutput.hasNext())
				{
					if (!outputs.equalsIgnoreCase(""))
					{
						outputs = outputs + " , ";
					}
					Output dummy = itOutput.next();
					outputs = outputs + dummy.getName();
				}
				
				tip = tip + "Process Name : '" + content.getCorrelatedAction().getOwlsProcess().getName() + "'\n";
				tip = tip  + "With inputs: '" + inputs + "'\n";			
				tip = tip  + "With outputs: '" + outputs + "'\n";
			}
		}	
		
		res[0] = code;
		res[1] = tip;
		return res;
	}
	
	
	private String[] generateEventCoordinationAction(Event actual_event)
	{
		String[] res = new String[2];
		
		String code = "";
		String tip = "";

		CoordinationAction content = (CoordinationAction)actual_event.getContent().getFact().getDueTo();					
		FailureAct fAct = (FailureAct)actual_event.getContent().getFact();		
		
		code = code + actual_event.getContent().getFact().getDueTo().getClass().getSimpleName() + "\n";
		code = code + "By : '" + actual_event.getAsserter().getName() + "@" + actual_event.getAsserter().getUrl() + "'\n";
		code = code + "On : '" + actual_event.getTimestamp() + "'\n";
		code = code + "Plan : '" + content.getPlan().getName() + "'\n";
		//code = code + "Process : '" +  content.getCoordAction().getOwlsProcess().getName() + "'\n";
		code = code + "Due to : '" +  fAct.getFailureReason().getName() + "'\n";
		
		String inputs = "";
		String outputs = "";
		
		Iterator<Input> itInput = content.getCoordAction().getOwlsProcess().getHasInput().iterator();
		while (itInput.hasNext())
		{
			if (!inputs.equalsIgnoreCase(""))
			{
				inputs = inputs + " , ";
			}
			Input dummy = itInput.next();
			inputs = inputs + dummy.getName();
		}
		Iterator<Output> itOutput = content.getCoordAction().getOwlsProcess().getHasOutput().iterator();
		while (itOutput.hasNext())
		{
			if (!outputs.equalsIgnoreCase(""))
			{
				outputs = outputs + " , ";
			}
			Output dummy = itOutput.next();
			outputs = outputs + dummy.getName();
		}
		
		tip = tip + "Process Name : '" + content.getCoordAction().getOwlsProcess().getName() + "'\n";
		tip = tip  + "With inputs: '" + inputs + "'\n";			
		tip = tip  + "With outputs: '" + outputs + "'\n";
		
		String taskInputs = "";
		Iterator<InputMessageMap> itTaskInputs = content.getPlan().getForTask().getInput().iterator();
		while (itTaskInputs.hasNext())
		{
			InputMessageMap actual = itTaskInputs.next();
			taskInputs = taskInputs + actual.getParameter().getName() + " , ";
		}
		if (taskInputs.contains(" , "))
		{
			taskInputs = taskInputs.substring(0, taskInputs.length() - " , ".length());
		}
		tip = tip + "For task : '" + content.getPlan().getForTask().getName() + "(" + taskInputs + ")'\n";				
		
		String aglString = "";
		ActionGroundingList agl = content.getPlan().getHasAtomicProcessGroundingList();
		while (agl != null)
		{
			if (!aglString.equalsIgnoreCase(""))
			{
				aglString = aglString + "\n";
			}
			 inputs = "";
			 outputs = "";
			
			ActionGrounding ag = agl.getFirst();
			itInput = ag.getOwlsProcess().getHasInput().iterator();
			while (itInput.hasNext())
			{
				if (!inputs.equalsIgnoreCase(""))
				{
					inputs = inputs + " , ";
				}
				Input dummy = itInput.next();
				inputs = inputs + dummy.getName();
			}
			itOutput = ag.getOwlsProcess().getHasOutput().iterator();
			while (itOutput.hasNext())
			{
				if (!outputs.equalsIgnoreCase(""))
				{
					outputs = outputs + " , ";
				}
				Output dummy = itOutput.next();
				outputs = outputs + dummy.getName();
			}
			
			aglString = aglString  + "	� Action: '" + ag.getOwlsProcess().getName() + "'\n";			
			aglString = aglString  + "		� With inputs: '" + inputs + "'\n";			
			aglString = aglString  + "		� With outputs: '" + outputs + "'\n";			
			agl = agl.getRest();
		}
		
		tip = tip + "For actions : \n" + aglString;
			
		res[0] = code;
		res[1] = tip;
		return res;
	}
	
	private boolean timeStampMatch(Event e)
	{
		if (timeFilter)
		{						
			if (e.getTimestamp().before(finalStamp))
			{
				if (e.getTimestamp().after(initialStamp))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		else
		{
			return true;
		}
	}
	
	private void showMessage(String message)
	{
		MessageDialog.openInformation(null,
				"Sample View", message);
	}
	

	private HashMap<String,Integer>initTypeModelMap()
	{
		HashMap<String,Integer> res = new HashMap<String,Integer>();
		res.put("NormInstanceActivatedImpl", this.y_orgCoordinate);
		res.put("NormInstanceViolatedImpl", this.y_orgCoordinate);
		res.put("NormInstanceExpiredImpl", this.y_orgCoordinate);
		res.put("LandmarkFulfilmentImpl", this.y_orgCoordinate);
		res.put("PlanSynthesisImpl", this.y_coordCoordinate);
		res.put("PlanExecutionImpl", this.y_coordCoordinate);
		res.put("PlanScheduleImpl", this.y_coordCoordinate);
		res.put("PlanDistributionImpl", this.y_coordCoordinate);
		res.put("AgentReplanImpl", this.y_coordCoordinate);		
		res.put("MatchmakerQueryImpl", this.y_serviceCoordinate);
		res.put("MatchmakerResponseImpl", this.y_serviceCoordinate);
		res.put("ServiceInvocationImpl", this.y_serviceCoordinate);		
		res.put("DisasterImpl", this.y_serviceCoordinate);
		res.put("CoordinationActionImpl", this.y_coordCoordinate);
		
		
		return res;
	}
	
	private HashMap<String,Boolean>initTypeAllowedMap()
	{
		HashMap<String,Boolean> res = new HashMap<String,Boolean>();
		
		//Set to true for testing
		res.put("SendActImpl", false);
		
		res.put("NormInstanceActivatedImpl", true);
		res.put("NormInstanceViolatedImpl", true);
		res.put("NormInstanceExpiredImpl", true);
		res.put("LandmarkFulfilmentImpl", true);
		res.put("PlanSynthesisImpl", true);
		res.put("PlanExecutionImpl", true);
		res.put("PlanScheduleImpl", true);
		res.put("PlanDistributionImpl", true);
		res.put("AgentReplanImpl", true);		
		res.put("MatchmakerQueryImpl", true);
		res.put("MatchmakerResponseImpl", true);
		res.put("ServiceInvocationImpl", true);		
		res.put("DisasterImpl", true);
		res.put("CoordinationActionImpl", true);
		
		
		return res;
	}
	
	private boolean eventMatches(Event event, String eventName, String parentEventName)
	{
		try
		{
			boolean matchesName = false;
			boolean isAllowed = true;
			
			if (parentEventName.equalsIgnoreCase(""))
			{
				matchesName = event.getContent().getFact().getClass().getSimpleName().equals(eventName);
			}
			else
			{
				matchesName = event.getContent().getFact().getClass().getSimpleName().equals(parentEventName);
				matchesName = matchesName && event.getContent().getFact().getDueTo().getClass().getSimpleName().equals(eventName);
			}				
							
			isAllowed = this.TypeAllowedMap.get(eventName);
			
			return matchesName && isAllowed;
		}
		catch (java.lang.NullPointerException E)
		{
			return false;
		}
		
	}
	
	private class EventTypeChoosingMenu implements Runnable
	{
		Vector<Button> typeButtonSet = new Vector<Button>();
		
		public void run(){
	    	
			GridLayout shellLayout = new GridLayout();
			shellLayout.numColumns = 1;			
			
			final Shell shell = new Shell(Display.getDefault());
		    shell.setSize(300, 200);
		    shell.setText("Event type selection");
		    shell.setToolTipText("Select the type of events you want to include on the visualization");
		    shell.setLayout(shellLayout);
		    
		    GridLayout timeLayout = new GridLayout();
		    timeLayout.numColumns = 5;		
		    Group timeGroup = new Group(shell, SWT.SHADOW_IN);
		    timeGroup.setLayout(timeLayout);
		    
		    final Label InitialStampLabel = new Label(timeGroup, SWT.NONE);
		    InitialStampLabel.setText("Events minimum TimeStap");
		    final Text InitialStampText = new Text(timeGroup, SWT.BORDER);
		    InitialStampText.setText("01/01/2001 00:00:00");
		    final Label FinalStampLabel = new Label(timeGroup, SWT.NONE);
		    FinalStampLabel.setText("Events maximum TimeStap");
		    final Text FinalStampText = new Text(timeGroup, SWT.BORDER);
		    FinalStampText.setText("01/01/2010 00:00:00");
		    final Button FilterTimeButton = new Button(timeGroup, SWT.CHECK);
		    FilterTimeButton.setText("Filter events by TimeStamp");		    
		    
		    GridLayout typesLayout = new GridLayout();
		    typesLayout.numColumns = 4;		
		    Group typesGroup = new Group(shell, SWT.SHADOW_IN);
		    typesGroup.setLayout(typesLayout);
		    
		    final Button NormInstanceActivatedImplButton = new Button(typesGroup, SWT.CHECK);
		    NormInstanceActivatedImplButton.setText("NormInstanceActivatedImpl");
		    typeButtonSet.add(NormInstanceActivatedImplButton);
		    
		    final Button NormInstanceViolatedImplButton = new Button(typesGroup, SWT.CHECK);
		    NormInstanceViolatedImplButton.setText("NormInstanceViolatedImpl");
		    typeButtonSet.add(NormInstanceViolatedImplButton);
		    
		    final Button NormInstanceExpiredImplButton = new Button(typesGroup, SWT.CHECK);
		    NormInstanceExpiredImplButton.setText("NormInstanceExpiredImpl");
		    typeButtonSet.add(NormInstanceExpiredImplButton);
		    
		    final Button LandmarkFulfilmentImpl = new Button(typesGroup, SWT.CHECK);
		    LandmarkFulfilmentImpl.setText("LandmarkFulfilmentImpl");
		    typeButtonSet.add(LandmarkFulfilmentImpl);
		    
		    final Button PlanSynthesisImplButton = new Button(typesGroup, SWT.CHECK);
		    PlanSynthesisImplButton.setText("PlanSynthesisImpl");
		    typeButtonSet.add(PlanSynthesisImplButton);
		    
		    final Button PlanExecutionImplButton  = new Button(typesGroup, SWT.CHECK);
		    PlanExecutionImplButton .setText("PlanExecutionImpl");
		    typeButtonSet.add(PlanExecutionImplButton);
		    
		    final Button PlanScheduleImplButton  = new Button(typesGroup, SWT.CHECK);
		    PlanScheduleImplButton .setText("PlanScheduleImpl");
		    typeButtonSet.add(PlanScheduleImplButton);
		    
		    final Button PlanDistributionImplButton  = new Button(typesGroup, SWT.CHECK);
		    PlanDistributionImplButton .setText("PlanDistributionImpl");
		    typeButtonSet.add(PlanDistributionImplButton);
		    
		    final Button AgentReplanImplButton  = new Button(typesGroup, SWT.CHECK);
		    AgentReplanImplButton .setText("AgentReplanImpl");
		    typeButtonSet.add(AgentReplanImplButton);
		    
		    final Button CoordinationActionImplButton  = new Button(typesGroup, SWT.CHECK);
		    CoordinationActionImplButton .setText("CoordinationActionImpl");
		    typeButtonSet.add(CoordinationActionImplButton);
		    
		    final Button MatchmakerQueryImplButton  = new Button(typesGroup, SWT.CHECK);
		    MatchmakerQueryImplButton .setText("MatchmakerQueryImpl");
		    typeButtonSet.add(MatchmakerQueryImplButton);
		    
		    final Button MatchmakerResponseImplButton  = new Button(typesGroup, SWT.CHECK);
		    MatchmakerResponseImplButton .setText("MatchmakerResponseImpl");
		    typeButtonSet.add(MatchmakerResponseImplButton);
		    
		    final Button ServiceInvocationImplButton  = new Button(typesGroup, SWT.CHECK);
		    ServiceInvocationImplButton .setText("ServiceInvocationImpl");
		    typeButtonSet.add(ServiceInvocationImplButton);
		    
		    final Button DisasterImplButton  = new Button(typesGroup, SWT.CHECK);
		    DisasterImplButton .setText("DisasterImpl");
		    typeButtonSet.add(DisasterImplButton);
		    
		    Group buttonsGroup = new Group(shell, SWT.SHADOW_IN);
		    buttonsGroup.setLayout(new FillLayout());	
		    
		    //Checks all the event types
		    Iterator<Button> it = typeButtonSet.iterator();
	    	while (it.hasNext())
	    	{
	    		Button actual = it.next();
	    		actual.setSelection(true);
	    	}
		    
		    final Button done_button = new Button(buttonsGroup, SWT.PUSH);
		    done_button.setText("OK");		    
		    done_button.addSelectionListener(new SelectionListener() 
		    {

		      public void widgetSelected(SelectionEvent event) 
		      {		
		    	  
		    	  Iterator<Button> it = typeButtonSet.iterator();
			    	while (it.hasNext())
			    	{
			    		Button actual = it.next();
			    		boolean selected = actual.getSelection();
			    		String name = actual.getText();
			    		TypeAllowedMap.put(name, selected);			    		
			    	}
			    	if (FilterTimeButton.getSelection())
		    		{
		    			timeFilter = true;
		    			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		    			try
		    			{
		    				initialStamp = sdf.parse(InitialStampText.getText());
		    				finalStamp = sdf.parse(FinalStampText.getText());			    				
		    			}
		    			catch (ParseException E)
		    			{
		    				timeFilter = false;
		    				showMessage("Date parsing error, filtering disabled");
		    			}
		    		}
		    		else
		    		{
		    			timeFilter = false;
		    		}
		    	  
		        shell.dispose();		        
		      }

		      public void widgetDefaultSelected(SelectionEvent event) 
		      {		        
		         
		      }
		    });
		    
		    final Button selectAll_button = new Button(buttonsGroup, SWT.PUSH);
		    selectAll_button.setText("Select all");		    
		    selectAll_button.addSelectionListener(new SelectionListener() 
		    {

		      public void widgetSelected(SelectionEvent event) 
		      {		        
		    	Iterator<Button> it = typeButtonSet.iterator();
		    	while (it.hasNext())
		    	{
		    		Button actual = it.next();
		    		actual.setSelection(true);
		    	}		        
		      }

		      public void widgetDefaultSelected(SelectionEvent event) 
		      {		        
		    	  		        
		      }
		    });
		    
		    final Button selectNone_button = new Button(buttonsGroup, SWT.PUSH);
		    selectNone_button.setText("Select None");		    
		    selectNone_button.addSelectionListener(new SelectionListener() 
		    {

		      public void widgetSelected(SelectionEvent event) 
		      {		        
		    	  Iterator<Button> it = typeButtonSet.iterator();
			    	while (it.hasNext())
			    	{
			    		Button actual = it.next();
			    		actual.setSelection(false);
			    	}			    
		      }

		      public void widgetDefaultSelected(SelectionEvent event) 
		      {		        
		    	  		       
		      }
		    });
		    
		    final Button reverse_button = new Button(buttonsGroup, SWT.PUSH);
		    reverse_button.setText("Reverse Selection");		    
		    reverse_button.addSelectionListener(new SelectionListener() 
		    {

		      public void widgetSelected(SelectionEvent event) 
		      {		        
		    	  Iterator<Button> it = typeButtonSet.iterator();
			    	while (it.hasNext())
			    	{
			    		Button actual = it.next();
			    		if (actual.getSelection())
			    		{
			    			actual.setSelection(false);			    			
			    		}
			    		else
			    		{
			    			actual.setSelection(true);
			    		}
			    	}			    
		      }

		      public void widgetDefaultSelected(SelectionEvent event) 
		      {		        
		    	         
		      }
		    });
		    	
		    final Button help_button = new Button(buttonsGroup, SWT.PUSH);
		    help_button.setText("Help");		    
		    help_button.addSelectionListener(new SelectionListener() 
		    {

		      public void widgetSelected(SelectionEvent event) 
		      {		        
		    	  
		    	String message = "This menu allows selecting\n" + 
		    	"the type of events that will be\n" +
		    	"visualized on the runtimeview.\n" +
		    	"Only the events of the checked types are visualized\n" + 
		    	"\n" +
		    	"The menu also allows limiting viewed events between two timestaps.\n"+
		    	"This filter is useful for visualizing events stored on an event log";
		        showMessage(message);		        
		      }

		      public void widgetDefaultSelected(SelectionEvent event) 
		      {		        
		         
		      }
		    });
		    
		    shell.pack();
		    shell.open();
		    
		    while (!shell.isDisposed()) {
			      if (!Display.getDefault().readAndDispatch())
			    	  Display.getDefault().sleep();
			    }					    
		    
	    }
	}
		
		
	
	
	
	
	
}
