/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Fact.impl;

import net.sf.ictalive.EventModel.Fact.FactPackage;
import net.sf.ictalive.EventModel.Fact.Message;
import net.sf.ictalive.EventModel.Fact.ReceiveAct;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receive Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.impl.ReceiveActImpl#getReceivedMessage <em>Received Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceiveActImpl extends CommunicativeActImpl implements ReceiveAct
{
	/**
	 * The cached value of the '{@link #getReceivedMessage() <em>Received Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedMessage()
	 * @generated
	 * @ordered
	 */
	protected Message receivedMessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiveActImpl()
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
		return FactPackage.Literals.RECEIVE_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getReceivedMessage()
	{
		return receivedMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceivedMessage(Message newReceivedMessage, NotificationChain msgs)
	{
		Message oldReceivedMessage = receivedMessage;
		receivedMessage = newReceivedMessage;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FactPackage.RECEIVE_ACT__RECEIVED_MESSAGE, oldReceivedMessage, newReceivedMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivedMessage(Message newReceivedMessage)
	{
		if (newReceivedMessage != receivedMessage)
		{
			NotificationChain msgs = null;
			if (receivedMessage != null)
				msgs = ((InternalEObject)receivedMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FactPackage.RECEIVE_ACT__RECEIVED_MESSAGE, null, msgs);
			if (newReceivedMessage != null)
				msgs = ((InternalEObject)newReceivedMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FactPackage.RECEIVE_ACT__RECEIVED_MESSAGE, null, msgs);
			msgs = basicSetReceivedMessage(newReceivedMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactPackage.RECEIVE_ACT__RECEIVED_MESSAGE, newReceivedMessage, newReceivedMessage));
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
			case FactPackage.RECEIVE_ACT__RECEIVED_MESSAGE:
				return basicSetReceivedMessage(null, msgs);
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
			case FactPackage.RECEIVE_ACT__RECEIVED_MESSAGE:
				return getReceivedMessage();
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
			case FactPackage.RECEIVE_ACT__RECEIVED_MESSAGE:
				setReceivedMessage((Message)newValue);
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
			case FactPackage.RECEIVE_ACT__RECEIVED_MESSAGE:
				setReceivedMessage((Message)null);
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
			case FactPackage.RECEIVE_ACT__RECEIVED_MESSAGE:
				return receivedMessage != null;
		}
		return super.eIsSet(featureID);
	}

} //ReceiveActImpl
