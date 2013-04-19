package net.sf.ictalive.coordination.tasks.diagram.edit.policies;

import net.sf.ictalive.coordination.tasks.diagram.edit.commands.IndividualID3CreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.IndividualVariable3CreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentItemSemanticEditPolicy
		extends CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IndividualPropertyAtomIndividualPropertyAtomArg2CompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.IndividualPropertyAtom_3036);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.IndividualID_3039 == req.getElementType()) {
			return getGEFWrapper(new IndividualID3CreateCommand(req));
		}
		if (CoordinationElementTypes.IndividualVariable_3040 == req
				.getElementType()) {
			return getGEFWrapper(new IndividualVariable3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
