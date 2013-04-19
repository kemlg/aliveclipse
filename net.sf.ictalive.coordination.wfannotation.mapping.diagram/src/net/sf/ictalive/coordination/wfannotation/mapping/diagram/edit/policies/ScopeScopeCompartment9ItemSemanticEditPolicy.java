package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Assign8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Compensate8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.CompensateScope8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Empty8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.EventHandlerCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Exit8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ExtensionActivity8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ForEach5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Invoke5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.OpaqueActivity5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.PartnerActivity5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Pick5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Receive4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Reply3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Rethrow3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Scope2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ThrowCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ValidateCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.WaitCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.WhileCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ScopeScopeCompartment9ItemSemanticEditPolicy extends
		MappingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ScopeScopeCompartment9ItemSemanticEditPolicy() {
		super(MappingElementTypes.Scope_3218);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MappingElementTypes.Assign_3081 == req.getElementType()) {
			return getGEFWrapper(new Assign8CreateCommand(req));
		}
		if (MappingElementTypes.Compensate_3082 == req.getElementType()) {
			return getGEFWrapper(new Compensate8CreateCommand(req));
		}
		if (MappingElementTypes.CompensateScope_3083 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope8CreateCommand(req));
		}
		if (MappingElementTypes.Empty_3084 == req.getElementType()) {
			return getGEFWrapper(new Empty8CreateCommand(req));
		}
		if (MappingElementTypes.Exit_3085 == req.getElementType()) {
			return getGEFWrapper(new Exit8CreateCommand(req));
		}
		if (MappingElementTypes.ExtensionActivity_3086 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity8CreateCommand(req));
		}
		if (MappingElementTypes.Scope_3087 == req.getElementType()) {
			return getGEFWrapper(new Scope2CreateCommand(req));
		}
		if (MappingElementTypes.ForEach_3088 == req.getElementType()) {
			return getGEFWrapper(new ForEach5CreateCommand(req));
		}
		if (MappingElementTypes.Invoke_3092 == req.getElementType()) {
			return getGEFWrapper(new Invoke5CreateCommand(req));
		}
		if (MappingElementTypes.OpaqueActivity_3093 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity5CreateCommand(req));
		}
		if (MappingElementTypes.PartnerActivity_3094 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity5CreateCommand(req));
		}
		if (MappingElementTypes.Pick_3095 == req.getElementType()) {
			return getGEFWrapper(new Pick5CreateCommand(req));
		}
		if (MappingElementTypes.Receive_3096 == req.getElementType()) {
			return getGEFWrapper(new Receive4CreateCommand(req));
		}
		if (MappingElementTypes.Reply_3097 == req.getElementType()) {
			return getGEFWrapper(new Reply3CreateCommand(req));
		}
		if (MappingElementTypes.Rethrow_3098 == req.getElementType()) {
			return getGEFWrapper(new Rethrow3CreateCommand(req));
		}
		if (MappingElementTypes.Throw_3099 == req.getElementType()) {
			return getGEFWrapper(new ThrowCreateCommand(req));
		}
		if (MappingElementTypes.Validate_3100 == req.getElementType()) {
			return getGEFWrapper(new ValidateCreateCommand(req));
		}
		if (MappingElementTypes.Wait_3101 == req.getElementType()) {
			return getGEFWrapper(new WaitCreateCommand(req));
		}
		if (MappingElementTypes.While_3102 == req.getElementType()) {
			return getGEFWrapper(new WhileCreateCommand(req));
		}
		if (MappingElementTypes.EventHandler_3113 == req.getElementType()) {
			return getGEFWrapper(new EventHandlerCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
