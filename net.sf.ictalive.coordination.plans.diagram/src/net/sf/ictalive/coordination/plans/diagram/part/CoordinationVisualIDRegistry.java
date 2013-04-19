package net.sf.ictalive.coordination.plans.diagram.part;

import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.ActionGroundingActionGroundingRectangleEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.ActionGroundingEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.ActionGroundingListActionGroundingListCompartmentEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.ActionGroundingListEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.ActionGroundingListRestEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.ActionGroundingOwlsProcessEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.AtomicActionNameEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.CompositeActionEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.CompositeActionNameEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.InputEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.InputMessageMapEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.InputMessageMapMessagePartEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.InputMessageMapParameterEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.InputNameEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.OutputEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.OutputNameEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.PlanEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.PlanForTaskEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.PlanHasAtomicProcessGroundingListEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.PlansCollectionEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.TaskEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.TaskNameEditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.WrappingLabel2EditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.WrappingLabel3EditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.WrappingLabel4EditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.WrappingLabel5EditPart;
import net.sf.ictalive.coordination.plans.diagram.edit.parts.WrappingLabelEditPart;
import net.sf.ictalive.coordination.tasks.PlansCollection;
import net.sf.ictalive.coordination.tasks.TasksPackage;
import net.sf.ictalive.owls.process.ProcessPackage;

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
public class CoordinationVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "net.sf.ictalive.coordination.plans.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (PlansCollectionEditPart.MODEL_ID.equals(view.getType())) {
				return PlansCollectionEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return net.sf.ictalive.coordination.plans.diagram.part.CoordinationVisualIDRegistry
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
				PlanDiagramEditorPlugin.getInstance().logError(
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
		if (TasksPackage.eINSTANCE.getPlansCollection().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((PlansCollection) domainElement)) {
			return PlansCollectionEditPart.VISUAL_ID;
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
		String containerModelID = net.sf.ictalive.coordination.plans.diagram.part.CoordinationVisualIDRegistry
				.getModelID(containerView);
		if (!PlansCollectionEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (PlansCollectionEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.sf.ictalive.coordination.plans.diagram.part.CoordinationVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PlansCollectionEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ActionGroundingListActionGroundingListCompartmentEditPart.VISUAL_ID:
			if (TasksPackage.eINSTANCE.getActionGrounding().isSuperTypeOf(
					domainElement.eClass())) {
				return ActionGroundingEditPart.VISUAL_ID;
			}
			break;
		case ActionGroundingActionGroundingRectangleEditPart.VISUAL_ID:
			if (TasksPackage.eINSTANCE.getInputMessageMap().isSuperTypeOf(
					domainElement.eClass())) {
				return InputMessageMapEditPart.VISUAL_ID;
			}
			break;
		case PlansCollectionEditPart.VISUAL_ID:
			if (TasksPackage.eINSTANCE.getPlan().isSuperTypeOf(
					domainElement.eClass())) {
				return PlanEditPart.VISUAL_ID;
			}
			if (TasksPackage.eINSTANCE.getTask().isSuperTypeOf(
					domainElement.eClass())) {
				return TaskEditPart.VISUAL_ID;
			}
			if (TasksPackage.eINSTANCE.getActionGroundingList().isSuperTypeOf(
					domainElement.eClass())) {
				return ActionGroundingListEditPart.VISUAL_ID;
			}
			if (ActionsPackage.eINSTANCE.getAtomicAction().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicActionEditPart.VISUAL_ID;
			}
			if (ActionsPackage.eINSTANCE.getCompositeAction().isSuperTypeOf(
					domainElement.eClass())) {
				return CompositeActionEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getInput().isSuperTypeOf(
					domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getOutput().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = net.sf.ictalive.coordination.plans.diagram.part.CoordinationVisualIDRegistry
				.getModelID(containerView);
		if (!PlansCollectionEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (PlansCollectionEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.sf.ictalive.coordination.plans.diagram.part.CoordinationVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PlansCollectionEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case TaskEditPart.VISUAL_ID:
			if (TaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionGroundingListEditPart.VISUAL_ID:
			if (ActionGroundingListActionGroundingListCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomicActionEditPart.VISUAL_ID:
			if (AtomicActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeActionEditPart.VISUAL_ID:
			if (CompositeActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputEditPart.VISUAL_ID:
			if (InputNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputEditPart.VISUAL_ID:
			if (OutputNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionGroundingEditPart.VISUAL_ID:
			if (ActionGroundingActionGroundingRectangleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputMessageMapEditPart.VISUAL_ID:
			if (InputMessageMapMessagePartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionGroundingListActionGroundingListCompartmentEditPart.VISUAL_ID:
			if (ActionGroundingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionGroundingActionGroundingRectangleEditPart.VISUAL_ID:
			if (InputMessageMapEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlansCollectionEditPart.VISUAL_ID:
			if (PlanEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActionGroundingListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionGroundingListRestEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputMessageMapParameterEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionGroundingOwlsProcessEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlanForTaskEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlanHasAtomicProcessGroundingListEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(PlansCollection element) {
		return true;
	}

}
