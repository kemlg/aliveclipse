package edu.bath.matchmaker.similarity;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;

/**
 * A set of terms along with their corresponding weights.
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class TermWeights<T> {
    private final ImmutableSet<T> terms;
    private final Function<? super T, Double> weightFunction;

    public TermWeights(Set<T> terms, Function<? super T, Double> weightFunction) {
        this.terms = ImmutableSet.copyOf(terms);
        this.weightFunction = weightFunction;
    }

    public static <T> TermWeights<T> forMap(Map<T, Double> termsAndWeights) {
        return new TermWeights<T>(termsAndWeights.keySet(), Functions.forMap(termsAndWeights));
    }

    public static <T> TermWeights<T> equallyWeighted(Set<T> terms) {
        return new TermWeights<T>(terms, Functions.constant(1.0));
    }

    /**
     * Returns the weight of a given term. If the term is not contained in this TermWeights, 0.0 is returned.
     *
     * @param term the term to find the weight of
     * @return the weight of a given term, or 0.0 if the term is not contained in this TermWeights
     */
    public double termWeight(T term) {
        Double value = weightFunction.apply(term);
        if (value == null) {
            return 0.0;
        }
        return value;
    }

    /**
     * Returns an immutable set of the terms contained in this TermWeights.
     *
     * @return an immutable set of the terms contained in this TermWeights
     */
    public Set<T> terms() {
        return terms;
    }

    @Override
    public String toString() {
        return Iterables.transform(terms, new Function<T, String>() {
            public String apply(T object) {
                return String.valueOf(object) + "->" + weightFunction.apply(object);
            }
        }).toString();
    }

    /**
     * Returns the norm of the vector defined by the weights of each term of this TermWeights.
     *
     * @return the norm of the vector defined by the weights of each term of this TermWeights
     */
    public double norm() {
        return norm(terms());
    }

    double norm(Set<T> termsSubset) {
        double total = 0.0;
        for (T term : termsSubset) {
            double weight = weightFunction.apply(term);
            total += weight * weight;
        }
        return Math.sqrt(total);
    }

    /**
     * Returns the dot product of the vectors by the weights of each term of two TermWeights.
     *
     * @return the dot product of the vectors by the weights of each term of two TermWeights
     */
    public static <T> double dotProduct(TermWeights<T> tw1, TermWeights<T> tw2) {
        return dotProduct(Sets.intersection(tw1.terms(), tw2.terms()), tw1, tw2);
    }

    static <T> double dotProduct(Set<T> terms, TermWeights<T> tw1, TermWeights<T> tw2) {
        double sum = 0.0;
        for (T term : terms) {
            sum += tw1.termWeight(term) * tw2.termWeight(term);
        }
        return sum;
    }

    static <T> Set<T> termsIntersection(TermWeights<T> tw1, TermWeights<T> tw2) {
        Set<T> terms1 = tw1.terms();
        Set<T> terms2 = tw2.terms();
        if (terms1.size() > terms2.size()) {
            Set<T> swp = terms1;
            terms1 = terms2;
            terms2 = swp;
        }
        return Sets.intersection(terms1, terms2);
    }

    static <T> Set<T> termsUnion(TermWeights<T> tw1, TermWeights<T> tw2) {
        Set<T> terms1 = tw1.terms();
        Set<T> terms2 = tw2.terms();
        if (terms1.size() > terms2.size()) {
            Set<T> swp = terms1;
            terms1 = terms2;
            terms2 = swp;
        }
        return Sets.union(terms1, terms2);
    }
}
