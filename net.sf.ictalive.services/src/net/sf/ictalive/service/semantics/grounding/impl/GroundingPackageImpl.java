/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics.grounding.impl;

import net.sf.ictalive.coordination.actions.ActionsPackage;

import net.sf.ictalive.coordination.agents.AgentsPackage;

import net.sf.ictalive.rules.swrl.SwrlPackage;

import net.sf.ictalive.schema.SchemaPackage;

import net.sf.ictalive.service.ServicePackage;

import net.sf.ictalive.service.architecture.ArchitecturePackage;

import net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl;

import net.sf.ictalive.service.impl.ServicePackageImpl;

import net.sf.ictalive.service.semantics.SemanticsPackage;

import net.sf.ictalive.service.semantics.grounding.GroundingFactory;
import net.sf.ictalive.service.semantics.grounding.GroundingPackage;
import net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding;
import net.sf.ictalive.service.semantics.grounding.WsdlGrounding;
import net.sf.ictalive.service.semantics.grounding.WsdlInputMessageMap;
import net.sf.ictalive.service.semantics.grounding.WsdlMessageMap;
import net.sf.ictalive.service.semantics.grounding.WsdlOperationRef;
import net.sf.ictalive.service.semantics.grounding.WsdlOutputMessageMap;

import net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl;

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
public class GroundingPackageImpl extends EPackageImpl implements GroundingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsdlGroundingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsdlAtomicProcessGroundingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsdlOperationRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsdlMessageMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsdlInputMessageMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsdlOutputMessageMapEClass = null;

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
	 * @see net.sf.ictalive.service.semantics.grounding.GroundingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GroundingPackageImpl() {
		super(eNS_URI, GroundingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GroundingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GroundingPackage init() {
		if (isInited) return (GroundingPackage)EPackage.Registry.INSTANCE.getEPackage(GroundingPackage.eNS_URI);

		// Obtain or create and register package
		GroundingPackageImpl theGroundingPackage = (GroundingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GroundingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GroundingPackageImpl());

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
		TemplatePackageImpl theTemplatePackage = (TemplatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI) instanceof TemplatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI) : TemplatePackage.eINSTANCE);
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) instanceof ArchitecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) : ArchitecturePackage.eINSTANCE);

		// Create package meta-data objects
		theGroundingPackage.createPackageContents();
		theServicePackage.createPackageContents();
		theSyntaxPackage.createPackageContents();
		theSemanticsPackage.createPackageContents();
		theTemplatePackage.createPackageContents();
		theArchitecturePackage.createPackageContents();

		// Initialize created meta-data
		theGroundingPackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theSyntaxPackage.initializePackageContents();
		theSemanticsPackage.initializePackageContents();
		theTemplatePackage.initializePackageContents();
		theArchitecturePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGroundingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GroundingPackage.eNS_URI, theGroundingPackage);
		return theGroundingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWsdlGrounding() {
		return wsdlGroundingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWsdlGrounding_HasAtomicProcessGrounding() {
		return (EReference)wsdlGroundingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWsdlAtomicProcessGrounding() {
		return wsdlAtomicProcessGroundingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWsdlAtomicProcessGrounding_OwlsProcess() {
		return (EReference)wsdlAtomicProcessGroundingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWsdlAtomicProcessGrounding_WsdlOperation() {
		return (EReference)wsdlAtomicProcessGroundingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWsdlAtomicProcessGrounding_WsdlInput() {
		return (EReference)wsdlAtomicProcessGroundingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWsdlAtomicProcessGrounding_WsdlOutput() {
		return (EReference)wsdlAtomicProcessGroundingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWsdlAtomicProcessGrounding_WsdlService() {
		return (EReference)wsdlAtomicProcessGroundingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWsdlAtomicProcessGrounding_WsdlPort() {
		return (EReference)wsdlAtomicProcessGroundingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWsdlAtomicProcessGrounding_WsdlInputMessage() {
		return (EReference)wsdlAtomicProcessGroundingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWsdlAtomicProcessGrounding_WsdlOutputMessage() {
		return (EReference)wsdlAtomicProcessGroundingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWsdlAtomicProcessGrounding_WsdlReference() {
		return (EAttribute)wsdlAtomicProcessGroundingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWsdlAtomicProcessGrounding_WsdlVersion() {
		return (EAttribute)wsdlAtomicProcessGroundingEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWsdlAtomicProcessGrounding_WsdlDocument() {
		return (EAttribute)wsdlAtomicProcessGroundingEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWsdlAtomicProcessGrounding_Name() {
		return (EAttribute)wsdlAtomicProcessGroundingEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWsdlOperationRef() {
		return wsdlOperationRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWsdlOperationRef_PortType() {
		return (EReference)wsdlOperationRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWsdlOperationRef_Operation() {
		return (EReference)wsdlOperationRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWsdlMessageMap() {
		return wsdlMessageMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWsdlMessageMap_OwlsParameter() {
		return (EReference)wsdlMessageMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWsdlMessageMap_WsdlMessagePart() {
		return (EReference)wsdlMessageMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWsdlInputMessageMap() {
		return wsdlInputMessageMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWsdlOutputMessageMap() {
		return wsdlOutputMessageMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundingFactory getGroundingFactory() {
		return (GroundingFactory)getEFactoryInstance();
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
		wsdlGroundingEClass = createEClass(WSDL_GROUNDING);
		createEReference(wsdlGroundingEClass, WSDL_GROUNDING__HAS_ATOMIC_PROCESS_GROUNDING);

		wsdlAtomicProcessGroundingEClass = createEClass(WSDL_ATOMIC_PROCESS_GROUNDING);
		createEReference(wsdlAtomicProcessGroundingEClass, WSDL_ATOMIC_PROCESS_GROUNDING__OWLS_PROCESS);
		createEReference(wsdlAtomicProcessGroundingEClass, WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OPERATION);
		createEReference(wsdlAtomicProcessGroundingEClass, WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT);
		createEReference(wsdlAtomicProcessGroundingEClass, WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT);
		createEReference(wsdlAtomicProcessGroundingEClass, WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE);
		createEReference(wsdlAtomicProcessGroundingEClass, WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT);
		createEReference(wsdlAtomicProcessGroundingEClass, WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE);
		createEReference(wsdlAtomicProcessGroundingEClass, WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE);
		createEAttribute(wsdlAtomicProcessGroundingEClass, WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_REFERENCE);
		createEAttribute(wsdlAtomicProcessGroundingEClass, WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION);
		createEAttribute(wsdlAtomicProcessGroundingEClass, WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_DOCUMENT);
		createEAttribute(wsdlAtomicProcessGroundingEClass, WSDL_ATOMIC_PROCESS_GROUNDING__NAME);

		wsdlOperationRefEClass = createEClass(WSDL_OPERATION_REF);
		createEReference(wsdlOperationRefEClass, WSDL_OPERATION_REF__PORT_TYPE);
		createEReference(wsdlOperationRefEClass, WSDL_OPERATION_REF__OPERATION);

		wsdlMessageMapEClass = createEClass(WSDL_MESSAGE_MAP);
		createEReference(wsdlMessageMapEClass, WSDL_MESSAGE_MAP__OWLS_PARAMETER);
		createEReference(wsdlMessageMapEClass, WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART);

		wsdlInputMessageMapEClass = createEClass(WSDL_INPUT_MESSAGE_MAP);

		wsdlOutputMessageMapEClass = createEClass(WSDL_OUTPUT_MESSAGE_MAP);
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
		SemanticsPackage theSemanticsPackage = (SemanticsPackage)EPackage.Registry.INSTANCE.getEPackage(SemanticsPackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		SyntaxPackage theSyntaxPackage = (SyntaxPackage)EPackage.Registry.INSTANCE.getEPackage(SyntaxPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		wsdlGroundingEClass.getESuperTypes().add(theSemanticsPackage.getServiceGrounding());
		wsdlInputMessageMapEClass.getESuperTypes().add(this.getWsdlMessageMap());
		wsdlOutputMessageMapEClass.getESuperTypes().add(this.getWsdlMessageMap());

		// Initialize classes and features; add operations and parameters
		initEClass(wsdlGroundingEClass, WsdlGrounding.class, "WsdlGrounding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWsdlGrounding_HasAtomicProcessGrounding(), this.getWsdlAtomicProcessGrounding(), null, "hasAtomicProcessGrounding", null, 0, -1, WsdlGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wsdlAtomicProcessGroundingEClass, WsdlAtomicProcessGrounding.class, "WsdlAtomicProcessGrounding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWsdlAtomicProcessGrounding_OwlsProcess(), theSemanticsPackage.getProcessModel(), null, "owlsProcess", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWsdlAtomicProcessGrounding_WsdlOperation(), this.getWsdlOperationRef(), null, "wsdlOperation", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWsdlAtomicProcessGrounding_WsdlInput(), this.getWsdlInputMessageMap(), null, "wsdlInput", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWsdlAtomicProcessGrounding_WsdlOutput(), this.getWsdlOutputMessageMap(), null, "wsdlOutput", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWsdlAtomicProcessGrounding_WsdlService(), theServicePackage.getService(), null, "wsdlService", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWsdlAtomicProcessGrounding_WsdlPort(), theSyntaxPackage.getEndpoint(), null, "wsdlPort", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWsdlAtomicProcessGrounding_WsdlInputMessage(), theSyntaxPackage.getMessage(), null, "wsdlInputMessage", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWsdlAtomicProcessGrounding_WsdlOutputMessage(), theSyntaxPackage.getMessage(), null, "wsdlOutputMessage", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWsdlAtomicProcessGrounding_WsdlReference(), ecorePackage.getEString(), "wsdlReference", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWsdlAtomicProcessGrounding_WsdlVersion(), ecorePackage.getEString(), "wsdlVersion", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWsdlAtomicProcessGrounding_WsdlDocument(), ecorePackage.getEString(), "wsdlDocument", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWsdlAtomicProcessGrounding_Name(), ecorePackage.getEString(), "name", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wsdlOperationRefEClass, WsdlOperationRef.class, "WsdlOperationRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWsdlOperationRef_PortType(), theSyntaxPackage.getInterfaceDescription(), null, "portType", null, 0, 1, WsdlOperationRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWsdlOperationRef_Operation(), theSyntaxPackage.getOperationDescription(), null, "operation", null, 0, 1, WsdlOperationRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wsdlMessageMapEClass, WsdlMessageMap.class, "WsdlMessageMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWsdlMessageMap_OwlsParameter(), theSemanticsPackage.getServiceParameter(), null, "owlsParameter", null, 0, 1, WsdlMessageMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWsdlMessageMap_WsdlMessagePart(), theSyntaxPackage.getPart(), null, "wsdlMessagePart", null, 0, 1, WsdlMessageMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wsdlInputMessageMapEClass, WsdlInputMessageMap.class, "WsdlInputMessageMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wsdlOutputMessageMapEClass, WsdlOutputMessageMap.class, "WsdlOutputMessageMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //GroundingPackageImpl
