package net.sf.ictalive.coordination.tasks.diagram.edit.parts;

import net.sf.ictalive.coordination.tasks.diagram.edit.policies.CoordinationTextSelectionEditPolicy;
import net.sf.ictalive.coordination.tasks.diagram.edit.policies.IndividualPropertyAtomCanonicalEditPolicy;
import net.sf.ictalive.coordination.tasks.diagram.edit.policies.IndividualPropertyAtomItemSemanticEditPolicy;
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
public class IndividualPropertyAtomEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3036;

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
	public IndividualPropertyAtomEditPart(View view) {
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
				new IndividualPropertyAtomItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new IndividualPropertyAtomCanonicalEditPolicy());
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
		IndividualPropertyAtomFigure figure = new IndividualPropertyAtomFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public IndividualPropertyAtomFigure getPrimaryShape() {
		return (IndividualPropertyAtomFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel19EditPart) {
			((WrappingLabel19EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureIndividualPropertyAtomFigurePredicateLabel());
			return true;
		}
		if (childEditPart instanceof IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureIndividualPropertyAtomFigureArg1Rectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureIndividualPropertyAtomFigureArg2Rectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel19EditPart) {
			return true;
		}
		if (childEditPart instanceof IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureIndividualPropertyAtomFigureArg1Rectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureIndividualPropertyAtomFigureArg2Rectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentEditPart) childEditPart)
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
		if (editPart instanceof IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentEditPart) {
			return getPrimaryShape()
					.getFigureIndividualPropertyAtomFigureArg1Rectangle();
		}
		if (editPart instanceof IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentEditPart) {
			return getPrimaryShape()
					.getFigureIndividualPropertyAtomFigureArg2Rectangle();
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
				.getType(WrappingLabel19EditPart.VISUAL_ID));
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
			if (type == CoordinationElementTypes.IndividualID_3037) {
				return getChildBySemanticHint(CoordinationVisualIDRegistry
						.getType(IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentEditPart.VISUAL_ID));
			}
			if (type == CoordinationElementTypes.IndividualVariable_3038) {
				return getChildBySemanticHint(CoordinationVisualIDRegistry
						.getType(IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentEditPart.VISUAL_ID));
			}
			if (type == CoordinationElementTypes.IndividualID_3039) {
				return getChildBySemanticHint(CoordinationVisualIDRegistry
						.getType(IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentEditPart.VISUAL_ID));
			}
			if (type == CoordinationElementTypes.IndividualVariable_3040) {
				return getChildBySemanticHint(CoordinationVisualIDRegistry
						.getType(IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class IndividualPropertyAtomFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureIndividualPropertyAtomFigurePredicateLabel;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureIndividualPropertyAtomFigureArg1Rectangle;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureIndividualPropertyAtomFigureArg2Rectangle;

		/**
		 * @generated
		 */
		public IndividualPropertyAtomFigure() {

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

			fFigureIndividualPropertyAtomFigureArg1Rectangle = new RectangleFigure();
			fFigureIndividualPropertyAtomFigureArg1Rectangle.setLineWidth(1);

			this.add(fFigureIndividualPropertyAtomFigureArg1Rectangle);

			FlowLayout layoutFFigureIndividualPropertyAtomFigureArg1Rectangle = new FlowLayout();
			layoutFFigureIndividualPropertyAtomFigureArg1Rectangle
					.setStretchMinorAxis(false);
			layoutFFigureIndividualPropertyAtomFigureArg1Rectangle
					.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutFFigureIndividualPropertyAtomFigureArg1Rectangle
					.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutFFigureIndividualPropertyAtomFigureArg1Rectangle
					.setMajorSpacing(5);
			layoutFFigureIndividualPropertyAtomFigureArg1Rectangle
					.setMinorSpacing(5);
			layoutFFigureIndividualPropertyAtomFigureArg1Rectangle
					.setHorizontal(false);

			fFigureIndividualPropertyAtomFigureArg1Rectangle
					.setLayoutManager(layoutFFigureIndividualPropertyAtomFigureArg1Rectangle);

			WrappingLabel individualPropertyAtomFigureArg1Label1 = new WrappingLabel();
			individualPropertyAtomFigureArg1Label1.setText("Arg1");

			fFigureIndividualPropertyAtomFigureArg1Rectangle
					.add(individualPropertyAtomFigureArg1Label1);

			fFigureIndividualPropertyAtomFigurePredicateLabel = new WrappingLabel();
			fFigureIndividualPropertyAtomFigurePredicateLabel
					.setText("value of predicate concept is");

			this.add(fFigureIndividualPropertyAtomFigurePredicateLabel);

			fFigureIndividualPropertyAtomFigureArg2Rectangle = new RectangleFigure();
			fFigureIndividualPropertyAtomFigureArg2Rectangle.setLineWidth(1);

			this.add(fFigureIndividualPropertyAtomFigureArg2Rectangle);

			FlowLayout layoutFFigureIndividualPropertyAtomFigureArg2Rectangle = new FlowLayout();
			layoutFFigureIndividualPropertyAtomFigureArg2Rectangle
					.setStretchMinorAxis(false);
			layoutFFigureIndividualPropertyAtomFigureArg2Rectangle
					.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutFFigureIndividualPropertyAtomFigureArg2Rectangle
					.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutFFigureIndividualPropertyAtomFigureArg2Rectangle
					.setMajorSpacing(5);
			layoutFFigureIndividualPropertyAtomFigureArg2Rectangle
					.setMinorSpacing(5);
			layoutFFigureIndividualPropertyAtomFigureArg2Rectangle
					.setHorizontal(false);

			fFigureIndividualPropertyAtomFigureArg2Rectangle
					.setLayoutManager(layoutFFigureIndividualPropertyAtomFigureArg2Rectangle);

			WrappingLabel individualPropertyAtomFigureArg2Label1 = new WrappingLabel();
			individualPropertyAtomFigureArg2Label1.setText("Arg2");

			fFigureIndividualPropertyAtomFigureArg2Rectangle
					.add(individualPropertyAtomFigureArg2Label1);

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
		public WrappingLabel getFigureIndividualPropertyAtomFigurePredicateLabel() {
			return fFigureIndividualPropertyAtomFigurePredicateLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureIndividualPropertyAtomFigureArg1Rectangle() {
			return fFigureIndividualPropertyAtomFigureArg1Rectangle;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureIndividualPropertyAtomFigureArg2Rectangle() {
			return fFigureIndividualPropertyAtomFigureArg2Rectangle;
		}

	}

}
