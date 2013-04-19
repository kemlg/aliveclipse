/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.ValueFormCreateCommand;
import control.diagram.edit.commands.ValueFunctionCreateCommand;
import control.diagram.edit.commands.ValueSourceCreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class ResultResultBindingSourceCompartment2ItemSemanticEditPolicy extends
		ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ResultResultBindingSourceCompartment2ItemSemanticEditPolicy() {
		super(ControlElementTypes.Result_2018);
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
