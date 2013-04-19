/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.actions.impl;

import java.util.Collection;

import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.actions.AtomicActionResult;
import net.sf.ictalive.coordination.actions.Distribution;

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
 * An implementation of the model object '<em><b>Atomic Action Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.AtomicActionResultImpl#getHasDensity <em>Has Density</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.AtomicActionResultImpl#getHasCostDistribution <em>Has Cost Distribution</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.AtomicActionResultImpl#getHasDurationDistribution <em>Has Duration Distribution</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.AtomicActionResultImpl#getHasQualityDistribution <em>Has Quality Distribution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomicActionResultImpl extends ActionResultImpl implements AtomicActionResult {
	/**
	 * The default value of the '{@link #getHasDensity() <em>Has Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDensity()
	 * @generated
	 * @ordered
	 */
	protected static final float HAS_DENSITY_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getHasDensity() <em>Has Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDensity()
	 * @generated
	 * @ordered
	 */
	protected float hasDensity = HAS_DENSITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasCostDistribution() <em>Has Cost Distribution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCostDistribution()
	 * @generated
	 * @ordered
	 */
	protected EList<Distribution> hasCostDistribution;

	/**
	 * The cached value of the '{@link #getHasDurationDistribution() <em>Has Duration Distribution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDurationDistribution()
	 * @generated
	 * @ordered
	 */
	protected EList<Distribution> hasDurationDistribution;

	/**
	 * The cached value of the '{@link #getHasQualityDistribution() <em>Has Quality Distribution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasQualityDistribution()
	 * @generated
	 * @ordered
	 */
	protected EList<Distribution> hasQualityDistribution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicActionResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.ATOMIC_ACTION_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHasDensity() {
		return hasDensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasDensity(float newHasDensity) {
		float oldHasDensity = hasDensity;
		hasDensity = newHasDensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.ATOMIC_ACTION_RESULT__HAS_DENSITY, oldHasDensity, hasDensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Distribution> getHasCostDistribution() {
		if (hasCostDistribution == null) {
			hasCostDistribution = new EObjectContainmentEList<Distribution>(Distribution.class, this, ActionsPackage.ATOMIC_ACTION_RESULT__HAS_COST_DISTRIBUTION);
		}
		return hasCostDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Distribution> getHasDurationDistribution() {
		if (hasDurationDistribution == null) {
			hasDurationDistribution = new EObjectContainmentEList<Distribution>(Distribution.class, this, ActionsPackage.ATOMIC_ACTION_RESULT__HAS_DURATION_DISTRIBUTION);
		}
		return hasDurationDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Distribution> getHasQualityDistribution() {
		if (hasQualityDistribution == null) {
			hasQualityDistribution = new EObjectContainmentEList<Distribution>(Distribution.class, this, ActionsPackage.ATOMIC_ACTION_RESULT__HAS_QUALITY_DISTRIBUTION);
		}
		return hasQualityDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionsPackage.ATOMIC_ACTION_RESULT__HAS_COST_DISTRIBUTION:
				return ((InternalEList<?>)getHasCostDistribution()).basicRemove(otherEnd, msgs);
			case ActionsPackage.ATOMIC_ACTION_RESULT__HAS_DURATION_DISTRIBUTION:
				return ((InternalEList<?>)getHasDurationDistribution()).basicRemove(otherEnd, msgs);
			case ActionsPackage.ATOMIC_ACTION_RESULT__HAS_QUALITY_DISTRIBUTION:
				return ((InternalEList<?>)getHasQualityDistribution()).basicRemove(otherEnd, msgs);
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
			case ActionsPackage.ATOMIC_ACTION_RESULT__HAS_DENSITY:
				return getHasDensity();
			case ActionsPackage.ATOMIC_ACTION_RESULT__HAS_COST_DISTRIBUTION:
				return getHasCostDistribution();
			case ActionsPackage.ATOMIC_ACTION_RESULT__HAS_DURATION_DISTRIBUTION:
				return getHasDurationDistribution();
			case ActionsPackage.ATOMIC_ACTION_RESULT__HAS_QUALITY_DISTRIBUTION:
				return getHasQualityDistribution();
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
			case ActionsPackage.ATOMIC_ACTION_RESULT__HAS_DENSITY:
				setHasDensity((Float)newValue);
				return;
			case ActionsPackage.ATOMIC_ACTION_RESULT__HAS_COST_DISTRIBUTION:
				getHasCostDistribution().clear();
				getHasCostDistribution().addAll((Collection<? extends Distribution>)newValue);
				return;
			case ActionsPackage.ATOMIC_ACTION_RESULT__HAS_DURATION_DISTRIBUTION:
				getHasDurationDistribution().clear();
				getHasDurationDistribution().addAll((Collection<? extends Distribution>)newValue);
				return;
			case ActionsPackage.ATOMIC_ACTION_RESULT__HAS_QUALITY_DISTRIBUTION:
				getHasQualityDistribution().clear();
				getHasQualityDistribution().addAll((Collection<? extends Distribution>)newValue);
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
			case ActionsPackage.ATOMIC_ACTION_RESULT__HAS_DENSITY:
				setHasDensity(HAS_DENSITY_EDEFAULT);
				return;
			case ActionsPackage.ATOMIC_ACTION_RESULT__HAS_COST_DISTRIBUTION:
				getHasCostDistribution().clear();
				return;
			case ActionsPackage.ATOMIC_ACTION_RESULT__HAS_DURATION_DISTRIBUTION:
				getHasDurationDistribution().clear();
				return;
			case ActionsPackage.ATOMIC_ACTION_RESULT__HAS_QUALITY_DISTRIBUTION:
				getHasQualityDistribution().clear();
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
			case ActionsPackage.ATOMIC_ACTION_RESULT__HAS_DENSITY:
				return hasDensity != HAS_DENSITY_EDEFAULT;
			case ActionsPackage.ATOMIC_ACTION_RESULT__HAS_COST_DISTRIBUTION:
				return hasCostDistribution != null && !hasCostDistribution.isEmpty();
			case ActionsPackage.ATOMIC_ACTION_RESULT__HAS_DURATION_DISTRIBUTION:
				return hasDurationDistribution != null && !hasDurationDistribution.isEmpty();
			case ActionsPackage.ATOMIC_ACTION_RESULT__HAS_QUALITY_DISTRIBUTION:
				return hasQualityDistribution != null && !hasQualityDistribution.isEmpty();
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
		result.append(" (hasDensity: ");
		result.append(hasDensity);
		result.append(')');
		return result.toString();
	}

} //AtomicActionResultImpl
