/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template.impl;

import net.sf.ictalive.service.template.ControlConstruct;
import net.sf.ictalive.service.template.ControlConstructBag;
import net.sf.ictalive.service.template.TemplatePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Construct Bag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.template.impl.ControlConstructBagImpl#getFirst <em>First</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.impl.ControlConstructBagImpl#getRest <em>Rest</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlConstructBagImpl extends EObjectImpl implements ControlConstructBag {
	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected ControlConstruct first;

	/**
	 * The cached value of the '{@link #getRest() <em>Rest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRest()
	 * @generated
	 * @ordered
	 */
	protected ControlConstructBag rest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlConstructBagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemplatePackage.Literals.CONTROL_CONSTRUCT_BAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstruct getFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirst(ControlConstruct newFirst, NotificationChain msgs) {
		ControlConstruct oldFirst = first;
		first = newFirst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemplatePackage.CONTROL_CONSTRUCT_BAG__FIRST, oldFirst, newFirst);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(ControlConstruct newFirst) {
		if (newFirst != first) {
			NotificationChain msgs = null;
			if (first != null)
				msgs = ((InternalEObject)first).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.CONTROL_CONSTRUCT_BAG__FIRST, null, msgs);
			if (newFirst != null)
				msgs = ((InternalEObject)newFirst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.CONTROL_CONSTRUCT_BAG__FIRST, null, msgs);
			msgs = basicSetFirst(newFirst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.CONTROL_CONSTRUCT_BAG__FIRST, newFirst, newFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstructBag getRest() {
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRest(ControlConstructBag newRest, NotificationChain msgs) {
		ControlConstructBag oldRest = rest;
		rest = newRest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemplatePackage.CONTROL_CONSTRUCT_BAG__REST, oldRest, newRest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRest(ControlConstructBag newRest) {
		if (newRest != rest) {
			NotificationChain msgs = null;
			if (rest != null)
				msgs = ((InternalEObject)rest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.CONTROL_CONSTRUCT_BAG__REST, null, msgs);
			if (newRest != null)
				msgs = ((InternalEObject)newRest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.CONTROL_CONSTRUCT_BAG__REST, null, msgs);
			msgs = basicSetRest(newRest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.CONTROL_CONSTRUCT_BAG__REST, newRest, newRest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TemplatePackage.CONTROL_CONSTRUCT_BAG__FIRST:
				return basicSetFirst(null, msgs);
			case TemplatePackage.CONTROL_CONSTRUCT_BAG__REST:
				return basicSetRest(null, msgs);
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
			case TemplatePackage.CONTROL_CONSTRUCT_BAG__FIRST:
				return getFirst();
			case TemplatePackage.CONTROL_CONSTRUCT_BAG__REST:
				return getRest();
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
			case TemplatePackage.CONTROL_CONSTRUCT_BAG__FIRST:
				setFirst((ControlConstruct)newValue);
				return;
			case TemplatePackage.CONTROL_CONSTRUCT_BAG__REST:
				setRest((ControlConstructBag)newValue);
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
			case TemplatePackage.CONTROL_CONSTRUCT_BAG__FIRST:
				setFirst((ControlConstruct)null);
				return;
			case TemplatePackage.CONTROL_CONSTRUCT_BAG__REST:
				setRest((ControlConstructBag)null);
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
			case TemplatePackage.CONTROL_CONSTRUCT_BAG__FIRST:
				return first != null;
			case TemplatePackage.CONTROL_CONSTRUCT_BAG__REST:
				return rest != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlConstructBagImpl
