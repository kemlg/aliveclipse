package net.sf.ictalive.coordination.wfvv.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.wfvv.diagram.custom.EventOpenEditPolicy;
import net.sf.ictalive.coordination.wfvv.diagram.edit.policies.EventCanonicalEditPolicy;
import net.sf.ictalive.coordination.wfvv.diagram.edit.policies.EventItemSemanticEditPolicy;
import net.sf.ictalive.coordination.wfvv.diagram.part.WfvvVisualIDRegistry;
import net.sf.ictalive.coordination.wfvv.diagram.providers.WfvvElementTypes;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
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
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class EventEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2023;

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
	public EventEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EventItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new EventCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new EventOpenEditPolicy());
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
		EventFigure figure = new EventFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public EventFigure getPrimaryShape() {
		return (EventFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof EventTimestampEditPart) {
			((EventTimestampEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureEventFigureTimestampLabel());
			return true;
		}
		if (childEditPart instanceof EventEventFigureFactCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureEventFigureCompartmentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((EventEventFigureFactCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof EventTimestampEditPart) {
			return true;
		}
		if (childEditPart instanceof EventEventFigureFactCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureEventFigureCompartmentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((EventEventFigureFactCompartmentEditPart) childEditPart)
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
		if (editPart instanceof EventEventFigureFactCompartmentEditPart) {
			return getPrimaryShape().getFigureEventFigureCompartmentRectangle();
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
		return getChildBySemanticHint(WfvvVisualIDRegistry
				.getType(EventTimestampEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(WfvvElementTypes.EventAsserter_4019);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof ActorEditPart) {
			types.add(WfvvElementTypes.EventAsserter_4019);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == WfvvElementTypes.EventAsserter_4019) {
			types.add(WfvvElementTypes.Actor_2026);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class EventFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureEventFigureTimestampLabel;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureEventFigureCompartmentRectangle;

		/**
		 * @generated
		 */
		public EventFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setLineWidth(1);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			WrappingLabel eventFigureTitleLabel0 = new WrappingLabel();
			eventFigureTitleLabel0.setText("Event");

			GridData constraintEventFigureTitleLabel0 = new GridData();
			constraintEventFigureTitleLabel0.verticalAlignment = GridData.CENTER;
			constraintEventFigureTitleLabel0.horizontalAlignment = GridData.CENTER;
			constraintEventFigureTitleLabel0.horizontalIndent = 0;
			constraintEventFigureTitleLabel0.horizontalSpan = 1;
			constraintEventFigureTitleLabel0.verticalSpan = 1;
			constraintEventFigureTitleLabel0.grabExcessHorizontalSpace = false;
			constraintEventFigureTitleLabel0.grabExcessVerticalSpace = false;
			this.add(eventFigureTitleLabel0, constraintEventFigureTitleLabel0);

			fFigureEventFigureTimestampLabel = new WrappingLabel();
			fFigureEventFigureTimestampLabel.setText("");

			GridData constraintFFigureEventFigureTimestampLabel = new GridData();
			constraintFFigureEventFigureTimestampLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureEventFigureTimestampLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigureEventFigureTimestampLabel.horizontalIndent = 0;
			constraintFFigureEventFigureTimestampLabel.horizontalSpan = 1;
			constraintFFigureEventFigureTimestampLabel.verticalSpan = 1;
			constraintFFigureEventFigureTimestampLabel.grabExcessHorizontalSpace = false;
			constraintFFigureEventFigureTimestampLabel.grabExcessVerticalSpace = false;
			this.add(fFigureEventFigureTimestampLabel,
					constraintFFigureEventFigureTimestampLabel);

			fFigureEventFigureCompartmentRectangle = new RectangleFigure();
			fFigureEventFigureCompartmentRectangle.setLineWidth(1);

			GridData constraintFFigureEventFigureCompartmentRectangle = new GridData();
			constraintFFigureEventFigureCompartmentRectangle.verticalAlignment = GridData.FILL;
			constraintFFigureEventFigureCompartmentRectangle.horizontalAlignment = GridData.FILL;
			constraintFFigureEventFigureCompartmentRectangle.horizontalIndent = 0;
			constraintFFigureEventFigureCompartmentRectangle.horizontalSpan = 1;
			constraintFFigureEventFigureCompartmentRectangle.verticalSpan = 1;
			constraintFFigureEventFigureCompartmentRectangle.grabExcessHorizontalSpace = true;
			constraintFFigureEventFigureCompartmentRectangle.grabExcessVerticalSpace = true;
			this.add(fFigureEventFigureCompartmentRectangle,
					constraintFFigureEventFigureCompartmentRectangle);

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
		public WrappingLabel getFigureEventFigureTimestampLabel() {
			return fFigureEventFigureTimestampLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureEventFigureCompartmentRectangle() {
			return fFigureEventFigureCompartmentRectangle;
		}

	}

}
