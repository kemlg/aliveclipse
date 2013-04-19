package net.sf.ictalive.operetta.OM.diagram.ss.edit.commands;

import net.sf.ictalive.operetta.OM.HierarchyDependency;
import net.sf.ictalive.operetta.OM.Role;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.policies.OperABaseItemSemanticEditPolicy;

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
public class HierarchyDependencyReorientCommand extends EditElementCommand {

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
	public HierarchyDependencyReorientCommand(
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
		if (false == getElementToEdit() instanceof HierarchyDependency) {
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
		if (!(oldEnd instanceof Role && newEnd instanceof Role)) {
			return false;
		}
		Role target = getLink().getDependee();
		if (!(getLink().eContainer() instanceof net.sf.ictalive.operetta.OM.SS)) {
			return false;
		}
		net.sf.ictalive.operetta.OM.SS container = (net.sf.ictalive.operetta.OM.SS) getLink()
				.eContainer();
		return OperABaseItemSemanticEditPolicy.LinkConstraints
				.canExistHierarchyDependency_4003(container, getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Role && newEnd instanceof Role)) {
			return false;
		}
		Role source = getLink().getDependant();
		if (!(getLink().eContainer() instanceof net.sf.ictalive.operetta.OM.SS)) {
			return false;
		}
		net.sf.ictalive.operetta.OM.SS container = (net.sf.ictalive.operetta.OM.SS) getLink()
				.eContainer();
		return OperABaseItemSemanticEditPolicy.LinkConstraints
				.canExistHierarchyDependency_4003(container, source,
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
		getLink().setDependant(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setDependee(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected HierarchyDependency getLink() {
		return (HierarchyDependency) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Role getOldSource() {
		return (Role) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Role getNewSource() {
		return (Role) newEnd;
	}

	/**
	 * @generated
	 */
	protected Role getOldTarget() {
		return (Role) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Role getNewTarget() {
		return (Role) newEnd;
	}
}
