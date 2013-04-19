package net.sf.ictalive.coordination.tasks.diagram.edit.policies;

import net.sf.ictalive.coordination.tasks.diagram.edit.commands.ConditionCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.providers.CoordinationElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class TaskPreconditionCompartmentItemSemanticEditPolicy extends
		CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TaskPreconditionCompartmentItemSemanticEditPolicy() {
		super(CoordinationElementTypes.Task_2021);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.Condition_3031 == req.getElementType()) {
			return getGEFWrapper(new ConditionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
