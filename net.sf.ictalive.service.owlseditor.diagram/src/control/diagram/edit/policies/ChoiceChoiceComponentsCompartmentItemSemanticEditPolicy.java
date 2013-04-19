/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.ControlConstructBagCreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class ChoiceChoiceComponentsCompartmentItemSemanticEditPolicy extends
		ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ChoiceChoiceComponentsCompartmentItemSemanticEditPolicy() {
		super(ControlElementTypes.Choice_3003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.ControlConstructBag_3004 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructBagCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
