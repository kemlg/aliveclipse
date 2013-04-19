/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM.impl;

import java.util.Collection;

import net.sf.ictalive.operetta.OM.Landmark;
import net.sf.ictalive.operetta.OM.LandmarkPattern;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.PartialOrder;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landmark Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.LandmarkPatternImpl#getLandmarks <em>Landmarks</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.LandmarkPatternImpl#getLandmarkOrder <em>Landmark Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LandmarkPatternImpl extends EObjectImpl implements LandmarkPattern {
	/**
	 * The cached value of the '{@link #getLandmarks() <em>Landmarks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandmarks()
	 * @generated
	 * @ordered
	 */
	protected EList<Landmark> landmarks;

	/**
	 * The cached value of the '{@link #getLandmarkOrder() <em>Landmark Order</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandmarkOrder()
	 * @generated
	 * @ordered
	 */
	protected EList<PartialOrder> landmarkOrder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandmarkPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMPackage.Literals.LANDMARK_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Landmark> getLandmarks() {
		if (landmarks == null) {
			landmarks = new EObjectContainmentEList<Landmark>(Landmark.class, this, OMPackage.LANDMARK_PATTERN__LANDMARKS);
		}
		return landmarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartialOrder> getLandmarkOrder() {
		if (landmarkOrder == null) {
			landmarkOrder = new EObjectContainmentEList<PartialOrder>(PartialOrder.class, this, OMPackage.LANDMARK_PATTERN__LANDMARK_ORDER);
		}
		return landmarkOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMPackage.LANDMARK_PATTERN__LANDMARKS:
				return ((InternalEList<?>)getLandmarks()).basicRemove(otherEnd, msgs);
			case OMPackage.LANDMARK_PATTERN__LANDMARK_ORDER:
				return ((InternalEList<?>)getLandmarkOrder()).basicRemove(otherEnd, msgs);
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
			case OMPackage.LANDMARK_PATTERN__LANDMARKS:
				return getLandmarks();
			case OMPackage.LANDMARK_PATTERN__LANDMARK_ORDER:
				return getLandmarkOrder();
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
			case OMPackage.LANDMARK_PATTERN__LANDMARKS:
				getLandmarks().clear();
				getLandmarks().addAll((Collection<? extends Landmark>)newValue);
				return;
			case OMPackage.LANDMARK_PATTERN__LANDMARK_ORDER:
				getLandmarkOrder().clear();
				getLandmarkOrder().addAll((Collection<? extends PartialOrder>)newValue);
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
			case OMPackage.LANDMARK_PATTERN__LANDMARKS:
				getLandmarks().clear();
				return;
			case OMPackage.LANDMARK_PATTERN__LANDMARK_ORDER:
				getLandmarkOrder().clear();
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
			case OMPackage.LANDMARK_PATTERN__LANDMARKS:
				return landmarks != null && !landmarks.isEmpty();
			case OMPackage.LANDMARK_PATTERN__LANDMARK_ORDER:
				return landmarkOrder != null && !landmarkOrder.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LandmarkPatternImpl
