/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfvv;

import net.sf.ictalive.coordination.actions.Action;

import net.sf.ictalive.coordination.agents.Agent;

import net.sf.ictalive.coordination.tasks.Plan;

import net.sf.ictalive.operetta.OM.Objective;

import net.sf.ictalive.owls.service.Service;

import net.sf.ictalive.runtime.enactment.Enactment;
import net.sf.ictalive.runtime.enactment.Resource;

import net.sf.ictalive.runtime.event.Actor;
import net.sf.ictalive.runtime.event.Event;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Model Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.wfvv.EventModelContainer#getEvents <em>Events</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.wfvv.EventModelContainer#getEventGroups <em>Event Groups</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.wfvv.EventModelContainer#getObjects <em>Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.wfvv.WfvvPackage#getEventModelContainer()
 * @model
 * @generated
 */
public interface EventModelContainer extends EObject {
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
	 * @see net.sf.ictalive.coordination.wfvv.WfvvPackage#getEventModelContainer_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Event Groups</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.coordination.wfvv.EventGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Groups</em>' containment reference list.
	 * @see net.sf.ictalive.coordination.wfvv.WfvvPackage#getEventModelContainer_EventGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventGroup> getEventGroups();

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see net.sf.ictalive.coordination.wfvv.WfvvPackage#getEventModelContainer_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getObjects();

} // EventModelContainer
