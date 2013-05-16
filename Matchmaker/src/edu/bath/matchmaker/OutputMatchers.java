package edu.bath.matchmaker;

import com.google.common.collect.Sets;
import java.net.URI;
import java.util.Collections;
import java.util.Set;
import org.mindswap.owl.vocabulary.OWL;

/**
 * Various {@link OutputMatcher} implementations.
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class OutputMatchers {
    private OutputMatchers() { }
    
    /**
     * Matches an output only with itself.
     */
    public static final OutputMatcher EXACT = new OutputMatcher() {

        /**
         * Returns a singleton set of the exact output given.
         *
         * @return a singleton set of the exact output given
         */
        @Override public Set<URI> acceptableOutputs(Subsumption<URI> subsumption, URI output) {
            return Collections.singleton(output);
        }

        @Override public String toString() {
            return "EXACT";
        }
    };

    /**
     * Matches an output with all its subclasses, including itself.
     */
    public static final OutputMatcher SUBCLASSES = new OutputMatcher() {
        /**
         * Returns a set of all subclasses of an output, including itself.
         *
         * @return a set of all subclasses of an output, including itself
         */
        @Override public Set<URI> acceptableOutputs(Subsumption<URI> subsumption, URI output) {
            if (output.equals(OWL.Thing.getURI())) {
                return null;
            }
            return subsumption.subsumes().closure(output);
        }

        @Override public String toString() {
            return "SUBCLASSES";
        }
    };

    /**
     * Matches an output with all its immediate superclasses, including itself.
     */
    public static final OutputMatcher IMMEDIATE_SUPERCLASSES = new OutputMatcher() {
        /**
         * Returns a set with all immediate superclasses of an output, including itself.
         *
         * @return a set with all immediate superclasses of an output, including itself
         */
        @Override public Set<URI> acceptableOutputs(Subsumption<URI> subsumption, URI output) {
            return Sets.union(Collections.singleton(output), subsumption.subsumedBy().related(output));
        }

        @Override public String toString() {
            return "IMMEDIATE_SUPERCLASSES";
        }
    };

    /**
     * Matches an output with all immediate subclasses, including itself.
     */
    public static final OutputMatcher IMMEDIATE_SUBCLASSES = new OutputMatcher() {
        /**
         * Returns a set with all immediate subclasses of an output, including itself.
         *
         * @return a set with all immediate subclasses of an output, including itself
         */
        @Override public Set<URI> acceptableOutputs(Subsumption<URI> subsumption, URI output) {
            return Sets.union(Collections.singleton(output), subsumption.subsumes().related(output));
        }

        @Override public String toString() {
            return "IMMEDIATE_SUBCLASSES";
        }
    };

    /**
     * Matches an output with all its superclasses, including itself.
     */
    public static final OutputMatcher SUPERCLASSES = new OutputMatcher() {
        /**
         * Returns a set of all superclasses of an output, including itself.
         *
         * @return a set of all superclasses of an output, including itself
         */
        @Override public Set<URI> acceptableOutputs(Subsumption<URI> subsumption, URI output) {
            if (output.equals(OWL.Nothing.getURI())) {
                return null;
            }
            return subsumption.subsumedBy().closure(output);
        }

        @Override public String toString() {
            return "SUPERCLASSES";
        }
    };
}
