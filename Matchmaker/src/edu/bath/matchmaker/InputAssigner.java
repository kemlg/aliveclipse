package edu.bath.matchmaker;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLValue;
import org.mindswap.owls.process.variable.Input;
import org.mindswap.query.ValueMap;

/**
 * A utility for input assignment.
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class InputAssigner {
    private InputAssigner() { }

    /**
     * Produces all type-compatible ways to fulfil a list of {@link Input}s, given a list of {@link OWLValue}s.
     *
     * @param kb the knowledge base to use
     * @param inputsToBeFilled inputs that need to be fulfilled
     * @param availableData available values that can be used to fulfil inputs
     * @return a (lazy) iterator over the possible assignments of required inputs to available values
     */
    public static Iterator<ValueMap<Input, OWLValue>> matchings(final OWLKnowledgeBase kb,
            final List<Input> inputsToBeFilled, final List<OWLValue> availableData) {
        Iterator<Map<Input, OWLValue>> results = Iterators.filter(Combinator.create(inputsToBeFilled, availableData).iterator(),
                new Predicate<Map<Input, OWLValue>>() {
            Predicate<Entry<Input, OWLValue>> predicate = OwlsFunctions.valueCompatibilityPredicate(kb);
            public boolean apply(Map<Input, OWLValue> associations) {
                return Iterators.all(associations.entrySet().iterator(), predicate);
            }
        });
        //painful translation from Map to ValueMap
        return Iterators.transform(results, new Function<Map<Input, OWLValue>, ValueMap<Input, OWLValue>>() {
            public ValueMap<Input, OWLValue> apply(Map<Input, OWLValue> associations) {
                ValueMap<Input, OWLValue> result = new ValueMap<Input, OWLValue>();
                for (Entry<Input, OWLValue> entry : associations.entrySet()) {
                    result.setValue(entry.getKey(), entry.getValue());
                }
                return result;
            }
        });
    }
}

