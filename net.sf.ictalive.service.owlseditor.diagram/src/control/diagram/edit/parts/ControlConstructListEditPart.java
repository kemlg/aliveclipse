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

import control.diagram.edit.policies.ControlConstructListItemSemanticEditPolicy;
import control.diagram.edit.policies.OpenDiagramEditPolicy;
import control.diagram.part.ControlVisualIDRegistry;

/**
 * @generated
 */
public class ControlConstructListEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

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
	public ControlConstructListEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ControlConstructListItemSemanticEditPolicy());
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
		ControlConstructListFigure figure = new ControlConstructListFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ControlConstructListFigure getPrimaryShape() {
		return (ControlConstructListFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ControlConstructListNameEditPart) {
			((ControlConstructListNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureControlConstructListLabelFigure());
			return true;
		}
		if (childEditPart instanceof ControlConstructListControlConstructListFirstCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getControlConstructListFirstCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((ControlConstructListControlConstructListFirstCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof ControlConstructListControlConstructListRestCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getControlConstructListRestCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((ControlConstructListControlConstructListRestCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ControlConstructListNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ControlConstructListControlConstructListFirstCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getControlConstructListFirstCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((ControlConstructListControlConstructListFirstCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof ControlConstructListControlConstructListRestCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getControlConstructListRestCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((ControlConstructListControlConstructListRestCompartmentEditPart) childEditPart)
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
		if (editPart instanceof ControlConstructListControlConstructListFirstCompartmentEditPart) {
			return getPrimaryShape()
					.getControlConstructListFirstCompartmentFigure();
		}
		if (editPart instanceof ControlConstructListControlConstructListRestCompartmentEditPart) {
			return getPrimaryShape()
					.getControlConstructListRestCompartmentFigure();
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
				.getType(ControlConstructListNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ControlConstructListFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureControlConstructListLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fControlConstructListFirstCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fControlConstructListRestCompartmentFigure;

		/**
		 * @generated
		 */
		public ControlConstructListFigure() {
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

			fFigureControlConstructListLabelFigure = new WrappingLabel();
			fFigureControlConstructListLabelFigure
					.setText("ControlConstructList");
			fFigureControlConstructListLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000),
							getMapMode().DPtoLP(50)));

			this.add(fFigureControlConstructListLabelFigure);

			fControlConstructListFirstCompartmentFigure = new RectangleFigure();
			fControlConstructListFirstCompartmentFigure.setOutline(false);
			fControlConstructListFirstCompartmentFigure.setLineWidth(1);

			this.add(fControlConstructListFirstCompartmentFigure);

			fControlConstructListRestCompartmentFigure = new RectangleFigure();
			fControlConstructListRestCompartmentFigure.setOutline(false);
			fControlConstructListRestCompartmentFigure.setLineWidth(1);

			this.add(fControlConstructListRestCompartmentFigure);

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
		public WrappingLabel getFigureControlConstructListLabelFigure() {
			return fFigureControlConstructListLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getControlConstructListFirstCompartmentFigure() {
			return fControlConstructListFirstCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getControlConstructListRestCompartmentFigure() {
			return fControlConstructListRestCompartmentFigure;
		}

	}

}
