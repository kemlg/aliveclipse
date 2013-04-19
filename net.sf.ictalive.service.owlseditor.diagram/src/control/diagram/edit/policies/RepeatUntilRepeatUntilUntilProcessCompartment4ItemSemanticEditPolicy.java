package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.AnyOrder4CreateCommand;
import control.diagram.edit.commands.Choice5CreateCommand;
import control.diagram.edit.commands.IfThenElse4CreateCommand;
import control.diagram.edit.commands.Perform3CreateCommand;
import control.diagram.edit.commands.Produce3CreateCommand;
import control.diagram.edit.commands.RepeatUntil4CreateCommand;
import control.diagram.edit.commands.RepeatWhile3CreateCommand;
import control.diagram.edit.commands.Sequence5CreateCommand;
import control.diagram.edit.commands.Set3CreateCommand;
import control.diagram.edit.commands.Split4CreateCommand;
import control.diagram.edit.commands.SplitJoin4CreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class RepeatUntilRepeatUntilUntilProcessCompartment4ItemSemanticEditPolicy
		extends ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RepeatUntilRepeatUntilUntilProcessCompartment4ItemSemanticEditPolicy() {
		super(ControlElementTypes.RepeatUntil_3060);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.Sequence_3021 == req.getElementType()) {
			return getGEFWrapper(new Sequence5CreateCommand(req));
		}
		if (ControlElementTypes.Choice_3022 == req.getElementType()) {
			return getGEFWrapper(new Choice5CreateCommand(req));
		}
		if (ControlElementTypes.AnyOrder_3023 == req.getElementType()) {
			return getGEFWrapper(new AnyOrder4CreateCommand(req));
		}
		if (ControlElementTypes.Split_3024 == req.getElementType()) {
			return getGEFWrapper(new Split4CreateCommand(req));
		}
		if (ControlElementTypes.SplitJoin_3025 == req.getElementType()) {
			return getGEFWrapper(new SplitJoin4CreateCommand(req));
		}
		if (ControlElementTypes.IfThenElse_3026 == req.getElementType()) {
			return getGEFWrapper(new IfThenElse4CreateCommand(req));
		}
		if (ControlElementTypes.RepeatUntil_3058 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil4CreateCommand(req));
		}
		if (ControlElementTypes.RepeatWhile_3059 == req.getElementType()) {
			return getGEFWrapper(new RepeatWhile3CreateCommand(req));
		}
		if (ControlElementTypes.Perform_3061 == req.getElementType()) {
			return getGEFWrapper(new Perform3CreateCommand(req));
		}
		if (ControlElementTypes.Produce_3062 == req.getElementType()) {
			return getGEFWrapper(new Produce3CreateCommand(req));
		}
		if (ControlElementTypes.Set_3063 == req.getElementType()) {
			return getGEFWrapper(new Set3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
