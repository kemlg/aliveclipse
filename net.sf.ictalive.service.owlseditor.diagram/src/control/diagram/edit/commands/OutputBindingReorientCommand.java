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

import control.OuterProcess;
import control.Output;
import control.OutputBinding;
import control.ValueSpecifier;
import control.diagram.edit.policies.ControlBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class OutputBindingReorientCommand extends EditElementCommand {

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
	public OutputBindingReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof OutputBinding) {
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
		Output target = getLink().getToParam();
		if (!(getLink().eContainer() instanceof OuterProcess)) {
			return false;
		}
		OuterProcess container = (OuterProcess) getLink().eContainer();
		return ControlBaseItemSemanticEditPolicy.LinkConstraints
				.canExistOutputBinding_4003(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Output && newEnd instanceof Output)) {
			return false;
		}
		ValueSpecifier source = getLink().getOrigin();
		if (!(getLink().eContainer() instanceof OuterProcess)) {
			return false;
		}
		OuterProcess container = (OuterProcess) getLink().eContainer();
		return ControlBaseItemSemanticEditPolicy.LinkConstraints
				.canExistOutputBinding_4003(container, source, getNewTarget());
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
		getLink().setToParam(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected OutputBinding getLink() {
		return (OutputBinding) getElementToEdit();
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
	protected Output getOldTarget() {
		return (Output) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Output getNewTarget() {
		return (Output) newEnd;
	}
}
