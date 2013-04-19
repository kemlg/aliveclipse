package net.sf.ictalive.coordination.wfvv.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.sf.ictalive.coordination.actions.AtomicAction;
import net.sf.ictalive.coordination.actions.CompositeAction;
import net.sf.ictalive.coordination.agents.Agent;
import net.sf.ictalive.coordination.tasks.ActionGrounding;
import net.sf.ictalive.coordination.tasks.ActionGroundingList;
import net.sf.ictalive.coordination.tasks.Plan;
import net.sf.ictalive.coordination.tasks.TasksPackage;
import net.sf.ictalive.coordination.wfvv.EventGroup;
import net.sf.ictalive.coordination.wfvv.EventModelContainer;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionByActorEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionCauseEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionEnactment2EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionEnactmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingListActionGroundingListCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingListEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingListRestEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingOwlsProcessEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActorAgentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActorEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActorViewEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AgentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AgentReplanAgentReplanCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AgentReplanEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AvailabilityEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CommunicativeActReceiverEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CommunicativeActSenderEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CompositeActionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ContentContentFigureEffectCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ContentContentFigureFactCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ContentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CoordinationActionCoordActionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CoordinationActionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CoordinationActionPlanEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.DeadlineViolationEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.DisasterEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.DisasterReasonEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EnactmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EnactmentResourceEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.Event2EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.Event3EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventAsserterEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventEventFigureFactCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventGroup2EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventGroupEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventGroupEventGroupCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventModelContainerEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ExecutedActEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FactDueToEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FactEffectEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FactRelateEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FailureActEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FailureActReasonEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.Message2EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.MessageEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.NormInstanceViolatedEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.NotifyStateOfWorldEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.NotifyStateOfWorldNotifyStateOfWorldCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ObjectiveEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ParameterEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanDistributionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanDistributionPlanDistributionCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanEnactmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanExecutionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanExecutionPlanExecutionCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanHasAtomicProcessGroundingListEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanScheduleEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanSchedulePlanScheduleCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanSynthesisEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanSynthesisPlanSynthesisCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanningActionsPlanEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ReceiveActEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ReceiveActReceiveActCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ReplaceAgentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ReplaceAgentReplaceAgentCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ResourceEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ResultEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.SendActEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.SendActSendActCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ServiceEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ServiceInvocationEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ServiceInvocationEnactingAgentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ServiceInvocationServiceInvocationCompartmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.StartedActEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.TaskViolationEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.TaskViolationUnmetRequirementEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.providers.WfvvElementTypes;
import net.sf.ictalive.operetta.OM.Objective;
import net.sf.ictalive.runtime.action.Action;
import net.sf.ictalive.runtime.action.ActionPackage;
import net.sf.ictalive.runtime.action.AgentReplan;
import net.sf.ictalive.runtime.action.CoordinationAction;
import net.sf.ictalive.runtime.action.NotifyStateOfWorld;
import net.sf.ictalive.runtime.action.Parameter;
import net.sf.ictalive.runtime.action.PlanDistribution;
import net.sf.ictalive.runtime.action.PlanExecution;
import net.sf.ictalive.runtime.action.PlanSchedule;
import net.sf.ictalive.runtime.action.PlanSynthesis;
import net.sf.ictalive.runtime.action.PlanningActions;
import net.sf.ictalive.runtime.action.ReplaceAgent;
import net.sf.ictalive.runtime.action.Result;
import net.sf.ictalive.runtime.action.ServiceInvocation;
import net.sf.ictalive.runtime.enactment.ActionEnactment;
import net.sf.ictalive.runtime.enactment.Enactment;
import net.sf.ictalive.runtime.enactment.EnactmentPackage;
import net.sf.ictalive.runtime.enactment.PlanEnactment;
import net.sf.ictalive.runtime.event.Actor;
import net.sf.ictalive.runtime.event.Event;
import net.sf.ictalive.runtime.event.EventPackage;
import net.sf.ictalive.runtime.event.PointOfView;
import net.sf.ictalive.runtime.fact.Availability;
import net.sf.ictalive.runtime.fact.CommunicativeAct;
import net.sf.ictalive.runtime.fact.Content;
import net.sf.ictalive.runtime.fact.DeadlineViolation;
import net.sf.ictalive.runtime.fact.Disaster;
import net.sf.ictalive.runtime.fact.ExecutedAct;
import net.sf.ictalive.runtime.fact.Fact;
import net.sf.ictalive.runtime.fact.FactPackage;
import net.sf.ictalive.runtime.fact.FailureAct;
import net.sf.ictalive.runtime.fact.Message;
import net.sf.ictalive.runtime.fact.NormInstanceViolated;
import net.sf.ictalive.runtime.fact.ReceiveAct;
import net.sf.ictalive.runtime.fact.SendAct;
import net.sf.ictalive.runtime.fact.StartedAct;
import net.sf.ictalive.runtime.fact.TaskViolation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class WfvvDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (WfvvVisualIDRegistry.getVisualID(view)) {
		case EventEventFigureFactCompartmentEditPart.VISUAL_ID:
			return getEventEventFigureFactCompartment_7020SemanticChildren(view);
		case ContentContentFigureFactCompartmentEditPart.VISUAL_ID:
			return getContentContentFigureFactCompartment_7002SemanticChildren(view);
		case ContentContentFigureEffectCompartmentEditPart.VISUAL_ID:
			return getContentContentFigureEffectCompartment_7003SemanticChildren(view);
		case ReceiveActReceiveActCompartmentEditPart.VISUAL_ID:
			return getReceiveActReceiveActCompartment_7007SemanticChildren(view);
		case SendActSendActCompartmentEditPart.VISUAL_ID:
			return getSendActSendActCompartment_7008SemanticChildren(view);
		case PlanSynthesisPlanSynthesisCompartmentEditPart.VISUAL_ID:
			return getPlanSynthesisPlanSynthesisCompartment_7009SemanticChildren(view);
		case PlanDistributionPlanDistributionCompartmentEditPart.VISUAL_ID:
			return getPlanDistributionPlanDistributionCompartment_7010SemanticChildren(view);
		case PlanSchedulePlanScheduleCompartmentEditPart.VISUAL_ID:
			return getPlanSchedulePlanScheduleCompartment_7011SemanticChildren(view);
		case PlanExecutionPlanExecutionCompartmentEditPart.VISUAL_ID:
			return getPlanExecutionPlanExecutionCompartment_7012SemanticChildren(view);
		case ServiceInvocationServiceInvocationCompartmentEditPart.VISUAL_ID:
			return getServiceInvocationServiceInvocationCompartment_7013SemanticChildren(view);
		case ReplaceAgentReplaceAgentCompartmentEditPart.VISUAL_ID:
			return getReplaceAgentReplaceAgentCompartment_7014SemanticChildren(view);
		case AgentReplanAgentReplanCompartmentEditPart.VISUAL_ID:
			return getAgentReplanAgentReplanCompartment_7015SemanticChildren(view);
		case NotifyStateOfWorldNotifyStateOfWorldCompartmentEditPart.VISUAL_ID:
			return getNotifyStateOfWorldNotifyStateOfWorldCompartment_7016SemanticChildren(view);
		case EventGroupEventGroupCompartmentEditPart.VISUAL_ID:
			return getEventGroupEventGroupCompartment_7021SemanticChildren(view);
		case ActionGroundingListActionGroundingListCompartmentEditPart.VISUAL_ID:
			return getActionGroundingListActionGroundingListCompartment_7019SemanticChildren(view);
		case EventModelContainerEditPart.VISUAL_ID:
			return getEventModelContainer_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEventEventFigureFactCompartment_7020SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Event modelElement = (Event) containerView.getElement();
		List result = new LinkedList();
		{
			PointOfView childElement = modelElement.getPointOfView();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActorViewEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
			}
		}
		{
			Content childElement = modelElement.getContent();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ContentEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContentContentFigureFactCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Content modelElement = (Content) containerView.getElement();
		List result = new LinkedList();
		{
			Fact childElement = modelElement.getFact();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StartedActEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExecutedActEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
			}
			if (visualID == FailureActEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
			}
			if (visualID == DisasterEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
			}
			if (visualID == NormInstanceViolatedEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
			}
			if (visualID == ReceiveActEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
			}
			if (visualID == SendActEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
			}
			if (visualID == DeadlineViolationEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
			}
			if (visualID == TaskViolationEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
			}
			if (visualID == AvailabilityEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContentContentFigureEffectCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Content modelElement = (Content) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getEffect().iterator(); it.hasNext();) {
			Action childElement = (Action) it.next();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PlanSynthesisEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PlanDistributionEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PlanScheduleEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PlanExecutionEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ServiceInvocationEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ReplaceAgentEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AgentReplanEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotifyStateOfWorldEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CoordinationActionEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReceiveActReceiveActCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ReceiveAct modelElement = (ReceiveAct) containerView.getElement();
		List result = new LinkedList();
		{
			Message childElement = modelElement.getReceivedMessage();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MessageEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSendActSendActCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SendAct modelElement = (SendAct) containerView.getElement();
		List result = new LinkedList();
		{
			Message childElement = modelElement.getSendMessage();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Message2EditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlanSynthesisPlanSynthesisCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		PlanSynthesis modelElement = (PlanSynthesis) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getInput().iterator(); it.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getResult().iterator(); it.hasNext();) {
			Result childElement = (Result) it.next();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ResultEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlanDistributionPlanDistributionCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		PlanDistribution modelElement = (PlanDistribution) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getInput().iterator(); it.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getResult().iterator(); it.hasNext();) {
			Result childElement = (Result) it.next();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ResultEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlanSchedulePlanScheduleCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		PlanSchedule modelElement = (PlanSchedule) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getInput().iterator(); it.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getResult().iterator(); it.hasNext();) {
			Result childElement = (Result) it.next();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ResultEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlanExecutionPlanExecutionCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		PlanExecution modelElement = (PlanExecution) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getInput().iterator(); it.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getResult().iterator(); it.hasNext();) {
			Result childElement = (Result) it.next();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ResultEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getServiceInvocationServiceInvocationCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ServiceInvocation modelElement = (ServiceInvocation) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getInput().iterator(); it.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getResult().iterator(); it.hasNext();) {
			Result childElement = (Result) it.next();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ResultEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReplaceAgentReplaceAgentCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ReplaceAgent modelElement = (ReplaceAgent) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getInput().iterator(); it.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getResult().iterator(); it.hasNext();) {
			Result childElement = (Result) it.next();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ResultEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAgentReplanAgentReplanCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AgentReplan modelElement = (AgentReplan) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getInput().iterator(); it.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getResult().iterator(); it.hasNext();) {
			Result childElement = (Result) it.next();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ResultEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNotifyStateOfWorldNotifyStateOfWorldCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		NotifyStateOfWorld modelElement = (NotifyStateOfWorld) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getInput().iterator(); it.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getResult().iterator(); it.hasNext();) {
			Result childElement = (Result) it.next();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ResultEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEventGroupEventGroupCompartment_7021SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EventGroup modelElement = (EventGroup) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getEvents().iterator(); it.hasNext();) {
			Event childElement = (Event) it.next();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Event3EditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionGroundingListActionGroundingListCompartment_7019SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ActionGroundingList modelElement = (ActionGroundingList) containerView
				.getElement();
		List result = new LinkedList();
		{
			ActionGrounding childElement = modelElement.getFirst();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActionGroundingEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEventModelContainer_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EventModelContainer modelElement = (EventModelContainer) view
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getEvents().iterator(); it.hasNext();) {
			Event childElement = (Event) it.next();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Event2EditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getEventGroups().iterator(); it
				.hasNext();) {
			EventGroup childElement = (EventGroup) it.next();
			int visualID = WfvvVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventGroupEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventGroup2EditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		Resource resource = modelElement.eResource();
		for (Iterator semanticIterator = getPhantomNodesIterator(resource); semanticIterator
				.hasNext();) {
			EObject childElement = (EObject) semanticIterator.next();
			if (childElement == modelElement) {
				continue;
			}
			if (WfvvVisualIDRegistry.getNodeVisualID(view, childElement) == ActionEnactment2EditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement,
						ActionEnactment2EditPart.VISUAL_ID));
				continue;
			}
			if (WfvvVisualIDRegistry.getNodeVisualID(view, childElement) == PlanEnactmentEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement,
						PlanEnactmentEditPart.VISUAL_ID));
				continue;
			}
			if (WfvvVisualIDRegistry.getNodeVisualID(view, childElement) == EnactmentEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement,
						EnactmentEditPart.VISUAL_ID));
				continue;
			}
			if (WfvvVisualIDRegistry.getNodeVisualID(view, childElement) == PlanEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement,
						PlanEditPart.VISUAL_ID));
				continue;
			}
			if (WfvvVisualIDRegistry.getNodeVisualID(view, childElement) == AgentEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement,
						AgentEditPart.VISUAL_ID));
				continue;
			}
			if (WfvvVisualIDRegistry.getNodeVisualID(view, childElement) == ActorEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement,
						ActorEditPart.VISUAL_ID));
				continue;
			}
			if (WfvvVisualIDRegistry.getNodeVisualID(view, childElement) == ServiceEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement,
						ServiceEditPart.VISUAL_ID));
				continue;
			}
			if (WfvvVisualIDRegistry.getNodeVisualID(view, childElement) == ObjectiveEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement,
						ObjectiveEditPart.VISUAL_ID));
				continue;
			}
			if (WfvvVisualIDRegistry.getNodeVisualID(view, childElement) == ResourceEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement,
						ResourceEditPart.VISUAL_ID));
				continue;
			}
			if (WfvvVisualIDRegistry.getNodeVisualID(view, childElement) == AtomicActionEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement,
						AtomicActionEditPart.VISUAL_ID));
				continue;
			}
			if (WfvvVisualIDRegistry.getNodeVisualID(view, childElement) == CompositeActionEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement,
						CompositeActionEditPart.VISUAL_ID));
				continue;
			}
			if (WfvvVisualIDRegistry.getNodeVisualID(view, childElement) == ActionGroundingListEditPart.VISUAL_ID) {
				result.add(new WfvvNodeDescriptor(childElement,
						ActionGroundingListEditPart.VISUAL_ID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Iterator getPhantomNodesIterator(Resource resource) {
		return resource.getAllContents();
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (WfvvVisualIDRegistry.getVisualID(view)) {
		case EventModelContainerEditPart.VISUAL_ID:
			return getEventModelContainer_1000ContainedLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2023ContainedLinks(view);
		case Event2EditPart.VISUAL_ID:
			return getEvent_2024ContainedLinks(view);
		case ActionEnactment2EditPart.VISUAL_ID:
			return getActionEnactment_2020ContainedLinks(view);
		case PlanEnactmentEditPart.VISUAL_ID:
			return getPlanEnactment_2021ContainedLinks(view);
		case EnactmentEditPart.VISUAL_ID:
			return getEnactment_2025ContainedLinks(view);
		case PlanEditPart.VISUAL_ID:
			return getPlan_2014ContainedLinks(view);
		case AgentEditPart.VISUAL_ID:
			return getAgent_2015ContainedLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2026ContainedLinks(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2016ContainedLinks(view);
		case ObjectiveEditPart.VISUAL_ID:
			return getObjective_2017ContainedLinks(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_2027ContainedLinks(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2018ContainedLinks(view);
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2019ContainedLinks(view);
		case EventGroupEditPart.VISUAL_ID:
			return getEventGroup_2028ContainedLinks(view);
		case EventGroup2EditPart.VISUAL_ID:
			return getEventGroup_2029ContainedLinks(view);
		case ActionGroundingListEditPart.VISUAL_ID:
			return getActionGroundingList_2022ContainedLinks(view);
		case ActorViewEditPart.VISUAL_ID:
			return getActorView_3001ContainedLinks(view);
		case ContentEditPart.VISUAL_ID:
			return getContent_3002ContainedLinks(view);
		case StartedActEditPart.VISUAL_ID:
			return getStartedAct_3003ContainedLinks(view);
		case ExecutedActEditPart.VISUAL_ID:
			return getExecutedAct_3004ContainedLinks(view);
		case FailureActEditPart.VISUAL_ID:
			return getFailureAct_3005ContainedLinks(view);
		case DisasterEditPart.VISUAL_ID:
			return getDisaster_3006ContainedLinks(view);
		case NormInstanceViolatedEditPart.VISUAL_ID:
			return getNormInstanceViolated_3007ContainedLinks(view);
		case ReceiveActEditPart.VISUAL_ID:
			return getReceiveAct_3008ContainedLinks(view);
		case MessageEditPart.VISUAL_ID:
			return getMessage_3009ContainedLinks(view);
		case SendActEditPart.VISUAL_ID:
			return getSendAct_3010ContainedLinks(view);
		case Message2EditPart.VISUAL_ID:
			return getMessage_3011ContainedLinks(view);
		case DeadlineViolationEditPart.VISUAL_ID:
			return getDeadlineViolation_3012ContainedLinks(view);
		case TaskViolationEditPart.VISUAL_ID:
			return getTaskViolation_3013ContainedLinks(view);
		case AvailabilityEditPart.VISUAL_ID:
			return getAvailability_3014ContainedLinks(view);
		case PlanSynthesisEditPart.VISUAL_ID:
			return getPlanSynthesis_3015ContainedLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3016ContainedLinks(view);
		case ResultEditPart.VISUAL_ID:
			return getResult_3017ContainedLinks(view);
		case PlanDistributionEditPart.VISUAL_ID:
			return getPlanDistribution_3018ContainedLinks(view);
		case PlanScheduleEditPart.VISUAL_ID:
			return getPlanSchedule_3019ContainedLinks(view);
		case PlanExecutionEditPart.VISUAL_ID:
			return getPlanExecution_3020ContainedLinks(view);
		case ServiceInvocationEditPart.VISUAL_ID:
			return getServiceInvocation_3021ContainedLinks(view);
		case ReplaceAgentEditPart.VISUAL_ID:
			return getReplaceAgent_3022ContainedLinks(view);
		case AgentReplanEditPart.VISUAL_ID:
			return getAgentReplan_3023ContainedLinks(view);
		case NotifyStateOfWorldEditPart.VISUAL_ID:
			return getNotifyStateOfWorld_3024ContainedLinks(view);
		case CoordinationActionEditPart.VISUAL_ID:
			return getCoordinationAction_3028ContainedLinks(view);
		case Event3EditPart.VISUAL_ID:
			return getEvent_3029ContainedLinks(view);
		case ActionGroundingEditPart.VISUAL_ID:
			return getActionGrounding_3027ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (WfvvVisualIDRegistry.getVisualID(view)) {
		case EventEditPart.VISUAL_ID:
			return getEvent_2023IncomingLinks(view);
		case Event2EditPart.VISUAL_ID:
			return getEvent_2024IncomingLinks(view);
		case ActionEnactment2EditPart.VISUAL_ID:
			return getActionEnactment_2020IncomingLinks(view);
		case PlanEnactmentEditPart.VISUAL_ID:
			return getPlanEnactment_2021IncomingLinks(view);
		case EnactmentEditPart.VISUAL_ID:
			return getEnactment_2025IncomingLinks(view);
		case PlanEditPart.VISUAL_ID:
			return getPlan_2014IncomingLinks(view);
		case AgentEditPart.VISUAL_ID:
			return getAgent_2015IncomingLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2026IncomingLinks(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2016IncomingLinks(view);
		case ObjectiveEditPart.VISUAL_ID:
			return getObjective_2017IncomingLinks(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_2027IncomingLinks(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2018IncomingLinks(view);
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2019IncomingLinks(view);
		case EventGroupEditPart.VISUAL_ID:
			return getEventGroup_2028IncomingLinks(view);
		case EventGroup2EditPart.VISUAL_ID:
			return getEventGroup_2029IncomingLinks(view);
		case ActionGroundingListEditPart.VISUAL_ID:
			return getActionGroundingList_2022IncomingLinks(view);
		case ActorViewEditPart.VISUAL_ID:
			return getActorView_3001IncomingLinks(view);
		case ContentEditPart.VISUAL_ID:
			return getContent_3002IncomingLinks(view);
		case StartedActEditPart.VISUAL_ID:
			return getStartedAct_3003IncomingLinks(view);
		case ExecutedActEditPart.VISUAL_ID:
			return getExecutedAct_3004IncomingLinks(view);
		case FailureActEditPart.VISUAL_ID:
			return getFailureAct_3005IncomingLinks(view);
		case DisasterEditPart.VISUAL_ID:
			return getDisaster_3006IncomingLinks(view);
		case NormInstanceViolatedEditPart.VISUAL_ID:
			return getNormInstanceViolated_3007IncomingLinks(view);
		case ReceiveActEditPart.VISUAL_ID:
			return getReceiveAct_3008IncomingLinks(view);
		case MessageEditPart.VISUAL_ID:
			return getMessage_3009IncomingLinks(view);
		case SendActEditPart.VISUAL_ID:
			return getSendAct_3010IncomingLinks(view);
		case Message2EditPart.VISUAL_ID:
			return getMessage_3011IncomingLinks(view);
		case DeadlineViolationEditPart.VISUAL_ID:
			return getDeadlineViolation_3012IncomingLinks(view);
		case TaskViolationEditPart.VISUAL_ID:
			return getTaskViolation_3013IncomingLinks(view);
		case AvailabilityEditPart.VISUAL_ID:
			return getAvailability_3014IncomingLinks(view);
		case PlanSynthesisEditPart.VISUAL_ID:
			return getPlanSynthesis_3015IncomingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3016IncomingLinks(view);
		case ResultEditPart.VISUAL_ID:
			return getResult_3017IncomingLinks(view);
		case PlanDistributionEditPart.VISUAL_ID:
			return getPlanDistribution_3018IncomingLinks(view);
		case PlanScheduleEditPart.VISUAL_ID:
			return getPlanSchedule_3019IncomingLinks(view);
		case PlanExecutionEditPart.VISUAL_ID:
			return getPlanExecution_3020IncomingLinks(view);
		case ServiceInvocationEditPart.VISUAL_ID:
			return getServiceInvocation_3021IncomingLinks(view);
		case ReplaceAgentEditPart.VISUAL_ID:
			return getReplaceAgent_3022IncomingLinks(view);
		case AgentReplanEditPart.VISUAL_ID:
			return getAgentReplan_3023IncomingLinks(view);
		case NotifyStateOfWorldEditPart.VISUAL_ID:
			return getNotifyStateOfWorld_3024IncomingLinks(view);
		case CoordinationActionEditPart.VISUAL_ID:
			return getCoordinationAction_3028IncomingLinks(view);
		case Event3EditPart.VISUAL_ID:
			return getEvent_3029IncomingLinks(view);
		case ActionGroundingEditPart.VISUAL_ID:
			return getActionGrounding_3027IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (WfvvVisualIDRegistry.getVisualID(view)) {
		case EventEditPart.VISUAL_ID:
			return getEvent_2023OutgoingLinks(view);
		case Event2EditPart.VISUAL_ID:
			return getEvent_2024OutgoingLinks(view);
		case ActionEnactment2EditPart.VISUAL_ID:
			return getActionEnactment_2020OutgoingLinks(view);
		case PlanEnactmentEditPart.VISUAL_ID:
			return getPlanEnactment_2021OutgoingLinks(view);
		case EnactmentEditPart.VISUAL_ID:
			return getEnactment_2025OutgoingLinks(view);
		case PlanEditPart.VISUAL_ID:
			return getPlan_2014OutgoingLinks(view);
		case AgentEditPart.VISUAL_ID:
			return getAgent_2015OutgoingLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2026OutgoingLinks(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2016OutgoingLinks(view);
		case ObjectiveEditPart.VISUAL_ID:
			return getObjective_2017OutgoingLinks(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_2027OutgoingLinks(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2018OutgoingLinks(view);
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2019OutgoingLinks(view);
		case EventGroupEditPart.VISUAL_ID:
			return getEventGroup_2028OutgoingLinks(view);
		case EventGroup2EditPart.VISUAL_ID:
			return getEventGroup_2029OutgoingLinks(view);
		case ActionGroundingListEditPart.VISUAL_ID:
			return getActionGroundingList_2022OutgoingLinks(view);
		case ActorViewEditPart.VISUAL_ID:
			return getActorView_3001OutgoingLinks(view);
		case ContentEditPart.VISUAL_ID:
			return getContent_3002OutgoingLinks(view);
		case StartedActEditPart.VISUAL_ID:
			return getStartedAct_3003OutgoingLinks(view);
		case ExecutedActEditPart.VISUAL_ID:
			return getExecutedAct_3004OutgoingLinks(view);
		case FailureActEditPart.VISUAL_ID:
			return getFailureAct_3005OutgoingLinks(view);
		case DisasterEditPart.VISUAL_ID:
			return getDisaster_3006OutgoingLinks(view);
		case NormInstanceViolatedEditPart.VISUAL_ID:
			return getNormInstanceViolated_3007OutgoingLinks(view);
		case ReceiveActEditPart.VISUAL_ID:
			return getReceiveAct_3008OutgoingLinks(view);
		case MessageEditPart.VISUAL_ID:
			return getMessage_3009OutgoingLinks(view);
		case SendActEditPart.VISUAL_ID:
			return getSendAct_3010OutgoingLinks(view);
		case Message2EditPart.VISUAL_ID:
			return getMessage_3011OutgoingLinks(view);
		case DeadlineViolationEditPart.VISUAL_ID:
			return getDeadlineViolation_3012OutgoingLinks(view);
		case TaskViolationEditPart.VISUAL_ID:
			return getTaskViolation_3013OutgoingLinks(view);
		case AvailabilityEditPart.VISUAL_ID:
			return getAvailability_3014OutgoingLinks(view);
		case PlanSynthesisEditPart.VISUAL_ID:
			return getPlanSynthesis_3015OutgoingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3016OutgoingLinks(view);
		case ResultEditPart.VISUAL_ID:
			return getResult_3017OutgoingLinks(view);
		case PlanDistributionEditPart.VISUAL_ID:
			return getPlanDistribution_3018OutgoingLinks(view);
		case PlanScheduleEditPart.VISUAL_ID:
			return getPlanSchedule_3019OutgoingLinks(view);
		case PlanExecutionEditPart.VISUAL_ID:
			return getPlanExecution_3020OutgoingLinks(view);
		case ServiceInvocationEditPart.VISUAL_ID:
			return getServiceInvocation_3021OutgoingLinks(view);
		case ReplaceAgentEditPart.VISUAL_ID:
			return getReplaceAgent_3022OutgoingLinks(view);
		case AgentReplanEditPart.VISUAL_ID:
			return getAgentReplan_3023OutgoingLinks(view);
		case NotifyStateOfWorldEditPart.VISUAL_ID:
			return getNotifyStateOfWorld_3024OutgoingLinks(view);
		case CoordinationActionEditPart.VISUAL_ID:
			return getCoordinationAction_3028OutgoingLinks(view);
		case Event3EditPart.VISUAL_ID:
			return getEvent_3029OutgoingLinks(view);
		case ActionGroundingEditPart.VISUAL_ID:
			return getActionGrounding_3027OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEventModelContainer_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2023ContainedLinks(View view) {
		Event modelElement = (Event) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Event_Asserter_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2024ContainedLinks(View view) {
		Event modelElement = (Event) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Event_Asserter_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionEnactment_2020ContainedLinks(View view) {
		ActionEnactment modelElement = (ActionEnactment) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Enactment_Resource_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlanEnactment_2021ContainedLinks(View view) {
		PlanEnactment modelElement = (PlanEnactment) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Enactment_Resource_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEnactment_2025ContainedLinks(View view) {
		Enactment modelElement = (Enactment) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Enactment_Resource_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlan_2014ContainedLinks(View view) {
		Plan modelElement = (Plan) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Plan_HasAtomicProcessGroundingList_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAgent_2015ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActor_2026ContainedLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Actor_Agent_4020(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getService_2016ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getObjective_2017ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_2027ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAtomicAction_2018ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAction_2019ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEventGroup_2028ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEventGroup_2029ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActionGroundingList_2022ContainedLinks(View view) {
		ActionGroundingList modelElement = (ActionGroundingList) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ActionGroundingList_Rest_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActorView_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getContent_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStartedAct_3003ContainedLinks(View view) {
		StartedAct modelElement = (StartedAct) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_DueTo_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Effect_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Relate_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExecutedAct_3004ContainedLinks(View view) {
		ExecutedAct modelElement = (ExecutedAct) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_DueTo_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Effect_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Relate_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFailureAct_3005ContainedLinks(View view) {
		FailureAct modelElement = (FailureAct) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_DueTo_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Effect_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Relate_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_FailureAct_Reason_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDisaster_3006ContainedLinks(View view) {
		Disaster modelElement = (Disaster) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_DueTo_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Effect_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Relate_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Disaster_Reason_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNormInstanceViolated_3007ContainedLinks(View view) {
		NormInstanceViolated modelElement = (NormInstanceViolated) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_DueTo_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Effect_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Relate_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReceiveAct_3008ContainedLinks(View view) {
		ReceiveAct modelElement = (ReceiveAct) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_DueTo_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Effect_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Relate_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CommunicativeAct_Receiver_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CommunicativeAct_Sender_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMessage_3009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSendAct_3010ContainedLinks(View view) {
		SendAct modelElement = (SendAct) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_DueTo_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Effect_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Relate_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CommunicativeAct_Receiver_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CommunicativeAct_Sender_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMessage_3011ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDeadlineViolation_3012ContainedLinks(View view) {
		DeadlineViolation modelElement = (DeadlineViolation) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_DueTo_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Effect_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Relate_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTaskViolation_3013ContainedLinks(View view) {
		TaskViolation modelElement = (TaskViolation) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_DueTo_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Effect_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Relate_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_TaskViolation_UnmetRequirement_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAvailability_3014ContainedLinks(View view) {
		Availability modelElement = (Availability) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_DueTo_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Effect_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Relate_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlanSynthesis_3015ContainedLinks(View view) {
		PlanSynthesis modelElement = (PlanSynthesis) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PlanningActions_Plan_4005(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_ByActor_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Enactment_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Cause_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getParameter_3016ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResult_3017ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPlanDistribution_3018ContainedLinks(View view) {
		PlanDistribution modelElement = (PlanDistribution) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PlanningActions_Plan_4005(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_ByActor_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Enactment_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Cause_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlanSchedule_3019ContainedLinks(View view) {
		PlanSchedule modelElement = (PlanSchedule) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PlanningActions_Plan_4005(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_ByActor_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Enactment_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Cause_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlanExecution_3020ContainedLinks(View view) {
		PlanExecution modelElement = (PlanExecution) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PlanningActions_Plan_4005(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_ByActor_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Enactment_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Cause_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getServiceInvocation_3021ContainedLinks(View view) {
		ServiceInvocation modelElement = (ServiceInvocation) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceInvocation_EnactingAgent_4006(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_ByActor_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Enactment_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Cause_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReplaceAgent_3022ContainedLinks(View view) {
		ReplaceAgent modelElement = (ReplaceAgent) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_ByActor_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Enactment_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Cause_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAgentReplan_3023ContainedLinks(View view) {
		AgentReplan modelElement = (AgentReplan) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_ByActor_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Enactment_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Cause_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNotifyStateOfWorld_3024ContainedLinks(View view) {
		NotifyStateOfWorld modelElement = (NotifyStateOfWorld) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_ByActor_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Enactment_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Cause_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCoordinationAction_3028ContainedLinks(View view) {
		CoordinationAction modelElement = (CoordinationAction) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_ByActor_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Enactment_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Cause_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CoordinationAction_CoordAction_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CoordinationAction_Plan_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_3029ContainedLinks(View view) {
		Event modelElement = (Event) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Event_Asserter_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionGrounding_3027ContainedLinks(View view) {
		ActionGrounding modelElement = (ActionGrounding) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ActionGrounding_OwlsProcess_4023(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2023IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2024IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActionEnactment_2020IncomingLinks(View view) {
		ActionEnactment modelElement = (ActionEnactment) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Enactment_4015(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlanEnactment_2021IncomingLinks(View view) {
		PlanEnactment modelElement = (PlanEnactment) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Enactment_4015(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEnactment_2025IncomingLinks(View view) {
		Enactment modelElement = (Enactment) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Enactment_4015(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlan_2014IncomingLinks(View view) {
		Plan modelElement = (Plan) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_PlanningActions_Plan_4005(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CoordinationAction_Plan_4004(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAgent_2015IncomingLinks(View view) {
		Agent modelElement = (Agent) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceInvocation_EnactingAgent_4006(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Actor_Agent_4020(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActor_2026IncomingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_CommunicativeAct_Receiver_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CommunicativeAct_Sender_4012(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_ByActor_4014(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Event_Asserter_4019(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getService_2016IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getObjective_2017IncomingLinks(View view) {
		Objective modelElement = (Objective) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_TaskViolation_UnmetRequirement_4013(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_2027IncomingLinks(View view) {
		net.sf.ictalive.runtime.enactment.Resource modelElement = (net.sf.ictalive.runtime.enactment.Resource) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_Enactment_Resource_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAtomicAction_2018IncomingLinks(View view) {
		AtomicAction modelElement = (AtomicAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ActionGrounding_OwlsProcess_4023(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAction_2019IncomingLinks(View view) {
		CompositeAction modelElement = (CompositeAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ActionGrounding_OwlsProcess_4023(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEventGroup_2028IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEventGroup_2029IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActionGroundingList_2022IncomingLinks(View view) {
		ActionGroundingList modelElement = (ActionGroundingList) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_Plan_HasAtomicProcessGroundingList_4021(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ActionGroundingList_Rest_4022(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActorView_3001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getContent_3002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStartedAct_3003IncomingLinks(View view) {
		StartedAct modelElement = (StartedAct) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_Relate_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Cause_4016(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExecutedAct_3004IncomingLinks(View view) {
		ExecutedAct modelElement = (ExecutedAct) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_Relate_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Cause_4016(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFailureAct_3005IncomingLinks(View view) {
		FailureAct modelElement = (FailureAct) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_Relate_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Cause_4016(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDisaster_3006IncomingLinks(View view) {
		Disaster modelElement = (Disaster) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_Relate_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Cause_4016(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNormInstanceViolated_3007IncomingLinks(View view) {
		NormInstanceViolated modelElement = (NormInstanceViolated) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_Relate_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Cause_4016(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReceiveAct_3008IncomingLinks(View view) {
		ReceiveAct modelElement = (ReceiveAct) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_Relate_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Cause_4016(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMessage_3009IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSendAct_3010IncomingLinks(View view) {
		SendAct modelElement = (SendAct) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_Relate_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Cause_4016(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMessage_3011IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDeadlineViolation_3012IncomingLinks(View view) {
		DeadlineViolation modelElement = (DeadlineViolation) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_Relate_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Cause_4016(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTaskViolation_3013IncomingLinks(View view) {
		TaskViolation modelElement = (TaskViolation) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_Relate_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Cause_4016(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAvailability_3014IncomingLinks(View view) {
		Availability modelElement = (Availability) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_Relate_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Cause_4016(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlanSynthesis_3015IncomingLinks(View view) {
		PlanSynthesis modelElement = (PlanSynthesis) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_DueTo_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_Effect_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getParameter_3016IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResult_3017IncomingLinks(View view) {
		Result modelElement = (Result) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_FailureAct_Reason_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Disaster_Reason_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlanDistribution_3018IncomingLinks(View view) {
		PlanDistribution modelElement = (PlanDistribution) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_DueTo_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_Effect_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlanSchedule_3019IncomingLinks(View view) {
		PlanSchedule modelElement = (PlanSchedule) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_DueTo_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_Effect_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlanExecution_3020IncomingLinks(View view) {
		PlanExecution modelElement = (PlanExecution) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_DueTo_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_Effect_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getServiceInvocation_3021IncomingLinks(View view) {
		ServiceInvocation modelElement = (ServiceInvocation) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_DueTo_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_Effect_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReplaceAgent_3022IncomingLinks(View view) {
		ReplaceAgent modelElement = (ReplaceAgent) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_DueTo_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_Effect_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAgentReplan_3023IncomingLinks(View view) {
		AgentReplan modelElement = (AgentReplan) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_DueTo_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_Effect_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNotifyStateOfWorld_3024IncomingLinks(View view) {
		NotifyStateOfWorld modelElement = (NotifyStateOfWorld) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_DueTo_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_Effect_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCoordinationAction_3028IncomingLinks(View view) {
		CoordinationAction modelElement = (CoordinationAction) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_DueTo_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Fact_Effect_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_3029IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActionGrounding_3027IncomingLinks(View view) {
		ActionGrounding modelElement = (ActionGrounding) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_CoordinationAction_CoordAction_4018(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2023OutgoingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Event_Asserter_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_2024OutgoingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Event_Asserter_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionEnactment_2020OutgoingLinks(View view) {
		ActionEnactment modelElement = (ActionEnactment) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Enactment_Resource_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlanEnactment_2021OutgoingLinks(View view) {
		PlanEnactment modelElement = (PlanEnactment) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Enactment_Resource_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEnactment_2025OutgoingLinks(View view) {
		Enactment modelElement = (Enactment) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Enactment_Resource_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlan_2014OutgoingLinks(View view) {
		Plan modelElement = (Plan) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Plan_HasAtomicProcessGroundingList_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAgent_2015OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActor_2026OutgoingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Actor_Agent_4020(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getService_2016OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getObjective_2017OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_2027OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAtomicAction_2018OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAction_2019OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEventGroup_2028OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEventGroup_2029OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActionGroundingList_2022OutgoingLinks(View view) {
		ActionGroundingList modelElement = (ActionGroundingList) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ActionGroundingList_Rest_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActorView_3001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getContent_3002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStartedAct_3003OutgoingLinks(View view) {
		StartedAct modelElement = (StartedAct) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_DueTo_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Effect_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Relate_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExecutedAct_3004OutgoingLinks(View view) {
		ExecutedAct modelElement = (ExecutedAct) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_DueTo_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Effect_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Relate_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFailureAct_3005OutgoingLinks(View view) {
		FailureAct modelElement = (FailureAct) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_DueTo_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Effect_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Relate_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_FailureAct_Reason_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDisaster_3006OutgoingLinks(View view) {
		Disaster modelElement = (Disaster) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_DueTo_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Effect_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Relate_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Disaster_Reason_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNormInstanceViolated_3007OutgoingLinks(View view) {
		NormInstanceViolated modelElement = (NormInstanceViolated) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_DueTo_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Effect_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Relate_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReceiveAct_3008OutgoingLinks(View view) {
		ReceiveAct modelElement = (ReceiveAct) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_DueTo_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Effect_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Relate_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CommunicativeAct_Receiver_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CommunicativeAct_Sender_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMessage_3009OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSendAct_3010OutgoingLinks(View view) {
		SendAct modelElement = (SendAct) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_DueTo_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Effect_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Relate_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CommunicativeAct_Receiver_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CommunicativeAct_Sender_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMessage_3011OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDeadlineViolation_3012OutgoingLinks(View view) {
		DeadlineViolation modelElement = (DeadlineViolation) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_DueTo_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Effect_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Relate_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTaskViolation_3013OutgoingLinks(View view) {
		TaskViolation modelElement = (TaskViolation) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_DueTo_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Effect_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Relate_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_TaskViolation_UnmetRequirement_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAvailability_3014OutgoingLinks(View view) {
		Availability modelElement = (Availability) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_DueTo_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Effect_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Fact_Relate_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlanSynthesis_3015OutgoingLinks(View view) {
		PlanSynthesis modelElement = (PlanSynthesis) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PlanningActions_Plan_4005(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_ByActor_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Enactment_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Cause_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getParameter_3016OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResult_3017OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPlanDistribution_3018OutgoingLinks(View view) {
		PlanDistribution modelElement = (PlanDistribution) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PlanningActions_Plan_4005(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_ByActor_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Enactment_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Cause_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlanSchedule_3019OutgoingLinks(View view) {
		PlanSchedule modelElement = (PlanSchedule) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PlanningActions_Plan_4005(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_ByActor_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Enactment_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Cause_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlanExecution_3020OutgoingLinks(View view) {
		PlanExecution modelElement = (PlanExecution) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_PlanningActions_Plan_4005(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_ByActor_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Enactment_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Cause_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getServiceInvocation_3021OutgoingLinks(View view) {
		ServiceInvocation modelElement = (ServiceInvocation) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceInvocation_EnactingAgent_4006(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_ByActor_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Enactment_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Cause_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReplaceAgent_3022OutgoingLinks(View view) {
		ReplaceAgent modelElement = (ReplaceAgent) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_ByActor_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Enactment_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Cause_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAgentReplan_3023OutgoingLinks(View view) {
		AgentReplan modelElement = (AgentReplan) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_ByActor_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Enactment_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Cause_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNotifyStateOfWorld_3024OutgoingLinks(View view) {
		NotifyStateOfWorld modelElement = (NotifyStateOfWorld) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_ByActor_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Enactment_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Cause_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCoordinationAction_3028OutgoingLinks(View view) {
		CoordinationAction modelElement = (CoordinationAction) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_ByActor_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Enactment_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Action_Cause_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CoordinationAction_CoordAction_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CoordinationAction_Plan_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEvent_3029OutgoingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Event_Asserter_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionGrounding_3027OutgoingLinks(View view) {
		ActionGrounding modelElement = (ActionGrounding) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ActionGrounding_OwlsProcess_4023(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Fact_DueTo_4001(
			Action target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == FactPackage.eINSTANCE
					.getFact_DueTo()) {
				result.add(new WfvvLinkDescriptor(setting.getEObject(), target,
						WfvvElementTypes.FactDueTo_4001,
						FactDueToEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Fact_Effect_4002(
			Action target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == FactPackage.eINSTANCE
					.getFact_Effect()) {
				result.add(new WfvvLinkDescriptor(setting.getEObject(), target,
						WfvvElementTypes.FactEffect_4002,
						FactEffectEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Fact_Relate_4003(
			Fact target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == FactPackage.eINSTANCE
					.getFact_Relate()) {
				result.add(new WfvvLinkDescriptor(setting.getEObject(), target,
						WfvvElementTypes.FactRelate_4003,
						FactRelateEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_PlanningActions_Plan_4005(
			Plan target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ActionPackage.eINSTANCE
					.getPlanningActions_Plan()) {
				result.add(new WfvvLinkDescriptor(setting.getEObject(), target,
						WfvvElementTypes.PlanningActionsPlan_4005,
						PlanningActionsPlanEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ServiceInvocation_EnactingAgent_4006(
			Agent target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ActionPackage.eINSTANCE
					.getServiceInvocation_EnactingAgent()) {
				result.add(new WfvvLinkDescriptor(setting.getEObject(), target,
						WfvvElementTypes.ServiceInvocationEnactingAgent_4006,
						ServiceInvocationEnactingAgentEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_FailureAct_Reason_4008(
			EObject target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == FactPackage.eINSTANCE
					.getFailureAct_Reason()) {
				result.add(new WfvvLinkDescriptor(setting.getEObject(),
						(EObject) target,
						WfvvElementTypes.FailureActReason_4008,
						FailureActReasonEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Disaster_Reason_4009(
			EObject target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == FactPackage.eINSTANCE
					.getDisaster_Reason()) {
				result.add(new WfvvLinkDescriptor(setting.getEObject(),
						(EObject) target, WfvvElementTypes.DisasterReason_4009,
						DisasterReasonEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_CommunicativeAct_Receiver_4011(
			Actor target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == FactPackage.eINSTANCE
					.getCommunicativeAct_Receiver()) {
				result.add(new WfvvLinkDescriptor(setting.getEObject(), target,
						WfvvElementTypes.CommunicativeActReceiver_4011,
						CommunicativeActReceiverEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_CommunicativeAct_Sender_4012(
			Actor target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == FactPackage.eINSTANCE
					.getCommunicativeAct_Sender()) {
				result.add(new WfvvLinkDescriptor(setting.getEObject(), target,
						WfvvElementTypes.CommunicativeActSender_4012,
						CommunicativeActSenderEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_TaskViolation_UnmetRequirement_4013(
			Objective target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == FactPackage.eINSTANCE
					.getTaskViolation_UnmetRequirement()) {
				result.add(new WfvvLinkDescriptor(setting.getEObject(), target,
						WfvvElementTypes.TaskViolationUnmetRequirement_4013,
						TaskViolationUnmetRequirementEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Action_ByActor_4014(
			Actor target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ActionPackage.eINSTANCE
					.getAction_ByActor()) {
				result.add(new WfvvLinkDescriptor(setting.getEObject(), target,
						WfvvElementTypes.ActionByActor_4014,
						ActionByActorEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Action_Enactment_4015(
			Enactment target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ActionPackage.eINSTANCE
					.getAction_Enactment()) {
				result.add(new WfvvLinkDescriptor(setting.getEObject(), target,
						WfvvElementTypes.ActionEnactment_4015,
						ActionEnactmentEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Action_Cause_4016(
			Fact target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ActionPackage.eINSTANCE
					.getAction_Cause()) {
				result.add(new WfvvLinkDescriptor(setting.getEObject(), target,
						WfvvElementTypes.ActionCause_4016,
						ActionCauseEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Enactment_Resource_4017(
			net.sf.ictalive.runtime.enactment.Resource target,
			Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == EnactmentPackage.eINSTANCE
					.getEnactment_Resource()) {
				result.add(new WfvvLinkDescriptor(setting.getEObject(), target,
						WfvvElementTypes.EnactmentResource_4017,
						EnactmentResourceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_CoordinationAction_CoordAction_4018(
			ActionGrounding target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ActionPackage.eINSTANCE
					.getCoordinationAction_CoordAction()) {
				result.add(new WfvvLinkDescriptor(setting.getEObject(), target,
						WfvvElementTypes.CoordinationActionCoordAction_4018,
						CoordinationActionCoordActionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_CoordinationAction_Plan_4004(
			Plan target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ActionPackage.eINSTANCE
					.getCoordinationAction_Plan()) {
				result.add(new WfvvLinkDescriptor(setting.getEObject(), target,
						WfvvElementTypes.CoordinationActionPlan_4004,
						CoordinationActionPlanEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Event_Asserter_4019(
			Actor target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == EventPackage.eINSTANCE
					.getEvent_Asserter()) {
				result.add(new WfvvLinkDescriptor(setting.getEObject(), target,
						WfvvElementTypes.EventAsserter_4019,
						EventAsserterEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Actor_Agent_4020(
			Agent target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == EventPackage.eINSTANCE
					.getActor_Agent()) {
				result.add(new WfvvLinkDescriptor(setting.getEObject(), target,
						WfvvElementTypes.ActorAgent_4020,
						ActorAgentEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Plan_HasAtomicProcessGroundingList_4021(
			ActionGroundingList target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == TasksPackage.eINSTANCE
					.getPlan_HasAtomicProcessGroundingList()) {
				result
						.add(new WfvvLinkDescriptor(
								setting.getEObject(),
								target,
								WfvvElementTypes.PlanHasAtomicProcessGroundingList_4021,
								PlanHasAtomicProcessGroundingListEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ActionGroundingList_Rest_4022(
			ActionGroundingList target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == TasksPackage.eINSTANCE
					.getActionGroundingList_Rest()) {
				result.add(new WfvvLinkDescriptor(setting.getEObject(), target,
						WfvvElementTypes.ActionGroundingListRest_4022,
						ActionGroundingListRestEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ActionGrounding_OwlsProcess_4023(
			net.sf.ictalive.coordination.actions.Action target,
			Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == TasksPackage.eINSTANCE
					.getActionGrounding_OwlsProcess()) {
				result.add(new WfvvLinkDescriptor(setting.getEObject(), target,
						WfvvElementTypes.ActionGroundingOwlsProcess_4023,
						ActionGroundingOwlsProcessEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Fact_DueTo_4001(
			Fact source) {
		Collection result = new LinkedList();
		Action destination = source.getDueTo();
		if (destination == null) {
			return result;
		}
		result.add(new WfvvLinkDescriptor(source, destination,
				WfvvElementTypes.FactDueTo_4001, FactDueToEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Fact_Effect_4002(
			Fact source) {
		Collection result = new LinkedList();
		Action destination = source.getEffect();
		if (destination == null) {
			return result;
		}
		result
				.add(new WfvvLinkDescriptor(source, destination,
						WfvvElementTypes.FactEffect_4002,
						FactEffectEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Fact_Relate_4003(
			Fact source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getRelate().iterator(); destinations
				.hasNext();) {
			Fact destination = (Fact) destinations.next();
			result.add(new WfvvLinkDescriptor(source, destination,
					WfvvElementTypes.FactRelate_4003,
					FactRelateEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_PlanningActions_Plan_4005(
			PlanningActions source) {
		Collection result = new LinkedList();
		Plan destination = source.getPlan();
		if (destination == null) {
			return result;
		}
		result.add(new WfvvLinkDescriptor(source, destination,
				WfvvElementTypes.PlanningActionsPlan_4005,
				PlanningActionsPlanEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ServiceInvocation_EnactingAgent_4006(
			ServiceInvocation source) {
		Collection result = new LinkedList();
		Agent destination = source.getEnactingAgent();
		if (destination == null) {
			return result;
		}
		result.add(new WfvvLinkDescriptor(source, destination,
				WfvvElementTypes.ServiceInvocationEnactingAgent_4006,
				ServiceInvocationEnactingAgentEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_FailureAct_Reason_4008(
			FailureAct source) {
		Collection result = new LinkedList();
		EObject destination = source.getReason();
		if (destination == null) {
			return result;
		}
		result.add(new WfvvLinkDescriptor(source, (EObject) destination,
				WfvvElementTypes.FailureActReason_4008,
				FailureActReasonEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Disaster_Reason_4009(
			Disaster source) {
		Collection result = new LinkedList();
		EObject destination = source.getReason();
		if (destination == null) {
			return result;
		}
		result.add(new WfvvLinkDescriptor(source, (EObject) destination,
				WfvvElementTypes.DisasterReason_4009,
				DisasterReasonEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_CommunicativeAct_Receiver_4011(
			CommunicativeAct source) {
		Collection result = new LinkedList();
		Actor destination = source.getReceiver();
		if (destination == null) {
			return result;
		}
		result.add(new WfvvLinkDescriptor(source, destination,
				WfvvElementTypes.CommunicativeActReceiver_4011,
				CommunicativeActReceiverEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_CommunicativeAct_Sender_4012(
			CommunicativeAct source) {
		Collection result = new LinkedList();
		Actor destination = source.getSender();
		if (destination == null) {
			return result;
		}
		result.add(new WfvvLinkDescriptor(source, destination,
				WfvvElementTypes.CommunicativeActSender_4012,
				CommunicativeActSenderEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_TaskViolation_UnmetRequirement_4013(
			TaskViolation source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getUnmetRequirement().iterator(); destinations
				.hasNext();) {
			Objective destination = (Objective) destinations.next();
			result.add(new WfvvLinkDescriptor(source, destination,
					WfvvElementTypes.TaskViolationUnmetRequirement_4013,
					TaskViolationUnmetRequirementEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Action_ByActor_4014(
			Action source) {
		Collection result = new LinkedList();
		Actor destination = source.getByActor();
		if (destination == null) {
			return result;
		}
		result.add(new WfvvLinkDescriptor(source, destination,
				WfvvElementTypes.ActionByActor_4014,
				ActionByActorEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Action_Enactment_4015(
			Action source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getEnactment().iterator(); destinations
				.hasNext();) {
			Enactment destination = (Enactment) destinations.next();
			result.add(new WfvvLinkDescriptor(source, destination,
					WfvvElementTypes.ActionEnactment_4015,
					ActionEnactmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Action_Cause_4016(
			Action source) {
		Collection result = new LinkedList();
		Fact destination = source.getCause();
		if (destination == null) {
			return result;
		}
		result.add(new WfvvLinkDescriptor(source, destination,
				WfvvElementTypes.ActionCause_4016,
				ActionCauseEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Enactment_Resource_4017(
			Enactment source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getResource().iterator(); destinations
				.hasNext();) {
			net.sf.ictalive.runtime.enactment.Resource destination = (net.sf.ictalive.runtime.enactment.Resource) destinations
					.next();
			result.add(new WfvvLinkDescriptor(source, destination,
					WfvvElementTypes.EnactmentResource_4017,
					EnactmentResourceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_CoordinationAction_CoordAction_4018(
			CoordinationAction source) {
		Collection result = new LinkedList();
		ActionGrounding destination = source.getCoordAction();
		if (destination == null) {
			return result;
		}
		result.add(new WfvvLinkDescriptor(source, destination,
				WfvvElementTypes.CoordinationActionCoordAction_4018,
				CoordinationActionCoordActionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_CoordinationAction_Plan_4004(
			CoordinationAction source) {
		Collection result = new LinkedList();
		Plan destination = source.getPlan();
		if (destination == null) {
			return result;
		}
		result.add(new WfvvLinkDescriptor(source, destination,
				WfvvElementTypes.CoordinationActionPlan_4004,
				CoordinationActionPlanEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Event_Asserter_4019(
			Event source) {
		Collection result = new LinkedList();
		Actor destination = source.getAsserter();
		if (destination == null) {
			return result;
		}
		result.add(new WfvvLinkDescriptor(source, destination,
				WfvvElementTypes.EventAsserter_4019,
				EventAsserterEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Actor_Agent_4020(
			Actor source) {
		Collection result = new LinkedList();
		Agent destination = source.getAgent();
		if (destination == null) {
			return result;
		}
		result
				.add(new WfvvLinkDescriptor(source, destination,
						WfvvElementTypes.ActorAgent_4020,
						ActorAgentEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Plan_HasAtomicProcessGroundingList_4021(
			Plan source) {
		Collection result = new LinkedList();
		ActionGroundingList destination = source
				.getHasAtomicProcessGroundingList();
		if (destination == null) {
			return result;
		}
		result.add(new WfvvLinkDescriptor(source, destination,
				WfvvElementTypes.PlanHasAtomicProcessGroundingList_4021,
				PlanHasAtomicProcessGroundingListEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ActionGroundingList_Rest_4022(
			ActionGroundingList source) {
		Collection result = new LinkedList();
		ActionGroundingList destination = source.getRest();
		if (destination == null) {
			return result;
		}
		result.add(new WfvvLinkDescriptor(source, destination,
				WfvvElementTypes.ActionGroundingListRest_4022,
				ActionGroundingListRestEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ActionGrounding_OwlsProcess_4023(
			ActionGrounding source) {
		Collection result = new LinkedList();
		net.sf.ictalive.coordination.actions.Action destination = source
				.getOwlsProcess();
		if (destination == null) {
			return result;
		}
		result.add(new WfvvLinkDescriptor(source, destination,
				WfvvElementTypes.ActionGroundingOwlsProcess_4023,
				ActionGroundingOwlsProcessEditPart.VISUAL_ID));
		return result;
	}

}
