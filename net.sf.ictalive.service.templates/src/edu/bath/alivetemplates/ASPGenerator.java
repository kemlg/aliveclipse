package edu.bath.alivetemplates;

import java.io.IOException;
import java.net.URI;
import java.util.Collection;
import java.util.Map;

import org.mindswap.owl.OWLDataProperty;
import org.mindswap.owl.OWLDataValue;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLIndividualList;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLObject;
import org.mindswap.owl.OWLObjectProperty;
import org.mindswap.owl.OWLProperty;
import org.mindswap.owls.process.Process;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import edu.bath.matchmaker.Match;
import jaspwrapper.exec.Program;

class ASPGenerator {
	Logger log = LoggerFactory.getLogger(ASPGenerator.class);
	OWLKnowledgeBase kb;
	URItoASP aspMap;
	BiMap<Object, String> aspDataValueMap = HashBiMap.create();
	ASPValueAsserts valueAsserts = new ASPValueAsserts();
	
	/**
	 * Goes from data hash to data.
	 * @param hash
	 * @return
	 */
	public Object findData(String hash) {
		return aspDataValueMap.inverse().get(hash);
	}
	
	/**
	 * Adds a value handler.
	 * @param typeHandler
	 */
	public void addValueHandler(ASPValueHandler typeHandler) {
		valueAsserts.addValueHandler(typeHandler);
	}
	
	/**
	 * Hashes a data object
	 * @param toHash
	 * @return
	 */
	public String hashDataObject(Object toHash, URI datatypeURI) {
		return hashDataObject(toHash, "aspdatavaluehash"+aspDataValueMap.size(), datatypeURI);
	}
	/**
	 * Hashes a data object under a specified key.
	 * @param toHash
	 * @param key
	 * @return
	 */
	public String hashDataObject(Object toHash, String key, URI datatypeURI) {		
		String hash = aspDataValueMap.get(toHash);
		if(hash != null) // If the object value has already been hashed, we don't need to do it again
			return hash;
		hash = key;
		
		/* Give value to handler */
		if(datatypeURI != null)
			valueAsserts.registerValue(toHash, hash, datatypeURI);
		
		/* Add to the hashed list */
		aspDataValueMap.put(toHash, hash);
		return hash;
	}
	
	public ASPGenerator(OWLKnowledgeBase kb, URItoASP aspMap) {
		this.kb = kb;
		this.aspMap = aspMap;
	}
	
	/**
	 * Generates assertions about template.
	 * @return
	 */
	public Program generateAssertions(Program aspProg, Map<Process, Collection<Match>> candidateMap) {
		// First make assertions about what services are available. 
		for(Process p : candidateMap.keySet()) {
			// For each process to be replaced, there are multiple candidate matches from the 
			// matchmaker. We will express this as candidate(process, replacement)
			for(Match match : candidateMap.get(p)) {
				// Matched process
				Process matchProcess = getProcessFromSVC(match.getService().getURI());
				String replacement = aspMap.put(matchProcess.getURI());
				// Slot process to be replaced
				String process = aspMap.put(p.getURI());
				// Assert the existence of this candidate
				aspProg.addRule("candidateProcess("+process+", "+replacement+").");
				
				// Assert that each replacement is a service
				aspProg.addRule("service("+aspMap.put(matchProcess.getService().getURI())+").");
				
				// Assert that the process goes with a particular service
				aspProg.addRule("processOf("+aspMap.put(matchProcess.getService().getURI())+","+
						aspMap.put(matchProcess.getURI())+").");
			}
		}
		
		// Static assertion about what a slot is
		aspProg.addRule("slot(X):- candidateProcess(X,Y).");
		
		// Pass back modified ASP program
		return aspProg;
	}
	
	/**
	 * Generates assertions about values of properties.
	 * @param aspProg
	 * @param propertyBindingsRaw
	 * @return
	 */
	public Program generatePropertyAssertions(Program aspProg, String propertyBindingsRaw) {
		// Now bind property values
		ASPBindings aspBindings = new ASPBindings(propertyBindingsRaw);
		Map<String, URI> propertyBindingMap = aspBindings.getPropertyBindingMap();
		
		for(String propertyASPName : propertyBindingMap.keySet()) {
			// Pre-register explicitly defined data
			Map<String, URI> dataBindingForThisProperty =
				aspBindings.getIndividualBindingMap(propertyBindingMap.get(propertyASPName));
			for(String dataKey : dataBindingForThisProperty.keySet()) {
				OWLIndividual ind = kb.getIndividual(dataBindingForThisProperty.get(dataKey));
				OWLProperty prop = kb.getProperty(propertyBindingMap.get(propertyASPName));
				if(prop == null)
					throw new TemplateException("Could not find property '"+propertyBindingMap.get(propertyASPName)+"'.");
				if(ind == null)
					throw new TemplateException("Could not find individual '"+dataBindingForThisProperty.get(dataKey)+"'.");
				if(prop.isDatatypeProperty() && ind.hasProperty(prop)) {
					OWLDataValue val = ind.getProperty(prop.castTo(OWLDataProperty.class));
					String lexval = val.getLexicalValue();
					hashDataObject(lexval, dataKey, val.getDatatypeURI());
				}
			}
			
			// Check for all individuals
			OWLIndividualList<?> boundInstances = kb.getIndividuals(false);
			for(Object instance : boundInstances) {
				if(instance instanceof OWLObject && ((OWLObject)instance).canCastTo(OWLIndividual.class)) {
					OWLIndividual ind = ((OWLObject)instance).castTo(OWLIndividual.class);
					OWLProperty prop = kb.getProperty(propertyBindingMap.get(propertyASPName));
					if(prop == null)
						throw new TemplateException("Couldn't find bound property '"+propertyBindingMap.get(propertyASPName)+"'.");
					
					// Need to decide if it is a data or individual property
					if(prop.isDatatypeProperty()) {
						// Loop over all data properties
						for(OWLDataValue propDataValue : ind.getProperties(prop.castTo(OWLDataProperty.class))) {
							String lexval = propDataValue.getLexicalValue();
							String assertion = propertyASPName+"("+aspMap.put(ind.getURI()) + ","
								+ hashDataObject(lexval, propDataValue.getDatatypeURI())+").";
							aspProg.addRule(assertion);
						}
					} else if(prop.isObjectProperty()) {
						// Loop over all object properties
						OWLIndividualList<?> objProps = ind.getProperties(prop.castTo(OWLObjectProperty.class));
						for(Object o : objProps) {
							if(o instanceof OWLIndividual) {
								String assertion = propertyASPName+"("+aspMap.put(ind.getURI()) 
								+"," +aspMap.put(((OWLIndividual)o).getURI())+").";
								aspProg.addRule(assertion);
							}
						}
						

					}
				}
			}
		}
		
		// Run value handlers
		valueAsserts.invokeHandlers(aspProg);
		
		return aspProg;
	}
	
	/**
	 * Fetches the process from a service (referenced by URI).
	 * @param uri
	 * @return
	 */
	public Process getProcessFromSVC(URI uri) {
		Process proc = null;
		try {
			proc = kb.readService(uri).getProcess();
		} catch (IOException e) {
			log.error("Could not read service '"+uri.toString()+"'.");
			e.printStackTrace();
		}
		return proc;
	}
}
