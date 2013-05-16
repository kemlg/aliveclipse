package edu.bath.matchmaker.similarity;

import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.io.Serializable;
import java.net.URI;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/**
 * A main-memory indexer of documents.
 * A <em>document</em> in this context is a bag of simple terms (words).
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class DocumentManager implements Serializable {
    private final Map<URI, Multiset<String>> documentsToTerms = Maps.newHashMap();
    private final Map<String, Multiset<URI>> termsToDocuments = Maps.newHashMap();

    private static final long serialVersionUID = 0L;

    /**
     * Creates a DocumentManager.
     */
    public DocumentManager() { }

    /**
     * Adds a uniquely-named document to this DocumentManager.
     *
     * @param documentURI the unique name of the document to be added
     * @param terms the terms of the document
     * @throws IllegalStateException if a document with the same name has already been added to this DocumentManager
     */
    public void addDocument(URI documentURI, Iterable<String> terms) {
        Preconditions.checkState(!documentsToTerms.containsKey(documentURI), "Document: '" + documentURI + "' already added");
        documentsToTerms.put(documentURI, HashMultiset.create(terms));

        for (String term : terms) {
            Multiset<URI> docs = termsToDocuments.get(term);
            if (docs == null) {
                termsToDocuments.put(term, docs = HashMultiset.create());
            }
            docs.add(documentURI);
        }
    }

    /**
     * Removes the specified document, if it exists, from this document manager.
     *
     * @param documentURI the URI of the document
     * @return whether the document was removed
     */
    public boolean removeDocument(URI documentURI) {
        Multiset<String> terms = documentsToTerms.remove(documentURI);
        if (terms == null) return false;

        for (String term : terms.elementSet()) {
            Multiset<URI> docs = termsToDocuments.get(term);
            docs.remove(documentURI);
            if (docs.isEmpty()) {
                termsToDocuments.remove(term);
            }
        }
        return true;
    }

    /**
     * Returns the names of all documents added to this DocumentManager. The returned set is unmodifiable.
     *
     * @return the names of all documents added to this DocumentManager
     */
    public Set<URI> documents() {
        return Collections.unmodifiableSet(documentsToTerms.keySet());
    }

    /**
     * Returns the terms of a document of this DocumentManager.
     *
     * @param documentURI the name of the document
     * @return the terms of the document
     * @throws IllegalArgumentException if {@code !documents().contains(documentURI)}
     */
    public Multiset<String> documentTerms(URI documentURI) {
        Multiset<String> terms = documentsToTerms.get(documentURI);
        if (terms == null) {
            throw new IllegalArgumentException("Document: " + documentURI + " not contained in this " + DocumentManager.class.getSimpleName());
        }
        return Multisets.unmodifiableMultiset(terms);
    }

    private int documentCount() {
        return documentsToTerms.keySet().size();
    }

    private Set<URI> documentsWithTerm(String term) {
        return termsToDocuments.get(term).elementSet();
    }

    /**
     * Returns the inverse document frequency of a term. If the term does not appear anywhere, {@code 0.0} is returned,
     * which is also the value returned if a term appears in <em>every</em> document.
     * 
     * @return the inverse document frequency of a term
     * @see <a href="http://en.wikipedia.org/wiki/Tf–idf">Wikipedia on Inverse Document Frequency</a>
     */
    public double inverseDocumentFrequency(String term) {
        if (!termsToDocuments.containsKey(term)) {
            return 0.0;
        }
        return Math.log((double)documentCount() / (documentsWithTerm(term).size()));
    }

    private int instancesInDocument(String term, Multiset<String> document) {
        return document.count(term);
    }

    private double frequencyInDocument(String term, Multiset<String> document) {
        return (double)instancesInDocument(term, document) / document.size();
    }

    /**
     * Returns the weights of the terms.
     *
     * @param terms the terms of which to find the weights
     * @return a TermWeights, representing the "weight" of each term
     * @see <a href="http://en.wikipedia.org/wiki/Tf–idf">Wikipedia on Term Frequency–Inverse Document Frequency weight</a>
     */
    public TermWeights<String> weights(Multiset<String> terms) {
        ImmutableMap.Builder<String, Double> builder = new ImmutableMap.Builder<String, Double>();
        for (String term : terms.elementSet()) {
            builder.put(term, inverseDocumentFrequency(term) * frequencyInDocument(term, terms));
        }
        return TermWeights.forMap(builder.build());
    }
}
