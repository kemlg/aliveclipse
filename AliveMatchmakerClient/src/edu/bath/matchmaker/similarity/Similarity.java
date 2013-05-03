package edu.bath.matchmaker.similarity;

import java.util.Set;

/**
 * Various similarity measures.
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public enum Similarity {
    /**
     * Cosine similarity, the range of which is {@code [-1.0, 1.0]} where larger values mean "more similar".
     * 
     * @see <a href="http://en.wikipedia.org/wiki/Cosine_similarity">Wikipedia on Cosine Similarity</a>
     */
    COSINE() {
        public <T> double similarity(TermWeights<T> tw1, TermWeights<T> tw2) {
            Set<T> intersection = TermWeights.termsIntersection(tw1, tw2);
            if (intersection.isEmpty()) return 0.0;

            return TermWeights.dotProduct(intersection, tw1, tw2) / tw1.norm() * tw2.norm();
        }
    },

    /**
     * Jaccard coefficient, the range of which is {@code [0.0, 1.0]} where larger values mean "more similar".
     * This measure does not use inverse document frequency.
     *
     * @see <a href="http://en.wikipedia.org/wiki/Jaccard_coefficient">Wikipedia on Jaccard Coefficient</a>
     * @see TermWeights
     */
    JACCARD() {
        public <T> double similarity(TermWeights<T> tw1, TermWeights<T> tw2) {
            Set<T> union = TermWeights.termsUnion(tw1, tw2);
            if (union.isEmpty()) return 0.0;
            return (double)TermWeights.termsIntersection(tw1, tw2).size() / union.size();
        }
    },
    
    /**
     * Tanimoto coefficient, the range of which is {@code [0.0, 1.0]} where larger values mean "more similar".
     *
     * @see <a href="http://en.wikipedia.org/wiki/Jaccard_index">Wikipedia on Tanimoto Coefficient</a>
     */
    TANIMOTO() {
        public <T> double similarity(TermWeights<T> tw1, TermWeights<T> tw2) {
            Set<T> intersection = TermWeights.termsIntersection(tw1, tw2);
            if (intersection.isEmpty()) return 0.0;
            double norm1 = tw1.norm();
            double norm2 = tw2.norm();
            double product = TermWeights.dotProduct(intersection, tw1, tw2);

            return  product / (norm1 * norm1 + norm2 * norm2 - product);
        }
    },
    
    /**
     * Sorensen similarity index (or Dice's coefficient), the range of which is {@code [0.0, 1.0]} where larger values mean "more similar".
     * This measure does not use inverse document frequency.
     *
     * @see <a href="http://en.wikipedia.org/wiki/Sørensen_similarity_index">Wikipedia on Sorensen Similarity Index</a>
     */
    SORENSEN() {
        public <T> double similarity(TermWeights<T> tw1, TermWeights<T> tw2) {
            Set<T> intersection = TermWeights.termsIntersection(tw1, tw2);
            if (intersection.isEmpty()) return 0.0;
            return 2.0 * intersection.size() / (tw1.terms().size() + tw2.terms().size());
        }
    },

    /**
     * (Negated) Jensen-Shannon Divergence, the range of which is {@code (-oo, 0.0]} where larger values mean "more similar". This is ne
     *
     * @see <a href="http://en.wikipedia.org/wiki/Jensen–Shannon_divergence">Wikipedia on Jensen–Shannon Divergence</a>
     */
    SHANNON() {
        public <T> double similarity(TermWeights<T> tw1, TermWeights<T> tw2) {
            double total = 0.0;
            for (T term : TermWeights.termsIntersection(tw1, tw2)) {
                double w1 = tw1.termWeight(term);
                double w2 = tw2.termWeight(term);
                if (w1 == 0.0 || w2 == 0.0) continue;
                total += h(w1 + w2) - h(w1) - h(w2);
            }

            return -total * minusHalfDividedByLog2;
        }

        private double h(double x) {
            return -x * Math.log(x);
        }
    };

    private static final double minusHalfDividedByLog2 = -0.5 / Math.log(2);

    /**
     * Returns the similarity score of two {@link TermWeights}. See this enum's constants for
     * the specification of how each implementation calculates the score.
     *
     * @param tw1 the first TermWeights instance
     * @param tw2 the second TermWeights instance
     * @return the similarity score for these two TermWeights instances
     */
    public abstract <T> double similarity(TermWeights<T> tw1, TermWeights<T> tw2);
}
