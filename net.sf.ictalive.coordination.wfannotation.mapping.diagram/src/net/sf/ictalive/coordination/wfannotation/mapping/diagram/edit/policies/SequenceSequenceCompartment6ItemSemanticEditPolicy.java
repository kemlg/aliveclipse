package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Assign10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Compensate10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.CompensateScope10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Empty10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Exit10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ExtensionActivity10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Flow6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ForEach8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.If5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Invoke8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.OpaqueActivity8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.PartnerActivity8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Pick8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Receive8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.RepeatUntil8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Reply8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Rethrow8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Scope8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Sequence4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Throw7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Validate7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Wait7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.While7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class SequenceSequenceCompartment6ItemSemanticEditPolicy extends
		MappingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SequenceSequenceCompartment6ItemSemanticEditPolicy() {
		super(MappingElementTypes.Sequence_3258);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MappingElementTypes.Assign_3138 == req.getElementType()) {
			return getGEFWrapper(new Assign10CreateCommand(req));
		}
		if (MappingElementTypes.Compensate_3139 == req.getElementType()) {
			return getGEFWrapper(new Compensate10CreateCommand(req));
		}
		if (MappingElementTypes.CompensateScope_3140 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope10CreateCommand(req));
		}
		if (MappingElementTypes.Empty_3141 == req.getElementType()) {
			return getGEFWrapper(new Empty10CreateCommand(req));
		}
		if (MappingElementTypes.Exit_3142 == req.getElementType()) {
			return getGEFWrapper(new Exit10CreateCommand(req));
		}
		if (MappingElementTypes.ExtensionActivity_3143 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity10CreateCommand(req));
		}
		if (MappingElementTypes.Flow_3144 == req.getElementType()) {
			return getGEFWrapper(new Flow6CreateCommand(req));
		}
		if (MappingElementTypes.ForEach_3153 == req.getElementType()) {
			return getGEFWrapper(new ForEach8CreateCommand(req));
		}
		if (MappingElementTypes.If_3154 == req.getElementType()) {
			return getGEFWrapper(new If5CreateCommand(req));
		}
		if (MappingElementTypes.Invoke_3192 == req.getElementType()) {
			return getGEFWrapper(new Invoke8CreateCommand(req));
		}
		if (MappingElementTypes.OpaqueActivity_3193 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity8CreateCommand(req));
		}
		if (MappingElementTypes.PartnerActivity_3194 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity8CreateCommand(req));
		}
		if (MappingElementTypes.Pick_3195 == req.getElementType()) {
			return getGEFWrapper(new Pick8CreateCommand(req));
		}
		if (MappingElementTypes.Receive_3196 == req.getElementType()) {
			return getGEFWrapper(new Receive8CreateCommand(req));
		}
		if (MappingElementTypes.RepeatUntil_3197 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil8CreateCommand(req));
		}
		if (MappingElementTypes.Reply_3198 == req.getElementType()) {
			return getGEFWrapper(new Reply8CreateCommand(req));
		}
		if (MappingElementTypes.Rethrow_3199 == req.getElementType()) {
			return getGEFWrapper(new Rethrow8CreateCommand(req));
		}
		if (MappingElementTypes.Scope_3200 == req.getElementType()) {
			return getGEFWrapper(new Scope8CreateCommand(req));
		}
		if (MappingElementTypes.Sequence_3201 == req.getElementType()) {
			return getGEFWrapper(new Sequence4CreateCommand(req));
		}
		if (MappingElementTypes.Throw_3202 == req.getElementType()) {
			return getGEFWrapper(new Throw7CreateCommand(req));
		}
		if (MappingElementTypes.Validate_3203 == req.getElementType()) {
			return getGEFWrapper(new Validate7CreateCommand(req));
		}
		if (MappingElementTypes.Wait_3204 == req.getElementType()) {
			return getGEFWrapper(new Wait7CreateCommand(req));
		}
		if (MappingElementTypes.While_3205 == req.getElementType()) {
			return getGEFWrapper(new While7CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
