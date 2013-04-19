/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact.impl;

import java.util.Date;

import net.sf.ictalive.runtime.fact.DeadlineViolation;
import net.sf.ictalive.runtime.fact.FactPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deadline Violation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.fact.impl.DeadlineViolationImpl#getDealine <em>Dealine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeadlineViolationImpl extends NormActImpl implements DeadlineViolation {
	/**
	 * The default value of the '{@link #getDealine() <em>Dealine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDealine()
	 * @generated
	 * @ordered
	 */
	protected static final Date DEALINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDealine() <em>Dealine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDealine()
	 * @generated
	 * @ordered
	 */
	protected Date dealine = DEALINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeadlineViolationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactPackage.Literals.DEADLINE_VIOLATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDealine() {
		return dealine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDealine(Date newDealine) {
		Date oldDealine = dealine;
		dealine = newDealine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactPackage.DEADLINE_VIOLATION__DEALINE, oldDealine, dealine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FactPackage.DEADLINE_VIOLATION__DEALINE:
				return getDealine();
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
			case FactPackage.DEADLINE_VIOLATION__DEALINE:
				setDealine((Date)newValue);
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
			case FactPackage.DEADLINE_VIOLATION__DEALINE:
				setDealine(DEALINE_EDEFAULT);
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
			case FactPackage.DEADLINE_VIOLATION__DEALINE:
				return DEALINE_EDEFAULT == null ? dealine != null : !DEALINE_EDEFAULT.equals(dealine);
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
		result.append(" (dealine: ");
		result.append(dealine);
		result.append(')');
		return result.toString();
	}

} //DeadlineViolationImpl
