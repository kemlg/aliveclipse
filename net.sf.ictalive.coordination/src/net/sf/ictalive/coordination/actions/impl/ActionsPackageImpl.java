/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.actions.impl;

import net.sf.ictalive.coordination.actions.Action;
import net.sf.ictalive.coordination.actions.ActionResult;
import net.sf.ictalive.coordination.actions.ActionsCollection;
import net.sf.ictalive.coordination.actions.ActionsFactory;
import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.actions.AtomicAction;
import net.sf.ictalive.coordination.actions.AtomicActionResult;
import net.sf.ictalive.coordination.actions.CompositeAction;
import net.sf.ictalive.coordination.actions.Distribution;
import net.sf.ictalive.coordination.agents.AgentsPackage;
import net.sf.ictalive.coordination.agents.impl.AgentsPackageImpl;
import net.sf.ictalive.coordination.tasks.TasksPackage;
import net.sf.ictalive.coordination.tasks.impl.TasksPackageImpl;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.owls.expr.ExprPackage;
import net.sf.ictalive.owls.process.ProcessPackage;
import net.sf.ictalive.owls.service.ServicePackage;
import net.sf.ictalive.owls.time.TimePackage;
import net.sf.ictalive.rules.swrl.SwrlPackage;

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
public class ActionsPackageImpl extends EPackageImpl implements ActionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicActionResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionsCollectionEClass = null;

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
	 * @see net.sf.ictalive.coordination.actions.ActionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActionsPackageImpl() {
		super(eNS_URI, ActionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ActionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActionsPackage init() {
		if (isInited) return (ActionsPackage)EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI);

		// Obtain or create and register package
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ExprPackage.eINSTANCE.eClass();
		ProcessPackage.eINSTANCE.eClass();
		ServicePackage.eINSTANCE.eClass();
		TimePackage.eINSTANCE.eClass();
		SwrlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AgentsPackageImpl theAgentsPackage = (AgentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AgentsPackage.eNS_URI) instanceof AgentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AgentsPackage.eNS_URI) : AgentsPackage.eINSTANCE);
		TasksPackageImpl theTasksPackage = (TasksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TasksPackage.eNS_URI) instanceof TasksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TasksPackage.eNS_URI) : TasksPackage.eINSTANCE);

		// Create package meta-data objects
		theActionsPackage.createPackageContents();
		theAgentsPackage.createPackageContents();
		theTasksPackage.createPackageContents();

		// Initialize created meta-data
		theActionsPackage.initializePackageContents();
		theAgentsPackage.initializePackageContents();
		theTasksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActionsPackage.eNS_URI, theActionsPackage);
		return theActionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_PerformedByRole() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicAction() {
		return atomicActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicAction_HasAtomicActionResult() {
		return (EReference)atomicActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeAction() {
		return compositeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionResult() {
		return actionResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionResult_InCondition() {
		return (EReference)actionResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionResult_HasAddEffect() {
		return (EReference)actionResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionResult_HasDeleteEffect() {
		return (EReference)actionResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionResult_Id() {
		return (EAttribute)actionResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionResult_Version() {
		return (EAttribute)actionResultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicActionResult() {
		return atomicActionResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicActionResult_HasDensity() {
		return (EAttribute)atomicActionResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicActionResult_HasCostDistribution() {
		return (EReference)atomicActionResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicActionResult_HasDurationDistribution() {
		return (EReference)atomicActionResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicActionResult_HasQualityDistribution() {
		return (EReference)atomicActionResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistribution() {
		return distributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistribution_Datapoint() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistribution_Density() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistribution_Id() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistribution_Version() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionsCollection() {
		return actionsCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionsCollection_Ns() {
		return (EAttribute)actionsCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionsCollection_Actions() {
		return (EReference)actionsCollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionsCollection_Participants() {
		return (EReference)actionsCollectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionsCollection_Parameters() {
		return (EReference)actionsCollectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionsCollection_Id() {
		return (EAttribute)actionsCollectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionsCollection_Version() {
		return (EAttribute)actionsCollectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsFactory getActionsFactory() {
		return (ActionsFactory)getEFactoryInstance();
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
		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__PERFORMED_BY_ROLE);

		atomicActionEClass = createEClass(ATOMIC_ACTION);
		createEReference(atomicActionEClass, ATOMIC_ACTION__HAS_ATOMIC_ACTION_RESULT);

		compositeActionEClass = createEClass(COMPOSITE_ACTION);

		actionResultEClass = createEClass(ACTION_RESULT);
		createEReference(actionResultEClass, ACTION_RESULT__IN_CONDITION);
		createEReference(actionResultEClass, ACTION_RESULT__HAS_ADD_EFFECT);
		createEReference(actionResultEClass, ACTION_RESULT__HAS_DELETE_EFFECT);
		createEAttribute(actionResultEClass, ACTION_RESULT__ID);
		createEAttribute(actionResultEClass, ACTION_RESULT__VERSION);

		atomicActionResultEClass = createEClass(ATOMIC_ACTION_RESULT);
		createEAttribute(atomicActionResultEClass, ATOMIC_ACTION_RESULT__HAS_DENSITY);
		createEReference(atomicActionResultEClass, ATOMIC_ACTION_RESULT__HAS_COST_DISTRIBUTION);
		createEReference(atomicActionResultEClass, ATOMIC_ACTION_RESULT__HAS_DURATION_DISTRIBUTION);
		createEReference(atomicActionResultEClass, ATOMIC_ACTION_RESULT__HAS_QUALITY_DISTRIBUTION);

		distributionEClass = createEClass(DISTRIBUTION);
		createEAttribute(distributionEClass, DISTRIBUTION__DATAPOINT);
		createEAttribute(distributionEClass, DISTRIBUTION__DENSITY);
		createEAttribute(distributionEClass, DISTRIBUTION__ID);
		createEAttribute(distributionEClass, DISTRIBUTION__VERSION);

		actionsCollectionEClass = createEClass(ACTIONS_COLLECTION);
		createEAttribute(actionsCollectionEClass, ACTIONS_COLLECTION__NS);
		createEReference(actionsCollectionEClass, ACTIONS_COLLECTION__ACTIONS);
		createEReference(actionsCollectionEClass, ACTIONS_COLLECTION__PARTICIPANTS);
		createEReference(actionsCollectionEClass, ACTIONS_COLLECTION__PARAMETERS);
		createEAttribute(actionsCollectionEClass, ACTIONS_COLLECTION__ID);
		createEAttribute(actionsCollectionEClass, ACTIONS_COLLECTION__VERSION);
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
		ProcessPackage theProcessPackage = (ProcessPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI);
		OMPackage theOMPackage = (OMPackage)EPackage.Registry.INSTANCE.getEPackage(OMPackage.eNS_URI);
		ExprPackage theExprPackage = (ExprPackage)EPackage.Registry.INSTANCE.getEPackage(ExprPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actionEClass.getESuperTypes().add(theProcessPackage.getProcess());
		atomicActionEClass.getESuperTypes().add(this.getAction());
		atomicActionEClass.getESuperTypes().add(theProcessPackage.getAtomicProcess());
		compositeActionEClass.getESuperTypes().add(this.getAction());
		compositeActionEClass.getESuperTypes().add(theProcessPackage.getCompositeProcess());
		atomicActionResultEClass.getESuperTypes().add(this.getActionResult());

		// Initialize classes and features; add operations and parameters
		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_PerformedByRole(), theOMPackage.getRole(), null, "performedByRole", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicActionEClass, AtomicAction.class, "AtomicAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicAction_HasAtomicActionResult(), this.getAtomicActionResult(), null, "hasAtomicActionResult", null, 0, -1, AtomicAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(compositeActionEClass, CompositeAction.class, "CompositeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionResultEClass, ActionResult.class, "ActionResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionResult_InCondition(), theExprPackage.getCondition(), null, "inCondition", null, 0, -1, ActionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionResult_HasAddEffect(), theExprPackage.getExpression(), null, "hasAddEffect", null, 0, -1, ActionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionResult_HasDeleteEffect(), theExprPackage.getExpression(), null, "hasDeleteEffect", null, 0, -1, ActionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionResult_Id(), ecorePackage.getEInt(), "id", null, 0, 1, ActionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionResult_Version(), ecorePackage.getEInt(), "version", null, 0, 1, ActionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicActionResultEClass, AtomicActionResult.class, "AtomicActionResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtomicActionResult_HasDensity(), ecorePackage.getEFloat(), "hasDensity", "1.0", 1, 1, AtomicActionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicActionResult_HasCostDistribution(), this.getDistribution(), null, "hasCostDistribution", null, 0, -1, AtomicActionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicActionResult_HasDurationDistribution(), this.getDistribution(), null, "hasDurationDistribution", null, 0, -1, AtomicActionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicActionResult_HasQualityDistribution(), this.getDistribution(), null, "hasQualityDistribution", null, 0, -1, AtomicActionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distributionEClass, Distribution.class, "Distribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistribution_Datapoint(), ecorePackage.getEFloat(), "datapoint", "1.0", 1, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistribution_Density(), ecorePackage.getEFloat(), "density", "1.0", 1, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistribution_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistribution_Version(), ecorePackage.getEInt(), "version", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionsCollectionEClass, ActionsCollection.class, "ActionsCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionsCollection_Ns(), ecorePackage.getEString(), "ns", null, 0, 1, ActionsCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionsCollection_Actions(), this.getAction(), null, "actions", null, 0, -1, ActionsCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionsCollection_Participants(), theProcessPackage.getParticipant(), null, "participants", null, 0, -1, ActionsCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionsCollection_Parameters(), theProcessPackage.getParameter(), null, "parameters", null, 0, -1, ActionsCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionsCollection_Id(), ecorePackage.getEInt(), "id", null, 0, 1, ActionsCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionsCollection_Version(), ecorePackage.getEInt(), "version", null, 0, 1, ActionsCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// teneo.jpa
		createTeneoAnnotations();
	}

	/**
	 * Initializes the annotations for <b>teneo.jpa</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeneoAnnotations() {
		String source = "teneo.jpa";		
		addAnnotation
		  (getActionResult_Version(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getDistribution_Version(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getActionsCollection_Version(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });
	}

} //ActionsPackageImpl
