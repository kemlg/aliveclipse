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
 * A representation of the model object '<em><b>Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.fact.Fact#getDueTo <em>Due To</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.fact.Fact#getEffect <em>Effect</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.fact.Fact#getRelate <em>Relate</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.fact.FactPackage#getFact()
 * @model abstract="true"
 * @generated
 */
public interface Fact extends EObject {
	/**
	 * Returns the value of the '<em><b>Due To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due To</em>' reference.
	 * @see #setDueTo(Action)
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getFact_DueTo()
	 * @model
	 * @generated
	 */
	Action getDueTo();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.fact.Fact#getDueTo <em>Due To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due To</em>' reference.
	 * @see #getDueTo()
	 * @generated
	 */
	void setDueTo(Action value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' reference.
	 * @see #setEffect(Action)
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getFact_Effect()
	 * @model
	 * @generated
	 */
	Action getEffect();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.fact.Fact#getEffect <em>Effect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(Action value);

	/**
	 * Returns the value of the '<em><b>Relate</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.runtime.fact.Fact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relate</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relate</em>' reference list.
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getFact_Relate()
	 * @model
	 * @generated
	 */
	EList<Fact> getRelate();

} // Fact
