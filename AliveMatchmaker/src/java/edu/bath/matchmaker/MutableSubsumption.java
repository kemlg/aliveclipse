package edu.bath.matchmaker;

import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Set;

/**
 * A mutable {@link Subsumption}.
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 * @param <E> the type of elements in the relation
 */
public abstract class MutableSubsumption<E> extends Subsumption<E> {
    /**
     * Returns the "subsumes" relation (inverse of {@link #subsumedBy()})
     *
     * @return the "subsumes" relation (inverse of {@code #subsumedBy()})
     */
    public abstract MutableRelation<E> subsumes();

    /**
     * Returns the "subsumedBy" relation (inverse of {@link #subsumes()})
     *
     * @return the "subsumedBy" relation (inverse of {@code #subsumes()})
     */
    public abstract MutableRelation<E> subsumedBy();

    //first subsumes second
    /**
     * Adds a "subsumes" relationship ({@code e1 subsumes e2}) in this subsumption.
     * Updates both the "subsumes" relation and its inverse.
     *
     * @param e1 the element that subsumes the other
     * @param e2 the element that is subsumed by the other
     */
    public abstract void addSubsumes(E e1, E e2);

    /**
     * Merges the subsumption relationships for some elements, as found in another Subsumption instance.
     *
     * @param elements the elements of which the subsumption relation to update
     * @param subsumption the subsumption from which to copy available relationships for the specified elements
     */
    void merge(Iterable<E> elements, Subsumption<E> subsumption) {
        merge(elements, subsumption.subsumedBy(), subsumedBy(), subsumes());
        merge(elements, subsumption.subsumes(), subsumes(), subsumedBy());
    }

    private void merge(Iterable<E> elements, Relation<E> toMerge,
            MutableRelation<E> relation, MutableRelation<E> inverse) {
        Set<E> visited = Sets.newHashSet();
        Iterator<E> toExplore = elements.iterator();

        while (toExplore.hasNext()) {
            E next = toExplore.next();
            if (!visited.add(next)) continue;

            Set<E> nextRelated = toMerge.related(next);
            for (E related : nextRelated) {
                relation.add(next, related);
                inverse.add(related, next);
            }
            toExplore = Iterators.concat(nextRelated.iterator(), toExplore);
        }
    }
}
