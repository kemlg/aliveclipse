package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import net.sf.ictalive.coordination.actions.diagram.edit.commands.DistributionCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AtomicActionResultCostDistributionCompartmentItemSemanticEditPolicy
		extends CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AtomicActionResultCostDistributionCompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.AtomicActionResult_3081);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.Distribution_3084 == req.getElementType()) {
			return getGEFWrapper(new DistributionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
