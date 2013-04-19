package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Assign6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Compensate6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.CompensateScope6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Empty6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Exit6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ExtensionActivity6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Flow4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ForEach12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.If10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Invoke12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.OpaqueActivity12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.PartnerActivity12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Pick12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Receive12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.RepeatUntil12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Reply12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Rethrow12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Scope12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Sequence8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Throw12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Validate12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Wait12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.While12CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class OnMessageOnMessageCompartmentItemSemanticEditPolicy extends
		MappingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OnMessageOnMessageCompartmentItemSemanticEditPolicy() {
		super(MappingElementTypes.OnMessage_3049);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MappingElementTypes.Assign_3050 == req.getElementType()) {
			return getGEFWrapper(new Assign6CreateCommand(req));
		}
		if (MappingElementTypes.Compensate_3051 == req.getElementType()) {
			return getGEFWrapper(new Compensate6CreateCommand(req));
		}
		if (MappingElementTypes.CompensateScope_3052 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope6CreateCommand(req));
		}
		if (MappingElementTypes.Empty_3053 == req.getElementType()) {
			return getGEFWrapper(new Empty6CreateCommand(req));
		}
		if (MappingElementTypes.Exit_3054 == req.getElementType()) {
			return getGEFWrapper(new Exit6CreateCommand(req));
		}
		if (MappingElementTypes.ExtensionActivity_3055 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity6CreateCommand(req));
		}
		if (MappingElementTypes.Flow_3056 == req.getElementType()) {
			return getGEFWrapper(new Flow4CreateCommand(req));
		}
		if (MappingElementTypes.ForEach_3263 == req.getElementType()) {
			return getGEFWrapper(new ForEach12CreateCommand(req));
		}
		if (MappingElementTypes.If_3264 == req.getElementType()) {
			return getGEFWrapper(new If10CreateCommand(req));
		}
		if (MappingElementTypes.Invoke_3265 == req.getElementType()) {
			return getGEFWrapper(new Invoke12CreateCommand(req));
		}
		if (MappingElementTypes.OpaqueActivity_3266 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity12CreateCommand(req));
		}
		if (MappingElementTypes.PartnerActivity_3267 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity12CreateCommand(req));
		}
		if (MappingElementTypes.Pick_3268 == req.getElementType()) {
			return getGEFWrapper(new Pick12CreateCommand(req));
		}
		if (MappingElementTypes.Receive_3269 == req.getElementType()) {
			return getGEFWrapper(new Receive12CreateCommand(req));
		}
		if (MappingElementTypes.RepeatUntil_3270 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil12CreateCommand(req));
		}
		if (MappingElementTypes.Reply_3271 == req.getElementType()) {
			return getGEFWrapper(new Reply12CreateCommand(req));
		}
		if (MappingElementTypes.Rethrow_3272 == req.getElementType()) {
			return getGEFWrapper(new Rethrow12CreateCommand(req));
		}
		if (MappingElementTypes.Scope_3273 == req.getElementType()) {
			return getGEFWrapper(new Scope12CreateCommand(req));
		}
		if (MappingElementTypes.Sequence_3274 == req.getElementType()) {
			return getGEFWrapper(new Sequence8CreateCommand(req));
		}
		if (MappingElementTypes.Throw_3275 == req.getElementType()) {
			return getGEFWrapper(new Throw12CreateCommand(req));
		}
		if (MappingElementTypes.Validate_3276 == req.getElementType()) {
			return getGEFWrapper(new Validate12CreateCommand(req));
		}
		if (MappingElementTypes.Wait_3277 == req.getElementType()) {
			return getGEFWrapper(new Wait12CreateCommand(req));
		}
		if (MappingElementTypes.While_3278 == req.getElementType()) {
			return getGEFWrapper(new While12CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
