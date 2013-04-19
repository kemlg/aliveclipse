package net.sf.ictalive.actions2opera.ui;

import java.util.Collections;

import net.sf.ictalive.actions2opera.ui.wizards.Actions2OperaTransformationWizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

public class Actions2OperaAction implements IObjectActionDelegate {

	@SuppressWarnings("unused")
	private Shell shell;
	
	private	IPath inModelPath;	
	
	/**
	 * Constructor for Action1.
	 */
	public Actions2OperaAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if(inModelPath == null) {
			return;
		}

		Actions2OperaTransformationWizard wizard= new Actions2OperaTransformationWizard(inModelPath);
		wizard.init(PlatformUI.getWorkbench(), null);//
			
		WizardDialog dialog = new WizardDialog(shell, wizard);
		dialog.setTitle("Actions To OperA Transformation Wizard");
		dialog.create();
		dialog.open();	
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		inModelPath = null;
		
		if(selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if(!selection.isEmpty()) {
				Object firstElement = structuredSelection.getFirstElement();
				if(firstElement instanceof IFile) {
					IFile ecoreFile = (IFile) firstElement;
					inModelPath = ecoreFile.getFullPath();
				}
			}
		}
	}	

}
