package net.sf.ictalive.operetta.OM.diagram.ss.edit.commands;

import net.sf.ictalive.operetta.OM.Role;
import net.sf.ictalive.operetta.OM.OMFactory;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.RoleType;
import net.sf.ictalive.operetta.OM.diagram.ss.edit.parts.RoleEditPart;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

// Class copied from is.edit.commands.LandmarkToggleIsResultCommand.
// Make an abstraction if more than these two commands will be implemented.
public class RoleToggleRoleTypeCommand implements IObjectActionDelegate {
	
		public void run(IAction action) {
			//System.out.println("Executing "+selectedElement.getClass());
			if (selectedElement instanceof StructuredSelection) {
				StructuredSelection sel = (StructuredSelection)selectedElement;
				if (sel.getFirstElement() instanceof RoleEditPart) {
					RoleEditPart roleEditPart = (RoleEditPart)sel.getFirstElement();
					TransactionalEditingDomain editingDomain = roleEditPart.getEditingDomain();
					Role role = (Role)((View)roleEditPart.getModel()).getElement();
					
					Object newValue = role.getRoleType() == RoleType.EXTERNAL ? RoleType.INTERNAL : RoleType.EXTERNAL;
					editingDomain.getCommandStack().execute(
							SetCommand.create(editingDomain, role, OMPackage.eINSTANCE.getRole_RoleType(), newValue));
				}
			}
		}

		Object selectedElement;
		@Override
		public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		}

		@Override
		public void selectionChanged(IAction action, ISelection selection) {
			selectedElement = selection;
		}

	
}
