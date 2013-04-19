package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Assign11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Compensate11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.CompensateScope11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Empty11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Exit11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ExtensionActivity11CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Flow7CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ForEach9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.If6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Invoke9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.OpaqueActivity9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.PartnerActivity9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Pick9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Receive9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.RepeatUntil9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Reply9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Rethrow9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Scope9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Sequence5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Throw9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Validate9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Wait9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.While9CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ElseIfEliseIfCompartmentItemSemanticEditPolicy extends
		MappingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ElseIfEliseIfCompartmentItemSemanticEditPolicy() {
		super(MappingElementTypes.ElseIf_3162);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MappingElementTypes.Assign_3163 == req.getElementType()) {
			return getGEFWrapper(new Assign11CreateCommand(req));
		}
		if (MappingElementTypes.Compensate_3164 == req.getElementType()) {
			return getGEFWrapper(new Compensate11CreateCommand(req));
		}
		if (MappingElementTypes.CompensateScope_3165 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope11CreateCommand(req));
		}
		if (MappingElementTypes.Empty_3166 == req.getElementType()) {
			return getGEFWrapper(new Empty11CreateCommand(req));
		}
		if (MappingElementTypes.Exit_3167 == req.getElementType()) {
			return getGEFWrapper(new Exit11CreateCommand(req));
		}
		if (MappingElementTypes.ExtensionActivity_3168 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity11CreateCommand(req));
		}
		if (MappingElementTypes.Flow_3169 == req.getElementType()) {
			return getGEFWrapper(new Flow7CreateCommand(req));
		}
		if (MappingElementTypes.ForEach_3170 == req.getElementType()) {
			return getGEFWrapper(new ForEach9CreateCommand(req));
		}
		if (MappingElementTypes.If_3171 == req.getElementType()) {
			return getGEFWrapper(new If6CreateCommand(req));
		}
		if (MappingElementTypes.Invoke_3210 == req.getElementType()) {
			return getGEFWrapper(new Invoke9CreateCommand(req));
		}
		if (MappingElementTypes.OpaqueActivity_3211 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity9CreateCommand(req));
		}
		if (MappingElementTypes.PartnerActivity_3212 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity9CreateCommand(req));
		}
		if (MappingElementTypes.Pick_3213 == req.getElementType()) {
			return getGEFWrapper(new Pick9CreateCommand(req));
		}
		if (MappingElementTypes.Receive_3214 == req.getElementType()) {
			return getGEFWrapper(new Receive9CreateCommand(req));
		}
		if (MappingElementTypes.RepeatUntil_3215 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil9CreateCommand(req));
		}
		if (MappingElementTypes.Reply_3216 == req.getElementType()) {
			return getGEFWrapper(new Reply9CreateCommand(req));
		}
		if (MappingElementTypes.Rethrow_3217 == req.getElementType()) {
			return getGEFWrapper(new Rethrow9CreateCommand(req));
		}
		if (MappingElementTypes.Scope_3218 == req.getElementType()) {
			return getGEFWrapper(new Scope9CreateCommand(req));
		}
		if (MappingElementTypes.Sequence_3219 == req.getElementType()) {
			return getGEFWrapper(new Sequence5CreateCommand(req));
		}
		if (MappingElementTypes.Throw_3220 == req.getElementType()) {
			return getGEFWrapper(new Throw9CreateCommand(req));
		}
		if (MappingElementTypes.Validate_3221 == req.getElementType()) {
			return getGEFWrapper(new Validate9CreateCommand(req));
		}
		if (MappingElementTypes.Wait_3222 == req.getElementType()) {
			return getGEFWrapper(new Wait9CreateCommand(req));
		}
		if (MappingElementTypes.While_3223 == req.getElementType()) {
			return getGEFWrapper(new While9CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
