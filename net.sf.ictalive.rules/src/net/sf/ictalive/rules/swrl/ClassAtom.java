/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.swrl;

import net.sf.ictalive.operetta.OM.Concept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.rules.swrl.ClassAtom#getClassPredicate <em>Class Predicate</em>}</li>
 *   <li>{@link net.sf.ictalive.rules.swrl.ClassAtom#getArgument1 <em>Argument1</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getClassAtom()
 * @model
 * @generated
 */
public interface ClassAtom extends Atom {
	/**
	 * Returns the value of the '<em><b>Class Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Predicate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Predicate</em>' reference.
	 * @see #setClassPredicate(Concept)
	 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getClassAtom_ClassPredicate()
	 * @model required="true"
	 * @generated
	 */
	Concept getClassPredicate();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.rules.swrl.ClassAtom#getClassPredicate <em>Class Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Predicate</em>' reference.
	 * @see #getClassPredicate()
	 * @generated
	 */
	void setClassPredicate(Concept value);

	/**
	 * Returns the value of the '<em><b>Argument1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument1</em>' containment reference.
	 * @see #setArgument1(IObject)
	 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getClassAtom_Argument1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IObject getArgument1();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.rules.swrl.ClassAtom#getArgument1 <em>Argument1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument1</em>' containment reference.
	 * @see #getArgument1()
	 * @generated
	 */
	void setArgument1(IObject value);

} // ClassAtom
