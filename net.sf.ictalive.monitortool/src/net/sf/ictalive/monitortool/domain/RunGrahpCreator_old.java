package net.sf.ictalive.monitortool.domain;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.zest.core.widgets.GraphNode;

import net.sf.ictalive.coordination.tasks.ActionGroundingList;
import net.sf.ictalive.monitortool.views.StandaloneGraphView;
import net.sf.ictalive.operetta.OM.Atom;
import net.sf.ictalive.owls.process.Input;
import net.sf.ictalive.owls.process.Output;
import net.sf.ictalive.runtime.action.Action;
import net.sf.ictalive.runtime.enactment.Enactment;
import net.sf.ictalive.runtime.enactment.PlanEnactment;
import net.sf.ictalive.runtime.event.Event;
import net.sf.ictalive.runtime.fact.Content;
import net.sf.ictalive.runtime.fact.impl.SendActImpl;
import net.sf.ictalive.runtime.fact.impl.StartedActImpl;

public class RunGrahpCreator_old implements IGraphCreator {

	@Override
	public void generate(StandaloneGraphView sgv) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void update(StandaloneGraphView standaloneGraphView, Event event) 
	{
		String		as;
		GraphNode	gn, ge;
		
		String eventCode = "";
		String eventTip = "";
		
		showMessage("Please, select the name of the asserters");
		String asserters = chooseAsserters();
		
		if (asserters.contains(event.getAsserter().getName()))
		{
		
			/*
			if (event.getContent().getFact().getClass().getSimpleName().contains("SendActImpl"))
			{
				eventCode = "Sent\n";
				SendActImpl dummy = (SendActImpl)event.getContent().getFact();
				Iterator<EObject> it = dummy.getSendMessage().getObject().iterator();
				while (it.hasNext())
				{
					Atom dummyAtom = (Atom)it.next();
					eventCode = eventCode + dummyAtom.getPredicate() + "\n";				
				}
				
				
			}
			*/
			
			if (event.getContent().getFact().getClass().getSimpleName().contains("StartedActImpl"))
			{
				
				if (event.getContent() != null)
				{
				StartedActImpl currentAct = (StartedActImpl)event.getContent().getFact();
				if (currentAct.getEffect() != null)
				{
				Action currectAction = currentAct.getEffect();
				if (currectAction.getEnactment() != null)
				{
					eventCode = "Started\n";
					
					Iterator<Enactment> itEnactment = currectAction.getEnactment().iterator();
					while (itEnactment.hasNext())
					{
						Enactment currentEnactment = (Enactment)itEnactment.next();
						try
						{
							PlanEnactment currentplan = (PlanEnactment)currentEnactment;
							eventCode = eventCode + "Plan : '" + currentplan.getPlan().getName() + "'\n";
							ActionGroundingList currentGroundingList = currentplan.getPlan().getHasAtomicProcessGroundingList();
							eventTip = eventTip + "OWLS Grounding List:" +  "\n";
							eventTip = solveGroundingList(currentGroundingList,eventTip);
							
						}
						catch (java.lang.ClassCastException E)
						{
							eventTip = eventTip + "Enactment ID: '" + currentEnactment.getSessionId() + "'\n";
							eventTip = eventTip + "Start time: '" + currentEnactment.getStartTime() + "'\n";
							eventTip = eventTip + "Finish time: '" + currentEnactment.getFinishTime() + "'\n";
							eventTip = eventTip + "Expire time: '" + currentEnactment.getExpireTime() + "'\n";
						}
							
					}
				}
				}
				}
		
			}
			/*
			if  (event.getContent().getFact().getClass().getSimpleName().contains("ExecutedActImpl"))
			{
				eventCode = "Executed\n";
			}
			*/
			if (!eventCode.equalsIgnoreCase(""))
			{
				standaloneGraphView.createIncrementalEvent(eventCode,eventTip);
			}
			
			
			try {
				standaloneGraphView.generateGraph(this);			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		
	}
	
	private String solveGroundingList(ActionGroundingList currentGroundingList,String eventCode)
	{
		
		if (currentGroundingList.getFirst() != null)
		{
			if (currentGroundingList.getFirst().getOwlsProcess() != null)
			{
				String input = "(";
				String output = "{";
				if (currentGroundingList.getFirst().getOwlsProcess().getHasInput() != null)
				{
				Iterator<Input> itInput = currentGroundingList.getFirst().getOwlsProcess().getHasInput().iterator();
					while (itInput.hasNext())
					{
						Input currentInput = (Input)itInput.next();
						input = input + currentInput.getName() + ",";
					}
				}
				
				input = input + ")";
				
				
				
				if (currentGroundingList.getFirst().getOwlsProcess().getHasOutput() != null)
				{
				Iterator<Output> itOutput = currentGroundingList.getFirst().getOwlsProcess().getHasOutput().iterator();
				while (itOutput.hasNext())
				{
					Output currentOutput = itOutput.next();
					output = output + currentOutput.getName() + ",";
				}
				}
				output = output + "}";
				eventCode = eventCode + output + ":" + currentGroundingList.getFirst().getOwlsProcess().getName() + input + "\n";
				if (currentGroundingList.getRest() != null)
				{
					solveGroundingList(currentGroundingList.getRest(),eventCode);
				}
			}
		}
		
		return eventCode;
	}
	
	
	private void showMessage(String message)
	{
		MessageDialog.openInformation(null,
				"Sample View", message);
	}

	private String chooseAsserters()
	{
		Shell dialogShower = new Shell();
		FileDialog dialog = new FileDialog(dialogShower, SWT.OPEN);

		String asserters = dialog.open();
		
		return asserters;
	}

}
