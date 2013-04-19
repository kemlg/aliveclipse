package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Assign7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Compensate7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.CompensateScope7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Empty7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Exit7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ExtensionActivity7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Flow5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ForEach13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.If11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Invoke13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OpaqueActivity13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.PartnerActivity13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Pick13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Receive13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.RepeatUntil12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Reply13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Rethrow13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Scope13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Sequence8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Throw13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Validate13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Wait13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.While13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers.BpeldiagElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class OnMessageOnMessageCompartmentItemSemanticEditPolicy extends
		BpeldiagBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OnMessageOnMessageCompartmentItemSemanticEditPolicy() {
		super(BpeldiagElementTypes.OnMessage_3235);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BpeldiagElementTypes.Assign_3236 == req.getElementType()) {
			return getGEFWrapper(new Assign7CreateCommand(req));
		}
		if (BpeldiagElementTypes.Compensate_3237 == req.getElementType()) {
			return getGEFWrapper(new Compensate7CreateCommand(req));
		}
		if (BpeldiagElementTypes.CompensateScope_3238 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope7CreateCommand(req));
		}
		if (BpeldiagElementTypes.Empty_3239 == req.getElementType()) {
			return getGEFWrapper(new Empty7CreateCommand(req));
		}
		if (BpeldiagElementTypes.Exit_3240 == req.getElementType()) {
			return getGEFWrapper(new Exit7CreateCommand(req));
		}
		if (BpeldiagElementTypes.ExtensionActivity_3241 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity7CreateCommand(req));
		}
		if (BpeldiagElementTypes.Flow_3242 == req.getElementType()) {
			return getGEFWrapper(new Flow5CreateCommand(req));
		}
		if (BpeldiagElementTypes.ForEach_3287 == req.getElementType()) {
			return getGEFWrapper(new ForEach13CreateCommand(req));
		}
		if (BpeldiagElementTypes.If_3288 == req.getElementType()) {
			return getGEFWrapper(new If11CreateCommand(req));
		}
		if (BpeldiagElementTypes.Invoke_3289 == req.getElementType()) {
			return getGEFWrapper(new Invoke13CreateCommand(req));
		}
		if (BpeldiagElementTypes.OpaqueActivity_3290 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity13CreateCommand(req));
		}
		if (BpeldiagElementTypes.PartnerActivity_3291 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity13CreateCommand(req));
		}
		if (BpeldiagElementTypes.Pick_3292 == req.getElementType()) {
			return getGEFWrapper(new Pick13CreateCommand(req));
		}
		if (BpeldiagElementTypes.Receive_3293 == req.getElementType()) {
			return getGEFWrapper(new Receive13CreateCommand(req));
		}
		if (BpeldiagElementTypes.RepeatUntil_3294 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil12CreateCommand(req));
		}
		if (BpeldiagElementTypes.Reply_3295 == req.getElementType()) {
			return getGEFWrapper(new Reply13CreateCommand(req));
		}
		if (BpeldiagElementTypes.Rethrow_3296 == req.getElementType()) {
			return getGEFWrapper(new Rethrow13CreateCommand(req));
		}
		if (BpeldiagElementTypes.Scope_3297 == req.getElementType()) {
			return getGEFWrapper(new Scope13CreateCommand(req));
		}
		if (BpeldiagElementTypes.Sequence_3298 == req.getElementType()) {
			return getGEFWrapper(new Sequence8CreateCommand(req));
		}
		if (BpeldiagElementTypes.Throw_3299 == req.getElementType()) {
			return getGEFWrapper(new Throw13CreateCommand(req));
		}
		if (BpeldiagElementTypes.Validate_3300 == req.getElementType()) {
			return getGEFWrapper(new Validate13CreateCommand(req));
		}
		if (BpeldiagElementTypes.Wait_3301 == req.getElementType()) {
			return getGEFWrapper(new Wait13CreateCommand(req));
		}
		if (BpeldiagElementTypes.While_3302 == req.getElementType()) {
			return getGEFWrapper(new While13CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
