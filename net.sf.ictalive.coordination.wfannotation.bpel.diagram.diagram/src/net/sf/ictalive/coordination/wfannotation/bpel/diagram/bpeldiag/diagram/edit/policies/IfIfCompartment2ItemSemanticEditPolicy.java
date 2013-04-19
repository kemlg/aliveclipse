package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Assign5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Compensate5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.CompensateScope5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Else2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ElseIf2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Empty5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Exit5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ExtensionActivity5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ForEach4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.If3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Invoke3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OpaqueActivity3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.PartnerActivity3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Pick3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Receive6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.RepeatUntil5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Reply7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Rethrow7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Scope7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Throw7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Validate7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Wait7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.While7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers.BpeldiagElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class IfIfCompartment2ItemSemanticEditPolicy extends
		BpeldiagBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IfIfCompartment2ItemSemanticEditPolicy() {
		super(BpeldiagElementTypes.If_3104);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BpeldiagElementTypes.Assign_3098 == req.getElementType()) {
			return getGEFWrapper(new Assign5CreateCommand(req));
		}
		if (BpeldiagElementTypes.Compensate_3099 == req.getElementType()) {
			return getGEFWrapper(new Compensate5CreateCommand(req));
		}
		if (BpeldiagElementTypes.CompensateScope_3100 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope5CreateCommand(req));
		}
		if (BpeldiagElementTypes.Empty_3101 == req.getElementType()) {
			return getGEFWrapper(new Empty5CreateCommand(req));
		}
		if (BpeldiagElementTypes.Exit_3102 == req.getElementType()) {
			return getGEFWrapper(new Exit5CreateCommand(req));
		}
		if (BpeldiagElementTypes.ExtensionActivity_3103 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity5CreateCommand(req));
		}
		if (BpeldiagElementTypes.If_3104 == req.getElementType()) {
			return getGEFWrapper(new If3CreateCommand(req));
		}
		if (BpeldiagElementTypes.ForEach_3105 == req.getElementType()) {
			return getGEFWrapper(new ForEach4CreateCommand(req));
		}
		if (BpeldiagElementTypes.Invoke_3163 == req.getElementType()) {
			return getGEFWrapper(new Invoke3CreateCommand(req));
		}
		if (BpeldiagElementTypes.OpaqueActivity_3164 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity3CreateCommand(req));
		}
		if (BpeldiagElementTypes.PartnerActivity_3165 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity3CreateCommand(req));
		}
		if (BpeldiagElementTypes.Pick_3166 == req.getElementType()) {
			return getGEFWrapper(new Pick3CreateCommand(req));
		}
		if (BpeldiagElementTypes.Receive_3167 == req.getElementType()) {
			return getGEFWrapper(new Receive6CreateCommand(req));
		}
		if (BpeldiagElementTypes.RepeatUntil_3168 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil5CreateCommand(req));
		}
		if (BpeldiagElementTypes.Reply_3169 == req.getElementType()) {
			return getGEFWrapper(new Reply7CreateCommand(req));
		}
		if (BpeldiagElementTypes.Rethrow_3170 == req.getElementType()) {
			return getGEFWrapper(new Rethrow7CreateCommand(req));
		}
		if (BpeldiagElementTypes.Scope_3171 == req.getElementType()) {
			return getGEFWrapper(new Scope7CreateCommand(req));
		}
		if (BpeldiagElementTypes.Throw_3172 == req.getElementType()) {
			return getGEFWrapper(new Throw7CreateCommand(req));
		}
		if (BpeldiagElementTypes.Validate_3173 == req.getElementType()) {
			return getGEFWrapper(new Validate7CreateCommand(req));
		}
		if (BpeldiagElementTypes.Wait_3174 == req.getElementType()) {
			return getGEFWrapper(new Wait7CreateCommand(req));
		}
		if (BpeldiagElementTypes.While_3175 == req.getElementType()) {
			return getGEFWrapper(new While7CreateCommand(req));
		}
		if (BpeldiagElementTypes.ElseIf_3246 == req.getElementType()) {
			return getGEFWrapper(new ElseIf2CreateCommand(req));
		}
		if (BpeldiagElementTypes.Else_3247 == req.getElementType()) {
			return getGEFWrapper(new Else2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
