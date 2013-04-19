package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import net.sf.ictalive.coordination.actions.diagram.edit.commands.Distribution2CreateCommand;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AtomicActionResultDurationDistributionCompartmentItemSemanticEditPolicy
		extends CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AtomicActionResultDurationDistributionCompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.AtomicActionResult_3081);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.Distribution_3085 == req.getElementType()) {
			return getGEFWrapper(new Distribution2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
