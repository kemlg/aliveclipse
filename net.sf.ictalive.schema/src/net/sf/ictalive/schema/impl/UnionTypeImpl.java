/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.schema.impl;

import java.util.Collection;
import java.util.List;

import javax.xml.namespace.QName;

import net.sf.ictalive.schema.LocalSimpleType;
import net.sf.ictalive.schema.SchemaPackage;
import net.sf.ictalive.schema.UnionType;

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
 * An implementation of the model object '<em><b>Union Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.schema.impl.UnionTypeImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link net.sf.ictalive.schema.impl.UnionTypeImpl#getMemberTypes <em>Member Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnionTypeImpl extends AnnotatedImpl implements UnionType {
	/**
	 * The cached value of the '{@link #getSimpleType() <em>Simple Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleType()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalSimpleType> simpleType;

	/**
	 * The default value of the '{@link #getMemberTypes() <em>Member Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberTypes()
	 * @generated
	 * @ordered
	 */
	protected static final List<QName> MEMBER_TYPES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemberTypes() <em>Member Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberTypes()
	 * @generated
	 * @ordered
	 */
	protected List<QName> memberTypes = MEMBER_TYPES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.Literals.UNION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalSimpleType> getSimpleType() {
		if (simpleType == null) {
			simpleType = new EObjectContainmentEList<LocalSimpleType>(LocalSimpleType.class, this, SchemaPackage.UNION_TYPE__SIMPLE_TYPE);
		}
		return simpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QName> getMemberTypes() {
		return memberTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberTypes(List<QName> newMemberTypes) {
		List<QName> oldMemberTypes = memberTypes;
		memberTypes = newMemberTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.UNION_TYPE__MEMBER_TYPES, oldMemberTypes, memberTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.UNION_TYPE__SIMPLE_TYPE:
				return ((InternalEList<?>)getSimpleType()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.UNION_TYPE__SIMPLE_TYPE:
				return getSimpleType();
			case SchemaPackage.UNION_TYPE__MEMBER_TYPES:
				return getMemberTypes();
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
			case SchemaPackage.UNION_TYPE__SIMPLE_TYPE:
				getSimpleType().clear();
				getSimpleType().addAll((Collection<? extends LocalSimpleType>)newValue);
				return;
			case SchemaPackage.UNION_TYPE__MEMBER_TYPES:
				setMemberTypes((List<QName>)newValue);
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
			case SchemaPackage.UNION_TYPE__SIMPLE_TYPE:
				getSimpleType().clear();
				return;
			case SchemaPackage.UNION_TYPE__MEMBER_TYPES:
				setMemberTypes(MEMBER_TYPES_EDEFAULT);
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
			case SchemaPackage.UNION_TYPE__SIMPLE_TYPE:
				return simpleType != null && !simpleType.isEmpty();
			case SchemaPackage.UNION_TYPE__MEMBER_TYPES:
				return MEMBER_TYPES_EDEFAULT == null ? memberTypes != null : !MEMBER_TYPES_EDEFAULT.equals(memberTypes);
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
		result.append(" (memberTypes: ");
		result.append(memberTypes);
		result.append(')');
		return result.toString();
	}

} //UnionTypeImpl
