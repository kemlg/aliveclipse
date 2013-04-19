package net.sf.ictalive.SL2Actions.ui;

import net.sf.ictalive.SL2Actions.ui.wizards.SL2ActionsTransformationWizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

public class SL2ActionsAction implements IObjectActionDelegate {	

	private	IPath inModelPath;	
	
	private Shell shell;
	
	/**
	 * Constructor for Action1.
	 */
	public SL2ActionsAction() {
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
		
		SL2ActionsTransformationWizard wizard= new SL2ActionsTransformationWizard(inModelPath);
		wizard.init(PlatformUI.getWorkbench(), null);//
			
		WizardDialog dialog = new WizardDialog(shell, wizard);
		dialog.setTitle("OWL-S to Actions Trannsformation Wizard");
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
					IFile aFile = (IFile) firstElement;
					inModelPath = aFile.getFullPath();
				}
			}
		}
	}

}
