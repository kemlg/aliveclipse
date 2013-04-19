/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.ControlConstructBag4CreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class SplitJoinSplitJoinComponentsCompartment4ItemSemanticEditPolicy
		extends ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SplitJoinSplitJoinComponentsCompartment4ItemSemanticEditPolicy() {
		super(ControlElementTypes.SplitJoin_3032);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.ControlConstructBag_3012 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructBag4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
