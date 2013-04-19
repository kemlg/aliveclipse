/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact;

import net.sf.ictalive.operetta.OM.Norm;

import net.sf.ictalive.runtime.event.Actor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Norm Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.fact.NormAct#getWho <em>Who</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.fact.NormAct#getNorm <em>Norm</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.fact.FactPackage#getNormAct()
 * @model abstract="true"
 * @generated
 */
public interface NormAct extends Fact {
	/**
	 * Returns the value of the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who</em>' reference.
	 * @see #setWho(Actor)
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getNormAct_Who()
	 * @model
	 * @generated
	 */
	Actor getWho();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.fact.NormAct#getWho <em>Who</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who</em>' reference.
	 * @see #getWho()
	 * @generated
	 */
	void setWho(Actor value);

	/**
	 * Returns the value of the '<em><b>Norm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Norm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Norm</em>' reference.
	 * @see #setNorm(Norm)
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getNormAct_Norm()
	 * @model
	 * @generated
	 */
	Norm getNorm();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.fact.NormAct#getNorm <em>Norm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Norm</em>' reference.
	 * @see #getNorm()
	 * @generated
	 */
	void setNorm(Norm value);

} // NormAct
