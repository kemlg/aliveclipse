package net.sf.ictalive.service.matchmakertab;

import java.net.URI;
import java.util.Map;
import java.util.Set;

import net.sf.ictalive.coordination.actions.Action;
import net.sf.ictalive.operetta.OM.Concept;
import net.sf.ictalive.owls.process.Input;
import net.sf.ictalive.owls.process.Output;

import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owls.service.Service;
import org.mindswap.utils.URIUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.hp.hpl.jena.sparql.util.StringUtils;

import edu.bath.matchmaker.ServiceDescriptor;

/**
 * Bean for translating {@link Action} objects to OWL-S API {@link Service}
 * objects (or their ontologies)
 * 
 * @author occ
 * 
 */
public class ActionToOWLS {
	Logger log = LoggerFactory.getLogger(ActionToOWLS.class);
	OWLKnowledgeBase owlKB;

	public ActionToOWLS(OWLKnowledgeBase owlKB) {
		this.owlKB = owlKB;
	}

	public ActionToOWLS() {
		this(OWLFactory.createKB());
	}

	public Service convertActionToService(Action act) {

		return convertActionToServiceDescriptor(act).toOwls("");

	}

	public ServiceDescriptor convertActionToServiceDescriptor(Action act) {

		log.debug("Converting action {} to service", act);

		Map<URI, URI> inputs = Maps.newHashMap();
		for (Input in : act.getHasInput()) {
			log.debug("converting input {} on {} ", in, act);

			String ns = in.getNs();
			if (ns == null || ns.isEmpty()) {
				ns = "urn:anonymous_uri#";
			}
			String name = in.getName();
			if (!ns.endsWith("#"))
				ns = ns + "#";
			URI paramName = URI.create(ns + name);

			for (Concept inputConcept : in.getParameterType()) {

				log.debug("adding concept {} on {} ", inputConcept, act);
				inputs.put(paramName, URI.create(inputConcept.getURI()));
			}
		}
		Map<URI, URI> outputs = Maps.newHashMap();
		for (Output output : act.getHasOutput()) {
			String ns = output.getNs();
			if (ns == null || ns.isEmpty()) {
				ns = "urn:anonymous_uri#";
			}
			String name = output.getName();
			if (!ns.endsWith("#"))
				ns = ns + "#";
			URI paramName = URI.create(ns + name);

			for (Concept outputConcept : output.getParameterType()) {
				outputs.put(paramName, URI.create(outputConcept.getURI()));
			}
		}

		ServiceDescriptor sd = ServiceDescriptor.fromInputsOutputs(URI
				.create("urn:alive-actions#" + act.getName()), inputs, outputs);
		log.debug("produced service description {} ", sd);

		return sd;
	}
}
