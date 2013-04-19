/*
 * 
 */
package control.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import control.ControlPackage;
import control.OuterProcess;
import control.diagram.edit.parts.*;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ControlVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "net.sf.ictalive.service.owlseditor.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (OuterProcessEditPart.MODEL_ID.equals(view.getType())) {
				return OuterProcessEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return control.diagram.part.ControlVisualIDRegistry.getVisualID(view
				.getType());
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
				ControlDiagramEditorPlugin.getInstance().logError(
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
		if (ControlPackage.eINSTANCE.getOuterProcess().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((OuterProcess) domainElement)) {
			return OuterProcessEditPart.VISUAL_ID;
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
		String containerModelID = control.diagram.part.ControlVisualIDRegistry
				.getModelID(containerView);
		if (!OuterProcessEditPart.MODEL_ID.equals(containerModelID)
				&& !"control".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (OuterProcessEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = control.diagram.part.ControlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = OuterProcessEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case RemoteProcessEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getInput().isSuperTypeOf(
					domainElement.eClass())) {
				return Input2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getOutput().isSuperTypeOf(
					domainElement.eClass())) {
				return Output2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getResult().isSuperTypeOf(
					domainElement.eClass())) {
				return Result2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr4EditPart.VISUAL_ID;
			}
			break;
		case TemplateProcessEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getInput().isSuperTypeOf(
					domainElement.eClass())) {
				return Input2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getOutput().isSuperTypeOf(
					domainElement.eClass())) {
				return Output2EditPart.VISUAL_ID;
			}
			break;
		case SequenceSequenceComponentsCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructList()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructListEditPart.VISUAL_ID;
			}
			break;
		case ControlConstructListControlConstructListFirstCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set7EditPart.VISUAL_ID;
			}
			break;
		case ControlConstructListControlConstructListRestCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructList()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructList2EditPart.VISUAL_ID;
			}
			break;
		case SequenceSequenceComponentsCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructList()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructListEditPart.VISUAL_ID;
			}
			break;
		case ChoiceChoiceComponentsCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBagEditPart.VISUAL_ID;
			}
			break;
		case ControlConstructBagControlConstructBagFirstCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set6EditPart.VISUAL_ID;
			}
			break;
		case ControlConstructBagControlConstructBagRestCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag5EditPart.VISUAL_ID;
			}
			break;
		case SequenceSequenceComponentsCompartment3EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructList()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructListEditPart.VISUAL_ID;
			}
			break;
		case ChoiceChoiceComponentsCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBagEditPart.VISUAL_ID;
			}
			break;
		case AnyOrderAnyOrderComponentsCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag2EditPart.VISUAL_ID;
			}
			break;
		case ControlConstructBagControlConstructBagFirstCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set6EditPart.VISUAL_ID;
			}
			break;
		case ControlConstructBagControlConstructBagRestCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag5EditPart.VISUAL_ID;
			}
			break;
		case SplitSplitComponentsCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag3EditPart.VISUAL_ID;
			}
			break;
		case ControlConstructBagControlConstructBagFirstCompartment3EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set6EditPart.VISUAL_ID;
			}
			break;
		case ControlConstructBagControlConstructBagRestCompartment3EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag5EditPart.VISUAL_ID;
			}
			break;
		case SplitJoinSplitJoinComponentsCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag4EditPart.VISUAL_ID;
			}
			break;
		case ControlConstructBagControlConstructBagFirstCompartment4EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set6EditPart.VISUAL_ID;
			}
			break;
		case ControlConstructBagControlConstructBagRestCompartment4EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag5EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseIfConditionCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr7EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseThenCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set2EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseElseCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set5EditPart.VISUAL_ID;
			}
			break;
		case SequenceSequenceComponentsCompartment4EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructList()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructListEditPart.VISUAL_ID;
			}
			break;
		case ChoiceChoiceComponentsCompartment3EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBagEditPart.VISUAL_ID;
			}
			break;
		case AnyOrderAnyOrderComponentsCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag2EditPart.VISUAL_ID;
			}
			break;
		case SplitSplitComponentsCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag3EditPart.VISUAL_ID;
			}
			break;
		case SplitJoinSplitJoinComponentsCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag4EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseIfConditionCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr7EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseThenCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set2EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseElseCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set5EditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilUntilConditionCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr5EditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilUntilProcessCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set3EditPart.VISUAL_ID;
			}
			break;
		case SequenceSequenceComponentsCompartment5EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructList()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructListEditPart.VISUAL_ID;
			}
			break;
		case ChoiceChoiceComponentsCompartment4EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBagEditPart.VISUAL_ID;
			}
			break;
		case AnyOrderAnyOrderComponentsCompartment3EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag2EditPart.VISUAL_ID;
			}
			break;
		case SplitSplitComponentsCompartment3EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag3EditPart.VISUAL_ID;
			}
			break;
		case SplitJoinSplitJoinComponentsCompartment3EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag4EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseIfConditionCompartment3EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr7EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseThenCompartment3EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set2EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseElseCompartment3EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set5EditPart.VISUAL_ID;
			}
			break;
		case RepeatWhileRepeatWhileWhileConditionCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr6EditPart.VISUAL_ID;
			}
			break;
		case RepeatWhileRepeatWhileWhileProcessCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set4EditPart.VISUAL_ID;
			}
			break;
		case SequenceSequenceComponentsCompartment6EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructList()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructListEditPart.VISUAL_ID;
			}
			break;
		case ChoiceChoiceComponentsCompartment5EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBagEditPart.VISUAL_ID;
			}
			break;
		case AnyOrderAnyOrderComponentsCompartment4EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag2EditPart.VISUAL_ID;
			}
			break;
		case SplitSplitComponentsCompartment4EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag3EditPart.VISUAL_ID;
			}
			break;
		case SplitJoinSplitJoinComponentsCompartment4EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag4EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseIfConditionCompartment4EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr7EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseThenCompartment4EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set2EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseElseCompartment4EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set5EditPart.VISUAL_ID;
			}
			break;
		case PerformPerformTheProcessCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getRemoteProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return RemoteProcessEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getTemplateProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return TemplateProcessEditPart.VISUAL_ID;
			}
			break;
		case ResultResultInConditionCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr2EditPart.VISUAL_ID;
			}
			break;
		case ResultResultHasResultVarCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getResultVar().isSuperTypeOf(
					domainElement.eClass())) {
				return ResultVarEditPart.VISUAL_ID;
			}
			break;
		case ResultResultHasEffectCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr3EditPart.VISUAL_ID;
			}
			break;
		case ResultResultBindingSourceCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getValueSource().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueSourceEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueForm().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueFormEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueFunction().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueFunctionEditPart.VISUAL_ID;
			}
			break;
		case ProduceProduceProducedBindingValueSpecifierCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getValueSource().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueSource2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueForm().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueForm2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueFunction().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueFunction2EditPart.VISUAL_ID;
			}
			break;
		case SetSetProducedBindingValueSpecifierCompartmentEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getValueSource().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueSource3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueForm().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueForm3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueFunction().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueFunction3EditPart.VISUAL_ID;
			}
			break;
		case SequenceSequenceComponentsCompartment7EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructList()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructListEditPart.VISUAL_ID;
			}
			break;
		case ChoiceChoiceComponentsCompartment6EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBagEditPart.VISUAL_ID;
			}
			break;
		case AnyOrderAnyOrderComponentsCompartment5EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag2EditPart.VISUAL_ID;
			}
			break;
		case SplitSplitComponentsCompartment5EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag3EditPart.VISUAL_ID;
			}
			break;
		case SplitJoinSplitJoinComponentsCompartment5EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag4EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseIfConditionCompartment5EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr7EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseThenCompartment5EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set2EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseElseCompartment5EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set5EditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilUntilConditionCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr5EditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilUntilProcessCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set3EditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilUntilConditionCompartment3EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr5EditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilUntilProcessCompartment3EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set3EditPart.VISUAL_ID;
			}
			break;
		case RepeatWhileRepeatWhileWhileConditionCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr6EditPart.VISUAL_ID;
			}
			break;
		case RepeatWhileRepeatWhileWhileProcessCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set4EditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilUntilConditionCompartment4EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr5EditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilUntilProcessCompartment4EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set3EditPart.VISUAL_ID;
			}
			break;
		case PerformPerformTheProcessCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getRemoteProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return RemoteProcessEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getTemplateProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return TemplateProcessEditPart.VISUAL_ID;
			}
			break;
		case ProduceProduceProducedBindingValueSpecifierCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getValueSource().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueSource2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueForm().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueForm2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueFunction().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueFunction2EditPart.VISUAL_ID;
			}
			break;
		case SetSetProducedBindingValueSpecifierCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getValueSource().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueSource3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueForm().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueForm3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueFunction().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueFunction3EditPart.VISUAL_ID;
			}
			break;
		case RepeatWhileRepeatWhileWhileConditionCompartment3EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr6EditPart.VISUAL_ID;
			}
			break;
		case RepeatWhileRepeatWhileWhileProcessCompartment3EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set4EditPart.VISUAL_ID;
			}
			break;
		case PerformPerformTheProcessCompartment3EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getRemoteProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return RemoteProcessEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getTemplateProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return TemplateProcessEditPart.VISUAL_ID;
			}
			break;
		case ProduceProduceProducedBindingValueSpecifierCompartment3EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getValueSource().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueSource2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueForm().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueForm2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueFunction().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueFunction2EditPart.VISUAL_ID;
			}
			break;
		case SetSetProducedBindingValueSpecifierCompartment3EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getValueSource().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueSource3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueForm().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueForm3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueFunction().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueFunction3EditPart.VISUAL_ID;
			}
			break;
		case RepeatWhileRepeatWhileWhileConditionCompartment4EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr6EditPart.VISUAL_ID;
			}
			break;
		case RepeatWhileRepeatWhileWhileProcessCompartment4EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set4EditPart.VISUAL_ID;
			}
			break;
		case PerformPerformTheProcessCompartment4EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getRemoteProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return RemoteProcessEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getTemplateProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return TemplateProcessEditPart.VISUAL_ID;
			}
			break;
		case ProduceProduceProducedBindingValueSpecifierCompartment4EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getValueSource().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueSource2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueForm().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueForm2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueFunction().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueFunction2EditPart.VISUAL_ID;
			}
			break;
		case SetSetProducedBindingValueSpecifierCompartment4EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getValueSource().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueSource3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueForm().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueForm3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueFunction().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueFunction3EditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilUntilConditionCompartment5EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr5EditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilUntilProcessCompartment5EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set3EditPart.VISUAL_ID;
			}
			break;
		case RepeatWhileRepeatWhileWhileConditionCompartment5EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr6EditPart.VISUAL_ID;
			}
			break;
		case RepeatWhileRepeatWhileWhileProcessCompartment5EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set4EditPart.VISUAL_ID;
			}
			break;
		case PerformPerformTheProcessCompartment5EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getRemoteProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return RemoteProcessEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getTemplateProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return TemplateProcessEditPart.VISUAL_ID;
			}
			break;
		case ProduceProduceProducedBindingValueSpecifierCompartment5EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getValueSource().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueSource2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueForm().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueForm2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueFunction().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueFunction2EditPart.VISUAL_ID;
			}
			break;
		case SetSetProducedBindingValueSpecifierCompartment5EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getValueSource().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueSource3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueForm().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueForm3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueFunction().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueFunction3EditPart.VISUAL_ID;
			}
			break;
		case ControlConstructBagControlConstructBagFirstCompartment5EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set6EditPart.VISUAL_ID;
			}
			break;
		case ControlConstructBagControlConstructBagRestCompartment5EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag5EditPart.VISUAL_ID;
			}
			break;
		case AnyOrderAnyOrderComponentsCompartment6EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag2EditPart.VISUAL_ID;
			}
			break;
		case SplitSplitComponentsCompartment6EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag3EditPart.VISUAL_ID;
			}
			break;
		case SplitJoinSplitJoinComponentsCompartment6EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag4EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseIfConditionCompartment6EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr7EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseThenCompartment6EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set2EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseElseCompartment6EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set5EditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilUntilConditionCompartment6EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr5EditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilUntilProcessCompartment6EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set3EditPart.VISUAL_ID;
			}
			break;
		case RepeatWhileRepeatWhileWhileConditionCompartment6EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr6EditPart.VISUAL_ID;
			}
			break;
		case RepeatWhileRepeatWhileWhileProcessCompartment6EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set4EditPart.VISUAL_ID;
			}
			break;
		case PerformPerformTheProcessCompartment6EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getRemoteProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return RemoteProcessEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getTemplateProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return TemplateProcessEditPart.VISUAL_ID;
			}
			break;
		case ProduceProduceProducedBindingValueSpecifierCompartment6EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getValueSource().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueSource2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueForm().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueForm2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueFunction().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueFunction2EditPart.VISUAL_ID;
			}
			break;
		case SetSetProducedBindingValueSpecifierCompartment6EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getValueSource().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueSource3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueForm().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueForm3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueFunction().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueFunction3EditPart.VISUAL_ID;
			}
			break;
		case ControlConstructListControlConstructListFirstCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set7EditPart.VISUAL_ID;
			}
			break;
		case ControlConstructListControlConstructListRestCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructList()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructList2EditPart.VISUAL_ID;
			}
			break;
		case ChoiceChoiceComponentsCompartment7EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBagEditPart.VISUAL_ID;
			}
			break;
		case AnyOrderAnyOrderComponentsCompartment7EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag2EditPart.VISUAL_ID;
			}
			break;
		case SplitSplitComponentsCompartment7EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag3EditPart.VISUAL_ID;
			}
			break;
		case SplitJoinSplitJoinComponentsCompartment7EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBag4EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseIfConditionCompartment7EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr7EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseThenCompartment7EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set2EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseElseCompartment7EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice7EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set5EditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilUntilConditionCompartment7EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr5EditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilUntilProcessCompartment7EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set3EditPart.VISUAL_ID;
			}
			break;
		case RepeatWhileRepeatWhileWhileConditionCompartment7EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr6EditPart.VISUAL_ID;
			}
			break;
		case RepeatWhileRepeatWhileWhileProcessCompartment7EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return Choice6EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrder5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return Split5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoin5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElse5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntil5EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhile4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return Perform4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return Produce4EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return Set4EditPart.VISUAL_ID;
			}
			break;
		case PerformPerformTheProcessCompartment7EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getRemoteProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return RemoteProcessEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getTemplateProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return TemplateProcessEditPart.VISUAL_ID;
			}
			break;
		case ProduceProduceProducedBindingValueSpecifierCompartment7EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getValueSource().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueSource2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueForm().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueForm2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueFunction().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueFunction2EditPart.VISUAL_ID;
			}
			break;
		case SetSetProducedBindingValueSpecifierCompartment7EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getValueSource().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueSource3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueForm().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueForm3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueFunction().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueFunction3EditPart.VISUAL_ID;
			}
			break;
		case ResultResultInConditionCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition2EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr2EditPart.VISUAL_ID;
			}
			break;
		case ResultResultHasResultVarCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getResultVar().isSuperTypeOf(
					domainElement.eClass())) {
				return ResultVarEditPart.VISUAL_ID;
			}
			break;
		case ResultResultHasEffectCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition3EditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return Expr3EditPart.VISUAL_ID;
			}
			break;
		case ResultResultBindingSourceCompartment2EditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getValueSource().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueSourceEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueForm().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueFormEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getValueFunction().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueFunctionEditPart.VISUAL_ID;
			}
			break;
		case OuterProcessEditPart.VISUAL_ID:
			if (ControlPackage.eINSTANCE.getInput().isSuperTypeOf(
					domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getOutput().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getLoc().isSuperTypeOf(
					domainElement.eClass())) {
				return LocEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return SequenceEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return ChoiceEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrderEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoinEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElseEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntilEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhileEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return PerformEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getProduce().isSuperTypeOf(
					domainElement.eClass())) {
				return ProduceEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getSet().isSuperTypeOf(
					domainElement.eClass())) {
				return SetEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getLink().isSuperTypeOf(
					domainElement.eClass())) {
				return LinkEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getResult().isSuperTypeOf(
					domainElement.eClass())) {
				return ResultEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getOntology().isSuperTypeOf(
					domainElement.eClass())) {
				return OntologyEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getTemplateConstraint().isSuperTypeOf(
					domainElement.eClass())) {
				return TemplateConstraintEditPart.VISUAL_ID;
			}
			if (ControlPackage.eINSTANCE.getExpr().isSuperTypeOf(
					domainElement.eClass())) {
				return ExprEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = control.diagram.part.ControlVisualIDRegistry
				.getModelID(containerView);
		if (!OuterProcessEditPart.MODEL_ID.equals(containerModelID)
				&& !"control".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (OuterProcessEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = control.diagram.part.ControlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = OuterProcessEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
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
		case LocEditPart.VISUAL_ID:
			if (LocNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequenceEditPart.VISUAL_ID:
			if (SequenceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceSequenceComponentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ChoiceEditPart.VISUAL_ID:
			if (ChoiceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ChoiceChoiceComponentsCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnyOrderEditPart.VISUAL_ID:
			if (AnyOrderNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrderAnyOrderComponentsCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitEditPart.VISUAL_ID:
			if (SplitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitSplitComponentsCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitJoinEditPart.VISUAL_ID:
			if (SplitJoinNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoinSplitJoinComponentsCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseEditPart.VISUAL_ID:
			if (IfThenElseNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseIfThenElseIfConditionCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseIfThenElseThenCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseIfThenElseElseCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilEditPart.VISUAL_ID:
			if (RepeatUntilNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilUntilConditionCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilUntilProcessCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhileEditPart.VISUAL_ID:
			if (RepeatWhileNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhileRepeatWhileWhileConditionCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhileRepeatWhileWhileProcessCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PerformEditPart.VISUAL_ID:
			if (PerformNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PerformPerformTheProcessCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProduceEditPart.VISUAL_ID:
			if (ProduceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProduceProduceProducedBindingValueSpecifierCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SetEditPart.VISUAL_ID:
			if (SetNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SetSetProducedBindingValueSpecifierCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LinkEditPart.VISUAL_ID:
			if (LinkNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionEditPart.VISUAL_ID:
			if (ConditionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ResultEditPart.VISUAL_ID:
			if (ResultNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResultResultInConditionCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResultResultHasResultVarCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResultResultHasEffectCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResultResultBindingSourceCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OntologyEditPart.VISUAL_ID:
			if (OntologyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TemplateConstraintEditPart.VISUAL_ID:
			if (TemplateConstraintNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExprEditPart.VISUAL_ID:
			if (ExprNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructListEditPart.VISUAL_ID:
			if (ControlConstructListNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlConstructListControlConstructListFirstCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlConstructListControlConstructListRestCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Sequence2EditPart.VISUAL_ID:
			if (SequenceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceSequenceComponentsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Choice2EditPart.VISUAL_ID:
			if (ChoiceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ChoiceChoiceComponentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructBagEditPart.VISUAL_ID:
			if (ControlConstructBagNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlConstructBagControlConstructBagFirstCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlConstructBagControlConstructBagRestCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Sequence3EditPart.VISUAL_ID:
			if (SequenceName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceSequenceComponentsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Choice3EditPart.VISUAL_ID:
			if (ChoiceName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ChoiceChoiceComponentsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnyOrder2EditPart.VISUAL_ID:
			if (AnyOrderName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrderAnyOrderComponentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructBag2EditPart.VISUAL_ID:
			if (ControlConstructBagName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlConstructBagControlConstructBagFirstCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlConstructBagControlConstructBagRestCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Split2EditPart.VISUAL_ID:
			if (SplitName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitSplitComponentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructBag3EditPart.VISUAL_ID:
			if (ControlConstructBagName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlConstructBagControlConstructBagFirstCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlConstructBagControlConstructBagRestCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitJoin2EditPart.VISUAL_ID:
			if (SplitJoinName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoinSplitJoinComponentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructBag4EditPart.VISUAL_ID:
			if (ControlConstructBagName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlConstructBagControlConstructBagFirstCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlConstructBagControlConstructBagRestCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElse2EditPart.VISUAL_ID:
			if (IfThenElseName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseIfThenElseIfConditionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseIfThenElseThenCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseIfThenElseElseCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Sequence4EditPart.VISUAL_ID:
			if (SequenceName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceSequenceComponentsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Choice4EditPart.VISUAL_ID:
			if (ChoiceName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ChoiceChoiceComponentsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnyOrder3EditPart.VISUAL_ID:
			if (AnyOrderName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrderAnyOrderComponentsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Split3EditPart.VISUAL_ID:
			if (SplitName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitSplitComponentsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitJoin3EditPart.VISUAL_ID:
			if (SplitJoinName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoinSplitJoinComponentsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElse3EditPart.VISUAL_ID:
			if (IfThenElseName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseIfThenElseIfConditionCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseIfThenElseThenCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseIfThenElseElseCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntil2EditPart.VISUAL_ID:
			if (RepeatUntilName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilUntilConditionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilUntilProcessCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Sequence5EditPart.VISUAL_ID:
			if (SequenceName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceSequenceComponentsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Choice5EditPart.VISUAL_ID:
			if (ChoiceName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ChoiceChoiceComponentsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnyOrder4EditPart.VISUAL_ID:
			if (AnyOrderName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrderAnyOrderComponentsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Split4EditPart.VISUAL_ID:
			if (SplitName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitSplitComponentsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitJoin4EditPart.VISUAL_ID:
			if (SplitJoinName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoinSplitJoinComponentsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElse4EditPart.VISUAL_ID:
			if (IfThenElseName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseIfThenElseIfConditionCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseIfThenElseThenCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseIfThenElseElseCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhile2EditPart.VISUAL_ID:
			if (RepeatWhileName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhileRepeatWhileWhileConditionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhileRepeatWhileWhileProcessCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Sequence6EditPart.VISUAL_ID:
			if (SequenceName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceSequenceComponentsCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Choice6EditPart.VISUAL_ID:
			if (ChoiceName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ChoiceChoiceComponentsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnyOrder5EditPart.VISUAL_ID:
			if (AnyOrderName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrderAnyOrderComponentsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Split5EditPart.VISUAL_ID:
			if (SplitName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitSplitComponentsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitJoin5EditPart.VISUAL_ID:
			if (SplitJoinName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoinSplitJoinComponentsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElse5EditPart.VISUAL_ID:
			if (IfThenElseName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseIfThenElseIfConditionCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseIfThenElseThenCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseIfThenElseElseCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Perform2EditPart.VISUAL_ID:
			if (PerformName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PerformPerformTheProcessCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RemoteProcessEditPart.VISUAL_ID:
			if (RemoteProcessNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Input2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Output2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Result2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Condition4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Input2EditPart.VISUAL_ID:
			if (InputName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Output2EditPart.VISUAL_ID:
			if (OutputName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Result2EditPart.VISUAL_ID:
			if (ResultName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResultResultInConditionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResultResultHasResultVarCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResultResultHasEffectCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResultResultBindingSourceCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueSourceEditPart.VISUAL_ID:
			if (ValueSourceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueFormEditPart.VISUAL_ID:
			if (ValueFormNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueFunctionEditPart.VISUAL_ID:
			if (ValueFunctionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ResultVarEditPart.VISUAL_ID:
			if (ResultVarNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Condition2EditPart.VISUAL_ID:
			if (ConditionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Condition3EditPart.VISUAL_ID:
			if (ConditionName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Expr2EditPart.VISUAL_ID:
			if (ExprName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Expr3EditPart.VISUAL_ID:
			if (ExprName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Condition4EditPart.VISUAL_ID:
			if (ConditionName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Expr4EditPart.VISUAL_ID:
			if (ExprName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TemplateProcessEditPart.VISUAL_ID:
			if (TemplateProcessNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Input2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Output2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Produce2EditPart.VISUAL_ID:
			if (ProduceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProduceProduceProducedBindingValueSpecifierCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueSource2EditPart.VISUAL_ID:
			if (ValueSourceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueForm2EditPart.VISUAL_ID:
			if (ValueFormName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueFunction2EditPart.VISUAL_ID:
			if (ValueFunctionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Set2EditPart.VISUAL_ID:
			if (SetName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SetSetProducedBindingValueSpecifierCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueSource3EditPart.VISUAL_ID:
			if (ValueSourceName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueForm3EditPart.VISUAL_ID:
			if (ValueFormName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueFunction3EditPart.VISUAL_ID:
			if (ValueFunctionName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Sequence7EditPart.VISUAL_ID:
			if (SequenceName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceSequenceComponentsCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Choice7EditPart.VISUAL_ID:
			if (ChoiceName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ChoiceChoiceComponentsCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnyOrder6EditPart.VISUAL_ID:
			if (AnyOrderName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrderAnyOrderComponentsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Split6EditPart.VISUAL_ID:
			if (SplitName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitSplitComponentsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitJoin6EditPart.VISUAL_ID:
			if (SplitJoinName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoinSplitJoinComponentsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElse6EditPart.VISUAL_ID:
			if (IfThenElseName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseIfThenElseIfConditionCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseIfThenElseThenCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseIfThenElseElseCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntil3EditPart.VISUAL_ID:
			if (RepeatUntilName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilUntilConditionCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilUntilProcessCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntil4EditPart.VISUAL_ID:
			if (RepeatUntilName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilUntilConditionCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilUntilProcessCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhile3EditPart.VISUAL_ID:
			if (RepeatWhileName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhileRepeatWhileWhileConditionCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhileRepeatWhileWhileProcessCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntil5EditPart.VISUAL_ID:
			if (RepeatUntilName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilUntilConditionCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilUntilProcessCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Perform3EditPart.VISUAL_ID:
			if (PerformName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PerformPerformTheProcessCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Produce3EditPart.VISUAL_ID:
			if (ProduceName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProduceProduceProducedBindingValueSpecifierCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Set3EditPart.VISUAL_ID:
			if (SetName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SetSetProducedBindingValueSpecifierCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Condition5EditPart.VISUAL_ID:
			if (ConditionName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Expr5EditPart.VISUAL_ID:
			if (ExprName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhile4EditPart.VISUAL_ID:
			if (RepeatWhileName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhileRepeatWhileWhileConditionCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhileRepeatWhileWhileProcessCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Perform4EditPart.VISUAL_ID:
			if (PerformName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PerformPerformTheProcessCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Produce4EditPart.VISUAL_ID:
			if (ProduceName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProduceProduceProducedBindingValueSpecifierCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Set4EditPart.VISUAL_ID:
			if (SetName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SetSetProducedBindingValueSpecifierCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Condition6EditPart.VISUAL_ID:
			if (ConditionName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Expr6EditPart.VISUAL_ID:
			if (ExprName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhile5EditPart.VISUAL_ID:
			if (RepeatWhileName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhileRepeatWhileWhileConditionCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhileRepeatWhileWhileProcessCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Perform5EditPart.VISUAL_ID:
			if (PerformName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PerformPerformTheProcessCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Produce5EditPart.VISUAL_ID:
			if (ProduceName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProduceProduceProducedBindingValueSpecifierCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Set5EditPart.VISUAL_ID:
			if (SetName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SetSetProducedBindingValueSpecifierCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Condition7EditPart.VISUAL_ID:
			if (ConditionName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Expr7EditPart.VISUAL_ID:
			if (ExprName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntil6EditPart.VISUAL_ID:
			if (RepeatUntilName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilUntilConditionCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilUntilProcessCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhile6EditPart.VISUAL_ID:
			if (RepeatWhileName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhileRepeatWhileWhileConditionCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhileRepeatWhileWhileProcessCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Perform6EditPart.VISUAL_ID:
			if (PerformName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PerformPerformTheProcessCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Produce6EditPart.VISUAL_ID:
			if (ProduceName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProduceProduceProducedBindingValueSpecifierCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Set6EditPart.VISUAL_ID:
			if (SetName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SetSetProducedBindingValueSpecifierCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructBag5EditPart.VISUAL_ID:
			if (ControlConstructBagName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlConstructBagControlConstructBagFirstCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlConstructBagControlConstructBagRestCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnyOrder7EditPart.VISUAL_ID:
			if (AnyOrderName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrderAnyOrderComponentsCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Split7EditPart.VISUAL_ID:
			if (SplitName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitSplitComponentsCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitJoin7EditPart.VISUAL_ID:
			if (SplitJoinName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoinSplitJoinComponentsCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElse7EditPart.VISUAL_ID:
			if (IfThenElseName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseIfThenElseIfConditionCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseIfThenElseThenCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseIfThenElseElseCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntil7EditPart.VISUAL_ID:
			if (RepeatUntilName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilUntilConditionCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilRepeatUntilUntilProcessCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhile7EditPart.VISUAL_ID:
			if (RepeatWhileName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhileRepeatWhileWhileConditionCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhileRepeatWhileWhileProcessCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Perform7EditPart.VISUAL_ID:
			if (PerformName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PerformPerformTheProcessCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Produce7EditPart.VISUAL_ID:
			if (ProduceName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProduceProduceProducedBindingValueSpecifierCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Set7EditPart.VISUAL_ID:
			if (SetName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SetSetProducedBindingValueSpecifierCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructList2EditPart.VISUAL_ID:
			if (ControlConstructListName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlConstructListControlConstructListFirstCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlConstructListControlConstructListRestCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequenceSequenceComponentsCompartmentEditPart.VISUAL_ID:
			if (ControlConstructListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructListControlConstructListFirstCompartmentEditPart.VISUAL_ID:
			if (Sequence2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructListControlConstructListRestCompartmentEditPart.VISUAL_ID:
			if (ControlConstructList2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequenceSequenceComponentsCompartment2EditPart.VISUAL_ID:
			if (ControlConstructListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ChoiceChoiceComponentsCompartmentEditPart.VISUAL_ID:
			if (ControlConstructBagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructBagControlConstructBagFirstCompartmentEditPart.VISUAL_ID:
			if (Sequence3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructBagControlConstructBagRestCompartmentEditPart.VISUAL_ID:
			if (ControlConstructBag5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequenceSequenceComponentsCompartment3EditPart.VISUAL_ID:
			if (ControlConstructListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ChoiceChoiceComponentsCompartment2EditPart.VISUAL_ID:
			if (ControlConstructBagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnyOrderAnyOrderComponentsCompartmentEditPart.VISUAL_ID:
			if (ControlConstructBag2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructBagControlConstructBagFirstCompartment2EditPart.VISUAL_ID:
			if (Sequence3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructBagControlConstructBagRestCompartment2EditPart.VISUAL_ID:
			if (ControlConstructBag5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitSplitComponentsCompartmentEditPart.VISUAL_ID:
			if (ControlConstructBag3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructBagControlConstructBagFirstCompartment3EditPart.VISUAL_ID:
			if (Sequence3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructBagControlConstructBagRestCompartment3EditPart.VISUAL_ID:
			if (ControlConstructBag5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitJoinSplitJoinComponentsCompartmentEditPart.VISUAL_ID:
			if (ControlConstructBag4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructBagControlConstructBagFirstCompartment4EditPart.VISUAL_ID:
			if (Sequence3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructBagControlConstructBagRestCompartment4EditPart.VISUAL_ID:
			if (ControlConstructBag5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseIfConditionCompartmentEditPart.VISUAL_ID:
			if (Condition7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseThenCompartmentEditPart.VISUAL_ID:
			if (Sequence4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseElseCompartmentEditPart.VISUAL_ID:
			if (Sequence7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequenceSequenceComponentsCompartment4EditPart.VISUAL_ID:
			if (ControlConstructListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ChoiceChoiceComponentsCompartment3EditPart.VISUAL_ID:
			if (ControlConstructBagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnyOrderAnyOrderComponentsCompartment2EditPart.VISUAL_ID:
			if (ControlConstructBag2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitSplitComponentsCompartment2EditPart.VISUAL_ID:
			if (ControlConstructBag3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitJoinSplitJoinComponentsCompartment2EditPart.VISUAL_ID:
			if (ControlConstructBag4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseIfConditionCompartment2EditPart.VISUAL_ID:
			if (Condition7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseThenCompartment2EditPart.VISUAL_ID:
			if (Sequence4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseElseCompartment2EditPart.VISUAL_ID:
			if (Sequence7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilUntilConditionCompartmentEditPart.VISUAL_ID:
			if (Condition5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilUntilProcessCompartmentEditPart.VISUAL_ID:
			if (Sequence5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequenceSequenceComponentsCompartment5EditPart.VISUAL_ID:
			if (ControlConstructListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ChoiceChoiceComponentsCompartment4EditPart.VISUAL_ID:
			if (ControlConstructBagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnyOrderAnyOrderComponentsCompartment3EditPart.VISUAL_ID:
			if (ControlConstructBag2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitSplitComponentsCompartment3EditPart.VISUAL_ID:
			if (ControlConstructBag3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitJoinSplitJoinComponentsCompartment3EditPart.VISUAL_ID:
			if (ControlConstructBag4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseIfConditionCompartment3EditPart.VISUAL_ID:
			if (Condition7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseThenCompartment3EditPart.VISUAL_ID:
			if (Sequence4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseElseCompartment3EditPart.VISUAL_ID:
			if (Sequence7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhileRepeatWhileWhileConditionCompartmentEditPart.VISUAL_ID:
			if (Condition6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhileRepeatWhileWhileProcessCompartmentEditPart.VISUAL_ID:
			if (Sequence6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequenceSequenceComponentsCompartment6EditPart.VISUAL_ID:
			if (ControlConstructListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ChoiceChoiceComponentsCompartment5EditPart.VISUAL_ID:
			if (ControlConstructBagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnyOrderAnyOrderComponentsCompartment4EditPart.VISUAL_ID:
			if (ControlConstructBag2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitSplitComponentsCompartment4EditPart.VISUAL_ID:
			if (ControlConstructBag3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitJoinSplitJoinComponentsCompartment4EditPart.VISUAL_ID:
			if (ControlConstructBag4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseIfConditionCompartment4EditPart.VISUAL_ID:
			if (Condition7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseThenCompartment4EditPart.VISUAL_ID:
			if (Sequence4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseElseCompartment4EditPart.VISUAL_ID:
			if (Sequence7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PerformPerformTheProcessCompartmentEditPart.VISUAL_ID:
			if (RemoteProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemplateProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ResultResultInConditionCompartmentEditPart.VISUAL_ID:
			if (Condition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ResultResultHasResultVarCompartmentEditPart.VISUAL_ID:
			if (ResultVarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ResultResultHasEffectCompartmentEditPart.VISUAL_ID:
			if (Condition3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ResultResultBindingSourceCompartmentEditPart.VISUAL_ID:
			if (ValueSourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueFormEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueFunctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProduceProduceProducedBindingValueSpecifierCompartmentEditPart.VISUAL_ID:
			if (ValueSource2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueForm2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueFunction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SetSetProducedBindingValueSpecifierCompartmentEditPart.VISUAL_ID:
			if (ValueSource3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueForm3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueFunction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequenceSequenceComponentsCompartment7EditPart.VISUAL_ID:
			if (ControlConstructListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ChoiceChoiceComponentsCompartment6EditPart.VISUAL_ID:
			if (ControlConstructBagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnyOrderAnyOrderComponentsCompartment5EditPart.VISUAL_ID:
			if (ControlConstructBag2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitSplitComponentsCompartment5EditPart.VISUAL_ID:
			if (ControlConstructBag3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitJoinSplitJoinComponentsCompartment5EditPart.VISUAL_ID:
			if (ControlConstructBag4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseIfConditionCompartment5EditPart.VISUAL_ID:
			if (Condition7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseThenCompartment5EditPart.VISUAL_ID:
			if (Sequence4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseElseCompartment5EditPart.VISUAL_ID:
			if (Sequence7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilUntilConditionCompartment2EditPart.VISUAL_ID:
			if (Condition5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilUntilProcessCompartment2EditPart.VISUAL_ID:
			if (Sequence5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilUntilConditionCompartment3EditPart.VISUAL_ID:
			if (Condition5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilUntilProcessCompartment3EditPart.VISUAL_ID:
			if (Sequence5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhileRepeatWhileWhileConditionCompartment2EditPart.VISUAL_ID:
			if (Condition6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhileRepeatWhileWhileProcessCompartment2EditPart.VISUAL_ID:
			if (Sequence6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilUntilConditionCompartment4EditPart.VISUAL_ID:
			if (Condition5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilUntilProcessCompartment4EditPart.VISUAL_ID:
			if (Sequence5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PerformPerformTheProcessCompartment2EditPart.VISUAL_ID:
			if (RemoteProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemplateProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProduceProduceProducedBindingValueSpecifierCompartment2EditPart.VISUAL_ID:
			if (ValueSource2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueForm2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueFunction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SetSetProducedBindingValueSpecifierCompartment2EditPart.VISUAL_ID:
			if (ValueSource3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueForm3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueFunction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhileRepeatWhileWhileConditionCompartment3EditPart.VISUAL_ID:
			if (Condition6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhileRepeatWhileWhileProcessCompartment3EditPart.VISUAL_ID:
			if (Sequence6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PerformPerformTheProcessCompartment3EditPart.VISUAL_ID:
			if (RemoteProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemplateProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProduceProduceProducedBindingValueSpecifierCompartment3EditPart.VISUAL_ID:
			if (ValueSource2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueForm2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueFunction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SetSetProducedBindingValueSpecifierCompartment3EditPart.VISUAL_ID:
			if (ValueSource3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueForm3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueFunction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhileRepeatWhileWhileConditionCompartment4EditPart.VISUAL_ID:
			if (Condition6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhileRepeatWhileWhileProcessCompartment4EditPart.VISUAL_ID:
			if (Sequence6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PerformPerformTheProcessCompartment4EditPart.VISUAL_ID:
			if (RemoteProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemplateProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProduceProduceProducedBindingValueSpecifierCompartment4EditPart.VISUAL_ID:
			if (ValueSource2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueForm2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueFunction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SetSetProducedBindingValueSpecifierCompartment4EditPart.VISUAL_ID:
			if (ValueSource3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueForm3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueFunction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilUntilConditionCompartment5EditPart.VISUAL_ID:
			if (Condition5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilUntilProcessCompartment5EditPart.VISUAL_ID:
			if (Sequence5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhileRepeatWhileWhileConditionCompartment5EditPart.VISUAL_ID:
			if (Condition6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhileRepeatWhileWhileProcessCompartment5EditPart.VISUAL_ID:
			if (Sequence6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PerformPerformTheProcessCompartment5EditPart.VISUAL_ID:
			if (RemoteProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemplateProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProduceProduceProducedBindingValueSpecifierCompartment5EditPart.VISUAL_ID:
			if (ValueSource2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueForm2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueFunction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SetSetProducedBindingValueSpecifierCompartment5EditPart.VISUAL_ID:
			if (ValueSource3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueForm3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueFunction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructBagControlConstructBagFirstCompartment5EditPart.VISUAL_ID:
			if (Sequence3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructBagControlConstructBagRestCompartment5EditPart.VISUAL_ID:
			if (ControlConstructBag5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnyOrderAnyOrderComponentsCompartment6EditPart.VISUAL_ID:
			if (ControlConstructBag2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitSplitComponentsCompartment6EditPart.VISUAL_ID:
			if (ControlConstructBag3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitJoinSplitJoinComponentsCompartment6EditPart.VISUAL_ID:
			if (ControlConstructBag4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseIfConditionCompartment6EditPart.VISUAL_ID:
			if (Condition7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseThenCompartment6EditPart.VISUAL_ID:
			if (Sequence4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseElseCompartment6EditPart.VISUAL_ID:
			if (Sequence7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilUntilConditionCompartment6EditPart.VISUAL_ID:
			if (Condition5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilUntilProcessCompartment6EditPart.VISUAL_ID:
			if (Sequence5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhileRepeatWhileWhileConditionCompartment6EditPart.VISUAL_ID:
			if (Condition6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhileRepeatWhileWhileProcessCompartment6EditPart.VISUAL_ID:
			if (Sequence6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PerformPerformTheProcessCompartment6EditPart.VISUAL_ID:
			if (RemoteProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemplateProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProduceProduceProducedBindingValueSpecifierCompartment6EditPart.VISUAL_ID:
			if (ValueSource2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueForm2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueFunction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SetSetProducedBindingValueSpecifierCompartment6EditPart.VISUAL_ID:
			if (ValueSource3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueForm3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueFunction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructListControlConstructListFirstCompartment2EditPart.VISUAL_ID:
			if (Sequence2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructListControlConstructListRestCompartment2EditPart.VISUAL_ID:
			if (ControlConstructList2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ChoiceChoiceComponentsCompartment7EditPart.VISUAL_ID:
			if (ControlConstructBagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnyOrderAnyOrderComponentsCompartment7EditPart.VISUAL_ID:
			if (ControlConstructBag2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitSplitComponentsCompartment7EditPart.VISUAL_ID:
			if (ControlConstructBag3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitJoinSplitJoinComponentsCompartment7EditPart.VISUAL_ID:
			if (ControlConstructBag4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseIfConditionCompartment7EditPart.VISUAL_ID:
			if (Condition7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseThenCompartment7EditPart.VISUAL_ID:
			if (Sequence4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseElseCompartment7EditPart.VISUAL_ID:
			if (Sequence7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilUntilConditionCompartment7EditPart.VISUAL_ID:
			if (Condition5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilUntilProcessCompartment7EditPart.VISUAL_ID:
			if (Sequence5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhileRepeatWhileWhileConditionCompartment7EditPart.VISUAL_ID:
			if (Condition6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhileRepeatWhileWhileProcessCompartment7EditPart.VISUAL_ID:
			if (Sequence6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Choice6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrder5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Split5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoin5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElse5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntil5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhile4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Perform4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Produce4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Set4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PerformPerformTheProcessCompartment7EditPart.VISUAL_ID:
			if (RemoteProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemplateProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProduceProduceProducedBindingValueSpecifierCompartment7EditPart.VISUAL_ID:
			if (ValueSource2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueForm2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueFunction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SetSetProducedBindingValueSpecifierCompartment7EditPart.VISUAL_ID:
			if (ValueSource3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueForm3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueFunction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ResultResultInConditionCompartment2EditPart.VISUAL_ID:
			if (Condition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ResultResultHasResultVarCompartment2EditPart.VISUAL_ID:
			if (ResultVarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ResultResultHasEffectCompartment2EditPart.VISUAL_ID:
			if (Condition3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Expr3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ResultResultBindingSourceCompartment2EditPart.VISUAL_ID:
			if (ValueSourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueFormEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueFunctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OuterProcessEditPart.VISUAL_ID:
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LocEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ChoiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PerformEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProduceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LinkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResultEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OntologyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemplateConstraintEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExprEditPart.VISUAL_ID == nodeVisualID) {
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
		if (ControlPackage.eINSTANCE.getLocBinding().isSuperTypeOf(
				domainElement.eClass())) {
			return LocBindingEditPart.VISUAL_ID;
		}
		if (ControlPackage.eINSTANCE.getInputBinding().isSuperTypeOf(
				domainElement.eClass())) {
			return InputBindingEditPart.VISUAL_ID;
		}
		if (ControlPackage.eINSTANCE.getOutputBinding().isSuperTypeOf(
				domainElement.eClass())) {
			return OutputBindingEditPart.VISUAL_ID;
		}
		if (ControlPackage.eINSTANCE.getLinkBinding().isSuperTypeOf(
				domainElement.eClass())) {
			return LinkBindingEditPart.VISUAL_ID;
		}
		if (ControlPackage.eINSTANCE.getoutputBindingSource().isSuperTypeOf(
				domainElement.eClass())) {
			return OutputBindingSourceEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(OuterProcess element) {
		return true;
	}

}
