package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Assign2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Compensate2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.CompensateScope2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Empty2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Exit2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ExtensionActivity2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Flow2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ForEachCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.If3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Invoke3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.OpaqueActivity3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.PartnerActivity3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Pick3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ReceiveCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.RepeatUntil2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Reply4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Rethrow4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Scope4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Throw4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Validate4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Wait4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.While4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class FlowFlowCompartment8ItemSemanticEditPolicy extends
		MappingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FlowFlowCompartment8ItemSemanticEditPolicy() {
		super(MappingElementTypes.Flow_3179);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MappingElementTypes.Assign_3008 == req.getElementType()) {
			return getGEFWrapper(new Assign2CreateCommand(req));
		}
		if (MappingElementTypes.Compensate_3009 == req.getElementType()) {
			return getGEFWrapper(new Compensate2CreateCommand(req));
		}
		if (MappingElementTypes.CompensateScope_3010 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope2CreateCommand(req));
		}
		if (MappingElementTypes.Empty_3011 == req.getElementType()) {
			return getGEFWrapper(new Empty2CreateCommand(req));
		}
		if (MappingElementTypes.Exit_3012 == req.getElementType()) {
			return getGEFWrapper(new Exit2CreateCommand(req));
		}
		if (MappingElementTypes.ExtensionActivity_3013 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity2CreateCommand(req));
		}
		if (MappingElementTypes.Flow_3014 == req.getElementType()) {
			return getGEFWrapper(new Flow2CreateCommand(req));
		}
		if (MappingElementTypes.ForEach_3015 == req.getElementType()) {
			return getGEFWrapper(new ForEachCreateCommand(req));
		}
		if (MappingElementTypes.If_3044 == req.getElementType()) {
			return getGEFWrapper(new If3CreateCommand(req));
		}
		if (MappingElementTypes.Invoke_3057 == req.getElementType()) {
			return getGEFWrapper(new Invoke3CreateCommand(req));
		}
		if (MappingElementTypes.OpaqueActivity_3058 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity3CreateCommand(req));
		}
		if (MappingElementTypes.PartnerActivity_3059 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity3CreateCommand(req));
		}
		if (MappingElementTypes.Pick_3060 == req.getElementType()) {
			return getGEFWrapper(new Pick3CreateCommand(req));
		}
		if (MappingElementTypes.Receive_3061 == req.getElementType()) {
			return getGEFWrapper(new ReceiveCreateCommand(req));
		}
		if (MappingElementTypes.RepeatUntil_3062 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil2CreateCommand(req));
		}
		if (MappingElementTypes.Reply_3110 == req.getElementType()) {
			return getGEFWrapper(new Reply4CreateCommand(req));
		}
		if (MappingElementTypes.Rethrow_3111 == req.getElementType()) {
			return getGEFWrapper(new Rethrow4CreateCommand(req));
		}
		if (MappingElementTypes.Scope_3112 == req.getElementType()) {
			return getGEFWrapper(new Scope4CreateCommand(req));
		}
		if (MappingElementTypes.Throw_3145 == req.getElementType()) {
			return getGEFWrapper(new Throw4CreateCommand(req));
		}
		if (MappingElementTypes.Validate_3146 == req.getElementType()) {
			return getGEFWrapper(new Validate4CreateCommand(req));
		}
		if (MappingElementTypes.Wait_3147 == req.getElementType()) {
			return getGEFWrapper(new Wait4CreateCommand(req));
		}
		if (MappingElementTypes.While_3148 == req.getElementType()) {
			return getGEFWrapper(new While4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
