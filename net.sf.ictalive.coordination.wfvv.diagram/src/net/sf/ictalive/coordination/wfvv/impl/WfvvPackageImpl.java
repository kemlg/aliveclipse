/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfvv.impl;

import net.sf.ictalive.coordination.actions.ActionsPackage;

import net.sf.ictalive.coordination.agents.AgentsPackage;

import net.sf.ictalive.coordination.tasks.TasksPackage;

import net.sf.ictalive.coordination.wfvv.EventGroup;
import net.sf.ictalive.coordination.wfvv.EventModelContainer;
import net.sf.ictalive.coordination.wfvv.WfvvFactory;
import net.sf.ictalive.coordination.wfvv.WfvvPackage;

import net.sf.ictalive.operetta.OM.OMPackage;

import net.sf.ictalive.owls.service.ServicePackage;

import net.sf.ictalive.runtime.action.ActionPackage;

import net.sf.ictalive.runtime.enactment.EnactmentPackage;

import net.sf.ictalive.runtime.event.EventPackage;

import net.sf.ictalive.runtime.fact.FactPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WfvvPackageImpl extends EPackageImpl implements WfvvPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventModelContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventGroupEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.ictalive.coordination.wfvv.WfvvPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WfvvPackageImpl() {
		super(eNS_URI, WfvvFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WfvvPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WfvvPackage init() {
		if (isInited) return (WfvvPackage)EPackage.Registry.INSTANCE.getEPackage(WfvvPackage.eNS_URI);

		// Obtain or create and register package
		WfvvPackageImpl theWfvvPackage = (WfvvPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WfvvPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WfvvPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActionPackage.eINSTANCE.eClass();
		EnactmentPackage.eINSTANCE.eClass();
		EventPackage.eINSTANCE.eClass();
		FactPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWfvvPackage.createPackageContents();

		// Initialize created meta-data
		theWfvvPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWfvvPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WfvvPackage.eNS_URI, theWfvvPackage);
		return theWfvvPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventModelContainer() {
		return eventModelContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventModelContainer_Events() {
		return (EReference)eventModelContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventModelContainer_EventGroups() {
		return (EReference)eventModelContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventGroup() {
		return eventGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventGroup_Events() {
		return (EReference)eventGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventGroup_Name() {
		return (EAttribute)eventGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventGroup_Minimized() {
		return (EAttribute)eventGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WfvvFactory getWfvvFactory() {
		return (WfvvFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		eventModelContainerEClass = createEClass(EVENT_MODEL_CONTAINER);
		createEReference(eventModelContainerEClass, EVENT_MODEL_CONTAINER__EVENTS);
		createEReference(eventModelContainerEClass, EVENT_MODEL_CONTAINER__EVENT_GROUPS);

		eventGroupEClass = createEClass(EVENT_GROUP);
		createEReference(eventGroupEClass, EVENT_GROUP__EVENTS);
		createEAttribute(eventGroupEClass, EVENT_GROUP__NAME);
		createEAttribute(eventGroupEClass, EVENT_GROUP__MINIMIZED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EventPackage theEventPackage = (EventPackage)EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(eventModelContainerEClass, EventModelContainer.class, "EventModelContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventModelContainer_Events(), theEventPackage.getEvent(), null, "events", null, 0, -1, EventModelContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventModelContainer_EventGroups(), this.getEventGroup(), null, "eventGroups", null, 0, -1, EventModelContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventGroupEClass, EventGroup.class, "EventGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventGroup_Events(), theEventPackage.getEvent(), null, "events", null, 0, -1, EventGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventGroup_Name(), ecorePackage.getEString(), "name", null, 1, 1, EventGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventGroup_Minimized(), ecorePackage.getEBoolean(), "minimized", "true", 1, 1, EventGroup.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //WfvvPackageImpl
