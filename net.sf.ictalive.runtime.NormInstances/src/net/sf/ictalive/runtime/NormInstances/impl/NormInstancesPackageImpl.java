/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.NormInstances.impl;

import net.sf.ictalive.operetta.OM.OMPackage;

import net.sf.ictalive.runtime.NormInstances.NormInstance;
import net.sf.ictalive.runtime.NormInstances.NormInstancesFactory;
import net.sf.ictalive.runtime.NormInstances.NormInstancesPackage;
import net.sf.ictalive.runtime.NormInstances.PartialStateDescriptionInstance;
import net.sf.ictalive.runtime.NormInstances.Value;

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
public class NormInstancesPackageImpl extends EPackageImpl implements NormInstancesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialStateDescriptionInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

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
	 * @see net.sf.ictalive.runtime.NormInstances.NormInstancesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NormInstancesPackageImpl() {
		super(eNS_URI, NormInstancesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NormInstancesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NormInstancesPackage init() {
		if (isInited) return (NormInstancesPackage)EPackage.Registry.INSTANCE.getEPackage(NormInstancesPackage.eNS_URI);

		// Obtain or create and register package
		NormInstancesPackageImpl theNormInstancesPackage = (NormInstancesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NormInstancesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NormInstancesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OMPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theNormInstancesPackage.createPackageContents();

		// Initialize created meta-data
		theNormInstancesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNormInstancesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NormInstancesPackage.eNS_URI, theNormInstancesPackage);
		return theNormInstancesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormInstance() {
		return normInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormInstance_Norm() {
		return (EReference)normInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormInstance_Name() {
		return (EAttribute)normInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormInstance_PartialStateDescriptionInstance() {
		return (EReference)normInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartialStateDescriptionInstance() {
		return partialStateDescriptionInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialStateDescriptionInstance_PartialStateDescription() {
		return (EReference)partialStateDescriptionInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartialStateDescriptionInstance_Name() {
		return (EAttribute)partialStateDescriptionInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialStateDescriptionInstance_Value() {
		return (EReference)partialStateDescriptionInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValue_Of() {
		return (EReference)valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValue_Value() {
		return (EAttribute)valueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormInstancesFactory getNormInstancesFactory() {
		return (NormInstancesFactory)getEFactoryInstance();
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
		normInstanceEClass = createEClass(NORM_INSTANCE);
		createEReference(normInstanceEClass, NORM_INSTANCE__NORM);
		createEAttribute(normInstanceEClass, NORM_INSTANCE__NAME);
		createEReference(normInstanceEClass, NORM_INSTANCE__PARTIAL_STATE_DESCRIPTION_INSTANCE);

		partialStateDescriptionInstanceEClass = createEClass(PARTIAL_STATE_DESCRIPTION_INSTANCE);
		createEReference(partialStateDescriptionInstanceEClass, PARTIAL_STATE_DESCRIPTION_INSTANCE__PARTIAL_STATE_DESCRIPTION);
		createEAttribute(partialStateDescriptionInstanceEClass, PARTIAL_STATE_DESCRIPTION_INSTANCE__NAME);
		createEReference(partialStateDescriptionInstanceEClass, PARTIAL_STATE_DESCRIPTION_INSTANCE__VALUE);

		valueEClass = createEClass(VALUE);
		createEReference(valueEClass, VALUE__OF);
		createEAttribute(valueEClass, VALUE__VALUE);
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
		OMPackage theOMPackage = (OMPackage)EPackage.Registry.INSTANCE.getEPackage(OMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(normInstanceEClass, NormInstance.class, "NormInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormInstance_Norm(), theOMPackage.getNorm(), null, "norm", null, 1, 1, NormInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNormInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, NormInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNormInstance_PartialStateDescriptionInstance(), this.getPartialStateDescriptionInstance(), null, "partialStateDescriptionInstance", null, 0, -1, NormInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partialStateDescriptionInstanceEClass, PartialStateDescriptionInstance.class, "PartialStateDescriptionInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartialStateDescriptionInstance_PartialStateDescription(), theOMPackage.getPartialStateDescription(), null, "partialStateDescription", null, 1, 1, PartialStateDescriptionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartialStateDescriptionInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, PartialStateDescriptionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialStateDescriptionInstance_Value(), this.getValue(), null, "value", null, 0, -1, PartialStateDescriptionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValue_Of(), theOMPackage.getVariable(), null, "of", null, 1, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //NormInstancesPackageImpl
