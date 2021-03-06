package net.sf.ictalive.coordination.actions.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.actions.diagram.edit.policies.ActionActionAtomActionEditPolicy;
import net.sf.ictalive.coordination.actions.diagram.edit.policies.AtomicActionCanonicalEditPolicy;
import net.sf.ictalive.coordination.actions.diagram.edit.policies.AtomicActionItemSemanticEditPolicy;
import net.sf.ictalive.coordination.actions.diagram.part.CoordinationVisualIDRegistry;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

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
	public static final int VISUAL_ID = 2025;

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
		if (childEditPart instanceof AtomicActionAtomicActionCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureAtomicActionCompartmentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((AtomicActionAtomicActionCompartmentEditPart) childEditPart)
							.getFigure());
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
		if (childEditPart instanceof AtomicActionAtomicActionCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureAtomicActionCompartmentRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((AtomicActionAtomicActionCompartmentEditPart) childEditPart)
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
		if (editPart instanceof AtomicActionAtomicActionCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureAtomicActionCompartmentRectangle();
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
		return getChildBySemanticHint(CoordinationVisualIDRegistry
				.getType(AtomicActionNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(CoordinationElementTypes.ProcessHasInput_4026);
		types.add(CoordinationElementTypes.ProcessHasOutput_4027);
		types.add(CoordinationElementTypes.ProcessPerformedBy_4028);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof InputEditPart) {
			types.add(CoordinationElementTypes.ProcessHasInput_4026);
		}
		if (targetEditPart instanceof OutputEditPart) {
			types.add(CoordinationElementTypes.ProcessHasOutput_4027);
		}
		if (targetEditPart instanceof ParticipantEditPart) {
			types.add(CoordinationElementTypes.ProcessPerformedBy_4028);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == CoordinationElementTypes.ProcessHasInput_4026) {
			types.add(CoordinationElementTypes.Input_2026);
		}
		if (relationshipType == CoordinationElementTypes.ProcessHasOutput_4027) {
			types.add(CoordinationElementTypes.Output_2027);
		}
		if (relationshipType == CoordinationElementTypes.ProcessPerformedBy_4028) {
			types.add(CoordinationElementTypes.Participant_2028);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(CoordinationElementTypes.PerformProcess_4030);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == CoordinationElementTypes.PerformProcess_4030) {
			types.add(CoordinationElementTypes.Perform_2032);
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
