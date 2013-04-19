package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands;

import net.sf.ictalive.coordination.wfannotation.mapping.MappingContainer;
import net.sf.ictalive.coordination.wfannotation.mapping.WhileToRepeatWhileMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies.MappingBaseItemSemanticEditPolicy;
import net.sf.ictalive.owls.process.RepeatWhile;

import org.eclipse.bpel.model.While;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class WhileToRepeatWhileMappingReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public WhileToRepeatWhileMappingReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof WhileToRepeatWhileMapping) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof While && newEnd instanceof While)) {
			return false;
		}
		RepeatWhile target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof MappingContainer)) {
			return false;
		}
		MappingContainer container = (MappingContainer) getLink().eContainer();
		return MappingBaseItemSemanticEditPolicy.LinkConstraints
				.canExistWhileToRepeatWhileMapping_4018(container,
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof RepeatWhile && newEnd instanceof RepeatWhile)) {
			return false;
		}
		While source = getLink().getSource();
		if (!(getLink().eContainer() instanceof MappingContainer)) {
			return false;
		}
		MappingContainer container = (MappingContainer) getLink().eContainer();
		return MappingBaseItemSemanticEditPolicy.LinkConstraints
				.canExistWhileToRepeatWhileMapping_4018(container, source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected WhileToRepeatWhileMapping getLink() {
		return (WhileToRepeatWhileMapping) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected While getOldSource() {
		return (While) oldEnd;
	}

	/**
	 * @generated
	 */
	protected While getNewSource() {
		return (While) newEnd;
	}

	/**
	 * @generated
	 */
	protected RepeatWhile getOldTarget() {
		return (RepeatWhile) oldEnd;
	}

	/**
	 * @generated
	 */
	protected RepeatWhile getNewTarget() {
		return (RepeatWhile) newEnd;
	}
}
