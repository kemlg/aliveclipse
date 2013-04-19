package net.sf.ictalive.coordination.wfvv.diagram.edit.commands;

import net.sf.ictalive.coordination.agents.Agent;
import net.sf.ictalive.coordination.wfvv.diagram.edit.policies.WfvvBaseItemSemanticEditPolicy;
import net.sf.ictalive.runtime.action.ServiceInvocation;

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
public class ServiceInvocationEnactingAgentReorientCommand extends
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
	public ServiceInvocationEnactingAgentReorientCommand(
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
		if (false == referenceOwner instanceof ServiceInvocation) {
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
		if (!(oldEnd instanceof Agent && newEnd instanceof ServiceInvocation)) {
			return false;
		}
		return WfvvBaseItemSemanticEditPolicy.LinkConstraints
				.canExistServiceInvocationEnactingAgent_4006(getNewSource(),
						getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Agent && newEnd instanceof Agent)) {
			return false;
		}
		return WfvvBaseItemSemanticEditPolicy.LinkConstraints
				.canExistServiceInvocationEnactingAgent_4006(getOldSource(),
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
		getOldSource().setEnactingAgent(null);
		getNewSource().setEnactingAgent(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setEnactingAgent(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected ServiceInvocation getOldSource() {
		return (ServiceInvocation) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected ServiceInvocation getNewSource() {
		return (ServiceInvocation) newEnd;
	}

	/**
	 * @generated
	 */
	protected Agent getOldTarget() {
		return (Agent) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Agent getNewTarget() {
		return (Agent) newEnd;
	}
}
