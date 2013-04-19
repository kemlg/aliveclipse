/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.AnyOrder2CreateCommand;
import control.diagram.edit.commands.Choice3CreateCommand;
import control.diagram.edit.commands.IfThenElse2CreateCommand;
import control.diagram.edit.commands.Perform6CreateCommand;
import control.diagram.edit.commands.Produce6CreateCommand;
import control.diagram.edit.commands.RepeatUntil6CreateCommand;
import control.diagram.edit.commands.RepeatWhile6CreateCommand;
import control.diagram.edit.commands.Sequence3CreateCommand;
import control.diagram.edit.commands.Set6CreateCommand;
import control.diagram.edit.commands.Split2CreateCommand;
import control.diagram.edit.commands.SplitJoin2CreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class ControlConstructBagControlConstructBagFirstCompartment5ItemSemanticEditPolicy
		extends ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ControlConstructBagControlConstructBagFirstCompartment5ItemSemanticEditPolicy() {
		super(ControlElementTypes.ControlConstructBag_3082);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.Sequence_3005 == req.getElementType()) {
			return getGEFWrapper(new Sequence3CreateCommand(req));
		}
		if (ControlElementTypes.Choice_3006 == req.getElementType()) {
			return getGEFWrapper(new Choice3CreateCommand(req));
		}
		if (ControlElementTypes.AnyOrder_3007 == req.getElementType()) {
			return getGEFWrapper(new AnyOrder2CreateCommand(req));
		}
		if (ControlElementTypes.Split_3009 == req.getElementType()) {
			return getGEFWrapper(new Split2CreateCommand(req));
		}
		if (ControlElementTypes.SplitJoin_3011 == req.getElementType()) {
			return getGEFWrapper(new SplitJoin2CreateCommand(req));
		}
		if (ControlElementTypes.IfThenElse_3013 == req.getElementType()) {
			return getGEFWrapper(new IfThenElse2CreateCommand(req));
		}
		if (ControlElementTypes.RepeatUntil_3076 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil6CreateCommand(req));
		}
		if (ControlElementTypes.RepeatWhile_3077 == req.getElementType()) {
			return getGEFWrapper(new RepeatWhile6CreateCommand(req));
		}
		if (ControlElementTypes.Perform_3078 == req.getElementType()) {
			return getGEFWrapper(new Perform6CreateCommand(req));
		}
		if (ControlElementTypes.Produce_3079 == req.getElementType()) {
			return getGEFWrapper(new Produce6CreateCommand(req));
		}
		if (ControlElementTypes.Set_3080 == req.getElementType()) {
			return getGEFWrapper(new Set6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
