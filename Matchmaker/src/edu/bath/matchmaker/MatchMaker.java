package edu.bath.matchmaker;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Sets;
import edu.bath.matchmaker.MatchDecorator.Decoration;
import java.io.Serializable;
import java.net.URI;
import java.util.*;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owls.service.Service;

/**
 * A thread-safe service matchmaker. The typical usage pattern of this class is create an instance, register some services and
 * matchmake queries. 
 *
 * <p>A matchmaker can be serialized, as long as any associated {@link MatchDecorator} is also serializable.
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class MatchMaker implements Serializable {
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final ServiceIndex serviceIndex = new ServiceIndex();
    private final MutableSubsumption<URI> subsumption = Subsumptions.createHashBased();
    private final ImmutableList<MatchDecorator> decorators;

    private static final long serialVersionUID = 0L;

    /**
     * Creates a new {@code MatchMaker} instance.
     */
    public MatchMaker() {
        this(Collections.<MatchDecorator>emptyList());
    }

    /**
     * Creates a new {@code MatchMaker} instance with a given list of {@link MatchDecorator}s. The decorators
     * will be used to optionally add decorations (attributes) to matches, see
     * {@link #match(OWLOntology, InputMatcher, OutputMatcher) }
     * and {@link #match(OWLOntology, InputMatcher, OutputMatcher, Predicate)} for details.
     *
     * @param decorators a list of decorators
     */
    public MatchMaker(MatchDecorator... decorators) {
        this(Arrays.asList(decorators));
    }

    /**
     * Creates a new {@code MatchMaker} instance with a given list of {@link MatchDecorator}s. The decorators
     * will be used to optionally add decorations (attributes) to matches, see 
     * {@link #match(OWLOntology, InputMatcher, OutputMatcher) }
     * and {@link #match(OWLOntology, InputMatcher, OutputMatcher, Predicate)} for details.
     *
     * @param decorators a list of decorators
     */
    public MatchMaker(List<MatchDecorator> decorators) {
        this.decorators = ImmutableList.copyOf(decorators);

        validateDecorators(decorators);
    }

    /**
     * Checks whether there are decorators with overlapping provided keys.
     */
    private void validateDecorators(List<MatchDecorator> decorators) {
        Map<Object, MatchDecorator> keyToDecorator = Maps.newHashMap();
        for (MatchDecorator decorator : decorators) {
            for (Object key : decorator.providedDecorations()) {
                MatchDecorator other = keyToDecorator.put(key, decorator);
                if (other != null) {
                    throw new IllegalArgumentException("At least two decorators provide the same key (duplicate decorators used?), " +
                            "key=" + key + ", decorators=" + other + ", " + decorator);
                }
            }
        }
    }

    /**
     * Returns the subsumption relation of the concepts known to this MatchMaker.
     *
     * @return the subsumption relation of the concepts known to this MatchMaker
     */
    public Subsumption<URI> getSubsumption() {
        return subsumption;
    }

    /**
     * Registers an OWLS service to this matchmaker, so it will be considered as a candidate
     * when matching requests. If the provided
     * ontology does not include any service definition, an exception is thrown.
     *
     * <p>Note that the the {@linkplain OWLKnowledgeBase knowledge base} of the service to be registered is locked
     * for read for the duration of the operation. 
     *
     * @param owlsService an OWLS service to register to this matchmaker.
     * @throws IllegalArgumentException if owlsService does not include any service definition
     */
    public void registerService(OWLOntology owlsService) {
        if (owlsService.getServices(false).isEmpty()) {
            throw new IllegalArgumentException("The ontology does not include any service");
        }
        Object oldReasoner = null;
        try {
            owlsService.lockForWrite();
            oldReasoner = owlsService.getKB().getReasoner();
            owlsService.getKB().setReasoner("Pellet");
            try {
                lock.writeLock().lock();
                serviceIndex.register(owlsService);
            } finally {
                lock.writeLock().unlock();
            }
        } finally {
            owlsService.releaseLock();
            owlsService.getKB().setReasoner(oldReasoner);
        }
    }

    /**
     * Deregisters a service given its URI. The service will not match against future queries
     * of this matchmaker unless it's registered again. This method returns {@code true}
     * iff a service with the specified URI was found.
     *
     * <p>Note that any associated subsumption relationships that may have been introduced
     * while registering the service, are not removed. 
     *
     * @param serviceURI the URI of the service to deregister
     * @return {@code true} if a service with the specified URI was found, {@code false} otherwise
     */
    public boolean deregisterService(URI serviceURI) {
        try {
            lock.writeLock().lock();
            return serviceIndex.deregister(serviceURI);
        } finally {
            lock.writeLock().unlock();
        }
    }

    /**
     * Returns a read-only view to all registered services, keyed by their service URI.
     *
     * @return a read-only view to all registered services, keyed by their service URI
     */
    public Map<URI, ServiceDescriptor> getServices() {
        return Collections.unmodifiableMap(serviceIndex.uriToService);
    }

    /**
     * Finds services that match the query. Matched services are guaranteed to have input parameters that
     * (collectively) subsume all input parameters of the query, and output parameters that are (collectively) subsumed by all output parameters
     * of the query.
     *
     * <p>Matches are decorated by all MatchMaker's decorators. If you do not wish decorations, supply an extra
     * {@code Preconditions.alwaysFalse()} argument.
     *
     * @param owlsQuery a OWLS query that describes the features of desired services
     * @return services that match the specified query
     */
    public Collection<Match> match(OWLOntology owlsQuery,
            InputMatcher inputMatcher, OutputMatcher outputMatcher) {
        return match(owlsQuery, inputMatcher, outputMatcher, Predicates.alwaysTrue());
    }

    /**
     * Finds services that match the query. Matched services are guaranteed to have input parameters that
     * (collectively) subsume all input parameters of the query, and output parameters that are (collectively) subsumed by all output parameters
     * of the query.
     *
     * <p>Matches are decorated by any {@link MatchDecorator} applied to this {@code MatchMaker}'s constructor which provides
     * at least one interesting decoration key, as specified by the {@code isKeyInteresting} predicate. If you have a collection
     * of interesting keys, this is an easy way to create a predicate that only accepts keys which belong to that collection (using
     * {@link Predicates}:
     *<pre>{@code
     *  Collection<Object> myInterestingKeys = ...;
     *  Predicate<Object> isKeyInteresting = Predicates.in(myInterestingKeys);
     *}</pre>
     *
     * @param owlsQuery a OWLS query that describes the features of desired services
     * @param inputMatcher the {@link InputMatcher} to use
     * @param isKeyInteresting a predicate that specifies whether a decoration key (offered by some decorator
     * of this {@code MatchMaker} is interesting, and thus the decorator is to be activated
     * @return services that match the specified query
     * @see InputMatchers
     * @see OutputMatchers
     */
    public Collection<Match> match(OWLOntology owlsQuery,
            InputMatcher inputMatcher,
            OutputMatcher outputMatcher,
            Predicate<? super Decoration> isKeyInteresting) {
        if (inputMatcher == null) throw new IllegalArgumentException("null inputMatcher");
        if (outputMatcher == null) throw new IllegalArgumentException("null outputMatcher");
        final Service queryService = extractServiceSafely(owlsQuery);

        try {
            lock.readLock().lock();
            return decorate(queryService, serviceIndex.findServices(queryService, inputMatcher, outputMatcher), isKeyInteresting);
        } finally {
            lock.readLock().unlock();
        }
    }

    private <T extends Match> List<T> decorate(Service queryService, List<T> matches, Predicate<? super Decoration> isInteresting) {
        ServiceDescriptor queryServiceDescriptor = ServiceDescriptor.fromService(queryService).get(0);
        if (isInteresting == null) isInteresting = Predicates.alwaysFalse();
        if (!matches.isEmpty()) {
            List<T> matchesView = Collections.unmodifiableList(matches);
            for (MatchDecorator decorator : decorators) {
                boolean runDecorator = false;
                for (Decoration key : decorator.providedDecorations()) {
                    if (isInteresting.apply(key)) {
                        runDecorator = true; break;
                    }
                }
                if (runDecorator) {
                    decorator.decorate(this, subsumption, queryServiceDescriptor, queryService, matchesView);
                }
            }
        }
        return matches;
    }

    private Service extractServiceSafely(OWLOntology ontology) {
        Set<Service> services = OwlsUtils.getServices(Collections.singleton(ontology));
        if (services.size() != 1) {
            throw new IllegalArgumentException("Expected 1 service query, got " + services.size() + ": " +
                    Iterables.toString(Iterables.transform(services, OwlsFunctions.uriExtractor())));
        }
        return Iterables.getOnlyElement(services);
    }

    /**
     * Indexes services by each of their input and output types, and answers a query by intersecting services
     * found in all ancestors of required inputs, and those found in all descendants of required outputs.
     *
     * This is separated for clarity.
     */
    private class ServiceIndex implements Serializable {
        final Map<URI, ServiceDescriptor> uriToService = Maps.newHashMap();

        //if only I had a concurrent multimap!
        final SetMultimap<URI, URI> outputToServices = HashMultimap.create();

        private static final long serialVersionUID = 0L;
        
        void register(OWLOntology ontology) {
            Subsumption<URI> localSubsumption = Subsumptions.fromOwl(ontology.getKB());
            Set<URI> parameters = Sets.newHashSet();
            Set<Service> services = OwlsUtils.getServices(Collections.singleton(ontology));
            for (Service service : services) {
                if (uriToService.containsKey(service.getURI())) {
                    throw new IllegalArgumentException("Service with URI '" + service.getURI() + "' is already registered in this matchmaker, cannot register again");
                }
            }
            for (Service service : services) {
                Vector<ServiceDescriptor> sd = ServiceDescriptor.fromService(service);
                for(ServiceDescriptor serviceDescriptor : sd) {
                    URI serviceURI = serviceDescriptor.getURI();
                    uriToService.put(serviceURI, serviceDescriptor);

                    Set<URI> outputs = serviceDescriptor.getOutputTypes();
                    if (outputs.isEmpty()) {
                        outputToServices.put(null, serviceURI);
                    } else {
                        for (URI output : outputs) {
                            outputToServices.put(output, serviceURI);
                        }
                    }

                    for (MatchDecorator decorator : decorators) {
                        decorator.onRegistration(MatchMaker.this, serviceDescriptor, service);
                    }

                    parameters.addAll(serviceDescriptor.getInputTypes());
                    parameters.addAll(serviceDescriptor.getOutputTypes());
                }
            }

            subsumption.merge(parameters, localSubsumption);
        }

        boolean deregister(URI serviceURI) {
            ServiceDescriptor descr = uriToService.remove(serviceURI);
            if (descr == null) return false;
            for (URI output : descr.getOutputTypes()) {
                outputToServices.remove(output, serviceURI);
            }
            for (MatchDecorator decorator : decorators) {
                decorator.onDeregistration(MatchMaker.this, descr);
            }
            return true;
        }

        List<Match> findServices(Service queryService, InputMatcher inputMatcher, OutputMatcher outputMatcher) {
           ServiceDescriptor query = ServiceDescriptor.fromService(queryService).get(0);
           System.out.println("Query: " + query.getInputTypes());

            Set<URI> outputCandidates = uriToService.keySet(); //start with all services
            System.out.println("Candidates, step 1: " + outputCandidates);
            
            //First, find those services that produce the required outputs
            {
                for (URI queryOutput : query.getOutputTypes()) {
                    Set<URI> servicesProducingThisOutput = Collections.emptySet();

                    Set<URI> acceptableOutputs = outputMatcher.acceptableOutputs(subsumption, queryOutput);
                    if (acceptableOutputs == null) { //null means everything is acceptable
                        continue;
                    }

                    for (URI acceptableOutput : acceptableOutputs) {
                        Set<URI> services = outputToServices.get(acceptableOutput);
                        if (!services.isEmpty()) { //this 'if' is just an optimization (avoiding union with empty set)
                            servicesProducingThisOutput = Sets.union(services, servicesProducingThisOutput);
                        }
                    }

                    outputCandidates = Sets.intersection(servicesProducingThisOutput, outputCandidates);
                }
            }
            System.out.println("Candidates, step 2: " + outputCandidates);
          

            //Then, we only keep those services of which the inputs can be satisfied by the available query inputs

            //We materialize the closure of query inputs ancestors, so we can quickly test whether a service's inputs are satisfiable
            //(they are if they are a subset of this closure)
            final Predicate<URI> acceptableInputs = inputMatcher.acceptableInputsFilter(subsumption, query.getInputTypes());

            List<Match> matches = Lists.newArrayList();
            out:
            for (URI candidateServiceURI : outputCandidates) {
                ServiceDescriptor service = uriToService.get(candidateServiceURI);
                for (URI serviceInputType : service.getInputTypes()) {
                    if (!acceptableInputs.apply(serviceInputType)) {
                        System.out.println("Not acceptable: " + serviceInputType);
                        continue out;
                    }
                }
                matches.add(new Match(MatchMaker.this, query, service));
            }
            return Collections.unmodifiableList(matches);
        }
    }
}