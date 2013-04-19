/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact.impl;

import net.sf.ictalive.operetta.OM.Landmark;

import net.sf.ictalive.runtime.fact.FactPackage;
import net.sf.ictalive.runtime.fact.LandmarkFulfilment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landmark Fulfilment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.fact.impl.LandmarkFulfilmentImpl#getLandmark <em>Landmark</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LandmarkFulfilmentImpl extends FulfilmentActImpl implements LandmarkFulfilment {
	/**
	 * The cached value of the '{@link #getLandmark() <em>Landmark</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandmark()
	 * @generated
	 * @ordered
	 */
	protected Landmark landmark;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandmarkFulfilmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactPackage.Literals.LANDMARK_FULFILMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Landmark getLandmark() {
		if (landmark != null && landmark.eIsProxy()) {
			InternalEObject oldLandmark = (InternalEObject)landmark;
			landmark = (Landmark)eResolveProxy(oldLandmark);
			if (landmark != oldLandmark) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FactPackage.LANDMARK_FULFILMENT__LANDMARK, oldLandmark, landmark));
			}
		}
		return landmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Landmark basicGetLandmark() {
		return landmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLandmark(Landmark newLandmark) {
		Landmark oldLandmark = landmark;
		landmark = newLandmark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactPackage.LANDMARK_FULFILMENT__LANDMARK, oldLandmark, landmark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FactPackage.LANDMARK_FULFILMENT__LANDMARK:
				if (resolve) return getLandmark();
				return basicGetLandmark();
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
			case FactPackage.LANDMARK_FULFILMENT__LANDMARK:
				setLandmark((Landmark)newValue);
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
			case FactPackage.LANDMARK_FULFILMENT__LANDMARK:
				setLandmark((Landmark)null);
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
			case FactPackage.LANDMARK_FULFILMENT__LANDMARK:
				return landmark != null;
		}
		return super.eIsSet(featureID);
	}

} //LandmarkFulfilmentImpl
