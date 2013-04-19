/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action;

import net.sf.ictalive.operetta.OM.PartialStateDescription;

import net.sf.ictalive.rules.swrl.Atom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Of World</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.action.StateOfWorld#getPartialStateDescription <em>Partial State Description</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.StateOfWorld#getAtom <em>Atom</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.StateOfWorld#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.action.ActionPackage#getStateOfWorld()
 * @model
 * @generated
 */
public interface StateOfWorld extends EObject {
	/**
	 * Returns the value of the '<em><b>Partial State Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partial State Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partial State Description</em>' reference.
	 * @see #setPartialStateDescription(PartialStateDescription)
	 * @see net.sf.ictalive.runtime.action.ActionPackage#getStateOfWorld_PartialStateDescription()
	 * @model
	 * @generated
	 */
	PartialStateDescription getPartialStateDescription();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.action.StateOfWorld#getPartialStateDescription <em>Partial State Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partial State Description</em>' reference.
	 * @see #getPartialStateDescription()
	 * @generated
	 */
	void setPartialStateDescription(PartialStateDescription value);

	/**
	 * Returns the value of the '<em><b>Atom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atom</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atom</em>' reference.
	 * @see #setAtom(Atom)
	 * @see net.sf.ictalive.runtime.action.ActionPackage#getStateOfWorld_Atom()
	 * @model
	 * @generated
	 */
	Atom getAtom();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.action.StateOfWorld#getAtom <em>Atom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atom</em>' reference.
	 * @see #getAtom()
	 * @generated
	 */
	void setAtom(Atom value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see net.sf.ictalive.runtime.action.ActionPackage#getStateOfWorld_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.action.StateOfWorld#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // StateOfWorld
