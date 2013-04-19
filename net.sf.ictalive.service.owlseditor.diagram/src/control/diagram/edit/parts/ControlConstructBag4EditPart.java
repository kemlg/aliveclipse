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

import control.diagram.edit.policies.ControlConstructBag4ItemSemanticEditPolicy;
import control.diagram.edit.policies.OpenDiagramEditPolicy;
import control.diagram.part.ControlVisualIDRegistry;

/**
 * @generated
 */
public class ControlConstructBag4EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3012;

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
	public ControlConstructBag4EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ControlConstructBag4ItemSemanticEditPolicy());
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
		ControlConstructBagFigure figure = new ControlConstructBagFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ControlConstructBagFigure getPrimaryShape() {
		return (ControlConstructBagFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ControlConstructBagName4EditPart) {
			((ControlConstructBagName4EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureControlConstructBagLabelFigure());
			return true;
		}
		if (childEditPart instanceof ControlConstructBagControlConstructBagFirstCompartment4EditPart) {
			IFigure pane = getPrimaryShape()
					.getControlConstructBagFirstCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((ControlConstructBagControlConstructBagFirstCompartment4EditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof ControlConstructBagControlConstructBagRestCompartment4EditPart) {
			IFigure pane = getPrimaryShape()
					.getControlConstructBagRestCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((ControlConstructBagControlConstructBagRestCompartment4EditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ControlConstructBagName4EditPart) {
			return true;
		}
		if (childEditPart instanceof ControlConstructBagControlConstructBagFirstCompartment4EditPart) {
			IFigure pane = getPrimaryShape()
					.getControlConstructBagFirstCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((ControlConstructBagControlConstructBagFirstCompartment4EditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof ControlConstructBagControlConstructBagRestCompartment4EditPart) {
			IFigure pane = getPrimaryShape()
					.getControlConstructBagRestCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((ControlConstructBagControlConstructBagRestCompartment4EditPart) childEditPart)
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
		if (editPart instanceof ControlConstructBagControlConstructBagFirstCompartment4EditPart) {
			return getPrimaryShape()
					.getControlConstructBagFirstCompartmentFigure();
		}
		if (editPart instanceof ControlConstructBagControlConstructBagRestCompartment4EditPart) {
			return getPrimaryShape()
					.getControlConstructBagRestCompartmentFigure();
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
				.getType(ControlConstructBagName4EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ControlConstructBagFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureControlConstructBagLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fControlConstructBagFirstCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fControlConstructBagRestCompartmentFigure;

		/**
		 * @generated
		 */
		public ControlConstructBagFigure() {
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

			fFigureControlConstructBagLabelFigure = new WrappingLabel();
			fFigureControlConstructBagLabelFigure
					.setText("ControlConstructBag");
			fFigureControlConstructBagLabelFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureControlConstructBagLabelFigure);

			fControlConstructBagFirstCompartmentFigure = new RectangleFigure();
			fControlConstructBagFirstCompartmentFigure.setOutline(false);
			fControlConstructBagFirstCompartmentFigure.setLineWidth(1);

			this.add(fControlConstructBagFirstCompartmentFigure);

			fControlConstructBagRestCompartmentFigure = new RectangleFigure();
			fControlConstructBagRestCompartmentFigure.setOutline(false);
			fControlConstructBagRestCompartmentFigure.setLineWidth(1);

			this.add(fControlConstructBagRestCompartmentFigure);

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
		public WrappingLabel getFigureControlConstructBagLabelFigure() {
			return fFigureControlConstructBagLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getControlConstructBagFirstCompartmentFigure() {
			return fControlConstructBagFirstCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getControlConstructBagRestCompartmentFigure() {
			return fControlConstructBagRestCompartmentFigure;
		}

	}

}
