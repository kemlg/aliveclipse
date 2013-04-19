/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM.impl;

import net.sf.ictalive.operetta.OM.HierarchyDependency;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.Role;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hierarchy Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.HierarchyDependencyImpl#getDependant <em>Dependant</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.HierarchyDependencyImpl#getDependee <em>Dependee</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HierarchyDependencyImpl extends DependencyImpl implements HierarchyDependency {
	/**
	 * The cached value of the '{@link #getDependant() <em>Dependant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependant()
	 * @generated
	 * @ordered
	 */
	protected Role dependant;

	/**
	 * The cached value of the '{@link #getDependee() <em>Dependee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependee()
	 * @generated
	 * @ordered
	 */
	protected Role dependee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HierarchyDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMPackage.Literals.HIERARCHY_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getDependant() {
		if (dependant != null && dependant.eIsProxy()) {
			InternalEObject oldDependant = (InternalEObject)dependant;
			dependant = (Role)eResolveProxy(oldDependant);
			if (dependant != oldDependant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.HIERARCHY_DEPENDENCY__DEPENDANT, oldDependant, dependant));
			}
		}
		return dependant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetDependant() {
		return dependant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependant(Role newDependant) {
		Role oldDependant = dependant;
		dependant = newDependant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.HIERARCHY_DEPENDENCY__DEPENDANT, oldDependant, dependant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getDependee() {
		if (dependee != null && dependee.eIsProxy()) {
			InternalEObject oldDependee = (InternalEObject)dependee;
			dependee = (Role)eResolveProxy(oldDependee);
			if (dependee != oldDependee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.HIERARCHY_DEPENDENCY__DEPENDEE, oldDependee, dependee));
			}
		}
		return dependee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetDependee() {
		return dependee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependee(Role newDependee) {
		Role oldDependee = dependee;
		dependee = newDependee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.HIERARCHY_DEPENDENCY__DEPENDEE, oldDependee, dependee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMPackage.HIERARCHY_DEPENDENCY__DEPENDANT:
				if (resolve) return getDependant();
				return basicGetDependant();
			case OMPackage.HIERARCHY_DEPENDENCY__DEPENDEE:
				if (resolve) return getDependee();
				return basicGetDependee();
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
			case OMPackage.HIERARCHY_DEPENDENCY__DEPENDANT:
				setDependant((Role)newValue);
				return;
			case OMPackage.HIERARCHY_DEPENDENCY__DEPENDEE:
				setDependee((Role)newValue);
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
			case OMPackage.HIERARCHY_DEPENDENCY__DEPENDANT:
				setDependant((Role)null);
				return;
			case OMPackage.HIERARCHY_DEPENDENCY__DEPENDEE:
				setDependee((Role)null);
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
			case OMPackage.HIERARCHY_DEPENDENCY__DEPENDANT:
				return dependant != null;
			case OMPackage.HIERARCHY_DEPENDENCY__DEPENDEE:
				return dependee != null;
		}
		return super.eIsSet(featureID);
	}

} //HierarchyDependencyImpl
