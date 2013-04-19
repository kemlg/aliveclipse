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
 * A representation of the model object '<em><b>Datavalued Property Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.rules.swrl.DatavaluedPropertyAtom#getPropertyPredicate <em>Property Predicate</em>}</li>
 *   <li>{@link net.sf.ictalive.rules.swrl.DatavaluedPropertyAtom#getArgument2 <em>Argument2</em>}</li>
 *   <li>{@link net.sf.ictalive.rules.swrl.DatavaluedPropertyAtom#getArgument1 <em>Argument1</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getDatavaluedPropertyAtom()
 * @model
 * @generated
 */
public interface DatavaluedPropertyAtom extends Atom {
	/**
	 * Returns the value of the '<em><b>Property Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Predicate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Predicate</em>' reference.
	 * @see #setPropertyPredicate(Concept)
	 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getDatavaluedPropertyAtom_PropertyPredicate()
	 * @model
	 * @generated
	 */
	Concept getPropertyPredicate();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.rules.swrl.DatavaluedPropertyAtom#getPropertyPredicate <em>Property Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Predicate</em>' reference.
	 * @see #getPropertyPredicate()
	 * @generated
	 */
	void setPropertyPredicate(Concept value);

	/**
	 * Returns the value of the '<em><b>Argument2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument2</em>' containment reference.
	 * @see #setArgument2(DObject)
	 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getDatavaluedPropertyAtom_Argument2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DObject getArgument2();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.rules.swrl.DatavaluedPropertyAtom#getArgument2 <em>Argument2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument2</em>' containment reference.
	 * @see #getArgument2()
	 * @generated
	 */
	void setArgument2(DObject value);

	/**
	 * Returns the value of the '<em><b>Argument1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument1</em>' containment reference.
	 * @see #setArgument1(IObject)
	 * @see net.sf.ictalive.rules.swrl.SwrlPackage#getDatavaluedPropertyAtom_Argument1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IObject getArgument1();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.rules.swrl.DatavaluedPropertyAtom#getArgument1 <em>Argument1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument1</em>' containment reference.
	 * @see #getArgument1()
	 * @generated
	 */
	void setArgument1(IObject value);

} // DatavaluedPropertyAtom
