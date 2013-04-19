package net.sf.ictalive.coordination.agents.diagram.oaw.handlers;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;

import net.sf.ictalive.coordination.agents.diagram.oaw.Activator;

import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;


/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class BuildAgents {
	
	private String asPath;
	private String folderLocation;
	private String src_gen;
	
	
	/**
	 * The constructor.
	 */
	public BuildAgents(String path, String folder, String endDirectory) 
		{
		asPath = path;
		folderLocation = folder;
		src_gen = endDirectory;
System.out.println(asPath);
System.out.println(folderLocation);
System.out.println(src_gen);
		
	}

//		buildAgents(folder, dlg.getValue());
 		
	public void compileAgents()
		{
		try
			{
			//Get the build.xml file
//			URL r = InjectorHandler.class.getResource("/build.xml");
			URL r = BuildAgents.class.getResource("/AgentBuild.xml");
			URL q = FileLocator.toFileURL(r);		

			File buildFile = new File(q.getFile());
			
			//Execution of the build.xml file
			Project antProject = new Project();
			antProject.init();
			DefaultLogger logger = new DefaultLogger();
			MessageConsole myConsole = Activator.findConsole();
			MessageConsoleStream out = myConsole.newMessageStream();
			logger.setOutputPrintStream(new PrintStream(out));
			logger.setMessageOutputLevel(Project.MSG_VERBOSE);

			Activator.showConsole(myConsole);
			
			ProjectHelper.configureProject(antProject,buildFile);
			antProject.addBuildListener(logger);
			antProject.setUserProperty( "asJar",asPath+"\\lib\\agentscape-common.jar");
			antProject.setUserProperty( "asJar1",asPath+"\\lib\\taems.jar");
			antProject.setUserProperty( "asJar3",asPath+"\\lib\\utilities.jar");
			antProject.setUserProperty( "asJar5",asPath+"\\lib\\net.sf.ictalive.operetta_1.0.0.jar");
			antProject.setUserProperty( "asJar6",asPath+"\\lib\\org.eclipse.emf.ecore.xmi_2.5.0.v200906151043.jar");
			antProject.setUserProperty( "asJar7",asPath+"\\lib\\org.eclipse.emf.ecore_2.5.0.v200906151043.jar");
			antProject.setUserProperty( "asJar8",asPath+"\\lib\\org.eclipse.emf.common_2.5.0.v200906151043.jar");
			antProject.setUserProperty( "asJar10",asPath+"\\lib\\net.sf.ictalive.coordination_1.0.0.jar");
			antProject.setUserProperty( "asJar11",asPath+"\\lib\\net.sf.ictalive.runtime_1.0.2.jar");
//			antProject.setUserProperty( "asJar12",asPath+"\\lib\\Schema_1.0.0.jar");
			antProject.setUserProperty( "asJar13",asPath+"\\lib\\net.sf.ictalive.services_1.0.0.jar");
			antProject.setUserProperty( "asJar14",asPath+"\\lib\\net.sf.ictalive.rules_1.0.3.jar");
			
			antProject.setUserProperty("srcDir",(folderLocation+"/" + src_gen));
			antProject.setUserProperty("srcDir2",folderLocation+"/genericAgentFiles");
			antProject.setUserProperty("srcDir3",asPath+"/build/java/org/iids/aos/webservices/wsdl/Jshop2PlanSynthesisWebService");
			
			antProject.setUserProperty("destDir",folderLocation+"/classes");
			antProject.executeTarget("compile");
			}
		catch (Exception e) 
			{
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
			} 
		}

	public void createAgentJars()
		{
		
		try
			{
			String folder = folderLocation + "/classes";
			
//create all clAgents
			File[] classes = new File(folder+ File.separator + "generatedAgents").listFiles();	
			
			for (int i=0; i<classes.length; i++)
				{
System.out.println (classes[i].getAbsolutePath());
				createCoordinationAgentJar(folder, classes[i]);	   	
				}
						
//create planning agent jar	
 			createPlanningAgentJar(folder);
	
//create event agent jar
			createEventJar(folder);
			
//create servlet agent jar
			createServletJar(folder);

 			}
		catch (Exception e)
			{
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
			}
		}
	
	
	private void createServletJar(String folder)
		{
		byte buffer[] = new byte[10240];
		ByteArrayOutputStream stream = new ByteArrayOutputStream();;
		JarOutputStream out;
		String eMessageFolder = folder +"/net/sf/ictalive/agentcode/eMessage";
		String agentWSFolder = folder +"/net/sf/ictalive/agentcode/agentWorldState";
		String sAgentFolder = folder +"/net/sf/ictalive/agentcode/sAgent";
		String clMessageFolder = folder +"/net/sf/ictalive/agentcode/clMessage";
		String utilitiesFolder = folder +"/net/sf/ictalive/agentcode/utilities";
		
		String efileName = "net.sf.ictalive.agentcode.sAgent.ServletAgent";
		
//Creation of the manifest, defining the main class of the JAR file
		StringBuilder sb = new StringBuilder();
		sb.append("Manifest-Version: 1.0\n");
		sb.append("Main-Class: " + efileName + "\n");
		
		byte[] manifest = sb.toString().getBytes();
		
		try 
			{
//add manifest to jar
			out = new JarOutputStream(stream);
			out.putNextEntry(new JarEntry("META-INF/MANIFEST.MF"));
			out.write(manifest);
			out.closeEntry();
			
//Reading the files in sAgent folder and writing it to the JAR file
			String outputFolder = "net/sf/ictalive/agentcode/sAgent/";
			addClassesToJar(out, buffer, sAgentFolder, outputFolder);

//Reading the files in eMessage folder and writing it to the JAR file
			outputFolder = "net/sf/ictalive/agentcode/eMessage/";
			addClassesToJar(out, buffer, eMessageFolder, outputFolder);

//Reading the files in worldstate folder and writing it to the JAR file
			outputFolder = "net/sf/ictalive/agentcode/agentWorldState/";
			addClassesToJar(out, buffer, agentWSFolder, outputFolder);
			
//Reading the files in clMessage folder and writing it to the JAR file
			outputFolder = "net/sf/ictalive/agentcode/clMessage/";
			addClassesToJar(out, buffer, clMessageFolder, outputFolder);

//Reading the files in utilities folder and writing it to the JAR file
			outputFolder = "net/sf/ictalive/agentcode/utilities/";
			addClassesToJar(out, buffer, utilitiesFolder, outputFolder);

			out.close();
			stream.close();		
			}
		catch (Exception e)
			{
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
			}
		
		System.out.println("creating ServletAgent jar");	
		outputJarToAgentScape(stream, "ServletAgent");
		
		}

	/**
	 * Creates a JAR containing a File.
	 * 
	 * @param file - The file to be included in the JAR.
	 * 
	 */
	private void createEventJar (String folder)
		{		
		byte buffer[] = new byte[10240];
		ByteArrayOutputStream stream = new ByteArrayOutputStream();;
		JarOutputStream out;
		String eaFolder = folder + "/net/sf/ictalive/agentcode/eAgent";
		String messageFolder = folder +"/net/sf/ictalive/agentcode/eMessage";
		String inputFolder = folder +"/net/sf/ictalive/agentcode/agentWorldState";
		String utilitiesFolder = folder +"/net/sf/ictalive/agentcode/utilities";
		String efileName = "net.sf.ictalive.agentcode.eAgent.EventAgent";
		
//Creation of the manifest, defining the main class of the JAR file
		StringBuilder sb = new StringBuilder();
		sb.append("Manifest-Version: 1.0\n");
		sb.append("Main-Class: " + efileName + "\n");
		
		byte[] manifest = sb.toString().getBytes();
		
		try 
			{
//add manifest to jar
			out = new JarOutputStream(stream);
			out.putNextEntry(new JarEntry("META-INF/MANIFEST.MF"));
			out.write(manifest);
			out.closeEntry();
			
//Reading the files in mmAgent folder and writing it to the JAR file
			String outputFolder = "net/sf/ictalive/agentcode/eAgent/";
			addClassesToJar(out, buffer, eaFolder, outputFolder);

//Reading the files in message folder and writing it to the JAR file
			outputFolder = "net/sf/ictalive/agentcode/eMessage/";
			addClassesToJar(out, buffer, messageFolder, outputFolder);

//Reading the files in worldstate folder and writing it to the JAR file
			outputFolder = "net/sf/ictalive/agentcode/agentWorldState/";
			addClassesToJar(out, buffer, inputFolder, outputFolder);
			
//Reading the files in worldstate folder and writing it to the JAR file
			outputFolder = "net/sf/ictalive/agentcode/utilities/";
			addClassesToJar(out, buffer, utilitiesFolder, outputFolder);
			
			out.close();
			stream.close();		
			}
		catch (Exception e)
			{
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
			}
		
		System.out.println("creating EventAgent jar");	
		outputJarToAgentScape(stream, "EventAgent");
		
		}
	
	private void createPlanningAgentJar (String folder)
		{		
		byte buffer[] = new byte[10240];
		ByteArrayOutputStream stream = new ByteArrayOutputStream();;
		JarOutputStream out;
		String mmFolder = folder + "/net/sf/ictalive/agentcode/pAgent";
		String messageFolder = folder +"/net/sf/ictalive/agentcode/clMessage";
		String eMessageFolder = folder +"/net/sf/ictalive/agentcode/eMessage";
		String worldStateFolder = folder +"/net/sf/ictalive/agentcode/agentWorldState";
		String utilitiesFolder = folder +"/net/sf/ictalive/agentcode/utilities";
		
		String mmfileName = "net.sf.ictalive.agentcode.pAgent.PlanningAgent";
		
//Creation of the manifest, defining the main class of the JAR file
		StringBuilder sb = new StringBuilder();
		sb.append("Manifest-Version: 1.0\n");
		sb.append("Main-Class: " + mmfileName + "\n");
		
		byte[] manifest = sb.toString().getBytes();
		
		try 
			{
//add manifest to jar
			out = new JarOutputStream(stream);
			out.putNextEntry(new JarEntry("META-INF/MANIFEST.MF"));
			out.write(manifest);
			out.closeEntry();
			
//Reading the files in pAgent folder and writing it to the JAR file
			String outputFolder = "net/sf/ictalive/agentcode/pAgent/";
			addClassesToJar(out, buffer, mmFolder, outputFolder);
			
//Reading the files in message folder and writing it to the JAR file
			outputFolder = "net/sf/ictalive/agentcode/clMessage/";
			addClassesToJar(out, buffer, messageFolder, outputFolder);
			
//Reading the files in eMessage folder and writing it to the JAR file
			outputFolder = "net/sf/ictalive/agentcode/eMessage/";
			addClassesToJar(out, buffer, eMessageFolder, outputFolder);

//Reading the files in worldstate folder and writing it to the JAR file
			outputFolder = "net/sf/ictalive/agentcode/agentWorldState/";
			addClassesToJar(out, buffer, worldStateFolder, outputFolder);
			
//Reading the files in worldstate folder and writing it to the JAR file
			outputFolder = "net/sf/ictalive/agentcode/utilities/";
			addClassesToJar(out, buffer, utilitiesFolder, outputFolder);
			
//Reading the files in webservice folder and writing it to the JAR file
			outputFolder = "org/iids/aos/webservices/wsdl/Jshop2PlanSynthesisWebService/";
			String inputFolder = asPath + "/build/classes/org/iids/aos/webservices/wsdl/Jshop2PlanSynthesisWebService";
			addClassesToJar(out, buffer, inputFolder, outputFolder);

//Reading the files in axisstub folder and writing it to the JAR file
			outputFolder = "org/iids/aos/webservices/axisstub/";
			inputFolder = asPath + "/build/classes/org/iids/aos/webservices/axisstub";
			addClassesToJar(out, buffer, inputFolder, outputFolder);

//Reading the files in message folder and writing it to the JAR file
			outputFolder = "org/iids/aos/webservices/axisstub/aosrpc/";
			inputFolder = asPath + "/build/classes/org/iids/aos/webservices/axisstub/aosrpc";
			addClassesToJar(out, buffer, inputFolder, outputFolder);

//Reading the files in message folder and writing it to the JAR file
			outputFolder = "wsdl/";
			inputFolder = asPath + "/src/wsdl";
			addClassesToJar(out, buffer, inputFolder, outputFolder);

			out.close();
			stream.close();		
			}
		catch (Exception e)
			{
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
			}
		
		System.out.println("creating PlanningAgentjar");			
		outputJarToAgentScape(stream, "PlanningAgent");
		}


	private void addClassesToJar(JarOutputStream out, byte[] buffer, String inputFolder, String outputFolder)
		{
System.out.println(outputFolder);
		int nRead;  
		File[] classes = new File(inputFolder).listFiles();
		
		if(classes == null)
			{
System.out.println("This folder has no classess!!!!!!");
			return;
			}
		for(int i=0; i< classes.length; i++)
			{
			File addClass = classes[i];
			if(addClass.isDirectory() == true)
				continue;
			
			FileInputStream in;
			try
				{
				in = new FileInputStream(addClass);
				out.putNextEntry(new JarEntry(outputFolder+addClass.getName()));
				while (true) 
					{
			 		nRead = in.read(buffer,0,buffer.length);
			 		if (nRead <= 0) 
						 {
						 break;
						 }
			 		out.write(buffer,0,nRead);
					}
				out.closeEntry();
				in.close();
				}
			catch (Exception e)
				{
				Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
				}
			}
		}

	/**
	 * Creates a JAR containing a File.
	 * 
	 * @param file - The file to be included in the JAR.
	 * @return A JAR file as a byte array.
	 */
	private void createCoordinationAgentJar(String folder, File file)
	{		
		byte buffer[] = new byte[10240];
		ByteArrayOutputStream stream = new ByteArrayOutputStream();;
		JarOutputStream out;
	    int nRead;
		String fileName = file.getName();
	
		fileName = fileName.substring(0,fileName.length()-6);

		String clFolder = folder + "/net/sf/ictalive/agentcode/clAgent";
		String messageFolder = folder +"/agents";
		String eMessageFolder = folder +"/net/sf/ictalive/agentcode/eMessage";
		String clMessageFolder = folder +"/net/sf/ictalive/agentcode/clMessage";
		String worldStateFolder = folder +"/net/sf/ictalive/agentcode/agentWorldState";
		String utilitiesFolder = folder +"/net/sf/ictalive/agentcode/utilities";
		
		String clfileName = "generatedAgents." + fileName;
		
		//Creation of the manifest, defining the main class of the JAR file
		StringBuilder sb = new StringBuilder();
		sb.append("Manifest-Version: 1.0\n");
		sb.append("Main-Class: " + clfileName + "\n");

		
		byte[] manifest = sb.toString().getBytes();

		
		try 
			{
//add manifest to jar
			out = new JarOutputStream(stream);
			out.putNextEntry(new JarEntry("META-INF/MANIFEST.MF"));
			out.write(manifest);
			out.closeEntry();
			
//read the agent file and write to the jar			
			FileInputStream in = new FileInputStream(file);
			out.putNextEntry(new JarEntry("generatedAgents/"+file.getName()));			
			while (true) 
				{
				nRead = in.read(buffer,0,buffer.length);
			  
				if (nRead <= 0) 
					{
					break;
					}
				out.write(buffer,0,nRead);
				}			
			out.closeEntry();
			in.close();
			
//Reading the files in clAgent folder and writing it to the JAR file			
			String outputFolder = "net/sf/ictalive/agentcode/clAgent/";
			addClassesToJar(out, buffer, clFolder, outputFolder);

//Reading the files in message folder and writing it to the JAR file
			outputFolder = "agents/";
			addClassesToJar(out, buffer, messageFolder, outputFolder);
			
//Reading the files in eMessage folder and writing it to the JAR file
			outputFolder = "net/sf/ictalive/agentcode/eMessage/";
			addClassesToJar(out, buffer, eMessageFolder, outputFolder);
			
//Reading the files in clMessage folder and writing it to the JAR file
			outputFolder = "net/sf/ictalive/agentcode/clMessage/";
			addClassesToJar(out, buffer, clMessageFolder, outputFolder);
			
//Reading the files in worldstate folder and writing it to the JAR file
			outputFolder = "net/sf/ictalive/agentcode/agentWorldState/";
			addClassesToJar(out, buffer, worldStateFolder, outputFolder);
			
//Reading the files in utilities folder and writing it to the JAR file
			outputFolder = "net/sf/ictalive/agentcode/utilities/";
			addClassesToJar(out, buffer, utilitiesFolder, outputFolder);
			
			out.close();
			stream.close();	
			}
		catch (Exception e)
			{
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
			}		
System.out.println("creating cl agent "+fileName);		
		outputJarToAgentScape(stream, fileName);
		}

	
	public void outputJarToAgentScape(ByteArrayOutputStream stream, String jarName)
		{
		try
			{
			String outputJar = asPath + "/lib/agents/" + jarName + ".jar";
			System.out.println(outputJar);
//	FileOutputStream worldOut = new FileOutputStream(new File(outputJar));
			FileOutputStream world = new FileOutputStream(new File(outputJar));
			
//	jar.write(world);
			stream.writeTo(world);
		
//			world.writeObject(jar);
			world.close();
			}
		
		catch(IOException e)
			{
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID,"jar not stored", e));
			}		
		}

	}
