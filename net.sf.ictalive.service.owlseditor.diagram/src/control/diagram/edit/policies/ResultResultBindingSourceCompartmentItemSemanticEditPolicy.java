/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.ValueForm3CreateCommand;
import control.diagram.edit.commands.ValueFormCreateCommand;
import control.diagram.edit.commands.ValueFunction3CreateCommand;
import control.diagram.edit.commands.ValueFunctionCreateCommand;
import control.diagram.edit.commands.ValueSource3CreateCommand;
import control.diagram.edit.commands.ValueSourceCreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class ResultResultBindingSourceCompartmentItemSemanticEditPolicy extends
		ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ResultResultBindingSourceCompartmentItemSemanticEditPolicy() {
		super(ControlElementTypes.Result_3107);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.ValueSource_3094 == req.getElementType()) {
			return getGEFWrapper(new ValueSourceCreateCommand(req));
		}
		if (ControlElementTypes.ValueForm_3095 == req.getElementType()) {
			return getGEFWrapper(new ValueFormCreateCommand(req));
		}
		if (ControlElementTypes.ValueFunction_3096 == req.getElementType()) {
			return getGEFWrapper(new ValueFunctionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
