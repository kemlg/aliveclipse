package edu.bath.matchmaker;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import java.net.URI;
import java.util.Map.Entry;
import org.mindswap.owl.OWLClass;
import org.mindswap.owl.OWLDataValue;
import org.mindswap.owl.OWLEntity;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLObject;
import org.mindswap.owl.OWLType;
import org.mindswap.owl.OWLValue;
import org.mindswap.owls.process.Input;
import org.mindswap.owls.process.Parameter;

/**
 * Useful {@link Function functions} and {@link Predicate predicates} related to OWLS.
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
class OwlsFunctions {
    /**
     * Returns a function that downcasts an {@link OWLObject} to a narrower type.
     *
     * @param <T>a subtype of {@code OWLObject} to cast to
     * @param typeToCastTo the type to cast specified OWLObject to
     * @return a function that downcasts an {@code OWLObject} to a narrower type
     */
    static <T extends OWLObject> Function<OWLObject, T> typeCaster(final Class<T> typeToCastTo) {
        return new Function<OWLObject, T>() {
            public T apply(OWLObject o) {
                return o.castTo(typeToCastTo);
            }
        };
    }

    /**
     * Returns a function that finds the {@link OWLClass type} of a parameter
     *
     * @param kb the knowledge base to use to look up the type of a parameter
     * @return a function that finds the type of a parameter
     */
    static Function<Parameter, OWLClass> paramTypeExtractor(final OWLKnowledgeBase kb) {
        return new Function<Parameter, OWLClass>() {
            public OWLClass apply(Parameter p) {
                return kb.getClass(p.getParamType().getURI());
            }
        };
    }

    /**
     * Returns a predicate that checks whether a particular value assignment to an input (represented
     * as {@code Entry<Input, OWLValue>}) is type-wise compatible.
     *
     * <p>If an input specification calls for a data type (instead of a class), and a data value is provided (instead of an individual),
     * then this method checks whether the input data type is equal to the type of the data value, <strong>if</strong> the data
     * value declares its type. If it doesn't, no literal value checking is performed, and the assignment is (optimistically) accepted.
     *
     * @param kb the knowledge base to use to verify the validity of a value assignment to an input
     * @return a predicate that checks whether a particular value assignment to an input is type-wise compatible
     */
    static Predicate<Entry<Input, OWLValue>> valueCompatibilityPredicate(final OWLKnowledgeBase kb) {
        return new Predicate<Entry<Input, OWLValue>>() {
            public boolean apply(Entry<Input, OWLValue> association) {
                Input input = association.getKey();
                OWLValue value = association.getValue();

                OWLType type = input.getParamType();

                if (type.isClass()) {
                    OWLClass clazz = type.castTo(OWLClass.class);
                    return value.isIndividual() && value.castTo(OWLIndividual.class).isType(clazz);
                } else if (type.isDataType()) {
                    if (!value.isDataValue()) {
                        return false;
                    }
                    OWLDataValue dataValue = value.castTo(OWLDataValue.class);
                    //optimistically
                    return dataValue.getDatatypeURI() == null || dataValue.getDatatypeURI().equals(type.getURI());
                } else {
                    throw new AssertionError("Unexpected type, neither class nor datatype: " + type);
                }
            }
        };
    }

    /**
     * Returns a function that returns the {@link OWLEntity#getURI() URI} of an {@link OWLEntity}.
     *
     * @return a function that returns the {@code URI} of an {@code OWLEntity}
     */
    static Function<OWLEntity, URI> uriExtractor() {
        return GetURIFunction.instance;
    }

    static class GetURIFunction implements Function<OWLEntity, URI> {
        static final GetURIFunction instance = new GetURIFunction();

        public URI apply(OWLEntity o) {
            return o.getURI();
        }
    }
}
