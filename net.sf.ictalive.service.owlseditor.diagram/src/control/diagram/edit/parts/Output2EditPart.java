/*
 * 
 */
package control.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import control.diagram.edit.policies.Output2ItemSemanticEditPolicy;
import control.diagram.part.ControlVisualIDRegistry;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class Output2EditPart extends AbstractBorderItemEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3106;

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
	public Output2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				getPrimaryDragEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Output2ItemSemanticEditPolicy());
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
		OutputFigure figure = new OutputFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public OutputFigure getPrimaryShape() {
		return (OutputFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OutputName2EditPart) {
			((OutputName2EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureOutputLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OutputName2EditPart) {
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
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);

		//FIXME: workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());
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
		return getChildBySemanticHint(ControlVisualIDRegistry
				.getType(OutputName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(ControlElementTypes.LocBinding_4001);
		types.add(ControlElementTypes.InputBinding_4002);
		types.add(ControlElementTypes.OutputBinding_4003);
		types.add(ControlElementTypes.LinkBinding_4004);
		types.add(ControlElementTypes.OutputBindingSource_4005);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof LocEditPart) {
			types.add(ControlElementTypes.LocBinding_4001);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(ControlElementTypes.InputBinding_4002);
		}
		if (targetEditPart instanceof Input2EditPart) {
			types.add(ControlElementTypes.InputBinding_4002);
		}
		if (targetEditPart instanceof OutputEditPart) {
			types.add(ControlElementTypes.OutputBinding_4003);
		}
		if (targetEditPart instanceof control.diagram.edit.parts.Output2EditPart) {
			types.add(ControlElementTypes.OutputBinding_4003);
		}
		if (targetEditPart instanceof LinkEditPart) {
			types.add(ControlElementTypes.LinkBinding_4004);
		}
		if (targetEditPart instanceof ValueSourceEditPart) {
			types.add(ControlElementTypes.OutputBindingSource_4005);
		}
		if (targetEditPart instanceof ValueFormEditPart) {
			types.add(ControlElementTypes.OutputBindingSource_4005);
		}
		if (targetEditPart instanceof ValueFunctionEditPart) {
			types.add(ControlElementTypes.OutputBindingSource_4005);
		}
		if (targetEditPart instanceof ValueSource2EditPart) {
			types.add(ControlElementTypes.OutputBindingSource_4005);
		}
		if (targetEditPart instanceof ValueForm2EditPart) {
			types.add(ControlElementTypes.OutputBindingSource_4005);
		}
		if (targetEditPart instanceof ValueFunction2EditPart) {
			types.add(ControlElementTypes.OutputBindingSource_4005);
		}
		if (targetEditPart instanceof ValueSource3EditPart) {
			types.add(ControlElementTypes.OutputBindingSource_4005);
		}
		if (targetEditPart instanceof ValueForm3EditPart) {
			types.add(ControlElementTypes.OutputBindingSource_4005);
		}
		if (targetEditPart instanceof ValueFunction3EditPart) {
			types.add(ControlElementTypes.OutputBindingSource_4005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == ControlElementTypes.LocBinding_4001) {
			types.add(ControlElementTypes.Loc_2003);
		}
		if (relationshipType == ControlElementTypes.InputBinding_4002) {
			types.add(ControlElementTypes.Input_2027);
		}
		if (relationshipType == ControlElementTypes.InputBinding_4002) {
			types.add(ControlElementTypes.Input_3105);
		}
		if (relationshipType == ControlElementTypes.OutputBinding_4003) {
			types.add(ControlElementTypes.Output_2028);
		}
		if (relationshipType == ControlElementTypes.OutputBinding_4003) {
			types.add(ControlElementTypes.Output_3106);
		}
		if (relationshipType == ControlElementTypes.LinkBinding_4004) {
			types.add(ControlElementTypes.Link_2015);
		}
		if (relationshipType == ControlElementTypes.OutputBindingSource_4005) {
			types.add(ControlElementTypes.ValueSource_3094);
		}
		if (relationshipType == ControlElementTypes.OutputBindingSource_4005) {
			types.add(ControlElementTypes.ValueForm_3095);
		}
		if (relationshipType == ControlElementTypes.OutputBindingSource_4005) {
			types.add(ControlElementTypes.ValueFunction_3096);
		}
		if (relationshipType == ControlElementTypes.OutputBindingSource_4005) {
			types.add(ControlElementTypes.ValueSource_3044);
		}
		if (relationshipType == ControlElementTypes.OutputBindingSource_4005) {
			types.add(ControlElementTypes.ValueForm_3045);
		}
		if (relationshipType == ControlElementTypes.OutputBindingSource_4005) {
			types.add(ControlElementTypes.ValueFunction_3046);
		}
		if (relationshipType == ControlElementTypes.OutputBindingSource_4005) {
			types.add(ControlElementTypes.ValueSource_3048);
		}
		if (relationshipType == ControlElementTypes.OutputBindingSource_4005) {
			types.add(ControlElementTypes.ValueForm_3049);
		}
		if (relationshipType == ControlElementTypes.OutputBindingSource_4005) {
			types.add(ControlElementTypes.ValueFunction_3050);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(ControlElementTypes.OutputBinding_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == ControlElementTypes.OutputBinding_4003) {
			types.add(ControlElementTypes.Input_2027);
		}
		if (relationshipType == ControlElementTypes.OutputBinding_4003) {
			types.add(ControlElementTypes.Output_2028);
		}
		if (relationshipType == ControlElementTypes.OutputBinding_4003) {
			types.add(ControlElementTypes.Input_3105);
		}
		if (relationshipType == ControlElementTypes.OutputBinding_4003) {
			types.add(ControlElementTypes.Output_3106);
		}
		if (relationshipType == ControlElementTypes.OutputBinding_4003) {
			types.add(ControlElementTypes.ValueSource_3094);
		}
		if (relationshipType == ControlElementTypes.OutputBinding_4003) {
			types.add(ControlElementTypes.ValueForm_3095);
		}
		if (relationshipType == ControlElementTypes.OutputBinding_4003) {
			types.add(ControlElementTypes.ValueFunction_3096);
		}
		if (relationshipType == ControlElementTypes.OutputBinding_4003) {
			types.add(ControlElementTypes.ValueSource_3044);
		}
		if (relationshipType == ControlElementTypes.OutputBinding_4003) {
			types.add(ControlElementTypes.ValueForm_3045);
		}
		if (relationshipType == ControlElementTypes.OutputBinding_4003) {
			types.add(ControlElementTypes.ValueFunction_3046);
		}
		if (relationshipType == ControlElementTypes.OutputBinding_4003) {
			types.add(ControlElementTypes.ValueSource_3048);
		}
		if (relationshipType == ControlElementTypes.OutputBinding_4003) {
			types.add(ControlElementTypes.ValueForm_3049);
		}
		if (relationshipType == ControlElementTypes.OutputBinding_4003) {
			types.add(ControlElementTypes.ValueFunction_3050);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class OutputFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureOutputLabelFigure;

		/**
		 * @generated
		 */
		public OutputFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setLineWidth(1);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureOutputLabelFigure = new WrappingLabel();
			fFigureOutputLabelFigure.setText("Output");

			this.add(fFigureOutputLabelFigure);

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
		public WrappingLabel getFigureOutputLabelFigure() {
			return fFigureOutputLabelFigure;
		}

	}

}
