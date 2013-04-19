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
public class SequenceSequenceComponentsCompartment6ItemSemanticEditPolicy
		extends ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SequenceSequenceComponentsCompartment6ItemSemanticEditPolicy() {
		super(ControlElementTypes.Sequence_3028);
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
