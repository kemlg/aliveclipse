package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Assign7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Compensate7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.CompensateScope7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Empty7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Exit7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ExtensionActivity7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ForEach4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Invoke4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.OpaqueActivity4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.PartnerActivity4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Pick4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Receive3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.RepeatUntil3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ReplyCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.RethrowCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ScopeCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Throw3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Validate3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Wait3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.While3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class RepeatUntilRepeatUntilCompartment3ItemSemanticEditPolicy extends
		MappingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RepeatUntilRepeatUntilCompartment3ItemSemanticEditPolicy() {
		super(MappingElementTypes.RepeatUntil_3072);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MappingElementTypes.Assign_3063 == req.getElementType()) {
			return getGEFWrapper(new Assign7CreateCommand(req));
		}
		if (MappingElementTypes.Compensate_3064 == req.getElementType()) {
			return getGEFWrapper(new Compensate7CreateCommand(req));
		}
		if (MappingElementTypes.CompensateScope_3065 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope7CreateCommand(req));
		}
		if (MappingElementTypes.Empty_3066 == req.getElementType()) {
			return getGEFWrapper(new Empty7CreateCommand(req));
		}
		if (MappingElementTypes.Exit_3067 == req.getElementType()) {
			return getGEFWrapper(new Exit7CreateCommand(req));
		}
		if (MappingElementTypes.ExtensionActivity_3068 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity7CreateCommand(req));
		}
		if (MappingElementTypes.RepeatUntil_3069 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil3CreateCommand(req));
		}
		if (MappingElementTypes.ForEach_3070 == req.getElementType()) {
			return getGEFWrapper(new ForEach4CreateCommand(req));
		}
		if (MappingElementTypes.Invoke_3073 == req.getElementType()) {
			return getGEFWrapper(new Invoke4CreateCommand(req));
		}
		if (MappingElementTypes.OpaqueActivity_3074 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity4CreateCommand(req));
		}
		if (MappingElementTypes.PartnerActivity_3075 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity4CreateCommand(req));
		}
		if (MappingElementTypes.Pick_3076 == req.getElementType()) {
			return getGEFWrapper(new Pick4CreateCommand(req));
		}
		if (MappingElementTypes.Receive_3077 == req.getElementType()) {
			return getGEFWrapper(new Receive3CreateCommand(req));
		}
		if (MappingElementTypes.Reply_3078 == req.getElementType()) {
			return getGEFWrapper(new ReplyCreateCommand(req));
		}
		if (MappingElementTypes.Rethrow_3079 == req.getElementType()) {
			return getGEFWrapper(new RethrowCreateCommand(req));
		}
		if (MappingElementTypes.Scope_3080 == req.getElementType()) {
			return getGEFWrapper(new ScopeCreateCommand(req));
		}
		if (MappingElementTypes.Throw_3124 == req.getElementType()) {
			return getGEFWrapper(new Throw3CreateCommand(req));
		}
		if (MappingElementTypes.Validate_3125 == req.getElementType()) {
			return getGEFWrapper(new Validate3CreateCommand(req));
		}
		if (MappingElementTypes.Wait_3126 == req.getElementType()) {
			return getGEFWrapper(new Wait3CreateCommand(req));
		}
		if (MappingElementTypes.While_3127 == req.getElementType()) {
			return getGEFWrapper(new While3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
