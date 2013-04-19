/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.Condition3CreateCommand;
import control.diagram.edit.commands.Condition4CreateCommand;
import control.diagram.edit.commands.Expr3CreateCommand;
import control.diagram.edit.commands.Expr4CreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class ResultResultHasEffectCompartmentItemSemanticEditPolicy extends
		ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ResultResultHasEffectCompartmentItemSemanticEditPolicy() {
		super(ControlElementTypes.Result_3107);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.Condition_3099 == req.getElementType()) {
			return getGEFWrapper(new Condition3CreateCommand(req));
		}
		if (ControlElementTypes.Expr_3101 == req.getElementType()) {
			return getGEFWrapper(new Expr3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
