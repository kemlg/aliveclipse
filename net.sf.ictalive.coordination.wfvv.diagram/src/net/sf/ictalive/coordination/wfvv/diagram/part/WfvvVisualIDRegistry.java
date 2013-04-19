package net.sf.ictalive.coordination.wfvv.diagram.part;

import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.agents.AgentsPackage;
import net.sf.ictalive.coordination.tasks.TasksPackage;
import net.sf.ictalive.coordination.wfvv.EventGroup;
import net.sf.ictalive.coordination.wfvv.EventModelContainer;
import net.sf.ictalive.coordination.wfvv.WfvvPackage;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.*;
import net.sf.ictalive.coordination.wfvv.diagram.expressions.WfvvAbstractExpression;
import net.sf.ictalive.coordination.wfvv.diagram.expressions.WfvvOCLFactory;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.owls.service.ServicePackage;
import net.sf.ictalive.runtime.action.ActionPackage;
import net.sf.ictalive.runtime.enactment.EnactmentPackage;
import net.sf.ictalive.runtime.event.Event;
import net.sf.ictalive.runtime.event.EventPackage;
import net.sf.ictalive.runtime.fact.FactPackage;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class WfvvVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "net.sf.ictalive.coordination.wfvv.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static WfvvAbstractExpression Event_2023_Constraint;

	/**
	 * @generated
	 */
	private static WfvvAbstractExpression Event_2024_Constraint;

	/**
	 * @generated
	 */
	private static WfvvAbstractExpression EventGroup_2028_Constraint;

	/**
	 * @generated
	 */
	private static WfvvAbstractExpression EventGroup_2029_Constraint;

	/**
	 * @generated
	 */
	private static WfvvAbstractExpression Event_3029_Constraint;

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (EventModelContainerEditPart.MODEL_ID.equals(view.getType())) {
				return EventModelContainerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return net.sf.ictalive.coordination.wfvv.diagram.part.WfvvVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				WfvvDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (WfvvPackage.eINSTANCE.getEventModelContainer().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((EventModelContainer) domainElement)) {
			return EventModelContainerEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = net.sf.ictalive.coordination.wfvv.diagram.part.WfvvVisualIDRegistry
				.getModelID(containerView);
		if (!EventModelContainerEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (EventModelContainerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.sf.ictalive.coordination.wfvv.diagram.part.WfvvVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = EventModelContainerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case EventEventFigureFactCompartmentEditPart.VISUAL_ID:
			if (EventPackage.eINSTANCE.getActorView().isSuperTypeOf(
					domainElement.eClass())) {
				return ActorViewEditPart.VISUAL_ID;
			}
			if (FactPackage.eINSTANCE.getContent().isSuperTypeOf(
					domainElement.eClass())) {
				return ContentEditPart.VISUAL_ID;
			}
			break;
		case ContentContentFigureFactCompartmentEditPart.VISUAL_ID:
			if (FactPackage.eINSTANCE.getStartedAct().isSuperTypeOf(
					domainElement.eClass())) {
				return StartedActEditPart.VISUAL_ID;
			}
			if (FactPackage.eINSTANCE.getExecutedAct().isSuperTypeOf(
					domainElement.eClass())) {
				return ExecutedActEditPart.VISUAL_ID;
			}
			if (FactPackage.eINSTANCE.getFailureAct().isSuperTypeOf(
					domainElement.eClass())) {
				return FailureActEditPart.VISUAL_ID;
			}
			if (FactPackage.eINSTANCE.getDisaster().isSuperTypeOf(
					domainElement.eClass())) {
				return DisasterEditPart.VISUAL_ID;
			}
			if (FactPackage.eINSTANCE.getNormInstanceViolated().isSuperTypeOf(
					domainElement.eClass())) {
				return NormInstanceViolatedEditPart.VISUAL_ID;
			}
			if (FactPackage.eINSTANCE.getReceiveAct().isSuperTypeOf(
					domainElement.eClass())) {
				return ReceiveActEditPart.VISUAL_ID;
			}
			if (FactPackage.eINSTANCE.getSendAct().isSuperTypeOf(
					domainElement.eClass())) {
				return SendActEditPart.VISUAL_ID;
			}
			if (FactPackage.eINSTANCE.getDeadlineViolation().isSuperTypeOf(
					domainElement.eClass())) {
				return DeadlineViolationEditPart.VISUAL_ID;
			}
			if (FactPackage.eINSTANCE.getTaskViolation().isSuperTypeOf(
					domainElement.eClass())) {
				return TaskViolationEditPart.VISUAL_ID;
			}
			if (FactPackage.eINSTANCE.getAvailability().isSuperTypeOf(
					domainElement.eClass())) {
				return AvailabilityEditPart.VISUAL_ID;
			}
			break;
		case ContentContentFigureEffectCompartmentEditPart.VISUAL_ID:
			if (ActionPackage.eINSTANCE.getPlanSynthesis().isSuperTypeOf(
					domainElement.eClass())) {
				return PlanSynthesisEditPart.VISUAL_ID;
			}
			if (ActionPackage.eINSTANCE.getPlanDistribution().isSuperTypeOf(
					domainElement.eClass())) {
				return PlanDistributionEditPart.VISUAL_ID;
			}
			if (ActionPackage.eINSTANCE.getPlanSchedule().isSuperTypeOf(
					domainElement.eClass())) {
				return PlanScheduleEditPart.VISUAL_ID;
			}
			if (ActionPackage.eINSTANCE.getPlanExecution().isSuperTypeOf(
					domainElement.eClass())) {
				return PlanExecutionEditPart.VISUAL_ID;
			}
			if (ActionPackage.eINSTANCE.getServiceInvocation().isSuperTypeOf(
					domainElement.eClass())) {
				return ServiceInvocationEditPart.VISUAL_ID;
			}
			if (ActionPackage.eINSTANCE.getReplaceAgent().isSuperTypeOf(
					domainElement.eClass())) {
				return ReplaceAgentEditPart.VISUAL_ID;
			}
			if (ActionPackage.eINSTANCE.getAgentReplan().isSuperTypeOf(
					domainElement.eClass())) {
				return AgentReplanEditPart.VISUAL_ID;
			}
			if (ActionPackage.eINSTANCE.getNotifyStateOfWorld().isSuperTypeOf(
					domainElement.eClass())) {
				return NotifyStateOfWorldEditPart.VISUAL_ID;
			}
			if (ActionPackage.eINSTANCE.getCoordinationAction().isSuperTypeOf(
					domainElement.eClass())) {
				return CoordinationActionEditPart.VISUAL_ID;
			}
			break;
		case ReceiveActReceiveActCompartmentEditPart.VISUAL_ID:
			if (FactPackage.eINSTANCE.getMessage().isSuperTypeOf(
					domainElement.eClass())) {
				return MessageEditPart.VISUAL_ID;
			}
			break;
		case SendActSendActCompartmentEditPart.VISUAL_ID:
			if (FactPackage.eINSTANCE.getMessage().isSuperTypeOf(
					domainElement.eClass())) {
				return Message2EditPart.VISUAL_ID;
			}
			break;
		case PlanSynthesisPlanSynthesisCompartmentEditPart.VISUAL_ID:
			if (ActionPackage.eINSTANCE.getParameter().isSuperTypeOf(
					domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			if (ActionPackage.eINSTANCE.getResult().isSuperTypeOf(
					domainElement.eClass())) {
				return ResultEditPart.VISUAL_ID;
			}
			break;
		case PlanDistributionPlanDistributionCompartmentEditPart.VISUAL_ID:
			if (ActionPackage.eINSTANCE.getParameter().isSuperTypeOf(
					domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			if (ActionPackage.eINSTANCE.getResult().isSuperTypeOf(
					domainElement.eClass())) {
				return ResultEditPart.VISUAL_ID;
			}
			break;
		case PlanSchedulePlanScheduleCompartmentEditPart.VISUAL_ID:
			if (ActionPackage.eINSTANCE.getParameter().isSuperTypeOf(
					domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			if (ActionPackage.eINSTANCE.getResult().isSuperTypeOf(
					domainElement.eClass())) {
				return ResultEditPart.VISUAL_ID;
			}
			break;
		case PlanExecutionPlanExecutionCompartmentEditPart.VISUAL_ID:
			if (ActionPackage.eINSTANCE.getParameter().isSuperTypeOf(
					domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			if (ActionPackage.eINSTANCE.getResult().isSuperTypeOf(
					domainElement.eClass())) {
				return ResultEditPart.VISUAL_ID;
			}
			break;
		case ServiceInvocationServiceInvocationCompartmentEditPart.VISUAL_ID:
			if (ActionPackage.eINSTANCE.getParameter().isSuperTypeOf(
					domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			if (ActionPackage.eINSTANCE.getResult().isSuperTypeOf(
					domainElement.eClass())) {
				return ResultEditPart.VISUAL_ID;
			}
			break;
		case ReplaceAgentReplaceAgentCompartmentEditPart.VISUAL_ID:
			if (ActionPackage.eINSTANCE.getParameter().isSuperTypeOf(
					domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			if (ActionPackage.eINSTANCE.getResult().isSuperTypeOf(
					domainElement.eClass())) {
				return ResultEditPart.VISUAL_ID;
			}
			break;
		case AgentReplanAgentReplanCompartmentEditPart.VISUAL_ID:
			if (ActionPackage.eINSTANCE.getParameter().isSuperTypeOf(
					domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			if (ActionPackage.eINSTANCE.getResult().isSuperTypeOf(
					domainElement.eClass())) {
				return ResultEditPart.VISUAL_ID;
			}
			break;
		case NotifyStateOfWorldNotifyStateOfWorldCompartmentEditPart.VISUAL_ID:
			if (ActionPackage.eINSTANCE.getParameter().isSuperTypeOf(
					domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			if (ActionPackage.eINSTANCE.getResult().isSuperTypeOf(
					domainElement.eClass())) {
				return ResultEditPart.VISUAL_ID;
			}
			break;
		case EventGroupEventGroupCompartmentEditPart.VISUAL_ID:
			if (EventPackage.eINSTANCE.getEvent().isSuperTypeOf(
					domainElement.eClass())
					&& isEvent_3029((Event) domainElement)) {
				return Event3EditPart.VISUAL_ID;
			}
			break;
		case ActionGroundingListActionGroundingListCompartmentEditPart.VISUAL_ID:
			if (TasksPackage.eINSTANCE.getActionGrounding().isSuperTypeOf(
					domainElement.eClass())) {
				return ActionGroundingEditPart.VISUAL_ID;
			}
			break;
		case EventModelContainerEditPart.VISUAL_ID:
			if (EventPackage.eINSTANCE.getEvent().isSuperTypeOf(
					domainElement.eClass())
					&& isEvent_2023((Event) domainElement)) {
				return EventEditPart.VISUAL_ID;
			}
			if (EventPackage.eINSTANCE.getEvent().isSuperTypeOf(
					domainElement.eClass())
					&& isEvent_2024((Event) domainElement)) {
				return Event2EditPart.VISUAL_ID;
			}
			if (EnactmentPackage.eINSTANCE.getActionEnactment().isSuperTypeOf(
					domainElement.eClass())) {
				return ActionEnactment2EditPart.VISUAL_ID;
			}
			if (EnactmentPackage.eINSTANCE.getPlanEnactment().isSuperTypeOf(
					domainElement.eClass())) {
				return PlanEnactmentEditPart.VISUAL_ID;
			}
			if (EnactmentPackage.eINSTANCE.getEnactment().isSuperTypeOf(
					domainElement.eClass())) {
				return EnactmentEditPart.VISUAL_ID;
			}
			if (TasksPackage.eINSTANCE.getPlan().isSuperTypeOf(
					domainElement.eClass())) {
				return PlanEditPart.VISUAL_ID;
			}
			if (AgentsPackage.eINSTANCE.getAgent().isSuperTypeOf(
					domainElement.eClass())) {
				return AgentEditPart.VISUAL_ID;
			}
			if (EventPackage.eINSTANCE.getActor().isSuperTypeOf(
					domainElement.eClass())) {
				return ActorEditPart.VISUAL_ID;
			}
			if (ServicePackage.eINSTANCE.getService().isSuperTypeOf(
					domainElement.eClass())) {
				return ServiceEditPart.VISUAL_ID;
			}
			if (OMPackage.eINSTANCE.getObjective().isSuperTypeOf(
					domainElement.eClass())) {
				return ObjectiveEditPart.VISUAL_ID;
			}
			if (EnactmentPackage.eINSTANCE.getResource().isSuperTypeOf(
					domainElement.eClass())) {
				return ResourceEditPart.VISUAL_ID;
			}
			if (ActionsPackage.eINSTANCE.getAtomicAction().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicActionEditPart.VISUAL_ID;
			}
			if (ActionsPackage.eINSTANCE.getCompositeAction().isSuperTypeOf(
					domainElement.eClass())) {
				return CompositeActionEditPart.VISUAL_ID;
			}
			if (WfvvPackage.eINSTANCE.getEventGroup().isSuperTypeOf(
					domainElement.eClass())
					&& isEventGroup_2028((EventGroup) domainElement)) {
				return EventGroupEditPart.VISUAL_ID;
			}
			if (WfvvPackage.eINSTANCE.getEventGroup().isSuperTypeOf(
					domainElement.eClass())
					&& isEventGroup_2029((EventGroup) domainElement)) {
				return EventGroup2EditPart.VISUAL_ID;
			}
			if (TasksPackage.eINSTANCE.getActionGroundingList().isSuperTypeOf(
					domainElement.eClass())) {
				return ActionGroundingListEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = net.sf.ictalive.coordination.wfvv.diagram.part.WfvvVisualIDRegistry
				.getModelID(containerView);
		if (!EventModelContainerEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (EventModelContainerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.sf.ictalive.coordination.wfvv.diagram.part.WfvvVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = EventModelContainerEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case EventEditPart.VISUAL_ID:
			if (EventTimestampEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventEventFigureFactCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Event2EditPart.VISUAL_ID:
			if (EventTimestamp2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionEnactment2EditPart.VISUAL_ID:
			if (ActionEnactmentSessionIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActionEnactmentStartTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActionEnactmentFinishTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActionEnactmentExpireTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlanEnactmentEditPart.VISUAL_ID:
			if (PlanEnactmentSessionIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PlanEnactmentStartTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PlanEnactmentFinishTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PlanEnactmentExpireTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnactmentEditPart.VISUAL_ID:
			if (EnactmentSessionIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnactmentStartTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnactmentFinishTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnactmentExpireTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AgentEditPart.VISUAL_ID:
			if (AgentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActorEditPart.VISUAL_ID:
			if (ActorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ObjectiveEditPart.VISUAL_ID:
			if (ObjectiveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomicActionEditPart.VISUAL_ID:
			if (AtomicActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventGroupEditPart.VISUAL_ID:
			if (EventGroupNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventGroupEventGroupCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventGroup2EditPart.VISUAL_ID:
			if (EventGroupName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionGroundingListEditPart.VISUAL_ID:
			if (ActionGroundingListActionGroundingListCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContentEditPart.VISUAL_ID:
			if (ContentContentFigureFactCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContentContentFigureEffectCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ReceiveActEditPart.VISUAL_ID:
			if (ReceiveActReceiveActCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SendActEditPart.VISUAL_ID:
			if (SendActSendActCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeadlineViolationEditPart.VISUAL_ID:
			if (DeadlineViolationDealineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AvailabilityEditPart.VISUAL_ID:
			if (AvailabilityStatusEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlanSynthesisEditPart.VISUAL_ID:
			if (PlanSynthesisPlanSynthesisCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlanDistributionEditPart.VISUAL_ID:
			if (PlanDistributionPlanDistributionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlanScheduleEditPart.VISUAL_ID:
			if (PlanSchedulePlanScheduleCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlanExecutionEditPart.VISUAL_ID:
			if (PlanExecutionPlanExecutionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceInvocationEditPart.VISUAL_ID:
			if (ServiceInvocationServiceInvocationCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ReplaceAgentEditPart.VISUAL_ID:
			if (ReplaceAgentReplaceAgentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AgentReplanEditPart.VISUAL_ID:
			if (AgentReplanAgentReplanCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NotifyStateOfWorldEditPart.VISUAL_ID:
			if (NotifyStateOfWorldNotifyStateOfWorldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Event3EditPart.VISUAL_ID:
			if (EventTimestamp3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventEventFigureFactCompartmentEditPart.VISUAL_ID:
			if (ActorViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContentContentFigureFactCompartmentEditPart.VISUAL_ID:
			if (StartedActEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExecutedActEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FailureActEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DisasterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NormInstanceViolatedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReceiveActEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendActEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeadlineViolationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TaskViolationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AvailabilityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContentContentFigureEffectCompartmentEditPart.VISUAL_ID:
			if (PlanSynthesisEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PlanDistributionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PlanScheduleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PlanExecutionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServiceInvocationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReplaceAgentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AgentReplanEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotifyStateOfWorldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CoordinationActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ReceiveActReceiveActCompartmentEditPart.VISUAL_ID:
			if (MessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SendActSendActCompartmentEditPart.VISUAL_ID:
			if (Message2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlanSynthesisPlanSynthesisCompartmentEditPart.VISUAL_ID:
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResultEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlanDistributionPlanDistributionCompartmentEditPart.VISUAL_ID:
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResultEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlanSchedulePlanScheduleCompartmentEditPart.VISUAL_ID:
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResultEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlanExecutionPlanExecutionCompartmentEditPart.VISUAL_ID:
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResultEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceInvocationServiceInvocationCompartmentEditPart.VISUAL_ID:
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResultEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ReplaceAgentReplaceAgentCompartmentEditPart.VISUAL_ID:
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResultEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AgentReplanAgentReplanCompartmentEditPart.VISUAL_ID:
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResultEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NotifyStateOfWorldNotifyStateOfWorldCompartmentEditPart.VISUAL_ID:
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResultEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventGroupEventGroupCompartmentEditPart.VISUAL_ID:
			if (Event3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionGroundingListActionGroundingListCompartmentEditPart.VISUAL_ID:
			if (ActionGroundingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventModelContainerEditPart.VISUAL_ID:
			if (EventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Event2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActionEnactment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PlanEnactmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnactmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PlanEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AgentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ObjectiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventGroup2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActionGroundingListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FactDueToEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FactEffectEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FactRelateEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlanningActionsPlanEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceInvocationEnactingAgentEditPart.VISUAL_ID:
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FailureActReasonEditPart.VISUAL_ID:
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DisasterReasonEditPart.VISUAL_ID:
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NSNormsEditPart.VISUAL_ID:
			if (WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommunicativeActReceiverEditPart.VISUAL_ID:
			if (WrappingLabel11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommunicativeActSenderEditPart.VISUAL_ID:
			if (WrappingLabel12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TaskViolationUnmetRequirementEditPart.VISUAL_ID:
			if (WrappingLabel13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionByActorEditPart.VISUAL_ID:
			if (WrappingLabel14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionEnactmentEditPart.VISUAL_ID:
			if (WrappingLabel15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionCauseEditPart.VISUAL_ID:
			if (WrappingLabel16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnactmentResourceEditPart.VISUAL_ID:
			if (WrappingLabel17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CoordinationActionCoordActionEditPart.VISUAL_ID:
			if (WrappingLabel18EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CoordinationActionPlanEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventAsserterEditPart.VISUAL_ID:
			if (WrappingLabel19EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActorAgentEditPart.VISUAL_ID:
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlanHasAtomicProcessGroundingListEditPart.VISUAL_ID:
			if (WrappingLabel20EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionGroundingListRestEditPart.VISUAL_ID:
			if (WrappingLabel21EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionGroundingOwlsProcessEditPart.VISUAL_ID:
			if (WrappingLabel22EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(EventModelContainer element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isEvent_2023(Event domainElement) {
		if (Event_2023_Constraint == null) { // lazy initialization
			Event_2023_Constraint = WfvvOCLFactory
					.getExpression(
							"self.minimized = false", EventPackage.eINSTANCE.getEvent()); //$NON-NLS-1$
		}
		Object result = Event_2023_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isEvent_2024(Event domainElement) {
		if (Event_2024_Constraint == null) { // lazy initialization
			Event_2024_Constraint = WfvvOCLFactory.getExpression(
					"self.minimized = true", EventPackage.eINSTANCE.getEvent()); //$NON-NLS-1$
		}
		Object result = Event_2024_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isEventGroup_2028(EventGroup domainElement) {
		if (EventGroup_2028_Constraint == null) { // lazy initialization
			EventGroup_2028_Constraint = WfvvOCLFactory
					.getExpression(
							"self.minimized = false", WfvvPackage.eINSTANCE.getEventGroup()); //$NON-NLS-1$
		}
		Object result = EventGroup_2028_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isEventGroup_2029(EventGroup domainElement) {
		if (EventGroup_2029_Constraint == null) { // lazy initialization
			EventGroup_2029_Constraint = WfvvOCLFactory
					.getExpression(
							"self.minimized = true", WfvvPackage.eINSTANCE.getEventGroup()); //$NON-NLS-1$
		}
		Object result = EventGroup_2029_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isEvent_3029(Event domainElement) {
		if (Event_3029_Constraint == null) { // lazy initialization
			Event_3029_Constraint = WfvvOCLFactory.getExpression(
					"self.minimized = true", EventPackage.eINSTANCE.getEvent()); //$NON-NLS-1$
		}
		Object result = Event_3029_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

}
