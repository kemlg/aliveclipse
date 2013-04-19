/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM.impl;

import java.util.Collection;

import net.sf.ictalive.operetta.OM.Arc;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.Role;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.ArcImpl#getArcID <em>Arc ID</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.ArcImpl#getAccessible <em>Accessible</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ArcImpl extends EObjectImpl implements Arc {
	/**
	 * The default value of the '{@link #getArcID() <em>Arc ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcID()
	 * @generated
	 * @ordered
	 */
	protected static final String ARC_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArcID() <em>Arc ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcID()
	 * @generated
	 * @ordered
	 */
	protected String arcID = ARC_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccessible() <em>Accessible</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessible()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> accessible;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArcID() {
		return arcID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArcID(String newArcID) {
		String oldArcID = arcID;
		arcID = newArcID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.ARC__ARC_ID, oldArcID, arcID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getAccessible() {
		if (accessible == null) {
			accessible = new EObjectResolvingEList<Role>(Role.class, this, OMPackage.ARC__ACCESSIBLE);
		}
		return accessible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMPackage.ARC__ARC_ID:
				return getArcID();
			case OMPackage.ARC__ACCESSIBLE:
				return getAccessible();
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
			case OMPackage.ARC__ARC_ID:
				setArcID((String)newValue);
				return;
			case OMPackage.ARC__ACCESSIBLE:
				getAccessible().clear();
				getAccessible().addAll((Collection<? extends Role>)newValue);
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
			case OMPackage.ARC__ARC_ID:
				setArcID(ARC_ID_EDEFAULT);
				return;
			case OMPackage.ARC__ACCESSIBLE:
				getAccessible().clear();
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
			case OMPackage.ARC__ARC_ID:
				return ARC_ID_EDEFAULT == null ? arcID != null : !ARC_ID_EDEFAULT.equals(arcID);
			case OMPackage.ARC__ACCESSIBLE:
				return accessible != null && !accessible.isEmpty();
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
		result.append(" (arcID: ");
		result.append(arcID);
		result.append(')');
		return result.toString();
	}

} //ArcImpl
