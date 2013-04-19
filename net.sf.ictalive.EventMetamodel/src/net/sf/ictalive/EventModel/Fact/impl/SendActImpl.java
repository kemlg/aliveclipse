/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Fact.impl;

import net.sf.ictalive.EventModel.Fact.FactPackage;
import net.sf.ictalive.EventModel.Fact.Message;
import net.sf.ictalive.EventModel.Fact.SendAct;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.impl.SendActImpl#getSendMessage <em>Send Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SendActImpl extends CommunicativeActImpl implements SendAct
{
	/**
	 * The cached value of the '{@link #getSendMessage() <em>Send Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendMessage()
	 * @generated
	 * @ordered
	 */
	protected Message sendMessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendActImpl()
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
		return FactPackage.Literals.SEND_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getSendMessage()
	{
		return sendMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendMessage(Message newSendMessage, NotificationChain msgs)
	{
		Message oldSendMessage = sendMessage;
		sendMessage = newSendMessage;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FactPackage.SEND_ACT__SEND_MESSAGE, oldSendMessage, newSendMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendMessage(Message newSendMessage)
	{
		if (newSendMessage != sendMessage)
		{
			NotificationChain msgs = null;
			if (sendMessage != null)
				msgs = ((InternalEObject)sendMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FactPackage.SEND_ACT__SEND_MESSAGE, null, msgs);
			if (newSendMessage != null)
				msgs = ((InternalEObject)newSendMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FactPackage.SEND_ACT__SEND_MESSAGE, null, msgs);
			msgs = basicSetSendMessage(newSendMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactPackage.SEND_ACT__SEND_MESSAGE, newSendMessage, newSendMessage));
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
			case FactPackage.SEND_ACT__SEND_MESSAGE:
				return basicSetSendMessage(null, msgs);
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
			case FactPackage.SEND_ACT__SEND_MESSAGE:
				return getSendMessage();
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
			case FactPackage.SEND_ACT__SEND_MESSAGE:
				setSendMessage((Message)newValue);
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
			case FactPackage.SEND_ACT__SEND_MESSAGE:
				setSendMessage((Message)null);
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
			case FactPackage.SEND_ACT__SEND_MESSAGE:
				return sendMessage != null;
		}
		return super.eIsSet(featureID);
	}

} //SendActImpl
