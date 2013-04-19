/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact.impl;

import net.sf.ictalive.runtime.NormInstances.NormInstance;

import net.sf.ictalive.runtime.fact.FactPackage;
import net.sf.ictalive.runtime.fact.NormInstanceAct;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Norm Instance Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.fact.impl.NormInstanceActImpl#getNormInstance <em>Norm Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NormInstanceActImpl extends FactImpl implements NormInstanceAct {
	/**
	 * The cached value of the '{@link #getNormInstance() <em>Norm Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormInstance()
	 * @generated
	 * @ordered
	 */
	protected NormInstance normInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormInstanceActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactPackage.Literals.NORM_INSTANCE_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormInstance getNormInstance() {
		if (normInstance != null && normInstance.eIsProxy()) {
			InternalEObject oldNormInstance = (InternalEObject)normInstance;
			normInstance = (NormInstance)eResolveProxy(oldNormInstance);
			if (normInstance != oldNormInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FactPackage.NORM_INSTANCE_ACT__NORM_INSTANCE, oldNormInstance, normInstance));
			}
		}
		return normInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormInstance basicGetNormInstance() {
		return normInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormInstance(NormInstance newNormInstance) {
		NormInstance oldNormInstance = normInstance;
		normInstance = newNormInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactPackage.NORM_INSTANCE_ACT__NORM_INSTANCE, oldNormInstance, normInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FactPackage.NORM_INSTANCE_ACT__NORM_INSTANCE:
				if (resolve) return getNormInstance();
				return basicGetNormInstance();
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
			case FactPackage.NORM_INSTANCE_ACT__NORM_INSTANCE:
				setNormInstance((NormInstance)newValue);
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
			case FactPackage.NORM_INSTANCE_ACT__NORM_INSTANCE:
				setNormInstance((NormInstance)null);
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
			case FactPackage.NORM_INSTANCE_ACT__NORM_INSTANCE:
				return normInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //NormInstanceActImpl
