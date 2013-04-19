package net.sf.ictalive.operetta.OM.diagram.is.edit.policies;

import net.sf.ictalive.operetta.OM.diagram.is.edit.commands.LandmarkPatternCreateCommand;
import net.sf.ictalive.operetta.OM.diagram.is.providers.OperAElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class SceneSceneCompartmentItemSemanticEditPolicy extends
		OperABaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SceneSceneCompartmentItemSemanticEditPolicy() {
		super(OperAElementTypes.Scene_2101);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (OperAElementTypes.LandmarkPattern_3101 == req.getElementType()) {
			return getGEFWrapper(new LandmarkPatternCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
