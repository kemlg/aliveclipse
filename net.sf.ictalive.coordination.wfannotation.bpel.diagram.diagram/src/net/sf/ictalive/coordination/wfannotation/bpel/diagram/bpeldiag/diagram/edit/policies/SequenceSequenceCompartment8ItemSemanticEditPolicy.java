package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Assign11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Compensate11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.CompensateScope11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Empty11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Exit11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ExtensionActivity11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Flow7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ForEach9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.If6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Invoke9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OpaqueActivity9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.PartnerActivity9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Pick9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Receive9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.RepeatUntil8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Reply9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Rethrow9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Scope9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Sequence4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Throw8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Validate8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Wait8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.While8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers.BpeldiagElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class SequenceSequenceCompartment8ItemSemanticEditPolicy extends
		BpeldiagBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SequenceSequenceCompartment8ItemSemanticEditPolicy() {
		super(BpeldiagElementTypes.Sequence_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BpeldiagElementTypes.Assign_3033 == req.getElementType()) {
			return getGEFWrapper(new Assign11CreateCommand(req));
		}
		if (BpeldiagElementTypes.Compensate_3034 == req.getElementType()) {
			return getGEFWrapper(new Compensate11CreateCommand(req));
		}
		if (BpeldiagElementTypes.CompensateScope_3035 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope11CreateCommand(req));
		}
		if (BpeldiagElementTypes.Empty_3036 == req.getElementType()) {
			return getGEFWrapper(new Empty11CreateCommand(req));
		}
		if (BpeldiagElementTypes.Exit_3037 == req.getElementType()) {
			return getGEFWrapper(new Exit11CreateCommand(req));
		}
		if (BpeldiagElementTypes.ExtensionActivity_3038 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity11CreateCommand(req));
		}
		if (BpeldiagElementTypes.Flow_3039 == req.getElementType()) {
			return getGEFWrapper(new Flow7CreateCommand(req));
		}
		if (BpeldiagElementTypes.ForEach_3040 == req.getElementType()) {
			return getGEFWrapper(new ForEach9CreateCommand(req));
		}
		if (BpeldiagElementTypes.If_3032 == req.getElementType()) {
			return getGEFWrapper(new If6CreateCommand(req));
		}
		if (BpeldiagElementTypes.Invoke_3041 == req.getElementType()) {
			return getGEFWrapper(new Invoke9CreateCommand(req));
		}
		if (BpeldiagElementTypes.OpaqueActivity_3042 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity9CreateCommand(req));
		}
		if (BpeldiagElementTypes.PartnerActivity_3043 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity9CreateCommand(req));
		}
		if (BpeldiagElementTypes.Pick_3044 == req.getElementType()) {
			return getGEFWrapper(new Pick9CreateCommand(req));
		}
		if (BpeldiagElementTypes.Receive_3045 == req.getElementType()) {
			return getGEFWrapper(new Receive9CreateCommand(req));
		}
		if (BpeldiagElementTypes.RepeatUntil_3046 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil8CreateCommand(req));
		}
		if (BpeldiagElementTypes.Reply_3047 == req.getElementType()) {
			return getGEFWrapper(new Reply9CreateCommand(req));
		}
		if (BpeldiagElementTypes.Rethrow_3048 == req.getElementType()) {
			return getGEFWrapper(new Rethrow9CreateCommand(req));
		}
		if (BpeldiagElementTypes.Scope_3049 == req.getElementType()) {
			return getGEFWrapper(new Scope9CreateCommand(req));
		}
		if (BpeldiagElementTypes.Sequence_3050 == req.getElementType()) {
			return getGEFWrapper(new Sequence4CreateCommand(req));
		}
		if (BpeldiagElementTypes.Throw_3051 == req.getElementType()) {
			return getGEFWrapper(new Throw8CreateCommand(req));
		}
		if (BpeldiagElementTypes.Validate_3052 == req.getElementType()) {
			return getGEFWrapper(new Validate8CreateCommand(req));
		}
		if (BpeldiagElementTypes.Wait_3053 == req.getElementType()) {
			return getGEFWrapper(new Wait8CreateCommand(req));
		}
		if (BpeldiagElementTypes.While_3054 == req.getElementType()) {
			return getGEFWrapper(new While8CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
