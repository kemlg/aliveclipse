/*
 * TEMPORARY CLASS.
 * Hides the "real" impl.OWLKnowledgeBaseImpl. It's virtually the same, except for the
 * implementation of getClasses(), of which this version fixes a minor bug.
 *
 */

package impl.jena;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.mindswap.owl.OWLClass;
import org.mindswap.owl.OWLDataProperty;
import org.mindswap.owl.OWLDataType;
import org.mindswap.owl.OWLDataValue;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLIndividualList;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLObjectProperty;
import org.mindswap.owl.OWLOntology;
import org.mindswap.owl.OWLProperty;
import org.mindswap.owl.OWLReader;
import org.mindswap.owl.OWLValue;
import org.mindswap.owls.OWLSFactory;
import org.mindswap.owls.OWLSVersionTranslator;
import org.mindswap.owls.service.Service;
import org.mindswap.owls.vocabulary.OWLS;
import org.mindswap.utils.QNameProvider;
import org.mindswap.utils.URIUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;

/**
 *
 * @author unascribed
 * @version $Rev: 2135 $; $Author: thorsten $; $Date: 2009-01-13 17:39:26 +0100 (Di, 13 Jan 2009) $
 */
public class OWLKnowledgeBaseImpl extends OWLModelImpl implements OWLKnowledgeBase
{
	private static final Logger logger = LoggerFactory.getLogger(OWLKnowledgeBaseImpl.class);
	private static final URI URN_DUMMY_ONTOLOGY = URI.create("urn:owl-s-api:baseOntology");

	protected Set<OWLOntology> ontologies;
	protected Set<OWLOntology> notImported;
	private final Map<URI,OWLOntology> uriMap;
	private final Map<OWLOntology, Set<OWLOntology>> importDependencies;
	private final QNameProvider qnames;
	private OWLReader reader;
	private boolean autoConsistency;
	private OWLSVersionTranslator translator;
	private OWLKnowledgeBase translationSource;

	public OWLKnowledgeBaseImpl() {
		super(ModelFactory.createDefaultModel());

		setAutoTranslate(false);
		setAutoConsistency(false);

		translationSource = this;
		ontologies = new HashSet<OWLOntology>();
		uriMap = new HashMap<URI,OWLOntology>();
		importDependencies = new HashMap<OWLOntology, Set<OWLOntology>>();
		notImported = new HashSet<OWLOntology>();
		reader = OWLFactory.createReader();
		qnames = new QNameProvider();

		// initialize and set an empty dummy base ontology
		final Model model = getImplementation().getBaseModel();
		final OWLOntology ontology = new OWLOntologyImpl(this, URN_DUMMY_ONTOLOGY, null, model);
		ontologies.add(ontology);
		setBaseOntology(ontology);
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#getOntologies(boolean) */
	public Set<OWLOntology> getOntologies(final boolean all) {
		if (all) return new HashSet<OWLOntology>(ontologies);
		return new HashSet<OWLOntology>(notImported);
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#getOntology(java.net.URI) */
	public OWLOntology getOntology(final URI uri) {
		return uriMap.get(uri);
	}

	public OWLOntology createOntology(final URI uri, final URI fileURI, final boolean load) {
		return createOntology(uri, fileURI, load, ModelFactory.createDefaultModel());
	}

	public OWLOntology createOntology(final URI uri, final URI fileURI, final boolean load, final Object implementation) {
		final OWLOntology ont = new OWLOntologyImpl(this, uri, fileURI, (Model) implementation);
		if (load) return load(ont, true);
		return ont;
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#load(org.mindswap.owl.OWLOntology, boolean) */
	public OWLOntology load(final OWLOntology ont, final boolean withImports) {
		OWLOntology loadedOnt = internalLoad(ont, withImports);
		notImported.add(loadedOnt);
		if (getAutoConsistency() && !isConsistent())
		{
			logger.warn("Rejecting to load {} because it causes the KB to be inconsistent!", ont);
			unload(loadedOnt);
			loadedOnt = null;
		}

		return loadedOnt;
	}

	protected OWLOntology internalLoad(final OWLOntology ont, final boolean withImports) {
		OWLOntology loadedOnt = ont;

		// check if there is an ontology of that URI that is already part of this KB --> if so, return it
		final URI uri = loadedOnt.getURI();
		if(uri != null && uriMap.containsKey(uri)) return uriMap.get(uri);

		// translate the ontology if desired
		if(getAutoTranslate()) {
			loadedOnt = translator.translate(ont);

			if(translationSource == this) {
				translationSource = OWLFactory.createKB();
				translationSource.setAutoTranslate(false);
			}
			translationSource.load(loadedOnt.getTranslationSource(), true);
		}

		final Model model = ((OntModel) loadedOnt.getImplementation()).getBaseModel();

		loadedOnt = new OWLOntologyImpl(this, uri, loadedOnt.getFileURI(), model);

//		// if this KB is empty, the first ontology loaded will become the base ontology, automatically
//		if (ontModel.size() == 0 && ontologies.size() == 1 && URN_DUMMY_ONTOLOGY.equals(getBaseOntology().getURI()))
//		{
//			ontologies.remove(getBaseOntology());
//			setBaseOntology(loadedOnt);
//			ontModel.add(model);
//		}
//		else
		ontModel.addSubModel(model);

		if(uri != null) uriMap.put(uri, loadedOnt);
		ontologies.add(loadedOnt);

		if(withImports) {
			for (final OWLOntology imported : ont.getImports(true))
			{
				final OWLOntology loadedImport = internalLoad(imported, withImports);
				loadedOnt.addImport(loadedImport);

				if(!notImported.contains(loadedImport)) {
					Set<OWLOntology> importees = importDependencies.get(loadedImport);
					if(importees == null) {
						importees = new HashSet<OWLOntology>();
						importDependencies.put(loadedImport, importees);
					}
					importees.add(loadedOnt);
				}
			}
		}

		return loadedOnt;
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#unload(java.net.URI) */
	public void unload(URI uri)
	{
		uri = URIUtils.standardURI(uri);
		final OWLOntology ont = getOntology(uri);
		if (ont != null) unload(ont);
		else logger.debug("Could not unlog ontology {} because it was not found in KB.", uri);
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#unload(org.mindswap.owl.OWLOntology) */
	public void unload( final OWLOntology ontology ) {
		final URI uri = ontology.getURI();
		final boolean removed = ontologies.remove(ontology);

		if (!removed) {
			String msg =  ontology + " is not in the KB";
			if(uri != null && uriMap.containsKey(uri))
				msg += " but there is another ontology with the same URI in the KB";
			msg += "!";
			throw new IllegalArgumentException(msg);
		}

		if (uri != null) uriMap.remove(uri);

		notImported.remove(ontology);

		final Model m = ((OntModel) ontology.getImplementation()).getBaseModel();
		ontModel.removeSubModel(m);

		for (final OWLOntology importOnt : ontology.getImports(true))
		{
			final Set<OWLOntology> importees = importDependencies.get(importOnt);
			if (importees != null) {
				importees.remove(ontology);
				if (importees.isEmpty()) {
					importDependencies.remove(importOnt);
					unload(importOnt);
				}
			}
		}
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#read(java.lang.String) */
	public OWLOntology read(final String uri) throws IOException, URISyntaxException {
		return reader.read(this, new URI(uri));
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#read(java.net.URI) */
	public OWLOntology read(final URI uri) throws IOException {
		return reader.read(this, uri);
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#read(java.io.Reader, java.net.URI) */
	public OWLOntology read(final Reader in, final URI baseURI) throws IOException {
		return reader.read(this, in, baseURI);
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#read(java.io.InputStream, java.net.URI) */
	public OWLOntology read(final InputStream in, final URI baseURI) throws IOException {
		return reader.read(this, in, baseURI);
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#getReader() */
	public OWLReader getReader() {
		return reader;
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#getQNames() */
	public QNameProvider getQNames() {
		return qnames;
	}

	/* @see impl.jena.OWLModelImpl#wrapDataValue(com.hp.hpl.jena.rdf.model.Literal, org.mindswap.owl.OWLOntology) */
	@Override
	protected OWLDataValue wrapDataValue(final Literal l, final OWLOntology ont) {
		return new OWLDataValueImpl(l);
	}

	/* @see impl.jena.OWLModelImpl#wrapIndividual(com.hp.hpl.jena.rdf.model.Resource, org.mindswap.owl.OWLOntology) */
	@Override
	protected OWLIndividual wrapIndividual(final Resource r, OWLOntology ont) {
		if( ont != null && ((OntModel) ont.getImplementation()).containsResource(r))
			return new OWLIndividualImpl(ont, r);

		for (final Object element : ontologies)
		{
			ont = (OWLOntology) element;
			if(((OntModel) ont.getImplementation()).containsResource(r))
				return new OWLIndividualImpl(ont, r);
		}

		return new OWLIndividualImpl(baseOntology, r);
	}

	/* @see impl.jena.OWLModelImpl#wrapClass(com.hp.hpl.jena.rdf.model.Resource, org.mindswap.owl.OWLOntology) */
	@Override
	protected OWLClass wrapClass(final Resource r, OWLOntology ont) {
		if(ont == null) ont = baseOntology;
		return new OWLClassImpl(ont, r);
	}

	/* @see impl.jena.OWLModelImpl#wrapObjectProperty(com.hp.hpl.jena.rdf.model.Property, org.mindswap.owl.OWLOntology) */
	@Override
	protected OWLObjectProperty wrapObjectProperty(final Property p, OWLOntology ont) {
		if(ont == null) ont = baseOntology;
		return new OWLObjectPropertyImpl(ont, p);
	}

	/* @see impl.jena.OWLModelImpl#wrapDataProperty(com.hp.hpl.jena.rdf.model.Property, org.mindswap.owl.OWLOntology) */
	@Override
	protected OWLDataProperty wrapDataProperty(final Property p, OWLOntology ont) {
		if(ont == null) ont = baseOntology;
		return new OWLDataPropertyImpl(ont, p);
	}

	/* @see org.mindswap.owl.OWLModel#createClass(java.net.URI) */
	public OWLClass createClass(final URI uri) {
		return baseOntology.createClass(uri);
	}

	/* @see org.mindswap.owl.OWLModel#createDataType(java.net.URI) */
	public OWLDataType createDataType(final URI dataTypeURI) {
		return baseOntology.createDataType(dataTypeURI);
	}

	/* @see org.mindswap.owl.OWLModel#createObjectProperty(java.net.URI) */
	public OWLObjectProperty createObjectProperty(final URI uri) {
		return baseOntology.createObjectProperty(uri);
	}

	/* @see org.mindswap.owl.OWLModel#createDataProperty(java.net.URI) */
	public OWLDataProperty createDataProperty(final URI uri) {
		return baseOntology.createDataProperty(uri);
	}

	/* @see org.mindswap.owl.OWLModel#createIndividual(java.net.URI) */
	public OWLIndividual createIndividual(final URI uri) {
		return baseOntology.createIndividual(uri);
	}

	/* @see org.mindswap.owl.OWLModel#createInstance(org.mindswap.owl.OWLClass) */
	public OWLIndividual createInstance(final OWLClass c) {
		return baseOntology.createInstance(c);
	}

	/* @see org.mindswap.owl.OWLModel#createInstance(org.mindswap.owl.OWLClass, java.net.URI) */
	public OWLIndividual createInstance(final OWLClass c, final URI uri) {
		return baseOntology.createInstance(c, uri);
	}

	/* @see org.mindswap.owl.OWLModel#createDataValue(java.lang.String) */
	public OWLDataValue createDataValue(final String value) {
		return baseOntology.createDataValue(value);
	}

	/* @see org.mindswap.owl.OWLModel#createDataValue(java.lang.String, java.lang.String) */
	public OWLDataValue createDataValue(final String value, final String language) {
		return baseOntology.createDataValue(value, language);
	}

	/* @see org.mindswap.owl.OWLModel#createDataValue(java.lang.Object, java.net.URI) */
	public OWLDataValue createDataValue(final Object value, final URI datatypeURI) {
		return baseOntology.createDataValue(value, datatypeURI);
	}

	/* @see org.mindswap.owl.OWLModel#createDataValue(java.lang.Object) */
	public OWLDataValue createDataValue(final Object value) {
		return baseOntology.createDataValue(value);
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#setReader(org.mindswap.owl.OWLReader) */
	public OWLReader setReader(final OWLReader newReader) {
		OWLReader old = this.reader;
		this.reader = newReader;
		return old;
	}

	/* @see org.mindswap.owl.OWLModel#refresh() */
	public void refresh() {
		ontModel.rebind();
	}

	/* @see org.mindswap.owl.OWLModel#setProperty(org.mindswap.owl.OWLIndividual, org.mindswap.owl.OWLDataProperty, java.lang.String) */
	public void setProperty(final OWLIndividual ind, final OWLDataProperty prop, final String value) {
		baseOntology.setProperty(ind, prop, value);
	}

	/* @see org.mindswap.owl.OWLModel#setProperty(org.mindswap.owl.OWLIndividual, org.mindswap.owl.OWLDataProperty, java.lang.Object) */
	public void setProperty(final OWLIndividual ind, final OWLDataProperty prop, final Object value) {
		baseOntology.setProperty(ind, prop, value);
	}

	/* @see org.mindswap.owl.OWLModel#setProperty(org.mindswap.owl.OWLIndividual, org.mindswap.owl.OWLDataProperty, org.mindswap.owl.OWLDataValue) */
	public void setProperty(final OWLIndividual ind, final OWLDataProperty prop, final OWLDataValue value) {
		baseOntology.setProperty(ind, prop, value);
	}

	/* @see org.mindswap.owl.OWLModel#addProperty(org.mindswap.owl.OWLIndividual, org.mindswap.owl.OWLProperty, org.mindswap.owl.OWLValue) */
	public void addProperty(final OWLIndividual ind, final OWLProperty prop, final OWLValue value) {
		baseOntology.addProperty(ind, prop, value);
	}

	/* @see org.mindswap.owl.OWLModel#addProperty(org.mindswap.owl.OWLIndividual, org.mindswap.owl.OWLDataProperty, org.mindswap.owl.OWLDataValue) */
	public void addProperty(final OWLIndividual ind, final OWLDataProperty prop, final OWLDataValue value) {
		baseOntology.addProperty(ind, prop, value);
	}

	/* @see org.mindswap.owl.OWLModel#addProperty(org.mindswap.owl.OWLIndividual, org.mindswap.owl.OWLDataProperty, java.lang.String) */
	public void addProperty(final OWLIndividual ind, final OWLDataProperty prop, final String value) {
		baseOntology.addProperty(ind, prop, value);
	}

	/* @see org.mindswap.owl.OWLModel#addProperty(org.mindswap.owl.OWLIndividual, org.mindswap.owl.OWLDataProperty, java.lang.Object) */
	public void addProperty(final OWLIndividual ind, final OWLDataProperty prop, final Object value) {
		baseOntology.addProperty(ind, prop, value);
	}

	/* @see org.mindswap.owl.OWLModel#removeProperties(org.mindswap.owl.OWLIndividual, org.mindswap.owl.OWLProperty) */
	public void removeProperties(final OWLIndividual ind, final OWLProperty prop) {
		baseOntology.removeProperties(ind, prop);
	}

	/* @see org.mindswap.owl.OWLModel#removeProperty(org.mindswap.owl.OWLIndividual, org.mindswap.owl.OWLProperty, org.mindswap.owl.OWLValue) */
	public void removeProperty(final OWLIndividual theInd, final OWLProperty theProp, final OWLValue theValue) {
		baseOntology.removeProperty(theInd,theProp,theValue);
	}

	/* @see org.mindswap.owl.OWLModel#addProperty(org.mindswap.owl.OWLIndividual, org.mindswap.owl.OWLObjectProperty, org.mindswap.owl.OWLIndividual) */
	public void addProperty(final OWLIndividual ind, final OWLObjectProperty prop, final OWLIndividual value) {
		baseOntology.addProperty(ind, prop, value);
	}

	/* @see org.mindswap.owl.OWLModel#setProperty(org.mindswap.owl.OWLIndividual, org.mindswap.owl.OWLObjectProperty, org.mindswap.owl.OWLIndividual) */
	public void setProperty(final OWLIndividual ind, final OWLObjectProperty prop, final OWLIndividual value) {
		baseOntology.setProperty(ind, prop, value);
	}

	/* @see org.mindswap.owl.OWLModel#addType(org.mindswap.owl.OWLIndividual, org.mindswap.owl.OWLClass) */
	public void addType(final OWLIndividual ind, final OWLClass c) {
		baseOntology.addType(ind, c);
	}

	/* @see org.mindswap.owl.OWLModel#removeTypes(org.mindswap.owl.OWLIndividual) */
	public void removeTypes(final OWLIndividual ind) {
		baseOntology.removeTypes(ind);
	}

	/* @see org.mindswap.owl.OWLModel#removeIndividuals(org.mindswap.owl.OWLIndividual, boolean) */
	public void removeIndividuals(final OWLIndividual ind, final boolean recursive) {
		baseOntology.removeIndividuals(ind, recursive);
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#getAutoConsistency() */
	public boolean getAutoConsistency() {
		return autoConsistency;
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#setAutoConsistency(boolean) */
	public void setAutoConsistency(final boolean auto) {
		autoConsistency = auto;
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#getAutoTranslate() */
	public boolean getAutoTranslate() {
		return (translator != null);
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#setAutoTranslate(boolean) */
	public void setAutoTranslate(final boolean auto) {
		translator = auto? OWLSFactory.createVersionTranslator() : null;
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#getTranslationSource() */
	public OWLKnowledgeBase getTranslationSource() {
		return translationSource;
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#readService(java.lang.String) */
	public Service readService(final String uri) throws IOException, URISyntaxException {
		return readService(new URI(uri));
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#readService(java.net.URI) */
	public Service readService(final URI uri) throws IOException {
		final List<Service> list = readAllServices(uri);
		return getCorrectService(list, uri);
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#readService(java.io.Reader, java.net.URI) */
	public Service readService(final Reader in, final URI baseURI) throws IOException {
		final List<Service> list = readAllServices(in, baseURI);
		return getCorrectService(list, baseURI);
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#readService(java.io.InputStream, java.net.URI) */
	public Service readService(final InputStream in, final URI baseURI) throws IOException {
		final List<Service> list = readAllServices(in, baseURI);
		return getCorrectService(list, baseURI);
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#readAllServices(java.lang.String) */
	public List<Service> readAllServices(final String uri) throws IOException, URISyntaxException {
		return readAllServices(new URI(uri));
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#readAllServices(java.net.URI) */
	public List<Service> readAllServices(final URI uri) throws IOException {
		final OWLOntology ont = read(uri);
		return (ont == null) ? null : getServices();
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#readAllServices(java.io.Reader, java.net.URI) */
	public List<Service> readAllServices(final Reader in, final URI baseURI) throws IOException {
		final OWLOntology ont = read(in, baseURI);
		return (ont == null) ? null : getServices();
	}

	/* @see org.mindswap.owl.OWLKnowledgeBase#readAllServices(java.io.InputStream, java.net.URI) */
	public List<Service> readAllServices(final InputStream in, final URI baseURI) throws IOException {
		final OWLOntology ont = read(in, baseURI);
		return (ont == null) ? null : getServices();
	}

	/*
	 * Michael Daenzer, 03-24-2006
	 * pulled down from OWLModelImpl and added support for subclasses of Service:service
	 *
	 * @see impl.jena.OWLModelImpl#getServices()
    */
	@Override
	public List<Service> getServices()
	{
		final OWLIndividualList<OWLIndividual> inds = OWLFactory.createIndividualList();
		inds.addAll(getInstances(OWLS.Service.Service));
		for (final OWLClass serviceClass : getSubClasses(OWLS.Service.Service, false))
		{
			inds.addAll(getInstances(serviceClass));
		}
		return OWLFactory.wrapList(inds, Service.class);
	}

	/**
	 * Returns the service from the given List indicated by the given URI. If a concrete
	 * resource is referenced (i.e. a fragment is given), only this is returned. If no
	 * concrete resource is referenced by the given URI, the first service matching the
	 * given URI in its full URI is returned.
	 *
	 * @param list A list containing services.
	 * @param uri The URI of the service to return or <code>null</code> to refer to the first
	 * 	entry in the list.
	 * @return  The service from the given List indicated by the given URI or <code>null</code>
	 * 	if the list is <code>null</code> or empty.
	 */
	private Service getCorrectService(final List<Service> list, final URI uri) {
		if (list == null || list.isEmpty()) return null;
		boolean strictSearch = false;
		String patternUri = uri.toString();
		// search if fragment is available
		final int fragmentSignPos = uri.toString().lastIndexOf("#");
		if (fragmentSignPos > -1) {
			if (fragmentSignPos + 1 != patternUri.length())	strictSearch = true;
			patternUri = patternUri.substring(0, patternUri.length() - 1);
		}

		// search now the list
		for (final Service service : list)
		{
			if (strictSearch && service.getURI().equals(uri)) return service;
			if (!strictSearch && service.getURI().toString().indexOf(patternUri) != -1) return service;
		}

		return list.get(0);
	}

	/* @see org.mindswap.owl.OWLModel#parseLiteral(java.lang.String) */
	public OWLIndividual parseLiteral(final String literal) {
		return getBaseOntology().parseLiteral(literal);
	}

	/* @see org.mindswap.owl.OWLModel#getNonLanguageIndividuals() */
	public List<OWLIndividual> getNonLanguageIndividuals() {
		final List<OWLIndividual> list = new ArrayList<OWLIndividual>();
		for (final OWLOntology ont : ontologies)
		{
			list.addAll(ont.getNonLanguageIndividuals());
		}
		return list;
	}

	/* @see org.mindswap.owl.OWLModel#getNonLanguageClasses() */
	public List<OWLClass> getNonLanguageClasses() {
		final List<OWLClass> list = new ArrayList<OWLClass>();
		for (final OWLOntology ont : ontologies)
		{
			list.addAll(ont.getNonLanguageClasses());
		}
		return list;
	}

	/* @see org.mindswap.owl.OWLModel#getNonLanguageDataProperties() */
	public List<OWLDataProperty> getNonLanguageDataProperties() {
		final List<OWLDataProperty> list = new ArrayList<OWLDataProperty>();
		for (final OWLOntology ont : ontologies)
		{
			list.addAll(ont.getNonLanguageDataProperties());
		}
		return list;
	}

	/* @see org.mindswap.owl.OWLModel#getNonLanguageObjectProperties() */
	public List<OWLObjectProperty> getNonLanguageObjectProperties() {
		final List<OWLObjectProperty> list = new ArrayList<OWLObjectProperty>();
		for (final OWLOntology ont : ontologies)
		{
			list.addAll(ont.getNonLanguageObjectProperties());
		}
		return list;
	}

	/* @see org.mindswap.owl.OWLModel#getClasses() */
	public Set<OWLClass> getClasses() {
		final Set<OWLClass> set = new HashSet<OWLClass>();
		for (final OWLOntology ont : ontologies)
		{
			set.addAll(ont.getClasses());
		}
		return set;
	}
}
