package net.sf.ictalive.coordination.plans.diagram.edit.commands;

import net.sf.ictalive.coordination.actions.Action;
import net.sf.ictalive.coordination.plans.diagram.edit.policies.CoordinationBaseItemSemanticEditPolicy;
import net.sf.ictalive.coordination.tasks.ActionGrounding;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

/**
 * @generated
 */
public class ActionGroundingOwlsProcessCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final EObject source;

	/**
	 * @generated
	 */
	private final EObject target;

	/**
	 * @generated
	 */
	public ActionGroundingOwlsProcessCreateCommand(
			CreateRelationshipRequest request, EObject source, EObject target) {
		super(request.getLabel(), null, request);
		System.out.println("Creating Target " + ((target==null)?"null":target.getClass().getName()));
		this.source = source;
		this.target = target;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		System.out.println("Target " + ((target==null)?"null":target.getClass().getName()));
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof ActionGrounding) {
			return false;
		}
		if (target != null && false == target instanceof Action) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		return true;
		// target may be null here but it's possible to check constraint
//		return CoordinationBaseItemSemanticEditPolicy.LinkConstraints
//				.canCreateActionGroundingOwlsProcess_4008(getSource(),
//						getTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in create link command"); //$NON-NLS-1$
		}

		if (getSource() != null && getTarget() != null) {
			getSource().setOwlsProcess(getTarget());
		}
		return CommandResult.newOKCommandResult();

	}

	/**
	 * @generated
	 */
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected ActionGrounding getSource() {
		return (ActionGrounding) source;
	}

	/**
	 * @generated
	 */
	protected Action getTarget() {
		return (Action) target;
	}
}
