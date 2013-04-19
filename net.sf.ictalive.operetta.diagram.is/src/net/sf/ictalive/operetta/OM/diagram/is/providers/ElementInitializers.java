package net.sf.ictalive.operetta.OM.diagram.is.providers;

import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.Scene;
import net.sf.ictalive.operetta.OM.SceneType;
import net.sf.ictalive.operetta.OM.Transition;
import net.sf.ictalive.operetta.OM.TransitionType;
import net.sf.ictalive.operetta.OM.diagram.is.expressions.OperAAbstractExpression;
import net.sf.ictalive.operetta.OM.diagram.is.expressions.OperAOCLFactory;
import net.sf.ictalive.operetta.OM.diagram.is.part.OperAISDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {
	/**
	 * @generated
	 */
	public static void init_Scene_2102(Scene instance) {
		try {
			Object value_0 = OperAOCLFactory.getExpression("SceneType::Start",
					OMPackage.eINSTANCE.getScene()).evaluate(instance);

			value_0 = OperAAbstractExpression.performCast(value_0,
					OMPackage.eINSTANCE.getSceneType());
			instance.setType((SceneType) value_0);
		} catch (RuntimeException e) {
			OperAISDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Transition_2104(Transition instance) {
		try {
			Object value_0 = OperAOCLFactory.getExpression(
					"TransitionType::AND", OMPackage.eINSTANCE.getTransition())
					.evaluate(instance);

			value_0 = OperAAbstractExpression.performCast(value_0,
					OMPackage.eINSTANCE.getTransitionType());
			instance.setTransitionType((TransitionType) value_0);
		} catch (RuntimeException e) {
			OperAISDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Transition_2105(Transition instance) {
		try {
			Object value_0 = OperAOCLFactory.getExpression(
					"TransitionType::OR", OMPackage.eINSTANCE.getTransition())
					.evaluate(instance);

			value_0 = OperAAbstractExpression.performCast(value_0,
					OMPackage.eINSTANCE.getTransitionType());
			instance.setTransitionType((TransitionType) value_0);
		} catch (RuntimeException e) {
			OperAISDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Transition_2106(Transition instance) {
		try {
			Object value_0 = OperAOCLFactory.getExpression(
					"TransitionType::XOR", OMPackage.eINSTANCE.getTransition())
					.evaluate(instance);

			value_0 = OperAAbstractExpression.performCast(value_0,
					OMPackage.eINSTANCE.getTransitionType());
			instance.setTransitionType((TransitionType) value_0);
		} catch (RuntimeException e) {
			OperAISDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

}
