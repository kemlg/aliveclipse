/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Event.impl;

import net.sf.ictalive.EventModel.Event.Actor;
import net.sf.ictalive.EventModel.Event.EventPackage;
import net.sf.ictalive.EventModel.Event.ProxyView;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proxy View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Event.impl.ProxyViewImpl#getTransmitter <em>Transmitter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProxyViewImpl extends PointOfViewImpl implements ProxyView
{
	/**
	 * The cached value of the '{@link #getTransmitter() <em>Transmitter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmitter()
	 * @generated
	 * @ordered
	 */
	protected Actor transmitter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProxyViewImpl()
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
		return EventPackage.Literals.PROXY_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getTransmitter()
	{
		if (transmitter != null && transmitter.eIsProxy())
		{
			InternalEObject oldTransmitter = (InternalEObject)transmitter;
			transmitter = (Actor)eResolveProxy(oldTransmitter);
			if (transmitter != oldTransmitter)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventPackage.PROXY_VIEW__TRANSMITTER, oldTransmitter, transmitter));
			}
		}
		return transmitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetTransmitter()
	{
		return transmitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmitter(Actor newTransmitter)
	{
		Actor oldTransmitter = transmitter;
		transmitter = newTransmitter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.PROXY_VIEW__TRANSMITTER, oldTransmitter, transmitter));
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
			case EventPackage.PROXY_VIEW__TRANSMITTER:
				if (resolve) return getTransmitter();
				return basicGetTransmitter();
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
			case EventPackage.PROXY_VIEW__TRANSMITTER:
				setTransmitter((Actor)newValue);
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
			case EventPackage.PROXY_VIEW__TRANSMITTER:
				setTransmitter((Actor)null);
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
			case EventPackage.PROXY_VIEW__TRANSMITTER:
				return transmitter != null;
		}
		return super.eIsSet(featureID);
	}

} //ProxyViewImpl
