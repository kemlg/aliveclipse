package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import net.sf.ictalive.coordination.actions.diagram.edit.commands.ExpressionCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AtomicActionResultAtomicActionResultAddEffectCompartmentItemSemanticEditPolicy
		extends CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AtomicActionResultAtomicActionResultAddEffectCompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.AtomicActionResult_3081);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.Expression_3082 == req.getElementType()) {
			return getGEFWrapper(new ExpressionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
