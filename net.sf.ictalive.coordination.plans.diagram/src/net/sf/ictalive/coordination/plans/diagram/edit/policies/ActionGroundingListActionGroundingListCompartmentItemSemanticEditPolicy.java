package net.sf.ictalive.coordination.plans.diagram.edit.policies;

import net.sf.ictalive.coordination.plans.diagram.edit.commands.ActionGroundingCreateCommand;
import net.sf.ictalive.coordination.plans.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ActionGroundingListActionGroundingListCompartmentItemSemanticEditPolicy
		extends CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActionGroundingListActionGroundingListCompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.ActionGroundingList_2011);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.ActionGrounding_3003 == req
				.getElementType()) {
			return getGEFWrapper(new ActionGroundingCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
