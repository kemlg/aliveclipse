package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import net.sf.ictalive.coordination.actions.diagram.edit.commands.Condition3CreateCommand;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class RepeatUntilRepeatUntilCompartmentItemSemanticEditPolicy extends
		CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RepeatUntilRepeatUntilCompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.RepeatUntil_2035);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.Condition_3087 == req.getElementType()) {
			return getGEFWrapper(new Condition3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
