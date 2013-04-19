/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.ControlConstructListCreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class SequenceSequenceComponentsCompartmentItemSemanticEditPolicy extends
		ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SequenceSequenceComponentsCompartmentItemSemanticEditPolicy() {
		super(ControlElementTypes.Sequence_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.ControlConstructList_3001 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructListCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
