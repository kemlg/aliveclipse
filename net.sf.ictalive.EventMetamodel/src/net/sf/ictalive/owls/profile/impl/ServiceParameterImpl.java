/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.profile.impl;

import net.sf.ictalive.owls.profile.ProfilePackage;
import net.sf.ictalive.owls.profile.ServiceParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.profile.impl.ServiceParameterImpl#getServiceParameterName <em>Service Parameter Name</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.impl.ServiceParameterImpl#getSParameter <em>SParameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceParameterImpl extends EObjectImpl implements ServiceParameter
{
	/**
	 * The default value of the '{@link #getServiceParameterName() <em>Service Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceParameterName()
	 * @generated
	 * @ordered
	 */
	protected static final Object SERVICE_PARAMETER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceParameterName() <em>Service Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceParameterName()
	 * @generated
	 * @ordered
	 */
	protected Object serviceParameterName = SERVICE_PARAMETER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSParameter() <em>SParameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSParameter()
	 * @generated
	 * @ordered
	 */
	protected EObject sParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceParameterImpl()
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
		return ProfilePackage.Literals.SERVICE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getServiceParameterName()
	{
		return serviceParameterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceParameterName(Object newServiceParameterName)
	{
		Object oldServiceParameterName = serviceParameterName;
		serviceParameterName = newServiceParameterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.SERVICE_PARAMETER__SERVICE_PARAMETER_NAME, oldServiceParameterName, serviceParameterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSParameter()
	{
		if (sParameter != null && sParameter.eIsProxy())
		{
			InternalEObject oldSParameter = (InternalEObject)sParameter;
			sParameter = eResolveProxy(oldSParameter);
			if (sParameter != oldSParameter)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilePackage.SERVICE_PARAMETER__SPARAMETER, oldSParameter, sParameter));
			}
		}
		return sParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetSParameter()
	{
		return sParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSParameter(EObject newSParameter)
	{
		EObject oldSParameter = sParameter;
		sParameter = newSParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.SERVICE_PARAMETER__SPARAMETER, oldSParameter, sParameter));
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
			case ProfilePackage.SERVICE_PARAMETER__SERVICE_PARAMETER_NAME:
				return getServiceParameterName();
			case ProfilePackage.SERVICE_PARAMETER__SPARAMETER:
				if (resolve) return getSParameter();
				return basicGetSParameter();
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
			case ProfilePackage.SERVICE_PARAMETER__SERVICE_PARAMETER_NAME:
				setServiceParameterName(newValue);
				return;
			case ProfilePackage.SERVICE_PARAMETER__SPARAMETER:
				setSParameter((EObject)newValue);
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
			case ProfilePackage.SERVICE_PARAMETER__SERVICE_PARAMETER_NAME:
				setServiceParameterName(SERVICE_PARAMETER_NAME_EDEFAULT);
				return;
			case ProfilePackage.SERVICE_PARAMETER__SPARAMETER:
				setSParameter((EObject)null);
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
			case ProfilePackage.SERVICE_PARAMETER__SERVICE_PARAMETER_NAME:
				return SERVICE_PARAMETER_NAME_EDEFAULT == null ? serviceParameterName != null : !SERVICE_PARAMETER_NAME_EDEFAULT.equals(serviceParameterName);
			case ProfilePackage.SERVICE_PARAMETER__SPARAMETER:
				return sParameter != null;
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
		result.append(" (serviceParameterName: ");
		result.append(serviceParameterName);
		result.append(')');
		return result.toString();
	}

} //ServiceParameterImpl
