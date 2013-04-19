/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.Atom#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.Atom#getConcept <em>Concept</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.Atom#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.operetta.OM.OMPackage#getAtom()
 * @model
 * @generated
 */
public interface Atom extends StateFormula {
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' attribute.
	 * @see #isSetPredicate()
	 * @see #unsetPredicate()
	 * @see #setPredicate(String)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getAtom_Predicate()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	String getPredicate();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.Atom#getPredicate <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' attribute.
	 * @see #isSetPredicate()
	 * @see #unsetPredicate()
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(String value);

	/**
	 * Unsets the value of the '{@link net.sf.ictalive.operetta.OM.Atom#getPredicate <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPredicate()
	 * @see #getPredicate()
	 * @see #setPredicate(String)
	 * @generated
	 */
	void unsetPredicate();

	/**
	 * Returns whether the value of the '{@link net.sf.ictalive.operetta.OM.Atom#getPredicate <em>Predicate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Predicate</em>' attribute is set.
	 * @see #unsetPredicate()
	 * @see #getPredicate()
	 * @see #setPredicate(String)
	 * @generated
	 */
	boolean isSetPredicate();

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' reference.
	 * @see #setConcept(Concept)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getAtom_Concept()
	 * @model required="true"
	 * @generated
	 */
	Concept getConcept();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.Atom#getConcept <em>Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept</em>' reference.
	 * @see #getConcept()
	 * @generated
	 */
	void setConcept(Concept value);
	
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.operetta.OM.Term}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' reference list.
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getAtom_Arguments()
	 * @model
	 * @generated
	 */
	EList<Term> getArguments();

	// @added
	public String write();

} // Atom
