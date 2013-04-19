/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Fact.impl;

import net.sf.ictalive.EventModel.Action.CommunicativeAction;

import net.sf.ictalive.EventModel.Event.Actor;

import net.sf.ictalive.EventModel.Fact.CommunicativeAct;
import net.sf.ictalive.EventModel.Fact.FactPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communicative Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.impl.CommunicativeActImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.impl.CommunicativeActImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.impl.CommunicativeActImpl#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CommunicativeActImpl extends FactImpl implements CommunicativeAct
{
	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected Actor sender;

	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected Actor receiver;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected CommunicativeAction action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicativeActImpl()
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
		return FactPackage.Literals.COMMUNICATIVE_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getSender()
	{
		if (sender != null && sender.eIsProxy())
		{
			InternalEObject oldSender = (InternalEObject)sender;
			sender = (Actor)eResolveProxy(oldSender);
			if (sender != oldSender)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FactPackage.COMMUNICATIVE_ACT__SENDER, oldSender, sender));
			}
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetSender()
	{
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(Actor newSender)
	{
		Actor oldSender = sender;
		sender = newSender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactPackage.COMMUNICATIVE_ACT__SENDER, oldSender, sender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getReceiver()
	{
		if (receiver != null && receiver.eIsProxy())
		{
			InternalEObject oldReceiver = (InternalEObject)receiver;
			receiver = (Actor)eResolveProxy(oldReceiver);
			if (receiver != oldReceiver)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FactPackage.COMMUNICATIVE_ACT__RECEIVER, oldReceiver, receiver));
			}
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetReceiver()
	{
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiver(Actor newReceiver)
	{
		Actor oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactPackage.COMMUNICATIVE_ACT__RECEIVER, oldReceiver, receiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicativeAction getAction()
	{
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(CommunicativeAction newAction, NotificationChain msgs)
	{
		CommunicativeAction oldAction = action;
		action = newAction;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FactPackage.COMMUNICATIVE_ACT__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(CommunicativeAction newAction)
	{
		if (newAction != action)
		{
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FactPackage.COMMUNICATIVE_ACT__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FactPackage.COMMUNICATIVE_ACT__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactPackage.COMMUNICATIVE_ACT__ACTION, newAction, newAction));
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
			case FactPackage.COMMUNICATIVE_ACT__ACTION:
				return basicSetAction(null, msgs);
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
			case FactPackage.COMMUNICATIVE_ACT__SENDER:
				if (resolve) return getSender();
				return basicGetSender();
			case FactPackage.COMMUNICATIVE_ACT__RECEIVER:
				if (resolve) return getReceiver();
				return basicGetReceiver();
			case FactPackage.COMMUNICATIVE_ACT__ACTION:
				return getAction();
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
			case FactPackage.COMMUNICATIVE_ACT__SENDER:
				setSender((Actor)newValue);
				return;
			case FactPackage.COMMUNICATIVE_ACT__RECEIVER:
				setReceiver((Actor)newValue);
				return;
			case FactPackage.COMMUNICATIVE_ACT__ACTION:
				setAction((CommunicativeAction)newValue);
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
			case FactPackage.COMMUNICATIVE_ACT__SENDER:
				setSender((Actor)null);
				return;
			case FactPackage.COMMUNICATIVE_ACT__RECEIVER:
				setReceiver((Actor)null);
				return;
			case FactPackage.COMMUNICATIVE_ACT__ACTION:
				setAction((CommunicativeAction)null);
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
			case FactPackage.COMMUNICATIVE_ACT__SENDER:
				return sender != null;
			case FactPackage.COMMUNICATIVE_ACT__RECEIVER:
				return receiver != null;
			case FactPackage.COMMUNICATIVE_ACT__ACTION:
				return action != null;
		}
		return super.eIsSet(featureID);
	}

} //CommunicativeActImpl
