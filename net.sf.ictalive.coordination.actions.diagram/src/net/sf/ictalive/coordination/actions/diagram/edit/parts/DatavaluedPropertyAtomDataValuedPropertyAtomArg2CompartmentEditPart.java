package net.sf.ictalive.coordination.actions.diagram.edit.parts;

import net.sf.ictalive.coordination.actions.diagram.edit.policies.DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentCanonicalEditPolicy;
import net.sf.ictalive.coordination.actions.diagram.edit.policies.DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentItemSemanticEditPolicy;
import net.sf.ictalive.coordination.actions.diagram.part.Messages;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart
		extends ShapeCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7043;

	/**
	 * @generated
	 */
	public DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart(
			View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentEditPart_title;
	}

	/**
	 * @generated
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		// nothing to do -- parent layout does not accept Double constraints as ratio
		// super.setRatio(ratio); 
	}

}
