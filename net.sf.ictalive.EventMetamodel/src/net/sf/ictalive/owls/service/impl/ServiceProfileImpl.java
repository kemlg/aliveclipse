/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.service.impl;

import net.sf.ictalive.owls.service.Service;
import net.sf.ictalive.owls.service.ServicePackage;
import net.sf.ictalive.owls.service.ServiceProfile;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.service.impl.ServiceProfileImpl#getPresentedBy <em>Presented By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceProfileImpl extends EObjectImpl implements ServiceProfile
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceProfileImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ServicePackage.Literals.SERVICE_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getPresentedBy()
	{
		if (eContainerFeatureID != ServicePackage.SERVICE_PROFILE__PRESENTED_BY) return null;
		return (Service)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentedBy(Service newPresentedBy, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newPresentedBy, ServicePackage.SERVICE_PROFILE__PRESENTED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentedBy(Service newPresentedBy)
	{
		if (newPresentedBy != eInternalContainer() || (eContainerFeatureID != ServicePackage.SERVICE_PROFILE__PRESENTED_BY && newPresentedBy != null))
		{
			if (EcoreUtil.isAncestor(this, newPresentedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPresentedBy != null)
				msgs = ((InternalEObject)newPresentedBy).eInverseAdd(this, ServicePackage.SERVICE__PRESENTS, Service.class, msgs);
			msgs = basicSetPresentedBy(newPresentedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_PROFILE__PRESENTED_BY, newPresentedBy, newPresentedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ServicePackage.SERVICE_PROFILE__PRESENTED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPresentedBy((Service)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ServicePackage.SERVICE_PROFILE__PRESENTED_BY:
				return basicSetPresentedBy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID)
		{
			case ServicePackage.SERVICE_PROFILE__PRESENTED_BY:
				return eInternalContainer().eInverseRemove(this, ServicePackage.SERVICE__PRESENTS, Service.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case ServicePackage.SERVICE_PROFILE__PRESENTED_BY:
				return getPresentedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ServicePackage.SERVICE_PROFILE__PRESENTED_BY:
				setPresentedBy((Service)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case ServicePackage.SERVICE_PROFILE__PRESENTED_BY:
				setPresentedBy((Service)null);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case ServicePackage.SERVICE_PROFILE__PRESENTED_BY:
				return getPresentedBy() != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceProfileImpl
