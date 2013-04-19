package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies.AtomicActionCanonicalEditPolicy;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies.AtomicActionItemSemanticEditPolicy;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
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
public class AtomicActionEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

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
	public AtomicActionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AtomicActionItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new AtomicActionCanonicalEditPolicy());
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
		AtomicActionFigure figure = new AtomicActionFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public AtomicActionFigure getPrimaryShape() {
		return (AtomicActionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AtomicActionNameEditPart) {
			((AtomicActionNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAtomicActionNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AtomicActionNameEditPart) {
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
		return getChildBySemanticHint(MappingVisualIDRegistry
				.getType(AtomicActionNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types
				.add(MappingElementTypes.PartnerActivityToAtomicActionMapping_4001);
		types.add(MappingElementTypes.PerformProcess_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Invoke_3032);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.PartnerActivity_3034);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Invoke_3045);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.PartnerActivity_3047);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Invoke_3057);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.PartnerActivity_3059);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Receive_3061);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Receive_3071);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Invoke_3073);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.PartnerActivity_3075);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Receive_3077);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Reply_3078);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Reply_3089);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Invoke_3092);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.PartnerActivity_3094);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Receive_3096);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Reply_3097);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Reply_3110);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Receive_3122);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Invoke_3128);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.PartnerActivity_3130);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Receive_3132);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Reply_3134);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Reply_3155);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Invoke_3182);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.PartnerActivity_3184);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Receive_3186);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Reply_3188);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Invoke_3192);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.PartnerActivity_3194);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Receive_3196);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Reply_3198);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Invoke_3210);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.PartnerActivity_3212);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Receive_3214);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Reply_3216);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Invoke_3225);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.PartnerActivity_3227);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Receive_3229);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Reply_3231);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Invoke_3249);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.PartnerActivity_3251);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Receive_3253);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Reply_3255);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Invoke_3265);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.PartnerActivity_3267);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Receive_3269);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Reply_3271);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Invoke_3281);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.PartnerActivity_3283);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Receive_3285);
		}
		if (relationshipType == MappingElementTypes.PartnerActivityToAtomicActionMapping_4001) {
			types.add(MappingElementTypes.Reply_3287);
		}
		if (relationshipType == MappingElementTypes.PerformProcess_4004) {
			types.add(MappingElementTypes.Perform_2007);
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
	public class AtomicActionFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAtomicActionNameFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureAtomicActionCompartmentRectangle;

		/**
		 * @generated
		 */
		public AtomicActionFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			layoutThis.horizontalSpacing = 0;
			layoutThis.verticalSpacing = 0;
			layoutThis.marginWidth = 0;
			layoutThis.marginHeight = 0;
			this.setLayoutManager(layoutThis);

			this.setLineWidth(1);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureAtomicActionNameFigure = new WrappingLabel();
			fFigureAtomicActionNameFigure.setText("");

			GridData constraintFFigureAtomicActionNameFigure = new GridData();
			constraintFFigureAtomicActionNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureAtomicActionNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureAtomicActionNameFigure.horizontalIndent = 0;
			constraintFFigureAtomicActionNameFigure.horizontalSpan = 1;
			constraintFFigureAtomicActionNameFigure.verticalSpan = 1;
			constraintFFigureAtomicActionNameFigure.grabExcessHorizontalSpace = false;
			constraintFFigureAtomicActionNameFigure.grabExcessVerticalSpace = false;
			this.add(fFigureAtomicActionNameFigure,
					constraintFFigureAtomicActionNameFigure);

			fFigureAtomicActionCompartmentRectangle = new RectangleFigure();
			fFigureAtomicActionCompartmentRectangle.setLineWidth(1);

			GridData constraintFFigureAtomicActionCompartmentRectangle = new GridData();
			constraintFFigureAtomicActionCompartmentRectangle.verticalAlignment = GridData.FILL;
			constraintFFigureAtomicActionCompartmentRectangle.horizontalAlignment = GridData.FILL;
			constraintFFigureAtomicActionCompartmentRectangle.horizontalIndent = 0;
			constraintFFigureAtomicActionCompartmentRectangle.horizontalSpan = 1;
			constraintFFigureAtomicActionCompartmentRectangle.verticalSpan = 1;
			constraintFFigureAtomicActionCompartmentRectangle.grabExcessHorizontalSpace = true;
			constraintFFigureAtomicActionCompartmentRectangle.grabExcessVerticalSpace = true;
			this.add(fFigureAtomicActionCompartmentRectangle,
					constraintFFigureAtomicActionCompartmentRectangle);

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
		public WrappingLabel getFigureAtomicActionNameFigure() {
			return fFigureAtomicActionNameFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureAtomicActionCompartmentRectangle() {
			return fFigureAtomicActionCompartmentRectangle;
		}

	}

}
