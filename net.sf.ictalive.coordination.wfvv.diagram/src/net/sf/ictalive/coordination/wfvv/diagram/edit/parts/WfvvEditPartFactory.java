package net.sf.ictalive.coordination.wfvv.diagram.edit.parts;

import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvVisualIDRegistry;

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
public class WfvvEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (WfvvVisualIDRegistry.getVisualID(view)) {

			case EventModelContainerEditPart.VISUAL_ID:
				return new EventModelContainerEditPart(view);

			case EventEditPart.VISUAL_ID:
				return new EventEditPart(view);

			case EventTimestampEditPart.VISUAL_ID:
				return new EventTimestampEditPart(view);

			case Event2EditPart.VISUAL_ID:
				return new Event2EditPart(view);

			case EventTimestamp2EditPart.VISUAL_ID:
				return new EventTimestamp2EditPart(view);

			case ActionEnactment2EditPart.VISUAL_ID:
				return new ActionEnactment2EditPart(view);

			case ActionEnactmentSessionIdEditPart.VISUAL_ID:
				return new ActionEnactmentSessionIdEditPart(view);

			case ActionEnactmentStartTimeEditPart.VISUAL_ID:
				return new ActionEnactmentStartTimeEditPart(view);

			case ActionEnactmentFinishTimeEditPart.VISUAL_ID:
				return new ActionEnactmentFinishTimeEditPart(view);

			case ActionEnactmentExpireTimeEditPart.VISUAL_ID:
				return new ActionEnactmentExpireTimeEditPart(view);

			case PlanEnactmentEditPart.VISUAL_ID:
				return new PlanEnactmentEditPart(view);

			case PlanEnactmentSessionIdEditPart.VISUAL_ID:
				return new PlanEnactmentSessionIdEditPart(view);

			case PlanEnactmentStartTimeEditPart.VISUAL_ID:
				return new PlanEnactmentStartTimeEditPart(view);

			case PlanEnactmentFinishTimeEditPart.VISUAL_ID:
				return new PlanEnactmentFinishTimeEditPart(view);

			case PlanEnactmentExpireTimeEditPart.VISUAL_ID:
				return new PlanEnactmentExpireTimeEditPart(view);

			case EnactmentEditPart.VISUAL_ID:
				return new EnactmentEditPart(view);

			case EnactmentSessionIdEditPart.VISUAL_ID:
				return new EnactmentSessionIdEditPart(view);

			case EnactmentStartTimeEditPart.VISUAL_ID:
				return new EnactmentStartTimeEditPart(view);

			case EnactmentFinishTimeEditPart.VISUAL_ID:
				return new EnactmentFinishTimeEditPart(view);

			case EnactmentExpireTimeEditPart.VISUAL_ID:
				return new EnactmentExpireTimeEditPart(view);

			case PlanEditPart.VISUAL_ID:
				return new PlanEditPart(view);

			case AgentEditPart.VISUAL_ID:
				return new AgentEditPart(view);

			case AgentNameEditPart.VISUAL_ID:
				return new AgentNameEditPart(view);

			case ActorEditPart.VISUAL_ID:
				return new ActorEditPart(view);

			case ActorNameEditPart.VISUAL_ID:
				return new ActorNameEditPart(view);

			case ServiceEditPart.VISUAL_ID:
				return new ServiceEditPart(view);

			case ObjectiveEditPart.VISUAL_ID:
				return new ObjectiveEditPart(view);

			case ObjectiveNameEditPart.VISUAL_ID:
				return new ObjectiveNameEditPart(view);

			case ResourceEditPart.VISUAL_ID:
				return new ResourceEditPart(view);

			case AtomicActionEditPart.VISUAL_ID:
				return new AtomicActionEditPart(view);

			case AtomicActionNameEditPart.VISUAL_ID:
				return new AtomicActionNameEditPart(view);

			case CompositeActionEditPart.VISUAL_ID:
				return new CompositeActionEditPart(view);

			case EventGroupEditPart.VISUAL_ID:
				return new EventGroupEditPart(view);

			case EventGroupNameEditPart.VISUAL_ID:
				return new EventGroupNameEditPart(view);

			case EventGroup2EditPart.VISUAL_ID:
				return new EventGroup2EditPart(view);

			case EventGroupName2EditPart.VISUAL_ID:
				return new EventGroupName2EditPart(view);

			case ActionGroundingListEditPart.VISUAL_ID:
				return new ActionGroundingListEditPart(view);

			case ActorViewEditPart.VISUAL_ID:
				return new ActorViewEditPart(view);

			case ContentEditPart.VISUAL_ID:
				return new ContentEditPart(view);

			case StartedActEditPart.VISUAL_ID:
				return new StartedActEditPart(view);

			case ExecutedActEditPart.VISUAL_ID:
				return new ExecutedActEditPart(view);

			case FailureActEditPart.VISUAL_ID:
				return new FailureActEditPart(view);

			case DisasterEditPart.VISUAL_ID:
				return new DisasterEditPart(view);

			case NormInstanceViolatedEditPart.VISUAL_ID:
				return new NormInstanceViolatedEditPart(view);

			case ReceiveActEditPart.VISUAL_ID:
				return new ReceiveActEditPart(view);

			case MessageEditPart.VISUAL_ID:
				return new MessageEditPart(view);

			case SendActEditPart.VISUAL_ID:
				return new SendActEditPart(view);

			case Message2EditPart.VISUAL_ID:
				return new Message2EditPart(view);

			case DeadlineViolationEditPart.VISUAL_ID:
				return new DeadlineViolationEditPart(view);

			case DeadlineViolationDealineEditPart.VISUAL_ID:
				return new DeadlineViolationDealineEditPart(view);

			case TaskViolationEditPart.VISUAL_ID:
				return new TaskViolationEditPart(view);

			case AvailabilityEditPart.VISUAL_ID:
				return new AvailabilityEditPart(view);

			case AvailabilityStatusEditPart.VISUAL_ID:
				return new AvailabilityStatusEditPart(view);

			case PlanSynthesisEditPart.VISUAL_ID:
				return new PlanSynthesisEditPart(view);

			case ParameterEditPart.VISUAL_ID:
				return new ParameterEditPart(view);

			case ResultEditPart.VISUAL_ID:
				return new ResultEditPart(view);

			case PlanDistributionEditPart.VISUAL_ID:
				return new PlanDistributionEditPart(view);

			case PlanScheduleEditPart.VISUAL_ID:
				return new PlanScheduleEditPart(view);

			case PlanExecutionEditPart.VISUAL_ID:
				return new PlanExecutionEditPart(view);

			case ServiceInvocationEditPart.VISUAL_ID:
				return new ServiceInvocationEditPart(view);

			case ReplaceAgentEditPart.VISUAL_ID:
				return new ReplaceAgentEditPart(view);

			case AgentReplanEditPart.VISUAL_ID:
				return new AgentReplanEditPart(view);

			case NotifyStateOfWorldEditPart.VISUAL_ID:
				return new NotifyStateOfWorldEditPart(view);

			case CoordinationActionEditPart.VISUAL_ID:
				return new CoordinationActionEditPart(view);

			case Event3EditPart.VISUAL_ID:
				return new Event3EditPart(view);

			case EventTimestamp3EditPart.VISUAL_ID:
				return new EventTimestamp3EditPart(view);

			case ActionGroundingEditPart.VISUAL_ID:
				return new ActionGroundingEditPart(view);

			case EventEventFigureFactCompartmentEditPart.VISUAL_ID:
				return new EventEventFigureFactCompartmentEditPart(view);

			case ContentContentFigureFactCompartmentEditPart.VISUAL_ID:
				return new ContentContentFigureFactCompartmentEditPart(view);

			case ContentContentFigureEffectCompartmentEditPart.VISUAL_ID:
				return new ContentContentFigureEffectCompartmentEditPart(view);

			case ReceiveActReceiveActCompartmentEditPart.VISUAL_ID:
				return new ReceiveActReceiveActCompartmentEditPart(view);

			case SendActSendActCompartmentEditPart.VISUAL_ID:
				return new SendActSendActCompartmentEditPart(view);

			case PlanSynthesisPlanSynthesisCompartmentEditPart.VISUAL_ID:
				return new PlanSynthesisPlanSynthesisCompartmentEditPart(view);

			case PlanDistributionPlanDistributionCompartmentEditPart.VISUAL_ID:
				return new PlanDistributionPlanDistributionCompartmentEditPart(
						view);

			case PlanSchedulePlanScheduleCompartmentEditPart.VISUAL_ID:
				return new PlanSchedulePlanScheduleCompartmentEditPart(view);

			case PlanExecutionPlanExecutionCompartmentEditPart.VISUAL_ID:
				return new PlanExecutionPlanExecutionCompartmentEditPart(view);

			case ServiceInvocationServiceInvocationCompartmentEditPart.VISUAL_ID:
				return new ServiceInvocationServiceInvocationCompartmentEditPart(
						view);

			case ReplaceAgentReplaceAgentCompartmentEditPart.VISUAL_ID:
				return new ReplaceAgentReplaceAgentCompartmentEditPart(view);

			case AgentReplanAgentReplanCompartmentEditPart.VISUAL_ID:
				return new AgentReplanAgentReplanCompartmentEditPart(view);

			case NotifyStateOfWorldNotifyStateOfWorldCompartmentEditPart.VISUAL_ID:
				return new NotifyStateOfWorldNotifyStateOfWorldCompartmentEditPart(
						view);

			case EventGroupEventGroupCompartmentEditPart.VISUAL_ID:
				return new EventGroupEventGroupCompartmentEditPart(view);

			case ActionGroundingListActionGroundingListCompartmentEditPart.VISUAL_ID:
				return new ActionGroundingListActionGroundingListCompartmentEditPart(
						view);

			case FactDueToEditPart.VISUAL_ID:
				return new FactDueToEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case FactEffectEditPart.VISUAL_ID:
				return new FactEffectEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case FactRelateEditPart.VISUAL_ID:
				return new FactRelateEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case PlanningActionsPlanEditPart.VISUAL_ID:
				return new PlanningActionsPlanEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case ServiceInvocationEnactingAgentEditPart.VISUAL_ID:
				return new ServiceInvocationEnactingAgentEditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case FailureActReasonEditPart.VISUAL_ID:
				return new FailureActReasonEditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case DisasterReasonEditPart.VISUAL_ID:
				return new DisasterReasonEditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

			case NSNormsEditPart.VISUAL_ID:
				return new NSNormsEditPart(view);

			case WrappingLabel10EditPart.VISUAL_ID:
				return new WrappingLabel10EditPart(view);

			case CommunicativeActReceiverEditPart.VISUAL_ID:
				return new CommunicativeActReceiverEditPart(view);

			case WrappingLabel11EditPart.VISUAL_ID:
				return new WrappingLabel11EditPart(view);

			case CommunicativeActSenderEditPart.VISUAL_ID:
				return new CommunicativeActSenderEditPart(view);

			case WrappingLabel12EditPart.VISUAL_ID:
				return new WrappingLabel12EditPart(view);

			case TaskViolationUnmetRequirementEditPart.VISUAL_ID:
				return new TaskViolationUnmetRequirementEditPart(view);

			case WrappingLabel13EditPart.VISUAL_ID:
				return new WrappingLabel13EditPart(view);

			case ActionByActorEditPart.VISUAL_ID:
				return new ActionByActorEditPart(view);

			case WrappingLabel14EditPart.VISUAL_ID:
				return new WrappingLabel14EditPart(view);

			case ActionEnactmentEditPart.VISUAL_ID:
				return new ActionEnactmentEditPart(view);

			case WrappingLabel15EditPart.VISUAL_ID:
				return new WrappingLabel15EditPart(view);

			case ActionCauseEditPart.VISUAL_ID:
				return new ActionCauseEditPart(view);

			case WrappingLabel16EditPart.VISUAL_ID:
				return new WrappingLabel16EditPart(view);

			case EnactmentResourceEditPart.VISUAL_ID:
				return new EnactmentResourceEditPart(view);

			case WrappingLabel17EditPart.VISUAL_ID:
				return new WrappingLabel17EditPart(view);

			case CoordinationActionCoordActionEditPart.VISUAL_ID:
				return new CoordinationActionCoordActionEditPart(view);

			case WrappingLabel18EditPart.VISUAL_ID:
				return new WrappingLabel18EditPart(view);

			case CoordinationActionPlanEditPart.VISUAL_ID:
				return new CoordinationActionPlanEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case EventAsserterEditPart.VISUAL_ID:
				return new EventAsserterEditPart(view);

			case WrappingLabel19EditPart.VISUAL_ID:
				return new WrappingLabel19EditPart(view);

			case ActorAgentEditPart.VISUAL_ID:
				return new ActorAgentEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case PlanHasAtomicProcessGroundingListEditPart.VISUAL_ID:
				return new PlanHasAtomicProcessGroundingListEditPart(view);

			case WrappingLabel20EditPart.VISUAL_ID:
				return new WrappingLabel20EditPart(view);

			case ActionGroundingListRestEditPart.VISUAL_ID:
				return new ActionGroundingListRestEditPart(view);

			case WrappingLabel21EditPart.VISUAL_ID:
				return new WrappingLabel21EditPart(view);

			case ActionGroundingOwlsProcessEditPart.VISUAL_ID:
				return new ActionGroundingOwlsProcessEditPart(view);

			case WrappingLabel22EditPart.VISUAL_ID:
				return new WrappingLabel22EditPart(view);

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
