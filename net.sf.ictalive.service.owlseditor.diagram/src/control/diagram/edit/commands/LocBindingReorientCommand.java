/*
 * 
 */
package control.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import control.Loc;
import control.LocBinding;
import control.OuterProcess;
import control.ValueSpecifier;
import control.diagram.edit.policies.ControlBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class LocBindingReorientCommand extends EditElementCommand {

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
	public LocBindingReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof LocBinding) {
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
		if (!(oldEnd instanceof ValueSpecifier && newEnd instanceof ValueSpecifier)) {
			return false;
		}
		Loc target = getLink().getToLoc();
		if (!(getLink().eContainer() instanceof OuterProcess)) {
			return false;
		}
		OuterProcess container = (OuterProcess) getLink().eContainer();
		return ControlBaseItemSemanticEditPolicy.LinkConstraints
				.canExistLocBinding_4001(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Loc && newEnd instanceof Loc)) {
			return false;
		}
		ValueSpecifier source = getLink().getOrigin();
		if (!(getLink().eContainer() instanceof OuterProcess)) {
			return false;
		}
		OuterProcess container = (OuterProcess) getLink().eContainer();
		return ControlBaseItemSemanticEditPolicy.LinkConstraints
				.canExistLocBinding_4001(container, source, getNewTarget());
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
		getLink().setOrigin(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setToLoc(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected LocBinding getLink() {
		return (LocBinding) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ValueSpecifier getOldSource() {
		return (ValueSpecifier) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ValueSpecifier getNewSource() {
		return (ValueSpecifier) newEnd;
	}

	/**
	 * @generated
	 */
	protected Loc getOldTarget() {
		return (Loc) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Loc getNewTarget() {
		return (Loc) newEnd;
	}
}
