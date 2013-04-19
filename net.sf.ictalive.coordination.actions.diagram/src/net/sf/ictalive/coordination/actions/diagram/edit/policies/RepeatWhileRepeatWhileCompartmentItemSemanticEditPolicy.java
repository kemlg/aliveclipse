package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import net.sf.ictalive.coordination.actions.diagram.edit.commands.Condition4CreateCommand;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class RepeatWhileRepeatWhileCompartmentItemSemanticEditPolicy extends
		CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RepeatWhileRepeatWhileCompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.RepeatWhile_2036);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.Condition_3088 == req.getElementType()) {
			return getGEFWrapper(new Condition4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
