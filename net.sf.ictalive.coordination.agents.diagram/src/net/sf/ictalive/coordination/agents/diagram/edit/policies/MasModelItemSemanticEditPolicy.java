package net.sf.ictalive.coordination.agents.diagram.edit.policies;

import net.sf.ictalive.coordination.agents.diagram.edit.commands.AgentCreateCommand;
import net.sf.ictalive.coordination.agents.diagram.edit.commands.AtomicActionCreateCommand;
import net.sf.ictalive.coordination.agents.diagram.edit.commands.CompositeActionCreateCommand;
import net.sf.ictalive.coordination.agents.diagram.edit.commands.RoleCreateCommand;
import net.sf.ictalive.coordination.agents.diagram.providers.CoordinationElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class MasModelItemSemanticEditPolicy extends
		CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MasModelItemSemanticEditPolicy() {
		super(CoordinationElementTypes.MasModel_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.Agent_2004 == req.getElementType()) {
			return getGEFWrapper(new AgentCreateCommand(req));
		}
		if (CoordinationElementTypes.Role_2005 == req.getElementType()) {
			return getGEFWrapper(new RoleCreateCommand(req));
		}
		if (CoordinationElementTypes.AtomicAction_2006 == req.getElementType()) {
			return getGEFWrapper(new AtomicActionCreateCommand(req));
		}
		if (CoordinationElementTypes.CompositeAction_2007 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeActionCreateCommand(req));
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
