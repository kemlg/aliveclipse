package net.sf.ictalive.coordination.wfvv.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.agents.AgentsPackage;
import net.sf.ictalive.coordination.tasks.TasksPackage;
import net.sf.ictalive.coordination.wfvv.WfvvPackage;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionByActorEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionCauseEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionEnactment2EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionEnactmentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingListEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingListRestEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActionGroundingOwlsProcessEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActorAgentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActorEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ActorViewEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AgentEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AgentReplanEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.AvailabilityEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CommunicativeActReceiverEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CommunicativeActSenderEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.CompositeActionEditPart;
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
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventGroup2EditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventGroupEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.EventModelContainerEditPart;
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
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.ParameterEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanDistributionEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanEditPart;
import net.sf.ictalive.coordination.wfvv.diagram.edit.parts.PlanEnactmentEditPart;
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
import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvDiagramEditorPlugin;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.owls.service.ServicePackage;
import net.sf.ictalive.runtime.action.ActionPackage;
import net.sf.ictalive.runtime.enactment.EnactmentPackage;
import net.sf.ictalive.runtime.event.EventPackage;
import net.sf.ictalive.runtime.fact.FactPackage;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class WfvvElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private WfvvElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType EventModelContainer_1000 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.EventModelContainer_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Event_2023 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.Event_2023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Event_2024 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.Event_2024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActionEnactment_2020 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.ActionEnactment_2020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PlanEnactment_2021 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.PlanEnactment_2021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Enactment_2025 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.Enactment_2025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Plan_2014 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.Plan_2014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Agent_2015 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.Agent_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Actor_2026 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.Actor_2026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Service_2016 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.Service_2016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Objective_2017 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.Objective_2017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Resource_2027 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.Resource_2027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomicAction_2018 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.AtomicAction_2018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeAction_2019 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.CompositeAction_2019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventGroup_2028 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.EventGroup_2028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventGroup_2029 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.EventGroup_2029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActionGroundingList_2022 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.ActionGroundingList_2022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActorView_3001 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.ActorView_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Content_3002 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.Content_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StartedAct_3003 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.StartedAct_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExecutedAct_3004 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.ExecutedAct_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FailureAct_3005 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.FailureAct_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Disaster_3006 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.Disaster_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NormInstanceViolated_3007 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.NormInstanceViolated_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ReceiveAct_3008 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.ReceiveAct_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Message_3009 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.Message_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SendAct_3010 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.SendAct_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Message_3011 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.Message_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeadlineViolation_3012 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.DeadlineViolation_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TaskViolation_3013 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.TaskViolation_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Availability_3014 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.Availability_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PlanSynthesis_3015 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.PlanSynthesis_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Parameter_3016 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.Parameter_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Result_3017 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.Result_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PlanDistribution_3018 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.PlanDistribution_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PlanSchedule_3019 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.PlanSchedule_3019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PlanExecution_3020 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.PlanExecution_3020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ServiceInvocation_3021 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.ServiceInvocation_3021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ReplaceAgent_3022 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.ReplaceAgent_3022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AgentReplan_3023 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.AgentReplan_3023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NotifyStateOfWorld_3024 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.NotifyStateOfWorld_3024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CoordinationAction_3028 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.CoordinationAction_3028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Event_3029 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.Event_3029"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ActionGrounding_3027 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.ActionGrounding_3027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FactDueTo_4001 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.FactDueTo_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FactEffect_4002 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.FactEffect_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FactRelate_4003 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.FactRelate_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PlanningActionsPlan_4005 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.PlanningActionsPlan_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ServiceInvocationEnactingAgent_4006 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.ServiceInvocationEnactingAgent_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FailureActReason_4008 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.FailureActReason_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DisasterReason_4009 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.DisasterReason_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NSNorms_4010 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.NSNorms_4010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CommunicativeActReceiver_4011 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.CommunicativeActReceiver_4011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CommunicativeActSender_4012 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.CommunicativeActSender_4012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TaskViolationUnmetRequirement_4013 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.TaskViolationUnmetRequirement_4013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActionByActor_4014 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.ActionByActor_4014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActionEnactment_4015 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.ActionEnactment_4015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActionCause_4016 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.ActionCause_4016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EnactmentResource_4017 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.EnactmentResource_4017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CoordinationActionCoordAction_4018 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.CoordinationActionCoordAction_4018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CoordinationActionPlan_4004 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.CoordinationActionPlan_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventAsserter_4019 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.EventAsserter_4019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActorAgent_4020 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.ActorAgent_4020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PlanHasAtomicProcessGroundingList_4021 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.PlanHasAtomicProcessGroundingList_4021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActionGroundingListRest_4022 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.ActionGroundingListRest_4022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActionGroundingOwlsProcess_4023 = getElementType("net.sf.ictalive.coordination.wfvv.diagram.ActionGroundingOwlsProcess_4023"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return WfvvDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(EventModelContainer_1000, WfvvPackage.eINSTANCE
					.getEventModelContainer());

			elements.put(Event_2023, EventPackage.eINSTANCE.getEvent());

			elements.put(Event_2024, EventPackage.eINSTANCE.getEvent());

			elements.put(ActionEnactment_2020, EnactmentPackage.eINSTANCE
					.getActionEnactment());

			elements.put(PlanEnactment_2021, EnactmentPackage.eINSTANCE
					.getPlanEnactment());

			elements.put(Enactment_2025, EnactmentPackage.eINSTANCE
					.getEnactment());

			elements.put(Plan_2014, TasksPackage.eINSTANCE.getPlan());

			elements.put(Agent_2015, AgentsPackage.eINSTANCE.getAgent());

			elements.put(Actor_2026, EventPackage.eINSTANCE.getActor());

			elements.put(Service_2016, ServicePackage.eINSTANCE.getService());

			elements.put(Objective_2017, OMPackage.eINSTANCE.getObjective());

			elements.put(Resource_2027, EnactmentPackage.eINSTANCE
					.getResource());

			elements.put(AtomicAction_2018, ActionsPackage.eINSTANCE
					.getAtomicAction());

			elements.put(CompositeAction_2019, ActionsPackage.eINSTANCE
					.getCompositeAction());

			elements
					.put(EventGroup_2028, WfvvPackage.eINSTANCE.getEventGroup());

			elements
					.put(EventGroup_2029, WfvvPackage.eINSTANCE.getEventGroup());

			elements.put(ActionGroundingList_2022, TasksPackage.eINSTANCE
					.getActionGroundingList());

			elements.put(ActorView_3001, EventPackage.eINSTANCE.getActorView());

			elements.put(Content_3002, FactPackage.eINSTANCE.getContent());

			elements
					.put(StartedAct_3003, FactPackage.eINSTANCE.getStartedAct());

			elements.put(ExecutedAct_3004, FactPackage.eINSTANCE
					.getExecutedAct());

			elements
					.put(FailureAct_3005, FactPackage.eINSTANCE.getFailureAct());

			elements.put(Disaster_3006, FactPackage.eINSTANCE.getDisaster());

			elements.put(NormInstanceViolated_3007, FactPackage.eINSTANCE
					.getNormInstanceViolated());

			elements
					.put(ReceiveAct_3008, FactPackage.eINSTANCE.getReceiveAct());

			elements.put(Message_3009, FactPackage.eINSTANCE.getMessage());

			elements.put(SendAct_3010, FactPackage.eINSTANCE.getSendAct());

			elements.put(Message_3011, FactPackage.eINSTANCE.getMessage());

			elements.put(DeadlineViolation_3012, FactPackage.eINSTANCE
					.getDeadlineViolation());

			elements.put(TaskViolation_3013, FactPackage.eINSTANCE
					.getTaskViolation());

			elements.put(Availability_3014, FactPackage.eINSTANCE
					.getAvailability());

			elements.put(PlanSynthesis_3015, ActionPackage.eINSTANCE
					.getPlanSynthesis());

			elements
					.put(Parameter_3016, ActionPackage.eINSTANCE.getParameter());

			elements.put(Result_3017, ActionPackage.eINSTANCE.getResult());

			elements.put(PlanDistribution_3018, ActionPackage.eINSTANCE
					.getPlanDistribution());

			elements.put(PlanSchedule_3019, ActionPackage.eINSTANCE
					.getPlanSchedule());

			elements.put(PlanExecution_3020, ActionPackage.eINSTANCE
					.getPlanExecution());

			elements.put(ServiceInvocation_3021, ActionPackage.eINSTANCE
					.getServiceInvocation());

			elements.put(ReplaceAgent_3022, ActionPackage.eINSTANCE
					.getReplaceAgent());

			elements.put(AgentReplan_3023, ActionPackage.eINSTANCE
					.getAgentReplan());

			elements.put(NotifyStateOfWorld_3024, ActionPackage.eINSTANCE
					.getNotifyStateOfWorld());

			elements.put(CoordinationAction_3028, ActionPackage.eINSTANCE
					.getCoordinationAction());

			elements.put(Event_3029, EventPackage.eINSTANCE.getEvent());

			elements.put(ActionGrounding_3027, TasksPackage.eINSTANCE
					.getActionGrounding());

			elements.put(FactDueTo_4001, FactPackage.eINSTANCE.getFact_DueTo());

			elements.put(FactEffect_4002, FactPackage.eINSTANCE
					.getFact_Effect());

			elements.put(FactRelate_4003, FactPackage.eINSTANCE
					.getFact_Relate());

			elements.put(PlanningActionsPlan_4005, ActionPackage.eINSTANCE
					.getPlanningActions_Plan());

			elements.put(ServiceInvocationEnactingAgent_4006,
					ActionPackage.eINSTANCE
							.getServiceInvocation_EnactingAgent());

			elements.put(FailureActReason_4008, FactPackage.eINSTANCE
					.getFailureAct_Reason());

			elements.put(DisasterReason_4009, FactPackage.eINSTANCE
					.getDisaster_Reason());

			elements.put(NSNorms_4010, OMPackage.eINSTANCE.getNS_Norms());

			elements.put(CommunicativeActReceiver_4011, FactPackage.eINSTANCE
					.getCommunicativeAct_Receiver());

			elements.put(CommunicativeActSender_4012, FactPackage.eINSTANCE
					.getCommunicativeAct_Sender());

			elements.put(TaskViolationUnmetRequirement_4013,
					FactPackage.eINSTANCE.getTaskViolation_UnmetRequirement());

			elements.put(ActionByActor_4014, ActionPackage.eINSTANCE
					.getAction_ByActor());

			elements.put(ActionEnactment_4015, ActionPackage.eINSTANCE
					.getAction_Enactment());

			elements.put(ActionCause_4016, ActionPackage.eINSTANCE
					.getAction_Cause());

			elements.put(EnactmentResource_4017, EnactmentPackage.eINSTANCE
					.getEnactment_Resource());

			elements
					.put(CoordinationActionCoordAction_4018,
							ActionPackage.eINSTANCE
									.getCoordinationAction_CoordAction());

			elements.put(CoordinationActionPlan_4004, ActionPackage.eINSTANCE
					.getCoordinationAction_Plan());

			elements.put(EventAsserter_4019, EventPackage.eINSTANCE
					.getEvent_Asserter());

			elements.put(ActorAgent_4020, EventPackage.eINSTANCE
					.getActor_Agent());

			elements.put(PlanHasAtomicProcessGroundingList_4021,
					TasksPackage.eINSTANCE
							.getPlan_HasAtomicProcessGroundingList());

			elements.put(ActionGroundingListRest_4022, TasksPackage.eINSTANCE
					.getActionGroundingList_Rest());

			elements.put(ActionGroundingOwlsProcess_4023,
					TasksPackage.eINSTANCE.getActionGrounding_OwlsProcess());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(EventModelContainer_1000);
			KNOWN_ELEMENT_TYPES.add(Event_2023);
			KNOWN_ELEMENT_TYPES.add(Event_2024);
			KNOWN_ELEMENT_TYPES.add(ActionEnactment_2020);
			KNOWN_ELEMENT_TYPES.add(PlanEnactment_2021);
			KNOWN_ELEMENT_TYPES.add(Enactment_2025);
			KNOWN_ELEMENT_TYPES.add(Plan_2014);
			KNOWN_ELEMENT_TYPES.add(Agent_2015);
			KNOWN_ELEMENT_TYPES.add(Actor_2026);
			KNOWN_ELEMENT_TYPES.add(Service_2016);
			KNOWN_ELEMENT_TYPES.add(Objective_2017);
			KNOWN_ELEMENT_TYPES.add(Resource_2027);
			KNOWN_ELEMENT_TYPES.add(AtomicAction_2018);
			KNOWN_ELEMENT_TYPES.add(CompositeAction_2019);
			KNOWN_ELEMENT_TYPES.add(EventGroup_2028);
			KNOWN_ELEMENT_TYPES.add(EventGroup_2029);
			KNOWN_ELEMENT_TYPES.add(ActionGroundingList_2022);
			KNOWN_ELEMENT_TYPES.add(ActorView_3001);
			KNOWN_ELEMENT_TYPES.add(Content_3002);
			KNOWN_ELEMENT_TYPES.add(StartedAct_3003);
			KNOWN_ELEMENT_TYPES.add(ExecutedAct_3004);
			KNOWN_ELEMENT_TYPES.add(FailureAct_3005);
			KNOWN_ELEMENT_TYPES.add(Disaster_3006);
			KNOWN_ELEMENT_TYPES.add(NormInstanceViolated_3007);
			KNOWN_ELEMENT_TYPES.add(ReceiveAct_3008);
			KNOWN_ELEMENT_TYPES.add(Message_3009);
			KNOWN_ELEMENT_TYPES.add(SendAct_3010);
			KNOWN_ELEMENT_TYPES.add(Message_3011);
			KNOWN_ELEMENT_TYPES.add(DeadlineViolation_3012);
			KNOWN_ELEMENT_TYPES.add(TaskViolation_3013);
			KNOWN_ELEMENT_TYPES.add(Availability_3014);
			KNOWN_ELEMENT_TYPES.add(PlanSynthesis_3015);
			KNOWN_ELEMENT_TYPES.add(Parameter_3016);
			KNOWN_ELEMENT_TYPES.add(Result_3017);
			KNOWN_ELEMENT_TYPES.add(PlanDistribution_3018);
			KNOWN_ELEMENT_TYPES.add(PlanSchedule_3019);
			KNOWN_ELEMENT_TYPES.add(PlanExecution_3020);
			KNOWN_ELEMENT_TYPES.add(ServiceInvocation_3021);
			KNOWN_ELEMENT_TYPES.add(ReplaceAgent_3022);
			KNOWN_ELEMENT_TYPES.add(AgentReplan_3023);
			KNOWN_ELEMENT_TYPES.add(NotifyStateOfWorld_3024);
			KNOWN_ELEMENT_TYPES.add(CoordinationAction_3028);
			KNOWN_ELEMENT_TYPES.add(Event_3029);
			KNOWN_ELEMENT_TYPES.add(ActionGrounding_3027);
			KNOWN_ELEMENT_TYPES.add(FactDueTo_4001);
			KNOWN_ELEMENT_TYPES.add(FactEffect_4002);
			KNOWN_ELEMENT_TYPES.add(FactRelate_4003);
			KNOWN_ELEMENT_TYPES.add(PlanningActionsPlan_4005);
			KNOWN_ELEMENT_TYPES.add(ServiceInvocationEnactingAgent_4006);
			KNOWN_ELEMENT_TYPES.add(FailureActReason_4008);
			KNOWN_ELEMENT_TYPES.add(DisasterReason_4009);
			KNOWN_ELEMENT_TYPES.add(NSNorms_4010);
			KNOWN_ELEMENT_TYPES.add(CommunicativeActReceiver_4011);
			KNOWN_ELEMENT_TYPES.add(CommunicativeActSender_4012);
			KNOWN_ELEMENT_TYPES.add(TaskViolationUnmetRequirement_4013);
			KNOWN_ELEMENT_TYPES.add(ActionByActor_4014);
			KNOWN_ELEMENT_TYPES.add(ActionEnactment_4015);
			KNOWN_ELEMENT_TYPES.add(ActionCause_4016);
			KNOWN_ELEMENT_TYPES.add(EnactmentResource_4017);
			KNOWN_ELEMENT_TYPES.add(CoordinationActionCoordAction_4018);
			KNOWN_ELEMENT_TYPES.add(CoordinationActionPlan_4004);
			KNOWN_ELEMENT_TYPES.add(EventAsserter_4019);
			KNOWN_ELEMENT_TYPES.add(ActorAgent_4020);
			KNOWN_ELEMENT_TYPES.add(PlanHasAtomicProcessGroundingList_4021);
			KNOWN_ELEMENT_TYPES.add(ActionGroundingListRest_4022);
			KNOWN_ELEMENT_TYPES.add(ActionGroundingOwlsProcess_4023);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case EventModelContainerEditPart.VISUAL_ID:
			return EventModelContainer_1000;
		case EventEditPart.VISUAL_ID:
			return Event_2023;
		case Event2EditPart.VISUAL_ID:
			return Event_2024;
		case ActionEnactment2EditPart.VISUAL_ID:
			return ActionEnactment_2020;
		case PlanEnactmentEditPart.VISUAL_ID:
			return PlanEnactment_2021;
		case EnactmentEditPart.VISUAL_ID:
			return Enactment_2025;
		case PlanEditPart.VISUAL_ID:
			return Plan_2014;
		case AgentEditPart.VISUAL_ID:
			return Agent_2015;
		case ActorEditPart.VISUAL_ID:
			return Actor_2026;
		case ServiceEditPart.VISUAL_ID:
			return Service_2016;
		case ObjectiveEditPart.VISUAL_ID:
			return Objective_2017;
		case ResourceEditPart.VISUAL_ID:
			return Resource_2027;
		case AtomicActionEditPart.VISUAL_ID:
			return AtomicAction_2018;
		case CompositeActionEditPart.VISUAL_ID:
			return CompositeAction_2019;
		case EventGroupEditPart.VISUAL_ID:
			return EventGroup_2028;
		case EventGroup2EditPart.VISUAL_ID:
			return EventGroup_2029;
		case ActionGroundingListEditPart.VISUAL_ID:
			return ActionGroundingList_2022;
		case ActorViewEditPart.VISUAL_ID:
			return ActorView_3001;
		case ContentEditPart.VISUAL_ID:
			return Content_3002;
		case StartedActEditPart.VISUAL_ID:
			return StartedAct_3003;
		case ExecutedActEditPart.VISUAL_ID:
			return ExecutedAct_3004;
		case FailureActEditPart.VISUAL_ID:
			return FailureAct_3005;
		case DisasterEditPart.VISUAL_ID:
			return Disaster_3006;
		case NormInstanceViolatedEditPart.VISUAL_ID:
			return NormInstanceViolated_3007;
		case ReceiveActEditPart.VISUAL_ID:
			return ReceiveAct_3008;
		case MessageEditPart.VISUAL_ID:
			return Message_3009;
		case SendActEditPart.VISUAL_ID:
			return SendAct_3010;
		case Message2EditPart.VISUAL_ID:
			return Message_3011;
		case DeadlineViolationEditPart.VISUAL_ID:
			return DeadlineViolation_3012;
		case TaskViolationEditPart.VISUAL_ID:
			return TaskViolation_3013;
		case AvailabilityEditPart.VISUAL_ID:
			return Availability_3014;
		case PlanSynthesisEditPart.VISUAL_ID:
			return PlanSynthesis_3015;
		case ParameterEditPart.VISUAL_ID:
			return Parameter_3016;
		case ResultEditPart.VISUAL_ID:
			return Result_3017;
		case PlanDistributionEditPart.VISUAL_ID:
			return PlanDistribution_3018;
		case PlanScheduleEditPart.VISUAL_ID:
			return PlanSchedule_3019;
		case PlanExecutionEditPart.VISUAL_ID:
			return PlanExecution_3020;
		case ServiceInvocationEditPart.VISUAL_ID:
			return ServiceInvocation_3021;
		case ReplaceAgentEditPart.VISUAL_ID:
			return ReplaceAgent_3022;
		case AgentReplanEditPart.VISUAL_ID:
			return AgentReplan_3023;
		case NotifyStateOfWorldEditPart.VISUAL_ID:
			return NotifyStateOfWorld_3024;
		case CoordinationActionEditPart.VISUAL_ID:
			return CoordinationAction_3028;
		case Event3EditPart.VISUAL_ID:
			return Event_3029;
		case ActionGroundingEditPart.VISUAL_ID:
			return ActionGrounding_3027;
		case FactDueToEditPart.VISUAL_ID:
			return FactDueTo_4001;
		case FactEffectEditPart.VISUAL_ID:
			return FactEffect_4002;
		case FactRelateEditPart.VISUAL_ID:
			return FactRelate_4003;
		case PlanningActionsPlanEditPart.VISUAL_ID:
			return PlanningActionsPlan_4005;
		case ServiceInvocationEnactingAgentEditPart.VISUAL_ID:
			return ServiceInvocationEnactingAgent_4006;
		case FailureActReasonEditPart.VISUAL_ID:
			return FailureActReason_4008;
		case DisasterReasonEditPart.VISUAL_ID:
			return DisasterReason_4009;
		case NSNormsEditPart.VISUAL_ID:
			return NSNorms_4010;
		case CommunicativeActReceiverEditPart.VISUAL_ID:
			return CommunicativeActReceiver_4011;
		case CommunicativeActSenderEditPart.VISUAL_ID:
			return CommunicativeActSender_4012;
		case TaskViolationUnmetRequirementEditPart.VISUAL_ID:
			return TaskViolationUnmetRequirement_4013;
		case ActionByActorEditPart.VISUAL_ID:
			return ActionByActor_4014;
		case ActionEnactmentEditPart.VISUAL_ID:
			return ActionEnactment_4015;
		case ActionCauseEditPart.VISUAL_ID:
			return ActionCause_4016;
		case EnactmentResourceEditPart.VISUAL_ID:
			return EnactmentResource_4017;
		case CoordinationActionCoordActionEditPart.VISUAL_ID:
			return CoordinationActionCoordAction_4018;
		case CoordinationActionPlanEditPart.VISUAL_ID:
			return CoordinationActionPlan_4004;
		case EventAsserterEditPart.VISUAL_ID:
			return EventAsserter_4019;
		case ActorAgentEditPart.VISUAL_ID:
			return ActorAgent_4020;
		case PlanHasAtomicProcessGroundingListEditPart.VISUAL_ID:
			return PlanHasAtomicProcessGroundingList_4021;
		case ActionGroundingListRestEditPart.VISUAL_ID:
			return ActionGroundingListRest_4022;
		case ActionGroundingOwlsProcessEditPart.VISUAL_ID:
			return ActionGroundingOwlsProcess_4023;
		}
		return null;
	}

}
