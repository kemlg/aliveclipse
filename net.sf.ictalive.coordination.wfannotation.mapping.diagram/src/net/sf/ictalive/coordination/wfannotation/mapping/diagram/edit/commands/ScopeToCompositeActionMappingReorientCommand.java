package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands;

import net.sf.ictalive.coordination.actions.CompositeAction;
import net.sf.ictalive.coordination.wfannotation.mapping.MappingContainer;
import net.sf.ictalive.coordination.wfannotation.mapping.ScopeToCompositeActionMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies.MappingBaseItemSemanticEditPolicy;

import org.eclipse.bpel.model.Scope;
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
public class ScopeToCompositeActionMappingReorientCommand extends
		EditElementCommand {

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
	public ScopeToCompositeActionMappingReorientCommand(
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
		if (false == getElementToEdit() instanceof ScopeToCompositeActionMapping) {
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
		if (!(oldEnd instanceof Scope && newEnd instanceof Scope)) {
			return false;
		}
		CompositeAction target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof MappingContainer)) {
			return false;
		}
		MappingContainer container = (MappingContainer) getLink().eContainer();
		return MappingBaseItemSemanticEditPolicy.LinkConstraints
				.canExistScopeToCompositeActionMapping_4022(container,
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof CompositeAction && newEnd instanceof CompositeAction)) {
			return false;
		}
		Scope source = getLink().getSource();
		if (!(getLink().eContainer() instanceof MappingContainer)) {
			return false;
		}
		MappingContainer container = (MappingContainer) getLink().eContainer();
		return MappingBaseItemSemanticEditPolicy.LinkConstraints
				.canExistScopeToCompositeActionMapping_4022(container, source,
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
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected ScopeToCompositeActionMapping getLink() {
		return (ScopeToCompositeActionMapping) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Scope getOldSource() {
		return (Scope) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Scope getNewSource() {
		return (Scope) newEnd;
	}

	/**
	 * @generated
	 */
	protected CompositeAction getOldTarget() {
		return (CompositeAction) oldEnd;
	}

	/**
	 * @generated
	 */
	protected CompositeAction getNewTarget() {
		return (CompositeAction) newEnd;
	}
}
