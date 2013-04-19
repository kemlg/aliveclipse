/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OLCLMap.impl;

import OLCLMap.Landmark2Action;
import OLCLMap.OLCLMapPackage;
import OLCLMap.ToAction;

import net.sf.ictalive.coordination.actions.Action;

import net.sf.ictalive.operetta.OM.Landmark;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landmark2 Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OLCLMap.impl.Landmark2ActionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link OLCLMap.impl.Landmark2ActionImpl#getLandmark <em>Landmark</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Landmark2ActionImpl extends MapEntryImpl implements Landmark2Action {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

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
	protected Landmark2ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OLCLMapPackage.Literals.LANDMARK2_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject)action;
			action = (Action)eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OLCLMapPackage.LANDMARK2_ACTION__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OLCLMapPackage.LANDMARK2_ACTION__ACTION, oldAction, action));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OLCLMapPackage.LANDMARK2_ACTION__LANDMARK, oldLandmark, landmark));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OLCLMapPackage.LANDMARK2_ACTION__LANDMARK, oldLandmark, landmark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OLCLMapPackage.LANDMARK2_ACTION__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case OLCLMapPackage.LANDMARK2_ACTION__LANDMARK:
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
			case OLCLMapPackage.LANDMARK2_ACTION__ACTION:
				setAction((Action)newValue);
				return;
			case OLCLMapPackage.LANDMARK2_ACTION__LANDMARK:
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
			case OLCLMapPackage.LANDMARK2_ACTION__ACTION:
				setAction((Action)null);
				return;
			case OLCLMapPackage.LANDMARK2_ACTION__LANDMARK:
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
			case OLCLMapPackage.LANDMARK2_ACTION__ACTION:
				return action != null;
			case OLCLMapPackage.LANDMARK2_ACTION__LANDMARK:
				return landmark != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ToAction.class) {
			switch (derivedFeatureID) {
				case OLCLMapPackage.LANDMARK2_ACTION__ACTION: return OLCLMapPackage.TO_ACTION__ACTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ToAction.class) {
			switch (baseFeatureID) {
				case OLCLMapPackage.TO_ACTION__ACTION: return OLCLMapPackage.LANDMARK2_ACTION__ACTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //Landmark2ActionImpl
