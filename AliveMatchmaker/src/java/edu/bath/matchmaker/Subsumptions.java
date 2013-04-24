package edu.bath.matchmaker;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import java.io.Serializable;
import java.net.URI;
import java.util.Collections;
import java.util.Set;
import org.mindswap.owl.OWLClass;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owl.OWLProperty;
import org.mindswap.owl.vocabulary.OWL;
import org.mindswap.owl.vocabulary.RDFS;

/**
 * {@link Subsumption} implementations.
 * 
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class Subsumptions {
    private Subsumptions() { }

    /**
     * Creates a mutable subsumption based on hash tables.
     *
     * @param <E> the type of the relation elements
     * @return a new mutable subsumption
     */
    public static <E> MutableSubsumption<E> createHashBased() {
        return new SimpleSubsumption<E>();
    }

    /**
     * Writes all relationships of the specified subsumption to an {@link OWLOntology}.
     *
     * @param subsumption a subsumption relation on URIs
     * @param ontology the ontology in which the subsumption relationships are to be written
     */
    public static void toOwl(Subsumption<URI> subsumption, OWLOntology ontology) {
        Relation<URI> subsumes = subsumption.subsumes();
        OWLProperty subClassOf = ontology.createObjectProperty(RDFS.subClassOf);
        for (URI subject : subsumes.subjects()) {
            Set<URI> subclasses = subsumes.related(subject);
            OWLIndividual clazz = ontology.createClass(subject).castTo(OWLIndividual.class);

            for (URI subclass : subclasses) {
                ontology.addProperty(ontology.createIndividual(subclass), subClassOf, clazz);
            }
        }
        
    }

    private static class SimpleSubsumption<E> extends MutableSubsumption<E> implements Serializable {
        private final MutableRelation<E> subsumes = Relations.createHashBased();
        private final MutableRelation<E> subsumedBy = Relations.createHashBased();

        private static final long serialVersionUID = 0L;

        @Override
        public MutableRelation<E> subsumes() {
            return subsumes;
        }

        @Override
        public MutableRelation<E> subsumedBy() {
            return subsumedBy;
        }

        @Override
        public void addSubsumes(E e1, E e2) {
            subsumes.add(e1, e2);
            subsumedBy.add(e2, e1);
        }

        @Override
        public String toString() {
            return subsumes().toString();
        }
    }

    public static Subsumption<URI> fromOwl(OWLKnowledgeBase kb) {
        if (kb.getReasoner() == null) {
            throw new IllegalArgumentException("Creating a subsumption from a knowledge base with no attached reasoner " +
                    "is not allowed (kb.getReasoner() is null)");
        }
        return new KnowledgeBaseSubsumption(kb);
    }

    private static class KnowledgeBaseSubsumption extends Subsumption<URI> {
        private final OWLKnowledgeBase kb;

        KnowledgeBaseSubsumption(OWLKnowledgeBase kb) {
            this.kb = kb;
        }

        private abstract class AbstractRelation extends Relation<URI> {
            @Override
            public Iterable<URI> subjects() {
                return Iterables.filter(Iterables.transform(kb.getClasses(), OwlsFunctions.uriExtractor()), Predicates.notNull());
            }
        }

        final Relation<URI> subsumes = new AbstractRelation() {
            @Override
            public Set<URI> related(URI e) {
                return getRelated(kb.getClass(e), false);
            }

            //just to make sure owl:Nothing is included
            @Override
            public Set<URI> closureOfMany(Iterable<URI> elements) {
                return Sets.union(Collections.singleton(OWL.Nothing.getURI()), super.closureOfMany(elements));
            }
        };

        final Relation<URI> subsumedBy = new AbstractRelation() {
            @Override
            public Set<URI> related(URI e) {
                return getRelated(kb.getClass(e), true);
            }

            //just to make sure owl:Thing is included
            @Override
            public Set<URI> closureOfMany(Iterable<URI> elements) {
                return Sets.union(Collections.singleton(OWL.Thing.getURI()), super.closureOfMany(elements));
            }
        };

        private Set<URI> getRelated(OWLClass clazz, boolean upward) {
            if (clazz == null) return Collections.emptySet();
            return Sets.newHashSet(Iterables.transform(getRelatedClasses(clazz, upward), OwlsFunctions.uriExtractor()));
        }

        private Set<OWLClass> getRelatedClasses(OWLClass clazz, boolean upward) {
            return upward ? kb.getSuperClasses(clazz, true) : kb.getSubClasses(clazz, true);
        }

        @Override
        public Relation<URI> subsumes() {
            return subsumes;
        }

        @Override
        public Relation<URI> subsumedBy() {
            return subsumedBy;
        }

        @Override
        public String toString() {
            return "[" + getClass().getSimpleName() + " on " + kb + "]";
        }
    }
}
