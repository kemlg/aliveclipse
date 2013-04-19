/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action.impl;

import net.sf.ictalive.coordination.tasks.Plan;

import net.sf.ictalive.runtime.action.ActionPackage;
import net.sf.ictalive.runtime.action.AgentReplan;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent Replan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.action.impl.AgentReplanImpl#getFailedPlan <em>Failed Plan</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgentReplanImpl extends AgentActionImpl implements AgentReplan {
	/**
	 * The cached value of the '{@link #getFailedPlan() <em>Failed Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailedPlan()
	 * @generated
	 * @ordered
	 */
	protected Plan failedPlan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentReplanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionPackage.Literals.AGENT_REPLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plan getFailedPlan() {
		if (failedPlan != null && failedPlan.eIsProxy()) {
			InternalEObject oldFailedPlan = (InternalEObject)failedPlan;
			failedPlan = (Plan)eResolveProxy(oldFailedPlan);
			if (failedPlan != oldFailedPlan) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionPackage.AGENT_REPLAN__FAILED_PLAN, oldFailedPlan, failedPlan));
			}
		}
		return failedPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plan basicGetFailedPlan() {
		return failedPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailedPlan(Plan newFailedPlan) {
		Plan oldFailedPlan = failedPlan;
		failedPlan = newFailedPlan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.AGENT_REPLAN__FAILED_PLAN, oldFailedPlan, failedPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActionPackage.AGENT_REPLAN__FAILED_PLAN:
				if (resolve) return getFailedPlan();
				return basicGetFailedPlan();
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
			case ActionPackage.AGENT_REPLAN__FAILED_PLAN:
				setFailedPlan((Plan)newValue);
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
			case ActionPackage.AGENT_REPLAN__FAILED_PLAN:
				setFailedPlan((Plan)null);
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
			case ActionPackage.AGENT_REPLAN__FAILED_PLAN:
				return failedPlan != null;
		}
		return super.eIsSet(featureID);
	}

} //AgentReplanImpl
