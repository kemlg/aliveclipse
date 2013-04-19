/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Fact;

import net.sf.ictalive.EventModel.Event.Actor;

import net.sf.ictalive.opera.OM.Norm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Norm Violated</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.NormViolated#getWho <em>Who</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.NormViolated#getNorm <em>Norm</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getNormViolated()
 * @model
 * @generated
 */
public interface NormViolated extends Fact
{
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
	 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getNormViolated_Who()
	 * @model
	 * @generated
	 */
	Actor getWho();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Fact.NormViolated#getWho <em>Who</em>}' reference.
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
	 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getNormViolated_Norm()
	 * @model
	 * @generated
	 */
	Norm getNorm();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Fact.NormViolated#getNorm <em>Norm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Norm</em>' reference.
	 * @see #getNorm()
	 * @generated
	 */
	void setNorm(Norm value);

} // NormViolated
