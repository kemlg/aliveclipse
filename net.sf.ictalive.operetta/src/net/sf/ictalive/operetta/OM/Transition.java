/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.Transition#getTransitionID <em>Transition ID</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.Transition#getTransitionType <em>Transition Type</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.Transition#getNorms <em>Norms</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.operetta.OM.OMPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Transition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition ID</em>' attribute.
	 * @see #setTransitionID(String)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getTransition_TransitionID()
	 * @model id="true" required="true" derived="true"
	 * @generated
	 */
	String getTransitionID();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.Transition#getTransitionID <em>Transition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition ID</em>' attribute.
	 * @see #getTransitionID()
	 * @generated
	 */
	void setTransitionID(String value);

	/**
	 * Returns the value of the '<em><b>Transition Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.ictalive.operetta.OM.TransitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Type</em>' attribute.
	 * @see net.sf.ictalive.operetta.OM.TransitionType
	 * @see #setTransitionType(TransitionType)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getTransition_TransitionType()
	 * @model required="true"
	 * @generated
	 */
	TransitionType getTransitionType();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.Transition#getTransitionType <em>Transition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Type</em>' attribute.
	 * @see net.sf.ictalive.operetta.OM.TransitionType
	 * @see #getTransitionType()
	 * @generated
	 */
	void setTransitionType(TransitionType value);

	/**
	 * Returns the value of the '<em><b>Norms</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.operetta.OM.TransitionNorm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Norms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Norms</em>' reference list.
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getTransition_Norms()
	 * @model required="true"
	 * @generated
	 */
	EList<TransitionNorm> getNorms();

} // Transition
