/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.OM.Atom#getProposition <em>Proposition</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.Atom#getConcept <em>Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.opera.OM.OMPackage#getAtom()
 * @model
 * @generated
 */
public interface Atom extends StateFormula
{
	/**
	 * Returns the value of the '<em><b>Proposition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proposition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposition</em>' attribute.
	 * @see #isSetProposition()
	 * @see #unsetProposition()
	 * @see #setProposition(String)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getAtom_Proposition()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	String getProposition();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.Atom#getProposition <em>Proposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proposition</em>' attribute.
	 * @see #isSetProposition()
	 * @see #unsetProposition()
	 * @see #getProposition()
	 * @generated
	 */
	void setProposition(String value);

	/**
	 * Unsets the value of the '{@link net.sf.ictalive.opera.OM.Atom#getProposition <em>Proposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProposition()
	 * @see #getProposition()
	 * @see #setProposition(String)
	 * @generated
	 */
	void unsetProposition();

	/**
	 * Returns whether the value of the '{@link net.sf.ictalive.opera.OM.Atom#getProposition <em>Proposition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Proposition</em>' attribute is set.
	 * @see #unsetProposition()
	 * @see #getProposition()
	 * @see #setProposition(String)
	 * @generated
	 */
	boolean isSetProposition();

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
	 * @see net.sf.ictalive.opera.OM.OMPackage#getAtom_Concept()
	 * @model required="true"
	 * @generated
	 */
	Concept getConcept();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.Atom#getConcept <em>Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept</em>' reference.
	 * @see #getConcept()
	 * @generated
	 */
	void setConcept(Concept value);

} // Atom
