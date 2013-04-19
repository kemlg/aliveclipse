package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies.BpeldiagTextSelectionEditPolicy;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies.OperationItemSemanticEditPolicy;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.BpeldiagVisualIDRegistry;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers.BpeldiagElementTypes;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
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
public class OperationEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2031;

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
	public OperationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new OperationItemSemanticEditPolicy());
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
						return new BpeldiagTextSelectionEditPolicy();
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
		OperationFigureDescriptor figure = new OperationFigureDescriptor();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public OperationFigureDescriptor getPrimaryShape() {
		return (OperationFigureDescriptor) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OperationNameEditPart) {
			((OperationNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureOperationFigureNameLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OperationNameEditPart) {
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
		return getChildBySemanticHint(BpeldiagVisualIDRegistry
				.getType(OperationNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(BpeldiagElementTypes.PartnerActivityOperation_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Invoke_2011);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Receive_2015);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Reply_2017);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.PartnerActivity_2013);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Invoke_3085);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.PartnerActivity_3087);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Invoke_3163);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.PartnerActivity_3165);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Invoke_3064);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.PartnerActivity_3066);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Receive_3068);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Receive_3089);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Invoke_3151);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.PartnerActivity_3153);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Receive_3155);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Reply_3156);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Reply_3091);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Invoke_3140);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.PartnerActivity_3142);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Receive_3144);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Reply_3145);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Reply_3070);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Receive_3167);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Invoke_3130);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.PartnerActivity_3132);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Receive_3134);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Reply_3135);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Reply_3169);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Invoke_3213);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.PartnerActivity_3215);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Receive_3217);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Reply_3219);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Invoke_3041);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.PartnerActivity_3043);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Receive_3045);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Reply_3047);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Invoke_3190);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.PartnerActivity_3192);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Receive_3194);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Reply_3196);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Invoke_3249);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.PartnerActivity_3251);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Receive_3253);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Reply_3255);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Invoke_3273);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.PartnerActivity_3275);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Receive_3277);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Reply_3279);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Invoke_3289);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.PartnerActivity_3291);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Receive_3293);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Reply_3295);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Invoke_3012);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.PartnerActivity_3014);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Receive_3016);
		}
		if (relationshipType == BpeldiagElementTypes.PartnerActivityOperation_4001) {
			types.add(BpeldiagElementTypes.Reply_3018);
		}
		return types;
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
	public class OperationFigureDescriptor extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureOperationFigureNameLabel;

		/**
		 * @generated
		 */
		public OperationFigureDescriptor() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutThis.setSpacing(0);
			layoutThis.setVertical(true);

			this.setLayoutManager(layoutThis);

			this.setLineWidth(1);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureOperationFigureNameLabel = new WrappingLabel();
			fFigureOperationFigureNameLabel.setText("");

			this.add(fFigureOperationFigureNameLabel);

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
		public WrappingLabel getFigureOperationFigureNameLabel() {
			return fFigureOperationFigureNameLabel;
		}

	}

}
