package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.RemoteProcessCreateCommand;
import control.diagram.edit.commands.TemplateProcessCreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class PerformPerformTheProcessCompartment7ItemSemanticEditPolicy extends
		ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PerformPerformTheProcessCompartment7ItemSemanticEditPolicy() {
		super(ControlElementTypes.Perform_2012);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.RemoteProcess_3104 == req.getElementType()) {
			return getGEFWrapper(new RemoteProcessCreateCommand(req));
		}
		if (ControlElementTypes.TemplateProcess_3110 == req.getElementType()) {
			return getGEFWrapper(new TemplateProcessCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
