/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.ValueForm2CreateCommand;
import control.diagram.edit.commands.ValueForm3CreateCommand;
import control.diagram.edit.commands.ValueFunction2CreateCommand;
import control.diagram.edit.commands.ValueFunction3CreateCommand;
import control.diagram.edit.commands.ValueSource2CreateCommand;
import control.diagram.edit.commands.ValueSource3CreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class SetSetProducedBindingValueSpecifierCompartmentItemSemanticEditPolicy
		extends ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SetSetProducedBindingValueSpecifierCompartmentItemSemanticEditPolicy() {
		super(ControlElementTypes.Set_3047);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.ValueSource_3048 == req.getElementType()) {
			return getGEFWrapper(new ValueSource3CreateCommand(req));
		}
		if (ControlElementTypes.ValueForm_3049 == req.getElementType()) {
			return getGEFWrapper(new ValueForm3CreateCommand(req));
		}
		if (ControlElementTypes.ValueFunction_3050 == req.getElementType()) {
			return getGEFWrapper(new ValueFunction3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
