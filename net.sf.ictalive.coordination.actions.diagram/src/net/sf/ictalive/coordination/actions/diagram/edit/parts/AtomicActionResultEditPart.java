package net.sf.ictalive.coordination.actions.diagram.edit.parts;

import net.sf.ictalive.coordination.actions.diagram.edit.policies.AtomicActionResultCanonicalEditPolicy;
import net.sf.ictalive.coordination.actions.diagram.edit.policies.AtomicActionResultItemSemanticEditPolicy;
import net.sf.ictalive.coordination.actions.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
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
public class AtomicActionResultEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3081;

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
	public AtomicActionResultEditPart(View view) {
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
				new AtomicActionResultItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new AtomicActionResultCanonicalEditPolicy());
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
		AtomicActionResultFigure figure = new AtomicActionResultFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public AtomicActionResultFigure getPrimaryShape() {
		return (AtomicActionResultFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AtomicActionResultHasDensityEditPart) {
			((AtomicActionResultHasDensityEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAtomicActionResultFigureHasDensityLabel());
			return true;
		}
		if (childEditPart instanceof AtomicActionResultQualityDistributionCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureAtomicActionResultFigureQualityDistributionRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((AtomicActionResultQualityDistributionCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof AtomicActionResultCostDistributionCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureAtomicActionResultFigureCostDistribuitonRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((AtomicActionResultCostDistributionCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof AtomicActionResultDurationDistributionCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureAtomicActionResultFigureDurationDistributionRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((AtomicActionResultDurationDistributionCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof AtomicActionResultAtomicActionResultAddEffectCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureAtomicActionResultFigureAddEffectRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((AtomicActionResultAtomicActionResultAddEffectCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof AtomicActionResultAtomicActionResultDeleteEffectCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureAtomicActionResultFigureDeleteEffectRectange();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((AtomicActionResultAtomicActionResultDeleteEffectCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AtomicActionResultHasDensityEditPart) {
			return true;
		}
		if (childEditPart instanceof AtomicActionResultQualityDistributionCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureAtomicActionResultFigureQualityDistributionRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((AtomicActionResultQualityDistributionCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof AtomicActionResultCostDistributionCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureAtomicActionResultFigureCostDistribuitonRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((AtomicActionResultCostDistributionCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof AtomicActionResultDurationDistributionCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureAtomicActionResultFigureDurationDistributionRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((AtomicActionResultDurationDistributionCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof AtomicActionResultAtomicActionResultAddEffectCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureAtomicActionResultFigureAddEffectRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((AtomicActionResultAtomicActionResultAddEffectCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof AtomicActionResultAtomicActionResultDeleteEffectCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureAtomicActionResultFigureDeleteEffectRectange();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((AtomicActionResultAtomicActionResultDeleteEffectCompartmentEditPart) childEditPart)
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
		if (editPart instanceof AtomicActionResultQualityDistributionCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureAtomicActionResultFigureQualityDistributionRectangle();
		}
		if (editPart instanceof AtomicActionResultCostDistributionCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureAtomicActionResultFigureCostDistribuitonRectangle();
		}
		if (editPart instanceof AtomicActionResultDurationDistributionCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureAtomicActionResultFigureDurationDistributionRectangle();
		}
		if (editPart instanceof AtomicActionResultAtomicActionResultAddEffectCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureAtomicActionResultFigureAddEffectRectangle();
		}
		if (editPart instanceof AtomicActionResultAtomicActionResultDeleteEffectCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureAtomicActionResultFigureDeleteEffectRectange();
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
				.getType(AtomicActionResultHasDensityEditPart.VISUAL_ID));
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
			if (type == CoordinationElementTypes.Distribution_3086) {
				return getChildBySemanticHint(CoordinationVisualIDRegistry
						.getType(AtomicActionResultQualityDistributionCompartmentEditPart.VISUAL_ID));
			}
			if (type == CoordinationElementTypes.Distribution_3084) {
				return getChildBySemanticHint(CoordinationVisualIDRegistry
						.getType(AtomicActionResultCostDistributionCompartmentEditPart.VISUAL_ID));
			}
			if (type == CoordinationElementTypes.Distribution_3085) {
				return getChildBySemanticHint(CoordinationVisualIDRegistry
						.getType(AtomicActionResultDurationDistributionCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class AtomicActionResultFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureAtomicActionResultFigureQualityDistributionRectangle;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureAtomicActionResultFigureDurationDistributionRectangle;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureAtomicActionResultFigureCostDistribuitonRectangle;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAtomicActionResultFigureHasDensityLabel;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureAtomicActionResultFigureAddEffectRectangle;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureAtomicActionResultFigureDeleteEffectRectange;

		/**
		 * @generated
		 */
		public AtomicActionResultFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(true);
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

			WrappingLabel atomicActionResultFigureLabel0 = new WrappingLabel();
			atomicActionResultFigureLabel0.setText("Result");

			this.add(atomicActionResultFigureLabel0);

			fFigureAtomicActionResultFigureHasDensityLabel = new WrappingLabel();
			fFigureAtomicActionResultFigureHasDensityLabel.setText("");

			this.add(fFigureAtomicActionResultFigureHasDensityLabel);

			fFigureAtomicActionResultFigureAddEffectRectangle = new RectangleFigure();
			fFigureAtomicActionResultFigureAddEffectRectangle.setLineWidth(1);

			this.add(fFigureAtomicActionResultFigureAddEffectRectangle);

			FlowLayout layoutFFigureAtomicActionResultFigureAddEffectRectangle = new FlowLayout();
			layoutFFigureAtomicActionResultFigureAddEffectRectangle
					.setStretchMinorAxis(false);
			layoutFFigureAtomicActionResultFigureAddEffectRectangle
					.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutFFigureAtomicActionResultFigureAddEffectRectangle
					.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutFFigureAtomicActionResultFigureAddEffectRectangle
					.setMajorSpacing(1);
			layoutFFigureAtomicActionResultFigureAddEffectRectangle
					.setMinorSpacing(1);
			layoutFFigureAtomicActionResultFigureAddEffectRectangle
					.setHorizontal(false);

			fFigureAtomicActionResultFigureAddEffectRectangle
					.setLayoutManager(layoutFFigureAtomicActionResultFigureAddEffectRectangle);

			WrappingLabel atomicActionResultFigureAddEffectRectangleLabel1 = new WrappingLabel();
			atomicActionResultFigureAddEffectRectangleLabel1
					.setText("Add effect");

			fFigureAtomicActionResultFigureAddEffectRectangle
					.add(atomicActionResultFigureAddEffectRectangleLabel1);

			fFigureAtomicActionResultFigureDeleteEffectRectange = new RectangleFigure();
			fFigureAtomicActionResultFigureDeleteEffectRectange.setLineWidth(1);

			this.add(fFigureAtomicActionResultFigureDeleteEffectRectange);

			FlowLayout layoutFFigureAtomicActionResultFigureDeleteEffectRectange = new FlowLayout();
			layoutFFigureAtomicActionResultFigureDeleteEffectRectange
					.setStretchMinorAxis(false);
			layoutFFigureAtomicActionResultFigureDeleteEffectRectange
					.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutFFigureAtomicActionResultFigureDeleteEffectRectange
					.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutFFigureAtomicActionResultFigureDeleteEffectRectange
					.setMajorSpacing(1);
			layoutFFigureAtomicActionResultFigureDeleteEffectRectange
					.setMinorSpacing(1);
			layoutFFigureAtomicActionResultFigureDeleteEffectRectange
					.setHorizontal(false);

			fFigureAtomicActionResultFigureDeleteEffectRectange
					.setLayoutManager(layoutFFigureAtomicActionResultFigureDeleteEffectRectange);

			WrappingLabel atomicActionResultFigureDeleteEffectRectangleLabel1 = new WrappingLabel();
			atomicActionResultFigureDeleteEffectRectangleLabel1
					.setText("Delete effect");

			fFigureAtomicActionResultFigureDeleteEffectRectange
					.add(atomicActionResultFigureDeleteEffectRectangleLabel1);

			fFigureAtomicActionResultFigureCostDistribuitonRectangle = new RectangleFigure();
			fFigureAtomicActionResultFigureCostDistribuitonRectangle
					.setLineWidth(1);

			this.add(fFigureAtomicActionResultFigureCostDistribuitonRectangle);

			ToolbarLayout layoutFFigureAtomicActionResultFigureCostDistribuitonRectangle = new ToolbarLayout();
			layoutFFigureAtomicActionResultFigureCostDistribuitonRectangle
					.setStretchMinorAxis(false);
			layoutFFigureAtomicActionResultFigureCostDistribuitonRectangle
					.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutFFigureAtomicActionResultFigureCostDistribuitonRectangle
					.setSpacing(1);
			layoutFFigureAtomicActionResultFigureCostDistribuitonRectangle
					.setVertical(false);

			fFigureAtomicActionResultFigureCostDistribuitonRectangle
					.setLayoutManager(layoutFFigureAtomicActionResultFigureCostDistribuitonRectangle);

			WrappingLabel atomicActionResultFigureCostDistributionRectangleLabel1 = new WrappingLabel();
			atomicActionResultFigureCostDistributionRectangleLabel1
					.setText("Cost Distribution");

			fFigureAtomicActionResultFigureCostDistribuitonRectangle
					.add(atomicActionResultFigureCostDistributionRectangleLabel1);

			fFigureAtomicActionResultFigureDurationDistributionRectangle = new RectangleFigure();
			fFigureAtomicActionResultFigureDurationDistributionRectangle
					.setLineWidth(1);

			this
					.add(fFigureAtomicActionResultFigureDurationDistributionRectangle);

			ToolbarLayout layoutFFigureAtomicActionResultFigureDurationDistributionRectangle = new ToolbarLayout();
			layoutFFigureAtomicActionResultFigureDurationDistributionRectangle
					.setStretchMinorAxis(false);
			layoutFFigureAtomicActionResultFigureDurationDistributionRectangle
					.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutFFigureAtomicActionResultFigureDurationDistributionRectangle
					.setSpacing(1);
			layoutFFigureAtomicActionResultFigureDurationDistributionRectangle
					.setVertical(false);

			fFigureAtomicActionResultFigureDurationDistributionRectangle
					.setLayoutManager(layoutFFigureAtomicActionResultFigureDurationDistributionRectangle);

			WrappingLabel atomicActionResultFigureDurationDistributionRectangeLabel1 = new WrappingLabel();
			atomicActionResultFigureDurationDistributionRectangeLabel1
					.setText("Duration Distribution");

			fFigureAtomicActionResultFigureDurationDistributionRectangle
					.add(atomicActionResultFigureDurationDistributionRectangeLabel1);

			fFigureAtomicActionResultFigureQualityDistributionRectangle = new RectangleFigure();
			fFigureAtomicActionResultFigureQualityDistributionRectangle
					.setLineWidth(1);

			this
					.add(fFigureAtomicActionResultFigureQualityDistributionRectangle);

			ToolbarLayout layoutFFigureAtomicActionResultFigureQualityDistributionRectangle = new ToolbarLayout();
			layoutFFigureAtomicActionResultFigureQualityDistributionRectangle
					.setStretchMinorAxis(false);
			layoutFFigureAtomicActionResultFigureQualityDistributionRectangle
					.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutFFigureAtomicActionResultFigureQualityDistributionRectangle
					.setSpacing(1);
			layoutFFigureAtomicActionResultFigureQualityDistributionRectangle
					.setVertical(false);

			fFigureAtomicActionResultFigureQualityDistributionRectangle
					.setLayoutManager(layoutFFigureAtomicActionResultFigureQualityDistributionRectangle);

			WrappingLabel atomicActionResultFigureQualityDistributionRectangleLabel1 = new WrappingLabel();
			atomicActionResultFigureQualityDistributionRectangleLabel1
					.setText("Quality Distribution");

			fFigureAtomicActionResultFigureQualityDistributionRectangle
					.add(atomicActionResultFigureQualityDistributionRectangleLabel1);

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
		public RectangleFigure getFigureAtomicActionResultFigureQualityDistributionRectangle() {
			return fFigureAtomicActionResultFigureQualityDistributionRectangle;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureAtomicActionResultFigureDurationDistributionRectangle() {
			return fFigureAtomicActionResultFigureDurationDistributionRectangle;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureAtomicActionResultFigureCostDistribuitonRectangle() {
			return fFigureAtomicActionResultFigureCostDistribuitonRectangle;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAtomicActionResultFigureHasDensityLabel() {
			return fFigureAtomicActionResultFigureHasDensityLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureAtomicActionResultFigureAddEffectRectangle() {
			return fFigureAtomicActionResultFigureAddEffectRectangle;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureAtomicActionResultFigureDeleteEffectRectange() {
			return fFigureAtomicActionResultFigureDeleteEffectRectange;
		}

	}

}
