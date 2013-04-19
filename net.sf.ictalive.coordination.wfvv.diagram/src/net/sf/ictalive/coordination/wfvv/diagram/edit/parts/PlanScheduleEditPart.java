package net.sf.ictalive.coordination.wfvv.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.wfvv.diagram.edit.policies.PlanScheduleCanonicalEditPolicy;
import net.sf.ictalive.coordination.wfvv.diagram.edit.policies.PlanScheduleItemSemanticEditPolicy;
import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvVisualIDRegistry;
import net.sf.ictalive.coordination.wfvv.diagram.providers.WfvvElementTypes;

import org.eclipse.draw2d.FlowLayout;
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
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class PlanScheduleEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3019;

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
	public PlanScheduleEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PlanScheduleItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new PlanScheduleCanonicalEditPolicy());
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
		PlanScheduleActionFigure figure = new PlanScheduleActionFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public PlanScheduleActionFigure getPrimaryShape() {
		return (PlanScheduleActionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PlanSchedulePlanScheduleCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigurePlanScheduleFigureRectangleCompartmentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((PlanSchedulePlanScheduleCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PlanSchedulePlanScheduleCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigurePlanScheduleFigureRectangleCompartmentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((PlanSchedulePlanScheduleCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof PlanSchedulePlanScheduleCompartmentEditPart) {
			return getPrimaryShape()
					.getFigurePlanScheduleFigureRectangleCompartmentRectangle();
		}
		return getContentPane();
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
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
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
		types.add(WfvvElementTypes.PlanningActionsPlan_4005);
		types.add(WfvvElementTypes.ActionByActor_4014);
		types.add(WfvvElementTypes.ActionEnactment_4015);
		types.add(WfvvElementTypes.ActionCause_4016);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof PlanEditPart) {
			types.add(WfvvElementTypes.PlanningActionsPlan_4005);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(WfvvElementTypes.ActionByActor_4014);
		}
		if (targetEditPart instanceof ActionEnactment2EditPart) {
			types.add(WfvvElementTypes.ActionEnactment_4015);
		}
		if (targetEditPart instanceof PlanEnactmentEditPart) {
			types.add(WfvvElementTypes.ActionEnactment_4015);
		}
		if (targetEditPart instanceof EnactmentEditPart) {
			types.add(WfvvElementTypes.ActionEnactment_4015);
		}
		if (targetEditPart instanceof StartedActEditPart) {
			types.add(WfvvElementTypes.ActionCause_4016);
		}
		if (targetEditPart instanceof ExecutedActEditPart) {
			types.add(WfvvElementTypes.ActionCause_4016);
		}
		if (targetEditPart instanceof FailureActEditPart) {
			types.add(WfvvElementTypes.ActionCause_4016);
		}
		if (targetEditPart instanceof DisasterEditPart) {
			types.add(WfvvElementTypes.ActionCause_4016);
		}
		if (targetEditPart instanceof NormInstanceViolatedEditPart) {
			types.add(WfvvElementTypes.ActionCause_4016);
		}
		if (targetEditPart instanceof ReceiveActEditPart) {
			types.add(WfvvElementTypes.ActionCause_4016);
		}
		if (targetEditPart instanceof SendActEditPart) {
			types.add(WfvvElementTypes.ActionCause_4016);
		}
		if (targetEditPart instanceof DeadlineViolationEditPart) {
			types.add(WfvvElementTypes.ActionCause_4016);
		}
		if (targetEditPart instanceof TaskViolationEditPart) {
			types.add(WfvvElementTypes.ActionCause_4016);
		}
		if (targetEditPart instanceof AvailabilityEditPart) {
			types.add(WfvvElementTypes.ActionCause_4016);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == WfvvElementTypes.PlanningActionsPlan_4005) {
			types.add(WfvvElementTypes.Plan_2014);
		}
		if (relationshipType == WfvvElementTypes.ActionByActor_4014) {
			types.add(WfvvElementTypes.Actor_2026);
		}
		if (relationshipType == WfvvElementTypes.ActionEnactment_4015) {
			types.add(WfvvElementTypes.ActionEnactment_2020);
		}
		if (relationshipType == WfvvElementTypes.ActionEnactment_4015) {
			types.add(WfvvElementTypes.PlanEnactment_2021);
		}
		if (relationshipType == WfvvElementTypes.ActionEnactment_4015) {
			types.add(WfvvElementTypes.Enactment_2025);
		}
		if (relationshipType == WfvvElementTypes.ActionCause_4016) {
			types.add(WfvvElementTypes.StartedAct_3003);
		}
		if (relationshipType == WfvvElementTypes.ActionCause_4016) {
			types.add(WfvvElementTypes.ExecutedAct_3004);
		}
		if (relationshipType == WfvvElementTypes.ActionCause_4016) {
			types.add(WfvvElementTypes.FailureAct_3005);
		}
		if (relationshipType == WfvvElementTypes.ActionCause_4016) {
			types.add(WfvvElementTypes.Disaster_3006);
		}
		if (relationshipType == WfvvElementTypes.ActionCause_4016) {
			types.add(WfvvElementTypes.NormInstanceViolated_3007);
		}
		if (relationshipType == WfvvElementTypes.ActionCause_4016) {
			types.add(WfvvElementTypes.ReceiveAct_3008);
		}
		if (relationshipType == WfvvElementTypes.ActionCause_4016) {
			types.add(WfvvElementTypes.SendAct_3010);
		}
		if (relationshipType == WfvvElementTypes.ActionCause_4016) {
			types.add(WfvvElementTypes.DeadlineViolation_3012);
		}
		if (relationshipType == WfvvElementTypes.ActionCause_4016) {
			types.add(WfvvElementTypes.TaskViolation_3013);
		}
		if (relationshipType == WfvvElementTypes.ActionCause_4016) {
			types.add(WfvvElementTypes.Availability_3014);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(WfvvElementTypes.FactDueTo_4001);
		types.add(WfvvElementTypes.FactEffect_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == WfvvElementTypes.FactDueTo_4001) {
			types.add(WfvvElementTypes.StartedAct_3003);
		}
		if (relationshipType == WfvvElementTypes.FactDueTo_4001) {
			types.add(WfvvElementTypes.ExecutedAct_3004);
		}
		if (relationshipType == WfvvElementTypes.FactDueTo_4001) {
			types.add(WfvvElementTypes.FailureAct_3005);
		}
		if (relationshipType == WfvvElementTypes.FactDueTo_4001) {
			types.add(WfvvElementTypes.Disaster_3006);
		}
		if (relationshipType == WfvvElementTypes.FactDueTo_4001) {
			types.add(WfvvElementTypes.NormInstanceViolated_3007);
		}
		if (relationshipType == WfvvElementTypes.FactDueTo_4001) {
			types.add(WfvvElementTypes.ReceiveAct_3008);
		}
		if (relationshipType == WfvvElementTypes.FactDueTo_4001) {
			types.add(WfvvElementTypes.SendAct_3010);
		}
		if (relationshipType == WfvvElementTypes.FactDueTo_4001) {
			types.add(WfvvElementTypes.DeadlineViolation_3012);
		}
		if (relationshipType == WfvvElementTypes.FactDueTo_4001) {
			types.add(WfvvElementTypes.TaskViolation_3013);
		}
		if (relationshipType == WfvvElementTypes.FactDueTo_4001) {
			types.add(WfvvElementTypes.Availability_3014);
		}
		if (relationshipType == WfvvElementTypes.FactEffect_4002) {
			types.add(WfvvElementTypes.StartedAct_3003);
		}
		if (relationshipType == WfvvElementTypes.FactEffect_4002) {
			types.add(WfvvElementTypes.ExecutedAct_3004);
		}
		if (relationshipType == WfvvElementTypes.FactEffect_4002) {
			types.add(WfvvElementTypes.FailureAct_3005);
		}
		if (relationshipType == WfvvElementTypes.FactEffect_4002) {
			types.add(WfvvElementTypes.Disaster_3006);
		}
		if (relationshipType == WfvvElementTypes.FactEffect_4002) {
			types.add(WfvvElementTypes.NormInstanceViolated_3007);
		}
		if (relationshipType == WfvvElementTypes.FactEffect_4002) {
			types.add(WfvvElementTypes.ReceiveAct_3008);
		}
		if (relationshipType == WfvvElementTypes.FactEffect_4002) {
			types.add(WfvvElementTypes.SendAct_3010);
		}
		if (relationshipType == WfvvElementTypes.FactEffect_4002) {
			types.add(WfvvElementTypes.DeadlineViolation_3012);
		}
		if (relationshipType == WfvvElementTypes.FactEffect_4002) {
			types.add(WfvvElementTypes.TaskViolation_3013);
		}
		if (relationshipType == WfvvElementTypes.FactEffect_4002) {
			types.add(WfvvElementTypes.Availability_3014);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == WfvvElementTypes.Parameter_3016) {
				return getChildBySemanticHint(WfvvVisualIDRegistry
						.getType(PlanSchedulePlanScheduleCompartmentEditPart.VISUAL_ID));
			}
			if (type == WfvvElementTypes.Result_3017) {
				return getChildBySemanticHint(WfvvVisualIDRegistry
						.getType(PlanSchedulePlanScheduleCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class PlanScheduleActionFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigurePlanScheduleFigureRectangleCompartmentRectangle;

		/**
		 * @generated
		 */
		public PlanScheduleActionFigure() {

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

			WrappingLabel planScheduleFigureRectangleTitleLabel0 = new WrappingLabel();
			planScheduleFigureRectangleTitleLabel0.setText("Plan Schedule");

			this.add(planScheduleFigureRectangleTitleLabel0);

			GridLayout layoutPlanScheduleFigureRectangleTitleLabel0 = new GridLayout();
			layoutPlanScheduleFigureRectangleTitleLabel0.numColumns = 1;
			layoutPlanScheduleFigureRectangleTitleLabel0.makeColumnsEqualWidth = true;
			planScheduleFigureRectangleTitleLabel0
					.setLayoutManager(layoutPlanScheduleFigureRectangleTitleLabel0);

			fFigurePlanScheduleFigureRectangleCompartmentRectangle = new RectangleFigure();
			fFigurePlanScheduleFigureRectangleCompartmentRectangle
					.setLineWidth(1);

			GridData constraintFFigurePlanScheduleFigureRectangleCompartmentRectangle = new GridData();
			constraintFFigurePlanScheduleFigureRectangleCompartmentRectangle.verticalAlignment = GridData.FILL;
			constraintFFigurePlanScheduleFigureRectangleCompartmentRectangle.horizontalAlignment = GridData.FILL;
			constraintFFigurePlanScheduleFigureRectangleCompartmentRectangle.horizontalIndent = 0;
			constraintFFigurePlanScheduleFigureRectangleCompartmentRectangle.horizontalSpan = 1;
			constraintFFigurePlanScheduleFigureRectangleCompartmentRectangle.verticalSpan = 1;
			constraintFFigurePlanScheduleFigureRectangleCompartmentRectangle.grabExcessHorizontalSpace = true;
			constraintFFigurePlanScheduleFigureRectangleCompartmentRectangle.grabExcessVerticalSpace = true;
			this
					.add(
							fFigurePlanScheduleFigureRectangleCompartmentRectangle,
							constraintFFigurePlanScheduleFigureRectangleCompartmentRectangle);

			FlowLayout layoutFFigurePlanScheduleFigureRectangleCompartmentRectangle = new FlowLayout();
			layoutFFigurePlanScheduleFigureRectangleCompartmentRectangle
					.setStretchMinorAxis(false);
			layoutFFigurePlanScheduleFigureRectangleCompartmentRectangle
					.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutFFigurePlanScheduleFigureRectangleCompartmentRectangle
					.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutFFigurePlanScheduleFigureRectangleCompartmentRectangle
					.setMajorSpacing(5);
			layoutFFigurePlanScheduleFigureRectangleCompartmentRectangle
					.setMinorSpacing(5);
			layoutFFigurePlanScheduleFigureRectangleCompartmentRectangle
					.setHorizontal(true);

			fFigurePlanScheduleFigureRectangleCompartmentRectangle
					.setLayoutManager(layoutFFigurePlanScheduleFigureRectangleCompartmentRectangle);

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

		/**
		 * @generated
		 */
		public RectangleFigure getFigurePlanScheduleFigureRectangleCompartmentRectangle() {
			return fFigurePlanScheduleFigureRectangleCompartmentRectangle;
		}

	}

}
