package net.sf.ictalive.operetta.OM.diagram.is.edit.parts;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.operetta.OM.diagram.is.edit.policies.TransitionItemSemanticEditPolicy;
import net.sf.ictalive.operetta.OM.diagram.is.providers.OperAElementTypes;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Polygon;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class TransitionEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2104;

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
	public TransitionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new TransitionItemSemanticEditPolicy());
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
		ANDTransitionFigure figure = new ANDTransitionFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ANDTransitionFigure getPrimaryShape() {
		return (ANDTransitionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(15, 30);
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.NONE);
		}
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
		types.add(OperAElementTypes.TransitionToSceneArc_4101);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof SceneEditPart) {
			types.add(OperAElementTypes.TransitionToSceneArc_4101);
		}
		if (targetEditPart instanceof Scene2EditPart) {
			types.add(OperAElementTypes.TransitionToSceneArc_4101);
		}
		if (targetEditPart instanceof Scene3EditPart) {
			types.add(OperAElementTypes.TransitionToSceneArc_4101);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == OperAElementTypes.TransitionToSceneArc_4101) {
			types.add(OperAElementTypes.Scene_2101);
		}
		if (relationshipType == OperAElementTypes.TransitionToSceneArc_4101) {
			types.add(OperAElementTypes.Scene_2102);
		}
		if (relationshipType == OperAElementTypes.TransitionToSceneArc_4101) {
			types.add(OperAElementTypes.Scene_2103);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(OperAElementTypes.SceneToTransitionArc_4102);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == OperAElementTypes.SceneToTransitionArc_4102) {
			types.add(OperAElementTypes.Scene_2101);
		}
		if (relationshipType == OperAElementTypes.SceneToTransitionArc_4102) {
			types.add(OperAElementTypes.Scene_2102);
		}
		if (relationshipType == OperAElementTypes.SceneToTransitionArc_4102) {
			types.add(OperAElementTypes.Scene_2103);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class ANDTransitionFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		public ANDTransitionFigure() {
			this.setFill(false);
			this.setOutline(false);
			this.setLineWidth(1);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(15),
					getMapMode().DPtoLP(30)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			Polygon aNDTransitionFigure0 = new Polygon();
			aNDTransitionFigure0.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			aNDTransitionFigure0.addPoint(new Point(getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(0)));
			aNDTransitionFigure0.addPoint(new Point(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(1)));
			aNDTransitionFigure0.addPoint(new Point(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(3)));
			aNDTransitionFigure0.addPoint(new Point(getMapMode().DPtoLP(11),
					getMapMode().DPtoLP(6)));
			aNDTransitionFigure0.addPoint(new Point(getMapMode().DPtoLP(12),
					getMapMode().DPtoLP(8)));
			aNDTransitionFigure0.addPoint(new Point(getMapMode().DPtoLP(13),
					getMapMode().DPtoLP(11)));
			aNDTransitionFigure0.addPoint(new Point(getMapMode().DPtoLP(14),
					getMapMode().DPtoLP(14)));
			aNDTransitionFigure0.addPoint(new Point(getMapMode().DPtoLP(14),
					getMapMode().DPtoLP(16)));
			aNDTransitionFigure0.addPoint(new Point(getMapMode().DPtoLP(13),
					getMapMode().DPtoLP(19)));
			aNDTransitionFigure0.addPoint(new Point(getMapMode().DPtoLP(12),
					getMapMode().DPtoLP(22)));
			aNDTransitionFigure0.addPoint(new Point(getMapMode().DPtoLP(11),
					getMapMode().DPtoLP(24)));
			aNDTransitionFigure0.addPoint(new Point(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(27)));
			aNDTransitionFigure0.addPoint(new Point(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(29)));
			aNDTransitionFigure0.addPoint(new Point(getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(30)));
			aNDTransitionFigure0.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(30)));
			aNDTransitionFigure0.setFill(true);
			aNDTransitionFigure0.setLineWidth(1);
			aNDTransitionFigure0.setForegroundColor(ANDTRANSITIONFIGURE0_FORE);
			aNDTransitionFigure0.setBackgroundColor(ANDTRANSITIONFIGURE0_BACK);

			this.add(aNDTransitionFigure0);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = true;

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

	/**
	 * @generated
	 */
	static final Color ANDTRANSITIONFIGURE0_FORE = new Color(null, 225, 80, 70);

	/**
	 * @generated
	 */
	static final Color ANDTRANSITIONFIGURE0_BACK = new Color(null, 150, 25, 100);

}
