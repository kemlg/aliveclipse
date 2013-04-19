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

import control.Input;
import control.InputBinding;
import control.OuterProcess;
import control.Parameter;
import control.diagram.edit.policies.ControlBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class InputBindingReorientCommand extends EditElementCommand {

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
	public InputBindingReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof InputBinding) {
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
		if (!(oldEnd instanceof Parameter && newEnd instanceof Parameter)) {
			return false;
		}
		Input target = getLink().getToParam();
		if (!(getLink().eContainer() instanceof OuterProcess)) {
			return false;
		}
		OuterProcess container = (OuterProcess) getLink().eContainer();
		return ControlBaseItemSemanticEditPolicy.LinkConstraints
				.canExistInputBinding_4002(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Input && newEnd instanceof Input)) {
			return false;
		}
		Parameter source = getLink().getValueSource();
		if (!(getLink().eContainer() instanceof OuterProcess)) {
			return false;
		}
		OuterProcess container = (OuterProcess) getLink().eContainer();
		return ControlBaseItemSemanticEditPolicy.LinkConstraints
				.canExistInputBinding_4002(container, source, getNewTarget());
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
		getLink().setValueSource(getNewSource());
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
	protected InputBinding getLink() {
		return (InputBinding) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Parameter getOldSource() {
		return (Parameter) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Parameter getNewSource() {
		return (Parameter) newEnd;
	}

	/**
	 * @generated
	 */
	protected Input getOldTarget() {
		return (Input) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Input getNewTarget() {
		return (Input) newEnd;
	}
}
