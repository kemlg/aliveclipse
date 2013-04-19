/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action.impl;

import java.util.Collection;

import net.sf.ictalive.runtime.action.ActionPackage;
import net.sf.ictalive.runtime.action.NotifyStateOfWorld;
import net.sf.ictalive.runtime.action.StateOfWorld;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notify State Of World</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.action.impl.NotifyStateOfWorldImpl#getStateOfWorld <em>State Of World</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotifyStateOfWorldImpl extends AgentActionImpl implements NotifyStateOfWorld {
	/**
	 * The cached value of the '{@link #getStateOfWorld() <em>State Of World</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateOfWorld()
	 * @generated
	 * @ordered
	 */
	protected EList<StateOfWorld> stateOfWorld;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotifyStateOfWorldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionPackage.Literals.NOTIFY_STATE_OF_WORLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateOfWorld> getStateOfWorld() {
		if (stateOfWorld == null) {
			stateOfWorld = new EObjectContainmentEList<StateOfWorld>(StateOfWorld.class, this, ActionPackage.NOTIFY_STATE_OF_WORLD__STATE_OF_WORLD);
		}
		return stateOfWorld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionPackage.NOTIFY_STATE_OF_WORLD__STATE_OF_WORLD:
				return ((InternalEList<?>)getStateOfWorld()).basicRemove(otherEnd, msgs);
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
			case ActionPackage.NOTIFY_STATE_OF_WORLD__STATE_OF_WORLD:
				return getStateOfWorld();
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
			case ActionPackage.NOTIFY_STATE_OF_WORLD__STATE_OF_WORLD:
				getStateOfWorld().clear();
				getStateOfWorld().addAll((Collection<? extends StateOfWorld>)newValue);
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
			case ActionPackage.NOTIFY_STATE_OF_WORLD__STATE_OF_WORLD:
				getStateOfWorld().clear();
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
			case ActionPackage.NOTIFY_STATE_OF_WORLD__STATE_OF_WORLD:
				return stateOfWorld != null && !stateOfWorld.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NotifyStateOfWorldImpl
