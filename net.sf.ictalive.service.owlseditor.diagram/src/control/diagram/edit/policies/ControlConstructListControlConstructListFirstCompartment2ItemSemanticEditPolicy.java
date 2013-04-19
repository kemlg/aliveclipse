/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.AnyOrder7CreateCommand;
import control.diagram.edit.commands.Choice2CreateCommand;
import control.diagram.edit.commands.IfThenElse7CreateCommand;
import control.diagram.edit.commands.Perform7CreateCommand;
import control.diagram.edit.commands.Produce7CreateCommand;
import control.diagram.edit.commands.RepeatUntil7CreateCommand;
import control.diagram.edit.commands.RepeatWhile7CreateCommand;
import control.diagram.edit.commands.Sequence2CreateCommand;
import control.diagram.edit.commands.Set7CreateCommand;
import control.diagram.edit.commands.Split7CreateCommand;
import control.diagram.edit.commands.SplitJoin7CreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class ControlConstructListControlConstructListFirstCompartment2ItemSemanticEditPolicy
		extends ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ControlConstructListControlConstructListFirstCompartment2ItemSemanticEditPolicy() {
		super(ControlElementTypes.ControlConstructList_3093);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.Sequence_3002 == req.getElementType()) {
			return getGEFWrapper(new Sequence2CreateCommand(req));
		}
		if (ControlElementTypes.Choice_3003 == req.getElementType()) {
			return getGEFWrapper(new Choice2CreateCommand(req));
		}
		if (ControlElementTypes.AnyOrder_3083 == req.getElementType()) {
			return getGEFWrapper(new AnyOrder7CreateCommand(req));
		}
		if (ControlElementTypes.Split_3084 == req.getElementType()) {
			return getGEFWrapper(new Split7CreateCommand(req));
		}
		if (ControlElementTypes.SplitJoin_3085 == req.getElementType()) {
			return getGEFWrapper(new SplitJoin7CreateCommand(req));
		}
		if (ControlElementTypes.IfThenElse_3086 == req.getElementType()) {
			return getGEFWrapper(new IfThenElse7CreateCommand(req));
		}
		if (ControlElementTypes.RepeatUntil_3087 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil7CreateCommand(req));
		}
		if (ControlElementTypes.RepeatWhile_3088 == req.getElementType()) {
			return getGEFWrapper(new RepeatWhile7CreateCommand(req));
		}
		if (ControlElementTypes.Perform_3089 == req.getElementType()) {
			return getGEFWrapper(new Perform7CreateCommand(req));
		}
		if (ControlElementTypes.Produce_3090 == req.getElementType()) {
			return getGEFWrapper(new Produce7CreateCommand(req));
		}
		if (ControlElementTypes.Set_3091 == req.getElementType()) {
			return getGEFWrapper(new Set7CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
