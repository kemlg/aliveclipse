package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.parts;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies.OnAlarmOnAlarmCompartment3CanonicalEditPolicy;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies.OnAlarmOnAlarmCompartment3ItemSemanticEditPolicy;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.part.Messages;

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
public class OnAlarmOnAlarmCompartment3EditPart extends
		ShapeCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7113;

	/**
	 * @generated
	 */
	public OnAlarmOnAlarmCompartment3EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.OnAlarmOnAlarmCompartment3EditPart_title;
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
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new OnAlarmOnAlarmCompartment3ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new OnAlarmOnAlarmCompartment3CanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		// nothing to do -- parent layout does not accept Double constraints as ratio
		// super.setRatio(ratio); 
	}

}
