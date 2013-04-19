package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.Condition6CreateCommand;
import control.diagram.edit.commands.Expr6CreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class RepeatWhileRepeatWhileWhileConditionCompartment3ItemSemanticEditPolicy
		extends ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RepeatWhileRepeatWhileWhileConditionCompartment3ItemSemanticEditPolicy() {
		super(ControlElementTypes.RepeatWhile_3065);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.Condition_3113 == req.getElementType()) {
			return getGEFWrapper(new Condition6CreateCommand(req));
		}
		if (ControlElementTypes.Expr_3114 == req.getElementType()) {
			return getGEFWrapper(new Expr6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
