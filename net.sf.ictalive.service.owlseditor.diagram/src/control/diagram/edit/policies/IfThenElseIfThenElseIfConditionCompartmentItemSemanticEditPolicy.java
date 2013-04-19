package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.Condition7CreateCommand;
import control.diagram.edit.commands.Expr7CreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class IfThenElseIfThenElseIfConditionCompartmentItemSemanticEditPolicy
		extends ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IfThenElseIfThenElseIfConditionCompartmentItemSemanticEditPolicy() {
		super(ControlElementTypes.IfThenElse_3013);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.Condition_3115 == req.getElementType()) {
			return getGEFWrapper(new Condition7CreateCommand(req));
		}
		if (ControlElementTypes.Expr_3116 == req.getElementType()) {
			return getGEFWrapper(new Expr7CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
