package net.sf.ictalive.coordination.actions.diagram.part;

import net.sf.ictalive.coordination.actions.ActionsCollection;
import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.*;
import net.sf.ictalive.owls.expr.ExprPackage;
import net.sf.ictalive.owls.process.ProcessPackage;
import net.sf.ictalive.rules.swrl.SwrlPackage;

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
	private static final String DEBUG_KEY = "net.sf.ictalive.coordination.actions.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ActionsCollectionEditPart.MODEL_ID.equals(view.getType())) {
				return ActionsCollectionEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return net.sf.ictalive.coordination.actions.diagram.part.CoordinationVisualIDRegistry
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
				ActionDiagramEditorPlugin.getInstance().logError(
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
		if (ActionsPackage.eINSTANCE.getActionsCollection().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((ActionsCollection) domainElement)) {
			return ActionsCollectionEditPart.VISUAL_ID;
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
		String containerModelID = net.sf.ictalive.coordination.actions.diagram.part.CoordinationVisualIDRegistry
				.getModelID(containerView);
		if (!ActionsCollectionEditPart.MODEL_ID.equals(containerModelID)
				&& !"actions".equals(containerModelID) && !"mas".equals(containerModelID) && !"tasks".equals(containerModelID) && !"plans".equals(containerModelID) && !"wfvv".equals(containerModelID)) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
			return -1;
		}
		int containerVisualID;
		if (ActionsCollectionEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.sf.ictalive.coordination.actions.diagram.part.CoordinationVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ActionsCollectionEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ConditionEditPart.VISUAL_ID:
			if (SwrlPackage.eINSTANCE.getAtomList().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomListEditPart.VISUAL_ID;
			}
			break;
		case Condition2EditPart.VISUAL_ID:
			if (SwrlPackage.eINSTANCE.getAtomList().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomListEditPart.VISUAL_ID;
			}
			break;
		case ExpressionEditPart.VISUAL_ID:
			if (SwrlPackage.eINSTANCE.getAtomList().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomListEditPart.VISUAL_ID;
			}
			break;
		case Expression2EditPart.VISUAL_ID:
			if (SwrlPackage.eINSTANCE.getAtomList().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomListEditPart.VISUAL_ID;
			}
			break;
		case CompositeActionCompositeActionCompartmentEditPart.VISUAL_ID:
			if (ExprPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionEditPart.VISUAL_ID;
			}
			break;
		case AtomListAtomListFigureCompartmentEditPart.VISUAL_ID:
			if (SwrlPackage.eINSTANCE.getClassAtom().isSuperTypeOf(
					domainElement.eClass())) {
				return ClassAtomEditPart.VISUAL_ID;
			}
			if (SwrlPackage.eINSTANCE.getIndividualPropertyAtom()
					.isSuperTypeOf(domainElement.eClass())) {
				return IndividualPropertyAtomEditPart.VISUAL_ID;
			}
			if (SwrlPackage.eINSTANCE.getSameIndividualAtom().isSuperTypeOf(
					domainElement.eClass())) {
				return SameIndividualAtomEditPart.VISUAL_ID;
			}
			if (SwrlPackage.eINSTANCE.getDifferentIndividualsAtom()
					.isSuperTypeOf(domainElement.eClass())) {
				return DifferentIndividualsAtomEditPart.VISUAL_ID;
			}
			if (SwrlPackage.eINSTANCE.getBuiltInAtom().isSuperTypeOf(
					domainElement.eClass())) {
				return BuiltInAtomEditPart.VISUAL_ID;
			}
			if (SwrlPackage.eINSTANCE.getDataRangeAtom().isSuperTypeOf(
					domainElement.eClass())) {
				return DataRangeAtomEditPart.VISUAL_ID;
			}
			if (SwrlPackage.eINSTANCE.getDatavaluedPropertyAtom()
					.isSuperTypeOf(domainElement.eClass())) {
				return DatavaluedPropertyAtomEditPart.VISUAL_ID;
			}
			break;
		case ClassAtomClassAtomArgValueCompartmentEditPart.VISUAL_ID:
			if (SwrlPackage.eINSTANCE.getIndividualID().isSuperTypeOf(
					domainElement.eClass())) {
				return IndividualIDEditPart.VISUAL_ID;
			}
			if (SwrlPackage.eINSTANCE.getIndividualVariable().isSuperTypeOf(
					domainElement.eClass())) {
				return IndividualVariableEditPart.VISUAL_ID;
			}
			break;
		case IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentEditPart.VISUAL_ID:
			if (SwrlPackage.eINSTANCE.getIndividualID().isSuperTypeOf(
					domainElement.eClass())) {
				return IndividualID2EditPart.VISUAL_ID;
			}
			if (SwrlPackage.eINSTANCE.getIndividualVariable().isSuperTypeOf(
					domainElement.eClass())) {
				return IndividualVariable2EditPart.VISUAL_ID;
			}
			break;
		case IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentEditPart.VISUAL_ID:
			if (SwrlPackage.eINSTANCE.getIndividualID().isSuperTypeOf(
					domainElement.eClass())) {
				return IndividualID3EditPart.VISUAL_ID;
			}
			if (SwrlPackage.eINSTANCE.getIndividualVariable().isSuperTypeOf(
					domainElement.eClass())) {
				return IndividualVariable3EditPart.VISUAL_ID;
			}
			break;
		case SameIndividualAtomSameAsAtomArgsCompartmentEditPart.VISUAL_ID:
			if (SwrlPackage.eINSTANCE.getIndividualID().isSuperTypeOf(
					domainElement.eClass())) {
				return IndividualID4EditPart.VISUAL_ID;
			}
			if (SwrlPackage.eINSTANCE.getIndividualVariable().isSuperTypeOf(
					domainElement.eClass())) {
				return IndividualVariable4EditPart.VISUAL_ID;
			}
			break;
		case DifferentIndividualsAtomDifferentFromAtomArgsCompartmentEditPart.VISUAL_ID:
			if (SwrlPackage.eINSTANCE.getIndividualID().isSuperTypeOf(
					domainElement.eClass())) {
				return IndividualID5EditPart.VISUAL_ID;
			}
			if (SwrlPackage.eINSTANCE.getIndividualVariable().isSuperTypeOf(
					domainElement.eClass())) {
				return IndividualVariable5EditPart.VISUAL_ID;
			}
			break;
		case DataRangeAtomDataRangeArgCompartmentEditPart.VISUAL_ID:
			if (SwrlPackage.eINSTANCE.getDataLiteral().isSuperTypeOf(
					domainElement.eClass())) {
				return DataLiteralEditPart.VISUAL_ID;
			}
			if (SwrlPackage.eINSTANCE.getDataVariable().isSuperTypeOf(
					domainElement.eClass())) {
				return DataVariableEditPart.VISUAL_ID;
			}
			break;
		case DataRangeAtomDataRangeAtomOneOfCompartmentEditPart.VISUAL_ID:
			if (SwrlPackage.eINSTANCE.getDataValue().isSuperTypeOf(
					domainElement.eClass())) {
				return DataValue2EditPart.VISUAL_ID;
			}
			break;
		case DataLiteralDataLiteralCompartmentEditPart.VISUAL_ID:
			if (SwrlPackage.eINSTANCE.getDataValue().isSuperTypeOf(
					domainElement.eClass())) {
				return DataValueEditPart.VISUAL_ID;
			}
			break;
		case DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart.VISUAL_ID:
			if (SwrlPackage.eINSTANCE.getIndividualVariable().isSuperTypeOf(
					domainElement.eClass())) {
				return IndividualVariable6EditPart.VISUAL_ID;
			}
			if (SwrlPackage.eINSTANCE.getIndividualID().isSuperTypeOf(
					domainElement.eClass())) {
				return IndividualID6EditPart.VISUAL_ID;
			}
			break;
		case DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart.VISUAL_ID:
			if (SwrlPackage.eINSTANCE.getDataLiteral().isSuperTypeOf(
					domainElement.eClass())) {
				return DataLiteral2EditPart.VISUAL_ID;
			}
			if (SwrlPackage.eINSTANCE.getDataVariable().isSuperTypeOf(
					domainElement.eClass())) {
				return DataVariable2EditPart.VISUAL_ID;
			}
			break;
		case DataLiteralDataLiteralCompartment2EditPart.VISUAL_ID:
			if (SwrlPackage.eINSTANCE.getDataValue().isSuperTypeOf(
					domainElement.eClass())) {
				return DataValueEditPart.VISUAL_ID;
			}
			break;
		case AtomicActionAtomicActionCompartmentEditPart.VISUAL_ID:
			if (ExprPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition2EditPart.VISUAL_ID;
			}
			if (ActionsPackage.eINSTANCE.getAtomicActionResult().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicActionResultEditPart.VISUAL_ID;
			}
			break;
		case AtomicActionResultQualityDistributionCompartmentEditPart.VISUAL_ID:
			if (ActionsPackage.eINSTANCE.getDistribution().isSuperTypeOf(
					domainElement.eClass())) {
				return Distribution3EditPart.VISUAL_ID;
			}
			break;
		case AtomicActionResultCostDistributionCompartmentEditPart.VISUAL_ID:
			if (ActionsPackage.eINSTANCE.getDistribution().isSuperTypeOf(
					domainElement.eClass())) {
				return DistributionEditPart.VISUAL_ID;
			}
			break;
		case AtomicActionResultDurationDistributionCompartmentEditPart.VISUAL_ID:
			if (ActionsPackage.eINSTANCE.getDistribution().isSuperTypeOf(
					domainElement.eClass())) {
				return Distribution2EditPart.VISUAL_ID;
			}
			break;
		case AtomicActionResultAtomicActionResultAddEffectCompartmentEditPart.VISUAL_ID:
			if (ExprPackage.eINSTANCE.getExpression().isSuperTypeOf(
					domainElement.eClass())) {
				return ExpressionEditPart.VISUAL_ID;
			}
			break;
		case AtomicActionResultAtomicActionResultDeleteEffectCompartmentEditPart.VISUAL_ID:
			if (ExprPackage.eINSTANCE.getExpression().isSuperTypeOf(
					domainElement.eClass())) {
				return Expression2EditPart.VISUAL_ID;
			}
			break;
		case RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID:
			if (ExprPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition3EditPart.VISUAL_ID;
			}
			break;
		case RepeatWhileRepeatWhileCompartmentEditPart.VISUAL_ID:
			if (ExprPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition4EditPart.VISUAL_ID;
			}
			break;
		case IfThenElseIfThenElseCompartmentEditPart.VISUAL_ID:
			if (ExprPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return Condition5EditPart.VISUAL_ID;
			}
			break;
		case ActionsCollectionEditPart.VISUAL_ID:
			if (ActionsPackage.eINSTANCE.getCompositeAction().isSuperTypeOf(
					domainElement.eClass())) {
				return CompositeActionEditPart.VISUAL_ID;
			}
			if (ActionsPackage.eINSTANCE.getAtomicAction().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicActionEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getInput().isSuperTypeOf(
					domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getOutput().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getParticipant().isSuperTypeOf(
					domainElement.eClass())) {
				return ParticipantEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return SequenceEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return AnyOrderEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getControlConstructBag()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructBagEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getPerform().isSuperTypeOf(
					domainElement.eClass())) {
				return PerformEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return ChoiceEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getControlConstructList()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlConstructListEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getRepeatUntil().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatUntilEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getRepeatWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatWhileEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getIfThenElse().isSuperTypeOf(
					domainElement.eClass())) {
				return IfThenElseEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getInputBinding().isSuperTypeOf(
					domainElement.eClass())) {
				return InputBindingEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitEditPart.VISUAL_ID;
			}
			if (ProcessPackage.eINSTANCE.getSplitJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return SplitJoinEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = net.sf.ictalive.coordination.actions.diagram.part.CoordinationVisualIDRegistry
				.getModelID(containerView);
		if (!ActionsCollectionEditPart.MODEL_ID.equals(containerModelID)
				&& !"actions".equals(containerModelID) && !"mas".equals(containerModelID) && !"tasks".equals(containerModelID) && !"plans".equals(containerModelID) && !"wfvv".equals(containerModelID)) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
			return false;
		}
		int containerVisualID;
		if (ActionsCollectionEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.sf.ictalive.coordination.actions.diagram.part.CoordinationVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ActionsCollectionEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CompositeActionEditPart.VISUAL_ID:
			if (CompositeActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeActionCompositeActionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomicActionEditPart.VISUAL_ID:
			if (AtomicActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicActionAtomicActionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
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
		case ParticipantEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilEditPart.VISUAL_ID:
			if (RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhileEditPart.VISUAL_ID:
			if (RepeatWhileRepeatWhileCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseEditPart.VISUAL_ID:
			if (IfThenElseIfThenElseCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionEditPart.VISUAL_ID:
			if (ConditionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomListEditPart.VISUAL_ID:
			if (AtomListAtomListFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassAtomEditPart.VISUAL_ID:
			if (WrappingLabel21EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassAtomClassAtomArgValueCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualIDEditPart.VISUAL_ID:
			if (WrappingLabel22EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualVariableEditPart.VISUAL_ID:
			if (IndividualVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualPropertyAtomEditPart.VISUAL_ID:
			if (WrappingLabel23EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualID2EditPart.VISUAL_ID:
			if (WrappingLabel24EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualVariable2EditPart.VISUAL_ID:
			if (IndividualVariableName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualID3EditPart.VISUAL_ID:
			if (WrappingLabel25EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualVariable3EditPart.VISUAL_ID:
			if (IndividualVariableName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SameIndividualAtomEditPart.VISUAL_ID:
			if (WrappingLabel26EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SameIndividualAtomSameAsAtomArgsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualID4EditPart.VISUAL_ID:
			if (WrappingLabel27EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualVariable4EditPart.VISUAL_ID:
			if (IndividualVariableName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DifferentIndividualsAtomEditPart.VISUAL_ID:
			if (WrappingLabel28EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DifferentIndividualsAtomDifferentFromAtomArgsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualID5EditPart.VISUAL_ID:
			if (WrappingLabel29EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualVariable5EditPart.VISUAL_ID:
			if (IndividualVariableName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BuiltInAtomEditPart.VISUAL_ID:
			if (BuiltInAtomBuiltInEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataRangeAtomEditPart.VISUAL_ID:
			if (DataRangeAtomDataRangeArgCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataRangeAtomDataRangeAtomOneOfCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataLiteralEditPart.VISUAL_ID:
			if (DataLiteralDataLiteralCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataValueEditPart.VISUAL_ID:
			if (DataValueLiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataValueTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataVariableEditPart.VISUAL_ID:
			if (DataVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataValue2EditPart.VISUAL_ID:
			if (DataValueLiteral2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataValueType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DatavaluedPropertyAtomEditPart.VISUAL_ID:
			if (WrappingLabel30EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualVariable6EditPart.VISUAL_ID:
			if (IndividualVariableName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualID6EditPart.VISUAL_ID:
			if (WrappingLabel31EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataLiteral2EditPart.VISUAL_ID:
			if (DataLiteralDataLiteralCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataVariable2EditPart.VISUAL_ID:
			if (DataVariableName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Condition2EditPart.VISUAL_ID:
			if (ConditionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomicActionResultEditPart.VISUAL_ID:
			if (AtomicActionResultHasDensityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicActionResultQualityDistributionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicActionResultCostDistributionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicActionResultDurationDistributionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicActionResultAtomicActionResultAddEffectCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicActionResultAtomicActionResultDeleteEffectCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExpressionEditPart.VISUAL_ID:
			if (ExpressionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Expression2EditPart.VISUAL_ID:
			if (ExpressionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Condition3EditPart.VISUAL_ID:
			if (ConditionName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Condition4EditPart.VISUAL_ID:
			if (ConditionName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Condition5EditPart.VISUAL_ID:
			if (ConditionName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeActionCompositeActionCompartmentEditPart.VISUAL_ID:
			if (ConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomListAtomListFigureCompartmentEditPart.VISUAL_ID:
			if (ClassAtomEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualPropertyAtomEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SameIndividualAtomEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DifferentIndividualsAtomEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BuiltInAtomEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataRangeAtomEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatavaluedPropertyAtomEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassAtomClassAtomArgValueCompartmentEditPart.VISUAL_ID:
			if (IndividualIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentEditPart.VISUAL_ID:
			if (IndividualID2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualVariable2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentEditPart.VISUAL_ID:
			if (IndividualID3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualVariable3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SameIndividualAtomSameAsAtomArgsCompartmentEditPart.VISUAL_ID:
			if (IndividualID4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualVariable4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DifferentIndividualsAtomDifferentFromAtomArgsCompartmentEditPart.VISUAL_ID:
			if (IndividualID5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualVariable5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataRangeAtomDataRangeArgCompartmentEditPart.VISUAL_ID:
			if (DataLiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataRangeAtomDataRangeAtomOneOfCompartmentEditPart.VISUAL_ID:
			if (DataValue2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataLiteralDataLiteralCompartmentEditPart.VISUAL_ID:
			if (DataValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart.VISUAL_ID:
			if (IndividualVariable6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualID6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart.VISUAL_ID:
			if (DataLiteral2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataVariable2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataLiteralDataLiteralCompartment2EditPart.VISUAL_ID:
			if (DataValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomicActionAtomicActionCompartmentEditPart.VISUAL_ID:
			if (Condition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicActionResultEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomicActionResultQualityDistributionCompartmentEditPart.VISUAL_ID:
			if (Distribution3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomicActionResultCostDistributionCompartmentEditPart.VISUAL_ID:
			if (DistributionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomicActionResultDurationDistributionCompartmentEditPart.VISUAL_ID:
			if (Distribution2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomicActionResultAtomicActionResultAddEffectCompartmentEditPart.VISUAL_ID:
			if (ExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomicActionResultAtomicActionResultDeleteEffectCompartmentEditPart.VISUAL_ID:
			if (Expression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID:
			if (Condition3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhileRepeatWhileCompartmentEditPart.VISUAL_ID:
			if (Condition4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseIfThenElseCompartmentEditPart.VISUAL_ID:
			if (Condition5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionsCollectionEditPart.VISUAL_ID:
			if (CompositeActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParticipantEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnyOrderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlConstructBagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PerformEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ChoiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlConstructListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatUntilEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatWhileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfThenElseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputBindingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SplitJoinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProcessHasInputEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProcessHasOutputEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProcessPerformedByEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeProcessComposedOfEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PerformProcessEditPart.VISUAL_ID:
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ChoiceComponentsEditPart.VISUAL_ID:
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnyOrderComponentsEditPart.VISUAL_ID:
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequenceComponentsEditPart.VISUAL_ID:
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitComponentsEditPart.VISUAL_ID:
			if (WrappingLabel32EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SplitJoinComponentsEditPart.VISUAL_ID:
			if (WrappingLabel33EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructBagRestEditPart.VISUAL_ID:
			if (WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructListRestEditPart.VISUAL_ID:
			if (WrappingLabel11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseThenEditPart.VISUAL_ID:
			if (WrappingLabel12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfThenElseElseEditPart.VISUAL_ID:
			if (WrappingLabel13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatUntilUntilProcessEditPart.VISUAL_ID:
			if (WrappingLabel14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatWhileWhileProcessEditPart.VISUAL_ID:
			if (WrappingLabel15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructBagFirstEditPart.VISUAL_ID:
			if (WrappingLabel16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlConstructListFirstEditPart.VISUAL_ID:
			if (WrappingLabel17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PerformHasDataFromEditPart.VISUAL_ID:
			if (WrappingLabel18EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BindingValueFromEditPart.VISUAL_ID:
			if (WrappingLabel19EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BindingToParamEditPart.VISUAL_ID:
			if (WrappingLabel20EditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(ActionsCollection element) {
		return true;
	}

}
