/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.tasks.impl;

import net.sf.ictalive.coordination.tasks.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TasksFactoryImpl extends EFactoryImpl implements TasksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TasksFactory init() {
		try {
			TasksFactory theTasksFactory = (TasksFactory)EPackage.Registry.INSTANCE.getEFactory("http://ict-alive.sourceforge.net/coordination/tasks"); 
			if (theTasksFactory != null) {
				return theTasksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TasksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TasksFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TasksPackage.TASK: return createTask();
			case TasksPackage.INPUT_MESSAGE_MAP: return createInputMessageMap();
			case TasksPackage.PLAN: return createPlan();
			case TasksPackage.ACTION_GROUNDING_LIST: return createActionGroundingList();
			case TasksPackage.ACTION_GROUNDING: return createActionGrounding();
			case TasksPackage.TASKS_COLLECTION: return createTasksCollection();
			case TasksPackage.PLANS_COLLECTION: return createPlansCollection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputMessageMap createInputMessageMap() {
		InputMessageMapImpl inputMessageMap = new InputMessageMapImpl();
		return inputMessageMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plan createPlan() {
		PlanImpl plan = new PlanImpl();
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGroundingList createActionGroundingList() {
		ActionGroundingListImpl actionGroundingList = new ActionGroundingListImpl();
		return actionGroundingList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGrounding createActionGrounding() {
		ActionGroundingImpl actionGrounding = new ActionGroundingImpl();
		return actionGrounding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TasksCollection createTasksCollection() {
		TasksCollectionImpl tasksCollection = new TasksCollectionImpl();
		return tasksCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlansCollection createPlansCollection() {
		PlansCollectionImpl plansCollection = new PlansCollectionImpl();
		return plansCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TasksPackage getTasksPackage() {
		return (TasksPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TasksPackage getPackage() {
		return TasksPackage.eINSTANCE;
	}

} //TasksFactoryImpl
