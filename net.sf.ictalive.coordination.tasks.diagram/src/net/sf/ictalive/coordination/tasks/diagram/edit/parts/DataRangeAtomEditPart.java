package net.sf.ictalive.coordination.tasks.diagram.edit.parts;

import net.sf.ictalive.coordination.tasks.diagram.edit.policies.CoordinationTextSelectionEditPolicy;
import net.sf.ictalive.coordination.tasks.diagram.edit.policies.DataRangeAtomCanonicalEditPolicy;
import net.sf.ictalive.coordination.tasks.diagram.edit.policies.DataRangeAtomItemSemanticEditPolicy;

import net.sf.ictalive.coordination.tasks.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.coordination.tasks.diagram.providers.CoordinationElementTypes;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
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
public class DataRangeAtomEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3048;

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
	public DataRangeAtomEditPart(View view) {
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
				new DataRangeAtomItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new DataRangeAtomCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		ConstrainedToolbarLayoutEditPolicy lep = new ConstrainedToolbarLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
					if (child instanceof ITextAwareEditPart) {
						return new CoordinationTextSelectionEditPolicy();
					}
				}
				return super.createChildEditPolicy(child);
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		DataRangeAtomFigure figure = new DataRangeAtomFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public DataRangeAtomFigure getPrimaryShape() {
		return (DataRangeAtomFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DataRangeAtomDataRangeArgCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureDataRangeAtomFigureArgRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((DataRangeAtomDataRangeArgCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof DataRangeAtomDataRangeAtomOneOfCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureDataRangeAtomFigureOneOfRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((DataRangeAtomDataRangeAtomOneOfCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DataRangeAtomDataRangeArgCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureDataRangeAtomFigureArgRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((DataRangeAtomDataRangeArgCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof DataRangeAtomDataRangeAtomOneOfCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureDataRangeAtomFigureOneOfRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((DataRangeAtomDataRangeAtomOneOfCompartmentEditPart) childEditPart)
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
		if (editPart instanceof DataRangeAtomDataRangeArgCompartmentEditPart) {
			return getPrimaryShape().getFigureDataRangeAtomFigureArgRectangle();
		}
		if (editPart instanceof DataRangeAtomDataRangeAtomOneOfCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureDataRangeAtomFigureOneOfRectangle();
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
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == CoordinationElementTypes.DataValue_3058) {
				return getChildBySemanticHint(CoordinationVisualIDRegistry
						.getType(DataRangeAtomDataRangeAtomOneOfCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class DataRangeAtomFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureDataRangeAtomFigureOneOfRectangle;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureDataRangeAtomFigureArgRectangle;

		/**
		 * @generated
		 */
		public DataRangeAtomFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutThis.setSpacing(0);
			layoutThis.setVertical(false);

			this.setLayoutManager(layoutThis);

			this.setLineWidth(1);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureDataRangeAtomFigureArgRectangle = new RectangleFigure();
			fFigureDataRangeAtomFigureArgRectangle.setLineWidth(1);

			this.add(fFigureDataRangeAtomFigureArgRectangle);

			WrappingLabel dataRangeAtomFigureArgRectangleTitleLabel1 = new WrappingLabel();
			dataRangeAtomFigureArgRectangleTitleLabel1.setText("Argument");

			fFigureDataRangeAtomFigureArgRectangle
					.add(dataRangeAtomFigureArgRectangleTitleLabel1);

			fFigureDataRangeAtomFigureOneOfRectangle = new RectangleFigure();
			fFigureDataRangeAtomFigureOneOfRectangle.setLineWidth(1);

			this.add(fFigureDataRangeAtomFigureOneOfRectangle);

			WrappingLabel dataRangeAtomFigureOneOfRectangle1 = new WrappingLabel();
			dataRangeAtomFigureOneOfRectangle1.setText("is one of");

			fFigureDataRangeAtomFigureOneOfRectangle
					.add(dataRangeAtomFigureOneOfRectangle1);

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
		public RectangleFigure getFigureDataRangeAtomFigureOneOfRectangle() {
			return fFigureDataRangeAtomFigureOneOfRectangle;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureDataRangeAtomFigureArgRectangle() {
			return fFigureDataRangeAtomFigureArgRectangle;
		}

	}

}
