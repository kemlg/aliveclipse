package net.sf.ictalive.dashboard;

import net.sf.ictalive.dashboard.figure.ModelFigure;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.internal.common.URIUtil;
import org.eclipse.gmf.internal.common.ui.FileSelector;

@SuppressWarnings("restriction")
public abstract class SelectFileDashboardAction<S> extends InternalDashboardAction<S> {
	
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
			
			return isAliveProject ? null : "The selected project \""+context.getProject().getName()+"\" is not an ALIVE project.";
		}
	}

	public void unguardedRun() {
		IFile file = getURI() == null ? null : URIUtil.getFile(getURI());
		file = FileSelector.selectFile(context.getShell(), getFigure().getDescription(), ((IContainer)context.getProject()), file, getFileExtension());
		if (file == null) {
			return;
		}
		setURI(URI.createPlatformResourceURI(file.getFullPath().toString(), true));
		context.updateStatus();		
	}

	protected abstract ModelFigure getFigure();

	protected abstract URI getURI();

	protected abstract void setURI(URI uri);

	protected abstract String getFileExtension();
}
