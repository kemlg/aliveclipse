package net.sf.ictalive.coordination.tasks.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.sf.ictalive.coordination.actions.AtomicAction;
import net.sf.ictalive.coordination.actions.CompositeAction;
import net.sf.ictalive.coordination.tasks.InputMessageMap;
import net.sf.ictalive.coordination.tasks.Task;
import net.sf.ictalive.coordination.tasks.TasksCollection;
import net.sf.ictalive.coordination.tasks.TasksPackage;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AnyOrderComponentsEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AnyOrderEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AtomListAtomListFigureCompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AtomListEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.AtomicActionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.BuiltInAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ChoiceComponentsEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ChoiceEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ClassAtomClassAtomArgValueCompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ClassAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.CompositeActionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.CompositeProcessComposedOfEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ConditionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructBagEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructBagFirstEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructBagRestEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructListEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructListFirstEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ControlConstructListRestEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataLiteral2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataLiteralDataLiteralCompartment2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataLiteralDataLiteralCompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataLiteralEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataRangeAtomDataRangeArgCompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataRangeAtomDataRangeAtomOneOfCompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataRangeAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataValue2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataValueEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataVariable2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DataVariableEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DatavaluedPropertyAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DifferentIndividualsAtomDifferentFromAtomArgsCompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.DifferentIndividualsAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IfThenElseElseEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IfThenElseThenEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualID2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualID3EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualID4EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualID5EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualID6EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualIDEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualPropertyAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariable2EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariable3EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariable4EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariable5EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariable6EditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.IndividualVariableEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.InputEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.InputMessageMapEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.InputMessageMapParameterEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.OutputEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.PerformEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.PerformProcessEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.ProcessPerformedByEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.RepeatUntilUntilProcessEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.RepeatWhileWhileConditionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.SameIndividualAtomEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.SameIndividualAtomSameAsAtomArgsCompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.SequenceComponentsEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.SequenceEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.TaskComponentsEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.TaskEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.TaskInputMessageMapCompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.TaskPreconditionCompartmentEditPart;
import net.sf.ictalive.coordination.tasks.diagram.edit.parts.TasksCollectionEditPart;
import net.sf.ictalive.coordination.tasks.diagram.providers.CoordinationElementTypes;
import net.sf.ictalive.owls.expr.Condition;
import net.sf.ictalive.owls.process.AnyOrder;
import net.sf.ictalive.owls.process.Choice;
import net.sf.ictalive.owls.process.CompositeProcess;
import net.sf.ictalive.owls.process.ControlConstruct;
import net.sf.ictalive.owls.process.ControlConstructBag;
import net.sf.ictalive.owls.process.ControlConstructList;
import net.sf.ictalive.owls.process.Input;
import net.sf.ictalive.owls.process.Output;
import net.sf.ictalive.owls.process.Parameter;
import net.sf.ictalive.owls.process.Participant;
import net.sf.ictalive.owls.process.Perform;
import net.sf.ictalive.owls.process.Process;
import net.sf.ictalive.owls.process.ProcessPackage;
import net.sf.ictalive.owls.process.Sequence;
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
			return getCondition_3031SemanticChildren(view);
		case TaskInputMessageMapCompartmentEditPart.VISUAL_ID:
			return getTaskInputMessageMapCompartment_7014SemanticChildren(view);
		case TaskPreconditionCompartmentEditPart.VISUAL_ID:
			return getTaskPreconditionCompartment_7015SemanticChildren(view);
		case AtomListAtomListFigureCompartmentEditPart.VISUAL_ID:
			return getAtomListAtomListFigureCompartment_7016SemanticChildren(view);
		case ClassAtomClassAtomArgValueCompartmentEditPart.VISUAL_ID:
			return getClassAtomClassAtomArgValueCompartment_7017SemanticChildren(view);
		case IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentEditPart.VISUAL_ID:
			return getIndividualPropertyAtomIndividualPropertyAtomArg1Compartment_7018SemanticChildren(view);
		case IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentEditPart.VISUAL_ID:
			return getIndividualPropertyAtomIndividualPropertyAtomArg2Compartment_7019SemanticChildren(view);
		case SameIndividualAtomSameAsAtomArgsCompartmentEditPart.VISUAL_ID:
			return getSameIndividualAtomSameAsAtomArgsCompartment_7020SemanticChildren(view);
		case DifferentIndividualsAtomDifferentFromAtomArgsCompartmentEditPart.VISUAL_ID:
			return getDifferentIndividualsAtomDifferentFromAtomArgsCompartment_7021SemanticChildren(view);
		case DataRangeAtomDataRangeArgCompartmentEditPart.VISUAL_ID:
			return getDataRangeAtomDataRangeArgCompartment_7022SemanticChildren(view);
		case DataRangeAtomDataRangeAtomOneOfCompartmentEditPart.VISUAL_ID:
			return getDataRangeAtomDataRangeAtomOneOfCompartment_7027SemanticChildren(view);
		case DataLiteralDataLiteralCompartmentEditPart.VISUAL_ID:
			return getDataLiteralDataLiteralCompartment_7023SemanticChildren(view);
		case DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart.VISUAL_ID:
			return getDatavaluedPropertyAtomDataValuedPropertyAtomArg1Compartment_7024SemanticChildren(view);
		case DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart.VISUAL_ID:
			return getDatavaluedPropertyAtomDataValuedPropertyAtomArg2Compartment_7025SemanticChildren(view);
		case DataLiteralDataLiteralCompartment2EditPart.VISUAL_ID:
			return getDataLiteralDataLiteralCompartment_7026SemanticChildren(view);
		case TasksCollectionEditPart.VISUAL_ID:
			return getTasksCollection_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3031SemanticChildren(View view) {
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
	public static List getTaskInputMessageMapCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Task modelElement = (Task) containerView.getElement();
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
	public static List getTaskPreconditionCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Task modelElement = (Task) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getHasPrecondition().iterator(); it
				.hasNext();) {
			Condition childElement = (Condition) it.next();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConditionEditPart.VISUAL_ID) {
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
	public static List getAtomListAtomListFigureCompartment_7016SemanticChildren(
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
	public static List getClassAtomClassAtomArgValueCompartment_7017SemanticChildren(
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
	public static List getIndividualPropertyAtomIndividualPropertyAtomArg1Compartment_7018SemanticChildren(
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
	public static List getIndividualPropertyAtomIndividualPropertyAtomArg2Compartment_7019SemanticChildren(
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
	public static List getSameIndividualAtomSameAsAtomArgsCompartment_7020SemanticChildren(
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
	public static List getDifferentIndividualsAtomDifferentFromAtomArgsCompartment_7021SemanticChildren(
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
	public static List getDataRangeAtomDataRangeArgCompartment_7022SemanticChildren(
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
	public static List getDataRangeAtomDataRangeAtomOneOfCompartment_7027SemanticChildren(
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
	public static List getDataLiteralDataLiteralCompartment_7023SemanticChildren(
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
	public static List getDatavaluedPropertyAtomDataValuedPropertyAtomArg1Compartment_7024SemanticChildren(
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
	public static List getDatavaluedPropertyAtomDataValuedPropertyAtomArg2Compartment_7025SemanticChildren(
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
	public static List getDataLiteralDataLiteralCompartment_7026SemanticChildren(
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
	public static List getTasksCollection_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		TasksCollection modelElement = (TasksCollection) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getTasks().iterator(); it.hasNext();) {
			Task childElement = (Task) it.next();
			int visualID = CoordinationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TaskEditPart.VISUAL_ID) {
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
					.getNodeVisualID(view, childElement) == CompositeActionEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						CompositeActionEditPart.VISUAL_ID));
				continue;
			}
			if (CoordinationVisualIDRegistry
					.getNodeVisualID(view, childElement) == AtomicActionEditPart.VISUAL_ID) {
				result.add(new CoordinationNodeDescriptor(childElement,
						AtomicActionEditPart.VISUAL_ID));
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
		case TasksCollectionEditPart.VISUAL_ID:
			return getTasksCollection_1000ContainedLinks(view);
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2020ContainedLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2021ContainedLinks(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2022ContainedLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_2023ContainedLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_2024ContainedLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_2025ContainedLinks(view);
		case AnyOrderEditPart.VISUAL_ID:
			return getAnyOrder_2026ContainedLinks(view);
		case ControlConstructBagEditPart.VISUAL_ID:
			return getControlConstructBag_2027ContainedLinks(view);
		case PerformEditPart.VISUAL_ID:
			return getPerform_2028ContainedLinks(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_2029ContainedLinks(view);
		case ControlConstructListEditPart.VISUAL_ID:
			return getControlConstructList_2030ContainedLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_3031ContainedLinks(view);
		case AtomListEditPart.VISUAL_ID:
			return getAtomList_3032ContainedLinks(view);
		case ClassAtomEditPart.VISUAL_ID:
			return getClassAtom_3033ContainedLinks(view);
		case IndividualIDEditPart.VISUAL_ID:
			return getIndividualID_3034ContainedLinks(view);
		case IndividualVariableEditPart.VISUAL_ID:
			return getIndividualVariable_3035ContainedLinks(view);
		case IndividualPropertyAtomEditPart.VISUAL_ID:
			return getIndividualPropertyAtom_3036ContainedLinks(view);
		case IndividualID2EditPart.VISUAL_ID:
			return getIndividualID_3037ContainedLinks(view);
		case IndividualVariable2EditPart.VISUAL_ID:
			return getIndividualVariable_3038ContainedLinks(view);
		case IndividualID3EditPart.VISUAL_ID:
			return getIndividualID_3039ContainedLinks(view);
		case IndividualVariable3EditPart.VISUAL_ID:
			return getIndividualVariable_3040ContainedLinks(view);
		case SameIndividualAtomEditPart.VISUAL_ID:
			return getSameIndividualAtom_3041ContainedLinks(view);
		case IndividualID4EditPart.VISUAL_ID:
			return getIndividualID_3042ContainedLinks(view);
		case IndividualVariable4EditPart.VISUAL_ID:
			return getIndividualVariable_3043ContainedLinks(view);
		case DifferentIndividualsAtomEditPart.VISUAL_ID:
			return getDifferentIndividualsAtom_3044ContainedLinks(view);
		case IndividualID5EditPart.VISUAL_ID:
			return getIndividualID_3045ContainedLinks(view);
		case IndividualVariable5EditPart.VISUAL_ID:
			return getIndividualVariable_3046ContainedLinks(view);
		case BuiltInAtomEditPart.VISUAL_ID:
			return getBuiltInAtom_3047ContainedLinks(view);
		case DataRangeAtomEditPart.VISUAL_ID:
			return getDataRangeAtom_3048ContainedLinks(view);
		case DataLiteralEditPart.VISUAL_ID:
			return getDataLiteral_3049ContainedLinks(view);
		case DataValueEditPart.VISUAL_ID:
			return getDataValue_3050ContainedLinks(view);
		case DataVariableEditPart.VISUAL_ID:
			return getDataVariable_3051ContainedLinks(view);
		case DataValue2EditPart.VISUAL_ID:
			return getDataValue_3058ContainedLinks(view);
		case DatavaluedPropertyAtomEditPart.VISUAL_ID:
			return getDatavaluedPropertyAtom_3052ContainedLinks(view);
		case IndividualVariable6EditPart.VISUAL_ID:
			return getIndividualVariable_3053ContainedLinks(view);
		case IndividualID6EditPart.VISUAL_ID:
			return getIndividualID_3054ContainedLinks(view);
		case DataLiteral2EditPart.VISUAL_ID:
			return getDataLiteral_3055ContainedLinks(view);
		case DataVariable2EditPart.VISUAL_ID:
			return getDataVariable_3056ContainedLinks(view);
		case InputMessageMapEditPart.VISUAL_ID:
			return getInputMessageMap_3057ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (CoordinationVisualIDRegistry.getVisualID(view)) {
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2020IncomingLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2021IncomingLinks(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2022IncomingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_2023IncomingLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_2024IncomingLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_2025IncomingLinks(view);
		case AnyOrderEditPart.VISUAL_ID:
			return getAnyOrder_2026IncomingLinks(view);
		case ControlConstructBagEditPart.VISUAL_ID:
			return getControlConstructBag_2027IncomingLinks(view);
		case PerformEditPart.VISUAL_ID:
			return getPerform_2028IncomingLinks(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_2029IncomingLinks(view);
		case ControlConstructListEditPart.VISUAL_ID:
			return getControlConstructList_2030IncomingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_3031IncomingLinks(view);
		case AtomListEditPart.VISUAL_ID:
			return getAtomList_3032IncomingLinks(view);
		case ClassAtomEditPart.VISUAL_ID:
			return getClassAtom_3033IncomingLinks(view);
		case IndividualIDEditPart.VISUAL_ID:
			return getIndividualID_3034IncomingLinks(view);
		case IndividualVariableEditPart.VISUAL_ID:
			return getIndividualVariable_3035IncomingLinks(view);
		case IndividualPropertyAtomEditPart.VISUAL_ID:
			return getIndividualPropertyAtom_3036IncomingLinks(view);
		case IndividualID2EditPart.VISUAL_ID:
			return getIndividualID_3037IncomingLinks(view);
		case IndividualVariable2EditPart.VISUAL_ID:
			return getIndividualVariable_3038IncomingLinks(view);
		case IndividualID3EditPart.VISUAL_ID:
			return getIndividualID_3039IncomingLinks(view);
		case IndividualVariable3EditPart.VISUAL_ID:
			return getIndividualVariable_3040IncomingLinks(view);
		case SameIndividualAtomEditPart.VISUAL_ID:
			return getSameIndividualAtom_3041IncomingLinks(view);
		case IndividualID4EditPart.VISUAL_ID:
			return getIndividualID_3042IncomingLinks(view);
		case IndividualVariable4EditPart.VISUAL_ID:
			return getIndividualVariable_3043IncomingLinks(view);
		case DifferentIndividualsAtomEditPart.VISUAL_ID:
			return getDifferentIndividualsAtom_3044IncomingLinks(view);
		case IndividualID5EditPart.VISUAL_ID:
			return getIndividualID_3045IncomingLinks(view);
		case IndividualVariable5EditPart.VISUAL_ID:
			return getIndividualVariable_3046IncomingLinks(view);
		case BuiltInAtomEditPart.VISUAL_ID:
			return getBuiltInAtom_3047IncomingLinks(view);
		case DataRangeAtomEditPart.VISUAL_ID:
			return getDataRangeAtom_3048IncomingLinks(view);
		case DataLiteralEditPart.VISUAL_ID:
			return getDataLiteral_3049IncomingLinks(view);
		case DataValueEditPart.VISUAL_ID:
			return getDataValue_3050IncomingLinks(view);
		case DataVariableEditPart.VISUAL_ID:
			return getDataVariable_3051IncomingLinks(view);
		case DataValue2EditPart.VISUAL_ID:
			return getDataValue_3058IncomingLinks(view);
		case DatavaluedPropertyAtomEditPart.VISUAL_ID:
			return getDatavaluedPropertyAtom_3052IncomingLinks(view);
		case IndividualVariable6EditPart.VISUAL_ID:
			return getIndividualVariable_3053IncomingLinks(view);
		case IndividualID6EditPart.VISUAL_ID:
			return getIndividualID_3054IncomingLinks(view);
		case DataLiteral2EditPart.VISUAL_ID:
			return getDataLiteral_3055IncomingLinks(view);
		case DataVariable2EditPart.VISUAL_ID:
			return getDataVariable_3056IncomingLinks(view);
		case InputMessageMapEditPart.VISUAL_ID:
			return getInputMessageMap_3057IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (CoordinationVisualIDRegistry.getVisualID(view)) {
		case CompositeActionEditPart.VISUAL_ID:
			return getCompositeAction_2020OutgoingLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2021OutgoingLinks(view);
		case AtomicActionEditPart.VISUAL_ID:
			return getAtomicAction_2022OutgoingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_2023OutgoingLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_2024OutgoingLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_2025OutgoingLinks(view);
		case AnyOrderEditPart.VISUAL_ID:
			return getAnyOrder_2026OutgoingLinks(view);
		case ControlConstructBagEditPart.VISUAL_ID:
			return getControlConstructBag_2027OutgoingLinks(view);
		case PerformEditPart.VISUAL_ID:
			return getPerform_2028OutgoingLinks(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_2029OutgoingLinks(view);
		case ControlConstructListEditPart.VISUAL_ID:
			return getControlConstructList_2030OutgoingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_3031OutgoingLinks(view);
		case AtomListEditPart.VISUAL_ID:
			return getAtomList_3032OutgoingLinks(view);
		case ClassAtomEditPart.VISUAL_ID:
			return getClassAtom_3033OutgoingLinks(view);
		case IndividualIDEditPart.VISUAL_ID:
			return getIndividualID_3034OutgoingLinks(view);
		case IndividualVariableEditPart.VISUAL_ID:
			return getIndividualVariable_3035OutgoingLinks(view);
		case IndividualPropertyAtomEditPart.VISUAL_ID:
			return getIndividualPropertyAtom_3036OutgoingLinks(view);
		case IndividualID2EditPart.VISUAL_ID:
			return getIndividualID_3037OutgoingLinks(view);
		case IndividualVariable2EditPart.VISUAL_ID:
			return getIndividualVariable_3038OutgoingLinks(view);
		case IndividualID3EditPart.VISUAL_ID:
			return getIndividualID_3039OutgoingLinks(view);
		case IndividualVariable3EditPart.VISUAL_ID:
			return getIndividualVariable_3040OutgoingLinks(view);
		case SameIndividualAtomEditPart.VISUAL_ID:
			return getSameIndividualAtom_3041OutgoingLinks(view);
		case IndividualID4EditPart.VISUAL_ID:
			return getIndividualID_3042OutgoingLinks(view);
		case IndividualVariable4EditPart.VISUAL_ID:
			return getIndividualVariable_3043OutgoingLinks(view);
		case DifferentIndividualsAtomEditPart.VISUAL_ID:
			return getDifferentIndividualsAtom_3044OutgoingLinks(view);
		case IndividualID5EditPart.VISUAL_ID:
			return getIndividualID_3045OutgoingLinks(view);
		case IndividualVariable5EditPart.VISUAL_ID:
			return getIndividualVariable_3046OutgoingLinks(view);
		case BuiltInAtomEditPart.VISUAL_ID:
			return getBuiltInAtom_3047OutgoingLinks(view);
		case DataRangeAtomEditPart.VISUAL_ID:
			return getDataRangeAtom_3048OutgoingLinks(view);
		case DataLiteralEditPart.VISUAL_ID:
			return getDataLiteral_3049OutgoingLinks(view);
		case DataValueEditPart.VISUAL_ID:
			return getDataValue_3050OutgoingLinks(view);
		case DataVariableEditPart.VISUAL_ID:
			return getDataVariable_3051OutgoingLinks(view);
		case DataValue2EditPart.VISUAL_ID:
			return getDataValue_3058OutgoingLinks(view);
		case DatavaluedPropertyAtomEditPart.VISUAL_ID:
			return getDatavaluedPropertyAtom_3052OutgoingLinks(view);
		case IndividualVariable6EditPart.VISUAL_ID:
			return getIndividualVariable_3053OutgoingLinks(view);
		case IndividualID6EditPart.VISUAL_ID:
			return getIndividualID_3054OutgoingLinks(view);
		case DataLiteral2EditPart.VISUAL_ID:
			return getDataLiteral_3055OutgoingLinks(view);
		case DataVariable2EditPart.VISUAL_ID:
			return getDataVariable_3056OutgoingLinks(view);
		case InputMessageMapEditPart.VISUAL_ID:
			return getInputMessageMap_3057OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTasksCollection_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAction_2020ContainedLinks(View view) {
		CompositeAction modelElement = (CompositeAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Process_PerformedBy_4019(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4020(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2021ContainedLinks(View view) {
		Task modelElement = (Task) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Task_Components_4025(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAtomicAction_2022ContainedLinks(View view) {
		AtomicAction modelElement = (AtomicAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Process_PerformedBy_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInput_2023ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutput_2024ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_2025ContainedLinks(View view) {
		Sequence modelElement = (Sequence) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Sequence_Components_4024(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_2026ContainedLinks(View view) {
		AnyOrder modelElement = (AnyOrder) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnyOrder_Components_4023(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_2027ContainedLinks(View view) {
		ControlConstructBag modelElement = (ControlConstructBag) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructBag_Rest_4026(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructBag_First_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerform_2028ContainedLinks(View view) {
		Perform modelElement = (Perform) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Perform_Process_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getChoice_2029ContainedLinks(View view) {
		Choice modelElement = (Choice) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Choice_Components_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructList_2030ContainedLinks(View view) {
		ControlConstructList modelElement = (ControlConstructList) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructList_Rest_4028(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructList_First_4034(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3031ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAtomList_3032ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getClassAtom_3033ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3034ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3035ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualPropertyAtom_3036ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3037ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3038ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3039ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3040ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSameIndividualAtom_3041ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3042ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3043ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDifferentIndividualsAtom_3044ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3045ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3046ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBuiltInAtom_3047ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataRangeAtom_3048ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataLiteral_3049ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataValue_3050ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataVariable_3051ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataValue_3058ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDatavaluedPropertyAtom_3052ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3053ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3054ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataLiteral_3055ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataVariable_3056ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInputMessageMap_3057ContainedLinks(View view) {
		InputMessageMap modelElement = (InputMessageMap) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_InputMessageMap_Parameter_4027(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAction_2020IncomingLinks(View view) {
		CompositeAction modelElement = (CompositeAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Perform_Process_4021(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2021IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAtomicAction_2022IncomingLinks(View view) {
		AtomicAction modelElement = (AtomicAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Perform_Process_4021(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInput_2023IncomingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_InputMessageMap_Parameter_4027(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutput_2024IncomingLinks(View view) {
		Output modelElement = (Output) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_InputMessageMap_Parameter_4027(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequence_2025IncomingLinks(View view) {
		Sequence modelElement = (Sequence) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4020(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Task_Components_4025(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4029(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4030(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4031(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4033(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4034(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_2026IncomingLinks(View view) {
		AnyOrder modelElement = (AnyOrder) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4020(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Task_Components_4025(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4029(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4030(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4031(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4033(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4034(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_2027IncomingLinks(View view) {
		ControlConstructBag modelElement = (ControlConstructBag) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Choice_Components_4022(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_AnyOrder_Components_4023(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_Rest_4026(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerform_2028IncomingLinks(View view) {
		Perform modelElement = (Perform) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4020(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Task_Components_4025(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4029(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4030(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4031(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4033(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4034(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getChoice_2029IncomingLinks(View view) {
		Choice modelElement = (Choice) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4020(
						modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Task_Components_4025(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Then_4029(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_IfThenElse_Else_4030(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4031(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4033(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_First_4034(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructList_2030IncomingLinks(View view) {
		ControlConstructList modelElement = (ControlConstructList) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_Sequence_Components_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ControlConstructList_Rest_4028(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3031IncomingLinks(View view) {
		Condition modelElement = (Condition) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_RepeatWhile_WhileCondition_4032(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAtomList_3032IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getClassAtom_3033IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3034IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3035IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualPropertyAtom_3036IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3037IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3038IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3039IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3040IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSameIndividualAtom_3041IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3042IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3043IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDifferentIndividualsAtom_3044IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3045IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3046IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBuiltInAtom_3047IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataRangeAtom_3048IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataLiteral_3049IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataValue_3050IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataVariable_3051IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataValue_3058IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDatavaluedPropertyAtom_3052IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3053IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3054IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataLiteral_3055IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataVariable_3056IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInputMessageMap_3057IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeAction_2020OutgoingLinks(View view) {
		CompositeAction modelElement = (CompositeAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Process_PerformedBy_4019(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4020(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2021OutgoingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Task_Components_4025(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAtomicAction_2022OutgoingLinks(View view) {
		AtomicAction modelElement = (AtomicAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Process_PerformedBy_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInput_2023OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutput_2024OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_2025OutgoingLinks(View view) {
		Sequence modelElement = (Sequence) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Sequence_Components_4024(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_2026OutgoingLinks(View view) {
		AnyOrder modelElement = (AnyOrder) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AnyOrder_Components_4023(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_2027OutgoingLinks(View view) {
		ControlConstructBag modelElement = (ControlConstructBag) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructBag_Rest_4026(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructBag_First_4033(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerform_2028OutgoingLinks(View view) {
		Perform modelElement = (Perform) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Perform_Process_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getChoice_2029OutgoingLinks(View view) {
		Choice modelElement = (Choice) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Choice_Components_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructList_2030OutgoingLinks(View view) {
		ControlConstructList modelElement = (ControlConstructList) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructList_Rest_4028(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ControlConstructList_First_4034(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3031OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAtomList_3032OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getClassAtom_3033OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3034OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3035OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualPropertyAtom_3036OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3037OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3038OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3039OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3040OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSameIndividualAtom_3041OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3042OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3043OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDifferentIndividualsAtom_3044OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3045OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3046OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBuiltInAtom_3047OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataRangeAtom_3048OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataLiteral_3049OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataValue_3050OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataVariable_3051OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataValue_3058OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDatavaluedPropertyAtom_3052OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualVariable_3053OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividualID_3054OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataLiteral_3055OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataVariable_3056OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInputMessageMap_3057OutgoingLinks(View view) {
		InputMessageMap modelElement = (InputMessageMap) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_InputMessageMap_Parameter_4027(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4020(
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
								CoordinationElementTypes.CompositeProcessComposedOf_4020,
								CompositeProcessComposedOfEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Perform_Process_4021(
			Process target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getPerform_Process()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target, CoordinationElementTypes.PerformProcess_4021,
						PerformProcessEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Choice_Components_4022(
			ControlConstructBag target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getChoice_Components()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target, CoordinationElementTypes.ChoiceComponents_4022,
						ChoiceComponentsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_AnyOrder_Components_4023(
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
						CoordinationElementTypes.AnyOrderComponents_4023,
						AnyOrderComponentsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Sequence_Components_4024(
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
						CoordinationElementTypes.SequenceComponents_4024,
						SequenceComponentsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Task_Components_4025(
			ControlConstruct target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == TasksPackage.eINSTANCE
					.getTask_Components()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target, CoordinationElementTypes.TaskComponents_4025,
						TaskComponentsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ControlConstructBag_Rest_4026(
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
						CoordinationElementTypes.ControlConstructBagRest_4026,
						ControlConstructBagRestEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_InputMessageMap_Parameter_4027(
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
						CoordinationElementTypes.InputMessageMapParameter_4027,
						InputMessageMapParameterEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ControlConstructList_Rest_4028(
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
						CoordinationElementTypes.ControlConstructListRest_4028,
						ControlConstructListRestEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_IfThenElse_Then_4029(
			ControlConstruct target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getIfThenElse_Then()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target, CoordinationElementTypes.IfThenElseThen_4029,
						IfThenElseThenEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_IfThenElse_Else_4030(
			ControlConstruct target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getIfThenElse_Else()) {
				result.add(new CoordinationLinkDescriptor(setting.getEObject(),
						target, CoordinationElementTypes.IfThenElseElse_4030,
						IfThenElseElseEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_RepeatUntil_UntilProcess_4031(
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
						CoordinationElementTypes.RepeatUntilUntilProcess_4031,
						RepeatUntilUntilProcessEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_RepeatWhile_WhileCondition_4032(
			Condition target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == ProcessPackage.eINSTANCE
					.getRepeatWhile_WhileCondition()) {
				result
						.add(new CoordinationLinkDescriptor(
								setting.getEObject(),
								target,
								CoordinationElementTypes.RepeatWhileWhileCondition_4032,
								RepeatWhileWhileConditionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ControlConstructBag_First_4033(
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
						CoordinationElementTypes.ControlConstructBagFirst_4033,
						ControlConstructBagFirstEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ControlConstructList_First_4034(
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
								CoordinationElementTypes.ControlConstructListFirst_4034,
								ControlConstructListFirstEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Process_PerformedBy_4019(
			Process source) {
		Collection result = new LinkedList();
		Participant destination = source.getPerformedBy();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.ProcessPerformedBy_4019,
				ProcessPerformedByEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_CompositeProcess_ComposedOf_4020(
			CompositeProcess source) {
		Collection result = new LinkedList();
		ControlConstruct destination = source.getComposedOf();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.CompositeProcessComposedOf_4020,
				CompositeProcessComposedOfEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Perform_Process_4021(
			Perform source) {
		Collection result = new LinkedList();
		Process destination = source.getProcess();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.PerformProcess_4021,
				PerformProcessEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Choice_Components_4022(
			Choice source) {
		Collection result = new LinkedList();
		ControlConstructBag destination = source.getComponents();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.ChoiceComponents_4022,
				ChoiceComponentsEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_AnyOrder_Components_4023(
			AnyOrder source) {
		Collection result = new LinkedList();
		ControlConstructBag destination = source.getComponents();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.AnyOrderComponents_4023,
				AnyOrderComponentsEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Sequence_Components_4024(
			Sequence source) {
		Collection result = new LinkedList();
		ControlConstructList destination = source.getComponents();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.SequenceComponents_4024,
				SequenceComponentsEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Task_Components_4025(
			Task source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getComponents().iterator(); destinations
				.hasNext();) {
			ControlConstruct destination = (ControlConstruct) destinations
					.next();
			result.add(new CoordinationLinkDescriptor(source, destination,
					CoordinationElementTypes.TaskComponents_4025,
					TaskComponentsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ControlConstructBag_Rest_4026(
			ControlConstructBag source) {
		Collection result = new LinkedList();
		ControlConstructBag destination = source.getRest();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.ControlConstructBagRest_4026,
				ControlConstructBagRestEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_InputMessageMap_Parameter_4027(
			InputMessageMap source) {
		Collection result = new LinkedList();
		Parameter destination = source.getParameter();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.InputMessageMapParameter_4027,
				InputMessageMapParameterEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ControlConstructList_Rest_4028(
			ControlConstructList source) {
		Collection result = new LinkedList();
		ControlConstructList destination = source.getRest();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.ControlConstructListRest_4028,
				ControlConstructListRestEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ControlConstructBag_First_4033(
			ControlConstructBag source) {
		Collection result = new LinkedList();
		ControlConstruct destination = source.getFirst();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.ControlConstructBagFirst_4033,
				ControlConstructBagFirstEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ControlConstructList_First_4034(
			ControlConstructList source) {
		Collection result = new LinkedList();
		ControlConstruct destination = source.getFirst();
		if (destination == null) {
			return result;
		}
		result.add(new CoordinationLinkDescriptor(source, destination,
				CoordinationElementTypes.ControlConstructListFirst_4034,
				ControlConstructListFirstEditPart.VISUAL_ID));
		return result;
	}

}
