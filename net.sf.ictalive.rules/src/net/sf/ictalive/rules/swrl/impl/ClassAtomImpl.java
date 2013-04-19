/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.swrl.impl;

import net.sf.ictalive.operetta.OM.Concept;

import net.sf.ictalive.rules.swrl.ClassAtom;
import net.sf.ictalive.rules.swrl.IObject;
import net.sf.ictalive.rules.swrl.SwrlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.rules.swrl.impl.ClassAtomImpl#getClassPredicate <em>Class Predicate</em>}</li>
 *   <li>{@link net.sf.ictalive.rules.swrl.impl.ClassAtomImpl#getArgument1 <em>Argument1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassAtomImpl extends AtomImpl implements ClassAtom {
	/**
	 * The cached value of the '{@link #getClassPredicate() <em>Class Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassPredicate()
	 * @generated
	 * @ordered
	 */
	protected Concept classPredicate;

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
	protected ClassAtomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SwrlPackage.Literals.CLASS_ATOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getClassPredicate() {
		if (classPredicate != null && classPredicate.eIsProxy()) {
			InternalEObject oldClassPredicate = (InternalEObject)classPredicate;
			classPredicate = (Concept)eResolveProxy(oldClassPredicate);
			if (classPredicate != oldClassPredicate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SwrlPackage.CLASS_ATOM__CLASS_PREDICATE, oldClassPredicate, classPredicate));
			}
		}
		return classPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept basicGetClassPredicate() {
		return classPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassPredicate(Concept newClassPredicate) {
		Concept oldClassPredicate = classPredicate;
		classPredicate = newClassPredicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwrlPackage.CLASS_ATOM__CLASS_PREDICATE, oldClassPredicate, classPredicate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrlPackage.CLASS_ATOM__ARGUMENT1, oldArgument1, newArgument1);
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
				msgs = ((InternalEObject)argument1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrlPackage.CLASS_ATOM__ARGUMENT1, null, msgs);
			if (newArgument1 != null)
				msgs = ((InternalEObject)newArgument1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrlPackage.CLASS_ATOM__ARGUMENT1, null, msgs);
			msgs = basicSetArgument1(newArgument1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwrlPackage.CLASS_ATOM__ARGUMENT1, newArgument1, newArgument1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SwrlPackage.CLASS_ATOM__ARGUMENT1:
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
			case SwrlPackage.CLASS_ATOM__CLASS_PREDICATE:
				if (resolve) return getClassPredicate();
				return basicGetClassPredicate();
			case SwrlPackage.CLASS_ATOM__ARGUMENT1:
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
			case SwrlPackage.CLASS_ATOM__CLASS_PREDICATE:
				setClassPredicate((Concept)newValue);
				return;
			case SwrlPackage.CLASS_ATOM__ARGUMENT1:
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
			case SwrlPackage.CLASS_ATOM__CLASS_PREDICATE:
				setClassPredicate((Concept)null);
				return;
			case SwrlPackage.CLASS_ATOM__ARGUMENT1:
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
			case SwrlPackage.CLASS_ATOM__CLASS_PREDICATE:
				return classPredicate != null;
			case SwrlPackage.CLASS_ATOM__ARGUMENT1:
				return argument1 != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassAtomImpl
