/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact.impl;

import net.sf.ictalive.runtime.fact.FactPackage;
import net.sf.ictalive.runtime.fact.FailureAct;

import net.sf.ictalive.runtime.fact.FailureReasons;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.fact.impl.FailureActImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.fact.impl.FailureActImpl#getFailureReason <em>Failure Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FailureActImpl extends InvocativeActImpl implements FailureAct {
	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected EObject reason;

	/**
	 * The default value of the '{@link #getFailureReason() <em>Failure Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureReason()
	 * @generated
	 * @ordered
	 */
	protected static final FailureReasons FAILURE_REASON_EDEFAULT = FailureReasons.UNABLETO_PLAN_FOR_TASK;
	/**
	 * The cached value of the '{@link #getFailureReason() <em>Failure Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureReason()
	 * @generated
	 * @ordered
	 */
	protected FailureReasons failureReason = FAILURE_REASON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactPackage.Literals.FAILURE_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getReason() {
		if (reason != null && reason.eIsProxy()) {
			InternalEObject oldReason = (InternalEObject)reason;
			reason = eResolveProxy(oldReason);
			if (reason != oldReason) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FactPackage.FAILURE_ACT__REASON, oldReason, reason));
			}
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(EObject newReason) {
		EObject oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactPackage.FAILURE_ACT__REASON, oldReason, reason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureReasons getFailureReason() {
		return failureReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureReason(FailureReasons newFailureReason) {
		FailureReasons oldFailureReason = failureReason;
		failureReason = newFailureReason == null ? FAILURE_REASON_EDEFAULT : newFailureReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactPackage.FAILURE_ACT__FAILURE_REASON, oldFailureReason, failureReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FactPackage.FAILURE_ACT__REASON:
				if (resolve) return getReason();
				return basicGetReason();
			case FactPackage.FAILURE_ACT__FAILURE_REASON:
				return getFailureReason();
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
			case FactPackage.FAILURE_ACT__REASON:
				setReason((EObject)newValue);
				return;
			case FactPackage.FAILURE_ACT__FAILURE_REASON:
				setFailureReason((FailureReasons)newValue);
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
			case FactPackage.FAILURE_ACT__REASON:
				setReason((EObject)null);
				return;
			case FactPackage.FAILURE_ACT__FAILURE_REASON:
				setFailureReason(FAILURE_REASON_EDEFAULT);
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
			case FactPackage.FAILURE_ACT__REASON:
				return reason != null;
			case FactPackage.FAILURE_ACT__FAILURE_REASON:
				return failureReason != FAILURE_REASON_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (failureReason: ");
		result.append(failureReason);
		result.append(')');
		return result.toString();
	}

} //FailureActImpl
