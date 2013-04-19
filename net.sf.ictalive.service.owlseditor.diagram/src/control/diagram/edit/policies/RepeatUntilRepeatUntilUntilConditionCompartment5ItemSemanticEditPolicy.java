package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.Condition5CreateCommand;
import control.diagram.edit.commands.Expr5CreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class RepeatUntilRepeatUntilUntilConditionCompartment5ItemSemanticEditPolicy
		extends ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RepeatUntilRepeatUntilUntilConditionCompartment5ItemSemanticEditPolicy() {
		super(ControlElementTypes.RepeatUntil_3076);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.Condition_3111 == req.getElementType()) {
			return getGEFWrapper(new Condition5CreateCommand(req));
		}
		if (ControlElementTypes.Expr_3112 == req.getElementType()) {
			return getGEFWrapper(new Expr5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
