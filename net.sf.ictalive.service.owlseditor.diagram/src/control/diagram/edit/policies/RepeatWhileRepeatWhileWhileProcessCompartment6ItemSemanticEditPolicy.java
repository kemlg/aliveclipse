package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.AnyOrder5CreateCommand;
import control.diagram.edit.commands.Choice6CreateCommand;
import control.diagram.edit.commands.IfThenElse5CreateCommand;
import control.diagram.edit.commands.Perform4CreateCommand;
import control.diagram.edit.commands.Produce4CreateCommand;
import control.diagram.edit.commands.RepeatUntil5CreateCommand;
import control.diagram.edit.commands.RepeatWhile4CreateCommand;
import control.diagram.edit.commands.Sequence6CreateCommand;
import control.diagram.edit.commands.Set4CreateCommand;
import control.diagram.edit.commands.Split5CreateCommand;
import control.diagram.edit.commands.SplitJoin5CreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class RepeatWhileRepeatWhileWhileProcessCompartment6ItemSemanticEditPolicy
		extends ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RepeatWhileRepeatWhileWhileProcessCompartment6ItemSemanticEditPolicy() {
		super(ControlElementTypes.RepeatWhile_3088);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.Sequence_3028 == req.getElementType()) {
			return getGEFWrapper(new Sequence6CreateCommand(req));
		}
		if (ControlElementTypes.Choice_3029 == req.getElementType()) {
			return getGEFWrapper(new Choice6CreateCommand(req));
		}
		if (ControlElementTypes.AnyOrder_3030 == req.getElementType()) {
			return getGEFWrapper(new AnyOrder5CreateCommand(req));
		}
		if (ControlElementTypes.Split_3031 == req.getElementType()) {
			return getGEFWrapper(new Split5CreateCommand(req));
		}
		if (ControlElementTypes.SplitJoin_3032 == req.getElementType()) {
			return getGEFWrapper(new SplitJoin5CreateCommand(req));
		}
		if (ControlElementTypes.IfThenElse_3033 == req.getElementType()) {
			return getGEFWrapper(new IfThenElse5CreateCommand(req));
		}
		if (ControlElementTypes.RepeatUntil_3060 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil5CreateCommand(req));
		}
		if (ControlElementTypes.RepeatWhile_3065 == req.getElementType()) {
			return getGEFWrapper(new RepeatWhile4CreateCommand(req));
		}
		if (ControlElementTypes.Perform_3066 == req.getElementType()) {
			return getGEFWrapper(new Perform4CreateCommand(req));
		}
		if (ControlElementTypes.Produce_3067 == req.getElementType()) {
			return getGEFWrapper(new Produce4CreateCommand(req));
		}
		if (ControlElementTypes.Set_3068 == req.getElementType()) {
			return getGEFWrapper(new Set4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
