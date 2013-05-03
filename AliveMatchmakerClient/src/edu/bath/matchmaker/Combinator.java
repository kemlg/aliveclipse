package edu.bath.matchmaker;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/**
 * A combinator of {@code N} keys to {@code M} values, which yields an iterator that produces every association
 * {@code Map<N, M>} of all keys to some values (the same value can be assigned to multiple keys). The count
 * of all associations is {@code M ^ N}, since each key can be assigned with {@code |M|} independent ways.
 *
 * @see #create(List, List) 
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
final class Combinator<K, V> implements Iterable<Map<K, V>> {
    private final List<K> keys;
    private final List<V> values;

    private Combinator(List<K> keys, List<V> values) {
        this.keys = ImmutableList.copyOf(keys);
        this.values = ImmutableList.copyOf(values);
    }

    /**
     * Creates a Combinator of the specified keys and values. The combinator will produce every association
     * {@code Map<N, M>} of all keys to some values (the same value can be assigned to multiple keys).
     *
     * @param <K> the type of keys
     * @param <V> the type of values
     * @param keys the keys to associate with some value each
     * @param values the values that can be associated with keys
     * @return a {@code Combinator<K, N>}, which is an iterator of all {@code Map<N, M>} associations
     */
    public static <K, V> Combinator<K, V> create(List<K> keys, List<V> values) {
        if (values.isEmpty() && keys.size() > 0) {
            throw new IllegalArgumentException("Keys can't be assigned values, |keys|=" + keys.size() + ", |values|=0");
        }
        return new Combinator<K, V>(keys, values);
    }

    public Iterator<Map<K, V>> iterator() {
        return new AbstractIterator<Map<K, V>>() {
            final int[] valueCursorPerKey = new int[keys.size()];
            {
                if (!keys.isEmpty())
                    valueCursorPerKey[valueCursorPerKey.length - 1] = -1;
                //we add one to get the next combination
                //so if we don't do this, we would lose the first combination
            }
            
            @Override
            protected Map<K, V> computeNext() {
                int cursorToIncrement = -1;
                for (int i = valueCursorPerKey.length - 1; i >= 0; i--) {
                    valueCursorPerKey[i]++;
                    if (valueCursorPerKey[i] < values.size()) {
                        cursorToIncrement = i;
                        break;
                    }
                    valueCursorPerKey[i] = 0; //start over/zeroing this cursor, like ...999 + 1 = ...000
                }

                if (cursorToIncrement == -1) return endOfData();

                //found a new combination!
                Map<K, V> map = Maps.newHashMapWithExpectedSize(keys.size());
                int pos = 0;
                for (K key : keys) {
                    int valueCursor = valueCursorPerKey[pos++];

                    V current = values.get(valueCursor);
                    map.put(key, current);
                }
                return map;
            }
        };
    }


    public static void main(String[] args) {
        Combinator<String, Integer> c = Combinator.create(ImmutableList.of("a", "b", "c"), ImmutableList.of(1, 2, 3));
        int count = 0;
//        for (Map<String, Integer> m : c) {
//            System.out.println(m);
//            count++;
//        }
        System.out.println(com.google.common.collect.Iterables.size(c));
        System.out.println(count);
    }
}
