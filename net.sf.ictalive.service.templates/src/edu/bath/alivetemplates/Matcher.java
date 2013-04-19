package edu.bath.alivetemplates;

import java.net.URI;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.mindswap.owl.OWLDataProperty;
import org.mindswap.owl.OWLIndividualList;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.process.variable.Input;
import org.mindswap.owls.process.variable.Output;
import org.mindswap.owls.service.Service;

import com.google.common.collect.ImmutableSet;

import edu.bath.matchmaker.InputMatcher;
import edu.bath.matchmaker.Match;
import edu.bath.matchmaker.MatchMaker;
import edu.bath.matchmaker.OutputMatcher;
import edu.bath.matchmaker.ServiceDescriptor;

/**
 * Controls the matching of candidates, and the running of ASP code in order to build a 
 * set of replacements.
 * @author adan
 *
 */
class Matcher {
	OWLDataProperty templateProperty;
	MatchMaker matchMaker;
	URItoASP aspMap;
	Service service;
	
	/**
	 * Constructor.
	 * @param templateProperty OWLDataProperty referring to isSlot.
	 * @param matchMaker MatchMaker instance to be used to find candidate services.
	 */
	public Matcher(OWLDataProperty templateProperty, MatchMaker matchMaker, URItoASP aspMap, 
			Service service) {
		this.templateProperty = templateProperty;
		this.matchMaker = matchMaker;
		this.aspMap = aspMap;
		this.service = service;
	}
	
	/**
	 * Fetches a Map of Slot Process → A collections of matches describing the 
	 * candidates for each slot.
	 * @param slots A list of the processes marked with the isSlot property.
	 * @param aspMap 
	 * @return
	 */
	public Map<Process, Collection<Match>> getCandidates(List<Process> slots) {
		// A map of candidate matches
		Map<Process, Collection<Match>> candidateList = new HashMap<Process, Collection<Match>>();
		
		// Loop over each process
		for(Process p : slots) {
			String slotASPName = p.getProperty(templateProperty).getLexicalValue();
			aspMap.put(p.getURI(), slotASPName);
			
			// Get the inputs and outputs
			List<URI> inputsList = new LinkedList<URI>();
			List<URI> outputsList = new LinkedList<URI>();
			
			// Put types into list
			OWLIndividualList<Input> slotInputs = p.getInputs();
			for(Input i : slotInputs) {
				inputsList.add(i.getParamType().getURI());
			}
			OWLIndividualList<Output> slotOutputs = p.getOutputs();
			for(Output o : slotOutputs) {
				outputsList.add(o.getParamType().getURI());
			}
			
			// Convert list to an array, for passing via varargs
			URI[] inputsArray = (URI[])inputsList.toArray(new URI[inputsList.size()]);
			URI[] outputsArray = (URI[])outputsList.toArray(new URI[outputsList.size()]);
			
			// Build a model the matchmaker can use
			ImmutableSet<URI> inputSet = ImmutableSet.of(inputsArray);
			ImmutableSet<URI> outputSet = ImmutableSet.of(outputsArray);
			ServiceDescriptor serviceDescriptor = ServiceDescriptor.query(
					inputSet, outputSet);
			Service model = serviceDescriptor.toOwls("Synthetic");
			OWLOntology onto = model.getOntology();
			
			// Match
			Collection<Match> matches = 
				matchMaker.match(onto, InputMatcher.SUPERCLASSES, OutputMatcher.SUBCLASSES);
			
			// Store results
			candidateList.put(p, matches);
		}
		return candidateList;
	}
}
