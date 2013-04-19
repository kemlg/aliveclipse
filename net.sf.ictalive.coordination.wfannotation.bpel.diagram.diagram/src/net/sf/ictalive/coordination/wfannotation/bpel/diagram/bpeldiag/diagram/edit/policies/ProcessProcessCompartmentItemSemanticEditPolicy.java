package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Assign2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Compensate2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.CompensateScope2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Empty2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.EventHandler3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Exit2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ExtensionActivity2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Flow2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ForEach14CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.If12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Invoke14CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OpaqueActivity14CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.PartnerActivity14CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Pick14CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Receive14CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.RepeatUntil13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Reply14CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Rethrow14CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Scope14CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Sequence9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Throw14CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Validate14CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Wait14CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.While14CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers.BpeldiagElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ProcessProcessCompartmentItemSemanticEditPolicy extends
		BpeldiagBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProcessProcessCompartmentItemSemanticEditPolicy() {
		super(BpeldiagElementTypes.Process_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BpeldiagElementTypes.Assign_3001 == req.getElementType()) {
			return getGEFWrapper(new Assign2CreateCommand(req));
		}
		if (BpeldiagElementTypes.Compensate_3004 == req.getElementType()) {
			return getGEFWrapper(new Compensate2CreateCommand(req));
		}
		if (BpeldiagElementTypes.CompensateScope_3005 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope2CreateCommand(req));
		}
		if (BpeldiagElementTypes.Empty_3006 == req.getElementType()) {
			return getGEFWrapper(new Empty2CreateCommand(req));
		}
		if (BpeldiagElementTypes.Exit_3007 == req.getElementType()) {
			return getGEFWrapper(new Exit2CreateCommand(req));
		}
		if (BpeldiagElementTypes.ExtensionActivity_3008 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity2CreateCommand(req));
		}
		if (BpeldiagElementTypes.Flow_3009 == req.getElementType()) {
			return getGEFWrapper(new Flow2CreateCommand(req));
		}
		if (BpeldiagElementTypes.ForEach_3010 == req.getElementType()) {
			return getGEFWrapper(new ForEach14CreateCommand(req));
		}
		if (BpeldiagElementTypes.If_3011 == req.getElementType()) {
			return getGEFWrapper(new If12CreateCommand(req));
		}
		if (BpeldiagElementTypes.Invoke_3012 == req.getElementType()) {
			return getGEFWrapper(new Invoke14CreateCommand(req));
		}
		if (BpeldiagElementTypes.OpaqueActivity_3013 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity14CreateCommand(req));
		}
		if (BpeldiagElementTypes.PartnerActivity_3014 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity14CreateCommand(req));
		}
		if (BpeldiagElementTypes.Pick_3015 == req.getElementType()) {
			return getGEFWrapper(new Pick14CreateCommand(req));
		}
		if (BpeldiagElementTypes.Receive_3016 == req.getElementType()) {
			return getGEFWrapper(new Receive14CreateCommand(req));
		}
		if (BpeldiagElementTypes.RepeatUntil_3017 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil13CreateCommand(req));
		}
		if (BpeldiagElementTypes.Reply_3018 == req.getElementType()) {
			return getGEFWrapper(new Reply14CreateCommand(req));
		}
		if (BpeldiagElementTypes.Rethrow_3019 == req.getElementType()) {
			return getGEFWrapper(new Rethrow14CreateCommand(req));
		}
		if (BpeldiagElementTypes.Scope_3020 == req.getElementType()) {
			return getGEFWrapper(new Scope14CreateCommand(req));
		}
		if (BpeldiagElementTypes.Sequence_3002 == req.getElementType()) {
			return getGEFWrapper(new Sequence9CreateCommand(req));
		}
		if (BpeldiagElementTypes.Throw_3021 == req.getElementType()) {
			return getGEFWrapper(new Throw14CreateCommand(req));
		}
		if (BpeldiagElementTypes.Validate_3022 == req.getElementType()) {
			return getGEFWrapper(new Validate14CreateCommand(req));
		}
		if (BpeldiagElementTypes.Wait_3023 == req.getElementType()) {
			return getGEFWrapper(new Wait14CreateCommand(req));
		}
		if (BpeldiagElementTypes.While_3024 == req.getElementType()) {
			return getGEFWrapper(new While14CreateCommand(req));
		}
		if (BpeldiagElementTypes.EventHandler_3303 == req.getElementType()) {
			return getGEFWrapper(new EventHandler3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
