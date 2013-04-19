/*
 * 
 */
package control.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import control.AbstractProcess;
import control.AnyOrder;
import control.AtomicProcess;
import control.Body;
import control.Choice;
import control.CompositeProcess;
import control.Condition;
import control.ControlConstruct;
import control.ControlConstructBag;
import control.ControlConstructList;
import control.ControlPackage;
import control.Expr;
import control.IfThenElse;
import control.InnerProcess;
import control.Input;
import control.InputBinding;
import control.Link;
import control.LinkBinding;
import control.Loc;
import control.LocBinding;
import control.Ontology;
import control.OuterProcess;
import control.Output;
import control.OutputBinding;
import control.Parameter;
import control.Perform;
import control.Produce;
import control.RemoteProcess;
import control.RepeatUntil;
import control.RepeatWhile;
import control.Result;
import control.ResultVar;
import control.Sequence;
import control.Set;
import control.Split;
import control.SplitJoin;
import control.TemplateConstraint;
import control.TemplateProcess;
import control.ValueForm;
import control.ValueFunction;
import control.ValueSource;
import control.ValueSpecifier;
import control.ValueSpecifierElement;
import control.diagram.edit.parts.*;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class ControlDiagramUpdater {

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
		switch (ControlVisualIDRegistry.getVisualID(view)) {
		case RemoteProcessEditPart.VISUAL_ID:
			return getRemoteProcess_3104SemanticChildren(view);
		case TemplateProcessEditPart.VISUAL_ID:
			return getTemplateProcess_3110SemanticChildren(view);
		case SequenceSequenceComponentsCompartmentEditPart.VISUAL_ID:
			return getSequenceSequenceComponentsCompartment_7001SemanticChildren(view);
		case ControlConstructListControlConstructListFirstCompartmentEditPart.VISUAL_ID:
			return getControlConstructListControlConstructListFirstCompartment_7002SemanticChildren(view);
		case ControlConstructListControlConstructListRestCompartmentEditPart.VISUAL_ID:
			return getControlConstructListControlConstructListRestCompartment_7003SemanticChildren(view);
		case SequenceSequenceComponentsCompartment2EditPart.VISUAL_ID:
			return getSequenceSequenceComponentsCompartment_7004SemanticChildren(view);
		case ChoiceChoiceComponentsCompartmentEditPart.VISUAL_ID:
			return getChoiceChoiceComponentsCompartment_7005SemanticChildren(view);
		case ControlConstructBagControlConstructBagFirstCompartmentEditPart.VISUAL_ID:
			return getControlConstructBagControlConstructBagFirstCompartment_7006SemanticChildren(view);
		case ControlConstructBagControlConstructBagRestCompartmentEditPart.VISUAL_ID:
			return getControlConstructBagControlConstructBagRestCompartment_7007SemanticChildren(view);
		case SequenceSequenceComponentsCompartment3EditPart.VISUAL_ID:
			return getSequenceSequenceComponentsCompartment_7008SemanticChildren(view);
		case ChoiceChoiceComponentsCompartment2EditPart.VISUAL_ID:
			return getChoiceChoiceComponentsCompartment_7009SemanticChildren(view);
		case AnyOrderAnyOrderComponentsCompartmentEditPart.VISUAL_ID:
			return getAnyOrderAnyOrderComponentsCompartment_7010SemanticChildren(view);
		case ControlConstructBagControlConstructBagFirstCompartment2EditPart.VISUAL_ID:
			return getControlConstructBagControlConstructBagFirstCompartment_7011SemanticChildren(view);
		case ControlConstructBagControlConstructBagRestCompartment2EditPart.VISUAL_ID:
			return getControlConstructBagControlConstructBagRestCompartment_7012SemanticChildren(view);
		case SplitSplitComponentsCompartmentEditPart.VISUAL_ID:
			return getSplitSplitComponentsCompartment_7013SemanticChildren(view);
		case ControlConstructBagControlConstructBagFirstCompartment3EditPart.VISUAL_ID:
			return getControlConstructBagControlConstructBagFirstCompartment_7014SemanticChildren(view);
		case ControlConstructBagControlConstructBagRestCompartment3EditPart.VISUAL_ID:
			return getControlConstructBagControlConstructBagRestCompartment_7015SemanticChildren(view);
		case SplitJoinSplitJoinComponentsCompartmentEditPart.VISUAL_ID:
			return getSplitJoinSplitJoinComponentsCompartment_7016SemanticChildren(view);
		case ControlConstructBagControlConstructBagFirstCompartment4EditPart.VISUAL_ID:
			return getControlConstructBagControlConstructBagFirstCompartment_7017SemanticChildren(view);
		case ControlConstructBagControlConstructBagRestCompartment4EditPart.VISUAL_ID:
			return getControlConstructBagControlConstructBagRestCompartment_7018SemanticChildren(view);
		case IfThenElseIfThenElseIfConditionCompartmentEditPart.VISUAL_ID:
			return getIfThenElseIfThenElseIfConditionCompartment_7019SemanticChildren(view);
		case IfThenElseIfThenElseThenCompartmentEditPart.VISUAL_ID:
			return getIfThenElseIfThenElseThenCompartment_7020SemanticChildren(view);
		case IfThenElseIfThenElseElseCompartmentEditPart.VISUAL_ID:
			return getIfThenElseIfThenElseElseCompartment_7129SemanticChildren(view);
		case SequenceSequenceComponentsCompartment4EditPart.VISUAL_ID:
			return getSequenceSequenceComponentsCompartment_7021SemanticChildren(view);
		case ChoiceChoiceComponentsCompartment3EditPart.VISUAL_ID:
			return getChoiceChoiceComponentsCompartment_7022SemanticChildren(view);
		case AnyOrderAnyOrderComponentsCompartment2EditPart.VISUAL_ID:
			return getAnyOrderAnyOrderComponentsCompartment_7023SemanticChildren(view);
		case SplitSplitComponentsCompartment2EditPart.VISUAL_ID:
			return getSplitSplitComponentsCompartment_7024SemanticChildren(view);
		case SplitJoinSplitJoinComponentsCompartment2EditPart.VISUAL_ID:
			return getSplitJoinSplitJoinComponentsCompartment_7025SemanticChildren(view);
		case IfThenElseIfThenElseIfConditionCompartment2EditPart.VISUAL_ID:
			return getIfThenElseIfThenElseIfConditionCompartment_7026SemanticChildren(view);
		case IfThenElseIfThenElseThenCompartment2EditPart.VISUAL_ID:
			return getIfThenElseIfThenElseThenCompartment_7027SemanticChildren(view);
		case IfThenElseIfThenElseElseCompartment2EditPart.VISUAL_ID:
			return getIfThenElseIfThenElseElseCompartment_7130SemanticChildren(view);
		case RepeatUntilRepeatUntilUntilConditionCompartmentEditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilUntilConditionCompartment_7028SemanticChildren(view);
		case RepeatUntilRepeatUntilUntilProcessCompartmentEditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilUntilProcessCompartment_7131SemanticChildren(view);
		case SequenceSequenceComponentsCompartment5EditPart.VISUAL_ID:
			return getSequenceSequenceComponentsCompartment_7029SemanticChildren(view);
		case ChoiceChoiceComponentsCompartment4EditPart.VISUAL_ID:
			return getChoiceChoiceComponentsCompartment_7030SemanticChildren(view);
		case AnyOrderAnyOrderComponentsCompartment3EditPart.VISUAL_ID:
			return getAnyOrderAnyOrderComponentsCompartment_7031SemanticChildren(view);
		case SplitSplitComponentsCompartment3EditPart.VISUAL_ID:
			return getSplitSplitComponentsCompartment_7032SemanticChildren(view);
		case SplitJoinSplitJoinComponentsCompartment3EditPart.VISUAL_ID:
			return getSplitJoinSplitJoinComponentsCompartment_7033SemanticChildren(view);
		case IfThenElseIfThenElseIfConditionCompartment3EditPart.VISUAL_ID:
			return getIfThenElseIfThenElseIfConditionCompartment_7034SemanticChildren(view);
		case IfThenElseIfThenElseThenCompartment3EditPart.VISUAL_ID:
			return getIfThenElseIfThenElseThenCompartment_7035SemanticChildren(view);
		case IfThenElseIfThenElseElseCompartment3EditPart.VISUAL_ID:
			return getIfThenElseIfThenElseElseCompartment_7132SemanticChildren(view);
		case RepeatWhileRepeatWhileWhileConditionCompartmentEditPart.VISUAL_ID:
			return getRepeatWhileRepeatWhileWhileConditionCompartment_7036SemanticChildren(view);
		case RepeatWhileRepeatWhileWhileProcessCompartmentEditPart.VISUAL_ID:
			return getRepeatWhileRepeatWhileWhileProcessCompartment_7133SemanticChildren(view);
		case SequenceSequenceComponentsCompartment6EditPart.VISUAL_ID:
			return getSequenceSequenceComponentsCompartment_7037SemanticChildren(view);
		case ChoiceChoiceComponentsCompartment5EditPart.VISUAL_ID:
			return getChoiceChoiceComponentsCompartment_7038SemanticChildren(view);
		case AnyOrderAnyOrderComponentsCompartment4EditPart.VISUAL_ID:
			return getAnyOrderAnyOrderComponentsCompartment_7039SemanticChildren(view);
		case SplitSplitComponentsCompartment4EditPart.VISUAL_ID:
			return getSplitSplitComponentsCompartment_7040SemanticChildren(view);
		case SplitJoinSplitJoinComponentsCompartment4EditPart.VISUAL_ID:
			return getSplitJoinSplitJoinComponentsCompartment_7041SemanticChildren(view);
		case IfThenElseIfThenElseIfConditionCompartment4EditPart.VISUAL_ID:
			return getIfThenElseIfThenElseIfConditionCompartment_7042SemanticChildren(view);
		case IfThenElseIfThenElseThenCompartment4EditPart.VISUAL_ID:
			return getIfThenElseIfThenElseThenCompartment_7043SemanticChildren(view);
		case IfThenElseIfThenElseElseCompartment4EditPart.VISUAL_ID:
			return getIfThenElseIfThenElseElseCompartment_7134SemanticChildren(view);
		case PerformPerformTheProcessCompartmentEditPart.VISUAL_ID:
			return getPerformPerformTheProcessCompartment_7044SemanticChildren(view);
		case ResultResultInConditionCompartmentEditPart.VISUAL_ID:
			return getResultResultInConditionCompartment_7123SemanticChildren(view);
		case ResultResultHasResultVarCompartmentEditPart.VISUAL_ID:
			return getResultResultHasResultVarCompartment_7124SemanticChildren(view);
		case ResultResultHasEffectCompartmentEditPart.VISUAL_ID:
			return getResultResultHasEffectCompartment_7125SemanticChildren(view);
		case ResultResultBindingSourceCompartmentEditPart.VISUAL_ID:
			return getResultResultBindingSourceCompartment_7126SemanticChildren(view);
		case ProduceProduceProducedBindingValueSpecifierCompartmentEditPart.VISUAL_ID:
			return getProduceProduceProducedBindingValueSpecifierCompartment_7047SemanticChildren(view);
		case SetSetProducedBindingValueSpecifierCompartmentEditPart.VISUAL_ID:
			return getSetSetProducedBindingValueSpecifierCompartment_7048SemanticChildren(view);
		case SequenceSequenceComponentsCompartment7EditPart.VISUAL_ID:
			return getSequenceSequenceComponentsCompartment_7049SemanticChildren(view);
		case ChoiceChoiceComponentsCompartment6EditPart.VISUAL_ID:
			return getChoiceChoiceComponentsCompartment_7050SemanticChildren(view);
		case AnyOrderAnyOrderComponentsCompartment5EditPart.VISUAL_ID:
			return getAnyOrderAnyOrderComponentsCompartment_7051SemanticChildren(view);
		case SplitSplitComponentsCompartment5EditPart.VISUAL_ID:
			return getSplitSplitComponentsCompartment_7052SemanticChildren(view);
		case SplitJoinSplitJoinComponentsCompartment5EditPart.VISUAL_ID:
			return getSplitJoinSplitJoinComponentsCompartment_7053SemanticChildren(view);
		case IfThenElseIfThenElseIfConditionCompartment5EditPart.VISUAL_ID:
			return getIfThenElseIfThenElseIfConditionCompartment_7054SemanticChildren(view);
		case IfThenElseIfThenElseThenCompartment5EditPart.VISUAL_ID:
			return getIfThenElseIfThenElseThenCompartment_7055SemanticChildren(view);
		case IfThenElseIfThenElseElseCompartment5EditPart.VISUAL_ID:
			return getIfThenElseIfThenElseElseCompartment_7135SemanticChildren(view);
		case RepeatUntilRepeatUntilUntilConditionCompartment2EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilUntilConditionCompartment_7056SemanticChildren(view);
		case RepeatUntilRepeatUntilUntilProcessCompartment2EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilUntilProcessCompartment_7136SemanticChildren(view);
		case RepeatUntilRepeatUntilUntilConditionCompartment3EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilUntilConditionCompartment_7057SemanticChildren(view);
		case RepeatUntilRepeatUntilUntilProcessCompartment3EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilUntilProcessCompartment_7137SemanticChildren(view);
		case RepeatWhileRepeatWhileWhileConditionCompartment2EditPart.VISUAL_ID:
			return getRepeatWhileRepeatWhileWhileConditionCompartment_7058SemanticChildren(view);
		case RepeatWhileRepeatWhileWhileProcessCompartment2EditPart.VISUAL_ID:
			return getRepeatWhileRepeatWhileWhileProcessCompartment_7138SemanticChildren(view);
		case RepeatUntilRepeatUntilUntilConditionCompartment4EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilUntilConditionCompartment_7059SemanticChildren(view);
		case RepeatUntilRepeatUntilUntilProcessCompartment4EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilUntilProcessCompartment_7139SemanticChildren(view);
		case PerformPerformTheProcessCompartment2EditPart.VISUAL_ID:
			return getPerformPerformTheProcessCompartment_7060SemanticChildren(view);
		case ProduceProduceProducedBindingValueSpecifierCompartment2EditPart.VISUAL_ID:
			return getProduceProduceProducedBindingValueSpecifierCompartment_7061SemanticChildren(view);
		case SetSetProducedBindingValueSpecifierCompartment2EditPart.VISUAL_ID:
			return getSetSetProducedBindingValueSpecifierCompartment_7062SemanticChildren(view);
		case RepeatWhileRepeatWhileWhileConditionCompartment3EditPart.VISUAL_ID:
			return getRepeatWhileRepeatWhileWhileConditionCompartment_7063SemanticChildren(view);
		case RepeatWhileRepeatWhileWhileProcessCompartment3EditPart.VISUAL_ID:
			return getRepeatWhileRepeatWhileWhileProcessCompartment_7142SemanticChildren(view);
		case PerformPerformTheProcessCompartment3EditPart.VISUAL_ID:
			return getPerformPerformTheProcessCompartment_7064SemanticChildren(view);
		case ProduceProduceProducedBindingValueSpecifierCompartment3EditPart.VISUAL_ID:
			return getProduceProduceProducedBindingValueSpecifierCompartment_7065SemanticChildren(view);
		case SetSetProducedBindingValueSpecifierCompartment3EditPart.VISUAL_ID:
			return getSetSetProducedBindingValueSpecifierCompartment_7066SemanticChildren(view);
		case RepeatWhileRepeatWhileWhileConditionCompartment4EditPart.VISUAL_ID:
			return getRepeatWhileRepeatWhileWhileConditionCompartment_7067SemanticChildren(view);
		case RepeatWhileRepeatWhileWhileProcessCompartment4EditPart.VISUAL_ID:
			return getRepeatWhileRepeatWhileWhileProcessCompartment_7145SemanticChildren(view);
		case PerformPerformTheProcessCompartment4EditPart.VISUAL_ID:
			return getPerformPerformTheProcessCompartment_7068SemanticChildren(view);
		case ProduceProduceProducedBindingValueSpecifierCompartment4EditPart.VISUAL_ID:
			return getProduceProduceProducedBindingValueSpecifierCompartment_7069SemanticChildren(view);
		case SetSetProducedBindingValueSpecifierCompartment4EditPart.VISUAL_ID:
			return getSetSetProducedBindingValueSpecifierCompartment_7070SemanticChildren(view);
		case RepeatUntilRepeatUntilUntilConditionCompartment5EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilUntilConditionCompartment_7071SemanticChildren(view);
		case RepeatUntilRepeatUntilUntilProcessCompartment5EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilUntilProcessCompartment_7148SemanticChildren(view);
		case RepeatWhileRepeatWhileWhileConditionCompartment5EditPart.VISUAL_ID:
			return getRepeatWhileRepeatWhileWhileConditionCompartment_7072SemanticChildren(view);
		case RepeatWhileRepeatWhileWhileProcessCompartment5EditPart.VISUAL_ID:
			return getRepeatWhileRepeatWhileWhileProcessCompartment_7149SemanticChildren(view);
		case PerformPerformTheProcessCompartment5EditPart.VISUAL_ID:
			return getPerformPerformTheProcessCompartment_7073SemanticChildren(view);
		case ProduceProduceProducedBindingValueSpecifierCompartment5EditPart.VISUAL_ID:
			return getProduceProduceProducedBindingValueSpecifierCompartment_7074SemanticChildren(view);
		case SetSetProducedBindingValueSpecifierCompartment5EditPart.VISUAL_ID:
			return getSetSetProducedBindingValueSpecifierCompartment_7075SemanticChildren(view);
		case ControlConstructBagControlConstructBagFirstCompartment5EditPart.VISUAL_ID:
			return getControlConstructBagControlConstructBagFirstCompartment_7076SemanticChildren(view);
		case ControlConstructBagControlConstructBagRestCompartment5EditPart.VISUAL_ID:
			return getControlConstructBagControlConstructBagRestCompartment_7077SemanticChildren(view);
		case AnyOrderAnyOrderComponentsCompartment6EditPart.VISUAL_ID:
			return getAnyOrderAnyOrderComponentsCompartment_7078SemanticChildren(view);
		case SplitSplitComponentsCompartment6EditPart.VISUAL_ID:
			return getSplitSplitComponentsCompartment_7079SemanticChildren(view);
		case SplitJoinSplitJoinComponentsCompartment6EditPart.VISUAL_ID:
			return getSplitJoinSplitJoinComponentsCompartment_7080SemanticChildren(view);
		case IfThenElseIfThenElseIfConditionCompartment6EditPart.VISUAL_ID:
			return getIfThenElseIfThenElseIfConditionCompartment_7081SemanticChildren(view);
		case IfThenElseIfThenElseThenCompartment6EditPart.VISUAL_ID:
			return getIfThenElseIfThenElseThenCompartment_7082SemanticChildren(view);
		case IfThenElseIfThenElseElseCompartment6EditPart.VISUAL_ID:
			return getIfThenElseIfThenElseElseCompartment_7150SemanticChildren(view);
		case RepeatUntilRepeatUntilUntilConditionCompartment6EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilUntilConditionCompartment_7083SemanticChildren(view);
		case RepeatUntilRepeatUntilUntilProcessCompartment6EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilUntilProcessCompartment_7151SemanticChildren(view);
		case RepeatWhileRepeatWhileWhileConditionCompartment6EditPart.VISUAL_ID:
			return getRepeatWhileRepeatWhileWhileConditionCompartment_7084SemanticChildren(view);
		case RepeatWhileRepeatWhileWhileProcessCompartment6EditPart.VISUAL_ID:
			return getRepeatWhileRepeatWhileWhileProcessCompartment_7152SemanticChildren(view);
		case PerformPerformTheProcessCompartment6EditPart.VISUAL_ID:
			return getPerformPerformTheProcessCompartment_7085SemanticChildren(view);
		case ProduceProduceProducedBindingValueSpecifierCompartment6EditPart.VISUAL_ID:
			return getProduceProduceProducedBindingValueSpecifierCompartment_7086SemanticChildren(view);
		case SetSetProducedBindingValueSpecifierCompartment6EditPart.VISUAL_ID:
			return getSetSetProducedBindingValueSpecifierCompartment_7087SemanticChildren(view);
		case ControlConstructListControlConstructListFirstCompartment2EditPart.VISUAL_ID:
			return getControlConstructListControlConstructListFirstCompartment_7088SemanticChildren(view);
		case ControlConstructListControlConstructListRestCompartment2EditPart.VISUAL_ID:
			return getControlConstructListControlConstructListRestCompartment_7089SemanticChildren(view);
		case ChoiceChoiceComponentsCompartment7EditPart.VISUAL_ID:
			return getChoiceChoiceComponentsCompartment_7090SemanticChildren(view);
		case AnyOrderAnyOrderComponentsCompartment7EditPart.VISUAL_ID:
			return getAnyOrderAnyOrderComponentsCompartment_7091SemanticChildren(view);
		case SplitSplitComponentsCompartment7EditPart.VISUAL_ID:
			return getSplitSplitComponentsCompartment_7092SemanticChildren(view);
		case SplitJoinSplitJoinComponentsCompartment7EditPart.VISUAL_ID:
			return getSplitJoinSplitJoinComponentsCompartment_7093SemanticChildren(view);
		case IfThenElseIfThenElseIfConditionCompartment7EditPart.VISUAL_ID:
			return getIfThenElseIfThenElseIfConditionCompartment_7094SemanticChildren(view);
		case IfThenElseIfThenElseThenCompartment7EditPart.VISUAL_ID:
			return getIfThenElseIfThenElseThenCompartment_7095SemanticChildren(view);
		case IfThenElseIfThenElseElseCompartment7EditPart.VISUAL_ID:
			return getIfThenElseIfThenElseElseCompartment_7153SemanticChildren(view);
		case RepeatUntilRepeatUntilUntilConditionCompartment7EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilUntilConditionCompartment_7096SemanticChildren(view);
		case RepeatUntilRepeatUntilUntilProcessCompartment7EditPart.VISUAL_ID:
			return getRepeatUntilRepeatUntilUntilProcessCompartment_7154SemanticChildren(view);
		case RepeatWhileRepeatWhileWhileConditionCompartment7EditPart.VISUAL_ID:
			return getRepeatWhileRepeatWhileWhileConditionCompartment_7097SemanticChildren(view);
		case RepeatWhileRepeatWhileWhileProcessCompartment7EditPart.VISUAL_ID:
			return getRepeatWhileRepeatWhileWhileProcessCompartment_7155SemanticChildren(view);
		case PerformPerformTheProcessCompartment7EditPart.VISUAL_ID:
			return getPerformPerformTheProcessCompartment_7098SemanticChildren(view);
		case ProduceProduceProducedBindingValueSpecifierCompartment7EditPart.VISUAL_ID:
			return getProduceProduceProducedBindingValueSpecifierCompartment_7099SemanticChildren(view);
		case SetSetProducedBindingValueSpecifierCompartment7EditPart.VISUAL_ID:
			return getSetSetProducedBindingValueSpecifierCompartment_7100SemanticChildren(view);
		case ResultResultInConditionCompartment2EditPart.VISUAL_ID:
			return getResultResultInConditionCompartment_7102SemanticChildren(view);
		case ResultResultHasResultVarCompartment2EditPart.VISUAL_ID:
			return getResultResultHasResultVarCompartment_7103SemanticChildren(view);
		case ResultResultHasEffectCompartment2EditPart.VISUAL_ID:
			return getResultResultHasEffectCompartment_7104SemanticChildren(view);
		case ResultResultBindingSourceCompartment2EditPart.VISUAL_ID:
			return getResultResultBindingSourceCompartment_7105SemanticChildren(view);
		case OuterProcessEditPart.VISUAL_ID:
			return getOuterProcess_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRemoteProcess_3104SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RemoteProcess modelElement = (RemoteProcess) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getHasInput().iterator(); it.hasNext();) {
			Input childElement = (Input) it.next();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Input2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getHasOutput().iterator(); it.hasNext();) {
			Output childElement = (Output) it.next();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Output2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getHasResult().iterator(); it.hasNext();) {
			Result childElement = (Result) it.next();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Result2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getExpressions().iterator(); it
				.hasNext();) {
			Expr childElement = (Expr) it.next();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Expr4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTemplateProcess_3110SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		TemplateProcess modelElement = (TemplateProcess) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getHasInput().iterator(); it.hasNext();) {
			Input childElement = (Input) it.next();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Input2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getHasOutput().iterator(); it.hasNext();) {
			Output childElement = (Output) it.next();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Output2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceComponentsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Sequence modelElement = (Sequence) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructList childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructListEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructListControlConstructListFirstCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ControlConstructList modelElement = (ControlConstructList) containerView
				.getElement();
		List result = new LinkedList();
		{
			ControlConstruct childElement = modelElement.getFirst();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructListControlConstructListRestCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ControlConstructList modelElement = (ControlConstructList) containerView
				.getElement();
		List result = new LinkedList();
		{
			ControlConstructList childElement = modelElement.getRest();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructList2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceComponentsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Sequence modelElement = (Sequence) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructList childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructListEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getChoiceChoiceComponentsCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Choice modelElement = (Choice) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBagEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBagControlConstructBagFirstCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ControlConstructBag modelElement = (ControlConstructBag) containerView
				.getElement();
		List result = new LinkedList();
		{
			ControlConstruct childElement = modelElement.getFirst();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBagControlConstructBagRestCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ControlConstructBag modelElement = (ControlConstructBag) containerView
				.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getRest();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceComponentsCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Sequence modelElement = (Sequence) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructList childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructListEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getChoiceChoiceComponentsCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Choice modelElement = (Choice) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBagEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrderAnyOrderComponentsCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AnyOrder modelElement = (AnyOrder) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBagControlConstructBagFirstCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ControlConstructBag modelElement = (ControlConstructBag) containerView
				.getElement();
		List result = new LinkedList();
		{
			ControlConstruct childElement = modelElement.getFirst();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBagControlConstructBagRestCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ControlConstructBag modelElement = (ControlConstructBag) containerView
				.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getRest();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplitSplitComponentsCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Split modelElement = (Split) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBagControlConstructBagFirstCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ControlConstructBag modelElement = (ControlConstructBag) containerView
				.getElement();
		List result = new LinkedList();
		{
			ControlConstruct childElement = modelElement.getFirst();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBagControlConstructBagRestCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ControlConstructBag modelElement = (ControlConstructBag) containerView
				.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getRest();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoinSplitJoinComponentsCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SplitJoin modelElement = (SplitJoin) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBagControlConstructBagFirstCompartment_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ControlConstructBag modelElement = (ControlConstructBag) containerView
				.getElement();
		List result = new LinkedList();
		{
			ControlConstruct childElement = modelElement.getFirst();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBagControlConstructBagRestCompartment_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ControlConstructBag modelElement = (ControlConstructBag) containerView
				.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getRest();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseIfConditionCompartment_7019SemanticChildren(
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
			Expr childElement = modelElement.getIfCondition();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseThenCompartment_7020SemanticChildren(
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
			ControlConstruct childElement = modelElement.getThen();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseElseCompartment_7129SemanticChildren(
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
			ControlConstruct childElement = modelElement.getElse();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceComponentsCompartment_7021SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Sequence modelElement = (Sequence) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructList childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructListEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getChoiceChoiceComponentsCompartment_7022SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Choice modelElement = (Choice) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBagEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrderAnyOrderComponentsCompartment_7023SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AnyOrder modelElement = (AnyOrder) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplitSplitComponentsCompartment_7024SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Split modelElement = (Split) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoinSplitJoinComponentsCompartment_7025SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SplitJoin modelElement = (SplitJoin) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseIfConditionCompartment_7026SemanticChildren(
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
			Expr childElement = modelElement.getIfCondition();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseThenCompartment_7027SemanticChildren(
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
			ControlConstruct childElement = modelElement.getThen();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseElseCompartment_7130SemanticChildren(
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
			ControlConstruct childElement = modelElement.getElse();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilUntilConditionCompartment_7028SemanticChildren(
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
			Expr childElement = modelElement.getUntilCondition();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilUntilProcessCompartment_7131SemanticChildren(
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
			ControlConstruct childElement = modelElement.getUntilProcess();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceComponentsCompartment_7029SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Sequence modelElement = (Sequence) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructList childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructListEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getChoiceChoiceComponentsCompartment_7030SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Choice modelElement = (Choice) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBagEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrderAnyOrderComponentsCompartment_7031SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AnyOrder modelElement = (AnyOrder) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplitSplitComponentsCompartment_7032SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Split modelElement = (Split) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoinSplitJoinComponentsCompartment_7033SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SplitJoin modelElement = (SplitJoin) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseIfConditionCompartment_7034SemanticChildren(
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
			Expr childElement = modelElement.getIfCondition();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseThenCompartment_7035SemanticChildren(
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
			ControlConstruct childElement = modelElement.getThen();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseElseCompartment_7132SemanticChildren(
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
			ControlConstruct childElement = modelElement.getElse();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhileRepeatWhileWhileConditionCompartment_7036SemanticChildren(
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
			Expr childElement = modelElement.getWhileCondition();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhileRepeatWhileWhileProcessCompartment_7133SemanticChildren(
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
			ControlConstruct childElement = modelElement.getWhileProcess();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceComponentsCompartment_7037SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Sequence modelElement = (Sequence) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructList childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructListEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getChoiceChoiceComponentsCompartment_7038SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Choice modelElement = (Choice) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBagEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrderAnyOrderComponentsCompartment_7039SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AnyOrder modelElement = (AnyOrder) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplitSplitComponentsCompartment_7040SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Split modelElement = (Split) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoinSplitJoinComponentsCompartment_7041SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SplitJoin modelElement = (SplitJoin) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseIfConditionCompartment_7042SemanticChildren(
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
			Expr childElement = modelElement.getIfCondition();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseThenCompartment_7043SemanticChildren(
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
			ControlConstruct childElement = modelElement.getThen();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseElseCompartment_7134SemanticChildren(
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
			ControlConstruct childElement = modelElement.getElse();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerformPerformTheProcessCompartment_7044SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Perform modelElement = (Perform) containerView.getElement();
		List result = new LinkedList();
		{
			AbstractProcess childElement = modelElement.getTheProcess();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RemoteProcessEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == TemplateProcessEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResultResultInConditionCompartment_7123SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Result modelElement = (Result) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getInCondition().iterator(); it
				.hasNext();) {
			Expr childElement = (Expr) it.next();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Expr2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResultResultHasResultVarCompartment_7124SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Result modelElement = (Result) containerView.getElement();
		List result = new LinkedList();
		{
			ResultVar childElement = modelElement.getHasResultVar();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ResultVarEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResultResultHasEffectCompartment_7125SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Result modelElement = (Result) containerView.getElement();
		List result = new LinkedList();
		{
			Expr childElement = modelElement.getHasEffect();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResultResultBindingSourceCompartment_7126SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Result modelElement = (Result) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getBindingSource().iterator(); it
				.hasNext();) {
			ValueSpecifierElement childElement = (ValueSpecifierElement) it
					.next();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueSourceEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueFormEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueFunctionEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProduceProduceProducedBindingValueSpecifierCompartment_7047SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Produce modelElement = (Produce) containerView.getElement();
		List result = new LinkedList();
		{
			ValueSpecifierElement childElement = modelElement
					.getProducedBindingValueSpecifier();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueSource2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueForm2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueFunction2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSetSetProducedBindingValueSpecifierCompartment_7048SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Set modelElement = (Set) containerView.getElement();
		List result = new LinkedList();
		{
			ValueSpecifierElement childElement = modelElement
					.getProducedBindingValueSpecifier();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueSource3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueForm3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueFunction3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceSequenceComponentsCompartment_7049SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Sequence modelElement = (Sequence) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructList childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructListEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getChoiceChoiceComponentsCompartment_7050SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Choice modelElement = (Choice) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBagEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrderAnyOrderComponentsCompartment_7051SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AnyOrder modelElement = (AnyOrder) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplitSplitComponentsCompartment_7052SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Split modelElement = (Split) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoinSplitJoinComponentsCompartment_7053SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SplitJoin modelElement = (SplitJoin) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseIfConditionCompartment_7054SemanticChildren(
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
			Expr childElement = modelElement.getIfCondition();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseThenCompartment_7055SemanticChildren(
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
			ControlConstruct childElement = modelElement.getThen();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseElseCompartment_7135SemanticChildren(
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
			ControlConstruct childElement = modelElement.getElse();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilUntilConditionCompartment_7056SemanticChildren(
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
			Expr childElement = modelElement.getUntilCondition();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilUntilProcessCompartment_7136SemanticChildren(
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
			ControlConstruct childElement = modelElement.getUntilProcess();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilUntilConditionCompartment_7057SemanticChildren(
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
			Expr childElement = modelElement.getUntilCondition();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilUntilProcessCompartment_7137SemanticChildren(
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
			ControlConstruct childElement = modelElement.getUntilProcess();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhileRepeatWhileWhileConditionCompartment_7058SemanticChildren(
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
			Expr childElement = modelElement.getWhileCondition();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhileRepeatWhileWhileProcessCompartment_7138SemanticChildren(
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
			ControlConstruct childElement = modelElement.getWhileProcess();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilUntilConditionCompartment_7059SemanticChildren(
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
			Expr childElement = modelElement.getUntilCondition();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilUntilProcessCompartment_7139SemanticChildren(
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
			ControlConstruct childElement = modelElement.getUntilProcess();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerformPerformTheProcessCompartment_7060SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Perform modelElement = (Perform) containerView.getElement();
		List result = new LinkedList();
		{
			AbstractProcess childElement = modelElement.getTheProcess();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RemoteProcessEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == TemplateProcessEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProduceProduceProducedBindingValueSpecifierCompartment_7061SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Produce modelElement = (Produce) containerView.getElement();
		List result = new LinkedList();
		{
			ValueSpecifierElement childElement = modelElement
					.getProducedBindingValueSpecifier();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueSource2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueForm2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueFunction2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSetSetProducedBindingValueSpecifierCompartment_7062SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Set modelElement = (Set) containerView.getElement();
		List result = new LinkedList();
		{
			ValueSpecifierElement childElement = modelElement
					.getProducedBindingValueSpecifier();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueSource3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueForm3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueFunction3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhileRepeatWhileWhileConditionCompartment_7063SemanticChildren(
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
			Expr childElement = modelElement.getWhileCondition();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhileRepeatWhileWhileProcessCompartment_7142SemanticChildren(
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
			ControlConstruct childElement = modelElement.getWhileProcess();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerformPerformTheProcessCompartment_7064SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Perform modelElement = (Perform) containerView.getElement();
		List result = new LinkedList();
		{
			AbstractProcess childElement = modelElement.getTheProcess();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RemoteProcessEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == TemplateProcessEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProduceProduceProducedBindingValueSpecifierCompartment_7065SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Produce modelElement = (Produce) containerView.getElement();
		List result = new LinkedList();
		{
			ValueSpecifierElement childElement = modelElement
					.getProducedBindingValueSpecifier();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueSource2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueForm2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueFunction2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSetSetProducedBindingValueSpecifierCompartment_7066SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Set modelElement = (Set) containerView.getElement();
		List result = new LinkedList();
		{
			ValueSpecifierElement childElement = modelElement
					.getProducedBindingValueSpecifier();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueSource3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueForm3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueFunction3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhileRepeatWhileWhileConditionCompartment_7067SemanticChildren(
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
			Expr childElement = modelElement.getWhileCondition();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhileRepeatWhileWhileProcessCompartment_7145SemanticChildren(
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
			ControlConstruct childElement = modelElement.getWhileProcess();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerformPerformTheProcessCompartment_7068SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Perform modelElement = (Perform) containerView.getElement();
		List result = new LinkedList();
		{
			AbstractProcess childElement = modelElement.getTheProcess();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RemoteProcessEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == TemplateProcessEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProduceProduceProducedBindingValueSpecifierCompartment_7069SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Produce modelElement = (Produce) containerView.getElement();
		List result = new LinkedList();
		{
			ValueSpecifierElement childElement = modelElement
					.getProducedBindingValueSpecifier();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueSource2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueForm2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueFunction2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSetSetProducedBindingValueSpecifierCompartment_7070SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Set modelElement = (Set) containerView.getElement();
		List result = new LinkedList();
		{
			ValueSpecifierElement childElement = modelElement
					.getProducedBindingValueSpecifier();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueSource3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueForm3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueFunction3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilUntilConditionCompartment_7071SemanticChildren(
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
			Expr childElement = modelElement.getUntilCondition();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilUntilProcessCompartment_7148SemanticChildren(
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
			ControlConstruct childElement = modelElement.getUntilProcess();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhileRepeatWhileWhileConditionCompartment_7072SemanticChildren(
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
			Expr childElement = modelElement.getWhileCondition();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhileRepeatWhileWhileProcessCompartment_7149SemanticChildren(
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
			ControlConstruct childElement = modelElement.getWhileProcess();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerformPerformTheProcessCompartment_7073SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Perform modelElement = (Perform) containerView.getElement();
		List result = new LinkedList();
		{
			AbstractProcess childElement = modelElement.getTheProcess();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RemoteProcessEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == TemplateProcessEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProduceProduceProducedBindingValueSpecifierCompartment_7074SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Produce modelElement = (Produce) containerView.getElement();
		List result = new LinkedList();
		{
			ValueSpecifierElement childElement = modelElement
					.getProducedBindingValueSpecifier();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueSource2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueForm2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueFunction2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSetSetProducedBindingValueSpecifierCompartment_7075SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Set modelElement = (Set) containerView.getElement();
		List result = new LinkedList();
		{
			ValueSpecifierElement childElement = modelElement
					.getProducedBindingValueSpecifier();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueSource3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueForm3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueFunction3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBagControlConstructBagFirstCompartment_7076SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ControlConstructBag modelElement = (ControlConstructBag) containerView
				.getElement();
		List result = new LinkedList();
		{
			ControlConstruct childElement = modelElement.getFirst();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBagControlConstructBagRestCompartment_7077SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ControlConstructBag modelElement = (ControlConstructBag) containerView
				.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getRest();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrderAnyOrderComponentsCompartment_7078SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AnyOrder modelElement = (AnyOrder) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplitSplitComponentsCompartment_7079SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Split modelElement = (Split) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoinSplitJoinComponentsCompartment_7080SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SplitJoin modelElement = (SplitJoin) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseIfConditionCompartment_7081SemanticChildren(
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
			Expr childElement = modelElement.getIfCondition();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseThenCompartment_7082SemanticChildren(
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
			ControlConstruct childElement = modelElement.getThen();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseElseCompartment_7150SemanticChildren(
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
			ControlConstruct childElement = modelElement.getElse();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilUntilConditionCompartment_7083SemanticChildren(
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
			Expr childElement = modelElement.getUntilCondition();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilUntilProcessCompartment_7151SemanticChildren(
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
			ControlConstruct childElement = modelElement.getUntilProcess();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhileRepeatWhileWhileConditionCompartment_7084SemanticChildren(
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
			Expr childElement = modelElement.getWhileCondition();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhileRepeatWhileWhileProcessCompartment_7152SemanticChildren(
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
			ControlConstruct childElement = modelElement.getWhileProcess();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerformPerformTheProcessCompartment_7085SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Perform modelElement = (Perform) containerView.getElement();
		List result = new LinkedList();
		{
			AbstractProcess childElement = modelElement.getTheProcess();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RemoteProcessEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == TemplateProcessEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProduceProduceProducedBindingValueSpecifierCompartment_7086SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Produce modelElement = (Produce) containerView.getElement();
		List result = new LinkedList();
		{
			ValueSpecifierElement childElement = modelElement
					.getProducedBindingValueSpecifier();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueSource2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueForm2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueFunction2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSetSetProducedBindingValueSpecifierCompartment_7087SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Set modelElement = (Set) containerView.getElement();
		List result = new LinkedList();
		{
			ValueSpecifierElement childElement = modelElement
					.getProducedBindingValueSpecifier();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueSource3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueForm3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueFunction3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructListControlConstructListFirstCompartment_7088SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ControlConstructList modelElement = (ControlConstructList) containerView
				.getElement();
		List result = new LinkedList();
		{
			ControlConstruct childElement = modelElement.getFirst();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructListControlConstructListRestCompartment_7089SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ControlConstructList modelElement = (ControlConstructList) containerView
				.getElement();
		List result = new LinkedList();
		{
			ControlConstructList childElement = modelElement.getRest();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructList2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getChoiceChoiceComponentsCompartment_7090SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Choice modelElement = (Choice) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBagEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrderAnyOrderComponentsCompartment_7091SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AnyOrder modelElement = (AnyOrder) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplitSplitComponentsCompartment_7092SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Split modelElement = (Split) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoinSplitJoinComponentsCompartment_7093SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SplitJoin modelElement = (SplitJoin) containerView.getElement();
		List result = new LinkedList();
		{
			ControlConstructBag childElement = modelElement.getComponents();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlConstructBag4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseIfConditionCompartment_7094SemanticChildren(
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
			Expr childElement = modelElement.getIfCondition();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseThenCompartment_7095SemanticChildren(
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
			ControlConstruct childElement = modelElement.getThen();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElseIfThenElseElseCompartment_7153SemanticChildren(
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
			ControlConstruct childElement = modelElement.getElse();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice7EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilUntilConditionCompartment_7096SemanticChildren(
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
			Expr childElement = modelElement.getUntilCondition();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntilRepeatUntilUntilProcessCompartment_7154SemanticChildren(
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
			ControlConstruct childElement = modelElement.getUntilProcess();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhileRepeatWhileWhileConditionCompartment_7097SemanticChildren(
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
			Expr childElement = modelElement.getWhileCondition();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhileRepeatWhileWhileProcessCompartment_7155SemanticChildren(
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
			ControlConstruct childElement = modelElement.getWhileProcess();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Sequence6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Choice6EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrder5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Split5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoin5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElse5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntil5EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhile4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Perform4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Produce4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Set4EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerformPerformTheProcessCompartment_7098SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Perform modelElement = (Perform) containerView.getElement();
		List result = new LinkedList();
		{
			AbstractProcess childElement = modelElement.getTheProcess();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RemoteProcessEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == TemplateProcessEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProduceProduceProducedBindingValueSpecifierCompartment_7099SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Produce modelElement = (Produce) containerView.getElement();
		List result = new LinkedList();
		{
			ValueSpecifierElement childElement = modelElement
					.getProducedBindingValueSpecifier();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueSource2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueForm2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueFunction2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSetSetProducedBindingValueSpecifierCompartment_7100SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Set modelElement = (Set) containerView.getElement();
		List result = new LinkedList();
		{
			ValueSpecifierElement childElement = modelElement
					.getProducedBindingValueSpecifier();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueSource3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueForm3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ValueFunction3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResultResultInConditionCompartment_7102SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Result modelElement = (Result) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getInCondition().iterator(); it
				.hasNext();) {
			Expr childElement = (Expr) it.next();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Expr2EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResultResultHasResultVarCompartment_7103SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Result modelElement = (Result) containerView.getElement();
		List result = new LinkedList();
		{
			ResultVar childElement = modelElement.getHasResultVar();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ResultVarEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResultResultHasEffectCompartment_7104SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Result modelElement = (Result) containerView.getElement();
		List result = new LinkedList();
		{
			Expr childElement = modelElement.getHasEffect();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Condition3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Expr3EditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResultResultBindingSourceCompartment_7105SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Result modelElement = (Result) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getBindingSource().iterator(); it
				.hasNext();) {
			ValueSpecifierElement childElement = (ValueSpecifierElement) it
					.next();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValueSourceEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueFormEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueFunctionEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOuterProcess_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OuterProcess modelElement = (OuterProcess) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getHasInput().iterator(); it.hasNext();) {
			Input childElement = (Input) it.next();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getHasOutput().iterator(); it.hasNext();) {
			Output childElement = (Output) it.next();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutputEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getOuterLocals().iterator(); it
				.hasNext();) {
			Loc childElement = (Loc) it.next();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LocEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			ControlConstruct childElement = modelElement.getConstruct();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SequenceEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ChoiceEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == AnyOrderEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SplitJoinEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == IfThenElseEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatUntilEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == RepeatWhileEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == PerformEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == ProduceEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
			if (visualID == SetEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getOuterLinks().iterator(); it
				.hasNext();) {
			Link childElement = (Link) it.next();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LinkEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getHasPrecondition().iterator(); it
				.hasNext();) {
			Expr childElement = (Expr) it.next();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConditionEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExprEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getHasResult().iterator(); it.hasNext();) {
			Result childElement = (Result) it.next();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ResultEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getOntologies().iterator(); it
				.hasNext();) {
			Ontology childElement = (Ontology) it.next();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OntologyEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			TemplateConstraint childElement = modelElement
					.getTemplateConstraints();
			int visualID = ControlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TemplateConstraintEditPart.VISUAL_ID) {
				result.add(new ControlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (ControlVisualIDRegistry.getVisualID(view)) {
		case OuterProcessEditPart.VISUAL_ID:
			return getOuterProcess_1000ContainedLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_2027ContainedLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_2028ContainedLinks(view);
		case LocEditPart.VISUAL_ID:
			return getLoc_2003ContainedLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_2004ContainedLinks(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_2005ContainedLinks(view);
		case AnyOrderEditPart.VISUAL_ID:
			return getAnyOrder_2006ContainedLinks(view);
		case SplitEditPart.VISUAL_ID:
			return getSplit_2007ContainedLinks(view);
		case SplitJoinEditPart.VISUAL_ID:
			return getSplitJoin_2008ContainedLinks(view);
		case IfThenElseEditPart.VISUAL_ID:
			return getIfThenElse_2009ContainedLinks(view);
		case RepeatUntilEditPart.VISUAL_ID:
			return getRepeatUntil_2010ContainedLinks(view);
		case RepeatWhileEditPart.VISUAL_ID:
			return getRepeatWhile_2011ContainedLinks(view);
		case PerformEditPart.VISUAL_ID:
			return getPerform_2012ContainedLinks(view);
		case ProduceEditPart.VISUAL_ID:
			return getProduce_2013ContainedLinks(view);
		case SetEditPart.VISUAL_ID:
			return getSet_2014ContainedLinks(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_2015ContainedLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_2017ContainedLinks(view);
		case ResultEditPart.VISUAL_ID:
			return getResult_2018ContainedLinks(view);
		case OntologyEditPart.VISUAL_ID:
			return getOntology_2029ContainedLinks(view);
		case TemplateConstraintEditPart.VISUAL_ID:
			return getTemplateConstraint_2030ContainedLinks(view);
		case ExprEditPart.VISUAL_ID:
			return getExpr_2019ContainedLinks(view);
		case ControlConstructListEditPart.VISUAL_ID:
			return getControlConstructList_3001ContainedLinks(view);
		case Sequence2EditPart.VISUAL_ID:
			return getSequence_3002ContainedLinks(view);
		case Choice2EditPart.VISUAL_ID:
			return getChoice_3003ContainedLinks(view);
		case ControlConstructBagEditPart.VISUAL_ID:
			return getControlConstructBag_3004ContainedLinks(view);
		case Sequence3EditPart.VISUAL_ID:
			return getSequence_3005ContainedLinks(view);
		case Choice3EditPart.VISUAL_ID:
			return getChoice_3006ContainedLinks(view);
		case AnyOrder2EditPart.VISUAL_ID:
			return getAnyOrder_3007ContainedLinks(view);
		case ControlConstructBag2EditPart.VISUAL_ID:
			return getControlConstructBag_3008ContainedLinks(view);
		case Split2EditPart.VISUAL_ID:
			return getSplit_3009ContainedLinks(view);
		case ControlConstructBag3EditPart.VISUAL_ID:
			return getControlConstructBag_3010ContainedLinks(view);
		case SplitJoin2EditPart.VISUAL_ID:
			return getSplitJoin_3011ContainedLinks(view);
		case ControlConstructBag4EditPart.VISUAL_ID:
			return getControlConstructBag_3012ContainedLinks(view);
		case IfThenElse2EditPart.VISUAL_ID:
			return getIfThenElse_3013ContainedLinks(view);
		case Sequence4EditPart.VISUAL_ID:
			return getSequence_3014ContainedLinks(view);
		case Choice4EditPart.VISUAL_ID:
			return getChoice_3015ContainedLinks(view);
		case AnyOrder3EditPart.VISUAL_ID:
			return getAnyOrder_3016ContainedLinks(view);
		case Split3EditPart.VISUAL_ID:
			return getSplit_3017ContainedLinks(view);
		case SplitJoin3EditPart.VISUAL_ID:
			return getSplitJoin_3018ContainedLinks(view);
		case IfThenElse3EditPart.VISUAL_ID:
			return getIfThenElse_3019ContainedLinks(view);
		case RepeatUntil2EditPart.VISUAL_ID:
			return getRepeatUntil_3020ContainedLinks(view);
		case Sequence5EditPart.VISUAL_ID:
			return getSequence_3021ContainedLinks(view);
		case Choice5EditPart.VISUAL_ID:
			return getChoice_3022ContainedLinks(view);
		case AnyOrder4EditPart.VISUAL_ID:
			return getAnyOrder_3023ContainedLinks(view);
		case Split4EditPart.VISUAL_ID:
			return getSplit_3024ContainedLinks(view);
		case SplitJoin4EditPart.VISUAL_ID:
			return getSplitJoin_3025ContainedLinks(view);
		case IfThenElse4EditPart.VISUAL_ID:
			return getIfThenElse_3026ContainedLinks(view);
		case RepeatWhile2EditPart.VISUAL_ID:
			return getRepeatWhile_3027ContainedLinks(view);
		case Sequence6EditPart.VISUAL_ID:
			return getSequence_3028ContainedLinks(view);
		case Choice6EditPart.VISUAL_ID:
			return getChoice_3029ContainedLinks(view);
		case AnyOrder5EditPart.VISUAL_ID:
			return getAnyOrder_3030ContainedLinks(view);
		case Split5EditPart.VISUAL_ID:
			return getSplit_3031ContainedLinks(view);
		case SplitJoin5EditPart.VISUAL_ID:
			return getSplitJoin_3032ContainedLinks(view);
		case IfThenElse5EditPart.VISUAL_ID:
			return getIfThenElse_3033ContainedLinks(view);
		case Perform2EditPart.VISUAL_ID:
			return getPerform_3034ContainedLinks(view);
		case RemoteProcessEditPart.VISUAL_ID:
			return getRemoteProcess_3104ContainedLinks(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3105ContainedLinks(view);
		case Output2EditPart.VISUAL_ID:
			return getOutput_3106ContainedLinks(view);
		case Result2EditPart.VISUAL_ID:
			return getResult_3107ContainedLinks(view);
		case ValueSourceEditPart.VISUAL_ID:
			return getValueSource_3094ContainedLinks(view);
		case ValueFormEditPart.VISUAL_ID:
			return getValueForm_3095ContainedLinks(view);
		case ValueFunctionEditPart.VISUAL_ID:
			return getValueFunction_3096ContainedLinks(view);
		case ResultVarEditPart.VISUAL_ID:
			return getResultVar_3097ContainedLinks(view);
		case Condition2EditPart.VISUAL_ID:
			return getCondition_3098ContainedLinks(view);
		case Condition3EditPart.VISUAL_ID:
			return getCondition_3099ContainedLinks(view);
		case Expr2EditPart.VISUAL_ID:
			return getExpr_3100ContainedLinks(view);
		case Expr3EditPart.VISUAL_ID:
			return getExpr_3101ContainedLinks(view);
		case Condition4EditPart.VISUAL_ID:
			return getCondition_3108ContainedLinks(view);
		case Expr4EditPart.VISUAL_ID:
			return getExpr_3109ContainedLinks(view);
		case TemplateProcessEditPart.VISUAL_ID:
			return getTemplateProcess_3110ContainedLinks(view);
		case Produce2EditPart.VISUAL_ID:
			return getProduce_3043ContainedLinks(view);
		case ValueSource2EditPart.VISUAL_ID:
			return getValueSource_3044ContainedLinks(view);
		case ValueForm2EditPart.VISUAL_ID:
			return getValueForm_3045ContainedLinks(view);
		case ValueFunction2EditPart.VISUAL_ID:
			return getValueFunction_3046ContainedLinks(view);
		case Set2EditPart.VISUAL_ID:
			return getSet_3047ContainedLinks(view);
		case ValueSource3EditPart.VISUAL_ID:
			return getValueSource_3048ContainedLinks(view);
		case ValueForm3EditPart.VISUAL_ID:
			return getValueForm_3049ContainedLinks(view);
		case ValueFunction3EditPart.VISUAL_ID:
			return getValueFunction_3050ContainedLinks(view);
		case Sequence7EditPart.VISUAL_ID:
			return getSequence_3051ContainedLinks(view);
		case Choice7EditPart.VISUAL_ID:
			return getChoice_3052ContainedLinks(view);
		case AnyOrder6EditPart.VISUAL_ID:
			return getAnyOrder_3053ContainedLinks(view);
		case Split6EditPart.VISUAL_ID:
			return getSplit_3054ContainedLinks(view);
		case SplitJoin6EditPart.VISUAL_ID:
			return getSplitJoin_3055ContainedLinks(view);
		case IfThenElse6EditPart.VISUAL_ID:
			return getIfThenElse_3056ContainedLinks(view);
		case RepeatUntil3EditPart.VISUAL_ID:
			return getRepeatUntil_3057ContainedLinks(view);
		case RepeatUntil4EditPart.VISUAL_ID:
			return getRepeatUntil_3058ContainedLinks(view);
		case RepeatWhile3EditPart.VISUAL_ID:
			return getRepeatWhile_3059ContainedLinks(view);
		case RepeatUntil5EditPart.VISUAL_ID:
			return getRepeatUntil_3060ContainedLinks(view);
		case Perform3EditPart.VISUAL_ID:
			return getPerform_3061ContainedLinks(view);
		case Produce3EditPart.VISUAL_ID:
			return getProduce_3062ContainedLinks(view);
		case Set3EditPart.VISUAL_ID:
			return getSet_3063ContainedLinks(view);
		case Condition5EditPart.VISUAL_ID:
			return getCondition_3111ContainedLinks(view);
		case Expr5EditPart.VISUAL_ID:
			return getExpr_3112ContainedLinks(view);
		case RepeatWhile4EditPart.VISUAL_ID:
			return getRepeatWhile_3065ContainedLinks(view);
		case Perform4EditPart.VISUAL_ID:
			return getPerform_3066ContainedLinks(view);
		case Produce4EditPart.VISUAL_ID:
			return getProduce_3067ContainedLinks(view);
		case Set4EditPart.VISUAL_ID:
			return getSet_3068ContainedLinks(view);
		case Condition6EditPart.VISUAL_ID:
			return getCondition_3113ContainedLinks(view);
		case Expr6EditPart.VISUAL_ID:
			return getExpr_3114ContainedLinks(view);
		case RepeatWhile5EditPart.VISUAL_ID:
			return getRepeatWhile_3070ContainedLinks(view);
		case Perform5EditPart.VISUAL_ID:
			return getPerform_3071ContainedLinks(view);
		case Produce5EditPart.VISUAL_ID:
			return getProduce_3072ContainedLinks(view);
		case Set5EditPart.VISUAL_ID:
			return getSet_3073ContainedLinks(view);
		case Condition7EditPart.VISUAL_ID:
			return getCondition_3115ContainedLinks(view);
		case Expr7EditPart.VISUAL_ID:
			return getExpr_3116ContainedLinks(view);
		case RepeatUntil6EditPart.VISUAL_ID:
			return getRepeatUntil_3076ContainedLinks(view);
		case RepeatWhile6EditPart.VISUAL_ID:
			return getRepeatWhile_3077ContainedLinks(view);
		case Perform6EditPart.VISUAL_ID:
			return getPerform_3078ContainedLinks(view);
		case Produce6EditPart.VISUAL_ID:
			return getProduce_3079ContainedLinks(view);
		case Set6EditPart.VISUAL_ID:
			return getSet_3080ContainedLinks(view);
		case ControlConstructBag5EditPart.VISUAL_ID:
			return getControlConstructBag_3082ContainedLinks(view);
		case AnyOrder7EditPart.VISUAL_ID:
			return getAnyOrder_3083ContainedLinks(view);
		case Split7EditPart.VISUAL_ID:
			return getSplit_3084ContainedLinks(view);
		case SplitJoin7EditPart.VISUAL_ID:
			return getSplitJoin_3085ContainedLinks(view);
		case IfThenElse7EditPart.VISUAL_ID:
			return getIfThenElse_3086ContainedLinks(view);
		case RepeatUntil7EditPart.VISUAL_ID:
			return getRepeatUntil_3087ContainedLinks(view);
		case RepeatWhile7EditPart.VISUAL_ID:
			return getRepeatWhile_3088ContainedLinks(view);
		case Perform7EditPart.VISUAL_ID:
			return getPerform_3089ContainedLinks(view);
		case Produce7EditPart.VISUAL_ID:
			return getProduce_3090ContainedLinks(view);
		case Set7EditPart.VISUAL_ID:
			return getSet_3091ContainedLinks(view);
		case ControlConstructList2EditPart.VISUAL_ID:
			return getControlConstructList_3093ContainedLinks(view);
		case LocBindingEditPart.VISUAL_ID:
			return getLocBinding_4001ContainedLinks(view);
		case InputBindingEditPart.VISUAL_ID:
			return getInputBinding_4002ContainedLinks(view);
		case OutputBindingEditPart.VISUAL_ID:
			return getOutputBinding_4003ContainedLinks(view);
		case LinkBindingEditPart.VISUAL_ID:
			return getLinkBinding_4004ContainedLinks(view);
		case OutputBindingSourceEditPart.VISUAL_ID:
			return getOutputBindingSource_4005ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (ControlVisualIDRegistry.getVisualID(view)) {
		case InputEditPart.VISUAL_ID:
			return getInput_2027IncomingLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_2028IncomingLinks(view);
		case LocEditPart.VISUAL_ID:
			return getLoc_2003IncomingLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_2004IncomingLinks(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_2005IncomingLinks(view);
		case AnyOrderEditPart.VISUAL_ID:
			return getAnyOrder_2006IncomingLinks(view);
		case SplitEditPart.VISUAL_ID:
			return getSplit_2007IncomingLinks(view);
		case SplitJoinEditPart.VISUAL_ID:
			return getSplitJoin_2008IncomingLinks(view);
		case IfThenElseEditPart.VISUAL_ID:
			return getIfThenElse_2009IncomingLinks(view);
		case RepeatUntilEditPart.VISUAL_ID:
			return getRepeatUntil_2010IncomingLinks(view);
		case RepeatWhileEditPart.VISUAL_ID:
			return getRepeatWhile_2011IncomingLinks(view);
		case PerformEditPart.VISUAL_ID:
			return getPerform_2012IncomingLinks(view);
		case ProduceEditPart.VISUAL_ID:
			return getProduce_2013IncomingLinks(view);
		case SetEditPart.VISUAL_ID:
			return getSet_2014IncomingLinks(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_2015IncomingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_2017IncomingLinks(view);
		case ResultEditPart.VISUAL_ID:
			return getResult_2018IncomingLinks(view);
		case OntologyEditPart.VISUAL_ID:
			return getOntology_2029IncomingLinks(view);
		case TemplateConstraintEditPart.VISUAL_ID:
			return getTemplateConstraint_2030IncomingLinks(view);
		case ExprEditPart.VISUAL_ID:
			return getExpr_2019IncomingLinks(view);
		case ControlConstructListEditPart.VISUAL_ID:
			return getControlConstructList_3001IncomingLinks(view);
		case Sequence2EditPart.VISUAL_ID:
			return getSequence_3002IncomingLinks(view);
		case Choice2EditPart.VISUAL_ID:
			return getChoice_3003IncomingLinks(view);
		case ControlConstructBagEditPart.VISUAL_ID:
			return getControlConstructBag_3004IncomingLinks(view);
		case Sequence3EditPart.VISUAL_ID:
			return getSequence_3005IncomingLinks(view);
		case Choice3EditPart.VISUAL_ID:
			return getChoice_3006IncomingLinks(view);
		case AnyOrder2EditPart.VISUAL_ID:
			return getAnyOrder_3007IncomingLinks(view);
		case ControlConstructBag2EditPart.VISUAL_ID:
			return getControlConstructBag_3008IncomingLinks(view);
		case Split2EditPart.VISUAL_ID:
			return getSplit_3009IncomingLinks(view);
		case ControlConstructBag3EditPart.VISUAL_ID:
			return getControlConstructBag_3010IncomingLinks(view);
		case SplitJoin2EditPart.VISUAL_ID:
			return getSplitJoin_3011IncomingLinks(view);
		case ControlConstructBag4EditPart.VISUAL_ID:
			return getControlConstructBag_3012IncomingLinks(view);
		case IfThenElse2EditPart.VISUAL_ID:
			return getIfThenElse_3013IncomingLinks(view);
		case Sequence4EditPart.VISUAL_ID:
			return getSequence_3014IncomingLinks(view);
		case Choice4EditPart.VISUAL_ID:
			return getChoice_3015IncomingLinks(view);
		case AnyOrder3EditPart.VISUAL_ID:
			return getAnyOrder_3016IncomingLinks(view);
		case Split3EditPart.VISUAL_ID:
			return getSplit_3017IncomingLinks(view);
		case SplitJoin3EditPart.VISUAL_ID:
			return getSplitJoin_3018IncomingLinks(view);
		case IfThenElse3EditPart.VISUAL_ID:
			return getIfThenElse_3019IncomingLinks(view);
		case RepeatUntil2EditPart.VISUAL_ID:
			return getRepeatUntil_3020IncomingLinks(view);
		case Sequence5EditPart.VISUAL_ID:
			return getSequence_3021IncomingLinks(view);
		case Choice5EditPart.VISUAL_ID:
			return getChoice_3022IncomingLinks(view);
		case AnyOrder4EditPart.VISUAL_ID:
			return getAnyOrder_3023IncomingLinks(view);
		case Split4EditPart.VISUAL_ID:
			return getSplit_3024IncomingLinks(view);
		case SplitJoin4EditPart.VISUAL_ID:
			return getSplitJoin_3025IncomingLinks(view);
		case IfThenElse4EditPart.VISUAL_ID:
			return getIfThenElse_3026IncomingLinks(view);
		case RepeatWhile2EditPart.VISUAL_ID:
			return getRepeatWhile_3027IncomingLinks(view);
		case Sequence6EditPart.VISUAL_ID:
			return getSequence_3028IncomingLinks(view);
		case Choice6EditPart.VISUAL_ID:
			return getChoice_3029IncomingLinks(view);
		case AnyOrder5EditPart.VISUAL_ID:
			return getAnyOrder_3030IncomingLinks(view);
		case Split5EditPart.VISUAL_ID:
			return getSplit_3031IncomingLinks(view);
		case SplitJoin5EditPart.VISUAL_ID:
			return getSplitJoin_3032IncomingLinks(view);
		case IfThenElse5EditPart.VISUAL_ID:
			return getIfThenElse_3033IncomingLinks(view);
		case Perform2EditPart.VISUAL_ID:
			return getPerform_3034IncomingLinks(view);
		case RemoteProcessEditPart.VISUAL_ID:
			return getRemoteProcess_3104IncomingLinks(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3105IncomingLinks(view);
		case Output2EditPart.VISUAL_ID:
			return getOutput_3106IncomingLinks(view);
		case Result2EditPart.VISUAL_ID:
			return getResult_3107IncomingLinks(view);
		case ValueSourceEditPart.VISUAL_ID:
			return getValueSource_3094IncomingLinks(view);
		case ValueFormEditPart.VISUAL_ID:
			return getValueForm_3095IncomingLinks(view);
		case ValueFunctionEditPart.VISUAL_ID:
			return getValueFunction_3096IncomingLinks(view);
		case ResultVarEditPart.VISUAL_ID:
			return getResultVar_3097IncomingLinks(view);
		case Condition2EditPart.VISUAL_ID:
			return getCondition_3098IncomingLinks(view);
		case Condition3EditPart.VISUAL_ID:
			return getCondition_3099IncomingLinks(view);
		case Expr2EditPart.VISUAL_ID:
			return getExpr_3100IncomingLinks(view);
		case Expr3EditPart.VISUAL_ID:
			return getExpr_3101IncomingLinks(view);
		case Condition4EditPart.VISUAL_ID:
			return getCondition_3108IncomingLinks(view);
		case Expr4EditPart.VISUAL_ID:
			return getExpr_3109IncomingLinks(view);
		case TemplateProcessEditPart.VISUAL_ID:
			return getTemplateProcess_3110IncomingLinks(view);
		case Produce2EditPart.VISUAL_ID:
			return getProduce_3043IncomingLinks(view);
		case ValueSource2EditPart.VISUAL_ID:
			return getValueSource_3044IncomingLinks(view);
		case ValueForm2EditPart.VISUAL_ID:
			return getValueForm_3045IncomingLinks(view);
		case ValueFunction2EditPart.VISUAL_ID:
			return getValueFunction_3046IncomingLinks(view);
		case Set2EditPart.VISUAL_ID:
			return getSet_3047IncomingLinks(view);
		case ValueSource3EditPart.VISUAL_ID:
			return getValueSource_3048IncomingLinks(view);
		case ValueForm3EditPart.VISUAL_ID:
			return getValueForm_3049IncomingLinks(view);
		case ValueFunction3EditPart.VISUAL_ID:
			return getValueFunction_3050IncomingLinks(view);
		case Sequence7EditPart.VISUAL_ID:
			return getSequence_3051IncomingLinks(view);
		case Choice7EditPart.VISUAL_ID:
			return getChoice_3052IncomingLinks(view);
		case AnyOrder6EditPart.VISUAL_ID:
			return getAnyOrder_3053IncomingLinks(view);
		case Split6EditPart.VISUAL_ID:
			return getSplit_3054IncomingLinks(view);
		case SplitJoin6EditPart.VISUAL_ID:
			return getSplitJoin_3055IncomingLinks(view);
		case IfThenElse6EditPart.VISUAL_ID:
			return getIfThenElse_3056IncomingLinks(view);
		case RepeatUntil3EditPart.VISUAL_ID:
			return getRepeatUntil_3057IncomingLinks(view);
		case RepeatUntil4EditPart.VISUAL_ID:
			return getRepeatUntil_3058IncomingLinks(view);
		case RepeatWhile3EditPart.VISUAL_ID:
			return getRepeatWhile_3059IncomingLinks(view);
		case RepeatUntil5EditPart.VISUAL_ID:
			return getRepeatUntil_3060IncomingLinks(view);
		case Perform3EditPart.VISUAL_ID:
			return getPerform_3061IncomingLinks(view);
		case Produce3EditPart.VISUAL_ID:
			return getProduce_3062IncomingLinks(view);
		case Set3EditPart.VISUAL_ID:
			return getSet_3063IncomingLinks(view);
		case Condition5EditPart.VISUAL_ID:
			return getCondition_3111IncomingLinks(view);
		case Expr5EditPart.VISUAL_ID:
			return getExpr_3112IncomingLinks(view);
		case RepeatWhile4EditPart.VISUAL_ID:
			return getRepeatWhile_3065IncomingLinks(view);
		case Perform4EditPart.VISUAL_ID:
			return getPerform_3066IncomingLinks(view);
		case Produce4EditPart.VISUAL_ID:
			return getProduce_3067IncomingLinks(view);
		case Set4EditPart.VISUAL_ID:
			return getSet_3068IncomingLinks(view);
		case Condition6EditPart.VISUAL_ID:
			return getCondition_3113IncomingLinks(view);
		case Expr6EditPart.VISUAL_ID:
			return getExpr_3114IncomingLinks(view);
		case RepeatWhile5EditPart.VISUAL_ID:
			return getRepeatWhile_3070IncomingLinks(view);
		case Perform5EditPart.VISUAL_ID:
			return getPerform_3071IncomingLinks(view);
		case Produce5EditPart.VISUAL_ID:
			return getProduce_3072IncomingLinks(view);
		case Set5EditPart.VISUAL_ID:
			return getSet_3073IncomingLinks(view);
		case Condition7EditPart.VISUAL_ID:
			return getCondition_3115IncomingLinks(view);
		case Expr7EditPart.VISUAL_ID:
			return getExpr_3116IncomingLinks(view);
		case RepeatUntil6EditPart.VISUAL_ID:
			return getRepeatUntil_3076IncomingLinks(view);
		case RepeatWhile6EditPart.VISUAL_ID:
			return getRepeatWhile_3077IncomingLinks(view);
		case Perform6EditPart.VISUAL_ID:
			return getPerform_3078IncomingLinks(view);
		case Produce6EditPart.VISUAL_ID:
			return getProduce_3079IncomingLinks(view);
		case Set6EditPart.VISUAL_ID:
			return getSet_3080IncomingLinks(view);
		case ControlConstructBag5EditPart.VISUAL_ID:
			return getControlConstructBag_3082IncomingLinks(view);
		case AnyOrder7EditPart.VISUAL_ID:
			return getAnyOrder_3083IncomingLinks(view);
		case Split7EditPart.VISUAL_ID:
			return getSplit_3084IncomingLinks(view);
		case SplitJoin7EditPart.VISUAL_ID:
			return getSplitJoin_3085IncomingLinks(view);
		case IfThenElse7EditPart.VISUAL_ID:
			return getIfThenElse_3086IncomingLinks(view);
		case RepeatUntil7EditPart.VISUAL_ID:
			return getRepeatUntil_3087IncomingLinks(view);
		case RepeatWhile7EditPart.VISUAL_ID:
			return getRepeatWhile_3088IncomingLinks(view);
		case Perform7EditPart.VISUAL_ID:
			return getPerform_3089IncomingLinks(view);
		case Produce7EditPart.VISUAL_ID:
			return getProduce_3090IncomingLinks(view);
		case Set7EditPart.VISUAL_ID:
			return getSet_3091IncomingLinks(view);
		case ControlConstructList2EditPart.VISUAL_ID:
			return getControlConstructList_3093IncomingLinks(view);
		case LocBindingEditPart.VISUAL_ID:
			return getLocBinding_4001IncomingLinks(view);
		case InputBindingEditPart.VISUAL_ID:
			return getInputBinding_4002IncomingLinks(view);
		case OutputBindingEditPart.VISUAL_ID:
			return getOutputBinding_4003IncomingLinks(view);
		case LinkBindingEditPart.VISUAL_ID:
			return getLinkBinding_4004IncomingLinks(view);
		case OutputBindingSourceEditPart.VISUAL_ID:
			return getOutputBindingSource_4005IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (ControlVisualIDRegistry.getVisualID(view)) {
		case InputEditPart.VISUAL_ID:
			return getInput_2027OutgoingLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_2028OutgoingLinks(view);
		case LocEditPart.VISUAL_ID:
			return getLoc_2003OutgoingLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_2004OutgoingLinks(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_2005OutgoingLinks(view);
		case AnyOrderEditPart.VISUAL_ID:
			return getAnyOrder_2006OutgoingLinks(view);
		case SplitEditPart.VISUAL_ID:
			return getSplit_2007OutgoingLinks(view);
		case SplitJoinEditPart.VISUAL_ID:
			return getSplitJoin_2008OutgoingLinks(view);
		case IfThenElseEditPart.VISUAL_ID:
			return getIfThenElse_2009OutgoingLinks(view);
		case RepeatUntilEditPart.VISUAL_ID:
			return getRepeatUntil_2010OutgoingLinks(view);
		case RepeatWhileEditPart.VISUAL_ID:
			return getRepeatWhile_2011OutgoingLinks(view);
		case PerformEditPart.VISUAL_ID:
			return getPerform_2012OutgoingLinks(view);
		case ProduceEditPart.VISUAL_ID:
			return getProduce_2013OutgoingLinks(view);
		case SetEditPart.VISUAL_ID:
			return getSet_2014OutgoingLinks(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_2015OutgoingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_2017OutgoingLinks(view);
		case ResultEditPart.VISUAL_ID:
			return getResult_2018OutgoingLinks(view);
		case OntologyEditPart.VISUAL_ID:
			return getOntology_2029OutgoingLinks(view);
		case TemplateConstraintEditPart.VISUAL_ID:
			return getTemplateConstraint_2030OutgoingLinks(view);
		case ExprEditPart.VISUAL_ID:
			return getExpr_2019OutgoingLinks(view);
		case ControlConstructListEditPart.VISUAL_ID:
			return getControlConstructList_3001OutgoingLinks(view);
		case Sequence2EditPart.VISUAL_ID:
			return getSequence_3002OutgoingLinks(view);
		case Choice2EditPart.VISUAL_ID:
			return getChoice_3003OutgoingLinks(view);
		case ControlConstructBagEditPart.VISUAL_ID:
			return getControlConstructBag_3004OutgoingLinks(view);
		case Sequence3EditPart.VISUAL_ID:
			return getSequence_3005OutgoingLinks(view);
		case Choice3EditPart.VISUAL_ID:
			return getChoice_3006OutgoingLinks(view);
		case AnyOrder2EditPart.VISUAL_ID:
			return getAnyOrder_3007OutgoingLinks(view);
		case ControlConstructBag2EditPart.VISUAL_ID:
			return getControlConstructBag_3008OutgoingLinks(view);
		case Split2EditPart.VISUAL_ID:
			return getSplit_3009OutgoingLinks(view);
		case ControlConstructBag3EditPart.VISUAL_ID:
			return getControlConstructBag_3010OutgoingLinks(view);
		case SplitJoin2EditPart.VISUAL_ID:
			return getSplitJoin_3011OutgoingLinks(view);
		case ControlConstructBag4EditPart.VISUAL_ID:
			return getControlConstructBag_3012OutgoingLinks(view);
		case IfThenElse2EditPart.VISUAL_ID:
			return getIfThenElse_3013OutgoingLinks(view);
		case Sequence4EditPart.VISUAL_ID:
			return getSequence_3014OutgoingLinks(view);
		case Choice4EditPart.VISUAL_ID:
			return getChoice_3015OutgoingLinks(view);
		case AnyOrder3EditPart.VISUAL_ID:
			return getAnyOrder_3016OutgoingLinks(view);
		case Split3EditPart.VISUAL_ID:
			return getSplit_3017OutgoingLinks(view);
		case SplitJoin3EditPart.VISUAL_ID:
			return getSplitJoin_3018OutgoingLinks(view);
		case IfThenElse3EditPart.VISUAL_ID:
			return getIfThenElse_3019OutgoingLinks(view);
		case RepeatUntil2EditPart.VISUAL_ID:
			return getRepeatUntil_3020OutgoingLinks(view);
		case Sequence5EditPart.VISUAL_ID:
			return getSequence_3021OutgoingLinks(view);
		case Choice5EditPart.VISUAL_ID:
			return getChoice_3022OutgoingLinks(view);
		case AnyOrder4EditPart.VISUAL_ID:
			return getAnyOrder_3023OutgoingLinks(view);
		case Split4EditPart.VISUAL_ID:
			return getSplit_3024OutgoingLinks(view);
		case SplitJoin4EditPart.VISUAL_ID:
			return getSplitJoin_3025OutgoingLinks(view);
		case IfThenElse4EditPart.VISUAL_ID:
			return getIfThenElse_3026OutgoingLinks(view);
		case RepeatWhile2EditPart.VISUAL_ID:
			return getRepeatWhile_3027OutgoingLinks(view);
		case Sequence6EditPart.VISUAL_ID:
			return getSequence_3028OutgoingLinks(view);
		case Choice6EditPart.VISUAL_ID:
			return getChoice_3029OutgoingLinks(view);
		case AnyOrder5EditPart.VISUAL_ID:
			return getAnyOrder_3030OutgoingLinks(view);
		case Split5EditPart.VISUAL_ID:
			return getSplit_3031OutgoingLinks(view);
		case SplitJoin5EditPart.VISUAL_ID:
			return getSplitJoin_3032OutgoingLinks(view);
		case IfThenElse5EditPart.VISUAL_ID:
			return getIfThenElse_3033OutgoingLinks(view);
		case Perform2EditPart.VISUAL_ID:
			return getPerform_3034OutgoingLinks(view);
		case RemoteProcessEditPart.VISUAL_ID:
			return getRemoteProcess_3104OutgoingLinks(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3105OutgoingLinks(view);
		case Output2EditPart.VISUAL_ID:
			return getOutput_3106OutgoingLinks(view);
		case Result2EditPart.VISUAL_ID:
			return getResult_3107OutgoingLinks(view);
		case ValueSourceEditPart.VISUAL_ID:
			return getValueSource_3094OutgoingLinks(view);
		case ValueFormEditPart.VISUAL_ID:
			return getValueForm_3095OutgoingLinks(view);
		case ValueFunctionEditPart.VISUAL_ID:
			return getValueFunction_3096OutgoingLinks(view);
		case ResultVarEditPart.VISUAL_ID:
			return getResultVar_3097OutgoingLinks(view);
		case Condition2EditPart.VISUAL_ID:
			return getCondition_3098OutgoingLinks(view);
		case Condition3EditPart.VISUAL_ID:
			return getCondition_3099OutgoingLinks(view);
		case Expr2EditPart.VISUAL_ID:
			return getExpr_3100OutgoingLinks(view);
		case Expr3EditPart.VISUAL_ID:
			return getExpr_3101OutgoingLinks(view);
		case Condition4EditPart.VISUAL_ID:
			return getCondition_3108OutgoingLinks(view);
		case Expr4EditPart.VISUAL_ID:
			return getExpr_3109OutgoingLinks(view);
		case TemplateProcessEditPart.VISUAL_ID:
			return getTemplateProcess_3110OutgoingLinks(view);
		case Produce2EditPart.VISUAL_ID:
			return getProduce_3043OutgoingLinks(view);
		case ValueSource2EditPart.VISUAL_ID:
			return getValueSource_3044OutgoingLinks(view);
		case ValueForm2EditPart.VISUAL_ID:
			return getValueForm_3045OutgoingLinks(view);
		case ValueFunction2EditPart.VISUAL_ID:
			return getValueFunction_3046OutgoingLinks(view);
		case Set2EditPart.VISUAL_ID:
			return getSet_3047OutgoingLinks(view);
		case ValueSource3EditPart.VISUAL_ID:
			return getValueSource_3048OutgoingLinks(view);
		case ValueForm3EditPart.VISUAL_ID:
			return getValueForm_3049OutgoingLinks(view);
		case ValueFunction3EditPart.VISUAL_ID:
			return getValueFunction_3050OutgoingLinks(view);
		case Sequence7EditPart.VISUAL_ID:
			return getSequence_3051OutgoingLinks(view);
		case Choice7EditPart.VISUAL_ID:
			return getChoice_3052OutgoingLinks(view);
		case AnyOrder6EditPart.VISUAL_ID:
			return getAnyOrder_3053OutgoingLinks(view);
		case Split6EditPart.VISUAL_ID:
			return getSplit_3054OutgoingLinks(view);
		case SplitJoin6EditPart.VISUAL_ID:
			return getSplitJoin_3055OutgoingLinks(view);
		case IfThenElse6EditPart.VISUAL_ID:
			return getIfThenElse_3056OutgoingLinks(view);
		case RepeatUntil3EditPart.VISUAL_ID:
			return getRepeatUntil_3057OutgoingLinks(view);
		case RepeatUntil4EditPart.VISUAL_ID:
			return getRepeatUntil_3058OutgoingLinks(view);
		case RepeatWhile3EditPart.VISUAL_ID:
			return getRepeatWhile_3059OutgoingLinks(view);
		case RepeatUntil5EditPart.VISUAL_ID:
			return getRepeatUntil_3060OutgoingLinks(view);
		case Perform3EditPart.VISUAL_ID:
			return getPerform_3061OutgoingLinks(view);
		case Produce3EditPart.VISUAL_ID:
			return getProduce_3062OutgoingLinks(view);
		case Set3EditPart.VISUAL_ID:
			return getSet_3063OutgoingLinks(view);
		case Condition5EditPart.VISUAL_ID:
			return getCondition_3111OutgoingLinks(view);
		case Expr5EditPart.VISUAL_ID:
			return getExpr_3112OutgoingLinks(view);
		case RepeatWhile4EditPart.VISUAL_ID:
			return getRepeatWhile_3065OutgoingLinks(view);
		case Perform4EditPart.VISUAL_ID:
			return getPerform_3066OutgoingLinks(view);
		case Produce4EditPart.VISUAL_ID:
			return getProduce_3067OutgoingLinks(view);
		case Set4EditPart.VISUAL_ID:
			return getSet_3068OutgoingLinks(view);
		case Condition6EditPart.VISUAL_ID:
			return getCondition_3113OutgoingLinks(view);
		case Expr6EditPart.VISUAL_ID:
			return getExpr_3114OutgoingLinks(view);
		case RepeatWhile5EditPart.VISUAL_ID:
			return getRepeatWhile_3070OutgoingLinks(view);
		case Perform5EditPart.VISUAL_ID:
			return getPerform_3071OutgoingLinks(view);
		case Produce5EditPart.VISUAL_ID:
			return getProduce_3072OutgoingLinks(view);
		case Set5EditPart.VISUAL_ID:
			return getSet_3073OutgoingLinks(view);
		case Condition7EditPart.VISUAL_ID:
			return getCondition_3115OutgoingLinks(view);
		case Expr7EditPart.VISUAL_ID:
			return getExpr_3116OutgoingLinks(view);
		case RepeatUntil6EditPart.VISUAL_ID:
			return getRepeatUntil_3076OutgoingLinks(view);
		case RepeatWhile6EditPart.VISUAL_ID:
			return getRepeatWhile_3077OutgoingLinks(view);
		case Perform6EditPart.VISUAL_ID:
			return getPerform_3078OutgoingLinks(view);
		case Produce6EditPart.VISUAL_ID:
			return getProduce_3079OutgoingLinks(view);
		case Set6EditPart.VISUAL_ID:
			return getSet_3080OutgoingLinks(view);
		case ControlConstructBag5EditPart.VISUAL_ID:
			return getControlConstructBag_3082OutgoingLinks(view);
		case AnyOrder7EditPart.VISUAL_ID:
			return getAnyOrder_3083OutgoingLinks(view);
		case Split7EditPart.VISUAL_ID:
			return getSplit_3084OutgoingLinks(view);
		case SplitJoin7EditPart.VISUAL_ID:
			return getSplitJoin_3085OutgoingLinks(view);
		case IfThenElse7EditPart.VISUAL_ID:
			return getIfThenElse_3086OutgoingLinks(view);
		case RepeatUntil7EditPart.VISUAL_ID:
			return getRepeatUntil_3087OutgoingLinks(view);
		case RepeatWhile7EditPart.VISUAL_ID:
			return getRepeatWhile_3088OutgoingLinks(view);
		case Perform7EditPart.VISUAL_ID:
			return getPerform_3089OutgoingLinks(view);
		case Produce7EditPart.VISUAL_ID:
			return getProduce_3090OutgoingLinks(view);
		case Set7EditPart.VISUAL_ID:
			return getSet_3091OutgoingLinks(view);
		case ControlConstructList2EditPart.VISUAL_ID:
			return getControlConstructList_3093OutgoingLinks(view);
		case LocBindingEditPart.VISUAL_ID:
			return getLocBinding_4001OutgoingLinks(view);
		case InputBindingEditPart.VISUAL_ID:
			return getInputBinding_4002OutgoingLinks(view);
		case OutputBindingEditPart.VISUAL_ID:
			return getOutputBinding_4003OutgoingLinks(view);
		case LinkBindingEditPart.VISUAL_ID:
			return getLinkBinding_4004OutgoingLinks(view);
		case OutputBindingSourceEditPart.VISUAL_ID:
			return getOutputBindingSource_4005OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOuterProcess_1000ContainedLinks(View view) {
		OuterProcess modelElement = (OuterProcess) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_LocBinding_4001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_InputBinding_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_OutputBinding_4003(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_LinkBinding_4004(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_outputBindingSource_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInput_2027ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutput_2028ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLoc_2003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_2004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChoice_2005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_2006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplit_2007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_2008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_2009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_2010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_2011ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerform_2012ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProduce_2013ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSet_2014ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLink_2015ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_2017ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResult_2018ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOntology_2029ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateConstraint_2030ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpr_2019ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructList_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChoice_3003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_3004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChoice_3006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_3007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_3008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplit_3009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_3010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_3011ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_3012ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_3013ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3014ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChoice_3015ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_3016ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplit_3017ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_3018ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_3019ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3020ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3021ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChoice_3022ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_3023ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplit_3024ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_3025ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_3026ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_3027ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3028ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChoice_3029ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_3030ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplit_3031ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_3032ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_3033ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerform_3034ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRemoteProcess_3104ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInput_3105ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutput_3106ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResult_3107ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValueSource_3094ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValueForm_3095ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValueFunction_3096ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResultVar_3097ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3098ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3099ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpr_3100ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpr_3101ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3108ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpr_3109ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateProcess_3110ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProduce_3043ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValueSource_3044ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValueForm_3045ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValueFunction_3046ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSet_3047ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValueSource_3048ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValueForm_3049ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValueFunction_3050ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3051ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChoice_3052ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_3053ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplit_3054ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_3055ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_3056ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3057ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3058ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_3059ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3060ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerform_3061ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProduce_3062ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSet_3063ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3111ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpr_3112ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_3065ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerform_3066ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProduce_3067ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSet_3068ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3113ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpr_3114ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_3070ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerform_3071ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProduce_3072ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSet_3073ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3115ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpr_3116ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3076ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_3077ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerform_3078ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProduce_3079ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSet_3080ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_3082ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_3083ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplit_3084ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_3085ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_3086ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3087ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_3088ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerform_3089ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProduce_3090ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSet_3091ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructList_3093ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLocBinding_4001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInputBinding_4002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutputBinding_4003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLinkBinding_4004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutputBindingSource_4005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInput_2027IncomingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_InputBinding_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutput_2028IncomingLinks(View view) {
		Output modelElement = (Output) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_OutputBinding_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLoc_2003IncomingLinks(View view) {
		Loc modelElement = (Loc) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_LocBinding_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequence_2004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChoice_2005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_2006IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplit_2007IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_2008IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_2009IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_2010IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_2011IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerform_2012IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProduce_2013IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSet_2014IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLink_2015IncomingLinks(View view) {
		Link modelElement = (Link) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_LinkBinding_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCondition_2017IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResult_2018IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOntology_2029IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateConstraint_2030IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpr_2019IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructList_3001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChoice_3003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_3004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChoice_3006IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_3007IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_3008IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplit_3009IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_3010IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_3011IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_3012IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_3013IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3014IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChoice_3015IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_3016IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplit_3017IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_3018IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_3019IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3020IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3021IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChoice_3022IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_3023IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplit_3024IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_3025IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_3026IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_3027IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3028IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChoice_3029IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_3030IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplit_3031IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_3032IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_3033IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerform_3034IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRemoteProcess_3104IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInput_3105IncomingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_InputBinding_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutput_3106IncomingLinks(View view) {
		Output modelElement = (Output) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_OutputBinding_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResult_3107IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValueSource_3094IncomingLinks(View view) {
		ValueSource modelElement = (ValueSource) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_outputBindingSource_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValueForm_3095IncomingLinks(View view) {
		ValueForm modelElement = (ValueForm) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_outputBindingSource_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValueFunction_3096IncomingLinks(View view) {
		ValueFunction modelElement = (ValueFunction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_outputBindingSource_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResultVar_3097IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3098IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3099IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpr_3100IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpr_3101IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3108IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpr_3109IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateProcess_3110IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProduce_3043IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValueSource_3044IncomingLinks(View view) {
		ValueSource modelElement = (ValueSource) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_outputBindingSource_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValueForm_3045IncomingLinks(View view) {
		ValueForm modelElement = (ValueForm) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_outputBindingSource_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValueFunction_3046IncomingLinks(View view) {
		ValueFunction modelElement = (ValueFunction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_outputBindingSource_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSet_3047IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValueSource_3048IncomingLinks(View view) {
		ValueSource modelElement = (ValueSource) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_outputBindingSource_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValueForm_3049IncomingLinks(View view) {
		ValueForm modelElement = (ValueForm) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_outputBindingSource_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValueFunction_3050IncomingLinks(View view) {
		ValueFunction modelElement = (ValueFunction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_outputBindingSource_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3051IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChoice_3052IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_3053IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplit_3054IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_3055IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_3056IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3057IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3058IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_3059IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3060IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerform_3061IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProduce_3062IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSet_3063IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3111IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpr_3112IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_3065IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerform_3066IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProduce_3067IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSet_3068IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3113IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpr_3114IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_3070IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerform_3071IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProduce_3072IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSet_3073IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3115IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpr_3116IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3076IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_3077IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerform_3078IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProduce_3079IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSet_3080IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_3082IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_3083IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplit_3084IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_3085IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_3086IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3087IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_3088IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerform_3089IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProduce_3090IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSet_3091IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructList_3093IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLocBinding_4001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInputBinding_4002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutputBinding_4003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLinkBinding_4004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutputBindingSource_4005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInput_2027OutgoingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_LocBinding_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_InputBinding_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OutputBinding_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_LinkBinding_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_outputBindingSource_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutput_2028OutgoingLinks(View view) {
		Output modelElement = (Output) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_LocBinding_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_InputBinding_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OutputBinding_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_LinkBinding_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_outputBindingSource_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLoc_2003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_2004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChoice_2005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_2006OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplit_2007OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_2008OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_2009OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_2010OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_2011OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerform_2012OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProduce_2013OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSet_2014OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLink_2015OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_2017OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResult_2018OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOntology_2029OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateConstraint_2030OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpr_2019OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructList_3001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChoice_3003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_3004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChoice_3006OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_3007OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_3008OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplit_3009OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_3010OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_3011OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_3012OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_3013OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3014OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChoice_3015OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_3016OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplit_3017OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_3018OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_3019OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3020OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3021OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChoice_3022OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_3023OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplit_3024OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_3025OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_3026OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_3027OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3028OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChoice_3029OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_3030OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplit_3031OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_3032OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_3033OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerform_3034OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRemoteProcess_3104OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInput_3105OutgoingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_LocBinding_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_InputBinding_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OutputBinding_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_LinkBinding_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_outputBindingSource_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutput_3106OutgoingLinks(View view) {
		Output modelElement = (Output) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_LocBinding_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_InputBinding_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OutputBinding_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_LinkBinding_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_outputBindingSource_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResult_3107OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValueSource_3094OutgoingLinks(View view) {
		ValueSource modelElement = (ValueSource) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_LocBinding_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OutputBinding_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_LinkBinding_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValueForm_3095OutgoingLinks(View view) {
		ValueForm modelElement = (ValueForm) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_LocBinding_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OutputBinding_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_LinkBinding_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValueFunction_3096OutgoingLinks(View view) {
		ValueFunction modelElement = (ValueFunction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_LocBinding_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OutputBinding_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_LinkBinding_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResultVar_3097OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3098OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3099OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpr_3100OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpr_3101OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3108OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpr_3109OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateProcess_3110OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProduce_3043OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValueSource_3044OutgoingLinks(View view) {
		ValueSource modelElement = (ValueSource) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_LocBinding_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OutputBinding_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_LinkBinding_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValueForm_3045OutgoingLinks(View view) {
		ValueForm modelElement = (ValueForm) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_LocBinding_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OutputBinding_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_LinkBinding_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValueFunction_3046OutgoingLinks(View view) {
		ValueFunction modelElement = (ValueFunction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_LocBinding_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OutputBinding_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_LinkBinding_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSet_3047OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValueSource_3048OutgoingLinks(View view) {
		ValueSource modelElement = (ValueSource) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_LocBinding_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OutputBinding_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_LinkBinding_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValueForm_3049OutgoingLinks(View view) {
		ValueForm modelElement = (ValueForm) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_LocBinding_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OutputBinding_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_LinkBinding_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValueFunction_3050OutgoingLinks(View view) {
		ValueFunction modelElement = (ValueFunction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_LocBinding_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OutputBinding_4003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_LinkBinding_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequence_3051OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getChoice_3052OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_3053OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplit_3054OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_3055OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_3056OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3057OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3058OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_3059OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3060OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerform_3061OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProduce_3062OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSet_3063OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3111OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpr_3112OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_3065OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerform_3066OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProduce_3067OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSet_3068OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3113OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpr_3114OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_3070OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerform_3071OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProduce_3072OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSet_3073OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3115OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpr_3116OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3076OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_3077OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerform_3078OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProduce_3079OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSet_3080OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructBag_3082OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAnyOrder_3083OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplit_3084OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSplitJoin_3085OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIfThenElse_3086OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatUntil_3087OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRepeatWhile_3088OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerform_3089OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProduce_3090OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSet_3091OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlConstructList_3093OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLocBinding_4001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInputBinding_4002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutputBinding_4003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLinkBinding_4004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutputBindingSource_4005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_LocBinding_4001(
			OuterProcess container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getBindings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LocBinding) {
				continue;
			}
			LocBinding link = (LocBinding) linkObject;
			if (LocBindingEditPart.VISUAL_ID != ControlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Loc dst = link.getToLoc();
			ValueSpecifier src = link.getOrigin();
			result.add(new ControlLinkDescriptor(src, dst, link,
					ControlElementTypes.LocBinding_4001,
					LocBindingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_InputBinding_4002(
			OuterProcess container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getBindings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InputBinding) {
				continue;
			}
			InputBinding link = (InputBinding) linkObject;
			if (InputBindingEditPart.VISUAL_ID != ControlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Input dst = link.getToParam();
			Parameter src = link.getValueSource();
			result.add(new ControlLinkDescriptor(src, dst, link,
					ControlElementTypes.InputBinding_4002,
					InputBindingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_OutputBinding_4003(
			OuterProcess container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getBindings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OutputBinding) {
				continue;
			}
			OutputBinding link = (OutputBinding) linkObject;
			if (OutputBindingEditPart.VISUAL_ID != ControlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Output dst = link.getToParam();
			ValueSpecifier src = link.getOrigin();
			result.add(new ControlLinkDescriptor(src, dst, link,
					ControlElementTypes.OutputBinding_4003,
					OutputBindingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_LinkBinding_4004(
			OuterProcess container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getBindings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LinkBinding) {
				continue;
			}
			LinkBinding link = (LinkBinding) linkObject;
			if (LinkBindingEditPart.VISUAL_ID != ControlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Link dst = link.getToLink();
			ValueSpecifier src = link.getOrigin();
			result.add(new ControlLinkDescriptor(src, dst, link,
					ControlElementTypes.LinkBinding_4004,
					LinkBindingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_outputBindingSource_4005(
			OuterProcess container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getBindings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof control.outputBindingSource) {
				continue;
			}
			control.outputBindingSource link = (control.outputBindingSource) linkObject;
			if (OutputBindingSourceEditPart.VISUAL_ID != ControlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ValueSpecifierElement dst = link.getSpecifierElement();
			Parameter src = link.getSource();
			result.add(new ControlLinkDescriptor(src, dst, link,
					ControlElementTypes.OutputBindingSource_4005,
					OutputBindingSourceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_LocBinding_4001(
			Loc target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != ControlPackage.eINSTANCE
					.getLocBinding_ToLoc()
					|| false == setting.getEObject() instanceof LocBinding) {
				continue;
			}
			LocBinding link = (LocBinding) setting.getEObject();
			if (LocBindingEditPart.VISUAL_ID != ControlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ValueSpecifier src = link.getOrigin();
			result.add(new ControlLinkDescriptor(src, target, link,
					ControlElementTypes.LocBinding_4001,
					LocBindingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_InputBinding_4002(
			Input target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != ControlPackage.eINSTANCE
					.getInputBinding_ToParam()
					|| false == setting.getEObject() instanceof InputBinding) {
				continue;
			}
			InputBinding link = (InputBinding) setting.getEObject();
			if (InputBindingEditPart.VISUAL_ID != ControlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Parameter src = link.getValueSource();
			result.add(new ControlLinkDescriptor(src, target, link,
					ControlElementTypes.InputBinding_4002,
					InputBindingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_OutputBinding_4003(
			Output target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != ControlPackage.eINSTANCE
					.getOutputBinding_ToParam()
					|| false == setting.getEObject() instanceof OutputBinding) {
				continue;
			}
			OutputBinding link = (OutputBinding) setting.getEObject();
			if (OutputBindingEditPart.VISUAL_ID != ControlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ValueSpecifier src = link.getOrigin();
			result.add(new ControlLinkDescriptor(src, target, link,
					ControlElementTypes.OutputBinding_4003,
					OutputBindingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_LinkBinding_4004(
			Link target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != ControlPackage.eINSTANCE
					.getLinkBinding_ToLink()
					|| false == setting.getEObject() instanceof LinkBinding) {
				continue;
			}
			LinkBinding link = (LinkBinding) setting.getEObject();
			if (LinkBindingEditPart.VISUAL_ID != ControlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ValueSpecifier src = link.getOrigin();
			result.add(new ControlLinkDescriptor(src, target, link,
					ControlElementTypes.LinkBinding_4004,
					LinkBindingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_outputBindingSource_4005(
			ValueSpecifierElement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != ControlPackage.eINSTANCE
					.getoutputBindingSource_SpecifierElement()
					|| false == setting.getEObject() instanceof control.outputBindingSource) {
				continue;
			}
			control.outputBindingSource link = (control.outputBindingSource) setting
					.getEObject();
			if (OutputBindingSourceEditPart.VISUAL_ID != ControlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Parameter src = link.getSource();
			result.add(new ControlLinkDescriptor(src, target, link,
					ControlElementTypes.OutputBindingSource_4005,
					OutputBindingSourceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_LocBinding_4001(
			ValueSpecifier source) {
		OuterProcess container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OuterProcess) {
				container = (OuterProcess) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getBindings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LocBinding) {
				continue;
			}
			LocBinding link = (LocBinding) linkObject;
			if (LocBindingEditPart.VISUAL_ID != ControlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Loc dst = link.getToLoc();
			ValueSpecifier src = link.getOrigin();
			if (src != source) {
				continue;
			}
			result.add(new ControlLinkDescriptor(src, dst, link,
					ControlElementTypes.LocBinding_4001,
					LocBindingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_InputBinding_4002(
			Parameter source) {
		OuterProcess container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OuterProcess) {
				container = (OuterProcess) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getBindings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InputBinding) {
				continue;
			}
			InputBinding link = (InputBinding) linkObject;
			if (InputBindingEditPart.VISUAL_ID != ControlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Input dst = link.getToParam();
			Parameter src = link.getValueSource();
			if (src != source) {
				continue;
			}
			result.add(new ControlLinkDescriptor(src, dst, link,
					ControlElementTypes.InputBinding_4002,
					InputBindingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_OutputBinding_4003(
			ValueSpecifier source) {
		OuterProcess container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OuterProcess) {
				container = (OuterProcess) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getBindings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OutputBinding) {
				continue;
			}
			OutputBinding link = (OutputBinding) linkObject;
			if (OutputBindingEditPart.VISUAL_ID != ControlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Output dst = link.getToParam();
			ValueSpecifier src = link.getOrigin();
			if (src != source) {
				continue;
			}
			result.add(new ControlLinkDescriptor(src, dst, link,
					ControlElementTypes.OutputBinding_4003,
					OutputBindingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_LinkBinding_4004(
			ValueSpecifier source) {
		OuterProcess container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OuterProcess) {
				container = (OuterProcess) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getBindings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LinkBinding) {
				continue;
			}
			LinkBinding link = (LinkBinding) linkObject;
			if (LinkBindingEditPart.VISUAL_ID != ControlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Link dst = link.getToLink();
			ValueSpecifier src = link.getOrigin();
			if (src != source) {
				continue;
			}
			result.add(new ControlLinkDescriptor(src, dst, link,
					ControlElementTypes.LinkBinding_4004,
					LinkBindingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_outputBindingSource_4005(
			Parameter source) {
		OuterProcess container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OuterProcess) {
				container = (OuterProcess) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getBindings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof control.outputBindingSource) {
				continue;
			}
			control.outputBindingSource link = (control.outputBindingSource) linkObject;
			if (OutputBindingSourceEditPart.VISUAL_ID != ControlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ValueSpecifierElement dst = link.getSpecifierElement();
			Parameter src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ControlLinkDescriptor(src, dst, link,
					ControlElementTypes.OutputBindingSource_4005,
					OutputBindingSourceEditPart.VISUAL_ID));
		}
		return result;
	}

}
