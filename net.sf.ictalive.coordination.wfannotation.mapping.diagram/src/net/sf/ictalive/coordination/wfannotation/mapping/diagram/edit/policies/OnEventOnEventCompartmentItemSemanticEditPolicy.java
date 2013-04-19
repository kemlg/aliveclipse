package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Assign13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Compensate13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.CompensateScope13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Empty13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Exit13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ExtensionActivity13CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Flow9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ForEach11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.If9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Invoke11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.OpaqueActivity11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.PartnerActivity11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Pick11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Receive11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.RepeatUntil11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Reply11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Rethrow11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Scope11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Sequence7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Throw11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Validate11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Wait11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.While11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class OnEventOnEventCompartmentItemSemanticEditPolicy extends
		MappingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OnEventOnEventCompartmentItemSemanticEditPolicy() {
		super(MappingElementTypes.OnEvent_3239);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MappingElementTypes.Assign_3240 == req.getElementType()) {
			return getGEFWrapper(new Assign13CreateCommand(req));
		}
		if (MappingElementTypes.Compensate_3241 == req.getElementType()) {
			return getGEFWrapper(new Compensate13CreateCommand(req));
		}
		if (MappingElementTypes.CompensateScope_3242 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope13CreateCommand(req));
		}
		if (MappingElementTypes.Empty_3243 == req.getElementType()) {
			return getGEFWrapper(new Empty13CreateCommand(req));
		}
		if (MappingElementTypes.Exit_3244 == req.getElementType()) {
			return getGEFWrapper(new Exit13CreateCommand(req));
		}
		if (MappingElementTypes.ExtensionActivity_3245 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity13CreateCommand(req));
		}
		if (MappingElementTypes.Flow_3246 == req.getElementType()) {
			return getGEFWrapper(new Flow9CreateCommand(req));
		}
		if (MappingElementTypes.ForEach_3247 == req.getElementType()) {
			return getGEFWrapper(new ForEach11CreateCommand(req));
		}
		if (MappingElementTypes.If_3248 == req.getElementType()) {
			return getGEFWrapper(new If9CreateCommand(req));
		}
		if (MappingElementTypes.Invoke_3249 == req.getElementType()) {
			return getGEFWrapper(new Invoke11CreateCommand(req));
		}
		if (MappingElementTypes.OpaqueActivity_3250 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity11CreateCommand(req));
		}
		if (MappingElementTypes.PartnerActivity_3251 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity11CreateCommand(req));
		}
		if (MappingElementTypes.Pick_3252 == req.getElementType()) {
			return getGEFWrapper(new Pick11CreateCommand(req));
		}
		if (MappingElementTypes.Receive_3253 == req.getElementType()) {
			return getGEFWrapper(new Receive11CreateCommand(req));
		}
		if (MappingElementTypes.RepeatUntil_3254 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil11CreateCommand(req));
		}
		if (MappingElementTypes.Reply_3255 == req.getElementType()) {
			return getGEFWrapper(new Reply11CreateCommand(req));
		}
		if (MappingElementTypes.Rethrow_3256 == req.getElementType()) {
			return getGEFWrapper(new Rethrow11CreateCommand(req));
		}
		if (MappingElementTypes.Scope_3257 == req.getElementType()) {
			return getGEFWrapper(new Scope11CreateCommand(req));
		}
		if (MappingElementTypes.Sequence_3258 == req.getElementType()) {
			return getGEFWrapper(new Sequence7CreateCommand(req));
		}
		if (MappingElementTypes.Throw_3259 == req.getElementType()) {
			return getGEFWrapper(new Throw11CreateCommand(req));
		}
		if (MappingElementTypes.Validate_3260 == req.getElementType()) {
			return getGEFWrapper(new Validate11CreateCommand(req));
		}
		if (MappingElementTypes.Wait_3261 == req.getElementType()) {
			return getGEFWrapper(new Wait11CreateCommand(req));
		}
		if (MappingElementTypes.While_3262 == req.getElementType()) {
			return getGEFWrapper(new While11CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
