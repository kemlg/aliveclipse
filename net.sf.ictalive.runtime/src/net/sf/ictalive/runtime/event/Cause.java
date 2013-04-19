/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.event;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.event.Cause#getEvent <em>Event</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.event.Cause#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.event.EventPackage#getCause()
 * @model
 * @generated
 */
public interface Cause extends EObject {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see net.sf.ictalive.runtime.event.EventPackage#getCause_Event()
	 * @model required="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.event.Cause#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.ictalive.runtime.event.ProvenanceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see net.sf.ictalive.runtime.event.ProvenanceType
	 * @see #setType(ProvenanceType)
	 * @see net.sf.ictalive.runtime.event.EventPackage#getCause_Type()
	 * @model
	 * @generated
	 */
	ProvenanceType getType();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.event.Cause#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see net.sf.ictalive.runtime.event.ProvenanceType
	 * @see #getType()
	 * @generated
	 */
	void setType(ProvenanceType value);

} // Cause
