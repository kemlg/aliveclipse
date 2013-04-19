package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import net.sf.ictalive.coordination.actions.diagram.edit.commands.ConditionCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CompositeActionCompositeActionCompartmentItemSemanticEditPolicy
		extends CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositeActionCompositeActionCompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.CompositeAction_2024);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.Condition_3054 == req.getElementType()) {
			return getGEFWrapper(new ConditionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
