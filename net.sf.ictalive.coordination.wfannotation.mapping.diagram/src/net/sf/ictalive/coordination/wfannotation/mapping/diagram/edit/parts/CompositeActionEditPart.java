package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies.CompositeActionCanonicalEditPolicy;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies.CompositeActionItemSemanticEditPolicy;
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
public class CompositeActionEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2014;

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
	public CompositeActionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompositeActionItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CompositeActionCanonicalEditPolicy());
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
		CompositeActionFigure figure = new CompositeActionFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public CompositeActionFigure getPrimaryShape() {
		return (CompositeActionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CompositeActionNameEditPart) {
			((CompositeActionNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureCompositeActionNameFigure());
			return true;
		}
		if (childEditPart instanceof CompositeActionCompositeActionCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCompositeActionCompartmentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((CompositeActionCompositeActionCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CompositeActionNameEditPart) {
			return true;
		}
		if (childEditPart instanceof CompositeActionCompositeActionCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCompositeActionCompartmentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((CompositeActionCompositeActionCompartmentEditPart) childEditPart)
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
		if (editPart instanceof CompositeActionCompositeActionCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureCompositeActionCompartmentRectangle();
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
				.getType(CompositeActionNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(MappingElementTypes.CompositeProcessComposedOf_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof SequenceEditPart) {
			types.add(MappingElementTypes.CompositeProcessComposedOf_4003);
		}
		if (targetEditPart instanceof AnyOrderEditPart) {
			types.add(MappingElementTypes.CompositeProcessComposedOf_4003);
		}
		if (targetEditPart instanceof PerformEditPart) {
			types.add(MappingElementTypes.CompositeProcessComposedOf_4003);
		}
		if (targetEditPart instanceof ChoiceEditPart) {
			types.add(MappingElementTypes.CompositeProcessComposedOf_4003);
		}
		if (targetEditPart instanceof RepeatUntilEditPart) {
			types.add(MappingElementTypes.CompositeProcessComposedOf_4003);
		}
		if (targetEditPart instanceof RepeatWhileEditPart) {
			types.add(MappingElementTypes.CompositeProcessComposedOf_4003);
		}
		if (targetEditPart instanceof IfThenElseEditPart) {
			types.add(MappingElementTypes.CompositeProcessComposedOf_4003);
		}
		if (targetEditPart instanceof SplitEditPart) {
			types.add(MappingElementTypes.CompositeProcessComposedOf_4003);
		}
		if (targetEditPart instanceof SplitJoinEditPart) {
			types.add(MappingElementTypes.CompositeProcessComposedOf_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == MappingElementTypes.CompositeProcessComposedOf_4003) {
			types.add(MappingElementTypes.Sequence_2004);
		}
		if (relationshipType == MappingElementTypes.CompositeProcessComposedOf_4003) {
			types.add(MappingElementTypes.AnyOrder_2005);
		}
		if (relationshipType == MappingElementTypes.CompositeProcessComposedOf_4003) {
			types.add(MappingElementTypes.Perform_2007);
		}
		if (relationshipType == MappingElementTypes.CompositeProcessComposedOf_4003) {
			types.add(MappingElementTypes.Choice_2008);
		}
		if (relationshipType == MappingElementTypes.CompositeProcessComposedOf_4003) {
			types.add(MappingElementTypes.RepeatUntil_2010);
		}
		if (relationshipType == MappingElementTypes.CompositeProcessComposedOf_4003) {
			types.add(MappingElementTypes.RepeatWhile_2011);
		}
		if (relationshipType == MappingElementTypes.CompositeProcessComposedOf_4003) {
			types.add(MappingElementTypes.IfThenElse_2012);
		}
		if (relationshipType == MappingElementTypes.CompositeProcessComposedOf_4003) {
			types.add(MappingElementTypes.Split_2015);
		}
		if (relationshipType == MappingElementTypes.CompositeProcessComposedOf_4003) {
			types.add(MappingElementTypes.SplitJoin_2016);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(MappingElementTypes.ProcessToCompositeActionMapping_4002);
		types.add(MappingElementTypes.ScopeToCompositeActionMapping_4022);
		types.add(MappingElementTypes.PerformProcess_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == MappingElementTypes.ProcessToCompositeActionMapping_4002) {
			types.add(MappingElementTypes.Process_2002);
		}
		if (relationshipType == MappingElementTypes.ScopeToCompositeActionMapping_4022) {
			types.add(MappingElementTypes.Scope_3080);
		}
		if (relationshipType == MappingElementTypes.ScopeToCompositeActionMapping_4022) {
			types.add(MappingElementTypes.Scope_3087);
		}
		if (relationshipType == MappingElementTypes.ScopeToCompositeActionMapping_4022) {
			types.add(MappingElementTypes.Scope_3091);
		}
		if (relationshipType == MappingElementTypes.ScopeToCompositeActionMapping_4022) {
			types.add(MappingElementTypes.Scope_3112);
		}
		if (relationshipType == MappingElementTypes.ScopeToCompositeActionMapping_4022) {
			types.add(MappingElementTypes.Scope_3136);
		}
		if (relationshipType == MappingElementTypes.ScopeToCompositeActionMapping_4022) {
			types.add(MappingElementTypes.Scope_3157);
		}
		if (relationshipType == MappingElementTypes.ScopeToCompositeActionMapping_4022) {
			types.add(MappingElementTypes.Scope_3190);
		}
		if (relationshipType == MappingElementTypes.ScopeToCompositeActionMapping_4022) {
			types.add(MappingElementTypes.Scope_3200);
		}
		if (relationshipType == MappingElementTypes.ScopeToCompositeActionMapping_4022) {
			types.add(MappingElementTypes.Scope_3218);
		}
		if (relationshipType == MappingElementTypes.ScopeToCompositeActionMapping_4022) {
			types.add(MappingElementTypes.Scope_3233);
		}
		if (relationshipType == MappingElementTypes.ScopeToCompositeActionMapping_4022) {
			types.add(MappingElementTypes.Scope_3257);
		}
		if (relationshipType == MappingElementTypes.ScopeToCompositeActionMapping_4022) {
			types.add(MappingElementTypes.Scope_3273);
		}
		if (relationshipType == MappingElementTypes.ScopeToCompositeActionMapping_4022) {
			types.add(MappingElementTypes.Scope_3289);
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
	public class CompositeActionFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureCompositeActionNameFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompositeActionCompartmentRectangle;

		/**
		 * @generated
		 */
		public CompositeActionFigure() {

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

			fFigureCompositeActionNameFigure = new WrappingLabel();
			fFigureCompositeActionNameFigure.setText("<...>");

			GridData constraintFFigureCompositeActionNameFigure = new GridData();
			constraintFFigureCompositeActionNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureCompositeActionNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureCompositeActionNameFigure.horizontalIndent = 0;
			constraintFFigureCompositeActionNameFigure.horizontalSpan = 1;
			constraintFFigureCompositeActionNameFigure.verticalSpan = 1;
			constraintFFigureCompositeActionNameFigure.grabExcessHorizontalSpace = false;
			constraintFFigureCompositeActionNameFigure.grabExcessVerticalSpace = false;
			this.add(fFigureCompositeActionNameFigure,
					constraintFFigureCompositeActionNameFigure);

			fFigureCompositeActionCompartmentRectangle = new RectangleFigure();
			fFigureCompositeActionCompartmentRectangle.setLineWidth(1);

			GridData constraintFFigureCompositeActionCompartmentRectangle = new GridData();
			constraintFFigureCompositeActionCompartmentRectangle.verticalAlignment = GridData.FILL;
			constraintFFigureCompositeActionCompartmentRectangle.horizontalAlignment = GridData.FILL;
			constraintFFigureCompositeActionCompartmentRectangle.horizontalIndent = 0;
			constraintFFigureCompositeActionCompartmentRectangle.horizontalSpan = 1;
			constraintFFigureCompositeActionCompartmentRectangle.verticalSpan = 1;
			constraintFFigureCompositeActionCompartmentRectangle.grabExcessHorizontalSpace = true;
			constraintFFigureCompositeActionCompartmentRectangle.grabExcessVerticalSpace = true;
			this.add(fFigureCompositeActionCompartmentRectangle,
					constraintFFigureCompositeActionCompartmentRectangle);

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
		public WrappingLabel getFigureCompositeActionNameFigure() {
			return fFigureCompositeActionNameFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompositeActionCompartmentRectangle() {
			return fFigureCompositeActionCompartmentRectangle;
		}

	}

}
