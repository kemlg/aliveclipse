package net.sf.ictalive.coordination.wfvv.diagram.edit.parts;

import net.sf.ictalive.coordination.wfvv.diagram.edit.policies.ContentCanonicalEditPolicy;
import net.sf.ictalive.coordination.wfvv.diagram.edit.policies.ContentItemSemanticEditPolicy;

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
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class ContentEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3002;

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
	public ContentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ContentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new ContentCanonicalEditPolicy());
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
		ContentFigure figure = new ContentFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ContentFigure getPrimaryShape() {
		return (ContentFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ContentContentFigureFactCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureContentFigureFactContainmentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((ContentContentFigureFactCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof ContentContentFigureEffectCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureContentFigureEffectContainmentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((ContentContentFigureEffectCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ContentContentFigureFactCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureContentFigureFactContainmentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((ContentContentFigureFactCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof ContentContentFigureEffectCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureContentFigureEffectContainmentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((ContentContentFigureEffectCompartmentEditPart) childEditPart)
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
		if (editPart instanceof ContentContentFigureFactCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureContentFigureFactContainmentRectangle();
		}
		if (editPart instanceof ContentContentFigureEffectCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureContentFigureEffectContainmentRectangle();
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
	public class ContentFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureContentFigureFactContainmentRectangle;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureContentFigureEffectContainmentRectangle;

		/**
		 * @generated
		 */
		public ContentFigure() {

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

			WrappingLabel eventFigureContentTitleLabel0 = new WrappingLabel();
			eventFigureContentTitleLabel0.setText("Content");

			GridData constraintEventFigureContentTitleLabel0 = new GridData();
			constraintEventFigureContentTitleLabel0.verticalAlignment = GridData.CENTER;
			constraintEventFigureContentTitleLabel0.horizontalAlignment = GridData.CENTER;
			constraintEventFigureContentTitleLabel0.horizontalIndent = 0;
			constraintEventFigureContentTitleLabel0.horizontalSpan = 1;
			constraintEventFigureContentTitleLabel0.verticalSpan = 1;
			constraintEventFigureContentTitleLabel0.grabExcessHorizontalSpace = false;
			constraintEventFigureContentTitleLabel0.grabExcessVerticalSpace = false;
			this.add(eventFigureContentTitleLabel0,
					constraintEventFigureContentTitleLabel0);

			fFigureContentFigureFactContainmentRectangle = new RectangleFigure();
			fFigureContentFigureFactContainmentRectangle.setLineWidth(1);

			GridData constraintFFigureContentFigureFactContainmentRectangle = new GridData();
			constraintFFigureContentFigureFactContainmentRectangle.verticalAlignment = GridData.FILL;
			constraintFFigureContentFigureFactContainmentRectangle.horizontalAlignment = GridData.FILL;
			constraintFFigureContentFigureFactContainmentRectangle.horizontalIndent = 0;
			constraintFFigureContentFigureFactContainmentRectangle.horizontalSpan = 1;
			constraintFFigureContentFigureFactContainmentRectangle.verticalSpan = 1;
			constraintFFigureContentFigureFactContainmentRectangle.grabExcessHorizontalSpace = true;
			constraintFFigureContentFigureFactContainmentRectangle.grabExcessVerticalSpace = true;
			this.add(fFigureContentFigureFactContainmentRectangle,
					constraintFFigureContentFigureFactContainmentRectangle);

			FlowLayout layoutFFigureContentFigureFactContainmentRectangle = new FlowLayout();
			layoutFFigureContentFigureFactContainmentRectangle
					.setStretchMinorAxis(false);
			layoutFFigureContentFigureFactContainmentRectangle
					.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutFFigureContentFigureFactContainmentRectangle
					.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutFFigureContentFigureFactContainmentRectangle
					.setMajorSpacing(5);
			layoutFFigureContentFigureFactContainmentRectangle
					.setMinorSpacing(5);
			layoutFFigureContentFigureFactContainmentRectangle
					.setHorizontal(true);

			fFigureContentFigureFactContainmentRectangle
					.setLayoutManager(layoutFFigureContentFigureFactContainmentRectangle);

			WrappingLabel contentFigureFactContainmentRectangleTitleLabel1 = new WrappingLabel();
			contentFigureFactContainmentRectangleTitleLabel1.setText("fact");

			fFigureContentFigureFactContainmentRectangle
					.add(contentFigureFactContainmentRectangleTitleLabel1);

			fFigureContentFigureEffectContainmentRectangle = new RectangleFigure();
			fFigureContentFigureEffectContainmentRectangle.setLineWidth(1);

			GridData constraintFFigureContentFigureEffectContainmentRectangle = new GridData();
			constraintFFigureContentFigureEffectContainmentRectangle.verticalAlignment = GridData.FILL;
			constraintFFigureContentFigureEffectContainmentRectangle.horizontalAlignment = GridData.FILL;
			constraintFFigureContentFigureEffectContainmentRectangle.horizontalIndent = 0;
			constraintFFigureContentFigureEffectContainmentRectangle.horizontalSpan = 1;
			constraintFFigureContentFigureEffectContainmentRectangle.verticalSpan = 1;
			constraintFFigureContentFigureEffectContainmentRectangle.grabExcessHorizontalSpace = true;
			constraintFFigureContentFigureEffectContainmentRectangle.grabExcessVerticalSpace = true;
			this.add(fFigureContentFigureEffectContainmentRectangle,
					constraintFFigureContentFigureEffectContainmentRectangle);

			FlowLayout layoutFFigureContentFigureEffectContainmentRectangle = new FlowLayout();
			layoutFFigureContentFigureEffectContainmentRectangle
					.setStretchMinorAxis(false);
			layoutFFigureContentFigureEffectContainmentRectangle
					.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutFFigureContentFigureEffectContainmentRectangle
					.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutFFigureContentFigureEffectContainmentRectangle
					.setMajorSpacing(5);
			layoutFFigureContentFigureEffectContainmentRectangle
					.setMinorSpacing(5);
			layoutFFigureContentFigureEffectContainmentRectangle
					.setHorizontal(true);

			fFigureContentFigureEffectContainmentRectangle
					.setLayoutManager(layoutFFigureContentFigureEffectContainmentRectangle);

			WrappingLabel contentFigureEffectContainmentTitleLabel1 = new WrappingLabel();
			contentFigureEffectContainmentTitleLabel1.setText("effect");

			fFigureContentFigureEffectContainmentRectangle
					.add(contentFigureEffectContainmentTitleLabel1);

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
		public RectangleFigure getFigureContentFigureFactContainmentRectangle() {
			return fFigureContentFigureFactContainmentRectangle;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureContentFigureEffectContainmentRectangle() {
			return fFigureContentFigureEffectContainmentRectangle;
		}

	}

}
