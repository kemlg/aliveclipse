package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Assign6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Compensate6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.CompensateScope6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Empty6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Exit6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ExtensionActivity6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Flow4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ForEach7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.If9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Invoke11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OpaqueActivity11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.PartnerActivity11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Pick11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Receive11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.RepeatUntil10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Reply11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Rethrow11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Scope11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Sequence6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Throw11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Validate11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Wait11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.While11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers.BpeldiagElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class OnAlarmOnAlarmCompartment3ItemSemanticEditPolicy extends
		BpeldiagBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OnAlarmOnAlarmCompartment3ItemSemanticEditPolicy() {
		super(BpeldiagElementTypes.OnAlarm_2027);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BpeldiagElementTypes.Assign_3228 == req.getElementType()) {
			return getGEFWrapper(new Assign6CreateCommand(req));
		}
		if (BpeldiagElementTypes.Compensate_3229 == req.getElementType()) {
			return getGEFWrapper(new Compensate6CreateCommand(req));
		}
		if (BpeldiagElementTypes.CompensateScope_3230 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope6CreateCommand(req));
		}
		if (BpeldiagElementTypes.Empty_3231 == req.getElementType()) {
			return getGEFWrapper(new Empty6CreateCommand(req));
		}
		if (BpeldiagElementTypes.Exit_3232 == req.getElementType()) {
			return getGEFWrapper(new Exit6CreateCommand(req));
		}
		if (BpeldiagElementTypes.ExtensionActivity_3233 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity6CreateCommand(req));
		}
		if (BpeldiagElementTypes.Flow_3234 == req.getElementType()) {
			return getGEFWrapper(new Flow4CreateCommand(req));
		}
		if (BpeldiagElementTypes.ForEach_3245 == req.getElementType()) {
			return getGEFWrapper(new ForEach7CreateCommand(req));
		}
		if (BpeldiagElementTypes.If_3248 == req.getElementType()) {
			return getGEFWrapper(new If9CreateCommand(req));
		}
		if (BpeldiagElementTypes.Invoke_3249 == req.getElementType()) {
			return getGEFWrapper(new Invoke11CreateCommand(req));
		}
		if (BpeldiagElementTypes.OpaqueActivity_3250 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity11CreateCommand(req));
		}
		if (BpeldiagElementTypes.PartnerActivity_3251 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity11CreateCommand(req));
		}
		if (BpeldiagElementTypes.Pick_3252 == req.getElementType()) {
			return getGEFWrapper(new Pick11CreateCommand(req));
		}
		if (BpeldiagElementTypes.Receive_3253 == req.getElementType()) {
			return getGEFWrapper(new Receive11CreateCommand(req));
		}
		if (BpeldiagElementTypes.RepeatUntil_3254 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil10CreateCommand(req));
		}
		if (BpeldiagElementTypes.Reply_3255 == req.getElementType()) {
			return getGEFWrapper(new Reply11CreateCommand(req));
		}
		if (BpeldiagElementTypes.Rethrow_3256 == req.getElementType()) {
			return getGEFWrapper(new Rethrow11CreateCommand(req));
		}
		if (BpeldiagElementTypes.Scope_3257 == req.getElementType()) {
			return getGEFWrapper(new Scope11CreateCommand(req));
		}
		if (BpeldiagElementTypes.Sequence_3258 == req.getElementType()) {
			return getGEFWrapper(new Sequence6CreateCommand(req));
		}
		if (BpeldiagElementTypes.Throw_3259 == req.getElementType()) {
			return getGEFWrapper(new Throw11CreateCommand(req));
		}
		if (BpeldiagElementTypes.Validate_3260 == req.getElementType()) {
			return getGEFWrapper(new Validate11CreateCommand(req));
		}
		if (BpeldiagElementTypes.Wait_3261 == req.getElementType()) {
			return getGEFWrapper(new Wait11CreateCommand(req));
		}
		if (BpeldiagElementTypes.While_3262 == req.getElementType()) {
			return getGEFWrapper(new While11CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
