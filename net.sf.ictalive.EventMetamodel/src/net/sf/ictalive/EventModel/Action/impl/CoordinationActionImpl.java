/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Action.impl;

import net.sf.ictalive.EventModel.Action.ActionPackage;
import net.sf.ictalive.EventModel.Action.CoordinationAction;

import net.sf.ictalive.coordination.actions.Action;

import net.sf.ictalive.coordination.tasks.Plan;

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
 *   <li>{@link net.sf.ictalive.EventModel.Action.impl.CoordinationActionImpl#getCoordAction <em>Coord Action</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Action.impl.CoordinationActionImpl#getPlan <em>Plan</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CoordinationActionImpl extends ActionImpl implements CoordinationAction
{
	/**
	 * The cached value of the '{@link #getCoordAction() <em>Coord Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordAction()
	 * @generated
	 * @ordered
	 */
	protected Action coordAction;

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
	protected CoordinationActionImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ActionPackage.Literals.COORDINATION_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getCoordAction()
	{
		if (coordAction != null && coordAction.eIsProxy())
		{
			InternalEObject oldCoordAction = (InternalEObject)coordAction;
			coordAction = (Action)eResolveProxy(oldCoordAction);
			if (coordAction != oldCoordAction)
			{
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
	public Action basicGetCoordAction()
	{
		return coordAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordAction(Action newCoordAction)
	{
		Action oldCoordAction = coordAction;
		coordAction = newCoordAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.COORDINATION_ACTION__COORD_ACTION, oldCoordAction, coordAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plan getPlan()
	{
		if (plan != null && plan.eIsProxy())
		{
			InternalEObject oldPlan = (InternalEObject)plan;
			plan = (Plan)eResolveProxy(oldPlan);
			if (plan != oldPlan)
			{
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
	public Plan basicGetPlan()
	{
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlan(Plan newPlan)
	{
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case ActionPackage.COORDINATION_ACTION__COORD_ACTION:
				if (resolve) return getCoordAction();
				return basicGetCoordAction();
			case ActionPackage.COORDINATION_ACTION__PLAN:
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ActionPackage.COORDINATION_ACTION__COORD_ACTION:
				setCoordAction((Action)newValue);
				return;
			case ActionPackage.COORDINATION_ACTION__PLAN:
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case ActionPackage.COORDINATION_ACTION__COORD_ACTION:
				setCoordAction((Action)null);
				return;
			case ActionPackage.COORDINATION_ACTION__PLAN:
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case ActionPackage.COORDINATION_ACTION__COORD_ACTION:
				return coordAction != null;
			case ActionPackage.COORDINATION_ACTION__PLAN:
				return plan != null;
		}
		return super.eIsSet(featureID);
	}

} //CoordinationActionImpl
