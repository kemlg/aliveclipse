package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Assign4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Compensate4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.CompensateScope4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Empty4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Exit4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ExtensionActivity4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ForEach3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.If2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Invoke2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OpaqueActivity2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.PartnerActivity2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Pick2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Receive3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.RepeatUntil4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Reply3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Rethrow3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Scope4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Throw3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Validate3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Wait3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.While3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers.BpeldiagElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ForEachForEachCompartment14ItemSemanticEditPolicy extends
		BpeldiagBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ForEachForEachCompartment14ItemSemanticEditPolicy() {
		super(BpeldiagElementTypes.ForEach_2009);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BpeldiagElementTypes.Assign_3077 == req.getElementType()) {
			return getGEFWrapper(new Assign4CreateCommand(req));
		}
		if (BpeldiagElementTypes.Compensate_3078 == req.getElementType()) {
			return getGEFWrapper(new Compensate4CreateCommand(req));
		}
		if (BpeldiagElementTypes.CompensateScope_3079 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope4CreateCommand(req));
		}
		if (BpeldiagElementTypes.Empty_3080 == req.getElementType()) {
			return getGEFWrapper(new Empty4CreateCommand(req));
		}
		if (BpeldiagElementTypes.Exit_3081 == req.getElementType()) {
			return getGEFWrapper(new Exit4CreateCommand(req));
		}
		if (BpeldiagElementTypes.ExtensionActivity_3082 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity4CreateCommand(req));
		}
		if (BpeldiagElementTypes.ForEach_3083 == req.getElementType()) {
			return getGEFWrapper(new ForEach3CreateCommand(req));
		}
		if (BpeldiagElementTypes.If_3084 == req.getElementType()) {
			return getGEFWrapper(new If2CreateCommand(req));
		}
		if (BpeldiagElementTypes.Invoke_3085 == req.getElementType()) {
			return getGEFWrapper(new Invoke2CreateCommand(req));
		}
		if (BpeldiagElementTypes.OpaqueActivity_3086 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity2CreateCommand(req));
		}
		if (BpeldiagElementTypes.PartnerActivity_3087 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity2CreateCommand(req));
		}
		if (BpeldiagElementTypes.Pick_3088 == req.getElementType()) {
			return getGEFWrapper(new Pick2CreateCommand(req));
		}
		if (BpeldiagElementTypes.Receive_3089 == req.getElementType()) {
			return getGEFWrapper(new Receive3CreateCommand(req));
		}
		if (BpeldiagElementTypes.RepeatUntil_3090 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil4CreateCommand(req));
		}
		if (BpeldiagElementTypes.Reply_3091 == req.getElementType()) {
			return getGEFWrapper(new Reply3CreateCommand(req));
		}
		if (BpeldiagElementTypes.Rethrow_3092 == req.getElementType()) {
			return getGEFWrapper(new Rethrow3CreateCommand(req));
		}
		if (BpeldiagElementTypes.Scope_3093 == req.getElementType()) {
			return getGEFWrapper(new Scope4CreateCommand(req));
		}
		if (BpeldiagElementTypes.Throw_3094 == req.getElementType()) {
			return getGEFWrapper(new Throw3CreateCommand(req));
		}
		if (BpeldiagElementTypes.Validate_3095 == req.getElementType()) {
			return getGEFWrapper(new Validate3CreateCommand(req));
		}
		if (BpeldiagElementTypes.Wait_3096 == req.getElementType()) {
			return getGEFWrapper(new Wait3CreateCommand(req));
		}
		if (BpeldiagElementTypes.While_3097 == req.getElementType()) {
			return getGEFWrapper(new While3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
