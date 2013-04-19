package net.sf.ictalive.coordination.actions.diagram.edit.parts;

import net.sf.ictalive.coordination.actions.diagram.part.CoordinationVisualIDRegistry;

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

/**
 * @generated
 */
public class CoordinationEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CoordinationVisualIDRegistry.getVisualID(view)) {

			case ActionsCollectionEditPart.VISUAL_ID:
				return new ActionsCollectionEditPart(view);

			case CompositeActionEditPart.VISUAL_ID:
				return new CompositeActionEditPart(view);

			case CompositeActionNameEditPart.VISUAL_ID:
				return new CompositeActionNameEditPart(view);

			case AtomicActionEditPart.VISUAL_ID:
				return new AtomicActionEditPart(view);

			case AtomicActionNameEditPart.VISUAL_ID:
				return new AtomicActionNameEditPart(view);

			case InputEditPart.VISUAL_ID:
				return new InputEditPart(view);

			case InputNameEditPart.VISUAL_ID:
				return new InputNameEditPart(view);

			case OutputEditPart.VISUAL_ID:
				return new OutputEditPart(view);

			case OutputNameEditPart.VISUAL_ID:
				return new OutputNameEditPart(view);

			case ParticipantEditPart.VISUAL_ID:
				return new ParticipantEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case SequenceEditPart.VISUAL_ID:
				return new SequenceEditPart(view);

			case AnyOrderEditPart.VISUAL_ID:
				return new AnyOrderEditPart(view);

			case ControlConstructBagEditPart.VISUAL_ID:
				return new ControlConstructBagEditPart(view);

			case PerformEditPart.VISUAL_ID:
				return new PerformEditPart(view);

			case ChoiceEditPart.VISUAL_ID:
				return new ChoiceEditPart(view);

			case ControlConstructListEditPart.VISUAL_ID:
				return new ControlConstructListEditPart(view);

			case RepeatUntilEditPart.VISUAL_ID:
				return new RepeatUntilEditPart(view);

			case RepeatWhileEditPart.VISUAL_ID:
				return new RepeatWhileEditPart(view);

			case IfThenElseEditPart.VISUAL_ID:
				return new IfThenElseEditPart(view);

			case InputBindingEditPart.VISUAL_ID:
				return new InputBindingEditPart(view);

			case SplitEditPart.VISUAL_ID:
				return new SplitEditPart(view);

			case SplitJoinEditPart.VISUAL_ID:
				return new SplitJoinEditPart(view);

			case ConditionEditPart.VISUAL_ID:
				return new ConditionEditPart(view);

			case ConditionNameEditPart.VISUAL_ID:
				return new ConditionNameEditPart(view);

			case AtomListEditPart.VISUAL_ID:
				return new AtomListEditPart(view);

			case ClassAtomEditPart.VISUAL_ID:
				return new ClassAtomEditPart(view);

			case WrappingLabel21EditPart.VISUAL_ID:
				return new WrappingLabel21EditPart(view);

			case IndividualIDEditPart.VISUAL_ID:
				return new IndividualIDEditPart(view);

			case WrappingLabel22EditPart.VISUAL_ID:
				return new WrappingLabel22EditPart(view);

			case IndividualVariableEditPart.VISUAL_ID:
				return new IndividualVariableEditPart(view);

			case IndividualVariableNameEditPart.VISUAL_ID:
				return new IndividualVariableNameEditPart(view);

			case IndividualPropertyAtomEditPart.VISUAL_ID:
				return new IndividualPropertyAtomEditPart(view);

			case WrappingLabel23EditPart.VISUAL_ID:
				return new WrappingLabel23EditPart(view);

			case IndividualID2EditPart.VISUAL_ID:
				return new IndividualID2EditPart(view);

			case WrappingLabel24EditPart.VISUAL_ID:
				return new WrappingLabel24EditPart(view);

			case IndividualVariable2EditPart.VISUAL_ID:
				return new IndividualVariable2EditPart(view);

			case IndividualVariableName2EditPart.VISUAL_ID:
				return new IndividualVariableName2EditPart(view);

			case IndividualID3EditPart.VISUAL_ID:
				return new IndividualID3EditPart(view);

			case WrappingLabel25EditPart.VISUAL_ID:
				return new WrappingLabel25EditPart(view);

			case IndividualVariable3EditPart.VISUAL_ID:
				return new IndividualVariable3EditPart(view);

			case IndividualVariableName3EditPart.VISUAL_ID:
				return new IndividualVariableName3EditPart(view);

			case SameIndividualAtomEditPart.VISUAL_ID:
				return new SameIndividualAtomEditPart(view);

			case WrappingLabel26EditPart.VISUAL_ID:
				return new WrappingLabel26EditPart(view);

			case IndividualID4EditPart.VISUAL_ID:
				return new IndividualID4EditPart(view);

			case WrappingLabel27EditPart.VISUAL_ID:
				return new WrappingLabel27EditPart(view);

			case IndividualVariable4EditPart.VISUAL_ID:
				return new IndividualVariable4EditPart(view);

			case IndividualVariableName4EditPart.VISUAL_ID:
				return new IndividualVariableName4EditPart(view);

			case DifferentIndividualsAtomEditPart.VISUAL_ID:
				return new DifferentIndividualsAtomEditPart(view);

			case WrappingLabel28EditPart.VISUAL_ID:
				return new WrappingLabel28EditPart(view);

			case IndividualID5EditPart.VISUAL_ID:
				return new IndividualID5EditPart(view);

			case WrappingLabel29EditPart.VISUAL_ID:
				return new WrappingLabel29EditPart(view);

			case IndividualVariable5EditPart.VISUAL_ID:
				return new IndividualVariable5EditPart(view);

			case IndividualVariableName5EditPart.VISUAL_ID:
				return new IndividualVariableName5EditPart(view);

			case BuiltInAtomEditPart.VISUAL_ID:
				return new BuiltInAtomEditPart(view);

			case BuiltInAtomBuiltInEditPart.VISUAL_ID:
				return new BuiltInAtomBuiltInEditPart(view);

			case DataRangeAtomEditPart.VISUAL_ID:
				return new DataRangeAtomEditPart(view);

			case DataLiteralEditPart.VISUAL_ID:
				return new DataLiteralEditPart(view);

			case DataValueEditPart.VISUAL_ID:
				return new DataValueEditPart(view);

			case DataValueLiteralEditPart.VISUAL_ID:
				return new DataValueLiteralEditPart(view);

			case DataValueTypeEditPart.VISUAL_ID:
				return new DataValueTypeEditPart(view);

			case DataVariableEditPart.VISUAL_ID:
				return new DataVariableEditPart(view);

			case DataVariableNameEditPart.VISUAL_ID:
				return new DataVariableNameEditPart(view);

			case DataValue2EditPart.VISUAL_ID:
				return new DataValue2EditPart(view);

			case DataValueLiteral2EditPart.VISUAL_ID:
				return new DataValueLiteral2EditPart(view);

			case DataValueType2EditPart.VISUAL_ID:
				return new DataValueType2EditPart(view);

			case DatavaluedPropertyAtomEditPart.VISUAL_ID:
				return new DatavaluedPropertyAtomEditPart(view);

			case WrappingLabel30EditPart.VISUAL_ID:
				return new WrappingLabel30EditPart(view);

			case IndividualVariable6EditPart.VISUAL_ID:
				return new IndividualVariable6EditPart(view);

			case IndividualVariableName6EditPart.VISUAL_ID:
				return new IndividualVariableName6EditPart(view);

			case IndividualID6EditPart.VISUAL_ID:
				return new IndividualID6EditPart(view);

			case WrappingLabel31EditPart.VISUAL_ID:
				return new WrappingLabel31EditPart(view);

			case DataLiteral2EditPart.VISUAL_ID:
				return new DataLiteral2EditPart(view);

			case DataVariable2EditPart.VISUAL_ID:
				return new DataVariable2EditPart(view);

			case DataVariableName2EditPart.VISUAL_ID:
				return new DataVariableName2EditPart(view);

			case Condition2EditPart.VISUAL_ID:
				return new Condition2EditPart(view);

			case ConditionName2EditPart.VISUAL_ID:
				return new ConditionName2EditPart(view);

			case AtomicActionResultEditPart.VISUAL_ID:
				return new AtomicActionResultEditPart(view);

			case AtomicActionResultHasDensityEditPart.VISUAL_ID:
				return new AtomicActionResultHasDensityEditPart(view);

			case ExpressionEditPart.VISUAL_ID:
				return new ExpressionEditPart(view);

			case ExpressionNameEditPart.VISUAL_ID:
				return new ExpressionNameEditPart(view);

			case Expression2EditPart.VISUAL_ID:
				return new Expression2EditPart(view);

			case ExpressionName2EditPart.VISUAL_ID:
				return new ExpressionName2EditPart(view);

			case DistributionEditPart.VISUAL_ID:
				return new DistributionEditPart(view);

			case Distribution2EditPart.VISUAL_ID:
				return new Distribution2EditPart(view);

			case Distribution3EditPart.VISUAL_ID:
				return new Distribution3EditPart(view);

			case Condition3EditPart.VISUAL_ID:
				return new Condition3EditPart(view);

			case ConditionName3EditPart.VISUAL_ID:
				return new ConditionName3EditPart(view);

			case Condition4EditPart.VISUAL_ID:
				return new Condition4EditPart(view);

			case ConditionName4EditPart.VISUAL_ID:
				return new ConditionName4EditPart(view);

			case Condition5EditPart.VISUAL_ID:
				return new Condition5EditPart(view);

			case ConditionName5EditPart.VISUAL_ID:
				return new ConditionName5EditPart(view);

			case CompositeActionCompositeActionCompartmentEditPart.VISUAL_ID:
				return new CompositeActionCompositeActionCompartmentEditPart(
						view);

			case AtomListAtomListFigureCompartmentEditPart.VISUAL_ID:
				return new AtomListAtomListFigureCompartmentEditPart(view);

			case ClassAtomClassAtomArgValueCompartmentEditPart.VISUAL_ID:
				return new ClassAtomClassAtomArgValueCompartmentEditPart(view);

			case IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentEditPart.VISUAL_ID:
				return new IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentEditPart(
						view);

			case IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentEditPart.VISUAL_ID:
				return new IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentEditPart(
						view);

			case SameIndividualAtomSameAsAtomArgsCompartmentEditPart.VISUAL_ID:
				return new SameIndividualAtomSameAsAtomArgsCompartmentEditPart(
						view);

			case DifferentIndividualsAtomDifferentFromAtomArgsCompartmentEditPart.VISUAL_ID:
				return new DifferentIndividualsAtomDifferentFromAtomArgsCompartmentEditPart(
						view);

			case DataRangeAtomDataRangeArgCompartmentEditPart.VISUAL_ID:
				return new DataRangeAtomDataRangeArgCompartmentEditPart(view);

			case DataRangeAtomDataRangeAtomOneOfCompartmentEditPart.VISUAL_ID:
				return new DataRangeAtomDataRangeAtomOneOfCompartmentEditPart(
						view);

			case DataLiteralDataLiteralCompartmentEditPart.VISUAL_ID:
				return new DataLiteralDataLiteralCompartmentEditPart(view);

			case DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart.VISUAL_ID:
				return new DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart(
						view);

			case DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart.VISUAL_ID:
				return new DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart(
						view);

			case DataLiteralDataLiteralCompartment2EditPart.VISUAL_ID:
				return new DataLiteralDataLiteralCompartment2EditPart(view);

			case AtomicActionAtomicActionCompartmentEditPart.VISUAL_ID:
				return new AtomicActionAtomicActionCompartmentEditPart(view);

			case AtomicActionResultQualityDistributionCompartmentEditPart.VISUAL_ID:
				return new AtomicActionResultQualityDistributionCompartmentEditPart(
						view);

			case AtomicActionResultCostDistributionCompartmentEditPart.VISUAL_ID:
				return new AtomicActionResultCostDistributionCompartmentEditPart(
						view);

			case AtomicActionResultDurationDistributionCompartmentEditPart.VISUAL_ID:
				return new AtomicActionResultDurationDistributionCompartmentEditPart(
						view);

			case AtomicActionResultAtomicActionResultAddEffectCompartmentEditPart.VISUAL_ID:
				return new AtomicActionResultAtomicActionResultAddEffectCompartmentEditPart(
						view);

			case AtomicActionResultAtomicActionResultDeleteEffectCompartmentEditPart.VISUAL_ID:
				return new AtomicActionResultAtomicActionResultDeleteEffectCompartmentEditPart(
						view);

			case RepeatUntilRepeatUntilCompartmentEditPart.VISUAL_ID:
				return new RepeatUntilRepeatUntilCompartmentEditPart(view);

			case RepeatWhileRepeatWhileCompartmentEditPart.VISUAL_ID:
				return new RepeatWhileRepeatWhileCompartmentEditPart(view);

			case IfThenElseIfThenElseCompartmentEditPart.VISUAL_ID:
				return new IfThenElseIfThenElseCompartmentEditPart(view);

			case ProcessHasInputEditPart.VISUAL_ID:
				return new ProcessHasInputEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case ProcessHasOutputEditPart.VISUAL_ID:
				return new ProcessHasOutputEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case ProcessPerformedByEditPart.VISUAL_ID:
				return new ProcessPerformedByEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case CompositeProcessComposedOfEditPart.VISUAL_ID:
				return new CompositeProcessComposedOfEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case PerformProcessEditPart.VISUAL_ID:
				return new PerformProcessEditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case ChoiceComponentsEditPart.VISUAL_ID:
				return new ChoiceComponentsEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case AnyOrderComponentsEditPart.VISUAL_ID:
				return new AnyOrderComponentsEditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case SequenceComponentsEditPart.VISUAL_ID:
				return new SequenceComponentsEditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

			case SplitComponentsEditPart.VISUAL_ID:
				return new SplitComponentsEditPart(view);

			case WrappingLabel32EditPart.VISUAL_ID:
				return new WrappingLabel32EditPart(view);

			case SplitJoinComponentsEditPart.VISUAL_ID:
				return new SplitJoinComponentsEditPart(view);

			case WrappingLabel33EditPart.VISUAL_ID:
				return new WrappingLabel33EditPart(view);

			case ControlConstructBagRestEditPart.VISUAL_ID:
				return new ControlConstructBagRestEditPart(view);

			case WrappingLabel10EditPart.VISUAL_ID:
				return new WrappingLabel10EditPart(view);

			case ControlConstructListRestEditPart.VISUAL_ID:
				return new ControlConstructListRestEditPart(view);

			case WrappingLabel11EditPart.VISUAL_ID:
				return new WrappingLabel11EditPart(view);

			case IfThenElseThenEditPart.VISUAL_ID:
				return new IfThenElseThenEditPart(view);

			case WrappingLabel12EditPart.VISUAL_ID:
				return new WrappingLabel12EditPart(view);

			case IfThenElseElseEditPart.VISUAL_ID:
				return new IfThenElseElseEditPart(view);

			case WrappingLabel13EditPart.VISUAL_ID:
				return new WrappingLabel13EditPart(view);

			case RepeatUntilUntilProcessEditPart.VISUAL_ID:
				return new RepeatUntilUntilProcessEditPart(view);

			case WrappingLabel14EditPart.VISUAL_ID:
				return new WrappingLabel14EditPart(view);

			case RepeatWhileWhileProcessEditPart.VISUAL_ID:
				return new RepeatWhileWhileProcessEditPart(view);

			case WrappingLabel15EditPart.VISUAL_ID:
				return new WrappingLabel15EditPart(view);

			case ControlConstructBagFirstEditPart.VISUAL_ID:
				return new ControlConstructBagFirstEditPart(view);

			case WrappingLabel16EditPart.VISUAL_ID:
				return new WrappingLabel16EditPart(view);

			case ControlConstructListFirstEditPart.VISUAL_ID:
				return new ControlConstructListFirstEditPart(view);

			case WrappingLabel17EditPart.VISUAL_ID:
				return new WrappingLabel17EditPart(view);

			case PerformHasDataFromEditPart.VISUAL_ID:
				return new PerformHasDataFromEditPart(view);

			case WrappingLabel18EditPart.VISUAL_ID:
				return new WrappingLabel18EditPart(view);

			case BindingValueFromEditPart.VISUAL_ID:
				return new BindingValueFromEditPart(view);

			case WrappingLabel19EditPart.VISUAL_ID:
				return new WrappingLabel19EditPart(view);

			case BindingToParamEditPart.VISUAL_ID:
				return new BindingToParamEditPart(view);

			case WrappingLabel20EditPart.VISUAL_ID:
				return new WrappingLabel20EditPart(view);

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
