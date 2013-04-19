/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.impl;

import java.util.Collection;

import net.sf.ictalive.coordination.agents.impl.AgentImpl;

import net.sf.ictalive.service.Service;
import net.sf.ictalive.service.ServiceConsumer;
import net.sf.ictalive.service.ServicePackage;
import net.sf.ictalive.service.ServiceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.impl.ServiceConsumerImpl#getInvokes <em>Invokes</em>}</li>
 *   <li>{@link net.sf.ictalive.service.impl.ServiceConsumerImpl#getIsType <em>Is Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceConsumerImpl extends AgentImpl implements ServiceConsumer {
	/**
	 * The cached value of the '{@link #getInvokes() <em>Invokes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokes()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> invokes;

	/**
	 * The default value of the '{@link #getIsType() <em>Is Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsType()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceType IS_TYPE_EDEFAULT = ServiceType.INTERNAL;

	/**
	 * The cached value of the '{@link #getIsType() <em>Is Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsType()
	 * @generated
	 * @ordered
	 */
	protected ServiceType isType = IS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SERVICE_CONSUMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getInvokes() {
		if (invokes == null) {
			invokes = new EObjectResolvingEList<Service>(Service.class, this, ServicePackage.SERVICE_CONSUMER__INVOKES);
		}
		return invokes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType getIsType() {
		return isType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsType(ServiceType newIsType) {
		ServiceType oldIsType = isType;
		isType = newIsType == null ? IS_TYPE_EDEFAULT : newIsType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_CONSUMER__IS_TYPE, oldIsType, isType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.SERVICE_CONSUMER__INVOKES:
				return getInvokes();
			case ServicePackage.SERVICE_CONSUMER__IS_TYPE:
				return getIsType();
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
			case ServicePackage.SERVICE_CONSUMER__INVOKES:
				getInvokes().clear();
				getInvokes().addAll((Collection<? extends Service>)newValue);
				return;
			case ServicePackage.SERVICE_CONSUMER__IS_TYPE:
				setIsType((ServiceType)newValue);
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
			case ServicePackage.SERVICE_CONSUMER__INVOKES:
				getInvokes().clear();
				return;
			case ServicePackage.SERVICE_CONSUMER__IS_TYPE:
				setIsType(IS_TYPE_EDEFAULT);
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
			case ServicePackage.SERVICE_CONSUMER__INVOKES:
				return invokes != null && !invokes.isEmpty();
			case ServicePackage.SERVICE_CONSUMER__IS_TYPE:
				return isType != IS_TYPE_EDEFAULT;
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
		result.append(" (isType: ");
		result.append(isType);
		result.append(')');
		return result.toString();
	}

} //ServiceConsumerImpl
