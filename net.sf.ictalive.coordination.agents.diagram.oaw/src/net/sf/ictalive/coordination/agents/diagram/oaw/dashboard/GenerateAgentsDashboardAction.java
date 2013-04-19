/**
 * 
 */
package net.sf.ictalive.coordination.agents.diagram.oaw.dashboard;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import net.sf.ictalive.aliveclipse.dashboard.AliveDashboardState;
import net.sf.ictalive.coordination.agents.diagram.oaw.Activator;
import net.sf.ictalive.coordination.agents.diagram.oaw.handlers.GeneratorHandler;
import net.sf.ictalive.coordination.agents.diagram.oaw.util.FileUtils;
import net.sf.ictalive.coordination.agents.diagram.oaw.util.PathUtils;
import net.sf.ictalive.dashboard.PluggedInDashboardAction;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * Dashboard action for generating the AgentScape agent code from the selected
 * MAS
 * 
 * @author dcorsar
 * 
 */
public class GenerateAgentsDashboardAction extends PluggedInDashboardAction<AliveDashboardState> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sf.ictalive.dashboard.action.DashboardAction#dashboardActionId()
	 */
	@Override
	public String dashboardActionId() {
		return AliveDashboardState.DeriveAgentsFromMASId;
	}

	@Override
	public String getProblems(AliveDashboardState state) {
		if(null != state.getMAS()) return null;//no problems to report, active the button
		
		return "No MAS Model selected.";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.sf.ictalive.dashboard.action.DashboardAction#run(net.sf.ictalive.
	 * dashboard.DashboardState)
	 */
	@Override
	public void run(AliveDashboardState state) {
		URI agentModel = state.getMAS();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IFile modelFile = root.getFile(new Path(agentModel
				.toPlatformString(true)));
		if (modelFile.exists()) {
			IProject p = modelFile.getProject();
			GeneratorHandler generator = new GeneratorHandler();
			Shell shell = net.sf.ictalive.coordination.agents.diagram.oaw.Activator
					.getDefault().getWorkbench().getActiveWorkbenchWindow()
					.getShell();
			URI dest = generator.generateAgents(modelFile, shell);
			if (dest != null)
				state.setAgents(dest);// TODO: setAgents will be implemented again soon

			File orgFile = getFile(state.getOrganisation());
			String name = orgFile.getName().split("\\.")[0];
			File mapping = new File(orgFile.getParentFile().getAbsolutePath()+File.separatorChar+name+".OLCLMap");
			setupASModelFolders(getFile(state.getOntology()), getFile(state.getAction()), orgFile, mapping);
		}

	}

	private File getFile(URI uri) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IFile f = root.getFile(new Path(uri.toPlatformString(true)));
		return f.getLocation().toFile();
	}

	private void setupASModelFolders(File ontology, File actionFile, File operaFile, File olClMapFile) {
		String asPath = PathUtils.getAgentScapePath();
		File coordFolder = new File(asPath + "/input/CoordinationModel/"), orgFolder = new File(
				asPath + "/input/OrganisationModel/"), ontologyFolder = new File(asPath+"/input/OntologyModel/");
		deleteDirectoryFileContents(new File(asPath + "/input/"));
		deleteDirectoryFileContents(coordFolder);
		deleteDirectoryFileContents(orgFolder);
		deleteDirectoryFileContents(ontologyFolder);

		FileUtils.copy(actionFile, coordFolder);
		FileUtils.copy(operaFile, orgFolder);
		FileUtils.copy(olClMapFile, orgFolder);
		FileUtils.copy(ontology, ontologyFolder);
	}

	private void deleteDirectoryFileContents(File as) {
		if (as != null && as.exists() && as.isDirectory()) {
			for (File f : as.listFiles()) {
				if (f.isFile()) {
					f.delete();
				}
			}
		}
	}
}