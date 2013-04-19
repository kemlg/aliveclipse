package net.sf.ictalive.coordination.actions.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.sf.ictalive.coordination.actions.Action;
import net.sf.ictalive.coordination.actions.ActionsCollection;
import net.sf.ictalive.coordination.actions.AtomicAction;
import net.sf.ictalive.coordination.actions.AtomicActionResult;
import net.sf.ictalive.coordination.actions.CompositeAction;
import net.sf.ictalive.coordination.actions.Distribution;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ActionsCollectionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AnyOrderComponentsEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AnyOrderEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomListAtomListFigureCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomListEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionAtomicActionCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionResultAtomicActionResultAddEffectCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionResultAtomicActionResultDeleteEffectCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionResultCostDistributionCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionResultDurationDistributionCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionResultEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.AtomicActionResultQualityDistributionCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.BindingToParamEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.BindingValueFromEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.BuiltInAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ChoiceComponentsEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ChoiceEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ClassAtomClassAtomArgValueCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ClassAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.CompositeActionCompositeActionCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.CompositeActionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.CompositeProcessComposedOfEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Condition2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Condition3EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Condition4EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Condition5EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ConditionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructBagEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructBagFirstEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructBagRestEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructListEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructListFirstEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructListRestEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataLiteral2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataLiteralDataLiteralCompartment2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataLiteralDataLiteralCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataLiteralEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataRangeAtomDataRangeArgCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataRangeAtomDataRangeAtomOneOfCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataRangeAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataValue2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataValueEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataVariable2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DataVariableEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DatavaluedPropertyAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DifferentIndividualsAtomDifferentFromAtomArgsCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DifferentIndividualsAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Distribution2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Distribution3EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.DistributionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.Expression2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ExpressionEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IfThenElseEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IfThenElseElseEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IfThenElseIfThenElseCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IfThenElseThenEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualID2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualID3EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualID4EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualID5EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualID6EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualIDEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualPropertyAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariable2EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariable3EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariable4EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariable5EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariable6EditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.IndividualVariableEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.InputBindingEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.InputEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.OutputEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ParticipantEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.PerformEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.PerformHasDataFromEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.PerformProcessEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ProcessHasInputEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ProcessHasOutputEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.ProcessPerformedByEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.RepeatUntilEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.RepeatUntilRepeatUntilCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.RepeatUntilUntilProcessEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.RepeatWhileEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.RepeatWhileRepeatWhileCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.RepeatWhileWhileProcessEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SameIndividualAtomEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SameIndividualAtomSameAsAtomArgsCompartmentEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SequenceComponentsEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SequenceEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SplitComponentsEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SplitEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SplitJoinComponentsEditPart;
import net.sf.ictalive.coordination.actions.diagram.edit.parts.SplitJoinEditPart;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;
import net.sf.ictalive.owls.expr.Condition;
import net.sf.ictalive.owls.expr.Expression;
import net.sf.ictalive.owls.process.AnyOrder;
import net.sf.ictalive.owls.process.Binding;
import net.sf.ictalive.owls.process.Choice;
import net.sf.ictalive.owls.process.CompositeProcess;
import net.sf.ictalive.owls.process.ControlConstruct;
import net.sf.ictalive.owls.process.ControlConstructBag;
import net.sf.ictalive.owls.process.ControlConstructList;
import net.sf.ictalive.owls.process.IfThenElse;
import net.sf.ictalive.owls.process.Input;
import net.sf.ictalive.owls.process.InputBinding;
import net.sf.ictalive.owls.process.Output;
import net.sf.ictalive.owls.process.Parameter;
import net.sf.ictalive.owls.process.Participant;
import net.sf.ictalive.owls.process.Perform;
import net.sf.ictalive.owls.process.Process;
import net.sf.ictalive.owls.process.ProcessPackage;
import net.sf.ictalive.owls.process.RepeatUntil;
import net.sf.ictalive.owls.process.RepeatWhile;
import net.sf.ictalive.owls.process.Sequence;
import net.sf.ictalive.owls.process.Split;
import net.sf.ictalive.owls.process.SplitJoin;
import net.sf.ictalive.rules.ruleml.Body;
import net.sf.ictalive.rules.swrl.Atom;
import net.sf.ictalive.rules.swrl.AtomList;
import net.sf.ictalive.rules.swrl.ClassAtom;
import net.sf.ictalive.rules.swrl.DObject;
import net.sf.ictalive.rules.swrl.DataLiteral;
import net.sf.ictalive.rules.swrl.DataRangeAtom;
import net.sf.ictalive.rules.swrl.DataValue;
import net.sf.ictalive.rules.swrl.DatavaluedPropertyAtom;
import net.sf.ictalive.rules.swrl.DifferentIndividualsAtom;
import net.sf.ictalive.rules.swrl.IObject;
import net.sf.ictalive.rules.swrl.IndividualPropertyAtom;
import net.sf.ictalive.rules.swrl.SameIndividualAtom;

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
		case ConditionEditPart.VISUAL_ID:
			return getCondition_3054SemanticChildren(view);
		case Condition2EditPart.VISUAL_ID:
			return getCondition_3080SemanticChildren(view);
		case ExpressionEditPart.VISUAL_ID:
			return getExpression_3082SemanticChildren(view);
		case Expression2EditPart.VISUAL_ID:
			return getExpression_3083SemanticChildren(view);
		case CompositeActionCompositeActionCompartmentEditPart.VISUAL_ID:
			return getCompositeActionCompositeActionCompartment_7033SemanticChildren(view);
		case AtomListAtomListFigureCompartmentEditPart.VISUAL_ID:
			return getAtomListAtomListFigureCompartment_7034SemanticChildren(view);
		case ClassAtomClassAtomArgValueCompartmentEditPart.VISUAL_ID:
			return getClassAtomClassAtomArgValueCompartment_7035SemanticChildren(view);
		case IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentEditPart.VISUAL_ID:
			return getIndividualPropertyAtomIndividualPropertyAtomArg1Compartment_7036SemanticChildren(view);
		case IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentEditPart.VISUAL_ID:
			return getIndividualPropertyAtomIndividualPropertyAtomArg2Compartment_7037SemanticChildren(view);
		case SameIndividualAtomSameAsAtomArgsCompartmentEditPart.VISUAL_ID:
			return getSameIndividualAtomSameAsAtomArgsCompartment_7038SemanticChildren(view);
		case DifferentIndividualsAtomDifferentFromAtomArgsCompartmentEditPart.VISUAL_ID:
			return getDifferentIndividualsAtomDifferentFromAtomArgsCompartment_7039SemanticChildren(view);
		case DataRangeAtomDataRangeArgCompartmentEditPart.VISUAL_ID:
			return getDataRangeAtomDataRangeArgCompartment_7040SemanticChildren(view);
		case DataRangeAtomDataRangeAtomOneOfCompartmentEditPart.VISUAL_ID:
			return getDataRangeAtomDataRangeAtomOneOfCompartment_7054SemanticChildren(view);
		case DataLiteralDataLiteralCompartmentEditPart.VISUAL_ID:
			return getDataLiteralDataLiteralCompartment_7041SemanticChildren(view);
		case DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart.VISUAL_ID:
			return getDatavaluedPropertyAtomDataValuedPropertyAtomArg1Compartment_7042SemanticChildren(view);
		case DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart.VISUAL_ID:
			return getDatavaluedPropertyAtomDataValuedPropertyAtomArg2Compartment_7043SemanticChildren(view);
		case DataLiteralDataLiteralCompartment2EditPart.VISUAL_ID:
			return getDataLiteralDataLiteralCompartment_7044SemanticChildren(view);
		case AtomicActionAtomicActionCompartmentEditPart.VISUAL_ID:
			return getAtomicActionAtomicActionCompartment_7045SemanticChildren(view);
		case AtomicActionResultQualityDistributionCompartmentEditPart.VISUAL_ID:
			return getAtomicActionResultQualityDistributionCompartment_7046SemanticChildren(view);
		case AtomicActionResultCostDistributionCompartmentEditPart.VISUAL_ID:
			return getAtomicActionResultCostDistributionCompartment_7047SemanticChildren(view);
		case AtomicActionResultDurationDistributionCompartmentEditPart.VISUAL_ID:
			return getAtomicActionResultDurationDistributionCompartment_7048SemanticChildren(view);
		case AtomicActionResultAtomicActionResultAddEffectCompartmentEditPart.VISUAL_ID:
			return getAtomicActionResultAtomicActionResultAddEffectCompartment_7049SemanticChildren(view);
		case AtomicActionResultAtomicActionResultDeleteEffectCompartmentEditPart.VISUAL_ID:
			return getAtomicActionResultAtomicActionResultDeleteEffectCompartment_7050SemanticChildren(view);
		case RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilCompartment_7051SemanticChildren(view);
		case RepeatWhileRepeatWhileCompartmentEditPart.VISUAL_ID:
			return getRepeatWhileRepeatWhileCompartment_7052SemanticChildren(view);
		case IfThenElseIfThenElseCompartmentEditPart.VISUAL_ID:
			return getIfThenElseIfThenElseCompartment_7053SemanticChildren(view);
		case ActionsCollectionEditPart.VISUAL_ID:
			return getActionsCollection_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3054SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Condition modelElement = (Condition) view.getElement();
		List result = new LinkedList();
		{
			Body childElement = modelElement.getExpressionBody();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AtomListEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3080SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Condition modelElement = (Condition) view.getElement();
		List result = new LinkedList();
		{
			Body childElement = modelElement.getExpressionBody();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AtomListEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExpression_3082SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Expression modelElement = (Expression) view.getElement();
		List result = new LinkedList();
		{
			Body childElement = modelElement.getExpressionBody();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AtomListEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExpression_3083SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Expression modelElement = (Expression) view.getElement();
		List result = new LinkedList();
		{
			Body childElement = modelElement.getExpressionBody();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AtomListEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeActionCompositeActionCompartment_7033SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CompositeAction modelElement = (CompositeAction) containerView
				.getElement();
		List result = new LinkedList();
		{
			Condition childElement = modelElement.getHasPrecondition();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConditionEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAtomListAtomListFigureCompartment_7034SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AtomList modelElement = (AtomList) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAtom().iterator(); it.hasNext();) {
			Atom childElement = (Atom) it.next();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ClassAtomEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == IndividualPropertyAtomEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == SameIndividualAtomEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == DifferentIndividualsAtomEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == BuiltInAtomEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == DataRangeAtomEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == DatavaluedPropertyAtomEditPart.VISUAL_ID) {
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
	public static List getClassAtomClassAtomArgValueCompartment_7035SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ClassAtom modelElement = (ClassAtom) containerView.getElement();
		List result = new LinkedList();
		{
			IObject childElement = modelElement.getArgument1();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IndividualIDEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
			if (visualID == IndividualVariableEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIndividualPropertyAtomIndividualPropertyAtomArg1Compartment_7036SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		IndividualPropertyAtom modelElement = (IndividualPropertyAtom) containerView
				.getElement();
		List result = new LinkedList();
		{
			IObject childElement = modelElement.getArgument1();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IndividualID2EditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
			if (visualID == IndividualVariable2EditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIndividualPropertyAtomIndividualPropertyAtomArg2Compartment_7037SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		IndividualPropertyAtom modelElement = (IndividualPropertyAtom) containerView
				.getElement();
		List result = new LinkedList();
		{
			IObject childElement = modelElement.getArgument2();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IndividualID3EditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
			if (visualID == IndividualVariable3EditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSameIndividualAtomSameAsAtomArgsCompartment_7038SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SameIndividualAtom modelElement = (SameIndividualAtom) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getArgs().iterator(); it.hasNext();) {
			IObject childElement = (IObject) it.next();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IndividualID4EditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == IndividualVariable4EditPart.VISUAL_ID) {
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
	public static List getDifferentIndividualsAtomDifferentFromAtomArgsCompartment_7039SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DifferentIndividualsAtom modelElement = (DifferentIndividualsAtom) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getArgs().iterator(); it.hasNext();) {
			IObject childElement = (IObject) it.next();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IndividualID5EditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == IndividualVariable5EditPart.VISUAL_ID) {
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
	public static List getDataRangeAtomDataRangeArgCompartment_7040SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DataRangeAtom modelElement = (DataRangeAtom) containerView.getElement();
		List result = new LinkedList();
		{
			DObject childElement = modelElement.getArgument1();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DataLiteralEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
			if (visualID == DataVariableEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDataRangeAtomDataRangeAtomOneOfCompartment_7054SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DataRangeAtom modelElement = (DataRangeAtom) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOneOf().iterator(); it.hasNext();) {
			DataValue childElement = (DataValue) it.next();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DataValue2EditPart.VISUAL_ID) {
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
	public static List getDataLiteralDataLiteralCompartment_7041SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DataLiteral modelElement = (DataLiteral) containerView.getElement();
		List result = new LinkedList();
		{
			DataValue childElement = modelElement.getDataValue();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DataValueEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDatavaluedPropertyAtomDataValuedPropertyAtomArg1Compartment_7042SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DatavaluedPropertyAtom modelElement = (DatavaluedPropertyAtom) containerView
				.getElement();
		List result = new LinkedList();
		{
			IObject childElement = modelElement.getArgument1();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IndividualVariable6EditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
			if (visualID == IndividualID6EditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDatavaluedPropertyAtomDataValuedPropertyAtomArg2Compartment_7043SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DatavaluedPropertyAtom modelElement = (DatavaluedPropertyAtom) containerView
				.getElement();
		List result = new LinkedList();
		{
			DObject childElement = modelElement.getArgument2();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DataLiteral2EditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
			if (visualID == DataVariable2EditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDataLiteralDataLiteralCompartment_7044SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DataLiteral modelElement = (DataLiteral) containerView.getElement();
		List result = new LinkedList();
		{
			DataValue childElement = modelElement.getDataValue();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DataValueEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAtomicActionAtomicActionCompartment_7045SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AtomicAction modelElement = (AtomicAction) containerView.getElement();
		List result = new LinkedList();
		{
			Condition childElement = modelElement.getHasPrecondition();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition2EditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
		}
		for (Iterator it = modelElement.getHasAtomicActionResult().iterator(); it
				.hasNext();) {
			AtomicActionResult childElement = (AtomicActionResult) it.next();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AtomicActionResultEditPart.VISUAL_ID) {
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
	public static List getAtomicActionResultQualityDistributionCompartment_7046SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AtomicActionResult modelElement = (AtomicActionResult) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getHasQualityDistribution().iterator(); it
				.hasNext();) {
			Distribution childElement = (Distribution) it.next();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Distribution3EditPart.VISUAL_ID) {
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
	public static List getAtomicActionResultCostDistributionCompartment_7047SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AtomicActionResult modelElement = (AtomicActionResult) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getHasCostDistribution().iterator(); it
				.hasNext();) {
			Distribution childElement = (Distribution) it.next();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DistributionEditPart.VISUAL_ID) {
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
	public static List getAtomicActionResultDurationDistributionCompartment_7048SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AtomicActionResult modelElement = (AtomicActionResult) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getHasDurationDistribution().iterator(); it
				.hasNext();) {
			Distribution childElement = (Distribution) it.next();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Distribution2EditPart.VISUAL_ID) {
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
	public static List getAtomicActionResultAtomicActionResultAddEffectCompartment_7049SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AtomicActionResult modelElement = (AtomicActionResult) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getHasAddEffect().iterator(); it
				.hasNext();) {
			Expression childElement = (Expression) it.next();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ExpressionEditPart.VISUAL_ID) {
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
	public static List getAtomicActionResultAtomicActionResultDeleteEffectCompartment_7050SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AtomicActionResult modelElement = (AtomicActionResult) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getHasDeleteEffect().iterator(); it
				.hasNext();) {
			Expression childElement = (Expression) it.next();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Expression2EditPart.VISUAL_ID) {
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
	public static List getRepeatUntilRepeatUntilCompartment_7051SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RepeatUntil modelElement = (RepeatUntil) containerView.getElement();
		List result = new LinkedList();
		{
			Condition childElement = modelElement.getUntilCondition();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition3EditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhileRepeatWhileCompartment_7052SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RepeatWhile modelElement = (RepeatWhile) containerView.getElement();
		List result = new LinkedList();
		{
			Condition childElement = modelElement.getWhileCondition();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition4EditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseCompartment_7053SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		IfThenElse modelElement = (IfThenElse) containerView.getElement();
		List result = new LinkedList();
		{
			Condition childElement = modelElement.getIfCondition();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition5EditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionsCollection_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ActionsCollection modelElement = (ActionsCollection) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getActions().iterator(); it.hasNext();) {
			Action childElement = (Action) it.next();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CompositeActionEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == AtomicActionEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getParameters().iterator(); it
				.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == OutputEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getParticipants().iterator(); it
				.hasNext();) {
			Participant childElement = (Participant) it.next();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ParticipantEditPart.VISUAL_ID) {
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
					.getNodeVisualID(view, childElement) == SequenceEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						SequenceEditPart.VISUAL_ID));
				continue;
			}
			if (CoordinationVisualIDRegistry
					.getNodeVisualID(view, childElement) == AnyOrderEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						AnyOrderEditPart.VISUAL_ID));
				continue;
			}
			if (CoordinationVisualIDRegistry
					.getNodeVisualID(view, childElement) == ControlConstructBagEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						ControlConstructBagEditPart.VISUAL_ID));
				continue;
			}
			if (CoordinationVisualIDRegistry
					.getNodeVisualID(view, childElement) == PerformEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						PerformEditPart.VISUAL_ID));
				continue;
			}
			if (CoordinationVisualIDRegistry
					.getNodeVisualID(view, childElement) == ChoiceEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						ChoiceEditPart.VISUAL_ID));
				continue;
			}
			if (CoordinationVisualIDRegistry
					.getNodeVisualID(view, childElement) == ControlConstructListEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						ControlConstructListEditPart.VISUAL_ID));
				continue;
			}
			if (CoordinationVisualIDRegistry
					.getNodeVisualID(view, childElement) == RepeatUntilEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						RepeatUntilEditPart.VISUAL_ID));
				continue;
			}
			if (CoordinationVisualIDRegistry
					.getNodeVisualID(view, childElement) == RepeatWhileEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						RepeatWhileEditPart.VISUAL_ID));
				continue;
			}
			if (CoordinationVisualIDRegistry
					.getNodeVisualID(view, childElement) == IfThenElseEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						IfThenElseEditPart.VISUAL_ID));
				continue;
			}
			if (CoordinationVisualIDRegistry
					.getNodeVisualID(view, childElement) == InputBindingEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						InputBindingEditPart.VISUAL_ID));
				continue;
			}
			if (CoordinationVisualIDRegistry
					.getNodeVisualID(view, childElement) == SplitEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						SplitEditPart.VISUAL_ID));
				continue;
			}
			if (CoordinationVisualIDRegistry
					.getNodeVisualID(view, childElement) == SplitJoinEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						SplitJoinEditPart.VISUAL_ID));
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
		case ActionsCollectionEditPart.VISUAL_ID:
			return getActionsCollection_1000ContainedLinks(view);
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2024ContainedLinks(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2025ContainedLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_2026ContainedLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_2027ContainedLinks(view);
		case ParticipantEditPart.VISUAL_ID:
			return getParticipant_2028ContainedLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_2029ContainedLinks(view);
		case AnyOrderEditPart.VISUAL_ID:
			return getAnyOrder_2030ContainedLinks(view);
		case ControlConstructBagEditPart.VISUAL_ID:
			return getControlConstructBag_2031ContainedLinks(view);
		case PerformEditPart.VISUAL_ID:
			return getPerform_2032ContainedLinks(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_2033ContainedLinks(view);
		case ControlConstructListEditPart.VISUAL_ID:
			return getControlConstructList_2034ContainedLinks(view);
		case RepeatUntilEditPart.VISUAL_ID:
			return getRepeatUntil_2035ContainedLinks(view);
		case RepeatWhileEditPart.VISUAL_ID:
			return getRepeatWhile_2036ContainedLinks(view);
		case IfThenElseEditPart.VISUAL_ID:
			return getIfThenElse_2037ContainedLinks(view);
		case InputBindingEditPart.VISUAL_ID:
			return getInputBinding_2038ContainedLinks(view);
		case SplitEditPart.VISUAL_ID:
			return getSplit_2039ContainedLinks(view);
		case SplitJoinEditPart.VISUAL_ID:
			return getSplitJoin_2040ContainedLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_3054ContainedLinks(view);
		case AtomListEditPart.VISUAL_ID:
			return getAtomList_3055ContainedLinks(view);
		case ClassAtomEditPart.VISUAL_ID:
			return getClassAtom_3056ContainedLinks(view);
		case IndividualIDEditPart.VISUAL_ID:
			return getIndividualID_3057ContainedLinks(view);
		case IndividualVariableEditPart.VISUAL_ID:
			return getIndividualVariable_3058ContainedLinks(view);
		case IndividualPropertyAtomEditPart.VISUAL_ID:
			return getIndividualPropertyAtom_3059ContainedLinks(view);
		case IndividualID2EditPart.VISUAL_ID:
			return getIndividualID_3060ContainedLinks(view);
		case IndividualVariable2EditPart.VISUAL_ID:
			return getIndividualVariable_3061ContainedLinks(view);
		case IndividualID3EditPart.VISUAL_ID:
			return getIndividualID_3062ContainedLinks(view);
		case IndividualVariable3EditPart.VISUAL_ID:
			return getIndividualVariable_3063ContainedLinks(view);
		case SameIndividualAtomEditPart.VISUAL_ID:
			return getSameIndividualAtom_3064ContainedLinks(view);
		case IndividualID4EditPart.VISUAL_ID:
			return getIndividualID_3065ContainedLinks(view);
		case IndividualVariable4EditPart.VISUAL_ID:
			return getIndividualVariable_3066ContainedLinks(view);
		case DifferentIndividualsAtomEditPart.VISUAL_ID:
			return getDifferentIndividualsAtom_3067ContainedLinks(view);
		case IndividualID5EditPart.VISUAL_ID:
			return getIndividualID_3068ContainedLinks(view);
		case IndividualVariable5EditPart.VISUAL_ID:
			return getIndividualVariable_3069ContainedLinks(view);
		case BuiltInAtomEditPart.VISUAL_ID:
			return getBuiltInAtom_3070ContainedLinks(view);
		case DataRangeAtomEditPart.VISUAL_ID:
			return getDataRangeAtom_3071ContainedLinks(view);
		case DataLiteralEditPart.VISUAL_ID:
			return getDataLiteral_3072ContainedLinks(view);
		case DataValueEditPart.VISUAL_ID:
			return getDataValue_3073ContainedLinks(view);
		case DataVariableEditPart.VISUAL_ID:
			return getDataVariable_3074ContainedLinks(view);
		case DataValue2EditPart.VISUAL_ID:
			return getDataValue_3090ContainedLinks(view);
		case DatavaluedPropertyAtomEditPart.VISUAL_ID:
			return getDatavaluedPropertyAtom_3075ContainedLinks(view);
		case IndividualVariable6EditPart.VISUAL_ID:
			return getIndividualVariable_3076ContainedLinks(view);
		case IndividualID6EditPart.VISUAL_ID:
			return getIndividualID_3077ContainedLinks(view);
		case DataLiteral2EditPart.VISUAL_ID:
			return getDataLiteral_3078ContainedLinks(view);
		case DataVariable2EditPart.VISUAL_ID:
			return getDataVariable_3079ContainedLinks(view);
		case Condition2EditPart.VISUAL_ID:
			return getCondition_3080ContainedLinks(view);
		case AtomicActionResultEditPart.VISUAL_ID:
			return getAtomicActionResult_3081ContainedLinks(view);
		case ExpressionEditPart.VISUAL_ID:
			return getExpression_3082ContainedLinks(view);
		case Expression2EditPart.VISUAL_ID:
			return getExpression_3083ContainedLinks(view);
		case DistributionEditPart.VISUAL_ID:
			return getDistribution_3084ContainedLinks(view);
		case Distribution2EditPart.VISUAL_ID:
			return getDistribution_3085ContainedLinks(view);
		case Distribution3EditPart.VISUAL_ID:
			return getDistribution_3086ContainedLinks(view);
		case Condition3EditPart.VISUAL_ID:
			return getCondition_3087ContainedLinks(view);
		case Condition4EditPart.VISUAL_ID:
			return getCondition_3088ContainedLinks(view);
		case Condition5EditPart.VISUAL_ID:
			return getCondition_3089ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (CoordinationVisualIDRegistry.getVisualID(view)) {
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2024IncomingLinks(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2025IncomingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_2026IncomingLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_2027IncomingLinks(view);
		case ParticipantEditPart.VISUAL_ID:
			return getParticipant_2028IncomingLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_2029IncomingLinks(view);
		case AnyOrderEditPart.VISUAL_ID:
			return getAnyOrder_2030IncomingLinks(view);
		case ControlConstructBagEditPart.VISUAL_ID:
			return getControlConstructBag_2031IncomingLinks(view);
		case PerformEditPart.VISUAL_ID:
			return getPerform_2032IncomingLinks(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_2033IncomingLinks(view);
		case ControlConstructListEditPart.VISUAL_ID:
			return getControlConstructList_2034IncomingLinks(view);
		case RepeatUntilEditPart.VISUAL_ID:
			return getRepeatUntil_2035IncomingLinks(view);
		case RepeatWhileEditPart.VISUAL_ID:
			return getRepeatWhile_2036IncomingLinks(view);
		case IfThenElseEditPart.VISUAL_ID:
			return getIfThenElse_2037IncomingLinks(view);
		case InputBindingEditPart.VISUAL_ID:
			return getInputBinding_2038IncomingLinks(view);
		case SplitEditPart.VISUAL_ID:
			return getSplit_2039IncomingLinks(view);
		case SplitJoinEditPart.VISUAL_ID:
			return getSplitJoin_2040IncomingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_3054IncomingLinks(view);
		case AtomListEditPart.VISUAL_ID:
			return getAtomList_3055IncomingLinks(view);
		case ClassAtomEditPart.VISUAL_ID:
			return getClassAtom_3056IncomingLinks(view);
		case IndividualIDEditPart.VISUAL_ID:
			return getIndividualID_3057IncomingLinks(view);
		case IndividualVariableEditPart.VISUAL_ID:
			return getIndividualVariable_3058IncomingLinks(view);
		case IndividualPropertyAtomEditPart.VISUAL_ID:
			return getIndividualPropertyAtom_3059IncomingLinks(view);
		case IndividualID2EditPart.VISUAL_ID:
			return getIndividualID_3060IncomingLinks(view);
		case IndividualVariable2EditPart.VISUAL_ID:
			return getIndividualVariable_3061IncomingLinks(view);
		case IndividualID3EditPart.VISUAL_ID:
			return getIndividualID_3062IncomingLinks(view);
		case IndividualVariable3EditPart.VISUAL_ID:
			return getIndividualVariable_3063IncomingLinks(view);
		case SameIndividualAtomEditPart.VISUAL_ID:
			return getSameIndividualAtom_3064IncomingLinks(view);
		case IndividualID4EditPart.VISUAL_ID:
			return getIndividualID_3065IncomingLinks(view);
		case IndividualVariable4EditPart.VISUAL_ID:
			return getIndividualVariable_3066IncomingLinks(view);
		case DifferentIndividualsAtomEditPart.VISUAL_ID:
			return getDifferentIndividualsAtom_3067IncomingLinks(view);
		case IndividualID5EditPart.VISUAL_ID:
			return getIndividualID_3068IncomingLinks(view);
		case IndividualVariable5EditPart.VISUAL_ID:
			return getIndividualVariable_3069IncomingLinks(view);
		case BuiltInAtomEditPart.VISUAL_ID:
			return getBuiltInAtom_3070IncomingLinks(view);
		case DataRangeAtomEditPart.VISUAL_ID:
			return getDataRangeAtom_3071IncomingLinks(view);
		case DataLiteralEditPart.VISUAL_ID:
			return getDataLiteral_3072IncomingLinks(view);
		case DataValueEditPart.VISUAL_ID:
			return getDataValue_3073IncomingLinks(view);
		case DataVariableEditPart.VISUAL_ID:
			return getDataVariable_3074IncomingLinks(view);
		case DataValue2EditPart.VISUAL_ID:
			return getDataValue_3090IncomingLinks(view);
		case DatavaluedPropertyAtomEditPart.VISUAL_ID:
			return getDatavaluedPropertyAtom_3075IncomingLinks(view);
		case IndividualVariable6EditPart.VISUAL_ID:
			return getIndividualVariable_3076IncomingLinks(view);
		case IndividualID6EditPart.VISUAL_ID:
			return getIndividualID_3077IncomingLinks(view);
		case DataLiteral2EditPart.VISUAL_ID:
			return getDataLiteral_3078IncomingLinks(view);
		case DataVariable2EditPart.VISUAL_ID:
			return getDataVariable_3079IncomingLinks(view);
		case Condition2EditPart.VISUAL_ID:
			return getCondition_3080IncomingLinks(view);
		case AtomicActionResultEditPart.VISUAL_ID:
			return getAtomicActionResult_3081IncomingLinks(view);
		case ExpressionEditPart.VISUAL_ID:
			return getExpression_3082IncomingLinks(view);
		case Expression2EditPart.VISUAL_ID:
			return getExpression_3083IncomingLinks(view);
		case DistributionEditPart.VISUAL_ID:
			return getDistribution_3084IncomingLinks(view);
		case Distribution2EditPart.VISUAL_ID:
			return getDistribution_3085IncomingLinks(view);
		case Distribution3EditPart.VISUAL_ID:
			return getDistribution_3086IncomingLinks(view);
		case Condition3EditPart.VISUAL_ID:
			return getCondition_3087IncomingLinks(view);
		case Condition4EditPart.VISUAL_ID:
			return getCondition_3088IncomingLinks(view);
		case Condition5EditPart.VISUAL_ID:
			return getCondition_3089IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (CoordinationVisualIDRegistry.getVisualID(view)) {
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2024OutgoingLinks(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2025OutgoingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_2026OutgoingLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_2027OutgoingLinks(view);
		case ParticipantEditPart.VISUAL_ID:
			return getParticipant_2028OutgoingLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_2029OutgoingLinks(view);
		case AnyOrderEditPart.VISUAL_ID:
			return getAnyOrder_2030OutgoingLinks(view);
		case ControlConstructBagEditPart.VISUAL_ID:
			return getControlConstructBag_2031OutgoingLinks(view);
		case PerformEditPart.VISUAL_ID:
			return getPerform_2032OutgoingLinks(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_2033OutgoingLinks(view);
		case ControlConstructListEditPart.VISUAL_ID:
			return getControlConstructList_2034OutgoingLinks(view);
		case RepeatUntilEditPart.VISUAL_ID:
			return getRepeatUntil_2035OutgoingLinks(view);
		case RepeatWhileEditPart.VISUAL_ID:
			return getRepeatWhile_2036OutgoingLinks(view);
		case IfThenElseEditPart.VISUAL_ID:
			return getIfThenElse_2037OutgoingLinks(view);
		case InputBindingEditPart.VISUAL_ID:
			return getInputBinding_2038OutgoingLinks(view);
		case SplitEditPart.VISUAL_ID:
			return getSplit_2039OutgoingLinks(view);
		case SplitJoinEditPart.VISUAL_ID:
			return getSplitJoin_2040OutgoingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_3054OutgoingLinks(view);
		case AtomListEditPart.VISUAL_ID:
			return getAtomList_3055OutgoingLinks(view);
		case ClassAtomEditPart.VISUAL_ID:
			return getClassAtom_3056OutgoingLinks(view);
		case IndividualIDEditPart.VISUAL_ID:
			return getIndividualID_3057OutgoingLinks(view);
		case IndividualVariableEditPart.VISUAL_ID:
			return getIndividualVariable_3058OutgoingLinks(view);
		case IndividualPropertyAtomEditPart.VISUAL_ID:
			return getIndividualPropertyAtom_3059OutgoingLinks(view);
		case IndividualID2EditPart.VISUAL_ID:
			return getIndividualID_3060OutgoingLinks(view);
		case IndividualVariable2EditPart.VISUAL_ID:
			return getIndividualVariable_3061OutgoingLinks(view);
		case IndividualID3EditPart.VISUAL_ID:
			return getIndividualID_3062OutgoingLinks(view);
		case IndividualVariable3EditPart.VISUAL_ID:
			return getIndividualVariable_3063OutgoingLinks(view);
		case SameIndividualAtomEditPart.VISUAL_ID:
			return getSameIndividualAtom_3064OutgoingLinks(view);
		case IndividualID4EditPart.VISUAL_ID:
			return getIndividualID_3065OutgoingLinks(view);
		case IndividualVariable4EditPart.VISUAL_ID:
			return getIndividualVariable_3066OutgoingLinks(view);
		case DifferentIndividualsAtomEditPart.VISUAL_ID:
			return getDifferentIndividualsAtom_3067OutgoingLinks(view);
		case IndividualID5EditPart.VISUAL_ID:
			return getIndividualID_3068OutgoingLinks(view);
		case IndividualVariable5EditPart.VISUAL_ID:
			return getIndividualVariable_3069OutgoingLinks(view);
		case BuiltInAtomEditPart.VISUAL_ID:
			return getBuiltInAtom_3070OutgoingLinks(view);
		case DataRangeAtomEditPart.VISUAL_ID:
			return getDataRangeAtom_3071OutgoingLinks(view);
		case DataLiteralEditPart.VISUAL_ID:
			return getDataLiteral_3072OutgoingLinks(view);
		case DataValueEditPart.VISUAL_ID:
			return getDataValue_3073OutgoingLinks(view);
		case DataVariableEditPart.VISUAL_ID:
			return getDataVariable_3074OutgoingLinks(view);
		case DataValue2EditPart.VISUAL_ID:
			return getDataValue_3090OutgoingLinks(view);
		case DatavaluedPropertyAtomEditPart.VISUAL_ID:
			return getDatavaluedPropertyAtom_3075OutgoingLinks(view);
		case IndividualVariable6EditPart.VISUAL_ID:
			return getIndividualVariable_3076OutgoingLinks(view);
		case IndividualID6EditPart.VISUAL_ID:
			return getIndividualID_3077OutgoingLinks(view);
		case DataLiteral2EditPart.VISUAL_ID:
			return getDataLiteral_3078OutgoingLinks(view);
		case DataVariable2EditPart.VISUAL_ID:
			return getDataVariable_3079OutgoingLinks(view);
		case Condition2EditPart.VISUAL_ID:
			return getCondition_3080OutgoingLinks(view);
		case AtomicActionResultEditPart.VISUAL_ID:
			return getAtomicActionResult_3081OutgoingLinks(view);
		case ExpressionEditPart.VISUAL_ID:
			return getExpression_3082OutgoingLinks(view);
		case Expression2EditPart.VISUAL_ID:
			return getExpression_3083OutgoingLinks(view);
		case DistributionEditPart.VISUAL_ID:
			return getDistribution_3084OutgoingLinks(view);
		case Distribution2EditPart.VISUAL_ID:
			return getDistribution_3085OutgoingLinks(view);
		case Distribution3EditPart.VISUAL_ID:
			return getDistribution_3086OutgoingLinks(view);
		case Condition3EditPart.VISUAL_ID:
			return getCondition_3087OutgoingLinks(view);
		case Condition4EditPart.VISUAL_ID:
			return getCondition_3088OutgoingLinks(view);
		case Condition5EditPart.VISUAL_ID:
			return getCondition_3089OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActionsCollection_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAction_2024ContainedLinks(View view) {
		CompositeAction modelElement = (CompositeAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Process_HasInput_4026(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Process_HasOutput_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Process_PerformedBy_4028(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4029(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAtomicAction_2025ContainedLinks(View view) {
		AtomicAction modelElement = (AtomicAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Process_HasInput_4026(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Process_HasOutput_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Process_PerformedBy_4028(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInput_2026ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutput_2027ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getParticipant_2028ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_2029ContainedLinks(View view) {
		Sequence modelElement = (Sequence) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Sequence_Components_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_2030ContainedLinks(View view) {
		AnyOrder modelElement = (AnyOrder) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnyOrder_Components_4032(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_2031ContainedLinks(View view) {
		ControlConstructBag modelElement = (ControlConstructBag) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructBag_Rest_4034(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructBag_First_4040(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerform_2032ContainedLinks(View view) {
		Perform modelElement = (Perform) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Perform_Process_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Perform_HasDataFrom_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getChoice_2033ContainedLinks(View view) {
		Choice modelElement = (Choice) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Choice_Components_4031(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructList_2034ContainedLinks(View view) {
		ControlConstructList modelElement = (ControlConstructList) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructList_Rest_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructList_First_4041(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_2035ContainedLinks(View view) {
		RepeatUntil modelElement = (RepeatUntil) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4038(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_2036ContainedLinks(View view) {
		RepeatWhile modelElement = (RepeatWhile) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4039(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_2037ContainedLinks(View view) {
		IfThenElse modelElement = (IfThenElse) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IfThenElse_Then_4036(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IfThenElse_Else_4037(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputBinding_2038ContainedLinks(View view) {
		InputBinding modelElement = (InputBinding) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Binding_ValueFrom_4043(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Binding_ToParam_4044(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplit_2039ContainedLinks(View view) {
		Split modelElement = (Split) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Split_Components_4045(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_2040ContainedLinks(View view) {
		SplitJoin modelElement = (SplitJoin) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SplitJoin_Components_4046(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3054ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAtomList_3055ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getClassAtom_3056ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3057ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3058ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualPropertyAtom_3059ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3060ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3061ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3062ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3063ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSameIndividualAtom_3064ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3065ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3066ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDifferentIndividualsAtom_3067ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3068ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3069ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBuiltInAtom_3070ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataRangeAtom_3071ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataLiteral_3072ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataValue_3073ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataVariable_3074ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataValue_3090ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDatavaluedPropertyAtom_3075ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3076ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3077ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataLiteral_3078ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataVariable_3079ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3080ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAtomicActionResult_3081ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpression_3082ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpression_3083ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDistribution_3084ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDistribution_3085ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDistribution_3086ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3087ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3088ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3089ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAction_2024IncomingLinks(View view) {
		CompositeAction modelElement = (CompositeAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Perform_Process_4030(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAtomicAction_2025IncomingLinks(View view) {
		AtomicAction modelElement = (AtomicAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Perform_Process_4030(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInput_2026IncomingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Process_HasInput_4026(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Binding_ToParam_4044(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutput_2027IncomingLinks(View view) {
		Output modelElement = (Output) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Process_HasOutput_4027(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Binding_ToParam_4044(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getParticipant_2028IncomingLinks(View view) {
		Participant modelElement = (Participant) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_Process_PerformedBy_4028(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequence_2029IncomingLinks(View view) {
		Sequence modelElement = (Sequence) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4029(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4036(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4037(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4038(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4039(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4040(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4041(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_2030IncomingLinks(View view) {
		AnyOrder modelElement = (AnyOrder) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4029(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4036(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4037(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4038(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4039(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4040(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4041(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_2031IncomingLinks(View view) {
		ControlConstructBag modelElement = (ControlConstructBag) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Choice_Components_4031(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_AnyOrder_Components_4032(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Split_Components_4045(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_SplitJoin_Components_4046(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_Rest_4034(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerform_2032IncomingLinks(View view) {
		Perform modelElement = (Perform) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4029(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4036(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4037(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4038(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4039(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4040(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4041(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getChoice_2033IncomingLinks(View view) {
		Choice modelElement = (Choice) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4029(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4036(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4037(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4038(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4039(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4040(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4041(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructList_2034IncomingLinks(View view) {
		ControlConstructList modelElement = (ControlConstructList) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_Sequence_Components_4033(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_Rest_4035(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_2035IncomingLinks(View view) {
		RepeatUntil modelElement = (RepeatUntil) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4029(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4036(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4037(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4038(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4039(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4040(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4041(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_2036IncomingLinks(View view) {
		RepeatWhile modelElement = (RepeatWhile) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4029(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4036(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4037(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4038(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4039(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4040(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4041(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_2037IncomingLinks(View view) {
		IfThenElse modelElement = (IfThenElse) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4029(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4036(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4037(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4038(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4039(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4040(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4041(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputBinding_2038IncomingLinks(View view) {
		InputBinding modelElement = (InputBinding) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_Perform_HasDataFrom_4042(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplit_2039IncomingLinks(View view) {
		Split modelElement = (Split) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4029(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4036(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4037(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4038(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4039(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4040(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4041(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_2040IncomingLinks(View view) {
		SplitJoin modelElement = (SplitJoin) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4029(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4036(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4037(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4038(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4039(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4040(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4041(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3054IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAtomList_3055IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getClassAtom_3056IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3057IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3058IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualPropertyAtom_3059IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3060IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3061IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3062IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3063IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSameIndividualAtom_3064IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3065IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3066IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDifferentIndividualsAtom_3067IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3068IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3069IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBuiltInAtom_3070IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataRangeAtom_3071IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataLiteral_3072IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataValue_3073IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataVariable_3074IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataValue_3090IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDatavaluedPropertyAtom_3075IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3076IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3077IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataLiteral_3078IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataVariable_3079IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3080IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAtomicActionResult_3081IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpression_3082IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpression_3083IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDistribution_3084IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDistribution_3085IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDistribution_3086IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3087IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3088IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3089IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAction_2024OutgoingLinks(View view) {
		CompositeAction modelElement = (CompositeAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Process_HasInput_4026(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Process_HasOutput_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Process_PerformedBy_4028(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4029(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAtomicAction_2025OutgoingLinks(View view) {
		AtomicAction modelElement = (AtomicAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Process_HasInput_4026(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Process_HasOutput_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Process_PerformedBy_4028(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInput_2026OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutput_2027OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getParticipant_2028OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_2029OutgoingLinks(View view) {
		Sequence modelElement = (Sequence) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Sequence_Components_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_2030OutgoingLinks(View view) {
		AnyOrder modelElement = (AnyOrder) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnyOrder_Components_4032(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_2031OutgoingLinks(View view) {
		ControlConstructBag modelElement = (ControlConstructBag) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructBag_Rest_4034(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructBag_First_4040(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerform_2032OutgoingLinks(View view) {
		Perform modelElement = (Perform) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Perform_Process_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Perform_HasDataFrom_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getChoice_2033OutgoingLinks(View view) {
		Choice modelElement = (Choice) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Choice_Components_4031(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructList_2034OutgoingLinks(View view) {
		ControlConstructList modelElement = (ControlConstructList) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructList_Rest_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructList_First_4041(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_2035OutgoingLinks(View view) {
		RepeatUntil modelElement = (RepeatUntil) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4038(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_2036OutgoingLinks(View view) {
		RepeatWhile modelElement = (RepeatWhile) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4039(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_2037OutgoingLinks(View view) {
		IfThenElse modelElement = (IfThenElse) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IfThenElse_Then_4036(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IfThenElse_Else_4037(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputBinding_2038OutgoingLinks(View view) {
		InputBinding modelElement = (InputBinding) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Binding_ValueFrom_4043(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Binding_ToParam_4044(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplit_2039OutgoingLinks(View view) {
		Split modelElement = (Split) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Split_Components_4045(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_2040OutgoingLinks(View view) {
		SplitJoin modelElement = (SplitJoin) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SplitJoin_Components_4046(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3054OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAtomList_3055OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getClassAtom_3056OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3057OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3058OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualPropertyAtom_3059OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3060OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3061OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3062OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3063OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSameIndividualAtom_3064OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3065OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3066OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDifferentIndividualsAtom_3067OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3068OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3069OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBuiltInAtom_3070OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataRangeAtom_3071OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataLiteral_3072OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataValue_3073OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataVariable_3074OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataValue_3090OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDatavaluedPropertyAtom_3075OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3076OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3077OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataLiteral_3078OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataVariable_3079OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3080OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAtomicActionResult_3081OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpression_3082OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpression_3083OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDistribution_3084OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDistribution_3085OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDistribution_3086OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3087OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3088OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3089OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Process_HasInput_4026(
			Input target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getProcess_HasInput()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target, CoordinationElementTypes.ProcessHasInput_4026,
						ProcessHasInputEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Process_HasOutput_4027(
			Output target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getProcess_HasOutput()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target, CoordinationElementTypes.ProcessHasOutput_4027,
						ProcessHasOutputEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Process_PerformedBy_4028(
			Participant target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getProcess_PerformedBy()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target,
						CoordinationElementTypes.ProcessPerformedBy_4028,
						ProcessPerformedByEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4029(
			ControlConstruct target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getCompositeProcess_ComposedOf()) {
				result
						.add(new CoordinationLinkDescriptor(
								setting.getEObject(),
								target,
								CoordinationElementTypes.CompositeProcessComposedOf_4029,
								CompositeProcessComposedOfEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Perform_Process_4030(
			Process target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getPerform_Process()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target, CoordinationElementTypes.PerformProcess_4030,
						PerformProcessEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Choice_Components_4031(
			ControlConstructBag target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getChoice_Components()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target, CoordinationElementTypes.ChoiceComponents_4031,
						ChoiceComponentsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_AnyOrder_Components_4032(
			ControlConstructBag target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getAnyOrder_Components()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target,
						CoordinationElementTypes.AnyOrderComponents_4032,
						AnyOrderComponentsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Sequence_Components_4033(
			ControlConstructList target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getSequence_Components()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target,
						CoordinationElementTypes.SequenceComponents_4033,
						SequenceComponentsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Split_Components_4045(
			ControlConstructBag target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getSplit_Components()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target, CoordinationElementTypes.SplitComponents_4045,
						SplitComponentsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_SplitJoin_Components_4046(
			ControlConstructBag target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getSplitJoin_Components()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target,
						CoordinationElementTypes.SplitJoinComponents_4046,
						SplitJoinComponentsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ControlConstructBag_Rest_4034(
			ControlConstructBag target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getControlConstructBag_Rest()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target,
						CoordinationElementTypes.ControlConstructBagRest_4034,
						ControlConstructBagRestEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ControlConstructList_Rest_4035(
			ControlConstructList target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getControlConstructList_Rest()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target,
						CoordinationElementTypes.ControlConstructListRest_4035,
						ControlConstructListRestEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_IfThenElse_Then_4036(
			ControlConstruct target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getIfThenElse_Then()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target, CoordinationElementTypes.IfThenElseThen_4036,
						IfThenElseThenEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_IfThenElse_Else_4037(
			ControlConstruct target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getIfThenElse_Else()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target, CoordinationElementTypes.IfThenElseElse_4037,
						IfThenElseElseEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4038(
			ControlConstruct target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getRepeatUntil_UntilProcess()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target,
						CoordinationElementTypes.RepeatUntilUntilProcess_4038,
						RepeatUntilUntilProcessEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4039(
			ControlConstruct target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getRepeatWhile_WhileProcess()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target,
						CoordinationElementTypes.RepeatWhileWhileProcess_4039,
						RepeatWhileWhileProcessEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4040(
			ControlConstruct target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getControlConstructBag_First()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target,
						CoordinationElementTypes.ControlConstructBagFirst_4040,
						ControlConstructBagFirstEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ControlConstructList_First_4041(
			ControlConstruct target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getControlConstructList_First()) {
				result
						.add(new CoordinationLinkDescriptor(
								setting.getEObject(),
								target,
								CoordinationElementTypes.ControlConstructListFirst_4041,
								ControlConstructListFirstEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Perform_HasDataFrom_4042(
			Binding target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getPerform_HasDataFrom()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target,
						CoordinationElementTypes.PerformHasDataFrom_4042,
						PerformHasDataFromEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Binding_ToParam_4044(
			Parameter target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getBinding_ToParam()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target, CoordinationElementTypes.BindingToParam_4044,
						BindingToParamEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Process_HasInput_4026(
			Process source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getHasInput().iterator(); destinations
				.hasNext();) {
			Input destination = (Input) destinations.next();
			result.add(new CoordinationLinkDescriptor(source, destination,
					CoordinationElementTypes.ProcessHasInput_4026,
					ProcessHasInputEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Process_HasOutput_4027(
			Process source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getHasOutput().iterator(); destinations
				.hasNext();) {
			Output destination = (Output) destinations.next();
			result.add(new CoordinationLinkDescriptor(source, destination,
					CoordinationElementTypes.ProcessHasOutput_4027,
					ProcessHasOutputEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Process_PerformedBy_4028(
			Process source) {
		Collection result = new LinkedList();
		Participant destination = source.getPerformedBy();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.ProcessPerformedBy_4028,
				ProcessPerformedByEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4029(
			CompositeProcess source) {
		Collection result = new LinkedList();
		ControlConstruct destination = source.getComposedOf();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.CompositeProcessComposedOf_4029,
				CompositeProcessComposedOfEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Perform_Process_4030(
			Perform source) {
		Collection result = new LinkedList();
		Process destination = source.getProcess();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.PerformProcess_4030,
				PerformProcessEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Choice_Components_4031(
			Choice source) {
		Collection result = new LinkedList();
		ControlConstructBag destination = source.getComponents();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.ChoiceComponents_4031,
				ChoiceComponentsEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_AnyOrder_Components_4032(
			AnyOrder source) {
		Collection result = new LinkedList();
		ControlConstructBag destination = source.getComponents();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.AnyOrderComponents_4032,
				AnyOrderComponentsEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Sequence_Components_4033(
			Sequence source) {
		Collection result = new LinkedList();
		ControlConstructList destination = source.getComponents();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.SequenceComponents_4033,
				SequenceComponentsEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Split_Components_4045(
			Split source) {
		Collection result = new LinkedList();
		ControlConstructBag destination = source.getComponents();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.SplitComponents_4045,
				SplitComponentsEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_SplitJoin_Components_4046(
			SplitJoin source) {
		Collection result = new LinkedList();
		ControlConstructBag destination = source.getComponents();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.SplitJoinComponents_4046,
				SplitJoinComponentsEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ControlConstructBag_Rest_4034(
			ControlConstructBag source) {
		Collection result = new LinkedList();
		ControlConstructBag destination = source.getRest();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.ControlConstructBagRest_4034,
				ControlConstructBagRestEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ControlConstructList_Rest_4035(
			ControlConstructList source) {
		Collection result = new LinkedList();
		ControlConstructList destination = source.getRest();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.ControlConstructListRest_4035,
				ControlConstructListRestEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_IfThenElse_Then_4036(
			IfThenElse source) {
		Collection result = new LinkedList();
		ControlConstruct destination = source.getThen();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.IfThenElseThen_4036,
				IfThenElseThenEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_IfThenElse_Else_4037(
			IfThenElse source) {
		Collection result = new LinkedList();
		ControlConstruct destination = source.getElse();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.IfThenElseElse_4037,
				IfThenElseElseEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4038(
			RepeatUntil source) {
		Collection result = new LinkedList();
		ControlConstruct destination = source.getUntilProcess();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.RepeatUntilUntilProcess_4038,
				RepeatUntilUntilProcessEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_RepeatWhile_WhileProcess_4039(
			RepeatWhile source) {
		Collection result = new LinkedList();
		ControlConstruct destination = source.getWhileProcess();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.RepeatWhileWhileProcess_4039,
				RepeatWhileWhileProcessEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ControlConstructBag_First_4040(
			ControlConstructBag source) {
		Collection result = new LinkedList();
		ControlConstruct destination = source.getFirst();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.ControlConstructBagFirst_4040,
				ControlConstructBagFirstEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ControlConstructList_First_4041(
			ControlConstructList source) {
		Collection result = new LinkedList();
		ControlConstruct destination = source.getFirst();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.ControlConstructListFirst_4041,
				ControlConstructListFirstEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Perform_HasDataFrom_4042(
			Perform source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getHasDataFrom().iterator(); destinations
				.hasNext();) {
			Binding destination = (Binding) destinations.next();
			result.add(new CoordinationLinkDescriptor(source, destination,
					CoordinationElementTypes.PerformHasDataFrom_4042,
					PerformHasDataFromEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Binding_ValueFrom_4043(
			Binding source) {
		Collection result = new LinkedList();
		EObject destination = source.getValueFrom();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source,
				(EObject) destination,
				CoordinationElementTypes.BindingValueFrom_4043,
				BindingValueFromEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Binding_ToParam_4044(
			Binding source) {
		Collection result = new LinkedList();
		Parameter destination = source.getToParam();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.BindingToParam_4044,
				BindingToParamEditPart.VISUAL_ID));
		return result;
	}

}
