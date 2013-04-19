/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OLCLMap.impl;

import OLCLMap.OLCLMapPackage;
import OLCLMap.Objective2Action;
import OLCLMap.ToAction;

import net.sf.ictalive.coordination.actions.Action;

import net.sf.ictalive.operetta.OM.Objective;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective2 Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OLCLMap.impl.Objective2ActionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link OLCLMap.impl.Objective2ActionImpl#getObjective <em>Objective</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Objective2ActionImpl extends MapEntryImpl implements Objective2Action {
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
	 * The cached value of the '{@link #getObjective() <em>Objective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected Objective objective;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Objective2ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OLCLMapPackage.Literals.OBJECTIVE2_ACTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OLCLMapPackage.OBJECTIVE2_ACTION__ACTION, oldAction, action));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OLCLMapPackage.OBJECTIVE2_ACTION__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective getObjective() {
		if (objective != null && objective.eIsProxy()) {
			InternalEObject oldObjective = (InternalEObject)objective;
			objective = (Objective)eResolveProxy(oldObjective);
			if (objective != oldObjective) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OLCLMapPackage.OBJECTIVE2_ACTION__OBJECTIVE, oldObjective, objective));
			}
		}
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective basicGetObjective() {
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjective(Objective newObjective) {
		Objective oldObjective = objective;
		objective = newObjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OLCLMapPackage.OBJECTIVE2_ACTION__OBJECTIVE, oldObjective, objective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OLCLMapPackage.OBJECTIVE2_ACTION__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case OLCLMapPackage.OBJECTIVE2_ACTION__OBJECTIVE:
				if (resolve) return getObjective();
				return basicGetObjective();
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
			case OLCLMapPackage.OBJECTIVE2_ACTION__ACTION:
				setAction((Action)newValue);
				return;
			case OLCLMapPackage.OBJECTIVE2_ACTION__OBJECTIVE:
				setObjective((Objective)newValue);
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
			case OLCLMapPackage.OBJECTIVE2_ACTION__ACTION:
				setAction((Action)null);
				return;
			case OLCLMapPackage.OBJECTIVE2_ACTION__OBJECTIVE:
				setObjective((Objective)null);
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
			case OLCLMapPackage.OBJECTIVE2_ACTION__ACTION:
				return action != null;
			case OLCLMapPackage.OBJECTIVE2_ACTION__OBJECTIVE:
				return objective != null;
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
				case OLCLMapPackage.OBJECTIVE2_ACTION__ACTION: return OLCLMapPackage.TO_ACTION__ACTION;
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
				case OLCLMapPackage.TO_ACTION__ACTION: return OLCLMapPackage.OBJECTIVE2_ACTION__ACTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //Objective2ActionImpl
