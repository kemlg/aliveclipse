package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import net.sf.ictalive.coordination.actions.diagram.edit.commands.DataValueCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DataLiteralDataLiteralCompartment2ItemSemanticEditPolicy extends
		CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DataLiteralDataLiteralCompartment2ItemSemanticEditPolicy() {
		super(CoordinationElementTypes.DataLiteral_3078);
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
