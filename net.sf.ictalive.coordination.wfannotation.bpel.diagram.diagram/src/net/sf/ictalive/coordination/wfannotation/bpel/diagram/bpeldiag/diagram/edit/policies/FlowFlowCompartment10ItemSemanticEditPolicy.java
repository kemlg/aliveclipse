package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Assign3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Compensate3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.CompensateScope3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Empty3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Exit3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ExtensionActivity3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Flow3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ForEach2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.If4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Invoke4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OpaqueActivity4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.PartnerActivity4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Pick4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Receive2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.RepeatUntil2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Reply5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Rethrow5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Scope5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Throw5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Validate5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Wait5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.While5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers.BpeldiagElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class FlowFlowCompartment10ItemSemanticEditPolicy extends
		BpeldiagBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FlowFlowCompartment10ItemSemanticEditPolicy() {
		super(BpeldiagElementTypes.Flow_2008);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BpeldiagElementTypes.Assign_3055 == req.getElementType()) {
			return getGEFWrapper(new Assign3CreateCommand(req));
		}
		if (BpeldiagElementTypes.Compensate_3056 == req.getElementType()) {
			return getGEFWrapper(new Compensate3CreateCommand(req));
		}
		if (BpeldiagElementTypes.CompensateScope_3057 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope3CreateCommand(req));
		}
		if (BpeldiagElementTypes.Empty_3058 == req.getElementType()) {
			return getGEFWrapper(new Empty3CreateCommand(req));
		}
		if (BpeldiagElementTypes.Exit_3059 == req.getElementType()) {
			return getGEFWrapper(new Exit3CreateCommand(req));
		}
		if (BpeldiagElementTypes.ExtensionActivity_3060 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity3CreateCommand(req));
		}
		if (BpeldiagElementTypes.Flow_3061 == req.getElementType()) {
			return getGEFWrapper(new Flow3CreateCommand(req));
		}
		if (BpeldiagElementTypes.ForEach_3062 == req.getElementType()) {
			return getGEFWrapper(new ForEach2CreateCommand(req));
		}
		if (BpeldiagElementTypes.If_3063 == req.getElementType()) {
			return getGEFWrapper(new If4CreateCommand(req));
		}
		if (BpeldiagElementTypes.Invoke_3064 == req.getElementType()) {
			return getGEFWrapper(new Invoke4CreateCommand(req));
		}
		if (BpeldiagElementTypes.OpaqueActivity_3065 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity4CreateCommand(req));
		}
		if (BpeldiagElementTypes.PartnerActivity_3066 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity4CreateCommand(req));
		}
		if (BpeldiagElementTypes.Pick_3067 == req.getElementType()) {
			return getGEFWrapper(new Pick4CreateCommand(req));
		}
		if (BpeldiagElementTypes.Receive_3068 == req.getElementType()) {
			return getGEFWrapper(new Receive2CreateCommand(req));
		}
		if (BpeldiagElementTypes.RepeatUntil_3069 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil2CreateCommand(req));
		}
		if (BpeldiagElementTypes.Reply_3070 == req.getElementType()) {
			return getGEFWrapper(new Reply5CreateCommand(req));
		}
		if (BpeldiagElementTypes.Rethrow_3071 == req.getElementType()) {
			return getGEFWrapper(new Rethrow5CreateCommand(req));
		}
		if (BpeldiagElementTypes.Scope_3072 == req.getElementType()) {
			return getGEFWrapper(new Scope5CreateCommand(req));
		}
		if (BpeldiagElementTypes.Throw_3073 == req.getElementType()) {
			return getGEFWrapper(new Throw5CreateCommand(req));
		}
		if (BpeldiagElementTypes.Validate_3074 == req.getElementType()) {
			return getGEFWrapper(new Validate5CreateCommand(req));
		}
		if (BpeldiagElementTypes.Wait_3075 == req.getElementType()) {
			return getGEFWrapper(new Wait5CreateCommand(req));
		}
		if (BpeldiagElementTypes.While_3076 == req.getElementType()) {
			return getGEFWrapper(new While5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
