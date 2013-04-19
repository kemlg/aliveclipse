/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Event;

import net.sf.ictalive.coordination.agents.AgentsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.EventModel.Event.EventFactory
 * @model kind="package"
 * @generated
 */
public interface EventPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Event";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://alive/architecture/event";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "event";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EventPackage eINSTANCE = net.sf.ictalive.EventModel.Event.impl.EventPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Event.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Event.impl.EventImpl
	 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 0;

	/**
	 * The feature id for the '<em><b>Local Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__LOCAL_KEY = 0;

	/**
	 * The feature id for the '<em><b>Asserter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ASSERTER = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Point Of View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__POINT_OF_VIEW = 3;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__LANGUAGE = 4;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ENCODING = 5;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TIMESTAMP = 6;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Event.impl.KeyImpl <em>Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Event.impl.KeyImpl
	 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getKey()
	 * @generated
	 */
	int KEY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__ID = 0;

	/**
	 * The number of structural features of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Event.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Event.impl.LanguageImpl
	 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 2;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Event.impl.XMLSchemaImpl <em>XML Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Event.impl.XMLSchemaImpl
	 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getXMLSchema()
	 * @generated
	 */
	int XML_SCHEMA = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA__URL = LANGUAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XML Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_SCHEMA_FEATURE_COUNT = LANGUAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Event.impl.OntologyImpl <em>Ontology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Event.impl.OntologyImpl
	 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getOntology()
	 * @generated
	 */
	int ONTOLOGY = 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__URL = LANGUAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ontology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_FEATURE_COUNT = LANGUAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Event.impl.PointOfViewImpl <em>Point Of View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Event.impl.PointOfViewImpl
	 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getPointOfView()
	 * @generated
	 */
	int POINT_OF_VIEW = 5;

	/**
	 * The number of structural features of the '<em>Point Of View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_VIEW_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Event.impl.ActorViewImpl <em>Actor View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Event.impl.ActorViewImpl
	 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getActorView()
	 * @generated
	 */
	int ACTOR_VIEW = 6;

	/**
	 * The number of structural features of the '<em>Actor View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_VIEW_FEATURE_COUNT = POINT_OF_VIEW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Event.impl.ObserverViewImpl <em>Observer View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Event.impl.ObserverViewImpl
	 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getObserverView()
	 * @generated
	 */
	int OBSERVER_VIEW = 7;

	/**
	 * The number of structural features of the '<em>Observer View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_VIEW_FEATURE_COUNT = POINT_OF_VIEW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Event.impl.ProxyViewImpl <em>Proxy View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Event.impl.ProxyViewImpl
	 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getProxyView()
	 * @generated
	 */
	int PROXY_VIEW = 8;

	/**
	 * The feature id for the '<em><b>Transmitter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_VIEW__TRANSMITTER = POINT_OF_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Proxy View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_VIEW_FEATURE_COUNT = POINT_OF_VIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Event.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Event.impl.ActorImpl
	 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 9;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__AGENT = AgentsPackage.ACTOR__AGENT;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IMPLEMENTED_BY = AgentsPackage.ACTOR__IMPLEMENTED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = AgentsPackage.ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__URL = AgentsPackage.ACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Emit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__EMIT = AgentsPackage.ACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = AgentsPackage.ACTOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Event.EncodingStyle <em>Encoding Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Event.EncodingStyle
	 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getEncodingStyle()
	 * @generated
	 */
	int ENCODING_STYLE = 10;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Event.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see net.sf.ictalive.EventModel.Event.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.EventModel.Event.Event#getLocalKey <em>Local Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Key</em>'.
	 * @see net.sf.ictalive.EventModel.Event.Event#getLocalKey()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_LocalKey();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.EventModel.Event.Event#getAsserter <em>Asserter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asserter</em>'.
	 * @see net.sf.ictalive.EventModel.Event.Event#getAsserter()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Asserter();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.EventModel.Event.Event#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see net.sf.ictalive.EventModel.Event.Event#getContent()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Content();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.EventModel.Event.Event#getPointOfView <em>Point Of View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point Of View</em>'.
	 * @see net.sf.ictalive.EventModel.Event.Event#getPointOfView()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_PointOfView();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.EventModel.Event.Event#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language</em>'.
	 * @see net.sf.ictalive.EventModel.Event.Event#getLanguage()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Language();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.EventModel.Event.Event#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see net.sf.ictalive.EventModel.Event.Event#getEncoding()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.EventModel.Event.Event#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see net.sf.ictalive.EventModel.Event.Event#getTimestamp()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Timestamp();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Event.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key</em>'.
	 * @see net.sf.ictalive.EventModel.Event.Key
	 * @generated
	 */
	EClass getKey();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.EventModel.Event.Key#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.ictalive.EventModel.Event.Key#getId()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Id();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Event.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see net.sf.ictalive.EventModel.Event.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Event.XMLSchema <em>XML Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Schema</em>'.
	 * @see net.sf.ictalive.EventModel.Event.XMLSchema
	 * @generated
	 */
	EClass getXMLSchema();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.EventModel.Event.XMLSchema#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see net.sf.ictalive.EventModel.Event.XMLSchema#getUrl()
	 * @see #getXMLSchema()
	 * @generated
	 */
	EAttribute getXMLSchema_Url();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Event.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology</em>'.
	 * @see net.sf.ictalive.EventModel.Event.Ontology
	 * @generated
	 */
	EClass getOntology();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.EventModel.Event.Ontology#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see net.sf.ictalive.EventModel.Event.Ontology#getUrl()
	 * @see #getOntology()
	 * @generated
	 */
	EAttribute getOntology_Url();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Event.PointOfView <em>Point Of View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Of View</em>'.
	 * @see net.sf.ictalive.EventModel.Event.PointOfView
	 * @generated
	 */
	EClass getPointOfView();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Event.ActorView <em>Actor View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor View</em>'.
	 * @see net.sf.ictalive.EventModel.Event.ActorView
	 * @generated
	 */
	EClass getActorView();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Event.ObserverView <em>Observer View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observer View</em>'.
	 * @see net.sf.ictalive.EventModel.Event.ObserverView
	 * @generated
	 */
	EClass getObserverView();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Event.ProxyView <em>Proxy View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy View</em>'.
	 * @see net.sf.ictalive.EventModel.Event.ProxyView
	 * @generated
	 */
	EClass getProxyView();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.EventModel.Event.ProxyView#getTransmitter <em>Transmitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transmitter</em>'.
	 * @see net.sf.ictalive.EventModel.Event.ProxyView#getTransmitter()
	 * @see #getProxyView()
	 * @generated
	 */
	EReference getProxyView_Transmitter();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Event.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see net.sf.ictalive.EventModel.Event.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.EventModel.Event.Actor#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see net.sf.ictalive.EventModel.Event.Actor#getUrl()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Url();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.EventModel.Event.Actor#getEmit <em>Emit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Emit</em>'.
	 * @see net.sf.ictalive.EventModel.Event.Actor#getEmit()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Emit();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.EventModel.Event.EncodingStyle <em>Encoding Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encoding Style</em>'.
	 * @see net.sf.ictalive.EventModel.Event.EncodingStyle
	 * @generated
	 */
	EEnum getEncodingStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EventFactory getEventFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Event.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Event.impl.EventImpl
		 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Local Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__LOCAL_KEY = eINSTANCE.getEvent_LocalKey();

		/**
		 * The meta object literal for the '<em><b>Asserter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__ASSERTER = eINSTANCE.getEvent_Asserter();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__CONTENT = eINSTANCE.getEvent_Content();

		/**
		 * The meta object literal for the '<em><b>Point Of View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__POINT_OF_VIEW = eINSTANCE.getEvent_PointOfView();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__LANGUAGE = eINSTANCE.getEvent_Language();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__ENCODING = eINSTANCE.getEvent_Encoding();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TIMESTAMP = eINSTANCE.getEvent_Timestamp();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Event.impl.KeyImpl <em>Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Event.impl.KeyImpl
		 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getKey()
		 * @generated
		 */
		EClass KEY = eINSTANCE.getKey();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY__ID = eINSTANCE.getKey_Id();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Event.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Event.impl.LanguageImpl
		 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Event.impl.XMLSchemaImpl <em>XML Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Event.impl.XMLSchemaImpl
		 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getXMLSchema()
		 * @generated
		 */
		EClass XML_SCHEMA = eINSTANCE.getXMLSchema();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_SCHEMA__URL = eINSTANCE.getXMLSchema_Url();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Event.impl.OntologyImpl <em>Ontology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Event.impl.OntologyImpl
		 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getOntology()
		 * @generated
		 */
		EClass ONTOLOGY = eINSTANCE.getOntology();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY__URL = eINSTANCE.getOntology_Url();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Event.impl.PointOfViewImpl <em>Point Of View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Event.impl.PointOfViewImpl
		 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getPointOfView()
		 * @generated
		 */
		EClass POINT_OF_VIEW = eINSTANCE.getPointOfView();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Event.impl.ActorViewImpl <em>Actor View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Event.impl.ActorViewImpl
		 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getActorView()
		 * @generated
		 */
		EClass ACTOR_VIEW = eINSTANCE.getActorView();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Event.impl.ObserverViewImpl <em>Observer View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Event.impl.ObserverViewImpl
		 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getObserverView()
		 * @generated
		 */
		EClass OBSERVER_VIEW = eINSTANCE.getObserverView();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Event.impl.ProxyViewImpl <em>Proxy View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Event.impl.ProxyViewImpl
		 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getProxyView()
		 * @generated
		 */
		EClass PROXY_VIEW = eINSTANCE.getProxyView();

		/**
		 * The meta object literal for the '<em><b>Transmitter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_VIEW__TRANSMITTER = eINSTANCE.getProxyView_Transmitter();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Event.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Event.impl.ActorImpl
		 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__URL = eINSTANCE.getActor_Url();

		/**
		 * The meta object literal for the '<em><b>Emit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__EMIT = eINSTANCE.getActor_Emit();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Event.EncodingStyle <em>Encoding Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Event.EncodingStyle
		 * @see net.sf.ictalive.EventModel.Event.impl.EventPackageImpl#getEncodingStyle()
		 * @generated
		 */
		EEnum ENCODING_STYLE = eINSTANCE.getEncodingStyle();

	}

} //EventPackage
