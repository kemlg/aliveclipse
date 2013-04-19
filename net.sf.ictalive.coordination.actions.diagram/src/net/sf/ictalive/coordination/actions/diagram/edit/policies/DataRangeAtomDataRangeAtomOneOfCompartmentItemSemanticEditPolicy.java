package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import net.sf.ictalive.coordination.actions.diagram.edit.commands.DataValue2CreateCommand;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

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
		super(CoordinationElementTypes.DataRangeAtom_3071);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.DataValue_3090 == req.getElementType()) {
			return getGEFWrapper(new DataValue2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
