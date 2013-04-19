/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact;

import net.sf.ictalive.runtime.action.Action;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.fact.Content#getFact <em>Fact</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.fact.Content#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.fact.FactPackage#getContent()
 * @model
 * @generated
 */
public interface Content extends EObject {
	/**
	 * Returns the value of the '<em><b>Fact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fact</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact</em>' containment reference.
	 * @see #setFact(Fact)
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getContent_Fact()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Fact getFact();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.fact.Content#getFact <em>Fact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact</em>' containment reference.
	 * @see #getFact()
	 * @generated
	 */
	void setFact(Fact value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.runtime.action.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' containment reference list.
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getContent_Effect()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getEffect();

} // Content
