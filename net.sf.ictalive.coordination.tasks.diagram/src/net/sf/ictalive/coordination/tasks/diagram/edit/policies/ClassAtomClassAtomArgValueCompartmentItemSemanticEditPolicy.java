package net.sf.ictalive.coordination.tasks.diagram.edit.policies;

import net.sf.ictalive.coordination.tasks.diagram.edit.commands.IndividualIDCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.IndividualVariableCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.providers.CoordinationElementTypes;

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
		super(CoordinationElementTypes.ClassAtom_3033);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.IndividualID_3034 == req.getElementType()) {
			return getGEFWrapper(new IndividualIDCreateCommand(req));
		}
		if (CoordinationElementTypes.IndividualVariable_3035 == req
				.getElementType()) {
			return getGEFWrapper(new IndividualVariableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
