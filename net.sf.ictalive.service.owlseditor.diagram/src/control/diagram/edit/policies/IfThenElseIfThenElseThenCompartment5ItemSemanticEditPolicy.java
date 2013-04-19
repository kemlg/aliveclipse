package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.AnyOrder3CreateCommand;
import control.diagram.edit.commands.Choice4CreateCommand;
import control.diagram.edit.commands.IfThenElse3CreateCommand;
import control.diagram.edit.commands.Perform2CreateCommand;
import control.diagram.edit.commands.Produce2CreateCommand;
import control.diagram.edit.commands.RepeatUntil2CreateCommand;
import control.diagram.edit.commands.RepeatWhile2CreateCommand;
import control.diagram.edit.commands.Sequence4CreateCommand;
import control.diagram.edit.commands.Set2CreateCommand;
import control.diagram.edit.commands.Split3CreateCommand;
import control.diagram.edit.commands.SplitJoin3CreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class IfThenElseIfThenElseThenCompartment5ItemSemanticEditPolicy extends
		ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IfThenElseIfThenElseThenCompartment5ItemSemanticEditPolicy() {
		super(ControlElementTypes.IfThenElse_3056);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.Sequence_3014 == req.getElementType()) {
			return getGEFWrapper(new Sequence4CreateCommand(req));
		}
		if (ControlElementTypes.Choice_3015 == req.getElementType()) {
			return getGEFWrapper(new Choice4CreateCommand(req));
		}
		if (ControlElementTypes.AnyOrder_3016 == req.getElementType()) {
			return getGEFWrapper(new AnyOrder3CreateCommand(req));
		}
		if (ControlElementTypes.Split_3017 == req.getElementType()) {
			return getGEFWrapper(new Split3CreateCommand(req));
		}
		if (ControlElementTypes.SplitJoin_3018 == req.getElementType()) {
			return getGEFWrapper(new SplitJoin3CreateCommand(req));
		}
		if (ControlElementTypes.IfThenElse_3019 == req.getElementType()) {
			return getGEFWrapper(new IfThenElse3CreateCommand(req));
		}
		if (ControlElementTypes.RepeatUntil_3020 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil2CreateCommand(req));
		}
		if (ControlElementTypes.RepeatWhile_3027 == req.getElementType()) {
			return getGEFWrapper(new RepeatWhile2CreateCommand(req));
		}
		if (ControlElementTypes.Perform_3034 == req.getElementType()) {
			return getGEFWrapper(new Perform2CreateCommand(req));
		}
		if (ControlElementTypes.Produce_3043 == req.getElementType()) {
			return getGEFWrapper(new Produce2CreateCommand(req));
		}
		if (ControlElementTypes.Set_3047 == req.getElementType()) {
			return getGEFWrapper(new Set2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
