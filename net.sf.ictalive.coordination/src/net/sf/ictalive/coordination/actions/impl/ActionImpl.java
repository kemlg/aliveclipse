/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.actions.impl;

import java.util.Collection;

import net.sf.ictalive.coordination.actions.Action;
import net.sf.ictalive.coordination.actions.ActionsPackage;

import net.sf.ictalive.owls.process.impl.ProcessImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.ActionImpl#getPerformedByRole <em>Performed By Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActionImpl extends ProcessImpl implements Action {
	/**
	 * The cached value of the '{@link #getPerformedByRole() <em>Performed By Role</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedByRole()
	 * @generated
	 * @ordered
	 */
	protected EList<String> performedByRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPerformedByRole() {
		if (performedByRole == null) {
			performedByRole = new EDataTypeUniqueEList<String>(String.class, this, ActionsPackage.ACTION__PERFORMED_BY_ROLE);
		}
		return performedByRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActionsPackage.ACTION__PERFORMED_BY_ROLE:
				return getPerformedByRole();
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
			case ActionsPackage.ACTION__PERFORMED_BY_ROLE:
				getPerformedByRole().clear();
				getPerformedByRole().addAll((Collection<? extends String>)newValue);
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
			case ActionsPackage.ACTION__PERFORMED_BY_ROLE:
				getPerformedByRole().clear();
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
			case ActionsPackage.ACTION__PERFORMED_BY_ROLE:
				return performedByRole != null && !performedByRole.isEmpty();
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
		result.append(" (performedByRole: ");
		result.append(performedByRole);
		result.append(')');
		return result.toString();
	}

	@Override
	public void setName(String newName) {
		if (newName.length() > 0){
			char[] chars = newName.toCharArray();
			if (!Character.isLowerCase(chars[0])){
				chars[0] = Character.toLowerCase(chars[0]);
				newName = new String(chars);
			}
		}
		super.setName(newName);
	}
	

} //ActionImpl
