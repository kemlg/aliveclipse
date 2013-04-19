/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Action.impl;

import net.sf.ictalive.EventModel.Action.*;

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
public class ActionFactoryImpl extends EFactoryImpl implements ActionFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionFactory init()
	{
		try
		{
			ActionFactory theActionFactory = (ActionFactory)EPackage.Registry.INSTANCE.getEFactory("http://alive/architecture/actions"); 
			if (theActionFactory != null)
			{
				return theActionFactory;
			}
		}
		catch (Exception exception)
		{
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
	public ActionFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case ActionPackage.PLAN_SYNTHESIS: return createPlanSynthesis();
			case ActionPackage.PLAN_DISTRIBUTION: return createPlanDistribution();
			case ActionPackage.PLAN_SCHEDULE: return createPlanSchedule();
			case ActionPackage.PLAN_EXECUTION: return createPlanExecution();
			case ActionPackage.ACTION_ENACTMENT: return createActionEnactment();
			case ActionPackage.SERVICE_INVOCATION: return createServiceInvocation();
			case ActionPackage.FIND_SERVICE: return createFindService();
			case ActionPackage.RESULT: return createResult();
			case ActionPackage.REPLACE_AGENT: return createReplaceAgent();
			case ActionPackage.AGENT_REPLAN: return createAgentReplan();
			case ActionPackage.NOTIFY_STATE_OF_WORLD: return createNotifyStateOfWorld();
			case ActionPackage.PARAMETER: return createParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanSynthesis createPlanSynthesis()
	{
		PlanSynthesisImpl planSynthesis = new PlanSynthesisImpl();
		return planSynthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDistribution createPlanDistribution()
	{
		PlanDistributionImpl planDistribution = new PlanDistributionImpl();
		return planDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanSchedule createPlanSchedule()
	{
		PlanScheduleImpl planSchedule = new PlanScheduleImpl();
		return planSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanExecution createPlanExecution()
	{
		PlanExecutionImpl planExecution = new PlanExecutionImpl();
		return planExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionEnactment createActionEnactment()
	{
		ActionEnactmentImpl actionEnactment = new ActionEnactmentImpl();
		return actionEnactment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInvocation createServiceInvocation()
	{
		ServiceInvocationImpl serviceInvocation = new ServiceInvocationImpl();
		return serviceInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindService createFindService()
	{
		FindServiceImpl findService = new FindServiceImpl();
		return findService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Result createResult()
	{
		ResultImpl result = new ResultImpl();
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceAgent createReplaceAgent()
	{
		ReplaceAgentImpl replaceAgent = new ReplaceAgentImpl();
		return replaceAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentReplan createAgentReplan()
	{
		AgentReplanImpl agentReplan = new AgentReplanImpl();
		return agentReplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotifyStateOfWorld createNotifyStateOfWorld()
	{
		NotifyStateOfWorldImpl notifyStateOfWorld = new NotifyStateOfWorldImpl();
		return notifyStateOfWorld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter()
	{
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionPackage getActionPackage()
	{
		return (ActionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActionPackage getPackage()
	{
		return ActionPackage.eINSTANCE;
	}

} //ActionFactoryImpl
