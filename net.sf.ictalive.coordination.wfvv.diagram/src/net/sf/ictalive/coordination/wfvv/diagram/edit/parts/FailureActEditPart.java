package net.sf.ictalive.coordination.wfvv.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.wfvv.diagram.edit.policies.FailureActCanonicalEditPolicy;
import net.sf.ictalive.coordination.wfvv.diagram.edit.policies.FailureActItemSemanticEditPolicy;
import net.sf.ictalive.coordination.wfvv.diagram.providers.WfvvElementTypes;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class FailureActEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3005;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public FailureActEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new FailureActItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new FailureActCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		FailureActFactFigure figure = new FailureActFactFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public FailureActFactFigure getPrimaryShape() {
		return (FailureActFactFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(WfvvElementTypes.FactDueTo_4001);
		types.add(WfvvElementTypes.FactEffect_4002);
		types.add(WfvvElementTypes.FactRelate_4003);
		types.add(WfvvElementTypes.FailureActReason_4008);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof PlanSynthesisEditPart) {
			types.add(WfvvElementTypes.FactDueTo_4001);
		}
		if (targetEditPart instanceof PlanDistributionEditPart) {
			types.add(WfvvElementTypes.FactDueTo_4001);
		}
		if (targetEditPart instanceof PlanScheduleEditPart) {
			types.add(WfvvElementTypes.FactDueTo_4001);
		}
		if (targetEditPart instanceof PlanExecutionEditPart) {
			types.add(WfvvElementTypes.FactDueTo_4001);
		}
		if (targetEditPart instanceof ServiceInvocationEditPart) {
			types.add(WfvvElementTypes.FactDueTo_4001);
		}
		if (targetEditPart instanceof ReplaceAgentEditPart) {
			types.add(WfvvElementTypes.FactDueTo_4001);
		}
		if (targetEditPart instanceof AgentReplanEditPart) {
			types.add(WfvvElementTypes.FactDueTo_4001);
		}
		if (targetEditPart instanceof NotifyStateOfWorldEditPart) {
			types.add(WfvvElementTypes.FactDueTo_4001);
		}
		if (targetEditPart instanceof CoordinationActionEditPart) {
			types.add(WfvvElementTypes.FactDueTo_4001);
		}
		if (targetEditPart instanceof PlanSynthesisEditPart) {
			types.add(WfvvElementTypes.FactEffect_4002);
		}
		if (targetEditPart instanceof PlanDistributionEditPart) {
			types.add(WfvvElementTypes.FactEffect_4002);
		}
		if (targetEditPart instanceof PlanScheduleEditPart) {
			types.add(WfvvElementTypes.FactEffect_4002);
		}
		if (targetEditPart instanceof PlanExecutionEditPart) {
			types.add(WfvvElementTypes.FactEffect_4002);
		}
		if (targetEditPart instanceof ServiceInvocationEditPart) {
			types.add(WfvvElementTypes.FactEffect_4002);
		}
		if (targetEditPart instanceof ReplaceAgentEditPart) {
			types.add(WfvvElementTypes.FactEffect_4002);
		}
		if (targetEditPart instanceof AgentReplanEditPart) {
			types.add(WfvvElementTypes.FactEffect_4002);
		}
		if (targetEditPart instanceof NotifyStateOfWorldEditPart) {
			types.add(WfvvElementTypes.FactEffect_4002);
		}
		if (targetEditPart instanceof CoordinationActionEditPart) {
			types.add(WfvvElementTypes.FactEffect_4002);
		}
		if (targetEditPart instanceof StartedActEditPart) {
			types.add(WfvvElementTypes.FactRelate_4003);
		}
		if (targetEditPart instanceof ExecutedActEditPart) {
			types.add(WfvvElementTypes.FactRelate_4003);
		}
		if (targetEditPart instanceof net.sf.ictalive.coordination.wfvv.diagram.edit.parts.FailureActEditPart) {
			types.add(WfvvElementTypes.FactRelate_4003);
		}
		if (targetEditPart instanceof DisasterEditPart) {
			types.add(WfvvElementTypes.FactRelate_4003);
		}
		if (targetEditPart instanceof NormInstanceViolatedEditPart) {
			types.add(WfvvElementTypes.FactRelate_4003);
		}
		if (targetEditPart instanceof ReceiveActEditPart) {
			types.add(WfvvElementTypes.FactRelate_4003);
		}
		if (targetEditPart instanceof SendActEditPart) {
			types.add(WfvvElementTypes.FactRelate_4003);
		}
		if (targetEditPart instanceof DeadlineViolationEditPart) {
			types.add(WfvvElementTypes.FactRelate_4003);
		}
		if (targetEditPart instanceof TaskViolationEditPart) {
			types.add(WfvvElementTypes.FactRelate_4003);
		}
		if (targetEditPart instanceof AvailabilityEditPart) {
			types.add(WfvvElementTypes.FactRelate_4003);
		}
		if (targetEditPart instanceof ResultEditPart) {
			types.add(WfvvElementTypes.FailureActReason_4008);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == WfvvElementTypes.FactDueTo_4001) {
			types.add(WfvvElementTypes.PlanSynthesis_3015);
		}
		if (relationshipType == WfvvElementTypes.FactDueTo_4001) {
			types.add(WfvvElementTypes.PlanDistribution_3018);
		}
		if (relationshipType == WfvvElementTypes.FactDueTo_4001) {
			types.add(WfvvElementTypes.PlanSchedule_3019);
		}
		if (relationshipType == WfvvElementTypes.FactDueTo_4001) {
			types.add(WfvvElementTypes.PlanExecution_3020);
		}
		if (relationshipType == WfvvElementTypes.FactDueTo_4001) {
			types.add(WfvvElementTypes.ServiceInvocation_3021);
		}
		if (relationshipType == WfvvElementTypes.FactDueTo_4001) {
			types.add(WfvvElementTypes.ReplaceAgent_3022);
		}
		if (relationshipType == WfvvElementTypes.FactDueTo_4001) {
			types.add(WfvvElementTypes.AgentReplan_3023);
		}
		if (relationshipType == WfvvElementTypes.FactDueTo_4001) {
			types.add(WfvvElementTypes.NotifyStateOfWorld_3024);
		}
		if (relationshipType == WfvvElementTypes.FactDueTo_4001) {
			types.add(WfvvElementTypes.CoordinationAction_3028);
		}
		if (relationshipType == WfvvElementTypes.FactEffect_4002) {
			types.add(WfvvElementTypes.PlanSynthesis_3015);
		}
		if (relationshipType == WfvvElementTypes.FactEffect_4002) {
			types.add(WfvvElementTypes.PlanDistribution_3018);
		}
		if (relationshipType == WfvvElementTypes.FactEffect_4002) {
			types.add(WfvvElementTypes.PlanSchedule_3019);
		}
		if (relationshipType == WfvvElementTypes.FactEffect_4002) {
			types.add(WfvvElementTypes.PlanExecution_3020);
		}
		if (relationshipType == WfvvElementTypes.FactEffect_4002) {
			types.add(WfvvElementTypes.ServiceInvocation_3021);
		}
		if (relationshipType == WfvvElementTypes.FactEffect_4002) {
			types.add(WfvvElementTypes.ReplaceAgent_3022);
		}
		if (relationshipType == WfvvElementTypes.FactEffect_4002) {
			types.add(WfvvElementTypes.AgentReplan_3023);
		}
		if (relationshipType == WfvvElementTypes.FactEffect_4002) {
			types.add(WfvvElementTypes.NotifyStateOfWorld_3024);
		}
		if (relationshipType == WfvvElementTypes.FactEffect_4002) {
			types.add(WfvvElementTypes.CoordinationAction_3028);
		}
		if (relationshipType == WfvvElementTypes.FactRelate_4003) {
			types.add(WfvvElementTypes.StartedAct_3003);
		}
		if (relationshipType == WfvvElementTypes.FactRelate_4003) {
			types.add(WfvvElementTypes.ExecutedAct_3004);
		}
		if (relationshipType == WfvvElementTypes.FactRelate_4003) {
			types.add(WfvvElementTypes.FailureAct_3005);
		}
		if (relationshipType == WfvvElementTypes.FactRelate_4003) {
			types.add(WfvvElementTypes.Disaster_3006);
		}
		if (relationshipType == WfvvElementTypes.FactRelate_4003) {
			types.add(WfvvElementTypes.NormInstanceViolated_3007);
		}
		if (relationshipType == WfvvElementTypes.FactRelate_4003) {
			types.add(WfvvElementTypes.ReceiveAct_3008);
		}
		if (relationshipType == WfvvElementTypes.FactRelate_4003) {
			types.add(WfvvElementTypes.SendAct_3010);
		}
		if (relationshipType == WfvvElementTypes.FactRelate_4003) {
			types.add(WfvvElementTypes.DeadlineViolation_3012);
		}
		if (relationshipType == WfvvElementTypes.FactRelate_4003) {
			types.add(WfvvElementTypes.TaskViolation_3013);
		}
		if (relationshipType == WfvvElementTypes.FactRelate_4003) {
			types.add(WfvvElementTypes.Availability_3014);
		}
		if (relationshipType == WfvvElementTypes.FailureActReason_4008) {
			types.add(WfvvElementTypes.Result_3017);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(WfvvElementTypes.FactRelate_4003);
		types.add(WfvvElementTypes.ActionCause_4016);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == WfvvElementTypes.FactRelate_4003) {
			types.add(WfvvElementTypes.StartedAct_3003);
		}
		if (relationshipType == WfvvElementTypes.FactRelate_4003) {
			types.add(WfvvElementTypes.ExecutedAct_3004);
		}
		if (relationshipType == WfvvElementTypes.FactRelate_4003) {
			types.add(WfvvElementTypes.FailureAct_3005);
		}
		if (relationshipType == WfvvElementTypes.FactRelate_4003) {
			types.add(WfvvElementTypes.Disaster_3006);
		}
		if (relationshipType == WfvvElementTypes.FactRelate_4003) {
			types.add(WfvvElementTypes.NormInstanceViolated_3007);
		}
		if (relationshipType == WfvvElementTypes.FactRelate_4003) {
			types.add(WfvvElementTypes.ReceiveAct_3008);
		}
		if (relationshipType == WfvvElementTypes.FactRelate_4003) {
			types.add(WfvvElementTypes.SendAct_3010);
		}
		if (relationshipType == WfvvElementTypes.FactRelate_4003) {
			types.add(WfvvElementTypes.DeadlineViolation_3012);
		}
		if (relationshipType == WfvvElementTypes.FactRelate_4003) {
			types.add(WfvvElementTypes.TaskViolation_3013);
		}
		if (relationshipType == WfvvElementTypes.FactRelate_4003) {
			types.add(WfvvElementTypes.Availability_3014);
		}
		if (relationshipType == WfvvElementTypes.ActionCause_4016) {
			types.add(WfvvElementTypes.PlanSynthesis_3015);
		}
		if (relationshipType == WfvvElementTypes.ActionCause_4016) {
			types.add(WfvvElementTypes.PlanDistribution_3018);
		}
		if (relationshipType == WfvvElementTypes.ActionCause_4016) {
			types.add(WfvvElementTypes.PlanSchedule_3019);
		}
		if (relationshipType == WfvvElementTypes.ActionCause_4016) {
			types.add(WfvvElementTypes.PlanExecution_3020);
		}
		if (relationshipType == WfvvElementTypes.ActionCause_4016) {
			types.add(WfvvElementTypes.ServiceInvocation_3021);
		}
		if (relationshipType == WfvvElementTypes.ActionCause_4016) {
			types.add(WfvvElementTypes.ReplaceAgent_3022);
		}
		if (relationshipType == WfvvElementTypes.ActionCause_4016) {
			types.add(WfvvElementTypes.AgentReplan_3023);
		}
		if (relationshipType == WfvvElementTypes.ActionCause_4016) {
			types.add(WfvvElementTypes.NotifyStateOfWorld_3024);
		}
		if (relationshipType == WfvvElementTypes.ActionCause_4016) {
			types.add(WfvvElementTypes.CoordinationAction_3028);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class FailureActFactFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		public FailureActFactFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setLineWidth(1);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			WrappingLabel failureActFactFigureTitleLabel0 = new WrappingLabel();
			failureActFactFigureTitleLabel0.setText("Failure Act");

			GridData constraintFailureActFactFigureTitleLabel0 = new GridData();
			constraintFailureActFactFigureTitleLabel0.verticalAlignment = GridData.CENTER;
			constraintFailureActFactFigureTitleLabel0.horizontalAlignment = GridData.CENTER;
			constraintFailureActFactFigureTitleLabel0.horizontalIndent = 0;
			constraintFailureActFactFigureTitleLabel0.horizontalSpan = 1;
			constraintFailureActFactFigureTitleLabel0.verticalSpan = 1;
			constraintFailureActFactFigureTitleLabel0.grabExcessHorizontalSpace = false;
			constraintFailureActFactFigureTitleLabel0.grabExcessVerticalSpace = false;
			this.add(failureActFactFigureTitleLabel0,
					constraintFailureActFactFigureTitleLabel0);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

	}

}
