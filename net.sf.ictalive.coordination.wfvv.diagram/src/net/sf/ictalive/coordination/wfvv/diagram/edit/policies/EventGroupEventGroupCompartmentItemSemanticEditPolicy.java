package net.sf.ictalive.coordination.wfvv.diagram.edit.policies;

import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.Event3CreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.providers.WfvvElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class EventGroupEventGroupCompartmentItemSemanticEditPolicy extends
		WfvvBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EventGroupEventGroupCompartmentItemSemanticEditPolicy() {
		super(WfvvElementTypes.EventGroup_2028);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WfvvElementTypes.Event_3029 == req.getElementType()) {
			return getGEFWrapper(new Event3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
