/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action.util;

import net.sf.ictalive.runtime.action.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.runtime.action.ActionPackage
 * @generated
 */
public class ActionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ActionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionSwitch<Adapter> modelSwitch =
		new ActionSwitch<Adapter>() {
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseCommunicativeAction(CommunicativeAction object) {
				return createCommunicativeActionAdapter();
			}
			@Override
			public Adapter caseCoordinationAction(CoordinationAction object) {
				return createCoordinationActionAdapter();
			}
			@Override
			public Adapter casePlanSynthesis(PlanSynthesis object) {
				return createPlanSynthesisAdapter();
			}
			@Override
			public Adapter casePlanDistribution(PlanDistribution object) {
				return createPlanDistributionAdapter();
			}
			@Override
			public Adapter casePlanSchedule(PlanSchedule object) {
				return createPlanScheduleAdapter();
			}
			@Override
			public Adapter casePlanExecution(PlanExecution object) {
				return createPlanExecutionAdapter();
			}
			@Override
			public Adapter caseResult(Result object) {
				return createResultAdapter();
			}
			@Override
			public Adapter caseServiceInvocation(ServiceInvocation object) {
				return createServiceInvocationAdapter();
			}
			@Override
			public Adapter caseMatchmakerResponse(MatchmakerResponse object) {
				return createMatchmakerResponseAdapter();
			}
			@Override
			public Adapter casePlanningActions(PlanningActions object) {
				return createPlanningActionsAdapter();
			}
			@Override
			public Adapter caseAgentAction(AgentAction object) {
				return createAgentActionAdapter();
			}
			@Override
			public Adapter caseReplaceAgent(ReplaceAgent object) {
				return createReplaceAgentAdapter();
			}
			@Override
			public Adapter caseAgentReplan(AgentReplan object) {
				return createAgentReplanAdapter();
			}
			@Override
			public Adapter caseNotifyStateOfWorld(NotifyStateOfWorld object) {
				return createNotifyStateOfWorldAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseStateOfWorld(StateOfWorld object) {
				return createStateOfWorldAdapter();
			}
			@Override
			public Adapter caseMatchmakerQuery(MatchmakerQuery object) {
				return createMatchmakerQueryAdapter();
			}
			@Override
			public Adapter caseMatchmakerResult(MatchmakerResult object) {
				return createMatchmakerResultAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.action.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.action.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.action.CommunicativeAction <em>Communicative Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.action.CommunicativeAction
	 * @generated
	 */
	public Adapter createCommunicativeActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.action.CoordinationAction <em>Coordination Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.action.CoordinationAction
	 * @generated
	 */
	public Adapter createCoordinationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.action.PlanSynthesis <em>Plan Synthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.action.PlanSynthesis
	 * @generated
	 */
	public Adapter createPlanSynthesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.action.PlanDistribution <em>Plan Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.action.PlanDistribution
	 * @generated
	 */
	public Adapter createPlanDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.action.PlanSchedule <em>Plan Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.action.PlanSchedule
	 * @generated
	 */
	public Adapter createPlanScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.action.PlanExecution <em>Plan Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.action.PlanExecution
	 * @generated
	 */
	public Adapter createPlanExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.action.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.action.Result
	 * @generated
	 */
	public Adapter createResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.action.ServiceInvocation <em>Service Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.action.ServiceInvocation
	 * @generated
	 */
	public Adapter createServiceInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.action.MatchmakerResponse <em>Matchmaker Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.action.MatchmakerResponse
	 * @generated
	 */
	public Adapter createMatchmakerResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.action.PlanningActions <em>Planning Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.action.PlanningActions
	 * @generated
	 */
	public Adapter createPlanningActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.action.AgentAction <em>Agent Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.action.AgentAction
	 * @generated
	 */
	public Adapter createAgentActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.action.ReplaceAgent <em>Replace Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.action.ReplaceAgent
	 * @generated
	 */
	public Adapter createReplaceAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.action.AgentReplan <em>Agent Replan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.action.AgentReplan
	 * @generated
	 */
	public Adapter createAgentReplanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.action.NotifyStateOfWorld <em>Notify State Of World</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.action.NotifyStateOfWorld
	 * @generated
	 */
	public Adapter createNotifyStateOfWorldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.action.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.action.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.action.StateOfWorld <em>State Of World</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.action.StateOfWorld
	 * @generated
	 */
	public Adapter createStateOfWorldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.action.MatchmakerQuery <em>Matchmaker Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.action.MatchmakerQuery
	 * @generated
	 */
	public Adapter createMatchmakerQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.action.MatchmakerResult <em>Matchmaker Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.action.MatchmakerResult
	 * @generated
	 */
	public Adapter createMatchmakerResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ActionAdapterFactory
