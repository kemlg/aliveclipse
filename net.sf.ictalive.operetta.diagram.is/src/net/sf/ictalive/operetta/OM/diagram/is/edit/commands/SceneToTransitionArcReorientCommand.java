package net.sf.ictalive.operetta.OM.diagram.is.edit.commands;

import net.sf.ictalive.operetta.OM.Scene;
import net.sf.ictalive.operetta.OM.SceneToTransitionArc;
import net.sf.ictalive.operetta.OM.Transition;
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
public class SceneToTransitionArcReorientCommand extends EditElementCommand {

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
	public SceneToTransitionArcReorientCommand(
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
		if (false == getElementToEdit() instanceof SceneToTransitionArc) {
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
		if (!(oldEnd instanceof Scene && newEnd instanceof Scene)) {
			return false;
		}
		Transition target = getLink().getTo();
		if (!(getLink().eContainer() instanceof net.sf.ictalive.operetta.OM.IS)) {
			return false;
		}
		net.sf.ictalive.operetta.OM.IS container = (net.sf.ictalive.operetta.OM.IS) getLink()
				.eContainer();
		return OperABaseItemSemanticEditPolicy.LinkConstraints
				.canExistSceneToTransitionArc_4102(container, getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Transition && newEnd instanceof Transition)) {
			return false;
		}
		Scene source = getLink().getFrom();
		if (!(getLink().eContainer() instanceof net.sf.ictalive.operetta.OM.IS)) {
			return false;
		}
		net.sf.ictalive.operetta.OM.IS container = (net.sf.ictalive.operetta.OM.IS) getLink()
				.eContainer();
		return OperABaseItemSemanticEditPolicy.LinkConstraints
				.canExistSceneToTransitionArc_4102(container, source,
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
	protected SceneToTransitionArc getLink() {
		return (SceneToTransitionArc) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Scene getOldSource() {
		return (Scene) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Scene getNewSource() {
		return (Scene) newEnd;
	}

	/**
	 * @generated
	 */
	protected Transition getOldTarget() {
		return (Transition) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Transition getNewTarget() {
		return (Transition) newEnd;
	}
}
