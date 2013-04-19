package net.sf.ictalive.operetta.OM.diagram.is.edit.policies;

import net.sf.ictalive.operetta.OM.diagram.is.providers.OperAElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class SceneToTransitionArcItemSemanticEditPolicy extends
		OperABaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SceneToTransitionArcItemSemanticEditPolicy() {
		super(OperAElementTypes.SceneToTransitionArc_4102);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
