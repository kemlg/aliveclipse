package net.sf.ictalive.coordination.wfvv.diagram.edit.policies;

import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ParameterCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ResultCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.providers.WfvvElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class PlanExecutionPlanExecutionCompartmentItemSemanticEditPolicy extends
		WfvvBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PlanExecutionPlanExecutionCompartmentItemSemanticEditPolicy() {
		super(WfvvElementTypes.PlanExecution_3020);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WfvvElementTypes.Parameter_3016 == req.getElementType()) {
			return getGEFWrapper(new ParameterCreateCommand(req));
		}
		if (WfvvElementTypes.Result_3017 == req.getElementType()) {
			return getGEFWrapper(new ResultCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
