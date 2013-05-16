package edu.bath.matchmaker;

import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import gr.forth.ics.graph.Graph;
import gr.forth.ics.graph.Node;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * A binary reflexive relation. Equality and hash code are defined
 * in terms of {@linkplain #subjects()} and {@linkplain #related(Object)}.
 * 
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public abstract class Relation<E> {
    /**
     * Returns the elements related to the specified element. The (immutable) returned set is not required
     * to contain the element itself.
     *
     * @param e an element
     * @return the related elements set of the element
     */
    public abstract Set<E> related(E e);

    /**
     * Returns a read-only iterable over all the elements that may have relationships. Iterating the subjects
     * and accessing the related items of each subject should yield the complete relation.
     *
     * @return a read-only iterable over all the elements that may have relationships
     */
    public abstract Iterable<E> subjects();

    /**
     * Returns the transitive closure of an element (which always includes the element itself).
     * The returned set can be modified freely without side-effects to this relation.
     *
     * @param e an element
     * @return the transitive closure of the element (which includes the element itself)
     */
    public Set<E> closure(E e) {
        return closureOfMany(Collections.singleton(e));
    }
    
    /**
     * Returns the union of the transitive closure of some elements (which always includes the elements themselves).
     * The returned set can be modified freely without side-effects to this relation. When the transitive
     * closures of the elements are expected to overlap, this method is more efficient than
     * computing separately the transitive closure of each element and unioning them.
     *
     * @param elements some elements
     * @return the transitive closure of the elements (which includes the elements themselves)
     */
    public Set<E> closureOfMany(Iterable<E> elements) {
        Set<E> closure = Sets.newHashSet();
        Iterator<E> toExplore = elements.iterator();

        while (toExplore.hasNext()) {
            E next = toExplore.next();
            if (closure.contains(next)) {
                continue;
            }
            closure.add(next);
            toExplore = Iterators.concat(related(next).iterator(), toExplore); //adding the directly related elements
        }
        return closure;
    }

    /**
     * Returns whether {@code e2} is in the transitive closure of {@code e1}.
     *
     * @param e1 an element
     * @param e2 another element
     * @return whether the second element is related to the first
     */
    public boolean isRelated(E e1, E e2) {
        Set<E> closure = Sets.newHashSet();
        Iterator<E> toExplore = Iterators.singletonIterator(e1);

        while (toExplore.hasNext()) {
            E next = toExplore.next();
            if (next.equals(e2)) {
                return true;
            }
            if (closure.contains(next)) {
                continue;
            }
            closure.add(next);
            toExplore = Iterators.concat(related(next).iterator(), toExplore); //adding the directly related elements
        }
        return false;
    }

    public void toGraph(Graph g) {
        Map<E, Node> nodes = Maps.newHashMap();
        for (E subject : subjects()) {
            Set<E> related = related(subject);
            if (related.isEmpty()) continue;

            Node n1 = getOrCreate(nodes, subject, g);
            for (E object : related) {
                Node n2 = getOrCreate(nodes, object, g);
                g.newEdge(n1, n2);
            }
        }
    }

    private Node getOrCreate(Map<E, Node> nodes, E object, Graph g) {
        Node n1 = nodes.get(object);
        if (n1 == null) {
            nodes.put(object, n1 = g.newNode(object));
        }
        return n1;
    }

    /**
     * Delegates to {@linkplain #subjects()} and {@linkplain #related(Object)}.
     */
    @Override
    public int hashCode() {
        int hashCode = subjects().hashCode();
        for (E subject : subjects()) {
            hashCode += related(subject).hashCode();
        }
        return hashCode;
    }

    /**
     * Delegates to {@linkplain #subjects()} and {@linkplain #related(Object)}.
     */
    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object o) {
        if (!(o instanceof Relation)) return false;
        Relation that = (Relation)o;

        if (!this.subjects().equals(that.subjects())) return false;

        for (E subject : subjects()) {
            if (!related(subject).equals(that.related(subject))) return false;
        }
        return true;
    }
}
