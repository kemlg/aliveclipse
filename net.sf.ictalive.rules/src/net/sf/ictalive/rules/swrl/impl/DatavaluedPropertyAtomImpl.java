/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.swrl.impl;

import net.sf.ictalive.operetta.OM.Concept;
import net.sf.ictalive.operetta.OM.Atom;

import net.sf.ictalive.rules.swrl.DObject;
import net.sf.ictalive.rules.swrl.DatavaluedPropertyAtom;
import net.sf.ictalive.rules.swrl.IObject;
import net.sf.ictalive.rules.swrl.SwrlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datavalued Property Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.rules.swrl.impl.DatavaluedPropertyAtomImpl#getPropertyPredicate <em>Property Predicate</em>}</li>
 *   <li>{@link net.sf.ictalive.rules.swrl.impl.DatavaluedPropertyAtomImpl#getArgument2 <em>Argument2</em>}</li>
 *   <li>{@link net.sf.ictalive.rules.swrl.impl.DatavaluedPropertyAtomImpl#getArgument1 <em>Argument1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatavaluedPropertyAtomImpl extends AtomImpl implements DatavaluedPropertyAtom {
	/**
	 * The cached value of the '{@link #getPropertyPredicate() <em>Property Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyPredicate()
	 * @generated
	 * @ordered
	 */
	protected Concept propertyPredicate;

	/**
	 * The cached value of the '{@link #getArgument2() <em>Argument2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument2()
	 * @generated
	 * @ordered
	 */
	protected DObject argument2;

	/**
	 * The cached value of the '{@link #getArgument1() <em>Argument1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument1()
	 * @generated
	 * @ordered
	 */
	protected IObject argument1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatavaluedPropertyAtomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SwrlPackage.Literals.DATAVALUED_PROPERTY_ATOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getPropertyPredicate() {
		if (propertyPredicate != null && propertyPredicate.eIsProxy()) {
			InternalEObject oldPropertyPredicate = (InternalEObject)propertyPredicate;
			propertyPredicate = (Concept)eResolveProxy(oldPropertyPredicate);
			if (propertyPredicate != oldPropertyPredicate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SwrlPackage.DATAVALUED_PROPERTY_ATOM__PROPERTY_PREDICATE, oldPropertyPredicate, propertyPredicate));
			}
		}
		return propertyPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept basicGetPropertyPredicate() {
		return propertyPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyPredicate(Concept newPropertyPredicate) {
		Concept oldPropertyPredicate = propertyPredicate;
		propertyPredicate = newPropertyPredicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwrlPackage.DATAVALUED_PROPERTY_ATOM__PROPERTY_PREDICATE, oldPropertyPredicate, propertyPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DObject getArgument2() {
		return argument2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgument2(DObject newArgument2, NotificationChain msgs) {
		DObject oldArgument2 = argument2;
		argument2 = newArgument2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrlPackage.DATAVALUED_PROPERTY_ATOM__ARGUMENT2, oldArgument2, newArgument2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgument2(DObject newArgument2) {
		if (newArgument2 != argument2) {
			NotificationChain msgs = null;
			if (argument2 != null)
				msgs = ((InternalEObject)argument2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrlPackage.DATAVALUED_PROPERTY_ATOM__ARGUMENT2, null, msgs);
			if (newArgument2 != null)
				msgs = ((InternalEObject)newArgument2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrlPackage.DATAVALUED_PROPERTY_ATOM__ARGUMENT2, null, msgs);
			msgs = basicSetArgument2(newArgument2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwrlPackage.DATAVALUED_PROPERTY_ATOM__ARGUMENT2, newArgument2, newArgument2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IObject getArgument1() {
		return argument1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgument1(IObject newArgument1, NotificationChain msgs) {
		IObject oldArgument1 = argument1;
		argument1 = newArgument1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrlPackage.DATAVALUED_PROPERTY_ATOM__ARGUMENT1, oldArgument1, newArgument1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgument1(IObject newArgument1) {
		if (newArgument1 != argument1) {
			NotificationChain msgs = null;
			if (argument1 != null)
				msgs = ((InternalEObject)argument1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrlPackage.DATAVALUED_PROPERTY_ATOM__ARGUMENT1, null, msgs);
			if (newArgument1 != null)
				msgs = ((InternalEObject)newArgument1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrlPackage.DATAVALUED_PROPERTY_ATOM__ARGUMENT1, null, msgs);
			msgs = basicSetArgument1(newArgument1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwrlPackage.DATAVALUED_PROPERTY_ATOM__ARGUMENT1, newArgument1, newArgument1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SwrlPackage.DATAVALUED_PROPERTY_ATOM__ARGUMENT2:
				return basicSetArgument2(null, msgs);
			case SwrlPackage.DATAVALUED_PROPERTY_ATOM__ARGUMENT1:
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
			case SwrlPackage.DATAVALUED_PROPERTY_ATOM__PROPERTY_PREDICATE:
				if (resolve) return getPropertyPredicate();
				return basicGetPropertyPredicate();
			case SwrlPackage.DATAVALUED_PROPERTY_ATOM__ARGUMENT2:
				return getArgument2();
			case SwrlPackage.DATAVALUED_PROPERTY_ATOM__ARGUMENT1:
				return getArgument1();
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
			case SwrlPackage.DATAVALUED_PROPERTY_ATOM__PROPERTY_PREDICATE:
				setPropertyPredicate((Concept)newValue);
				return;
			case SwrlPackage.DATAVALUED_PROPERTY_ATOM__ARGUMENT2:
				setArgument2((DObject)newValue);
				return;
			case SwrlPackage.DATAVALUED_PROPERTY_ATOM__ARGUMENT1:
				setArgument1((IObject)newValue);
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
			case SwrlPackage.DATAVALUED_PROPERTY_ATOM__PROPERTY_PREDICATE:
				setPropertyPredicate((Concept)null);
				return;
			case SwrlPackage.DATAVALUED_PROPERTY_ATOM__ARGUMENT2:
				setArgument2((DObject)null);
				return;
			case SwrlPackage.DATAVALUED_PROPERTY_ATOM__ARGUMENT1:
				setArgument1((IObject)null);
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
			case SwrlPackage.DATAVALUED_PROPERTY_ATOM__PROPERTY_PREDICATE:
				return propertyPredicate != null;
			case SwrlPackage.DATAVALUED_PROPERTY_ATOM__ARGUMENT2:
				return argument2 != null;
			case SwrlPackage.DATAVALUED_PROPERTY_ATOM__ARGUMENT1:
				return argument1 != null;
		}
		return super.eIsSet(featureID);
	}

} //DatavaluedPropertyAtomImpl
