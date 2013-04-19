package net.sf.ictalive.monitortool.Configuration;

import java.util.Vector;

/*
 * 
 * Singleton for keeping configuration parameters
 * 
 * @author:Ignasi Gómez-Sebastià
 */

public class Singleton 
{
	public static final long EventListRefreshTime = 2000;	
	public static final long n_max_unshowed_events = 50;	
	
	public static Vector<String> forbidden_EventGrahp_concepts = init_forbidden_EventGrahp_concepts();
	
	private static Vector<String> init_forbidden_EventGrahp_concepts()
	{
		Vector<String> res = new Vector<String>();
		
		res.add("net.sf.ictalive.operetta.OM.impl.ValueImpl");
		res.add("net.sf.ictalive.operetta.OM.impl.ConstantImpl");
		res.add("net.sf.ictalive.operetta.OM.impl.ConceptImpl");
		res.add("net.sf.ictalive.operetta.OM.impl.VariableImpl");
				
		
		return res;		
	}
	
	
}
