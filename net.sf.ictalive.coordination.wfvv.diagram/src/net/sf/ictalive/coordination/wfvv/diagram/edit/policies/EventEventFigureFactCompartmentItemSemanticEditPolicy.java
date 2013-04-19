package net.sf.ictalive.coordination.wfvv.diagram.edit.policies;

import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ActorViewCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ContentCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.providers.WfvvElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class EventEventFigureFactCompartmentItemSemanticEditPolicy extends
		WfvvBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EventEventFigureFactCompartmentItemSemanticEditPolicy() {
		super(WfvvElementTypes.Event_2023);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WfvvElementTypes.ActorView_3001 == req.getElementType()) {
			return getGEFWrapper(new ActorViewCreateCommand(req));
		}
		if (WfvvElementTypes.Content_3002 == req.getElementType()) {
			return getGEFWrapper(new ContentCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
