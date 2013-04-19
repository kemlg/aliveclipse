/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics.impl;

import net.sf.ictalive.coordination.actions.ActionsPackage;

import net.sf.ictalive.coordination.agents.AgentsPackage;

import net.sf.ictalive.rules.ruleml.RulemlPackage;

import net.sf.ictalive.rules.swrl.SwrlPackage;

import net.sf.ictalive.schema.SchemaPackage;

import net.sf.ictalive.service.ServicePackage;

import net.sf.ictalive.service.architecture.ArchitecturePackage;

import net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl;

import net.sf.ictalive.service.impl.ServicePackageImpl;

import net.sf.ictalive.service.semantics.ProcessModel;
import net.sf.ictalive.service.semantics.SemanticsFactory;
import net.sf.ictalive.service.semantics.SemanticsPackage;
import net.sf.ictalive.service.semantics.ServiceCategory;
import net.sf.ictalive.service.semantics.ServiceCondition;
import net.sf.ictalive.service.semantics.ServiceGrounding;
import net.sf.ictalive.service.semantics.ServiceInput;
import net.sf.ictalive.service.semantics.ServiceOutput;
import net.sf.ictalive.service.semantics.ServiceParameter;
import net.sf.ictalive.service.semantics.ServiceProfile;
import net.sf.ictalive.service.semantics.ServiceResult;

import net.sf.ictalive.service.semantics.grounding.GroundingPackage;

import net.sf.ictalive.service.semantics.grounding.impl.GroundingPackageImpl;

import net.sf.ictalive.service.syntax.SyntaxPackage;

import net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl;

import net.sf.ictalive.service.template.TemplatePackage;

import net.sf.ictalive.service.template.impl.TemplatePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemanticsPackageImpl extends EPackageImpl implements SemanticsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceGroundingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioepEClass = null;

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
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SemanticsPackageImpl() {
		super(eNS_URI, SemanticsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SemanticsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SemanticsPackage init() {
		if (isInited) return (SemanticsPackage)EPackage.Registry.INSTANCE.getEPackage(SemanticsPackage.eNS_URI);

		// Obtain or create and register package
		SemanticsPackageImpl theSemanticsPackage = (SemanticsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SemanticsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SemanticsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActionsPackage.eINSTANCE.eClass();
		AgentsPackage.eINSTANCE.eClass();
		SwrlPackage.eINSTANCE.eClass();
		SchemaPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) instanceof ServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) : ServicePackage.eINSTANCE);
		SyntaxPackageImpl theSyntaxPackage = (SyntaxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SyntaxPackage.eNS_URI) instanceof SyntaxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SyntaxPackage.eNS_URI) : SyntaxPackage.eINSTANCE);
		GroundingPackageImpl theGroundingPackage = (GroundingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GroundingPackage.eNS_URI) instanceof GroundingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GroundingPackage.eNS_URI) : GroundingPackage.eINSTANCE);
		TemplatePackageImpl theTemplatePackage = (TemplatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI) instanceof TemplatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI) : TemplatePackage.eINSTANCE);
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) instanceof ArchitecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) : ArchitecturePackage.eINSTANCE);

		// Create package meta-data objects
		theSemanticsPackage.createPackageContents();
		theServicePackage.createPackageContents();
		theSyntaxPackage.createPackageContents();
		theGroundingPackage.createPackageContents();
		theTemplatePackage.createPackageContents();
		theArchitecturePackage.createPackageContents();

		// Initialize created meta-data
		theSemanticsPackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theSyntaxPackage.initializePackageContents();
		theGroundingPackage.initializePackageContents();
		theTemplatePackage.initializePackageContents();
		theArchitecturePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSemanticsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SemanticsPackage.eNS_URI, theSemanticsPackage);
		return theSemanticsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceProfile() {
		return serviceProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProfile_PresentedBy() {
		return (EReference)serviceProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProfile_HasProcess() {
		return (EReference)serviceProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProfile_ServiceCategory() {
		return (EReference)serviceProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceProfile_Name() {
		return (EAttribute)serviceProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProfile_HasInput() {
		return (EReference)serviceProfileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProfile_HasOutput() {
		return (EReference)serviceProfileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProfile_HasResult() {
		return (EReference)serviceProfileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProfile_HasCondition() {
		return (EReference)serviceProfileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceProfile_ServiceClassification() {
		return (EAttribute)serviceProfileEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceGrounding() {
		return serviceGroundingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceGrounding_SupportedBy() {
		return (EReference)serviceGroundingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceGrounding_ProcessModel() {
		return (EReference)serviceGroundingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceGrounding_Interface() {
		return (EReference)serviceGroundingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceGrounding_Name() {
		return (EAttribute)serviceGroundingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessModel() {
		return processModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessModel_Name() {
		return (EAttribute)processModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessModel_Describes() {
		return (EReference)processModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceCategory() {
		return serviceCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceCategory_Taxonomy() {
		return (EAttribute)serviceCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceCategory_Value() {
		return (EAttribute)serviceCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceCategory_Name() {
		return (EAttribute)serviceCategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceCategory_Code() {
		return (EAttribute)serviceCategoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceParameter() {
		return serviceParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceParameter_Type() {
		return (EReference)serviceParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceParameter_Name() {
		return (EAttribute)serviceParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceInput() {
		return serviceInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceOutput() {
		return serviceOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceCondition() {
		return serviceConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceCondition_Expression() {
		return (EReference)serviceConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceResult() {
		return serviceResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceResult_Expression() {
		return (EReference)serviceResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceResult_Result() {
		return (EReference)serviceResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOEP() {
		return ioepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIOEP_HasInput() {
		return (EReference)ioepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIOEP_HasCondition() {
		return (EReference)ioepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIOEP_HasOutput() {
		return (EReference)ioepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIOEP_HasResult() {
		return (EReference)ioepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticsFactory getSemanticsFactory() {
		return (SemanticsFactory)getEFactoryInstance();
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
		serviceProfileEClass = createEClass(SERVICE_PROFILE);
		createEReference(serviceProfileEClass, SERVICE_PROFILE__PRESENTED_BY);
		createEReference(serviceProfileEClass, SERVICE_PROFILE__HAS_PROCESS);
		createEReference(serviceProfileEClass, SERVICE_PROFILE__SERVICE_CATEGORY);
		createEAttribute(serviceProfileEClass, SERVICE_PROFILE__NAME);
		createEReference(serviceProfileEClass, SERVICE_PROFILE__HAS_INPUT);
		createEReference(serviceProfileEClass, SERVICE_PROFILE__HAS_OUTPUT);
		createEReference(serviceProfileEClass, SERVICE_PROFILE__HAS_RESULT);
		createEReference(serviceProfileEClass, SERVICE_PROFILE__HAS_CONDITION);
		createEAttribute(serviceProfileEClass, SERVICE_PROFILE__SERVICE_CLASSIFICATION);

		serviceGroundingEClass = createEClass(SERVICE_GROUNDING);
		createEReference(serviceGroundingEClass, SERVICE_GROUNDING__SUPPORTED_BY);
		createEReference(serviceGroundingEClass, SERVICE_GROUNDING__PROCESS_MODEL);
		createEReference(serviceGroundingEClass, SERVICE_GROUNDING__INTERFACE);
		createEAttribute(serviceGroundingEClass, SERVICE_GROUNDING__NAME);

		processModelEClass = createEClass(PROCESS_MODEL);
		createEAttribute(processModelEClass, PROCESS_MODEL__NAME);
		createEReference(processModelEClass, PROCESS_MODEL__DESCRIBES);

		serviceCategoryEClass = createEClass(SERVICE_CATEGORY);
		createEAttribute(serviceCategoryEClass, SERVICE_CATEGORY__TAXONOMY);
		createEAttribute(serviceCategoryEClass, SERVICE_CATEGORY__VALUE);
		createEAttribute(serviceCategoryEClass, SERVICE_CATEGORY__NAME);
		createEAttribute(serviceCategoryEClass, SERVICE_CATEGORY__CODE);

		serviceParameterEClass = createEClass(SERVICE_PARAMETER);
		createEReference(serviceParameterEClass, SERVICE_PARAMETER__TYPE);
		createEAttribute(serviceParameterEClass, SERVICE_PARAMETER__NAME);

		serviceInputEClass = createEClass(SERVICE_INPUT);

		serviceOutputEClass = createEClass(SERVICE_OUTPUT);

		serviceConditionEClass = createEClass(SERVICE_CONDITION);
		createEReference(serviceConditionEClass, SERVICE_CONDITION__EXPRESSION);

		serviceResultEClass = createEClass(SERVICE_RESULT);
		createEReference(serviceResultEClass, SERVICE_RESULT__EXPRESSION);
		createEReference(serviceResultEClass, SERVICE_RESULT__RESULT);

		ioepEClass = createEClass(IOEP);
		createEReference(ioepEClass, IOEP__HAS_INPUT);
		createEReference(ioepEClass, IOEP__HAS_CONDITION);
		createEReference(ioepEClass, IOEP__HAS_OUTPUT);
		createEReference(ioepEClass, IOEP__HAS_RESULT);
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
		GroundingPackage theGroundingPackage = (GroundingPackage)EPackage.Registry.INSTANCE.getEPackage(GroundingPackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		SyntaxPackage theSyntaxPackage = (SyntaxPackage)EPackage.Registry.INSTANCE.getEPackage(SyntaxPackage.eNS_URI);
		RulemlPackage theRulemlPackage = (RulemlPackage)EPackage.Registry.INSTANCE.getEPackage(RulemlPackage.eNS_URI);
		SwrlPackage theSwrlPackage = (SwrlPackage)EPackage.Registry.INSTANCE.getEPackage(SwrlPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theGroundingPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		processModelEClass.getESuperTypes().add(this.getIOEP());
		serviceInputEClass.getESuperTypes().add(this.getServiceParameter());
		serviceOutputEClass.getESuperTypes().add(this.getServiceParameter());

		// Initialize classes and features; add operations and parameters
		initEClass(serviceProfileEClass, ServiceProfile.class, "ServiceProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceProfile_PresentedBy(), theServicePackage.getService(), theServicePackage.getService_Presents(), "presentedBy", null, 0, 1, ServiceProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceProfile_HasProcess(), this.getProcessModel(), null, "hasProcess", null, 0, 1, ServiceProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceProfile_ServiceCategory(), this.getServiceCategory(), null, "serviceCategory", null, 0, 1, ServiceProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceProfile_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceProfile_HasInput(), this.getServiceInput(), null, "hasInput", null, 0, -1, ServiceProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceProfile_HasOutput(), this.getServiceOutput(), null, "hasOutput", null, 0, -1, ServiceProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceProfile_HasResult(), this.getServiceResult(), null, "hasResult", null, 0, -1, ServiceProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceProfile_HasCondition(), this.getServiceCondition(), null, "hasCondition", null, 0, -1, ServiceProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceProfile_ServiceClassification(), ecorePackage.getEString(), "serviceClassification", null, 0, 1, ServiceProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceGroundingEClass, ServiceGrounding.class, "ServiceGrounding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceGrounding_SupportedBy(), theServicePackage.getService(), theServicePackage.getService_Supports(), "supportedBy", null, 0, 1, ServiceGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceGrounding_ProcessModel(), this.getProcessModel(), null, "processModel", null, 0, 1, ServiceGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceGrounding_Interface(), theSyntaxPackage.getInterfaceDescription(), null, "interface", null, 0, 1, ServiceGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceGrounding_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processModelEClass, ProcessModel.class, "ProcessModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModel_Describes(), theServicePackage.getService(), theServicePackage.getService_DescribedBy(), "describes", null, 0, 1, ProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceCategoryEClass, ServiceCategory.class, "ServiceCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceCategory_Taxonomy(), ecorePackage.getEString(), "taxonomy", null, 0, 1, ServiceCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceCategory_Value(), ecorePackage.getEString(), "value", null, 0, 1, ServiceCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceCategory_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceCategory_Code(), ecorePackage.getEString(), "code", null, 0, 1, ServiceCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceParameterEClass, ServiceParameter.class, "ServiceParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceParameter_Type(), ecorePackage.getEObject(), null, "type", null, 0, 1, ServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInputEClass, ServiceInput.class, "ServiceInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceOutputEClass, ServiceOutput.class, "ServiceOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceConditionEClass, ServiceCondition.class, "ServiceCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceCondition_Expression(), theRulemlPackage.getBody(), null, "expression", null, 0, 1, ServiceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceResultEClass, ServiceResult.class, "ServiceResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceResult_Expression(), theRulemlPackage.getBody(), null, "expression", null, 0, 1, ServiceResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceResult_Result(), theSwrlPackage.getAtom(), null, "result", null, 0, 1, ServiceResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ioepEClass, net.sf.ictalive.service.semantics.IOEP.class, "IOEP", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIOEP_HasInput(), this.getServiceInput(), null, "hasInput", null, 0, -1, net.sf.ictalive.service.semantics.IOEP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIOEP_HasCondition(), this.getServiceCondition(), null, "hasCondition", null, 0, -1, net.sf.ictalive.service.semantics.IOEP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIOEP_HasOutput(), this.getServiceOutput(), null, "hasOutput", null, 0, -1, net.sf.ictalive.service.semantics.IOEP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIOEP_HasResult(), this.getServiceResult(), null, "hasResult", null, 0, -1, net.sf.ictalive.service.semantics.IOEP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //SemanticsPackageImpl
