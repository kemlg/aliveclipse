package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies.RepeatUntilCanonicalEditPolicy;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies.RepeatUntilItemSemanticEditPolicy;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

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
public class RepeatUntilEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2010;

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
	public RepeatUntilEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new RepeatUntilItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new RepeatUntilCanonicalEditPolicy());
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
		RepeatUntilFigure figure = new RepeatUntilFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public RepeatUntilFigure getPrimaryShape() {
		return (RepeatUntilFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RepeatUntilRepeatUntilCompartment13EditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureRepeatUntilCompartmentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((RepeatUntilRepeatUntilCompartment13EditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RepeatUntilRepeatUntilCompartment13EditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureRepeatUntilCompartmentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((RepeatUntilRepeatUntilCompartment13EditPart) childEditPart)
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
		if (editPart instanceof RepeatUntilRepeatUntilCompartment13EditPart) {
			return getPrimaryShape().getFigureRepeatUntilCompartmentRectangle();
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
		types.add(MappingElementTypes.RepeatUntilUntilProcess_4012);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof SequenceEditPart) {
			types.add(MappingElementTypes.RepeatUntilUntilProcess_4012);
		}
		if (targetEditPart instanceof AnyOrderEditPart) {
			types.add(MappingElementTypes.RepeatUntilUntilProcess_4012);
		}
		if (targetEditPart instanceof PerformEditPart) {
			types.add(MappingElementTypes.RepeatUntilUntilProcess_4012);
		}
		if (targetEditPart instanceof ChoiceEditPart) {
			types.add(MappingElementTypes.RepeatUntilUntilProcess_4012);
		}
		if (targetEditPart instanceof net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.RepeatUntilEditPart) {
			types.add(MappingElementTypes.RepeatUntilUntilProcess_4012);
		}
		if (targetEditPart instanceof RepeatWhileEditPart) {
			types.add(MappingElementTypes.RepeatUntilUntilProcess_4012);
		}
		if (targetEditPart instanceof IfThenElseEditPart) {
			types.add(MappingElementTypes.RepeatUntilUntilProcess_4012);
		}
		if (targetEditPart instanceof SplitEditPart) {
			types.add(MappingElementTypes.RepeatUntilUntilProcess_4012);
		}
		if (targetEditPart instanceof SplitJoinEditPart) {
			types.add(MappingElementTypes.RepeatUntilUntilProcess_4012);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == MappingElementTypes.RepeatUntilUntilProcess_4012) {
			types.add(MappingElementTypes.Sequence_2004);
		}
		if (relationshipType == MappingElementTypes.RepeatUntilUntilProcess_4012) {
			types.add(MappingElementTypes.AnyOrder_2005);
		}
		if (relationshipType == MappingElementTypes.RepeatUntilUntilProcess_4012) {
			types.add(MappingElementTypes.Perform_2007);
		}
		if (relationshipType == MappingElementTypes.RepeatUntilUntilProcess_4012) {
			types.add(MappingElementTypes.Choice_2008);
		}
		if (relationshipType == MappingElementTypes.RepeatUntilUntilProcess_4012) {
			types.add(MappingElementTypes.RepeatUntil_2010);
		}
		if (relationshipType == MappingElementTypes.RepeatUntilUntilProcess_4012) {
			types.add(MappingElementTypes.RepeatWhile_2011);
		}
		if (relationshipType == MappingElementTypes.RepeatUntilUntilProcess_4012) {
			types.add(MappingElementTypes.IfThenElse_2012);
		}
		if (relationshipType == MappingElementTypes.RepeatUntilUntilProcess_4012) {
			types.add(MappingElementTypes.Split_2015);
		}
		if (relationshipType == MappingElementTypes.RepeatUntilUntilProcess_4012) {
			types.add(MappingElementTypes.SplitJoin_2016);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(MappingElementTypes.RepeatUntilToRepeatUntilMapping_4019);
		types.add(MappingElementTypes.ElseToElseMapping_4024);
		types.add(MappingElementTypes.CompositeProcessComposedOf_4003);
		types.add(MappingElementTypes.IfThenElseThen_4010);
		types.add(MappingElementTypes.IfThenElseElse_4011);
		types.add(MappingElementTypes.RepeatUntilUntilProcess_4012);
		types.add(MappingElementTypes.RepeatWhileWhileProcess_4013);
		types.add(MappingElementTypes.ControlConstructBagFirst_4014);
		types.add(MappingElementTypes.ControlConstructListFirst_4015);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == MappingElementTypes.RepeatUntilToRepeatUntilMapping_4019) {
			types.add(MappingElementTypes.RepeatUntil_3062);
		}
		if (relationshipType == MappingElementTypes.RepeatUntilToRepeatUntilMapping_4019) {
			types.add(MappingElementTypes.RepeatUntil_3069);
		}
		if (relationshipType == MappingElementTypes.RepeatUntilToRepeatUntilMapping_4019) {
			types.add(MappingElementTypes.RepeatUntil_3072);
		}
		if (relationshipType == MappingElementTypes.RepeatUntilToRepeatUntilMapping_4019) {
			types.add(MappingElementTypes.RepeatUntil_3123);
		}
		if (relationshipType == MappingElementTypes.RepeatUntilToRepeatUntilMapping_4019) {
			types.add(MappingElementTypes.RepeatUntil_3133);
		}
		if (relationshipType == MappingElementTypes.RepeatUntilToRepeatUntilMapping_4019) {
			types.add(MappingElementTypes.RepeatUntil_3187);
		}
		if (relationshipType == MappingElementTypes.RepeatUntilToRepeatUntilMapping_4019) {
			types.add(MappingElementTypes.RepeatUntil_3197);
		}
		if (relationshipType == MappingElementTypes.RepeatUntilToRepeatUntilMapping_4019) {
			types.add(MappingElementTypes.RepeatUntil_3215);
		}
		if (relationshipType == MappingElementTypes.RepeatUntilToRepeatUntilMapping_4019) {
			types.add(MappingElementTypes.RepeatUntil_3230);
		}
		if (relationshipType == MappingElementTypes.RepeatUntilToRepeatUntilMapping_4019) {
			types.add(MappingElementTypes.RepeatUntil_3254);
		}
		if (relationshipType == MappingElementTypes.RepeatUntilToRepeatUntilMapping_4019) {
			types.add(MappingElementTypes.RepeatUntil_3270);
		}
		if (relationshipType == MappingElementTypes.RepeatUntilToRepeatUntilMapping_4019) {
			types.add(MappingElementTypes.RepeatUntil_3286);
		}
		if (relationshipType == MappingElementTypes.ElseToElseMapping_4024) {
			types.add(MappingElementTypes.Else_3172);
		}
		if (relationshipType == MappingElementTypes.CompositeProcessComposedOf_4003) {
			types.add(MappingElementTypes.CompositeAction_2014);
		}
		if (relationshipType == MappingElementTypes.IfThenElseThen_4010) {
			types.add(MappingElementTypes.IfThenElse_2012);
		}
		if (relationshipType == MappingElementTypes.IfThenElseElse_4011) {
			types.add(MappingElementTypes.IfThenElse_2012);
		}
		if (relationshipType == MappingElementTypes.RepeatUntilUntilProcess_4012) {
			types.add(MappingElementTypes.RepeatUntil_2010);
		}
		if (relationshipType == MappingElementTypes.RepeatWhileWhileProcess_4013) {
			types.add(MappingElementTypes.RepeatWhile_2011);
		}
		if (relationshipType == MappingElementTypes.ControlConstructBagFirst_4014) {
			types.add(MappingElementTypes.ControlConstructBag_2006);
		}
		if (relationshipType == MappingElementTypes.ControlConstructListFirst_4015) {
			types.add(MappingElementTypes.ControlConstructList_2009);
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
	public class RepeatUntilFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureRepeatUntilCompartmentRectangle;

		/**
		 * @generated
		 */
		public RepeatUntilFigure() {

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

			WrappingLabel repeatUntilFigureConditonLabel0 = new WrappingLabel();
			repeatUntilFigureConditonLabel0.setText("Repeat Until");

			GridData constraintRepeatUntilFigureConditonLabel0 = new GridData();
			constraintRepeatUntilFigureConditonLabel0.verticalAlignment = GridData.CENTER;
			constraintRepeatUntilFigureConditonLabel0.horizontalAlignment = GridData.CENTER;
			constraintRepeatUntilFigureConditonLabel0.horizontalIndent = 0;
			constraintRepeatUntilFigureConditonLabel0.horizontalSpan = 1;
			constraintRepeatUntilFigureConditonLabel0.verticalSpan = 1;
			constraintRepeatUntilFigureConditonLabel0.grabExcessHorizontalSpace = false;
			constraintRepeatUntilFigureConditonLabel0.grabExcessVerticalSpace = false;
			this.add(repeatUntilFigureConditonLabel0,
					constraintRepeatUntilFigureConditonLabel0);

			fFigureRepeatUntilCompartmentRectangle = new RectangleFigure();
			fFigureRepeatUntilCompartmentRectangle.setLineWidth(1);

			GridData constraintFFigureRepeatUntilCompartmentRectangle = new GridData();
			constraintFFigureRepeatUntilCompartmentRectangle.verticalAlignment = GridData.FILL;
			constraintFFigureRepeatUntilCompartmentRectangle.horizontalAlignment = GridData.FILL;
			constraintFFigureRepeatUntilCompartmentRectangle.horizontalIndent = 0;
			constraintFFigureRepeatUntilCompartmentRectangle.horizontalSpan = 1;
			constraintFFigureRepeatUntilCompartmentRectangle.verticalSpan = 1;
			constraintFFigureRepeatUntilCompartmentRectangle.grabExcessHorizontalSpace = true;
			constraintFFigureRepeatUntilCompartmentRectangle.grabExcessVerticalSpace = true;
			this.add(fFigureRepeatUntilCompartmentRectangle,
					constraintFFigureRepeatUntilCompartmentRectangle);

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
		public RectangleFigure getFigureRepeatUntilCompartmentRectangle() {
			return fFigureRepeatUntilCompartmentRectangle;
		}

	}

}
