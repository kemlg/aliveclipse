package net.sf.ictalive.coordination.wfvv.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionEnactment2EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingListEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActorEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AgentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AgentReplanEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AvailabilityEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CompositeActionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ContentContentFigureEffectCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ContentContentFigureFactCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CoordinationActionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.DeadlineViolationEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.DisasterEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EnactmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.Event2EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.Event3EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventEventFigureFactCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventGroupEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventModelContainerEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ExecutedActEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FailureActEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.NormInstanceViolatedEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.NotifyStateOfWorldEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ObjectiveEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanDistributionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanEnactmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanExecutionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanScheduleEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanSynthesisEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ReceiveActEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ReplaceAgentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ResourceEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ResultEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.SendActEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ServiceInvocationEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.StartedActEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.TaskViolationEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.part.Messages;
import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class WfvvModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof EventGroupEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(WfvvElementTypes.Event_3029);
			return types;
		}
		if (editPart instanceof ActionGroundingListEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(WfvvElementTypes.ActionGrounding_3027);
			return types;
		}
		if (editPart instanceof ReceiveActEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(WfvvElementTypes.Message_3009);
			return types;
		}
		if (editPart instanceof SendActEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(WfvvElementTypes.Message_3011);
			return types;
		}
		if (editPart instanceof PlanSynthesisEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(WfvvElementTypes.Parameter_3016);
			types.add(WfvvElementTypes.Result_3017);
			return types;
		}
		if (editPart instanceof PlanDistributionEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(WfvvElementTypes.Parameter_3016);
			types.add(WfvvElementTypes.Result_3017);
			return types;
		}
		if (editPart instanceof PlanScheduleEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(WfvvElementTypes.Parameter_3016);
			types.add(WfvvElementTypes.Result_3017);
			return types;
		}
		if (editPart instanceof PlanExecutionEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(WfvvElementTypes.Parameter_3016);
			types.add(WfvvElementTypes.Result_3017);
			return types;
		}
		if (editPart instanceof ServiceInvocationEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(WfvvElementTypes.Parameter_3016);
			types.add(WfvvElementTypes.Result_3017);
			return types;
		}
		if (editPart instanceof ReplaceAgentEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(WfvvElementTypes.Parameter_3016);
			types.add(WfvvElementTypes.Result_3017);
			return types;
		}
		if (editPart instanceof AgentReplanEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(WfvvElementTypes.Parameter_3016);
			types.add(WfvvElementTypes.Result_3017);
			return types;
		}
		if (editPart instanceof NotifyStateOfWorldEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(WfvvElementTypes.Parameter_3016);
			types.add(WfvvElementTypes.Result_3017);
			return types;
		}
		if (editPart instanceof EventEventFigureFactCompartmentEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(WfvvElementTypes.ActorView_3001);
			types.add(WfvvElementTypes.Content_3002);
			return types;
		}
		if (editPart instanceof ContentContentFigureFactCompartmentEditPart) {
			ArrayList types = new ArrayList(10);
			types.add(WfvvElementTypes.StartedAct_3003);
			types.add(WfvvElementTypes.ExecutedAct_3004);
			types.add(WfvvElementTypes.FailureAct_3005);
			types.add(WfvvElementTypes.Disaster_3006);
			types.add(WfvvElementTypes.NormInstanceViolated_3007);
			types.add(WfvvElementTypes.ReceiveAct_3008);
			types.add(WfvvElementTypes.SendAct_3010);
			types.add(WfvvElementTypes.DeadlineViolation_3012);
			types.add(WfvvElementTypes.TaskViolation_3013);
			types.add(WfvvElementTypes.Availability_3014);
			return types;
		}
		if (editPart instanceof ContentContentFigureEffectCompartmentEditPart) {
			ArrayList types = new ArrayList(9);
			types.add(WfvvElementTypes.PlanSynthesis_3015);
			types.add(WfvvElementTypes.PlanDistribution_3018);
			types.add(WfvvElementTypes.PlanSchedule_3019);
			types.add(WfvvElementTypes.PlanExecution_3020);
			types.add(WfvvElementTypes.ServiceInvocation_3021);
			types.add(WfvvElementTypes.ReplaceAgent_3022);
			types.add(WfvvElementTypes.AgentReplan_3023);
			types.add(WfvvElementTypes.NotifyStateOfWorld_3024);
			types.add(WfvvElementTypes.CoordinationAction_3028);
			return types;
		}
		if (editPart instanceof EventModelContainerEditPart) {
			ArrayList types = new ArrayList(16);
			types.add(WfvvElementTypes.Event_2023);
			types.add(WfvvElementTypes.Event_2024);
			types.add(WfvvElementTypes.ActionEnactment_2020);
			types.add(WfvvElementTypes.PlanEnactment_2021);
			types.add(WfvvElementTypes.Enactment_2025);
			types.add(WfvvElementTypes.Plan_2014);
			types.add(WfvvElementTypes.Agent_2015);
			types.add(WfvvElementTypes.Actor_2026);
			types.add(WfvvElementTypes.Service_2016);
			types.add(WfvvElementTypes.Objective_2017);
			types.add(WfvvElementTypes.Resource_2027);
			types.add(WfvvElementTypes.AtomicAction_2018);
			types.add(WfvvElementTypes.CompositeAction_2019);
			types.add(WfvvElementTypes.EventGroup_2028);
			types.add(WfvvElementTypes.EventGroup_2029);
			types.add(WfvvElementTypes.ActionGroundingList_2022);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof EventEditPart) {
			return ((EventEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Event2EditPart) {
			return ((Event2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActionEnactment2EditPart) {
			return ((ActionEnactment2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PlanEnactmentEditPart) {
			return ((PlanEnactmentEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EnactmentEditPart) {
			return ((EnactmentEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PlanEditPart) {
			return ((PlanEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActorEditPart) {
			return ((ActorEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActionGroundingListEditPart) {
			return ((ActionGroundingListEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StartedActEditPart) {
			return ((StartedActEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ExecutedActEditPart) {
			return ((ExecutedActEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof FailureActEditPart) {
			return ((FailureActEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof DisasterEditPart) {
			return ((DisasterEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof NormInstanceViolatedEditPart) {
			return ((NormInstanceViolatedEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ReceiveActEditPart) {
			return ((ReceiveActEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SendActEditPart) {
			return ((SendActEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof DeadlineViolationEditPart) {
			return ((DeadlineViolationEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof TaskViolationEditPart) {
			return ((TaskViolationEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AvailabilityEditPart) {
			return ((AvailabilityEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PlanSynthesisEditPart) {
			return ((PlanSynthesisEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PlanDistributionEditPart) {
			return ((PlanDistributionEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PlanScheduleEditPart) {
			return ((PlanScheduleEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PlanExecutionEditPart) {
			return ((PlanExecutionEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ServiceInvocationEditPart) {
			return ((ServiceInvocationEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ReplaceAgentEditPart) {
			return ((ReplaceAgentEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AgentReplanEditPart) {
			return ((AgentReplanEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof NotifyStateOfWorldEditPart) {
			return ((NotifyStateOfWorldEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CoordinationActionEditPart) {
			return ((CoordinationActionEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Event3EditPart) {
			return ((Event3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActionGroundingEditPart) {
			return ((ActionGroundingEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ActionEnactment2EditPart) {
			return ((ActionEnactment2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PlanEnactmentEditPart) {
			return ((PlanEnactmentEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EnactmentEditPart) {
			return ((EnactmentEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PlanEditPart) {
			return ((PlanEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AgentEditPart) {
			return ((AgentEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActorEditPart) {
			return ((ActorEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ObjectiveEditPart) {
			return ((ObjectiveEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ResourceEditPart) {
			return ((ResourceEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AtomicActionEditPart) {
			return ((AtomicActionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CompositeActionEditPart) {
			return ((CompositeActionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActionGroundingListEditPart) {
			return ((ActionGroundingListEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StartedActEditPart) {
			return ((StartedActEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ExecutedActEditPart) {
			return ((ExecutedActEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof FailureActEditPart) {
			return ((FailureActEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DisasterEditPart) {
			return ((DisasterEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof NormInstanceViolatedEditPart) {
			return ((NormInstanceViolatedEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ReceiveActEditPart) {
			return ((ReceiveActEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SendActEditPart) {
			return ((SendActEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DeadlineViolationEditPart) {
			return ((DeadlineViolationEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof TaskViolationEditPart) {
			return ((TaskViolationEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AvailabilityEditPart) {
			return ((AvailabilityEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PlanSynthesisEditPart) {
			return ((PlanSynthesisEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ResultEditPart) {
			return ((ResultEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PlanDistributionEditPart) {
			return ((PlanDistributionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PlanScheduleEditPart) {
			return ((PlanScheduleEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PlanExecutionEditPart) {
			return ((PlanExecutionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ServiceInvocationEditPart) {
			return ((ServiceInvocationEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ReplaceAgentEditPart) {
			return ((ReplaceAgentEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AgentReplanEditPart) {
			return ((AgentReplanEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof NotifyStateOfWorldEditPart) {
			return ((NotifyStateOfWorldEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CoordinationActionEditPart) {
			return ((CoordinationActionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActionGroundingEditPart) {
			return ((ActionGroundingEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof EventEditPart) {
			return ((EventEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Event2EditPart) {
			return ((Event2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActionEnactment2EditPart) {
			return ((ActionEnactment2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PlanEnactmentEditPart) {
			return ((PlanEnactmentEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EnactmentEditPart) {
			return ((EnactmentEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PlanEditPart) {
			return ((PlanEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActorEditPart) {
			return ((ActorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActionGroundingListEditPart) {
			return ((ActionGroundingListEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StartedActEditPart) {
			return ((StartedActEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ExecutedActEditPart) {
			return ((ExecutedActEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof FailureActEditPart) {
			return ((FailureActEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof DisasterEditPart) {
			return ((DisasterEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof NormInstanceViolatedEditPart) {
			return ((NormInstanceViolatedEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ReceiveActEditPart) {
			return ((ReceiveActEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SendActEditPart) {
			return ((SendActEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof DeadlineViolationEditPart) {
			return ((DeadlineViolationEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof TaskViolationEditPart) {
			return ((TaskViolationEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AvailabilityEditPart) {
			return ((AvailabilityEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PlanSynthesisEditPart) {
			return ((PlanSynthesisEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PlanDistributionEditPart) {
			return ((PlanDistributionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PlanScheduleEditPart) {
			return ((PlanScheduleEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PlanExecutionEditPart) {
			return ((PlanExecutionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ServiceInvocationEditPart) {
			return ((ServiceInvocationEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ReplaceAgentEditPart) {
			return ((ReplaceAgentEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AgentReplanEditPart) {
			return ((AgentReplanEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof NotifyStateOfWorldEditPart) {
			return ((NotifyStateOfWorldEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CoordinationActionEditPart) {
			return ((CoordinationActionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Event3EditPart) {
			return ((Event3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActionGroundingEditPart) {
			return ((ActionGroundingEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ActionEnactment2EditPart) {
			return ((ActionEnactment2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PlanEnactmentEditPart) {
			return ((PlanEnactmentEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EnactmentEditPart) {
			return ((EnactmentEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PlanEditPart) {
			return ((PlanEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AgentEditPart) {
			return ((AgentEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActorEditPart) {
			return ((ActorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ObjectiveEditPart) {
			return ((ObjectiveEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ResourceEditPart) {
			return ((ResourceEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AtomicActionEditPart) {
			return ((AtomicActionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CompositeActionEditPart) {
			return ((CompositeActionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActionGroundingListEditPart) {
			return ((ActionGroundingListEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StartedActEditPart) {
			return ((StartedActEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ExecutedActEditPart) {
			return ((ExecutedActEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof FailureActEditPart) {
			return ((FailureActEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DisasterEditPart) {
			return ((DisasterEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof NormInstanceViolatedEditPart) {
			return ((NormInstanceViolatedEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ReceiveActEditPart) {
			return ((ReceiveActEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SendActEditPart) {
			return ((SendActEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DeadlineViolationEditPart) {
			return ((DeadlineViolationEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof TaskViolationEditPart) {
			return ((TaskViolationEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AvailabilityEditPart) {
			return ((AvailabilityEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PlanSynthesisEditPart) {
			return ((PlanSynthesisEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ResultEditPart) {
			return ((ResultEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PlanDistributionEditPart) {
			return ((PlanDistributionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PlanScheduleEditPart) {
			return ((PlanScheduleEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PlanExecutionEditPart) {
			return ((PlanExecutionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ServiceInvocationEditPart) {
			return ((ServiceInvocationEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ReplaceAgentEditPart) {
			return ((ReplaceAgentEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AgentReplanEditPart) {
			return ((AgentReplanEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof NotifyStateOfWorldEditPart) {
			return ((NotifyStateOfWorldEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CoordinationActionEditPart) {
			return ((CoordinationActionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActionGroundingEditPart) {
			return ((ActionGroundingEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof EventEditPart) {
			return ((EventEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Event2EditPart) {
			return ((Event2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActionEnactment2EditPart) {
			return ((ActionEnactment2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PlanEnactmentEditPart) {
			return ((PlanEnactmentEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EnactmentEditPart) {
			return ((EnactmentEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PlanEditPart) {
			return ((PlanEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActorEditPart) {
			return ((ActorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActionGroundingListEditPart) {
			return ((ActionGroundingListEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StartedActEditPart) {
			return ((StartedActEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ExecutedActEditPart) {
			return ((ExecutedActEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof FailureActEditPart) {
			return ((FailureActEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof DisasterEditPart) {
			return ((DisasterEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof NormInstanceViolatedEditPart) {
			return ((NormInstanceViolatedEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ReceiveActEditPart) {
			return ((ReceiveActEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SendActEditPart) {
			return ((SendActEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof DeadlineViolationEditPart) {
			return ((DeadlineViolationEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof TaskViolationEditPart) {
			return ((TaskViolationEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AvailabilityEditPart) {
			return ((AvailabilityEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PlanSynthesisEditPart) {
			return ((PlanSynthesisEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PlanDistributionEditPart) {
			return ((PlanDistributionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PlanScheduleEditPart) {
			return ((PlanScheduleEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PlanExecutionEditPart) {
			return ((PlanExecutionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ServiceInvocationEditPart) {
			return ((ServiceInvocationEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ReplaceAgentEditPart) {
			return ((ReplaceAgentEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AgentReplanEditPart) {
			return ((AgentReplanEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof NotifyStateOfWorldEditPart) {
			return ((NotifyStateOfWorldEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CoordinationActionEditPart) {
			return ((CoordinationActionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Event3EditPart) {
			return ((Event3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActionGroundingEditPart) {
			return ((ActionGroundingEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				WfvvDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.WfvvModelingAssistantProviderMessage);
		dialog.setTitle(Messages.WfvvModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
