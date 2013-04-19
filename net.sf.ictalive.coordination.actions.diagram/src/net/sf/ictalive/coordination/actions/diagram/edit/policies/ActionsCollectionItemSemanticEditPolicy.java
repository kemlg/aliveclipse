package net.sf.ictalive.coordination.actions.diagram.edit.policies;

import net.sf.ictalive.coordination.actions.diagram.edit.commands.AnyOrderCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.AtomicActionCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.ChoiceCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.CompositeActionCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.ControlConstructBagCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.ControlConstructListCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.IfThenElseCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.InputBindingCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.InputCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.OutputCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.ParticipantCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.PerformCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.RepeatUntilCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.RepeatWhileCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.SequenceCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.SplitCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.edit.commands.SplitJoinCreateCommand;
import net.sf.ictalive.coordination.actions.diagram.providers.CoordinationElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ActionsCollectionItemSemanticEditPolicy extends
		CoordinationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActionsCollectionItemSemanticEditPolicy() {
		super(CoordinationElementTypes.ActionsCollection_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoordinationElementTypes.CompositeAction_2024 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeActionCreateCommand(req));
		}
		if (CoordinationElementTypes.AtomicAction_2025 == req.getElementType()) {
			return getGEFWrapper(new AtomicActionCreateCommand(req));
		}
		if (CoordinationElementTypes.Input_2026 == req.getElementType()) {
			return getGEFWrapper(new InputCreateCommand(req));
		}
		if (CoordinationElementTypes.Output_2027 == req.getElementType()) {
			return getGEFWrapper(new OutputCreateCommand(req));
		}
		if (CoordinationElementTypes.Participant_2028 == req.getElementType()) {
			return getGEFWrapper(new ParticipantCreateCommand(req));
		}
		if (CoordinationElementTypes.Sequence_2029 == req.getElementType()) {
			return getGEFWrapper(new SequenceCreateCommand(req));
		}
		if (CoordinationElementTypes.AnyOrder_2030 == req.getElementType()) {
			return getGEFWrapper(new AnyOrderCreateCommand(req));
		}
		if (CoordinationElementTypes.ControlConstructBag_2031 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructBagCreateCommand(req));
		}
		if (CoordinationElementTypes.Perform_2032 == req.getElementType()) {
			return getGEFWrapper(new PerformCreateCommand(req));
		}
		if (CoordinationElementTypes.Choice_2033 == req.getElementType()) {
			return getGEFWrapper(new ChoiceCreateCommand(req));
		}
		if (CoordinationElementTypes.ControlConstructList_2034 == req
				.getElementType()) {
			return getGEFWrapper(new ControlConstructListCreateCommand(req));
		}
		if (CoordinationElementTypes.RepeatUntil_2035 == req.getElementType()) {
			return getGEFWrapper(new RepeatUntilCreateCommand(req));
		}
		if (CoordinationElementTypes.RepeatWhile_2036 == req.getElementType()) {
			return getGEFWrapper(new RepeatWhileCreateCommand(req));
		}
		if (CoordinationElementTypes.IfThenElse_2037 == req.getElementType()) {
			return getGEFWrapper(new IfThenElseCreateCommand(req));
		}
		if (CoordinationElementTypes.InputBinding_2038 == req.getElementType()) {
			return getGEFWrapper(new InputBindingCreateCommand(req));
		}
		if (CoordinationElementTypes.Split_2039 == req.getElementType()) {
			return getGEFWrapper(new SplitCreateCommand(req));
		}
		if (CoordinationElementTypes.SplitJoin_2040 == req.getElementType()) {
			return getGEFWrapper(new SplitJoinCreateCommand(req));
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
