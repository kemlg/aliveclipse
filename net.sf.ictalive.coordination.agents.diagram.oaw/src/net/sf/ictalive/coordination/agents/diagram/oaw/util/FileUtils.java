/**
 * 
 */
package net.sf.ictalive.coordination.agents.diagram.oaw.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import net.sf.ictalive.coordination.agents.diagram.oaw.Activator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;

/**
 * @author dcorsar
 * 
 */
public class FileUtils {

	public static boolean copy(IFile sourceFile, File destDir) {
		return FileUtils.copy(sourceFile.getLocation().toFile(), destDir);
	}

	public static boolean copy(File sourceFile, File destDir) {
		if (sourceFile==null){
			return false;
		}
		if (!sourceFile.exists() ){
			return false;
		}
		if (!(destDir.exists()) || !(destDir.isDirectory())) {
			return false;
		}

		try {
			InputStream in = new FileInputStream(sourceFile);
			OutputStream out = new FileOutputStream(new File(destDir
					.getAbsolutePath()
					+ File.separatorChar + sourceFile.getName()));

			// Transfer bytes from in to out
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.flush();
			out.close();
			return true;
		} catch (FileNotFoundException e) {
			MessageDialog.openError(null, "Deriving Agent Code",
					"Error copying " + sourceFile.getName() + " to AgentScape");
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID,
							"Error copying " + sourceFile.getName()
									+ " to AgentScape", e));
			return false;
		} catch (IOException e) {
			MessageDialog.openError(null, "Deriving Agent Code",
					"Error copying " + sourceFile.getName() + " to AgentScape");
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID,
							"Error copying " + sourceFile.getName()
									+ " to AgentScape", e));
			return false;
		}
	}

}