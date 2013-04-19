package net.sf.ictalive.opera2actions.ui;

import java.util.Collections;

import net.sf.ictalive.opera2actions.ui.wizards.Opera2ActionsTransformationWizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;



public class Opera2ActionsAction implements IObjectActionDelegate {

	@SuppressWarnings("unused")
	private Shell shell;
	
	private	IPath inModelPath;	
	
	/**
	 * Constructor for Action1.
	 */
	public Opera2ActionsAction() {
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
		
		
		Opera2ActionsTransformationWizard wizard= new Opera2ActionsTransformationWizard(inModelPath);
		wizard.init(PlatformUI.getWorkbench(), null);//
			
		WizardDialog dialog = new WizardDialog(shell, wizard);
		dialog.setTitle("OperA to Actions Trannsformation Wizard");
		dialog.create();
		dialog.open();
		
		/*
		URI inURI = URI.createPlatformResourceURI(inModelPath.toString(), true);
		Resource inResource = new ResourceSetImpl().getResource(inURI, true);

		URI outURI1 = inURI.trimFileExtension().appendFileExtension("actions");
		Resource outResource1 = new ResourceSetImpl().createResource(outURI1);
		
		URI outURI2 = inURI.trimFileExtension().appendFileExtension("OLCLMap");
		Resource outResource2 = new ResourceSetImpl().createResource(outURI2);
		
		try {
			ConvertOpera2Actions.convertOpera2Actions(inResource, outResource1, outResource2);			
			outResource1.save(Collections.emptyMap());
			outResource2.save(Collections.emptyMap());
			
		} catch (Exception e) {
			Diagnostic diagnostic = BasicDiagnostic.toDiagnostic(e);
			InvokeActivator.getDefault().getLog().log(BasicDiagnostic.toIStatus(diagnostic));
		}		
		*/
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
