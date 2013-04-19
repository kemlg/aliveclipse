package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import net.sf.ictalive.coordination.actions.diagram.edit.commands.Expression2CreateCommand;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AtomicActionResultAtomicActionResultDeleteEffectCompartmentItemSemanticEditPolicy
		extends CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AtomicActionResultAtomicActionResultDeleteEffectCompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.AtomicActionResult_3081);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.Expression_3083 == req.getElementType()) {
			return getGEFWrapper(new Expression2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
