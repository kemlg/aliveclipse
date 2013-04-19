/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action.impl;

import net.sf.ictalive.runtime.action.*;

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
public class ActionFactoryImpl extends EFactoryImpl implements ActionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionFactory init() {
		try {
			ActionFactory theActionFactory = (ActionFactory)EPackage.Registry.INSTANCE.getEFactory("http://ict-alive.sourceforge.net/RunTime/actions"); 
			if (theActionFactory != null) {
				return theActionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionFactoryImpl() {
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
			case ActionPackage.COMMUNICATIVE_ACTION: return createCommunicativeAction();
			case ActionPackage.COORDINATION_ACTION: return createCoordinationAction();
			case ActionPackage.PLAN_SYNTHESIS: return createPlanSynthesis();
			case ActionPackage.PLAN_DISTRIBUTION: return createPlanDistribution();
			case ActionPackage.PLAN_SCHEDULE: return createPlanSchedule();
			case ActionPackage.PLAN_EXECUTION: return createPlanExecution();
			case ActionPackage.RESULT: return createResult();
			case ActionPackage.SERVICE_INVOCATION: return createServiceInvocation();
			case ActionPackage.MATCHMAKER_RESPONSE: return createMatchmakerResponse();
			case ActionPackage.REPLACE_AGENT: return createReplaceAgent();
			case ActionPackage.AGENT_REPLAN: return createAgentReplan();
			case ActionPackage.NOTIFY_STATE_OF_WORLD: return createNotifyStateOfWorld();
			case ActionPackage.PARAMETER: return createParameter();
			case ActionPackage.STATE_OF_WORLD: return createStateOfWorld();
			case ActionPackage.MATCHMAKER_QUERY: return createMatchmakerQuery();
			case ActionPackage.MATCHMAKER_RESULT: return createMatchmakerResult();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicativeAction createCommunicativeAction() {
		CommunicativeActionImpl communicativeAction = new CommunicativeActionImpl();
		return communicativeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationAction createCoordinationAction() {
		CoordinationActionImpl coordinationAction = new CoordinationActionImpl();
		return coordinationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanSynthesis createPlanSynthesis() {
		PlanSynthesisImpl planSynthesis = new PlanSynthesisImpl();
		return planSynthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDistribution createPlanDistribution() {
		PlanDistributionImpl planDistribution = new PlanDistributionImpl();
		return planDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanSchedule createPlanSchedule() {
		PlanScheduleImpl planSchedule = new PlanScheduleImpl();
		return planSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanExecution createPlanExecution() {
		PlanExecutionImpl planExecution = new PlanExecutionImpl();
		return planExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Result createResult() {
		ResultImpl result = new ResultImpl();
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInvocation createServiceInvocation() {
		ServiceInvocationImpl serviceInvocation = new ServiceInvocationImpl();
		return serviceInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchmakerResponse createMatchmakerResponse() {
		MatchmakerResponseImpl matchmakerResponse = new MatchmakerResponseImpl();
		return matchmakerResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceAgent createReplaceAgent() {
		ReplaceAgentImpl replaceAgent = new ReplaceAgentImpl();
		return replaceAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentReplan createAgentReplan() {
		AgentReplanImpl agentReplan = new AgentReplanImpl();
		return agentReplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotifyStateOfWorld createNotifyStateOfWorld() {
		NotifyStateOfWorldImpl notifyStateOfWorld = new NotifyStateOfWorldImpl();
		return notifyStateOfWorld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateOfWorld createStateOfWorld() {
		StateOfWorldImpl stateOfWorld = new StateOfWorldImpl();
		return stateOfWorld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchmakerQuery createMatchmakerQuery() {
		MatchmakerQueryImpl matchmakerQuery = new MatchmakerQueryImpl();
		return matchmakerQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchmakerResult createMatchmakerResult() {
		MatchmakerResultImpl matchmakerResult = new MatchmakerResultImpl();
		return matchmakerResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionPackage getActionPackage() {
		return (ActionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActionPackage getPackage() {
		return ActionPackage.eINSTANCE;
	}

} //ActionFactoryImpl
