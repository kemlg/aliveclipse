package net.sf.ictalive.log.analysis_v2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.widgets.Shell;

import net.sf.ictalive.coordination.tasks.ActionGrounding;
import net.sf.ictalive.coordination.tasks.ActionGroundingList;
import net.sf.ictalive.coordination.tasks.Plan;
import net.sf.ictalive.eventbus.EventBus;
import net.sf.ictalive.eventlog.client.EventLogClient;
import net.sf.ictalive.log.analysis_v2.plan.PlanInfo;
import net.sf.ictalive.log.analysis_v2.plan.RoleTaskInfo;
import net.sf.ictalive.operetta.OM.Norm;
import net.sf.ictalive.operetta.OM.Role;
import net.sf.ictalive.operetta.OM.RoleDeonticStatement;
import net.sf.ictalive.runtime.NormInstances.NormInstance;
import net.sf.ictalive.runtime.NormInstances.NormInstancesPackage;
import net.sf.ictalive.runtime.action.Action;
import net.sf.ictalive.runtime.action.Result;
import net.sf.ictalive.runtime.enactment.Enactment;
import net.sf.ictalive.runtime.enactment.PlanEnactment;
import net.sf.ictalive.runtime.event.Actor;
import net.sf.ictalive.runtime.event.Event;
import net.sf.ictalive.runtime.fact.ExecutedAct;
import net.sf.ictalive.runtime.fact.Fact;
import net.sf.ictalive.runtime.fact.NormInstanceActivated;
import net.sf.ictalive.runtime.fact.NormInstanceViolated;

	public class ReadEventLog
	{
		static
		{
			// TODO: Hotfix! Warn Thanos
			NormInstancesPackage.eINSTANCE.eClass();
		}
		
		 boolean flag = true;
		 List<PlanInfo> planList = new ArrayList<PlanInfo>();
		 ArrayList<RoleTaskInfo> roleTaskList = new ArrayList<RoleTaskInfo>();
		Shell shell;
		
		public static void main (String [] args) {
			 new ReadEventLog();
			
		}
		public ReadEventLog(){
			
			try{
				//MessageDialog.openInformation(shell, "ReadEventLog", "before connectEventLog 1");
				connectEventLog();
				
			}catch(Exception e){}
		}
		
		
		public ReadEventLog(Shell s){
			shell = s;
			try{
				//MessageDialog.openInformation(shell, "ReadEventLog", "before connectEventLog 1");
				connectEventLog();
				
			}catch(Exception e){}
		}
		/**
		 * @param args
		 * @throws Exception 
		 * @throws XQException 
		 */
		public  void connectEventLog() throws Exception
		{
			EventLogClient			elc;
			Collection<Event>		lev = null;
			Collection<String>		cs;
			EventBus				eb;
			
			
			
			elc = new EventLogClient("alive.lsi.upc.edu");
			
			
			
//			eb = new EventBus("127.0.0.1");
//			cs  = elc.queryKeys("Asserters");
			//for(String st : cs)
			//	System.out.println("Key: " + st);
	//		queryNormInstanceViolations(elc, lev);
			System.out.println("-------------------------------");
//			queryNormInstanceActivations(elc, lev);
			queryExecutedActs(elc, lev);			
			
			
			
			System.out.println("Plan list size: " + planList.size());
			
			for(int i=0; i<planList.size(); i++){
				PlanInfo p = planList.get(i);
				System.out.println("Plan INFO: " + p.getName() + ", size: " + p.getActionList().size());
			}
//			lev = elc.queryNormInstanceActivations(null, null);
/*			lev = elc.queryNormInstanceViolations(null, null);
//			lev = elc.querySendActs(null);
	
			for(Event ev : lev)
			{
//				eb.publish(ev);
				System.out.println("Event " + ev + " with date " + ev.getTimestamp());
				System.out.println(ev.getAsserter().getName());
			}*/
		}
		
		private  void queryExecutedActs(EventLogClient elc, Collection<Event> lev){
			try{
				
		//		MessageDialog.openInformation(shell, "ReadEventLog", "queryExecutedActs 1"); // stop here
				
				
				lev = elc.queryExecutedActs(null);
				
			//	MessageDialog.openInformation(shell, "ReadEventLog", "queryExecutedActs 2");
				
				for(Event ev : lev)
				{
					Fact fact  = (Fact)ev.getContent().getFact();
					Actor ag = ev.getAsserter();
					System.out.println("Actor: " + ag.getName());
					if( fact instanceof ExecutedAct){
						System.out.println("------ queryExecutedActs --------");
						ExecutedAct executed = (ExecutedAct)fact;
						Action dueTo = executed.getDueTo();
						if(dueTo == null){
							//System.out.println("NULL DueTo" );
						}else{
							Actor dueToActor = dueTo.getByActor();
							System.out.println("Due to Actor: " + dueToActor.getName());
							
							EList<Enactment> enact = dueTo.getEnactment();
							for(Iterator<Enactment> itr = enact.iterator(); itr.hasNext();){
								Enactment e = itr.next();
					//			if(e.getFinishTime() != null)
					//				System.out.println("Enactment start: " + e.getStartTime() + ", finish: " + e.getFinishTime());
								if(e instanceof PlanEnactment){
									Plan plan = ((PlanEnactment)e).getPlan();
									System.out.println("Plan: " + plan.getName());
									PlanInfo planInfo = new PlanInfo(plan);
									
									ActionGroundingList actionList = plan.getHasAtomicProcessGroundingList();
									ActionGrounding actionG = actionList.getFirst();
									if(actionG == null) continue;
									net.sf.ictalive.coordination.actions.Action action1 = actionG.getOwlsProcess();
									System.out.println("** First Action Name: " + action1.getName());
									planInfo.addAction(action1);
									addRoleTaskInfo(ag, action1);
									ActionGroundingList actionRest = actionList.getRest();
								    flag = true;
									while(flag){
										actionRest = getActionGroundingList(actionRest, planInfo, ag);
									}
									addPlan(planInfo);
								}
							}
						}
						
						

					}
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		private  void addRoleTaskInfo(Actor ag, net.sf.ictalive.coordination.actions.Action action){
			for(int i=0; i<roleTaskList.size(); i++){
				RoleTaskInfo rti = roleTaskList.get(i);
				if(rti.role.getName().equals(ag.getName()) && 
						rti.task.getName().equals(action.getName()))
					return;
			}
			RoleTaskInfo rti = new RoleTaskInfo(ag, action);
			roleTaskList.add(rti);
		}
		
		public  ActionGroundingList getActionGroundingList(ActionGroundingList actionRest, PlanInfo planInfo, Actor ag){
			//ActionGroundingList actionRest = list.getRest();
			if(actionRest != null){
				ActionGrounding actionFirst = actionRest.getFirst();
				if (actionFirst == null) 	{			
					flag = false; 
					return null;
				}
				net.sf.ictalive.coordination.actions.Action action2 = actionFirst.getOwlsProcess();
				if(action2 == null) 
					flag = false;
				planInfo.addAction(action2);
				addRoleTaskInfo(ag, action2);
				System.out.println("** Rest Action Name: " + action2.getName());
			}else	{
				flag = false;
				return null;
			}
			return actionRest.getRest();
		}
		
		private  void addPlan(PlanInfo plan){
			if(planList.contains(plan)) return;
			int index = -1;
			boolean b_added = true;
			for(int i=0; i<planList.size(); i++){
				String name = planList.get(i).getName();
				if(plan.getName().equals(name)){
					if(plan.getActionList().size() == planList.get(i).getActionList().size()) b_added = false; // same size, not added
					else if (plan.getActionList().size() > planList.get(i).getActionList().size()){  // if larger size
						index = i;
					}
				}
			}
			if(index >= 0)
				planList.remove(index);
			if(b_added) planList.add(plan);
		}
		
		private  void queryNormInstanceActivations(EventLogClient elc, Collection<Event> lev){
			try{
				lev = elc.queryNormInstanceActivations(null, null);
				for(Event ev : lev)
				{
					NormInstanceActivated niv = (NormInstanceActivated)ev.getContent().getFact();
					NormInstance ni = niv.getNormInstance();
					System.out.println("NormInstanceActivation " + ni.getName());
					System.out.println("Actor: " + ev.getAsserter().getName());
					Norm norm = ni.getNorm();
					if(norm != null)
						System.out.println("NormID " + norm.getNormID());  // norm == null
					RoleDeonticStatement rds = (RoleDeonticStatement)norm.getDeontics();
					if(rds != null){
						Role role = rds.getRole();
						System.out.println("Role: " + role.getName());
					}
					
					if(ev.getAsserter().getAgent() != null) // agent == null
						System.out.println("Agent: " + ev.getAsserter().getAgent().getName());
					
					Action dueTo = niv.getDueTo();
					if(dueTo != null){
						Actor actor = dueTo.getByActor();
						if(actor != null)
							System.out.println("Actor: " + actor.getName());
						EList<Result> results = dueTo.getResult();
						for(Iterator<Result> itr = results.iterator(); itr.hasNext();){
							Result r = itr.next();
							if(r != null)
								System.out.println("Result: " + r.toString());
						}
					}
					
				}
				
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}

		
		private  void queryNormInstanceViolations(EventLogClient elc, Collection<Event> lev){
			try{
				lev = elc.queryNormInstanceViolations(null, null);
				for(Event ev : lev)
				{
					NormInstanceViolated niv = (NormInstanceViolated)ev.getContent().getFact();
					NormInstance ni = niv.getNormInstance();
					System.out.println("NormInstance " + ni.getName());
					System.out.println("Actor: " + ev.getAsserter().getName());
					Norm norm = ni.getNorm();
					if(norm != null)
						System.out.println("NormID " + norm.getNormID());  // norm == null
					if(ev.getAsserter().getAgent() != null) // agent == null
						System.out.println("Agent: " + ev.getAsserter().getAgent().getName());
					
					Action dueTo = niv.getDueTo();
					if(dueTo != null){
						Actor actor = dueTo.getByActor();
						if(actor != null)
							System.out.println("Actor 2: " + actor.getName());
						EList<Result> results = dueTo.getResult();
						for(Iterator<Result> itr = results.iterator(); itr.hasNext();){
							Result r = itr.next();
							if(r != null)
								System.out.println("Result: " + r.toString());
						}
					}
					
				}
				
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		public ArrayList<RoleTaskInfo> getRoleTaskInfoLIst() {return roleTaskList; }
		public List<PlanInfo> getEnactmentList(){ return planList;}
	}

