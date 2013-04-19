package net.sf.ictalive.actions2tasks.ui;

import java.util.Collections;

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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;



public class Actions2TasksAction implements IObjectActionDelegate {

	@SuppressWarnings("unused")
	private Shell shell;
	
	private	IPath inModelPath;	
	
	/**
	 * Constructor for Action1.
	 */
	public Actions2TasksAction() {
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

		URI inURI = URI.createPlatformResourceURI(inModelPath.toString(), true);
		Resource inResource = new ResourceSetImpl().getResource(inURI, true);

		URI outURI = inURI.trimFileExtension().appendFileExtension("tasks");
		Resource outResource = new ResourceSetImpl().createResource(outURI);
						
		try {
			ConvertActions2Tasks.convertActions2Tasks(inResource, outResource);			
			outResource.save(Collections.emptyMap());			
		} catch (Exception e) {
			Diagnostic diagnostic = BasicDiagnostic.toDiagnostic(e);
			InvokeActivator.getDefault().getLog().log(BasicDiagnostic.toIStatus(diagnostic));
		}		
		
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
