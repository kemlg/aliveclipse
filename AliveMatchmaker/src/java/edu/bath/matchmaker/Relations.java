package edu.bath.matchmaker;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.SetMultimap;
import java.io.Serializable;
import java.util.Collections;
import java.util.Set;

/**
 * {@link Relation} implementations.
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class Relations {
    private Relations() { }

    /**
     * Creates a mutable relation based on hash tables.
     *
     * @param <E> the type of the relation elements
     * @return a new mutable relation
     */
    public static <E> MutableRelation<E> createHashBased() {
        return new SimpleRelation<E>();
    }

    private static class SimpleRelation<E> extends MutableRelation<E> implements Serializable {
        private final SetMultimap<E, E> relation = LinkedHashMultimap.create();

        private static final long serialVersionUID = 0L;

        @Override
        public void add(E e1, E e2) {
            relation.put(e1, e2);
        }

        @Override
        public String toString() {
            return relation.toString();
        }

        @Override
        public Set<E> related(E e) {
            return Collections.unmodifiableSet(relation.get(e));
        }

        @Override
        public Iterable<E> subjects() {
            return Collections.unmodifiableSet(relation.keySet());
        }
    }
}
