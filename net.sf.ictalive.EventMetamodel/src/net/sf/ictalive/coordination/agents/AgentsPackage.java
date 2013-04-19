/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.agents;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see net.sf.ictalive.coordination.agents.AgentsFactory
 * @model kind="package"
 * @generated
 */
public interface AgentsPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "agents";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://alive/coordinationLevel/agents/0.3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "agents";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AgentsPackage eINSTANCE = net.sf.ictalive.coordination.agents.impl.AgentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.agents.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.agents.impl.AgentImpl
	 * @see net.sf.ictalive.coordination.agents.impl.AgentsPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ACTORS = 1;

	/**
	 * The feature id for the '<em><b>Play Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__PLAY_ROLE = 2;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.agents.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.agents.impl.ActorImpl
	 * @see net.sf.ictalive.coordination.agents.impl.AgentsPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__AGENT = 0;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IMPLEMENTED_BY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = 2;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.agents.impl.CLImpl <em>CL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.agents.impl.CLImpl
	 * @see net.sf.ictalive.coordination.agents.impl.AgentsPackageImpl#getCL()
	 * @generated
	 */
	int CL = 2;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CL__AGENT = 0;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CL__ACTOR = 1;

	/**
	 * The number of structural features of the '<em>CL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.agents.impl.ActorImplImpl <em>Actor Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.agents.impl.ActorImplImpl
	 * @see net.sf.ictalive.coordination.agents.impl.AgentsPackageImpl#getActorImpl()
	 * @generated
	 */
	int ACTOR_IMPL = 3;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_IMPL__FILE = 0;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_IMPL__PLATFORM = 1;

	/**
	 * The number of structural features of the '<em>Actor Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_IMPL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.agents.impl.OrganisationalActorImpl <em>Organisational Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.agents.impl.OrganisationalActorImpl
	 * @see net.sf.ictalive.coordination.agents.impl.AgentsPackageImpl#getOrganisationalActor()
	 * @generated
	 */
	int ORGANISATIONAL_ACTOR = 4;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATIONAL_ACTOR__AGENT = ACTOR__AGENT;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATIONAL_ACTOR__IMPLEMENTED_BY = ACTOR__IMPLEMENTED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATIONAL_ACTOR__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Undertake Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATIONAL_ACTOR__UNDERTAKE_TASK = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Organisational Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATIONAL_ACTOR_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.agents.impl.RoleActorImpl <em>Role Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.agents.impl.RoleActorImpl
	 * @see net.sf.ictalive.coordination.agents.impl.AgentsPackageImpl#getRoleActor()
	 * @generated
	 */
	int ROLE_ACTOR = 5;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ACTOR__AGENT = ACTOR__AGENT;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ACTOR__IMPLEMENTED_BY = ACTOR__IMPLEMENTED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ACTOR__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Take Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ACTOR__TAKE_ROLE = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ACTOR_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.agents.AgentPlatform <em>Agent Platform</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.agents.AgentPlatform
	 * @see net.sf.ictalive.coordination.agents.impl.AgentsPackageImpl#getAgentPlatform()
	 * @generated
	 */
	int AGENT_PLATFORM = 6;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.agents.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see net.sf.ictalive.coordination.agents.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.agents.Agent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.coordination.agents.Agent#getName()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Name();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.coordination.agents.Agent#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actors</em>'.
	 * @see net.sf.ictalive.coordination.agents.Agent#getActors()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Actors();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.coordination.agents.Agent#getPlayRole <em>Play Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Play Role</em>'.
	 * @see net.sf.ictalive.coordination.agents.Agent#getPlayRole()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_PlayRole();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.agents.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see net.sf.ictalive.coordination.agents.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.agents.Actor#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agent</em>'.
	 * @see net.sf.ictalive.coordination.agents.Actor#getAgent()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Agent();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.agents.Actor#getImplementedBy <em>Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implemented By</em>'.
	 * @see net.sf.ictalive.coordination.agents.Actor#getImplementedBy()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_ImplementedBy();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.agents.Actor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.coordination.agents.Actor#getName()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.agents.CL <em>CL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CL</em>'.
	 * @see net.sf.ictalive.coordination.agents.CL
	 * @generated
	 */
	EClass getCL();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.agents.CL#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agent</em>'.
	 * @see net.sf.ictalive.coordination.agents.CL#getAgent()
	 * @see #getCL()
	 * @generated
	 */
	EReference getCL_Agent();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.agents.CL#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor</em>'.
	 * @see net.sf.ictalive.coordination.agents.CL#getActor()
	 * @see #getCL()
	 * @generated
	 */
	EReference getCL_Actor();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.agents.ActorImpl <em>Actor Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Impl</em>'.
	 * @see net.sf.ictalive.coordination.agents.ActorImpl
	 * @generated
	 */
	EClass getActorImpl();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.agents.ActorImpl#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see net.sf.ictalive.coordination.agents.ActorImpl#getFile()
	 * @see #getActorImpl()
	 * @generated
	 */
	EAttribute getActorImpl_File();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.agents.ActorImpl#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform</em>'.
	 * @see net.sf.ictalive.coordination.agents.ActorImpl#getPlatform()
	 * @see #getActorImpl()
	 * @generated
	 */
	EAttribute getActorImpl_Platform();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.agents.OrganisationalActor <em>Organisational Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisational Actor</em>'.
	 * @see net.sf.ictalive.coordination.agents.OrganisationalActor
	 * @generated
	 */
	EClass getOrganisationalActor();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.agents.OrganisationalActor#getUndertakeTask <em>Undertake Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Undertake Task</em>'.
	 * @see net.sf.ictalive.coordination.agents.OrganisationalActor#getUndertakeTask()
	 * @see #getOrganisationalActor()
	 * @generated
	 */
	EReference getOrganisationalActor_UndertakeTask();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.agents.RoleActor <em>Role Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Actor</em>'.
	 * @see net.sf.ictalive.coordination.agents.RoleActor
	 * @generated
	 */
	EClass getRoleActor();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.coordination.agents.RoleActor#getTakeRole <em>Take Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Take Role</em>'.
	 * @see net.sf.ictalive.coordination.agents.RoleActor#getTakeRole()
	 * @see #getRoleActor()
	 * @generated
	 */
	EReference getRoleActor_TakeRole();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.coordination.agents.AgentPlatform <em>Agent Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Agent Platform</em>'.
	 * @see net.sf.ictalive.coordination.agents.AgentPlatform
	 * @generated
	 */
	EEnum getAgentPlatform();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AgentsFactory getAgentsFactory();

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
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.agents.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.agents.impl.AgentImpl
		 * @see net.sf.ictalive.coordination.agents.impl.AgentsPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__NAME = eINSTANCE.getAgent_Name();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__ACTORS = eINSTANCE.getAgent_Actors();

		/**
		 * The meta object literal for the '<em><b>Play Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__PLAY_ROLE = eINSTANCE.getAgent_PlayRole();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.agents.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.agents.impl.ActorImpl
		 * @see net.sf.ictalive.coordination.agents.impl.AgentsPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__AGENT = eINSTANCE.getActor_Agent();

		/**
		 * The meta object literal for the '<em><b>Implemented By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__IMPLEMENTED_BY = eINSTANCE.getActor_ImplementedBy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.agents.impl.CLImpl <em>CL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.agents.impl.CLImpl
		 * @see net.sf.ictalive.coordination.agents.impl.AgentsPackageImpl#getCL()
		 * @generated
		 */
		EClass CL = eINSTANCE.getCL();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CL__AGENT = eINSTANCE.getCL_Agent();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CL__ACTOR = eINSTANCE.getCL_Actor();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.agents.impl.ActorImplImpl <em>Actor Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.agents.impl.ActorImplImpl
		 * @see net.sf.ictalive.coordination.agents.impl.AgentsPackageImpl#getActorImpl()
		 * @generated
		 */
		EClass ACTOR_IMPL = eINSTANCE.getActorImpl();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_IMPL__FILE = eINSTANCE.getActorImpl_File();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_IMPL__PLATFORM = eINSTANCE.getActorImpl_Platform();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.agents.impl.OrganisationalActorImpl <em>Organisational Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.agents.impl.OrganisationalActorImpl
		 * @see net.sf.ictalive.coordination.agents.impl.AgentsPackageImpl#getOrganisationalActor()
		 * @generated
		 */
		EClass ORGANISATIONAL_ACTOR = eINSTANCE.getOrganisationalActor();

		/**
		 * The meta object literal for the '<em><b>Undertake Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATIONAL_ACTOR__UNDERTAKE_TASK = eINSTANCE.getOrganisationalActor_UndertakeTask();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.agents.impl.RoleActorImpl <em>Role Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.agents.impl.RoleActorImpl
		 * @see net.sf.ictalive.coordination.agents.impl.AgentsPackageImpl#getRoleActor()
		 * @generated
		 */
		EClass ROLE_ACTOR = eINSTANCE.getRoleActor();

		/**
		 * The meta object literal for the '<em><b>Take Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_ACTOR__TAKE_ROLE = eINSTANCE.getRoleActor_TakeRole();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.agents.AgentPlatform <em>Agent Platform</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.agents.AgentPlatform
		 * @see net.sf.ictalive.coordination.agents.impl.AgentsPackageImpl#getAgentPlatform()
		 * @generated
		 */
		EEnum AGENT_PLATFORM = eINSTANCE.getAgentPlatform();

	}

} //AgentsPackage
