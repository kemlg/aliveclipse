package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import net.sf.ictalive.coordination.actions.diagram.edit.commands.AtomicActionResultCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.Condition2CreateCommand;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AtomicActionAtomicActionCompartmentItemSemanticEditPolicy extends
		CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AtomicActionAtomicActionCompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.AtomicAction_2025);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.Condition_3080 == req.getElementType()) {
			return getGEFWrapper(new Condition2CreateCommand(req));
		}
		if (CoordinationElementTypes.AtomicActionResult_3081 == req
				.getElementType()) {
			return getGEFWrapper(new AtomicActionResultCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
