package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Assign10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Compensate10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.CompensateScope10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Empty10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Exit10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ExtensionActivity10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Flow6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ForEach8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.If5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Invoke7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OpaqueActivity7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.PartnerActivity7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Pick7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Receive7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.RepeatUntil6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Reply6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Rethrow6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Scope6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Sequence2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Throw6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Validate6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Wait6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.While6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers.BpeldiagElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class WhileWhileCompartment11ItemSemanticEditPolicy extends
		BpeldiagBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public WhileWhileCompartment11ItemSemanticEditPolicy() {
		super(BpeldiagElementTypes.While_3286);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BpeldiagElementTypes.Assign_3122 == req.getElementType()) {
			return getGEFWrapper(new Assign10CreateCommand(req));
		}
		if (BpeldiagElementTypes.Compensate_3123 == req.getElementType()) {
			return getGEFWrapper(new Compensate10CreateCommand(req));
		}
		if (BpeldiagElementTypes.CompensateScope_3124 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope10CreateCommand(req));
		}
		if (BpeldiagElementTypes.Empty_3125 == req.getElementType()) {
			return getGEFWrapper(new Empty10CreateCommand(req));
		}
		if (BpeldiagElementTypes.Exit_3126 == req.getElementType()) {
			return getGEFWrapper(new Exit10CreateCommand(req));
		}
		if (BpeldiagElementTypes.ExtensionActivity_3127 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity10CreateCommand(req));
		}
		if (BpeldiagElementTypes.Flow_3176 == req.getElementType()) {
			return getGEFWrapper(new Flow6CreateCommand(req));
		}
		if (BpeldiagElementTypes.ForEach_3129 == req.getElementType()) {
			return getGEFWrapper(new ForEach8CreateCommand(req));
		}
		if (BpeldiagElementTypes.If_3177 == req.getElementType()) {
			return getGEFWrapper(new If5CreateCommand(req));
		}
		if (BpeldiagElementTypes.Invoke_3130 == req.getElementType()) {
			return getGEFWrapper(new Invoke7CreateCommand(req));
		}
		if (BpeldiagElementTypes.OpaqueActivity_3131 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity7CreateCommand(req));
		}
		if (BpeldiagElementTypes.PartnerActivity_3132 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity7CreateCommand(req));
		}
		if (BpeldiagElementTypes.Pick_3133 == req.getElementType()) {
			return getGEFWrapper(new Pick7CreateCommand(req));
		}
		if (BpeldiagElementTypes.Receive_3134 == req.getElementType()) {
			return getGEFWrapper(new Receive7CreateCommand(req));
		}
		if (BpeldiagElementTypes.RepeatUntil_3178 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil6CreateCommand(req));
		}
		if (BpeldiagElementTypes.Reply_3135 == req.getElementType()) {
			return getGEFWrapper(new Reply6CreateCommand(req));
		}
		if (BpeldiagElementTypes.Rethrow_3136 == req.getElementType()) {
			return getGEFWrapper(new Rethrow6CreateCommand(req));
		}
		if (BpeldiagElementTypes.Scope_3179 == req.getElementType()) {
			return getGEFWrapper(new Scope6CreateCommand(req));
		}
		if (BpeldiagElementTypes.Sequence_3180 == req.getElementType()) {
			return getGEFWrapper(new Sequence2CreateCommand(req));
		}
		if (BpeldiagElementTypes.Throw_3137 == req.getElementType()) {
			return getGEFWrapper(new Throw6CreateCommand(req));
		}
		if (BpeldiagElementTypes.Validate_3138 == req.getElementType()) {
			return getGEFWrapper(new Validate6CreateCommand(req));
		}
		if (BpeldiagElementTypes.Wait_3139 == req.getElementType()) {
			return getGEFWrapper(new Wait6CreateCommand(req));
		}
		if (BpeldiagElementTypes.While_3128 == req.getElementType()) {
			return getGEFWrapper(new While6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
