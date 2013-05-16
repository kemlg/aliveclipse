package edu.bath.matchmaker;

import java.net.URI;
import java.util.Set;

/**
 * A match strategy for outputs.
 * 
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 * @see OutputMatchers
 */
public interface OutputMatcher {
    /**
     * Returns a set of output types that are considered as acceptable (matchable) to a given output.
     * Null is an acceptable return value and means that <em>everything</em> is acceptable (for example,
     * if an OutputMatcher requires an output be matched with subclasses of it, then for {@code owl:Thing} it could return null,
     * since everything is a subclass of {@code owl:Thing}, thus everything would be acceptable).
     *
     *
     * @param subsumption the subsumption relation in which the specified output is a part of.
     * @param output an output
     * @return all acceptable (matchable) outputs with respect to the given output
     */
    Set<URI> acceptableOutputs(Subsumption<URI> subsumption, URI output);
}
