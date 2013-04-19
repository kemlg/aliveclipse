/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.agents;

import net.sf.ictalive.coordination.actions.ActionsPackage;

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
 * @see net.sf.ictalive.coordination.agents.AgentsFactory
 * @model kind="package"
 * @generated
 */
public interface AgentsPackage extends EPackage {
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
	String eNS_URI = "http://ict-alive.sourceforge.net/coordination/agents";

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
	 * The feature id for the '<em><b>Has Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__HAS_ROLE = 1;

	/**
	 * The feature id for the '<em><b>Has Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__HAS_ACTION = 2;

	/**
	 * The feature id for the '<em><b>As Folder Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__AS_FOLDER_LOCATION = 3;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.coordination.agents.impl.MasModelImpl <em>Mas Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.coordination.agents.impl.MasModelImpl
	 * @see net.sf.ictalive.coordination.agents.impl.AgentsPackageImpl#getMasModel()
	 * @generated
	 */
	int MAS_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAS_MODEL__AGENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAS_MODEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Domain Ontology Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAS_MODEL__DOMAIN_ONTOLOGY_NAME_SPACE = 2;

	/**
	 * The number of structural features of the '<em>Mas Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAS_MODEL_FEATURE_COUNT = 3;

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
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.coordination.agents.Agent#getHasRole <em>Has Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Role</em>'.
	 * @see net.sf.ictalive.coordination.agents.Agent#getHasRole()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_HasRole();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.coordination.agents.Agent#getHasAction <em>Has Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Action</em>'.
	 * @see net.sf.ictalive.coordination.agents.Agent#getHasAction()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_HasAction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.agents.Agent#getAsFolderLocation <em>As Folder Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>As Folder Location</em>'.
	 * @see net.sf.ictalive.coordination.agents.Agent#getAsFolderLocation()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_AsFolderLocation();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.coordination.agents.MasModel <em>Mas Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mas Model</em>'.
	 * @see net.sf.ictalive.coordination.agents.MasModel
	 * @generated
	 */
	EClass getMasModel();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.coordination.agents.MasModel#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agents</em>'.
	 * @see net.sf.ictalive.coordination.agents.MasModel#getAgents()
	 * @see #getMasModel()
	 * @generated
	 */
	EReference getMasModel_Agents();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.agents.MasModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.coordination.agents.MasModel#getName()
	 * @see #getMasModel()
	 * @generated
	 */
	EAttribute getMasModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.coordination.agents.MasModel#getDomainOntologyNameSpace <em>Domain Ontology Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Ontology Name Space</em>'.
	 * @see net.sf.ictalive.coordination.agents.MasModel#getDomainOntologyNameSpace()
	 * @see #getMasModel()
	 * @generated
	 */
	EAttribute getMasModel_DomainOntologyNameSpace();

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
	interface Literals {
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
		 * The meta object literal for the '<em><b>Has Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__HAS_ROLE = eINSTANCE.getAgent_HasRole();

		/**
		 * The meta object literal for the '<em><b>Has Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__HAS_ACTION = eINSTANCE.getAgent_HasAction();

		/**
		 * The meta object literal for the '<em><b>As Folder Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__AS_FOLDER_LOCATION = eINSTANCE.getAgent_AsFolderLocation();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.coordination.agents.impl.MasModelImpl <em>Mas Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.coordination.agents.impl.MasModelImpl
		 * @see net.sf.ictalive.coordination.agents.impl.AgentsPackageImpl#getMasModel()
		 * @generated
		 */
		EClass MAS_MODEL = eINSTANCE.getMasModel();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAS_MODEL__AGENTS = eINSTANCE.getMasModel_Agents();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAS_MODEL__NAME = eINSTANCE.getMasModel_Name();

		/**
		 * The meta object literal for the '<em><b>Domain Ontology Name Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAS_MODEL__DOMAIN_ONTOLOGY_NAME_SPACE = eINSTANCE.getMasModel_DomainOntologyNameSpace();

	}

} //AgentsPackage
