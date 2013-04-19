package net.sf.ictalive.coordination.plans.diagram.edit.parts;

import net.sf.ictalive.coordination.plans.diagram.part.CoordinationVisualIDRegistry;

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

			case PlansCollectionEditPart.VISUAL_ID:
				return new PlansCollectionEditPart(view);

			case PlanEditPart.VISUAL_ID:
				return new PlanEditPart(view);

			case TaskEditPart.VISUAL_ID:
				return new TaskEditPart(view);

			case TaskNameEditPart.VISUAL_ID:
				return new TaskNameEditPart(view);

			case ActionGroundingListEditPart.VISUAL_ID:
				return new ActionGroundingListEditPart(view);

			case AtomicActionEditPart.VISUAL_ID:
				return new AtomicActionEditPart(view);

			case AtomicActionNameEditPart.VISUAL_ID:
				return new AtomicActionNameEditPart(view);

			case CompositeActionEditPart.VISUAL_ID:
				return new CompositeActionEditPart(view);

			case CompositeActionNameEditPart.VISUAL_ID:
				return new CompositeActionNameEditPart(view);

			case InputEditPart.VISUAL_ID:
				return new InputEditPart(view);

			case InputNameEditPart.VISUAL_ID:
				return new InputNameEditPart(view);

			case OutputEditPart.VISUAL_ID:
				return new OutputEditPart(view);

			case OutputNameEditPart.VISUAL_ID:
				return new OutputNameEditPart(view);

			case ActionGroundingEditPart.VISUAL_ID:
				return new ActionGroundingEditPart(view);

			case InputMessageMapEditPart.VISUAL_ID:
				return new InputMessageMapEditPart(view);

			case InputMessageMapMessagePartEditPart.VISUAL_ID:
				return new InputMessageMapMessagePartEditPart(view);

			case ActionGroundingListActionGroundingListCompartmentEditPart.VISUAL_ID:
				return new ActionGroundingListActionGroundingListCompartmentEditPart(
						view);

			case ActionGroundingActionGroundingRectangleEditPart.VISUAL_ID:
				return new ActionGroundingActionGroundingRectangleEditPart(view);

			case ActionGroundingListRestEditPart.VISUAL_ID:
				return new ActionGroundingListRestEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case InputMessageMapParameterEditPart.VISUAL_ID:
				return new InputMessageMapParameterEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case ActionGroundingOwlsProcessEditPart.VISUAL_ID:
				return new ActionGroundingOwlsProcessEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case PlanForTaskEditPart.VISUAL_ID:
				return new PlanForTaskEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case PlanHasAtomicProcessGroundingListEditPart.VISUAL_ID:
				return new PlanHasAtomicProcessGroundingListEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

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
