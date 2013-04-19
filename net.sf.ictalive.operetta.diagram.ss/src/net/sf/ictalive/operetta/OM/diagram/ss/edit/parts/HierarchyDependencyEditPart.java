package net.sf.ictalive.operetta.OM.diagram.ss.edit.parts;

import net.sf.ictalive.operetta.OM.diagram.ss.edit.policies.HierarchyDependencyItemSemanticEditPolicy;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class HierarchyDependencyEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4003;

	/**
	 * @generated
	 */
	public HierarchyDependencyEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new HierarchyDependencyItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof HierarchyDependencyNameEditPart) {
			((HierarchyDependencyNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureHierarchyDependencyNameFigure());
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
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof HierarchyDependencyNameEditPart) {
			return true;
		}
		return false;
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
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new HierarchyDependencyFigure();
	}

	/**
	 * @generated
	 */
	public HierarchyDependencyFigure getPrimaryShape() {
		return (HierarchyDependencyFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class HierarchyDependencyFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureHierarchyDependencyNameFigure;

		/**
		 * @generated
		 */
		public HierarchyDependencyFigure() {
			this.setLineWidth(2);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated NOT
		 * Added wrapping text labels
		 */
		private void createContents() {

			fFigureHierarchyDependencyNameFigure = new WrappingLabel();
			fFigureHierarchyDependencyNameFigure.setText("");
			fFigureHierarchyDependencyNameFigure.setTextWrap(true); //added to allow wrapping labels.

			this.add(fFigureHierarchyDependencyNameFigure);
			fFigureHierarchyDependencyNameFigure
					.setLayoutManager(new StackLayout());

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			df.setLineWidth(2);
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHierarchyDependencyNameFigure() {
			return fFigureHierarchyDependencyNameFigure;
		}

	}

}
