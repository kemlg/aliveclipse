package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import net.sf.ictalive.coordination.actions.diagram.edit.commands.DataValueCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DataLiteralDataLiteralCompartmentItemSemanticEditPolicy extends
		CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DataLiteralDataLiteralCompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.DataLiteral_3072);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.DataValue_3073 == req.getElementType()) {
			return getGEFWrapper(new DataValueCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
