/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action.impl;

import net.sf.ictalive.coordination.tasks.ActionGrounding;
import net.sf.ictalive.coordination.tasks.Plan;

import net.sf.ictalive.runtime.action.ActionPackage;
import net.sf.ictalive.runtime.action.CoordinationAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.action.impl.CoordinationActionImpl#getPlan <em>Plan</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.impl.CoordinationActionImpl#getCoordAction <em>Coord Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoordinationActionImpl extends ActionImpl implements CoordinationAction {
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
	 * The cached value of the '{@link #getCoordAction() <em>Coord Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordAction()
	 * @generated
	 * @ordered
	 */
	protected ActionGrounding coordAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionPackage.Literals.COORDINATION_ACTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionPackage.COORDINATION_ACTION__PLAN, oldPlan, plan));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.COORDINATION_ACTION__PLAN, oldPlan, plan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGrounding getCoordAction() {
		if (coordAction != null && coordAction.eIsProxy()) {
			InternalEObject oldCoordAction = (InternalEObject)coordAction;
			coordAction = (ActionGrounding)eResolveProxy(oldCoordAction);
			if (coordAction != oldCoordAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionPackage.COORDINATION_ACTION__COORD_ACTION, oldCoordAction, coordAction));
			}
		}
		return coordAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGrounding basicGetCoordAction() {
		return coordAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordAction(ActionGrounding newCoordAction) {
		ActionGrounding oldCoordAction = coordAction;
		coordAction = newCoordAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.COORDINATION_ACTION__COORD_ACTION, oldCoordAction, coordAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActionPackage.COORDINATION_ACTION__PLAN:
				if (resolve) return getPlan();
				return basicGetPlan();
			case ActionPackage.COORDINATION_ACTION__COORD_ACTION:
				if (resolve) return getCoordAction();
				return basicGetCoordAction();
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
			case ActionPackage.COORDINATION_ACTION__PLAN:
				setPlan((Plan)newValue);
				return;
			case ActionPackage.COORDINATION_ACTION__COORD_ACTION:
				setCoordAction((ActionGrounding)newValue);
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
			case ActionPackage.COORDINATION_ACTION__PLAN:
				setPlan((Plan)null);
				return;
			case ActionPackage.COORDINATION_ACTION__COORD_ACTION:
				setCoordAction((ActionGrounding)null);
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
			case ActionPackage.COORDINATION_ACTION__PLAN:
				return plan != null;
			case ActionPackage.COORDINATION_ACTION__COORD_ACTION:
				return coordAction != null;
		}
		return super.eIsSet(featureID);
	}

} //CoordinationActionImpl
