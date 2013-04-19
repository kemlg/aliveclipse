/**
 * 
 */
package net.sf.ictalive.coordination.agents.diagram.oaw.util;

import static net.sf.ictalive.coordination.agents.diagram.oaw.util.PreferencesUtils.AGENTSCAPE_LOCATION;
import static net.sf.ictalive.coordination.agents.diagram.oaw.util.PreferencesUtils.AGENTSCAPE_SERVER;
import static net.sf.ictalive.coordination.agents.diagram.oaw.util.PreferencesUtils.AGENTSCAPE_PORT;
import static net.sf.ictalive.coordination.agents.diagram.oaw.util.PreferencesUtils.MAX_HEAP_SIZE;
import static net.sf.ictalive.coordination.agents.diagram.oaw.util.PreferencesUtils.NON_PROXY_HOSTS;
import static net.sf.ictalive.coordination.agents.diagram.oaw.util.PreferencesUtils.PROXY_HOST;
import static net.sf.ictalive.coordination.agents.diagram.oaw.util.PreferencesUtils.PROXY_PASSWORD;
import static net.sf.ictalive.coordination.agents.diagram.oaw.util.PreferencesUtils.PROXY_PORT;
import static net.sf.ictalive.coordination.agents.diagram.oaw.util.PreferencesUtils.PROXY_USER;

import java.io.File;
import java.io.PrintStream;

import net.sf.ictalive.coordination.agents.diagram.oaw.Activator;

import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

/**
 * Utility class for running ant build files
 * 
 * @author David Corsar
 *
 */
public class AntUtils {

	public static Project createAnyProject(File buildFile){
		// Execution of the build.xml file
		Project antProject = new Project();
		antProject.init();
		DefaultLogger logger = new DefaultLogger();
		MessageConsole myConsole = Activator.findConsole();
		MessageConsoleStream out = myConsole.newMessageStream();
		logger.setOutputPrintStream(new PrintStream(out));
		logger.setMessageOutputLevel(Project.MSG_VERBOSE);

		Activator.showConsole(myConsole);

		ProjectHelper.configureProject(antProject, buildFile);
		antProject.addBuildListener(logger);
		return antProject;
	}
	
	/**
	 * Executes the project's default target.
	 * @param project
	 */
	public static void run(Project project){
		project.executeTarget(project.getDefaultTarget());
	}
	
	public static void setAgentscapeBuildProperties(Project p){
		p.setUserProperty(AGENTSCAPE_LOCATION, PreferencesUtils.get(AGENTSCAPE_LOCATION));
		p.setUserProperty(AGENTSCAPE_SERVER, PreferencesUtils.get(AGENTSCAPE_SERVER));
		p.setUserProperty(AGENTSCAPE_PORT, PreferencesUtils.get(AGENTSCAPE_PORT));
		p.setUserProperty(MAX_HEAP_SIZE, PreferencesUtils.get(MAX_HEAP_SIZE));
		setProxyProperties(p);
	}
	
	public static void setProxyProperties(Project p){
		p.setUserProperty(PROXY_HOST, PreferencesUtils.get(PROXY_HOST));
		p.setUserProperty(PROXY_PORT, PreferencesUtils.get(PROXY_PORT));
		p.setUserProperty(PROXY_USER, PreferencesUtils.get(PROXY_USER));
		p.setUserProperty(PROXY_PASSWORD, PreferencesUtils.get(PROXY_PASSWORD));
		p.setUserProperty(NON_PROXY_HOSTS, PreferencesUtils.get(NON_PROXY_HOSTS));
	}
	
}
