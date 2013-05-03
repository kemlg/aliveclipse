package edu.bath.matchmaker;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.mindswap.owl.OWLClass;
import org.mindswap.owl.OWLEntity;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLObject;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owl.OWLReader;
import org.mindswap.owl.OWLValue;
import org.mindswap.owls.process.Parameter;
import org.mindswap.owls.service.Service;
import org.mindswap.owls.vocabulary.OWLS;

/**
 * Utilities complementary to the OWLS library.
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class OwlsUtils {
    private OwlsUtils() { }

    /**
     * Returns all services of the specified ontologies.
     *
     * <p>Equivalent to {@code OwlsUtils.getIndividuals(ontologies, OWLS.Service.Service, Service.class)}
     * 
     * @param ontologies a ontology collection
     * @return all services of the ontology
     * @see #getIndividuals(Collection, OWLClass, Class)
     */
    static Set<Service> getServices(Collection<OWLOntology> ontologies) {
        return getIndividuals(ontologies, OWLS.Service.Service, Service.class);
    }

    /**
     * Returns all individuals of the specified OWL type of a set of ontologies.
     *
     * @param <T> a subtype of {@link OWLObject} to which to cast the results
     * @param ontologies the ontologies to be searched
     * @param owlType the OWL class of the individuals to be found
     * @param javaType the class object representing {@code T}
     * @return the individuals belonging to the specified OWL class of the given ontology
     */
    static <T extends OWLObject> Set<T> getIndividuals(Collection<OWLOntology> ontologies, OWLClass owlType, Class<T> javaType) {
        final Function<OWLObject, T> caster = OwlsFunctions.typeCaster(javaType);
        Set<T> set = Sets.newHashSet();
        for (OWLOntology ontology : ontologies) {
            for (OWLClass clazz : Iterables.concat( //for any class of
                    Collections.singleton(owlType), //the service itself
                    ontology.getSubClasses(owlType, false))) { //and any possible subclass too
                Iterables.addAll(set, Iterables.transform(ontology.getInstances(clazz), caster));
            }
        }
        return set;
    }

    public static Set<OWLClass> allAncestors(OWLKnowledgeBase kb, Iterable<? extends OWLEntity> entities) {
        return materializeClosure(kb, entities, true);
    }

    public static Set<OWLClass> allDescendants(OWLKnowledgeBase kb, Iterable<? extends OWLEntity> entities) {
        return materializeClosure(kb, entities, false);
    }

    private static Set<OWLClass> materializeClosure(OWLKnowledgeBase kb, Iterable<? extends OWLEntity> entities, boolean upward) {
        final Set<OWLClass> closure = Sets.newHashSet();
        for (OWLEntity entity : entities) {
            OWLClass type = kb.getClass(entity.getURI());

            LinkedList<OWLClass> typesToExplore = Lists.newLinkedList();
            typesToExplore.add(type);

            while (!typesToExplore.isEmpty()) {
                OWLClass next = typesToExplore.pop();
                if (closure.contains(next)) { //if it wasn't for this, we could be using an ImmutableSet.Builder for the closure
                    continue; //this is the point of the optimization: adding each element of the closure just once
                }
                closure.add(next);
                Set<OWLClass> neighbors = upward ? next.getSuperClasses(true) : next.getSubClasses(true);
                neighbors.remove(next); //otherwise it might return it and cause infinite loop!
                typesToExplore.addAll(neighbors); //the direct ancestors closure of type
            }
        }
        return closure;
    }

    private static final OWLReader reader = OWLFactory.createReader();

    /**
     * Creates an independent {@link OWLOntology} by parsing the specified {@code InputStream}, which is closed afterwards.
     *
     * @param in the input stream from which to read an OWL ontology
     * @param baseURI the base URI of the input (can be null)
     * @return an OWL ontology created by reading the specified input
     * @throws IOException if there is a problem reading the input
     */
    public static OWLOntology parseStream(InputStream in, URI baseURI) throws IOException {
        try {
            return reader.read(in, baseURI);
        } finally {
            in.close();
            reader.clear(); //otherwise a big memory leak ensues
        }
    }

    /**
     * Creates an independent {@link OWLOntology} by parsing the specified {@code URL}.
     *
     * @param url the URL from which to read an OWL ontology
     * @param baseURI the base URI of the input (can be null)
     * @return an OWL ontology created by reading the specified input
     * @throws IOException if there is a problem reading the input
     */
    public static OWLOntology parseURL(URL url, URI baseURI) throws IOException {
        return parseStream(url.openStream(), baseURI);
    }

    /**
     * Creates an independent {@link OWLOntology} by parsing the specified {@code URI} (which is treated as a {@code URL}).
     *
     * @param uri the URI from which to read an OWL ontology
     * @param baseURI the base URI of the input (can be null)
     * @return an OWL ontology created by reading the specified input
     * @throws IOException if there is a problem reading the input
     */
    public static OWLOntology parseURI(URI uri, URI baseURI) throws IOException {
        return parseURL(uri.toURL(), baseURI);
    }

    /**
     * Creates an independent {@link OWLOntology} by parsing the specified {@code URI} (which is treated as a {@code URL}), using
     * itself as the base URI.
     *
     * @param uri the URI from which to read an OWL ontology
     * @return an OWL ontology created by reading the specified input
     * @throws IOException if there is a problem reading the input
     */
    public static OWLOntology parseURI(URI uri) throws IOException {
        return parseURI(uri, uri);
    }

    /**
     * Creates an independent {@link OWLOntology} by parsing the specified string (which should be in RDF/XML format).
     *
     * @param rdfxml the RDF/XML input from which to create an OWL ontology
     * @param baseURI the base URI of the input (can be null)
     * @return an OWL ontology created by reading the specified input
     * @throws IOException if there is a problem reading the input
     */
    public static OWLOntology parseString(String rdfxml, URI baseURI) {
        try {
            return parseStream(new ByteArrayInputStream(rdfxml.getBytes()), baseURI);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /**
     * Serializes to a string the specified {@link OWLOntology} and base URI.
     *
     * @return an {@code RDF/XML} representation of the ontology (
     */
    public static String toString(OWLOntology ontology, URI baseURI) {
        StringWriter sw = new StringWriter();
        ontology.write(sw, baseURI);
        return sw.toString();
    }

    /**
     * Creates a {@link OWLValue} from a string, which may be a URI or a data value (but not a blank node).
     *
     * @param string a data value (enclosed in quotes) or a URI
     * @param kb the knowledge base to use to create the value
     * @return the resulting {@code OWLValue}
     */
    public static OWLValue valueFromString(String string, OWLKnowledgeBase kb) {
        string = string.trim();
        if (string.charAt(0) == '"') {
            return kb.createDataValue(string);
        } else {
            return kb.createIndividual(URI.create(string));
        }
    }

    /**
     * Creates a collection of {@link OWLValue}s from a collection of strings. Blank nodes are not supported; the strings are trimmed and checked
     * whether they start with a quotation character ({@code ["]}), and if so, they are treated as data values, otherwise as URIs.
     *
     * @param strings a collection of strings, consisting of data values and URIs.
     * @param kb the knowledge base to use to create the values
     * @return a collection of {@code OWLValue}s
     */
    public static List<OWLValue> owlsValuesFromStrings(List<String> strings, OWLKnowledgeBase kb) {
        List<OWLValue> values = Lists.newArrayList();
        for (String string : strings) {
            values.add(valueFromString(string, kb));
        }
        return values;
    }

    enum Parameters {
        INPUT() {
            Iterable<? extends Parameter> parametersOf(Service service) {
                return service.getProcess().getInputs();
            }

            Iterable<URI> parametersOf(ServiceDescriptor serviceDescr) {
                return serviceDescr.getInputTypes();
            }
        },

        OUTPUT() {
            Iterable<? extends Parameter> parametersOf(Service service) {
                return service.getProcess().getOutputs();
            }

            Iterable<URI> parametersOf(ServiceDescriptor serviceDescr) {
                return serviceDescr.getOutputTypes();
            }
        };

        abstract Iterable<? extends Parameter> parametersOf(Service service);

        abstract Iterable<URI> parametersOf(ServiceDescriptor serviceDescr);
    }
}
