/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.swrl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Same As Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.swrl.SameAsAtom#getArg1 <em>Arg1</em>}</li>
 *   <li>{@link net.sf.ictalive.swrl.SameAsAtom#getArg2 <em>Arg2</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.swrl.SwrlPackage#getSameAsAtom()
 * @model
 * @generated
 */
public interface SameAsAtom extends Atom
{
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
	 * @see net.sf.ictalive.swrl.SwrlPackage#getSameAsAtom_Arg1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IndividualObject getArg1();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.swrl.SameAsAtom#getArg1 <em>Arg1</em>}' containment reference.
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
	 * @see #setArg2(IndividualObject)
	 * @see net.sf.ictalive.swrl.SwrlPackage#getSameAsAtom_Arg2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IndividualObject getArg2();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.swrl.SameAsAtom#getArg2 <em>Arg2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg2</em>' containment reference.
	 * @see #getArg2()
	 * @generated
	 */
	void setArg2(IndividualObject value);

} // SameAsAtom
