/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.architecture.impl;

import net.sf.ictalive.coordination.actions.ActionsPackage;

import net.sf.ictalive.coordination.agents.AgentsPackage;

import net.sf.ictalive.rules.swrl.SwrlPackage;

import net.sf.ictalive.schema.SchemaPackage;

import net.sf.ictalive.service.ServicePackage;

import net.sf.ictalive.service.architecture.ArchitectureFactory;
import net.sf.ictalive.service.architecture.ArchitecturePackage;
import net.sf.ictalive.service.architecture.ContainerType;
import net.sf.ictalive.service.architecture.DeployedService;
import net.sf.ictalive.service.architecture.ExecutionFramework;
import net.sf.ictalive.service.architecture.ServiceDirectory;
import net.sf.ictalive.service.architecture.ServiceFramework;
import net.sf.ictalive.service.architecture.ServiceMatchmaker;
import net.sf.ictalive.service.architecture.ServiceTemplateMatchmaker;
import net.sf.ictalive.service.architecture.TemplateMatchmaker;
import net.sf.ictalive.service.architecture.TemplateRepository;

import net.sf.ictalive.service.impl.ServicePackageImpl;

import net.sf.ictalive.service.semantics.SemanticsPackage;

import net.sf.ictalive.service.semantics.grounding.GroundingPackage;

import net.sf.ictalive.service.semantics.grounding.impl.GroundingPackageImpl;

import net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl;

import net.sf.ictalive.service.syntax.SyntaxPackage;

import net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl;

import net.sf.ictalive.service.template.TemplatePackage;

import net.sf.ictalive.service.template.impl.TemplatePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitecturePackageImpl extends EPackageImpl implements ArchitecturePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceFrameworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateMatchmakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceMatchmakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTemplateMatchmakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDirectoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionFrameworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployedServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum containerTypeEEnum = null;

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
	 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArchitecturePackageImpl() {
		super(eNS_URI, ArchitectureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArchitecturePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArchitecturePackage init() {
		if (isInited) return (ArchitecturePackage)EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI);

		// Obtain or create and register package
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArchitecturePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArchitecturePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActionsPackage.eINSTANCE.eClass();
		AgentsPackage.eINSTANCE.eClass();
		SwrlPackage.eINSTANCE.eClass();
		SchemaPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) instanceof ServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) : ServicePackage.eINSTANCE);
		SyntaxPackageImpl theSyntaxPackage = (SyntaxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SyntaxPackage.eNS_URI) instanceof SyntaxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SyntaxPackage.eNS_URI) : SyntaxPackage.eINSTANCE);
		SemanticsPackageImpl theSemanticsPackage = (SemanticsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SemanticsPackage.eNS_URI) instanceof SemanticsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SemanticsPackage.eNS_URI) : SemanticsPackage.eINSTANCE);
		GroundingPackageImpl theGroundingPackage = (GroundingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GroundingPackage.eNS_URI) instanceof GroundingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GroundingPackage.eNS_URI) : GroundingPackage.eINSTANCE);
		TemplatePackageImpl theTemplatePackage = (TemplatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI) instanceof TemplatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI) : TemplatePackage.eINSTANCE);

		// Create package meta-data objects
		theArchitecturePackage.createPackageContents();
		theServicePackage.createPackageContents();
		theSyntaxPackage.createPackageContents();
		theSemanticsPackage.createPackageContents();
		theGroundingPackage.createPackageContents();
		theTemplatePackage.createPackageContents();

		// Initialize created meta-data
		theArchitecturePackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theSyntaxPackage.initializePackageContents();
		theSemanticsPackage.initializePackageContents();
		theGroundingPackage.initializePackageContents();
		theTemplatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArchitecturePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArchitecturePackage.eNS_URI, theArchitecturePackage);
		return theArchitecturePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceFramework() {
		return serviceFrameworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceFramework_Matchmaker() {
		return (EReference)serviceFrameworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceFramework_Execution() {
		return (EReference)serviceFrameworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceFramework_ServiceDirectory() {
		return (EReference)serviceFrameworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceFramework_TemplateRepository() {
		return (EReference)serviceFrameworkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateRepository() {
		return templateRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateRepository_Template() {
		return (EReference)templateRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateRepository_GroundTemplate() {
		return (EReference)templateRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateMatchmaker() {
		return templateMatchmakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateMatchmaker_TemplateRepository() {
		return (EReference)templateMatchmakerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceMatchmaker() {
		return serviceMatchmakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceMatchmaker_ServiceDirectory() {
		return (EReference)serviceMatchmakerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceTemplateMatchmaker() {
		return serviceTemplateMatchmakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDirectory() {
		return serviceDirectoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDirectory_Endpoint() {
		return (EReference)serviceDirectoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDirectory_Semantic() {
		return (EReference)serviceDirectoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDirectory_Interface() {
		return (EReference)serviceDirectoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionFramework() {
		return executionFrameworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionFramework_DeployedService() {
		return (EReference)executionFrameworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionFramework_Container() {
		return (EAttribute)executionFrameworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployedService() {
		return deployedServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployedService_Artifact() {
		return (EAttribute)deployedServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployedService_Deploy() {
		return (EReference)deployedServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContainerType() {
		return containerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureFactory getArchitectureFactory() {
		return (ArchitectureFactory)getEFactoryInstance();
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
		serviceFrameworkEClass = createEClass(SERVICE_FRAMEWORK);
		createEReference(serviceFrameworkEClass, SERVICE_FRAMEWORK__MATCHMAKER);
		createEReference(serviceFrameworkEClass, SERVICE_FRAMEWORK__EXECUTION);
		createEReference(serviceFrameworkEClass, SERVICE_FRAMEWORK__SERVICE_DIRECTORY);
		createEReference(serviceFrameworkEClass, SERVICE_FRAMEWORK__TEMPLATE_REPOSITORY);

		templateRepositoryEClass = createEClass(TEMPLATE_REPOSITORY);
		createEReference(templateRepositoryEClass, TEMPLATE_REPOSITORY__TEMPLATE);
		createEReference(templateRepositoryEClass, TEMPLATE_REPOSITORY__GROUND_TEMPLATE);

		templateMatchmakerEClass = createEClass(TEMPLATE_MATCHMAKER);
		createEReference(templateMatchmakerEClass, TEMPLATE_MATCHMAKER__TEMPLATE_REPOSITORY);

		serviceMatchmakerEClass = createEClass(SERVICE_MATCHMAKER);
		createEReference(serviceMatchmakerEClass, SERVICE_MATCHMAKER__SERVICE_DIRECTORY);

		serviceTemplateMatchmakerEClass = createEClass(SERVICE_TEMPLATE_MATCHMAKER);

		serviceDirectoryEClass = createEClass(SERVICE_DIRECTORY);
		createEReference(serviceDirectoryEClass, SERVICE_DIRECTORY__ENDPOINT);
		createEReference(serviceDirectoryEClass, SERVICE_DIRECTORY__SEMANTIC);
		createEReference(serviceDirectoryEClass, SERVICE_DIRECTORY__INTERFACE);

		executionFrameworkEClass = createEClass(EXECUTION_FRAMEWORK);
		createEReference(executionFrameworkEClass, EXECUTION_FRAMEWORK__DEPLOYED_SERVICE);
		createEAttribute(executionFrameworkEClass, EXECUTION_FRAMEWORK__CONTAINER);

		deployedServiceEClass = createEClass(DEPLOYED_SERVICE);
		createEAttribute(deployedServiceEClass, DEPLOYED_SERVICE__ARTIFACT);
		createEReference(deployedServiceEClass, DEPLOYED_SERVICE__DEPLOY);

		// Create enums
		containerTypeEEnum = createEEnum(CONTAINER_TYPE);
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
		TemplatePackage theTemplatePackage = (TemplatePackage)EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI);
		SyntaxPackage theSyntaxPackage = (SyntaxPackage)EPackage.Registry.INSTANCE.getEPackage(SyntaxPackage.eNS_URI);
		SemanticsPackage theSemanticsPackage = (SemanticsPackage)EPackage.Registry.INSTANCE.getEPackage(SemanticsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serviceTemplateMatchmakerEClass.getESuperTypes().add(this.getServiceMatchmaker());
		serviceTemplateMatchmakerEClass.getESuperTypes().add(this.getTemplateMatchmaker());

		// Initialize classes and features; add operations and parameters
		initEClass(serviceFrameworkEClass, ServiceFramework.class, "ServiceFramework", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceFramework_Matchmaker(), this.getServiceTemplateMatchmaker(), null, "matchmaker", null, 1, -1, ServiceFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceFramework_Execution(), this.getExecutionFramework(), null, "execution", null, 0, 1, ServiceFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceFramework_ServiceDirectory(), this.getServiceDirectory(), null, "serviceDirectory", null, 1, -1, ServiceFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceFramework_TemplateRepository(), this.getTemplateRepository(), null, "templateRepository", null, 1, 1, ServiceFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateRepositoryEClass, TemplateRepository.class, "TemplateRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateRepository_Template(), theTemplatePackage.getServiceTemplate(), null, "template", null, 0, -1, TemplateRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateRepository_GroundTemplate(), theTemplatePackage.getGroundTemplate(), null, "groundTemplate", null, 0, -1, TemplateRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateMatchmakerEClass, TemplateMatchmaker.class, "TemplateMatchmaker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateMatchmaker_TemplateRepository(), this.getTemplateRepository(), null, "templateRepository", null, 1, 1, TemplateMatchmaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceMatchmakerEClass, ServiceMatchmaker.class, "ServiceMatchmaker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceMatchmaker_ServiceDirectory(), this.getServiceDirectory(), null, "serviceDirectory", null, 1, -1, ServiceMatchmaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceTemplateMatchmakerEClass, ServiceTemplateMatchmaker.class, "ServiceTemplateMatchmaker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceDirectoryEClass, ServiceDirectory.class, "ServiceDirectory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceDirectory_Endpoint(), theSyntaxPackage.getEndpoint(), null, "endpoint", null, 0, -1, ServiceDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDirectory_Semantic(), theSemanticsPackage.getServiceProfile(), null, "semantic", null, 0, 1, ServiceDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDirectory_Interface(), theSyntaxPackage.getInterfaceDescription(), null, "interface", null, 0, -1, ServiceDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionFrameworkEClass, ExecutionFramework.class, "ExecutionFramework", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionFramework_DeployedService(), this.getDeployedService(), this.getDeployedService_Deploy(), "deployedService", null, 0, -1, ExecutionFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionFramework_Container(), this.getContainerType(), "container", null, 0, 1, ExecutionFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deployedServiceEClass, DeployedService.class, "DeployedService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeployedService_Artifact(), ecorePackage.getEString(), "artifact", null, 0, 1, DeployedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployedService_Deploy(), this.getExecutionFramework(), this.getExecutionFramework_DeployedService(), "deploy", null, 1, 1, DeployedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(containerTypeEEnum, ContainerType.class, "ContainerType");
		addEEnumLiteral(containerTypeEEnum, ContainerType.AXIS);
	}

} //ArchitecturePackageImpl
