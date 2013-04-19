/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action.impl;

import net.sf.ictalive.operetta.OM.PartialStateDescription;

import net.sf.ictalive.rules.swrl.Atom;

import net.sf.ictalive.runtime.action.ActionPackage;
import net.sf.ictalive.runtime.action.StateOfWorld;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Of World</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.action.impl.StateOfWorldImpl#getPartialStateDescription <em>Partial State Description</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.impl.StateOfWorldImpl#getAtom <em>Atom</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.impl.StateOfWorldImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateOfWorldImpl extends EObjectImpl implements StateOfWorld {
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
	 * The cached value of the '{@link #getAtom() <em>Atom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtom()
	 * @generated
	 * @ordered
	 */
	protected Atom atom;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateOfWorldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionPackage.Literals.STATE_OF_WORLD;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionPackage.STATE_OF_WORLD__PARTIAL_STATE_DESCRIPTION, oldPartialStateDescription, partialStateDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.STATE_OF_WORLD__PARTIAL_STATE_DESCRIPTION, oldPartialStateDescription, partialStateDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atom getAtom() {
		if (atom != null && atom.eIsProxy()) {
			InternalEObject oldAtom = (InternalEObject)atom;
			atom = (Atom)eResolveProxy(oldAtom);
			if (atom != oldAtom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionPackage.STATE_OF_WORLD__ATOM, oldAtom, atom));
			}
		}
		return atom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atom basicGetAtom() {
		return atom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtom(Atom newAtom) {
		Atom oldAtom = atom;
		atom = newAtom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.STATE_OF_WORLD__ATOM, oldAtom, atom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.STATE_OF_WORLD__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActionPackage.STATE_OF_WORLD__PARTIAL_STATE_DESCRIPTION:
				if (resolve) return getPartialStateDescription();
				return basicGetPartialStateDescription();
			case ActionPackage.STATE_OF_WORLD__ATOM:
				if (resolve) return getAtom();
				return basicGetAtom();
			case ActionPackage.STATE_OF_WORLD__DESCRIPTION:
				return getDescription();
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
			case ActionPackage.STATE_OF_WORLD__PARTIAL_STATE_DESCRIPTION:
				setPartialStateDescription((PartialStateDescription)newValue);
				return;
			case ActionPackage.STATE_OF_WORLD__ATOM:
				setAtom((Atom)newValue);
				return;
			case ActionPackage.STATE_OF_WORLD__DESCRIPTION:
				setDescription((String)newValue);
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
			case ActionPackage.STATE_OF_WORLD__PARTIAL_STATE_DESCRIPTION:
				setPartialStateDescription((PartialStateDescription)null);
				return;
			case ActionPackage.STATE_OF_WORLD__ATOM:
				setAtom((Atom)null);
				return;
			case ActionPackage.STATE_OF_WORLD__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case ActionPackage.STATE_OF_WORLD__PARTIAL_STATE_DESCRIPTION:
				return partialStateDescription != null;
			case ActionPackage.STATE_OF_WORLD__ATOM:
				return atom != null;
			case ActionPackage.STATE_OF_WORLD__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //StateOfWorldImpl
