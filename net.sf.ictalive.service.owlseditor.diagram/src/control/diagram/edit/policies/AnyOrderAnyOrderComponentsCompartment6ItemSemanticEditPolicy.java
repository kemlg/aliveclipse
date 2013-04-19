/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.ControlConstructBag2CreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class AnyOrderAnyOrderComponentsCompartment6ItemSemanticEditPolicy
		extends ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AnyOrderAnyOrderComponentsCompartment6ItemSemanticEditPolicy() {
		super(ControlElementTypes.AnyOrder_3083);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.ControlConstructBag_3008 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructBag2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
