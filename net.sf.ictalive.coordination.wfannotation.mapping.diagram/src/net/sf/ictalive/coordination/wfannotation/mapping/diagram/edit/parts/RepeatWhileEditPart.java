package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies.RepeatWhileCanonicalEditPolicy;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies.RepeatWhileItemSemanticEditPolicy;
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
public class RepeatWhileEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2011;

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
	public RepeatWhileEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new RepeatWhileItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new RepeatWhileCanonicalEditPolicy());
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
		RepeatWhileFigure figure = new RepeatWhileFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public RepeatWhileFigure getPrimaryShape() {
		return (RepeatWhileFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RepeatWhileRepeatWhileCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureRepeatWhileCompartmentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((RepeatWhileRepeatWhileCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RepeatWhileRepeatWhileCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureRepeatWhileCompartmentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((RepeatWhileRepeatWhileCompartmentEditPart) childEditPart)
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
		if (editPart instanceof RepeatWhileRepeatWhileCompartmentEditPart) {
			return getPrimaryShape().getFigureRepeatWhileCompartmentRectangle();
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
		types.add(MappingElementTypes.RepeatWhileWhileProcess_4013);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof SequenceEditPart) {
			types.add(MappingElementTypes.RepeatWhileWhileProcess_4013);
		}
		if (targetEditPart instanceof AnyOrderEditPart) {
			types.add(MappingElementTypes.RepeatWhileWhileProcess_4013);
		}
		if (targetEditPart instanceof PerformEditPart) {
			types.add(MappingElementTypes.RepeatWhileWhileProcess_4013);
		}
		if (targetEditPart instanceof ChoiceEditPart) {
			types.add(MappingElementTypes.RepeatWhileWhileProcess_4013);
		}
		if (targetEditPart instanceof RepeatUntilEditPart) {
			types.add(MappingElementTypes.RepeatWhileWhileProcess_4013);
		}
		if (targetEditPart instanceof net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts.RepeatWhileEditPart) {
			types.add(MappingElementTypes.RepeatWhileWhileProcess_4013);
		}
		if (targetEditPart instanceof IfThenElseEditPart) {
			types.add(MappingElementTypes.RepeatWhileWhileProcess_4013);
		}
		if (targetEditPart instanceof SplitEditPart) {
			types.add(MappingElementTypes.RepeatWhileWhileProcess_4013);
		}
		if (targetEditPart instanceof SplitJoinEditPart) {
			types.add(MappingElementTypes.RepeatWhileWhileProcess_4013);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == MappingElementTypes.RepeatWhileWhileProcess_4013) {
			types.add(MappingElementTypes.Sequence_2004);
		}
		if (relationshipType == MappingElementTypes.RepeatWhileWhileProcess_4013) {
			types.add(MappingElementTypes.AnyOrder_2005);
		}
		if (relationshipType == MappingElementTypes.RepeatWhileWhileProcess_4013) {
			types.add(MappingElementTypes.Perform_2007);
		}
		if (relationshipType == MappingElementTypes.RepeatWhileWhileProcess_4013) {
			types.add(MappingElementTypes.Choice_2008);
		}
		if (relationshipType == MappingElementTypes.RepeatWhileWhileProcess_4013) {
			types.add(MappingElementTypes.RepeatUntil_2010);
		}
		if (relationshipType == MappingElementTypes.RepeatWhileWhileProcess_4013) {
			types.add(MappingElementTypes.RepeatWhile_2011);
		}
		if (relationshipType == MappingElementTypes.RepeatWhileWhileProcess_4013) {
			types.add(MappingElementTypes.IfThenElse_2012);
		}
		if (relationshipType == MappingElementTypes.RepeatWhileWhileProcess_4013) {
			types.add(MappingElementTypes.Split_2015);
		}
		if (relationshipType == MappingElementTypes.RepeatWhileWhileProcess_4013) {
			types.add(MappingElementTypes.SplitJoin_2016);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(MappingElementTypes.WhileToRepeatWhileMapping_4018);
		types.add(MappingElementTypes.ForToRepeatWhileMapping_4021);
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
		if (relationshipType == MappingElementTypes.WhileToRepeatWhileMapping_4018) {
			types.add(MappingElementTypes.While_3102);
		}
		if (relationshipType == MappingElementTypes.WhileToRepeatWhileMapping_4018) {
			types.add(MappingElementTypes.While_3119);
		}
		if (relationshipType == MappingElementTypes.WhileToRepeatWhileMapping_4018) {
			types.add(MappingElementTypes.While_3127);
		}
		if (relationshipType == MappingElementTypes.WhileToRepeatWhileMapping_4018) {
			types.add(MappingElementTypes.While_3148);
		}
		if (relationshipType == MappingElementTypes.WhileToRepeatWhileMapping_4018) {
			types.add(MappingElementTypes.While_3152);
		}
		if (relationshipType == MappingElementTypes.WhileToRepeatWhileMapping_4018) {
			types.add(MappingElementTypes.While_3161);
		}
		if (relationshipType == MappingElementTypes.WhileToRepeatWhileMapping_4018) {
			types.add(MappingElementTypes.While_3205);
		}
		if (relationshipType == MappingElementTypes.WhileToRepeatWhileMapping_4018) {
			types.add(MappingElementTypes.While_3209);
		}
		if (relationshipType == MappingElementTypes.WhileToRepeatWhileMapping_4018) {
			types.add(MappingElementTypes.While_3223);
		}
		if (relationshipType == MappingElementTypes.WhileToRepeatWhileMapping_4018) {
			types.add(MappingElementTypes.While_3238);
		}
		if (relationshipType == MappingElementTypes.WhileToRepeatWhileMapping_4018) {
			types.add(MappingElementTypes.While_3262);
		}
		if (relationshipType == MappingElementTypes.WhileToRepeatWhileMapping_4018) {
			types.add(MappingElementTypes.While_3278);
		}
		if (relationshipType == MappingElementTypes.WhileToRepeatWhileMapping_4018) {
			types.add(MappingElementTypes.While_3294);
		}
		if (relationshipType == MappingElementTypes.ForToRepeatWhileMapping_4021) {
			types.add(MappingElementTypes.ForEach_3015);
		}
		if (relationshipType == MappingElementTypes.ForToRepeatWhileMapping_4021) {
			types.add(MappingElementTypes.ForEach_3022);
		}
		if (relationshipType == MappingElementTypes.ForToRepeatWhileMapping_4021) {
			types.add(MappingElementTypes.ForEach_3031);
		}
		if (relationshipType == MappingElementTypes.ForToRepeatWhileMapping_4021) {
			types.add(MappingElementTypes.ForEach_3070);
		}
		if (relationshipType == MappingElementTypes.ForToRepeatWhileMapping_4021) {
			types.add(MappingElementTypes.ForEach_3088);
		}
		if (relationshipType == MappingElementTypes.ForToRepeatWhileMapping_4021) {
			types.add(MappingElementTypes.ForEach_3115);
		}
		if (relationshipType == MappingElementTypes.ForToRepeatWhileMapping_4021) {
			types.add(MappingElementTypes.ForEach_3120);
		}
		if (relationshipType == MappingElementTypes.ForToRepeatWhileMapping_4021) {
			types.add(MappingElementTypes.ForEach_3153);
		}
		if (relationshipType == MappingElementTypes.ForToRepeatWhileMapping_4021) {
			types.add(MappingElementTypes.ForEach_3170);
		}
		if (relationshipType == MappingElementTypes.ForToRepeatWhileMapping_4021) {
			types.add(MappingElementTypes.ForEach_3180);
		}
		if (relationshipType == MappingElementTypes.ForToRepeatWhileMapping_4021) {
			types.add(MappingElementTypes.ForEach_3247);
		}
		if (relationshipType == MappingElementTypes.ForToRepeatWhileMapping_4021) {
			types.add(MappingElementTypes.ForEach_3263);
		}
		if (relationshipType == MappingElementTypes.ForToRepeatWhileMapping_4021) {
			types.add(MappingElementTypes.ForEach_3279);
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
	public class RepeatWhileFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureRepeatWhileCompartmentRectangle;

		/**
		 * @generated
		 */
		public RepeatWhileFigure() {

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

			WrappingLabel repeatWhileFigureConditonLabel0 = new WrappingLabel();
			repeatWhileFigureConditonLabel0.setText("Repeat While");

			GridData constraintRepeatWhileFigureConditonLabel0 = new GridData();
			constraintRepeatWhileFigureConditonLabel0.verticalAlignment = GridData.CENTER;
			constraintRepeatWhileFigureConditonLabel0.horizontalAlignment = GridData.CENTER;
			constraintRepeatWhileFigureConditonLabel0.horizontalIndent = 0;
			constraintRepeatWhileFigureConditonLabel0.horizontalSpan = 1;
			constraintRepeatWhileFigureConditonLabel0.verticalSpan = 1;
			constraintRepeatWhileFigureConditonLabel0.grabExcessHorizontalSpace = false;
			constraintRepeatWhileFigureConditonLabel0.grabExcessVerticalSpace = false;
			this.add(repeatWhileFigureConditonLabel0,
					constraintRepeatWhileFigureConditonLabel0);

			fFigureRepeatWhileCompartmentRectangle = new RectangleFigure();
			fFigureRepeatWhileCompartmentRectangle.setLineWidth(1);

			GridData constraintFFigureRepeatWhileCompartmentRectangle = new GridData();
			constraintFFigureRepeatWhileCompartmentRectangle.verticalAlignment = GridData.FILL;
			constraintFFigureRepeatWhileCompartmentRectangle.horizontalAlignment = GridData.FILL;
			constraintFFigureRepeatWhileCompartmentRectangle.horizontalIndent = 0;
			constraintFFigureRepeatWhileCompartmentRectangle.horizontalSpan = 1;
			constraintFFigureRepeatWhileCompartmentRectangle.verticalSpan = 1;
			constraintFFigureRepeatWhileCompartmentRectangle.grabExcessHorizontalSpace = true;
			constraintFFigureRepeatWhileCompartmentRectangle.grabExcessVerticalSpace = true;
			this.add(fFigureRepeatWhileCompartmentRectangle,
					constraintFFigureRepeatWhileCompartmentRectangle);

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
		public RectangleFigure getFigureRepeatWhileCompartmentRectangle() {
			return fFigureRepeatWhileCompartmentRectangle;
		}

	}

}
