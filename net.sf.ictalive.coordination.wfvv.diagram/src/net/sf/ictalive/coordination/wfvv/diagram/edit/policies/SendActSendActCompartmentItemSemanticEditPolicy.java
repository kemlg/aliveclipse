package net.sf.ictalive.coordination.wfvv.diagram.edit.policies;

import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.Message2CreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.providers.WfvvElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class SendActSendActCompartmentItemSemanticEditPolicy extends
		WfvvBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SendActSendActCompartmentItemSemanticEditPolicy() {
		super(WfvvElementTypes.SendAct_3010);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WfvvElementTypes.Message_3011 == req.getElementType()) {
			return getGEFWrapper(new Message2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
