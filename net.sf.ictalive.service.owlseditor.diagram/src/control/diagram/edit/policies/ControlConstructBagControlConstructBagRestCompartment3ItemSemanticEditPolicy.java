/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.ControlConstructBag5CreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class ControlConstructBagControlConstructBagRestCompartment3ItemSemanticEditPolicy
		extends ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ControlConstructBagControlConstructBagRestCompartment3ItemSemanticEditPolicy() {
		super(ControlElementTypes.ControlConstructBag_3010);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.ControlConstructBag_3082 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructBag5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
