package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Assign12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Compensate12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.CompensateScope12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Empty12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Exit12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ExtensionActivity12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Flow8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ForEach10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.If7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Invoke7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.OpaqueActivity7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.PartnerActivity7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Pick7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Receive7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.RepeatUntil7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Reply7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Rethrow7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Scope7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Sequence3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Throw8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Validate8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Wait8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.While8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ElseElseCompartmentItemSemanticEditPolicy extends
		MappingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ElseElseCompartmentItemSemanticEditPolicy() {
		super(MappingElementTypes.Else_3172);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MappingElementTypes.Assign_3173 == req.getElementType()) {
			return getGEFWrapper(new Assign12CreateCommand(req));
		}
		if (MappingElementTypes.Compensate_3174 == req.getElementType()) {
			return getGEFWrapper(new Compensate12CreateCommand(req));
		}
		if (MappingElementTypes.CompensateScope_3175 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope12CreateCommand(req));
		}
		if (MappingElementTypes.Empty_3176 == req.getElementType()) {
			return getGEFWrapper(new Empty12CreateCommand(req));
		}
		if (MappingElementTypes.Exit_3177 == req.getElementType()) {
			return getGEFWrapper(new Exit12CreateCommand(req));
		}
		if (MappingElementTypes.ExtensionActivity_3178 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity12CreateCommand(req));
		}
		if (MappingElementTypes.Flow_3179 == req.getElementType()) {
			return getGEFWrapper(new Flow8CreateCommand(req));
		}
		if (MappingElementTypes.ForEach_3180 == req.getElementType()) {
			return getGEFWrapper(new ForEach10CreateCommand(req));
		}
		if (MappingElementTypes.If_3181 == req.getElementType()) {
			return getGEFWrapper(new If7CreateCommand(req));
		}
		if (MappingElementTypes.Invoke_3182 == req.getElementType()) {
			return getGEFWrapper(new Invoke7CreateCommand(req));
		}
		if (MappingElementTypes.OpaqueActivity_3183 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity7CreateCommand(req));
		}
		if (MappingElementTypes.PartnerActivity_3184 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity7CreateCommand(req));
		}
		if (MappingElementTypes.Pick_3185 == req.getElementType()) {
			return getGEFWrapper(new Pick7CreateCommand(req));
		}
		if (MappingElementTypes.Receive_3186 == req.getElementType()) {
			return getGEFWrapper(new Receive7CreateCommand(req));
		}
		if (MappingElementTypes.RepeatUntil_3187 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil7CreateCommand(req));
		}
		if (MappingElementTypes.Reply_3188 == req.getElementType()) {
			return getGEFWrapper(new Reply7CreateCommand(req));
		}
		if (MappingElementTypes.Rethrow_3189 == req.getElementType()) {
			return getGEFWrapper(new Rethrow7CreateCommand(req));
		}
		if (MappingElementTypes.Scope_3190 == req.getElementType()) {
			return getGEFWrapper(new Scope7CreateCommand(req));
		}
		if (MappingElementTypes.Sequence_3191 == req.getElementType()) {
			return getGEFWrapper(new Sequence3CreateCommand(req));
		}
		if (MappingElementTypes.Throw_3206 == req.getElementType()) {
			return getGEFWrapper(new Throw8CreateCommand(req));
		}
		if (MappingElementTypes.Validate_3207 == req.getElementType()) {
			return getGEFWrapper(new Validate8CreateCommand(req));
		}
		if (MappingElementTypes.Wait_3208 == req.getElementType()) {
			return getGEFWrapper(new Wait8CreateCommand(req));
		}
		if (MappingElementTypes.While_3209 == req.getElementType()) {
			return getGEFWrapper(new While8CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
