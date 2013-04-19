package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Assign14CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Compensate14CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.CompensateScope14CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Empty14CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Exit14CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ExtensionActivity14CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Flow10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ForEach12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.If10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Invoke12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OpaqueActivity12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.PartnerActivity12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Pick12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Receive12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.RepeatUntil11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Reply12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Rethrow12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Scope12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Sequence7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Throw12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Validate12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Wait12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.While12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers.BpeldiagElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class OnEventOnEventCompartmentItemSemanticEditPolicy extends
		BpeldiagBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OnEventOnEventCompartmentItemSemanticEditPolicy() {
		super(BpeldiagElementTypes.OnEvent_3263);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BpeldiagElementTypes.Assign_3264 == req.getElementType()) {
			return getGEFWrapper(new Assign14CreateCommand(req));
		}
		if (BpeldiagElementTypes.Compensate_3265 == req.getElementType()) {
			return getGEFWrapper(new Compensate14CreateCommand(req));
		}
		if (BpeldiagElementTypes.CompensateScope_3266 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope14CreateCommand(req));
		}
		if (BpeldiagElementTypes.Empty_3267 == req.getElementType()) {
			return getGEFWrapper(new Empty14CreateCommand(req));
		}
		if (BpeldiagElementTypes.Exit_3268 == req.getElementType()) {
			return getGEFWrapper(new Exit14CreateCommand(req));
		}
		if (BpeldiagElementTypes.ExtensionActivity_3269 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity14CreateCommand(req));
		}
		if (BpeldiagElementTypes.Flow_3270 == req.getElementType()) {
			return getGEFWrapper(new Flow10CreateCommand(req));
		}
		if (BpeldiagElementTypes.ForEach_3271 == req.getElementType()) {
			return getGEFWrapper(new ForEach12CreateCommand(req));
		}
		if (BpeldiagElementTypes.If_3272 == req.getElementType()) {
			return getGEFWrapper(new If10CreateCommand(req));
		}
		if (BpeldiagElementTypes.Invoke_3273 == req.getElementType()) {
			return getGEFWrapper(new Invoke12CreateCommand(req));
		}
		if (BpeldiagElementTypes.OpaqueActivity_3274 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity12CreateCommand(req));
		}
		if (BpeldiagElementTypes.PartnerActivity_3275 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity12CreateCommand(req));
		}
		if (BpeldiagElementTypes.Pick_3276 == req.getElementType()) {
			return getGEFWrapper(new Pick12CreateCommand(req));
		}
		if (BpeldiagElementTypes.Receive_3277 == req.getElementType()) {
			return getGEFWrapper(new Receive12CreateCommand(req));
		}
		if (BpeldiagElementTypes.RepeatUntil_3278 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil11CreateCommand(req));
		}
		if (BpeldiagElementTypes.Reply_3279 == req.getElementType()) {
			return getGEFWrapper(new Reply12CreateCommand(req));
		}
		if (BpeldiagElementTypes.Rethrow_3280 == req.getElementType()) {
			return getGEFWrapper(new Rethrow12CreateCommand(req));
		}
		if (BpeldiagElementTypes.Scope_3281 == req.getElementType()) {
			return getGEFWrapper(new Scope12CreateCommand(req));
		}
		if (BpeldiagElementTypes.Sequence_3282 == req.getElementType()) {
			return getGEFWrapper(new Sequence7CreateCommand(req));
		}
		if (BpeldiagElementTypes.Throw_3283 == req.getElementType()) {
			return getGEFWrapper(new Throw12CreateCommand(req));
		}
		if (BpeldiagElementTypes.Validate_3284 == req.getElementType()) {
			return getGEFWrapper(new Validate12CreateCommand(req));
		}
		if (BpeldiagElementTypes.Wait_3285 == req.getElementType()) {
			return getGEFWrapper(new Wait12CreateCommand(req));
		}
		if (BpeldiagElementTypes.While_3286 == req.getElementType()) {
			return getGEFWrapper(new While12CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
