package net.sf.ictalive.coordination.agents.diagram.oaw.handlers;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;

import net.sf.ictalive.coordination.agents.diagram.oaw.Activator;
import net.sf.ictalive.coordination.agents.diagram.oaw.util.ExecThread;
import net.sf.ictalive.coordination.agents.diagram.oaw.util.FileUtils;
import net.sf.ictalive.coordination.agents.diagram.oaw.util.PathUtils;
import net.sf.ictalive.aliveclipse.dashboard.Plugin;

import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.ResourceUtil;
import org.iids.aos.agent.Agent;
import org.iids.aos.agentserver.java.JavaAgentRunner;
import org.iids.aos.api.AgentScapeApi;
import org.iids.aos.api.AgentScapeClient;
import org.iids.aos.systemservices.communicator.structs.AgentInfo;
import org.iids.aos.systemservices.communicator.structs.AgentScapeID;
import org.iids.aos.systemservices.datatypes.wsagreement.agentscape.Language;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class InjectorHandler extends AbstractHandler {

	private String asPath;

	/**
	 * The constructor.
	 */
	public InjectorHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		{
			IFile file = ResourceUtil.getFile(HandlerUtil.getActiveEditor(event)
					.getEditorInput());
			IProject project = file.getProject();
			IWorkbenchWindow window = HandlerUtil
					.getActiveWorkbenchWindowChecked(event);
			Shell shell = window.getShell();
			String asFile = project.getLocation().toString() + File.separator
					+ ASPathHandler.ASFILENAME;
			
			File agentscape = new File(asFile);
			
			if (agentscape.exists()) {
				try {
					FileReader fr = new FileReader(asFile);
					BufferedReader in = new BufferedReader(fr);

					asPath = in.readLine();
					PathUtils.setAgentScapePath(asPath);
					in.close();
				} catch (Exception e) {
					MessageDialog.openError(shell, "Inject agents into AgentScape",
							"I/O Error");
					Activator.getDefault().getLog().log(
							new Status(Status.ERROR, Activator.PLUGIN_ID,
									"Error injecting agents into AgentScape"
											+ e.getMessage(), e));
				}
			} else
				asPath = ASPathHandler.createASFile(event);
			
			
//			IWorkbenchWindow window = HandlerUtil
//					.getActiveWorkbenchWindowChecked(event);
//			Shell shell = window.getShell();
			
			
			
			invokeRunAgentScapeBuildFile(shell);
		}
		return null;
	}

	private Object oldExecute(ExecutionEvent event) throws ExecutionException {
		// Get the file the user is editing
		IFile file = ResourceUtil.getFile(HandlerUtil.getActiveEditor(event)
				.getEditorInput());
		IProject project = file.getProject();
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);
		Shell shell = window.getShell();
		String folder;
		String asFile = project.getLocation().toString() + File.separator
				+ ASPathHandler.ASFILENAME;
		byte jar[];
		File[] classes;
		AgentInfo info;

		// If we are not in a mas file, abort
		// if (!file.getFileExtension().equals("mas"))
		// {
		// MessageDialog.openError(window.getShell(),"Inject agents","You are not in a .mas file!");
		// return null;
		// }

		// Get the AgentScape installation path or ask for it and write it in a
		// new file
		File agentscape = new File(asFile);

		if (agentscape.exists()) {
			try {
				FileReader fr = new FileReader(asFile);
				BufferedReader in = new BufferedReader(fr);

				asPath = in.readLine();
				PathUtils.setAgentScapePath(asPath);
				in.close();
			} catch (Exception e) {
				MessageDialog.openError(shell, "Inject agents into AgentScape",
						"I/O Error");
				Activator.getDefault().getLog().log(
						new Status(Status.ERROR, Activator.PLUGIN_ID,
								"Error injecting agents into AgentScape"
										+ e.getMessage(), e));
			}
		} else
			asPath = ASPathHandler.createASFile(event);

		if (asPath == null)
			return null;

		// Ask for the folder with the agents to inject
		InputDialog dlg = new InputDialog(shell,
				"Inject agents into AgentScape",
				"Name the folder containing the generated agents:", "src-gen",
				null);

		if (dlg.open() == Window.OK) {
			folder = project.getLocation().toString();
			PathUtils.setGeneratedFilesDir(folder);
		} else {
			return null;
		}

		// String genericFolder =
		// project.getLocation().toString()+"/genericAgentFiles";
		// buildAgents(folder, "genericAgentFiles");
		// Compilation of the agents using ant
		// buildAgents(folder, dlg.getValue());

		try {
			// Try to communicate with AgentScape
			AgentScapeApi api = AgentScapeClient.getAgentScapeClient();

			// In case AgentScape is not running, start a new instance of it
			// while (api == null)
			// {
			// String port = "";
			//       	
			// dlg = new InputDialog(shell,
			// "Inject agents into AgentScape",
			// "Select a port for the AgentScape lookup server:",
			// "5555",
			// null);

			// if (dlg.open() == Window.OK) port = dlg.getValue();
			//       		
			// else return null;

			// Start AgentScape
			// startAS(port);

			// api = AgentScapeClient.getAgentScapeClient();
			// }

			// Get the first location we find in AgentScape
			AgentScapeID loc = Agent.getLocations(api).get(0);

			Language lang = new Language();
			lang.setContent(JavaAgentRunner.getJavaLanguage());

			folder = project.getLocation().toString() + "/classes";

			// create matchmaker jar
			// jar = createMatchmakerJar(folder);

			// info = api.createAgent(loc, lang);
			// api.writeCodeSegment(info.getOwnerHandle(),"",lang,jar);
			// api.startAgent(info.getOwnerHandle(),"");

			// create all clAgents
			classes = new File(folder + File.separator + "generatedAgents")
					.listFiles();
			/*
			 * try { for (int i = 0; i < classes.length; i++) {
			 * System.out.println(classes[i].getAbsolutePath()); jar =
			 * createCoordinationAgentJar(folder, classes[i]);
			 * 
			 * // Inject the agent info = api.createAgent(loc, lang);
			 * api.writeCodeSegment(info.getOwnerHandle(), "", lang, jar);
			 * api.startAgent(info.getOwnerHandle(), "");
			 * 
			 * } } catch (AgentStartupException ae) { ae.printStackTrace(); }
			 */
			// create planning agent jar

			jar = createPlanningAgentJar(folder);

			info = api.createAgent(loc, lang);
			api.writeCodeSegment(info.getOwnerHandle(), "", lang, jar);

			api.startAgent(info.getOwnerHandle(), "");

			// create event agent jar
			jar = createEventJar(folder);

			info = api.createAgent(loc, lang);
			api.writeCodeSegment(info.getOwnerHandle(), "", lang, jar);

			api.startAgent(info.getOwnerHandle(), "");
		} catch (Exception e) {
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID, e
							.getMessage(), e));
		}

		return null;
	}

	/**
	 * Compiles the Java files located in the folder parameter using ant and
	 * places the output classes in folder/classes.
	 * 
	 * @param folder
	 *            - Path to a directory containing Java files.
	 */
	private void buildAgents(String folder, String endDirectory) {
		try {
			// Get the build.xml file
			URL r = InjectorHandler.class.getResource("/build.xml");
			URL q = FileLocator.toFileURL(r);

			File buildFile = new File(q.getFile());

			// Execution of the build.xml file
			Project antProject = new Project();
			antProject.init();
			DefaultLogger logger = new DefaultLogger();
			logger.setOutputPrintStream(System.out);
			logger.setMessageOutputLevel(Project.MSG_VERBOSE);

			ProjectHelper.configureProject(antProject, buildFile);
			antProject.addBuildListener(logger);
			antProject.setUserProperty("asJar", asPath
					+ "\\lib\\agentscape-common.jar");
			antProject.setUserProperty("asJar1", asPath + "\\lib\\taems.jar");
			antProject.setUserProperty("asJar3", asPath
					+ "\\lib\\utilities.jar");
			antProject.setUserProperty("asJar5", asPath
					+ "\\lib\\OperettA_0.5.7.jar");
			antProject
					.setUserProperty(
							"asJar6",
							asPath
									+ "\\lib\\org.eclipse.emf.ecore.xmi_2.5.0.v200906151043.jar");
			antProject.setUserProperty("asJar7", asPath
					+ "\\lib\\org.eclipse.emf.ecore_2.5.0.v200906151043.jar");
			antProject.setUserProperty("asJar8", asPath
					+ "\\lib\\org.eclipse.emf.common_2.5.0.v200906151043.jar");
			antProject.setUserProperty("asJar9", asPath
					+ "\\lib\\CoordinationModel_0.3.1.jar");
			antProject.setUserProperty("asJar10", asPath
					+ "\\lib\\Coordination_1.0.0.jar");
			antProject.setUserProperty("asJar11", asPath + "\\lib\\events.jar");
			antProject.setUserProperty("asJar12", asPath
					+ "\\lib\\Schema_1.0.0.jar");
			antProject.setUserProperty("asJar13", asPath
					+ "\\lib\\Services_1.0.0.jar");
			antProject.setUserProperty("asJar14", asPath
					+ "\\lib\\SWRL_1.0.0.jar");

			antProject.setUserProperty("srcDir", (folder + "/" + endDirectory));
			antProject
					.setUserProperty("srcDir2", folder + "/genericAgentFiles");
			antProject
					.setUserProperty(
							"srcDir3",
							asPath
									+ "/build/java/org/iids/aos/webservices/wsdl/Jshop2PlanSynthesisWS");

			antProject.setUserProperty("destDir", folder + "/classes");
			antProject.executeTarget("compile");
		} catch (Exception e) {
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID, e
							.getMessage(), e));
		}
	}

	/**
	 * Runs an AgentScape lookup service in the specified port and starts
	 * AgentScape in two different threads.
	 * 
	 * @param port
	 *            - The port of the lookup service.
	 */
	private void startAS(String port) {
		try {
			// First, start a lookup server in the specified port
			System.out.println();
			System.out.println("starting AGENTSCAPE");
			System.out.println();

			System.out.println(asPath);
			// ExecThread exec = new
			// ExecThread("java -jar \""+asPath+"\\lib\\aslookup.jar\" "+port);
			// ExecThread exec = new
			// ExecThread("java -jar \""+asPath+"/lib/aslookup.jar\" "+port);

			String aslookupText = "java -jar " + asPath + "/lib/aslookup.jar "
					+ port;
			System.out.println(aslookupText);
			ExecThread exec = new ExecThread(aslookupText);
			exec.start();
			if (exec.isAlive())
				System.out.println("aslookup is alive");
			else
				System.out.println("aslookup is not alive");

			// Second, start AgentScape creating a new location named
			// DefaultLocation
			// exec = new
			// ExecThread("java -jar \""+asPath+"\\lib\\asstartup.jar\" " +
			// "-nocpu -L http://localhost:"+port+" -nows -jvm 1 -p 0 0 0 0 -sp 0 DefaultLocation");
			// exec = new
			// ExecThread("java -jar \""+asPath+"/lib/asstartup.jar\" " +
			// "-nocpu -L http://localhost:"+port+" -nows -jvm 1 -p 0 0 0 0 -sp 0 DefaultLocation");

			String asstartupText = "java -jar " + asPath
					+ "/lib/asstartup.jar " + "-nocpu -L http://localhost:"
					+ port + " -nows -jvm 1 -p 0 0 0 0 -sp 0 DefaultLocation";
			System.out.println(asstartupText);
			exec = new ExecThread(asstartupText);

			exec.start();
			if (exec.isAlive())
				System.out.println("aslookup is alive");
			else
				System.out.println("aslookup is not alive");

			// Wait for AgentScape to start
			Thread.sleep(10000);
		} catch (Exception e) {
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID, e
							.getMessage(), e));
		}

	}

	/**
	 * Creates a JAR containing a File.
	 * 
	 * @param file
	 *            - The file to be included in the JAR.
	 * @return A JAR file as a byte array.
	 */
	private byte[] createEventJar(String folder) {
		byte buffer[] = new byte[10240];
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		;
		JarOutputStream out;
		String eaFolder = folder + "/eAgent";
		String messageFolder = folder + "/eMessage";

		String efileName = "eAgent.EventAgent";

		// Creation of the manifest, defining the main class of the JAR file
		StringBuilder sb = new StringBuilder();
		sb.append("Manifest-Version: 1.0\n");
		sb.append("Main-Class: " + efileName + "\n");

		byte[] manifest = sb.toString().getBytes();

		try {
			// add manifest to jar
			out = new JarOutputStream(stream);
			out.putNextEntry(new JarEntry("META-INF/MANIFEST.MF"));
			out.write(manifest);
			out.closeEntry();

			// Reading the files in mmAgent folder and writing it to the JAR
			// file
			String outputFolder = "eAgent/";
			addClassesToJar(out, buffer, eaFolder, outputFolder);

			// Reading the files in message folder and writing it to the JAR
			// file
			outputFolder = "eMessage/";
			addClassesToJar(out, buffer, messageFolder, outputFolder);

			// Reading the files in worldstate folder and writing it to the JAR
			// file
			outputFolder = "agentWorldState/";
			String inputFolder = folder + "/agentWorldState";
			addClassesToJar(out, buffer, inputFolder, outputFolder);

			out.close();
			stream.close();
		} catch (Exception e) {
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID, e
							.getMessage(), e));
		}

		System.out.println("Starting EventAgent");
		// output jar to AgentScape

		outputJarToAgentScape(stream, "EventAgent");

		return (stream.toByteArray()); // this is the jar to inject
	}

	private byte[] createPlanningAgentJar(String folder) {
		byte buffer[] = new byte[10240];
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		JarOutputStream out;
		String mmFolder = folder + "/pAgent";
		String messageFolder = folder + "/clMessage";

		String mmfileName = "pAgent.PlanningAgent";

		// Creation of the manifest, defining the main class of the JAR file
		StringBuilder sb = new StringBuilder();
		sb.append("Manifest-Version: 1.0\n");
		sb.append("Main-Class: " + mmfileName + "\n");

		byte[] manifest = sb.toString().getBytes();

		try {
			// add manifest to jar
			out = new JarOutputStream(stream);
			out.putNextEntry(new JarEntry("META-INF/MANIFEST.MF"));
			out.write(manifest);
			out.closeEntry();

			// Reading the files in pAgent folder and writing it to the JAR file
			String outputFolder = "pAgent/";
			addClassesToJar(out, buffer, mmFolder, outputFolder);

			// Reading the files in message folder and writing it to the JAR
			// file
			outputFolder = "clMessage/";
			addClassesToJar(out, buffer, messageFolder, outputFolder);

			// Reading the files in eMessage folder and writing it to the JAR
			// file
			outputFolder = "eMessage/";
			String inputFolder = folder + "/eMessage";
			addClassesToJar(out, buffer, inputFolder, outputFolder);

			// Reading the files in worldstate folder and writing it to the JAR
			// file
			outputFolder = "agentWorldState/";
			inputFolder = folder + "/agentWorldState";
			addClassesToJar(out, buffer, inputFolder, outputFolder);

			// Reading the files in webservice folder and writing it to the JAR
			// file
			outputFolder = "org/iids/aos/webservices/wsdl/Jshop2PlanSynthesisWS/";
			inputFolder = asPath
					+ "/build/classes/org/iids/aos/webservices/wsdl/Jshop2PlanSynthesisWS";

			addClassesToJar(out, buffer, inputFolder, outputFolder);

			// Reading the files in axisstub folder and writing it to the JAR
			// file
			outputFolder = "org/iids/aos/webservices/axisstub/";
			inputFolder = asPath
					+ "/build/classes/org/iids/aos/webservices/axisstub";
			addClassesToJar(out, buffer, inputFolder, outputFolder);

			// Reading the files in message folder and writing it to the JAR
			// file
			outputFolder = "org/iids/aos/webservices/axisstub/aosrpc/";
			inputFolder = asPath
					+ "/build/classes/org/iids/aos/webservices/axisstub/aosrpc";
			addClassesToJar(out, buffer, inputFolder, outputFolder);

			// Reading the files in message folder and writing it to the JAR
			// file
			outputFolder = "wsdl/";
			inputFolder = asPath + "/src/wsdl";
			addClassesToJar(out, buffer, inputFolder, outputFolder);

			out.close();
			stream.close();
		} catch (Exception e) {
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID, e
							.getMessage(), e));
		}

		System.out.println("Starting PlanningAgent");

		// output jar to AgentScape

		outputJarToAgentScape(stream, "PlanningAgent");

		return (stream.toByteArray()); // this is the jar to inject
	}

	private void addClassesToJar(JarOutputStream out, byte[] buffer,
			String inputFolder, String outputFolder) {
		int nRead;
		File[] classes = new File(inputFolder).listFiles();
		for (int i = 0; i < classes.length; i++) {
			File addClass = classes[i];
			if (addClass.isDirectory() == true)
				continue;

			FileInputStream in;
			try {
				in = new FileInputStream(addClass);
				out
						.putNextEntry(new JarEntry(outputFolder
								+ addClass.getName()));
				while (true) {
					nRead = in.read(buffer, 0, buffer.length);
					if (nRead <= 0) {
						break;
					}
					out.write(buffer, 0, nRead);
				}
				out.closeEntry();
				in.close();
			} catch (Exception e) {
				Activator.getDefault().getLog().log(
						new Status(Status.ERROR, Activator.PLUGIN_ID, e
								.getMessage(), e));
			}
		}
	}

	/**
	 * Creates a JAR containing a File.
	 * 
	 * @param file
	 *            - The file to be included in the JAR.
	 * @return A JAR file as a byte array.
	 */
	private byte[] createCoordinationAgentJar(String folder, File file) {
		byte buffer[] = new byte[10240];
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		JarOutputStream out;
		int nRead;
		String fileName = file.getName();

		fileName = fileName.substring(0, fileName.length() - 6);

		String clFolder = folder + "/clAgent";
		String messageFolder = folder + "/agents";
		String eMessageFolder = folder + "/eMessage";
		String clMessageFolder = folder + "/clMessage";

		String clfileName = "generatedAgents." + fileName;

		// Creation of the manifest, defining the main class of the JAR file
		StringBuilder sb = new StringBuilder();
		sb.append("Manifest-Version: 1.0\n");
		sb.append("Main-Class: " + clfileName + "\n");

		byte[] manifest = sb.toString().getBytes();

		try {
			// add manifest to jar
			out = new JarOutputStream(stream);
			out.putNextEntry(new JarEntry("META-INF/MANIFEST.MF"));
			out.write(manifest);
			out.closeEntry();

			// read the agent file and write to the jar
			FileInputStream in = new FileInputStream(file);
			out.putNextEntry(new JarEntry("generatedAgents/" + file.getName()));
			while (true) {
				nRead = in.read(buffer, 0, buffer.length);

				if (nRead <= 0) {
					break;
				}
				out.write(buffer, 0, nRead);
			}
			out.closeEntry();
			in.close();

			// Reading the files in clAgent folder and writing it to the JAR
			// file
			String outputFolder = "clAgent/";
			addClassesToJar(out, buffer, clFolder, outputFolder);

			// Reading the files in message folder and writing it to the JAR
			// file
			outputFolder = "agents/";
			addClassesToJar(out, buffer, messageFolder, outputFolder);

			// Reading the files in eMessage folder and writing it to the JAR
			// file
			outputFolder = "eMessage/";
			addClassesToJar(out, buffer, eMessageFolder, outputFolder);

			// Reading the files in clMessage folder and writing it to the JAR
			// file
			outputFolder = "clMessage/";
			addClassesToJar(out, buffer, clMessageFolder, outputFolder);

			// Reading the files in worldstate folder and writing it to the JAR
			// file
			outputFolder = "agentWorldState/";
			String inputFolder = folder + "/agentWorldState";
			addClassesToJar(out, buffer, inputFolder, outputFolder);

			out.close();
			stream.close();
		} catch (Exception e) {
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID, e
							.getMessage(), e));
		}
		// output jar to AgentScape

		outputJarToAgentScape(stream, fileName);

		return stream.toByteArray();
	}

	public void outputJarToAgentScape(ByteArrayOutputStream stream,
			String jarName) {
		try {
			String outputJar = asPath + "/lib/agents/" + jarName + ".jar";
			System.out.println(outputJar);
			// FileOutputStream worldOut = new FileOutputStream(new
			// File(outputJar));
			FileOutputStream world = new FileOutputStream(new File(outputJar));

			// jar.write(world);
			stream.writeTo(world);

			// world.writeObject(jar);
			world.close();
		}

		catch (IOException e) {
			System.out.println("jar not stored");
			System.out.println(e.toString());
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID,
							"jar not stored " + e.getMessage(), e));
		}
	}

	private boolean getGeneratedFilesDir(Shell shell) {
		String dir = PathUtils.getGeneratedFilesDir();
		if (dir != null) {
			return true;
		}
		ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(
				shell, ResourcesPlugin.getWorkspace().getRoot(),
				IResource.FOLDER);
		dialog.setTitle("Select generated files directory ");
		dialog
				.setMessage("Select directory contained generated build file (? = any character, * = any string):");
		int open = dialog.open();
		if (open == ResourceListSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				IFolder selectedFile = (IFolder) result[0];
				dir = selectedFile.getLocation().toPortableString();
				PathUtils.setGeneratedFilesDir(dir);
				return true;
			}
		}
		return false;

	}

	private void invokeRunAgentScapeBuildFile(Shell shell) {

		ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(
				shell, ResourcesPlugin.getWorkspace().getRoot(), IResource.FILE);
		File destDir = new File(PathUtils.getAgentScapePath()
				+ "/input/CoordinationModel");

		// ask user to select the plan file
		IFile planFile = promptForFile(dialog, "Select Plan file",
				"Select a plan file (extension .plans) containing the plan to enact");

		if (planFile == null) {
			return;
		}

		// ask user to select the task file
		IFile taskFile = promptForFile(dialog, "Select Task file",
				"Select a task file (extension .tasks) containing the task to achieve");

		if (taskFile == null || !FileUtils.copy(planFile, destDir) || !FileUtils.copy(taskFile, destDir)) {
			return;
		}
		
		File buildFile = new File(PathUtils.getAgentScapePath()
				+ File.separatorChar
				+ PathUtils.getRunAgentScapeBuildFileName());

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
		
		antProject.executeTarget(antProject.getDefaultTarget());
	}
	
	private IFile promptForFile(ResourceListSelectionDialog dialog,
			String dialogTitle, String dialogMessage) {
		dialog.setTitle(dialogTitle);
		dialog.setMessage(dialogMessage);
		int open = dialog.open();
		if (open == ResourceListSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				IFile selectedFile = (IFile) result[0];
				return selectedFile;
			}
		}
		return null;
	}

}
