package net.sf.ictalive.dashboard;

import java.text.MessageFormat;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.internal.common.URIUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

@SuppressWarnings("restriction")
public abstract class EditFileDashboardAction<S> extends InternalDashboardAction<S> {
	
	public String getProblems() {
		if (context.getProject() == null)
			return "No project has been selected.";
		else {
			boolean isAliveProject = false;
			try {
				if (context.getProject().getNature("net.sf.ictalive.aliveclipse.projectNature") != null)
					isAliveProject = true;
			} catch (CoreException e) {
			}
			
			if (!isAliveProject)
				return "The selected project \""+context.getProject().getName()+"\" is not an ALIVE project.";
			else
				if (getURI() == null)
					return "No file has been selected.";
				else
					return null;
		}
	}

	public void unguardedRun() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		IFile modelFile = URIUtil.getFile(getURI());
		try {
			String fileName = modelFile.getFullPath().toString();
			IEditorDescriptor defaultEditor = workbench.getEditorRegistry().getDefaultEditor(fileName);
			if (defaultEditor == null) {
				String msg = MessageFormat.format("No registered editor for .{0} files.", new Object[] { getURI().fileExtension() });
				MessageDialog.openError(workbenchWindow.getShell(), "No editor found", msg);
			}
			else {
				page.openEditor(new FileEditorInput(modelFile), defaultEditor.getId());
			}
		} catch (PartInitException pie) {
			String msg = MessageFormat.format("Unable to open editor for {0}", new Object[] { getURI() });
			MessageDialog.openError(workbenchWindow.getShell(), msg, pie.getMessage());
		}
	}

	protected abstract URI getURI();
}
