package net.sf.ictalive.coordination.tasks.diagram.edit.parts;

import net.sf.ictalive.coordination.tasks.diagram.edit.policies.CoordinationTextSelectionEditPolicy;
import net.sf.ictalive.coordination.tasks.diagram.edit.policies.DatavaluedPropertyAtomCanonicalEditPolicy;
import net.sf.ictalive.coordination.tasks.diagram.edit.policies.DatavaluedPropertyAtomItemSemanticEditPolicy;
import net.sf.ictalive.coordination.tasks.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.coordination.tasks.diagram.providers.CoordinationElementTypes;

import org.eclipse.draw2d.FlowLayout;
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
public class DatavaluedPropertyAtomEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3052;

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
	public DatavaluedPropertyAtomEditPart(View view) {
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
				new DatavaluedPropertyAtomItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new DatavaluedPropertyAtomCanonicalEditPolicy());
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
		DataValuedPropertyAtomFigure figure = new DataValuedPropertyAtomFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public DataValuedPropertyAtomFigure getPrimaryShape() {
		return (DataValuedPropertyAtomFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel26EditPart) {
			((WrappingLabel26EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDataValuedPropertyAtomPredicateLabel());
			return true;
		}
		if (childEditPart instanceof DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureDataValuedPropertyAtomArg1Rectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureDataValuedPropertyAtomArg2Rectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel26EditPart) {
			return true;
		}
		if (childEditPart instanceof DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureDataValuedPropertyAtomArg1Rectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureDataValuedPropertyAtomArg2Rectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart) childEditPart)
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
		if (editPart instanceof DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart) {
			return getPrimaryShape()
					.getFigureDataValuedPropertyAtomArg1Rectangle();
		}
		if (editPart instanceof DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart) {
			return getPrimaryShape()
					.getFigureDataValuedPropertyAtomArg2Rectangle();
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
		return getChildBySemanticHint(CoordinationVisualIDRegistry
				.getType(WrappingLabel26EditPart.VISUAL_ID));
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
			if (type == CoordinationElementTypes.IndividualVariable_3053) {
				return getChildBySemanticHint(CoordinationVisualIDRegistry
						.getType(DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart.VISUAL_ID));
			}
			if (type == CoordinationElementTypes.IndividualID_3054) {
				return getChildBySemanticHint(CoordinationVisualIDRegistry
						.getType(DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class DataValuedPropertyAtomFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureDataValuedPropertyAtomArg1Rectangle;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureDataValuedPropertyAtomArg2Rectangle;

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDataValuedPropertyAtomPredicateLabel;

		/**
		 * @generated
		 */
		public DataValuedPropertyAtomFigure() {

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

			fFigureDataValuedPropertyAtomArg1Rectangle = new RectangleFigure();
			fFigureDataValuedPropertyAtomArg1Rectangle.setLineWidth(1);

			this.add(fFigureDataValuedPropertyAtomArg1Rectangle);

			FlowLayout layoutFFigureDataValuedPropertyAtomArg1Rectangle = new FlowLayout();
			layoutFFigureDataValuedPropertyAtomArg1Rectangle
					.setStretchMinorAxis(false);
			layoutFFigureDataValuedPropertyAtomArg1Rectangle
					.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutFFigureDataValuedPropertyAtomArg1Rectangle
					.setMajorAlignment(FlowLayout.ALIGN_CENTER);
			layoutFFigureDataValuedPropertyAtomArg1Rectangle.setMajorSpacing(5);
			layoutFFigureDataValuedPropertyAtomArg1Rectangle.setMinorSpacing(5);
			layoutFFigureDataValuedPropertyAtomArg1Rectangle
					.setHorizontal(false);

			fFigureDataValuedPropertyAtomArg1Rectangle
					.setLayoutManager(layoutFFigureDataValuedPropertyAtomArg1Rectangle);

			WrappingLabel dataValuedPropertyAtomArg1RectangleLabel1 = new WrappingLabel();
			dataValuedPropertyAtomArg1RectangleLabel1.setText("Arg1");

			fFigureDataValuedPropertyAtomArg1Rectangle
					.add(dataValuedPropertyAtomArg1RectangleLabel1);

			fFigureDataValuedPropertyAtomPredicateLabel = new WrappingLabel();
			fFigureDataValuedPropertyAtomPredicateLabel
					.setText("value of predicate concept is");

			this.add(fFigureDataValuedPropertyAtomPredicateLabel);

			fFigureDataValuedPropertyAtomArg2Rectangle = new RectangleFigure();
			fFigureDataValuedPropertyAtomArg2Rectangle.setLineWidth(1);

			this.add(fFigureDataValuedPropertyAtomArg2Rectangle);

			FlowLayout layoutFFigureDataValuedPropertyAtomArg2Rectangle = new FlowLayout();
			layoutFFigureDataValuedPropertyAtomArg2Rectangle
					.setStretchMinorAxis(false);
			layoutFFigureDataValuedPropertyAtomArg2Rectangle
					.setMinorAlignment(FlowLayout.ALIGN_CENTER);

			layoutFFigureDataValuedPropertyAtomArg2Rectangle
					.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutFFigureDataValuedPropertyAtomArg2Rectangle.setMajorSpacing(5);
			layoutFFigureDataValuedPropertyAtomArg2Rectangle.setMinorSpacing(5);
			layoutFFigureDataValuedPropertyAtomArg2Rectangle
					.setHorizontal(false);

			fFigureDataValuedPropertyAtomArg2Rectangle
					.setLayoutManager(layoutFFigureDataValuedPropertyAtomArg2Rectangle);

			WrappingLabel dataValuedPropertyAtomArg2RectangleLabel1 = new WrappingLabel();
			dataValuedPropertyAtomArg2RectangleLabel1.setText("Arg2");

			fFigureDataValuedPropertyAtomArg2Rectangle
					.add(dataValuedPropertyAtomArg2RectangleLabel1);

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
		public RectangleFigure getFigureDataValuedPropertyAtomArg1Rectangle() {
			return fFigureDataValuedPropertyAtomArg1Rectangle;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureDataValuedPropertyAtomArg2Rectangle() {
			return fFigureDataValuedPropertyAtomArg2Rectangle;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDataValuedPropertyAtomPredicateLabel() {
			return fFigureDataValuedPropertyAtomPredicateLabel;
		}

	}

}
