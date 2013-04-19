/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.swrl.impl;

import net.sf.ictalive.rules.swrl.DataLiteral;
import net.sf.ictalive.rules.swrl.DataValue;
import net.sf.ictalive.rules.swrl.SwrlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.rules.swrl.impl.DataLiteralImpl#getDataValue <em>Data Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataLiteralImpl extends DObjectImpl implements DataLiteral {
	/**
	 * The cached value of the '{@link #getDataValue() <em>Data Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataValue()
	 * @generated
	 * @ordered
	 */
	protected DataValue dataValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SwrlPackage.Literals.DATA_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue getDataValue() {
		return dataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataValue(DataValue newDataValue, NotificationChain msgs) {
		DataValue oldDataValue = dataValue;
		dataValue = newDataValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrlPackage.DATA_LITERAL__DATA_VALUE, oldDataValue, newDataValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataValue(DataValue newDataValue) {
		if (newDataValue != dataValue) {
			NotificationChain msgs = null;
			if (dataValue != null)
				msgs = ((InternalEObject)dataValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrlPackage.DATA_LITERAL__DATA_VALUE, null, msgs);
			if (newDataValue != null)
				msgs = ((InternalEObject)newDataValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrlPackage.DATA_LITERAL__DATA_VALUE, null, msgs);
			msgs = basicSetDataValue(newDataValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwrlPackage.DATA_LITERAL__DATA_VALUE, newDataValue, newDataValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SwrlPackage.DATA_LITERAL__DATA_VALUE:
				return basicSetDataValue(null, msgs);
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
			case SwrlPackage.DATA_LITERAL__DATA_VALUE:
				return getDataValue();
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
			case SwrlPackage.DATA_LITERAL__DATA_VALUE:
				setDataValue((DataValue)newValue);
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
			case SwrlPackage.DATA_LITERAL__DATA_VALUE:
				setDataValue((DataValue)null);
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
			case SwrlPackage.DATA_LITERAL__DATA_VALUE:
				return dataValue != null;
		}
		return super.eIsSet(featureID);
	}

} //DataLiteralImpl
