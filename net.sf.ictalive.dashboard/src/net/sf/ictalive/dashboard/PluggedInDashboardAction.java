package net.sf.ictalive.dashboard;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.internal.common.URIUtil;

@SuppressWarnings("restriction")
public abstract class PluggedInDashboardAction<S> {

	public abstract String dashboardActionId();

	public abstract String getProblems(S state);
	
	public abstract void run(S state);

	// utility functions for converting between URIs and files or OS-specific file path strings
	
	protected String uriToOSFilePath(URI uri) {
		return uri == null ? null : 
			URIUtil.getFile(uri).getFullPath().toOSString();
	}

	protected IFile uriToFile(URI uri) {
		return uri == null ? null : URIUtil.getFile(uri);
	}
	
	protected URI osFilePathToURI(String filePath) {
		return filePath == null ? null : URI.createFileURI(filePath);
	}

	protected URI fileToURI(IFile file) {
		return file == null ? null : URI.createPlatformResourceURI( file.getFullPath().toOSString(), false);
	}

}
