/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.Condition2CreateCommand;
import control.diagram.edit.commands.Expr2CreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class ResultResultInConditionCompartment2ItemSemanticEditPolicy extends
		ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ResultResultInConditionCompartment2ItemSemanticEditPolicy() {
		super(ControlElementTypes.Result_2018);
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
