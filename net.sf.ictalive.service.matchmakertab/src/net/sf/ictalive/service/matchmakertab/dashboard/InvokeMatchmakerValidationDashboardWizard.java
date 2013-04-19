package net.sf.ictalive.service.matchmakertab.dashboard;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.coordination.actions.Action;
import net.sf.ictalive.coordination.actions.ActionsCollection;
import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.actions.AtomicAction;
import net.sf.ictalive.coordination.tasks.TasksPackage;
import net.sf.ictalive.service.matchmakertab.ValidateActionsAction;
import net.sf.ictalive.service.matchmakertab.views.ValidateActionsResultView;

import org.eclipse.core.internal.content.Activator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * This wizard allows users to select an action from the workspace and run the
 * matchmaker to show the candidate matches for that action
 * 
 * 
 * 
 */

public class InvokeMatchmakerValidationDashboardWizard extends Wizard implements
		INewWizard {
	private IStructuredSelection selection;
	private URI actionURI;
	ActionsCollection actionCollection;
	SelectActionsToValidatePage selectActionsPage;

	/**
	 * Constructor for PlanSynthesisComponentNewWizard.
	 */
	public InvokeMatchmakerValidationDashboardWizard(URI actionCollectionURI) {
		super();
		this.actionURI = actionCollectionURI;
		setNeedsProgressMonitor(true);
	}

	public List<Action> getSelectedActions() {
		return selectActionsPage.getSelectedActions();
	}

	/**
	 * Adding the page to the wizard.
	 */

	@Override
	public void addPages() {

		addPage(selectActionsPage = new SelectActionsToValidatePage("page",
				new Callable<List<Action>>() {
					List<Action> gotActions;

					@Override
					public List<Action> call() throws Exception {
						if (gotActions == null) {
							gotActions = new ArrayList<Action>();
							Iterables.addAll(gotActions, Iterables.filter(
									actionCollection.getActions(), Predicates
											.instanceOf(AtomicAction.class)));
						}
						return gotActions;
					}
				}));
		selectActionsPage.setTitle("Select Actions to validate");

	}

	@Override
	public boolean canFinish() {
		return selectActionsPage.isPageComplete();
	}

	/**
	 * Collects the selected files from the wizard pages, namely the selected
	 * action files, task file, and plans directory; checks for overwriting any
	 * existing plan files, invokes the plan synthesis web service, and saves
	 * any generated plans.
	 */
	@Override
	public boolean performFinish() {

		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {

				ValidateActionsAction va = new ValidateActionsAction(monitor,
						getSelectedActions());

				va.run();

				// now show view
				IWorkbenchPage page = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage();

				IViewPart resultView = page
						.findView(ValidateActionsResultView.ID);
				if (resultView != null) {
					ValidateActionsResultView rv = (ValidateActionsResultView) resultView;
					rv.UpdateResults();
				}

				page.showView(ValidateActionsResultView.ID);
			}
		};

		try {

			getContainer().run(false, true, op);

		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				// ErrorDialog.openError(getContainer().getShell(),
				// Messages.CoordinationCreationWizardCreationError, null,
				// ((CoreException) e.getTargetException()).getStatus());
				e.printStackTrace();
			} else {
				// ActionDiagramEditorPlugin.getInstance().logError(
				//		"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
				e.printStackTrace();
			}
			return false;
		}
		// return diagram != null;

		return true;
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		URI actionURI = this.actionURI;
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());
		rs.getPackageRegistry().put(TasksPackage.eNS_URI,
				TasksPackage.eINSTANCE);
		rs.getPackageRegistry().put(TasksPackage.eNS_PREFIX,
				TasksPackage.eINSTANCE);
		rs.getPackageRegistry().put(ActionsPackage.eNS_URI,
				ActionsPackage.eINSTANCE);
		rs.getPackageRegistry().put(ActionsPackage.eNS_PREFIX,
				ActionsPackage.eINSTANCE);

		Resource r = rs.getResource(actionURI, true);
		for (EObject obj : r.getContents()) {

			if (obj instanceof ActionsCollection) {
				ActionsCollection col = (ActionsCollection) obj;
				actionCollection = col;
			}
		}
	}

}