package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Assign4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Compensate4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.CompensateScope4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ElseCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ElseIfCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Empty4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Exit4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ExtensionActivity4CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.ForEach3CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.If2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Invoke2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.OpaqueActivity2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.PartnerActivity2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Pick2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Receive5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.RepeatUntil5CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Reply6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Rethrow6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Scope6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Throw6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Validate6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.Wait6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.While6CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class IfIfCompartment11ItemSemanticEditPolicy extends
		MappingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IfIfCompartment11ItemSemanticEditPolicy() {
		super(MappingElementTypes.If_3280);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MappingElementTypes.Assign_3024 == req.getElementType()) {
			return getGEFWrapper(new Assign4CreateCommand(req));
		}
		if (MappingElementTypes.Compensate_3025 == req.getElementType()) {
			return getGEFWrapper(new Compensate4CreateCommand(req));
		}
		if (MappingElementTypes.CompensateScope_3026 == req.getElementType()) {
			return getGEFWrapper(new CompensateScope4CreateCommand(req));
		}
		if (MappingElementTypes.Empty_3027 == req.getElementType()) {
			return getGEFWrapper(new Empty4CreateCommand(req));
		}
		if (MappingElementTypes.Exit_3028 == req.getElementType()) {
			return getGEFWrapper(new Exit4CreateCommand(req));
		}
		if (MappingElementTypes.ExtensionActivity_3029 == req.getElementType()) {
			return getGEFWrapper(new ExtensionActivity4CreateCommand(req));
		}
		if (MappingElementTypes.If_3030 == req.getElementType()) {
			return getGEFWrapper(new If2CreateCommand(req));
		}
		if (MappingElementTypes.ForEach_3031 == req.getElementType()) {
			return getGEFWrapper(new ForEach3CreateCommand(req));
		}
		if (MappingElementTypes.Invoke_3045 == req.getElementType()) {
			return getGEFWrapper(new Invoke2CreateCommand(req));
		}
		if (MappingElementTypes.OpaqueActivity_3046 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActivity2CreateCommand(req));
		}
		if (MappingElementTypes.PartnerActivity_3047 == req.getElementType()) {
			return getGEFWrapper(new PartnerActivity2CreateCommand(req));
		}
		if (MappingElementTypes.Pick_3048 == req.getElementType()) {
			return getGEFWrapper(new Pick2CreateCommand(req));
		}
		if (MappingElementTypes.Receive_3122 == req.getElementType()) {
			return getGEFWrapper(new Receive5CreateCommand(req));
		}
		if (MappingElementTypes.RepeatUntil_3123 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntil5CreateCommand(req));
		}
		if (MappingElementTypes.Reply_3155 == req.getElementType()) {
			return getGEFWrapper(new Reply6CreateCommand(req));
		}
		if (MappingElementTypes.Rethrow_3156 == req.getElementType()) {
			return getGEFWrapper(new Rethrow6CreateCommand(req));
		}
		if (MappingElementTypes.Scope_3157 == req.getElementType()) {
			return getGEFWrapper(new Scope6CreateCommand(req));
		}
		if (MappingElementTypes.Throw_3158 == req.getElementType()) {
			return getGEFWrapper(new Throw6CreateCommand(req));
		}
		if (MappingElementTypes.Validate_3159 == req.getElementType()) {
			return getGEFWrapper(new Validate6CreateCommand(req));
		}
		if (MappingElementTypes.Wait_3160 == req.getElementType()) {
			return getGEFWrapper(new Wait6CreateCommand(req));
		}
		if (MappingElementTypes.While_3161 == req.getElementType()) {
			return getGEFWrapper(new While6CreateCommand(req));
		}
		if (MappingElementTypes.ElseIf_3162 == req.getElementType()) {
			return getGEFWrapper(new ElseIfCreateCommand(req));
		}
		if (MappingElementTypes.Else_3172 == req.getElementType()) {
			return getGEFWrapper(new ElseCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
