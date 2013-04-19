/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.actions.impl;

import java.util.Collection;

import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.actions.AtomicAction;
import net.sf.ictalive.coordination.actions.AtomicActionResult;

import net.sf.ictalive.owls.process.AtomicProcess;
import net.sf.ictalive.owls.process.ProcessPackage;
import net.sf.ictalive.owls.process.SimpleProcess;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.AtomicActionImpl#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.AtomicActionImpl#getHasAtomicActionResult <em>Has Atomic Action Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomicActionImpl extends ActionImpl implements AtomicAction {
	/**
	 * The cached value of the '{@link #getRealizes() <em>Realizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizes()
	 * @generated
	 * @ordered
	 */
	protected SimpleProcess realizes;

	/**
	 * The cached value of the '{@link #getHasAtomicActionResult() <em>Has Atomic Action Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAtomicActionResult()
	 * @generated
	 * @ordered
	 */
	protected EList<AtomicActionResult> hasAtomicActionResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.ATOMIC_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleProcess getRealizes() {
		if (realizes != null && realizes.eIsProxy()) {
			InternalEObject oldRealizes = (InternalEObject)realizes;
			realizes = (SimpleProcess)eResolveProxy(oldRealizes);
			if (realizes != oldRealizes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionsPackage.ATOMIC_ACTION__REALIZES, oldRealizes, realizes));
			}
		}
		return realizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleProcess basicGetRealizes() {
		return realizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealizes(SimpleProcess newRealizes, NotificationChain msgs) {
		SimpleProcess oldRealizes = realizes;
		realizes = newRealizes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionsPackage.ATOMIC_ACTION__REALIZES, oldRealizes, newRealizes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizes(SimpleProcess newRealizes) {
		if (newRealizes != realizes) {
			NotificationChain msgs = null;
			if (realizes != null)
				msgs = ((InternalEObject)realizes).eInverseRemove(this, ProcessPackage.SIMPLE_PROCESS__REALIZED_BY, SimpleProcess.class, msgs);
			if (newRealizes != null)
				msgs = ((InternalEObject)newRealizes).eInverseAdd(this, ProcessPackage.SIMPLE_PROCESS__REALIZED_BY, SimpleProcess.class, msgs);
			msgs = basicSetRealizes(newRealizes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.ATOMIC_ACTION__REALIZES, newRealizes, newRealizes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AtomicActionResult> getHasAtomicActionResult() {
		if (hasAtomicActionResult == null) {
			hasAtomicActionResult = new EObjectContainmentEList<AtomicActionResult>(AtomicActionResult.class, this, ActionsPackage.ATOMIC_ACTION__HAS_ATOMIC_ACTION_RESULT);
		}
		return hasAtomicActionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionsPackage.ATOMIC_ACTION__REALIZES:
				if (realizes != null)
					msgs = ((InternalEObject)realizes).eInverseRemove(this, ProcessPackage.SIMPLE_PROCESS__REALIZED_BY, SimpleProcess.class, msgs);
				return basicSetRealizes((SimpleProcess)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionsPackage.ATOMIC_ACTION__REALIZES:
				return basicSetRealizes(null, msgs);
			case ActionsPackage.ATOMIC_ACTION__HAS_ATOMIC_ACTION_RESULT:
				return ((InternalEList<?>)getHasAtomicActionResult()).basicRemove(otherEnd, msgs);
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
			case ActionsPackage.ATOMIC_ACTION__REALIZES:
				if (resolve) return getRealizes();
				return basicGetRealizes();
			case ActionsPackage.ATOMIC_ACTION__HAS_ATOMIC_ACTION_RESULT:
				return getHasAtomicActionResult();
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
			case ActionsPackage.ATOMIC_ACTION__REALIZES:
				setRealizes((SimpleProcess)newValue);
				return;
			case ActionsPackage.ATOMIC_ACTION__HAS_ATOMIC_ACTION_RESULT:
				getHasAtomicActionResult().clear();
				getHasAtomicActionResult().addAll((Collection<? extends AtomicActionResult>)newValue);
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
			case ActionsPackage.ATOMIC_ACTION__REALIZES:
				setRealizes((SimpleProcess)null);
				return;
			case ActionsPackage.ATOMIC_ACTION__HAS_ATOMIC_ACTION_RESULT:
				getHasAtomicActionResult().clear();
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
			case ActionsPackage.ATOMIC_ACTION__REALIZES:
				return realizes != null;
			case ActionsPackage.ATOMIC_ACTION__HAS_ATOMIC_ACTION_RESULT:
				return hasAtomicActionResult != null && !hasAtomicActionResult.isEmpty();
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
		if (baseClass == AtomicProcess.class) {
			switch (derivedFeatureID) {
				case ActionsPackage.ATOMIC_ACTION__REALIZES: return ProcessPackage.ATOMIC_PROCESS__REALIZES;
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
		if (baseClass == AtomicProcess.class) {
			switch (baseFeatureID) {
				case ProcessPackage.ATOMIC_PROCESS__REALIZES: return ActionsPackage.ATOMIC_ACTION__REALIZES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AtomicActionImpl
