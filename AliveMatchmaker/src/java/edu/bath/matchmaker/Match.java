package edu.bath.matchmaker;

import com.google.common.collect.Maps;
import edu.bath.matchmaker.MatchDecorator.Decoration;
import java.util.Map;
import jena.query;

/**
 * A service that is matched with a service request. Equality and hash code are defined
 * in terms of {@linkplain #getService() ()}, {@linkplain #getQuery() ()} and {@linkplain #getDecorations()}.
 */
public final class Match {
    private final MatchMaker matchMaker;
    private final ServiceDescriptor query;
    private final ServiceDescriptor service;
    private final Map<Decoration, Object> decorations = Maps.newHashMapWithExpectedSize(4);

    Match(MatchMaker matchMaker, ServiceDescriptor query, ServiceDescriptor service) {
        this.matchMaker = matchMaker;
        this.query = query;
        this.service = service;
    }

    /**
     * The service that fulfils the requested service.
     *
     * @return service that fulfils the requested service
     */
    public ServiceDescriptor getService() {
        return service;
    }

    /**
     * The query for which this match was produced.
     *
     * @return the query for which this match was produced
     */
    public ServiceDescriptor getQuery() {
        return query;
    }

    /**
     * Adds an attribute to this match.
     *
     * @param key the key of the attribute
     * @param value the value of the attribute
     * @see #getDecoration(edu.bath.matchmaker.MatchDecorator.Decoration)
     */
    public void putDecoration(Decoration key, Object value) {
        decorations.put(key, value);
    }

    /**
     * Finds an attribute (indexed with a particular key) added to this match. Keys are tested for equality
     * using the {@linkplain Object#equals(Object) } method.
     *
     * @param key the key of the attribute
     * @return the value of the attribute, or {@code null} if no attribute with such key was added
     */
    public Object getDecoration(Decoration key) {
        return decorations.get(key);
    }

    /**
     * Returns a modifiable, live view of this match's attributes.
     *
     * @return a modifiable, live view of this match's attributes
     */
    public Map<Decoration, Object> getDecorations() {
        return decorations;
    }

    /**
     * Returns the MatchMaker that created this match.
     *
     * @return the MatchMaker that created this match
     */
    public MatchMaker getMatchMaker() {
        return matchMaker;
    }

    @Override
    public String toString() {
        return "[" + service + "; " + " decorations=" + decorations + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Match)) return false;
        final Match that = (Match) obj;
        return this.service.equals(that.service) &&
                this.query.equals(that.query) &&
                this.decorations.equals(that.decorations);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + query.hashCode();
        hash = 97 * hash + service.hashCode();
        hash = 97 * hash + decorations.hashCode();
        return hash;
    }
}
