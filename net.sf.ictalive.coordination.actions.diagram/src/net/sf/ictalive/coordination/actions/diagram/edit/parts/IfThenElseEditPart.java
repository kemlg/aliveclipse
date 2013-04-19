package net.sf.ictalive.coordination.actions.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.actions.diagram.edit.policies.IfThenElseCanonicalEditPolicy;
import net.sf.ictalive.coordination.actions.diagram.edit.policies.IfThenElseItemSemanticEditPolicy;
import net.sf.ictalive.coordination.actions.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
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
public class IfThenElseEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2037;

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
	public IfThenElseEditPart(View view) {
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
				new IfThenElseItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new IfThenElseCanonicalEditPolicy());
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
		IfThenElseFigure figure = new IfThenElseFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public IfThenElseFigure getPrimaryShape() {
		return (IfThenElseFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof IfThenElseIfThenElseCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureIfThenElseCompartmentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((IfThenElseIfThenElseCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof IfThenElseIfThenElseCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureIfThenElseCompartmentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((IfThenElseIfThenElseCompartmentEditPart) childEditPart)
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
		if (editPart instanceof IfThenElseIfThenElseCompartmentEditPart) {
			return getPrimaryShape().getFigureIfThenElseCompartmentRectangle();
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
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(CoordinationElementTypes.IfThenElseThen_4036);
		types.add(CoordinationElementTypes.IfThenElseElse_4037);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof SequenceEditPart) {
			types.add(CoordinationElementTypes.IfThenElseThen_4036);
		}
		if (targetEditPart instanceof AnyOrderEditPart) {
			types.add(CoordinationElementTypes.IfThenElseThen_4036);
		}
		if (targetEditPart instanceof PerformEditPart) {
			types.add(CoordinationElementTypes.IfThenElseThen_4036);
		}
		if (targetEditPart instanceof ChoiceEditPart) {
			types.add(CoordinationElementTypes.IfThenElseThen_4036);
		}
		if (targetEditPart instanceof RepeatUntilEditPart) {
			types.add(CoordinationElementTypes.IfThenElseThen_4036);
		}
		if (targetEditPart instanceof RepeatWhileEditPart) {
			types.add(CoordinationElementTypes.IfThenElseThen_4036);
		}
		if (targetEditPart instanceof net.sf.ictalive.coordination.actions.diagram.edit.parts.IfThenElseEditPart) {
			types.add(CoordinationElementTypes.IfThenElseThen_4036);
		}
		if (targetEditPart instanceof SplitEditPart) {
			types.add(CoordinationElementTypes.IfThenElseThen_4036);
		}
		if (targetEditPart instanceof SplitJoinEditPart) {
			types.add(CoordinationElementTypes.IfThenElseThen_4036);
		}
		if (targetEditPart instanceof SequenceEditPart) {
			types.add(CoordinationElementTypes.IfThenElseElse_4037);
		}
		if (targetEditPart instanceof AnyOrderEditPart) {
			types.add(CoordinationElementTypes.IfThenElseElse_4037);
		}
		if (targetEditPart instanceof PerformEditPart) {
			types.add(CoordinationElementTypes.IfThenElseElse_4037);
		}
		if (targetEditPart instanceof ChoiceEditPart) {
			types.add(CoordinationElementTypes.IfThenElseElse_4037);
		}
		if (targetEditPart instanceof RepeatUntilEditPart) {
			types.add(CoordinationElementTypes.IfThenElseElse_4037);
		}
		if (targetEditPart instanceof RepeatWhileEditPart) {
			types.add(CoordinationElementTypes.IfThenElseElse_4037);
		}
		if (targetEditPart instanceof net.sf.ictalive.coordination.actions.diagram.edit.parts.IfThenElseEditPart) {
			types.add(CoordinationElementTypes.IfThenElseElse_4037);
		}
		if (targetEditPart instanceof SplitEditPart) {
			types.add(CoordinationElementTypes.IfThenElseElse_4037);
		}
		if (targetEditPart instanceof SplitJoinEditPart) {
			types.add(CoordinationElementTypes.IfThenElseElse_4037);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == CoordinationElementTypes.IfThenElseThen_4036) {
			types.add(CoordinationElementTypes.Sequence_2029);
		}
		if (relationshipType == CoordinationElementTypes.IfThenElseThen_4036) {
			types.add(CoordinationElementTypes.AnyOrder_2030);
		}
		if (relationshipType == CoordinationElementTypes.IfThenElseThen_4036) {
			types.add(CoordinationElementTypes.Perform_2032);
		}
		if (relationshipType == CoordinationElementTypes.IfThenElseThen_4036) {
			types.add(CoordinationElementTypes.Choice_2033);
		}
		if (relationshipType == CoordinationElementTypes.IfThenElseThen_4036) {
			types.add(CoordinationElementTypes.RepeatUntil_2035);
		}
		if (relationshipType == CoordinationElementTypes.IfThenElseThen_4036) {
			types.add(CoordinationElementTypes.RepeatWhile_2036);
		}
		if (relationshipType == CoordinationElementTypes.IfThenElseThen_4036) {
			types.add(CoordinationElementTypes.IfThenElse_2037);
		}
		if (relationshipType == CoordinationElementTypes.IfThenElseThen_4036) {
			types.add(CoordinationElementTypes.Split_2039);
		}
		if (relationshipType == CoordinationElementTypes.IfThenElseThen_4036) {
			types.add(CoordinationElementTypes.SplitJoin_2040);
		}
		if (relationshipType == CoordinationElementTypes.IfThenElseElse_4037) {
			types.add(CoordinationElementTypes.Sequence_2029);
		}
		if (relationshipType == CoordinationElementTypes.IfThenElseElse_4037) {
			types.add(CoordinationElementTypes.AnyOrder_2030);
		}
		if (relationshipType == CoordinationElementTypes.IfThenElseElse_4037) {
			types.add(CoordinationElementTypes.Perform_2032);
		}
		if (relationshipType == CoordinationElementTypes.IfThenElseElse_4037) {
			types.add(CoordinationElementTypes.Choice_2033);
		}
		if (relationshipType == CoordinationElementTypes.IfThenElseElse_4037) {
			types.add(CoordinationElementTypes.RepeatUntil_2035);
		}
		if (relationshipType == CoordinationElementTypes.IfThenElseElse_4037) {
			types.add(CoordinationElementTypes.RepeatWhile_2036);
		}
		if (relationshipType == CoordinationElementTypes.IfThenElseElse_4037) {
			types.add(CoordinationElementTypes.IfThenElse_2037);
		}
		if (relationshipType == CoordinationElementTypes.IfThenElseElse_4037) {
			types.add(CoordinationElementTypes.Split_2039);
		}
		if (relationshipType == CoordinationElementTypes.IfThenElseElse_4037) {
			types.add(CoordinationElementTypes.SplitJoin_2040);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(CoordinationElementTypes.CompositeProcessComposedOf_4029);
		types.add(CoordinationElementTypes.IfThenElseThen_4036);
		types.add(CoordinationElementTypes.IfThenElseElse_4037);
		types.add(CoordinationElementTypes.RepeatUntilUntilProcess_4038);
		types.add(CoordinationElementTypes.RepeatWhileWhileProcess_4039);
		types.add(CoordinationElementTypes.ControlConstructBagFirst_4040);
		types.add(CoordinationElementTypes.ControlConstructListFirst_4041);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == CoordinationElementTypes.CompositeProcessComposedOf_4029) {
			types.add(CoordinationElementTypes.CompositeAction_2024);
		}
		if (relationshipType == CoordinationElementTypes.IfThenElseThen_4036) {
			types.add(CoordinationElementTypes.IfThenElse_2037);
		}
		if (relationshipType == CoordinationElementTypes.IfThenElseElse_4037) {
			types.add(CoordinationElementTypes.IfThenElse_2037);
		}
		if (relationshipType == CoordinationElementTypes.RepeatUntilUntilProcess_4038) {
			types.add(CoordinationElementTypes.RepeatUntil_2035);
		}
		if (relationshipType == CoordinationElementTypes.RepeatWhileWhileProcess_4039) {
			types.add(CoordinationElementTypes.RepeatWhile_2036);
		}
		if (relationshipType == CoordinationElementTypes.ControlConstructBagFirst_4040) {
			types.add(CoordinationElementTypes.ControlConstructBag_2031);
		}
		if (relationshipType == CoordinationElementTypes.ControlConstructListFirst_4041) {
			types.add(CoordinationElementTypes.ControlConstructList_2034);
		}
		return types;
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
			if (type == CoordinationElementTypes.Condition_3089) {
				return getChildBySemanticHint(CoordinationVisualIDRegistry
						.getType(IfThenElseIfThenElseCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
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
	public class IfThenElseFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureIfThenElseCompartmentRectangle;

		/**
		 * @generated
		 */
		public IfThenElseFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			layoutThis.marginWidth = 0;
			layoutThis.marginHeight = 0;
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

			WrappingLabel ifThenElseFigureLabel0 = new WrappingLabel();
			ifThenElseFigureLabel0.setText("If Then Else");

			GridData constraintIfThenElseFigureLabel0 = new GridData();
			constraintIfThenElseFigureLabel0.verticalAlignment = GridData.CENTER;
			constraintIfThenElseFigureLabel0.horizontalAlignment = GridData.CENTER;
			constraintIfThenElseFigureLabel0.horizontalIndent = 0;
			constraintIfThenElseFigureLabel0.horizontalSpan = 1;
			constraintIfThenElseFigureLabel0.verticalSpan = 1;
			constraintIfThenElseFigureLabel0.grabExcessHorizontalSpace = false;
			constraintIfThenElseFigureLabel0.grabExcessVerticalSpace = false;
			this.add(ifThenElseFigureLabel0, constraintIfThenElseFigureLabel0);

			fFigureIfThenElseCompartmentRectangle = new RectangleFigure();
			fFigureIfThenElseCompartmentRectangle.setLineWidth(1);

			GridData constraintFFigureIfThenElseCompartmentRectangle = new GridData();
			constraintFFigureIfThenElseCompartmentRectangle.verticalAlignment = GridData.FILL;
			constraintFFigureIfThenElseCompartmentRectangle.horizontalAlignment = GridData.FILL;
			constraintFFigureIfThenElseCompartmentRectangle.horizontalIndent = 0;
			constraintFFigureIfThenElseCompartmentRectangle.horizontalSpan = 1;
			constraintFFigureIfThenElseCompartmentRectangle.verticalSpan = 1;
			constraintFFigureIfThenElseCompartmentRectangle.grabExcessHorizontalSpace = true;
			constraintFFigureIfThenElseCompartmentRectangle.grabExcessVerticalSpace = true;
			this.add(fFigureIfThenElseCompartmentRectangle,
					constraintFFigureIfThenElseCompartmentRectangle);

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
		public RectangleFigure getFigureIfThenElseCompartmentRectangle() {
			return fFigureIfThenElseCompartmentRectangle;
		}

	}

}
