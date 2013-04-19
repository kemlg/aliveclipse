/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact;

import net.sf.ictalive.runtime.event.Event;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fulfilment Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.fact.FulfilmentAct#getRelatedEvent <em>Related Event</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.fact.FulfilmentAct#isSatisfy <em>Satisfy</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.fact.FactPackage#getFulfilmentAct()
 * @model abstract="true"
 * @generated
 */
public interface FulfilmentAct extends Fact {
	/**
	 * Returns the value of the '<em><b>Related Event</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.runtime.event.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Event</em>' reference list.
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getFulfilmentAct_RelatedEvent()
	 * @model required="true"
	 * @generated
	 */
	EList<Event> getRelatedEvent();

	/**
	 * Returns the value of the '<em><b>Satisfy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfy</em>' attribute.
	 * @see #setSatisfy(boolean)
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getFulfilmentAct_Satisfy()
	 * @model
	 * @generated
	 */
	boolean isSatisfy();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.fact.FulfilmentAct#isSatisfy <em>Satisfy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfy</em>' attribute.
	 * @see #isSatisfy()
	 * @generated
	 */
	void setSatisfy(boolean value);

} // FulfilmentAct
