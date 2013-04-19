/**
 * 
 */
package net.sf.ictalive.coordination.plansynthesis.eclipseplugin.dashboard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;

/**
 * @author David Corsar
 * 
 */
public class FileUtils {

	public static String getFilePath(URI uri) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		String platformString = uri.toPlatformString(true);
		if (platformString != null) {
			IFile f = root.getFile(new Path(platformString));
			if (f != null)
				return f.getLocation().toOSString();
		}
		return uri.toFileString();
	}

}
