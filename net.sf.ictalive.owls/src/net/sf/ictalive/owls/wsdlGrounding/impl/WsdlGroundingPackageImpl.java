/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.wsdlGrounding.impl;

import net.sf.ictalive.owls.expr.ExprPackage;

import net.sf.ictalive.owls.expr.impl.ExprPackageImpl;

import net.sf.ictalive.owls.process.ProcessPackage;

import net.sf.ictalive.owls.process.impl.ProcessPackageImpl;

import net.sf.ictalive.owls.profile.ProfilePackage;

import net.sf.ictalive.owls.profile.impl.ProfilePackageImpl;

import net.sf.ictalive.owls.service.ServicePackage;

import net.sf.ictalive.owls.service.impl.ServicePackageImpl;

import net.sf.ictalive.owls.time.TimePackage;

import net.sf.ictalive.owls.time.impl.TimePackageImpl;

import net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding;
import net.sf.ictalive.owls.wsdlGrounding.WsdlGrounding;
import net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingFactory;
import net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage;
import net.sf.ictalive.owls.wsdlGrounding.WsdlInputMessageMap;
import net.sf.ictalive.owls.wsdlGrounding.WsdlMessageMap;
import net.sf.ictalive.owls.wsdlGrounding.WsdlOperationRef;
import net.sf.ictalive.owls.wsdlGrounding.WsdlOutputMessageMap;

import net.sf.ictalive.rules.ruleml.RulemlPackage;

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
public class WsdlGroundingPackageImpl extends EPackageImpl implements WsdlGroundingPackage {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gdEClass = null;

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
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WsdlGroundingPackageImpl() {
		super(eNS_URI, WsdlGroundingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WsdlGroundingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WsdlGroundingPackage init() {
		if (isInited) return (WsdlGroundingPackage)EPackage.Registry.INSTANCE.getEPackage(WsdlGroundingPackage.eNS_URI);

		// Obtain or create and register package
		WsdlGroundingPackageImpl theWsdlGroundingPackage = (WsdlGroundingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WsdlGroundingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WsdlGroundingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RulemlPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ExprPackageImpl theExprPackage = (ExprPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExprPackage.eNS_URI) instanceof ExprPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExprPackage.eNS_URI) : ExprPackage.eINSTANCE);
		ProcessPackageImpl theProcessPackage = (ProcessPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI) instanceof ProcessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI) : ProcessPackage.eINSTANCE);
		ProfilePackageImpl theProfilePackage = (ProfilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProfilePackage.eNS_URI) instanceof ProfilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProfilePackage.eNS_URI) : ProfilePackage.eINSTANCE);
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) instanceof ServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) : ServicePackage.eINSTANCE);
		TimePackageImpl theTimePackage = (TimePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI) instanceof TimePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI) : TimePackage.eINSTANCE);

		// Create package meta-data objects
		theWsdlGroundingPackage.createPackageContents();
		theExprPackage.createPackageContents();
		theProcessPackage.createPackageContents();
		theProfilePackage.createPackageContents();
		theServicePackage.createPackageContents();
		theTimePackage.createPackageContents();

		// Initialize created meta-data
		theWsdlGroundingPackage.initializePackageContents();
		theExprPackage.initializePackageContents();
		theProcessPackage.initializePackageContents();
		theProfilePackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theTimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWsdlGroundingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WsdlGroundingPackage.eNS_URI, theWsdlGroundingPackage);
		return theWsdlGroundingPackage;
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
	public EReference getWsdlAtomicProcessGrounding_WsdlVersion() {
		return (EReference)wsdlAtomicProcessGroundingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWsdlAtomicProcessGrounding_WsdlDocument() {
		return (EReference)wsdlAtomicProcessGroundingEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWsdlAtomicProcessGrounding_WsdlReference() {
		return (EAttribute)wsdlAtomicProcessGroundingEClass.getEStructuralFeatures().get(10);
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
	public EClass getGD() {
		return gdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGD_WsdlGrounding() {
		return (EReference)gdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGD_WsdlAtomicProcessGrounding() {
		return (EReference)gdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlGroundingFactory getWsdlGroundingFactory() {
		return (WsdlGroundingFactory)getEFactoryInstance();
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
		createEReference(wsdlAtomicProcessGroundingEClass, WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION);
		createEReference(wsdlAtomicProcessGroundingEClass, WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_DOCUMENT);
		createEAttribute(wsdlAtomicProcessGroundingEClass, WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_REFERENCE);

		wsdlOperationRefEClass = createEClass(WSDL_OPERATION_REF);
		createEReference(wsdlOperationRefEClass, WSDL_OPERATION_REF__PORT_TYPE);
		createEReference(wsdlOperationRefEClass, WSDL_OPERATION_REF__OPERATION);

		wsdlMessageMapEClass = createEClass(WSDL_MESSAGE_MAP);
		createEReference(wsdlMessageMapEClass, WSDL_MESSAGE_MAP__OWLS_PARAMETER);
		createEReference(wsdlMessageMapEClass, WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART);

		wsdlInputMessageMapEClass = createEClass(WSDL_INPUT_MESSAGE_MAP);

		wsdlOutputMessageMapEClass = createEClass(WSDL_OUTPUT_MESSAGE_MAP);

		gdEClass = createEClass(GD);
		createEReference(gdEClass, GD__WSDL_GROUNDING);
		createEReference(gdEClass, GD__WSDL_ATOMIC_PROCESS_GROUNDING);
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
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		ProcessPackage theProcessPackage = (ProcessPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		wsdlGroundingEClass.getESuperTypes().add(theServicePackage.getServiceGrounding());
		wsdlInputMessageMapEClass.getESuperTypes().add(this.getWsdlMessageMap());
		wsdlOutputMessageMapEClass.getESuperTypes().add(this.getWsdlMessageMap());

		// Initialize classes and features; add operations and parameters
		initEClass(wsdlGroundingEClass, WsdlGrounding.class, "WsdlGrounding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWsdlGrounding_HasAtomicProcessGrounding(), this.getWsdlAtomicProcessGrounding(), null, "hasAtomicProcessGrounding", null, 0, -1, WsdlGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wsdlAtomicProcessGroundingEClass, WsdlAtomicProcessGrounding.class, "WsdlAtomicProcessGrounding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWsdlAtomicProcessGrounding_OwlsProcess(), theProcessPackage.getAtomicProcess(), null, "owlsProcess", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWsdlAtomicProcessGrounding_WsdlOperation(), this.getWsdlOperationRef(), null, "wsdlOperation", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWsdlAtomicProcessGrounding_WsdlInput(), this.getWsdlInputMessageMap(), null, "wsdlInput", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWsdlAtomicProcessGrounding_WsdlOutput(), this.getWsdlOutputMessageMap(), null, "wsdlOutput", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWsdlAtomicProcessGrounding_WsdlService(), ecorePackage.getEObject(), null, "wsdlService", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWsdlAtomicProcessGrounding_WsdlPort(), ecorePackage.getEObject(), null, "wsdlPort", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWsdlAtomicProcessGrounding_WsdlInputMessage(), ecorePackage.getEObject(), null, "wsdlInputMessage", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWsdlAtomicProcessGrounding_WsdlOutputMessage(), ecorePackage.getEObject(), null, "wsdlOutputMessage", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWsdlAtomicProcessGrounding_WsdlVersion(), ecorePackage.getEObject(), null, "wsdlVersion", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWsdlAtomicProcessGrounding_WsdlDocument(), ecorePackage.getEObject(), null, "wsdlDocument", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWsdlAtomicProcessGrounding_WsdlReference(), ecorePackage.getEString(), "wsdlReference", null, 0, 1, WsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wsdlOperationRefEClass, WsdlOperationRef.class, "WsdlOperationRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWsdlOperationRef_PortType(), ecorePackage.getEObject(), null, "portType", null, 0, 1, WsdlOperationRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWsdlOperationRef_Operation(), ecorePackage.getEObject(), null, "operation", null, 0, 1, WsdlOperationRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wsdlMessageMapEClass, WsdlMessageMap.class, "WsdlMessageMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWsdlMessageMap_OwlsParameter(), theProcessPackage.getParameter(), null, "owlsParameter", null, 0, 1, WsdlMessageMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWsdlMessageMap_WsdlMessagePart(), ecorePackage.getEObject(), null, "wsdlMessagePart", null, 0, 1, WsdlMessageMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wsdlInputMessageMapEClass, WsdlInputMessageMap.class, "WsdlInputMessageMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wsdlOutputMessageMapEClass, WsdlOutputMessageMap.class, "WsdlOutputMessageMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gdEClass, net.sf.ictalive.owls.wsdlGrounding.GD.class, "GD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGD_WsdlGrounding(), this.getWsdlGrounding(), null, "wsdlGrounding", null, 0, -1, net.sf.ictalive.owls.wsdlGrounding.GD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGD_WsdlAtomicProcessGrounding(), this.getWsdlAtomicProcessGrounding(), null, "WsdlAtomicProcessGrounding", null, 0, -1, net.sf.ictalive.owls.wsdlGrounding.GD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //WsdlGroundingPackageImpl
