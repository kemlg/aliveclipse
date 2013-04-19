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
import net.sf.ictalive.service.ServiceImplemetation;
import net.sf.ictalive.service.ServicePackage;
import net.sf.ictalive.service.ServiceProvider;
import net.sf.ictalive.service.ServiceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.impl.ServiceProviderImpl#getExposes <em>Exposes</em>}</li>
 *   <li>{@link net.sf.ictalive.service.impl.ServiceProviderImpl#getIsType <em>Is Type</em>}</li>
 *   <li>{@link net.sf.ictalive.service.impl.ServiceProviderImpl#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceProviderImpl extends AgentImpl implements ServiceProvider {
	/**
	 * The cached value of the '{@link #getExposes() <em>Exposes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposes()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> exposes;

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
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceImplemetation> implementation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SERVICE_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getExposes() {
		if (exposes == null) {
			exposes = new EObjectResolvingEList<Service>(Service.class, this, ServicePackage.SERVICE_PROVIDER__EXPOSES);
		}
		return exposes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_PROVIDER__IS_TYPE, oldIsType, isType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceImplemetation> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectContainmentEList<ServiceImplemetation>(ServiceImplemetation.class, this, ServicePackage.SERVICE_PROVIDER__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.SERVICE_PROVIDER__IMPLEMENTATION:
				return ((InternalEList<?>)getImplementation()).basicRemove(otherEnd, msgs);
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
			case ServicePackage.SERVICE_PROVIDER__EXPOSES:
				return getExposes();
			case ServicePackage.SERVICE_PROVIDER__IS_TYPE:
				return getIsType();
			case ServicePackage.SERVICE_PROVIDER__IMPLEMENTATION:
				return getImplementation();
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
			case ServicePackage.SERVICE_PROVIDER__EXPOSES:
				getExposes().clear();
				getExposes().addAll((Collection<? extends Service>)newValue);
				return;
			case ServicePackage.SERVICE_PROVIDER__IS_TYPE:
				setIsType((ServiceType)newValue);
				return;
			case ServicePackage.SERVICE_PROVIDER__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends ServiceImplemetation>)newValue);
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
			case ServicePackage.SERVICE_PROVIDER__EXPOSES:
				getExposes().clear();
				return;
			case ServicePackage.SERVICE_PROVIDER__IS_TYPE:
				setIsType(IS_TYPE_EDEFAULT);
				return;
			case ServicePackage.SERVICE_PROVIDER__IMPLEMENTATION:
				getImplementation().clear();
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
			case ServicePackage.SERVICE_PROVIDER__EXPOSES:
				return exposes != null && !exposes.isEmpty();
			case ServicePackage.SERVICE_PROVIDER__IS_TYPE:
				return isType != IS_TYPE_EDEFAULT;
			case ServicePackage.SERVICE_PROVIDER__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
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

} //ServiceProviderImpl
