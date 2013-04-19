/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.Condition2CreateCommand;
import control.diagram.edit.commands.Condition3CreateCommand;
import control.diagram.edit.commands.Expr2CreateCommand;
import control.diagram.edit.commands.Expr3CreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class ResultResultInConditionCompartmentItemSemanticEditPolicy extends
		ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ResultResultInConditionCompartmentItemSemanticEditPolicy() {
		super(ControlElementTypes.Result_3107);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.Condition_3098 == req.getElementType()) {
			return getGEFWrapper(new Condition2CreateCommand(req));
		}
		if (ControlElementTypes.Expr_3100 == req.getElementType()) {
			return getGEFWrapper(new Expr2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
