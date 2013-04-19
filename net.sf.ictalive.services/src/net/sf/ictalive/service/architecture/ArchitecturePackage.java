/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.architecture;

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
 * @see net.sf.ictalive.service.architecture.ArchitectureFactory
 * @model kind="package"
 * @generated
 */
public interface ArchitecturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "architecture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ict-alive.sourceforge.net/services/architecture";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "architecture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchitecturePackage eINSTANCE = net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.architecture.impl.ServiceFrameworkImpl <em>Service Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.architecture.impl.ServiceFrameworkImpl
	 * @see net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl#getServiceFramework()
	 * @generated
	 */
	int SERVICE_FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>Matchmaker</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FRAMEWORK__MATCHMAKER = 0;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FRAMEWORK__EXECUTION = 1;

	/**
	 * The feature id for the '<em><b>Service Directory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FRAMEWORK__SERVICE_DIRECTORY = 2;

	/**
	 * The feature id for the '<em><b>Template Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FRAMEWORK__TEMPLATE_REPOSITORY = 3;

	/**
	 * The number of structural features of the '<em>Service Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FRAMEWORK_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.architecture.impl.TemplateRepositoryImpl <em>Template Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.architecture.impl.TemplateRepositoryImpl
	 * @see net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl#getTemplateRepository()
	 * @generated
	 */
	int TEMPLATE_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_REPOSITORY__TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Ground Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_REPOSITORY__GROUND_TEMPLATE = 1;

	/**
	 * The number of structural features of the '<em>Template Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_REPOSITORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.architecture.impl.TemplateMatchmakerImpl <em>Template Matchmaker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.architecture.impl.TemplateMatchmakerImpl
	 * @see net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl#getTemplateMatchmaker()
	 * @generated
	 */
	int TEMPLATE_MATCHMAKER = 2;

	/**
	 * The feature id for the '<em><b>Template Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_MATCHMAKER__TEMPLATE_REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Template Matchmaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_MATCHMAKER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.architecture.impl.ServiceMatchmakerImpl <em>Service Matchmaker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.architecture.impl.ServiceMatchmakerImpl
	 * @see net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl#getServiceMatchmaker()
	 * @generated
	 */
	int SERVICE_MATCHMAKER = 3;

	/**
	 * The feature id for the '<em><b>Service Directory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MATCHMAKER__SERVICE_DIRECTORY = 0;

	/**
	 * The number of structural features of the '<em>Service Matchmaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MATCHMAKER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.architecture.impl.ServiceTemplateMatchmakerImpl <em>Service Template Matchmaker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.architecture.impl.ServiceTemplateMatchmakerImpl
	 * @see net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl#getServiceTemplateMatchmaker()
	 * @generated
	 */
	int SERVICE_TEMPLATE_MATCHMAKER = 4;

	/**
	 * The feature id for the '<em><b>Service Directory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_MATCHMAKER__SERVICE_DIRECTORY = SERVICE_MATCHMAKER__SERVICE_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Template Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_MATCHMAKER__TEMPLATE_REPOSITORY = SERVICE_MATCHMAKER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Template Matchmaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_MATCHMAKER_FEATURE_COUNT = SERVICE_MATCHMAKER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.architecture.impl.ServiceDirectoryImpl <em>Service Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.architecture.impl.ServiceDirectoryImpl
	 * @see net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl#getServiceDirectory()
	 * @generated
	 */
	int SERVICE_DIRECTORY = 5;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DIRECTORY__ENDPOINT = 0;

	/**
	 * The feature id for the '<em><b>Semantic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DIRECTORY__SEMANTIC = 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DIRECTORY__INTERFACE = 2;

	/**
	 * The number of structural features of the '<em>Service Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DIRECTORY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.architecture.impl.ExecutionFrameworkImpl <em>Execution Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.architecture.impl.ExecutionFrameworkImpl
	 * @see net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl#getExecutionFramework()
	 * @generated
	 */
	int EXECUTION_FRAMEWORK = 6;

	/**
	 * The feature id for the '<em><b>Deployed Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FRAMEWORK__DEPLOYED_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FRAMEWORK__CONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Execution Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FRAMEWORK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.architecture.impl.DeployedServiceImpl <em>Deployed Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.architecture.impl.DeployedServiceImpl
	 * @see net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl#getDeployedService()
	 * @generated
	 */
	int DEPLOYED_SERVICE = 7;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SERVICE__ARTIFACT = 0;

	/**
	 * The feature id for the '<em><b>Deploy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SERVICE__DEPLOY = 1;

	/**
	 * The number of structural features of the '<em>Deployed Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.architecture.ContainerType <em>Container Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.architecture.ContainerType
	 * @see net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl#getContainerType()
	 * @generated
	 */
	int CONTAINER_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.architecture.ServiceFramework <em>Service Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Framework</em>'.
	 * @see net.sf.ictalive.service.architecture.ServiceFramework
	 * @generated
	 */
	EClass getServiceFramework();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.architecture.ServiceFramework#getMatchmaker <em>Matchmaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matchmaker</em>'.
	 * @see net.sf.ictalive.service.architecture.ServiceFramework#getMatchmaker()
	 * @see #getServiceFramework()
	 * @generated
	 */
	EReference getServiceFramework_Matchmaker();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.architecture.ServiceFramework#getExecution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution</em>'.
	 * @see net.sf.ictalive.service.architecture.ServiceFramework#getExecution()
	 * @see #getServiceFramework()
	 * @generated
	 */
	EReference getServiceFramework_Execution();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.architecture.ServiceFramework#getServiceDirectory <em>Service Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Directory</em>'.
	 * @see net.sf.ictalive.service.architecture.ServiceFramework#getServiceDirectory()
	 * @see #getServiceFramework()
	 * @generated
	 */
	EReference getServiceFramework_ServiceDirectory();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.architecture.ServiceFramework#getTemplateRepository <em>Template Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template Repository</em>'.
	 * @see net.sf.ictalive.service.architecture.ServiceFramework#getTemplateRepository()
	 * @see #getServiceFramework()
	 * @generated
	 */
	EReference getServiceFramework_TemplateRepository();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.architecture.TemplateRepository <em>Template Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Repository</em>'.
	 * @see net.sf.ictalive.service.architecture.TemplateRepository
	 * @generated
	 */
	EClass getTemplateRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.architecture.TemplateRepository#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template</em>'.
	 * @see net.sf.ictalive.service.architecture.TemplateRepository#getTemplate()
	 * @see #getTemplateRepository()
	 * @generated
	 */
	EReference getTemplateRepository_Template();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.architecture.TemplateRepository#getGroundTemplate <em>Ground Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ground Template</em>'.
	 * @see net.sf.ictalive.service.architecture.TemplateRepository#getGroundTemplate()
	 * @see #getTemplateRepository()
	 * @generated
	 */
	EReference getTemplateRepository_GroundTemplate();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.architecture.TemplateMatchmaker <em>Template Matchmaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Matchmaker</em>'.
	 * @see net.sf.ictalive.service.architecture.TemplateMatchmaker
	 * @generated
	 */
	EClass getTemplateMatchmaker();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.architecture.TemplateMatchmaker#getTemplateRepository <em>Template Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template Repository</em>'.
	 * @see net.sf.ictalive.service.architecture.TemplateMatchmaker#getTemplateRepository()
	 * @see #getTemplateMatchmaker()
	 * @generated
	 */
	EReference getTemplateMatchmaker_TemplateRepository();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.architecture.ServiceMatchmaker <em>Service Matchmaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Matchmaker</em>'.
	 * @see net.sf.ictalive.service.architecture.ServiceMatchmaker
	 * @generated
	 */
	EClass getServiceMatchmaker();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.service.architecture.ServiceMatchmaker#getServiceDirectory <em>Service Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Directory</em>'.
	 * @see net.sf.ictalive.service.architecture.ServiceMatchmaker#getServiceDirectory()
	 * @see #getServiceMatchmaker()
	 * @generated
	 */
	EReference getServiceMatchmaker_ServiceDirectory();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.architecture.ServiceTemplateMatchmaker <em>Service Template Matchmaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Template Matchmaker</em>'.
	 * @see net.sf.ictalive.service.architecture.ServiceTemplateMatchmaker
	 * @generated
	 */
	EClass getServiceTemplateMatchmaker();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.architecture.ServiceDirectory <em>Service Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Directory</em>'.
	 * @see net.sf.ictalive.service.architecture.ServiceDirectory
	 * @generated
	 */
	EClass getServiceDirectory();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.service.architecture.ServiceDirectory#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Endpoint</em>'.
	 * @see net.sf.ictalive.service.architecture.ServiceDirectory#getEndpoint()
	 * @see #getServiceDirectory()
	 * @generated
	 */
	EReference getServiceDirectory_Endpoint();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.architecture.ServiceDirectory#getSemantic <em>Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Semantic</em>'.
	 * @see net.sf.ictalive.service.architecture.ServiceDirectory#getSemantic()
	 * @see #getServiceDirectory()
	 * @generated
	 */
	EReference getServiceDirectory_Semantic();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.service.architecture.ServiceDirectory#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interface</em>'.
	 * @see net.sf.ictalive.service.architecture.ServiceDirectory#getInterface()
	 * @see #getServiceDirectory()
	 * @generated
	 */
	EReference getServiceDirectory_Interface();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.architecture.ExecutionFramework <em>Execution Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Framework</em>'.
	 * @see net.sf.ictalive.service.architecture.ExecutionFramework
	 * @generated
	 */
	EClass getExecutionFramework();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.architecture.ExecutionFramework#getDeployedService <em>Deployed Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployed Service</em>'.
	 * @see net.sf.ictalive.service.architecture.ExecutionFramework#getDeployedService()
	 * @see #getExecutionFramework()
	 * @generated
	 */
	EReference getExecutionFramework_DeployedService();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.architecture.ExecutionFramework#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container</em>'.
	 * @see net.sf.ictalive.service.architecture.ExecutionFramework#getContainer()
	 * @see #getExecutionFramework()
	 * @generated
	 */
	EAttribute getExecutionFramework_Container();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.architecture.DeployedService <em>Deployed Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployed Service</em>'.
	 * @see net.sf.ictalive.service.architecture.DeployedService
	 * @generated
	 */
	EClass getDeployedService();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.architecture.DeployedService#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact</em>'.
	 * @see net.sf.ictalive.service.architecture.DeployedService#getArtifact()
	 * @see #getDeployedService()
	 * @generated
	 */
	EAttribute getDeployedService_Artifact();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.ictalive.service.architecture.DeployedService#getDeploy <em>Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Deploy</em>'.
	 * @see net.sf.ictalive.service.architecture.DeployedService#getDeploy()
	 * @see #getDeployedService()
	 * @generated
	 */
	EReference getDeployedService_Deploy();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.service.architecture.ContainerType <em>Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Container Type</em>'.
	 * @see net.sf.ictalive.service.architecture.ContainerType
	 * @generated
	 */
	EEnum getContainerType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArchitectureFactory getArchitectureFactory();

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
		 * The meta object literal for the '{@link net.sf.ictalive.service.architecture.impl.ServiceFrameworkImpl <em>Service Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.architecture.impl.ServiceFrameworkImpl
		 * @see net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl#getServiceFramework()
		 * @generated
		 */
		EClass SERVICE_FRAMEWORK = eINSTANCE.getServiceFramework();

		/**
		 * The meta object literal for the '<em><b>Matchmaker</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_FRAMEWORK__MATCHMAKER = eINSTANCE.getServiceFramework_Matchmaker();

		/**
		 * The meta object literal for the '<em><b>Execution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_FRAMEWORK__EXECUTION = eINSTANCE.getServiceFramework_Execution();

		/**
		 * The meta object literal for the '<em><b>Service Directory</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_FRAMEWORK__SERVICE_DIRECTORY = eINSTANCE.getServiceFramework_ServiceDirectory();

		/**
		 * The meta object literal for the '<em><b>Template Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_FRAMEWORK__TEMPLATE_REPOSITORY = eINSTANCE.getServiceFramework_TemplateRepository();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.architecture.impl.TemplateRepositoryImpl <em>Template Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.architecture.impl.TemplateRepositoryImpl
		 * @see net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl#getTemplateRepository()
		 * @generated
		 */
		EClass TEMPLATE_REPOSITORY = eINSTANCE.getTemplateRepository();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_REPOSITORY__TEMPLATE = eINSTANCE.getTemplateRepository_Template();

		/**
		 * The meta object literal for the '<em><b>Ground Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_REPOSITORY__GROUND_TEMPLATE = eINSTANCE.getTemplateRepository_GroundTemplate();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.architecture.impl.TemplateMatchmakerImpl <em>Template Matchmaker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.architecture.impl.TemplateMatchmakerImpl
		 * @see net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl#getTemplateMatchmaker()
		 * @generated
		 */
		EClass TEMPLATE_MATCHMAKER = eINSTANCE.getTemplateMatchmaker();

		/**
		 * The meta object literal for the '<em><b>Template Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_MATCHMAKER__TEMPLATE_REPOSITORY = eINSTANCE.getTemplateMatchmaker_TemplateRepository();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.architecture.impl.ServiceMatchmakerImpl <em>Service Matchmaker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.architecture.impl.ServiceMatchmakerImpl
		 * @see net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl#getServiceMatchmaker()
		 * @generated
		 */
		EClass SERVICE_MATCHMAKER = eINSTANCE.getServiceMatchmaker();

		/**
		 * The meta object literal for the '<em><b>Service Directory</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MATCHMAKER__SERVICE_DIRECTORY = eINSTANCE.getServiceMatchmaker_ServiceDirectory();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.architecture.impl.ServiceTemplateMatchmakerImpl <em>Service Template Matchmaker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.architecture.impl.ServiceTemplateMatchmakerImpl
		 * @see net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl#getServiceTemplateMatchmaker()
		 * @generated
		 */
		EClass SERVICE_TEMPLATE_MATCHMAKER = eINSTANCE.getServiceTemplateMatchmaker();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.architecture.impl.ServiceDirectoryImpl <em>Service Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.architecture.impl.ServiceDirectoryImpl
		 * @see net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl#getServiceDirectory()
		 * @generated
		 */
		EClass SERVICE_DIRECTORY = eINSTANCE.getServiceDirectory();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DIRECTORY__ENDPOINT = eINSTANCE.getServiceDirectory_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Semantic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DIRECTORY__SEMANTIC = eINSTANCE.getServiceDirectory_Semantic();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DIRECTORY__INTERFACE = eINSTANCE.getServiceDirectory_Interface();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.architecture.impl.ExecutionFrameworkImpl <em>Execution Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.architecture.impl.ExecutionFrameworkImpl
		 * @see net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl#getExecutionFramework()
		 * @generated
		 */
		EClass EXECUTION_FRAMEWORK = eINSTANCE.getExecutionFramework();

		/**
		 * The meta object literal for the '<em><b>Deployed Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_FRAMEWORK__DEPLOYED_SERVICE = eINSTANCE.getExecutionFramework_DeployedService();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_FRAMEWORK__CONTAINER = eINSTANCE.getExecutionFramework_Container();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.architecture.impl.DeployedServiceImpl <em>Deployed Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.architecture.impl.DeployedServiceImpl
		 * @see net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl#getDeployedService()
		 * @generated
		 */
		EClass DEPLOYED_SERVICE = eINSTANCE.getDeployedService();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_SERVICE__ARTIFACT = eINSTANCE.getDeployedService_Artifact();

		/**
		 * The meta object literal for the '<em><b>Deploy</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_SERVICE__DEPLOY = eINSTANCE.getDeployedService_Deploy();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.architecture.ContainerType <em>Container Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.architecture.ContainerType
		 * @see net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl#getContainerType()
		 * @generated
		 */
		EEnum CONTAINER_TYPE = eINSTANCE.getContainerType();

	}

} //ArchitecturePackage
