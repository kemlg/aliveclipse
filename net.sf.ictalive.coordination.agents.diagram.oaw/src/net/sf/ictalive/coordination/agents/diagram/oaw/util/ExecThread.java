package net.sf.ictalive.coordination.agents.diagram.oaw.util;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExecThread extends Thread 
{
	private String command;
	
	public ExecThread (String cmd)
	{
		command = cmd;
	}
	
	public void run ()
	{
		try
		{
			Process agentScape = Runtime.getRuntime().exec(command);
			
			BufferedReader brStdOut = new BufferedReader(new InputStreamReader(agentScape.getInputStream()));
			String str = null;
			
			while ((str = brStdOut.readLine())!=null)
			{
				System.out.println (str);
			}
			brStdOut.close();
		}
		catch (Exception e) { e.printStackTrace(); }
	}
}
