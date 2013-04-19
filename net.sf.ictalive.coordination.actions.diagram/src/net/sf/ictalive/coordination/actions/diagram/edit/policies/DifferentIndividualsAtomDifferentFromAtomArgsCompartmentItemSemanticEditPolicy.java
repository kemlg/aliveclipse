package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import net.sf.ictalive.coordination.actions.diagram.edit.commands.IndividualID5CreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.IndividualVariable5CreateCommand;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DifferentIndividualsAtomDifferentFromAtomArgsCompartmentItemSemanticEditPolicy
		extends CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DifferentIndividualsAtomDifferentFromAtomArgsCompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.DifferentIndividualsAtom_3067);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.IndividualID_3068 == req.getElementType()) {
			return getGEFWrapper(new IndividualID5CreateCommand(req));
		}
		if (CoordinationElementTypes.IndividualVariable_3069 == req
				.getElementType()) {
			return getGEFWrapper(new IndividualVariable5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
