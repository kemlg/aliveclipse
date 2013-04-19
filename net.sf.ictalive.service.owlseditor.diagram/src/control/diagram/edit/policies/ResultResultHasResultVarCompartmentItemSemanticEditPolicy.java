/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.ResultVarCreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class ResultResultHasResultVarCompartmentItemSemanticEditPolicy extends
		ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ResultResultHasResultVarCompartmentItemSemanticEditPolicy() {
		super(ControlElementTypes.Result_3107);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.ResultVar_3097 == req.getElementType()) {
			return getGEFWrapper(new ResultVarCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
