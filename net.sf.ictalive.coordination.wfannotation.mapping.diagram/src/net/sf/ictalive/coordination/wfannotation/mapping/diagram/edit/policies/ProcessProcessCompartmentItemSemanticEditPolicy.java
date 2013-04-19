package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.AssignCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.CompensateCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.CompensateScopeCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.EmptyCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.EventHandler2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ExitCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ExtensionActivityCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.FlowCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ForEach13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.If11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Invoke13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.OpaqueActivity13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.PartnerActivity13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Pick13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Receive13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.RepeatUntil13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Reply13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Rethrow13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Scope13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Sequence9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Throw13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Validate13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Wait13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.While13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ProcessProcessCompartmentItemSemanticEditPolicy extends
		MappingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProcessProcessCompartmentItemSemanticEditPolicy() {
		super(MappingElementTypes.Process_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MappingElementTypes.Assign_3001 == req.getElementType()) {
			return getGEFWrapper(new AssignCreateCommand(req));
		}
		if (MappingElementTypes.Compensate_3002 == req.getElementType()) {
			return getGEFWrapper(new CompensateCreateCommand(req));
		}
		if (MappingElementTypes.CompensateScope_3003 == req.getElementType()) {
			return getGEFWrapper(new CompensateScopeCreateCommand(req));
		}
		if (MappingElementTypes.Empty_3004 == req.getElementType()) {
			return getGEFWrapper(new EmptyCreateCommand(req));
		}
		if (MappingElementTypes.Exit_3005 == req.getElementType()) {
			return getGEFWrapper(new ExitCreateCommand(req));
		}
		if (MappingElementTypes.ExtensionActivity_3006 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivityCreateCommand(req));
		}
		if (MappingElementTypes.Flow_3007 == req.getElementType()) {
			return getGEFWrapper(new FlowCreateCommand(req));
		}
		if (MappingElementTypes.ForEach_3279 == req.getElementType()) {
			return getGEFWrapper(new ForEach13CreateCommand(req));
		}
		if (MappingElementTypes.If_3280 == req.getElementType()) {
			return getGEFWrapper(new If11CreateCommand(req));
		}
		if (MappingElementTypes.Invoke_3281 == req.getElementType()) {
			return getGEFWrapper(new Invoke13CreateCommand(req));
		}
		if (MappingElementTypes.OpaqueActivity_3282 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity13CreateCommand(req));
		}
		if (MappingElementTypes.PartnerActivity_3283 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity13CreateCommand(req));
		}
		if (MappingElementTypes.Pick_3284 == req.getElementType()) {
			return getGEFWrapper(new Pick13CreateCommand(req));
		}
		if (MappingElementTypes.Receive_3285 == req.getElementType()) {
			return getGEFWrapper(new Receive13CreateCommand(req));
		}
		if (MappingElementTypes.RepeatUntil_3286 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil13CreateCommand(req));
		}
		if (MappingElementTypes.Reply_3287 == req.getElementType()) {
			return getGEFWrapper(new Reply13CreateCommand(req));
		}
		if (MappingElementTypes.Rethrow_3288 == req.getElementType()) {
			return getGEFWrapper(new Rethrow13CreateCommand(req));
		}
		if (MappingElementTypes.Scope_3289 == req.getElementType()) {
			return getGEFWrapper(new Scope13CreateCommand(req));
		}
		if (MappingElementTypes.Sequence_3290 == req.getElementType()) {
			return getGEFWrapper(new Sequence9CreateCommand(req));
		}
		if (MappingElementTypes.Throw_3291 == req.getElementType()) {
			return getGEFWrapper(new Throw13CreateCommand(req));
		}
		if (MappingElementTypes.Validate_3292 == req.getElementType()) {
			return getGEFWrapper(new Validate13CreateCommand(req));
		}
		if (MappingElementTypes.Wait_3293 == req.getElementType()) {
			return getGEFWrapper(new Wait13CreateCommand(req));
		}
		if (MappingElementTypes.While_3294 == req.getElementType()) {
			return getGEFWrapper(new While13CreateCommand(req));
		}
		if (MappingElementTypes.EventHandler_3295 == req.getElementType()) {
			return getGEFWrapper(new EventHandler2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
