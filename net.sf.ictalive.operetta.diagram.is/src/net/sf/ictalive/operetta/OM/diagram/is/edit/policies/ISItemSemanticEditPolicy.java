package net.sf.ictalive.operetta.OM.diagram.is.edit.policies;

import net.sf.ictalive.operetta.OM.diagram.is.edit.commands.Scene2CreateCommand;
import net.sf.ictalive.operetta.OM.diagram.is.edit.commands.Scene3CreateCommand;
import net.sf.ictalive.operetta.OM.diagram.is.edit.commands.SceneCreateCommand;
import net.sf.ictalive.operetta.OM.diagram.is.edit.commands.Transition2CreateCommand;
import net.sf.ictalive.operetta.OM.diagram.is.edit.commands.Transition3CreateCommand;
import net.sf.ictalive.operetta.OM.diagram.is.edit.commands.TransitionCreateCommand;
import net.sf.ictalive.operetta.OM.diagram.is.providers.OperAElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ISItemSemanticEditPolicy extends OperABaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ISItemSemanticEditPolicy() {
		super(OperAElementTypes.IS_1100);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (OperAElementTypes.Scene_2101 == req.getElementType()) {
			return getGEFWrapper(new SceneCreateCommand(req));
		}
		if (OperAElementTypes.Scene_2102 == req.getElementType()) {
			return getGEFWrapper(new Scene2CreateCommand(req));
		}
		if (OperAElementTypes.Scene_2103 == req.getElementType()) {
			return getGEFWrapper(new Scene3CreateCommand(req));
		}
		if (OperAElementTypes.Transition_2104 == req.getElementType()) {
			return getGEFWrapper(new TransitionCreateCommand(req));
		}
		if (OperAElementTypes.Transition_2105 == req.getElementType()) {
			return getGEFWrapper(new Transition2CreateCommand(req));
		}
		if (OperAElementTypes.Transition_2106 == req.getElementType()) {
			return getGEFWrapper(new Transition3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
