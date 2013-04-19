package net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.commands;

import net.sf.ictalive.coordination.wfannotation.mapping.ElseIfToIfThenElseMapping;
import net.sf.ictalive.coordination.wfannotation.mapping.MappingContainer;
import net.sf.ictalive.coordination.wfannotation.mapping.diagram.edit.policies.MappingBaseItemSemanticEditPolicy;
import net.sf.ictalive.owls.process.ControlConstruct;
import net.sf.ictalive.owls.process.IfThenElse;

import org.eclipse.bpel.model.ElseIf;
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
public class ElseIfToIfThenElseMappingReorientCommand extends
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
	public ElseIfToIfThenElseMappingReorientCommand(
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
		if (false == getElementToEdit() instanceof ElseIfToIfThenElseMapping) {
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
		if (!(oldEnd instanceof ElseIf && newEnd instanceof ElseIf)) {
			return false;
		}
		IfThenElse target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof MappingContainer)) {
			return false;
		}
		MappingContainer container = (MappingContainer) getLink().eContainer();
		return MappingBaseItemSemanticEditPolicy.LinkConstraints
				.canExistElseIfToIfThenElseMapping_4023(container,
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof IfThenElse && newEnd instanceof IfThenElse)) {
			return false;
		}
		ElseIf source = getLink().getSource();
		if (!(getLink().eContainer() instanceof MappingContainer)) {
			return false;
		}
		MappingContainer container = (MappingContainer) getLink().eContainer();
		return MappingBaseItemSemanticEditPolicy.LinkConstraints
				.canExistElseIfToIfThenElseMapping_4023(container, source,
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
	protected ElseIfToIfThenElseMapping getLink() {
		return (ElseIfToIfThenElseMapping) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ElseIf getOldSource() {
		return (ElseIf) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ElseIf getNewSource() {
		return (ElseIf) newEnd;
	}

	/**
	 * @generated
	 */
	protected IfThenElse getOldTarget() {
		return (IfThenElse) oldEnd;
	}

	/**
	 * @generated
	 */
	protected IfThenElse getNewTarget() {
		return (IfThenElse) newEnd;
	}
}
