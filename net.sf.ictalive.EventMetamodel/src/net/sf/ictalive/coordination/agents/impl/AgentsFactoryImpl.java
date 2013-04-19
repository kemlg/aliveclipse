/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.agents.impl;

import net.sf.ictalive.coordination.agents.ActorImpl;
import net.sf.ictalive.coordination.agents.Agent;
import net.sf.ictalive.coordination.agents.AgentPlatform;
import net.sf.ictalive.coordination.agents.AgentsFactory;
import net.sf.ictalive.coordination.agents.AgentsPackage;
import net.sf.ictalive.coordination.agents.CL;
import net.sf.ictalive.coordination.agents.OrganisationalActor;
import net.sf.ictalive.coordination.agents.RoleActor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class AgentsFactoryImpl extends EFactoryImpl implements AgentsFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AgentsFactory init()
	{
		try
		{
			AgentsFactory theAgentsFactory = (AgentsFactory)EPackage.Registry.INSTANCE.getEFactory("http://alive/coordinationLevel/agents/0.3"); 
			if (theAgentsFactory != null)
			{
				return theAgentsFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AgentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentsFactoryImpl()
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
			case AgentsPackage.AGENT: return createAgent();
			case AgentsPackage.CL: return createCL();
			case AgentsPackage.ACTOR_IMPL: return createActorImpl();
			case AgentsPackage.ORGANISATIONAL_ACTOR: return createOrganisationalActor();
			case AgentsPackage.ROLE_ACTOR: return createRoleActor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case AgentsPackage.AGENT_PLATFORM:
				return createAgentPlatformFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case AgentsPackage.AGENT_PLATFORM:
				return convertAgentPlatformToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent createAgent()
	{
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CL createCL()
	{
		CLImpl cl = new CLImpl();
		return cl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorImpl createActorImpl()
	{
		ActorImplImpl actorImpl = new ActorImplImpl();
		return actorImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationalActor createOrganisationalActor()
	{
		OrganisationalActorImpl organisationalActor = new OrganisationalActorImpl();
		return organisationalActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleActor createRoleActor()
	{
		RoleActorImpl roleActor = new RoleActorImpl();
		return roleActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentPlatform createAgentPlatformFromString(EDataType eDataType, String initialValue)
	{
		AgentPlatform result = AgentPlatform.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAgentPlatformToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentsPackage getAgentsPackage()
	{
		return (AgentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AgentsPackage getPackage()
	{
		return AgentsPackage.eINSTANCE;
	}

} //AgentsFactoryImpl
