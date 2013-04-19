/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.enactment.impl;

import net.sf.ictalive.coordination.tasks.Plan;

import net.sf.ictalive.runtime.enactment.EnactmentPackage;
import net.sf.ictalive.runtime.enactment.PlanEnactment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Enactment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.enactment.impl.PlanEnactmentImpl#getPlan <em>Plan</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanEnactmentImpl extends EnactmentImpl implements PlanEnactment {
	/**
	 * The cached value of the '{@link #getPlan() <em>Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlan()
	 * @generated
	 * @ordered
	 */
	protected Plan plan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanEnactmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnactmentPackage.Literals.PLAN_ENACTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plan getPlan() {
		if (plan != null && plan.eIsProxy()) {
			InternalEObject oldPlan = (InternalEObject)plan;
			plan = (Plan)eResolveProxy(oldPlan);
			if (plan != oldPlan) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnactmentPackage.PLAN_ENACTMENT__PLAN, oldPlan, plan));
			}
		}
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plan basicGetPlan() {
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlan(Plan newPlan) {
		Plan oldPlan = plan;
		plan = newPlan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnactmentPackage.PLAN_ENACTMENT__PLAN, oldPlan, plan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnactmentPackage.PLAN_ENACTMENT__PLAN:
				if (resolve) return getPlan();
				return basicGetPlan();
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
			case EnactmentPackage.PLAN_ENACTMENT__PLAN:
				setPlan((Plan)newValue);
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
			case EnactmentPackage.PLAN_ENACTMENT__PLAN:
				setPlan((Plan)null);
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
			case EnactmentPackage.PLAN_ENACTMENT__PLAN:
				return plan != null;
		}
		return super.eIsSet(featureID);
	}

} //PlanEnactmentImpl
