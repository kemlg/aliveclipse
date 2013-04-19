package net.sf.ictalive.coordination.agents.diagram.oaw.handlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import net.sf.ictalive.coordination.agents.diagram.oaw.Activator;
import net.sf.ictalive.coordination.agents.diagram.oaw.util.PathUtils;
import net.sf.ictalive.coordination.agents.diagram.oaw.util.OawEclipseProjectResourceLoader;

import org.apache.commons.logging.LogFactory;
import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.ResourceUtil;


/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class GeneratorHandler extends AbstractHandler 
	{
	
	private static org.apache.commons.logging.Log logger = LogFactory.getLog(GeneratorHandler.class);
	private static final String SRC_GEN_FOLDER = "src-gen";
	private String templatePath;
	private String asPath;
	
	/**
	 * The constructor.
	 */
	public GeneratorHandler() {
		}

	
	
	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException 
		{			//Get the file the user is editing
		IFile file = ResourceUtil.getFile(HandlerUtil.getActiveEditor(event).getEditorInput());
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		Shell shell = window.getShell();
		return generateAgents(file, shell);
		}

	public URI generateAgents(IFile file, Shell shell){
		// Setup class loading for the logger.		
		ClassLoader before = Thread.currentThread().getContextClassLoader();
		Thread.currentThread().setContextClassLoader(GeneratorHandler.class.getClassLoader());		
		
		// Setup a console for the log output.
		MessageConsole console = null;
		IConsole[] consoles = ConsolePlugin.getDefault().getConsoleManager().getConsoles();
		for (IConsole c : consoles) {
			if (c.getName().equals("Code Generation")) 
				{
				ConsolePlugin.getDefault().getConsoleManager().showConsoleView(c);
				console = (MessageConsole) c;
				console.clearConsole();
				break;
				}
			}		
		if (console == null) 
			{
			console = new MessageConsole("Code Generation", null);
			ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[] { console });
			ConsolePlugin.getDefault().getConsoleManager().showConsoleView(console);
			
			final MessageConsoleStream stream = console.newMessageStream();
			
//			// Register the logger and add a loglistener.
			Log.registerToLogFactory();
			Log.addLogListener(new LogListener() 
				{
				@Override
				public void logEvent(LogEvent e) 
					{
					// Print the messages in the console stream.
					stream.println(e.getMessage());
					}
				});
			}	
		
		IProject project = file.getProject();
	
		String asFile = project.getLocation().toString() + File.separator + ASPathHandler.ASFILENAME;
		
		File agentscape = new File(asFile);
		
		if (agentscape.exists())
		{			
			try 
			{				
				FileReader fr = new FileReader(asFile);
				BufferedReader in = new BufferedReader(fr);
				asPath = in.readLine();	
				in.close();
				PathUtils.setAgentScapePath(asPath);
			}
			catch (Exception e)
			{
				MessageDialog.openError(shell,
						"Generating agents",
						"I/O Error"
						);
				Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID,"I/O Error generating agents " + e.getMessage(), e));
			}		    
		}
		else asPath = ASPathHandler.createASFile(project, shell);
		
		if (asPath == null) 
			return null;
		
		String modelFile = "";
		
		if (!file.getFileExtension().equals("mas"))
			{
			modelFile = file.getLocation().toString();
			modelFile = modelFile.substring(0, modelFile.lastIndexOf(".")) + ".mas";
			}
		else
			{
			modelFile = file.getLocation().toString();
			}
	
		String srcGen;			
			
		//Ask for a destination folder
//		InputDialog dlg = new InputDialog(shell,
//				"Generate agents",
//				"Name the destination folder",
//				"src-gen",
//				null);				
		
//		if (dlg.open() == Window.OK)
//			{
			srcGen = project.getLocation().toString()+File.separatorChar+SRC_GEN_FOLDER;// dlg.getValue();		
			PathUtils.setGeneratedFilesDir(srcGen);
//			}
//		
//		else
//			{
//			return null;
//			}

//Set the resource loader (needed to execute the workflow)
						
		OawEclipseProjectResourceLoader resourceLoader;
		try
			{
			boolean b = project.exists();
			resourceLoader = new OawEclipseProjectResourceLoader(project);
			ResourceLoaderFactory.setCurrentThreadResourceLoader(resourceLoader);
			
			}
		catch (CoreException e)
			{
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
			}
		
		WorkflowRunner runner = new WorkflowRunner();
		
			
//create agents			
		String workflowFile = "/net/sf/ictalive/coordination/agents/diagram/oaw/workflows/workflow.oaw";
		createJavaUsingTemplate(project,  modelFile, workflowFile, srcGen, before, runner);
					
//copy generic agent files
System.out.println("copying java files");
		try
			{
			copyGenericAgentFiles(project.getLocation().toString());
			}
		catch (Exception e)
			{
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID,  e.getMessage(), e));
			}
System.out.println(" Finished copying java files");

System.out.println("constructory to build agents");
		BuildAgents compileAndBuild = new BuildAgents(asPath, project.getLocation().toString(), SRC_GEN_FOLDER);//dlg.getValue());
System.out.println("compiling java files");
		compileAndBuild.compileAgents();
System.out.println("creating jars");
		compileAndBuild.createAgentJars();
		
		Log.unregisterToLogFactory();
		
		return URI.createPlatformResourceURI(srcGen, true);
		}

	
	public void createJavaUsingTemplate(IProject project, String modelFile, String workflowFile, String srcGen, ClassLoader before, WorkflowRunner runner)
		{
		Map<String, String> properties = new HashMap<String, String>();
		Map<String, ?> slotMap = new HashMap<String, Object>();
				
		
		//Get the workflow file
		URL r = GeneratorHandler.class.getResource(workflowFile);

		URL q = null;
		
		try 
			{
			q = FileLocator.toFileURL(r);
			templatePath = q.getPath();
			} 
		catch (IOException e1) 
			{
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, e1.getMessage(), e1));
			}
		File workflowfile = new File(q.getFile());	
		
		//Set the workflow's properties. 
		properties.put("modelFile", modelFile);
		
		properties.put("srcGenPath", srcGen);				
		properties.put("asHome", asPath);
		PathUtils.setAgentScapePath(asPath);
						
		try
			{			
			//Run the workflow
			runner.run(workflowfile.getAbsolutePath(), new NullProgressMonitor(), properties, slotMap);
			
			} 
		finally 
			{			
			//Go back to the initial state
			ResourceLoaderFactory.setCurrentThreadResourceLoader(null);
			Thread.currentThread().setContextClassLoader(before);	
			}

		}
	public void copyGenericAgentFiles(String destProjectLocation)
		{
System.out.println(templatePath);

//		templatePath = templatePath.substring(0, templatePath.lastIndexOf("/"));
//		templatePath = templatePath.substring(0, templatePath.lastIndexOf("/"));
//		String path = templatePath + "/templates";
		
		
		String path = asPath + "/agentCode/src";
		
		File destDirectory = new File(destProjectLocation + "/genericAgentFiles");
		destDirectory.mkdir();

		destDirectory = new File(destProjectLocation + "/genericAgentFiles/agents");
		destDirectory.mkdir();
		copyFiles(path, "/agents", destProjectLocation+ "/genericAgentFiles");

//now for the rest of the agent code
		destDirectory = new File(destProjectLocation + "/genericAgentFiles/net");
		destDirectory.mkdir();
		destDirectory = new File(destProjectLocation + "/genericAgentFiles/net/sf");
		destDirectory.mkdir();
		destDirectory = new File(destProjectLocation + "/genericAgentFiles/net/sf/ictalive");
		destDirectory.mkdir();
		destDirectory = new File(destProjectLocation + "/genericAgentFiles/net/sf/ictalive/agentcode");
		destDirectory.mkdir();
		
		
		path = path + "/net/sf/ictalive/agentcode";
		destProjectLocation = destProjectLocation + "/genericAgentFiles/net/sf/ictalive/agentcode";
		
		destDirectory = new File(destProjectLocation + "/clAgent");
		destDirectory.mkdir();
		
		copyFiles(path, "/clAgent", destProjectLocation);
		
		destDirectory = new File(destProjectLocation + "/pAgent");
		destDirectory.mkdir();
		copyFiles(path, "/pAgent", destProjectLocation);
		
		destDirectory = new File(destProjectLocation + "/eAgent");
		destDirectory.mkdir();
		copyFiles(path, "/eAgent", destProjectLocation);
		
		destDirectory = new File(destProjectLocation + "/eMessage");
		destDirectory.mkdir();
		copyFiles(path, "/eMessage", destProjectLocation);
		
		destDirectory = new File(destProjectLocation + "/clMessage");
		destDirectory.mkdir();
		copyFiles(path, "/clMessage", destProjectLocation);

		destDirectory = new File(destProjectLocation + "/agentWorldState");
		destDirectory.mkdir();
		copyFiles(path, "/agentWorldState", destProjectLocation);

		destDirectory = new File(destProjectLocation + "/sAgent");
		destDirectory.mkdir();
		copyFiles(path, "/sAgent", destProjectLocation);
		
		destDirectory = new File(destProjectLocation + "/utilities");
		destDirectory.mkdir();
		copyFiles(path, "/utilities", destProjectLocation);
		}

	public void copyFiles(String path, String pathEnd, String destProjectLocation)
		{

		String fullPath = path + pathEnd;
		File srcDirectory = new File(fullPath);

		if (srcDirectory.exists()){
			String[] allFiles = srcDirectory.list();
	
			if (allFiles==null){
				Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, "no files to copy from " +fullPath));
				return;
			}
			
			for(int i=0; i< allFiles.length; i++)
				{
				String fileName = allFiles[i];
				if(fileName.equals(".svn"))
					{
					continue;
					}
		//		fileName = fileName.substring(0, fileName.length()-5);
	
				String src = fullPath + "/"+ fileName;
	
				String dest = destProjectLocation + pathEnd +"/"+ fileName;
				try
					{
					copy(src, dest);
					}
				catch (IOException e)
					{
					logger.fatal(e.getMessage());
					Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, "there is an error in the copying: " + e.getMessage(), e));
					}
				}
		}
		}

	public void copy(String src, String dest)throws IOException
		{
//		src = src + ".java";
//		dest = dest + ".java";
		File destFile = new File(dest);
	    InputStream in = new FileInputStream(new File(src));
        OutputStream out = new FileOutputStream(destFile);
   
        // Transfer bytes from in to out
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) 
        	{
            out.write(buf, 0, len);
        	}
        in.close();
        out.close();
		}
	}
