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
import net.sf.ictalive.owls.process.RepeatWhile;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link net.sf.ictalive.owls.process.impl.RepeatWhileImpl#getWhileCondition <em>While Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.RepeatWhileImpl#getWhileProcess <em>While Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepeatWhileImpl extends IterateImpl implements RepeatWhile
{
	/**
	 * The cached value of the '{@link #getWhileCondition() <em>While Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhileCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition whileCondition;

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
	protected RepeatWhileImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ProcessPackage.Literals.REPEAT_WHILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getWhileCondition()
	{
		return whileCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhileCondition(Condition newWhileCondition, NotificationChain msgs)
	{
		Condition oldWhileCondition = whileCondition;
		whileCondition = newWhileCondition;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.REPEAT_WHILE__WHILE_CONDITION, oldWhileCondition, newWhileCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhileCondition(Condition newWhileCondition)
	{
		if (newWhileCondition != whileCondition)
		{
			NotificationChain msgs = null;
			if (whileCondition != null)
				msgs = ((InternalEObject)whileCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.REPEAT_WHILE__WHILE_CONDITION, null, msgs);
			if (newWhileCondition != null)
				msgs = ((InternalEObject)newWhileCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.REPEAT_WHILE__WHILE_CONDITION, null, msgs);
			msgs = basicSetWhileCondition(newWhileCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.REPEAT_WHILE__WHILE_CONDITION, newWhileCondition, newWhileCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstruct getWhileProcess()
	{
		if (whileProcess != null && whileProcess.eIsProxy())
		{
			InternalEObject oldWhileProcess = (InternalEObject)whileProcess;
			whileProcess = (ControlConstruct)eResolveProxy(oldWhileProcess);
			if (whileProcess != oldWhileProcess)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.REPEAT_WHILE__WHILE_PROCESS, oldWhileProcess, whileProcess));
			}
		}
		return whileProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstruct basicGetWhileProcess()
	{
		return whileProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhileProcess(ControlConstruct newWhileProcess)
	{
		ControlConstruct oldWhileProcess = whileProcess;
		whileProcess = newWhileProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.REPEAT_WHILE__WHILE_PROCESS, oldWhileProcess, whileProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ProcessPackage.REPEAT_WHILE__WHILE_CONDITION:
				return basicSetWhileCondition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case ProcessPackage.REPEAT_WHILE__WHILE_CONDITION:
				return getWhileCondition();
			case ProcessPackage.REPEAT_WHILE__WHILE_PROCESS:
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ProcessPackage.REPEAT_WHILE__WHILE_CONDITION:
				setWhileCondition((Condition)newValue);
				return;
			case ProcessPackage.REPEAT_WHILE__WHILE_PROCESS:
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case ProcessPackage.REPEAT_WHILE__WHILE_CONDITION:
				setWhileCondition((Condition)null);
				return;
			case ProcessPackage.REPEAT_WHILE__WHILE_PROCESS:
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case ProcessPackage.REPEAT_WHILE__WHILE_CONDITION:
				return whileCondition != null;
			case ProcessPackage.REPEAT_WHILE__WHILE_PROCESS:
				return whileProcess != null;
		}
		return super.eIsSet(featureID);
	}

} //RepeatWhileImpl
