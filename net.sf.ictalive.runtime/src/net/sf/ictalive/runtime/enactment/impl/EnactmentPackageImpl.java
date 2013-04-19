/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.enactment.impl;

import net.sf.ictalive.coordination.tasks.TasksPackage;

import net.sf.ictalive.runtime.NormInstances.NormInstancesPackage;
import net.sf.ictalive.runtime.action.ActionPackage;

import net.sf.ictalive.runtime.action.impl.ActionPackageImpl;

import net.sf.ictalive.runtime.enactment.ActionEnactment;
import net.sf.ictalive.runtime.enactment.Enactment;
import net.sf.ictalive.runtime.enactment.EnactmentFactory;
import net.sf.ictalive.runtime.enactment.EnactmentPackage;
import net.sf.ictalive.runtime.enactment.PlanEnactment;
import net.sf.ictalive.runtime.enactment.Resource;
import net.sf.ictalive.runtime.enactment.ServiceInvocationEnactment;

import net.sf.ictalive.runtime.event.EventPackage;

import net.sf.ictalive.runtime.event.impl.EventPackageImpl;

import net.sf.ictalive.runtime.fact.FactPackage;

import net.sf.ictalive.runtime.fact.impl.FactPackageImpl;

import net.sf.ictalive.service.ServicePackage;

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
public class EnactmentPackageImpl extends EPackageImpl implements EnactmentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enactmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEnactmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planEnactmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInvocationEnactmentEClass = null;

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
	 * @see net.sf.ictalive.runtime.enactment.EnactmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnactmentPackageImpl() {
		super(eNS_URI, EnactmentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EnactmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnactmentPackage init() {
		if (isInited) return (EnactmentPackage)EPackage.Registry.INSTANCE.getEPackage(EnactmentPackage.eNS_URI);

		// Obtain or create and register package
		EnactmentPackageImpl theEnactmentPackage = (EnactmentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EnactmentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EnactmentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TasksPackage.eINSTANCE.eClass();
		NormInstancesPackage.eINSTANCE.eClass();
		ServicePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);
		EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
		FactPackageImpl theFactPackage = (FactPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FactPackage.eNS_URI) instanceof FactPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FactPackage.eNS_URI) : FactPackage.eINSTANCE);

		// Create package meta-data objects
		theEnactmentPackage.createPackageContents();
		theActionPackage.createPackageContents();
		theEventPackage.createPackageContents();
		theFactPackage.createPackageContents();

		// Initialize created meta-data
		theEnactmentPackage.initializePackageContents();
		theActionPackage.initializePackageContents();
		theEventPackage.initializePackageContents();
		theFactPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnactmentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnactmentPackage.eNS_URI, theEnactmentPackage);
		return theEnactmentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnactment() {
		return enactmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnactment_Resource() {
		return (EReference)enactmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnactment_SessionId() {
		return (EAttribute)enactmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnactment_StartTime() {
		return (EAttribute)enactmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnactment_ExpireTime() {
		return (EAttribute)enactmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnactment_FinishTime() {
		return (EAttribute)enactmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Uri() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionEnactment() {
		return actionEnactmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionEnactment_GroundedAction() {
		return (EReference)actionEnactmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanEnactment() {
		return planEnactmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanEnactment_Plan() {
		return (EReference)planEnactmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceInvocationEnactment() {
		return serviceInvocationEnactmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInvocationEnactment_Service() {
		return (EReference)serviceInvocationEnactmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnactmentFactory getEnactmentFactory() {
		return (EnactmentFactory)getEFactoryInstance();
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
		enactmentEClass = createEClass(ENACTMENT);
		createEReference(enactmentEClass, ENACTMENT__RESOURCE);
		createEAttribute(enactmentEClass, ENACTMENT__SESSION_ID);
		createEAttribute(enactmentEClass, ENACTMENT__START_TIME);
		createEAttribute(enactmentEClass, ENACTMENT__EXPIRE_TIME);
		createEAttribute(enactmentEClass, ENACTMENT__FINISH_TIME);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__URI);

		actionEnactmentEClass = createEClass(ACTION_ENACTMENT);
		createEReference(actionEnactmentEClass, ACTION_ENACTMENT__GROUNDED_ACTION);

		planEnactmentEClass = createEClass(PLAN_ENACTMENT);
		createEReference(planEnactmentEClass, PLAN_ENACTMENT__PLAN);

		serviceInvocationEnactmentEClass = createEClass(SERVICE_INVOCATION_ENACTMENT);
		createEReference(serviceInvocationEnactmentEClass, SERVICE_INVOCATION_ENACTMENT__SERVICE);
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
		TasksPackage theTasksPackage = (TasksPackage)EPackage.Registry.INSTANCE.getEPackage(TasksPackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actionEnactmentEClass.getESuperTypes().add(this.getEnactment());
		planEnactmentEClass.getESuperTypes().add(this.getEnactment());
		serviceInvocationEnactmentEClass.getESuperTypes().add(this.getEnactment());

		// Initialize classes and features; add operations and parameters
		initEClass(enactmentEClass, Enactment.class, "Enactment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnactment_Resource(), this.getResource(), null, "resource", null, 0, -1, Enactment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnactment_SessionId(), ecorePackage.getEString(), "sessionId", null, 0, 1, Enactment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnactment_StartTime(), ecorePackage.getEDate(), "startTime", null, 0, 1, Enactment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnactment_ExpireTime(), ecorePackage.getEDate(), "expireTime", null, 0, 1, Enactment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnactment_FinishTime(), ecorePackage.getEDate(), "finishTime", null, 0, 1, Enactment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEnactmentEClass, ActionEnactment.class, "ActionEnactment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionEnactment_GroundedAction(), theTasksPackage.getActionGrounding(), null, "groundedAction", null, 1, 1, ActionEnactment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planEnactmentEClass, PlanEnactment.class, "PlanEnactment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlanEnactment_Plan(), theTasksPackage.getPlan(), null, "plan", null, 1, 1, PlanEnactment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInvocationEnactmentEClass, ServiceInvocationEnactment.class, "ServiceInvocationEnactment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceInvocationEnactment_Service(), theServicePackage.getService(), null, "service", null, 1, 1, ServiceInvocationEnactment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EnactmentPackageImpl
