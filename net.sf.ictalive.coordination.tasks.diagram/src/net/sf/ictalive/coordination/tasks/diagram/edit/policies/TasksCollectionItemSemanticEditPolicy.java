package net.sf.ictalive.coordination.tasks.diagram.edit.policies;

import net.sf.ictalive.coordination.tasks.diagram.edit.commands.AnyOrderCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.AtomicActionCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.ChoiceCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.CompositeActionCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.ControlConstructBagCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.ControlConstructListCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.InputCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.OutputCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.PerformCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.SequenceCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.edit.commands.TaskCreateCommand;
import net.sf.ictalive.coordination.tasks.diagram.providers.CoordinationElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class TasksCollectionItemSemanticEditPolicy extends
		CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TasksCollectionItemSemanticEditPolicy() {
		super(CoordinationElementTypes.TasksCollection_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.CompositeAction_2020 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeActionCreateCommand(req));
		}
		if (CoordinationElementTypes.Task_2021 == req.getElementType()) {
			return getGEFWrapper(new TaskCreateCommand(req));
		}
		if (CoordinationElementTypes.AtomicAction_2022 == req.getElementType()) {
			return getGEFWrapper(new AtomicActionCreateCommand(req));
		}
		if (CoordinationElementTypes.Input_2023 == req.getElementType()) {
			return getGEFWrapper(new InputCreateCommand(req));
		}
		if (CoordinationElementTypes.Output_2024 == req.getElementType()) {
			return getGEFWrapper(new OutputCreateCommand(req));
		}
		if (CoordinationElementTypes.Sequence_2025 == req.getElementType()) {
			return getGEFWrapper(new SequenceCreateCommand(req));
		}
		if (CoordinationElementTypes.AnyOrder_2026 == req.getElementType()) {
			return getGEFWrapper(new AnyOrderCreateCommand(req));
		}
		if (CoordinationElementTypes.ControlConstructBag_2027 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructBagCreateCommand(req));
		}
		if (CoordinationElementTypes.Perform_2028 == req.getElementType()) {
			return getGEFWrapper(new PerformCreateCommand(req));
		}
		if (CoordinationElementTypes.Choice_2029 == req.getElementType()) {
			return getGEFWrapper(new ChoiceCreateCommand(req));
		}
		if (CoordinationElementTypes.ControlConstructList_2030 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructListCreateCommand(req));
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
