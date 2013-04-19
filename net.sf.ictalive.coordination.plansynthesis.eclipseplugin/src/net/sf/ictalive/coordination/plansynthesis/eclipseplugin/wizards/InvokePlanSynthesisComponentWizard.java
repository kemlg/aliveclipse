package net.sf.ictalive.coordination.plansynthesis.eclipseplugin.wizards;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import net.sf.ictalive.coordination.plansynthesis.eclipseplugin.Activator;
import net.sf.ictalive.coordination.plansynthesis.webserviceclient.PlanSynthesisWebServiceInvoker;
import net.sf.ictalive.coordination.plansynthesis.webserviceclient.PlanningException;
import net.sf.ictalive.coordination.tasks.Plan;
import net.sf.ictalive.coordination.tasks.PlansCollection;
import net.sf.ictalive.coordination.tasks.TasksFactory;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.EMFPlugin.EclipsePlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.ide.ResourceUtil;

/**
 * This is a sample new wizard. Its role is to create a new file resource in the
 * provided container. If the container resource (a folder or a project) is
 * selected in the workspace when the wizard is opened, it will accept it as the
 * target container. The wizard creates one file with the extension "plans". If
 * a sample multi-page editor (also available as a template) is registered for
 * the same extension, it will be able to open it.
 */

public class InvokePlanSynthesisComponentWizard extends Wizard implements
		INewWizard {
	private IStructuredSelection selection;
	private ActionFilesSelectionPage actionSelectionPage;
	private TaskFileSelectionPage taskSelectionPage;
	private PlanDetailsPage planDirectoryPage;

	/**
	 * Constructor for PlanSynthesisComponentNewWizard.
	 */
	public InvokePlanSynthesisComponentWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	/**
	 * Adding the page to the wizard.
	 */
	public void addPages() {
		actionSelectionPage = new ActionFilesSelectionPage(this.selection);
		addPage(actionSelectionPage);
		taskSelectionPage = new TaskFileSelectionPage(this.selection);
		addPage(taskSelectionPage);
		planDirectoryPage = new PlanDetailsPage(this.selection, true);
		addPage(planDirectoryPage);
	}

	/**
	 * Collects the selected files from the wizard pages, namely the selected
	 * action files, task file, and plans directory; checks for overwriting any
	 * existing plan files, invokes the plan synthesis web service, and saves
	 * any generated plans.
	 */
	public boolean performFinish() {
		IResource planDirectory = planDirectoryPage.getSelectedLocation();
		if (!planDirectoryPage.isSingleFileSelected()) {
			final String prefix = planDirectoryPage.getPrefixText();
			if (planDirectory.exists()) {
				try {
					String regex = prefix + "_[\\d]+.plans";
					boolean potential = false;
					for (IResource r : ((IContainer) planDirectory).members()) {
						if (r.getName().matches(regex)) {
							potential = true;
							break;
						}
					}
					if (potential) {
						boolean cont = MessageDialog
								.openQuestion(
										getShell(),
										"ALIVE",
										"Files exist in selected plans directory which may be overwritten using the defined prefix.  Continue?");
						if (!cont) {
							return false;
						}
					}
				} catch (CoreException e) {
					Activator.getDefault().getLog().log(
							new Status(Status.ERROR, Activator.PLUGIN_ID, e
									.getLocalizedMessage(), e));
					e.printStackTrace();
				}
			}
		}

		final boolean single = planDirectoryPage.isSingleFileSelected();
		final IFile task = taskSelectionPage.getSelectedFile();
		final String plan = planDirectoryPage.getSelectedLocation()
				.getLocation().toOSString()
				+ ((single) ? "" : File.separatorChar);
		final String prefix = planDirectoryPage.getPrefixText();
		final String ns = planDirectoryPage.getNamespaceText();
		final String server = planDirectoryPage.getServer();
		final int maxPlans = planDirectoryPage.getMaxPlans();
		final Shell shell = getShell();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException {
				try {
					doFinish(task, single, plan, ns, prefix, monitor, server,
							maxPlans, shell);
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
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID, e
							.getLocalizedMessage(), e));
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			if (realException != null)
				MessageDialog.openError(getShell(), "Error", realException
						.getMessage());
			else
				MessageDialog.openError(getShell(), "Error", e.getMessage());
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID, realException
							.getLocalizedMessage(), realException));
			return false;
		}
		return true;
	}

	/**
	 * The worker method. It will find the container, create the file if missing
	 * or just replace its contents, and open the editor on the newly created
	 * file.
	 * 
	 * @param taskFile
	 * @param plansResource
	 */

	private void doFinish(IFile taskFile, boolean saveToSingleFile,
			String plansResource, String planNS, String planFilenamePrefix,
			IProgressMonitor monitor, String server, int maxPlans, Shell shell)
			throws CoreException {
		monitor.beginTask("Generating plans", 3);
		ArrayList<IResource> resources = actionSelectionPage
				.getSelectedActionFiles();
		String[] actionFiles = new String[resources.size()];
		int m = 0;
		for (IResource resource : resources) {
			actionFiles[m++] = resource.getLocation().toString();
		}

		monitor.worked(1);

		// String root =
		// ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		// taskFile = root + File.separatorChar + taskFile;
		// Jshop2PlanSynthesisWsFilesTest2 tester = new
		// Jshop2PlanSynthesisWsFilesTest2();
		// List<Plan> plans = tester.generatePlans(actionFiles,
		// taskFile.getLocation().toOSString());
		PlanSynthesisWebServiceInvoker invoker = new PlanSynthesisWebServiceInvoker();
		monitor.beginTask("Invoking plan synthesis service", 2);
		PlansCollection planCollection;
		try {
			String planXmi = invoker.generatePlans(server, planFilenamePrefix,
					actionFiles, taskFile.getLocation().toOSString(), false,
					maxPlans);
			planCollection = PlanSynthesisUtils.loadFirstPlanCollection(planXmi);
		} catch (PlanningException e) {
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID,
							"Error with plan synthesis", e));
			monitor.done();
			MessageDialog
					.openError(
							shell,
							"Plan Synthesis Error",
							"An error has occured with generating the plans - see error log/console for details");
			return;
		}
		planCollection.setNs(planNS);
		monitor.done();

		monitor.worked(1);
		// if (plans.size() > 0){
		// ResourceSet rs = new ResourceSetImpl();
		// Resource r =rs.createResource(URI.createFileURI(plansDirectory +
		// "/plans.plans"));
		Resource r = planCollection.eResource();
		r.getContents().add(planCollection);

		try {
			ResourceSet rs = r.getResourceSet();
			if (saveToSingleFile) {
				Resource r2 = rs.createResource(URI
						.createFileURI(plansResource));
				r2.getContents().add(planCollection);
				FileOutputStream out = new FileOutputStream(plansResource);
				r2.save(out, null);
				out.close();
			} else {
				List<Plan> plans = planCollection.getPlans();
				for (int i = 0, j = plans.size(); i < j; i++) {
					Plan plan = plans.get(0);
					String path = plansResource + planFilenamePrefix + "_" + i
							+ ".plans";
					Resource planR = rs.createResource(URI.createFileURI(path));
					PlansCollection newCol = TasksFactory.eINSTANCE
							.createPlansCollection();
					newCol.setNs(planNS);
					newCol.getPlans().add(plan);
					planR.getContents().add(newCol);
					FileOutputStream out = new FileOutputStream(path);
					planR.save(out, null);
					out.close();
				}
			}
		} catch (FileNotFoundException e) {
			monitor.done();
			MessageDialog
					.openError(shell, "Error Saving Plans", e.getMessage());
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID, e
							.getMessage(), e));
		} catch (IOException e) {
			MessageDialog
					.openError(shell, "Error Saving Plans", e.getMessage());
			monitor.done();
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID, e
							.getMessage(), e));
		}
		// }

		monitor.done();
	}

	/**
	 * The worker method. It will find the container, create the file if missing
	 * or just replace its contents, and open the editor on the newly created
	 * file.
	 */

	private void oldDoFinish(String containerName, String fileName,
			IProgressMonitor monitor) throws CoreException {
		// create a sample file
		monitor.beginTask("Creating " + fileName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName
					+ "\" does not exist.");
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
				IWorkbenchPage page = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage();
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
		String contents = "This is the initial file contents for *.plans file that should be word-sorted in the Preview page of the multi-page editor";
		return new ByteArrayInputStream(contents.getBytes());
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status = new Status(IStatus.ERROR,
				"PlanSynthesisComponent.eclipsewizard", IStatus.OK, message,
				null);
		throw new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		System.out.println("InvokePlanSynthesisComponentWizard.init()"
				+ selection);
		this.selection = selection;
		this.actionSelectionPage.setSelection(selection);
		this.taskSelectionPage.setSelection(selection);
		this.planDirectoryPage.setSelection(selection);
	}
}