package net.sf.ictalive.coordination.wfvv.diagram.custom;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

public class MySetPropertyCommand extends AbstractTransactionalCommand {

	private EditPart editPart;
	private EAttribute attribute;
	private Object newValue;
	private boolean resize;
	private static final boolean resizeVertical = true;
	private static final boolean resizeHorizontal = true;

	public MySetPropertyCommand(TransactionalEditingDomain editingDomain, EditPart viewAdapter,
			EAttribute attribute, Object newValue, boolean resize) {
		super(editingDomain, attribute.getName(), null);
		this.editPart = viewAdapter;
		this.newValue = newValue;
		this.attribute = attribute;
		this.resize = resize;
	}

	/*
	 * adapted from SetPropertyCommand
	 */
	public List getAffectedFiles() {
		if (editPart != null) {
			View view = (View) editPart.getAdapter(View.class);
			if (view != null)
				return getWorkspaceFiles(view);
		}
		return super.getAffectedFiles();
	}

	public String getLabel() {
		return attribute.getName();
	}

	protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info)
			throws ExecutionException {
		Object o = editPart.getModel();
		if (o instanceof Node) {
			Node n = (Node) o;
			EObject eo = n.getElement();
			if (resize
					&& n.getLayoutConstraint().eClass().equals(
							NotationPackage.eINSTANCE.getBounds())) {
				Bounds b = (Bounds) n.getLayoutConstraint();
				if (resizeVertical)
					b.setHeight(-1);
				if (resizeHorizontal)
					b.setWidth(-1);
			}
			eo.eSet(attribute, newValue);
			Diagram d = n.getDiagram();
			EObject modelElement = d.getElement();
			List policies = CanonicalEditPolicy.getRegisteredEditPolicies(modelElement);
			for (Iterator it = policies.iterator(); it.hasNext();) {
				CanonicalEditPolicy policy = (CanonicalEditPolicy) it.next();
				policy.enableRefresh(true);
				policy.refresh();
			}
			policies = CanonicalEditPolicy.getRegisteredEditPolicies(eo);
			for (Iterator it = policies.iterator(); it.hasNext();) {
				CanonicalEditPolicy policy = (CanonicalEditPolicy) it.next();
				policy.enableRefresh(true);
				policy.refresh();
			}
		} else {
			return CommandResult.newErrorCommandResult("");
		}
		return CommandResult.newOKCommandResult();
	}
}
