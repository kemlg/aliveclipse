package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.OnAlarmCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.OnMessageCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class PickPickCompartment7ItemSemanticEditPolicy extends
		MappingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PickPickCompartment7ItemSemanticEditPolicy() {
		super(MappingElementTypes.Pick_3185);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MappingElementTypes.OnAlarm_3036 == req.getElementType()) {
			return getGEFWrapper(new OnAlarmCreateCommand(req));
		}
		if (MappingElementTypes.OnMessage_3049 == req.getElementType()) {
			return getGEFWrapper(new OnMessageCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
