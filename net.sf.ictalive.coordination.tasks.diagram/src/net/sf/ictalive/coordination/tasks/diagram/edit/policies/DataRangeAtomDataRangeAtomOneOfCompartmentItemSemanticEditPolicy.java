package net.sf.ictalive.coordination.tasks.diagram.edit.policies;

import net.sf.ictalive.coordination.tasks.diagram.edit.commands.DataValue2CreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DataRangeAtomDataRangeAtomOneOfCompartmentItemSemanticEditPolicy
		extends CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DataRangeAtomDataRangeAtomOneOfCompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.DataRangeAtom_3048);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.DataValue_3058 == req.getElementType()) {
			return getGEFWrapper(new DataValue2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
