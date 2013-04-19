package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies;

import net.sf.ictalive.coordination.wfannotation.mapping.diagram.providers.MappingElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ScopeToCompositeActionMappingItemSemanticEditPolicy extends
		MappingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ScopeToCompositeActionMappingItemSemanticEditPolicy() {
		super(MappingElementTypes.ScopeToCompositeActionMapping_4022);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
