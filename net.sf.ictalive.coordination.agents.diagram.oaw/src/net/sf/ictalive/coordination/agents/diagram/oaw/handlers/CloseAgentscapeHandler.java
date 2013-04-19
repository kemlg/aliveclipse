package net.sf.ictalive.coordination.agents.diagram.oaw.handlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.ResourceUtil;
import org.iids.aos.api.AgentScapeApi;
import org.iids.aos.api.AgentScapeClient;
import org.iids.aos.gui.services.AgentScapeServiceRunner;
import org.iids.aos.gui.services.KernelWrapper;
import org.iids.aos.systemservices.communicator.structs.AgentInfo;


/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class CloseAgentscapeHandler extends AbstractHandler {
	
	private String asPath;
	
	/**
	 * The constructor.
	 */
	public CloseAgentscapeHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{				
		//Get the file the user is editing
		IFile file = ResourceUtil.getFile(HandlerUtil.getActiveEditor(event).getEditorInput());
		IProject project = file.getProject();
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);		
		Shell shell = window.getShell();
		String folder;		
		String asFile = project.getLocation().toString() + "\\"+ASPathHandler.ASFILENAME;
		byte jar[];
		File[] classes;		
		AgentInfo info;
			
		
		//Get the AgentScape installation path or ask for it and write it in a new file
		File agentscape = new File(asFile);
		
		if (agentscape.exists())
			{			
			try 
				{				
				FileReader fr = new FileReader(asFile);
				BufferedReader in = new BufferedReader(fr);
				
				asPath = in.readLine();	
				in.close();
				}
			catch (Exception e)
				{
				MessageDialog.openError(shell,
						"Inject agents into AgentScape",
						"I/O Error"
						);			
				}		    
			}
		else 	
			asPath = ASPathHandler.createASFile(event);
		
		if (asPath == null) 
			{
			System.out.println("PATH NOT KNOWN");
			return null;
			}
		
		
		ThreadGroup root = Thread.currentThread().getThreadGroup();//.getParent();
		int numThreads = root.activeCount();
System.out.println(numThreads);
		
		
		try
			{				
	//		
			//Try to communicate with AgentScape
		    AgentScapeApi api = AgentScapeClient.getAgentScapeClient();         
	        
		    if(api == null)
		    	{
		    	System.out.println("1 agentscape not running");
		    	return null;
		    	}
		    else
				{
				System.out.println("1 agentscape still running");
				}
		    
	        List<KernelWrapper> kernels =
            AgentScapeServiceRunner.getInstance().getAllKernels();

		    if (kernels.size() > 0) 
		    	{
		        System.out.println("Shutting down " + kernels.size() + "kernel(s)");
		    	}
		
		    for (KernelWrapper kw : kernels) 
		    	{
		        kw.shutdown();
		    	}


			api = AgentScapeClient.getAgentScapeClient();         
    
			if(api == null)
		    	{
		    	System.out.println("2 agentscape not running");
		    	return null;
		    	}
			else
				{
				System.out.println("2 agentscape still running");

				}
		    
	       }
		catch (Exception e)
			{
			e.printStackTrace();
			}
 			
 		return null;
	}
	
	
	
	}
