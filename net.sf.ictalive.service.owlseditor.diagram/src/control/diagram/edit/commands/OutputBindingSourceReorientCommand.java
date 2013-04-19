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
import control.Parameter;
import control.ValueSpecifierElement;
import control.diagram.edit.policies.ControlBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class OutputBindingSourceReorientCommand extends EditElementCommand {

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
	public OutputBindingSourceReorientCommand(
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
		if (false == getElementToEdit() instanceof control.outputBindingSource) {
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
		ValueSpecifierElement target = getLink().getSpecifierElement();
		if (!(getLink().eContainer() instanceof OuterProcess)) {
			return false;
		}
		OuterProcess container = (OuterProcess) getLink().eContainer();
		return ControlBaseItemSemanticEditPolicy.LinkConstraints
				.canExistOutputBindingSource_4005(container, getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ValueSpecifierElement && newEnd instanceof ValueSpecifierElement)) {
			return false;
		}
		Parameter source = getLink().getSource();
		if (!(getLink().eContainer() instanceof OuterProcess)) {
			return false;
		}
		OuterProcess container = (OuterProcess) getLink().eContainer();
		return ControlBaseItemSemanticEditPolicy.LinkConstraints
				.canExistOutputBindingSource_4005(container, source,
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
		getLink().setSpecifierElement(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected control.outputBindingSource getLink() {
		return (control.outputBindingSource) getElementToEdit();
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
	protected ValueSpecifierElement getOldTarget() {
		return (ValueSpecifierElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ValueSpecifierElement getNewTarget() {
		return (ValueSpecifierElement) newEnd;
	}
}
