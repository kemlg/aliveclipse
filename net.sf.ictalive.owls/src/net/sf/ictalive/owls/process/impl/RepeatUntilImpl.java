/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process.impl;

import net.sf.ictalive.owls.expr.Condition;

import net.sf.ictalive.owls.process.ControlConstruct;
import net.sf.ictalive.owls.process.ProcessPackage;
import net.sf.ictalive.owls.process.RepeatUntil;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat Until</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.process.impl.RepeatUntilImpl#getUntilCondition <em>Until Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.RepeatUntilImpl#getUntilProcess <em>Until Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepeatUntilImpl extends IterateImpl implements RepeatUntil {
	/**
	 * The cached value of the '{@link #getUntilCondition() <em>Until Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition untilCondition;

	/**
	 * The cached value of the '{@link #getUntilProcess() <em>Until Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilProcess()
	 * @generated
	 * @ordered
	 */
	protected ControlConstruct untilProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatUntilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.REPEAT_UNTIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getUntilCondition() {
		return untilCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUntilCondition(Condition newUntilCondition, NotificationChain msgs) {
		Condition oldUntilCondition = untilCondition;
		untilCondition = newUntilCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.REPEAT_UNTIL__UNTIL_CONDITION, oldUntilCondition, newUntilCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUntilCondition(Condition newUntilCondition) {
		if (newUntilCondition != untilCondition) {
			NotificationChain msgs = null;
			if (untilCondition != null)
				msgs = ((InternalEObject)untilCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.REPEAT_UNTIL__UNTIL_CONDITION, null, msgs);
			if (newUntilCondition != null)
				msgs = ((InternalEObject)newUntilCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.REPEAT_UNTIL__UNTIL_CONDITION, null, msgs);
			msgs = basicSetUntilCondition(newUntilCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.REPEAT_UNTIL__UNTIL_CONDITION, newUntilCondition, newUntilCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstruct getUntilProcess() {
		return untilProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUntilProcess(ControlConstruct newUntilProcess, NotificationChain msgs) {
		ControlConstruct oldUntilProcess = untilProcess;
		untilProcess = newUntilProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.REPEAT_UNTIL__UNTIL_PROCESS, oldUntilProcess, newUntilProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUntilProcess(ControlConstruct newUntilProcess) {
		if (newUntilProcess != untilProcess) {
			NotificationChain msgs = null;
			if (untilProcess != null)
				msgs = ((InternalEObject)untilProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.REPEAT_UNTIL__UNTIL_PROCESS, null, msgs);
			if (newUntilProcess != null)
				msgs = ((InternalEObject)newUntilProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.REPEAT_UNTIL__UNTIL_PROCESS, null, msgs);
			msgs = basicSetUntilProcess(newUntilProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.REPEAT_UNTIL__UNTIL_PROCESS, newUntilProcess, newUntilProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.REPEAT_UNTIL__UNTIL_CONDITION:
				return basicSetUntilCondition(null, msgs);
			case ProcessPackage.REPEAT_UNTIL__UNTIL_PROCESS:
				return basicSetUntilProcess(null, msgs);
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
			case ProcessPackage.REPEAT_UNTIL__UNTIL_CONDITION:
				return getUntilCondition();
			case ProcessPackage.REPEAT_UNTIL__UNTIL_PROCESS:
				return getUntilProcess();
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
			case ProcessPackage.REPEAT_UNTIL__UNTIL_CONDITION:
				setUntilCondition((Condition)newValue);
				return;
			case ProcessPackage.REPEAT_UNTIL__UNTIL_PROCESS:
				setUntilProcess((ControlConstruct)newValue);
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
			case ProcessPackage.REPEAT_UNTIL__UNTIL_CONDITION:
				setUntilCondition((Condition)null);
				return;
			case ProcessPackage.REPEAT_UNTIL__UNTIL_PROCESS:
				setUntilProcess((ControlConstruct)null);
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
			case ProcessPackage.REPEAT_UNTIL__UNTIL_CONDITION:
				return untilCondition != null;
			case ProcessPackage.REPEAT_UNTIL__UNTIL_PROCESS:
				return untilProcess != null;
		}
		return super.eIsSet(featureID);
	}

} //RepeatUntilImpl
