/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template.impl;

import net.sf.ictalive.rules.swrl.Atom;

import net.sf.ictalive.service.template.ControlConstruct;
import net.sf.ictalive.service.template.RepeatWhile;
import net.sf.ictalive.service.template.TemplatePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat While</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.template.impl.RepeatWhileImpl#getWhileCondition <em>While Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.impl.RepeatWhileImpl#getWhileProcess <em>While Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepeatWhileImpl extends IterateImpl implements RepeatWhile {
	/**
	 * The cached value of the '{@link #getWhileCondition() <em>While Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhileCondition()
	 * @generated
	 * @ordered
	 */
	protected Atom whileCondition;

	/**
	 * The cached value of the '{@link #getWhileProcess() <em>While Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhileProcess()
	 * @generated
	 * @ordered
	 */
	protected ControlConstruct whileProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatWhileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemplatePackage.Literals.REPEAT_WHILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atom getWhileCondition() {
		if (whileCondition != null && whileCondition.eIsProxy()) {
			InternalEObject oldWhileCondition = (InternalEObject)whileCondition;
			whileCondition = (Atom)eResolveProxy(oldWhileCondition);
			if (whileCondition != oldWhileCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.REPEAT_WHILE__WHILE_CONDITION, oldWhileCondition, whileCondition));
			}
		}
		return whileCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atom basicGetWhileCondition() {
		return whileCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhileCondition(Atom newWhileCondition) {
		Atom oldWhileCondition = whileCondition;
		whileCondition = newWhileCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.REPEAT_WHILE__WHILE_CONDITION, oldWhileCondition, whileCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstruct getWhileProcess() {
		if (whileProcess != null && whileProcess.eIsProxy()) {
			InternalEObject oldWhileProcess = (InternalEObject)whileProcess;
			whileProcess = (ControlConstruct)eResolveProxy(oldWhileProcess);
			if (whileProcess != oldWhileProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.REPEAT_WHILE__WHILE_PROCESS, oldWhileProcess, whileProcess));
			}
		}
		return whileProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstruct basicGetWhileProcess() {
		return whileProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhileProcess(ControlConstruct newWhileProcess) {
		ControlConstruct oldWhileProcess = whileProcess;
		whileProcess = newWhileProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.REPEAT_WHILE__WHILE_PROCESS, oldWhileProcess, whileProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TemplatePackage.REPEAT_WHILE__WHILE_CONDITION:
				if (resolve) return getWhileCondition();
				return basicGetWhileCondition();
			case TemplatePackage.REPEAT_WHILE__WHILE_PROCESS:
				if (resolve) return getWhileProcess();
				return basicGetWhileProcess();
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
			case TemplatePackage.REPEAT_WHILE__WHILE_CONDITION:
				setWhileCondition((Atom)newValue);
				return;
			case TemplatePackage.REPEAT_WHILE__WHILE_PROCESS:
				setWhileProcess((ControlConstruct)newValue);
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
			case TemplatePackage.REPEAT_WHILE__WHILE_CONDITION:
				setWhileCondition((Atom)null);
				return;
			case TemplatePackage.REPEAT_WHILE__WHILE_PROCESS:
				setWhileProcess((ControlConstruct)null);
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
			case TemplatePackage.REPEAT_WHILE__WHILE_CONDITION:
				return whileCondition != null;
			case TemplatePackage.REPEAT_WHILE__WHILE_PROCESS:
				return whileProcess != null;
		}
		return super.eIsSet(featureID);
	}

} //RepeatWhileImpl
