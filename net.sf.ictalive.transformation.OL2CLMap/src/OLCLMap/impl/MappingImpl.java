/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OLCLMap.impl;

import OLCLMap.MapEntry;
import OLCLMap.Mapping;
import OLCLMap.OLCLMapPackage;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OLCLMap.impl.MappingImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link OLCLMap.impl.MappingImpl#getOperaFile <em>Opera File</em>}</li>
 *   <li>{@link OLCLMap.impl.MappingImpl#getActionFile <em>Action File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingImpl extends EObjectImpl implements Mapping {
	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<MapEntry> entry;

	/**
	 * The default value of the '{@link #getOperaFile() <em>Opera File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperaFile()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERA_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperaFile() <em>Opera File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperaFile()
	 * @generated
	 * @ordered
	 */
	protected String operaFile = OPERA_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionFile() <em>Action File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionFile()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionFile() <em>Action File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionFile()
	 * @generated
	 * @ordered
	 */
	protected String actionFile = ACTION_FILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OLCLMapPackage.Literals.MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MapEntry> getEntry() {
		if (entry == null) {
			entry = new EObjectContainmentEList<MapEntry>(MapEntry.class, this, OLCLMapPackage.MAPPING__ENTRY);
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperaFile() {
		return operaFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperaFile(String newOperaFile) {
		String oldOperaFile = operaFile;
		operaFile = newOperaFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OLCLMapPackage.MAPPING__OPERA_FILE, oldOperaFile, operaFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionFile() {
		return actionFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionFile(String newActionFile) {
		String oldActionFile = actionFile;
		actionFile = newActionFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OLCLMapPackage.MAPPING__ACTION_FILE, oldActionFile, actionFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OLCLMapPackage.MAPPING__ENTRY:
				return ((InternalEList<?>)getEntry()).basicRemove(otherEnd, msgs);
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
			case OLCLMapPackage.MAPPING__ENTRY:
				return getEntry();
			case OLCLMapPackage.MAPPING__OPERA_FILE:
				return getOperaFile();
			case OLCLMapPackage.MAPPING__ACTION_FILE:
				return getActionFile();
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
			case OLCLMapPackage.MAPPING__ENTRY:
				getEntry().clear();
				getEntry().addAll((Collection<? extends MapEntry>)newValue);
				return;
			case OLCLMapPackage.MAPPING__OPERA_FILE:
				setOperaFile((String)newValue);
				return;
			case OLCLMapPackage.MAPPING__ACTION_FILE:
				setActionFile((String)newValue);
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
			case OLCLMapPackage.MAPPING__ENTRY:
				getEntry().clear();
				return;
			case OLCLMapPackage.MAPPING__OPERA_FILE:
				setOperaFile(OPERA_FILE_EDEFAULT);
				return;
			case OLCLMapPackage.MAPPING__ACTION_FILE:
				setActionFile(ACTION_FILE_EDEFAULT);
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
			case OLCLMapPackage.MAPPING__ENTRY:
				return entry != null && !entry.isEmpty();
			case OLCLMapPackage.MAPPING__OPERA_FILE:
				return OPERA_FILE_EDEFAULT == null ? operaFile != null : !OPERA_FILE_EDEFAULT.equals(operaFile);
			case OLCLMapPackage.MAPPING__ACTION_FILE:
				return ACTION_FILE_EDEFAULT == null ? actionFile != null : !ACTION_FILE_EDEFAULT.equals(actionFile);
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
		result.append(" (operaFile: ");
		result.append(operaFile);
		result.append(", actionFile: ");
		result.append(actionFile);
		result.append(')');
		return result.toString();
	}

} //MappingImpl
