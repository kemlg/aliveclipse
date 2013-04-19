package net.sf.ictalive.actions2opera.ui.wizards;


import net.sf.ictalive.actions2opera.ui.ConvertActions2Opera;
import net.sf.ictalive.actions2opera.ui.InvokeActivator;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.core.runtime.*;
import java.util.Collections;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.BasicDiagnostic;
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

public class Actions2OperaTransformationWizard extends Wizard implements INewWizard {
	private Actions2OperaTransformationWizardPage1 page1;
	private Actions2OperaTransformationWizardPage2 page2;
	private ISelection selection;
	
	private IPath actionModel;
	
	/**
	 * Constructor for CL2SLTransformationWizard.
	 */
	public Actions2OperaTransformationWizard() {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("Actions To OperA Transformation Wizard");
	}
	public Actions2OperaTransformationWizard(IPath inActionModel) {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("Actions To OperA Transformation Wizard");
		
		actionModel = inActionModel;
	}
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {		
		page1 = new Actions2OperaTransformationWizardPage1(selection, actionModel);
		addPage(page1);
		page2 = new Actions2OperaTransformationWizardPage2(selection,  page1);
		addPage(page2);
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
						
		transform(actionModel, s, page1.getContainerName(), page2.getOntologyURI(), page2.getTableItems() );
		
		return true;	
	}
	
	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 */

	private void doFinish(String containerName,	String fileName, IProgressMonitor monitor)
		throws CoreException {
		
		// create a sample file
		monitor.beginTask("Creating " + fileName, 2);
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
		final IFile file = container.getFile(new Path(fileName));
		try {
			InputStream stream = openContentStream();
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
		monitor.worked(1);
		monitor.setTaskName("Opening file for editing...");
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
		monitor.worked(1);
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
	
	public void transform(IPath planModel, String serviceModel, String outFolder, String ontologyURI, TableItem[] tableitems) {

		URI inURI = URI.createPlatformResourceURI(planModel.toString(), true);	
		Resource inResource = new ResourceSetImpl().getResource(inURI, true);
		
		URI outURI = URI.createPlatformResourceURI(serviceModel, true);
		Resource outResource = new ResourceSetImpl().createResource(outURI);
		
		try {			
			ConvertActions2Opera.convertActions2Opera(inResource, outResource, ontologyURI, tableitems);	
			outResource.save(Collections.emptyMap());				
		} catch (Exception e) {
			Diagnostic diagnostic = BasicDiagnostic.toDiagnostic(e);
			InvokeActivator.getDefault().getLog().log(BasicDiagnostic.toIStatus(diagnostic));
		}		
	}
}