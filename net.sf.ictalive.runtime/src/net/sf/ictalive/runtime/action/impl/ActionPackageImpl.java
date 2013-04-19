/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action.impl;

import net.sf.ictalive.coordination.agents.AgentsPackage;

import net.sf.ictalive.coordination.tasks.TasksPackage;

import net.sf.ictalive.operetta.OM.OMPackage;

import net.sf.ictalive.rules.swrl.SwrlPackage;

import net.sf.ictalive.runtime.NormInstances.NormInstancesPackage;
import net.sf.ictalive.runtime.action.Action;
import net.sf.ictalive.runtime.action.ActionFactory;
import net.sf.ictalive.runtime.action.ActionPackage;
import net.sf.ictalive.runtime.action.AgentAction;
import net.sf.ictalive.runtime.action.AgentReplan;
import net.sf.ictalive.runtime.action.CommunicativeAction;
import net.sf.ictalive.runtime.action.CoordinationAction;
import net.sf.ictalive.runtime.action.MatchmakerQuery;
import net.sf.ictalive.runtime.action.MatchmakerResponse;
import net.sf.ictalive.runtime.action.MatchmakerResult;
import net.sf.ictalive.runtime.action.NotifyStateOfWorld;
import net.sf.ictalive.runtime.action.Parameter;
import net.sf.ictalive.runtime.action.PlanDistribution;
import net.sf.ictalive.runtime.action.PlanExecution;
import net.sf.ictalive.runtime.action.PlanSchedule;
import net.sf.ictalive.runtime.action.PlanSynthesis;
import net.sf.ictalive.runtime.action.PlanningActions;
import net.sf.ictalive.runtime.action.ReplaceAgent;
import net.sf.ictalive.runtime.action.Result;
import net.sf.ictalive.runtime.action.ServiceInvocation;
import net.sf.ictalive.runtime.action.StateOfWorld;

import net.sf.ictalive.runtime.enactment.EnactmentPackage;

import net.sf.ictalive.runtime.enactment.impl.EnactmentPackageImpl;

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

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionPackageImpl extends EPackageImpl implements ActionPackage {
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
	private EClass communicativeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planSynthesisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchmakerResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planningActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replaceAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentReplanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notifyStateOfWorldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateOfWorldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchmakerQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchmakerResultEClass = null;

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
	 * @see net.sf.ictalive.runtime.action.ActionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActionPackageImpl() {
		super(eNS_URI, ActionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ActionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActionPackage init() {
		if (isInited) return (ActionPackage)EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI);

		// Obtain or create and register package
		ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TasksPackage.eINSTANCE.eClass();
		NormInstancesPackage.eINSTANCE.eClass();
		ServicePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		EnactmentPackageImpl theEnactmentPackage = (EnactmentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnactmentPackage.eNS_URI) instanceof EnactmentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnactmentPackage.eNS_URI) : EnactmentPackage.eINSTANCE);
		EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
		FactPackageImpl theFactPackage = (FactPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FactPackage.eNS_URI) instanceof FactPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FactPackage.eNS_URI) : FactPackage.eINSTANCE);

		// Create package meta-data objects
		theActionPackage.createPackageContents();
		theEnactmentPackage.createPackageContents();
		theEventPackage.createPackageContents();
		theFactPackage.createPackageContents();

		// Initialize created meta-data
		theActionPackage.initializePackageContents();
		theEnactmentPackage.initializePackageContents();
		theEventPackage.initializePackageContents();
		theFactPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActionPackage.eNS_URI, theActionPackage);
		return theActionPackage;
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
	public EReference getAction_ByActor() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Cause() {
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Enactment() {
		return (EReference)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Result() {
		return (EReference)actionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Input() {
		return (EReference)actionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicativeAction() {
		return communicativeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinationAction() {
		return coordinationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationAction_Plan() {
		return (EReference)coordinationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationAction_CoordAction() {
		return (EReference)coordinationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanSynthesis() {
		return planSynthesisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanDistribution() {
		return planDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanSchedule() {
		return planScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanExecution() {
		return planExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResult() {
		return resultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceInvocation() {
		return serviceInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInvocation_ServiceURI() {
		return (EAttribute)serviceInvocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInvocation_EnactingAgent() {
		return (EReference)serviceInvocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInvocation_CorrelatedAction() {
		return (EReference)serviceInvocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchmakerResponse() {
		return matchmakerResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchmakerResponse_QueryResult() {
		return (EReference)matchmakerResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchmakerResponse_Query() {
		return (EReference)matchmakerResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanningActions() {
		return planningActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanningActions_Plan() {
		return (EReference)planningActionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgentAction() {
		return agentActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgentAction_Agent() {
		return (EReference)agentActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplaceAgent() {
		return replaceAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgentReplan() {
		return agentReplanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgentReplan_FailedPlan() {
		return (EReference)agentReplanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotifyStateOfWorld() {
		return notifyStateOfWorldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotifyStateOfWorld_StateOfWorld() {
		return (EReference)notifyStateOfWorldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateOfWorld() {
		return stateOfWorldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateOfWorld_PartialStateDescription() {
		return (EReference)stateOfWorldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateOfWorld_Atom() {
		return (EReference)stateOfWorldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateOfWorld_Description() {
		return (EAttribute)stateOfWorldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchmakerQuery() {
		return matchmakerQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatchmakerQuery_Query() {
		return (EAttribute)matchmakerQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchmakerResult() {
		return matchmakerResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatchmakerResult_ServiceURI() {
		return (EAttribute)matchmakerResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatchmakerResult_Reliability() {
		return (EAttribute)matchmakerResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatchmakerResult_Performance() {
		return (EAttribute)matchmakerResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionFactory getActionFactory() {
		return (ActionFactory)getEFactoryInstance();
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
		createEReference(actionEClass, ACTION__BY_ACTOR);
		createEReference(actionEClass, ACTION__CAUSE);
		createEReference(actionEClass, ACTION__ENACTMENT);
		createEReference(actionEClass, ACTION__RESULT);
		createEReference(actionEClass, ACTION__INPUT);

		communicativeActionEClass = createEClass(COMMUNICATIVE_ACTION);

		coordinationActionEClass = createEClass(COORDINATION_ACTION);
		createEReference(coordinationActionEClass, COORDINATION_ACTION__PLAN);
		createEReference(coordinationActionEClass, COORDINATION_ACTION__COORD_ACTION);

		planSynthesisEClass = createEClass(PLAN_SYNTHESIS);

		planDistributionEClass = createEClass(PLAN_DISTRIBUTION);

		planScheduleEClass = createEClass(PLAN_SCHEDULE);

		planExecutionEClass = createEClass(PLAN_EXECUTION);

		resultEClass = createEClass(RESULT);

		serviceInvocationEClass = createEClass(SERVICE_INVOCATION);
		createEAttribute(serviceInvocationEClass, SERVICE_INVOCATION__SERVICE_URI);
		createEReference(serviceInvocationEClass, SERVICE_INVOCATION__ENACTING_AGENT);
		createEReference(serviceInvocationEClass, SERVICE_INVOCATION__CORRELATED_ACTION);

		matchmakerResponseEClass = createEClass(MATCHMAKER_RESPONSE);
		createEReference(matchmakerResponseEClass, MATCHMAKER_RESPONSE__QUERY_RESULT);
		createEReference(matchmakerResponseEClass, MATCHMAKER_RESPONSE__QUERY);

		planningActionsEClass = createEClass(PLANNING_ACTIONS);
		createEReference(planningActionsEClass, PLANNING_ACTIONS__PLAN);

		agentActionEClass = createEClass(AGENT_ACTION);
		createEReference(agentActionEClass, AGENT_ACTION__AGENT);

		replaceAgentEClass = createEClass(REPLACE_AGENT);

		agentReplanEClass = createEClass(AGENT_REPLAN);
		createEReference(agentReplanEClass, AGENT_REPLAN__FAILED_PLAN);

		notifyStateOfWorldEClass = createEClass(NOTIFY_STATE_OF_WORLD);
		createEReference(notifyStateOfWorldEClass, NOTIFY_STATE_OF_WORLD__STATE_OF_WORLD);

		parameterEClass = createEClass(PARAMETER);

		stateOfWorldEClass = createEClass(STATE_OF_WORLD);
		createEReference(stateOfWorldEClass, STATE_OF_WORLD__PARTIAL_STATE_DESCRIPTION);
		createEReference(stateOfWorldEClass, STATE_OF_WORLD__ATOM);
		createEAttribute(stateOfWorldEClass, STATE_OF_WORLD__DESCRIPTION);

		matchmakerQueryEClass = createEClass(MATCHMAKER_QUERY);
		createEAttribute(matchmakerQueryEClass, MATCHMAKER_QUERY__QUERY);

		matchmakerResultEClass = createEClass(MATCHMAKER_RESULT);
		createEAttribute(matchmakerResultEClass, MATCHMAKER_RESULT__SERVICE_URI);
		createEAttribute(matchmakerResultEClass, MATCHMAKER_RESULT__RELIABILITY);
		createEAttribute(matchmakerResultEClass, MATCHMAKER_RESULT__PERFORMANCE);
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
		FactPackage theFactPackage = (FactPackage)EPackage.Registry.INSTANCE.getEPackage(FactPackage.eNS_URI);
		EnactmentPackage theEnactmentPackage = (EnactmentPackage)EPackage.Registry.INSTANCE.getEPackage(EnactmentPackage.eNS_URI);
		TasksPackage theTasksPackage = (TasksPackage)EPackage.Registry.INSTANCE.getEPackage(TasksPackage.eNS_URI);
		AgentsPackage theAgentsPackage = (AgentsPackage)EPackage.Registry.INSTANCE.getEPackage(AgentsPackage.eNS_URI);
		OMPackage theOMPackage = (OMPackage)EPackage.Registry.INSTANCE.getEPackage(OMPackage.eNS_URI);
		SwrlPackage theSwrlPackage = (SwrlPackage)EPackage.Registry.INSTANCE.getEPackage(SwrlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		communicativeActionEClass.getESuperTypes().add(this.getAction());
		coordinationActionEClass.getESuperTypes().add(this.getAction());
		planSynthesisEClass.getESuperTypes().add(this.getPlanningActions());
		planDistributionEClass.getESuperTypes().add(this.getPlanningActions());
		planScheduleEClass.getESuperTypes().add(this.getPlanningActions());
		planExecutionEClass.getESuperTypes().add(this.getPlanningActions());
		resultEClass.getESuperTypes().add(ecorePackage.getEObject());
		serviceInvocationEClass.getESuperTypes().add(this.getAction());
		matchmakerResponseEClass.getESuperTypes().add(this.getAction());
		planningActionsEClass.getESuperTypes().add(this.getAction());
		agentActionEClass.getESuperTypes().add(this.getAction());
		replaceAgentEClass.getESuperTypes().add(this.getAgentAction());
		agentReplanEClass.getESuperTypes().add(this.getAgentAction());
		notifyStateOfWorldEClass.getESuperTypes().add(this.getAgentAction());
		matchmakerQueryEClass.getESuperTypes().add(this.getAction());

		// Initialize classes and features; add operations and parameters
		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_ByActor(), theEventPackage.getActor(), null, "byActor", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Cause(), theFactPackage.getFact(), null, "cause", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Enactment(), theEnactmentPackage.getEnactment(), null, "enactment", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Result(), this.getResult(), null, "result", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Input(), this.getParameter(), null, "input", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicativeActionEClass, CommunicativeAction.class, "CommunicativeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coordinationActionEClass, CoordinationAction.class, "CoordinationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinationAction_Plan(), theTasksPackage.getPlan(), null, "plan", null, 0, 1, CoordinationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationAction_CoordAction(), theTasksPackage.getActionGrounding(), null, "coordAction", null, 0, 1, CoordinationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planSynthesisEClass, PlanSynthesis.class, "PlanSynthesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(planDistributionEClass, PlanDistribution.class, "PlanDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(planScheduleEClass, PlanSchedule.class, "PlanSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(planExecutionEClass, PlanExecution.class, "PlanExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultEClass, Result.class, "Result", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceInvocationEClass, ServiceInvocation.class, "ServiceInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceInvocation_ServiceURI(), ecorePackage.getEString(), "serviceURI", null, 0, 1, ServiceInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceInvocation_EnactingAgent(), theAgentsPackage.getAgent(), null, "enactingAgent", null, 0, 1, ServiceInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceInvocation_CorrelatedAction(), theTasksPackage.getActionGrounding(), null, "correlatedAction", null, 0, 1, ServiceInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchmakerResponseEClass, MatchmakerResponse.class, "MatchmakerResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatchmakerResponse_QueryResult(), this.getMatchmakerResult(), null, "queryResult", null, 0, -1, MatchmakerResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatchmakerResponse_Query(), this.getMatchmakerQuery(), null, "query", null, 0, 1, MatchmakerResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planningActionsEClass, PlanningActions.class, "PlanningActions", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlanningActions_Plan(), theTasksPackage.getPlan(), null, "plan", null, 0, 1, PlanningActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agentActionEClass, AgentAction.class, "AgentAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgentAction_Agent(), theAgentsPackage.getAgent(), null, "agent", null, 1, 1, AgentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(replaceAgentEClass, ReplaceAgent.class, "ReplaceAgent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(agentReplanEClass, AgentReplan.class, "AgentReplan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgentReplan_FailedPlan(), theTasksPackage.getPlan(), null, "failedPlan", null, 0, 1, AgentReplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notifyStateOfWorldEClass, NotifyStateOfWorld.class, "NotifyStateOfWorld", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotifyStateOfWorld_StateOfWorld(), this.getStateOfWorld(), null, "stateOfWorld", null, 0, -1, NotifyStateOfWorld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateOfWorldEClass, StateOfWorld.class, "StateOfWorld", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateOfWorld_PartialStateDescription(), theOMPackage.getPartialStateDescription(), null, "partialStateDescription", null, 0, 1, StateOfWorld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateOfWorld_Atom(), theSwrlPackage.getAtom(), null, "atom", null, 0, 1, StateOfWorld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateOfWorld_Description(), ecorePackage.getEString(), "description", null, 0, 1, StateOfWorld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchmakerQueryEClass, MatchmakerQuery.class, "MatchmakerQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatchmakerQuery_Query(), ecorePackage.getEString(), "query", null, 0, 1, MatchmakerQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchmakerResultEClass, MatchmakerResult.class, "MatchmakerResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatchmakerResult_ServiceURI(), ecorePackage.getEString(), "serviceURI", null, 1, 1, MatchmakerResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatchmakerResult_Reliability(), ecorePackage.getEDouble(), "reliability", null, 0, 1, MatchmakerResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatchmakerResult_Performance(), ecorePackage.getELong(), "performance", null, 0, 1, MatchmakerResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ActionPackageImpl
