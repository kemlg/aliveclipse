package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.OnAlarm2CreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands.OnEventCreateCommand;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class EventHandlerEventHandlerCompartment2ItemSemanticEditPolicy extends
		MappingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EventHandlerEventHandlerCompartment2ItemSemanticEditPolicy() {
		super(MappingElementTypes.EventHandler_3295);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MappingElementTypes.OnAlarm_3114 == req.getElementType()) {
			return getGEFWrapper(new OnAlarm2CreateCommand(req));
		}
		if (MappingElementTypes.OnEvent_3239 == req.getElementType()) {
			return getGEFWrapper(new OnEventCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
