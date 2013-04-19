/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Fact.impl;

import net.sf.ictalive.EventModel.Fact.Availability;
import net.sf.ictalive.EventModel.Fact.AvailabilityKind;
import net.sf.ictalive.EventModel.Fact.FactPackage;

import net.sf.ictalive.EventModel.Objects.Resource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Availability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.impl.AvailabilityImpl#getOfResource <em>Of Resource</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.impl.AvailabilityImpl#getStutus <em>Stutus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AvailabilityImpl extends FactImpl implements Availability
{
	/**
	 * The cached value of the '{@link #getOfResource() <em>Of Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfResource()
	 * @generated
	 * @ordered
	 */
	protected Resource ofResource;

	/**
	 * The default value of the '{@link #getStutus() <em>Stutus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStutus()
	 * @generated
	 * @ordered
	 */
	protected static final AvailabilityKind STUTUS_EDEFAULT = AvailabilityKind.AVAILABLE;

	/**
	 * The cached value of the '{@link #getStutus() <em>Stutus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStutus()
	 * @generated
	 * @ordered
	 */
	protected AvailabilityKind stutus = STUTUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvailabilityImpl()
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
		return FactPackage.Literals.AVAILABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getOfResource()
	{
		if (ofResource != null && ofResource.eIsProxy())
		{
			InternalEObject oldOfResource = (InternalEObject)ofResource;
			ofResource = (Resource)eResolveProxy(oldOfResource);
			if (ofResource != oldOfResource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FactPackage.AVAILABILITY__OF_RESOURCE, oldOfResource, ofResource));
			}
		}
		return ofResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetOfResource()
	{
		return ofResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOfResource(Resource newOfResource)
	{
		Resource oldOfResource = ofResource;
		ofResource = newOfResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactPackage.AVAILABILITY__OF_RESOURCE, oldOfResource, ofResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailabilityKind getStutus()
	{
		return stutus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStutus(AvailabilityKind newStutus)
	{
		AvailabilityKind oldStutus = stutus;
		stutus = newStutus == null ? STUTUS_EDEFAULT : newStutus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactPackage.AVAILABILITY__STUTUS, oldStutus, stutus));
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
			case FactPackage.AVAILABILITY__OF_RESOURCE:
				if (resolve) return getOfResource();
				return basicGetOfResource();
			case FactPackage.AVAILABILITY__STUTUS:
				return getStutus();
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
			case FactPackage.AVAILABILITY__OF_RESOURCE:
				setOfResource((Resource)newValue);
				return;
			case FactPackage.AVAILABILITY__STUTUS:
				setStutus((AvailabilityKind)newValue);
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
			case FactPackage.AVAILABILITY__OF_RESOURCE:
				setOfResource((Resource)null);
				return;
			case FactPackage.AVAILABILITY__STUTUS:
				setStutus(STUTUS_EDEFAULT);
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
			case FactPackage.AVAILABILITY__OF_RESOURCE:
				return ofResource != null;
			case FactPackage.AVAILABILITY__STUTUS:
				return stutus != STUTUS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (stutus: ");
		result.append(stutus);
		result.append(')');
		return result.toString();
	}

} //AvailabilityImpl
