package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OnAlarm3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OnEvent2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers.BpeldiagElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class EventHandlerEventHandlerCompartment2ItemSemanticEditPolicy extends
		BpeldiagBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EventHandlerEventHandlerCompartment2ItemSemanticEditPolicy() {
		super(BpeldiagElementTypes.EventHandler_3303);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BpeldiagElementTypes.OnAlarm_3244 == req.getElementType()) {
			return getGEFWrapper(new OnAlarm3CreateCommand(req));
		}
		if (BpeldiagElementTypes.OnEvent_3263 == req.getElementType()) {
			return getGEFWrapper(new OnEvent2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
