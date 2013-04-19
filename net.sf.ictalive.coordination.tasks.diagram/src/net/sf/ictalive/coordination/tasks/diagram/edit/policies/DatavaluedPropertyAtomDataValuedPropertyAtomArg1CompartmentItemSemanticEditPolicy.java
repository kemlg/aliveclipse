package net.sf.ictalive.coordination.tasks.diagram.edit.policies;

import net.sf.ictalive.coordination.tasks.diagram.edit.commands.IndividualID6CreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.IndividualVariable6CreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentItemSemanticEditPolicy
		extends CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DatavaluedPropertyAtomDataValuedPropertyAtomArg1CompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.DatavaluedPropertyAtom_3052);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.IndividualVariable_3053 == req
				.getElementType()) {
			return getGEFWrapper(new IndividualVariable6CreateCommand(req));
		}
		if (CoordinationElementTypes.IndividualID_3054 == req.getElementType()) {
			return getGEFWrapper(new IndividualID6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
