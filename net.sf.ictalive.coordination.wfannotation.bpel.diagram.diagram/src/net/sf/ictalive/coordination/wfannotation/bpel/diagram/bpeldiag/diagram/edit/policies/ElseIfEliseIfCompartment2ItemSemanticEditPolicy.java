package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Assign12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Compensate12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.CompensateScope12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Empty12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Exit12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ExtensionActivity12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Flow8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ForEach10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.If7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Invoke10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OpaqueActivity10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.PartnerActivity10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Pick10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Receive10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.RepeatUntil9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Reply10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Rethrow10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Scope10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Sequence5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Throw10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Validate10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Wait10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.While10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers.BpeldiagElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ElseIfEliseIfCompartment2ItemSemanticEditPolicy extends
		BpeldiagBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ElseIfEliseIfCompartment2ItemSemanticEditPolicy() {
		super(BpeldiagElementTypes.ElseIf_2025);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BpeldiagElementTypes.Assign_3181 == req.getElementType()) {
			return getGEFWrapper(new Assign12CreateCommand(req));
		}
		if (BpeldiagElementTypes.Compensate_3182 == req.getElementType()) {
			return getGEFWrapper(new Compensate12CreateCommand(req));
		}
		if (BpeldiagElementTypes.CompensateScope_3183 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope12CreateCommand(req));
		}
		if (BpeldiagElementTypes.Empty_3184 == req.getElementType()) {
			return getGEFWrapper(new Empty12CreateCommand(req));
		}
		if (BpeldiagElementTypes.Exit_3185 == req.getElementType()) {
			return getGEFWrapper(new Exit12CreateCommand(req));
		}
		if (BpeldiagElementTypes.ExtensionActivity_3186 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity12CreateCommand(req));
		}
		if (BpeldiagElementTypes.Flow_3187 == req.getElementType()) {
			return getGEFWrapper(new Flow8CreateCommand(req));
		}
		if (BpeldiagElementTypes.ForEach_3188 == req.getElementType()) {
			return getGEFWrapper(new ForEach10CreateCommand(req));
		}
		if (BpeldiagElementTypes.If_3189 == req.getElementType()) {
			return getGEFWrapper(new If7CreateCommand(req));
		}
		if (BpeldiagElementTypes.Invoke_3190 == req.getElementType()) {
			return getGEFWrapper(new Invoke10CreateCommand(req));
		}
		if (BpeldiagElementTypes.OpaqueActivity_3191 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity10CreateCommand(req));
		}
		if (BpeldiagElementTypes.PartnerActivity_3192 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity10CreateCommand(req));
		}
		if (BpeldiagElementTypes.Pick_3193 == req.getElementType()) {
			return getGEFWrapper(new Pick10CreateCommand(req));
		}
		if (BpeldiagElementTypes.Receive_3194 == req.getElementType()) {
			return getGEFWrapper(new Receive10CreateCommand(req));
		}
		if (BpeldiagElementTypes.RepeatUntil_3195 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil9CreateCommand(req));
		}
		if (BpeldiagElementTypes.Reply_3196 == req.getElementType()) {
			return getGEFWrapper(new Reply10CreateCommand(req));
		}
		if (BpeldiagElementTypes.Rethrow_3197 == req.getElementType()) {
			return getGEFWrapper(new Rethrow10CreateCommand(req));
		}
		if (BpeldiagElementTypes.Scope_3198 == req.getElementType()) {
			return getGEFWrapper(new Scope10CreateCommand(req));
		}
		if (BpeldiagElementTypes.Sequence_3199 == req.getElementType()) {
			return getGEFWrapper(new Sequence5CreateCommand(req));
		}
		if (BpeldiagElementTypes.Throw_3200 == req.getElementType()) {
			return getGEFWrapper(new Throw10CreateCommand(req));
		}
		if (BpeldiagElementTypes.Validate_3201 == req.getElementType()) {
			return getGEFWrapper(new Validate10CreateCommand(req));
		}
		if (BpeldiagElementTypes.Wait_3202 == req.getElementType()) {
			return getGEFWrapper(new Wait10CreateCommand(req));
		}
		if (BpeldiagElementTypes.While_3203 == req.getElementType()) {
			return getGEFWrapper(new While10CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
