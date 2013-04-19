package net.sf.ictalive.operetta.OM.diagram.is.edit.commands;

import net.sf.ictalive.operetta.OM.Scene;
import net.sf.ictalive.operetta.OM.Transition;
import net.sf.ictalive.operetta.OM.TransitionToSceneArc;
import net.sf.ictalive.operetta.OM.diagram.is.edit.policies.OperABaseItemSemanticEditPolicy;

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
public class TransitionToSceneArcReorientCommand extends EditElementCommand {

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
	public TransitionToSceneArcReorientCommand(
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
		if (false == getElementToEdit() instanceof TransitionToSceneArc) {
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
		if (!(oldEnd instanceof Transition && newEnd instanceof Transition)) {
			return false;
		}
		Scene target = getLink().getTo();
		if (!(getLink().eContainer() instanceof net.sf.ictalive.operetta.OM.IS)) {
			return false;
		}
		net.sf.ictalive.operetta.OM.IS container = (net.sf.ictalive.operetta.OM.IS) getLink()
				.eContainer();
		return OperABaseItemSemanticEditPolicy.LinkConstraints
				.canExistTransitionToSceneArc_4101(container, getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Scene && newEnd instanceof Scene)) {
			return false;
		}
		Transition source = getLink().getFrom();
		if (!(getLink().eContainer() instanceof net.sf.ictalive.operetta.OM.IS)) {
			return false;
		}
		net.sf.ictalive.operetta.OM.IS container = (net.sf.ictalive.operetta.OM.IS) getLink()
				.eContainer();
		return OperABaseItemSemanticEditPolicy.LinkConstraints
				.canExistTransitionToSceneArc_4101(container, source,
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
		getLink().setFrom(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTo(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected TransitionToSceneArc getLink() {
		return (TransitionToSceneArc) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Transition getOldSource() {
		return (Transition) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Transition getNewSource() {
		return (Transition) newEnd;
	}

	/**
	 * @generated
	 */
	protected Scene getOldTarget() {
		return (Scene) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Scene getNewTarget() {
		return (Scene) newEnd;
	}
}
