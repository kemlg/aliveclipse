package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class PerformProcessItemSemanticEditPolicy extends
		MappingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PerformProcessItemSemanticEditPolicy() {
		super(MappingElementTypes.PerformProcess_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
