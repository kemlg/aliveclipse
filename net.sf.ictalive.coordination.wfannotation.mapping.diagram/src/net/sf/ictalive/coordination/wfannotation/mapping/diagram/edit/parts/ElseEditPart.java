package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies.ElseCanonicalEditPolicy;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies.ElseItemSemanticEditPolicy;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies.MappingTextSelectionEditPolicy;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.part.MappingVisualIDRegistry;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
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
public class ElseEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3172;

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
	public ElseEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ElseItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new ElseCanonicalEditPolicy());
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
						return new MappingTextSelectionEditPolicy();
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
		ElseFigureDescriptor figure = new ElseFigureDescriptor();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ElseFigureDescriptor getPrimaryShape() {
		return (ElseFigureDescriptor) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel6EditPart) {
			((WrappingLabel6EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureElseFigureTitleLabel());
			return true;
		}
		if (childEditPart instanceof ElseElseCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureElseFigureContainer();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ElseElseCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel6EditPart) {
			return true;
		}
		if (childEditPart instanceof ElseElseCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureElseFigureContainer();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ElseElseCompartmentEditPart) childEditPart)
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
		if (editPart instanceof ElseElseCompartmentEditPart) {
			return getPrimaryShape().getFigureElseFigureContainer();
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
		return getChildBySemanticHint(MappingVisualIDRegistry
				.getType(WrappingLabel6EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(MappingElementTypes.ElseToElseMapping_4024);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof SequenceEditPart) {
			types.add(MappingElementTypes.ElseToElseMapping_4024);
		}
		if (targetEditPart instanceof AnyOrderEditPart) {
			types.add(MappingElementTypes.ElseToElseMapping_4024);
		}
		if (targetEditPart instanceof PerformEditPart) {
			types.add(MappingElementTypes.ElseToElseMapping_4024);
		}
		if (targetEditPart instanceof ChoiceEditPart) {
			types.add(MappingElementTypes.ElseToElseMapping_4024);
		}
		if (targetEditPart instanceof RepeatUntilEditPart) {
			types.add(MappingElementTypes.ElseToElseMapping_4024);
		}
		if (targetEditPart instanceof RepeatWhileEditPart) {
			types.add(MappingElementTypes.ElseToElseMapping_4024);
		}
		if (targetEditPart instanceof IfThenElseEditPart) {
			types.add(MappingElementTypes.ElseToElseMapping_4024);
		}
		if (targetEditPart instanceof SplitEditPart) {
			types.add(MappingElementTypes.ElseToElseMapping_4024);
		}
		if (targetEditPart instanceof SplitJoinEditPart) {
			types.add(MappingElementTypes.ElseToElseMapping_4024);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == MappingElementTypes.ElseToElseMapping_4024) {
			types.add(MappingElementTypes.Sequence_2004);
		}
		if (relationshipType == MappingElementTypes.ElseToElseMapping_4024) {
			types.add(MappingElementTypes.AnyOrder_2005);
		}
		if (relationshipType == MappingElementTypes.ElseToElseMapping_4024) {
			types.add(MappingElementTypes.Perform_2007);
		}
		if (relationshipType == MappingElementTypes.ElseToElseMapping_4024) {
			types.add(MappingElementTypes.Choice_2008);
		}
		if (relationshipType == MappingElementTypes.ElseToElseMapping_4024) {
			types.add(MappingElementTypes.RepeatUntil_2010);
		}
		if (relationshipType == MappingElementTypes.ElseToElseMapping_4024) {
			types.add(MappingElementTypes.RepeatWhile_2011);
		}
		if (relationshipType == MappingElementTypes.ElseToElseMapping_4024) {
			types.add(MappingElementTypes.IfThenElse_2012);
		}
		if (relationshipType == MappingElementTypes.ElseToElseMapping_4024) {
			types.add(MappingElementTypes.Split_2015);
		}
		if (relationshipType == MappingElementTypes.ElseToElseMapping_4024) {
			types.add(MappingElementTypes.SplitJoin_2016);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class ElseFigureDescriptor extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureElseFigureTitleLabel;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureElseFigureContainer;

		/**
		 * @generated
		 */
		public ElseFigureDescriptor() {

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

			fFigureElseFigureTitleLabel = new WrappingLabel();
			fFigureElseFigureTitleLabel.setText("Else");

			this.add(fFigureElseFigureTitleLabel);

			fFigureElseFigureContainer = new RectangleFigure();
			fFigureElseFigureContainer.setLineWidth(1);

			this.add(fFigureElseFigureContainer);
			fFigureElseFigureContainer.setLayoutManager(new StackLayout());

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
		public WrappingLabel getFigureElseFigureTitleLabel() {
			return fFigureElseFigureTitleLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureElseFigureContainer() {
			return fFigureElseFigureContainer;
		}

	}

}
