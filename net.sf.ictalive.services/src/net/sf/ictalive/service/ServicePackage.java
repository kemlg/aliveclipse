/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service;

import net.sf.ictalive.coordination.agents.AgentsPackage;

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
 * @see net.sf.ictalive.service.ServiceFactory
 * @model kind="package"
 * @generated
 */
public interface ServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "service";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ict-alive.sourceforge.net/services";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "service";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicePackage eINSTANCE = net.sf.ictalive.service.impl.ServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.impl.ServiceImpl
	 * @see net.sf.ictalive.service.impl.ServicePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ENDPOINT = 3;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Presents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PRESENTS = 5;

	/**
	 * The feature id for the '<em><b>Supports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SUPPORTS = 6;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIBED_BY = 7;

	/**
	 * The feature id for the '<em><b>Adapted By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ADAPTED_BY = 8;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.impl.ServiceProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.impl.ServiceProviderImpl
	 * @see net.sf.ictalive.service.impl.ServicePackageImpl#getServiceProvider()
	 * @generated
	 */
	int SERVICE_PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__NAME = AgentsPackage.AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Has Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__HAS_ROLE = AgentsPackage.AGENT__HAS_ROLE;

	/**
	 * The feature id for the '<em><b>Has Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__HAS_ACTION = AgentsPackage.AGENT__HAS_ACTION;

	/**
	 * The feature id for the '<em><b>As Folder Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__AS_FOLDER_LOCATION = AgentsPackage.AGENT__AS_FOLDER_LOCATION;

	/**
	 * The feature id for the '<em><b>Exposes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__EXPOSES = AgentsPackage.AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__IS_TYPE = AgentsPackage.AGENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__IMPLEMENTATION = AgentsPackage.AGENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_FEATURE_COUNT = AgentsPackage.AGENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.impl.ServiceConsumerImpl <em>Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.impl.ServiceConsumerImpl
	 * @see net.sf.ictalive.service.impl.ServicePackageImpl#getServiceConsumer()
	 * @generated
	 */
	int SERVICE_CONSUMER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSUMER__NAME = AgentsPackage.AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Has Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSUMER__HAS_ROLE = AgentsPackage.AGENT__HAS_ROLE;

	/**
	 * The feature id for the '<em><b>Has Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSUMER__HAS_ACTION = AgentsPackage.AGENT__HAS_ACTION;

	/**
	 * The feature id for the '<em><b>As Folder Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSUMER__AS_FOLDER_LOCATION = AgentsPackage.AGENT__AS_FOLDER_LOCATION;

	/**
	 * The feature id for the '<em><b>Invokes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSUMER__INVOKES = AgentsPackage.AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSUMER__IS_TYPE = AgentsPackage.AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSUMER_FEATURE_COUNT = AgentsPackage.AGENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.impl.SLImpl <em>SL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.impl.SLImpl
	 * @see net.sf.ictalive.service.impl.ServicePackageImpl#getSL()
	 * @generated
	 */
	int SL = 3;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL__SERVICES = 0;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL__PROVIDERS = 1;

	/**
	 * The feature id for the '<em><b>Consumers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL__CONSUMERS = 2;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL__FRAMEWORK = 3;

	/**
	 * The number of structural features of the '<em>SL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.impl.ServiceImplemetationImpl <em>Implemetation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.impl.ServiceImplemetationImpl
	 * @see net.sf.ictalive.service.impl.ServicePackageImpl#getServiceImplemetation()
	 * @generated
	 */
	int SERVICE_IMPLEMETATION = 4;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IMPLEMETATION__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IMPLEMETATION__URI = 1;

	/**
	 * The number of structural features of the '<em>Implemetation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IMPLEMETATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.ServiceType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.ServiceType
	 * @see net.sf.ictalive.service.impl.ServicePackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 5;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.ServiceImpLanguage <em>Imp Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.ServiceImpLanguage
	 * @see net.sf.ictalive.service.impl.ServicePackageImpl#getServiceImpLanguage()
	 * @generated
	 */
	int SERVICE_IMP_LANGUAGE = 6;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see net.sf.ictalive.service.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.service.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.Service#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see net.sf.ictalive.service.Service#getNamespace()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.Service#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.sf.ictalive.service.Service#getDescription()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.Service#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Endpoint</em>'.
	 * @see net.sf.ictalive.service.Service#getEndpoint()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Endpoint();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.Service#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see net.sf.ictalive.service.Service#getInterface()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Interface();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.Service#getPresents <em>Presents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Presents</em>'.
	 * @see net.sf.ictalive.service.Service#getPresents()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Presents();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.Service#getSupports <em>Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supports</em>'.
	 * @see net.sf.ictalive.service.Service#getSupports()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Supports();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.Service#getDescribedBy <em>Described By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Described By</em>'.
	 * @see net.sf.ictalive.service.Service#getDescribedBy()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_DescribedBy();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.Service#getAdaptedBy <em>Adapted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Adapted By</em>'.
	 * @see net.sf.ictalive.service.Service#getAdaptedBy()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_AdaptedBy();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.ServiceProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see net.sf.ictalive.service.ServiceProvider
	 * @generated
	 */
	EClass getServiceProvider();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.service.ServiceProvider#getExposes <em>Exposes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exposes</em>'.
	 * @see net.sf.ictalive.service.ServiceProvider#getExposes()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EReference getServiceProvider_Exposes();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.ServiceProvider#getIsType <em>Is Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Type</em>'.
	 * @see net.sf.ictalive.service.ServiceProvider#getIsType()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EAttribute getServiceProvider_IsType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.ServiceProvider#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implementation</em>'.
	 * @see net.sf.ictalive.service.ServiceProvider#getImplementation()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EReference getServiceProvider_Implementation();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.ServiceConsumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumer</em>'.
	 * @see net.sf.ictalive.service.ServiceConsumer
	 * @generated
	 */
	EClass getServiceConsumer();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.service.ServiceConsumer#getInvokes <em>Invokes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invokes</em>'.
	 * @see net.sf.ictalive.service.ServiceConsumer#getInvokes()
	 * @see #getServiceConsumer()
	 * @generated
	 */
	EReference getServiceConsumer_Invokes();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.ServiceConsumer#getIsType <em>Is Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Type</em>'.
	 * @see net.sf.ictalive.service.ServiceConsumer#getIsType()
	 * @see #getServiceConsumer()
	 * @generated
	 */
	EAttribute getServiceConsumer_IsType();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.SL <em>SL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SL</em>'.
	 * @see net.sf.ictalive.service.SL
	 * @generated
	 */
	EClass getSL();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.SL#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see net.sf.ictalive.service.SL#getServices()
	 * @see #getSL()
	 * @generated
	 */
	EReference getSL_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.SL#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Providers</em>'.
	 * @see net.sf.ictalive.service.SL#getProviders()
	 * @see #getSL()
	 * @generated
	 */
	EReference getSL_Providers();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.SL#getConsumers <em>Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consumers</em>'.
	 * @see net.sf.ictalive.service.SL#getConsumers()
	 * @see #getSL()
	 * @generated
	 */
	EReference getSL_Consumers();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.SL#getFramework <em>Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Framework</em>'.
	 * @see net.sf.ictalive.service.SL#getFramework()
	 * @see #getSL()
	 * @generated
	 */
	EReference getSL_Framework();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.ServiceImplemetation <em>Implemetation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implemetation</em>'.
	 * @see net.sf.ictalive.service.ServiceImplemetation
	 * @generated
	 */
	EClass getServiceImplemetation();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.ServiceImplemetation#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see net.sf.ictalive.service.ServiceImplemetation#getLanguage()
	 * @see #getServiceImplemetation()
	 * @generated
	 */
	EAttribute getServiceImplemetation_Language();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.ServiceImplemetation#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see net.sf.ictalive.service.ServiceImplemetation#getUri()
	 * @see #getServiceImplemetation()
	 * @generated
	 */
	EAttribute getServiceImplemetation_Uri();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.service.ServiceType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see net.sf.ictalive.service.ServiceType
	 * @generated
	 */
	EEnum getServiceType();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.service.ServiceImpLanguage <em>Imp Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Imp Language</em>'.
	 * @see net.sf.ictalive.service.ServiceImpLanguage
	 * @generated
	 */
	EEnum getServiceImpLanguage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServiceFactory getServiceFactory();

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
		 * The meta object literal for the '{@link net.sf.ictalive.service.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.impl.ServiceImpl
		 * @see net.sf.ictalive.service.impl.ServicePackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAMESPACE = eINSTANCE.getService_Namespace();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__DESCRIPTION = eINSTANCE.getService_Description();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__ENDPOINT = eINSTANCE.getService_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__INTERFACE = eINSTANCE.getService_Interface();

		/**
		 * The meta object literal for the '<em><b>Presents</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PRESENTS = eINSTANCE.getService_Presents();

		/**
		 * The meta object literal for the '<em><b>Supports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SUPPORTS = eINSTANCE.getService_Supports();

		/**
		 * The meta object literal for the '<em><b>Described By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__DESCRIBED_BY = eINSTANCE.getService_DescribedBy();

		/**
		 * The meta object literal for the '<em><b>Adapted By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__ADAPTED_BY = eINSTANCE.getService_AdaptedBy();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.impl.ServiceProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.impl.ServiceProviderImpl
		 * @see net.sf.ictalive.service.impl.ServicePackageImpl#getServiceProvider()
		 * @generated
		 */
		EClass SERVICE_PROVIDER = eINSTANCE.getServiceProvider();

		/**
		 * The meta object literal for the '<em><b>Exposes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROVIDER__EXPOSES = eINSTANCE.getServiceProvider_Exposes();

		/**
		 * The meta object literal for the '<em><b>Is Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROVIDER__IS_TYPE = eINSTANCE.getServiceProvider_IsType();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROVIDER__IMPLEMENTATION = eINSTANCE.getServiceProvider_Implementation();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.impl.ServiceConsumerImpl <em>Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.impl.ServiceConsumerImpl
		 * @see net.sf.ictalive.service.impl.ServicePackageImpl#getServiceConsumer()
		 * @generated
		 */
		EClass SERVICE_CONSUMER = eINSTANCE.getServiceConsumer();

		/**
		 * The meta object literal for the '<em><b>Invokes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONSUMER__INVOKES = eINSTANCE.getServiceConsumer_Invokes();

		/**
		 * The meta object literal for the '<em><b>Is Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONSUMER__IS_TYPE = eINSTANCE.getServiceConsumer_IsType();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.impl.SLImpl <em>SL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.impl.SLImpl
		 * @see net.sf.ictalive.service.impl.ServicePackageImpl#getSL()
		 * @generated
		 */
		EClass SL = eINSTANCE.getSL();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SL__SERVICES = eINSTANCE.getSL_Services();

		/**
		 * The meta object literal for the '<em><b>Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SL__PROVIDERS = eINSTANCE.getSL_Providers();

		/**
		 * The meta object literal for the '<em><b>Consumers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SL__CONSUMERS = eINSTANCE.getSL_Consumers();

		/**
		 * The meta object literal for the '<em><b>Framework</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SL__FRAMEWORK = eINSTANCE.getSL_Framework();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.impl.ServiceImplemetationImpl <em>Implemetation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.impl.ServiceImplemetationImpl
		 * @see net.sf.ictalive.service.impl.ServicePackageImpl#getServiceImplemetation()
		 * @generated
		 */
		EClass SERVICE_IMPLEMETATION = eINSTANCE.getServiceImplemetation();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_IMPLEMETATION__LANGUAGE = eINSTANCE.getServiceImplemetation_Language();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_IMPLEMETATION__URI = eINSTANCE.getServiceImplemetation_Uri();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.ServiceType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.ServiceType
		 * @see net.sf.ictalive.service.impl.ServicePackageImpl#getServiceType()
		 * @generated
		 */
		EEnum SERVICE_TYPE = eINSTANCE.getServiceType();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.ServiceImpLanguage <em>Imp Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.ServiceImpLanguage
		 * @see net.sf.ictalive.service.impl.ServicePackageImpl#getServiceImpLanguage()
		 * @generated
		 */
		EEnum SERVICE_IMP_LANGUAGE = eINSTANCE.getServiceImpLanguage();

	}

} //ServicePackage
