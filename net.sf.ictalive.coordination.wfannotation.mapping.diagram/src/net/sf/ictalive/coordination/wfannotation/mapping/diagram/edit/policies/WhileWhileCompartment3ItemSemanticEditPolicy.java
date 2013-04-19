package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Assign9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Compensate9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.CompensateScope9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Empty9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Exit9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ExtensionActivity9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Flow5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ForEach7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.If4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Invoke6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.OpaqueActivity6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.PartnerActivity6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Pick6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Receive6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.RepeatUntil6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Reply5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Rethrow5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Scope5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Sequence2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Throw5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Validate5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Wait5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.While5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class WhileWhileCompartment3ItemSemanticEditPolicy extends
		MappingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public WhileWhileCompartment3ItemSemanticEditPolicy() {
		super(MappingElementTypes.While_3127);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MappingElementTypes.Assign_3103 == req.getElementType()) {
			return getGEFWrapper(new Assign9CreateCommand(req));
		}
		if (MappingElementTypes.Compensate_3104 == req.getElementType()) {
			return getGEFWrapper(new Compensate9CreateCommand(req));
		}
		if (MappingElementTypes.CompensateScope_3105 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope9CreateCommand(req));
		}
		if (MappingElementTypes.Empty_3106 == req.getElementType()) {
			return getGEFWrapper(new Empty9CreateCommand(req));
		}
		if (MappingElementTypes.Exit_3107 == req.getElementType()) {
			return getGEFWrapper(new Exit9CreateCommand(req));
		}
		if (MappingElementTypes.ExtensionActivity_3108 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity9CreateCommand(req));
		}
		if (MappingElementTypes.Flow_3109 == req.getElementType()) {
			return getGEFWrapper(new Flow5CreateCommand(req));
		}
		if (MappingElementTypes.ForEach_3120 == req.getElementType()) {
			return getGEFWrapper(new ForEach7CreateCommand(req));
		}
		if (MappingElementTypes.If_3121 == req.getElementType()) {
			return getGEFWrapper(new If4CreateCommand(req));
		}
		if (MappingElementTypes.Invoke_3128 == req.getElementType()) {
			return getGEFWrapper(new Invoke6CreateCommand(req));
		}
		if (MappingElementTypes.OpaqueActivity_3129 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity6CreateCommand(req));
		}
		if (MappingElementTypes.PartnerActivity_3130 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity6CreateCommand(req));
		}
		if (MappingElementTypes.Pick_3131 == req.getElementType()) {
			return getGEFWrapper(new Pick6CreateCommand(req));
		}
		if (MappingElementTypes.Receive_3132 == req.getElementType()) {
			return getGEFWrapper(new Receive6CreateCommand(req));
		}
		if (MappingElementTypes.RepeatUntil_3133 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil6CreateCommand(req));
		}
		if (MappingElementTypes.Reply_3134 == req.getElementType()) {
			return getGEFWrapper(new Reply5CreateCommand(req));
		}
		if (MappingElementTypes.Rethrow_3135 == req.getElementType()) {
			return getGEFWrapper(new Rethrow5CreateCommand(req));
		}
		if (MappingElementTypes.Scope_3136 == req.getElementType()) {
			return getGEFWrapper(new Scope5CreateCommand(req));
		}
		if (MappingElementTypes.Sequence_3137 == req.getElementType()) {
			return getGEFWrapper(new Sequence2CreateCommand(req));
		}
		if (MappingElementTypes.Throw_3149 == req.getElementType()) {
			return getGEFWrapper(new Throw5CreateCommand(req));
		}
		if (MappingElementTypes.Validate_3150 == req.getElementType()) {
			return getGEFWrapper(new Validate5CreateCommand(req));
		}
		if (MappingElementTypes.Wait_3151 == req.getElementType()) {
			return getGEFWrapper(new Wait5CreateCommand(req));
		}
		if (MappingElementTypes.While_3152 == req.getElementType()) {
			return getGEFWrapper(new While5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
