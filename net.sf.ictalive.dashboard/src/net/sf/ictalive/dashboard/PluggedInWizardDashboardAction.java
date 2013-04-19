package net.sf.ictalive.dashboard;

import java.util.ArrayList;
import java.util.List;


import net.sf.ictalive.dashboard.PluggedInDashboardAction;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.internal.common.URIUtil;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;

@SuppressWarnings("restriction")
public abstract class PluggedInWizardDashboardAction<S> extends PluggedInDashboardAction<S> {
	
	List<IFile> files = new ArrayList<IFile>();
	
	public void run(final S state) {
		

		StructuredSelection selection = new StructuredSelection(files);
	
		final IWizard wizard = createWizard(state);
		if (wizard instanceof IWorkbenchWizard) {
			((IWorkbenchWizard) wizard).init(PlatformUI.getWorkbench(), selection);
		}
			
		// TODO: setSize does not seem to be necessary.
		Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		WizardDialog dialog = new WizardDialog(shell, wizard) {

			protected void finishPressed() {
				wizardFinished(wizard, state);
				super.finishPressed();
			}
		};
		dialog.create();
		dialog.open();
	}
	
	protected abstract IWizard createWizard(S state);

	protected abstract void wizardFinished(IWizard wizard, S state);

	protected void addURItoSelection(URI uri) {
		if (uri == null) {
			return;
		}
		IFile file = URIUtil.getFile(uri);
		if (file != null) {
			files.add(file);
		}
	}
}
