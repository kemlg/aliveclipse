package net.sf.ictalive.coordination.tasks.diagram.edit.policies;

import net.sf.ictalive.coordination.tasks.diagram.edit.commands.IndividualID2CreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.IndividualVariable2CreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.providers.CoordinationElementTypes;

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
		super(CoordinationElementTypes.IndividualPropertyAtom_3036);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.IndividualID_3037 == req.getElementType()) {
			return getGEFWrapper(new IndividualID2CreateCommand(req));
		}
		if (CoordinationElementTypes.IndividualVariable_3038 == req
				.getElementType()) {
			return getGEFWrapper(new IndividualVariable2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
