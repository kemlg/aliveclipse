/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.event;

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
 * @see net.sf.ictalive.runtime.event.EventFactory
 * @model kind="package"
 * @generated
 */
public interface EventPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "event";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ict-alive.sourceforge.net/RunTime/events";

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
	EventPackage eINSTANCE = net.sf.ictalive.runtime.event.impl.EventPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.event.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.event.impl.EventImpl
	 * @see net.sf.ictalive.runtime.event.impl.EventPackageImpl#getEvent()
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
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TIMESTAMP = 4;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PROVENANCE = 5;

	/**
	 * The feature id for the '<em><b>Minimized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__MINIMIZED = 6;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.event.impl.KeyImpl <em>Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.event.impl.KeyImpl
	 * @see net.sf.ictalive.runtime.event.impl.EventPackageImpl#getKey()
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
	 * The meta object id for the '{@link net.sf.ictalive.runtime.event.impl.PointOfViewImpl <em>Point Of View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.event.impl.PointOfViewImpl
	 * @see net.sf.ictalive.runtime.event.impl.EventPackageImpl#getPointOfView()
	 * @generated
	 */
	int POINT_OF_VIEW = 2;

	/**
	 * The number of structural features of the '<em>Point Of View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_VIEW_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.event.impl.ActorViewImpl <em>Actor View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.event.impl.ActorViewImpl
	 * @see net.sf.ictalive.runtime.event.impl.EventPackageImpl#getActorView()
	 * @generated
	 */
	int ACTOR_VIEW = 3;

	/**
	 * The number of structural features of the '<em>Actor View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_VIEW_FEATURE_COUNT = POINT_OF_VIEW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.event.impl.ObserverViewImpl <em>Observer View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.event.impl.ObserverViewImpl
	 * @see net.sf.ictalive.runtime.event.impl.EventPackageImpl#getObserverView()
	 * @generated
	 */
	int OBSERVER_VIEW = 4;

	/**
	 * The number of structural features of the '<em>Observer View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_VIEW_FEATURE_COUNT = POINT_OF_VIEW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.event.impl.ProxyViewImpl <em>Proxy View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.event.impl.ProxyViewImpl
	 * @see net.sf.ictalive.runtime.event.impl.EventPackageImpl#getProxyView()
	 * @generated
	 */
	int PROXY_VIEW = 5;

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
	 * The meta object id for the '{@link net.sf.ictalive.runtime.event.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.event.impl.ActorImpl
	 * @see net.sf.ictalive.runtime.event.impl.EventPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 6;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__URL = 0;

	/**
	 * The feature id for the '<em><b>Emit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__EMIT = 1;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__AGENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = 3;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.event.impl.CauseImpl <em>Cause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.event.impl.CauseImpl
	 * @see net.sf.ictalive.runtime.event.impl.EventPackageImpl#getCause()
	 * @generated
	 */
	int CAUSE = 7;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__EVENT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.event.ProvenanceType <em>Provenance Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.event.ProvenanceType
	 * @see net.sf.ictalive.runtime.event.impl.EventPackageImpl#getProvenanceType()
	 * @generated
	 */
	int PROVENANCE_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.event.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see net.sf.ictalive.runtime.event.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.runtime.event.Event#getLocalKey <em>Local Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Key</em>'.
	 * @see net.sf.ictalive.runtime.event.Event#getLocalKey()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_LocalKey();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.event.Event#getAsserter <em>Asserter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asserter</em>'.
	 * @see net.sf.ictalive.runtime.event.Event#getAsserter()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Asserter();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.runtime.event.Event#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see net.sf.ictalive.runtime.event.Event#getContent()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Content();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.runtime.event.Event#getPointOfView <em>Point Of View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point Of View</em>'.
	 * @see net.sf.ictalive.runtime.event.Event#getPointOfView()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_PointOfView();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.event.Event#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see net.sf.ictalive.runtime.event.Event#getTimestamp()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Timestamp();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.runtime.event.Event#getProvenance <em>Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provenance</em>'.
	 * @see net.sf.ictalive.runtime.event.Event#getProvenance()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Provenance();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.event.Event#isMinimized <em>Minimized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimized</em>'.
	 * @see net.sf.ictalive.runtime.event.Event#isMinimized()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Minimized();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.event.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key</em>'.
	 * @see net.sf.ictalive.runtime.event.Key
	 * @generated
	 */
	EClass getKey();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.event.Key#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.ictalive.runtime.event.Key#getId()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Id();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.event.PointOfView <em>Point Of View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Of View</em>'.
	 * @see net.sf.ictalive.runtime.event.PointOfView
	 * @generated
	 */
	EClass getPointOfView();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.event.ActorView <em>Actor View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor View</em>'.
	 * @see net.sf.ictalive.runtime.event.ActorView
	 * @generated
	 */
	EClass getActorView();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.event.ObserverView <em>Observer View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observer View</em>'.
	 * @see net.sf.ictalive.runtime.event.ObserverView
	 * @generated
	 */
	EClass getObserverView();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.event.ProxyView <em>Proxy View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy View</em>'.
	 * @see net.sf.ictalive.runtime.event.ProxyView
	 * @generated
	 */
	EClass getProxyView();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.event.ProxyView#getTransmitter <em>Transmitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transmitter</em>'.
	 * @see net.sf.ictalive.runtime.event.ProxyView#getTransmitter()
	 * @see #getProxyView()
	 * @generated
	 */
	EReference getProxyView_Transmitter();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.event.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see net.sf.ictalive.runtime.event.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.event.Actor#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see net.sf.ictalive.runtime.event.Actor#getUrl()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Url();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.runtime.event.Actor#getEmit <em>Emit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Emit</em>'.
	 * @see net.sf.ictalive.runtime.event.Actor#getEmit()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Emit();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.event.Actor#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agent</em>'.
	 * @see net.sf.ictalive.runtime.event.Actor#getAgent()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Agent();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.event.Actor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.runtime.event.Actor#getName()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.event.Cause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cause</em>'.
	 * @see net.sf.ictalive.runtime.event.Cause
	 * @generated
	 */
	EClass getCause();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.event.Cause#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see net.sf.ictalive.runtime.event.Cause#getEvent()
	 * @see #getCause()
	 * @generated
	 */
	EReference getCause_Event();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.event.Cause#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.ictalive.runtime.event.Cause#getType()
	 * @see #getCause()
	 * @generated
	 */
	EAttribute getCause_Type();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.runtime.event.ProvenanceType <em>Provenance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provenance Type</em>'.
	 * @see net.sf.ictalive.runtime.event.ProvenanceType
	 * @generated
	 */
	EEnum getProvenanceType();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.event.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.event.impl.EventImpl
		 * @see net.sf.ictalive.runtime.event.impl.EventPackageImpl#getEvent()
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
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TIMESTAMP = eINSTANCE.getEvent_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Provenance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__PROVENANCE = eINSTANCE.getEvent_Provenance();

		/**
		 * The meta object literal for the '<em><b>Minimized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__MINIMIZED = eINSTANCE.getEvent_Minimized();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.event.impl.KeyImpl <em>Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.event.impl.KeyImpl
		 * @see net.sf.ictalive.runtime.event.impl.EventPackageImpl#getKey()
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
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.event.impl.PointOfViewImpl <em>Point Of View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.event.impl.PointOfViewImpl
		 * @see net.sf.ictalive.runtime.event.impl.EventPackageImpl#getPointOfView()
		 * @generated
		 */
		EClass POINT_OF_VIEW = eINSTANCE.getPointOfView();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.event.impl.ActorViewImpl <em>Actor View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.event.impl.ActorViewImpl
		 * @see net.sf.ictalive.runtime.event.impl.EventPackageImpl#getActorView()
		 * @generated
		 */
		EClass ACTOR_VIEW = eINSTANCE.getActorView();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.event.impl.ObserverViewImpl <em>Observer View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.event.impl.ObserverViewImpl
		 * @see net.sf.ictalive.runtime.event.impl.EventPackageImpl#getObserverView()
		 * @generated
		 */
		EClass OBSERVER_VIEW = eINSTANCE.getObserverView();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.event.impl.ProxyViewImpl <em>Proxy View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.event.impl.ProxyViewImpl
		 * @see net.sf.ictalive.runtime.event.impl.EventPackageImpl#getProxyView()
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
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.event.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.event.impl.ActorImpl
		 * @see net.sf.ictalive.runtime.event.impl.EventPackageImpl#getActor()
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
		 * The meta object literal for the '<em><b>Agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__AGENT = eINSTANCE.getActor_Agent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.event.impl.CauseImpl <em>Cause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.event.impl.CauseImpl
		 * @see net.sf.ictalive.runtime.event.impl.EventPackageImpl#getCause()
		 * @generated
		 */
		EClass CAUSE = eINSTANCE.getCause();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAUSE__EVENT = eINSTANCE.getCause_Event();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAUSE__TYPE = eINSTANCE.getCause_Type();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.event.ProvenanceType <em>Provenance Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.event.ProvenanceType
		 * @see net.sf.ictalive.runtime.event.impl.EventPackageImpl#getProvenanceType()
		 * @generated
		 */
		EEnum PROVENANCE_TYPE = eINSTANCE.getProvenanceType();

	}

} //EventPackage
