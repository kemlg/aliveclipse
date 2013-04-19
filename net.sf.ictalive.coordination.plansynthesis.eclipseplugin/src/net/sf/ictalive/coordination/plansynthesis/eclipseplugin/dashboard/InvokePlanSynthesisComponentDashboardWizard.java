package net.sf.ictalive.coordination.plansynthesis.eclipseplugin.dashboard;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.coordination.plansynthesis.eclipseplugin.Activator;
import net.sf.ictalive.coordination.plansynthesis.eclipseplugin.wizards.PlanDetailsPage;
import net.sf.ictalive.coordination.plansynthesis.eclipseplugin.wizards.PlanSynthesisUtils;
import net.sf.ictalive.coordination.plansynthesis.eclipseplugin.wizards.TaskSelectionPage;
import net.sf.ictalive.coordination.plansynthesis.webserviceclient.PlanSynthesisWebServiceInvoker;
import net.sf.ictalive.coordination.plansynthesis.webserviceclient.PlanningException;
import net.sf.ictalive.coordination.tasks.Plan;
import net.sf.ictalive.coordination.tasks.PlansCollection;
import net.sf.ictalive.coordination.tasks.Task;
import net.sf.ictalive.coordination.tasks.TasksCollection;
import net.sf.ictalive.coordination.tasks.TasksFactory;
import net.sf.ictalive.coordination.tasks.presentation.PlansModelWizard;
import net.sf.ictalive.coordination.tasks.presentation.PlansModelWizard.PlansModelWizardNewFileCreationPage;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.ResourceUtil;

/**
 * This is a sample wizard for the combine task and action dashboard action. It
 * prompts the user to provide information about the file to save the plans in,
 * the prefixes for the plan names, and the namespace of the plans.
 * 
 * 
 * 
 * 
 */

public class InvokePlanSynthesisComponentDashboardWizard extends Wizard
		implements INewWizard {
	private IStructuredSelection selection;

	private AliveDashboardState state;
	private PlansModelWizardNewFileCreationPage newPlanPage;
	private PlanDetailsPage planDetailsPage;
	private TaskSelectionPage taskSelectionPage;

	/**
	 * Constructor for PlanSynthesisComponentNewWizard.
	 */
	public InvokePlanSynthesisComponentDashboardWizard(AliveDashboardState state) {
		super();
		this.state = state;
		setNeedsProgressMonitor(true);
	}

	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		addPage(newPlanPage);
		addPage(taskSelectionPage);
		addPage(planDetailsPage);
	}

	/**
	 * Collects the selected files from the wizard pages, namely the selected
	 * action files, task file, and plans directory; checks for overwriting any
	 * existing plan files, invokes the plan synthesis web service, and saves
	 * any generated plans.
	 */
	public boolean performFinish() {
		final IFile modelFile = newPlanPage.getModelFile();
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		final Shell shell = workbenchWindow.getShell(); // set to new shell as
														// always causes invalid
														// thread
		// access exceptions
		final IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException {
				try {
					doFinish(state.getAction(), state.getTask(), modelFile,
							monitor, shell);
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
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID, realException
							.getLocalizedMessage(), realException));
			MessageDialog.openError(shell, "Error", realException.getMessage());
			return false;
		}
		return true;
	}

	/**
	 * The worker method. It will find the container, create the file if missing
	 * or just replace its contents, and open the editor on the newly created
	 * file.
	 * 
	 * @param taskPath
	 * @param plansDirectory
	 */
	private void doFinish(URI actionPath, URI taskPath, IFile modelFile,
			IProgressMonitor monitor, Shell shell) throws CoreException {
		monitor.beginTask("Generating plans", 3);

		String[] actionFiles = new String[1];
		actionFiles[0] = FileUtils.getFilePath(actionPath);

		// there may be multiple tasks in the task file,
		// but we only want to plan for one, so the first job is to get
		// the selected task, and store it in its own taskscollection
		// in a temporary file
		Task task = taskSelectionPage.getSelectedTask();
		URI taskUri = EcoreUtil.getURI(task); // note this, we will require it
		// later
		URI path = null; // will be the path of the temp file
		try {
			File temp = File.createTempFile("planning_task", "."
					+ taskPath.fileExtension());
			path = URI.createFileURI(temp.getAbsolutePath());
		} catch (IOException e1) {
			Activator.getDefault().getLog().log(
					new Status(Status.WARNING, Activator.PLUGIN_ID,
							"Unable to create temp file for task"));
			String extension = taskPath.fileExtension(), fpath = taskPath
					.toPlatformString(true);
			int index = fpath.indexOf(extension);
			Random r = new Random();
			if (index > -1) {
				path = URI.createFileURI(fpath.substring(0, index) + "temp"
						+ r.nextInt() + "." + extension);
			} else {
				path = URI.createFileURI(fpath + "temp" + r.nextInt() + "."
						+ extension);
			}
		}

		// save the selected task to a new taskcollection in the temp file
		ResourceSet taskrs = PlanSynthesisUtils.createResourceSet();
		Resource r = taskrs.createResource(path);
		TasksCollection tc = TasksFactory.eINSTANCE.createTasksCollection();
		tc.getTasks().add(task);
		r.getContents().add(tc);
		try {
			r.save(null);
		} catch (IOException e1) {
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID,
							"Unable to save task to temp resource", e1));
			MessageDialog.openError(shell, "Error Saving Task to Temp File", e1
					.getMessage());
			return;
		}

		monitor.worked(1);

		// invoke the plan synthesis, using the temp task file
		PlanSynthesisWebServiceInvoker invoker = new PlanSynthesisWebServiceInvoker();
		PlansCollection planCollection = null;
		try {
			String planXmi = invoker.generatePlans(planDetailsPage.getServer(),
					planDetailsPage.getPrefixText(), actionFiles, FileUtils
							.getFilePath(path), true, planDetailsPage
							.getMaxPlans());
			planCollection = PlanSynthesisUtils.loadFirstPlanCollection(planXmi);
		} catch (PlanningException e) {
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID,
							"Error with plan synthesis", e));
			monitor.done();
			// MessageDialog
			// .openError(
			// shell,
			// "Plan Synthesis Error",
			// "An error has occured with generating the plans - see error log/console for details");
			return;
		}
		if (planCollection == null) {
			monitor.done();
			Activator
					.getDefault()
					.getLog()
					.log(
							new Status(
									Status.ERROR,
									Activator.PLUGIN_ID,
									"An error has occured with generating the plans - see error log/console for details"));
			return;
		}
		if (planDetailsPage.getNamespaceText() != null) {
			planCollection.setNs(planDetailsPage.getNamespaceText());
		}

		// now find the original task

		task = null;

		// look for the original tasks file - it should be in a file
		// from the root of the workspace + the taskPath
		URI root = URI.createFileURI(ResourcesPlugin.getWorkspace().getRoot()
				.getLocation().toOSString()
				+ taskPath.toPlatformString(true));

		// get the original task resource
		Resource originalTask = taskrs.getResource(root, true);
		for (EObject obj : originalTask.getContents()) {
			// find the task in obj with the same uri as taskUri
			if (obj instanceof TasksCollection) {
				TasksCollection tcc = (TasksCollection) obj;
				for (Task t : tcc.getTasks()) {
					URI u = EcoreUtil.getURI(t);
					if (taskUri.equals(EcoreUtil.getURI(t))) {
						task = t;
						break;
					}
				}
			}
			// if we found the task, no point in continuing
			if (task != null)
				break;
		}
		// if we found the task, then set it to be the task for every
		// generate plan. If we did not find the task, then the plans
		// will point to the task in the temp file
		if (task != null) {
			for (Plan p : planCollection.getPlans()) {
				p.setForTask(task);
			}
		}
		monitor.worked(1);
		// if (plans.size() > 0){
		// ResourceSet rs = new ResourceSetImpl();
		// Resource r
		// =rs.createResource(URI.createFileURI(newPlanPage.getModelFile().getLocation().toOSString()));
		// Resource r = planCollection.eResource();
		// r.getContents().add(planCollection);

		// save the plans to the selected file.
		try {
			ResourceSet rs = new ResourceSetImpl();
			URI uri = URI.createPlatformResourceURI(modelFile.getFullPath()
					.toOSString(), true);
			Resource planR = rs.createResource(uri);
			// URI.createFileURI(modelFile
			// .getFullPath().toOSString()));
			planR.getContents().add(planCollection);
			planR.save(null);
			state.setPlan(uri);
			// URI.createPlatformResourceURI(modelFile.getFullPath()
			// .toOSString(), true));
			System.out.println(URI.createPlatformResourceURI(modelFile
					.getFullPath().toOSString(), true));
		} catch (FileNotFoundException e) {
			monitor.done();
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID, e
							.getMessage(), e));
			MessageDialog
					.openError(shell, "Error Saving Plans", e.getMessage());
		} catch (IOException e) {
			monitor.done();
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID, e
							.getMessage(), e));
			MessageDialog
					.openError(shell, "Error Saving Plans", e.getMessage());
		}
		// }

		monitor.done();
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		PlansModelWizard w = new PlansModelWizard();
		w.init(Activator.getDefault().getWorkbench(), selection);
		this.newPlanPage = w.new PlansModelWizardNewFileCreationPage(
				"SelectPlan", selection);
		this.taskSelectionPage = new TaskSelectionPage("Select A Task");
		this.taskSelectionPage.setTaskFileUri(state.getTask());
		this.planDetailsPage = new PlanDetailsPage(selection, false);
	}

}