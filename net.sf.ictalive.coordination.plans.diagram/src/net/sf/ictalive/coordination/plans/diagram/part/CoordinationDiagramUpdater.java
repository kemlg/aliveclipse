package net.sf.ictalive.coordination.plans.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.sf.ictalive.coordination.actions.Action;
import net.sf.ictalive.coordination.actions.AtomicAction;
import net.sf.ictalive.coordination.actions.CompositeAction;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.ActionGroundingActionGroundingRectangleEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.ActionGroundingEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.ActionGroundingListActionGroundingListCompartmentEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.ActionGroundingListEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.ActionGroundingListRestEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.ActionGroundingOwlsProcessEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.CompositeActionEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.InputEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.InputMessageMapEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.InputMessageMapParameterEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.OutputEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.PlanEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.PlanForTaskEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.PlanHasAtomicProcessGroundingListEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.PlansCollectionEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.TaskEditPart;
import net.sf.ictalive.coordination.plans.diagram.providers.CoordinationElementTypes;
import net.sf.ictalive.coordination.tasks.ActionGrounding;
import net.sf.ictalive.coordination.tasks.ActionGroundingList;
import net.sf.ictalive.coordination.tasks.InputMessageMap;
import net.sf.ictalive.coordination.tasks.Plan;
import net.sf.ictalive.coordination.tasks.PlansCollection;
import net.sf.ictalive.coordination.tasks.Task;
import net.sf.ictalive.coordination.tasks.TasksPackage;
import net.sf.ictalive.owls.process.Input;
import net.sf.ictalive.owls.process.Output;
import net.sf.ictalive.owls.process.Parameter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CoordinationDiagramUpdater {

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
		switch (CoordinationVisualIDRegistry.getVisualID(view)) {
		case ActionGroundingListActionGroundingListCompartmentEditPart.VISUAL_ID:
			return getActionGroundingListActionGroundingListCompartment_7003SemanticChildren(view);
		case ActionGroundingActionGroundingRectangleEditPart.VISUAL_ID:
			return getActionGroundingActionGroundingRectangle_7004SemanticChildren(view);
		case PlansCollectionEditPart.VISUAL_ID:
			return getPlansCollection_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActionGroundingListActionGroundingListCompartment_7003SemanticChildren(
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
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActionGroundingEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionGroundingActionGroundingRectangle_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ActionGrounding modelElement = (ActionGrounding) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getInput().iterator(); it.hasNext();) {
			InputMessageMap childElement = (InputMessageMap) it.next();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InputMessageMapEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlansCollection_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		PlansCollection modelElement = (PlansCollection) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getPlans().iterator(); it.hasNext();) {
			Plan childElement = (Plan) it.next();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PlanEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
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
			if (CoordinationVisualIDRegistry
					.getNodeVisualID(view, childElement) == TaskEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						TaskEditPart.VISUAL_ID));
				continue;
			}
			if (CoordinationVisualIDRegistry
					.getNodeVisualID(view, childElement) == ActionGroundingListEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						ActionGroundingListEditPart.VISUAL_ID));
				continue;
			}
			if (CoordinationVisualIDRegistry
					.getNodeVisualID(view, childElement) == AtomicActionEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						AtomicActionEditPart.VISUAL_ID));
				continue;
			}
			if (CoordinationVisualIDRegistry
					.getNodeVisualID(view, childElement) == CompositeActionEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						CompositeActionEditPart.VISUAL_ID));
				continue;
			}
			if (CoordinationVisualIDRegistry
					.getNodeVisualID(view, childElement) == InputEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						InputEditPart.VISUAL_ID));
				continue;
			}
			if (CoordinationVisualIDRegistry
					.getNodeVisualID(view, childElement) == OutputEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						OutputEditPart.VISUAL_ID));
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
		switch (CoordinationVisualIDRegistry.getVisualID(view)) {
		case PlansCollectionEditPart.VISUAL_ID:
			return getPlansCollection_1000ContainedLinks(view);
		case PlanEditPart.VISUAL_ID:
			return getPlan_2009ContainedLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2010ContainedLinks(view);
		case ActionGroundingListEditPart.VISUAL_ID:
			return getActionGroundingList_2011ContainedLinks(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2012ContainedLinks(view);
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2013ContainedLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_2014ContainedLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_2015ContainedLinks(view);
		case ActionGroundingEditPart.VISUAL_ID:
			return getActionGrounding_3003ContainedLinks(view);
		case InputMessageMapEditPart.VISUAL_ID:
			return getInputMessageMap_3004ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (CoordinationVisualIDRegistry.getVisualID(view)) {
		case PlanEditPart.VISUAL_ID:
			return getPlan_2009IncomingLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2010IncomingLinks(view);
		case ActionGroundingListEditPart.VISUAL_ID:
			return getActionGroundingList_2011IncomingLinks(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2012IncomingLinks(view);
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2013IncomingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_2014IncomingLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_2015IncomingLinks(view);
		case ActionGroundingEditPart.VISUAL_ID:
			return getActionGrounding_3003IncomingLinks(view);
		case InputMessageMapEditPart.VISUAL_ID:
			return getInputMessageMap_3004IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (CoordinationVisualIDRegistry.getVisualID(view)) {
		case PlanEditPart.VISUAL_ID:
			return getPlan_2009OutgoingLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2010OutgoingLinks(view);
		case ActionGroundingListEditPart.VISUAL_ID:
			return getActionGroundingList_2011OutgoingLinks(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2012OutgoingLinks(view);
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2013OutgoingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_2014OutgoingLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_2015OutgoingLinks(view);
		case ActionGroundingEditPart.VISUAL_ID:
			return getActionGrounding_3003OutgoingLinks(view);
		case InputMessageMapEditPart.VISUAL_ID:
			return getInputMessageMap_3004OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPlansCollection_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPlan_2009ContainedLinks(View view) {
		Plan modelElement = (Plan) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Plan_ForTask_4009(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Plan_HasAtomicProcessGroundingList_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActionGroundingList_2011ContainedLinks(View view) {
		ActionGroundingList modelElement = (ActionGroundingList) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ActionGroundingList_Rest_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAtomicAction_2012ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAction_2013ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInput_2014ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutput_2015ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActionGrounding_3003ContainedLinks(View view) {
		ActionGrounding modelElement = (ActionGrounding) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ActionGrounding_OwlsProcess_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputMessageMap_3004ContainedLinks(View view) {
		InputMessageMap modelElement = (InputMessageMap) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_InputMessageMap_Parameter_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlan_2009IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTask_2010IncomingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Plan_ForTask_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionGroundingList_2011IncomingLinks(View view) {
		ActionGroundingList modelElement = (ActionGroundingList) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ActionGroundingList_Rest_4006(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Plan_HasAtomicProcessGroundingList_4010(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAtomicAction_2012IncomingLinks(View view) {
		AtomicAction modelElement = (AtomicAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ActionGrounding_OwlsProcess_4008(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAction_2013IncomingLinks(View view) {
		CompositeAction modelElement = (CompositeAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ActionGrounding_OwlsProcess_4008(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInput_2014IncomingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_InputMessageMap_Parameter_4007(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutput_2015IncomingLinks(View view) {
		Output modelElement = (Output) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_InputMessageMap_Parameter_4007(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionGrounding_3003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInputMessageMap_3004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPlan_2009OutgoingLinks(View view) {
		Plan modelElement = (Plan) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Plan_ForTask_4009(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Plan_HasAtomicProcessGroundingList_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2010OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActionGroundingList_2011OutgoingLinks(View view) {
		ActionGroundingList modelElement = (ActionGroundingList) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ActionGroundingList_Rest_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAtomicAction_2012OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAction_2013OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInput_2014OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutput_2015OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActionGrounding_3003OutgoingLinks(View view) {
		ActionGrounding modelElement = (ActionGrounding) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ActionGrounding_OwlsProcess_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputMessageMap_3004OutgoingLinks(View view) {
		InputMessageMap modelElement = (InputMessageMap) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_InputMessageMap_Parameter_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ActionGroundingList_Rest_4006(
			ActionGroundingList target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == TasksPackage.eINSTANCE
					.getActionGroundingList_Rest()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target,
						CoordinationElementTypes.ActionGroundingListRest_4006,
						ActionGroundingListRestEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_InputMessageMap_Parameter_4007(
			Parameter target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == TasksPackage.eINSTANCE
					.getInputMessageMap_Parameter()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target,
						CoordinationElementTypes.InputMessageMapParameter_4007,
						InputMessageMapParameterEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ActionGrounding_OwlsProcess_4008(
			Action target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == TasksPackage.eINSTANCE
					.getActionGrounding_OwlsProcess()) {
				result
						.add(new CoordinationLinkDescriptor(
								setting.getEObject(),
								target,
								CoordinationElementTypes.ActionGroundingOwlsProcess_4008,
								ActionGroundingOwlsProcessEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Plan_ForTask_4009(
			Task target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == TasksPackage.eINSTANCE
					.getPlan_ForTask()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target, CoordinationElementTypes.PlanForTask_4009,
						PlanForTaskEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Plan_HasAtomicProcessGroundingList_4010(
			ActionGroundingList target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == TasksPackage.eINSTANCE
					.getPlan_HasAtomicProcessGroundingList()) {
				result
						.add(new CoordinationLinkDescriptor(
								setting.getEObject(),
								target,
								CoordinationElementTypes.PlanHasAtomicProcessGroundingList_4010,
								PlanHasAtomicProcessGroundingListEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ActionGroundingList_Rest_4006(
			ActionGroundingList source) {
		Collection result = new LinkedList();
		ActionGroundingList destination = source.getRest();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.ActionGroundingListRest_4006,
				ActionGroundingListRestEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_InputMessageMap_Parameter_4007(
			InputMessageMap source) {
		Collection result = new LinkedList();
		Parameter destination = source.getParameter();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.InputMessageMapParameter_4007,
				InputMessageMapParameterEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ActionGrounding_OwlsProcess_4008(
			ActionGrounding source) {
		Collection result = new LinkedList();
		Action destination = source.getOwlsProcess();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.ActionGroundingOwlsProcess_4008,
				ActionGroundingOwlsProcessEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Plan_ForTask_4009(
			Plan source) {
		Collection result = new LinkedList();
		Task destination = source.getForTask();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.PlanForTask_4009,
				PlanForTaskEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Plan_HasAtomicProcessGroundingList_4010(
			Plan source) {
		Collection result = new LinkedList();
		ActionGroundingList destination = source
				.getHasAtomicProcessGroundingList();
		if (destination == null) {
			return result;
		}
		result
				.add(new CoordinationLinkDescriptor(
						source,
						destination,
						CoordinationElementTypes.PlanHasAtomicProcessGroundingList_4010,
						PlanHasAtomicProcessGroundingListEditPart.VISUAL_ID));
		return result;
	}

}
