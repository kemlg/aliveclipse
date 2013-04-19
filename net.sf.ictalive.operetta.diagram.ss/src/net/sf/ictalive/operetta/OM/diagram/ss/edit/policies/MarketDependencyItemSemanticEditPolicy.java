package net.sf.ictalive.operetta.OM.diagram.ss.edit.policies;

import net.sf.ictalive.operetta.OM.diagram.ss.providers.OperAElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class MarketDependencyItemSemanticEditPolicy extends
		OperABaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MarketDependencyItemSemanticEditPolicy() {
		super(OperAElementTypes.MarketDependency_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
