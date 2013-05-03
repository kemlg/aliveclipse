package edu.bath.matchmaker;

import edu.bath.matchmaker.prefs.Preference;
import java.net.URI;
import java.util.Collection;
import java.util.List;
import org.mindswap.owls.service.Service;

/**
 * A match decorator. It may arbitrarily decorate matches produced by a {@link MatchMaker}.
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public interface MatchDecorator {

    /**
     * May add decorations to a list of {@linkplain Match}es produced by the specified {@link MatchMaker} for a given query.
     * Note that the {@code query} parameter is redundant, since it is guaranteed that {@link Match#getQuery()} will return it, for
     * every match, but it is provided for convenience.
     *
     * @param matchMaker the {@code MatchMaker} that created the match
     * @param subsumption the subsumption relation of the matchmaker
     * @param queryDescr the query that was performed
     * @param query the query that was performed, as an OWLS entity
     * @param match the match to be decorated
     * @see Match#putDecoration(edu.bath.matchmaker.MatchDecorator.Decoration, Object)
     */
    void decorate(MatchMaker matchMaker, Subsumption<URI> subsumption,
            ServiceDescriptor queryDescr, Service query,
            List<? extends Match> match);

    /**
     * Notifies the decorator that a service was registered in the specified {@linkplain MatchMaker}.
     *
     * @param matchMaker the {@code MatchMaker} in which a service was registered
     * @param serviceDescr the service that was registered
     * @param service the service that was registered
     */
    void onRegistration(MatchMaker matchMaker, ServiceDescriptor serviceDescr, Service service);

    /**
     * Notifies the decorator that a service was deregistered from the specified {@linkplain MatchMaker}.
     *
     * @param matchMaker the {@code MatchMaker} in which a service was registered
     * @param serviceDescr the service that was registered
     */
    void onDeregistration(MatchMaker matchMaker, ServiceDescriptor serviceDescr);

    /**
     * Returns all the decorations that this decorator will provide for each match.
     *
     * @return all the decorations that this decorator will provide for each match
     */
    Collection<? extends Decoration> providedDecorations();

    /**
     * A decoration defines a partial order on matches.
     */
    public interface Decoration {

        /**
         * Returns the partial order of matches that this decoration induces
         *
         * @return the partial order of matches that this decoration induces
         */
        Preference<Match> preference();
    }
}

