package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import net.sf.ictalive.coordination.actions.diagram.edit.commands.IndividualID2CreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.IndividualVariable2CreateCommand;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentItemSemanticEditPolicy
		extends CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IndividualPropertyAtomIndividualPropertyAtomArg1CompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.IndividualPropertyAtom_3059);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.IndividualID_3060 == req.getElementType()) {
			return getGEFWrapper(new IndividualID2CreateCommand(req));
		}
		if (CoordinationElementTypes.IndividualVariable_3061 == req
				.getElementType()) {
			return getGEFWrapper(new IndividualVariable2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
