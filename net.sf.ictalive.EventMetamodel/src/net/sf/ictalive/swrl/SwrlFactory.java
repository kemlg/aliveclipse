/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.swrl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.swrl.SwrlPackage
 * @generated
 */
public interface SwrlFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SwrlFactory eINSTANCE = net.sf.ictalive.swrl.impl.SwrlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Antecedent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Antecedent</em>'.
	 * @generated
	 */
	Antecedent createAntecedent();

	/**
	 * Returns a new object of class '<em>Consequent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consequent</em>'.
	 * @generated
	 */
	Consequent createConsequent();

	/**
	 * Returns a new object of class '<em>Class Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Atom</em>'.
	 * @generated
	 */
	ClassAtom createClassAtom();

	/**
	 * Returns a new object of class '<em>Individual Property Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individual Property Atom</em>'.
	 * @generated
	 */
	IndividualPropertyAtom createIndividualPropertyAtom();

	/**
	 * Returns a new object of class '<em>Individual Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individual Variable</em>'.
	 * @generated
	 */
	IndividualVariable createIndividualVariable();

	/**
	 * Returns a new object of class '<em>Individual ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individual ID</em>'.
	 * @generated
	 */
	IndividualID createIndividualID();

	/**
	 * Returns a new object of class '<em>Same As Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Same As Atom</em>'.
	 * @generated
	 */
	SameAsAtom createSameAsAtom();

	/**
	 * Returns a new object of class '<em>Different From Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Different From Atom</em>'.
	 * @generated
	 */
	DifferentFromAtom createDifferentFromAtom();

	/**
	 * Returns a new object of class '<em>Built In Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Built In Atom</em>'.
	 * @generated
	 */
	BuiltInAtom createBuiltInAtom();

	/**
	 * Returns a new object of class '<em>Data Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Variable</em>'.
	 * @generated
	 */
	DataVariable createDataVariable();

	/**
	 * Returns a new object of class '<em>Data Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Literal</em>'.
	 * @generated
	 */
	DataLiteral createDataLiteral();

	/**
	 * Returns a new object of class '<em>Data Range Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Range Atom</em>'.
	 * @generated
	 */
	DataRangeAtom createDataRangeAtom();

	/**
	 * Returns a new object of class '<em>Data Valued Property Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Valued Property Atom</em>'.
	 * @generated
	 */
	DataValuedPropertyAtom createDataValuedPropertyAtom();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SwrlPackage getSwrlPackage();

} //SwrlFactory
