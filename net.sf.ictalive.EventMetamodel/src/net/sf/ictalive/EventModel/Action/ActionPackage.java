/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Action;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

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
 * @see net.sf.ictalive.EventModel.Action.ActionFactory
 * @model kind="package"
 * @generated
 */
public interface ActionPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Action";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://alive/architecture/actions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "action";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActionPackage eINSTANCE = net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Action.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Action.impl.ActionImpl
	 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 0;

	/**
	 * The feature id for the '<em><b>By Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__BY_ACTOR = 0;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CAUSE = 1;

	/**
	 * The feature id for the '<em><b>Enactment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ENACTMENT = 2;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__RESULT = 3;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INPUT = 4;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Action.impl.CommunicativeActionImpl <em>Communicative Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Action.impl.CommunicativeActionImpl
	 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getCommunicativeAction()
	 * @generated
	 */
	int COMMUNICATIVE_ACTION = 1;

	/**
	 * The number of structural features of the '<em>Communicative Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Action.impl.CoordinationActionImpl <em>Coordination Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Action.impl.CoordinationActionImpl
	 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getCoordinationAction()
	 * @generated
	 */
	int COORDINATION_ACTION = 2;

	/**
	 * The feature id for the '<em><b>By Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_ACTION__BY_ACTOR = ACTION__BY_ACTOR;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_ACTION__CAUSE = ACTION__CAUSE;

	/**
	 * The feature id for the '<em><b>Enactment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_ACTION__ENACTMENT = ACTION__ENACTMENT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_ACTION__RESULT = ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Coord Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_ACTION__COORD_ACTION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_ACTION__PLAN = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coordination Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Action.impl.PlanningActionsImpl <em>Planning Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Action.impl.PlanningActionsImpl
	 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getPlanningActions()
	 * @generated
	 */
	int PLANNING_ACTIONS = 12;

	/**
	 * The feature id for the '<em><b>By Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_ACTIONS__BY_ACTOR = ACTION__BY_ACTOR;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_ACTIONS__CAUSE = ACTION__CAUSE;

	/**
	 * The feature id for the '<em><b>Enactment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_ACTIONS__ENACTMENT = ACTION__ENACTMENT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_ACTIONS__RESULT = ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_ACTIONS__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_ACTIONS__PLAN = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Planning Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_ACTIONS_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Action.impl.PlanSynthesisImpl <em>Plan Synthesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Action.impl.PlanSynthesisImpl
	 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getPlanSynthesis()
	 * @generated
	 */
	int PLAN_SYNTHESIS = 3;

	/**
	 * The feature id for the '<em><b>By Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_SYNTHESIS__BY_ACTOR = PLANNING_ACTIONS__BY_ACTOR;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_SYNTHESIS__CAUSE = PLANNING_ACTIONS__CAUSE;

	/**
	 * The feature id for the '<em><b>Enactment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_SYNTHESIS__ENACTMENT = PLANNING_ACTIONS__ENACTMENT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_SYNTHESIS__RESULT = PLANNING_ACTIONS__RESULT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_SYNTHESIS__INPUT = PLANNING_ACTIONS__INPUT;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_SYNTHESIS__PLAN = PLANNING_ACTIONS__PLAN;

	/**
	 * The number of structural features of the '<em>Plan Synthesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_SYNTHESIS_FEATURE_COUNT = PLANNING_ACTIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Action.impl.PlanDistributionImpl <em>Plan Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Action.impl.PlanDistributionImpl
	 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getPlanDistribution()
	 * @generated
	 */
	int PLAN_DISTRIBUTION = 4;

	/**
	 * The feature id for the '<em><b>By Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_DISTRIBUTION__BY_ACTOR = PLANNING_ACTIONS__BY_ACTOR;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_DISTRIBUTION__CAUSE = PLANNING_ACTIONS__CAUSE;

	/**
	 * The feature id for the '<em><b>Enactment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_DISTRIBUTION__ENACTMENT = PLANNING_ACTIONS__ENACTMENT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_DISTRIBUTION__RESULT = PLANNING_ACTIONS__RESULT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_DISTRIBUTION__INPUT = PLANNING_ACTIONS__INPUT;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_DISTRIBUTION__PLAN = PLANNING_ACTIONS__PLAN;

	/**
	 * The number of structural features of the '<em>Plan Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_DISTRIBUTION_FEATURE_COUNT = PLANNING_ACTIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Action.impl.PlanScheduleImpl <em>Plan Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Action.impl.PlanScheduleImpl
	 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getPlanSchedule()
	 * @generated
	 */
	int PLAN_SCHEDULE = 5;

	/**
	 * The feature id for the '<em><b>By Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_SCHEDULE__BY_ACTOR = PLANNING_ACTIONS__BY_ACTOR;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_SCHEDULE__CAUSE = PLANNING_ACTIONS__CAUSE;

	/**
	 * The feature id for the '<em><b>Enactment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_SCHEDULE__ENACTMENT = PLANNING_ACTIONS__ENACTMENT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_SCHEDULE__RESULT = PLANNING_ACTIONS__RESULT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_SCHEDULE__INPUT = PLANNING_ACTIONS__INPUT;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_SCHEDULE__PLAN = PLANNING_ACTIONS__PLAN;

	/**
	 * The number of structural features of the '<em>Plan Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_SCHEDULE_FEATURE_COUNT = PLANNING_ACTIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Action.impl.PlanExecutionImpl <em>Plan Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Action.impl.PlanExecutionImpl
	 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getPlanExecution()
	 * @generated
	 */
	int PLAN_EXECUTION = 6;

	/**
	 * The feature id for the '<em><b>By Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_EXECUTION__BY_ACTOR = PLANNING_ACTIONS__BY_ACTOR;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_EXECUTION__CAUSE = PLANNING_ACTIONS__CAUSE;

	/**
	 * The feature id for the '<em><b>Enactment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_EXECUTION__ENACTMENT = PLANNING_ACTIONS__ENACTMENT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_EXECUTION__RESULT = PLANNING_ACTIONS__RESULT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_EXECUTION__INPUT = PLANNING_ACTIONS__INPUT;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_EXECUTION__PLAN = PLANNING_ACTIONS__PLAN;

	/**
	 * The number of structural features of the '<em>Plan Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_EXECUTION_FEATURE_COUNT = PLANNING_ACTIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Action.impl.ActionEnactmentImpl <em>Enactment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Action.impl.ActionEnactmentImpl
	 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getActionEnactment()
	 * @generated
	 */
	int ACTION_ENACTMENT = 7;

	/**
	 * The feature id for the '<em><b>By Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENACTMENT__BY_ACTOR = COORDINATION_ACTION__BY_ACTOR;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENACTMENT__CAUSE = COORDINATION_ACTION__CAUSE;

	/**
	 * The feature id for the '<em><b>Enactment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENACTMENT__ENACTMENT = COORDINATION_ACTION__ENACTMENT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENACTMENT__RESULT = COORDINATION_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENACTMENT__INPUT = COORDINATION_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Coord Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENACTMENT__COORD_ACTION = COORDINATION_ACTION__COORD_ACTION;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENACTMENT__PLAN = COORDINATION_ACTION__PLAN;

	/**
	 * The number of structural features of the '<em>Enactment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENACTMENT_FEATURE_COUNT = COORDINATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Action.impl.ServiceActionsImpl <em>Service Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Action.impl.ServiceActionsImpl
	 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getServiceActions()
	 * @generated
	 */
	int SERVICE_ACTIONS = 11;

	/**
	 * The feature id for the '<em><b>By Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTIONS__BY_ACTOR = ACTION__BY_ACTOR;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTIONS__CAUSE = ACTION__CAUSE;

	/**
	 * The feature id for the '<em><b>Enactment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTIONS__ENACTMENT = ACTION__ENACTMENT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTIONS__RESULT = ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTIONS__INPUT = ACTION__INPUT;

	/**
	 * The number of structural features of the '<em>Service Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTIONS_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Action.impl.ServiceInvocationImpl <em>Service Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Action.impl.ServiceInvocationImpl
	 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getServiceInvocation()
	 * @generated
	 */
	int SERVICE_INVOCATION = 8;

	/**
	 * The feature id for the '<em><b>By Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION__BY_ACTOR = SERVICE_ACTIONS__BY_ACTOR;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION__CAUSE = SERVICE_ACTIONS__CAUSE;

	/**
	 * The feature id for the '<em><b>Enactment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION__ENACTMENT = SERVICE_ACTIONS__ENACTMENT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION__RESULT = SERVICE_ACTIONS__RESULT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION__INPUT = SERVICE_ACTIONS__INPUT;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION__AGENT = SERVICE_ACTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION__SERVICE = SERVICE_ACTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION_FEATURE_COUNT = SERVICE_ACTIONS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Action.impl.FindServiceImpl <em>Find Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Action.impl.FindServiceImpl
	 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getFindService()
	 * @generated
	 */
	int FIND_SERVICE = 9;

	/**
	 * The feature id for the '<em><b>By Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_SERVICE__BY_ACTOR = SERVICE_ACTIONS__BY_ACTOR;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_SERVICE__CAUSE = SERVICE_ACTIONS__CAUSE;

	/**
	 * The feature id for the '<em><b>Enactment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_SERVICE__ENACTMENT = SERVICE_ACTIONS__ENACTMENT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_SERVICE__RESULT = SERVICE_ACTIONS__RESULT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_SERVICE__INPUT = SERVICE_ACTIONS__INPUT;

	/**
	 * The number of structural features of the '<em>Find Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_SERVICE_FEATURE_COUNT = SERVICE_ACTIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Action.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Action.impl.ResultImpl
	 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 10;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Action.impl.AgentActionImpl <em>Agent Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Action.impl.AgentActionImpl
	 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getAgentAction()
	 * @generated
	 */
	int AGENT_ACTION = 13;

	/**
	 * The feature id for the '<em><b>By Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ACTION__BY_ACTOR = ACTION__BY_ACTOR;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ACTION__CAUSE = ACTION__CAUSE;

	/**
	 * The feature id for the '<em><b>Enactment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ACTION__ENACTMENT = ACTION__ENACTMENT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ACTION__RESULT = ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The number of structural features of the '<em>Agent Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Action.impl.ReplaceAgentImpl <em>Replace Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Action.impl.ReplaceAgentImpl
	 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getReplaceAgent()
	 * @generated
	 */
	int REPLACE_AGENT = 14;

	/**
	 * The feature id for the '<em><b>By Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AGENT__BY_ACTOR = AGENT_ACTION__BY_ACTOR;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AGENT__CAUSE = AGENT_ACTION__CAUSE;

	/**
	 * The feature id for the '<em><b>Enactment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AGENT__ENACTMENT = AGENT_ACTION__ENACTMENT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AGENT__RESULT = AGENT_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AGENT__INPUT = AGENT_ACTION__INPUT;

	/**
	 * The number of structural features of the '<em>Replace Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AGENT_FEATURE_COUNT = AGENT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Action.impl.AgentReplanImpl <em>Agent Replan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Action.impl.AgentReplanImpl
	 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getAgentReplan()
	 * @generated
	 */
	int AGENT_REPLAN = 15;

	/**
	 * The feature id for the '<em><b>By Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_REPLAN__BY_ACTOR = AGENT_ACTION__BY_ACTOR;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_REPLAN__CAUSE = AGENT_ACTION__CAUSE;

	/**
	 * The feature id for the '<em><b>Enactment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_REPLAN__ENACTMENT = AGENT_ACTION__ENACTMENT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_REPLAN__RESULT = AGENT_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_REPLAN__INPUT = AGENT_ACTION__INPUT;

	/**
	 * The number of structural features of the '<em>Agent Replan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_REPLAN_FEATURE_COUNT = AGENT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Action.impl.NotifyStateOfWorldImpl <em>Notify State Of World</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Action.impl.NotifyStateOfWorldImpl
	 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getNotifyStateOfWorld()
	 * @generated
	 */
	int NOTIFY_STATE_OF_WORLD = 16;

	/**
	 * The feature id for the '<em><b>By Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_STATE_OF_WORLD__BY_ACTOR = AGENT_ACTION__BY_ACTOR;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_STATE_OF_WORLD__CAUSE = AGENT_ACTION__CAUSE;

	/**
	 * The feature id for the '<em><b>Enactment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_STATE_OF_WORLD__ENACTMENT = AGENT_ACTION__ENACTMENT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_STATE_OF_WORLD__RESULT = AGENT_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_STATE_OF_WORLD__INPUT = AGENT_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>State Of World</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_STATE_OF_WORLD__STATE_OF_WORLD = AGENT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Notify State Of World</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_STATE_OF_WORLD_FEATURE_COUNT = AGENT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Action.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Action.impl.ParameterImpl
	 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 17;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Action.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see net.sf.ictalive.EventModel.Action.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.EventModel.Action.Action#getByActor <em>By Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>By Actor</em>'.
	 * @see net.sf.ictalive.EventModel.Action.Action#getByActor()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ByActor();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.EventModel.Action.Action#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cause</em>'.
	 * @see net.sf.ictalive.EventModel.Action.Action#getCause()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Cause();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.EventModel.Action.Action#getEnactment <em>Enactment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enactment</em>'.
	 * @see net.sf.ictalive.EventModel.Action.Action#getEnactment()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Enactment();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.EventModel.Action.Action#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see net.sf.ictalive.EventModel.Action.Action#getResult()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Result();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.EventModel.Action.Action#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see net.sf.ictalive.EventModel.Action.Action#getInput()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Input();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Action.CommunicativeAction <em>Communicative Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communicative Action</em>'.
	 * @see net.sf.ictalive.EventModel.Action.CommunicativeAction
	 * @generated
	 */
	EClass getCommunicativeAction();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Action.CoordinationAction <em>Coordination Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Action</em>'.
	 * @see net.sf.ictalive.EventModel.Action.CoordinationAction
	 * @generated
	 */
	EClass getCoordinationAction();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.EventModel.Action.CoordinationAction#getCoordAction <em>Coord Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coord Action</em>'.
	 * @see net.sf.ictalive.EventModel.Action.CoordinationAction#getCoordAction()
	 * @see #getCoordinationAction()
	 * @generated
	 */
	EReference getCoordinationAction_CoordAction();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.EventModel.Action.CoordinationAction#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plan</em>'.
	 * @see net.sf.ictalive.EventModel.Action.CoordinationAction#getPlan()
	 * @see #getCoordinationAction()
	 * @generated
	 */
	EReference getCoordinationAction_Plan();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Action.PlanSynthesis <em>Plan Synthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Synthesis</em>'.
	 * @see net.sf.ictalive.EventModel.Action.PlanSynthesis
	 * @generated
	 */
	EClass getPlanSynthesis();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Action.PlanDistribution <em>Plan Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Distribution</em>'.
	 * @see net.sf.ictalive.EventModel.Action.PlanDistribution
	 * @generated
	 */
	EClass getPlanDistribution();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Action.PlanSchedule <em>Plan Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Schedule</em>'.
	 * @see net.sf.ictalive.EventModel.Action.PlanSchedule
	 * @generated
	 */
	EClass getPlanSchedule();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Action.PlanExecution <em>Plan Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Execution</em>'.
	 * @see net.sf.ictalive.EventModel.Action.PlanExecution
	 * @generated
	 */
	EClass getPlanExecution();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Action.ActionEnactment <em>Enactment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enactment</em>'.
	 * @see net.sf.ictalive.EventModel.Action.ActionEnactment
	 * @generated
	 */
	EClass getActionEnactment();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Action.ServiceInvocation <em>Service Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Invocation</em>'.
	 * @see net.sf.ictalive.EventModel.Action.ServiceInvocation
	 * @generated
	 */
	EClass getServiceInvocation();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.EventModel.Action.ServiceInvocation#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agent</em>'.
	 * @see net.sf.ictalive.EventModel.Action.ServiceInvocation#getAgent()
	 * @see #getServiceInvocation()
	 * @generated
	 */
	EReference getServiceInvocation_Agent();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.EventModel.Action.ServiceInvocation#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see net.sf.ictalive.EventModel.Action.ServiceInvocation#getService()
	 * @see #getServiceInvocation()
	 * @generated
	 */
	EReference getServiceInvocation_Service();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Action.FindService <em>Find Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Find Service</em>'.
	 * @see net.sf.ictalive.EventModel.Action.FindService
	 * @generated
	 */
	EClass getFindService();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Action.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see net.sf.ictalive.EventModel.Action.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Action.ServiceActions <em>Service Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Actions</em>'.
	 * @see net.sf.ictalive.EventModel.Action.ServiceActions
	 * @generated
	 */
	EClass getServiceActions();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Action.PlanningActions <em>Planning Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planning Actions</em>'.
	 * @see net.sf.ictalive.EventModel.Action.PlanningActions
	 * @generated
	 */
	EClass getPlanningActions();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.EventModel.Action.PlanningActions#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plan</em>'.
	 * @see net.sf.ictalive.EventModel.Action.PlanningActions#getPlan()
	 * @see #getPlanningActions()
	 * @generated
	 */
	EReference getPlanningActions_Plan();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Action.AgentAction <em>Agent Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Action</em>'.
	 * @see net.sf.ictalive.EventModel.Action.AgentAction
	 * @generated
	 */
	EClass getAgentAction();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Action.ReplaceAgent <em>Replace Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace Agent</em>'.
	 * @see net.sf.ictalive.EventModel.Action.ReplaceAgent
	 * @generated
	 */
	EClass getReplaceAgent();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Action.AgentReplan <em>Agent Replan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Replan</em>'.
	 * @see net.sf.ictalive.EventModel.Action.AgentReplan
	 * @generated
	 */
	EClass getAgentReplan();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Action.NotifyStateOfWorld <em>Notify State Of World</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notify State Of World</em>'.
	 * @see net.sf.ictalive.EventModel.Action.NotifyStateOfWorld
	 * @generated
	 */
	EClass getNotifyStateOfWorld();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.EventModel.Action.NotifyStateOfWorld#getStateOfWorld <em>State Of World</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Of World</em>'.
	 * @see net.sf.ictalive.EventModel.Action.NotifyStateOfWorld#getStateOfWorld()
	 * @see #getNotifyStateOfWorld()
	 * @generated
	 */
	EReference getNotifyStateOfWorld_StateOfWorld();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Action.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see net.sf.ictalive.EventModel.Action.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActionFactory getActionFactory();

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
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Action.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Action.impl.ActionImpl
		 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>By Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__BY_ACTOR = eINSTANCE.getAction_ByActor();

		/**
		 * The meta object literal for the '<em><b>Cause</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CAUSE = eINSTANCE.getAction_Cause();

		/**
		 * The meta object literal for the '<em><b>Enactment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ENACTMENT = eINSTANCE.getAction_Enactment();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__RESULT = eINSTANCE.getAction_Result();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__INPUT = eINSTANCE.getAction_Input();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Action.impl.CommunicativeActionImpl <em>Communicative Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Action.impl.CommunicativeActionImpl
		 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getCommunicativeAction()
		 * @generated
		 */
		EClass COMMUNICATIVE_ACTION = eINSTANCE.getCommunicativeAction();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Action.impl.CoordinationActionImpl <em>Coordination Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Action.impl.CoordinationActionImpl
		 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getCoordinationAction()
		 * @generated
		 */
		EClass COORDINATION_ACTION = eINSTANCE.getCoordinationAction();

		/**
		 * The meta object literal for the '<em><b>Coord Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_ACTION__COORD_ACTION = eINSTANCE.getCoordinationAction_CoordAction();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_ACTION__PLAN = eINSTANCE.getCoordinationAction_Plan();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Action.impl.PlanSynthesisImpl <em>Plan Synthesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Action.impl.PlanSynthesisImpl
		 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getPlanSynthesis()
		 * @generated
		 */
		EClass PLAN_SYNTHESIS = eINSTANCE.getPlanSynthesis();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Action.impl.PlanDistributionImpl <em>Plan Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Action.impl.PlanDistributionImpl
		 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getPlanDistribution()
		 * @generated
		 */
		EClass PLAN_DISTRIBUTION = eINSTANCE.getPlanDistribution();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Action.impl.PlanScheduleImpl <em>Plan Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Action.impl.PlanScheduleImpl
		 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getPlanSchedule()
		 * @generated
		 */
		EClass PLAN_SCHEDULE = eINSTANCE.getPlanSchedule();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Action.impl.PlanExecutionImpl <em>Plan Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Action.impl.PlanExecutionImpl
		 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getPlanExecution()
		 * @generated
		 */
		EClass PLAN_EXECUTION = eINSTANCE.getPlanExecution();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Action.impl.ActionEnactmentImpl <em>Enactment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Action.impl.ActionEnactmentImpl
		 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getActionEnactment()
		 * @generated
		 */
		EClass ACTION_ENACTMENT = eINSTANCE.getActionEnactment();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Action.impl.ServiceInvocationImpl <em>Service Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Action.impl.ServiceInvocationImpl
		 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getServiceInvocation()
		 * @generated
		 */
		EClass SERVICE_INVOCATION = eINSTANCE.getServiceInvocation();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INVOCATION__AGENT = eINSTANCE.getServiceInvocation_Agent();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INVOCATION__SERVICE = eINSTANCE.getServiceInvocation_Service();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Action.impl.FindServiceImpl <em>Find Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Action.impl.FindServiceImpl
		 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getFindService()
		 * @generated
		 */
		EClass FIND_SERVICE = eINSTANCE.getFindService();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Action.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Action.impl.ResultImpl
		 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Action.impl.ServiceActionsImpl <em>Service Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Action.impl.ServiceActionsImpl
		 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getServiceActions()
		 * @generated
		 */
		EClass SERVICE_ACTIONS = eINSTANCE.getServiceActions();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Action.impl.PlanningActionsImpl <em>Planning Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Action.impl.PlanningActionsImpl
		 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getPlanningActions()
		 * @generated
		 */
		EClass PLANNING_ACTIONS = eINSTANCE.getPlanningActions();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANNING_ACTIONS__PLAN = eINSTANCE.getPlanningActions_Plan();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Action.impl.AgentActionImpl <em>Agent Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Action.impl.AgentActionImpl
		 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getAgentAction()
		 * @generated
		 */
		EClass AGENT_ACTION = eINSTANCE.getAgentAction();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Action.impl.ReplaceAgentImpl <em>Replace Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Action.impl.ReplaceAgentImpl
		 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getReplaceAgent()
		 * @generated
		 */
		EClass REPLACE_AGENT = eINSTANCE.getReplaceAgent();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Action.impl.AgentReplanImpl <em>Agent Replan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Action.impl.AgentReplanImpl
		 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getAgentReplan()
		 * @generated
		 */
		EClass AGENT_REPLAN = eINSTANCE.getAgentReplan();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Action.impl.NotifyStateOfWorldImpl <em>Notify State Of World</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Action.impl.NotifyStateOfWorldImpl
		 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getNotifyStateOfWorld()
		 * @generated
		 */
		EClass NOTIFY_STATE_OF_WORLD = eINSTANCE.getNotifyStateOfWorld();

		/**
		 * The meta object literal for the '<em><b>State Of World</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFY_STATE_OF_WORLD__STATE_OF_WORLD = eINSTANCE.getNotifyStateOfWorld_StateOfWorld();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Action.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Action.impl.ParameterImpl
		 * @see net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

	}

} //ActionPackage
