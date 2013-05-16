package edu.bath.matchmaker.similarity;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Utilities for processing texts.
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class TextUtils {
    private TextUtils() { }

    private static final ImmutableSet<String> stopWords;

    static {
        try {
            InputStream in = TextUtils.class.getResourceAsStream("/" + TextUtils.class.getPackage().getName().replace(".", "/") + "/stopwords.txt");
            ImmutableSet.Builder<String> builder = new ImmutableSet.Builder<String>();
            Scanner sc = new Scanner(in);
            while (sc.hasNext()) {
                builder.add(sc.next());
            }
            stopWords = builder.build();
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns whether the given term is a stop-word (a common, not of particular interest term). Note that stop-words are defined in lowercase.
     *
     * @param term a term
     * @return whether the the term is a stop-word
     */
    public static boolean isStopword(String term) {
        return stopWords.contains(term);
    }

    public static Iterable<String> filterStopwords(Iterable<String> terms) {
        return Iterables.filter(terms, isNotStopword);
    }

    private static final Predicate<String> isNotStopword = new Predicate<String>() {
        public boolean apply(String term) {
            return !isStopword(term);
        }
    };

    /**
     * Returns the stem of a word, using Porter's algorithm.
     *
     * @param term a term
     * @return the stem of the term
     * @see <a href="http://tartarus.org/~martin/PorterStemmer/">Porter Stemmer algorithm website</a>
     */
    public static String stem(String term) {
        return new PorterStemmer().stem(term.toLowerCase());
    }

    /**
     * Returns a (lazy) iterable with the stem of each word in the input, using Porter's algorithm.
     *
     * @param terms an iterable of terms
     * @return an iterable of the stems of the terms
     * @see <a href="http://tartarus.org/~martin/PorterStemmer/">Porter Stemmer algorithm website</a>
     */
    public static Iterable<String> stem(Iterable<String> terms) {
        return Iterables.transform(terms, stemify);
    }

    private static final Function<String, String> stemify = new Function<String, String>() {
        public String apply(String term) {
            return stem(term);
        }
    };

    /**
     * Applies {@link String#toLowerCase()} to each term in the input.
     *
     * @param terms an iterable of stems
     * @return the terms in lowercase
     */
    public static Iterable<String> toLowerCase(Iterable<String> terms) {
        return Iterables.transform(terms, toLowercase);
    }

    private static final Function<String, String> toLowercase = new Function<String, String>() {
        public String apply(String term) {
            return term.toLowerCase();
        }
    };

    /**
     * Tokenizes a string by splitting tokens by non-alphanumeric characters (space, punctuation, etc).
     *
     * @param text a string to tokenize
     * @return tokens of the string
     */
    public static Iterable<String> tokenize(String text) {
        String[] splits = p.split(text);
        List<String> list = Arrays.<String>asList(splits);
        if (splits[0].equals("")) {
            list = list.subList(1, list.size());
        }
        return list;
    }
    
    private static final Pattern p = Pattern.compile("(?:\\s|[^\\w\\d])+");
}
