package net.sf.ictalive.coordination.actions.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.actions.diagram.edit.policies.ControlConstructListCanonicalEditPolicy;
import net.sf.ictalive.coordination.actions.diagram.edit.policies.ControlConstructListItemSemanticEditPolicy;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class ControlConstructListEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2034;

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
	public ControlConstructListEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ControlConstructListItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new ControlConstructListCanonicalEditPolicy());
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
		ControlConstructListFigure figure = new ControlConstructListFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ControlConstructListFigure getPrimaryShape() {
		return (ControlConstructListFigure) primaryShape;
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
		types.add(CoordinationElementTypes.ControlConstructListRest_4035);
		types.add(CoordinationElementTypes.ControlConstructListFirst_4041);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof net.sf.ictalive.coordination.actions.diagram.edit.parts.ControlConstructListEditPart) {
			types.add(CoordinationElementTypes.ControlConstructListRest_4035);
		}
		if (targetEditPart instanceof SequenceEditPart) {
			types.add(CoordinationElementTypes.ControlConstructListFirst_4041);
		}
		if (targetEditPart instanceof AnyOrderEditPart) {
			types.add(CoordinationElementTypes.ControlConstructListFirst_4041);
		}
		if (targetEditPart instanceof PerformEditPart) {
			types.add(CoordinationElementTypes.ControlConstructListFirst_4041);
		}
		if (targetEditPart instanceof ChoiceEditPart) {
			types.add(CoordinationElementTypes.ControlConstructListFirst_4041);
		}
		if (targetEditPart instanceof RepeatUntilEditPart) {
			types.add(CoordinationElementTypes.ControlConstructListFirst_4041);
		}
		if (targetEditPart instanceof RepeatWhileEditPart) {
			types.add(CoordinationElementTypes.ControlConstructListFirst_4041);
		}
		if (targetEditPart instanceof IfThenElseEditPart) {
			types.add(CoordinationElementTypes.ControlConstructListFirst_4041);
		}
		if (targetEditPart instanceof SplitEditPart) {
			types.add(CoordinationElementTypes.ControlConstructListFirst_4041);
		}
		if (targetEditPart instanceof SplitJoinEditPart) {
			types.add(CoordinationElementTypes.ControlConstructListFirst_4041);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == CoordinationElementTypes.ControlConstructListRest_4035) {
			types.add(CoordinationElementTypes.ControlConstructList_2034);
		}
		if (relationshipType == CoordinationElementTypes.ControlConstructListFirst_4041) {
			types.add(CoordinationElementTypes.Sequence_2029);
		}
		if (relationshipType == CoordinationElementTypes.ControlConstructListFirst_4041) {
			types.add(CoordinationElementTypes.AnyOrder_2030);
		}
		if (relationshipType == CoordinationElementTypes.ControlConstructListFirst_4041) {
			types.add(CoordinationElementTypes.Perform_2032);
		}
		if (relationshipType == CoordinationElementTypes.ControlConstructListFirst_4041) {
			types.add(CoordinationElementTypes.Choice_2033);
		}
		if (relationshipType == CoordinationElementTypes.ControlConstructListFirst_4041) {
			types.add(CoordinationElementTypes.RepeatUntil_2035);
		}
		if (relationshipType == CoordinationElementTypes.ControlConstructListFirst_4041) {
			types.add(CoordinationElementTypes.RepeatWhile_2036);
		}
		if (relationshipType == CoordinationElementTypes.ControlConstructListFirst_4041) {
			types.add(CoordinationElementTypes.IfThenElse_2037);
		}
		if (relationshipType == CoordinationElementTypes.ControlConstructListFirst_4041) {
			types.add(CoordinationElementTypes.Split_2039);
		}
		if (relationshipType == CoordinationElementTypes.ControlConstructListFirst_4041) {
			types.add(CoordinationElementTypes.SplitJoin_2040);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(CoordinationElementTypes.SequenceComponents_4033);
		types.add(CoordinationElementTypes.ControlConstructListRest_4035);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == CoordinationElementTypes.SequenceComponents_4033) {
			types.add(CoordinationElementTypes.Sequence_2029);
		}
		if (relationshipType == CoordinationElementTypes.ControlConstructListRest_4035) {
			types.add(CoordinationElementTypes.ControlConstructList_2034);
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
	public class ControlConstructListFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		public ControlConstructListFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_CENTER);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_CENTER);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(20)));
			this.setLineWidth(1);
			this.setLineStyle(Graphics.LINE_DASH);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			WrappingLabel controlConstructListFigureLabel0 = new WrappingLabel();
			controlConstructListFigureLabel0.setText("Control Construct List");

			this.add(controlConstructListFigureLabel0);

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

	}

}
