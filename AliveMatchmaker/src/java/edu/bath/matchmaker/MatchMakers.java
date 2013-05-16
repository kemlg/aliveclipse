package edu.bath.matchmaker;

import com.google.common.base.Function;
import edu.bath.matchmaker.MatchDecorator.Decoration;
import edu.bath.matchmaker.prefs.Preference;
import java.io.IOException;
import java.net.URI;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.mindswap.owl.OWLOntology;

/**
 * Utilities for match makers.
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class MatchMakers {
    private MatchMakers() { }

    /**
     * Loads a collection of services into the provided {@link MatchMaker}. This has typically better performance than
     * sequentially loading the services one by one in the {@code MatchMaker}.
     *
     * @param matchMaker the {@code MatchMaker} that will load the services
     * @param services the services to load
     * @throws IOException if any service cannot be loaded
     * @throws InterruptedException if an interruption is requested while the services are loading
     */
    public static void loadServices(MatchMaker matchMaker, Collection<URI> services) throws IOException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 8);
        try{
            bulkRegister(matchMaker, services, executor);
        } finally {
            executor.shutdown();
        }
    }

    /**
     * Loads a collection of services into the provided {@link MatchMaker}, using as an execution engine the given
     * {@link ExecutorService}. This has potentially better performance than
     * sequentially loading the services one by one in the {@code MatchMaker}.
     *
     * @param matchMaker the {@link MatchMaker} that will load the services
     * @param services the services to load
     * @param executor the {@code ExecutorService} to use to load the services
     * @throws IOException if any service cannot be loaded
     * @throws InterruptedException if an interruption is requested while the services are loading
     */
    public static void bulkRegister(MatchMaker matchMaker, Collection<URI> services, Executor executor) throws IOException, InterruptedException {
        CompletionService<OWLOntology> completionService = new ExecutorCompletionService<OWLOntology>(executor);

        for (final URI service : services) {
            completionService.submit(new Callable<OWLOntology>() {
                public OWLOntology call() throws Exception {
                    Exception ex = null;
                    for (int trial = 0; trial < 3; trial++) {
                        try {
                            return OwlsUtils.parseURI(service);
                        } catch (Exception e) {
                            ex = e;
                        }
                    }
                    throw ex;
                }
            });
        }

        for (int i = 0; i < services.size(); i++) {
            Future<OWLOntology> future = completionService.take();
            try {
                OWLOntology ontology = future.get();
                matchMaker.registerService(ontology);
            } catch (ExecutionException e) {
                e.getCause().printStackTrace();
            }
        }
    }

    //package-private, not sure if useful enough to go public
    static <E> Preference<Match> preferenceOnDecoration(Preference<E> pref,
            Decoration decoration, Class<E> valueType) {
        return pref.onResultOf(new MapExtractor<E>(decoration, 
                com.google.common.base.Preconditions.checkNotNull(valueType)));
    }
}

class MapExtractor<V> implements Function<Match, V> {
    private final Decoration decoration;
    private final Class<V> valueType;

    MapExtractor(Decoration decoration, Class<V> valueType) {
        this.decoration = decoration;
        this.valueType = valueType;
    }

    public V apply(Match match) {
        return valueType.cast(match.getDecorations().get(decoration));
    }

    @Override
    public String toString() {
        return "Extractor(" + decoration + ")";
    }
}
