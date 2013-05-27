package edu.bath.matchmaker;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Sets;
import java.net.URI;
import java.util.Set;
import org.mindswap.owl.vocabulary.OWL;

/**
 * Various {@link InputMatcher} implementations.
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class InputMatchers {
    private InputMatchers() { }

    /**
     * Matches an input only with itself.
     */
    public static final InputMatcher EXACT = new InputMatcher() {
        @Override public Predicate<URI> acceptableInputsFilter(Subsumption<URI> subsumption, Set<URI> inputs) {
            return Predicates.in(inputs);
        }

        @Override public String toString() {
            return "EXACT";
        }
    };

    /**
     * Matches an input with its superclasses (including itself).
     */
    public static final InputMatcher SUPERCLASSES = new InputMatcher() {
        @Override public Predicate<URI> acceptableInputsFilter(Subsumption<URI> subsumption, Set<URI> inputs) {
            System.out.println("Inputs: " + inputs);
            System.out.println("Subsumption: " + Predicates.in(subsumption.subsumedBy().closureOfMany(inputs)));
            if (inputs.contains(OWL.Nothing.getURI())) {
                //we know that nothing is subsumed by everything
                return Predicates.alwaysTrue();
            }
            return Predicates.in(subsumption.subsumedBy().closureOfMany(inputs));
        }

        @Override public String toString() {
            return "CONTRAVARIANT";
        }
    };

    /**
     * Matches an input with its immediate superclasses (including itself).
     */
    public static final InputMatcher IMMEDIATE_SUPERCLASSES = new InputMatcher() {
        @Override public Predicate<URI> acceptableInputsFilter(Subsumption<URI> subsumption, Set<URI> inputs) {
            Set<URI> acceptableInputs = Sets.newHashSet();
            Relation<URI> subsumedBy = subsumption.subsumedBy();
            for (URI input : inputs) {
                acceptableInputs.add(input);
                acceptableInputs.addAll(subsumedBy.related(input));
            }
            return Predicates.in(acceptableInputs);
        }

        @Override public String toString() {
            return "IMMEDIATE_SUPERCLASSES";
        }
    };

    /**
     * Matches an input with its immediate subclasses (including itself).
     */
    public static final InputMatcher IMMEDIATE_SUBCLASSES = new InputMatcher() {
        @Override public Predicate<URI> acceptableInputsFilter(Subsumption<URI> subsumption, Set<URI> inputs) {
            Set<URI> acceptableInputs = Sets.newHashSet();
            Relation<URI> subsumes = subsumption.subsumedBy();
            for (URI input : inputs) {
                acceptableInputs.add(input);
                acceptableInputs.addAll(subsumes.related(input));
            }
            return Predicates.in(acceptableInputs);
        }

        @Override public String toString() {
            return "IMMEDIATE_SUBCLASSES";
        }
    };

    /**
     * Matches an input with its subclasses (including itself).
     */
    public static final InputMatcher SUBCLASSES = new InputMatcher() {
        @Override public Predicate<URI> acceptableInputsFilter(Subsumption<URI> subsumption, Set<URI> inputs) {
            if (inputs.contains(OWL.Thing.getURI())) {
                //we know that thing subsumes everything
                return Predicates.alwaysTrue();
            }
            return Predicates.in(subsumption.subsumes().closureOfMany(inputs));
        }

        @Override public String toString() {
            return "COVARIANT";
        }
    };
}
