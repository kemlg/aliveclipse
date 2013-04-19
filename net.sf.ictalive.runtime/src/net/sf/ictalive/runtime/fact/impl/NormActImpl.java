/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact.impl;

import net.sf.ictalive.operetta.OM.Norm;

import net.sf.ictalive.runtime.event.Actor;

import net.sf.ictalive.runtime.fact.FactPackage;
import net.sf.ictalive.runtime.fact.NormAct;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Norm Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.fact.impl.NormActImpl#getWho <em>Who</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.fact.impl.NormActImpl#getNorm <em>Norm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NormActImpl extends FactImpl implements NormAct {
	/**
	 * The cached value of the '{@link #getWho() <em>Who</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWho()
	 * @generated
	 * @ordered
	 */
	protected Actor who;

	/**
	 * The cached value of the '{@link #getNorm() <em>Norm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNorm()
	 * @generated
	 * @ordered
	 */
	protected Norm norm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactPackage.Literals.NORM_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getWho() {
		if (who != null && who.eIsProxy()) {
			InternalEObject oldWho = (InternalEObject)who;
			who = (Actor)eResolveProxy(oldWho);
			if (who != oldWho) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FactPackage.NORM_ACT__WHO, oldWho, who));
			}
		}
		return who;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetWho() {
		return who;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWho(Actor newWho) {
		Actor oldWho = who;
		who = newWho;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactPackage.NORM_ACT__WHO, oldWho, who));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Norm getNorm() {
		if (norm != null && norm.eIsProxy()) {
			InternalEObject oldNorm = (InternalEObject)norm;
			norm = (Norm)eResolveProxy(oldNorm);
			if (norm != oldNorm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FactPackage.NORM_ACT__NORM, oldNorm, norm));
			}
		}
		return norm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Norm basicGetNorm() {
		return norm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNorm(Norm newNorm) {
		Norm oldNorm = norm;
		norm = newNorm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactPackage.NORM_ACT__NORM, oldNorm, norm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FactPackage.NORM_ACT__WHO:
				if (resolve) return getWho();
				return basicGetWho();
			case FactPackage.NORM_ACT__NORM:
				if (resolve) return getNorm();
				return basicGetNorm();
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
			case FactPackage.NORM_ACT__WHO:
				setWho((Actor)newValue);
				return;
			case FactPackage.NORM_ACT__NORM:
				setNorm((Norm)newValue);
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
			case FactPackage.NORM_ACT__WHO:
				setWho((Actor)null);
				return;
			case FactPackage.NORM_ACT__NORM:
				setNorm((Norm)null);
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
			case FactPackage.NORM_ACT__WHO:
				return who != null;
			case FactPackage.NORM_ACT__NORM:
				return norm != null;
		}
		return super.eIsSet(featureID);
	}

} //NormActImpl
