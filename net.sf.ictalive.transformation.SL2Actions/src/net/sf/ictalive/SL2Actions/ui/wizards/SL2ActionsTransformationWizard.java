package net.sf.ictalive.SL2Actions.ui.wizards;

import net.sf.ictalive.SL2Actions.ConvertSL2Actions;
import net.sf.ictalive.SL2Actions.ui.Activator;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import java.io.*;
import org.eclipse.ui.*;
import org.eclipse.ui.ide.IDE;

public class SL2ActionsTransformationWizard extends Wizard implements INewWizard {
	private SL2ActionsTransformationWizardPage1 page1;	
	private ISelection selection;	
	private IPath owlsModel;	
	
	
	
	public SL2ActionsTransformationWizard() {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("OWL-S to Actions and OperA Transformation Wizard");
	}
	
	public SL2ActionsTransformationWizard(IPath inActionModel) {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("OWL-S to Actions and OperA Transformation Wizard");
		
		owlsModel = inActionModel;
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {		
		page1 = new SL2ActionsTransformationWizardPage1(selection, owlsModel);
		addPage(page1);	
	}
	
	/**
	 * Add connection to get the resulting action file URI
	 */
	public String getActionFile() {
		return page1.getActionsContainerName()+page1.getActionsFileName();
	}
		
	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {
		final String actionsContainerName = page1.getActionsContainerName();
		final String actionFileName = page1.getActionsFileName();				
		String actionURI =  page1.getActionsContainerName()+page1.getActionsFileName();
		
		IResource actionContainer = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path( page1.getActionsContainerName()));
						
		IContainer container = (IContainer) actionContainer;
		final IFile file = container.getFile(new Path(actionFileName));		
				
		if(file.exists()){			
				boolean b = MessageDialog.openConfirm(this.getShell(), "Confirm", "The selected action file already exists. Do you want to append it?");
				if (b==false){ 
					
					return false;
				}
		}
				
		final String operaContainerName = page1.getOperaContainerName();
		final String operaFileName = page1.getOperaFileName();				
		String operaURI =  page1.getOperaContainerName()+page1.getOperaFileName();
		
		IResource operaContainer = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path( page1.getOperaContainerName()));
						
		IContainer container2 = (IContainer) operaContainer;
		final IFile file2 = container2.getFile(new Path(operaFileName));		
				
		if(file2.exists()){			
				boolean b = MessageDialog.openConfirm(this.getShell(), "Confirm", "The selected operA file already exists. Do you want to append it?");
				if (b==false){ 
				
					return false;
				}
		}
				
		transform(owlsModel, actionURI, operaURI, page1.genOpera() );
			
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
			"This is the file contents for *.actions file that should be word-sorted in the Preview page of the multi-page editor";
		return new ByteArrayInputStream(contents.getBytes());
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "OWLS2ActionsTransformationWizard", IStatus.OK, message, null);
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
	

public void transform(IPath owlsModel, String actionModel, String operaModel, boolean genOpera) {
	System.out.println("transforming  ...");
	
	URI inURI = URI.createPlatformResourceURI(owlsModel.toString(), true);	
	URI outURI1 = URI.createPlatformResourceURI(actionModel, true);				
	URI outURI2 = URI.createPlatformResourceURI(operaModel, true);	
	
	System.out.println("OWLSModel: " + inURI);
	System.out.println("actionModel: "+ outURI1);	
	if( genOpera)
		System.out.println("operaModel: "+ outURI2);
	else
		System.out.println("do not generate OperA");		
		
	try {
		ConvertSL2Actions.GENERATE_OPERA = genOpera;
		ConvertSL2Actions.convert(inURI, outURI1, outURI2);			
		
	} catch (Exception e) {
		Diagnostic diagnostic = BasicDiagnostic.toDiagnostic(e);
		Activator.getDefault().getLog().log(BasicDiagnostic.toIStatus(diagnostic));
	}				
	
}


}