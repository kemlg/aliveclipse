package net.sf.ictalive.opera2actions.ui.wizards;


import net.sf.ictalive.opera2actions.ui.ConvertOpera2Actions;
import net.sf.ictalive.opera2actions.ui.InvokeActivator;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.core.runtime.*;
import java.util.Collections;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import java.io.*;
import org.eclipse.ui.*;
import org.eclipse.ui.ide.IDE;

/**
 * This is a sample new wizard. Its role is to create a new file 
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace 
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one file with the extension
 * "xmi". If a sample multi-page editor (also available
 * as a template) is registered for the same extension, it will
 * be able to open it.
 */

public class Opera2ActionsTransformationWizard extends Wizard implements INewWizard {
	private Opera2ActionsTransformationWizardPage1 page1;	
	private ISelection selection;
	
	private IPath operaModel;
	
	
	public Opera2ActionsTransformationWizard() {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("OperA to Actions Transformation Wizard");
	}
	public Opera2ActionsTransformationWizard(IPath inActionModel) {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("OperA to Actions Transformation Wizard");
		
		operaModel = inActionModel;
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {		
		page1 = new Opera2ActionsTransformationWizardPage1(selection, operaModel);
		addPage(page1);	
	}
	
	public String getFileName() {
		String container = page1.getContainerName();
//		if(!container.endsWith("/"))
//			container += "/";
//		
		return container + page1.getFileName();
	}
	
	
	
	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {
		final String containerName = page1.getContainerName();
		final String fileName = page1.getFileName();
				
		String s =  page1.getContainerName()+page1.getFileName();
		
		IResource actionContainer = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path( page1.getContainerName()));
	
		String actionFileName = page1.getFileName();
					
		IContainer container = (IContainer) actionContainer;
		final IFile file = container.getFile(new Path(actionFileName));		
				
		if(file.exists()){			
				boolean b = MessageDialog.openConfirm(this.getShell(), "Confirm", "The selected action file already exists. Do you want to override it?");
				if (b==false){ 
					//updateStatus("Action File already exists");
					return false;
				}
		}
				
		transform(operaModel, s );
		
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
				}
			}
		});
		
		
		return true;
		
	}
	

	/**
	 * We will initialize file contents with a sample text.
	 */

	private InputStream openContentStream() {
		String contents =
			"This is the initial file contents for *.opera file that should be word-sorted in the Preview page of the multi-page editor";
		return new ByteArrayInputStream(contents.getBytes());
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "Actions2OperaTransformationWizard", IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
	



public void transform(IPath operaModel, String actionModel) {
//	System.out.println("transforming  -> ");
//	System.out.println("operaModel -> " + operaModel.toString());
//	System.out.println("actionModel: "+ actionModel);

	URI inURI = URI.createPlatformResourceURI(operaModel.toString(), true);
	Resource inResource = new ResourceSetImpl().getResource(inURI, true);
	
	URI outURI1 = URI.createPlatformResourceURI(actionModel, true);	
	Resource outResource1 = new ResourceSetImpl().createResource(outURI1);
	
	URI outURI2 = outURI1.trimFileExtension().appendFileExtension("OLCLMap");
	Resource outResource2 = new ResourceSetImpl().createResource(outURI2);
	
	try {
		ConvertOpera2Actions.convertOpera2Actions(inResource, outResource1, outResource2);			
		outResource1.save(Collections.emptyMap());
		outResource2.save(Collections.emptyMap());
		
	} catch (Exception e) {
		Diagnostic diagnostic = BasicDiagnostic.toDiagnostic(e);
		InvokeActivator.getDefault().getLog().log(BasicDiagnostic.toIStatus(diagnostic));
	}		
		
	
}


}