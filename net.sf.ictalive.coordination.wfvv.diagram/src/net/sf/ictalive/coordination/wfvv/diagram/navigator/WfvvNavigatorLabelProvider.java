package net.sf.ictalive.coordination.wfvv.diagram.navigator;

import net.sf.ictalive.coordination.actions.CompositeAction;
import net.sf.ictalive.coordination.tasks.ActionGrounding;
import net.sf.ictalive.coordination.tasks.ActionGroundingList;
import net.sf.ictalive.coordination.tasks.Plan;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionByActorEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionCauseEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionEnactment2EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionEnactmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionEnactmentSessionIdEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingListEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingListRestEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingOwlsProcessEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActorAgentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActorEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActorNameEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActorViewEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AgentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AgentNameEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AgentReplanEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AtomicActionNameEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AvailabilityEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AvailabilityStatusEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CommunicativeActReceiverEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CommunicativeActSenderEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CompositeActionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ContentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CoordinationActionCoordActionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CoordinationActionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CoordinationActionPlanEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.DeadlineViolationDealineEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.DeadlineViolationEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.DisasterEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.DisasterReasonEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EnactmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EnactmentResourceEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EnactmentSessionIdEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.Event2EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.Event3EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventAsserterEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventGroup2EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventGroupEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventGroupName2EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventGroupNameEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventModelContainerEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventTimestamp2EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventTimestamp3EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventTimestampEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ExecutedActEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FactDueToEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FactEffectEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FactRelateEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FailureActEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FailureActReasonEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.Message2EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.MessageEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.NSNormsEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.NormInstanceViolatedEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.NotifyStateOfWorldEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ObjectiveEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ObjectiveNameEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ParameterEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanDistributionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanEnactmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanEnactmentSessionIdEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanExecutionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanHasAtomicProcessGroundingListEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanScheduleEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanSynthesisEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanningActionsPlanEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ReceiveActEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ReplaceAgentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ResourceEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ResultEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.SendActEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ServiceEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ServiceInvocationEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ServiceInvocationEnactingAgentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.StartedActEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.TaskViolationEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.TaskViolationUnmetRequirementEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.WrappingLabel20EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.WrappingLabel21EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.WrappingLabel22EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvDiagramEditorPlugin;
import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvVisualIDRegistry;
import net.sf.ictalive.coordination.wfvv.diagram.providers.WfvvElementTypes;
import net.sf.ictalive.coordination.wfvv.diagram.providers.WfvvParserProvider;
import net.sf.ictalive.runtime.action.ServiceInvocation;
import net.sf.ictalive.runtime.enactment.Resource;
import net.sf.ictalive.runtime.fact.FailureAct;
import net.sf.ictalive.runtime.fact.Message;

import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class WfvvNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		WfvvDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		WfvvDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof WfvvNavigatorItem
				&& !isOwnView(((WfvvNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof WfvvNavigatorGroup) {
			WfvvNavigatorGroup group = (WfvvNavigatorGroup) element;
			return WfvvDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof WfvvNavigatorItem) {
			WfvvNavigatorItem navigatorItem = (WfvvNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (WfvvVisualIDRegistry.getVisualID(view)) {
		case EventModelContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://net.sf.ictalive.coordination.wfvv?EventModelContainer", WfvvElementTypes.EventModelContainer_1000); //$NON-NLS-1$
		case EventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/RunTime/events?Event", WfvvElementTypes.Event_2023); //$NON-NLS-1$
		case Event2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/RunTime/events?Event", WfvvElementTypes.Event_2024); //$NON-NLS-1$
		case ActionEnactment2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/RunTime/enactment?ActionEnactment", WfvvElementTypes.ActionEnactment_2020); //$NON-NLS-1$
		case PlanEnactmentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/RunTime/enactment?PlanEnactment", WfvvElementTypes.PlanEnactment_2021); //$NON-NLS-1$
		case EnactmentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/RunTime/enactment?Enactment", WfvvElementTypes.Enactment_2025); //$NON-NLS-1$
		case PlanEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/coordination/tasks?Plan", WfvvElementTypes.Plan_2014); //$NON-NLS-1$
		case AgentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/coordination/agents?Agent", WfvvElementTypes.Agent_2015); //$NON-NLS-1$
		case ActorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/RunTime/events?Actor", WfvvElementTypes.Actor_2026); //$NON-NLS-1$
		case ServiceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/owls/service?Service", WfvvElementTypes.Service_2016); //$NON-NLS-1$
		case ObjectiveEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/operetta/OM/1.0?Objective", WfvvElementTypes.Objective_2017); //$NON-NLS-1$
		case ResourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/RunTime/enactment?Resource", WfvvElementTypes.Resource_2027); //$NON-NLS-1$
		case AtomicActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/coordination/actions?AtomicAction", WfvvElementTypes.AtomicAction_2018); //$NON-NLS-1$
		case CompositeActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/coordination/actions?CompositeAction", WfvvElementTypes.CompositeAction_2019); //$NON-NLS-1$
		case EventGroupEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://net.sf.ictalive.coordination.wfvv?EventGroup", WfvvElementTypes.EventGroup_2028); //$NON-NLS-1$
		case EventGroup2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://net.sf.ictalive.coordination.wfvv?EventGroup", WfvvElementTypes.EventGroup_2029); //$NON-NLS-1$
		case ActionGroundingListEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ict-alive.sourceforge.net/coordination/tasks?ActionGroundingList", WfvvElementTypes.ActionGroundingList_2022); //$NON-NLS-1$
		case ActorViewEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/events?ActorView", WfvvElementTypes.ActorView_3001); //$NON-NLS-1$
		case ContentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/facts?Content", WfvvElementTypes.Content_3002); //$NON-NLS-1$
		case StartedActEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/facts?StartedAct", WfvvElementTypes.StartedAct_3003); //$NON-NLS-1$
		case ExecutedActEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/facts?ExecutedAct", WfvvElementTypes.ExecutedAct_3004); //$NON-NLS-1$
		case FailureActEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/facts?FailureAct", WfvvElementTypes.FailureAct_3005); //$NON-NLS-1$
		case DisasterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/facts?Disaster", WfvvElementTypes.Disaster_3006); //$NON-NLS-1$
		case NormInstanceViolatedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/facts?NormInstanceViolated", WfvvElementTypes.NormInstanceViolated_3007); //$NON-NLS-1$
		case ReceiveActEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/facts?ReceiveAct", WfvvElementTypes.ReceiveAct_3008); //$NON-NLS-1$
		case MessageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/facts?Message", WfvvElementTypes.Message_3009); //$NON-NLS-1$
		case SendActEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/facts?SendAct", WfvvElementTypes.SendAct_3010); //$NON-NLS-1$
		case Message2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/facts?Message", WfvvElementTypes.Message_3011); //$NON-NLS-1$
		case DeadlineViolationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/facts?DeadlineViolation", WfvvElementTypes.DeadlineViolation_3012); //$NON-NLS-1$
		case TaskViolationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/facts?TaskViolation", WfvvElementTypes.TaskViolation_3013); //$NON-NLS-1$
		case AvailabilityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/facts?Availability", WfvvElementTypes.Availability_3014); //$NON-NLS-1$
		case PlanSynthesisEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/actions?PlanSynthesis", WfvvElementTypes.PlanSynthesis_3015); //$NON-NLS-1$
		case ParameterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/actions?Parameter", WfvvElementTypes.Parameter_3016); //$NON-NLS-1$
		case ResultEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/actions?Result", WfvvElementTypes.Result_3017); //$NON-NLS-1$
		case PlanDistributionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/actions?PlanDistribution", WfvvElementTypes.PlanDistribution_3018); //$NON-NLS-1$
		case PlanScheduleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/actions?PlanSchedule", WfvvElementTypes.PlanSchedule_3019); //$NON-NLS-1$
		case PlanExecutionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/actions?PlanExecution", WfvvElementTypes.PlanExecution_3020); //$NON-NLS-1$
		case ServiceInvocationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/actions?ServiceInvocation", WfvvElementTypes.ServiceInvocation_3021); //$NON-NLS-1$
		case ReplaceAgentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/actions?ReplaceAgent", WfvvElementTypes.ReplaceAgent_3022); //$NON-NLS-1$
		case AgentReplanEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/actions?AgentReplan", WfvvElementTypes.AgentReplan_3023); //$NON-NLS-1$
		case NotifyStateOfWorldEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/actions?NotifyStateOfWorld", WfvvElementTypes.NotifyStateOfWorld_3024); //$NON-NLS-1$
		case CoordinationActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/actions?CoordinationAction", WfvvElementTypes.CoordinationAction_3028); //$NON-NLS-1$
		case Event3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/RunTime/events?Event", WfvvElementTypes.Event_3029); //$NON-NLS-1$
		case ActionGroundingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ict-alive.sourceforge.net/coordination/tasks?ActionGrounding", WfvvElementTypes.ActionGrounding_3027); //$NON-NLS-1$
		case FactDueToEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/RunTime/facts?Fact?dueTo", WfvvElementTypes.FactDueTo_4001); //$NON-NLS-1$
		case FactEffectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/RunTime/facts?Fact?effect", WfvvElementTypes.FactEffect_4002); //$NON-NLS-1$
		case FactRelateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/RunTime/facts?Fact?relate", WfvvElementTypes.FactRelate_4003); //$NON-NLS-1$
		case PlanningActionsPlanEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/RunTime/actions?PlanningActions?plan", WfvvElementTypes.PlanningActionsPlan_4005); //$NON-NLS-1$
		case ServiceInvocationEnactingAgentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/RunTime/actions?ServiceInvocation?enactingAgent", WfvvElementTypes.ServiceInvocationEnactingAgent_4006); //$NON-NLS-1$
		case FailureActReasonEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/RunTime/facts?FailureAct?reason", WfvvElementTypes.FailureActReason_4008); //$NON-NLS-1$
		case DisasterReasonEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/RunTime/facts?Disaster?reason", WfvvElementTypes.DisasterReason_4009); //$NON-NLS-1$
		case NSNormsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/operetta/OM/1.0?NS?norms", WfvvElementTypes.NSNorms_4010); //$NON-NLS-1$
		case CommunicativeActReceiverEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/RunTime/facts?CommunicativeAct?receiver", WfvvElementTypes.CommunicativeActReceiver_4011); //$NON-NLS-1$
		case CommunicativeActSenderEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/RunTime/facts?CommunicativeAct?sender", WfvvElementTypes.CommunicativeActSender_4012); //$NON-NLS-1$
		case TaskViolationUnmetRequirementEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/RunTime/facts?TaskViolation?unmetRequirement", WfvvElementTypes.TaskViolationUnmetRequirement_4013); //$NON-NLS-1$
		case ActionByActorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/RunTime/actions?Action?byActor", WfvvElementTypes.ActionByActor_4014); //$NON-NLS-1$
		case ActionEnactmentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/RunTime/actions?Action?enactment", WfvvElementTypes.ActionEnactment_4015); //$NON-NLS-1$
		case ActionCauseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/RunTime/actions?Action?cause", WfvvElementTypes.ActionCause_4016); //$NON-NLS-1$
		case EnactmentResourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/RunTime/enactment?Enactment?resource", WfvvElementTypes.EnactmentResource_4017); //$NON-NLS-1$
		case CoordinationActionCoordActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/RunTime/actions?CoordinationAction?coordAction", WfvvElementTypes.CoordinationActionCoordAction_4018); //$NON-NLS-1$
		case CoordinationActionPlanEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/RunTime/actions?CoordinationAction?plan", WfvvElementTypes.CoordinationActionPlan_4004); //$NON-NLS-1$
		case EventAsserterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/RunTime/events?Event?asserter", WfvvElementTypes.EventAsserter_4019); //$NON-NLS-1$
		case ActorAgentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/RunTime/events?Actor?agent", WfvvElementTypes.ActorAgent_4020); //$NON-NLS-1$
		case PlanHasAtomicProcessGroundingListEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/tasks?Plan?hasAtomicProcessGroundingList", WfvvElementTypes.PlanHasAtomicProcessGroundingList_4021); //$NON-NLS-1$
		case ActionGroundingListRestEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/tasks?ActionGroundingList?rest", WfvvElementTypes.ActionGroundingListRest_4022); //$NON-NLS-1$
		case ActionGroundingOwlsProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ict-alive.sourceforge.net/coordination/tasks?ActionGrounding?owlsProcess", WfvvElementTypes.ActionGroundingOwlsProcess_4023); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = WfvvDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& WfvvElementTypes.isKnownElementType(elementType)) {
			image = WfvvElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof WfvvNavigatorGroup) {
			WfvvNavigatorGroup group = (WfvvNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof WfvvNavigatorItem) {
			WfvvNavigatorItem navigatorItem = (WfvvNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (WfvvVisualIDRegistry.getVisualID(view)) {
		case EventModelContainerEditPart.VISUAL_ID:
			return getEventModelContainer_1000Text(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2023Text(view);
		case Event2EditPart.VISUAL_ID:
			return getEvent_2024Text(view);
		case ActionEnactment2EditPart.VISUAL_ID:
			return getActionEnactment_2020Text(view);
		case PlanEnactmentEditPart.VISUAL_ID:
			return getPlanEnactment_2021Text(view);
		case EnactmentEditPart.VISUAL_ID:
			return getEnactment_2025Text(view);
		case PlanEditPart.VISUAL_ID:
			return getPlan_2014Text(view);
		case AgentEditPart.VISUAL_ID:
			return getAgent_2015Text(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2026Text(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2016Text(view);
		case ObjectiveEditPart.VISUAL_ID:
			return getObjective_2017Text(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_2027Text(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2018Text(view);
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2019Text(view);
		case EventGroupEditPart.VISUAL_ID:
			return getEventGroup_2028Text(view);
		case EventGroup2EditPart.VISUAL_ID:
			return getEventGroup_2029Text(view);
		case ActionGroundingListEditPart.VISUAL_ID:
			return getActionGroundingList_2022Text(view);
		case ActorViewEditPart.VISUAL_ID:
			return getActorView_3001Text(view);
		case ContentEditPart.VISUAL_ID:
			return getContent_3002Text(view);
		case StartedActEditPart.VISUAL_ID:
			return getStartedAct_3003Text(view);
		case ExecutedActEditPart.VISUAL_ID:
			return getExecutedAct_3004Text(view);
		case FailureActEditPart.VISUAL_ID:
			return getFailureAct_3005Text(view);
		case DisasterEditPart.VISUAL_ID:
			return getDisaster_3006Text(view);
		case NormInstanceViolatedEditPart.VISUAL_ID:
			return getNormInstanceViolated_3007Text(view);
		case ReceiveActEditPart.VISUAL_ID:
			return getReceiveAct_3008Text(view);
		case MessageEditPart.VISUAL_ID:
			return getMessage_3009Text(view);
		case SendActEditPart.VISUAL_ID:
			return getSendAct_3010Text(view);
		case Message2EditPart.VISUAL_ID:
			return getMessage_3011Text(view);
		case DeadlineViolationEditPart.VISUAL_ID:
			return getDeadlineViolation_3012Text(view);
		case TaskViolationEditPart.VISUAL_ID:
			return getTaskViolation_3013Text(view);
		case AvailabilityEditPart.VISUAL_ID:
			return getAvailability_3014Text(view);
		case PlanSynthesisEditPart.VISUAL_ID:
			return getPlanSynthesis_3015Text(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3016Text(view);
		case ResultEditPart.VISUAL_ID:
			return getResult_3017Text(view);
		case PlanDistributionEditPart.VISUAL_ID:
			return getPlanDistribution_3018Text(view);
		case PlanScheduleEditPart.VISUAL_ID:
			return getPlanSchedule_3019Text(view);
		case PlanExecutionEditPart.VISUAL_ID:
			return getPlanExecution_3020Text(view);
		case ServiceInvocationEditPart.VISUAL_ID:
			return getServiceInvocation_3021Text(view);
		case ReplaceAgentEditPart.VISUAL_ID:
			return getReplaceAgent_3022Text(view);
		case AgentReplanEditPart.VISUAL_ID:
			return getAgentReplan_3023Text(view);
		case NotifyStateOfWorldEditPart.VISUAL_ID:
			return getNotifyStateOfWorld_3024Text(view);
		case CoordinationActionEditPart.VISUAL_ID:
			return getCoordinationAction_3028Text(view);
		case Event3EditPart.VISUAL_ID:
			return getEvent_3029Text(view);
		case ActionGroundingEditPart.VISUAL_ID:
			return getActionGrounding_3027Text(view);
		case FactDueToEditPart.VISUAL_ID:
			return getFactDueTo_4001Text(view);
		case FactEffectEditPart.VISUAL_ID:
			return getFactEffect_4002Text(view);
		case FactRelateEditPart.VISUAL_ID:
			return getFactRelate_4003Text(view);
		case PlanningActionsPlanEditPart.VISUAL_ID:
			return getPlanningActionsPlan_4005Text(view);
		case ServiceInvocationEnactingAgentEditPart.VISUAL_ID:
			return getServiceInvocationEnactingAgent_4006Text(view);
		case FailureActReasonEditPart.VISUAL_ID:
			return getFailureActReason_4008Text(view);
		case DisasterReasonEditPart.VISUAL_ID:
			return getDisasterReason_4009Text(view);
		case NSNormsEditPart.VISUAL_ID:
			return getNSNorms_4010Text(view);
		case CommunicativeActReceiverEditPart.VISUAL_ID:
			return getCommunicativeActReceiver_4011Text(view);
		case CommunicativeActSenderEditPart.VISUAL_ID:
			return getCommunicativeActSender_4012Text(view);
		case TaskViolationUnmetRequirementEditPart.VISUAL_ID:
			return getTaskViolationUnmetRequirement_4013Text(view);
		case ActionByActorEditPart.VISUAL_ID:
			return getActionByActor_4014Text(view);
		case ActionEnactmentEditPart.VISUAL_ID:
			return getActionEnactment_4015Text(view);
		case ActionCauseEditPart.VISUAL_ID:
			return getActionCause_4016Text(view);
		case EnactmentResourceEditPart.VISUAL_ID:
			return getEnactmentResource_4017Text(view);
		case CoordinationActionCoordActionEditPart.VISUAL_ID:
			return getCoordinationActionCoordAction_4018Text(view);
		case CoordinationActionPlanEditPart.VISUAL_ID:
			return getCoordinationActionPlan_4004Text(view);
		case EventAsserterEditPart.VISUAL_ID:
			return getEventAsserter_4019Text(view);
		case ActorAgentEditPart.VISUAL_ID:
			return getActorAgent_4020Text(view);
		case PlanHasAtomicProcessGroundingListEditPart.VISUAL_ID:
			return getPlanHasAtomicProcessGroundingList_4021Text(view);
		case ActionGroundingListRestEditPart.VISUAL_ID:
			return getActionGroundingListRest_4022Text(view);
		case ActionGroundingOwlsProcessEditPart.VISUAL_ID:
			return getActionGroundingOwlsProcess_4023Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getEventModelContainer_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEvent_2023Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.Event_2023, view.getElement() != null ? view
						.getElement() : view, WfvvVisualIDRegistry
						.getType(EventTimestampEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEvent_2024Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.Event_2024, view.getElement() != null ? view
						.getElement() : view, WfvvVisualIDRegistry
						.getType(EventTimestamp2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActionEnactment_2020Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.ActionEnactment_2020,
				view.getElement() != null ? view.getElement() : view,
				WfvvVisualIDRegistry
						.getType(ActionEnactmentSessionIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPlanEnactment_2021Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.PlanEnactment_2021,
				view.getElement() != null ? view.getElement() : view,
				WfvvVisualIDRegistry
						.getType(PlanEnactmentSessionIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnactment_2025Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.Enactment_2025,
				view.getElement() != null ? view.getElement() : view,
				WfvvVisualIDRegistry
						.getType(EnactmentSessionIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPlan_2014Text(View view) {
		Plan domainModelElement = (Plan) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAgent_2015Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.Agent_2015, view.getElement() != null ? view
						.getElement() : view, WfvvVisualIDRegistry
						.getType(AgentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActor_2026Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.Actor_2026, view.getElement() != null ? view
						.getElement() : view, WfvvVisualIDRegistry
						.getType(ActorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getService_2016Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getObjective_2017Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.Objective_2017,
				view.getElement() != null ? view.getElement() : view,
				WfvvVisualIDRegistry.getType(ObjectiveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getResource_2027Text(View view) {
		Resource domainModelElement = (Resource) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUri();
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtomicAction_2018Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.AtomicAction_2018,
				view.getElement() != null ? view.getElement() : view,
				WfvvVisualIDRegistry
						.getType(AtomicActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeAction_2019Text(View view) {
		CompositeAction domainModelElement = (CompositeAction) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventGroup_2028Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.EventGroup_2028,
				view.getElement() != null ? view.getElement() : view,
				WfvvVisualIDRegistry.getType(EventGroupNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventGroup_2029Text(View view) {
		IParser parser = WfvvParserProvider
				.getParser(WfvvElementTypes.EventGroup_2029,
						view.getElement() != null ? view.getElement() : view,
						WfvvVisualIDRegistry
								.getType(EventGroupName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActionGroundingList_2022Text(View view) {
		ActionGroundingList domainModelElement = (ActionGroundingList) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActorView_3001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getContent_3002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getStartedAct_3003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getExecutedAct_3004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFailureAct_3005Text(View view) {
		FailureAct domainModelElement = (FailureAct) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getFailureReason());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDisaster_3006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNormInstanceViolated_3007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getReceiveAct_3008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMessage_3009Text(View view) {
		Message domainModelElement = (Message) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getBody();
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSendAct_3010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMessage_3011Text(View view) {
		Message domainModelElement = (Message) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getBody();
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDeadlineViolation_3012Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.DeadlineViolation_3012,
				view.getElement() != null ? view.getElement() : view,
				WfvvVisualIDRegistry
						.getType(DeadlineViolationDealineEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTaskViolation_3013Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAvailability_3014Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.Availability_3014,
				view.getElement() != null ? view.getElement() : view,
				WfvvVisualIDRegistry
						.getType(AvailabilityStatusEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPlanSynthesis_3015Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getParameter_3016Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getResult_3017Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPlanDistribution_3018Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPlanSchedule_3019Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPlanExecution_3020Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getServiceInvocation_3021Text(View view) {
		ServiceInvocation domainModelElement = (ServiceInvocation) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getServiceURI();
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReplaceAgent_3022Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAgentReplan_3023Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNotifyStateOfWorld_3024Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCoordinationAction_3028Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEvent_3029Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.Event_3029, view.getElement() != null ? view
						.getElement() : view, WfvvVisualIDRegistry
						.getType(EventTimestamp3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActionGrounding_3027Text(View view) {
		ActionGrounding domainModelElement = (ActionGrounding) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFactDueTo_4001Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.FactDueTo_4001,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFactEffect_4002Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.FactEffect_4002,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFactRelate_4003Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.FactRelate_4003,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPlanningActionsPlan_4005Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.PlanningActionsPlan_4005,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getServiceInvocationEnactingAgent_4006Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.ServiceInvocationEnactingAgent_4006, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFailureActReason_4008Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.FailureActReason_4008,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDisasterReason_4009Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.DisasterReason_4009,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNSNorms_4010Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.NSNorms_4010, view.getElement() != null ? view
						.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCommunicativeActReceiver_4011Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.CommunicativeActReceiver_4011, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCommunicativeActSender_4012Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.CommunicativeActSender_4012,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTaskViolationUnmetRequirement_4013Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.TaskViolationUnmetRequirement_4013, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActionByActor_4014Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.ActionByActor_4014,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActionEnactment_4015Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.ActionEnactment_4015,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActionCause_4016Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.ActionCause_4016,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnactmentResource_4017Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.EnactmentResource_4017,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCoordinationActionCoordAction_4018Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.CoordinationActionCoordAction_4018, view
						.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCoordinationActionPlan_4004Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.CoordinationActionPlan_4004,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventAsserter_4019Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.EventAsserter_4019,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActorAgent_4020Text(View view) {
		IParser parser = WfvvParserProvider.getParser(
				WfvvElementTypes.ActorAgent_4020,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPlanHasAtomicProcessGroundingList_4021Text(View view) {
		IParser parser = WfvvParserProvider
				.getParser(
						WfvvElementTypes.PlanHasAtomicProcessGroundingList_4021,
						view.getElement() != null ? view.getElement() : view,
						WfvvVisualIDRegistry
								.getType(WrappingLabel20EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActionGroundingListRest_4022Text(View view) {
		IParser parser = WfvvParserProvider
				.getParser(WfvvElementTypes.ActionGroundingListRest_4022, view
						.getElement() != null ? view.getElement() : view,
						WfvvVisualIDRegistry
								.getType(WrappingLabel21EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActionGroundingOwlsProcess_4023Text(View view) {
		IParser parser = WfvvParserProvider
				.getParser(WfvvElementTypes.ActionGroundingOwlsProcess_4023,
						view.getElement() != null ? view.getElement() : view,
						WfvvVisualIDRegistry
								.getType(WrappingLabel22EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WfvvDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return EventModelContainerEditPart.MODEL_ID.equals(WfvvVisualIDRegistry
				.getModelID(view));
	}

}
