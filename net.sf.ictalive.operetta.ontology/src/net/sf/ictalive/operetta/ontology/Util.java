package net.sf.ictalive.operetta.ontology;

import net.sf.ictalive.operetta.OM.CS;
import net.sf.ictalive.operetta.OM.Ontology;
import net.sf.ictalive.operetta.OM.OperAModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;

public class Util {
	
	public static Ontology getOntologyByName(Resource resource, String name)
	{	OperAModel operAModel = (OperAModel)resource.getContents().get(0);
		CS cs = operAModel.getOm().getCs();
		EList<Ontology> ontologies = cs.getOntology();
		Ontology ontology = null;
	
		for (int i = 0; i < ontologies.size(); i++) {
			if (ontologies.get(i).getOntologyID().equals(name))
				ontology = ontologies.get(i);
	    	}
		
		return ontology;
	}
	
	public static String getResourceName(Resource resource)
	{	String uri = resource.getURI().toString();
		
		String resourceName = "NoName";
		// TODO: Handle error cases, and throw exception if there is no name
		if (uri.contains("/")) {
			int hashIndex = uri.lastIndexOf("/");
			
			if (uri.contains(".")) {
				int dotIndex = uri.lastIndexOf(".");
				resourceName = uri.substring(hashIndex+1, dotIndex);
			}
			else {
				resourceName = uri.substring(hashIndex+1);		
			}
		}
		return resourceName;
	}
	
	public static String getName(String URI) {
		if (!URI.contains("#")) {
			return null;
		} else {
			int hashIndex = URI.lastIndexOf("#");
			return URI.substring(hashIndex+1);
		}	
	}
}
