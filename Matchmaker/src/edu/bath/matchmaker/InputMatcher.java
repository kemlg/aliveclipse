package edu.bath.matchmaker;

import com.google.common.base.Predicate;
import java.net.URI;
import java.util.Set;

/**
 * A match strategy for inputs.
 * 
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 * @see InputMatchers
 */
public interface InputMatcher {
    /**
     * Returns a predicate that can be used to test whether some input is acceptable (satisfiable)
     * with respect to the specified set of inputs.
     *
     * @param subsumption the subsumption relation in which the specified inputs are a part of.
     * @param inputs some inputs
     * @return a predicate that can be used to test whether some input is acceptable (satisfiable)
     * with respect to the specified set of inputs
     */
    Predicate<URI> acceptableInputsFilter(Subsumption<URI> subsumption, Set<URI> inputs);
}
