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
public class ResultResultHasResultVarCompartment2ItemSemanticEditPolicy extends
		ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ResultResultHasResultVarCompartment2ItemSemanticEditPolicy() {
		super(ControlElementTypes.Result_2018);
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
