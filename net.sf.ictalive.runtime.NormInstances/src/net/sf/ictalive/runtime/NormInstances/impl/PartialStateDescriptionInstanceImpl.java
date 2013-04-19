/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.NormInstances.impl;

import java.util.Collection;

import net.sf.ictalive.operetta.OM.PartialStateDescription;

import net.sf.ictalive.runtime.NormInstances.NormInstancesPackage;
import net.sf.ictalive.runtime.NormInstances.PartialStateDescriptionInstance;
import net.sf.ictalive.runtime.NormInstances.Value;

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
 * An implementation of the model object '<em><b>Partial State Description Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.NormInstances.impl.PartialStateDescriptionInstanceImpl#getPartialStateDescription <em>Partial State Description</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.NormInstances.impl.PartialStateDescriptionInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.NormInstances.impl.PartialStateDescriptionInstanceImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartialStateDescriptionInstanceImpl extends EObjectImpl implements PartialStateDescriptionInstance {
	/**
	 * The cached value of the '{@link #getPartialStateDescription() <em>Partial State Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartialStateDescription()
	 * @generated
	 * @ordered
	 */
	protected PartialStateDescription partialStateDescription;

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
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartialStateDescriptionInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NormInstancesPackage.Literals.PARTIAL_STATE_DESCRIPTION_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialStateDescription getPartialStateDescription() {
		if (partialStateDescription != null && partialStateDescription.eIsProxy()) {
			InternalEObject oldPartialStateDescription = (InternalEObject)partialStateDescription;
			partialStateDescription = (PartialStateDescription)eResolveProxy(oldPartialStateDescription);
			if (partialStateDescription != oldPartialStateDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NormInstancesPackage.PARTIAL_STATE_DESCRIPTION_INSTANCE__PARTIAL_STATE_DESCRIPTION, oldPartialStateDescription, partialStateDescription));
			}
		}
		return partialStateDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialStateDescription basicGetPartialStateDescription() {
		return partialStateDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartialStateDescription(PartialStateDescription newPartialStateDescription) {
		PartialStateDescription oldPartialStateDescription = partialStateDescription;
		partialStateDescription = newPartialStateDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NormInstancesPackage.PARTIAL_STATE_DESCRIPTION_INSTANCE__PARTIAL_STATE_DESCRIPTION, oldPartialStateDescription, partialStateDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NormInstancesPackage.PARTIAL_STATE_DESCRIPTION_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getValue() {
		if (value == null) {
			value = new EObjectContainmentEList<Value>(Value.class, this, NormInstancesPackage.PARTIAL_STATE_DESCRIPTION_INSTANCE__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NormInstancesPackage.PARTIAL_STATE_DESCRIPTION_INSTANCE__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
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
			case NormInstancesPackage.PARTIAL_STATE_DESCRIPTION_INSTANCE__PARTIAL_STATE_DESCRIPTION:
				if (resolve) return getPartialStateDescription();
				return basicGetPartialStateDescription();
			case NormInstancesPackage.PARTIAL_STATE_DESCRIPTION_INSTANCE__NAME:
				return getName();
			case NormInstancesPackage.PARTIAL_STATE_DESCRIPTION_INSTANCE__VALUE:
				return getValue();
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
			case NormInstancesPackage.PARTIAL_STATE_DESCRIPTION_INSTANCE__PARTIAL_STATE_DESCRIPTION:
				setPartialStateDescription((PartialStateDescription)newValue);
				return;
			case NormInstancesPackage.PARTIAL_STATE_DESCRIPTION_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case NormInstancesPackage.PARTIAL_STATE_DESCRIPTION_INSTANCE__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends Value>)newValue);
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
			case NormInstancesPackage.PARTIAL_STATE_DESCRIPTION_INSTANCE__PARTIAL_STATE_DESCRIPTION:
				setPartialStateDescription((PartialStateDescription)null);
				return;
			case NormInstancesPackage.PARTIAL_STATE_DESCRIPTION_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NormInstancesPackage.PARTIAL_STATE_DESCRIPTION_INSTANCE__VALUE:
				getValue().clear();
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
			case NormInstancesPackage.PARTIAL_STATE_DESCRIPTION_INSTANCE__PARTIAL_STATE_DESCRIPTION:
				return partialStateDescription != null;
			case NormInstancesPackage.PARTIAL_STATE_DESCRIPTION_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NormInstancesPackage.PARTIAL_STATE_DESCRIPTION_INSTANCE__VALUE:
				return value != null && !value.isEmpty();
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

} //PartialStateDescriptionInstanceImpl
