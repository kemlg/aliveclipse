package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Assign3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Compensate3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.CompensateScope3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Empty3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Exit3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ExtensionActivity3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ForEach2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.IfCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.InvokeCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.OpaqueActivityCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.PartnerActivityCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.PickCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Receive2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.RepeatUntil4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Reply2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Rethrow2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Scope3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Throw2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Validate2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Wait2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.While2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ForEachForEachCompartment13ItemSemanticEditPolicy extends
		MappingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ForEachForEachCompartment13ItemSemanticEditPolicy() {
		super(MappingElementTypes.ForEach_3279);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MappingElementTypes.Assign_3016 == req.getElementType()) {
			return getGEFWrapper(new Assign3CreateCommand(req));
		}
		if (MappingElementTypes.Compensate_3017 == req.getElementType()) {
			return getGEFWrapper(new Compensate3CreateCommand(req));
		}
		if (MappingElementTypes.CompensateScope_3018 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope3CreateCommand(req));
		}
		if (MappingElementTypes.Empty_3019 == req.getElementType()) {
			return getGEFWrapper(new Empty3CreateCommand(req));
		}
		if (MappingElementTypes.Exit_3020 == req.getElementType()) {
			return getGEFWrapper(new Exit3CreateCommand(req));
		}
		if (MappingElementTypes.ExtensionActivity_3021 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity3CreateCommand(req));
		}
		if (MappingElementTypes.ForEach_3022 == req.getElementType()) {
			return getGEFWrapper(new ForEach2CreateCommand(req));
		}
		if (MappingElementTypes.If_3023 == req.getElementType()) {
			return getGEFWrapper(new IfCreateCommand(req));
		}
		if (MappingElementTypes.Invoke_3032 == req.getElementType()) {
			return getGEFWrapper(new InvokeCreateCommand(req));
		}
		if (MappingElementTypes.OpaqueActivity_3033 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivityCreateCommand(req));
		}
		if (MappingElementTypes.PartnerActivity_3034 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivityCreateCommand(req));
		}
		if (MappingElementTypes.Pick_3035 == req.getElementType()) {
			return getGEFWrapper(new PickCreateCommand(req));
		}
		if (MappingElementTypes.Receive_3071 == req.getElementType()) {
			return getGEFWrapper(new Receive2CreateCommand(req));
		}
		if (MappingElementTypes.RepeatUntil_3072 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil4CreateCommand(req));
		}
		if (MappingElementTypes.Reply_3089 == req.getElementType()) {
			return getGEFWrapper(new Reply2CreateCommand(req));
		}
		if (MappingElementTypes.Rethrow_3090 == req.getElementType()) {
			return getGEFWrapper(new Rethrow2CreateCommand(req));
		}
		if (MappingElementTypes.Scope_3091 == req.getElementType()) {
			return getGEFWrapper(new Scope3CreateCommand(req));
		}
		if (MappingElementTypes.Throw_3116 == req.getElementType()) {
			return getGEFWrapper(new Throw2CreateCommand(req));
		}
		if (MappingElementTypes.Validate_3117 == req.getElementType()) {
			return getGEFWrapper(new Validate2CreateCommand(req));
		}
		if (MappingElementTypes.Wait_3118 == req.getElementType()) {
			return getGEFWrapper(new Wait2CreateCommand(req));
		}
		if (MappingElementTypes.While_3119 == req.getElementType()) {
			return getGEFWrapper(new While2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
