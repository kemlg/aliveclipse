package edu.bath.matchmaker;

/**
 * A subsumption relation, which is "subsumes" relation and its inverse. Equality and hash code are defined
 * in terms of {@linkplain #subsumes()}.
 *
 * @param <E> the type of elements in the relation
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public abstract class Subsumption<E> {
    /**
     * The subsumes relation of this subsumption. Inverse of {@link #subsumedBy() }.
     *
     * @return the subsumes relation
     */
    public abstract Relation<E> subsumes();

    /**
     * The subsumedBy relation of this subsumption. Inverse of {@link #subsumes() }.
     *
     * @return the subsumedBy relation
     */
    public abstract Relation<E> subsumedBy();

    /**
     * Delegates to {@linkplain #subsumes()}.
     */
    @Override
    public int hashCode() {
        return subsumes().hashCode();
    }

    /**
     * Delegates to {@linkplain #subsumes()}.
     */
    @Override
    public boolean equals(Object that) {
        if (!(that instanceof Subsumption)) return false;
        return subsumes().equals(((Subsumption<?>)that).subsumes());
    }
}
