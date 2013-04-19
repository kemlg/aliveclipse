package net.sf.ictalive.service.serviceui;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;

public class RepoSyncAction implements IObjectActionDelegate {

	private IWorkbenchPart activePart;
	IContainer selectedContainer;
	// Logger log = LoggerFactory.getLogger(PublishOWLSAction.class);
	Shell pluginShell;

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		activePart = targetPart;
		pluginShell = targetPart.getSite().getShell();
	}

	@Override
	public void run(IAction action) {
		if (selectedContainer == null) {
			return;
		}
		final IWorkbenchWindow window = activePart.getSite()
				.getWorkbenchWindow();

		RepositorySyncWizard wiz;
		final WizardDialog dialog = new WizardDialog(window.getShell(),
				wiz = new RepositorySyncWizard(selectedContainer));
		dialog.create();
		
		dialog.getShell().setSize(470, 500);
		dialog.open();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (!selection.isEmpty()) {
				Object firstElement = structuredSelection.getFirstElement();
				if (firstElement instanceof IContainer) {
					selectedContainer = (IContainer) firstElement;
				}
			}
		}
	}

}
