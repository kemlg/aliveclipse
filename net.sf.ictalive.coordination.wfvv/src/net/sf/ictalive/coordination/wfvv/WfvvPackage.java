/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfvv;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see net.sf.ictalive.coordination.wfvv.WfvvFactory
 * @model kind="package"
 * @generated
 */
public interface WfvvPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wfvv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://net.sf.ictalive.coordination.wfvv";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wfvv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WfvvPackage eINSTANCE = net.sf.ictalive.coordination.wfvv.impl.WfvvPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.wfvv.impl.EventModelContainerImpl <em>Event Model Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.wfvv.impl.EventModelContainerImpl
	 * @see net.sf.ictalive.coordination.wfvv.impl.WfvvPackageImpl#getEventModelContainer()
	 * @generated
	 */
	int EVENT_MODEL_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL_CONTAINER__EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Event Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL_CONTAINER__EVENT_GROUPS = 1;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL_CONTAINER__OBJECTS = 2;

	/**
	 * The number of structural features of the '<em>Event Model Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL_CONTAINER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.wfvv.impl.EventGroupImpl <em>Event Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.wfvv.impl.EventGroupImpl
	 * @see net.sf.ictalive.coordination.wfvv.impl.WfvvPackageImpl#getEventGroup()
	 * @generated
	 */
	int EVENT_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP__EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP__NAME = 1;

	/**
	 * The feature id for the '<em><b>Minimized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP__MINIMIZED = 2;

	/**
	 * The number of structural features of the '<em>Event Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.wfvv.EventModelContainer <em>Event Model Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Model Container</em>'.
	 * @see net.sf.ictalive.coordination.wfvv.EventModelContainer
	 * @generated
	 */
	EClass getEventModelContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.wfvv.EventModelContainer#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see net.sf.ictalive.coordination.wfvv.EventModelContainer#getEvents()
	 * @see #getEventModelContainer()
	 * @generated
	 */
	EReference getEventModelContainer_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.wfvv.EventModelContainer#getEventGroups <em>Event Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Groups</em>'.
	 * @see net.sf.ictalive.coordination.wfvv.EventModelContainer#getEventGroups()
	 * @see #getEventModelContainer()
	 * @generated
	 */
	EReference getEventModelContainer_EventGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.wfvv.EventModelContainer#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see net.sf.ictalive.coordination.wfvv.EventModelContainer#getObjects()
	 * @see #getEventModelContainer()
	 * @generated
	 */
	EReference getEventModelContainer_Objects();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.wfvv.EventGroup <em>Event Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Group</em>'.
	 * @see net.sf.ictalive.coordination.wfvv.EventGroup
	 * @generated
	 */
	EClass getEventGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.wfvv.EventGroup#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see net.sf.ictalive.coordination.wfvv.EventGroup#getEvents()
	 * @see #getEventGroup()
	 * @generated
	 */
	EReference getEventGroup_Events();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.wfvv.EventGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.coordination.wfvv.EventGroup#getName()
	 * @see #getEventGroup()
	 * @generated
	 */
	EAttribute getEventGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.wfvv.EventGroup#isMinimized <em>Minimized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimized</em>'.
	 * @see net.sf.ictalive.coordination.wfvv.EventGroup#isMinimized()
	 * @see #getEventGroup()
	 * @generated
	 */
	EAttribute getEventGroup_Minimized();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WfvvFactory getWfvvFactory();

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
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.wfvv.impl.EventModelContainerImpl <em>Event Model Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.wfvv.impl.EventModelContainerImpl
		 * @see net.sf.ictalive.coordination.wfvv.impl.WfvvPackageImpl#getEventModelContainer()
		 * @generated
		 */
		EClass EVENT_MODEL_CONTAINER = eINSTANCE.getEventModelContainer();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_MODEL_CONTAINER__EVENTS = eINSTANCE.getEventModelContainer_Events();

		/**
		 * The meta object literal for the '<em><b>Event Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_MODEL_CONTAINER__EVENT_GROUPS = eINSTANCE.getEventModelContainer_EventGroups();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_MODEL_CONTAINER__OBJECTS = eINSTANCE.getEventModelContainer_Objects();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.wfvv.impl.EventGroupImpl <em>Event Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.wfvv.impl.EventGroupImpl
		 * @see net.sf.ictalive.coordination.wfvv.impl.WfvvPackageImpl#getEventGroup()
		 * @generated
		 */
		EClass EVENT_GROUP = eINSTANCE.getEventGroup();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_GROUP__EVENTS = eINSTANCE.getEventGroup_Events();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_GROUP__NAME = eINSTANCE.getEventGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Minimized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_GROUP__MINIMIZED = eINSTANCE.getEventGroup_Minimized();

	}

} //WfvvPackage
