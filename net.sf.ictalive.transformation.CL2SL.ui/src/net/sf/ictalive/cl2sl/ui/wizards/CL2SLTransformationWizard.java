package net.sf.ictalive.cl2sl.ui.wizards;

import net.sf.ictalive.cl2sl.ui.ConvertCL2SL;
import net.sf.ictalive.cl2sl.ui.InvokeActivator;
import net.sf.ictalive.SL2Code.files.*;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.core.runtime.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

public class CL2SLTransformationWizard extends Wizard implements INewWizard {
	private CL2SLTransformationWizardPage1 page1;
	private CL2SLTransformationWizardPage2 page2;
	private ISelection selection;
	
	private IPath planModel;
	
	/**
	 * Constructor for CL2SLTransformationWizard.
	 */
	public CL2SLTransformationWizard() {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("CL To SL Transformation Wizard");
	}
	public CL2SLTransformationWizard(IPath inPlanModel) {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("CL To SL Transformation Wizard");
		
		planModel = inPlanModel;
	}
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {		
		page1 = new CL2SLTransformationWizardPage1(selection, planModel);
		addPage(page1);
		page2 = new CL2SLTransformationWizardPage2(selection,  page1);
		addPage(page2);
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
		
		transform(planModel, s, page1.getContainerName());
		
		return true;
		
		/*
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, fileName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
		*/
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
			"This is the initial file contents for *.xmi file that should be word-sorted in the Preview page of the multi-page editor";
		return new ByteArrayInputStream(contents.getBytes());
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "CL2SLTransformationWizard", IStatus.OK, message, null);
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
	



public void transform(IPath planModel, String serviceModel, String outFolder) {
//	System.out.println("transforming  -> ");
//	System.out.println("planModel -> " + planModel.toString());
//	System.out.println("serviceModel: "+ serviceModel);
//	System.out.println("outFolder : "+ outFolder);
//	System.out.println("option : "+ page2.getGenerateOption());
//	System.out.println(".........................");
	
	URI inURI = URI.createPlatformResourceURI(planModel.toString(), true);	
	Resource inResource = new ResourceSetImpl().getResource(inURI, true);
	
	URI outURI = URI.createPlatformResourceURI(serviceModel, true);
	Resource outResource = new ResourceSetImpl().createResource(outURI);
	
	try {
		
		ConvertCL2SL.convertPlan2Service(inResource, outResource, page2.getServiceName() , page2.getServiceEndpoint(), page2.getServiceNamespace(), "SOAP", "Document Literal");
		//ConvertCL2SL.convertPlan2Service(inResource, outResource);			
		outResource.save(Collections.emptyMap());					
			
		invokeSL2Code(new String[]{serviceModel, outFolder});
		
	} catch (Exception e) {
		Diagnostic diagnostic = BasicDiagnostic.toDiagnostic(e);
		InvokeActivator.getDefault().getLog().log(BasicDiagnostic.toIStatus(diagnostic));
	}		

	
}
public void invokeSL2Code(String[] args) {
    try {
      if (args.length < 2) {
        System.out.println("Arguments not valid : {model, folder}.");
      } else {
    	    	 		
        URI modelURI = URI.createFileURI(args[0]);
        String s = ResourcesPlugin.getWorkspace().getRoot().getLocation().append(args[1]).toOSString();
        File folder = new File( s );
                  
        List<String> arguments = new ArrayList<String>();
        for (int i = 2; i < args.length; i++) {
          arguments.add(args[i]);
        }
        
        if(page2.getGenerateOption()==1){
        	Sl2Code generator = new Sl2Code(modelURI, folder, arguments);
            generator.doGenerate(new BasicMonitor());     	
        }
        else if(page2.getGenerateOption()==2){
        	Sl2wsdl generator1 = new Sl2wsdl(modelURI, folder, arguments);
            generator1.doGenerate(new BasicMonitor());
        }
        else if(page2.getGenerateOption()==3){
        	Sl2owls generator2 = new Sl2owls(modelURI, folder, arguments);
            generator2.doGenerate(new BasicMonitor());
        }
        else{
        	
        }
                  
        
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}