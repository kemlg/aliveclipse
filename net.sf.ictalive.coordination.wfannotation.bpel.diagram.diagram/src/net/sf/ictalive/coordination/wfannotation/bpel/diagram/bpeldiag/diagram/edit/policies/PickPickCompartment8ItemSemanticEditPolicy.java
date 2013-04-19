package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OnAlarm2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OnMessage2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers.BpeldiagElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class PickPickCompartment8ItemSemanticEditPolicy extends
		BpeldiagBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PickPickCompartment8ItemSemanticEditPolicy() {
		super(BpeldiagElementTypes.Pick_3044);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BpeldiagElementTypes.OnAlarm_3227 == req.getElementType()) {
			return getGEFWrapper(new OnAlarm2CreateCommand(req));
		}
		if (BpeldiagElementTypes.OnMessage_3235 == req.getElementType()) {
			return getGEFWrapper(new OnMessage2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
