/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.swrl;

import net.sf.ictalive.rules.ruleml.RulemlPackage;

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
 * @see net.sf.ictalive.rules.swrl.SwrlFactory
 * @model kind="package"
 * @generated
 */
public interface SwrlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "swrl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ict-alive.sourceforge.net/swrl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "swrl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SwrlPackage eINSTANCE = net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.rules.swrl.impl.AtomListImpl <em>Atom List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.rules.swrl.impl.AtomListImpl
	 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getAtomList()
	 * @generated
	 */
	int ATOM_LIST = 0;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_LIST__ATOM = RulemlPackage.BODY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atom List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_LIST_FEATURE_COUNT = RulemlPackage.BODY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.rules.swrl.impl.AtomImpl <em>Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.rules.swrl.impl.AtomImpl
	 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getAtom()
	 * @generated
	 */
	int ATOM = 9;

	/**
	 * The number of structural features of the '<em>Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.rules.swrl.impl.BuiltInAtomImpl <em>Built In Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.rules.swrl.impl.BuiltInAtomImpl
	 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getBuiltInAtom()
	 * @generated
	 */
	int BUILT_IN_ATOM = 1;

	/**
	 * The feature id for the '<em><b>Built In Atom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_ATOM__BUILT_IN_ATOM = ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_ATOM__ARGS = ATOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Built In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_ATOM__BUILT_IN = ATOM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Built In Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.rules.swrl.impl.ClassAtomImpl <em>Class Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.rules.swrl.impl.ClassAtomImpl
	 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getClassAtom()
	 * @generated
	 */
	int CLASS_ATOM = 2;

	/**
	 * The feature id for the '<em><b>Class Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATOM__CLASS_PREDICATE = ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATOM__ARGUMENT1 = ATOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.rules.swrl.impl.IndividualPropertyAtomImpl <em>Individual Property Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.rules.swrl.impl.IndividualPropertyAtomImpl
	 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getIndividualPropertyAtom()
	 * @generated
	 */
	int INDIVIDUAL_PROPERTY_ATOM = 3;

	/**
	 * The feature id for the '<em><b>Property Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_PROPERTY_ATOM__PROPERTY_PREDICATE = ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_PROPERTY_ATOM__ARGUMENT1 = ATOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Argument2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_PROPERTY_ATOM__ARGUMENT2 = ATOM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Individual Property Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_PROPERTY_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.rules.swrl.impl.SameIndividualAtomImpl <em>Same Individual Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.rules.swrl.impl.SameIndividualAtomImpl
	 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getSameIndividualAtom()
	 * @generated
	 */
	int SAME_INDIVIDUAL_ATOM = 4;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_INDIVIDUAL_ATOM__ARGS = ATOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Same Individual Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_INDIVIDUAL_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.rules.swrl.impl.DifferentIndividualsAtomImpl <em>Different Individuals Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.rules.swrl.impl.DifferentIndividualsAtomImpl
	 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getDifferentIndividualsAtom()
	 * @generated
	 */
	int DIFFERENT_INDIVIDUALS_ATOM = 5;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_INDIVIDUALS_ATOM__ARGS = ATOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Different Individuals Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_INDIVIDUALS_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.rules.swrl.impl.DatavaluedPropertyAtomImpl <em>Datavalued Property Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.rules.swrl.impl.DatavaluedPropertyAtomImpl
	 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getDatavaluedPropertyAtom()
	 * @generated
	 */
	int DATAVALUED_PROPERTY_ATOM = 6;

	/**
	 * The feature id for the '<em><b>Property Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAVALUED_PROPERTY_ATOM__PROPERTY_PREDICATE = ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAVALUED_PROPERTY_ATOM__ARGUMENT2 = ATOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Argument1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAVALUED_PROPERTY_ATOM__ARGUMENT1 = ATOM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Datavalued Property Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAVALUED_PROPERTY_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.rules.swrl.impl.DataRangeAtomImpl <em>Data Range Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.rules.swrl.impl.DataRangeAtomImpl
	 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getDataRangeAtom()
	 * @generated
	 */
	int DATA_RANGE_ATOM = 7;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_ATOM__DATA_TYPE = ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_ATOM__ONE_OF = ATOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Argument1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_ATOM__ARGUMENT1 = ATOM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Range Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.rules.swrl.impl.DataValueImpl <em>Data Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.rules.swrl.impl.DataValueImpl
	 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getDataValue()
	 * @generated
	 */
	int DATA_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Concept Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__CONCEPT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__LITERAL = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.rules.swrl.impl.IObjectImpl <em>IObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.rules.swrl.impl.IObjectImpl
	 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getIObject()
	 * @generated
	 */
	int IOBJECT = 10;

	/**
	 * The number of structural features of the '<em>IObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOBJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.rules.swrl.impl.DObjectImpl <em>DObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.rules.swrl.impl.DObjectImpl
	 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getDObject()
	 * @generated
	 */
	int DOBJECT = 11;

	/**
	 * The number of structural features of the '<em>DObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOBJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.rules.swrl.impl.IndividualVariableImpl <em>Individual Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.rules.swrl.impl.IndividualVariableImpl
	 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getIndividualVariable()
	 * @generated
	 */
	int INDIVIDUAL_VARIABLE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_VARIABLE__NAME = IOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concept Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_VARIABLE__CONCEPT_TYPE = IOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Individual Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_VARIABLE_FEATURE_COUNT = IOBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.rules.swrl.impl.IndividualIDImpl <em>Individual ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.rules.swrl.impl.IndividualIDImpl
	 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getIndividualID()
	 * @generated
	 */
	int INDIVIDUAL_ID = 13;

	/**
	 * The feature id for the '<em><b>Individual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ID__INDIVIDUAL = IOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Individual ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ID_FEATURE_COUNT = IOBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.rules.swrl.impl.DataVariableImpl <em>Data Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.rules.swrl.impl.DataVariableImpl
	 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getDataVariable()
	 * @generated
	 */
	int DATA_VARIABLE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VARIABLE__NAME = DOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VARIABLE_FEATURE_COUNT = DOBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.rules.swrl.impl.DataLiteralImpl <em>Data Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.rules.swrl.impl.DataLiteralImpl
	 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getDataLiteral()
	 * @generated
	 */
	int DATA_LITERAL = 15;

	/**
	 * The feature id for the '<em><b>Data Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LITERAL__DATA_VALUE = DOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LITERAL_FEATURE_COUNT = DOBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.rules.swrl.DefaultBuiltIn <em>Default Built In</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.rules.swrl.DefaultBuiltIn
	 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getDefaultBuiltIn()
	 * @generated
	 */
	int DEFAULT_BUILT_IN = 16;


	/**
	 * The meta object id for the '{@link net.sf.ictalive.rules.swrl.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.rules.swrl.DataType
	 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.rules.swrl.AtomList <em>Atom List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atom List</em>'.
	 * @see net.sf.ictalive.rules.swrl.AtomList
	 * @generated
	 */
	EClass getAtomList();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.rules.swrl.AtomList#getAtom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atom</em>'.
	 * @see net.sf.ictalive.rules.swrl.AtomList#getAtom()
	 * @see #getAtomList()
	 * @generated
	 */
	EReference getAtomList_Atom();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.rules.swrl.BuiltInAtom <em>Built In Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Built In Atom</em>'.
	 * @see net.sf.ictalive.rules.swrl.BuiltInAtom
	 * @generated
	 */
	EClass getBuiltInAtom();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.rules.swrl.BuiltInAtom#getBuiltIn <em>Built In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Built In</em>'.
	 * @see net.sf.ictalive.rules.swrl.BuiltInAtom#getBuiltIn()
	 * @see #getBuiltInAtom()
	 * @generated
	 */
	EAttribute getBuiltInAtom_BuiltIn();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.rules.swrl.BuiltInAtom#getBuiltInAtom <em>Built In Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Built In Atom</em>'.
	 * @see net.sf.ictalive.rules.swrl.BuiltInAtom#getBuiltInAtom()
	 * @see #getBuiltInAtom()
	 * @generated
	 */
	EReference getBuiltInAtom_BuiltInAtom();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.rules.swrl.BuiltInAtom#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Args</em>'.
	 * @see net.sf.ictalive.rules.swrl.BuiltInAtom#getArgs()
	 * @see #getBuiltInAtom()
	 * @generated
	 */
	EReference getBuiltInAtom_Args();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.rules.swrl.ClassAtom <em>Class Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Atom</em>'.
	 * @see net.sf.ictalive.rules.swrl.ClassAtom
	 * @generated
	 */
	EClass getClassAtom();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.rules.swrl.ClassAtom#getClassPredicate <em>Class Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class Predicate</em>'.
	 * @see net.sf.ictalive.rules.swrl.ClassAtom#getClassPredicate()
	 * @see #getClassAtom()
	 * @generated
	 */
	EReference getClassAtom_ClassPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.rules.swrl.ClassAtom#getArgument1 <em>Argument1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument1</em>'.
	 * @see net.sf.ictalive.rules.swrl.ClassAtom#getArgument1()
	 * @see #getClassAtom()
	 * @generated
	 */
	EReference getClassAtom_Argument1();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.rules.swrl.IndividualPropertyAtom <em>Individual Property Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Property Atom</em>'.
	 * @see net.sf.ictalive.rules.swrl.IndividualPropertyAtom
	 * @generated
	 */
	EClass getIndividualPropertyAtom();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.rules.swrl.IndividualPropertyAtom#getPropertyPredicate <em>Property Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Predicate</em>'.
	 * @see net.sf.ictalive.rules.swrl.IndividualPropertyAtom#getPropertyPredicate()
	 * @see #getIndividualPropertyAtom()
	 * @generated
	 */
	EReference getIndividualPropertyAtom_PropertyPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.rules.swrl.IndividualPropertyAtom#getArgument1 <em>Argument1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument1</em>'.
	 * @see net.sf.ictalive.rules.swrl.IndividualPropertyAtom#getArgument1()
	 * @see #getIndividualPropertyAtom()
	 * @generated
	 */
	EReference getIndividualPropertyAtom_Argument1();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.rules.swrl.IndividualPropertyAtom#getArgument2 <em>Argument2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument2</em>'.
	 * @see net.sf.ictalive.rules.swrl.IndividualPropertyAtom#getArgument2()
	 * @see #getIndividualPropertyAtom()
	 * @generated
	 */
	EReference getIndividualPropertyAtom_Argument2();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.rules.swrl.SameIndividualAtom <em>Same Individual Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Same Individual Atom</em>'.
	 * @see net.sf.ictalive.rules.swrl.SameIndividualAtom
	 * @generated
	 */
	EClass getSameIndividualAtom();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.rules.swrl.SameIndividualAtom#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see net.sf.ictalive.rules.swrl.SameIndividualAtom#getArgs()
	 * @see #getSameIndividualAtom()
	 * @generated
	 */
	EReference getSameIndividualAtom_Args();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.rules.swrl.DifferentIndividualsAtom <em>Different Individuals Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Different Individuals Atom</em>'.
	 * @see net.sf.ictalive.rules.swrl.DifferentIndividualsAtom
	 * @generated
	 */
	EClass getDifferentIndividualsAtom();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.rules.swrl.DifferentIndividualsAtom#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see net.sf.ictalive.rules.swrl.DifferentIndividualsAtom#getArgs()
	 * @see #getDifferentIndividualsAtom()
	 * @generated
	 */
	EReference getDifferentIndividualsAtom_Args();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.rules.swrl.DatavaluedPropertyAtom <em>Datavalued Property Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datavalued Property Atom</em>'.
	 * @see net.sf.ictalive.rules.swrl.DatavaluedPropertyAtom
	 * @generated
	 */
	EClass getDatavaluedPropertyAtom();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.rules.swrl.DatavaluedPropertyAtom#getPropertyPredicate <em>Property Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Predicate</em>'.
	 * @see net.sf.ictalive.rules.swrl.DatavaluedPropertyAtom#getPropertyPredicate()
	 * @see #getDatavaluedPropertyAtom()
	 * @generated
	 */
	EReference getDatavaluedPropertyAtom_PropertyPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.rules.swrl.DatavaluedPropertyAtom#getArgument2 <em>Argument2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument2</em>'.
	 * @see net.sf.ictalive.rules.swrl.DatavaluedPropertyAtom#getArgument2()
	 * @see #getDatavaluedPropertyAtom()
	 * @generated
	 */
	EReference getDatavaluedPropertyAtom_Argument2();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.rules.swrl.DatavaluedPropertyAtom#getArgument1 <em>Argument1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument1</em>'.
	 * @see net.sf.ictalive.rules.swrl.DatavaluedPropertyAtom#getArgument1()
	 * @see #getDatavaluedPropertyAtom()
	 * @generated
	 */
	EReference getDatavaluedPropertyAtom_Argument1();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.rules.swrl.DataRangeAtom <em>Data Range Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Range Atom</em>'.
	 * @see net.sf.ictalive.rules.swrl.DataRangeAtom
	 * @generated
	 */
	EClass getDataRangeAtom();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.rules.swrl.DataRangeAtom#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see net.sf.ictalive.rules.swrl.DataRangeAtom#getDataType()
	 * @see #getDataRangeAtom()
	 * @generated
	 */
	EReference getDataRangeAtom_DataType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.rules.swrl.DataRangeAtom#getOneOf <em>One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One Of</em>'.
	 * @see net.sf.ictalive.rules.swrl.DataRangeAtom#getOneOf()
	 * @see #getDataRangeAtom()
	 * @generated
	 */
	EReference getDataRangeAtom_OneOf();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.rules.swrl.DataRangeAtom#getArgument1 <em>Argument1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument1</em>'.
	 * @see net.sf.ictalive.rules.swrl.DataRangeAtom#getArgument1()
	 * @see #getDataRangeAtom()
	 * @generated
	 */
	EReference getDataRangeAtom_Argument1();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.rules.swrl.DataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Value</em>'.
	 * @see net.sf.ictalive.rules.swrl.DataValue
	 * @generated
	 */
	EClass getDataValue();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.rules.swrl.DataValue#getConceptType <em>Concept Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept Type</em>'.
	 * @see net.sf.ictalive.rules.swrl.DataValue#getConceptType()
	 * @see #getDataValue()
	 * @generated
	 */
	EReference getDataValue_ConceptType();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.rules.swrl.DataValue#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see net.sf.ictalive.rules.swrl.DataValue#getLiteral()
	 * @see #getDataValue()
	 * @generated
	 */
	EAttribute getDataValue_Literal();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.rules.swrl.DataValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.ictalive.rules.swrl.DataValue#getType()
	 * @see #getDataValue()
	 * @generated
	 */
	EAttribute getDataValue_Type();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.rules.swrl.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atom</em>'.
	 * @see net.sf.ictalive.rules.swrl.Atom
	 * @generated
	 */
	EClass getAtom();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.rules.swrl.IObject <em>IObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IObject</em>'.
	 * @see net.sf.ictalive.rules.swrl.IObject
	 * @generated
	 */
	EClass getIObject();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.rules.swrl.DObject <em>DObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DObject</em>'.
	 * @see net.sf.ictalive.rules.swrl.DObject
	 * @generated
	 */
	EClass getDObject();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.rules.swrl.IndividualVariable <em>Individual Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Variable</em>'.
	 * @see net.sf.ictalive.rules.swrl.IndividualVariable
	 * @generated
	 */
	EClass getIndividualVariable();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.rules.swrl.IndividualVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.rules.swrl.IndividualVariable#getName()
	 * @see #getIndividualVariable()
	 * @generated
	 */
	EAttribute getIndividualVariable_Name();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.rules.swrl.IndividualVariable#getConceptType <em>Concept Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept Type</em>'.
	 * @see net.sf.ictalive.rules.swrl.IndividualVariable#getConceptType()
	 * @see #getIndividualVariable()
	 * @generated
	 */
	EReference getIndividualVariable_ConceptType();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.rules.swrl.IndividualID <em>Individual ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual ID</em>'.
	 * @see net.sf.ictalive.rules.swrl.IndividualID
	 * @generated
	 */
	EClass getIndividualID();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.rules.swrl.IndividualID#getIndividual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Individual</em>'.
	 * @see net.sf.ictalive.rules.swrl.IndividualID#getIndividual()
	 * @see #getIndividualID()
	 * @generated
	 */
	EReference getIndividualID_Individual();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.rules.swrl.DataVariable <em>Data Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Variable</em>'.
	 * @see net.sf.ictalive.rules.swrl.DataVariable
	 * @generated
	 */
	EClass getDataVariable();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.rules.swrl.DataVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.rules.swrl.DataVariable#getName()
	 * @see #getDataVariable()
	 * @generated
	 */
	EAttribute getDataVariable_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.rules.swrl.DataLiteral <em>Data Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Literal</em>'.
	 * @see net.sf.ictalive.rules.swrl.DataLiteral
	 * @generated
	 */
	EClass getDataLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.rules.swrl.DataLiteral#getDataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Value</em>'.
	 * @see net.sf.ictalive.rules.swrl.DataLiteral#getDataValue()
	 * @see #getDataLiteral()
	 * @generated
	 */
	EReference getDataLiteral_DataValue();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.rules.swrl.DefaultBuiltIn <em>Default Built In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Default Built In</em>'.
	 * @see net.sf.ictalive.rules.swrl.DefaultBuiltIn
	 * @generated
	 */
	EEnum getDefaultBuiltIn();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.rules.swrl.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see net.sf.ictalive.rules.swrl.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SwrlFactory getSwrlFactory();

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
		 * The meta object literal for the '{@link net.sf.ictalive.rules.swrl.impl.AtomListImpl <em>Atom List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.rules.swrl.impl.AtomListImpl
		 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getAtomList()
		 * @generated
		 */
		EClass ATOM_LIST = eINSTANCE.getAtomList();

		/**
		 * The meta object literal for the '<em><b>Atom</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOM_LIST__ATOM = eINSTANCE.getAtomList_Atom();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.rules.swrl.impl.BuiltInAtomImpl <em>Built In Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.rules.swrl.impl.BuiltInAtomImpl
		 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getBuiltInAtom()
		 * @generated
		 */
		EClass BUILT_IN_ATOM = eINSTANCE.getBuiltInAtom();

		/**
		 * The meta object literal for the '<em><b>Built In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILT_IN_ATOM__BUILT_IN = eINSTANCE.getBuiltInAtom_BuiltIn();

		/**
		 * The meta object literal for the '<em><b>Built In Atom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILT_IN_ATOM__BUILT_IN_ATOM = eINSTANCE.getBuiltInAtom_BuiltInAtom();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILT_IN_ATOM__ARGS = eINSTANCE.getBuiltInAtom_Args();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.rules.swrl.impl.ClassAtomImpl <em>Class Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.rules.swrl.impl.ClassAtomImpl
		 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getClassAtom()
		 * @generated
		 */
		EClass CLASS_ATOM = eINSTANCE.getClassAtom();

		/**
		 * The meta object literal for the '<em><b>Class Predicate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_ATOM__CLASS_PREDICATE = eINSTANCE.getClassAtom_ClassPredicate();

		/**
		 * The meta object literal for the '<em><b>Argument1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_ATOM__ARGUMENT1 = eINSTANCE.getClassAtom_Argument1();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.rules.swrl.impl.IndividualPropertyAtomImpl <em>Individual Property Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.rules.swrl.impl.IndividualPropertyAtomImpl
		 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getIndividualPropertyAtom()
		 * @generated
		 */
		EClass INDIVIDUAL_PROPERTY_ATOM = eINSTANCE.getIndividualPropertyAtom();

		/**
		 * The meta object literal for the '<em><b>Property Predicate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_PROPERTY_ATOM__PROPERTY_PREDICATE = eINSTANCE.getIndividualPropertyAtom_PropertyPredicate();

		/**
		 * The meta object literal for the '<em><b>Argument1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_PROPERTY_ATOM__ARGUMENT1 = eINSTANCE.getIndividualPropertyAtom_Argument1();

		/**
		 * The meta object literal for the '<em><b>Argument2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_PROPERTY_ATOM__ARGUMENT2 = eINSTANCE.getIndividualPropertyAtom_Argument2();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.rules.swrl.impl.SameIndividualAtomImpl <em>Same Individual Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.rules.swrl.impl.SameIndividualAtomImpl
		 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getSameIndividualAtom()
		 * @generated
		 */
		EClass SAME_INDIVIDUAL_ATOM = eINSTANCE.getSameIndividualAtom();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAME_INDIVIDUAL_ATOM__ARGS = eINSTANCE.getSameIndividualAtom_Args();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.rules.swrl.impl.DifferentIndividualsAtomImpl <em>Different Individuals Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.rules.swrl.impl.DifferentIndividualsAtomImpl
		 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getDifferentIndividualsAtom()
		 * @generated
		 */
		EClass DIFFERENT_INDIVIDUALS_ATOM = eINSTANCE.getDifferentIndividualsAtom();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFERENT_INDIVIDUALS_ATOM__ARGS = eINSTANCE.getDifferentIndividualsAtom_Args();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.rules.swrl.impl.DatavaluedPropertyAtomImpl <em>Datavalued Property Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.rules.swrl.impl.DatavaluedPropertyAtomImpl
		 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getDatavaluedPropertyAtom()
		 * @generated
		 */
		EClass DATAVALUED_PROPERTY_ATOM = eINSTANCE.getDatavaluedPropertyAtom();

		/**
		 * The meta object literal for the '<em><b>Property Predicate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATAVALUED_PROPERTY_ATOM__PROPERTY_PREDICATE = eINSTANCE.getDatavaluedPropertyAtom_PropertyPredicate();

		/**
		 * The meta object literal for the '<em><b>Argument2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATAVALUED_PROPERTY_ATOM__ARGUMENT2 = eINSTANCE.getDatavaluedPropertyAtom_Argument2();

		/**
		 * The meta object literal for the '<em><b>Argument1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATAVALUED_PROPERTY_ATOM__ARGUMENT1 = eINSTANCE.getDatavaluedPropertyAtom_Argument1();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.rules.swrl.impl.DataRangeAtomImpl <em>Data Range Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.rules.swrl.impl.DataRangeAtomImpl
		 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getDataRangeAtom()
		 * @generated
		 */
		EClass DATA_RANGE_ATOM = eINSTANCE.getDataRangeAtom();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RANGE_ATOM__DATA_TYPE = eINSTANCE.getDataRangeAtom_DataType();

		/**
		 * The meta object literal for the '<em><b>One Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RANGE_ATOM__ONE_OF = eINSTANCE.getDataRangeAtom_OneOf();

		/**
		 * The meta object literal for the '<em><b>Argument1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RANGE_ATOM__ARGUMENT1 = eINSTANCE.getDataRangeAtom_Argument1();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.rules.swrl.impl.DataValueImpl <em>Data Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.rules.swrl.impl.DataValueImpl
		 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getDataValue()
		 * @generated
		 */
		EClass DATA_VALUE = eINSTANCE.getDataValue();

		/**
		 * The meta object literal for the '<em><b>Concept Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VALUE__CONCEPT_TYPE = eINSTANCE.getDataValue_ConceptType();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_VALUE__LITERAL = eINSTANCE.getDataValue_Literal();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_VALUE__TYPE = eINSTANCE.getDataValue_Type();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.rules.swrl.impl.AtomImpl <em>Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.rules.swrl.impl.AtomImpl
		 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getAtom()
		 * @generated
		 */
		EClass ATOM = eINSTANCE.getAtom();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.rules.swrl.impl.IObjectImpl <em>IObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.rules.swrl.impl.IObjectImpl
		 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getIObject()
		 * @generated
		 */
		EClass IOBJECT = eINSTANCE.getIObject();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.rules.swrl.impl.DObjectImpl <em>DObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.rules.swrl.impl.DObjectImpl
		 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getDObject()
		 * @generated
		 */
		EClass DOBJECT = eINSTANCE.getDObject();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.rules.swrl.impl.IndividualVariableImpl <em>Individual Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.rules.swrl.impl.IndividualVariableImpl
		 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getIndividualVariable()
		 * @generated
		 */
		EClass INDIVIDUAL_VARIABLE = eINSTANCE.getIndividualVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDIVIDUAL_VARIABLE__NAME = eINSTANCE.getIndividualVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Concept Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_VARIABLE__CONCEPT_TYPE = eINSTANCE.getIndividualVariable_ConceptType();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.rules.swrl.impl.IndividualIDImpl <em>Individual ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.rules.swrl.impl.IndividualIDImpl
		 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getIndividualID()
		 * @generated
		 */
		EClass INDIVIDUAL_ID = eINSTANCE.getIndividualID();

		/**
		 * The meta object literal for the '<em><b>Individual</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_ID__INDIVIDUAL = eINSTANCE.getIndividualID_Individual();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.rules.swrl.impl.DataVariableImpl <em>Data Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.rules.swrl.impl.DataVariableImpl
		 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getDataVariable()
		 * @generated
		 */
		EClass DATA_VARIABLE = eINSTANCE.getDataVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_VARIABLE__NAME = eINSTANCE.getDataVariable_Name();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.rules.swrl.impl.DataLiteralImpl <em>Data Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.rules.swrl.impl.DataLiteralImpl
		 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getDataLiteral()
		 * @generated
		 */
		EClass DATA_LITERAL = eINSTANCE.getDataLiteral();

		/**
		 * The meta object literal for the '<em><b>Data Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LITERAL__DATA_VALUE = eINSTANCE.getDataLiteral_DataValue();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.rules.swrl.DefaultBuiltIn <em>Default Built In</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.rules.swrl.DefaultBuiltIn
		 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getDefaultBuiltIn()
		 * @generated
		 */
		EEnum DEFAULT_BUILT_IN = eINSTANCE.getDefaultBuiltIn();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.rules.swrl.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.rules.swrl.DataType
		 * @see net.sf.ictalive.rules.swrl.impl.SwrlPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

	}

} //SwrlPackage
