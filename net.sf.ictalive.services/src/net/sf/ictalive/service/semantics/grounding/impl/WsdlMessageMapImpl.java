/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics.grounding.impl;

import net.sf.ictalive.service.semantics.ServiceParameter;

import net.sf.ictalive.service.semantics.grounding.GroundingPackage;
import net.sf.ictalive.service.semantics.grounding.WsdlMessageMap;

import net.sf.ictalive.service.syntax.Part;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlMessageMapImpl#getOwlsParameter <em>Owls Parameter</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlMessageMapImpl#getWsdlMessagePart <em>Wsdl Message Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WsdlMessageMapImpl extends EObjectImpl implements WsdlMessageMap {
	/**
	 * The cached value of the '{@link #getOwlsParameter() <em>Owls Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwlsParameter()
	 * @generated
	 * @ordered
	 */
	protected ServiceParameter owlsParameter;

	/**
	 * The cached value of the '{@link #getWsdlMessagePart() <em>Wsdl Message Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlMessagePart()
	 * @generated
	 * @ordered
	 */
	protected Part wsdlMessagePart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WsdlMessageMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroundingPackage.Literals.WSDL_MESSAGE_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceParameter getOwlsParameter() {
		if (owlsParameter != null && owlsParameter.eIsProxy()) {
			InternalEObject oldOwlsParameter = (InternalEObject)owlsParameter;
			owlsParameter = (ServiceParameter)eResolveProxy(oldOwlsParameter);
			if (owlsParameter != oldOwlsParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroundingPackage.WSDL_MESSAGE_MAP__OWLS_PARAMETER, oldOwlsParameter, owlsParameter));
			}
		}
		return owlsParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceParameter basicGetOwlsParameter() {
		return owlsParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwlsParameter(ServiceParameter newOwlsParameter) {
		ServiceParameter oldOwlsParameter = owlsParameter;
		owlsParameter = newOwlsParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.WSDL_MESSAGE_MAP__OWLS_PARAMETER, oldOwlsParameter, owlsParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part getWsdlMessagePart() {
		if (wsdlMessagePart != null && wsdlMessagePart.eIsProxy()) {
			InternalEObject oldWsdlMessagePart = (InternalEObject)wsdlMessagePart;
			wsdlMessagePart = (Part)eResolveProxy(oldWsdlMessagePart);
			if (wsdlMessagePart != oldWsdlMessagePart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroundingPackage.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART, oldWsdlMessagePart, wsdlMessagePart));
			}
		}
		return wsdlMessagePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part basicGetWsdlMessagePart() {
		return wsdlMessagePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlMessagePart(Part newWsdlMessagePart) {
		Part oldWsdlMessagePart = wsdlMessagePart;
		wsdlMessagePart = newWsdlMessagePart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundingPackage.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART, oldWsdlMessagePart, wsdlMessagePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GroundingPackage.WSDL_MESSAGE_MAP__OWLS_PARAMETER:
				if (resolve) return getOwlsParameter();
				return basicGetOwlsParameter();
			case GroundingPackage.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART:
				if (resolve) return getWsdlMessagePart();
				return basicGetWsdlMessagePart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GroundingPackage.WSDL_MESSAGE_MAP__OWLS_PARAMETER:
				setOwlsParameter((ServiceParameter)newValue);
				return;
			case GroundingPackage.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART:
				setWsdlMessagePart((Part)newValue);
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
			case GroundingPackage.WSDL_MESSAGE_MAP__OWLS_PARAMETER:
				setOwlsParameter((ServiceParameter)null);
				return;
			case GroundingPackage.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART:
				setWsdlMessagePart((Part)null);
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
			case GroundingPackage.WSDL_MESSAGE_MAP__OWLS_PARAMETER:
				return owlsParameter != null;
			case GroundingPackage.WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART:
				return wsdlMessagePart != null;
		}
		return super.eIsSet(featureID);
	}

} //WsdlMessageMapImpl
