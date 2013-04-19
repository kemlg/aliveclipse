/*
 * 
 */
package control.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
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
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import control.diagram.edit.policies.OpenDiagramEditPolicy;
import control.diagram.edit.policies.RepeatWhileItemSemanticEditPolicy;
import control.diagram.part.ControlVisualIDRegistry;

/**
 * @generated
 */
public class RepeatWhileEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2011;

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
	public RepeatWhileEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new RepeatWhileItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenDiagramEditPolicy());
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
		RepeatWhileFigure figure = new RepeatWhileFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public RepeatWhileFigure getPrimaryShape() {
		return (RepeatWhileFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RepeatWhileNameEditPart) {
			((RepeatWhileNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureRepeatWhileLabelFigure());
			return true;
		}
		if (childEditPart instanceof RepeatWhileRepeatWhileWhileConditionCompartment7EditPart) {
			IFigure pane = getPrimaryShape()
					.getRepeatWhileWhileConditionCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((RepeatWhileRepeatWhileWhileConditionCompartment7EditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof RepeatWhileRepeatWhileWhileProcessCompartment7EditPart) {
			IFigure pane = getPrimaryShape()
					.getRepeatWhileWhileProcessCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((RepeatWhileRepeatWhileWhileProcessCompartment7EditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RepeatWhileNameEditPart) {
			return true;
		}
		if (childEditPart instanceof RepeatWhileRepeatWhileWhileConditionCompartment7EditPart) {
			IFigure pane = getPrimaryShape()
					.getRepeatWhileWhileConditionCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((RepeatWhileRepeatWhileWhileConditionCompartment7EditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof RepeatWhileRepeatWhileWhileProcessCompartment7EditPart) {
			IFigure pane = getPrimaryShape()
					.getRepeatWhileWhileProcessCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((RepeatWhileRepeatWhileWhileProcessCompartment7EditPart) childEditPart)
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
		if (editPart instanceof RepeatWhileRepeatWhileWhileConditionCompartment7EditPart) {
			return getPrimaryShape()
					.getRepeatWhileWhileConditionCompartmentFigure();
		}
		if (editPart instanceof RepeatWhileRepeatWhileWhileProcessCompartment7EditPart) {
			return getPrimaryShape()
					.getRepeatWhileWhileProcessCompartmentFigure();
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
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ControlVisualIDRegistry
				.getType(RepeatWhileNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class RepeatWhileFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureRepeatWhileLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fRepeatWhileWhileConditionCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fRepeatWhileWhileProcessCompartmentFigure;

		/**
		 * @generated
		 */
		public RepeatWhileFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setLineWidth(1);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureRepeatWhileLabelFigure = new WrappingLabel();
			fFigureRepeatWhileLabelFigure.setText("RepeatWhile");
			fFigureRepeatWhileLabelFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureRepeatWhileLabelFigure);

			fRepeatWhileWhileConditionCompartmentFigure = new RectangleFigure();
			fRepeatWhileWhileConditionCompartmentFigure.setOutline(false);
			fRepeatWhileWhileConditionCompartmentFigure.setLineWidth(1);

			this.add(fRepeatWhileWhileConditionCompartmentFigure);

			fRepeatWhileWhileProcessCompartmentFigure = new RectangleFigure();
			fRepeatWhileWhileProcessCompartmentFigure.setOutline(false);
			fRepeatWhileWhileProcessCompartmentFigure.setLineWidth(1);

			this.add(fRepeatWhileWhileProcessCompartmentFigure);

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
		public WrappingLabel getFigureRepeatWhileLabelFigure() {
			return fFigureRepeatWhileLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getRepeatWhileWhileConditionCompartmentFigure() {
			return fRepeatWhileWhileConditionCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getRepeatWhileWhileProcessCompartmentFigure() {
			return fRepeatWhileWhileProcessCompartmentFigure;
		}

	}

}
