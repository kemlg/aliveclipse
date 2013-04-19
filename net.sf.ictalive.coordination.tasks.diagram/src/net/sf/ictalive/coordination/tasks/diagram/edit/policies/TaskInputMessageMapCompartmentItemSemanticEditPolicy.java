package net.sf.ictalive.coordination.tasks.diagram.edit.policies;

import net.sf.ictalive.coordination.tasks.diagram.edit.commands.InputMessageMapCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class TaskInputMessageMapCompartmentItemSemanticEditPolicy extends
		CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TaskInputMessageMapCompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.Task_2021);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.InputMessageMap_3057 == req
				.getElementType()) {
			return getGEFWrapper(new InputMessageMapCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
