package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies.ControlConstructBagCanonicalEditPolicy;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies.ControlConstructBagItemSemanticEditPolicy;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

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
public class ControlConstructBagEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2006;

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
	public ControlConstructBagEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ControlConstructBagItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new ControlConstructBagCanonicalEditPolicy());
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
		ControlConstructBagFigure figure = new ControlConstructBagFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ControlConstructBagFigure getPrimaryShape() {
		return (ControlConstructBagFigure) primaryShape;
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
		types.add(MappingElementTypes.ControlConstructBagRest_4008);
		types.add(MappingElementTypes.ControlConstructBagFirst_4014);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.ControlConstructBagEditPart) {
			types.add(MappingElementTypes.ControlConstructBagRest_4008);
		}
		if (targetEditPart instanceof SequenceEditPart) {
			types.add(MappingElementTypes.ControlConstructBagFirst_4014);
		}
		if (targetEditPart instanceof AnyOrderEditPart) {
			types.add(MappingElementTypes.ControlConstructBagFirst_4014);
		}
		if (targetEditPart instanceof PerformEditPart) {
			types.add(MappingElementTypes.ControlConstructBagFirst_4014);
		}
		if (targetEditPart instanceof ChoiceEditPart) {
			types.add(MappingElementTypes.ControlConstructBagFirst_4014);
		}
		if (targetEditPart instanceof RepeatUntilEditPart) {
			types.add(MappingElementTypes.ControlConstructBagFirst_4014);
		}
		if (targetEditPart instanceof RepeatWhileEditPart) {
			types.add(MappingElementTypes.ControlConstructBagFirst_4014);
		}
		if (targetEditPart instanceof IfThenElseEditPart) {
			types.add(MappingElementTypes.ControlConstructBagFirst_4014);
		}
		if (targetEditPart instanceof SplitEditPart) {
			types.add(MappingElementTypes.ControlConstructBagFirst_4014);
		}
		if (targetEditPart instanceof SplitJoinEditPart) {
			types.add(MappingElementTypes.ControlConstructBagFirst_4014);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == MappingElementTypes.ControlConstructBagRest_4008) {
			types.add(MappingElementTypes.ControlConstructBag_2006);
		}
		if (relationshipType == MappingElementTypes.ControlConstructBagFirst_4014) {
			types.add(MappingElementTypes.Sequence_2004);
		}
		if (relationshipType == MappingElementTypes.ControlConstructBagFirst_4014) {
			types.add(MappingElementTypes.AnyOrder_2005);
		}
		if (relationshipType == MappingElementTypes.ControlConstructBagFirst_4014) {
			types.add(MappingElementTypes.Perform_2007);
		}
		if (relationshipType == MappingElementTypes.ControlConstructBagFirst_4014) {
			types.add(MappingElementTypes.Choice_2008);
		}
		if (relationshipType == MappingElementTypes.ControlConstructBagFirst_4014) {
			types.add(MappingElementTypes.RepeatUntil_2010);
		}
		if (relationshipType == MappingElementTypes.ControlConstructBagFirst_4014) {
			types.add(MappingElementTypes.RepeatWhile_2011);
		}
		if (relationshipType == MappingElementTypes.ControlConstructBagFirst_4014) {
			types.add(MappingElementTypes.IfThenElse_2012);
		}
		if (relationshipType == MappingElementTypes.ControlConstructBagFirst_4014) {
			types.add(MappingElementTypes.Split_2015);
		}
		if (relationshipType == MappingElementTypes.ControlConstructBagFirst_4014) {
			types.add(MappingElementTypes.SplitJoin_2016);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(MappingElementTypes.ChoiceComponents_4005);
		types.add(MappingElementTypes.AnyOrderComponents_4006);
		types.add(MappingElementTypes.ControlConstructBagRest_4008);
		types.add(MappingElementTypes.SplitComponents_4025);
		types.add(MappingElementTypes.SplitJoinComponents_4026);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == MappingElementTypes.ChoiceComponents_4005) {
			types.add(MappingElementTypes.Choice_2008);
		}
		if (relationshipType == MappingElementTypes.AnyOrderComponents_4006) {
			types.add(MappingElementTypes.AnyOrder_2005);
		}
		if (relationshipType == MappingElementTypes.ControlConstructBagRest_4008) {
			types.add(MappingElementTypes.ControlConstructBag_2006);
		}
		if (relationshipType == MappingElementTypes.SplitComponents_4025) {
			types.add(MappingElementTypes.Split_2015);
		}
		if (relationshipType == MappingElementTypes.SplitJoinComponents_4026) {
			types.add(MappingElementTypes.SplitJoin_2016);
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
	public class ControlConstructBagFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		public ControlConstructBagFigure() {

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

			WrappingLabel controlConstructBagFigureLabel0 = new WrappingLabel();
			controlConstructBagFigureLabel0.setText("Control Construct Bag");

			this.add(controlConstructBagFigureLabel0);

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
