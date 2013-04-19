package net.sf.ictalive.operetta.OM.diagram.is.part;

import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.Scene;
import net.sf.ictalive.operetta.OM.Transition;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.ISEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.LandmarkEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.LandmarkNameEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.LandmarkPatternEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.LandmarkPatternLandmarkPatternCompartmentEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.PartialOrderEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.Scene2EditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.Scene3EditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.SceneEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.SceneSceneCompartmentEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.SceneSceneIDEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.SceneToTransitionArcEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.Transition2EditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.Transition3EditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.TransitionEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.TransitionToSceneArcEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.TransitionToSceneArcTypeEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.WrappingLabel2EditPart;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.WrappingLabelEditPart;
import net.sf.ictalive.operetta.OM.diagram.is.expressions.OperAAbstractExpression;
import net.sf.ictalive.operetta.OM.diagram.is.expressions.OperAOCLFactory;

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
public class OperAVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "net.sf.ictalive.operetta.diagram.is/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static OperAAbstractExpression Scene_2101_Constraint;

	/**
	 * @generated
	 */
	private static OperAAbstractExpression Scene_2102_Constraint;

	/**
	 * @generated
	 */
	private static OperAAbstractExpression Scene_2103_Constraint;

	/**
	 * @generated
	 */
	private static OperAAbstractExpression Transition_2104_Constraint;

	/**
	 * @generated
	 */
	private static OperAAbstractExpression Transition_2105_Constraint;

	/**
	 * @generated
	 */
	private static OperAAbstractExpression Transition_2106_Constraint;

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ISEditPart.MODEL_ID.equals(view.getType())) {
				return ISEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return net.sf.ictalive.operetta.OM.diagram.is.part.OperAVisualIDRegistry
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
				OperAISDiagramEditorPlugin.getInstance().logError(
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
		if (OMPackage.eINSTANCE.getIS().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((net.sf.ictalive.operetta.OM.IS) domainElement)) {
			return ISEditPart.VISUAL_ID;
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
		String containerModelID = net.sf.ictalive.operetta.OM.diagram.is.part.OperAVisualIDRegistry
				.getModelID(containerView);
		if (!ISEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ISEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.sf.ictalive.operetta.OM.diagram.is.part.OperAVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ISEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SceneSceneCompartmentEditPart.VISUAL_ID:
			if (OMPackage.eINSTANCE.getLandmarkPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return LandmarkPatternEditPart.VISUAL_ID;
			}
			break;
		case LandmarkPatternLandmarkPatternCompartmentEditPart.VISUAL_ID:
			if (OMPackage.eINSTANCE.getLandmark().isSuperTypeOf(
					domainElement.eClass())) {
				return LandmarkEditPart.VISUAL_ID;
			}
			break;
		case ISEditPart.VISUAL_ID:
			if (OMPackage.eINSTANCE.getScene().isSuperTypeOf(
					domainElement.eClass())
					&& isScene_2101((Scene) domainElement)) {
				return SceneEditPart.VISUAL_ID;
			}
			if (OMPackage.eINSTANCE.getScene().isSuperTypeOf(
					domainElement.eClass())
					&& isScene_2102((Scene) domainElement)) {
				return Scene2EditPart.VISUAL_ID;
			}
			if (OMPackage.eINSTANCE.getScene().isSuperTypeOf(
					domainElement.eClass())
					&& isScene_2103((Scene) domainElement)) {
				return Scene3EditPart.VISUAL_ID;
			}
			if (OMPackage.eINSTANCE.getTransition().isSuperTypeOf(
					domainElement.eClass())
					&& isTransition_2104((Transition) domainElement)) {
				return TransitionEditPart.VISUAL_ID;
			}
			if (OMPackage.eINSTANCE.getTransition().isSuperTypeOf(
					domainElement.eClass())
					&& isTransition_2105((Transition) domainElement)) {
				return Transition2EditPart.VISUAL_ID;
			}
			if (OMPackage.eINSTANCE.getTransition().isSuperTypeOf(
					domainElement.eClass())
					&& isTransition_2106((Transition) domainElement)) {
				return Transition3EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = net.sf.ictalive.operetta.OM.diagram.is.part.OperAVisualIDRegistry
				.getModelID(containerView);
		if (!ISEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ISEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.sf.ictalive.operetta.OM.diagram.is.part.OperAVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ISEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SceneEditPart.VISUAL_ID:
			if (SceneSceneIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SceneSceneCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Scene2EditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Scene3EditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LandmarkPatternEditPart.VISUAL_ID:
			if (LandmarkPatternLandmarkPatternCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LandmarkEditPart.VISUAL_ID:
			if (LandmarkNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SceneSceneCompartmentEditPart.VISUAL_ID:
			if (LandmarkPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LandmarkPatternLandmarkPatternCompartmentEditPart.VISUAL_ID:
			if (LandmarkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ISEditPart.VISUAL_ID:
			if (SceneEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scene2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Scene3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Transition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Transition3EditPart.VISUAL_ID == nodeVisualID) {
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
		if (OMPackage.eINSTANCE.getTransitionToSceneArc().isSuperTypeOf(
				domainElement.eClass())) {
			return TransitionToSceneArcEditPart.VISUAL_ID;
		}
		if (OMPackage.eINSTANCE.getSceneToTransitionArc().isSuperTypeOf(
				domainElement.eClass())) {
			return SceneToTransitionArcEditPart.VISUAL_ID;
		}
		if (OMPackage.eINSTANCE.getPartialOrder().isSuperTypeOf(
				domainElement.eClass())) {
			return PartialOrderEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(net.sf.ictalive.operetta.OM.IS element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isScene_2101(Scene domainElement) {
		if (Scene_2101_Constraint == null) { // lazy initialization
			Scene_2101_Constraint = OperAOCLFactory
					.getExpression(
							"self.type = SceneType::Normal", OMPackage.eINSTANCE.getScene()); //$NON-NLS-1$
		}
		Object result = Scene_2101_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isScene_2102(Scene domainElement) {
		if (Scene_2102_Constraint == null) { // lazy initialization
			Scene_2102_Constraint = OperAOCLFactory
					.getExpression(
							"self.type = SceneType::Start", OMPackage.eINSTANCE.getScene()); //$NON-NLS-1$
		}
		Object result = Scene_2102_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isScene_2103(Scene domainElement) {
		if (Scene_2103_Constraint == null) { // lazy initialization
			Scene_2103_Constraint = OperAOCLFactory
					.getExpression(
							"self.type = SceneType::End", OMPackage.eINSTANCE.getScene()); //$NON-NLS-1$
		}
		Object result = Scene_2103_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isTransition_2104(Transition domainElement) {
		if (Transition_2104_Constraint == null) { // lazy initialization
			Transition_2104_Constraint = OperAOCLFactory
					.getExpression(
							"self.transitionType = TransitionType::AND", OMPackage.eINSTANCE.getTransition()); //$NON-NLS-1$
		}
		Object result = Transition_2104_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isTransition_2105(Transition domainElement) {
		if (Transition_2105_Constraint == null) { // lazy initialization
			Transition_2105_Constraint = OperAOCLFactory
					.getExpression(
							"self.transitionType = TransitionType::OR", OMPackage.eINSTANCE.getTransition()); //$NON-NLS-1$
		}
		Object result = Transition_2105_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isTransition_2106(Transition domainElement) {
		if (Transition_2106_Constraint == null) { // lazy initialization
			Transition_2106_Constraint = OperAOCLFactory
					.getExpression(
							"self.transitionType = TransitionType::XOR", OMPackage.eINSTANCE.getTransition()); //$NON-NLS-1$
		}
		Object result = Transition_2106_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

}
