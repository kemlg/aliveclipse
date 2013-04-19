/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.swrl.impl;

import java.util.Collection;

import net.sf.ictalive.operetta.OM.Concept;

import net.sf.ictalive.rules.swrl.DObject;
import net.sf.ictalive.rules.swrl.DataRangeAtom;
import net.sf.ictalive.rules.swrl.DataValue;
import net.sf.ictalive.rules.swrl.SwrlPackage;

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
 * An implementation of the model object '<em><b>Data Range Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.rules.swrl.impl.DataRangeAtomImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link net.sf.ictalive.rules.swrl.impl.DataRangeAtomImpl#getOneOf <em>One Of</em>}</li>
 *   <li>{@link net.sf.ictalive.rules.swrl.impl.DataRangeAtomImpl#getArgument1 <em>Argument1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataRangeAtomImpl extends AtomImpl implements DataRangeAtom {
	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected Concept dataType;

	/**
	 * The cached value of the '{@link #getOneOf() <em>One Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneOf()
	 * @generated
	 * @ordered
	 */
	protected EList<DataValue> oneOf;

	/**
	 * The cached value of the '{@link #getArgument1() <em>Argument1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument1()
	 * @generated
	 * @ordered
	 */
	protected DObject argument1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRangeAtomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SwrlPackage.Literals.DATA_RANGE_ATOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (Concept)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SwrlPackage.DATA_RANGE_ATOM__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(Concept newDataType) {
		Concept oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwrlPackage.DATA_RANGE_ATOM__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataValue> getOneOf() {
		if (oneOf == null) {
			oneOf = new EObjectContainmentEList<DataValue>(DataValue.class, this, SwrlPackage.DATA_RANGE_ATOM__ONE_OF);
		}
		return oneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DObject getArgument1() {
		return argument1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgument1(DObject newArgument1, NotificationChain msgs) {
		DObject oldArgument1 = argument1;
		argument1 = newArgument1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrlPackage.DATA_RANGE_ATOM__ARGUMENT1, oldArgument1, newArgument1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgument1(DObject newArgument1) {
		if (newArgument1 != argument1) {
			NotificationChain msgs = null;
			if (argument1 != null)
				msgs = ((InternalEObject)argument1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrlPackage.DATA_RANGE_ATOM__ARGUMENT1, null, msgs);
			if (newArgument1 != null)
				msgs = ((InternalEObject)newArgument1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrlPackage.DATA_RANGE_ATOM__ARGUMENT1, null, msgs);
			msgs = basicSetArgument1(newArgument1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwrlPackage.DATA_RANGE_ATOM__ARGUMENT1, newArgument1, newArgument1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SwrlPackage.DATA_RANGE_ATOM__ONE_OF:
				return ((InternalEList<?>)getOneOf()).basicRemove(otherEnd, msgs);
			case SwrlPackage.DATA_RANGE_ATOM__ARGUMENT1:
				return basicSetArgument1(null, msgs);
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
			case SwrlPackage.DATA_RANGE_ATOM__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case SwrlPackage.DATA_RANGE_ATOM__ONE_OF:
				return getOneOf();
			case SwrlPackage.DATA_RANGE_ATOM__ARGUMENT1:
				return getArgument1();
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
			case SwrlPackage.DATA_RANGE_ATOM__DATA_TYPE:
				setDataType((Concept)newValue);
				return;
			case SwrlPackage.DATA_RANGE_ATOM__ONE_OF:
				getOneOf().clear();
				getOneOf().addAll((Collection<? extends DataValue>)newValue);
				return;
			case SwrlPackage.DATA_RANGE_ATOM__ARGUMENT1:
				setArgument1((DObject)newValue);
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
			case SwrlPackage.DATA_RANGE_ATOM__DATA_TYPE:
				setDataType((Concept)null);
				return;
			case SwrlPackage.DATA_RANGE_ATOM__ONE_OF:
				getOneOf().clear();
				return;
			case SwrlPackage.DATA_RANGE_ATOM__ARGUMENT1:
				setArgument1((DObject)null);
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
			case SwrlPackage.DATA_RANGE_ATOM__DATA_TYPE:
				return dataType != null;
			case SwrlPackage.DATA_RANGE_ATOM__ONE_OF:
				return oneOf != null && !oneOf.isEmpty();
			case SwrlPackage.DATA_RANGE_ATOM__ARGUMENT1:
				return argument1 != null;
		}
		return super.eIsSet(featureID);
	}

} //DataRangeAtomImpl
