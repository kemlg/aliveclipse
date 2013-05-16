package edu.bath.matchmaker.prefs;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import edu.bath.matchmaker.prefs.Preference.ValueWithPreferences.Value;
import gr.forth.ics.graph.Graph;
import gr.forth.ics.graph.PrimaryGraph;
import gr.forth.ics.graph.algo.transitivity.Closure;
import gr.forth.ics.graph.algo.transitivity.PathFinder;
import gr.forth.ics.graph.algo.transitivity.SuccessorSetFactory;
import gr.forth.ics.graph.algo.transitivity.Transitivity;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * A preference relation. Formally, a preference relation is a 
 * <a href="http://en.wikipedia.org/wiki/Preorder">preorder</a>.
 * If two elements, {@code A, B}, are related via a preference relation, {@code A <= B},
 * we say that "B is at least as preferred as A". If it also happens that {@code B <= A},
 * then "A and B are equally preferable", while if {@code B <= A} does not hold, then
 * "B is strictly preferable to A". If neither {@code A <= B}, nor {@code B <= A},
 * then "A and B are incomparable".
 *
 * <p>The most direct way to construct a preference is by directly implementing the relation predicate
 * {@link #equalOrBetter}, but there are many other ways to derive a Preference too (see
 * methods of this class that return a {@code Preference}).
 *
 * <p>A {@code Preference<E>} instance can {@link #topElements(Iterable, int) select the top K elements}
 * from an {@code Iterable<? extends E>}, or can {@link #sortedCopy(Iterable) sort}
 * an {@code Iterable<? extends E>}
 * (placing more preferable elements earlier than less preferable)
 *
 *  @param <E> the elements type upon which this preference relation is defined
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public abstract class Preference<E> {
    /** Preference constructor, available for subclasses. */
    protected Preference() { }

    //helper for preferences than want to implement only the compare() method.
    boolean equalOrBetterThroughComparison(E o1, E o2) {
        Comparison c = compare(o1, o2);
        switch (c) {
            case EQUAL: case BETTER: return true;
            default: return false;
        }
    }

    /**
     * Compares two elements according to this preference. 
     * This is used in {@link #topElements(Iterable, int)} method.
     * The default implementation follows the following (we write
     * {@code A <= B} if and only if {@code equalOrBetter(B, A) == true}):
     * <ul>
     * <li>If {@code B <= A} and {@code A <= B}, the result is {@code Comparison.EQUAL}.
     * <li>If {@code B <= A} and not {@code A <= B}, the result is {@code Comparison.BETTER}.
     * <li>If not {@code B <= A} and {@code A <= B}, the result is {@code Comparison.WORSE}.
     * <li>If not {@code B <= A} and not {@code A <= B}, the result is {@code Comparison.INCOMPARABLE}.
     * </ul>
     *
     * <p>Sometimes is makes sense to override this method for performance (e.g. if the result
     * can be determined faster than to queries to {@linkplain #equalOrBetter(Object, Object) equalOrBetter}).
     *
     * @param e1 the first element to compare
     * @param e2 the second element to compare
     * @return a Comparison object, indicating the relation, according to this preference, of
     * the specified elements
     */
    public Comparison compare(E e1, E e2) {
        boolean first = equalOrBetter(e1, e2);
        boolean second = equalOrBetter(e2, e1);
        if (first) {
            return second ? Comparison.EQUAL : Comparison.BETTER;
        } else {
            return second ? Comparison.WORSE : Comparison.INCOMPARABLE;
        }
    }

    /**
     * Returns whether the first element is equal or better to the second element. This is the most
     * primitive way to define a preference relation.
     *
     * @param e1 the first element
     * @param e2 the second element
     * @return {@code true} if {@code e1} is considered either equal or better to {@code e2},
     * {@code false} otherwise.
     */
    public abstract boolean equalOrBetter(E e1, E e2);

    /**
     * All different comparison results according to a preference.
     */
    public static enum Comparison {
        /**
         * The left (first) element is strictly worse than the right (second).
         */
        WORSE("<"),

        /**
         * The right (second) element is strictly better than the left (first).
         */
        BETTER(">"),

        /**
         * Elements are incomparable.
         */
        INCOMPARABLE("||"),

        /**
         * Elements are equally preferred.
         */
        EQUAL("=");

        private final String symbol;
        private Comparison(String symbol) {
            this.symbol = symbol;
        }

        /**
         * Returns a textual representation for this comparison. Particularly:
         * <ul>
         * <li>{@code "<"} for {@code WORSE},
         * <li>{@code ">"} for {@code BETTER},
         * <li>{@code "||"} for {@code INCOMPARABLE},
         * <li>{@code "="} for {@code EQUAL},
         * </ul>
         * @return a textual representation for this comparison
         */
        @Override public String toString() {
            return symbol;
        }

        /**
         * Returns the opposite comparison than this one. Specifically:
         * <ul>
         * <li>if this is {@code WORSE}, then {@code BETTER} is returned
         * <li>if this is {@code BETTER}, then {@code WORSE} is returned
         * <li>otherwise, this is returned.
         * </ul>
         * @return the opposite comparison than this one
         */
        public Comparison flip() {
            switch (this) {
                case WORSE: return BETTER;
                case BETTER: return WORSE;
            }
            return this;
        }
    }

    /**
     * Creates a {@code Preference<T>}, given a function that translates {@code T}s
     * back to {@code E}s which can be compared with this {@code Preference<E>}.
     *
     * @param <T> the domain of elements of the preference to be created
     * @param function a function that maps objects of type {@code T} back to objects of type {@code E}, which
     * this preference applies to
     * @return a preference on {@code T} elements
     */
    public <T> Preference<T> onResultOf(final Function<? super T, ? extends E> function) {
        Preconditions.checkNotNull(function);
        return new Preference<T>() {
            public boolean equalOrBetter(T o1, T o2) {
                return Preference.this.equalOrBetter(function.apply(o1), function.apply(o2));
            }

            @Override
            public Comparison compare(T o1, T o2) {
                return Preference.this.compare(function.apply(o1), function.apply(o2));
            }

            @Override
            public String toString() {
                return Preference.this.toString() + " on result of " + function;
            }
        };
    }

    /**
     * Creates a sorted list of the given elements, according to this preference. Specifically,
     * the returned list has the property that each element is placed <em>after</em> all
     * elements which are strictly preferred to it.
     *
     * @param <T> the type of elements to sort, which should be a subtype of {@code E} for this preference to be applicable
     * @param elements the elements to sort
     * @return a sorted list of the elements according to this preference
     */
    public final <T extends E> List<T> sortedCopy(Iterable<T> elements) {
        return Ordering.from(new Comparator<E>() {
            public int compare(E o1, E o2) {
                Comparison c = Preference.this.compare(o1, o2);
                switch (c) {
                    case WORSE: return 1;
                    case BETTER: return -1;
                    default: return 0;
                }
            }
        }).sortedCopy(elements);
    }

    /**
     * Finds the top elements of the specified collection according to this preference. The resulting elements
     * are listed in blocks (lists) with the following guarantees:
     * <ul>
     * <li>No element of a subsequent block is strictly better than <em>any</em> element of a previous block.
     * <li><em>Every</em> element of a block (except for the first block) is strictly worse compared to
     * at least one element of a previous block.
     * </ul>
     *
     * <p>To flatten the returned blocks to a single {@code Iterable<T>}, an easy way to do it is via {@link com.google.common.collect.Iterables}:
     * {@code Iterables.concat(blocks)}
     *
     * @param elements the objects from which to choose the top (best) ones, according to this preference
     * @param maxElements the number of elements required. Note that this method may return fewer elements if there are not enough, or more elements if it
     * would have to choose arbitrarily which element to throw away (in case of incomparable objects)
     * @return the top elements of the specified elements
     * @see <a href="http://ectrl.itc.it/rpec/RPEC-Papers/01-torlone.pdf">"Which Are My Preferred Items?", Riccardo Torlone and Paolo Ciaccia</a>
     */
    public final <T extends E> List<List<T>> topElements(Iterable<T> elements, int maxElements) {
        Set<T> whitelist = Collections.newSetFromMap(new IdentityHashMap<T, Boolean>());
        List<List<T>> results = Lists.newArrayList();

        while (whitelist.size() < maxElements) {
            LinkedList<T> winners = Lists.newLinkedList();
            for (T object : elements) {
                if (whitelist.contains(object)) {
                    continue;
                }
                boolean dominated = false;
                for (Iterator<T> winnersIterator = winners.iterator(); !dominated && winnersIterator.hasNext(); ) {
                    E currentWinner = winnersIterator.next();
                    switch (compare(currentWinner, object)) {
                        case WORSE: winnersIterator.remove(); break;
                        case BETTER: dominated = true; break;
                    }
                }
                if (!dominated) {
                    winners.add(object);
                }
            }
            if (winners.isEmpty()) {
                break;
            }
            whitelist.addAll(winners);
            results.add(winners);
        }
        return results;
    }

    /**
     * Creates a preference that mimicks the total order defined by the specified {@code Comparator}. That is, the "best" elements
     * of the created partial order are the "smallest" elements of the comparator.
     *
     * @param <E> the type of the elements that the comparator handles
     * @param comparator the comparator that will support the created preference
     * @return a preference that mimicks the total order defined by the specified {@code Comparator}
     */
    public static <E> Preference<E> from(final Comparator<E> comparator) {
        Preconditions.checkNotNull(comparator);
        return new Preference<E>() {
            @Override
            public Comparison compare(E o1, E o2) {
                int c = comparator.compare(o1, o2);
                if (c < 0) return Comparison.BETTER;
                else if (c > 0) return Comparison.WORSE;
                else return Comparison.EQUAL;
            }

            @Override
            public boolean equalOrBetter(E o1, E o2) {
                return comparator.compare(o1, o2) <= 0;
            }

            @Override
            public String toString() {
                return comparator.toString();
            }
        };
    }

    /**
     * Creates a preference from the natural total order of a {@code Comparable} type. That is, the "best" elements
     * of the created preference are the "smallest" elements of the natural order. Note that
     * this means that, for example, smaller numbers are preferred to larger ones.
     *
     * @param <E> the {@code Comparable} type that the created preference will handle
     * @return a preference from the total natural order of a {@code Comparable} type
     * @see #from(Comparator)
     */
    public static <E extends Comparable> Preference<E> natural() {
        return Preference.<E>from(Ordering.<E>natural());
    }

    /**
     * Returns a preference in which every comparison returns {@code Comparison.INCOMPARABLE}.
     *
     * @param <E> any type
     * @return a preference that treats all elements as incomparable to each other
     */
    @SuppressWarnings("unchecked") //safe, the returned order can handle any type (it handles Object)
    public static <E> Preference<E> incomparable() {
        return (Preference<E>)allIndifferent;
    }

    private static final Preference<Object> allIndifferent = new Preference<Object>() {
        @Override
        public boolean equalOrBetter(Object o1, Object o2) {
            return o1 == o2;
        }
    };

    /**
     * Creates the reverse preference of this preference. For example, reversing a preference
     * {@link #natural() created by the natural total order} of an element type means considering
     * the least elements of it as the greatest, and so on.
     *
     * @return a reverse preference of this one
     */
    public Preference<E> reverse() {
        if (this instanceof ReversePreference) {
            return ((ReversePreference<E>)this).delegate;
        }
        return new ReversePreference<E>(this);
    }

    private static class ReversePreference<E> extends Preference<E> {
        final Preference<E> delegate;

        ReversePreference(Preference<E> delegate) {
            this.delegate = delegate;
        }

        @Override
        public Comparison compare(E o1, E o2) {
            return delegate.compare(o2, o1);
        }

        @Override
        public boolean equalOrBetter(E o1, E o2) {
            return delegate.equalOrBetter(o2, o1);
        }

        @Override
        public String toString() {
            return "Reverse of " + delegate;
        }
    }

    /**
     * Creates a {@linkplain Value} with the specified value, which can be used to declaratively
     * create preferences involving it.
     *
     * @param <T> the type of the value
     * @param value the value of the {@code PreferenceBuilder}
     * @return a {@code PreferenceBuilder} for creating a {@code Preference} involving the specified value
     */
    public static <T> Value<T> value(T value) {
        return new Value<T>(ImmutableList.of(value));
    }

    /**
     * Creates a {@linkplain ValueWithPreferences} with the specified (all preferred equivalently) values,
     * which can be used to declaratively create preferences involving them.
     *
     * @param <T> the type of the values
     * @param value1 a value of the {@code ValueWithPreferences}
     * @param value2 a value of the {@code ValueWithPreferences}
     * @return a {@code ValueWithPreferences} for creating a {@code Preference} involving the specified values
     */
    public static <T> Value<T> values(T value1, T value2) {
        return new Value<T>(ImmutableList.of(value1, value2));
    }

    /**
     * Creates a {@linkplain ValueWithPreferences} with the specified (all preferred equivalently) values,
     * which can be used to declaratively create preferences involving them.
     *
     * @param <T> the type of the values
     * @param value1 a value of the {@code ValueWithPreferences}
     * @param value2 a value of the {@code ValueWithPreferences}
     * @param value3 a value of the {@code ValueWithPreferences}
     * @return a {@code ValueWithPreferences} for creating a {@code Preference} involving the specified values
     */
    public static <T> Value<T> values(T value1, T value2, T value3) {
        return new Value<T>(ImmutableList.of(value1, value2, value3));
    }

    /**
     * Creates a {@linkplain ValueWithPreferences} with the specified (all preferred equivalently) values,
     * which can be used to declaratively create preferences involving them.
     *
     * @param <T> the type of the values
     * @param values the values of the {@code ValueWithPreferences}
     * @return a {@code ValueWithPreferences} for creating a {@code Preference} involving the specified values
     */
    public static <T> Value<T> values(Iterable<T> values) {
        return new Value<T>(ImmutableList.copyOf(values));
    }

    /**
     * A set (perhaps singleton) of equally preferred values, which in turn
     * are preferred to other values (or perhaps none).
     *
     * @param <T> the type of the node's value(s)
     */
    public static class ValueWithPreferences<T> {
        private static final class Artificial {}
        private final ImmutableCollection<T> values;
        private final ImmutableList<ValueWithPreferences<T>> worseNodes;

        private ValueWithPreferences(ImmutableCollection<T> values, ImmutableList<ValueWithPreferences<T>> worseNodes) {
            this.values = values;
            this.worseNodes = worseNodes;
        }

        /**
         * Creates a preference that treats this node's value(s) as the top/best value(s), and transitively honours
         * each {@link Value#preferredTo(Iterable) preferredTo} declaration.
         *
         * @return a preference that treats this node's value(s) as the top/best value(s), and transitively honours
         * each {@code preferredTo} declaration.
         */
        public Preference<T> toPreference() {
            Set<ValueWithPreferences<T>> allNodes = collectNodes();

            Graph g = new PrimaryGraph();
            Map<ValueWithPreferences<T>, gr.forth.ics.graph.Node> nodeMap = Maps.newHashMap();

            for (ValueWithPreferences<T> n : allNodes) {
                nodeMap.put(n, g.newNode());
            }

            for (ValueWithPreferences<T> n : allNodes) {
                for (ValueWithPreferences<T> w : n.worseNodes) {
                    g.newEdge(nodeMap.get(n), nodeMap.get(w));
                }
            }

            Closure closure = Transitivity.acyclicClosure(g, SuccessorSetFactory.intervalBased(g));
            g.removeAllEdges(); //reduce memory footprint; the closure already captured the relationships

            Map<T, gr.forth.ics.graph.Node> valueMap = Maps.newIdentityHashMap();
            for (ValueWithPreferences<T> n : allNodes) {
                for (T value : n.values) {
                    if (valueMap.containsKey(value)) {
                        throw new IllegalArgumentException("Duplicate value: " + value + ", nodes in the partial order must be unique");
                    }
                    valueMap.put(value, nodeMap.get(n));
                }
            }

            return new GraphBasedPreference<T>(valueMap, closure);
        }

        private static class GraphBasedPreference<T> extends Preference<T> {
            private final Map<T, gr.forth.ics.graph.Node> valueMap;
            private final PathFinder pathFinder;

            GraphBasedPreference(Map<T, gr.forth.ics.graph.Node> valueMap, PathFinder pathFinder) {
                this.valueMap = valueMap;
                this.pathFinder = pathFinder;
            }

            public boolean equalOrBetter(T o1, T o2) {
                //o2 is worse than o1 only when there is a path from o1 to o2
                gr.forth.ics.graph.Node n1 = valueMap.get(o1);
                gr.forth.ics.graph.Node n2 = valueMap.get(o2);

                //values that were not mapped to a node (were not mentioned at all) are
                //worse than every mapped one, and equal among them
                if (n1 == null) {
                    return n2 == null;
                } else if (n2 == null) {
                    return true;
                } else {
                    return n1 == n2 || pathFinder.pathExists(n1, n2);
                }
            }

            @Override
            public String toString() {
                return GraphBasedPreference.class.getSimpleName() + "@" + Integer.toHexString(hashCode());
            }
        }

        private Set<ValueWithPreferences<T>> collectNodes() {
            Set<ValueWithPreferences<T>> allNodes = Sets.newHashSet();
            LinkedList<ValueWithPreferences<T>> toVisit = Lists.newLinkedList();
            toVisit.add(this);

            while (!toVisit.isEmpty()) {
                ValueWithPreferences<T> next = toVisit.pop();
                if (allNodes.contains(next)) continue;
                allNodes.add(next);
                toVisit.addAll(next.worseNodes);
            }
            return allNodes;
        }

        /**
         * Creates a valueless, dummy node which joins this node with another one. This node
         * and the specified one are considered incomparable between them, and less preferred
         * than the created dummy node. This is useful since a preference must be created through
         * the node that represent the "best" value of the preference domain, and there might
         * not be a <em>single</em> best node. In those cases, this method can be used
         * to create an artificial "best" (root) node from which to create the final preference.
         *
         * @param that the node that is as important as this one
         * @return a valueless node that represents that this node and the specified one are incomparable
         */
        @SuppressWarnings("unchecked") //we cheat. But we never treat NO_VALUE as a V.
        //This is so that null is a legal value (otherwise we could treat that as denoting that there is no value).
        public ValueWithPreferences<T> asImportantAs(ValueWithPreferences<T> that) {
            return Preference.<T>value((T)new Artificial()).preferredTo(this, that);
        }

        @Override public String toString() {
            return "Node(" + (String.valueOf(values)) + ") better than " + worseNodes;
        }

        /**
         * A value (or a set of more equivalent values), which can be declared as
         * {@link #preferredTo(Iterable) more preferable to} other values.
         *
         * @param <T> the type of the value(s) that this object represents
         */
        public static class Value<T> {
            private final ImmutableCollection<T> values;

            private Value(ImmutableCollection<T> values) {
                this.values = values;
            }

            /**
             * Creates a node that is preferred to <em>no</em> value.
             *
             * @return a node that is preferred to <em>no</em> value
             */
            public ValueWithPreferences<T> preferredTo() {
                return new ValueWithPreferences<T>(values, ImmutableList.<ValueWithPreferences<T>>of());
            }

            /**
             * Creates a node that is preferred to the specified one.
             *
             * @param n1 a node representing a worse value
             * @return a node that is preferred to the specified one
             */
            public ValueWithPreferences<T> preferredTo(ValueWithPreferences<T> n1) {
                return new ValueWithPreferences<T>(values, ImmutableList.of(n1));
            }

            /**
             * Creates a node that is preferred to the specified ones.
             *
             * @param n1 a node representing a worse value
             * @param n2 a node representing a worse value
             * @return a node that is preferred to the specified ones
             */
            public ValueWithPreferences<T> preferredTo(ValueWithPreferences<T> n1, ValueWithPreferences<T> n2) {
                return new ValueWithPreferences<T>(values, ImmutableList.of(n1, n2));
            }

            /**
             * Creates a node that is preferred to the specified ones.
             *
             * @param n1 a node representing a worse value
             * @param n2 a node representing a worse value
             * @param n3 a node representing a worse value
             * @return a node that is preferred to the specified ones
             */
            public ValueWithPreferences<T> preferredTo(ValueWithPreferences<T> n1, ValueWithPreferences<T> n2, ValueWithPreferences<T> n3) {
                return new ValueWithPreferences<T>(values, ImmutableList.of(n1, n2, n3));
            }

            /**
             * Creates a node that is preferred to the specified ones.
             *
             * @param nodes nodes representing worse values
             * @return a node that is preferred to the specified ones
             */
            public ValueWithPreferences<T> preferredTo(Iterable<ValueWithPreferences<T>> nodes) {
                return new ValueWithPreferences<T>(values, ImmutableList.copyOf(nodes));
            }

            @Override public String toString() {
                return "ValueBuilder(" + values + ")";
            }
        }
    }

    /**
     * Creates a preference by prioritising this preference over the specified one.
     * Comparing two elements with the resulting preference can have the following results:
     * <ul>
     * <li>The result of comparing the elements via the this preference, if the elements are not
     * deemed equivalent by it, or
     * <li>the result of the comparison via the second preference, otherwise.
     * </ul>
     *
     * @param pref the other (less important than this one) preference
     * @return a composite preference that prioritises this preference over the specified one
     */
    public Preference<E> preferredTo(Preference<E> pref) {
        return new Priority<E>(this, Preconditions.checkNotNull(pref));
    }

    private static class Priority<T> extends Preference<T> {
        private final Preference<T> first;
        private final Preference<T> second;

        Priority(Preference<T> first, Preference<T> second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equalOrBetter(T o1, T o2) {
            return equalOrBetterThroughComparison(o1, o2);
        }

        @Override
        public Comparison compare(T o1, T o2) {
            Comparison c1 = first.compare(o1, o2);
            if (c1 != Comparison.EQUAL) return c1;
            return second.compare(o1, o2);
        }

        @Override
        public String toString() {
            return first + " preferred to " + second;
        }
    }

    /**
     * Creates a preference that represents the <em>consensus</em> of the specified preferences.
     * The resulting preference states that, for elements {@code A, B} that {@code A > B} if
     * there is at least one preference that supports this statement, and no preference disagrees
     * (if a preference treats {@code A} and {@code B} as incomparable, that is also regarded
     * as a disagreement).
     *
     * @param <T> the domain type of the preference
     * @param prefs the preferences, of which the consensus preference is returned
     * @return the consensus preference of the specified preferences
     */
    public static <T> Preference<T> concensus(Iterable<? extends Preference<? super T>> prefs) {
        return new Concensus<T>(ImmutableList.copyOf(prefs));
    }

    /**
     * Creates a preference that represents the <em>consensus</em> of the specified preferences.
     * The resulting preference states that, for elements {@code A, B} that {@code A > B} if
     * there is at least one preference that supports this statement, and no preference disagrees
     * (if a preference treats {@code A} and {@code B} as incomparable, that is also regarded
     * as a disagreement).
     *
     * @param <T> the domain type of the preference
     * @param pref1 a preference
     * @param pref2 a preference
     * @return the consensus preference of the specified preferences
     */
    public static <T> Preference<T> consensus(Preference<? super T> pref1, Preference<? super T> pref2) {
        return new Concensus<T>(ImmutableList.<Preference<? super T>>of(pref1, pref2));
    }

    private static class Concensus<T> extends Preference<T> {
        private final ImmutableList<? extends Preference<? super T>> prefs;

        Concensus(ImmutableList<? extends Preference<? super T>> prefs) {
            Preconditions.checkArgument(prefs.size() > 0, "No preferences specified");
            this.prefs = prefs;
        }
        
        @Override
        public boolean equalOrBetter(T o1, T o2) {
            for (Preference<? super T> pref : prefs) {
                if (!pref.equalOrBetter(o1, o2)) {
                    return false;
                }
            }
            return false;
        }

        @Override
        public Comparison compare(T o1, T o2) {
            Comparison overall = Comparison.EQUAL;
            for (Preference<? super T> pref : prefs) {
                Comparison c = pref.compare(o1, o2);
                switch (c) {
                    case EQUAL: continue;
                    case INCOMPARABLE: return Comparison.INCOMPARABLE;
                    default: if (overall == Comparison.EQUAL) {
                        overall = c;
                    } else if (overall != c) {
                        return Comparison.INCOMPARABLE;
                    }
                }
            }
            return overall;
        }
    }

    /**
     * Creates a preference that represents the <em>majority vote</em> of the specified preferences.
     * The resulting preference states that, for elements {@code A, B} that {@code A > B} if
     * the preferences concurring with this outnumber the preferences stating the opposite,
     * i.e., {@code A < B}. If any preference treats {@code A} and {@code B}
     * incomparable, then the majority treats them incomparable too.
     *
     * @param <T> the domain type of the preference
     * @param prefs the preferences, of which the <em>majority vote</em> preference is returned
     * @return the majority vote preference of the specified preferences
     */
    public static <T> Preference<T> majority(Iterable<Preference<T>> prefs) {
        return new Majority<T>(ImmutableList.copyOf(prefs));
    }

    /**
     * Creates a preference that represents the <em>majority vote</em> of the specified preferences.
     * The resulting preference states that, for elements {@code A, B} that {@code A > B} if
     * the preferences concurring with this outnumber the preferences stating the opposite,
     * i.e., {@code A < B}. If any preference treats {@code A} and {@code B}
     * incomparable, then the majority treats them incomparable too.
     *
     * @param <T> the domain type of the preference
     * @param pref1 a preference
     * @param pref2 a preference
     * @return the majority vote preference of the specified preferences
     */
    public static <T> Preference<T> majority(Preference<T> pref1, Preference<T> pref2) {
        return new Majority<T>(ImmutableList.of(pref1, pref2));
    }

    /**
     * Creates a preference that represents the (weighted) <em>majority vote</em> of the specified preferences.
     * The resulting preference states that, for elements {@code A, B} that {@code A > B} if
     * the preferences' votes concurring with this outnumber the preferences' votes stating the opposite,
     * i.e., {@code A < B}. If any preference treats {@code A} and {@code B}
     * incomparable, then the majority treats them incomparable too. The specified {@code Map}
     * instance (which is copied internally) supplies the preferences along with the number of votes
     * of each.
     *
     * @param <T> the domain type of the preference
     * @param weightedPreferences a {@code Map} with the voting preferences as keys, and values
     * the number of votes of each preference
     * @return the (weighted) majority vote preference of the specified preferences
     */
    public static <T> Preference<T> weightedMajority(Map<Preference<T>, Integer> weightedPreferences) {
        ImmutableMap<Preference<T>, Integer> mapCopy = ImmutableMap.copyOf(weightedPreferences);
        return new Majority<T>(mapCopy.keySet(), Functions.forMap(mapCopy));
    }

    private static class Majority<T> extends Preference<T> {
        private final ImmutableCollection<Preference<T>> prefs;
        private final Function<? super Preference<T>, Integer> weight;

        Majority(ImmutableCollection<Preference<T>> prefs) {
            this(prefs, Functions.constant(1));
        }

        Majority(ImmutableCollection<Preference<T>> prefs,
                Function<? super Preference<T>, Integer> weight) {
            Preconditions.checkArgument(prefs.size() > 0, "No preferences specified");
            this.prefs = prefs;
            this.weight = weight;
        }

        @Override
        public boolean equalOrBetter(T o1, T o2) {
            return equalOrBetterThroughComparison(o1, o2);
        }

        @Override
        public Comparison compare(T o1, T o2) {
            int votes = 0;
            boolean canBeEqual = true;
            for (Preference<T> pref : prefs) {
                switch (pref.compare(o1, o2)) {
                    case EQUAL: continue;
                    case INCOMPARABLE: return Comparison.INCOMPARABLE;
                    case BETTER: votes += weight.apply(pref); canBeEqual = false; break;
                    case WORSE: votes -= weight.apply(pref); canBeEqual = false; break;
                    default: throw new AssertionError();
                }
            }
            if (votes > 0) return Comparison.BETTER;
            else if (votes < 0) return Comparison.WORSE;
            else if (canBeEqual) return Comparison.EQUAL;
            else return Comparison.INCOMPARABLE;
        }
    }

    /**
     * Creates a preference for <em>sets</em> of elements.
     *
     * <p>A set {@code A} is considered (by the returned preference) at least as preferable to a set {@code B} (i.e.,
     * {@linkplain #equalOrBetter(Object, Object) equalOrBetter(A, B)} returns {@code true}) if and only if:
     * <ul>
     * <li>For each element {@code a} of {@code A} there exists an element {@code b} of {@code B}
     * such that {@code this.equalOrBetter(a, b) == true}, and,
     * <li>for each element {@code b} of {@code B} there exists an element {@code a} of {@code A}
     * such that {@code this.equalOrBetter(a, b) == true}
     * </ul>
     *
     * @param <T> the type of elements of sets to be compared with the created preference; 
     * could be the same as E or a subtype
     * @return a preference for sets of elements
     */
    public <T extends E> Preference<Set<T>> lift() {
        return new SetPreference<T>(this);
    }

    private static class SetPreference<E> extends Preference<Set<E>> {
        private final Preference<? super E> pref;

        SetPreference(Preference<? super E> pref) {
            this.pref = pref;
        }

        @Override
        public boolean equalOrBetter(Set<E> set1, Set<E> set2) {
            for (E x: set1) {
                boolean foundY = false;
                for (E y : set2) {
                    if (pref.equalOrBetter(x, y)) {
                        foundY = true;
                        break;
                    }
                }
                if (!foundY) return false; //there is an element in set1 that is not equal or better to at least one element of set2.
            }

            for (E y: set2) {
                boolean foundX = false;
                for (E x : set1) {
                    if (pref.equalOrBetter(x, y)) {
                        foundX = true;
                        break;
                    }
                }
                if (!foundX) return false; //there is an element in set2 for which there no element in set1 was equal to or better.
            }
    
            return true;
        }

        @Override
        public String toString() {
            return "Lift(" + pref + ")";
        }
    }
}
