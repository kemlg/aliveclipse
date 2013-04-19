/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.NormInstances.impl;

import java.util.Collection;

import net.sf.ictalive.operetta.OM.Norm;

import net.sf.ictalive.runtime.NormInstances.NormInstance;
import net.sf.ictalive.runtime.NormInstances.NormInstancesPackage;
import net.sf.ictalive.runtime.NormInstances.PartialStateDescriptionInstance;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Norm Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.NormInstances.impl.NormInstanceImpl#getNorm <em>Norm</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.NormInstances.impl.NormInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.NormInstances.impl.NormInstanceImpl#getPartialStateDescriptionInstance <em>Partial State Description Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NormInstanceImpl extends EObjectImpl implements NormInstance {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartialStateDescriptionInstance() <em>Partial State Description Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartialStateDescriptionInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<PartialStateDescriptionInstance> partialStateDescriptionInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NormInstancesPackage.Literals.NORM_INSTANCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NormInstancesPackage.NORM_INSTANCE__NORM, oldNorm, norm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NormInstancesPackage.NORM_INSTANCE__NORM, oldNorm, norm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NormInstancesPackage.NORM_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartialStateDescriptionInstance> getPartialStateDescriptionInstance() {
		if (partialStateDescriptionInstance == null) {
			partialStateDescriptionInstance = new EObjectContainmentEList<PartialStateDescriptionInstance>(PartialStateDescriptionInstance.class, this, NormInstancesPackage.NORM_INSTANCE__PARTIAL_STATE_DESCRIPTION_INSTANCE);
		}
		return partialStateDescriptionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NormInstancesPackage.NORM_INSTANCE__PARTIAL_STATE_DESCRIPTION_INSTANCE:
				return ((InternalEList<?>)getPartialStateDescriptionInstance()).basicRemove(otherEnd, msgs);
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
			case NormInstancesPackage.NORM_INSTANCE__NORM:
				if (resolve) return getNorm();
				return basicGetNorm();
			case NormInstancesPackage.NORM_INSTANCE__NAME:
				return getName();
			case NormInstancesPackage.NORM_INSTANCE__PARTIAL_STATE_DESCRIPTION_INSTANCE:
				return getPartialStateDescriptionInstance();
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
			case NormInstancesPackage.NORM_INSTANCE__NORM:
				setNorm((Norm)newValue);
				return;
			case NormInstancesPackage.NORM_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case NormInstancesPackage.NORM_INSTANCE__PARTIAL_STATE_DESCRIPTION_INSTANCE:
				getPartialStateDescriptionInstance().clear();
				getPartialStateDescriptionInstance().addAll((Collection<? extends PartialStateDescriptionInstance>)newValue);
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
			case NormInstancesPackage.NORM_INSTANCE__NORM:
				setNorm((Norm)null);
				return;
			case NormInstancesPackage.NORM_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NormInstancesPackage.NORM_INSTANCE__PARTIAL_STATE_DESCRIPTION_INSTANCE:
				getPartialStateDescriptionInstance().clear();
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
			case NormInstancesPackage.NORM_INSTANCE__NORM:
				return norm != null;
			case NormInstancesPackage.NORM_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NormInstancesPackage.NORM_INSTANCE__PARTIAL_STATE_DESCRIPTION_INSTANCE:
				return partialStateDescriptionInstance != null && !partialStateDescriptionInstance.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NormInstanceImpl
