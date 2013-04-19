package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Assign13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Compensate13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.CompensateScope13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Empty13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Exit13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ExtensionActivity13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Flow9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ForEach11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.If8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Invoke8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OpaqueActivity8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.PartnerActivity8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Pick8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Receive8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.RepeatUntil7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Reply8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Rethrow8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Scope8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Sequence3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Throw9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Validate9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Wait9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.While9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers.BpeldiagElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ElseElseCompartment2ItemSemanticEditPolicy extends
		BpeldiagBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ElseElseCompartment2ItemSemanticEditPolicy() {
		super(BpeldiagElementTypes.Else_2026);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BpeldiagElementTypes.Assign_3204 == req.getElementType()) {
			return getGEFWrapper(new Assign13CreateCommand(req));
		}
		if (BpeldiagElementTypes.Compensate_3205 == req.getElementType()) {
			return getGEFWrapper(new Compensate13CreateCommand(req));
		}
		if (BpeldiagElementTypes.CompensateScope_3206 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope13CreateCommand(req));
		}
		if (BpeldiagElementTypes.Empty_3207 == req.getElementType()) {
			return getGEFWrapper(new Empty13CreateCommand(req));
		}
		if (BpeldiagElementTypes.Exit_3208 == req.getElementType()) {
			return getGEFWrapper(new Exit13CreateCommand(req));
		}
		if (BpeldiagElementTypes.ExtensionActivity_3209 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity13CreateCommand(req));
		}
		if (BpeldiagElementTypes.Flow_3210 == req.getElementType()) {
			return getGEFWrapper(new Flow9CreateCommand(req));
		}
		if (BpeldiagElementTypes.ForEach_3211 == req.getElementType()) {
			return getGEFWrapper(new ForEach11CreateCommand(req));
		}
		if (BpeldiagElementTypes.If_3212 == req.getElementType()) {
			return getGEFWrapper(new If8CreateCommand(req));
		}
		if (BpeldiagElementTypes.Invoke_3213 == req.getElementType()) {
			return getGEFWrapper(new Invoke8CreateCommand(req));
		}
		if (BpeldiagElementTypes.OpaqueActivity_3214 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity8CreateCommand(req));
		}
		if (BpeldiagElementTypes.PartnerActivity_3215 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity8CreateCommand(req));
		}
		if (BpeldiagElementTypes.Pick_3216 == req.getElementType()) {
			return getGEFWrapper(new Pick8CreateCommand(req));
		}
		if (BpeldiagElementTypes.Receive_3217 == req.getElementType()) {
			return getGEFWrapper(new Receive8CreateCommand(req));
		}
		if (BpeldiagElementTypes.RepeatUntil_3218 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil7CreateCommand(req));
		}
		if (BpeldiagElementTypes.Reply_3219 == req.getElementType()) {
			return getGEFWrapper(new Reply8CreateCommand(req));
		}
		if (BpeldiagElementTypes.Rethrow_3220 == req.getElementType()) {
			return getGEFWrapper(new Rethrow8CreateCommand(req));
		}
		if (BpeldiagElementTypes.Scope_3221 == req.getElementType()) {
			return getGEFWrapper(new Scope8CreateCommand(req));
		}
		if (BpeldiagElementTypes.Sequence_3222 == req.getElementType()) {
			return getGEFWrapper(new Sequence3CreateCommand(req));
		}
		if (BpeldiagElementTypes.Throw_3223 == req.getElementType()) {
			return getGEFWrapper(new Throw9CreateCommand(req));
		}
		if (BpeldiagElementTypes.Validate_3224 == req.getElementType()) {
			return getGEFWrapper(new Validate9CreateCommand(req));
		}
		if (BpeldiagElementTypes.Wait_3225 == req.getElementType()) {
			return getGEFWrapper(new Wait9CreateCommand(req));
		}
		if (BpeldiagElementTypes.While_3226 == req.getElementType()) {
			return getGEFWrapper(new While9CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
