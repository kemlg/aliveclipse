package net.sf.ictalive.coordination.plans.diagram.edit.policies;

import net.sf.ictalive.coordination.plans.diagram.edit.commands.ActionGroundingListCreateCommand;
import net.sf.ictalive.coordination.plans.diagram.edit.commands.AtomicActionCreateCommand;
import net.sf.ictalive.coordination.plans.diagram.edit.commands.CompositeActionCreateCommand;
import net.sf.ictalive.coordination.plans.diagram.edit.commands.InputCreateCommand;
import net.sf.ictalive.coordination.plans.diagram.edit.commands.OutputCreateCommand;
import net.sf.ictalive.coordination.plans.diagram.edit.commands.PlanCreateCommand;
import net.sf.ictalive.coordination.plans.diagram.edit.commands.TaskCreateCommand;
import net.sf.ictalive.coordination.plans.diagram.providers.CoordinationElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class PlansCollectionItemSemanticEditPolicy extends
		CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PlansCollectionItemSemanticEditPolicy() {
		super(CoordinationElementTypes.PlansCollection_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.Plan_2009 == req.getElementType()) {
			return getGEFWrapper(new PlanCreateCommand(req));
		}
		if (CoordinationElementTypes.Task_2010 == req.getElementType()) {
			return getGEFWrapper(new TaskCreateCommand(req));
		}
		if (CoordinationElementTypes.ActionGroundingList_2011 == req
				.getElementType()) {
			return getGEFWrapper(new ActionGroundingListCreateCommand(req));
		}
		if (CoordinationElementTypes.AtomicAction_2012 == req.getElementType()) {
			return getGEFWrapper(new AtomicActionCreateCommand(req));
		}
		if (CoordinationElementTypes.CompositeAction_2013 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeActionCreateCommand(req));
		}
		if (CoordinationElementTypes.Input_2014 == req.getElementType()) {
			return getGEFWrapper(new InputCreateCommand(req));
		}
		if (CoordinationElementTypes.Output_2015 == req.getElementType()) {
			return getGEFWrapper(new OutputCreateCommand(req));
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
