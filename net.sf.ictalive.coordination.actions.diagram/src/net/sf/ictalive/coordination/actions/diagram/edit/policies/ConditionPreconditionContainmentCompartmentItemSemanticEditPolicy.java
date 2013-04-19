package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import net.sf.ictalive.coordination.actions.diagram.edit.commands.AtomListCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ConditionPreconditionContainmentCompartmentItemSemanticEditPolicy
		extends CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConditionPreconditionContainmentCompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.Condition_3080);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.AtomList_3055 == req.getElementType()) {
			return getGEFWrapper(new AtomListCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
