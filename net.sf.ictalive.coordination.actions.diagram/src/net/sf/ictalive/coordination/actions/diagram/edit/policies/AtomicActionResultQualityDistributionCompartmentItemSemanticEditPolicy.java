package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import net.sf.ictalive.coordination.actions.diagram.edit.commands.Distribution3CreateCommand;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AtomicActionResultQualityDistributionCompartmentItemSemanticEditPolicy
		extends CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AtomicActionResultQualityDistributionCompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.AtomicActionResult_3081);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.Distribution_3086 == req.getElementType()) {
			return getGEFWrapper(new Distribution3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
