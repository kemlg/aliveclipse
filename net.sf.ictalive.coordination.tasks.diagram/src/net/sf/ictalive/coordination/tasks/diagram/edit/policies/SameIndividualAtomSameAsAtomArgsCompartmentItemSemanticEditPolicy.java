package net.sf.ictalive.coordination.tasks.diagram.edit.policies;

import net.sf.ictalive.coordination.tasks.diagram.edit.commands.IndividualID4CreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.IndividualVariable4CreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class SameIndividualAtomSameAsAtomArgsCompartmentItemSemanticEditPolicy
		extends CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SameIndividualAtomSameAsAtomArgsCompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.SameIndividualAtom_3041);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.IndividualID_3042 == req.getElementType()) {
			return getGEFWrapper(new IndividualID4CreateCommand(req));
		}
		if (CoordinationElementTypes.IndividualVariable_3043 == req
				.getElementType()) {
			return getGEFWrapper(new IndividualVariable4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
