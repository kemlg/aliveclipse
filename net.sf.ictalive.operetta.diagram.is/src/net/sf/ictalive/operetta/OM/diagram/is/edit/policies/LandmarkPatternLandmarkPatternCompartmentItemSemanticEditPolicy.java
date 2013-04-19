package net.sf.ictalive.operetta.OM.diagram.is.edit.policies;

import net.sf.ictalive.operetta.OM.diagram.is.edit.commands.LandmarkCreateCommand;
import net.sf.ictalive.operetta.OM.diagram.is.providers.OperAElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class LandmarkPatternLandmarkPatternCompartmentItemSemanticEditPolicy
		extends OperABaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LandmarkPatternLandmarkPatternCompartmentItemSemanticEditPolicy() {
		super(OperAElementTypes.LandmarkPattern_3101);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (OperAElementTypes.Landmark_3102 == req.getElementType()) {
			return getGEFWrapper(new LandmarkCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
