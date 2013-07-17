package net.sf.ictalive.monitortool.JungVisualization;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import net.sf.ictalive.coordination.actions.impl.CompositeActionImpl;
import net.sf.ictalive.coordination.tasks.InputMessageMap;
import net.sf.ictalive.coordination.tasks.impl.PlanImpl;
import net.sf.ictalive.coordination.tasks.impl.TaskImpl;
import net.sf.ictalive.operetta.OM.ActionDescription;
import net.sf.ictalive.operetta.OM.Arc;
import net.sf.ictalive.operetta.OM.Concept;
import net.sf.ictalive.operetta.OM.Context;
import net.sf.ictalive.operetta.OM.CountsAs;
import net.sf.ictalive.operetta.OM.CountsAsConcreteFact;
import net.sf.ictalive.operetta.OM.Dependency;
import net.sf.ictalive.operetta.OM.Landmark;
import net.sf.ictalive.operetta.OM.Norm;
import net.sf.ictalive.operetta.OM.Objective;
import net.sf.ictalive.operetta.OM.Ontology;
import net.sf.ictalive.operetta.OM.PartialOrder;
import net.sf.ictalive.operetta.OM.PartialStateDescription;
import net.sf.ictalive.operetta.OM.Player;
import net.sf.ictalive.operetta.OM.Right;
import net.sf.ictalive.operetta.OM.Role;
import net.sf.ictalive.operetta.OM.Scene;
import net.sf.ictalive.operetta.OM.Term;
import net.sf.ictalive.operetta.OM.Transition;
import net.sf.ictalive.operetta.OM.TransitionNorm;
import net.sf.ictalive.operetta.OM.impl.ActionsImpl;
import net.sf.ictalive.operetta.OM.impl.ArcImpl;
import net.sf.ictalive.operetta.OM.impl.CSImpl;
import net.sf.ictalive.operetta.OM.impl.ConceptImpl;
import net.sf.ictalive.operetta.OM.impl.ContextImpl;
import net.sf.ictalive.operetta.OM.impl.CountsAsConcreteFactImpl;
import net.sf.ictalive.operetta.OM.impl.CountsAsImpl;
import net.sf.ictalive.operetta.OM.impl.DependencyImpl;
import net.sf.ictalive.operetta.OM.impl.ISImpl;
import net.sf.ictalive.operetta.OM.impl.LandmarkImpl;
import net.sf.ictalive.operetta.OM.impl.NSImpl;
import net.sf.ictalive.operetta.OM.impl.NormImpl;
import net.sf.ictalive.operetta.OM.impl.OMImpl;
import net.sf.ictalive.operetta.OM.impl.ObjectiveImpl;
import net.sf.ictalive.operetta.OM.impl.OntologyImpl;
import net.sf.ictalive.operetta.OM.impl.PartialStateDescriptionImpl;
import net.sf.ictalive.operetta.OM.impl.PlayerImpl;
import net.sf.ictalive.operetta.OM.impl.RoleDeonticStatementImpl;
import net.sf.ictalive.operetta.OM.impl.RoleImpl;
import net.sf.ictalive.operetta.OM.impl.SSImpl;
import net.sf.ictalive.operetta.OM.impl.SceneImpl;
import net.sf.ictalive.operetta.OM.impl.SceneToTransitionArcImpl;
import net.sf.ictalive.operetta.OM.impl.TermImpl;
import net.sf.ictalive.operetta.OM.impl.TransitionNormImpl;
import net.sf.ictalive.operetta.OM.impl.TransitionToSceneArcImpl;
import net.sf.ictalive.owls.expr.Condition;
import net.sf.ictalive.owls.expr.impl.ConditionImpl;
import net.sf.ictalive.owls.expr.impl.ExpressionImpl;
import net.sf.ictalive.owls.process.Binding;
import net.sf.ictalive.owls.process.ControlConstruct;
import net.sf.ictalive.owls.process.impl.PerformImpl;
import net.sf.ictalive.runtime.action.MatchmakerQuery;
import net.sf.ictalive.runtime.action.Parameter;
import net.sf.ictalive.runtime.action.Result;
import net.sf.ictalive.runtime.action.impl.MatchmakerQueryImpl;
import net.sf.ictalive.runtime.enactment.Enactment;
import net.sf.ictalive.runtime.enactment.PlanEnactment;
import net.sf.ictalive.runtime.enactment.Resource;
import net.sf.ictalive.runtime.enactment.impl.PlanEnactmentImpl;
import net.sf.ictalive.runtime.event.Event;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import net.sf.ictalive.runtime.fact.CommunicativeAct;
import net.sf.ictalive.runtime.fact.Content;
import net.sf.ictalive.runtime.fact.Fact;
import net.sf.ictalive.runtime.fact.Message;
import net.sf.ictalive.runtime.fact.impl.NormInstanceActImpl;
import net.sf.ictalive.runtime.fact.impl.NormInstanceActivatedImpl;
import net.sf.ictalive.runtime.fact.impl.NormInstanceViolatedImpl;
import net.sf.ictalive.runtime.fact.impl.SendActImpl;
import net.sf.ictalive.runtime.NormInstances.PartialStateDescriptionInstance;
import net.sf.ictalive.runtime.NormInstances.NormInstance;
import net.sf.ictalive.runtime.NormInstances.impl.PartialStateDescriptionInstanceImpl;
public class JungEventGraphBuilder 
{

		
		public  Graph<? extends Object,? extends Object> event_graph(Event e) throws EventTypeNotSupportedException
		{
			
				
			
			Graph<String, String> g = null;
			g = new SparseMultigraph<String, String>();
			String HTMLCODE = "<html>" +
	 		"<Center><b>Event</b></center><hr>" +
	 		"<hr>" +
	 		"<b>Key: </b>" + e.getLocalKey().getId() + "" +
	 		"<hr>" +
	 		"<b>Point of View: </b>" + e.getPointOfView().getClass().getCanonicalName() + "" +
	 		"<hr>" +
	 		"<b>Timestamp: </b>" + e.getTimestamp() + "" +
	 		"<hr>" +
	 		"<b>Asserter: </b><ul><li><b>Name</b>: " + e.getAsserter().getName() + "<li><b>URL</b>: " + e.getAsserter().getUrl() + "</ul>" +			 		
	 		//"<hr>Content: " + e.getContent().getFact().getClass().getCanonicalName() + "<hr>" +
	 		"</html>";
			 g.addVertex(HTMLCODE);	
			Content EventContent = e.getContent();
			ProcessContent(EventContent.getFact(),g,HTMLCODE,"Event Content");						 
			return g;
		}
		
		/*
		 * 
		 * igomez : Obsolete
		 */
		//Process Content
		/*
		private void ProcessContent(EObject EventContent,Graph<String, String> g, String rootCode) throws EventTypeNotSupportedException
		{
			
			if (NormInstanceActivatedImpl.class == EventContent.getFact().getClass())
			{
				NormInstanceActivatedImpl NormInstanceContentImpl = (NormInstanceActivatedImpl)EventContent.getFact();
				NormInstance NormInstanceContent = NormInstanceContentImpl.getNormInstance();
				ProcessContent(NormInstanceContent,g,rootCode);
				return;
			}	
			if (SendActImpl.class == EventContent.getFact().getClass())
			{
				SendActImpl SendActContentImpl = (SendActImpl)EventContent.getFact();				
				Message SendActContent = SendActContentImpl.getSendMessage();				
				ProcessContent(SendActContent,g,rootCode);
				return;
			}
				throw new EventTypeNotSupportedException(EventContent.getClass().getCanonicalName());
		}
		
		*/
		
		/*Deals with the following instances:
			� NormInstanceActivatedImpl
			� PartialStateDescriptionInstanceImpl
			� PartialStateDescriptionImpl
			� RoleDeonticStatementImpl
		*/
		private void ProcessContent(EObject EventContent,Graph<String, String> g, String rootCode, String archLabel) throws EventTypeNotSupportedException
		{
			String Code;			
			if (EventContent == null)
			{
				return;
			}
			else
			{
				System.out.println("Processing content of class-->'" + EventContent.getClass().getCanonicalName() + "'");
			}
			//NormInstanceActivated
			if (NormInstanceActivatedImpl.class == EventContent.getClass() || NormInstanceViolatedImpl.class == EventContent.getClass())
			{
				NormInstanceActImpl NormInstanceContentImpl = (NormInstanceActImpl)EventContent;
				
				//Norm Instance information
				NormInstance CastedClass = NormInstanceContentImpl.getNormInstance();
				Code = "<html>" +
		 		"<Center><b>Norm Instance</b></center><hr>" +
		 		"<hr>" +
		 		"<b>Name: </b>" + CastedClass.getName() + "" +
		 		"<hr>" +		
		 		"<hr>" +
		 		"<b>Norm ID: </b>" + CastedClass.getNorm().getNormID() + "" +
		 		"<hr>" +	 		
		 		"<hr>" +
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
				
				//PSD Inside the norm Instance
				Iterator<PartialStateDescriptionInstance> it = CastedClass.getPartialStateDescriptionInstance().iterator();
				while (it.hasNext())
				{
					ProcessContent((PartialStateDescriptionInstance)it.next(),g,Code,"Instantiation");	
				}
				
				//Conditions and deontics on the norm instance
				ProcessContent(CastedClass.getNorm().getActivatingCondition(),g,Code,"Activating Condition");	
				ProcessContent(CastedClass.getNorm().getTimeout(),g,Code,"Timeout");	
				ProcessContent(CastedClass.getNorm().getDeontics(),g,Code,"Deontics");	
				ProcessContent(CastedClass.getNorm().getRepairCondition(),g,Code,"Repair Condition");	
				ProcessContent(CastedClass.getNorm().getDeactivatingCondition(),g,Code,"Deactivating Condition");	
				ProcessContent(CastedClass.getNorm().getMaintenanceCondition(),g,Code,"Mainteinance Condition");	
				
				
				return;
			}
			if (PartialStateDescriptionInstanceImpl.class == EventContent.getClass())
			{
				PartialStateDescriptionInstanceImpl CastedClass = (PartialStateDescriptionInstanceImpl)EventContent;
				Code = "<html><Center><b>Partial State Description Instantiation</b></center><hr>" +		 		
		 		"<b>Name: </b>" + CastedClass.getName() + "" +		 		
		 		"</html>";				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
				return;
			}
			if (getPartialStateDescriptionImpl(EventContent) != "")
			{				
				Code = "<html><Center><b>Partial State Description</b></center><hr>" +
		 		"<hr>" +
		 		"<b>Name: </b>" + getPartialStateDescriptionImpl(EventContent) + "" +
		 		"<hr>" +			 		
		 		"</html>";			
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
				return;
			}						
			if (RoleDeonticStatementImpl.class == EventContent.getClass())
			{
				RoleDeonticStatementImpl CastedClass = (RoleDeonticStatementImpl)EventContent;
				Code = "<html><Center><b>Deontics</b></center><hr>" +
		 		"<hr>" +
		 		"<b>Modality: </b>" + CastedClass.getModality().getName() + "" +
		 		"<hr>" +			 		
		 		"<b>Objective: </b>" + CastedClass.getWhat().getID() + "" +
		 		"<hr>" +
		 		"</html>";				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
				return;
			}
			
			if (ArcImpl.class == EventContent.getClass())
			{
				ArcImpl CastedClass = (ArcImpl)EventContent;
				Code = "<html><Center><b>Arc</b></center><hr>" +
		 		"<hr>" +
		 		"<b>Name: </b>" + CastedClass.getArcID() + "" +		 		
		 		"</html>";				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
				
				//PSD Inside the norm Instance
				Iterator<Role> it = CastedClass.getAccessible().iterator();
				while (it.hasNext())
				{
					ProcessContent((RoleImpl)it.next(),g,Code,"Accessible");	
				}
				return;
			}
			
			if (RoleImpl.class == EventContent.getClass())
			{
				RoleImpl CastedClass = (RoleImpl)EventContent;				
				
				String Rights = "<HR><center><b>Rights</b></center>";
				Iterator<Right> itRights = CastedClass.getRights().iterator();
				while (itRights.hasNext())
				{
					Right dummy = (Right)itRights.next();
					Rights = Rights + "<UL>" +
					"<LI><b>Name:</b>" + dummy.getName() +
					"<LI><b>Expression:</b>" + dummy.getExpr().getID() +
					"</UL>";
				}
				
				Code = "<html><Center><b>Role</b></center><hr>" +
		 		"<hr>" +
		 		"<b>Name: </b>" +CastedClass.getName() + "" +
		 		"<br>" +
		 		"<b>Type: </b>" +CastedClass.getRoleType().getName() + "" +
		 		"<br>" +
		 		"<hr>";
		 		if (CastedClass.getConceptName() != null)
		 		{
		 			Code = Code + "<b>Concept</b><br>" + 
			 		"<UL>" + 		 		
			 		"<LI>" + CastedClass.getConceptName().getConcept() + 
			 		"<LI>" + CastedClass.getConceptName().getType() +
			 		"<LI>" + CastedClass.getConceptName().getURI() +
			 		"</UL>" +
			 		"<hr>";
		 		}
				Code = Code + "<br>" + Rights +
		 		"</html>";				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
				
				Iterator<Objective> it = CastedClass.getObjectives().iterator();
				while (it.hasNext())
				{
					Objective dummy = (Objective)it.next();
					ProcessContent(dummy,g,Code,"Objective " + dummy.getName());	
				}
				
				
				
				/*
				 * TODO: Fix null pointer exception
				 * 
				Iterator<Norm> ittt = CastedClass.getNorms().iterator();
				while (ittt.hasNext())
				{
					ProcessContent((Norm)ittt.next(),g,Code,"Norms");	
				}
				*/
				
				/*
				 * TODO: Fix null pointer exception
				 * 
				Iterator<Dependency> itttt = CastedClass.getDependeeIn().iterator();
				while (itttt.hasNext())
				{
					ProcessContent((Dependency)itttt.next(),g,Code,"Depends in");	
				}
				*/
				
				/*
				 * TODO: Fix null pointer exception
				 * 
				Iterator<Dependency> ittttt = CastedClass.getDependantOn().iterator();
				while (ittttt.hasNext())
				{
					ProcessContent((RoleImpl)ittttt.next(),g,Code,"Dependant on");	
				}
				*/
				return;
			}
			
			if (OMImpl.class == EventContent.getClass())
			{
				OMImpl CastedClass = (OMImpl)EventContent;								
				
				Code = "<html>" +
		 		"<Center><b>Full Opera Model</b></center><hr>" +
		 		"<hr>" +
		 		"Only for testing porposes" +
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
															
				ProcessContent(CastedClass.getCs(),g,Code,"Concept Structure");	
				ProcessContent(CastedClass.getIs(),g,Code,"Interaction Structure");
				ProcessContent(CastedClass.getNs(),g,Code,"Normative Structure");
				ProcessContent(CastedClass.getSs(),g,Code,"Social Structure");
				
				return;
			}
			
			if (NSImpl.class == EventContent.getClass())
			{
				NSImpl CastedClass = (NSImpl)EventContent;
				
				Code = "<html>" +
		 		"<Center><b>Opera NS</b></center><hr>" +
		 		"<hr>" +
		 		"Only for testing porposes" +
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
							
				
				Iterator<Norm> itNorm = CastedClass.getNorms().iterator();
				while (itNorm.hasNext())
				{
					Norm dummy = (Norm)itNorm.next();
					ProcessContent(dummy,g,Code,"Norm " + dummy.getNormID());	
				}
				
				Iterator<TransitionNorm> itTransNorm = CastedClass.getTransitionNorms().iterator();
				while (itTransNorm.hasNext())
				{
					TransitionNorm dummy = (TransitionNorm)itTransNorm.next();
					ProcessContent(dummy,g,Code,"Transition Norm " + dummy.getID());	
				}
				
				CastedClass.getTransitionNorms();
				
				return;
				
			}
			
			if (NormImpl.class == EventContent.getClass())
			{
				NormImpl CastedClass = (NormImpl)EventContent;
				
				Code = "<html>" +
		 		"<Center><b>Norm</b></center><hr>" +
		 		"<hr>" +
		 		"<b>Name: </b>" + CastedClass.getNormID() + "" +		 					 	
		 		"<hr>" +
		 		"<center><b>Conditions</b></center><UL>";
		 		
				if (CastedClass.getActivatingCondition() != null)
				{
					Code = Code + "<LI><b>ActivationCondition:</b> " + CastedClass.getActivatingCondition().getID();
				}
				if (CastedClass.getTimeout() != null)
				{
					Code = Code + "<LI><b>Timeout:</b> " + CastedClass.getTimeout().getID();
				}
				if (CastedClass.getDeontics() != null)
				{
					Code = Code + "<LI><b>Deontics Modality:</b> " + CastedClass.getDeontics().getModality().getName()
					+ "<LI><b>Deontics What:</b> " + CastedClass.getDeontics().getWhat().getID();
				}				
				if (CastedClass.getDeactivatingCondition() != null)
				{
					Code = Code + "<LI><b>Expiration Condition:</b> " + CastedClass.getDeactivatingCondition().getID();
				}
				if (CastedClass.getMaintenanceCondition() != null)
				{
					Code = Code + "<LI><b>Mainteinance Condition:</b> " + CastedClass.getMaintenanceCondition().getID();
				}
				if (CastedClass.getRepairCondition() != null)
				{
					Code = Code + "<LI><b>Repair Condition:</b> " + CastedClass.getRepairCondition().getID();
				}
		 				 		
		 		Code = Code + "</UL>" + "</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
											
				/*
				ProcessContent(CastedClass.getActivationCondition(),g,Code,"Activation Condition " + CastedClass.getNormID());	
				ProcessContent(CastedClass.getDeadline(),g,Code,"Deadline"  + CastedClass.getNormID());	
				ProcessContent(CastedClass.getDeontics(),g,Code,"Deontics"  + CastedClass.getNormID());	
				ProcessContent(CastedClass.getExpirationCondition(),g,Code,"Expiration Condition"  + CastedClass.getNormID());	
				ProcessContent(CastedClass.getMaintenanceCondition(),g,Code,"Mainteinance Condition"  + CastedClass.getNormID());	
				*/
				return;
			}
			
			if (TransitionNormImpl.class == EventContent.getClass())
			{
				TransitionNormImpl CastedClass = (TransitionNormImpl)EventContent;
				
				CastedClass.getID();

				Code = "<html>" +
		 		"<Center><b>Transition Norm</b></center><hr>" +
		 		"<hr>" +
		 		"<b>Name: </b>" + CastedClass.getID() + "" +		 					 	
		 		"<hr>" +
		 		"<center><b>Conditions</b></center><UL>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
				return;
			}
			
			if (ISImpl.class == EventContent.getClass())
			{
				ISImpl CastedClass = (ISImpl)EventContent;
				
				Code = "<html>" +
		 		"<Center><b>Opera IS</b></center><hr>" +
		 		"<hr>" +
		 		"Only for testing porposes" +
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
											
				Iterator<Arc> itArcs = CastedClass.getArcs().iterator();
				while (itArcs.hasNext())
				{
									
					Arc dummy = (Arc)itArcs.next();
					ProcessContent(dummy,g,Code,"Arc " + dummy.getArcID());	
				}
								
				Iterator<Scene> itScenes = CastedClass.getScenes().iterator();
				while (itScenes.hasNext())
				{
									
					Scene dummy = (Scene)itScenes.next();
					ProcessContent(dummy,g,Code,"Scene " + dummy.getSceneID());	
				}
				
				Iterator<Transition> itTransitions = CastedClass.getTransitions().iterator();
				while (itTransitions.hasNext())
				{
									
					Transition dummy = (Transition)itTransitions.next();
					ProcessContent(dummy,g,Code,"Transition " + dummy.getTransitionID());	
				}
				
				return;
				
			}
			
			
			if (TransitionToSceneArcImpl.class == EventContent.getClass() || SceneToTransitionArcImpl.class == EventContent.getClass())
			{
				ArcImpl CastedClass = (ArcImpl)EventContent;
				
				Code = "<html>" +
		 		"<Center><b>Arc</b></center><hr>" +	
		 		"<b>ID:</b>" + CastedClass.getArcID() +
		 		"</html>";				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
				
				//System.out.println("--->" + CastedClass.getAccessible().size());
				
				Iterator<Role> itRoles= CastedClass.getAccessible().iterator();
				while (itRoles.hasNext())
				{
									
					Role dummy = (Role)itRoles.next();
					ProcessContent(dummy,g,Code,CastedClass.getArcID() + " Accessible from " + dummy.getName());	
				}
				
				return;
			}
			
			
			if (SSImpl.class == EventContent.getClass())
			{
				SSImpl CastedClass = (SSImpl)EventContent;
				
				Code = "<html>" +
		 		"<Center><b>Opera SS</b></center><hr>" +
		 		"<hr>" +
		 		"Only for testing porposes" +
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
							
				Iterator<Dependency> it = CastedClass.getDependencies().iterator();
				while (it.hasNext())
				{
									
					Dependency dummy = (Dependency)it.next();
					ProcessContent(dummy,g,Code,"Dependency " + dummy.getName());	
				}
				
				Iterator<Objective> itt = CastedClass.getObjectives().iterator();
				while (itt.hasNext())
				{
									
					Objective dummy = (Objective)itt.next();
					ProcessContent(dummy,g,Code,"Objective " + dummy.getName());	
				}
				
				Iterator<Role> ittt = CastedClass.getRoles().iterator();
				while (ittt.hasNext())
				{
									
					Role dummy = (Role)ittt.next();
					ProcessContent(dummy,g,Code,"Role " + dummy.getName());	
				}
				return;
				
			}
			
			
			if (getDependencyImpl(EventContent) != "")
			{
				
				Code = getDependencyImpl(EventContent);
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
				
				DependencyImpl CastedClass = (DependencyImpl)EventContent;
				
				Iterator<Objective> it = CastedClass.getObjectOfDependency().iterator();
				while (it.hasNext())
				{
					
					Objective CastedSubClass = (Objective)it.next();
					/*
					 * TODO: Fix, throws null pointer exception
					 */
					/*
					Iterator<Role> itt = CastedSubClass.getUsedByRole().iterator();					
					while (itt.hasNext())
					{
						Role CastedSubSubClass = itt.next();
						ProcessContent(CastedSubSubClass,g,Code,"Role " + CastedSubSubClass.getName());	
					}
					*/
				}
				
				return;
			}
						
			
			if (CSImpl.class == EventContent.getClass())
			{
				CSImpl CastedClass = (CSImpl)EventContent;
				
				Code = "<html>" +
		 		"<Center><b>Opera CS</b></center><hr>" +
		 		"<hr>" +
		 		"Only for testing porposes" +
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);																
				
				if (CastedClass.getActionLibrary() != null)
				{					
						ProcessContent(CastedClass.getActionLibrary(),g,Code,"Actions");						
				}
				
				/*
				Iterator<Context> itt = CastedClass.getContexts().iterator();
				while (itt.hasNext())
				{
									
					ProcessContent((Context)itt.next(),g,Code,"Contexts");	
				}
				*/				
				
				String CountsAs = "<html>"  + ProcessCountsAs(CastedClass.getCountsAsRules()) + "<html>";	
				g.addVertex(CountsAs);		
				g.addEdge("CountsAs rules",Code,CountsAs,EdgeType.DIRECTED);
				
				/*
				Iterator<CountsAs> ittt = CastedClass.getCountsAsRules().iterator();
				while (ittt.hasNext())
				{
					CountsAs dummy = (CountsAs)ittt.next();					
					ProcessContent(dummy,g,Code,"CountsAs rules");	
				}
				*/
				Iterator<PartialStateDescription> itttt = CastedClass.getFormulas().iterator();
				while (itttt.hasNext())
				{
					PartialStateDescription dummy = (PartialStateDescription)itttt.next();		
					ProcessContent(dummy,g,Code,"Formula " + dummy.getID());	
				}
				
				Iterator<Ontology> ittttt = CastedClass.getOntology().iterator();
				while (ittttt.hasNext())
				{
					Ontology onto = (Ontology)ittttt.next();
					ProcessContent(onto,g,Code,onto.getOntologyID() + " Ontology");	
				}
				
				Iterator<Term> itttttt = CastedClass.getTerms().iterator();
				while (itttttt.hasNext())
				{
					ProcessContent((Term)itttttt.next(),g,Code,"Terms");										
				}
				
				//ProcessContent(CastedClass.getDefaultOntology(),g,Code,"Default ontology");			
				
				return;
				
			}
			
			if (ActionsImpl.class == EventContent.getClass())
			{				
				ActionsImpl CastedClass = (ActionsImpl)EventContent;
				Iterator<ActionDescription> it = CastedClass.getActions().iterator();
				String result = "<html>";
				while (it.hasNext())
				{
					ActionDescription dummy = (ActionDescription)it.next();
					result = result + getActionsImpl(dummy);
				}				
				result = result + "</html>";
				g.addVertex(result);		
				g.addEdge(archLabel,rootCode,result,EdgeType.DIRECTED);	
				
				return;
			}
			
			if (ContextImpl.class == EventContent.getClass())
			{
				ContextImpl CastedClass = (ContextImpl)EventContent;
				
				Code = "<html>" +
		 		"<Center><b>Context</b></center><hr>" +	
		 		"<b>Name:</b>" + CastedClass.getName() +
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);	
				
				return;
			}
			
			if (CountsAsImpl.class == EventContent.getClass())
			{
				CountsAsImpl CastedClass = (CountsAsImpl)EventContent;
				
				Code = "<html>" +
		 		"<Center><b>Counts as rule</b></center><hr>" +	
		 		"<b>Abstract fact:</b>" + CastedClass.getAbstractFact().getID() + "<br>" +
		 		"<b>Concrete fact:</b>" + CastedClass.getConcreteFact().toString() + "<br>" +
		 		"<b>Context:</b>" + CastedClass.getContext().getName() +		 		
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);	
				
				return;
			}
			
			if (OntologyImpl.class == EventContent.getClass())
			{
				OntologyImpl CastedClass = (OntologyImpl)EventContent;								
				
				String Concepts = "";
				
				Iterator<Concept> it = CastedClass.getClasses().iterator();
				while (it.hasNext())
				{			
					Concept dummy = (Concept)it.next();
					Concepts = Concepts + "<hr><Center><b>Concept</b></center><hr>" +	
			 		"<b>Name:</b>" + dummy.getConcept() + "<br>" +
			 		"<b>URI:</b>" + dummy.getURI() + "<br>" +
			 		"<b>Type:</b>" + dummy.getType().toString();
					
				}				

				Code = "<html>" +
		 		"<Center><b>Ontology</b></center><hr>" +	
		 		"<b>ID:</b>" + CastedClass.getOntologyID() +	
		 		Concepts +
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel ,rootCode,Code,EdgeType.DIRECTED);	
				
				return;
				
			}
			
			if (ConceptImpl.class == EventContent.getClass())
			{
				ConceptImpl CastedClass = (ConceptImpl)EventContent;
				Code = "<html>" +
		 		"<Center><b>Concept</b></center><hr>" +	
		 		"<b>Name:</b>" + CastedClass.getConcept() + "<br>" +
		 		"<b>URI:</b>" + CastedClass.getURI() + "<br>" +
		 		"<b>Type:</b>" + CastedClass.getType().toString() +		 		
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);	
				
				return;
			}
			
			if (TermImpl.class == EventContent.getClass())
			{
				TermImpl CastedClass = (TermImpl)EventContent;
				
				Code = "<html>" +
		 		"<Center><b>Term</b></center><hr>" +	
		 		"<b>ID:</b>" + CastedClass.toString() +
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);	
				
				return;
			}
			
			if (SendActImpl.class == EventContent.getClass())
			{
				
				SendActImpl CastedClass = (SendActImpl)EventContent;
				
				Code = "<html>" +
		 		"<Center><b>SendAct</b></center><hr>" +	
		 		"<b>Sender:</b>" + CastedClass.getSender().getName() + "<br>" +
		 		"<b>Receiver:</b>" + CastedClass.getReceiver().getName() +
		 		
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);	
				
				if ( CastedClass.getDueTo() != null)
				{
					ProcessContent((EObject)CastedClass.getDueTo(),g,Code,"Send act due to");
				}
				
				if ( CastedClass.getEffect() != null)
				{
					ProcessContent((EObject)CastedClass.getEffect(),g,Code,"Send act effect");
				}
				
				if ( CastedClass.getRelate() != null)
				{
					Iterator<Fact> it = CastedClass.getRelate().iterator();
					int i = 0;
					while (it.hasNext())
					{
						ProcessContent((EObject)it.next(),g,Code,"Send act relate" + i);
						i++;
					}				
				}
				
				if ( CastedClass.getSendMessage() != null)
				{
					Iterator<EObject> it = CastedClass.getSendMessage().getObject().iterator();
					int i = 0;
					while (it.hasNext())
					{
						ProcessContent((EObject)it.next(),g,Code,"Send act content" + i);
						i++;
					}				
				}
				//throw new EventTypeNotSupportedException(EventContent.getClass().getCanonicalName());		
				return;
			}
			
			if (MatchmakerQueryImpl.class == EventContent.getClass())
			{
				MatchmakerQuery CastedClass = (MatchmakerQueryImpl)EventContent;																																																													
				
				Code = "<html>" +
		 		"<Center><b>MatchMakerQuery</b></center><hr>" +	
		 		"<b>Query:</b>" + CastedClass.getQuery() + "<br>" +
		 		"<b>By Actor:</b>" + CastedClass.getByActor().getName() +			 		
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
				
				if ( CastedClass.getCause() != null)
				{
					ProcessContent((EObject)CastedClass.getCause(),g,Code,"Matchmaker query cause");
				}
				
				if ( CastedClass.getEnactment() != null)
				{
					Iterator<Enactment> it = CastedClass.getEnactment().iterator();		
					int i = 0;
					while (it.hasNext())
					{
						ProcessContent((EObject)it.next(),g,Code,"Matchmaker Query enactment" + i);
						i++;
					}				
				}
				
				if ( CastedClass.getInput() != null)
				{
					Iterator<Parameter> it = CastedClass.getInput().iterator();		
					int i = 0;
					while (it.hasNext())
					{
						ProcessContent((EObject)it.next(),g,Code,"Matchmaker Query input" + i);
						i++;
					}				
				}
				
				if ( CastedClass.getResult() != null)
				{
					Iterator<Result> it = CastedClass.getResult().iterator();
					int i = 0;
					while (it.hasNext())
					{
						ProcessContent((EObject)it.next(),g,Code,"Matchmaker Query result" + i);
						i++;
					}				
				}												
				
				return;
				
			}
			
			if (PlanEnactmentImpl.class == EventContent.getClass())
			{
				
				PlanEnactmentImpl CastedClass = (PlanEnactmentImpl)EventContent;
				
				String resources = "";
				
				if (CastedClass.getResource().size() > 0)
				{
					resources = "<UL>";
					Iterator<Resource> it = CastedClass.getResource().iterator();							
					while (it.hasNext())
					{
						Resource dummy = it.next();
						resources = resources + "<LI>" + dummy.getUri();
					
					}
					resources = resources + "</UL>";
				}
				Code = "<html>" +
		 		"<Center><b>Plan Enactment</b></center><hr>" +	
		 		"<b>Session Id:</b>" + CastedClass.getSessionId() + "<br>" +
		 		"<b>Start Time:</b>" + CastedClass.getStartTime() + "<br>" +
		 		"<b>Finish Time:</b>" + CastedClass.getFinishTime() + "<br>" +
		 		"<b>Expire Time:</b>" + CastedClass.getExpireTime() + "<br>" +		 
		 		"<b>Resources:</b>" + resources +	
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
				
				if ( CastedClass.getPlan() != null)
				{
					ProcessContent((EObject)CastedClass.getPlan(),g,Code,"Plan Enactment plan");
				}
				
				
				return;
				
			}
			
			if (PlanImpl.class == EventContent.getClass())
			{
				PlanImpl CastedClass = (PlanImpl)EventContent;							
				
				Code = "<html>" +
		 		"<Center><b>Plan</b></center><hr>" +	
		 		"<b>Id:</b>" + CastedClass.getId() + "<br>" +
		 		"<b>Name:</b>" + CastedClass.getName() + "<br>" +
		 		"<b>Version:</b>" + CastedClass.getVersion() + 
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
				
				
				
				if ( CastedClass.getForTask() != null)
				{
					ProcessContent((EObject)CastedClass.getForTask(),g,Code,"Plan Task");
				}
				
				if ( CastedClass.getHasAtomicProcessGroundingList() != null)
				{
					ProcessContent((EObject)CastedClass.getHasAtomicProcessGroundingList(),g,Code,"Plan Grounding List");
				}
				
				
				
				return;
				
			}
			
			if (TaskImpl.class == EventContent.getClass())
			{
				TaskImpl CastedClass = (TaskImpl)EventContent;							
				
				Code = "<html>" +
		 		"<Center><b>Task</b></center><hr>" +	
		 		"<b>Id:</b>" + CastedClass.getId() + "<br>" +
		 		"<b>Name:</b>" + CastedClass.getName() + "<br>" +
		 		"<b>Version:</b>" + CastedClass.getVersion() + 
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
				
				if ( CastedClass.getHasResult() != null)
				{
					ProcessContent((EObject)CastedClass.getHasResult(),g,Code,"Task Result");
				}
				
				if ( CastedClass.getComponents() != null)
				{
					Iterator<ControlConstruct> it = CastedClass.getComponents().iterator();
					int i = 0;
					while (it.hasNext())
					{
						ProcessContent((EObject)it.next(),g,Code,"Task Component" + i);
						i++;
					}				
				}		
				
				if ( CastedClass.getHasPrecondition() != null)
				{
					Iterator<Condition> it = CastedClass.getHasPrecondition().iterator();
					int i = 0;
					while (it.hasNext())
					{
						ProcessContent((EObject)it.next(),g,Code,"Task Precondition" + i);
						i++;
					}				
				}		
				
				if ( CastedClass.getInput() != null)
				{
					Iterator<InputMessageMap> it = CastedClass.getInput().iterator();
					int i = 0;
					while (it.hasNext())
					{
						ProcessContent((EObject)it.next(),g,Code,"Task Input" + i);
						i++;
					}				
				}	
				
				return;
			}
			
			if (ExpressionImpl.class == EventContent.getClass() || ConditionImpl.class == EventContent.getClass())
			{
				
				ExpressionImpl CastedClass = (ExpressionImpl)EventContent;				
				
				String logical = "";
				if (CastedClass.getLogicLanguage() != null)
				{
					logical = "<b>Logical Language Literal:</b>" + CastedClass.getLogicLanguage().getLiteral() + "<br>" +
					"<b>Logical Language Name:</b>" + CastedClass.getLogicLanguage().getName() + "<br>" +
					"<b>Logical Language Value:</b>" + CastedClass.getLogicLanguage().getValue();
				}
				
				Code = "<html>" +
		 		"<Center><b>Expression</b></center><hr>" +	
		 		"<b>Id:</b>" + CastedClass.getId() + "<br>" +
		 		"<b>Name:</b>" + CastedClass.getName() + "<br>" +
		 		"<b>Version:</b>" + CastedClass.getVersion() +
		 		logical +
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
				
				return;
				
			}						
			
			if (PerformImpl.class == EventContent.getClass())
			{
				PerformImpl CastedClass = (PerformImpl)EventContent;							
				
						
						
				Code = "<html>" +
		 		"<Center><b>Perform</b></center><hr>" +	
		 		"<b>Id:</b>" + CastedClass.getId() + "<br>" +
		 		"<b>Name:</b>" + CastedClass.getName() + "<br>" +
		 		"<b>Version:</b>" + CastedClass.getVersion() + 
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
				
				if ( CastedClass.getProcess() != null)
				{
					ProcessContent((EObject)CastedClass.getProcess(),g,Code,"Perform process");
				}
				
				if ( CastedClass.getHasDataFrom() != null)
				{
					Iterator<Binding> it = CastedClass.getHasDataFrom().iterator();
					int i = 0;
					while (it.hasNext())
					{
						ProcessContent((EObject)it.next(),g,Code,"Perform Binding" + i);
						i++;
					}				
				}	
				
				return;
			}
			
			if (CompositeActionImpl.class == EventContent.getClass())
			{
				CompositeActionImpl CastedClass = (CompositeActionImpl)EventContent;							
													
				
				CastedClass.getCollapsesTo();
				CastedClass.getComposedOf();
				CastedClass.getComputedEffect();
				CastedClass.getComputedInput();
				CastedClass.getComputedOutput();
				CastedClass.getComputedPrecondition();
				
				
				CastedClass.getHasInput();
				CastedClass.getHasLocal();
				CastedClass.getHasOutput();
				CastedClass.getHasParameter();
				CastedClass.getHasParticipant();
				CastedClass.getHasPrecondition();
				CastedClass.getHasResult();
				
				String role = "";
				if (CastedClass.getPerformedByRole() != null)
				{
					role = "<b>Performed By role:</b>" + "<UL>"; 
					Iterator<String> it = CastedClass.getPerformedByRole().iterator();
					while (it.hasNext())
					{
						role = role + "<IL>" + it.next();
					}
					role = role + "</UL>";
				}
				
				Code = "<html>" +
		 		"<Center><b>Composite Action</b></center><hr>" +	
		 		"<b>Id:</b>" + CastedClass.getId() + "<br>" +
		 		"<b>Name:</b>" + CastedClass.getName() + "<br>" +
		 		"<b>Version:</b>" + CastedClass.getVersion() + "<br>" + 
		 		"<b>Performed By:</b>" + CastedClass.getPerformedBy() + "<br>" + 		
		 		"<b>Client ID:</b>" + CastedClass.getHasClient().getId() + "<br>" + 
		 		"<b>Client name:</b>" + CastedClass.getHasClient().getName() + "<br>" + 
		 		"<b>Client Ns:</b>" + CastedClass.getHasClient().getNs() + "<br>" + 
		 		"<b>Client Version:</b>" + CastedClass.getHasClient().getVersion() + "<br>" + 
		 		role + 
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
				
				return;
			}
			
			if (PlanImpl.class == EventContent.getClass())
			{
				PlanImpl CastedClass = (PlanImpl)EventContent;							
				
				Code = "<html>" +
		 		"<Center><b>Plan</b></center><hr>" +	
		 		"<b>Id:</b>" + CastedClass.getId() + "<br>" +
		 		"<b>Name:</b>" + CastedClass.getName() + "<br>" +
		 		"<b>Version:</b>" + CastedClass.getVersion() + 
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
			
				return;
			}
			
			
			
			if (ObjectiveImpl.class == EventContent.getClass())
			{
				ObjectiveImpl CastedClass = (ObjectiveImpl)EventContent;	
				
				Code = "<html>" +
		 		"<Center><b>Objective</b></center><hr>" +	
		 		"<b>Name:</b>" + CastedClass.getName() + "<br>" +
		 		"<b>Concept Name:</b>" + CastedClass.getConceptName() + "<br>";
		 		if (CastedClass.getStateDescription() != null)
		 		{
		 			Code = Code + "<b>PSD:</b>" + CastedClass.getStateDescription().getID();
		 		}
		 		Code = Code +
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);			
				
				return;
			}
			
			if (SceneImpl.class == EventContent.getClass())
			{
				SceneImpl CastedClass = (SceneImpl)EventContent;									
				
				
				
				String Order = "<hr><center><b>LandMark Order</b></center>";
				Iterator<PartialOrder> itOrder = CastedClass.getInteractionPattern().getLandmarkOrder().iterator();
				while (itOrder.hasNext())
				{
					PartialOrder dummy = (PartialOrder)itOrder.next();
					Order = Order + 
					"<UL><LI><b>Name</b>:" + dummy.getName() +
					"<LI><b>From</b>:" + dummy.getFrom() +
					"<LI><b>To</b>:" + dummy.getTo() + "</UL>";
				}												
								
				Code = "<html>" +
		 		"<Center><b>Scene</b></center><hr>" +	
		 		"<b>ID:</b>" + CastedClass.getSceneID() + "<br>" +
		 		"<b>Description:</b>" + CastedClass.getDescription() + "<br>" +
		 		"<b>Type:</b>" + CastedClass.getType() +
		 		Order +
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);										
				
				Iterator<Player> itPlayers = CastedClass.getPlayers().iterator();
				while (itPlayers.hasNext())
				{
					Player dummy = itPlayers.next();
					ProcessContent(dummy,g,Code,"Player " + dummy.getPlayerID());	
				}
				
				Iterator<Landmark> itResults= CastedClass.getResults().iterator();
				while (itResults.hasNext())
				{
					Landmark dummy = itResults.next();
					ProcessContent(dummy,g,Code,"Result " + dummy.getName());	
				}
				
				Iterator<Landmark> itlandMarks= CastedClass.getInteractionPattern().getLandmarks().iterator();
				while (itlandMarks.hasNext())
				{
					Landmark dummy = itlandMarks.next();
					ProcessContent(dummy,g,Code,"LandMark " + dummy.getName());	
				}
				return;
			}
			
			if (PlayerImpl.class == EventContent.getClass())
			{
				PlayerImpl CastedClass = (PlayerImpl)EventContent;		
				
				
				
				Code = "<html>" +
		 		"<Center><b>Player</b></center><hr>" +	
		 		"<b>ID:</b>" + CastedClass.getPlayerID() +
		 		"</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);			
				
				ProcessContent(CastedClass.getRole(),g,Code,"Role " + CastedClass.getRole().getName());
				
				return;
				
			}
			
			if (LandmarkImpl.class == EventContent.getClass())
			{
				LandmarkImpl CastedClass = (LandmarkImpl)EventContent;					
				
				
				Code = "<html>" +
				"<Center><b>Landmark</b></center><hr>" +	
		 		"<b>Name:</b>" + CastedClass.getName() + "<br>";
				if (CastedClass.getStateDescription() != null)
				{
					Code = Code + "<b>PSD:</b>" + CastedClass.getStateDescription().getID() + "<br>";
				}
		 		Code = Code + "</html>";
				
				g.addVertex(Code);		
				g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);			
				
				Iterator<Objective> itEntails= CastedClass.getEntails().iterator();
				while (itEntails.hasNext())
				{
					Objective dummy = itEntails.next();
					ProcessContent(dummy,g,Code,"Entails " + dummy.getName());	
				}
				
				return;
			}
			
			Code = "<html>" +
	 		"<Center><b>Error</b></center><hr>" +	
	 		"<b>Class:</b>" + EventContent.getClass().getCanonicalName() +
	 		"</html>";
			
			g.addVertex(Code);		
			g.addEdge(archLabel,rootCode,Code,EdgeType.DIRECTED);
			
			//return;
			throw new EventTypeNotSupportedException(EventContent.getClass().getCanonicalName());
		}
		
		
		
		private String ProcessCountsAs(EList<CountsAs> countsAsRules) 
		{
			String res = "";
			
			Iterator<CountsAs> it = countsAsRules.iterator();
			while (it.hasNext())
			{
				CountsAs CastedClass = (CountsAs)it.next();
				res = res +	"<HR>" +			
				"<Center><b>Counts as rule</b></center>" +	
		 		"<b>Abstract fact:</b>" + CastedClass.getAbstractFact().getID() + "<br>" +
		 		"<b>Concrete fact:</b>" + CastedClass.getConcreteFact().toString() + "<br>" +
		 		"<b>Context:</b>" + CastedClass.getContext().getName();
			}
			
			return res;
		}

		// Generic method to obtain a PartialStateDescriptionImpl, no matter if it is an atom, conjunction, negation, etc.
		private String getPartialStateDescriptionImpl(EObject eventContent) 
		{
			try
			{
				PartialStateDescriptionImpl impl = (PartialStateDescriptionImpl)eventContent;								
				return impl.getID();			
			}
			catch (java.lang.ClassCastException E)
			{
				return "";
			}
			
			
			
		}
		
		private String getActionsImpl(EObject eventContent) 
		{
			try
			{
				CountsAsConcreteFactImpl impl = (CountsAsConcreteFactImpl)eventContent;
							
				String result = "<hr><b><center>Action</center></b>" + impl.toString();
				return result;
			}
			catch (java.lang.ClassCastException E)
			{
				return "";
			}
			
			
			
		}
		
		private String getDependencyImpl(EObject eventContent)
		{
			try
			{
				DependencyImpl CastedClass = (DependencyImpl)eventContent;
				
				String Objectives = "";
				Iterator<Objective> it = CastedClass.getObjectOfDependency().iterator();
				while (it.hasNext())
				{
					Objective dummy = (Objective)it.next();
					Objectives = Objectives + 
					"<b>Name:</b>" + dummy.getName() + "<UL>";
					if (dummy.getConceptName() != null)
					{
						Objectives = Objectives + "<LI> <b>ConceptName:</b>" + dummy.getConceptName().getConcept() +
						"<LI> <b>ConceptURI:</b>" + dummy.getConceptName().getURI() + 
						"<LI> <b>ConceptType:</b>" + dummy.getConceptName().getType();
					}
					if (dummy.getStateDescription() != null)
					{
						Objectives = Objectives + "<LI> <b>PSD associated:</b>" + dummy.getStateDescription().getID();
					}
	
					
					Objectives = Objectives + "</UL>";
				}
				
				String Code = "<html>" +
		 		"<Center><b>Dependency</b></center><hr>" +
		 		"<hr>" +
		 		"<b>ID:</b>" + CastedClass.getID() + "<br>" +
		 		"<b>Name:</b>" + CastedClass.getName() + "<hr>" + "<center><b>Objectives</b></center>" +
		 		Objectives + "<hr>" +
		 		"</html>";
				return Code;
			}
			catch (java.lang.ClassCastException E)
			{
				return "";
			}
		}
		

		/*
		//Process Message content
		private void ProcessContent(Message EventContent,Graph<String, String> g, String rootCode)
		{			
			
			Iterator<EObject> it = EventContent.getObject().iterator();			
			
			String content = "<ul>" ;
			while (it.hasNext())
			{
				EObject contentPart = (EObject)it.next();
				content = content + ProcessContent(contentPart);
				
			}
			
			content = content + "</ul>";
			
			//Build the Norm Instance node
			String MessageCode = "<html>" +
	 		"<Center><b>SendMessage</b></center><hr>" +	 	
	 		"<b>Message Content: </b>" + content + "" +	 		
	 		"</html>";
			
			g.addVertex(MessageCode);		
			g.addEdge("Content",rootCode,MessageCode,EdgeType.DIRECTED);
		}
		
		*/
		//Builds a sample graph
	    public  static Graph<? extends Object,? extends Object> sample_graph()
	    {
	        Graph<String, String> g;	        
	        
	        // Create a dummy graph 1
	        g = new SparseMultigraph<String, String>();
	        // Add some vertices
	        g.addVertex("<html><b>IGNASI!!</b><hr>7 Caballos que vienen de bonanzarl! Jorl, finstro pecadol, me cago en tus muelas cobardel!!!<HR><center>Vertex<p> A");
	        g.addVertex("<html><b>IGNASI!!</b><hr>7 Caballos que vienen de bonanzarl! Jorl, finstro pecadol, me cago en tus muelas cobardel!!!<HR><center>Vertex<p> B");
	        g.addVertex("<html><b>IGNASI!!</b><hr>7 Caballos que vienen de bonanzarl! Jorl, finstro pecadol, me cago en tus muelas cobardel!!!<HR><center>Vertex<p> C");
	        g.addEdge("0", "<html><b>IGNASI!!</b><hr>7 Caballos que vienen de bonanzarl! Jorl, finstro pecadol, me cago en tus muelas cobardel!!!<HR><center>Vertex<p> A", "<html><b>IGNASI!!</b><hr>7 Caballos que vienen de bonanzarl! Jorl, finstro pecadol, me cago en tus muelas cobardel!!!<HR><center>Vertex<p> B");
	        g.addEdge("1", "<html><b>IGNASI!!</b><hr>7 Caballos que vienen de bonanzarl! Jorl, finstro pecadol, me cago en tus muelas cobardel!!!<HR><center>Vertex<p> B", "<html><b>IGNASI!!</b><hr>7 Caballos que vienen de bonanzarl! Jorl, finstro pecadol, me cago en tus muelas cobardel!!!<HR><center>Vertex<p> C");
	        g.addEdge("2", "<html><b>IGNASI!!</b><hr>7 Caballos que vienen de bonanzarl! Jorl, finstro pecadol, me cago en tus muelas cobardel!!!<HR><center>Vertex<p> C", "<html><b>IGNASI!!</b><hr>7 Caballos que vienen de bonanzarl! Jorl, finstro pecadol, me cago en tus muelas cobardel!!!<HR><center>Vertex<p> A");                           
	        
	        
	        return g;
	    }
		
		

	
}
