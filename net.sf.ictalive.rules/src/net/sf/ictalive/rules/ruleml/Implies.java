/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.ruleml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.rules.ruleml.Implies#getHead <em>Head</em>}</li>
 *   <li>{@link net.sf.ictalive.rules.ruleml.Implies#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.rules.ruleml.RulemlPackage#getImplies()
 * @model
 * @generated
 */
public interface Implies extends EObject {
	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(Head)
	 * @see net.sf.ictalive.rules.ruleml.RulemlPackage#getImplies_Head()
	 * @model containment="true"
	 * @generated
	 */
	Head getHead();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.rules.ruleml.Implies#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(Head value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Body)
	 * @see net.sf.ictalive.rules.ruleml.RulemlPackage#getImplies_Body()
	 * @model containment="true"
	 * @generated
	 */
	Body getBody();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.rules.ruleml.Implies#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Body value);

} // Implies
