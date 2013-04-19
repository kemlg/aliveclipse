package net.sf.ictalive.coordination.wfvv.diagram.edit.policies;

import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ActionGroundingCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.providers.WfvvElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ActionGroundingListActionGroundingListCompartmentItemSemanticEditPolicy
		extends WfvvBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActionGroundingListActionGroundingListCompartmentItemSemanticEditPolicy() {
		super(WfvvElementTypes.ActionGroundingList_2022);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WfvvElementTypes.ActionGrounding_3027 == req.getElementType()) {
			return getGEFWrapper(new ActionGroundingCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
