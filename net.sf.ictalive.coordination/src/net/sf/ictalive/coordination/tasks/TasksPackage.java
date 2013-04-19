/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.tasks;

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
 * @see net.sf.ictalive.coordination.tasks.TasksFactory
 * @model kind="package"
 * @generated
 */
public interface TasksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tasks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ict-alive.sourceforge.net/coordination/tasks";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tasks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TasksPackage eINSTANCE = net.sf.ictalive.coordination.tasks.impl.TasksPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.tasks.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.tasks.impl.TaskImpl
	 * @see net.sf.ictalive.coordination.tasks.impl.TasksPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Has Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HAS_PRECONDITION = 1;

	/**
	 * The feature id for the '<em><b>Has Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HAS_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INPUT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__VERSION = 6;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.tasks.impl.InputMessageMapImpl <em>Input Message Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.tasks.impl.InputMessageMapImpl
	 * @see net.sf.ictalive.coordination.tasks.impl.TasksPackageImpl#getInputMessageMap()
	 * @generated
	 */
	int INPUT_MESSAGE_MAP = 1;

	/**
	 * The feature id for the '<em><b>Message Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MESSAGE_MAP__MESSAGE_PART = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MESSAGE_MAP__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MESSAGE_MAP__ID = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MESSAGE_MAP__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Input Message Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MESSAGE_MAP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.tasks.impl.PlanImpl <em>Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.tasks.impl.PlanImpl
	 * @see net.sf.ictalive.coordination.tasks.impl.TasksPackageImpl#getPlan()
	 * @generated
	 */
	int PLAN = 2;

	/**
	 * The feature id for the '<em><b>For Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__FOR_TASK = 0;

	/**
	 * The feature id for the '<em><b>Has Atomic Process Grounding List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__HAS_ATOMIC_PROCESS_GROUNDING_LIST = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__ID = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__NAME = 4;

	/**
	 * The number of structural features of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.tasks.impl.ActionGroundingListImpl <em>Action Grounding List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.tasks.impl.ActionGroundingListImpl
	 * @see net.sf.ictalive.coordination.tasks.impl.TasksPackageImpl#getActionGroundingList()
	 * @generated
	 */
	int ACTION_GROUNDING_LIST = 3;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUNDING_LIST__FIRST = 0;

	/**
	 * The feature id for the '<em><b>Rest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUNDING_LIST__REST = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUNDING_LIST__ID = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUNDING_LIST__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Action Grounding List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUNDING_LIST_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.tasks.impl.ActionGroundingImpl <em>Action Grounding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.tasks.impl.ActionGroundingImpl
	 * @see net.sf.ictalive.coordination.tasks.impl.TasksPackageImpl#getActionGrounding()
	 * @generated
	 */
	int ACTION_GROUNDING = 4;

	/**
	 * The feature id for the '<em><b>Owls Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUNDING__OWLS_PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUNDING__INPUT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUNDING__ID = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUNDING__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Action Grounding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUNDING_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.tasks.impl.TasksCollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.tasks.impl.TasksCollectionImpl
	 * @see net.sf.ictalive.coordination.tasks.impl.TasksPackageImpl#getTasksCollection()
	 * @generated
	 */
	int TASKS_COLLECTION = 5;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS_COLLECTION__NS = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS_COLLECTION__TASKS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS_COLLECTION__ID = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS_COLLECTION__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS_COLLECTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.tasks.impl.PlansCollectionImpl <em>Plans Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.tasks.impl.PlansCollectionImpl
	 * @see net.sf.ictalive.coordination.tasks.impl.TasksPackageImpl#getPlansCollection()
	 * @generated
	 */
	int PLANS_COLLECTION = 6;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANS_COLLECTION__NS = 0;

	/**
	 * The feature id for the '<em><b>Plans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANS_COLLECTION__PLANS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANS_COLLECTION__ID = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANS_COLLECTION__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Plans Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANS_COLLECTION_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.tasks.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see net.sf.ictalive.coordination.tasks.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.tasks.Task#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see net.sf.ictalive.coordination.tasks.Task#getComponents()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.tasks.Task#getHasPrecondition <em>Has Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Precondition</em>'.
	 * @see net.sf.ictalive.coordination.tasks.Task#getHasPrecondition()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_HasPrecondition();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.tasks.Task#getHasResult <em>Has Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Result</em>'.
	 * @see net.sf.ictalive.coordination.tasks.Task#getHasResult()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_HasResult();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.tasks.Task#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see net.sf.ictalive.coordination.tasks.Task#getInput()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Input();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.tasks.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.coordination.tasks.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.tasks.Task#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.ictalive.coordination.tasks.Task#getId()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.tasks.Task#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.ictalive.coordination.tasks.Task#getVersion()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Version();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.tasks.InputMessageMap <em>Input Message Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Message Map</em>'.
	 * @see net.sf.ictalive.coordination.tasks.InputMessageMap
	 * @generated
	 */
	EClass getInputMessageMap();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.tasks.InputMessageMap#getMessagePart <em>Message Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Part</em>'.
	 * @see net.sf.ictalive.coordination.tasks.InputMessageMap#getMessagePart()
	 * @see #getInputMessageMap()
	 * @generated
	 */
	EAttribute getInputMessageMap_MessagePart();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.tasks.InputMessageMap#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see net.sf.ictalive.coordination.tasks.InputMessageMap#getParameter()
	 * @see #getInputMessageMap()
	 * @generated
	 */
	EReference getInputMessageMap_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.tasks.InputMessageMap#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.ictalive.coordination.tasks.InputMessageMap#getId()
	 * @see #getInputMessageMap()
	 * @generated
	 */
	EAttribute getInputMessageMap_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.tasks.InputMessageMap#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.ictalive.coordination.tasks.InputMessageMap#getVersion()
	 * @see #getInputMessageMap()
	 * @generated
	 */
	EAttribute getInputMessageMap_Version();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.tasks.Plan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan</em>'.
	 * @see net.sf.ictalive.coordination.tasks.Plan
	 * @generated
	 */
	EClass getPlan();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.tasks.Plan#getForTask <em>For Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For Task</em>'.
	 * @see net.sf.ictalive.coordination.tasks.Plan#getForTask()
	 * @see #getPlan()
	 * @generated
	 */
	EReference getPlan_ForTask();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.coordination.tasks.Plan#getHasAtomicProcessGroundingList <em>Has Atomic Process Grounding List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Atomic Process Grounding List</em>'.
	 * @see net.sf.ictalive.coordination.tasks.Plan#getHasAtomicProcessGroundingList()
	 * @see #getPlan()
	 * @generated
	 */
	EReference getPlan_HasAtomicProcessGroundingList();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.tasks.Plan#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.ictalive.coordination.tasks.Plan#getId()
	 * @see #getPlan()
	 * @generated
	 */
	EAttribute getPlan_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.tasks.Plan#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.ictalive.coordination.tasks.Plan#getVersion()
	 * @see #getPlan()
	 * @generated
	 */
	EAttribute getPlan_Version();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.tasks.Plan#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.coordination.tasks.Plan#getName()
	 * @see #getPlan()
	 * @generated
	 */
	EAttribute getPlan_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.tasks.ActionGroundingList <em>Action Grounding List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Grounding List</em>'.
	 * @see net.sf.ictalive.coordination.tasks.ActionGroundingList
	 * @generated
	 */
	EClass getActionGroundingList();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.coordination.tasks.ActionGroundingList#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see net.sf.ictalive.coordination.tasks.ActionGroundingList#getFirst()
	 * @see #getActionGroundingList()
	 * @generated
	 */
	EReference getActionGroundingList_First();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.coordination.tasks.ActionGroundingList#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rest</em>'.
	 * @see net.sf.ictalive.coordination.tasks.ActionGroundingList#getRest()
	 * @see #getActionGroundingList()
	 * @generated
	 */
	EReference getActionGroundingList_Rest();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.tasks.ActionGroundingList#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.ictalive.coordination.tasks.ActionGroundingList#getId()
	 * @see #getActionGroundingList()
	 * @generated
	 */
	EAttribute getActionGroundingList_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.tasks.ActionGroundingList#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.ictalive.coordination.tasks.ActionGroundingList#getVersion()
	 * @see #getActionGroundingList()
	 * @generated
	 */
	EAttribute getActionGroundingList_Version();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.tasks.ActionGrounding <em>Action Grounding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Grounding</em>'.
	 * @see net.sf.ictalive.coordination.tasks.ActionGrounding
	 * @generated
	 */
	EClass getActionGrounding();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.tasks.ActionGrounding#getOwlsProcess <em>Owls Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owls Process</em>'.
	 * @see net.sf.ictalive.coordination.tasks.ActionGrounding#getOwlsProcess()
	 * @see #getActionGrounding()
	 * @generated
	 */
	EReference getActionGrounding_OwlsProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.tasks.ActionGrounding#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see net.sf.ictalive.coordination.tasks.ActionGrounding#getInput()
	 * @see #getActionGrounding()
	 * @generated
	 */
	EReference getActionGrounding_Input();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.tasks.ActionGrounding#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.ictalive.coordination.tasks.ActionGrounding#getId()
	 * @see #getActionGrounding()
	 * @generated
	 */
	EAttribute getActionGrounding_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.tasks.ActionGrounding#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.ictalive.coordination.tasks.ActionGrounding#getVersion()
	 * @see #getActionGrounding()
	 * @generated
	 */
	EAttribute getActionGrounding_Version();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.tasks.TasksCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see net.sf.ictalive.coordination.tasks.TasksCollection
	 * @generated
	 */
	EClass getTasksCollection();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.tasks.TasksCollection#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see net.sf.ictalive.coordination.tasks.TasksCollection#getNs()
	 * @see #getTasksCollection()
	 * @generated
	 */
	EAttribute getTasksCollection_Ns();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.tasks.TasksCollection#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see net.sf.ictalive.coordination.tasks.TasksCollection#getTasks()
	 * @see #getTasksCollection()
	 * @generated
	 */
	EReference getTasksCollection_Tasks();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.tasks.TasksCollection#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.ictalive.coordination.tasks.TasksCollection#getId()
	 * @see #getTasksCollection()
	 * @generated
	 */
	EAttribute getTasksCollection_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.tasks.TasksCollection#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.ictalive.coordination.tasks.TasksCollection#getVersion()
	 * @see #getTasksCollection()
	 * @generated
	 */
	EAttribute getTasksCollection_Version();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.tasks.PlansCollection <em>Plans Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plans Collection</em>'.
	 * @see net.sf.ictalive.coordination.tasks.PlansCollection
	 * @generated
	 */
	EClass getPlansCollection();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.tasks.PlansCollection#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see net.sf.ictalive.coordination.tasks.PlansCollection#getNs()
	 * @see #getPlansCollection()
	 * @generated
	 */
	EAttribute getPlansCollection_Ns();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.tasks.PlansCollection#getPlans <em>Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plans</em>'.
	 * @see net.sf.ictalive.coordination.tasks.PlansCollection#getPlans()
	 * @see #getPlansCollection()
	 * @generated
	 */
	EReference getPlansCollection_Plans();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.tasks.PlansCollection#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.ictalive.coordination.tasks.PlansCollection#getId()
	 * @see #getPlansCollection()
	 * @generated
	 */
	EAttribute getPlansCollection_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.tasks.PlansCollection#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.ictalive.coordination.tasks.PlansCollection#getVersion()
	 * @see #getPlansCollection()
	 * @generated
	 */
	EAttribute getPlansCollection_Version();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TasksFactory getTasksFactory();

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
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.tasks.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.tasks.impl.TaskImpl
		 * @see net.sf.ictalive.coordination.tasks.impl.TasksPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__COMPONENTS = eINSTANCE.getTask_Components();

		/**
		 * The meta object literal for the '<em><b>Has Precondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__HAS_PRECONDITION = eINSTANCE.getTask_HasPrecondition();

		/**
		 * The meta object literal for the '<em><b>Has Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__HAS_RESULT = eINSTANCE.getTask_HasResult();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INPUT = eINSTANCE.getTask_Input();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ID = eINSTANCE.getTask_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__VERSION = eINSTANCE.getTask_Version();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.tasks.impl.InputMessageMapImpl <em>Input Message Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.tasks.impl.InputMessageMapImpl
		 * @see net.sf.ictalive.coordination.tasks.impl.TasksPackageImpl#getInputMessageMap()
		 * @generated
		 */
		EClass INPUT_MESSAGE_MAP = eINSTANCE.getInputMessageMap();

		/**
		 * The meta object literal for the '<em><b>Message Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_MESSAGE_MAP__MESSAGE_PART = eINSTANCE.getInputMessageMap_MessagePart();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_MESSAGE_MAP__PARAMETER = eINSTANCE.getInputMessageMap_Parameter();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_MESSAGE_MAP__ID = eINSTANCE.getInputMessageMap_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_MESSAGE_MAP__VERSION = eINSTANCE.getInputMessageMap_Version();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.tasks.impl.PlanImpl <em>Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.tasks.impl.PlanImpl
		 * @see net.sf.ictalive.coordination.tasks.impl.TasksPackageImpl#getPlan()
		 * @generated
		 */
		EClass PLAN = eINSTANCE.getPlan();

		/**
		 * The meta object literal for the '<em><b>For Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN__FOR_TASK = eINSTANCE.getPlan_ForTask();

		/**
		 * The meta object literal for the '<em><b>Has Atomic Process Grounding List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN__HAS_ATOMIC_PROCESS_GROUNDING_LIST = eINSTANCE.getPlan_HasAtomicProcessGroundingList();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN__ID = eINSTANCE.getPlan_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN__VERSION = eINSTANCE.getPlan_Version();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN__NAME = eINSTANCE.getPlan_Name();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.tasks.impl.ActionGroundingListImpl <em>Action Grounding List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.tasks.impl.ActionGroundingListImpl
		 * @see net.sf.ictalive.coordination.tasks.impl.TasksPackageImpl#getActionGroundingList()
		 * @generated
		 */
		EClass ACTION_GROUNDING_LIST = eINSTANCE.getActionGroundingList();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_GROUNDING_LIST__FIRST = eINSTANCE.getActionGroundingList_First();

		/**
		 * The meta object literal for the '<em><b>Rest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_GROUNDING_LIST__REST = eINSTANCE.getActionGroundingList_Rest();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_GROUNDING_LIST__ID = eINSTANCE.getActionGroundingList_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_GROUNDING_LIST__VERSION = eINSTANCE.getActionGroundingList_Version();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.tasks.impl.ActionGroundingImpl <em>Action Grounding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.tasks.impl.ActionGroundingImpl
		 * @see net.sf.ictalive.coordination.tasks.impl.TasksPackageImpl#getActionGrounding()
		 * @generated
		 */
		EClass ACTION_GROUNDING = eINSTANCE.getActionGrounding();

		/**
		 * The meta object literal for the '<em><b>Owls Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_GROUNDING__OWLS_PROCESS = eINSTANCE.getActionGrounding_OwlsProcess();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_GROUNDING__INPUT = eINSTANCE.getActionGrounding_Input();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_GROUNDING__ID = eINSTANCE.getActionGrounding_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_GROUNDING__VERSION = eINSTANCE.getActionGrounding_Version();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.tasks.impl.TasksCollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.tasks.impl.TasksCollectionImpl
		 * @see net.sf.ictalive.coordination.tasks.impl.TasksPackageImpl#getTasksCollection()
		 * @generated
		 */
		EClass TASKS_COLLECTION = eINSTANCE.getTasksCollection();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASKS_COLLECTION__NS = eINSTANCE.getTasksCollection_Ns();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKS_COLLECTION__TASKS = eINSTANCE.getTasksCollection_Tasks();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASKS_COLLECTION__ID = eINSTANCE.getTasksCollection_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASKS_COLLECTION__VERSION = eINSTANCE.getTasksCollection_Version();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.tasks.impl.PlansCollectionImpl <em>Plans Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.tasks.impl.PlansCollectionImpl
		 * @see net.sf.ictalive.coordination.tasks.impl.TasksPackageImpl#getPlansCollection()
		 * @generated
		 */
		EClass PLANS_COLLECTION = eINSTANCE.getPlansCollection();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANS_COLLECTION__NS = eINSTANCE.getPlansCollection_Ns();

		/**
		 * The meta object literal for the '<em><b>Plans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANS_COLLECTION__PLANS = eINSTANCE.getPlansCollection_Plans();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANS_COLLECTION__ID = eINSTANCE.getPlansCollection_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANS_COLLECTION__VERSION = eINSTANCE.getPlansCollection_Version();

	}

} //TasksPackage
