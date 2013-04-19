/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfvv.impl;

import java.util.Collection;

import net.sf.ictalive.coordination.actions.Action;

import net.sf.ictalive.coordination.agents.Agent;

import net.sf.ictalive.coordination.tasks.Plan;

import net.sf.ictalive.coordination.wfvv.EventGroup;
import net.sf.ictalive.coordination.wfvv.EventModelContainer;
import net.sf.ictalive.coordination.wfvv.WfvvPackage;

import net.sf.ictalive.operetta.OM.Objective;

import net.sf.ictalive.owls.service.Service;

import net.sf.ictalive.runtime.enactment.Enactment;
import net.sf.ictalive.runtime.enactment.Resource;

import net.sf.ictalive.runtime.event.Actor;
import net.sf.ictalive.runtime.event.Event;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Model Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.wfvv.impl.EventModelContainerImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.wfvv.impl.EventModelContainerImpl#getEventGroups <em>Event Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventModelContainerImpl extends EObjectImpl implements EventModelContainer {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getEventGroups() <em>Event Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<EventGroup> eventGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventModelContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WfvvPackage.Literals.EVENT_MODEL_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, WfvvPackage.EVENT_MODEL_CONTAINER__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventGroup> getEventGroups() {
		if (eventGroups == null) {
			eventGroups = new EObjectContainmentEList<EventGroup>(EventGroup.class, this, WfvvPackage.EVENT_MODEL_CONTAINER__EVENT_GROUPS);
		}
		return eventGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WfvvPackage.EVENT_MODEL_CONTAINER__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case WfvvPackage.EVENT_MODEL_CONTAINER__EVENT_GROUPS:
				return ((InternalEList<?>)getEventGroups()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WfvvPackage.EVENT_MODEL_CONTAINER__EVENTS:
				return getEvents();
			case WfvvPackage.EVENT_MODEL_CONTAINER__EVENT_GROUPS:
				return getEventGroups();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WfvvPackage.EVENT_MODEL_CONTAINER__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case WfvvPackage.EVENT_MODEL_CONTAINER__EVENT_GROUPS:
				getEventGroups().clear();
				getEventGroups().addAll((Collection<? extends EventGroup>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WfvvPackage.EVENT_MODEL_CONTAINER__EVENTS:
				getEvents().clear();
				return;
			case WfvvPackage.EVENT_MODEL_CONTAINER__EVENT_GROUPS:
				getEventGroups().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WfvvPackage.EVENT_MODEL_CONTAINER__EVENTS:
				return events != null && !events.isEmpty();
			case WfvvPackage.EVENT_MODEL_CONTAINER__EVENT_GROUPS:
				return eventGroups != null && !eventGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventModelContainerImpl
