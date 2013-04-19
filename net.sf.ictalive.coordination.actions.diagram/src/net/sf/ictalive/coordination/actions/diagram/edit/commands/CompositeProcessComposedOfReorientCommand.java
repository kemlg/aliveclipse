package net.sf.ictalive.coordination.actions.diagram.edit.commands;

import net.sf.ictalive.coordination.actions.diagram.edit.policies.CoordinationBaseItemSemanticEditPolicy;
import net.sf.ictalive.owls.process.CompositeProcess;
import net.sf.ictalive.owls.process.ControlConstruct;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class CompositeProcessComposedOfReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

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
	public CompositeProcessComposedOfReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof CompositeProcess) {
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
		if (!(oldEnd instanceof ControlConstruct && newEnd instanceof CompositeProcess)) {
			return false;
		}
		return CoordinationBaseItemSemanticEditPolicy.LinkConstraints
				.canExistCompositeProcessComposedOf_4029(getNewSource(),
						getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ControlConstruct && newEnd instanceof ControlConstruct)) {
			return false;
		}
		return CoordinationBaseItemSemanticEditPolicy.LinkConstraints
				.canExistCompositeProcessComposedOf_4029(getOldSource(),
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
		getOldSource().setComposedOf(null);
		getNewSource().setComposedOf(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setComposedOf(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CompositeProcess getOldSource() {
		return (CompositeProcess) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected CompositeProcess getNewSource() {
		return (CompositeProcess) newEnd;
	}

	/**
	 * @generated
	 */
	protected ControlConstruct getOldTarget() {
		return (ControlConstruct) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ControlConstruct getNewTarget() {
		return (ControlConstruct) newEnd;
	}
}
