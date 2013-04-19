/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.enactment.impl;

import net.sf.ictalive.coordination.tasks.ActionGrounding;

import net.sf.ictalive.runtime.enactment.ActionEnactment;
import net.sf.ictalive.runtime.enactment.EnactmentPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Enactment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.enactment.impl.ActionEnactmentImpl#getGroundedAction <em>Grounded Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionEnactmentImpl extends EnactmentImpl implements ActionEnactment {
	/**
	 * The cached value of the '{@link #getGroundedAction() <em>Grounded Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundedAction()
	 * @generated
	 * @ordered
	 */
	protected ActionGrounding groundedAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionEnactmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnactmentPackage.Literals.ACTION_ENACTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGrounding getGroundedAction() {
		if (groundedAction != null && groundedAction.eIsProxy()) {
			InternalEObject oldGroundedAction = (InternalEObject)groundedAction;
			groundedAction = (ActionGrounding)eResolveProxy(oldGroundedAction);
			if (groundedAction != oldGroundedAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnactmentPackage.ACTION_ENACTMENT__GROUNDED_ACTION, oldGroundedAction, groundedAction));
			}
		}
		return groundedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGrounding basicGetGroundedAction() {
		return groundedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroundedAction(ActionGrounding newGroundedAction) {
		ActionGrounding oldGroundedAction = groundedAction;
		groundedAction = newGroundedAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnactmentPackage.ACTION_ENACTMENT__GROUNDED_ACTION, oldGroundedAction, groundedAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnactmentPackage.ACTION_ENACTMENT__GROUNDED_ACTION:
				if (resolve) return getGroundedAction();
				return basicGetGroundedAction();
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
			case EnactmentPackage.ACTION_ENACTMENT__GROUNDED_ACTION:
				setGroundedAction((ActionGrounding)newValue);
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
			case EnactmentPackage.ACTION_ENACTMENT__GROUNDED_ACTION:
				setGroundedAction((ActionGrounding)null);
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
			case EnactmentPackage.ACTION_ENACTMENT__GROUNDED_ACTION:
				return groundedAction != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionEnactmentImpl
