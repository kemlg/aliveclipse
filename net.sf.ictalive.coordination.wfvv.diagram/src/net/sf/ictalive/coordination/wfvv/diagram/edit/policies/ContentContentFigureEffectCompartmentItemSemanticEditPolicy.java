package net.sf.ictalive.coordination.wfvv.diagram.edit.policies;

import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.AgentReplanCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.CoordinationActionCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.NotifyStateOfWorldCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.PlanDistributionCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.PlanExecutionCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.PlanScheduleCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.PlanSynthesisCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ReplaceAgentCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ServiceInvocationCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.providers.WfvvElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ContentContentFigureEffectCompartmentItemSemanticEditPolicy extends
		WfvvBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContentContentFigureEffectCompartmentItemSemanticEditPolicy() {
		super(WfvvElementTypes.Content_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WfvvElementTypes.PlanSynthesis_3015 == req.getElementType()) {
			return getGEFWrapper(new PlanSynthesisCreateCommand(req));
		}
		if (WfvvElementTypes.PlanDistribution_3018 == req.getElementType()) {
			return getGEFWrapper(new PlanDistributionCreateCommand(req));
		}
		if (WfvvElementTypes.PlanSchedule_3019 == req.getElementType()) {
			return getGEFWrapper(new PlanScheduleCreateCommand(req));
		}
		if (WfvvElementTypes.PlanExecution_3020 == req.getElementType()) {
			return getGEFWrapper(new PlanExecutionCreateCommand(req));
		}
		if (WfvvElementTypes.ServiceInvocation_3021 == req.getElementType()) {
			return getGEFWrapper(new ServiceInvocationCreateCommand(req));
		}
		if (WfvvElementTypes.ReplaceAgent_3022 == req.getElementType()) {
			return getGEFWrapper(new ReplaceAgentCreateCommand(req));
		}
		if (WfvvElementTypes.AgentReplan_3023 == req.getElementType()) {
			return getGEFWrapper(new AgentReplanCreateCommand(req));
		}
		if (WfvvElementTypes.NotifyStateOfWorld_3024 == req.getElementType()) {
			return getGEFWrapper(new NotifyStateOfWorldCreateCommand(req));
		}
		if (WfvvElementTypes.CoordinationAction_3028 == req.getElementType()) {
			return getGEFWrapper(new CoordinationActionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
