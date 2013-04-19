/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.tasks.impl;

import net.sf.ictalive.coordination.tasks.InputMessageMap;
import net.sf.ictalive.coordination.tasks.TasksPackage;

import net.sf.ictalive.owls.process.Parameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Message Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.tasks.impl.InputMessageMapImpl#getMessagePart <em>Message Part</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.impl.InputMessageMapImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.impl.InputMessageMapImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.tasks.impl.InputMessageMapImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputMessageMapImpl extends EObjectImpl implements InputMessageMap
{
	/**
	 * The default value of the '{@link #getMessagePart() <em>Message Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagePart()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_PART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessagePart() <em>Message Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagePart()
	 * @generated
	 * @ordered
	 */
	protected String messagePart = MESSAGE_PART_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputMessageMapImpl()
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
		return TasksPackage.Literals.INPUT_MESSAGE_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessagePart()
	{
		return messagePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessagePart(String newMessagePart)
	{
		String oldMessagePart = messagePart;
		messagePart = newMessagePart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.INPUT_MESSAGE_MAP__MESSAGE_PART, oldMessagePart, messagePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter()
	{
		if (parameter != null && parameter.eIsProxy())
		{
			InternalEObject oldParameter = (InternalEObject)parameter;
			parameter = (Parameter)eResolveProxy(oldParameter);
			if (parameter != oldParameter)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TasksPackage.INPUT_MESSAGE_MAP__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParameter()
	{
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Parameter newParameter)
	{
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.INPUT_MESSAGE_MAP__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.INPUT_MESSAGE_MAP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion()
	{
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion)
	{
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.INPUT_MESSAGE_MAP__VERSION, oldVersion, version));
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
			case TasksPackage.INPUT_MESSAGE_MAP__MESSAGE_PART:
				return getMessagePart();
			case TasksPackage.INPUT_MESSAGE_MAP__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
			case TasksPackage.INPUT_MESSAGE_MAP__ID:
				return new Integer(getId());
			case TasksPackage.INPUT_MESSAGE_MAP__VERSION:
				return new Integer(getVersion());
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
			case TasksPackage.INPUT_MESSAGE_MAP__MESSAGE_PART:
				setMessagePart((String)newValue);
				return;
			case TasksPackage.INPUT_MESSAGE_MAP__PARAMETER:
				setParameter((Parameter)newValue);
				return;
			case TasksPackage.INPUT_MESSAGE_MAP__ID:
				setId(((Integer)newValue).intValue());
				return;
			case TasksPackage.INPUT_MESSAGE_MAP__VERSION:
				setVersion(((Integer)newValue).intValue());
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
			case TasksPackage.INPUT_MESSAGE_MAP__MESSAGE_PART:
				setMessagePart(MESSAGE_PART_EDEFAULT);
				return;
			case TasksPackage.INPUT_MESSAGE_MAP__PARAMETER:
				setParameter((Parameter)null);
				return;
			case TasksPackage.INPUT_MESSAGE_MAP__ID:
				setId(ID_EDEFAULT);
				return;
			case TasksPackage.INPUT_MESSAGE_MAP__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case TasksPackage.INPUT_MESSAGE_MAP__MESSAGE_PART:
				return MESSAGE_PART_EDEFAULT == null ? messagePart != null : !MESSAGE_PART_EDEFAULT.equals(messagePart);
			case TasksPackage.INPUT_MESSAGE_MAP__PARAMETER:
				return parameter != null;
			case TasksPackage.INPUT_MESSAGE_MAP__ID:
				return id != ID_EDEFAULT;
			case TasksPackage.INPUT_MESSAGE_MAP__VERSION:
				return version != VERSION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (messagePart: ");
		result.append(messagePart);
		result.append(", id: ");
		result.append(id);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //InputMessageMapImpl
