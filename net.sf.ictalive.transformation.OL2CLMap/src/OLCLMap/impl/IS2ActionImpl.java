/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OLCLMap.impl;

import OLCLMap.IS2Action;
import OLCLMap.OLCLMapPackage;
import OLCLMap.ToAction;

import net.sf.ictalive.coordination.actions.Action;

import net.sf.ictalive.operetta.OM.IS;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IS2 Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OLCLMap.impl.IS2ActionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link OLCLMap.impl.IS2ActionImpl#getInteractionScene <em>Interaction Scene</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IS2ActionImpl extends MapEntryImpl implements IS2Action {
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
	 * The cached value of the '{@link #getInteractionScene() <em>Interaction Scene</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionScene()
	 * @generated
	 * @ordered
	 */
	protected IS interactionScene;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IS2ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OLCLMapPackage.Literals.IS2_ACTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OLCLMapPackage.IS2_ACTION__ACTION, oldAction, action));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OLCLMapPackage.IS2_ACTION__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IS getInteractionScene() {
		if (interactionScene != null && interactionScene.eIsProxy()) {
			InternalEObject oldInteractionScene = (InternalEObject)interactionScene;
			interactionScene = (IS)eResolveProxy(oldInteractionScene);
			if (interactionScene != oldInteractionScene) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OLCLMapPackage.IS2_ACTION__INTERACTION_SCENE, oldInteractionScene, interactionScene));
			}
		}
		return interactionScene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IS basicGetInteractionScene() {
		return interactionScene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionScene(IS newInteractionScene) {
		IS oldInteractionScene = interactionScene;
		interactionScene = newInteractionScene;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OLCLMapPackage.IS2_ACTION__INTERACTION_SCENE, oldInteractionScene, interactionScene));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OLCLMapPackage.IS2_ACTION__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case OLCLMapPackage.IS2_ACTION__INTERACTION_SCENE:
				if (resolve) return getInteractionScene();
				return basicGetInteractionScene();
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
			case OLCLMapPackage.IS2_ACTION__ACTION:
				setAction((Action)newValue);
				return;
			case OLCLMapPackage.IS2_ACTION__INTERACTION_SCENE:
				setInteractionScene((IS)newValue);
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
			case OLCLMapPackage.IS2_ACTION__ACTION:
				setAction((Action)null);
				return;
			case OLCLMapPackage.IS2_ACTION__INTERACTION_SCENE:
				setInteractionScene((IS)null);
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
			case OLCLMapPackage.IS2_ACTION__ACTION:
				return action != null;
			case OLCLMapPackage.IS2_ACTION__INTERACTION_SCENE:
				return interactionScene != null;
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
				case OLCLMapPackage.IS2_ACTION__ACTION: return OLCLMapPackage.TO_ACTION__ACTION;
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
				case OLCLMapPackage.TO_ACTION__ACTION: return OLCLMapPackage.IS2_ACTION__ACTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IS2ActionImpl
