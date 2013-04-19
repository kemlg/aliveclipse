package net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Assign9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Compensate9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.CompensateScope9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Empty9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.EventHandler2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Exit9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ExtensionActivity9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.ForEach6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Invoke6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.OpaqueActivity6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.PartnerActivity6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Pick6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Receive5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Reply4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Rethrow4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Scope3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Throw2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Validate2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.Wait2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.edit.commands.While2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.bpel.diagram.bpeldiag.diagram.providers.BpeldiagElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ScopeScopeCompartmentItemSemanticEditPolicy extends
		BpeldiagBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ScopeScopeCompartmentItemSemanticEditPolicy() {
		super(BpeldiagElementTypes.Scope_3158);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BpeldiagElementTypes.Assign_3114 == req.getElementType()) {
			return getGEFWrapper(new Assign9CreateCommand(req));
		}
		if (BpeldiagElementTypes.Compensate_3115 == req.getElementType()) {
			return getGEFWrapper(new Compensate9CreateCommand(req));
		}
		if (BpeldiagElementTypes.CompensateScope_3116 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope9CreateCommand(req));
		}
		if (BpeldiagElementTypes.Empty_3117 == req.getElementType()) {
			return getGEFWrapper(new Empty9CreateCommand(req));
		}
		if (BpeldiagElementTypes.Exit_3118 == req.getElementType()) {
			return getGEFWrapper(new Exit9CreateCommand(req));
		}
		if (BpeldiagElementTypes.ExtensionActivity_3119 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity9CreateCommand(req));
		}
		if (BpeldiagElementTypes.Scope_3120 == req.getElementType()) {
			return getGEFWrapper(new Scope3CreateCommand(req));
		}
		if (BpeldiagElementTypes.ForEach_3121 == req.getElementType()) {
			return getGEFWrapper(new ForEach6CreateCommand(req));
		}
		if (BpeldiagElementTypes.Invoke_3140 == req.getElementType()) {
			return getGEFWrapper(new Invoke6CreateCommand(req));
		}
		if (BpeldiagElementTypes.OpaqueActivity_3141 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity6CreateCommand(req));
		}
		if (BpeldiagElementTypes.PartnerActivity_3142 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity6CreateCommand(req));
		}
		if (BpeldiagElementTypes.Pick_3143 == req.getElementType()) {
			return getGEFWrapper(new Pick6CreateCommand(req));
		}
		if (BpeldiagElementTypes.Receive_3144 == req.getElementType()) {
			return getGEFWrapper(new Receive5CreateCommand(req));
		}
		if (BpeldiagElementTypes.Reply_3145 == req.getElementType()) {
			return getGEFWrapper(new Reply4CreateCommand(req));
		}
		if (BpeldiagElementTypes.Rethrow_3146 == req.getElementType()) {
			return getGEFWrapper(new Rethrow4CreateCommand(req));
		}
		if (BpeldiagElementTypes.Throw_3147 == req.getElementType()) {
			return getGEFWrapper(new Throw2CreateCommand(req));
		}
		if (BpeldiagElementTypes.Validate_3148 == req.getElementType()) {
			return getGEFWrapper(new Validate2CreateCommand(req));
		}
		if (BpeldiagElementTypes.Wait_3149 == req.getElementType()) {
			return getGEFWrapper(new Wait2CreateCommand(req));
		}
		if (BpeldiagElementTypes.While_3150 == req.getElementType()) {
			return getGEFWrapper(new While2CreateCommand(req));
		}
		if (BpeldiagElementTypes.EventHandler_3243 == req.getElementType()) {
			return getGEFWrapper(new EventHandler2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
