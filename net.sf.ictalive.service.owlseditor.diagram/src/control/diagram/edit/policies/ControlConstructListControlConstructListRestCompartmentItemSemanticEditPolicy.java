/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.ControlConstructList2CreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class ControlConstructListControlConstructListRestCompartmentItemSemanticEditPolicy
		extends ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ControlConstructListControlConstructListRestCompartmentItemSemanticEditPolicy() {
		super(ControlElementTypes.ControlConstructList_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.ControlConstructList_3093 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructList2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
