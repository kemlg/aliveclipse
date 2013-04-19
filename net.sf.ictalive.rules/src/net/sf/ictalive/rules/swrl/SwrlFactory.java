/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.swrl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.rules.swrl.SwrlPackage
 * @generated
 */
public interface SwrlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SwrlFactory eINSTANCE = net.sf.ictalive.rules.swrl.impl.SwrlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Atom List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atom List</em>'.
	 * @generated
	 */
	AtomList createAtomList();

	/**
	 * Returns a new object of class '<em>Built In Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Built In Atom</em>'.
	 * @generated
	 */
	BuiltInAtom createBuiltInAtom();

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
	 * Returns a new object of class '<em>Same Individual Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Same Individual Atom</em>'.
	 * @generated
	 */
	SameIndividualAtom createSameIndividualAtom();

	/**
	 * Returns a new object of class '<em>Different Individuals Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Different Individuals Atom</em>'.
	 * @generated
	 */
	DifferentIndividualsAtom createDifferentIndividualsAtom();

	/**
	 * Returns a new object of class '<em>Datavalued Property Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datavalued Property Atom</em>'.
	 * @generated
	 */
	DatavaluedPropertyAtom createDatavaluedPropertyAtom();

	/**
	 * Returns a new object of class '<em>Data Range Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Range Atom</em>'.
	 * @generated
	 */
	DataRangeAtom createDataRangeAtom();

	/**
	 * Returns a new object of class '<em>Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Value</em>'.
	 * @generated
	 */
	DataValue createDataValue();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SwrlPackage getSwrlPackage();

} //SwrlFactory
