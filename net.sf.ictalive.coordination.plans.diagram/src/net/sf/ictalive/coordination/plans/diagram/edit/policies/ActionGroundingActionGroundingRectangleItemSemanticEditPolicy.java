package net.sf.ictalive.coordination.plans.diagram.edit.policies;

import net.sf.ictalive.coordination.plans.diagram.edit.commands.InputMessageMapCreateCommand;
import net.sf.ictalive.coordination.plans.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ActionGroundingActionGroundingRectangleItemSemanticEditPolicy
		extends CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActionGroundingActionGroundingRectangleItemSemanticEditPolicy() {
		super(CoordinationElementTypes.ActionGrounding_3003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.InputMessageMap_3004 == req
				.getElementType()) {
			return getGEFWrapper(new InputMessageMapCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
