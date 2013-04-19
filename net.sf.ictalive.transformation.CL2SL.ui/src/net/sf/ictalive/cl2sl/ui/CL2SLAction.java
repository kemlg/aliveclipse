package net.sf.ictalive.cl2sl.ui;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.sf.ictalive.cl2sl.ui.wizards.CL2SLTransformationWizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;


public class CL2SLAction implements IObjectActionDelegate {

	@SuppressWarnings("unused")
	private Shell shell;
	
	private	IPath inModelPath;	
	
	/**
	 * Constructor for Action1.
	 */
	public CL2SLAction() {
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
					
		CL2SLTransformationWizard wizard= new CL2SLTransformationWizard(inModelPath);
		wizard.init(PlatformUI.getWorkbench(), null);//
			
		WizardDialog dialog = new WizardDialog(shell, wizard);
		dialog.setTitle("CL To SL Trannsformation Wizard");
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
