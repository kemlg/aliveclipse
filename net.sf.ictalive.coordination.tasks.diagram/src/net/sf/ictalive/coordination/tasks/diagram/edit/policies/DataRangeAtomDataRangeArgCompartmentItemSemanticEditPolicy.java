package net.sf.ictalive.coordination.tasks.diagram.edit.policies;

import net.sf.ictalive.coordination.tasks.diagram.edit.commands.DataLiteralCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.DataVariableCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DataRangeAtomDataRangeArgCompartmentItemSemanticEditPolicy extends
		CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DataRangeAtomDataRangeArgCompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.DataRangeAtom_3048);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.DataLiteral_3049 == req.getElementType()) {
			return getGEFWrapper(new DataLiteralCreateCommand(req));
		}
		if (CoordinationElementTypes.DataVariable_3051 == req.getElementType()) {
			return getGEFWrapper(new DataVariableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
