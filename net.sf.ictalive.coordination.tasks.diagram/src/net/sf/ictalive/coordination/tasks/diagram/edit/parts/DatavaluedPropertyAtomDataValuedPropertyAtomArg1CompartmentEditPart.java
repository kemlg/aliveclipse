package net.sf.ictalive.coordination.tasks.diagram.edit.parts;

import net.sf.ictalive.coordination.tasks.diagram.edit.policies.DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentCanonicalEditPolicy;
import net.sf.ictalive.coordination.tasks.diagram.edit.policies.DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentItemSemanticEditPolicy;
import net.sf.ictalive.coordination.tasks.diagram.part.Messages;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart
		extends ListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7024;

	/**
	 * @generated
	 */
	public DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart(
			View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentEditPart_title;
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
				new DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		// nothing to do -- parent layout does not accept Double constraints as ratio
		// super.setRatio(ratio); 
	}

}
