package net.sf.ictalive.coordination.wfvv.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.wfvv.diagram.edit.policies.EnactmentCanonicalEditPolicy;
import net.sf.ictalive.coordination.wfvv.diagram.edit.policies.EnactmentItemSemanticEditPolicy;
import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvVisualIDRegistry;
import net.sf.ictalive.coordination.wfvv.diagram.providers.WfvvElementTypes;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
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
public class EnactmentEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2025;

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
	public EnactmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EnactmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new EnactmentCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
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
		EnactmentFigure figure = new EnactmentFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public EnactmentFigure getPrimaryShape() {
		return (EnactmentFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof EnactmentSessionIdEditPart) {
			((EnactmentSessionIdEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureEnactmentFigureSessionIdLabel());
			return true;
		}
		if (childEditPart instanceof EnactmentStartTimeEditPart) {
			((EnactmentStartTimeEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureEnactmentFigureStartTimeLabel());
			return true;
		}
		if (childEditPart instanceof EnactmentFinishTimeEditPart) {
			((EnactmentFinishTimeEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureEnactmentFigureFinishTimeLabel());
			return true;
		}
		if (childEditPart instanceof EnactmentExpireTimeEditPart) {
			((EnactmentExpireTimeEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureEnactmentFigureExpireTimeLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof EnactmentSessionIdEditPart) {
			return true;
		}
		if (childEditPart instanceof EnactmentStartTimeEditPart) {
			return true;
		}
		if (childEditPart instanceof EnactmentFinishTimeEditPart) {
			return true;
		}
		if (childEditPart instanceof EnactmentExpireTimeEditPart) {
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
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(WfvvVisualIDRegistry
				.getType(EnactmentSessionIdEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(WfvvElementTypes.EnactmentResource_4017);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof ResourceEditPart) {
			types.add(WfvvElementTypes.EnactmentResource_4017);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == WfvvElementTypes.EnactmentResource_4017) {
			types.add(WfvvElementTypes.Resource_2027);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(WfvvElementTypes.ActionEnactment_4015);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == WfvvElementTypes.ActionEnactment_4015) {
			types.add(WfvvElementTypes.PlanSynthesis_3015);
		}
		if (relationshipType == WfvvElementTypes.ActionEnactment_4015) {
			types.add(WfvvElementTypes.PlanDistribution_3018);
		}
		if (relationshipType == WfvvElementTypes.ActionEnactment_4015) {
			types.add(WfvvElementTypes.PlanSchedule_3019);
		}
		if (relationshipType == WfvvElementTypes.ActionEnactment_4015) {
			types.add(WfvvElementTypes.PlanExecution_3020);
		}
		if (relationshipType == WfvvElementTypes.ActionEnactment_4015) {
			types.add(WfvvElementTypes.ServiceInvocation_3021);
		}
		if (relationshipType == WfvvElementTypes.ActionEnactment_4015) {
			types.add(WfvvElementTypes.ReplaceAgent_3022);
		}
		if (relationshipType == WfvvElementTypes.ActionEnactment_4015) {
			types.add(WfvvElementTypes.AgentReplan_3023);
		}
		if (relationshipType == WfvvElementTypes.ActionEnactment_4015) {
			types.add(WfvvElementTypes.NotifyStateOfWorld_3024);
		}
		if (relationshipType == WfvvElementTypes.ActionEnactment_4015) {
			types.add(WfvvElementTypes.CoordinationAction_3028);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class EnactmentFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnactmentFigureExpireTimeLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnactmentFigureFinishTimeLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnactmentFigureStartTimeLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnactmentFigureSessionIdLabel;

		/**
		 * @generated
		 */
		public EnactmentFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(false);

			this.setLayoutManager(layoutThis);

			this.setLineWidth(1);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			WrappingLabel enactmentFigureTitleLabel0 = new WrappingLabel();
			enactmentFigureTitleLabel0.setText("Enactment");

			this.add(enactmentFigureTitleLabel0);

			fFigureEnactmentFigureSessionIdLabel = new WrappingLabel();
			fFigureEnactmentFigureSessionIdLabel.setText("");

			this.add(fFigureEnactmentFigureSessionIdLabel);

			fFigureEnactmentFigureStartTimeLabel = new WrappingLabel();
			fFigureEnactmentFigureStartTimeLabel.setText("");

			this.add(fFigureEnactmentFigureStartTimeLabel);

			fFigureEnactmentFigureExpireTimeLabel = new WrappingLabel();
			fFigureEnactmentFigureExpireTimeLabel.setText("");

			this.add(fFigureEnactmentFigureExpireTimeLabel);

			fFigureEnactmentFigureFinishTimeLabel = new WrappingLabel();
			fFigureEnactmentFigureFinishTimeLabel.setText("");

			this.add(fFigureEnactmentFigureFinishTimeLabel);

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
		public WrappingLabel getFigureEnactmentFigureExpireTimeLabel() {
			return fFigureEnactmentFigureExpireTimeLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnactmentFigureFinishTimeLabel() {
			return fFigureEnactmentFigureFinishTimeLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnactmentFigureStartTimeLabel() {
			return fFigureEnactmentFigureStartTimeLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnactmentFigureSessionIdLabel() {
			return fFigureEnactmentFigureSessionIdLabel;
		}

	}

}
