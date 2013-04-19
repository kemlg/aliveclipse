/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.ValueForm2CreateCommand;
import control.diagram.edit.commands.ValueFormCreateCommand;
import control.diagram.edit.commands.ValueFunction2CreateCommand;
import control.diagram.edit.commands.ValueFunctionCreateCommand;
import control.diagram.edit.commands.ValueSource2CreateCommand;
import control.diagram.edit.commands.ValueSourceCreateCommand;
import control.diagram.providers.ControlElementTypes;

/**
 * @generated
 */
public class ProduceProduceProducedBindingValueSpecifierCompartment6ItemSemanticEditPolicy
		extends ControlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProduceProduceProducedBindingValueSpecifierCompartment6ItemSemanticEditPolicy() {
		super(ControlElementTypes.Produce_3090);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlElementTypes.ValueSource_3044 == req.getElementType()) {
			return getGEFWrapper(new ValueSource2CreateCommand(req));
		}
		if (ControlElementTypes.ValueForm_3045 == req.getElementType()) {
			return getGEFWrapper(new ValueForm2CreateCommand(req));
		}
		if (ControlElementTypes.ValueFunction_3046 == req.getElementType()) {
			return getGEFWrapper(new ValueFunction2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
