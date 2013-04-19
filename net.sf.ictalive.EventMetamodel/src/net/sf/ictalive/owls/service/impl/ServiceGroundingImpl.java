/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.service.impl;

import net.sf.ictalive.owls.service.Service;
import net.sf.ictalive.owls.service.ServiceGrounding;
import net.sf.ictalive.owls.service.ServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grounding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.service.impl.ServiceGroundingImpl#getSupportedBy <em>Supported By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceGroundingImpl extends EObjectImpl implements ServiceGrounding
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceGroundingImpl()
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
		return ServicePackage.Literals.SERVICE_GROUNDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getSupportedBy()
	{
		if (eContainerFeatureID != ServicePackage.SERVICE_GROUNDING__SUPPORTED_BY) return null;
		return (Service)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportedBy(Service newSupportedBy, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newSupportedBy, ServicePackage.SERVICE_GROUNDING__SUPPORTED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportedBy(Service newSupportedBy)
	{
		if (newSupportedBy != eInternalContainer() || (eContainerFeatureID != ServicePackage.SERVICE_GROUNDING__SUPPORTED_BY && newSupportedBy != null))
		{
			if (EcoreUtil.isAncestor(this, newSupportedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSupportedBy != null)
				msgs = ((InternalEObject)newSupportedBy).eInverseAdd(this, ServicePackage.SERVICE__SUPPORTS, Service.class, msgs);
			msgs = basicSetSupportedBy(newSupportedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_GROUNDING__SUPPORTED_BY, newSupportedBy, newSupportedBy));
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
			case ServicePackage.SERVICE_GROUNDING__SUPPORTED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSupportedBy((Service)otherEnd, msgs);
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
			case ServicePackage.SERVICE_GROUNDING__SUPPORTED_BY:
				return basicSetSupportedBy(null, msgs);
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
			case ServicePackage.SERVICE_GROUNDING__SUPPORTED_BY:
				return eInternalContainer().eInverseRemove(this, ServicePackage.SERVICE__SUPPORTS, Service.class, msgs);
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
			case ServicePackage.SERVICE_GROUNDING__SUPPORTED_BY:
				return getSupportedBy();
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
			case ServicePackage.SERVICE_GROUNDING__SUPPORTED_BY:
				setSupportedBy((Service)newValue);
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
			case ServicePackage.SERVICE_GROUNDING__SUPPORTED_BY:
				setSupportedBy((Service)null);
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
			case ServicePackage.SERVICE_GROUNDING__SUPPORTED_BY:
				return getSupportedBy() != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceGroundingImpl
