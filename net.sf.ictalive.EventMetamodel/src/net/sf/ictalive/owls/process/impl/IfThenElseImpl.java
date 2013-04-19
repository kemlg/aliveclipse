/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process.impl;

import net.sf.ictalive.owls.expr.Condition;

import net.sf.ictalive.owls.process.ControlConstruct;
import net.sf.ictalive.owls.process.IfThenElse;
import net.sf.ictalive.owls.process.ProcessPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Then Else</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.process.impl.IfThenElseImpl#getIfCondition <em>If Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.IfThenElseImpl#getThen <em>Then</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.IfThenElseImpl#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfThenElseImpl extends ControlConstructImpl implements IfThenElse
{
	/**
	 * The cached value of the '{@link #getIfCondition() <em>If Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition ifCondition;

	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected ControlConstruct then;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected ControlConstruct else_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfThenElseImpl()
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
		return ProcessPackage.Literals.IF_THEN_ELSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getIfCondition()
	{
		return ifCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfCondition(Condition newIfCondition, NotificationChain msgs)
	{
		Condition oldIfCondition = ifCondition;
		ifCondition = newIfCondition;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.IF_THEN_ELSE__IF_CONDITION, oldIfCondition, newIfCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfCondition(Condition newIfCondition)
	{
		if (newIfCondition != ifCondition)
		{
			NotificationChain msgs = null;
			if (ifCondition != null)
				msgs = ((InternalEObject)ifCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.IF_THEN_ELSE__IF_CONDITION, null, msgs);
			if (newIfCondition != null)
				msgs = ((InternalEObject)newIfCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.IF_THEN_ELSE__IF_CONDITION, null, msgs);
			msgs = basicSetIfCondition(newIfCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.IF_THEN_ELSE__IF_CONDITION, newIfCondition, newIfCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstruct getThen()
	{
		if (then != null && then.eIsProxy())
		{
			InternalEObject oldThen = (InternalEObject)then;
			then = (ControlConstruct)eResolveProxy(oldThen);
			if (then != oldThen)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.IF_THEN_ELSE__THEN, oldThen, then));
			}
		}
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstruct basicGetThen()
	{
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThen(ControlConstruct newThen)
	{
		ControlConstruct oldThen = then;
		then = newThen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.IF_THEN_ELSE__THEN, oldThen, then));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstruct getElse()
	{
		if (else_ != null && else_.eIsProxy())
		{
			InternalEObject oldElse = (InternalEObject)else_;
			else_ = (ControlConstruct)eResolveProxy(oldElse);
			if (else_ != oldElse)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.IF_THEN_ELSE__ELSE, oldElse, else_));
			}
		}
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstruct basicGetElse()
	{
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(ControlConstruct newElse)
	{
		ControlConstruct oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.IF_THEN_ELSE__ELSE, oldElse, else_));
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
			case ProcessPackage.IF_THEN_ELSE__IF_CONDITION:
				return basicSetIfCondition(null, msgs);
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
			case ProcessPackage.IF_THEN_ELSE__IF_CONDITION:
				return getIfCondition();
			case ProcessPackage.IF_THEN_ELSE__THEN:
				if (resolve) return getThen();
				return basicGetThen();
			case ProcessPackage.IF_THEN_ELSE__ELSE:
				if (resolve) return getElse();
				return basicGetElse();
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
			case ProcessPackage.IF_THEN_ELSE__IF_CONDITION:
				setIfCondition((Condition)newValue);
				return;
			case ProcessPackage.IF_THEN_ELSE__THEN:
				setThen((ControlConstruct)newValue);
				return;
			case ProcessPackage.IF_THEN_ELSE__ELSE:
				setElse((ControlConstruct)newValue);
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
			case ProcessPackage.IF_THEN_ELSE__IF_CONDITION:
				setIfCondition((Condition)null);
				return;
			case ProcessPackage.IF_THEN_ELSE__THEN:
				setThen((ControlConstruct)null);
				return;
			case ProcessPackage.IF_THEN_ELSE__ELSE:
				setElse((ControlConstruct)null);
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
			case ProcessPackage.IF_THEN_ELSE__IF_CONDITION:
				return ifCondition != null;
			case ProcessPackage.IF_THEN_ELSE__THEN:
				return then != null;
			case ProcessPackage.IF_THEN_ELSE__ELSE:
				return else_ != null;
		}
		return super.eIsSet(featureID);
	}

} //IfThenElseImpl
