package net.sf.ictalive.operetta.OM.diagram.is.edit.commands;

import net.sf.ictalive.operetta.OM.Landmark;
import net.sf.ictalive.operetta.OM.LandmarkPattern;
import net.sf.ictalive.operetta.OM.PartialOrder;
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
public class PartialOrderReorientCommand extends EditElementCommand {

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
	public PartialOrderReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof PartialOrder) {
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
		if (!(oldEnd instanceof Landmark && newEnd instanceof Landmark)) {
			return false;
		}
		Landmark target = getLink().getTo();
		if (!(getLink().eContainer() instanceof LandmarkPattern)) {
			return false;
		}
		LandmarkPattern container = (LandmarkPattern) getLink().eContainer();
		return OperABaseItemSemanticEditPolicy.LinkConstraints
				.canExistPartialOrder_4103(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Landmark && newEnd instanceof Landmark)) {
			return false;
		}
		Landmark source = getLink().getFrom();
		if (!(getLink().eContainer() instanceof LandmarkPattern)) {
			return false;
		}
		LandmarkPattern container = (LandmarkPattern) getLink().eContainer();
		return OperABaseItemSemanticEditPolicy.LinkConstraints
				.canExistPartialOrder_4103(container, source, getNewTarget());
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
	protected PartialOrder getLink() {
		return (PartialOrder) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Landmark getOldSource() {
		return (Landmark) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Landmark getNewSource() {
		return (Landmark) newEnd;
	}

	/**
	 * @generated
	 */
	protected Landmark getOldTarget() {
		return (Landmark) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Landmark getNewTarget() {
		return (Landmark) newEnd;
	}
}
