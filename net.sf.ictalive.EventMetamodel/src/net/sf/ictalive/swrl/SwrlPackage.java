/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.swrl;

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
 * @see net.sf.ictalive.swrl.SwrlFactory
 * @model kind="package"
 * @generated
 */
public interface SwrlPackage extends EPackage
{
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
	String eNS_URI = "http://swrl/v0.5";

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
	SwrlPackage eINSTANCE = net.sf.ictalive.swrl.impl.SwrlPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.swrl.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.swrl.impl.RuleImpl
	 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 0;

	/**
	 * The feature id for the '<em><b>URI Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__URI_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__BODY = 3;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__HEAD = 4;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.swrl.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.swrl.impl.AnnotationImpl
	 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__DESC = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.swrl.impl.AtomImpl <em>Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.swrl.impl.AtomImpl
	 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getAtom()
	 * @generated
	 */
	int ATOM = 2;

	/**
	 * The number of structural features of the '<em>Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.swrl.impl.AntecedentImpl <em>Antecedent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.swrl.impl.AntecedentImpl
	 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getAntecedent()
	 * @generated
	 */
	int ANTECEDENT = 3;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTECEDENT__ATOM = 0;

	/**
	 * The number of structural features of the '<em>Antecedent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTECEDENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.swrl.impl.ConsequentImpl <em>Consequent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.swrl.impl.ConsequentImpl
	 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getConsequent()
	 * @generated
	 */
	int CONSEQUENT = 4;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENT__ATOM = 0;

	/**
	 * The number of structural features of the '<em>Consequent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.swrl.impl.ClassAtomImpl <em>Class Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.swrl.impl.ClassAtomImpl
	 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getClassAtom()
	 * @generated
	 */
	int CLASS_ATOM = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATOM__DESCRIPTION = ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATOM__ARG = ATOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.swrl.impl.IndividualPropertyAtomImpl <em>Individual Property Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.swrl.impl.IndividualPropertyAtomImpl
	 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getIndividualPropertyAtom()
	 * @generated
	 */
	int INDIVIDUAL_PROPERTY_ATOM = 6;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_PROPERTY_ATOM__PREDICATE = ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arg1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_PROPERTY_ATOM__ARG1 = ATOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arg2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_PROPERTY_ATOM__ARG2 = ATOM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Individual Property Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_PROPERTY_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.swrl.impl.IndividualObjectImpl <em>Individual Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.swrl.impl.IndividualObjectImpl
	 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getIndividualObject()
	 * @generated
	 */
	int INDIVIDUAL_OBJECT = 7;

	/**
	 * The number of structural features of the '<em>Individual Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.swrl.impl.IndividualVariableImpl <em>Individual Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.swrl.impl.IndividualVariableImpl
	 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getIndividualVariable()
	 * @generated
	 */
	int INDIVIDUAL_VARIABLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_VARIABLE__NAME = INDIVIDUAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Individual Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_VARIABLE_FEATURE_COUNT = INDIVIDUAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.swrl.impl.IndividualIDImpl <em>Individual ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.swrl.impl.IndividualIDImpl
	 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getIndividualID()
	 * @generated
	 */
	int INDIVIDUAL_ID = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ID__ID = INDIVIDUAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Individual ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ID_FEATURE_COUNT = INDIVIDUAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.swrl.impl.SameAsAtomImpl <em>Same As Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.swrl.impl.SameAsAtomImpl
	 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getSameAsAtom()
	 * @generated
	 */
	int SAME_AS_ATOM = 10;

	/**
	 * The feature id for the '<em><b>Arg1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_AS_ATOM__ARG1 = ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arg2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_AS_ATOM__ARG2 = ATOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Same As Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_AS_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.swrl.impl.DifferentFromAtomImpl <em>Different From Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.swrl.impl.DifferentFromAtomImpl
	 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getDifferentFromAtom()
	 * @generated
	 */
	int DIFFERENT_FROM_ATOM = 11;

	/**
	 * The feature id for the '<em><b>Arg1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_FROM_ATOM__ARG1 = ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arg2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_FROM_ATOM__ARG2 = ATOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Different From Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_FROM_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.swrl.impl.BuiltInAtomImpl <em>Built In Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.swrl.impl.BuiltInAtomImpl
	 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getBuiltInAtom()
	 * @generated
	 */
	int BUILT_IN_ATOM = 12;

	/**
	 * The feature id for the '<em><b>Built In ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_ATOM__BUILT_IN_ID = ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_ATOM__ARG = ATOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Built In Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.swrl.impl.DataObjectImpl <em>Data Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.swrl.impl.DataObjectImpl
	 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getDataObject()
	 * @generated
	 */
	int DATA_OBJECT = 13;

	/**
	 * The number of structural features of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.swrl.impl.DataVariableImpl <em>Data Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.swrl.impl.DataVariableImpl
	 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getDataVariable()
	 * @generated
	 */
	int DATA_VARIABLE = 14;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VARIABLE__URI = DATA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VARIABLE_FEATURE_COUNT = DATA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.swrl.impl.DataLiteralImpl <em>Data Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.swrl.impl.DataLiteralImpl
	 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getDataLiteral()
	 * @generated
	 */
	int DATA_LITERAL = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LITERAL__VALUE = DATA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LITERAL_FEATURE_COUNT = DATA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.swrl.impl.DataRangeAtomImpl <em>Data Range Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.swrl.impl.DataRangeAtomImpl
	 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getDataRangeAtom()
	 * @generated
	 */
	int DATA_RANGE_ATOM = 16;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_ATOM__PREDICATE = ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_ATOM__ARG = ATOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Range Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.swrl.impl.DataValuedPropertyAtomImpl <em>Data Valued Property Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.swrl.impl.DataValuedPropertyAtomImpl
	 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getDataValuedPropertyAtom()
	 * @generated
	 */
	int DATA_VALUED_PROPERTY_ATOM = 17;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUED_PROPERTY_ATOM__PREDICATE = ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arg1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUED_PROPERTY_ATOM__ARG1 = ATOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arg2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUED_PROPERTY_ATOM__ARG2 = ATOM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Valued Property Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUED_PROPERTY_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.swrl.RuleType <em>Rule Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.swrl.RuleType
	 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getRuleType()
	 * @generated
	 */
	int RULE_TYPE = 18;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.swrl.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see net.sf.ictalive.swrl.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.swrl.Rule#getURIReference <em>URI Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI Reference</em>'.
	 * @see net.sf.ictalive.swrl.Rule#getURIReference()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_URIReference();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.swrl.Rule#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.ictalive.swrl.Rule#getType()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.swrl.Rule#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see net.sf.ictalive.swrl.Rule#getAnnotation()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.swrl.Rule#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see net.sf.ictalive.swrl.Rule#getBody()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Body();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.swrl.Rule#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see net.sf.ictalive.swrl.Rule#getHead()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Head();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.swrl.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see net.sf.ictalive.swrl.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.swrl.Annotation#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see net.sf.ictalive.swrl.Annotation#getDesc()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Desc();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.swrl.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atom</em>'.
	 * @see net.sf.ictalive.swrl.Atom
	 * @generated
	 */
	EClass getAtom();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.swrl.Antecedent <em>Antecedent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antecedent</em>'.
	 * @see net.sf.ictalive.swrl.Antecedent
	 * @generated
	 */
	EClass getAntecedent();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.swrl.Antecedent#getAtom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atom</em>'.
	 * @see net.sf.ictalive.swrl.Antecedent#getAtom()
	 * @see #getAntecedent()
	 * @generated
	 */
	EReference getAntecedent_Atom();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.swrl.Consequent <em>Consequent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consequent</em>'.
	 * @see net.sf.ictalive.swrl.Consequent
	 * @generated
	 */
	EClass getConsequent();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.swrl.Consequent#getAtom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atom</em>'.
	 * @see net.sf.ictalive.swrl.Consequent#getAtom()
	 * @see #getConsequent()
	 * @generated
	 */
	EReference getConsequent_Atom();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.swrl.ClassAtom <em>Class Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Atom</em>'.
	 * @see net.sf.ictalive.swrl.ClassAtom
	 * @generated
	 */
	EClass getClassAtom();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.swrl.ClassAtom#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.sf.ictalive.swrl.ClassAtom#getDescription()
	 * @see #getClassAtom()
	 * @generated
	 */
	EAttribute getClassAtom_Description();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.swrl.ClassAtom#getArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arg</em>'.
	 * @see net.sf.ictalive.swrl.ClassAtom#getArg()
	 * @see #getClassAtom()
	 * @generated
	 */
	EReference getClassAtom_Arg();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.swrl.IndividualPropertyAtom <em>Individual Property Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Property Atom</em>'.
	 * @see net.sf.ictalive.swrl.IndividualPropertyAtom
	 * @generated
	 */
	EClass getIndividualPropertyAtom();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.swrl.IndividualPropertyAtom#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicate</em>'.
	 * @see net.sf.ictalive.swrl.IndividualPropertyAtom#getPredicate()
	 * @see #getIndividualPropertyAtom()
	 * @generated
	 */
	EAttribute getIndividualPropertyAtom_Predicate();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.swrl.IndividualPropertyAtom#getArg1 <em>Arg1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arg1</em>'.
	 * @see net.sf.ictalive.swrl.IndividualPropertyAtom#getArg1()
	 * @see #getIndividualPropertyAtom()
	 * @generated
	 */
	EReference getIndividualPropertyAtom_Arg1();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.swrl.IndividualPropertyAtom#getArg2 <em>Arg2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arg2</em>'.
	 * @see net.sf.ictalive.swrl.IndividualPropertyAtom#getArg2()
	 * @see #getIndividualPropertyAtom()
	 * @generated
	 */
	EReference getIndividualPropertyAtom_Arg2();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.swrl.IndividualObject <em>Individual Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Object</em>'.
	 * @see net.sf.ictalive.swrl.IndividualObject
	 * @generated
	 */
	EClass getIndividualObject();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.swrl.IndividualVariable <em>Individual Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Variable</em>'.
	 * @see net.sf.ictalive.swrl.IndividualVariable
	 * @generated
	 */
	EClass getIndividualVariable();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.swrl.IndividualVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.swrl.IndividualVariable#getName()
	 * @see #getIndividualVariable()
	 * @generated
	 */
	EAttribute getIndividualVariable_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.swrl.IndividualID <em>Individual ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual ID</em>'.
	 * @see net.sf.ictalive.swrl.IndividualID
	 * @generated
	 */
	EClass getIndividualID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.swrl.IndividualID#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.ictalive.swrl.IndividualID#getId()
	 * @see #getIndividualID()
	 * @generated
	 */
	EAttribute getIndividualID_Id();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.swrl.SameAsAtom <em>Same As Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Same As Atom</em>'.
	 * @see net.sf.ictalive.swrl.SameAsAtom
	 * @generated
	 */
	EClass getSameAsAtom();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.swrl.SameAsAtom#getArg1 <em>Arg1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arg1</em>'.
	 * @see net.sf.ictalive.swrl.SameAsAtom#getArg1()
	 * @see #getSameAsAtom()
	 * @generated
	 */
	EReference getSameAsAtom_Arg1();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.swrl.SameAsAtom#getArg2 <em>Arg2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arg2</em>'.
	 * @see net.sf.ictalive.swrl.SameAsAtom#getArg2()
	 * @see #getSameAsAtom()
	 * @generated
	 */
	EReference getSameAsAtom_Arg2();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.swrl.DifferentFromAtom <em>Different From Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Different From Atom</em>'.
	 * @see net.sf.ictalive.swrl.DifferentFromAtom
	 * @generated
	 */
	EClass getDifferentFromAtom();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.swrl.DifferentFromAtom#getArg1 <em>Arg1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arg1</em>'.
	 * @see net.sf.ictalive.swrl.DifferentFromAtom#getArg1()
	 * @see #getDifferentFromAtom()
	 * @generated
	 */
	EReference getDifferentFromAtom_Arg1();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.swrl.DifferentFromAtom#getArg2 <em>Arg2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arg2</em>'.
	 * @see net.sf.ictalive.swrl.DifferentFromAtom#getArg2()
	 * @see #getDifferentFromAtom()
	 * @generated
	 */
	EReference getDifferentFromAtom_Arg2();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.swrl.BuiltInAtom <em>Built In Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Built In Atom</em>'.
	 * @see net.sf.ictalive.swrl.BuiltInAtom
	 * @generated
	 */
	EClass getBuiltInAtom();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.swrl.BuiltInAtom#getBuiltInID <em>Built In ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Built In ID</em>'.
	 * @see net.sf.ictalive.swrl.BuiltInAtom#getBuiltInID()
	 * @see #getBuiltInAtom()
	 * @generated
	 */
	EAttribute getBuiltInAtom_BuiltInID();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.swrl.BuiltInAtom#getArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arg</em>'.
	 * @see net.sf.ictalive.swrl.BuiltInAtom#getArg()
	 * @see #getBuiltInAtom()
	 * @generated
	 */
	EReference getBuiltInAtom_Arg();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.swrl.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Object</em>'.
	 * @see net.sf.ictalive.swrl.DataObject
	 * @generated
	 */
	EClass getDataObject();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.swrl.DataVariable <em>Data Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Variable</em>'.
	 * @see net.sf.ictalive.swrl.DataVariable
	 * @generated
	 */
	EClass getDataVariable();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.swrl.DataVariable#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see net.sf.ictalive.swrl.DataVariable#getURI()
	 * @see #getDataVariable()
	 * @generated
	 */
	EAttribute getDataVariable_URI();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.swrl.DataLiteral <em>Data Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Literal</em>'.
	 * @see net.sf.ictalive.swrl.DataLiteral
	 * @generated
	 */
	EClass getDataLiteral();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.swrl.DataLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.ictalive.swrl.DataLiteral#getValue()
	 * @see #getDataLiteral()
	 * @generated
	 */
	EAttribute getDataLiteral_Value();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.swrl.DataRangeAtom <em>Data Range Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Range Atom</em>'.
	 * @see net.sf.ictalive.swrl.DataRangeAtom
	 * @generated
	 */
	EClass getDataRangeAtom();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.swrl.DataRangeAtom#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicate</em>'.
	 * @see net.sf.ictalive.swrl.DataRangeAtom#getPredicate()
	 * @see #getDataRangeAtom()
	 * @generated
	 */
	EAttribute getDataRangeAtom_Predicate();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.swrl.DataRangeAtom#getArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arg</em>'.
	 * @see net.sf.ictalive.swrl.DataRangeAtom#getArg()
	 * @see #getDataRangeAtom()
	 * @generated
	 */
	EReference getDataRangeAtom_Arg();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.swrl.DataValuedPropertyAtom <em>Data Valued Property Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Valued Property Atom</em>'.
	 * @see net.sf.ictalive.swrl.DataValuedPropertyAtom
	 * @generated
	 */
	EClass getDataValuedPropertyAtom();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.swrl.DataValuedPropertyAtom#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicate</em>'.
	 * @see net.sf.ictalive.swrl.DataValuedPropertyAtom#getPredicate()
	 * @see #getDataValuedPropertyAtom()
	 * @generated
	 */
	EAttribute getDataValuedPropertyAtom_Predicate();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.swrl.DataValuedPropertyAtom#getArg1 <em>Arg1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arg1</em>'.
	 * @see net.sf.ictalive.swrl.DataValuedPropertyAtom#getArg1()
	 * @see #getDataValuedPropertyAtom()
	 * @generated
	 */
	EReference getDataValuedPropertyAtom_Arg1();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.swrl.DataValuedPropertyAtom#getArg2 <em>Arg2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arg2</em>'.
	 * @see net.sf.ictalive.swrl.DataValuedPropertyAtom#getArg2()
	 * @see #getDataValuedPropertyAtom()
	 * @generated
	 */
	EReference getDataValuedPropertyAtom_Arg2();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.swrl.RuleType <em>Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Type</em>'.
	 * @see net.sf.ictalive.swrl.RuleType
	 * @generated
	 */
	EEnum getRuleType();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link net.sf.ictalive.swrl.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.swrl.impl.RuleImpl
		 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>URI Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__URI_REFERENCE = eINSTANCE.getRule_URIReference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__TYPE = eINSTANCE.getRule_Type();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__ANNOTATION = eINSTANCE.getRule_Annotation();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__BODY = eINSTANCE.getRule_Body();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__HEAD = eINSTANCE.getRule_Head();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.swrl.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.swrl.impl.AnnotationImpl
		 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__DESC = eINSTANCE.getAnnotation_Desc();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.swrl.impl.AtomImpl <em>Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.swrl.impl.AtomImpl
		 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getAtom()
		 * @generated
		 */
		EClass ATOM = eINSTANCE.getAtom();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.swrl.impl.AntecedentImpl <em>Antecedent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.swrl.impl.AntecedentImpl
		 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getAntecedent()
		 * @generated
		 */
		EClass ANTECEDENT = eINSTANCE.getAntecedent();

		/**
		 * The meta object literal for the '<em><b>Atom</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTECEDENT__ATOM = eINSTANCE.getAntecedent_Atom();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.swrl.impl.ConsequentImpl <em>Consequent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.swrl.impl.ConsequentImpl
		 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getConsequent()
		 * @generated
		 */
		EClass CONSEQUENT = eINSTANCE.getConsequent();

		/**
		 * The meta object literal for the '<em><b>Atom</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSEQUENT__ATOM = eINSTANCE.getConsequent_Atom();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.swrl.impl.ClassAtomImpl <em>Class Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.swrl.impl.ClassAtomImpl
		 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getClassAtom()
		 * @generated
		 */
		EClass CLASS_ATOM = eINSTANCE.getClassAtom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_ATOM__DESCRIPTION = eINSTANCE.getClassAtom_Description();

		/**
		 * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_ATOM__ARG = eINSTANCE.getClassAtom_Arg();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.swrl.impl.IndividualPropertyAtomImpl <em>Individual Property Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.swrl.impl.IndividualPropertyAtomImpl
		 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getIndividualPropertyAtom()
		 * @generated
		 */
		EClass INDIVIDUAL_PROPERTY_ATOM = eINSTANCE.getIndividualPropertyAtom();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDIVIDUAL_PROPERTY_ATOM__PREDICATE = eINSTANCE.getIndividualPropertyAtom_Predicate();

		/**
		 * The meta object literal for the '<em><b>Arg1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_PROPERTY_ATOM__ARG1 = eINSTANCE.getIndividualPropertyAtom_Arg1();

		/**
		 * The meta object literal for the '<em><b>Arg2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_PROPERTY_ATOM__ARG2 = eINSTANCE.getIndividualPropertyAtom_Arg2();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.swrl.impl.IndividualObjectImpl <em>Individual Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.swrl.impl.IndividualObjectImpl
		 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getIndividualObject()
		 * @generated
		 */
		EClass INDIVIDUAL_OBJECT = eINSTANCE.getIndividualObject();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.swrl.impl.IndividualVariableImpl <em>Individual Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.swrl.impl.IndividualVariableImpl
		 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getIndividualVariable()
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
		 * The meta object literal for the '{@link net.sf.ictalive.swrl.impl.IndividualIDImpl <em>Individual ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.swrl.impl.IndividualIDImpl
		 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getIndividualID()
		 * @generated
		 */
		EClass INDIVIDUAL_ID = eINSTANCE.getIndividualID();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDIVIDUAL_ID__ID = eINSTANCE.getIndividualID_Id();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.swrl.impl.SameAsAtomImpl <em>Same As Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.swrl.impl.SameAsAtomImpl
		 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getSameAsAtom()
		 * @generated
		 */
		EClass SAME_AS_ATOM = eINSTANCE.getSameAsAtom();

		/**
		 * The meta object literal for the '<em><b>Arg1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAME_AS_ATOM__ARG1 = eINSTANCE.getSameAsAtom_Arg1();

		/**
		 * The meta object literal for the '<em><b>Arg2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAME_AS_ATOM__ARG2 = eINSTANCE.getSameAsAtom_Arg2();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.swrl.impl.DifferentFromAtomImpl <em>Different From Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.swrl.impl.DifferentFromAtomImpl
		 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getDifferentFromAtom()
		 * @generated
		 */
		EClass DIFFERENT_FROM_ATOM = eINSTANCE.getDifferentFromAtom();

		/**
		 * The meta object literal for the '<em><b>Arg1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFERENT_FROM_ATOM__ARG1 = eINSTANCE.getDifferentFromAtom_Arg1();

		/**
		 * The meta object literal for the '<em><b>Arg2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFERENT_FROM_ATOM__ARG2 = eINSTANCE.getDifferentFromAtom_Arg2();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.swrl.impl.BuiltInAtomImpl <em>Built In Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.swrl.impl.BuiltInAtomImpl
		 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getBuiltInAtom()
		 * @generated
		 */
		EClass BUILT_IN_ATOM = eINSTANCE.getBuiltInAtom();

		/**
		 * The meta object literal for the '<em><b>Built In ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILT_IN_ATOM__BUILT_IN_ID = eINSTANCE.getBuiltInAtom_BuiltInID();

		/**
		 * The meta object literal for the '<em><b>Arg</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILT_IN_ATOM__ARG = eINSTANCE.getBuiltInAtom_Arg();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.swrl.impl.DataObjectImpl <em>Data Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.swrl.impl.DataObjectImpl
		 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getDataObject()
		 * @generated
		 */
		EClass DATA_OBJECT = eINSTANCE.getDataObject();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.swrl.impl.DataVariableImpl <em>Data Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.swrl.impl.DataVariableImpl
		 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getDataVariable()
		 * @generated
		 */
		EClass DATA_VARIABLE = eINSTANCE.getDataVariable();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_VARIABLE__URI = eINSTANCE.getDataVariable_URI();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.swrl.impl.DataLiteralImpl <em>Data Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.swrl.impl.DataLiteralImpl
		 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getDataLiteral()
		 * @generated
		 */
		EClass DATA_LITERAL = eINSTANCE.getDataLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LITERAL__VALUE = eINSTANCE.getDataLiteral_Value();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.swrl.impl.DataRangeAtomImpl <em>Data Range Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.swrl.impl.DataRangeAtomImpl
		 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getDataRangeAtom()
		 * @generated
		 */
		EClass DATA_RANGE_ATOM = eINSTANCE.getDataRangeAtom();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RANGE_ATOM__PREDICATE = eINSTANCE.getDataRangeAtom_Predicate();

		/**
		 * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RANGE_ATOM__ARG = eINSTANCE.getDataRangeAtom_Arg();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.swrl.impl.DataValuedPropertyAtomImpl <em>Data Valued Property Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.swrl.impl.DataValuedPropertyAtomImpl
		 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getDataValuedPropertyAtom()
		 * @generated
		 */
		EClass DATA_VALUED_PROPERTY_ATOM = eINSTANCE.getDataValuedPropertyAtom();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_VALUED_PROPERTY_ATOM__PREDICATE = eINSTANCE.getDataValuedPropertyAtom_Predicate();

		/**
		 * The meta object literal for the '<em><b>Arg1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VALUED_PROPERTY_ATOM__ARG1 = eINSTANCE.getDataValuedPropertyAtom_Arg1();

		/**
		 * The meta object literal for the '<em><b>Arg2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VALUED_PROPERTY_ATOM__ARG2 = eINSTANCE.getDataValuedPropertyAtom_Arg2();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.swrl.RuleType <em>Rule Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.swrl.RuleType
		 * @see net.sf.ictalive.swrl.impl.SwrlPackageImpl#getRuleType()
		 * @generated
		 */
		EEnum RULE_TYPE = eINSTANCE.getRuleType();

	}

} //SwrlPackage
