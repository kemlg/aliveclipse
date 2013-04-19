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
public class ChoiceChoiceComponentsCompartment7ItemSemanticEditPolicy extends
		ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ChoiceChoiceComponentsCompartment7ItemSemanticEditPolicy() {
		super(ControlElementTypes.Choice_2005);
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
