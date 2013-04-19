/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.tasks.impl;

import net.sf.ictalive.coordination.actions.ActionsPackage;

import net.sf.ictalive.coordination.actions.impl.ActionsPackageImpl;

import net.sf.ictalive.coordination.agents.AgentsPackage;

import net.sf.ictalive.coordination.agents.impl.AgentsPackageImpl;

import net.sf.ictalive.coordination.tasks.ActionGrounding;
import net.sf.ictalive.coordination.tasks.ActionGroundingList;
import net.sf.ictalive.coordination.tasks.InputMessageMap;
import net.sf.ictalive.coordination.tasks.Plan;
import net.sf.ictalive.coordination.tasks.PlansCollection;
import net.sf.ictalive.coordination.tasks.Task;
import net.sf.ictalive.coordination.tasks.TasksCollection;
import net.sf.ictalive.coordination.tasks.TasksFactory;
import net.sf.ictalive.coordination.tasks.TasksPackage;

import net.sf.ictalive.owls.expr.ExprPackage;

import net.sf.ictalive.owls.process.ProcessPackage;

import net.sf.ictalive.owls.service.ServicePackage;

import net.sf.ictalive.owls.time.TimePackage;

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
public class TasksPackageImpl extends EPackageImpl implements TasksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputMessageMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionGroundingListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionGroundingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tasksCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plansCollectionEClass = null;

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
	 * @see net.sf.ictalive.coordination.tasks.TasksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TasksPackageImpl() {
		super(eNS_URI, TasksFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TasksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TasksPackage init() {
		if (isInited) return (TasksPackage)EPackage.Registry.INSTANCE.getEPackage(TasksPackage.eNS_URI);

		// Obtain or create and register package
		TasksPackageImpl theTasksPackage = (TasksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TasksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TasksPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ExprPackage.eINSTANCE.eClass();
		ProcessPackage.eINSTANCE.eClass();
		ServicePackage.eINSTANCE.eClass();
		TimePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) instanceof ActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) : ActionsPackage.eINSTANCE);
		AgentsPackageImpl theAgentsPackage = (AgentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AgentsPackage.eNS_URI) instanceof AgentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AgentsPackage.eNS_URI) : AgentsPackage.eINSTANCE);

		// Create package meta-data objects
		theTasksPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theAgentsPackage.createPackageContents();

		// Initialize created meta-data
		theTasksPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theAgentsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTasksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TasksPackage.eNS_URI, theTasksPackage);
		return theTasksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Components() {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_HasPrecondition() {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_HasResult() {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Input() {
		return (EReference)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Id() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Version() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputMessageMap() {
		return inputMessageMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputMessageMap_MessagePart() {
		return (EAttribute)inputMessageMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputMessageMap_Parameter() {
		return (EReference)inputMessageMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputMessageMap_Id() {
		return (EAttribute)inputMessageMapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputMessageMap_Version() {
		return (EAttribute)inputMessageMapEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlan() {
		return planEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlan_ForTask() {
		return (EReference)planEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlan_HasAtomicProcessGroundingList() {
		return (EReference)planEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlan_Id() {
		return (EAttribute)planEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlan_Version() {
		return (EAttribute)planEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlan_Name() {
		return (EAttribute)planEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionGroundingList() {
		return actionGroundingListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionGroundingList_First() {
		return (EReference)actionGroundingListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionGroundingList_Rest() {
		return (EReference)actionGroundingListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionGroundingList_Id() {
		return (EAttribute)actionGroundingListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionGroundingList_Version() {
		return (EAttribute)actionGroundingListEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionGrounding() {
		return actionGroundingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionGrounding_OwlsProcess() {
		return (EReference)actionGroundingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionGrounding_Input() {
		return (EReference)actionGroundingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionGrounding_Id() {
		return (EAttribute)actionGroundingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionGrounding_Version() {
		return (EAttribute)actionGroundingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTasksCollection() {
		return tasksCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTasksCollection_Ns() {
		return (EAttribute)tasksCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTasksCollection_Tasks() {
		return (EReference)tasksCollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTasksCollection_Id() {
		return (EAttribute)tasksCollectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTasksCollection_Version() {
		return (EAttribute)tasksCollectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlansCollection() {
		return plansCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlansCollection_Ns() {
		return (EAttribute)plansCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlansCollection_Plans() {
		return (EReference)plansCollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlansCollection_Id() {
		return (EAttribute)plansCollectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlansCollection_Version() {
		return (EAttribute)plansCollectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TasksFactory getTasksFactory() {
		return (TasksFactory)getEFactoryInstance();
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
		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__COMPONENTS);
		createEReference(taskEClass, TASK__HAS_PRECONDITION);
		createEReference(taskEClass, TASK__HAS_RESULT);
		createEReference(taskEClass, TASK__INPUT);
		createEAttribute(taskEClass, TASK__NAME);
		createEAttribute(taskEClass, TASK__ID);
		createEAttribute(taskEClass, TASK__VERSION);

		inputMessageMapEClass = createEClass(INPUT_MESSAGE_MAP);
		createEAttribute(inputMessageMapEClass, INPUT_MESSAGE_MAP__MESSAGE_PART);
		createEReference(inputMessageMapEClass, INPUT_MESSAGE_MAP__PARAMETER);
		createEAttribute(inputMessageMapEClass, INPUT_MESSAGE_MAP__ID);
		createEAttribute(inputMessageMapEClass, INPUT_MESSAGE_MAP__VERSION);

		planEClass = createEClass(PLAN);
		createEReference(planEClass, PLAN__FOR_TASK);
		createEReference(planEClass, PLAN__HAS_ATOMIC_PROCESS_GROUNDING_LIST);
		createEAttribute(planEClass, PLAN__ID);
		createEAttribute(planEClass, PLAN__VERSION);
		createEAttribute(planEClass, PLAN__NAME);

		actionGroundingListEClass = createEClass(ACTION_GROUNDING_LIST);
		createEReference(actionGroundingListEClass, ACTION_GROUNDING_LIST__FIRST);
		createEReference(actionGroundingListEClass, ACTION_GROUNDING_LIST__REST);
		createEAttribute(actionGroundingListEClass, ACTION_GROUNDING_LIST__ID);
		createEAttribute(actionGroundingListEClass, ACTION_GROUNDING_LIST__VERSION);

		actionGroundingEClass = createEClass(ACTION_GROUNDING);
		createEReference(actionGroundingEClass, ACTION_GROUNDING__OWLS_PROCESS);
		createEReference(actionGroundingEClass, ACTION_GROUNDING__INPUT);
		createEAttribute(actionGroundingEClass, ACTION_GROUNDING__ID);
		createEAttribute(actionGroundingEClass, ACTION_GROUNDING__VERSION);

		tasksCollectionEClass = createEClass(TASKS_COLLECTION);
		createEAttribute(tasksCollectionEClass, TASKS_COLLECTION__NS);
		createEReference(tasksCollectionEClass, TASKS_COLLECTION__TASKS);
		createEAttribute(tasksCollectionEClass, TASKS_COLLECTION__ID);
		createEAttribute(tasksCollectionEClass, TASKS_COLLECTION__VERSION);

		plansCollectionEClass = createEClass(PLANS_COLLECTION);
		createEAttribute(plansCollectionEClass, PLANS_COLLECTION__NS);
		createEReference(plansCollectionEClass, PLANS_COLLECTION__PLANS);
		createEAttribute(plansCollectionEClass, PLANS_COLLECTION__ID);
		createEAttribute(plansCollectionEClass, PLANS_COLLECTION__VERSION);
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
		ExprPackage theExprPackage = (ExprPackage)EPackage.Registry.INSTANCE.getEPackage(ExprPackage.eNS_URI);
		ActionsPackage theActionsPackage = (ActionsPackage)EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_Components(), theProcessPackage.getControlConstruct(), null, "components", null, 1, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_HasPrecondition(), theExprPackage.getCondition(), null, "hasPrecondition", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_HasResult(), theActionsPackage.getActionResult(), null, "hasResult", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Input(), this.getInputMessageMap(), null, "input", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Version(), ecorePackage.getEInt(), "version", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputMessageMapEClass, InputMessageMap.class, "InputMessageMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputMessageMap_MessagePart(), ecorePackage.getEString(), "messagePart", null, 0, 1, InputMessageMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputMessageMap_Parameter(), theProcessPackage.getParameter(), null, "parameter", null, 0, 1, InputMessageMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputMessageMap_Id(), ecorePackage.getEInt(), "id", null, 0, 1, InputMessageMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputMessageMap_Version(), ecorePackage.getEInt(), "version", null, 0, 1, InputMessageMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planEClass, Plan.class, "Plan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlan_ForTask(), this.getTask(), null, "forTask", null, 1, 1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlan_HasAtomicProcessGroundingList(), this.getActionGroundingList(), null, "hasAtomicProcessGroundingList", null, 1, 1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlan_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlan_Version(), ecorePackage.getEInt(), "version", null, 0, 1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlan_Name(), ecorePackage.getEString(), "name", null, 0, 1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionGroundingListEClass, ActionGroundingList.class, "ActionGroundingList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionGroundingList_First(), this.getActionGrounding(), null, "first", null, 1, 1, ActionGroundingList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionGroundingList_Rest(), this.getActionGroundingList(), null, "rest", null, 0, 1, ActionGroundingList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionGroundingList_Id(), ecorePackage.getEInt(), "id", null, 0, 1, ActionGroundingList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionGroundingList_Version(), ecorePackage.getEInt(), "version", null, 0, 1, ActionGroundingList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionGroundingEClass, ActionGrounding.class, "ActionGrounding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionGrounding_OwlsProcess(), theActionsPackage.getAction(), null, "owlsProcess", null, 1, 1, ActionGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionGrounding_Input(), this.getInputMessageMap(), null, "input", null, 0, -1, ActionGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionGrounding_Id(), ecorePackage.getEInt(), "id", null, 0, 1, ActionGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionGrounding_Version(), ecorePackage.getEInt(), "version", null, 0, 1, ActionGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tasksCollectionEClass, TasksCollection.class, "TasksCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTasksCollection_Ns(), ecorePackage.getEString(), "ns", null, 0, 1, TasksCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTasksCollection_Tasks(), this.getTask(), null, "tasks", null, 0, -1, TasksCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTasksCollection_Id(), ecorePackage.getEInt(), "id", null, 0, 1, TasksCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTasksCollection_Version(), ecorePackage.getEInt(), "version", null, 0, 1, TasksCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plansCollectionEClass, PlansCollection.class, "PlansCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlansCollection_Ns(), ecorePackage.getEString(), "ns", null, 0, 1, PlansCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlansCollection_Plans(), this.getPlan(), null, "plans", null, 0, -1, PlansCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlansCollection_Id(), ecorePackage.getEInt(), "id", null, 0, 1, PlansCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlansCollection_Version(), ecorePackage.getEInt(), "version", null, 0, 1, PlansCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getTask_Version(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getInputMessageMap_Version(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getPlan_Version(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getActionGroundingList_Version(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getActionGrounding_Version(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getTasksCollection_Version(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });		
		addAnnotation
		  (getPlansCollection_Version(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });
	}

} //TasksPackageImpl
