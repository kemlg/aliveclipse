package net.sf.ictalive.coordination.wfvv.diagram.edit.policies;

import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.AvailabilityCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.DeadlineViolationCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.DisasterCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ExecutedActCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.FailureActCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.NormInstanceViolatedCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ReceiveActCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.SendActCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.StartedActCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.TaskViolationCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.providers.WfvvElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ContentContentFigureFactCompartmentItemSemanticEditPolicy extends
		WfvvBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContentContentFigureFactCompartmentItemSemanticEditPolicy() {
		super(WfvvElementTypes.Content_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WfvvElementTypes.StartedAct_3003 == req.getElementType()) {
			return getGEFWrapper(new StartedActCreateCommand(req));
		}
		if (WfvvElementTypes.ExecutedAct_3004 == req.getElementType()) {
			return getGEFWrapper(new ExecutedActCreateCommand(req));
		}
		if (WfvvElementTypes.FailureAct_3005 == req.getElementType()) {
			return getGEFWrapper(new FailureActCreateCommand(req));
		}
		if (WfvvElementTypes.Disaster_3006 == req.getElementType()) {
			return getGEFWrapper(new DisasterCreateCommand(req));
		}
		if (WfvvElementTypes.NormInstanceViolated_3007 == req.getElementType()) {
			return getGEFWrapper(new NormInstanceViolatedCreateCommand(req));
		}
		if (WfvvElementTypes.ReceiveAct_3008 == req.getElementType()) {
			return getGEFWrapper(new ReceiveActCreateCommand(req));
		}
		if (WfvvElementTypes.SendAct_3010 == req.getElementType()) {
			return getGEFWrapper(new SendActCreateCommand(req));
		}
		if (WfvvElementTypes.DeadlineViolation_3012 == req.getElementType()) {
			return getGEFWrapper(new DeadlineViolationCreateCommand(req));
		}
		if (WfvvElementTypes.TaskViolation_3013 == req.getElementType()) {
			return getGEFWrapper(new TaskViolationCreateCommand(req));
		}
		if (WfvvElementTypes.Availability_3014 == req.getElementType()) {
			return getGEFWrapper(new AvailabilityCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
