package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.AnyOrder6CreateCommand;
import control.diagram.edit.commands.Choice7CreateCommand;
import control.diagram.edit.commands.IfThenElse6CreateCommand;
import control.diagram.edit.commands.Perform5CreateCommand;
import control.diagram.edit.commands.Produce5CreateCommand;
import control.diagram.edit.commands.RepeatUntil3CreateCommand;
import control.diagram.edit.commands.RepeatWhile5CreateCommand;
import control.diagram.edit.commands.Sequence7CreateCommand;
import control.diagram.edit.commands.Set5CreateCommand;
import control.diagram.edit.commands.Split6CreateCommand;
import control.diagram.edit.commands.SplitJoin6CreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class IfThenElseIfThenElseElseCompartment7ItemSemanticEditPolicy extends
		ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IfThenElseIfThenElseElseCompartment7ItemSemanticEditPolicy() {
		super(ControlElementTypes.IfThenElse_2009);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.Sequence_3051 == req.getElementType()) {
			return getGEFWrapper(new Sequence7CreateCommand(req));
		}
		if (ControlElementTypes.Choice_3052 == req.getElementType()) {
			return getGEFWrapper(new Choice7CreateCommand(req));
		}
		if (ControlElementTypes.AnyOrder_3053 == req.getElementType()) {
			return getGEFWrapper(new AnyOrder6CreateCommand(req));
		}
		if (ControlElementTypes.Split_3054 == req.getElementType()) {
			return getGEFWrapper(new Split6CreateCommand(req));
		}
		if (ControlElementTypes.SplitJoin_3055 == req.getElementType()) {
			return getGEFWrapper(new SplitJoin6CreateCommand(req));
		}
		if (ControlElementTypes.IfThenElse_3056 == req.getElementType()) {
			return getGEFWrapper(new IfThenElse6CreateCommand(req));
		}
		if (ControlElementTypes.RepeatUntil_3057 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil3CreateCommand(req));
		}
		if (ControlElementTypes.RepeatWhile_3070 == req.getElementType()) {
			return getGEFWrapper(new RepeatWhile5CreateCommand(req));
		}
		if (ControlElementTypes.Perform_3071 == req.getElementType()) {
			return getGEFWrapper(new Perform5CreateCommand(req));
		}
		if (ControlElementTypes.Produce_3072 == req.getElementType()) {
			return getGEFWrapper(new Produce5CreateCommand(req));
		}
		if (ControlElementTypes.Set_3073 == req.getElementType()) {
			return getGEFWrapper(new Set5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
