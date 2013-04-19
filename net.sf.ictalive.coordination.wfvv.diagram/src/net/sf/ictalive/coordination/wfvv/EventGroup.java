/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfvv;

import net.sf.ictalive.runtime.event.Event;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.wfvv.EventGroup#getEvents <em>Events</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.wfvv.EventGroup#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.wfvv.EventGroup#isMinimized <em>Minimized</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.wfvv.WfvvPackage#getEventGroup()
 * @model
 * @generated
 */
public interface EventGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.runtime.event.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see net.sf.ictalive.coordination.wfvv.WfvvPackage#getEventGroup_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.ictalive.coordination.wfvv.WfvvPackage#getEventGroup_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.wfvv.EventGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Minimized</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimized</em>' attribute.
	 * @see #setMinimized(boolean)
	 * @see net.sf.ictalive.coordination.wfvv.WfvvPackage#getEventGroup_Minimized()
	 * @model default="true" required="true" transient="true"
	 * @generated
	 */
	boolean isMinimized();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.wfvv.EventGroup#isMinimized <em>Minimized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimized</em>' attribute.
	 * @see #isMinimized()
	 * @generated
	 */
	void setMinimized(boolean value);

} // EventGroup
