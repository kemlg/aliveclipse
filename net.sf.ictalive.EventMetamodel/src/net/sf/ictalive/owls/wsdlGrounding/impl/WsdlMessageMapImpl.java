/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.wsdlGrounding.impl;

import net.sf.ictalive.owls.process.Parameter;

import net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage;
import net.sf.ictalive.owls.wsdlGrounding.WsdlMessageMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wsdl Message Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.impl.WsdlMessageMapImpl#getOwlsParameter <em>Owls Parameter</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.impl.WsdlMessageMapImpl#getWsdlMessagePart <em>Wsdl Message Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WsdlMessageMapImpl extends EObjectImpl implements WsdlMessageMap
{
	/**
	 * The cached value of the '{@link #getOwlsParameter() <em>Owls Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwlsParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter owlsParameter;

	/**
	 * The cached value of the '{@link #getWsdlMessagePart() <em>Wsdl Message Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlMessagePart()
	 * @generated
	 * @ordered
	 */
	protected EObject wsdlMessagePart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WsdlMessageMapImpl()
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
		return WsdlGroundingPackage.Literals.WSDL_MESSAGE_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getOwlsParameter()
	{
		return owlsParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwlsParameter(Parameter newOwlsParameter, NotificationChain msgs)
	{
		Parameter oldOwlsParameter = owlsParameter;
		owlsParameter = newOwlsParameter;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_MESSAGE_MAP__OWLS_PARAMETER, oldOwlsParameter, newOwlsParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwlsParameter(Parameter newOwlsParameter)
	{
		if (newOwlsParameter != owlsParameter)
		{
			NotificationChain msgs = null;
			if (owlsParameter != null)
				msgs = ((InternalEObject)owlsParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsdlGroundingPackage.WSDL_MESSAGE_MAP__OWLS_PARAMETER, null, msgs);
			if (newOwlsParameter != null)
				msgs = ((InternalEObject)newOwlsParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsdlGroundingPackage.WSDL_MESSAGE_MAP__OWLS_PARAMETER, null, msgs);
			msgs = basicSetOwlsParameter(newOwlsParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_MESSAGE_MAP__OWLS_PARAMETER, newOwlsParameter, newOwlsParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getWsdlMessagePart()
	{
		return wsdlMessagePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWsdlMessagePart(EObject newWsdlMessagePart, NotificationChain msgs)
	{
		EObject oldWsdlMessagePart = wsdlMessagePart;
		wsdlMessagePart = newWsdlMessagePart;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART, oldWsdlMessagePart, newWsdlMessagePart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlMessagePart(EObject newWsdlMessagePart)
	{
		if (newWsdlMessagePart != wsdlMessagePart)
		{
			NotificationChain msgs = null;
			if (wsdlMessagePart != null)
				msgs = ((InternalEObject)wsdlMessagePart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsdlGroundingPackage.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART, null, msgs);
			if (newWsdlMessagePart != null)
				msgs = ((InternalEObject)newWsdlMessagePart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsdlGroundingPackage.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART, null, msgs);
			msgs = basicSetWsdlMessagePart(newWsdlMessagePart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlGroundingPackage.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART, newWsdlMessagePart, newWsdlMessagePart));
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
			case WsdlGroundingPackage.WSDL_MESSAGE_MAP__OWLS_PARAMETER:
				return basicSetOwlsParameter(null, msgs);
			case WsdlGroundingPackage.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART:
				return basicSetWsdlMessagePart(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case WsdlGroundingPackage.WSDL_MESSAGE_MAP__OWLS_PARAMETER:
				return getOwlsParameter();
			case WsdlGroundingPackage.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART:
				return getWsdlMessagePart();
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
			case WsdlGroundingPackage.WSDL_MESSAGE_MAP__OWLS_PARAMETER:
				setOwlsParameter((Parameter)newValue);
				return;
			case WsdlGroundingPackage.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART:
				setWsdlMessagePart((EObject)newValue);
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
			case WsdlGroundingPackage.WSDL_MESSAGE_MAP__OWLS_PARAMETER:
				setOwlsParameter((Parameter)null);
				return;
			case WsdlGroundingPackage.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART:
				setWsdlMessagePart((EObject)null);
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
			case WsdlGroundingPackage.WSDL_MESSAGE_MAP__OWLS_PARAMETER:
				return owlsParameter != null;
			case WsdlGroundingPackage.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART:
				return wsdlMessagePart != null;
		}
		return super.eIsSet(featureID);
	}

} //WsdlMessageMapImpl
