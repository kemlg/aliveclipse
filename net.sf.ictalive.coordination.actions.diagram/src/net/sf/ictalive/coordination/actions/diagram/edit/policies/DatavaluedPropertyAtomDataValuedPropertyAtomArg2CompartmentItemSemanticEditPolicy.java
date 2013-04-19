package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import net.sf.ictalive.coordination.actions.diagram.edit.commands.DataLiteral2CreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.DataVariable2CreateCommand;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentItemSemanticEditPolicy
		extends CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DatavaluedPropertyAtomDataValuedPropertyAtomArg2CompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.DatavaluedPropertyAtom_3075);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.DataLiteral_3078 == req.getElementType()) {
			return getGEFWrapper(new DataLiteral2CreateCommand(req));
		}
		if (CoordinationElementTypes.DataVariable_3079 == req.getElementType()) {
			return getGEFWrapper(new DataVariable2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
