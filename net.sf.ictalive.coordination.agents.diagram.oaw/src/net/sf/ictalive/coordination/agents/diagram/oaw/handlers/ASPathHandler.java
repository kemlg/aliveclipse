package net.sf.ictalive.coordination.agents.diagram.oaw.handlers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import net.sf.ictalive.coordination.agents.diagram.oaw.Activator;
import net.sf.ictalive.coordination.agents.diagram.oaw.util.PathUtils;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.ResourceUtil;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ASPathHandler extends AbstractHandler {

	public static final String ASFILENAME = "AgentScapePath";

	/**
	 * The constructor.
	 */
	public ASPathHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		createASFile(event);

		return null;
	}

	public static String createASFile(ExecutionEvent event)
			throws ExecutionException {
		// Get the file the user is editing
		IFile file = ResourceUtil.getFile(HandlerUtil.getActiveEditor(event)
				.getEditorInput());
		IProject project = file.getProject();

		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);
		Shell shell = window.getShell();
		return createASFile(project, shell);
	}

	public static String createASFile(IProject project, Shell shell) {
		String asFile = project.getLocation().toString() + File.separator
				+ ASFILENAME;
		System.out.println(asFile);

		// If we are not editing a mas file, abort
		// if (!file.getFileExtension().equals("mas"))
		// {
		// MessageDialog.openError(shell,"AgentScape settings","You are not in a .mas file!");
		// return null;
		// }

		// File to store the AgentScape installation path
		File agentscape = new File(asFile);

		DirectoryDialog dirDlg = new DirectoryDialog(shell);

		// Ask for the path
		dirDlg
				.setMessage("Select the AgentScape installation folder (Example: C:\\Program Files\\AgentScape):");
		dirDlg.setText("AgentScape settings");

		String asPath = dirDlg.open();

		if (asPath == null)
			return null;

		PathUtils.setAgentScapePath(asPath);
		
		try {
			// If the file exists, delete it
			if (agentscape.exists())
				agentscape.delete();

			// Create a new file and write the path in it
			agentscape.createNewFile();
			FileWriter fw = new FileWriter(asFile);
			BufferedWriter out = new BufferedWriter(fw);
			out.write(asPath);
			out.close();
		} catch (IOException e) {
			MessageDialog.openError(shell, "AgentScape settings", "I/O Error");
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID,
							"I/O Error, AgentScape settings " + e.getMessage(),
							e));
		}

		return asPath;
	}
}
