/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact.impl;

import java.util.Collection;

import net.sf.ictalive.runtime.event.Event;

import net.sf.ictalive.runtime.fact.FactPackage;
import net.sf.ictalive.runtime.fact.FulfilmentAct;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fulfilment Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.fact.impl.FulfilmentActImpl#getRelatedEvent <em>Related Event</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.fact.impl.FulfilmentActImpl#isSatisfy <em>Satisfy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FulfilmentActImpl extends FactImpl implements FulfilmentAct {
	/**
	 * The cached value of the '{@link #getRelatedEvent() <em>Related Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> relatedEvent;

	/**
	 * The default value of the '{@link #isSatisfy() <em>Satisfy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSatisfy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SATISFY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSatisfy() <em>Satisfy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSatisfy()
	 * @generated
	 * @ordered
	 */
	protected boolean satisfy = SATISFY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FulfilmentActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactPackage.Literals.FULFILMENT_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getRelatedEvent() {
		if (relatedEvent == null) {
			relatedEvent = new EObjectResolvingEList<Event>(Event.class, this, FactPackage.FULFILMENT_ACT__RELATED_EVENT);
		}
		return relatedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSatisfy() {
		return satisfy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfy(boolean newSatisfy) {
		boolean oldSatisfy = satisfy;
		satisfy = newSatisfy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactPackage.FULFILMENT_ACT__SATISFY, oldSatisfy, satisfy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FactPackage.FULFILMENT_ACT__RELATED_EVENT:
				return getRelatedEvent();
			case FactPackage.FULFILMENT_ACT__SATISFY:
				return isSatisfy();
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
			case FactPackage.FULFILMENT_ACT__RELATED_EVENT:
				getRelatedEvent().clear();
				getRelatedEvent().addAll((Collection<? extends Event>)newValue);
				return;
			case FactPackage.FULFILMENT_ACT__SATISFY:
				setSatisfy((Boolean)newValue);
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
			case FactPackage.FULFILMENT_ACT__RELATED_EVENT:
				getRelatedEvent().clear();
				return;
			case FactPackage.FULFILMENT_ACT__SATISFY:
				setSatisfy(SATISFY_EDEFAULT);
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
			case FactPackage.FULFILMENT_ACT__RELATED_EVENT:
				return relatedEvent != null && !relatedEvent.isEmpty();
			case FactPackage.FULFILMENT_ACT__SATISFY:
				return satisfy != SATISFY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (satisfy: ");
		result.append(satisfy);
		result.append(')');
		return result.toString();
	}

} //FulfilmentActImpl
