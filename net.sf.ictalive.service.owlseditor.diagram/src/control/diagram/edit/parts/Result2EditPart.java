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
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
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

import control.diagram.edit.policies.OpenDiagramEditPolicy;
import control.diagram.edit.policies.Result2ItemSemanticEditPolicy;
import control.diagram.part.ControlVisualIDRegistry;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class Result2EditPart extends AbstractBorderItemEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3107;

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
	public Result2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				getPrimaryDragEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Result2ItemSemanticEditPolicy());
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
		ResultFigure figure = new ResultFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ResultFigure getPrimaryShape() {
		return (ResultFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ResultName2EditPart) {
			((ResultName2EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureResultLabelFigure());
			return true;
		}
		if (childEditPart instanceof ResultResultInConditionCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getResultInConditionCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((ResultResultInConditionCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof ResultResultHasResultVarCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getResultHasResultVarCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((ResultResultHasResultVarCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof ResultResultHasEffectCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getResultHasEffectCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ResultResultHasEffectCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ResultResultBindingSourceCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getResultBindingSourceCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((ResultResultBindingSourceCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ResultName2EditPart) {
			return true;
		}
		if (childEditPart instanceof ResultResultInConditionCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getResultInConditionCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((ResultResultInConditionCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof ResultResultHasResultVarCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getResultHasResultVarCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((ResultResultHasResultVarCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof ResultResultHasEffectCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getResultHasEffectCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((ResultResultHasEffectCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof ResultResultBindingSourceCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getResultBindingSourceCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((ResultResultBindingSourceCompartmentEditPart) childEditPart)
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
		if (editPart instanceof ResultResultInConditionCompartmentEditPart) {
			return getPrimaryShape().getResultInConditionCompartmentFigure();
		}
		if (editPart instanceof ResultResultHasResultVarCompartmentEditPart) {
			return getPrimaryShape().getResultHasResultVarCompartmentFigure();
		}
		if (editPart instanceof ResultResultHasEffectCompartmentEditPart) {
			return getPrimaryShape().getResultHasEffectCompartmentFigure();
		}
		if (editPart instanceof ResultResultBindingSourceCompartmentEditPart) {
			return getPrimaryShape().getResultBindingSourceCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);

		//FIXME: workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());
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
				.getType(ResultName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ResultFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureResultLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fResultInConditionCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fResultHasResultVarCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fResultHasEffectCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fResultBindingSourceCompartmentFigure;

		/**
		 * @generated
		 */
		public ResultFigure() {
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

			fFigureResultLabelFigure = new WrappingLabel();
			fFigureResultLabelFigure.setText("Result");
			fFigureResultLabelFigure.setMaximumSize(new Dimension(getMapMode()
					.DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureResultLabelFigure);

			fResultInConditionCompartmentFigure = new RectangleFigure();
			fResultInConditionCompartmentFigure.setOutline(false);
			fResultInConditionCompartmentFigure.setLineWidth(1);

			this.add(fResultInConditionCompartmentFigure);

			fResultHasResultVarCompartmentFigure = new RectangleFigure();
			fResultHasResultVarCompartmentFigure.setOutline(false);
			fResultHasResultVarCompartmentFigure.setLineWidth(1);

			this.add(fResultHasResultVarCompartmentFigure);

			fResultHasEffectCompartmentFigure = new RectangleFigure();
			fResultHasEffectCompartmentFigure.setOutline(false);
			fResultHasEffectCompartmentFigure.setLineWidth(1);

			this.add(fResultHasEffectCompartmentFigure);

			fResultBindingSourceCompartmentFigure = new RectangleFigure();
			fResultBindingSourceCompartmentFigure.setOutline(false);
			fResultBindingSourceCompartmentFigure.setLineWidth(1);

			this.add(fResultBindingSourceCompartmentFigure);

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
		public WrappingLabel getFigureResultLabelFigure() {
			return fFigureResultLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getResultInConditionCompartmentFigure() {
			return fResultInConditionCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getResultHasResultVarCompartmentFigure() {
			return fResultHasResultVarCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getResultHasEffectCompartmentFigure() {
			return fResultHasEffectCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getResultBindingSourceCompartmentFigure() {
			return fResultBindingSourceCompartmentFigure;
		}

	}

}
