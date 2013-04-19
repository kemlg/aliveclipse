/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.swrl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Valued Property Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.swrl.DataValuedPropertyAtom#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link net.sf.ictalive.swrl.DataValuedPropertyAtom#getArg1 <em>Arg1</em>}</li>
 *   <li>{@link net.sf.ictalive.swrl.DataValuedPropertyAtom#getArg2 <em>Arg2</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.swrl.SwrlPackage#getDataValuedPropertyAtom()
 * @model
 * @generated
 */
public interface DataValuedPropertyAtom extends Atom
{
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' attribute.
	 * @see #setPredicate(String)
	 * @see net.sf.ictalive.swrl.SwrlPackage#getDataValuedPropertyAtom_Predicate()
	 * @model
	 * @generated
	 */
	String getPredicate();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.swrl.DataValuedPropertyAtom#getPredicate <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' attribute.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(String value);

	/**
	 * Returns the value of the '<em><b>Arg1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg1</em>' containment reference.
	 * @see #setArg1(IndividualObject)
	 * @see net.sf.ictalive.swrl.SwrlPackage#getDataValuedPropertyAtom_Arg1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IndividualObject getArg1();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.swrl.DataValuedPropertyAtom#getArg1 <em>Arg1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg1</em>' containment reference.
	 * @see #getArg1()
	 * @generated
	 */
	void setArg1(IndividualObject value);

	/**
	 * Returns the value of the '<em><b>Arg2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg2</em>' containment reference.
	 * @see #setArg2(DataObject)
	 * @see net.sf.ictalive.swrl.SwrlPackage#getDataValuedPropertyAtom_Arg2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataObject getArg2();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.swrl.DataValuedPropertyAtom#getArg2 <em>Arg2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg2</em>' containment reference.
	 * @see #getArg2()
	 * @generated
	 */
	void setArg2(DataObject value);

} // DataValuedPropertyAtom
