package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Assign5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Compensate5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.CompensateScope5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Empty5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Exit5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ExtensionActivity5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Flow3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ForEach6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.If8CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Invoke10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.OpaqueActivity10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.PartnerActivity10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Pick10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Receive10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.RepeatUntil10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Reply10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Rethrow10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Scope10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Sequence6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Throw10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Validate10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Wait10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.While10CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class OnAlarmOnAlarmCompartmentItemSemanticEditPolicy extends
		MappingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OnAlarmOnAlarmCompartmentItemSemanticEditPolicy() {
		super(MappingElementTypes.OnAlarm_3036);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MappingElementTypes.Assign_3037 == req.getElementType()) {
			return getGEFWrapper(new Assign5CreateCommand(req));
		}
		if (MappingElementTypes.Compensate_3038 == req.getElementType()) {
			return getGEFWrapper(new Compensate5CreateCommand(req));
		}
		if (MappingElementTypes.CompensateScope_3039 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope5CreateCommand(req));
		}
		if (MappingElementTypes.Empty_3040 == req.getElementType()) {
			return getGEFWrapper(new Empty5CreateCommand(req));
		}
		if (MappingElementTypes.Exit_3041 == req.getElementType()) {
			return getGEFWrapper(new Exit5CreateCommand(req));
		}
		if (MappingElementTypes.ExtensionActivity_3042 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity5CreateCommand(req));
		}
		if (MappingElementTypes.Flow_3043 == req.getElementType()) {
			return getGEFWrapper(new Flow3CreateCommand(req));
		}
		if (MappingElementTypes.ForEach_3115 == req.getElementType()) {
			return getGEFWrapper(new ForEach6CreateCommand(req));
		}
		if (MappingElementTypes.If_3224 == req.getElementType()) {
			return getGEFWrapper(new If8CreateCommand(req));
		}
		if (MappingElementTypes.Invoke_3225 == req.getElementType()) {
			return getGEFWrapper(new Invoke10CreateCommand(req));
		}
		if (MappingElementTypes.OpaqueActivity_3226 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity10CreateCommand(req));
		}
		if (MappingElementTypes.PartnerActivity_3227 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity10CreateCommand(req));
		}
		if (MappingElementTypes.Pick_3228 == req.getElementType()) {
			return getGEFWrapper(new Pick10CreateCommand(req));
		}
		if (MappingElementTypes.Receive_3229 == req.getElementType()) {
			return getGEFWrapper(new Receive10CreateCommand(req));
		}
		if (MappingElementTypes.RepeatUntil_3230 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil10CreateCommand(req));
		}
		if (MappingElementTypes.Reply_3231 == req.getElementType()) {
			return getGEFWrapper(new Reply10CreateCommand(req));
		}
		if (MappingElementTypes.Rethrow_3232 == req.getElementType()) {
			return getGEFWrapper(new Rethrow10CreateCommand(req));
		}
		if (MappingElementTypes.Scope_3233 == req.getElementType()) {
			return getGEFWrapper(new Scope10CreateCommand(req));
		}
		if (MappingElementTypes.Sequence_3234 == req.getElementType()) {
			return getGEFWrapper(new Sequence6CreateCommand(req));
		}
		if (MappingElementTypes.Throw_3235 == req.getElementType()) {
			return getGEFWrapper(new Throw10CreateCommand(req));
		}
		if (MappingElementTypes.Validate_3236 == req.getElementType()) {
			return getGEFWrapper(new Validate10CreateCommand(req));
		}
		if (MappingElementTypes.Wait_3237 == req.getElementType()) {
			return getGEFWrapper(new Wait10CreateCommand(req));
		}
		if (MappingElementTypes.While_3238 == req.getElementType()) {
			return getGEFWrapper(new While10CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
