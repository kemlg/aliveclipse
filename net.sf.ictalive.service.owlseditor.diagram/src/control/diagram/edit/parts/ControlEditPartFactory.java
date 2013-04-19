/*
 * 
 */
package control.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import control.diagram.part.ControlVisualIDRegistry;

/**
 * @generated
 */
public class ControlEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ControlVisualIDRegistry.getVisualID(view)) {

			case OuterProcessEditPart.VISUAL_ID:
				return new OuterProcessEditPart(view);

			case InputEditPart.VISUAL_ID:
				return new InputEditPart(view);

			case InputNameEditPart.VISUAL_ID:
				return new InputNameEditPart(view);

			case OutputEditPart.VISUAL_ID:
				return new OutputEditPart(view);

			case OutputNameEditPart.VISUAL_ID:
				return new OutputNameEditPart(view);

			case LocEditPart.VISUAL_ID:
				return new LocEditPart(view);

			case LocNameEditPart.VISUAL_ID:
				return new LocNameEditPart(view);

			case SequenceEditPart.VISUAL_ID:
				return new SequenceEditPart(view);

			case SequenceNameEditPart.VISUAL_ID:
				return new SequenceNameEditPart(view);

			case ChoiceEditPart.VISUAL_ID:
				return new ChoiceEditPart(view);

			case ChoiceNameEditPart.VISUAL_ID:
				return new ChoiceNameEditPart(view);

			case AnyOrderEditPart.VISUAL_ID:
				return new AnyOrderEditPart(view);

			case AnyOrderNameEditPart.VISUAL_ID:
				return new AnyOrderNameEditPart(view);

			case SplitEditPart.VISUAL_ID:
				return new SplitEditPart(view);

			case SplitNameEditPart.VISUAL_ID:
				return new SplitNameEditPart(view);

			case SplitJoinEditPart.VISUAL_ID:
				return new SplitJoinEditPart(view);

			case SplitJoinNameEditPart.VISUAL_ID:
				return new SplitJoinNameEditPart(view);

			case IfThenElseEditPart.VISUAL_ID:
				return new IfThenElseEditPart(view);

			case IfThenElseNameEditPart.VISUAL_ID:
				return new IfThenElseNameEditPart(view);

			case RepeatUntilEditPart.VISUAL_ID:
				return new RepeatUntilEditPart(view);

			case RepeatUntilNameEditPart.VISUAL_ID:
				return new RepeatUntilNameEditPart(view);

			case RepeatWhileEditPart.VISUAL_ID:
				return new RepeatWhileEditPart(view);

			case RepeatWhileNameEditPart.VISUAL_ID:
				return new RepeatWhileNameEditPart(view);

			case PerformEditPart.VISUAL_ID:
				return new PerformEditPart(view);

			case PerformNameEditPart.VISUAL_ID:
				return new PerformNameEditPart(view);

			case ProduceEditPart.VISUAL_ID:
				return new ProduceEditPart(view);

			case ProduceNameEditPart.VISUAL_ID:
				return new ProduceNameEditPart(view);

			case SetEditPart.VISUAL_ID:
				return new SetEditPart(view);

			case SetNameEditPart.VISUAL_ID:
				return new SetNameEditPart(view);

			case LinkEditPart.VISUAL_ID:
				return new LinkEditPart(view);

			case LinkNameEditPart.VISUAL_ID:
				return new LinkNameEditPart(view);

			case ConditionEditPart.VISUAL_ID:
				return new ConditionEditPart(view);

			case ConditionNameEditPart.VISUAL_ID:
				return new ConditionNameEditPart(view);

			case ResultEditPart.VISUAL_ID:
				return new ResultEditPart(view);

			case ResultNameEditPart.VISUAL_ID:
				return new ResultNameEditPart(view);

			case OntologyEditPart.VISUAL_ID:
				return new OntologyEditPart(view);

			case OntologyNameEditPart.VISUAL_ID:
				return new OntologyNameEditPart(view);

			case TemplateConstraintEditPart.VISUAL_ID:
				return new TemplateConstraintEditPart(view);

			case TemplateConstraintNameEditPart.VISUAL_ID:
				return new TemplateConstraintNameEditPart(view);

			case ExprEditPart.VISUAL_ID:
				return new ExprEditPart(view);

			case ExprNameEditPart.VISUAL_ID:
				return new ExprNameEditPart(view);

			case ControlConstructListEditPart.VISUAL_ID:
				return new ControlConstructListEditPart(view);

			case ControlConstructListNameEditPart.VISUAL_ID:
				return new ControlConstructListNameEditPart(view);

			case Sequence2EditPart.VISUAL_ID:
				return new Sequence2EditPart(view);

			case SequenceName2EditPart.VISUAL_ID:
				return new SequenceName2EditPart(view);

			case Choice2EditPart.VISUAL_ID:
				return new Choice2EditPart(view);

			case ChoiceName2EditPart.VISUAL_ID:
				return new ChoiceName2EditPart(view);

			case ControlConstructBagEditPart.VISUAL_ID:
				return new ControlConstructBagEditPart(view);

			case ControlConstructBagNameEditPart.VISUAL_ID:
				return new ControlConstructBagNameEditPart(view);

			case Sequence3EditPart.VISUAL_ID:
				return new Sequence3EditPart(view);

			case SequenceName3EditPart.VISUAL_ID:
				return new SequenceName3EditPart(view);

			case Choice3EditPart.VISUAL_ID:
				return new Choice3EditPart(view);

			case ChoiceName3EditPart.VISUAL_ID:
				return new ChoiceName3EditPart(view);

			case AnyOrder2EditPart.VISUAL_ID:
				return new AnyOrder2EditPart(view);

			case AnyOrderName2EditPart.VISUAL_ID:
				return new AnyOrderName2EditPart(view);

			case ControlConstructBag2EditPart.VISUAL_ID:
				return new ControlConstructBag2EditPart(view);

			case ControlConstructBagName2EditPart.VISUAL_ID:
				return new ControlConstructBagName2EditPart(view);

			case Split2EditPart.VISUAL_ID:
				return new Split2EditPart(view);

			case SplitName2EditPart.VISUAL_ID:
				return new SplitName2EditPart(view);

			case ControlConstructBag3EditPart.VISUAL_ID:
				return new ControlConstructBag3EditPart(view);

			case ControlConstructBagName3EditPart.VISUAL_ID:
				return new ControlConstructBagName3EditPart(view);

			case SplitJoin2EditPart.VISUAL_ID:
				return new SplitJoin2EditPart(view);

			case SplitJoinName2EditPart.VISUAL_ID:
				return new SplitJoinName2EditPart(view);

			case ControlConstructBag4EditPart.VISUAL_ID:
				return new ControlConstructBag4EditPart(view);

			case ControlConstructBagName4EditPart.VISUAL_ID:
				return new ControlConstructBagName4EditPart(view);

			case IfThenElse2EditPart.VISUAL_ID:
				return new IfThenElse2EditPart(view);

			case IfThenElseName2EditPart.VISUAL_ID:
				return new IfThenElseName2EditPart(view);

			case Sequence4EditPart.VISUAL_ID:
				return new Sequence4EditPart(view);

			case SequenceName4EditPart.VISUAL_ID:
				return new SequenceName4EditPart(view);

			case Choice4EditPart.VISUAL_ID:
				return new Choice4EditPart(view);

			case ChoiceName4EditPart.VISUAL_ID:
				return new ChoiceName4EditPart(view);

			case AnyOrder3EditPart.VISUAL_ID:
				return new AnyOrder3EditPart(view);

			case AnyOrderName3EditPart.VISUAL_ID:
				return new AnyOrderName3EditPart(view);

			case Split3EditPart.VISUAL_ID:
				return new Split3EditPart(view);

			case SplitName3EditPart.VISUAL_ID:
				return new SplitName3EditPart(view);

			case SplitJoin3EditPart.VISUAL_ID:
				return new SplitJoin3EditPart(view);

			case SplitJoinName3EditPart.VISUAL_ID:
				return new SplitJoinName3EditPart(view);

			case IfThenElse3EditPart.VISUAL_ID:
				return new IfThenElse3EditPart(view);

			case IfThenElseName3EditPart.VISUAL_ID:
				return new IfThenElseName3EditPart(view);

			case RepeatUntil2EditPart.VISUAL_ID:
				return new RepeatUntil2EditPart(view);

			case RepeatUntilName2EditPart.VISUAL_ID:
				return new RepeatUntilName2EditPart(view);

			case Sequence5EditPart.VISUAL_ID:
				return new Sequence5EditPart(view);

			case SequenceName5EditPart.VISUAL_ID:
				return new SequenceName5EditPart(view);

			case Choice5EditPart.VISUAL_ID:
				return new Choice5EditPart(view);

			case ChoiceName5EditPart.VISUAL_ID:
				return new ChoiceName5EditPart(view);

			case AnyOrder4EditPart.VISUAL_ID:
				return new AnyOrder4EditPart(view);

			case AnyOrderName4EditPart.VISUAL_ID:
				return new AnyOrderName4EditPart(view);

			case Split4EditPart.VISUAL_ID:
				return new Split4EditPart(view);

			case SplitName4EditPart.VISUAL_ID:
				return new SplitName4EditPart(view);

			case SplitJoin4EditPart.VISUAL_ID:
				return new SplitJoin4EditPart(view);

			case SplitJoinName4EditPart.VISUAL_ID:
				return new SplitJoinName4EditPart(view);

			case IfThenElse4EditPart.VISUAL_ID:
				return new IfThenElse4EditPart(view);

			case IfThenElseName4EditPart.VISUAL_ID:
				return new IfThenElseName4EditPart(view);

			case RepeatWhile2EditPart.VISUAL_ID:
				return new RepeatWhile2EditPart(view);

			case RepeatWhileName2EditPart.VISUAL_ID:
				return new RepeatWhileName2EditPart(view);

			case Sequence6EditPart.VISUAL_ID:
				return new Sequence6EditPart(view);

			case SequenceName6EditPart.VISUAL_ID:
				return new SequenceName6EditPart(view);

			case Choice6EditPart.VISUAL_ID:
				return new Choice6EditPart(view);

			case ChoiceName6EditPart.VISUAL_ID:
				return new ChoiceName6EditPart(view);

			case AnyOrder5EditPart.VISUAL_ID:
				return new AnyOrder5EditPart(view);

			case AnyOrderName5EditPart.VISUAL_ID:
				return new AnyOrderName5EditPart(view);

			case Split5EditPart.VISUAL_ID:
				return new Split5EditPart(view);

			case SplitName5EditPart.VISUAL_ID:
				return new SplitName5EditPart(view);

			case SplitJoin5EditPart.VISUAL_ID:
				return new SplitJoin5EditPart(view);

			case SplitJoinName5EditPart.VISUAL_ID:
				return new SplitJoinName5EditPart(view);

			case IfThenElse5EditPart.VISUAL_ID:
				return new IfThenElse5EditPart(view);

			case IfThenElseName5EditPart.VISUAL_ID:
				return new IfThenElseName5EditPart(view);

			case Perform2EditPart.VISUAL_ID:
				return new Perform2EditPart(view);

			case PerformName2EditPart.VISUAL_ID:
				return new PerformName2EditPart(view);

			case RemoteProcessEditPart.VISUAL_ID:
				return new RemoteProcessEditPart(view);

			case RemoteProcessNameEditPart.VISUAL_ID:
				return new RemoteProcessNameEditPart(view);

			case Input2EditPart.VISUAL_ID:
				return new Input2EditPart(view);

			case InputName2EditPart.VISUAL_ID:
				return new InputName2EditPart(view);

			case Output2EditPart.VISUAL_ID:
				return new Output2EditPart(view);

			case OutputName2EditPart.VISUAL_ID:
				return new OutputName2EditPart(view);

			case Result2EditPart.VISUAL_ID:
				return new Result2EditPart(view);

			case ResultName2EditPart.VISUAL_ID:
				return new ResultName2EditPart(view);

			case ValueSourceEditPart.VISUAL_ID:
				return new ValueSourceEditPart(view);

			case ValueSourceNameEditPart.VISUAL_ID:
				return new ValueSourceNameEditPart(view);

			case ValueFormEditPart.VISUAL_ID:
				return new ValueFormEditPart(view);

			case ValueFormNameEditPart.VISUAL_ID:
				return new ValueFormNameEditPart(view);

			case ValueFunctionEditPart.VISUAL_ID:
				return new ValueFunctionEditPart(view);

			case ValueFunctionNameEditPart.VISUAL_ID:
				return new ValueFunctionNameEditPart(view);

			case ResultVarEditPart.VISUAL_ID:
				return new ResultVarEditPart(view);

			case ResultVarNameEditPart.VISUAL_ID:
				return new ResultVarNameEditPart(view);

			case Condition2EditPart.VISUAL_ID:
				return new Condition2EditPart(view);

			case ConditionName2EditPart.VISUAL_ID:
				return new ConditionName2EditPart(view);

			case Condition3EditPart.VISUAL_ID:
				return new Condition3EditPart(view);

			case ConditionName3EditPart.VISUAL_ID:
				return new ConditionName3EditPart(view);

			case Expr2EditPart.VISUAL_ID:
				return new Expr2EditPart(view);

			case ExprName2EditPart.VISUAL_ID:
				return new ExprName2EditPart(view);

			case Expr3EditPart.VISUAL_ID:
				return new Expr3EditPart(view);

			case ExprName3EditPart.VISUAL_ID:
				return new ExprName3EditPart(view);

			case Condition4EditPart.VISUAL_ID:
				return new Condition4EditPart(view);

			case ConditionName4EditPart.VISUAL_ID:
				return new ConditionName4EditPart(view);

			case Expr4EditPart.VISUAL_ID:
				return new Expr4EditPart(view);

			case ExprName4EditPart.VISUAL_ID:
				return new ExprName4EditPart(view);

			case TemplateProcessEditPart.VISUAL_ID:
				return new TemplateProcessEditPart(view);

			case TemplateProcessNameEditPart.VISUAL_ID:
				return new TemplateProcessNameEditPart(view);

			case Produce2EditPart.VISUAL_ID:
				return new Produce2EditPart(view);

			case ProduceName2EditPart.VISUAL_ID:
				return new ProduceName2EditPart(view);

			case ValueSource2EditPart.VISUAL_ID:
				return new ValueSource2EditPart(view);

			case ValueSourceName2EditPart.VISUAL_ID:
				return new ValueSourceName2EditPart(view);

			case ValueForm2EditPart.VISUAL_ID:
				return new ValueForm2EditPart(view);

			case ValueFormName2EditPart.VISUAL_ID:
				return new ValueFormName2EditPart(view);

			case ValueFunction2EditPart.VISUAL_ID:
				return new ValueFunction2EditPart(view);

			case ValueFunctionName2EditPart.VISUAL_ID:
				return new ValueFunctionName2EditPart(view);

			case Set2EditPart.VISUAL_ID:
				return new Set2EditPart(view);

			case SetName2EditPart.VISUAL_ID:
				return new SetName2EditPart(view);

			case ValueSource3EditPart.VISUAL_ID:
				return new ValueSource3EditPart(view);

			case ValueSourceName3EditPart.VISUAL_ID:
				return new ValueSourceName3EditPart(view);

			case ValueForm3EditPart.VISUAL_ID:
				return new ValueForm3EditPart(view);

			case ValueFormName3EditPart.VISUAL_ID:
				return new ValueFormName3EditPart(view);

			case ValueFunction3EditPart.VISUAL_ID:
				return new ValueFunction3EditPart(view);

			case ValueFunctionName3EditPart.VISUAL_ID:
				return new ValueFunctionName3EditPart(view);

			case Sequence7EditPart.VISUAL_ID:
				return new Sequence7EditPart(view);

			case SequenceName7EditPart.VISUAL_ID:
				return new SequenceName7EditPart(view);

			case Choice7EditPart.VISUAL_ID:
				return new Choice7EditPart(view);

			case ChoiceName7EditPart.VISUAL_ID:
				return new ChoiceName7EditPart(view);

			case AnyOrder6EditPart.VISUAL_ID:
				return new AnyOrder6EditPart(view);

			case AnyOrderName6EditPart.VISUAL_ID:
				return new AnyOrderName6EditPart(view);

			case Split6EditPart.VISUAL_ID:
				return new Split6EditPart(view);

			case SplitName6EditPart.VISUAL_ID:
				return new SplitName6EditPart(view);

			case SplitJoin6EditPart.VISUAL_ID:
				return new SplitJoin6EditPart(view);

			case SplitJoinName6EditPart.VISUAL_ID:
				return new SplitJoinName6EditPart(view);

			case IfThenElse6EditPart.VISUAL_ID:
				return new IfThenElse6EditPart(view);

			case IfThenElseName6EditPart.VISUAL_ID:
				return new IfThenElseName6EditPart(view);

			case RepeatUntil3EditPart.VISUAL_ID:
				return new RepeatUntil3EditPart(view);

			case RepeatUntilName3EditPart.VISUAL_ID:
				return new RepeatUntilName3EditPart(view);

			case RepeatUntil4EditPart.VISUAL_ID:
				return new RepeatUntil4EditPart(view);

			case RepeatUntilName4EditPart.VISUAL_ID:
				return new RepeatUntilName4EditPart(view);

			case RepeatWhile3EditPart.VISUAL_ID:
				return new RepeatWhile3EditPart(view);

			case RepeatWhileName3EditPart.VISUAL_ID:
				return new RepeatWhileName3EditPart(view);

			case RepeatUntil5EditPart.VISUAL_ID:
				return new RepeatUntil5EditPart(view);

			case RepeatUntilName5EditPart.VISUAL_ID:
				return new RepeatUntilName5EditPart(view);

			case Perform3EditPart.VISUAL_ID:
				return new Perform3EditPart(view);

			case PerformName3EditPart.VISUAL_ID:
				return new PerformName3EditPart(view);

			case Produce3EditPart.VISUAL_ID:
				return new Produce3EditPart(view);

			case ProduceName3EditPart.VISUAL_ID:
				return new ProduceName3EditPart(view);

			case Set3EditPart.VISUAL_ID:
				return new Set3EditPart(view);

			case SetName3EditPart.VISUAL_ID:
				return new SetName3EditPart(view);

			case Condition5EditPart.VISUAL_ID:
				return new Condition5EditPart(view);

			case ConditionName5EditPart.VISUAL_ID:
				return new ConditionName5EditPart(view);

			case Expr5EditPart.VISUAL_ID:
				return new Expr5EditPart(view);

			case ExprName5EditPart.VISUAL_ID:
				return new ExprName5EditPart(view);

			case RepeatWhile4EditPart.VISUAL_ID:
				return new RepeatWhile4EditPart(view);

			case RepeatWhileName4EditPart.VISUAL_ID:
				return new RepeatWhileName4EditPart(view);

			case Perform4EditPart.VISUAL_ID:
				return new Perform4EditPart(view);

			case PerformName4EditPart.VISUAL_ID:
				return new PerformName4EditPart(view);

			case Produce4EditPart.VISUAL_ID:
				return new Produce4EditPart(view);

			case ProduceName4EditPart.VISUAL_ID:
				return new ProduceName4EditPart(view);

			case Set4EditPart.VISUAL_ID:
				return new Set4EditPart(view);

			case SetName4EditPart.VISUAL_ID:
				return new SetName4EditPart(view);

			case Condition6EditPart.VISUAL_ID:
				return new Condition6EditPart(view);

			case ConditionName6EditPart.VISUAL_ID:
				return new ConditionName6EditPart(view);

			case Expr6EditPart.VISUAL_ID:
				return new Expr6EditPart(view);

			case ExprName6EditPart.VISUAL_ID:
				return new ExprName6EditPart(view);

			case RepeatWhile5EditPart.VISUAL_ID:
				return new RepeatWhile5EditPart(view);

			case RepeatWhileName5EditPart.VISUAL_ID:
				return new RepeatWhileName5EditPart(view);

			case Perform5EditPart.VISUAL_ID:
				return new Perform5EditPart(view);

			case PerformName5EditPart.VISUAL_ID:
				return new PerformName5EditPart(view);

			case Produce5EditPart.VISUAL_ID:
				return new Produce5EditPart(view);

			case ProduceName5EditPart.VISUAL_ID:
				return new ProduceName5EditPart(view);

			case Set5EditPart.VISUAL_ID:
				return new Set5EditPart(view);

			case SetName5EditPart.VISUAL_ID:
				return new SetName5EditPart(view);

			case Condition7EditPart.VISUAL_ID:
				return new Condition7EditPart(view);

			case ConditionName7EditPart.VISUAL_ID:
				return new ConditionName7EditPart(view);

			case Expr7EditPart.VISUAL_ID:
				return new Expr7EditPart(view);

			case ExprName7EditPart.VISUAL_ID:
				return new ExprName7EditPart(view);

			case RepeatUntil6EditPart.VISUAL_ID:
				return new RepeatUntil6EditPart(view);

			case RepeatUntilName6EditPart.VISUAL_ID:
				return new RepeatUntilName6EditPart(view);

			case RepeatWhile6EditPart.VISUAL_ID:
				return new RepeatWhile6EditPart(view);

			case RepeatWhileName6EditPart.VISUAL_ID:
				return new RepeatWhileName6EditPart(view);

			case Perform6EditPart.VISUAL_ID:
				return new Perform6EditPart(view);

			case PerformName6EditPart.VISUAL_ID:
				return new PerformName6EditPart(view);

			case Produce6EditPart.VISUAL_ID:
				return new Produce6EditPart(view);

			case ProduceName6EditPart.VISUAL_ID:
				return new ProduceName6EditPart(view);

			case Set6EditPart.VISUAL_ID:
				return new Set6EditPart(view);

			case SetName6EditPart.VISUAL_ID:
				return new SetName6EditPart(view);

			case ControlConstructBag5EditPart.VISUAL_ID:
				return new ControlConstructBag5EditPart(view);

			case ControlConstructBagName5EditPart.VISUAL_ID:
				return new ControlConstructBagName5EditPart(view);

			case AnyOrder7EditPart.VISUAL_ID:
				return new AnyOrder7EditPart(view);

			case AnyOrderName7EditPart.VISUAL_ID:
				return new AnyOrderName7EditPart(view);

			case Split7EditPart.VISUAL_ID:
				return new Split7EditPart(view);

			case SplitName7EditPart.VISUAL_ID:
				return new SplitName7EditPart(view);

			case SplitJoin7EditPart.VISUAL_ID:
				return new SplitJoin7EditPart(view);

			case SplitJoinName7EditPart.VISUAL_ID:
				return new SplitJoinName7EditPart(view);

			case IfThenElse7EditPart.VISUAL_ID:
				return new IfThenElse7EditPart(view);

			case IfThenElseName7EditPart.VISUAL_ID:
				return new IfThenElseName7EditPart(view);

			case RepeatUntil7EditPart.VISUAL_ID:
				return new RepeatUntil7EditPart(view);

			case RepeatUntilName7EditPart.VISUAL_ID:
				return new RepeatUntilName7EditPart(view);

			case RepeatWhile7EditPart.VISUAL_ID:
				return new RepeatWhile7EditPart(view);

			case RepeatWhileName7EditPart.VISUAL_ID:
				return new RepeatWhileName7EditPart(view);

			case Perform7EditPart.VISUAL_ID:
				return new Perform7EditPart(view);

			case PerformName7EditPart.VISUAL_ID:
				return new PerformName7EditPart(view);

			case Produce7EditPart.VISUAL_ID:
				return new Produce7EditPart(view);

			case ProduceName7EditPart.VISUAL_ID:
				return new ProduceName7EditPart(view);

			case Set7EditPart.VISUAL_ID:
				return new Set7EditPart(view);

			case SetName7EditPart.VISUAL_ID:
				return new SetName7EditPart(view);

			case ControlConstructList2EditPart.VISUAL_ID:
				return new ControlConstructList2EditPart(view);

			case ControlConstructListName2EditPart.VISUAL_ID:
				return new ControlConstructListName2EditPart(view);

			case SequenceSequenceComponentsCompartmentEditPart.VISUAL_ID:
				return new SequenceSequenceComponentsCompartmentEditPart(view);

			case ControlConstructListControlConstructListFirstCompartmentEditPart.VISUAL_ID:
				return new ControlConstructListControlConstructListFirstCompartmentEditPart(
						view);

			case ControlConstructListControlConstructListRestCompartmentEditPart.VISUAL_ID:
				return new ControlConstructListControlConstructListRestCompartmentEditPart(
						view);

			case SequenceSequenceComponentsCompartment2EditPart.VISUAL_ID:
				return new SequenceSequenceComponentsCompartment2EditPart(view);

			case ChoiceChoiceComponentsCompartmentEditPart.VISUAL_ID:
				return new ChoiceChoiceComponentsCompartmentEditPart(view);

			case ControlConstructBagControlConstructBagFirstCompartmentEditPart.VISUAL_ID:
				return new ControlConstructBagControlConstructBagFirstCompartmentEditPart(
						view);

			case ControlConstructBagControlConstructBagRestCompartmentEditPart.VISUAL_ID:
				return new ControlConstructBagControlConstructBagRestCompartmentEditPart(
						view);

			case SequenceSequenceComponentsCompartment3EditPart.VISUAL_ID:
				return new SequenceSequenceComponentsCompartment3EditPart(view);

			case ChoiceChoiceComponentsCompartment2EditPart.VISUAL_ID:
				return new ChoiceChoiceComponentsCompartment2EditPart(view);

			case AnyOrderAnyOrderComponentsCompartmentEditPart.VISUAL_ID:
				return new AnyOrderAnyOrderComponentsCompartmentEditPart(view);

			case ControlConstructBagControlConstructBagFirstCompartment2EditPart.VISUAL_ID:
				return new ControlConstructBagControlConstructBagFirstCompartment2EditPart(
						view);

			case ControlConstructBagControlConstructBagRestCompartment2EditPart.VISUAL_ID:
				return new ControlConstructBagControlConstructBagRestCompartment2EditPart(
						view);

			case SplitSplitComponentsCompartmentEditPart.VISUAL_ID:
				return new SplitSplitComponentsCompartmentEditPart(view);

			case ControlConstructBagControlConstructBagFirstCompartment3EditPart.VISUAL_ID:
				return new ControlConstructBagControlConstructBagFirstCompartment3EditPart(
						view);

			case ControlConstructBagControlConstructBagRestCompartment3EditPart.VISUAL_ID:
				return new ControlConstructBagControlConstructBagRestCompartment3EditPart(
						view);

			case SplitJoinSplitJoinComponentsCompartmentEditPart.VISUAL_ID:
				return new SplitJoinSplitJoinComponentsCompartmentEditPart(view);

			case ControlConstructBagControlConstructBagFirstCompartment4EditPart.VISUAL_ID:
				return new ControlConstructBagControlConstructBagFirstCompartment4EditPart(
						view);

			case ControlConstructBagControlConstructBagRestCompartment4EditPart.VISUAL_ID:
				return new ControlConstructBagControlConstructBagRestCompartment4EditPart(
						view);

			case IfThenElseIfThenElseIfConditionCompartmentEditPart.VISUAL_ID:
				return new IfThenElseIfThenElseIfConditionCompartmentEditPart(
						view);

			case IfThenElseIfThenElseThenCompartmentEditPart.VISUAL_ID:
				return new IfThenElseIfThenElseThenCompartmentEditPart(view);

			case IfThenElseIfThenElseElseCompartmentEditPart.VISUAL_ID:
				return new IfThenElseIfThenElseElseCompartmentEditPart(view);

			case SequenceSequenceComponentsCompartment4EditPart.VISUAL_ID:
				return new SequenceSequenceComponentsCompartment4EditPart(view);

			case ChoiceChoiceComponentsCompartment3EditPart.VISUAL_ID:
				return new ChoiceChoiceComponentsCompartment3EditPart(view);

			case AnyOrderAnyOrderComponentsCompartment2EditPart.VISUAL_ID:
				return new AnyOrderAnyOrderComponentsCompartment2EditPart(view);

			case SplitSplitComponentsCompartment2EditPart.VISUAL_ID:
				return new SplitSplitComponentsCompartment2EditPart(view);

			case SplitJoinSplitJoinComponentsCompartment2EditPart.VISUAL_ID:
				return new SplitJoinSplitJoinComponentsCompartment2EditPart(
						view);

			case IfThenElseIfThenElseIfConditionCompartment2EditPart.VISUAL_ID:
				return new IfThenElseIfThenElseIfConditionCompartment2EditPart(
						view);

			case IfThenElseIfThenElseThenCompartment2EditPart.VISUAL_ID:
				return new IfThenElseIfThenElseThenCompartment2EditPart(view);

			case IfThenElseIfThenElseElseCompartment2EditPart.VISUAL_ID:
				return new IfThenElseIfThenElseElseCompartment2EditPart(view);

			case RepeatUntilRepeatUntilUntilConditionCompartmentEditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilUntilConditionCompartmentEditPart(
						view);

			case RepeatUntilRepeatUntilUntilProcessCompartmentEditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilUntilProcessCompartmentEditPart(
						view);

			case SequenceSequenceComponentsCompartment5EditPart.VISUAL_ID:
				return new SequenceSequenceComponentsCompartment5EditPart(view);

			case ChoiceChoiceComponentsCompartment4EditPart.VISUAL_ID:
				return new ChoiceChoiceComponentsCompartment4EditPart(view);

			case AnyOrderAnyOrderComponentsCompartment3EditPart.VISUAL_ID:
				return new AnyOrderAnyOrderComponentsCompartment3EditPart(view);

			case SplitSplitComponentsCompartment3EditPart.VISUAL_ID:
				return new SplitSplitComponentsCompartment3EditPart(view);

			case SplitJoinSplitJoinComponentsCompartment3EditPart.VISUAL_ID:
				return new SplitJoinSplitJoinComponentsCompartment3EditPart(
						view);

			case IfThenElseIfThenElseIfConditionCompartment3EditPart.VISUAL_ID:
				return new IfThenElseIfThenElseIfConditionCompartment3EditPart(
						view);

			case IfThenElseIfThenElseThenCompartment3EditPart.VISUAL_ID:
				return new IfThenElseIfThenElseThenCompartment3EditPart(view);

			case IfThenElseIfThenElseElseCompartment3EditPart.VISUAL_ID:
				return new IfThenElseIfThenElseElseCompartment3EditPart(view);

			case RepeatWhileRepeatWhileWhileConditionCompartmentEditPart.VISUAL_ID:
				return new RepeatWhileRepeatWhileWhileConditionCompartmentEditPart(
						view);

			case RepeatWhileRepeatWhileWhileProcessCompartmentEditPart.VISUAL_ID:
				return new RepeatWhileRepeatWhileWhileProcessCompartmentEditPart(
						view);

			case SequenceSequenceComponentsCompartment6EditPart.VISUAL_ID:
				return new SequenceSequenceComponentsCompartment6EditPart(view);

			case ChoiceChoiceComponentsCompartment5EditPart.VISUAL_ID:
				return new ChoiceChoiceComponentsCompartment5EditPart(view);

			case AnyOrderAnyOrderComponentsCompartment4EditPart.VISUAL_ID:
				return new AnyOrderAnyOrderComponentsCompartment4EditPart(view);

			case SplitSplitComponentsCompartment4EditPart.VISUAL_ID:
				return new SplitSplitComponentsCompartment4EditPart(view);

			case SplitJoinSplitJoinComponentsCompartment4EditPart.VISUAL_ID:
				return new SplitJoinSplitJoinComponentsCompartment4EditPart(
						view);

			case IfThenElseIfThenElseIfConditionCompartment4EditPart.VISUAL_ID:
				return new IfThenElseIfThenElseIfConditionCompartment4EditPart(
						view);

			case IfThenElseIfThenElseThenCompartment4EditPart.VISUAL_ID:
				return new IfThenElseIfThenElseThenCompartment4EditPart(view);

			case IfThenElseIfThenElseElseCompartment4EditPart.VISUAL_ID:
				return new IfThenElseIfThenElseElseCompartment4EditPart(view);

			case PerformPerformTheProcessCompartmentEditPart.VISUAL_ID:
				return new PerformPerformTheProcessCompartmentEditPart(view);

			case ResultResultInConditionCompartmentEditPart.VISUAL_ID:
				return new ResultResultInConditionCompartmentEditPart(view);

			case ResultResultHasResultVarCompartmentEditPart.VISUAL_ID:
				return new ResultResultHasResultVarCompartmentEditPart(view);

			case ResultResultHasEffectCompartmentEditPart.VISUAL_ID:
				return new ResultResultHasEffectCompartmentEditPart(view);

			case ResultResultBindingSourceCompartmentEditPart.VISUAL_ID:
				return new ResultResultBindingSourceCompartmentEditPart(view);

			case ProduceProduceProducedBindingValueSpecifierCompartmentEditPart.VISUAL_ID:
				return new ProduceProduceProducedBindingValueSpecifierCompartmentEditPart(
						view);

			case SetSetProducedBindingValueSpecifierCompartmentEditPart.VISUAL_ID:
				return new SetSetProducedBindingValueSpecifierCompartmentEditPart(
						view);

			case SequenceSequenceComponentsCompartment7EditPart.VISUAL_ID:
				return new SequenceSequenceComponentsCompartment7EditPart(view);

			case ChoiceChoiceComponentsCompartment6EditPart.VISUAL_ID:
				return new ChoiceChoiceComponentsCompartment6EditPart(view);

			case AnyOrderAnyOrderComponentsCompartment5EditPart.VISUAL_ID:
				return new AnyOrderAnyOrderComponentsCompartment5EditPart(view);

			case SplitSplitComponentsCompartment5EditPart.VISUAL_ID:
				return new SplitSplitComponentsCompartment5EditPart(view);

			case SplitJoinSplitJoinComponentsCompartment5EditPart.VISUAL_ID:
				return new SplitJoinSplitJoinComponentsCompartment5EditPart(
						view);

			case IfThenElseIfThenElseIfConditionCompartment5EditPart.VISUAL_ID:
				return new IfThenElseIfThenElseIfConditionCompartment5EditPart(
						view);

			case IfThenElseIfThenElseThenCompartment5EditPart.VISUAL_ID:
				return new IfThenElseIfThenElseThenCompartment5EditPart(view);

			case IfThenElseIfThenElseElseCompartment5EditPart.VISUAL_ID:
				return new IfThenElseIfThenElseElseCompartment5EditPart(view);

			case RepeatUntilRepeatUntilUntilConditionCompartment2EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilUntilConditionCompartment2EditPart(
						view);

			case RepeatUntilRepeatUntilUntilProcessCompartment2EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilUntilProcessCompartment2EditPart(
						view);

			case RepeatUntilRepeatUntilUntilConditionCompartment3EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilUntilConditionCompartment3EditPart(
						view);

			case RepeatUntilRepeatUntilUntilProcessCompartment3EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilUntilProcessCompartment3EditPart(
						view);

			case RepeatWhileRepeatWhileWhileConditionCompartment2EditPart.VISUAL_ID:
				return new RepeatWhileRepeatWhileWhileConditionCompartment2EditPart(
						view);

			case RepeatWhileRepeatWhileWhileProcessCompartment2EditPart.VISUAL_ID:
				return new RepeatWhileRepeatWhileWhileProcessCompartment2EditPart(
						view);

			case RepeatUntilRepeatUntilUntilConditionCompartment4EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilUntilConditionCompartment4EditPart(
						view);

			case RepeatUntilRepeatUntilUntilProcessCompartment4EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilUntilProcessCompartment4EditPart(
						view);

			case PerformPerformTheProcessCompartment2EditPart.VISUAL_ID:
				return new PerformPerformTheProcessCompartment2EditPart(view);

			case ProduceProduceProducedBindingValueSpecifierCompartment2EditPart.VISUAL_ID:
				return new ProduceProduceProducedBindingValueSpecifierCompartment2EditPart(
						view);

			case SetSetProducedBindingValueSpecifierCompartment2EditPart.VISUAL_ID:
				return new SetSetProducedBindingValueSpecifierCompartment2EditPart(
						view);

			case RepeatWhileRepeatWhileWhileConditionCompartment3EditPart.VISUAL_ID:
				return new RepeatWhileRepeatWhileWhileConditionCompartment3EditPart(
						view);

			case RepeatWhileRepeatWhileWhileProcessCompartment3EditPart.VISUAL_ID:
				return new RepeatWhileRepeatWhileWhileProcessCompartment3EditPart(
						view);

			case PerformPerformTheProcessCompartment3EditPart.VISUAL_ID:
				return new PerformPerformTheProcessCompartment3EditPart(view);

			case ProduceProduceProducedBindingValueSpecifierCompartment3EditPart.VISUAL_ID:
				return new ProduceProduceProducedBindingValueSpecifierCompartment3EditPart(
						view);

			case SetSetProducedBindingValueSpecifierCompartment3EditPart.VISUAL_ID:
				return new SetSetProducedBindingValueSpecifierCompartment3EditPart(
						view);

			case RepeatWhileRepeatWhileWhileConditionCompartment4EditPart.VISUAL_ID:
				return new RepeatWhileRepeatWhileWhileConditionCompartment4EditPart(
						view);

			case RepeatWhileRepeatWhileWhileProcessCompartment4EditPart.VISUAL_ID:
				return new RepeatWhileRepeatWhileWhileProcessCompartment4EditPart(
						view);

			case PerformPerformTheProcessCompartment4EditPart.VISUAL_ID:
				return new PerformPerformTheProcessCompartment4EditPart(view);

			case ProduceProduceProducedBindingValueSpecifierCompartment4EditPart.VISUAL_ID:
				return new ProduceProduceProducedBindingValueSpecifierCompartment4EditPart(
						view);

			case SetSetProducedBindingValueSpecifierCompartment4EditPart.VISUAL_ID:
				return new SetSetProducedBindingValueSpecifierCompartment4EditPart(
						view);

			case RepeatUntilRepeatUntilUntilConditionCompartment5EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilUntilConditionCompartment5EditPart(
						view);

			case RepeatUntilRepeatUntilUntilProcessCompartment5EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilUntilProcessCompartment5EditPart(
						view);

			case RepeatWhileRepeatWhileWhileConditionCompartment5EditPart.VISUAL_ID:
				return new RepeatWhileRepeatWhileWhileConditionCompartment5EditPart(
						view);

			case RepeatWhileRepeatWhileWhileProcessCompartment5EditPart.VISUAL_ID:
				return new RepeatWhileRepeatWhileWhileProcessCompartment5EditPart(
						view);

			case PerformPerformTheProcessCompartment5EditPart.VISUAL_ID:
				return new PerformPerformTheProcessCompartment5EditPart(view);

			case ProduceProduceProducedBindingValueSpecifierCompartment5EditPart.VISUAL_ID:
				return new ProduceProduceProducedBindingValueSpecifierCompartment5EditPart(
						view);

			case SetSetProducedBindingValueSpecifierCompartment5EditPart.VISUAL_ID:
				return new SetSetProducedBindingValueSpecifierCompartment5EditPart(
						view);

			case ControlConstructBagControlConstructBagFirstCompartment5EditPart.VISUAL_ID:
				return new ControlConstructBagControlConstructBagFirstCompartment5EditPart(
						view);

			case ControlConstructBagControlConstructBagRestCompartment5EditPart.VISUAL_ID:
				return new ControlConstructBagControlConstructBagRestCompartment5EditPart(
						view);

			case AnyOrderAnyOrderComponentsCompartment6EditPart.VISUAL_ID:
				return new AnyOrderAnyOrderComponentsCompartment6EditPart(view);

			case SplitSplitComponentsCompartment6EditPart.VISUAL_ID:
				return new SplitSplitComponentsCompartment6EditPart(view);

			case SplitJoinSplitJoinComponentsCompartment6EditPart.VISUAL_ID:
				return new SplitJoinSplitJoinComponentsCompartment6EditPart(
						view);

			case IfThenElseIfThenElseIfConditionCompartment6EditPart.VISUAL_ID:
				return new IfThenElseIfThenElseIfConditionCompartment6EditPart(
						view);

			case IfThenElseIfThenElseThenCompartment6EditPart.VISUAL_ID:
				return new IfThenElseIfThenElseThenCompartment6EditPart(view);

			case IfThenElseIfThenElseElseCompartment6EditPart.VISUAL_ID:
				return new IfThenElseIfThenElseElseCompartment6EditPart(view);

			case RepeatUntilRepeatUntilUntilConditionCompartment6EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilUntilConditionCompartment6EditPart(
						view);

			case RepeatUntilRepeatUntilUntilProcessCompartment6EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilUntilProcessCompartment6EditPart(
						view);

			case RepeatWhileRepeatWhileWhileConditionCompartment6EditPart.VISUAL_ID:
				return new RepeatWhileRepeatWhileWhileConditionCompartment6EditPart(
						view);

			case RepeatWhileRepeatWhileWhileProcessCompartment6EditPart.VISUAL_ID:
				return new RepeatWhileRepeatWhileWhileProcessCompartment6EditPart(
						view);

			case PerformPerformTheProcessCompartment6EditPart.VISUAL_ID:
				return new PerformPerformTheProcessCompartment6EditPart(view);

			case ProduceProduceProducedBindingValueSpecifierCompartment6EditPart.VISUAL_ID:
				return new ProduceProduceProducedBindingValueSpecifierCompartment6EditPart(
						view);

			case SetSetProducedBindingValueSpecifierCompartment6EditPart.VISUAL_ID:
				return new SetSetProducedBindingValueSpecifierCompartment6EditPart(
						view);

			case ControlConstructListControlConstructListFirstCompartment2EditPart.VISUAL_ID:
				return new ControlConstructListControlConstructListFirstCompartment2EditPart(
						view);

			case ControlConstructListControlConstructListRestCompartment2EditPart.VISUAL_ID:
				return new ControlConstructListControlConstructListRestCompartment2EditPart(
						view);

			case ChoiceChoiceComponentsCompartment7EditPart.VISUAL_ID:
				return new ChoiceChoiceComponentsCompartment7EditPart(view);

			case AnyOrderAnyOrderComponentsCompartment7EditPart.VISUAL_ID:
				return new AnyOrderAnyOrderComponentsCompartment7EditPart(view);

			case SplitSplitComponentsCompartment7EditPart.VISUAL_ID:
				return new SplitSplitComponentsCompartment7EditPart(view);

			case SplitJoinSplitJoinComponentsCompartment7EditPart.VISUAL_ID:
				return new SplitJoinSplitJoinComponentsCompartment7EditPart(
						view);

			case IfThenElseIfThenElseIfConditionCompartment7EditPart.VISUAL_ID:
				return new IfThenElseIfThenElseIfConditionCompartment7EditPart(
						view);

			case IfThenElseIfThenElseThenCompartment7EditPart.VISUAL_ID:
				return new IfThenElseIfThenElseThenCompartment7EditPart(view);

			case IfThenElseIfThenElseElseCompartment7EditPart.VISUAL_ID:
				return new IfThenElseIfThenElseElseCompartment7EditPart(view);

			case RepeatUntilRepeatUntilUntilConditionCompartment7EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilUntilConditionCompartment7EditPart(
						view);

			case RepeatUntilRepeatUntilUntilProcessCompartment7EditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilUntilProcessCompartment7EditPart(
						view);

			case RepeatWhileRepeatWhileWhileConditionCompartment7EditPart.VISUAL_ID:
				return new RepeatWhileRepeatWhileWhileConditionCompartment7EditPart(
						view);

			case RepeatWhileRepeatWhileWhileProcessCompartment7EditPart.VISUAL_ID:
				return new RepeatWhileRepeatWhileWhileProcessCompartment7EditPart(
						view);

			case PerformPerformTheProcessCompartment7EditPart.VISUAL_ID:
				return new PerformPerformTheProcessCompartment7EditPart(view);

			case ProduceProduceProducedBindingValueSpecifierCompartment7EditPart.VISUAL_ID:
				return new ProduceProduceProducedBindingValueSpecifierCompartment7EditPart(
						view);

			case SetSetProducedBindingValueSpecifierCompartment7EditPart.VISUAL_ID:
				return new SetSetProducedBindingValueSpecifierCompartment7EditPart(
						view);

			case ResultResultInConditionCompartment2EditPart.VISUAL_ID:
				return new ResultResultInConditionCompartment2EditPart(view);

			case ResultResultHasResultVarCompartment2EditPart.VISUAL_ID:
				return new ResultResultHasResultVarCompartment2EditPart(view);

			case ResultResultHasEffectCompartment2EditPart.VISUAL_ID:
				return new ResultResultHasEffectCompartment2EditPart(view);

			case ResultResultBindingSourceCompartment2EditPart.VISUAL_ID:
				return new ResultResultBindingSourceCompartment2EditPart(view);

			case LocBindingEditPart.VISUAL_ID:
				return new LocBindingEditPart(view);

			case InputBindingEditPart.VISUAL_ID:
				return new InputBindingEditPart(view);

			case OutputBindingEditPart.VISUAL_ID:
				return new OutputBindingEditPart(view);

			case LinkBindingEditPart.VISUAL_ID:
				return new LinkBindingEditPart(view);

			case OutputBindingSourceEditPart.VISUAL_ID:
				return new OutputBindingSourceEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapOn()
					&& getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
