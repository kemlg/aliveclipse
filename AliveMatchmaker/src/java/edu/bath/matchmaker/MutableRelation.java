package edu.bath.matchmaker;

/**
 * A mutable {@link Relation}.
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 * @param <E> the type of elements in the relation
 */
public abstract class MutableRelation<E> extends Relation<E> {
    /**
     * Relates the first element to the second
     *
     * @param e1 the first element
     * @param e2 the second element
     */
    public abstract void add(E e1, E e2);
}
