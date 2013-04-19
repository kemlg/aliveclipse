package edu.bath.alivetemplates;

import jaspwrapper.exec.Program;

import java.net.URI;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.process.CompositeProcess;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.service.Service;

import edu.bath.matchmaker.Match;

/**
 * Interface describing the templates API.
 * 
 * @see TemplateConstructorImpl
 * @author adan
 * 
 */
public interface TemplateConstructor {

	public static final String PROP_CLINGOPATH = "clingopath";
	public static final String PROP_CLINGOARGS = "clingoargs";

	/**
	 * Allows one to look-up a hashed ASP name as a URI.
	 * 
	 * @param name
	 *            Hash of URI as used in ASP.
	 * @return URI of object hashed against the key.
	 */
	public URI lookupASPNameHash(String name);

	/**
	 * Looks up ASP data based on hash.
	 * 
	 * @param hash
	 *            Hash of data as used in ASP.
	 * @return Data to which this hash is linked.
	 */
	public Object lookupASPDataHash(String hash);

	/**
	 * Fetches a Map matches.
	 * 
	 * @param slotProcesses
	 *            List of processes which are slots that we need to find
	 *            candidates for.
	 * @return Map containing Slots → Candidate mappings.
	 */
	public Map<Process, Collection<Match>> getCandidates(
			List<Process> slotProcesses);

	/**
	 * Fetches the generated ASP assertions which are used before the code in
	 * the template it run over the candidates.
	 * 
	 * @param candidates
	 *            Map of candidates.
	 * @return JASPWrapper Program describing generated ASP code.
	 */
	public Program getGeneratedASP(Map<Process, Collection<Match>> candidates);

	/**
	 * Fetches a List of Maps of answer sets which describe what process maps
	 * onto each slot for all answer sets. One can assume that this will never
	 * return an empty answer set (an exception will be thrown if there are
	 * none).
	 * 
	 * @param aspProg
	 *            ASP program used to generate answer sets.
	 * @return A List of maps of process mappings for each answer set. Ordering
	 *         not important, List for convenience.
	 */
	public List<TemplateAnswerSet> getAnswerSets(Program aspProg);

	/**
	 * Use the map to replace slots in the template by real processes.
	 * 
	 * @param replacements
	 *            Mappings from slots to concrete processes.
	 * @param newServiceURI
	 *            The URI the new, grounded service should adopt.
	 * @return New service ontology.
	 */
	public OWLOntology performReplacement(Map<Process, Process> replacements,
			URI newServiceURI);

	public OWLOntology performReplacement(Map<Process, Process> mapping,
			URI ontologyURI, URI svcURI);

	Service getTemplateService();

	CompositeProcess getTemplateProcess();

	/**
	 * Adds a value handler.
	 * 
	 * @param typeHandler
	 *            Handler to be added.
	 */
	public void addValueHandler(ASPValueHandler typeHandler);

}
