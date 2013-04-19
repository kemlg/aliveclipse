package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Assign8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Compensate8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.CompensateScope8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Empty8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Exit8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ExtensionActivity8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ForEach5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Invoke5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OpaqueActivity5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.PartnerActivity5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Pick5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Receive4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.RepeatUntil3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Reply2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Rethrow2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Scope2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Throw4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Validate4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Wait4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.While4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers.BpeldiagElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class RepeatUntilRepeatUntilCompartment5ItemSemanticEditPolicy extends
		BpeldiagBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RepeatUntilRepeatUntilCompartment5ItemSemanticEditPolicy() {
		super(BpeldiagElementTypes.RepeatUntil_3178);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BpeldiagElementTypes.Assign_3106 == req.getElementType()) {
			return getGEFWrapper(new Assign8CreateCommand(req));
		}
		if (BpeldiagElementTypes.Compensate_3107 == req.getElementType()) {
			return getGEFWrapper(new Compensate8CreateCommand(req));
		}
		if (BpeldiagElementTypes.CompensateScope_3108 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope8CreateCommand(req));
		}
		if (BpeldiagElementTypes.Empty_3109 == req.getElementType()) {
			return getGEFWrapper(new Empty8CreateCommand(req));
		}
		if (BpeldiagElementTypes.Exit_3110 == req.getElementType()) {
			return getGEFWrapper(new Exit8CreateCommand(req));
		}
		if (BpeldiagElementTypes.ExtensionActivity_3111 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity8CreateCommand(req));
		}
		if (BpeldiagElementTypes.RepeatUntil_3112 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil3CreateCommand(req));
		}
		if (BpeldiagElementTypes.ForEach_3113 == req.getElementType()) {
			return getGEFWrapper(new ForEach5CreateCommand(req));
		}
		if (BpeldiagElementTypes.Invoke_3151 == req.getElementType()) {
			return getGEFWrapper(new Invoke5CreateCommand(req));
		}
		if (BpeldiagElementTypes.OpaqueActivity_3152 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity5CreateCommand(req));
		}
		if (BpeldiagElementTypes.PartnerActivity_3153 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity5CreateCommand(req));
		}
		if (BpeldiagElementTypes.Pick_3154 == req.getElementType()) {
			return getGEFWrapper(new Pick5CreateCommand(req));
		}
		if (BpeldiagElementTypes.Receive_3155 == req.getElementType()) {
			return getGEFWrapper(new Receive4CreateCommand(req));
		}
		if (BpeldiagElementTypes.Reply_3156 == req.getElementType()) {
			return getGEFWrapper(new Reply2CreateCommand(req));
		}
		if (BpeldiagElementTypes.Rethrow_3157 == req.getElementType()) {
			return getGEFWrapper(new Rethrow2CreateCommand(req));
		}
		if (BpeldiagElementTypes.Scope_3158 == req.getElementType()) {
			return getGEFWrapper(new Scope2CreateCommand(req));
		}
		if (BpeldiagElementTypes.Throw_3159 == req.getElementType()) {
			return getGEFWrapper(new Throw4CreateCommand(req));
		}
		if (BpeldiagElementTypes.Validate_3160 == req.getElementType()) {
			return getGEFWrapper(new Validate4CreateCommand(req));
		}
		if (BpeldiagElementTypes.Wait_3161 == req.getElementType()) {
			return getGEFWrapper(new Wait4CreateCommand(req));
		}
		if (BpeldiagElementTypes.While_3162 == req.getElementType()) {
			return getGEFWrapper(new While4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
