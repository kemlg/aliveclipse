package net.sf.ictalive.coordination.wfvv.diagram.edit.commands;

import net.sf.ictalive.coordination.wfvv.diagram.edit.policies.WfvvBaseItemSemanticEditPolicy;
import net.sf.ictalive.operetta.OM.Norm;

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
public class NSNormsReorientCommand extends EditElementCommand {

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
	public NSNormsReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof net.sf.ictalive.operetta.OM.NS) {
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
		if (!(oldEnd instanceof Norm && newEnd instanceof net.sf.ictalive.operetta.OM.NS)) {
			return false;
		}
		return WfvvBaseItemSemanticEditPolicy.LinkConstraints
				.canExistNSNorms_4010(getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Norm && newEnd instanceof Norm)) {
			return false;
		}
		return WfvvBaseItemSemanticEditPolicy.LinkConstraints
				.canExistNSNorms_4010(getOldSource(), getNewTarget());
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
		getOldSource().getNorms().remove(getOldTarget());
		getNewSource().getNorms().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getNorms().remove(getOldTarget());
		getOldSource().getNorms().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected net.sf.ictalive.operetta.OM.NS getOldSource() {
		return (net.sf.ictalive.operetta.OM.NS) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected net.sf.ictalive.operetta.OM.NS getNewSource() {
		return (net.sf.ictalive.operetta.OM.NS) newEnd;
	}

	/**
	 * @generated
	 */
	protected Norm getOldTarget() {
		return (Norm) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Norm getNewTarget() {
		return (Norm) newEnd;
	}
}
