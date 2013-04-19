package edu.bath.alivetemplates;

import jaspwrapper.analyzer.OutputAnalyzerFactory;
import jaspwrapper.exec.EngineRunner;
import jaspwrapper.exec.Program;
import jaspwrapper.exec.Solver;
import jaspwrapper.items.Atom;
import jaspwrapper.items.Model;
import jaspwrapper.items.Term;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.mindswap.exceptions.CastingException;
import org.mindswap.owl.OWLDataProperty;
import org.mindswap.owl.OWLDataValue;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLIndividualList;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLObjectProperty;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owl.OWLProperty;
import org.mindswap.owl.OWLValue;
import org.mindswap.owls.service.Service;
import org.mindswap.owls.vocabulary.OWLS;
import org.mindswap.owls.process.CompositeProcess;
import org.mindswap.owls.process.ControlConstruct;
import org.mindswap.owls.process.Perform;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.process.Result;
import org.mindswap.owls.process.variable.Input;
import org.mindswap.owls.process.variable.Output;
import org.mindswap.utils.URIUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Preconditions;

import edu.bath.matchmaker.Match;
import edu.bath.matchmaker.MatchMaker;

/**
 * Concrete implementation of templates API.
 * 
 * @author adan
 * 
 */
public class TemplateConstructorImpl implements TemplateConstructor {
	Logger log = LoggerFactory.getLogger(TemplateConstructorImpl.class);
	CompositeProcess process;

	MatchMaker matchMaker;
	OWLKnowledgeBase kb;
	Service service;
	Properties properties;
	URItoASP aspMap = new URItoASP();
	Matcher matcher = null;
	ASPGenerator aspGen;
	URI serviceOntURI;

	public TemplateConstructorImpl(URI serviceOntology, URI serviceURI,
			MatchMaker matchMaker, Properties prop, OWLKnowledgeBase inKB)
			throws CastingException {
		/* Get process from OWL-S file */
		if (inKB == null)
			inKB = OWLFactory.createKB();

		Service templatesvc;
		try {
			inKB.read(serviceOntology);
			templatesvc = inKB.getService(serviceURI);
		} catch (IOException e) {
			log.error("Could not read OWL-S service '" + serviceURI.toString()
					+ "'");
			e.printStackTrace();
			return;
		}
		init(templatesvc, matchMaker, prop, inKB);
	}

	private void init(Service templateService, MatchMaker matchMaker,
			Properties prop, OWLKnowledgeBase defkb) {
		Preconditions.checkNotNull(templateService,
				"Template service is not defined ");
		Preconditions.checkNotNull(matchMaker, " No matchmaker specified");

		/* Get matchmaker */
		this.matchMaker = matchMaker;
		this.service = templateService;
		if (defkb == null)
			kb = OWLFactory.createKB();
		else
			kb = defkb;

		kb.setReasoner("Pellet");

		serviceOntURI = templateService.getOntology().getURI();

		Process process = service.getProcess();

		if (!process.canCastTo(CompositeProcess.class))
			throw new TemplateException(
					"Process is not composite, therefore not a template!");

		/* Set which process is the 'master' template */
		this.process = process.castTo(CompositeProcess.class);

		if (prop != null) {
			this.properties = prop;
		} else {
			/* Read properties file */
			prop = new Properties();
			try {
				String propFileName = System.getProperty("aspconfig.file",
						"alivetemplates.properties");
				log.debug("Loading ASP config from {} ", propFileName);
				prop.load(new FileInputStream(propFileName));
			} catch (Exception e) {
				log.error("Couldn't load alivetemplates.properties");
				e.printStackTrace();
				throw new RuntimeException(e);
			}

			Preconditions.checkNotNull(prop.getProperty(PROP_CLINGOPATH),
					"Property " + PROP_CLINGOPATH + " was not set");
			this.properties = prop;
		}

		// Create matcher
		matcher = new Matcher(TemplateHelper.getTemplateSlotProperty(kb),
				matchMaker, aspMap, service);

		// Instantiate ASP generator
		aspGen = new ASPGenerator(kb, aspMap);
	}

	/**
	 * Create a TemplateConstructor
	 * 
	 * @param serviceOntology
	 *            URI pointing to ontology in which the service is stored.
	 * @param serviceURI
	 *            URI of service to use as a template.
	 * @param matchMaker
	 *            Match maker instance to get candidates from.
	 * @param prop
	 *            Properties bundle if you don't want to load them from file.
	 * @param defkb
	 *            Knowledge base to start from.
	 * @throws CastingException
	 */
	public TemplateConstructorImpl(Service templateService,
			MatchMaker matchMaker, Properties prop, OWLKnowledgeBase defkb)
			throws CastingException {
		init(templateService, matchMaker, prop, defkb);
	}

	/**
	 * Alternate constructor where properties isn't specified, and nor is KB.
	 * 
	 * @param serviceOntology
	 *            URI pointing to ontology in which the service is stored.
	 * @param serviceURI
	 *            URI of service to use as a template.
	 * @param matchMaker
	 *            Match maker instance to get candidates from.
	 */
	public TemplateConstructorImpl(URI serviceOntology, URI serviceURI,
			MatchMaker matchMaker) {
		this(serviceOntology, serviceURI, matchMaker, null, null);
	}

	/**
	 * Alternate constructor where properties isn't specified but KB is.
	 * 
	 * @param serviceOntology
	 *            URI pointing to ontology in which the service is stored.
	 * @param serviceURI
	 *            URI of service to use as a template.
	 * @param matchMaker
	 *            Match maker instance to get candidates from.
	 * @param defkb
	 *            Knowledge base to start from.
	 */
	public TemplateConstructorImpl(URI serviceOntology, URI serviceURI,
			MatchMaker matchMaker, OWLKnowledgeBase defkb) {
		this(serviceOntology, serviceURI, matchMaker, null, defkb);
	}

	/**
	 * Allows one to look-up a hashed ASP name as a URI.
	 * 
	 * @param name
	 *            Hash of URI as used in ASP.
	 * @return URI of object hashed against the key.
	 */
	public URI lookupASPNameHash(String name) {
		return aspMap.get(name);
	}

	/**
	 * Looks up ASP data based on hash.
	 * 
	 * @param hash
	 *            Hash of data as used in ASP.
	 * @return Data to which this hash is linked.
	 */
	public Object lookupASPDataHash(String hash) {
		return aspGen.findData(hash);
	}

	/**
	 * Fetches a Map matches.
	 * 
	 * @param slotProcesses
	 *            List of processes which are slots that we need to find
	 *            candidates for.
	 * @return Map containing Slots → Candidate mappings.
	 */
	public Map<Process, Collection<Match>> getCandidates(
			List<Process> slotProcesses) {
		return matcher.getCandidates(slotProcesses);
	}

	/**
	 * Fetches the generated ASP assertions which are used before the code in
	 * the template it run over the candidates.
	 * 
	 * @param candidates
	 *            Map of candidates.
	 * @return JASPWrapper Program describing generated ASP code.
	 */
	public Program getGeneratedASP(Map<Process, Collection<Match>> candidates) {
		// Get selection program
		OWLDataValue codeDV = service
				.getProperty(kb
						.getDataProperty(URI
								.create("http://www.ist-alive.eu/ontologies/ALIVE-Template.owl#aspCode")));
		Program aspProg = new Program();
		aspProg.addRule(codeDV.getLexicalValue());
		// Make basic assertions
		aspGen.generateAssertions(aspProg, candidates);

		// Now fetch properties and their bindings to ASP
		OWLDataValue aspProperties = service
				.getProperty(kb
						.getDataProperty(URI
								.create("http://www.ist-alive.eu/ontologies/ALIVE-Template.owl#aspBindings")));
		String propertyBindingsRaw = aspProperties.getLexicalValue();
		aspGen.generatePropertyAssertions(aspProg, propertyBindingsRaw);

		// Now run selection program and choose first answer set or error if
		// there are none.
		aspProg.end();

		return aspProg;
	}

	/**
	 * Fetches a process with given URI from .
	 * 
	 * @param u
	 *            URI of process.
	 * @return
	 */
	private Process uriProc(URI u) {
		return kb.getProcess(u);
	}

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
	public List<TemplateAnswerSet> getAnswerSets(Program aspProg)
			throws TemplateException {
		Program fullProg = new Program();
		fullProg
				.addRule("1{selection(Slot, Y): candidateProcess(Slot,Y)}1 :-  slot(Slot).");
		fullProg.addRule(aspProg.toString());
		fullProg.end();
		EngineRunner myEngine = null;
		try {
			log.debug("Solving answer set program {} ", aspProg);
			Solver solver = new Solver(properties.getProperty(PROP_CLINGOPATH)
					+ " " + properties.getProperty(PROP_CLINGOARGS));
			myEngine = new EngineRunner(solver);
			myEngine.setOS("unix");
			myEngine.setSolverType(OutputAnalyzerFactory.CLASP);

			// myEngine.loadProgram(aspProg);
			myEngine.loadProgram(fullProg);
			myEngine.compute(EngineRunner.ALL_MODEL_AT_ONCE);
		} catch (Exception e) {
			log.error("Could not execute ASP program! {}", e);
			throw new RuntimeException(e);
		}

		// Create list of answer sets
		List<TemplateAnswerSet> answerSetCollection = new LinkedList<TemplateAnswerSet>();
		int answerSets = 0;
		while (myEngine.hasMoreModel()) { // Keep going until all answer sets
			// are exhausted
			answerSets++;

			// Build an empty selection map
			Map<Process, Process> selectionMap = new HashMap<Process, Process>();

			// Fetch next model
			Model model = myEngine.nextModel();
			Iterator<Atom> iter = model.iterator();
			log.debug("Final model for replacement: " + model);
			// Iterate over all atoms in result.
			while (iter.hasNext()) {
				Atom currentAtom = iter.next();
				// If an atom is 'selected', it contains a mapping between a
				// slot Process
				// and a substitute Process
				if (currentAtom.getName().equals("selection")) {
					List<Term> args = null;
					if ((args = currentAtom.getArguments()).size() != 2)
						throw new TemplateException(
								"Incorrect number of arguments for selection atom '"
										+ currentAtom + "'.");
					selectionMap.put(
							uriProc(aspMap.get(args.get(0).toString())),
							uriProc(aspMap.get(args.get(1).toString())));
				}
			}

			TemplateAnswerSet answerSetWrapper = new TemplateAnswerSet(
					selectionMap, model);

			// Add to list
			answerSetCollection.add(answerSetWrapper);
		}
		// if (answerSets == 0)
		// throw new TemplateException("Unsatisfiable selection program!");

		return answerSetCollection;
	}

	public OWLOntology performReplacement(Map<Process, Process> replacements,
			URI newServiceURI) {

		Preconditions.checkNotNull(newServiceURI.getFragment(),
				"Service URI must contain a fragment");
		return performReplacement(replacements, URIUtils
				.standardURI(newServiceURI), newServiceURI);
	}

	/**
	 * Use the map to replace slots in the template by real processes.
	 * 
	 * @param replacements
	 *            Mappings from slots to concrete processes.
	 * @param targetOntologyURI
	 * @param newServiceURI
	 *            The URI the new, grounded service should adopt.
	 * @return New service ontology.
	 */
	public OWLOntology performReplacement(Map<Process, Process> replacements,
			URI targetOntologyURI, URI newServiceURI) {
		for (Process mapSlotProcess : replacements.keySet()) {
			// Get the slot, and clean it ready for use
			CompositeProcess slot = mapSlotProcess
					.castTo(CompositeProcess.class);
			Process candidate = replacements.get(mapSlotProcess);
			kb.remove(slot.getComposedOf(), false); // Remove the redundant
			// ControlConstruct (needed
			// to stop API moaning)

			// Create new perform to substituted service into
			Perform newSlotPerform = kb
					.createPerform(URI.create("#"
							+ mapSlotProcess.getLocalName()
							+ "TemplateBindingPerform"));
			slot.setComposedOf(newSlotPerform);
			newSlotPerform.setProcess(replacements.get(mapSlotProcess));

			// Create bindings
			buildBindings(slot, candidate);
		}

		// Add modifications back into original URI and return it

		log.debug("Creating new ontoology with URI {} ", targetOntologyURI);

		OWLOntology new_ontology = kb.createOntology(targetOntologyURI);
		new_ontology.add(service.getOntology());

		// Change service URI
		Map<OWLProperty, List<OWLValue>> serviceProperties = service
				.getProperties();
		new_ontology.remove(service, false);
		Service newsvc = new_ontology.createService(newServiceURI);
		
		for (OWLProperty p : serviceProperties.keySet()) {
			for (OWLValue o : serviceProperties.get(p)) {
				if (p.isDatatypeProperty())
					newsvc.addProperty(p.castTo(OWLDataProperty.class), o);
				else if (p.isObjectProperty())
					newsvc.addProperty(p.castTo(OWLObjectProperty.class), o
							.castTo(OWLIndividual.class));
			}
		}
		newsvc.getProcess().setService(newsvc);

		return new_ontology;
	}

	/**
	 * Takes a Perform, gets the Process from it, and binds the Inputs and
	 * Outputs to those in the CompositeProcess ('process').
	 * 
	 * @param slot
	 *            Process for slot to build bindings to.
	 * @param candidate
	 *            Process for candidate to bind from.
	 */
	private void buildBindings(CompositeProcess slot, Process candidate) {
		Perform bindingContainer = candidate.getPerform();

		for (Input slotInput : slot.getInputs()) {
			boolean found = false;
			for (Input candidateInput : candidate.getInputs()) {
				if (candidateInput.getParamType().isSubTypeOf(
						slotInput.getParamType())) {
					log.info("Binding '" + slotInput.getURI() + "' to '"
							+ candidateInput.getURI() + "'.");
					bindingContainer.addBinding(candidateInput,
							OWLS.Process.ThisPerform, slotInput);
					found = true;
					continue;
				}
			}

			if (!found)
				log.info("No binding found for '" + slotInput.getURI() + "'.");
		}

		Result newResult = slot.createResult(URI.create("#"
				+ slot.getLocalName() + "TemplateBindingResult"));
		for (Output slotOutput : slot.getOutputs()) {
			boolean found = false;
			for (Output candidateOutput : candidate.getOutputs()) {
				if (candidateOutput.getParamType().isSubTypeOf(
						slotOutput.getParamType())) {
					log.info("Binding '" + slotOutput.getURI() + "' to '"
							+ candidateOutput.getURI() + "'.");
					newResult.addBinding(slotOutput, bindingContainer,
							candidateOutput);
					found = true;
					continue;
				}
			}

			if (!found)
				log.info("No binding found for '" + slotOutput.getURI() + "'.");
		}
	}

	@Override
	public CompositeProcess getTemplateProcess() {
		return getTemplateService().getProcess().castTo(CompositeProcess.class);
	}

	@Override
	public Service getTemplateService() {
		return service;
	}

	/**
	 * Adds a value handler.
	 * 
	 * @param typeHandler
	 *            Value handler to add.
	 */
	public void addValueHandler(ASPValueHandler typeHandler) {
		aspGen.addValueHandler(typeHandler);
	}
}
