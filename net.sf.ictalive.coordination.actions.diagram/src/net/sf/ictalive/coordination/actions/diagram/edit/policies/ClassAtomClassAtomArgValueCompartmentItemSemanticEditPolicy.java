package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import net.sf.ictalive.coordination.actions.diagram.edit.commands.IndividualIDCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.IndividualVariableCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ClassAtomClassAtomArgValueCompartmentItemSemanticEditPolicy extends
		CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClassAtomClassAtomArgValueCompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.ClassAtom_3056);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.IndividualID_3057 == req.getElementType()) {
			return getGEFWrapper(new IndividualIDCreateCommand(req));
		}
		if (CoordinationElementTypes.IndividualVariable_3058 == req
				.getElementType()) {
			return getGEFWrapper(new IndividualVariableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
