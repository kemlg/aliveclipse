package net.sf.ictalive.coordination.wfvv.diagram.edit.policies;

import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ActionEnactment2CreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ActionGroundingListCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ActorCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.AgentCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.AtomicActionCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.CompositeActionCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.EnactmentCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.Event2CreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.EventCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.EventGroup2CreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.EventGroupCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ObjectiveCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.PlanCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.PlanEnactmentCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ResourceCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.edit.commands.ServiceCreateCommand;
import net.sf.ictalive.coordination.wfvv.diagram.providers.WfvvElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class EventModelContainerItemSemanticEditPolicy extends
		WfvvBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EventModelContainerItemSemanticEditPolicy() {
		super(WfvvElementTypes.EventModelContainer_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WfvvElementTypes.Event_2023 == req.getElementType()) {
			return getGEFWrapper(new EventCreateCommand(req));
		}
		if (WfvvElementTypes.Event_2024 == req.getElementType()) {
			return getGEFWrapper(new Event2CreateCommand(req));
		}
		if (WfvvElementTypes.ActionEnactment_2020 == req.getElementType()) {
			return getGEFWrapper(new ActionEnactment2CreateCommand(req));
		}
		if (WfvvElementTypes.PlanEnactment_2021 == req.getElementType()) {
			return getGEFWrapper(new PlanEnactmentCreateCommand(req));
		}
		if (WfvvElementTypes.Enactment_2025 == req.getElementType()) {
			return getGEFWrapper(new EnactmentCreateCommand(req));
		}
		if (WfvvElementTypes.Plan_2014 == req.getElementType()) {
			return getGEFWrapper(new PlanCreateCommand(req));
		}
		if (WfvvElementTypes.Agent_2015 == req.getElementType()) {
			return getGEFWrapper(new AgentCreateCommand(req));
		}
		if (WfvvElementTypes.Actor_2026 == req.getElementType()) {
			return getGEFWrapper(new ActorCreateCommand(req));
		}
		if (WfvvElementTypes.Service_2016 == req.getElementType()) {
			return getGEFWrapper(new ServiceCreateCommand(req));
		}
		if (WfvvElementTypes.Objective_2017 == req.getElementType()) {
			return getGEFWrapper(new ObjectiveCreateCommand(req));
		}
		if (WfvvElementTypes.Resource_2027 == req.getElementType()) {
			return getGEFWrapper(new ResourceCreateCommand(req));
		}
		if (WfvvElementTypes.AtomicAction_2018 == req.getElementType()) {
			return getGEFWrapper(new AtomicActionCreateCommand(req));
		}
		if (WfvvElementTypes.CompositeAction_2019 == req.getElementType()) {
			return getGEFWrapper(new CompositeActionCreateCommand(req));
		}
		if (WfvvElementTypes.EventGroup_2028 == req.getElementType()) {
			return getGEFWrapper(new EventGroupCreateCommand(req));
		}
		if (WfvvElementTypes.EventGroup_2029 == req.getElementType()) {
			return getGEFWrapper(new EventGroup2CreateCommand(req));
		}
		if (WfvvElementTypes.ActionGroundingList_2022 == req.getElementType()) {
			return getGEFWrapper(new ActionGroundingListCreateCommand(req));
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
