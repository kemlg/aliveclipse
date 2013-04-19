/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see net.sf.ictalive.runtime.action.ActionFactory
 * @model kind="package"
 * @generated
 */
public interface ActionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "action";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ict-alive.sourceforge.net/RunTime/actions";

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
	ActionPackage eINSTANCE = net.sf.ictalive.runtime.action.impl.ActionPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.action.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.action.impl.ActionImpl
	 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getAction()
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
	 * The feature id for the '<em><b>Enactment</b></em>' reference list.
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
	 * The meta object id for the '{@link net.sf.ictalive.runtime.action.impl.CommunicativeActionImpl <em>Communicative Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.action.impl.CommunicativeActionImpl
	 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getCommunicativeAction()
	 * @generated
	 */
	int COMMUNICATIVE_ACTION = 1;

	/**
	 * The feature id for the '<em><b>By Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_ACTION__BY_ACTOR = ACTION__BY_ACTOR;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_ACTION__CAUSE = ACTION__CAUSE;

	/**
	 * The feature id for the '<em><b>Enactment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_ACTION__ENACTMENT = ACTION__ENACTMENT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_ACTION__RESULT = ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The number of structural features of the '<em>Communicative Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.action.impl.CoordinationActionImpl <em>Coordination Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.action.impl.CoordinationActionImpl
	 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getCoordinationAction()
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
	 * The feature id for the '<em><b>Enactment</b></em>' reference list.
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
	 * The feature id for the '<em><b>Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_ACTION__PLAN = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coord Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_ACTION__COORD_ACTION = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coordination Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.action.impl.PlanningActionsImpl <em>Planning Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.action.impl.PlanningActionsImpl
	 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getPlanningActions()
	 * @generated
	 */
	int PLANNING_ACTIONS = 10;

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
	 * The feature id for the '<em><b>Enactment</b></em>' reference list.
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
	 * The meta object id for the '{@link net.sf.ictalive.runtime.action.impl.PlanSynthesisImpl <em>Plan Synthesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.action.impl.PlanSynthesisImpl
	 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getPlanSynthesis()
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
	 * The feature id for the '<em><b>Enactment</b></em>' reference list.
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
	 * The meta object id for the '{@link net.sf.ictalive.runtime.action.impl.PlanDistributionImpl <em>Plan Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.action.impl.PlanDistributionImpl
	 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getPlanDistribution()
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
	 * The feature id for the '<em><b>Enactment</b></em>' reference list.
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
	 * The meta object id for the '{@link net.sf.ictalive.runtime.action.impl.PlanScheduleImpl <em>Plan Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.action.impl.PlanScheduleImpl
	 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getPlanSchedule()
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
	 * The feature id for the '<em><b>Enactment</b></em>' reference list.
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
	 * The meta object id for the '{@link net.sf.ictalive.runtime.action.impl.PlanExecutionImpl <em>Plan Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.action.impl.PlanExecutionImpl
	 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getPlanExecution()
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
	 * The feature id for the '<em><b>Enactment</b></em>' reference list.
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
	 * The meta object id for the '{@link net.sf.ictalive.runtime.action.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.action.impl.ResultImpl
	 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 7;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.action.impl.ServiceInvocationImpl <em>Service Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.action.impl.ServiceInvocationImpl
	 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getServiceInvocation()
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
	int SERVICE_INVOCATION__BY_ACTOR = ACTION__BY_ACTOR;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION__CAUSE = ACTION__CAUSE;

	/**
	 * The feature id for the '<em><b>Enactment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION__ENACTMENT = ACTION__ENACTMENT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION__RESULT = ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Service URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION__SERVICE_URI = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enacting Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION__ENACTING_AGENT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Correlated Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION__CORRELATED_ACTION = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.action.impl.MatchmakerResponseImpl <em>Matchmaker Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.action.impl.MatchmakerResponseImpl
	 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getMatchmakerResponse()
	 * @generated
	 */
	int MATCHMAKER_RESPONSE = 9;

	/**
	 * The feature id for the '<em><b>By Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHMAKER_RESPONSE__BY_ACTOR = ACTION__BY_ACTOR;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHMAKER_RESPONSE__CAUSE = ACTION__CAUSE;

	/**
	 * The feature id for the '<em><b>Enactment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHMAKER_RESPONSE__ENACTMENT = ACTION__ENACTMENT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHMAKER_RESPONSE__RESULT = ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHMAKER_RESPONSE__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Query Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHMAKER_RESPONSE__QUERY_RESULT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHMAKER_RESPONSE__QUERY = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Matchmaker Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHMAKER_RESPONSE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.action.impl.AgentActionImpl <em>Agent Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.action.impl.AgentActionImpl
	 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getAgentAction()
	 * @generated
	 */
	int AGENT_ACTION = 11;

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
	 * The feature id for the '<em><b>Enactment</b></em>' reference list.
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
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ACTION__AGENT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Agent Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.action.impl.ReplaceAgentImpl <em>Replace Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.action.impl.ReplaceAgentImpl
	 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getReplaceAgent()
	 * @generated
	 */
	int REPLACE_AGENT = 12;

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
	 * The feature id for the '<em><b>Enactment</b></em>' reference list.
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
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AGENT__AGENT = AGENT_ACTION__AGENT;

	/**
	 * The number of structural features of the '<em>Replace Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AGENT_FEATURE_COUNT = AGENT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.action.impl.AgentReplanImpl <em>Agent Replan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.action.impl.AgentReplanImpl
	 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getAgentReplan()
	 * @generated
	 */
	int AGENT_REPLAN = 13;

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
	 * The feature id for the '<em><b>Enactment</b></em>' reference list.
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
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_REPLAN__AGENT = AGENT_ACTION__AGENT;

	/**
	 * The feature id for the '<em><b>Failed Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_REPLAN__FAILED_PLAN = AGENT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Agent Replan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_REPLAN_FEATURE_COUNT = AGENT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.action.impl.NotifyStateOfWorldImpl <em>Notify State Of World</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.action.impl.NotifyStateOfWorldImpl
	 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getNotifyStateOfWorld()
	 * @generated
	 */
	int NOTIFY_STATE_OF_WORLD = 14;

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
	 * The feature id for the '<em><b>Enactment</b></em>' reference list.
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
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_STATE_OF_WORLD__AGENT = AGENT_ACTION__AGENT;

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
	 * The meta object id for the '{@link net.sf.ictalive.runtime.action.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.action.impl.ParameterImpl
	 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 15;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.action.impl.StateOfWorldImpl <em>State Of World</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.action.impl.StateOfWorldImpl
	 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getStateOfWorld()
	 * @generated
	 */
	int STATE_OF_WORLD = 16;

	/**
	 * The feature id for the '<em><b>Partial State Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OF_WORLD__PARTIAL_STATE_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OF_WORLD__ATOM = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OF_WORLD__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>State Of World</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OF_WORLD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.action.impl.MatchmakerQueryImpl <em>Matchmaker Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.action.impl.MatchmakerQueryImpl
	 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getMatchmakerQuery()
	 * @generated
	 */
	int MATCHMAKER_QUERY = 17;

	/**
	 * The feature id for the '<em><b>By Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHMAKER_QUERY__BY_ACTOR = ACTION__BY_ACTOR;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHMAKER_QUERY__CAUSE = ACTION__CAUSE;

	/**
	 * The feature id for the '<em><b>Enactment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHMAKER_QUERY__ENACTMENT = ACTION__ENACTMENT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHMAKER_QUERY__RESULT = ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHMAKER_QUERY__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHMAKER_QUERY__QUERY = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Matchmaker Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHMAKER_QUERY_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.runtime.action.impl.MatchmakerResultImpl <em>Matchmaker Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.runtime.action.impl.MatchmakerResultImpl
	 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getMatchmakerResult()
	 * @generated
	 */
	int MATCHMAKER_RESULT = 18;

	/**
	 * The feature id for the '<em><b>Service URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHMAKER_RESULT__SERVICE_URI = 0;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHMAKER_RESULT__RELIABILITY = 1;

	/**
	 * The feature id for the '<em><b>Performance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHMAKER_RESULT__PERFORMANCE = 2;

	/**
	 * The number of structural features of the '<em>Matchmaker Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHMAKER_RESULT_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.action.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see net.sf.ictalive.runtime.action.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.action.Action#getByActor <em>By Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>By Actor</em>'.
	 * @see net.sf.ictalive.runtime.action.Action#getByActor()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ByActor();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.action.Action#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cause</em>'.
	 * @see net.sf.ictalive.runtime.action.Action#getCause()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Cause();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.runtime.action.Action#getEnactment <em>Enactment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enactment</em>'.
	 * @see net.sf.ictalive.runtime.action.Action#getEnactment()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Enactment();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.runtime.action.Action#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see net.sf.ictalive.runtime.action.Action#getResult()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Result();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.runtime.action.Action#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see net.sf.ictalive.runtime.action.Action#getInput()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Input();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.action.CommunicativeAction <em>Communicative Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communicative Action</em>'.
	 * @see net.sf.ictalive.runtime.action.CommunicativeAction
	 * @generated
	 */
	EClass getCommunicativeAction();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.action.CoordinationAction <em>Coordination Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Action</em>'.
	 * @see net.sf.ictalive.runtime.action.CoordinationAction
	 * @generated
	 */
	EClass getCoordinationAction();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.action.CoordinationAction#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plan</em>'.
	 * @see net.sf.ictalive.runtime.action.CoordinationAction#getPlan()
	 * @see #getCoordinationAction()
	 * @generated
	 */
	EReference getCoordinationAction_Plan();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.action.CoordinationAction#getCoordAction <em>Coord Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coord Action</em>'.
	 * @see net.sf.ictalive.runtime.action.CoordinationAction#getCoordAction()
	 * @see #getCoordinationAction()
	 * @generated
	 */
	EReference getCoordinationAction_CoordAction();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.action.PlanSynthesis <em>Plan Synthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Synthesis</em>'.
	 * @see net.sf.ictalive.runtime.action.PlanSynthesis
	 * @generated
	 */
	EClass getPlanSynthesis();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.action.PlanDistribution <em>Plan Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Distribution</em>'.
	 * @see net.sf.ictalive.runtime.action.PlanDistribution
	 * @generated
	 */
	EClass getPlanDistribution();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.action.PlanSchedule <em>Plan Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Schedule</em>'.
	 * @see net.sf.ictalive.runtime.action.PlanSchedule
	 * @generated
	 */
	EClass getPlanSchedule();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.action.PlanExecution <em>Plan Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Execution</em>'.
	 * @see net.sf.ictalive.runtime.action.PlanExecution
	 * @generated
	 */
	EClass getPlanExecution();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.action.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see net.sf.ictalive.runtime.action.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.action.ServiceInvocation <em>Service Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Invocation</em>'.
	 * @see net.sf.ictalive.runtime.action.ServiceInvocation
	 * @generated
	 */
	EClass getServiceInvocation();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.action.ServiceInvocation#getServiceURI <em>Service URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service URI</em>'.
	 * @see net.sf.ictalive.runtime.action.ServiceInvocation#getServiceURI()
	 * @see #getServiceInvocation()
	 * @generated
	 */
	EAttribute getServiceInvocation_ServiceURI();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.action.ServiceInvocation#getEnactingAgent <em>Enacting Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enacting Agent</em>'.
	 * @see net.sf.ictalive.runtime.action.ServiceInvocation#getEnactingAgent()
	 * @see #getServiceInvocation()
	 * @generated
	 */
	EReference getServiceInvocation_EnactingAgent();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.action.ServiceInvocation#getCorrelatedAction <em>Correlated Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Correlated Action</em>'.
	 * @see net.sf.ictalive.runtime.action.ServiceInvocation#getCorrelatedAction()
	 * @see #getServiceInvocation()
	 * @generated
	 */
	EReference getServiceInvocation_CorrelatedAction();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.action.MatchmakerResponse <em>Matchmaker Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matchmaker Response</em>'.
	 * @see net.sf.ictalive.runtime.action.MatchmakerResponse
	 * @generated
	 */
	EClass getMatchmakerResponse();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.runtime.action.MatchmakerResponse#getQueryResult <em>Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query Result</em>'.
	 * @see net.sf.ictalive.runtime.action.MatchmakerResponse#getQueryResult()
	 * @see #getMatchmakerResponse()
	 * @generated
	 */
	EReference getMatchmakerResponse_QueryResult();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.action.MatchmakerResponse#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Query</em>'.
	 * @see net.sf.ictalive.runtime.action.MatchmakerResponse#getQuery()
	 * @see #getMatchmakerResponse()
	 * @generated
	 */
	EReference getMatchmakerResponse_Query();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.action.PlanningActions <em>Planning Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planning Actions</em>'.
	 * @see net.sf.ictalive.runtime.action.PlanningActions
	 * @generated
	 */
	EClass getPlanningActions();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.action.PlanningActions#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plan</em>'.
	 * @see net.sf.ictalive.runtime.action.PlanningActions#getPlan()
	 * @see #getPlanningActions()
	 * @generated
	 */
	EReference getPlanningActions_Plan();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.action.AgentAction <em>Agent Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Action</em>'.
	 * @see net.sf.ictalive.runtime.action.AgentAction
	 * @generated
	 */
	EClass getAgentAction();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.action.AgentAction#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agent</em>'.
	 * @see net.sf.ictalive.runtime.action.AgentAction#getAgent()
	 * @see #getAgentAction()
	 * @generated
	 */
	EReference getAgentAction_Agent();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.action.ReplaceAgent <em>Replace Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace Agent</em>'.
	 * @see net.sf.ictalive.runtime.action.ReplaceAgent
	 * @generated
	 */
	EClass getReplaceAgent();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.action.AgentReplan <em>Agent Replan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Replan</em>'.
	 * @see net.sf.ictalive.runtime.action.AgentReplan
	 * @generated
	 */
	EClass getAgentReplan();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.action.AgentReplan#getFailedPlan <em>Failed Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failed Plan</em>'.
	 * @see net.sf.ictalive.runtime.action.AgentReplan#getFailedPlan()
	 * @see #getAgentReplan()
	 * @generated
	 */
	EReference getAgentReplan_FailedPlan();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.action.NotifyStateOfWorld <em>Notify State Of World</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notify State Of World</em>'.
	 * @see net.sf.ictalive.runtime.action.NotifyStateOfWorld
	 * @generated
	 */
	EClass getNotifyStateOfWorld();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.runtime.action.NotifyStateOfWorld#getStateOfWorld <em>State Of World</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Of World</em>'.
	 * @see net.sf.ictalive.runtime.action.NotifyStateOfWorld#getStateOfWorld()
	 * @see #getNotifyStateOfWorld()
	 * @generated
	 */
	EReference getNotifyStateOfWorld_StateOfWorld();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.action.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see net.sf.ictalive.runtime.action.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.action.StateOfWorld <em>State Of World</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Of World</em>'.
	 * @see net.sf.ictalive.runtime.action.StateOfWorld
	 * @generated
	 */
	EClass getStateOfWorld();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.action.StateOfWorld#getPartialStateDescription <em>Partial State Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partial State Description</em>'.
	 * @see net.sf.ictalive.runtime.action.StateOfWorld#getPartialStateDescription()
	 * @see #getStateOfWorld()
	 * @generated
	 */
	EReference getStateOfWorld_PartialStateDescription();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.runtime.action.StateOfWorld#getAtom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atom</em>'.
	 * @see net.sf.ictalive.runtime.action.StateOfWorld#getAtom()
	 * @see #getStateOfWorld()
	 * @generated
	 */
	EReference getStateOfWorld_Atom();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.action.StateOfWorld#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.sf.ictalive.runtime.action.StateOfWorld#getDescription()
	 * @see #getStateOfWorld()
	 * @generated
	 */
	EAttribute getStateOfWorld_Description();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.action.MatchmakerQuery <em>Matchmaker Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matchmaker Query</em>'.
	 * @see net.sf.ictalive.runtime.action.MatchmakerQuery
	 * @generated
	 */
	EClass getMatchmakerQuery();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.action.MatchmakerQuery#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see net.sf.ictalive.runtime.action.MatchmakerQuery#getQuery()
	 * @see #getMatchmakerQuery()
	 * @generated
	 */
	EAttribute getMatchmakerQuery_Query();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.runtime.action.MatchmakerResult <em>Matchmaker Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matchmaker Result</em>'.
	 * @see net.sf.ictalive.runtime.action.MatchmakerResult
	 * @generated
	 */
	EClass getMatchmakerResult();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.action.MatchmakerResult#getServiceURI <em>Service URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service URI</em>'.
	 * @see net.sf.ictalive.runtime.action.MatchmakerResult#getServiceURI()
	 * @see #getMatchmakerResult()
	 * @generated
	 */
	EAttribute getMatchmakerResult_ServiceURI();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.action.MatchmakerResult#getReliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reliability</em>'.
	 * @see net.sf.ictalive.runtime.action.MatchmakerResult#getReliability()
	 * @see #getMatchmakerResult()
	 * @generated
	 */
	EAttribute getMatchmakerResult_Reliability();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.runtime.action.MatchmakerResult#getPerformance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performance</em>'.
	 * @see net.sf.ictalive.runtime.action.MatchmakerResult#getPerformance()
	 * @see #getMatchmakerResult()
	 * @generated
	 */
	EAttribute getMatchmakerResult_Performance();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.action.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.action.impl.ActionImpl
		 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getAction()
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
		 * The meta object literal for the '<em><b>Enactment</b></em>' reference list feature.
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
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.action.impl.CommunicativeActionImpl <em>Communicative Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.action.impl.CommunicativeActionImpl
		 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getCommunicativeAction()
		 * @generated
		 */
		EClass COMMUNICATIVE_ACTION = eINSTANCE.getCommunicativeAction();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.action.impl.CoordinationActionImpl <em>Coordination Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.action.impl.CoordinationActionImpl
		 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getCoordinationAction()
		 * @generated
		 */
		EClass COORDINATION_ACTION = eINSTANCE.getCoordinationAction();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_ACTION__PLAN = eINSTANCE.getCoordinationAction_Plan();

		/**
		 * The meta object literal for the '<em><b>Coord Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_ACTION__COORD_ACTION = eINSTANCE.getCoordinationAction_CoordAction();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.action.impl.PlanSynthesisImpl <em>Plan Synthesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.action.impl.PlanSynthesisImpl
		 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getPlanSynthesis()
		 * @generated
		 */
		EClass PLAN_SYNTHESIS = eINSTANCE.getPlanSynthesis();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.action.impl.PlanDistributionImpl <em>Plan Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.action.impl.PlanDistributionImpl
		 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getPlanDistribution()
		 * @generated
		 */
		EClass PLAN_DISTRIBUTION = eINSTANCE.getPlanDistribution();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.action.impl.PlanScheduleImpl <em>Plan Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.action.impl.PlanScheduleImpl
		 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getPlanSchedule()
		 * @generated
		 */
		EClass PLAN_SCHEDULE = eINSTANCE.getPlanSchedule();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.action.impl.PlanExecutionImpl <em>Plan Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.action.impl.PlanExecutionImpl
		 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getPlanExecution()
		 * @generated
		 */
		EClass PLAN_EXECUTION = eINSTANCE.getPlanExecution();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.action.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.action.impl.ResultImpl
		 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.action.impl.ServiceInvocationImpl <em>Service Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.action.impl.ServiceInvocationImpl
		 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getServiceInvocation()
		 * @generated
		 */
		EClass SERVICE_INVOCATION = eINSTANCE.getServiceInvocation();

		/**
		 * The meta object literal for the '<em><b>Service URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INVOCATION__SERVICE_URI = eINSTANCE.getServiceInvocation_ServiceURI();

		/**
		 * The meta object literal for the '<em><b>Enacting Agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INVOCATION__ENACTING_AGENT = eINSTANCE.getServiceInvocation_EnactingAgent();

		/**
		 * The meta object literal for the '<em><b>Correlated Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INVOCATION__CORRELATED_ACTION = eINSTANCE.getServiceInvocation_CorrelatedAction();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.action.impl.MatchmakerResponseImpl <em>Matchmaker Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.action.impl.MatchmakerResponseImpl
		 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getMatchmakerResponse()
		 * @generated
		 */
		EClass MATCHMAKER_RESPONSE = eINSTANCE.getMatchmakerResponse();

		/**
		 * The meta object literal for the '<em><b>Query Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHMAKER_RESPONSE__QUERY_RESULT = eINSTANCE.getMatchmakerResponse_QueryResult();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHMAKER_RESPONSE__QUERY = eINSTANCE.getMatchmakerResponse_Query();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.action.impl.PlanningActionsImpl <em>Planning Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.action.impl.PlanningActionsImpl
		 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getPlanningActions()
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
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.action.impl.AgentActionImpl <em>Agent Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.action.impl.AgentActionImpl
		 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getAgentAction()
		 * @generated
		 */
		EClass AGENT_ACTION = eINSTANCE.getAgentAction();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_ACTION__AGENT = eINSTANCE.getAgentAction_Agent();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.action.impl.ReplaceAgentImpl <em>Replace Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.action.impl.ReplaceAgentImpl
		 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getReplaceAgent()
		 * @generated
		 */
		EClass REPLACE_AGENT = eINSTANCE.getReplaceAgent();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.action.impl.AgentReplanImpl <em>Agent Replan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.action.impl.AgentReplanImpl
		 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getAgentReplan()
		 * @generated
		 */
		EClass AGENT_REPLAN = eINSTANCE.getAgentReplan();

		/**
		 * The meta object literal for the '<em><b>Failed Plan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_REPLAN__FAILED_PLAN = eINSTANCE.getAgentReplan_FailedPlan();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.action.impl.NotifyStateOfWorldImpl <em>Notify State Of World</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.action.impl.NotifyStateOfWorldImpl
		 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getNotifyStateOfWorld()
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
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.action.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.action.impl.ParameterImpl
		 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.action.impl.StateOfWorldImpl <em>State Of World</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.action.impl.StateOfWorldImpl
		 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getStateOfWorld()
		 * @generated
		 */
		EClass STATE_OF_WORLD = eINSTANCE.getStateOfWorld();

		/**
		 * The meta object literal for the '<em><b>Partial State Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_OF_WORLD__PARTIAL_STATE_DESCRIPTION = eINSTANCE.getStateOfWorld_PartialStateDescription();

		/**
		 * The meta object literal for the '<em><b>Atom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_OF_WORLD__ATOM = eINSTANCE.getStateOfWorld_Atom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_OF_WORLD__DESCRIPTION = eINSTANCE.getStateOfWorld_Description();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.action.impl.MatchmakerQueryImpl <em>Matchmaker Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.action.impl.MatchmakerQueryImpl
		 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getMatchmakerQuery()
		 * @generated
		 */
		EClass MATCHMAKER_QUERY = eINSTANCE.getMatchmakerQuery();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCHMAKER_QUERY__QUERY = eINSTANCE.getMatchmakerQuery_Query();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.runtime.action.impl.MatchmakerResultImpl <em>Matchmaker Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.runtime.action.impl.MatchmakerResultImpl
		 * @see net.sf.ictalive.runtime.action.impl.ActionPackageImpl#getMatchmakerResult()
		 * @generated
		 */
		EClass MATCHMAKER_RESULT = eINSTANCE.getMatchmakerResult();

		/**
		 * The meta object literal for the '<em><b>Service URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCHMAKER_RESULT__SERVICE_URI = eINSTANCE.getMatchmakerResult_ServiceURI();

		/**
		 * The meta object literal for the '<em><b>Reliability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCHMAKER_RESULT__RELIABILITY = eINSTANCE.getMatchmakerResult_Reliability();

		/**
		 * The meta object literal for the '<em><b>Performance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCHMAKER_RESULT__PERFORMANCE = eINSTANCE.getMatchmakerResult_Performance();

	}

} //ActionPackage
