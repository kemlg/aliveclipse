/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.Condition3CreateCommand;
import control.diagram.edit.commands.Expr3CreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class ResultResultHasEffectCompartment2ItemSemanticEditPolicy extends
		ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ResultResultHasEffectCompartment2ItemSemanticEditPolicy() {
		super(ControlElementTypes.Result_2018);
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
