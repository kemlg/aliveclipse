package net.sf.ictalive.operetta.OM.diagram.is.edit.commands;

import net.sf.ictalive.operetta.OM.Landmark;
import net.sf.ictalive.operetta.OM.OMFactory;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.diagram.is.edit.parts.LandmarkEditPart;

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

// Code is shared with ss.edit.commands.RoleToggleRoleTypeCommand.
// Make an abstraction if more than these two commands will be implemented.
public class LandmarkToggleIsResultCommand implements IObjectActionDelegate {
	
		public void run(IAction action) {
	//		System.out.println("Executing "+selectedElement.getClass());
			if (selectedElement instanceof StructuredSelection) {
				StructuredSelection sel = (StructuredSelection)selectedElement;
				if (sel.getFirstElement() instanceof LandmarkEditPart) {
					LandmarkEditPart landmarkEditPart = (LandmarkEditPart)sel.getFirstElement();
					TransactionalEditingDomain editingDomain = landmarkEditPart.getEditingDomain();
					Landmark landmark = (Landmark)((View)landmarkEditPart.getModel()).getElement();
					
					Object newValue = !landmark.isIsResult(); 
					editingDomain.getCommandStack().execute(
							SetCommand.create(editingDomain, landmark, OMPackage.eINSTANCE.getLandmark_IsResult(), newValue));
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
