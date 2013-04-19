/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.swrl.impl;

import net.sf.ictalive.operetta.OM.OMPackage;

import net.sf.ictalive.rules.ruleml.RulemlPackage;

import net.sf.ictalive.rules.ruleml.impl.RulemlPackageImpl;

import net.sf.ictalive.rules.swrl.Atom;
import net.sf.ictalive.rules.swrl.AtomList;
import net.sf.ictalive.rules.swrl.BuiltInAtom;
import net.sf.ictalive.rules.swrl.ClassAtom;
import net.sf.ictalive.rules.swrl.DObject;
import net.sf.ictalive.rules.swrl.DataLiteral;
import net.sf.ictalive.rules.swrl.DataRangeAtom;
import net.sf.ictalive.rules.swrl.DataType;
import net.sf.ictalive.rules.swrl.DataValue;
import net.sf.ictalive.rules.swrl.DataVariable;
import net.sf.ictalive.rules.swrl.DatavaluedPropertyAtom;
import net.sf.ictalive.rules.swrl.DefaultBuiltIn;
import net.sf.ictalive.rules.swrl.DifferentIndividualsAtom;
import net.sf.ictalive.rules.swrl.IObject;
import net.sf.ictalive.rules.swrl.IndividualID;
import net.sf.ictalive.rules.swrl.IndividualPropertyAtom;
import net.sf.ictalive.rules.swrl.IndividualVariable;
import net.sf.ictalive.rules.swrl.SameIndividualAtom;
import net.sf.ictalive.rules.swrl.SwrlFactory;
import net.sf.ictalive.rules.swrl.SwrlPackage;

import net.sf.ictalive.runtime.NormInstances.NormInstancesPackage;

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
public class SwrlPackageImpl extends EPackageImpl implements SwrlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builtInAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualPropertyAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sameIndividualAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass differentIndividualsAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datavaluedPropertyAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRangeAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum defaultBuiltInEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

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
	 * @see net.sf.ictalive.rules.swrl.SwrlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SwrlPackageImpl() {
		super(eNS_URI, SwrlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SwrlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SwrlPackage init() {
		if (isInited) return (SwrlPackage)EPackage.Registry.INSTANCE.getEPackage(SwrlPackage.eNS_URI);

		// Obtain or create and register package
		SwrlPackageImpl theSwrlPackage = (SwrlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SwrlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SwrlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OMPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulemlPackageImpl theRulemlPackage = (RulemlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulemlPackage.eNS_URI) instanceof RulemlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulemlPackage.eNS_URI) : RulemlPackage.eINSTANCE);

		// Create package meta-data objects
		theSwrlPackage.createPackageContents();
		theRulemlPackage.createPackageContents();

		// Initialize created meta-data
		theSwrlPackage.initializePackageContents();
		theRulemlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSwrlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SwrlPackage.eNS_URI, theSwrlPackage);
		return theSwrlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomList() {
		return atomListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomList_Atom() {
		return (EReference)atomListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuiltInAtom() {
		return builtInAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuiltInAtom_BuiltIn() {
		return (EAttribute)builtInAtomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuiltInAtom_BuiltInAtom() {
		return (EReference)builtInAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuiltInAtom_Args() {
		return (EReference)builtInAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassAtom() {
		return classAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAtom_ClassPredicate() {
		return (EReference)classAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAtom_Argument1() {
		return (EReference)classAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualPropertyAtom() {
		return individualPropertyAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualPropertyAtom_PropertyPredicate() {
		return (EReference)individualPropertyAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualPropertyAtom_Argument1() {
		return (EReference)individualPropertyAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualPropertyAtom_Argument2() {
		return (EReference)individualPropertyAtomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSameIndividualAtom() {
		return sameIndividualAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSameIndividualAtom_Args() {
		return (EReference)sameIndividualAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDifferentIndividualsAtom() {
		return differentIndividualsAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDifferentIndividualsAtom_Args() {
		return (EReference)differentIndividualsAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatavaluedPropertyAtom() {
		return datavaluedPropertyAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatavaluedPropertyAtom_PropertyPredicate() {
		return (EReference)datavaluedPropertyAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatavaluedPropertyAtom_Argument2() {
		return (EReference)datavaluedPropertyAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatavaluedPropertyAtom_Argument1() {
		return (EReference)datavaluedPropertyAtomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRangeAtom() {
		return dataRangeAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataRangeAtom_DataType() {
		return (EReference)dataRangeAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataRangeAtom_OneOf() {
		return (EReference)dataRangeAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataRangeAtom_Argument1() {
		return (EReference)dataRangeAtomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataValue() {
		return dataValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataValue_ConceptType() {
		return (EReference)dataValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataValue_Literal() {
		return (EAttribute)dataValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataValue_Type() {
		return (EAttribute)dataValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtom() {
		return atomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIObject() {
		return iObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDObject() {
		return dObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualVariable() {
		return individualVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndividualVariable_Name() {
		return (EAttribute)individualVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualVariable_ConceptType() {
		return (EReference)individualVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualID() {
		return individualIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualID_Individual() {
		return (EReference)individualIDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataVariable() {
		return dataVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataVariable_Name() {
		return (EAttribute)dataVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataLiteral() {
		return dataLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataLiteral_DataValue() {
		return (EReference)dataLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDefaultBuiltIn() {
		return defaultBuiltInEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwrlFactory getSwrlFactory() {
		return (SwrlFactory)getEFactoryInstance();
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
		atomListEClass = createEClass(ATOM_LIST);
		createEReference(atomListEClass, ATOM_LIST__ATOM);

		builtInAtomEClass = createEClass(BUILT_IN_ATOM);
		createEReference(builtInAtomEClass, BUILT_IN_ATOM__BUILT_IN_ATOM);
		createEReference(builtInAtomEClass, BUILT_IN_ATOM__ARGS);
		createEAttribute(builtInAtomEClass, BUILT_IN_ATOM__BUILT_IN);

		classAtomEClass = createEClass(CLASS_ATOM);
		createEReference(classAtomEClass, CLASS_ATOM__CLASS_PREDICATE);
		createEReference(classAtomEClass, CLASS_ATOM__ARGUMENT1);

		individualPropertyAtomEClass = createEClass(INDIVIDUAL_PROPERTY_ATOM);
		createEReference(individualPropertyAtomEClass, INDIVIDUAL_PROPERTY_ATOM__PROPERTY_PREDICATE);
		createEReference(individualPropertyAtomEClass, INDIVIDUAL_PROPERTY_ATOM__ARGUMENT1);
		createEReference(individualPropertyAtomEClass, INDIVIDUAL_PROPERTY_ATOM__ARGUMENT2);

		sameIndividualAtomEClass = createEClass(SAME_INDIVIDUAL_ATOM);
		createEReference(sameIndividualAtomEClass, SAME_INDIVIDUAL_ATOM__ARGS);

		differentIndividualsAtomEClass = createEClass(DIFFERENT_INDIVIDUALS_ATOM);
		createEReference(differentIndividualsAtomEClass, DIFFERENT_INDIVIDUALS_ATOM__ARGS);

		datavaluedPropertyAtomEClass = createEClass(DATAVALUED_PROPERTY_ATOM);
		createEReference(datavaluedPropertyAtomEClass, DATAVALUED_PROPERTY_ATOM__PROPERTY_PREDICATE);
		createEReference(datavaluedPropertyAtomEClass, DATAVALUED_PROPERTY_ATOM__ARGUMENT2);
		createEReference(datavaluedPropertyAtomEClass, DATAVALUED_PROPERTY_ATOM__ARGUMENT1);

		dataRangeAtomEClass = createEClass(DATA_RANGE_ATOM);
		createEReference(dataRangeAtomEClass, DATA_RANGE_ATOM__DATA_TYPE);
		createEReference(dataRangeAtomEClass, DATA_RANGE_ATOM__ONE_OF);
		createEReference(dataRangeAtomEClass, DATA_RANGE_ATOM__ARGUMENT1);

		dataValueEClass = createEClass(DATA_VALUE);
		createEReference(dataValueEClass, DATA_VALUE__CONCEPT_TYPE);
		createEAttribute(dataValueEClass, DATA_VALUE__LITERAL);
		createEAttribute(dataValueEClass, DATA_VALUE__TYPE);

		atomEClass = createEClass(ATOM);

		iObjectEClass = createEClass(IOBJECT);

		dObjectEClass = createEClass(DOBJECT);

		individualVariableEClass = createEClass(INDIVIDUAL_VARIABLE);
		createEAttribute(individualVariableEClass, INDIVIDUAL_VARIABLE__NAME);
		createEReference(individualVariableEClass, INDIVIDUAL_VARIABLE__CONCEPT_TYPE);

		individualIDEClass = createEClass(INDIVIDUAL_ID);
		createEReference(individualIDEClass, INDIVIDUAL_ID__INDIVIDUAL);

		dataVariableEClass = createEClass(DATA_VARIABLE);
		createEAttribute(dataVariableEClass, DATA_VARIABLE__NAME);

		dataLiteralEClass = createEClass(DATA_LITERAL);
		createEReference(dataLiteralEClass, DATA_LITERAL__DATA_VALUE);

		// Create enums
		defaultBuiltInEEnum = createEEnum(DEFAULT_BUILT_IN);
		dataTypeEEnum = createEEnum(DATA_TYPE);
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
		RulemlPackage theRulemlPackage = (RulemlPackage)EPackage.Registry.INSTANCE.getEPackage(RulemlPackage.eNS_URI);
		OMPackage theOMPackage = (OMPackage)EPackage.Registry.INSTANCE.getEPackage(OMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		atomListEClass.getESuperTypes().add(theRulemlPackage.getBody());
		atomListEClass.getESuperTypes().add(theRulemlPackage.getHead());
		builtInAtomEClass.getESuperTypes().add(this.getAtom());
		classAtomEClass.getESuperTypes().add(this.getAtom());
		individualPropertyAtomEClass.getESuperTypes().add(this.getAtom());
		sameIndividualAtomEClass.getESuperTypes().add(this.getAtom());
		differentIndividualsAtomEClass.getESuperTypes().add(this.getAtom());
		datavaluedPropertyAtomEClass.getESuperTypes().add(this.getAtom());
		dataRangeAtomEClass.getESuperTypes().add(this.getAtom());
		individualVariableEClass.getESuperTypes().add(this.getIObject());
		individualIDEClass.getESuperTypes().add(this.getIObject());
		dataVariableEClass.getESuperTypes().add(this.getDObject());
		dataLiteralEClass.getESuperTypes().add(this.getDObject());

		// Initialize classes and features; add operations and parameters
		initEClass(atomListEClass, AtomList.class, "AtomList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomList_Atom(), this.getAtom(), null, "atom", null, 0, -1, AtomList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(builtInAtomEClass, BuiltInAtom.class, "BuiltInAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuiltInAtom_BuiltInAtom(), this.getBuiltInAtom(), null, "builtInAtom", null, 0, 1, BuiltInAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuiltInAtom_Args(), this.getDObject(), null, "args", null, 0, -1, BuiltInAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuiltInAtom_BuiltIn(), this.getDefaultBuiltIn(), "builtIn", null, 1, 1, BuiltInAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classAtomEClass, ClassAtom.class, "ClassAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassAtom_ClassPredicate(), theOMPackage.getConcept(), null, "classPredicate", null, 1, 1, ClassAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassAtom_Argument1(), this.getIObject(), null, "argument1", null, 1, 1, ClassAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(individualPropertyAtomEClass, IndividualPropertyAtom.class, "IndividualPropertyAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndividualPropertyAtom_PropertyPredicate(), theOMPackage.getConcept(), null, "propertyPredicate", null, 1, 1, IndividualPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividualPropertyAtom_Argument1(), this.getIObject(), null, "argument1", null, 1, 1, IndividualPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividualPropertyAtom_Argument2(), this.getIObject(), null, "argument2", null, 1, 1, IndividualPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sameIndividualAtomEClass, SameIndividualAtom.class, "SameIndividualAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSameIndividualAtom_Args(), this.getIObject(), null, "args", null, 0, -1, SameIndividualAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(differentIndividualsAtomEClass, DifferentIndividualsAtom.class, "DifferentIndividualsAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDifferentIndividualsAtom_Args(), this.getIObject(), null, "args", null, 0, -1, DifferentIndividualsAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datavaluedPropertyAtomEClass, DatavaluedPropertyAtom.class, "DatavaluedPropertyAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatavaluedPropertyAtom_PropertyPredicate(), theOMPackage.getConcept(), null, "propertyPredicate", null, 0, 1, DatavaluedPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatavaluedPropertyAtom_Argument2(), this.getDObject(), null, "argument2", null, 1, 1, DatavaluedPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatavaluedPropertyAtom_Argument1(), this.getIObject(), null, "argument1", null, 1, 1, DatavaluedPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataRangeAtomEClass, DataRangeAtom.class, "DataRangeAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataRangeAtom_DataType(), theOMPackage.getConcept(), null, "dataType", null, 0, 1, DataRangeAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRangeAtom_OneOf(), this.getDataValue(), null, "oneOf", null, 0, -1, DataRangeAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRangeAtom_Argument1(), this.getDObject(), null, "argument1", null, 1, 1, DataRangeAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataValueEClass, DataValue.class, "DataValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataValue_ConceptType(), theOMPackage.getConcept(), null, "conceptType", null, 0, 1, DataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataValue_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, DataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataValue_Type(), this.getDataType(), "type", null, 0, 1, DataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomEClass, Atom.class, "Atom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iObjectEClass, IObject.class, "IObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dObjectEClass, DObject.class, "DObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(individualVariableEClass, IndividualVariable.class, "IndividualVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndividualVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, IndividualVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividualVariable_ConceptType(), theOMPackage.getConcept(), null, "conceptType", null, 0, 1, IndividualVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(individualIDEClass, IndividualID.class, "IndividualID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndividualID_Individual(), theOMPackage.getConcept(), null, "individual", null, 0, 1, IndividualID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataVariableEClass, DataVariable.class, "DataVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataLiteralEClass, DataLiteral.class, "DataLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataLiteral_DataValue(), this.getDataValue(), null, "dataValue", null, 0, 1, DataLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(defaultBuiltInEEnum, DefaultBuiltIn.class, "DefaultBuiltIn");
		addEEnumLiteral(defaultBuiltInEEnum, DefaultBuiltIn.GREATER);
		addEEnumLiteral(defaultBuiltInEEnum, DefaultBuiltIn.LESS);
		addEEnumLiteral(defaultBuiltInEEnum, DefaultBuiltIn.MINUS);
		addEEnumLiteral(defaultBuiltInEEnum, DefaultBuiltIn.PLUS);

		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.BOOLEAN);
		addEEnumLiteral(dataTypeEEnum, DataType.FLOAT);
		addEEnumLiteral(dataTypeEEnum, DataType.INT);
		addEEnumLiteral(dataTypeEEnum, DataType.STRING);
		addEEnumLiteral(dataTypeEEnum, DataType.DATE);
		addEEnumLiteral(dataTypeEEnum, DataType.DATETIME);
		addEEnumLiteral(dataTypeEEnum, DataType.TIME);

		// Create resource
		createResource(eNS_URI);
	}

} //SwrlPackageImpl
