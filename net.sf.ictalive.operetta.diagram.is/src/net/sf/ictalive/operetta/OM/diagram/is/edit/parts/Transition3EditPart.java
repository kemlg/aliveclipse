package net.sf.ictalive.operetta.OM.diagram.is.edit.parts;

import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.operetta.OM.diagram.is.edit.policies.Transition3ItemSemanticEditPolicy;
import net.sf.ictalive.operetta.OM.diagram.is.providers.OperAElementTypes;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Polygon;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class Transition3EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2106;

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
	public Transition3EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Transition3ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		XYLayoutEditPolicy lep = new XYLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = super.createChildEditPolicy(child);
				if (result == null) {
					return new ResizableShapeEditPolicy();
				}
				return result;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		XORTransitionFigure figure = new XORTransitionFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public XORTransitionFigure getPrimaryShape() {
		return (XORTransitionFigure) primaryShape;
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
	public class XORTransitionFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		public XORTransitionFigure() {
			this.setLayoutManager(new XYLayout());
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

			Polygon xORTransitionFigure0 = new Polygon();
			xORTransitionFigure0.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			xORTransitionFigure0.addPoint(new Point(getMapMode().DPtoLP(15),
					getMapMode().DPtoLP(15)));
			xORTransitionFigure0.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(30)));
			xORTransitionFigure0.setFill(true);
			xORTransitionFigure0.setLineWidth(1);
			xORTransitionFigure0.setForegroundColor(XORTRANSITIONFIGURE0_FORE);
			xORTransitionFigure0.setBackgroundColor(XORTRANSITIONFIGURE0_BACK);

			this.add(xORTransitionFigure0);

			Polyline xOR10 = new Polyline();
			xOR10.addPoint(new Point(getMapMode().DPtoLP(1), getMapMode()
					.DPtoLP(10)));
			xOR10.addPoint(new Point(getMapMode().DPtoLP(8), getMapMode()
					.DPtoLP(20)));
			xOR10.setLineWidth(2);
			xOR10.setForegroundColor(XOR10_FORE);

			this.add(xOR10);

			Polyline xOR20 = new Polyline();
			xOR20.addPoint(new Point(getMapMode().DPtoLP(1), getMapMode()
					.DPtoLP(20)));
			xOR20.addPoint(new Point(getMapMode().DPtoLP(8), getMapMode()
					.DPtoLP(10)));
			xOR20.setLineWidth(2);
			xOR20.setForegroundColor(XOR20_FORE);

			this.add(xOR20);

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
	static final Color XORTRANSITIONFIGURE0_FORE = new Color(null, 50, 200, 110);

	/**
	 * @generated
	 */
	static final Color XORTRANSITIONFIGURE0_BACK = new Color(null, 30, 115, 60);

	/**
	 * @generated
	 */
	static final Color XOR10_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color XOR20_FORE = new Color(null, 0, 0, 0);

}
