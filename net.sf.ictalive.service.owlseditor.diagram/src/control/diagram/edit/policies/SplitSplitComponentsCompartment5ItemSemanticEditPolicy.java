/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.ControlConstructBag3CreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class SplitSplitComponentsCompartment5ItemSemanticEditPolicy extends
		ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SplitSplitComponentsCompartment5ItemSemanticEditPolicy() {
		super(ControlElementTypes.Split_3054);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.ControlConstructBag_3010 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructBag3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
