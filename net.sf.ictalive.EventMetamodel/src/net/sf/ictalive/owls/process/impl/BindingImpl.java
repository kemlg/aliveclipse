/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process.impl;

import net.sf.ictalive.owls.process.Binding;
import net.sf.ictalive.owls.process.Parameter;
import net.sf.ictalive.owls.process.ProcessPackage;
import net.sf.ictalive.owls.process.ValueOf;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.process.impl.BindingImpl#getToParam <em>To Param</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.BindingImpl#getValueSpecifier <em>Value Specifier</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.BindingImpl#getValueData <em>Value Data</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.BindingImpl#getValueFrom <em>Value From</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.BindingImpl#getValueFunction <em>Value Function</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.BindingImpl#getValueSource <em>Value Source</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.BindingImpl#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingImpl extends EObjectImpl implements Binding
{
	/**
	 * The cached value of the '{@link #getToParam() <em>To Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToParam()
	 * @generated
	 * @ordered
	 */
	protected Parameter toParam;

	/**
	 * The default value of the '{@link #getValueSpecifier() <em>Value Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSpecifier()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_SPECIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueSpecifier() <em>Value Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSpecifier()
	 * @generated
	 * @ordered
	 */
	protected String valueSpecifier = VALUE_SPECIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueData() <em>Value Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueData()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueData() <em>Value Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueData()
	 * @generated
	 * @ordered
	 */
	protected String valueData = VALUE_DATA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueFrom() <em>Value From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFrom()
	 * @generated
	 * @ordered
	 */
	protected EObject valueFrom;

	/**
	 * The cached value of the '{@link #getValueFunction() <em>Value Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFunction()
	 * @generated
	 * @ordered
	 */
	protected EObject valueFunction;

	/**
	 * The cached value of the '{@link #getValueSource() <em>Value Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSource()
	 * @generated
	 * @ordered
	 */
	protected ValueOf valueSource;

	/**
	 * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected String valueType = VALUE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingImpl()
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
		return ProcessPackage.Literals.BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getToParam()
	{
		if (toParam != null && toParam.eIsProxy())
		{
			InternalEObject oldToParam = (InternalEObject)toParam;
			toParam = (Parameter)eResolveProxy(oldToParam);
			if (toParam != oldToParam)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.BINDING__TO_PARAM, oldToParam, toParam));
			}
		}
		return toParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetToParam()
	{
		return toParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToParam(Parameter newToParam)
	{
		Parameter oldToParam = toParam;
		toParam = newToParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BINDING__TO_PARAM, oldToParam, toParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueSpecifier()
	{
		return valueSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSpecifier(String newValueSpecifier)
	{
		String oldValueSpecifier = valueSpecifier;
		valueSpecifier = newValueSpecifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BINDING__VALUE_SPECIFIER, oldValueSpecifier, valueSpecifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueData()
	{
		return valueData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueData(String newValueData)
	{
		String oldValueData = valueData;
		valueData = newValueData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BINDING__VALUE_DATA, oldValueData, valueData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getValueFrom()
	{
		if (valueFrom != null && valueFrom.eIsProxy())
		{
			InternalEObject oldValueFrom = (InternalEObject)valueFrom;
			valueFrom = eResolveProxy(oldValueFrom);
			if (valueFrom != oldValueFrom)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.BINDING__VALUE_FROM, oldValueFrom, valueFrom));
			}
		}
		return valueFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetValueFrom()
	{
		return valueFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueFrom(EObject newValueFrom)
	{
		EObject oldValueFrom = valueFrom;
		valueFrom = newValueFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BINDING__VALUE_FROM, oldValueFrom, valueFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getValueFunction()
	{
		if (valueFunction != null && valueFunction.eIsProxy())
		{
			InternalEObject oldValueFunction = (InternalEObject)valueFunction;
			valueFunction = eResolveProxy(oldValueFunction);
			if (valueFunction != oldValueFunction)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.BINDING__VALUE_FUNCTION, oldValueFunction, valueFunction));
			}
		}
		return valueFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetValueFunction()
	{
		return valueFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueFunction(EObject newValueFunction)
	{
		EObject oldValueFunction = valueFunction;
		valueFunction = newValueFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BINDING__VALUE_FUNCTION, oldValueFunction, valueFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueOf getValueSource()
	{
		return valueSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSource(ValueOf newValueSource, NotificationChain msgs)
	{
		ValueOf oldValueSource = valueSource;
		valueSource = newValueSource;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.BINDING__VALUE_SOURCE, oldValueSource, newValueSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSource(ValueOf newValueSource)
	{
		if (newValueSource != valueSource)
		{
			NotificationChain msgs = null;
			if (valueSource != null)
				msgs = ((InternalEObject)valueSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.BINDING__VALUE_SOURCE, null, msgs);
			if (newValueSource != null)
				msgs = ((InternalEObject)newValueSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.BINDING__VALUE_SOURCE, null, msgs);
			msgs = basicSetValueSource(newValueSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BINDING__VALUE_SOURCE, newValueSource, newValueSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueType()
	{
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(String newValueType)
	{
		String oldValueType = valueType;
		valueType = newValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BINDING__VALUE_TYPE, oldValueType, valueType));
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
			case ProcessPackage.BINDING__VALUE_SOURCE:
				return basicSetValueSource(null, msgs);
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
			case ProcessPackage.BINDING__TO_PARAM:
				if (resolve) return getToParam();
				return basicGetToParam();
			case ProcessPackage.BINDING__VALUE_SPECIFIER:
				return getValueSpecifier();
			case ProcessPackage.BINDING__VALUE_DATA:
				return getValueData();
			case ProcessPackage.BINDING__VALUE_FROM:
				if (resolve) return getValueFrom();
				return basicGetValueFrom();
			case ProcessPackage.BINDING__VALUE_FUNCTION:
				if (resolve) return getValueFunction();
				return basicGetValueFunction();
			case ProcessPackage.BINDING__VALUE_SOURCE:
				return getValueSource();
			case ProcessPackage.BINDING__VALUE_TYPE:
				return getValueType();
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
			case ProcessPackage.BINDING__TO_PARAM:
				setToParam((Parameter)newValue);
				return;
			case ProcessPackage.BINDING__VALUE_SPECIFIER:
				setValueSpecifier((String)newValue);
				return;
			case ProcessPackage.BINDING__VALUE_DATA:
				setValueData((String)newValue);
				return;
			case ProcessPackage.BINDING__VALUE_FROM:
				setValueFrom((EObject)newValue);
				return;
			case ProcessPackage.BINDING__VALUE_FUNCTION:
				setValueFunction((EObject)newValue);
				return;
			case ProcessPackage.BINDING__VALUE_SOURCE:
				setValueSource((ValueOf)newValue);
				return;
			case ProcessPackage.BINDING__VALUE_TYPE:
				setValueType((String)newValue);
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
			case ProcessPackage.BINDING__TO_PARAM:
				setToParam((Parameter)null);
				return;
			case ProcessPackage.BINDING__VALUE_SPECIFIER:
				setValueSpecifier(VALUE_SPECIFIER_EDEFAULT);
				return;
			case ProcessPackage.BINDING__VALUE_DATA:
				setValueData(VALUE_DATA_EDEFAULT);
				return;
			case ProcessPackage.BINDING__VALUE_FROM:
				setValueFrom((EObject)null);
				return;
			case ProcessPackage.BINDING__VALUE_FUNCTION:
				setValueFunction((EObject)null);
				return;
			case ProcessPackage.BINDING__VALUE_SOURCE:
				setValueSource((ValueOf)null);
				return;
			case ProcessPackage.BINDING__VALUE_TYPE:
				setValueType(VALUE_TYPE_EDEFAULT);
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
			case ProcessPackage.BINDING__TO_PARAM:
				return toParam != null;
			case ProcessPackage.BINDING__VALUE_SPECIFIER:
				return VALUE_SPECIFIER_EDEFAULT == null ? valueSpecifier != null : !VALUE_SPECIFIER_EDEFAULT.equals(valueSpecifier);
			case ProcessPackage.BINDING__VALUE_DATA:
				return VALUE_DATA_EDEFAULT == null ? valueData != null : !VALUE_DATA_EDEFAULT.equals(valueData);
			case ProcessPackage.BINDING__VALUE_FROM:
				return valueFrom != null;
			case ProcessPackage.BINDING__VALUE_FUNCTION:
				return valueFunction != null;
			case ProcessPackage.BINDING__VALUE_SOURCE:
				return valueSource != null;
			case ProcessPackage.BINDING__VALUE_TYPE:
				return VALUE_TYPE_EDEFAULT == null ? valueType != null : !VALUE_TYPE_EDEFAULT.equals(valueType);
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
		result.append(" (valueSpecifier: ");
		result.append(valueSpecifier);
		result.append(", valueData: ");
		result.append(valueData);
		result.append(", valueType: ");
		result.append(valueType);
		result.append(')');
		return result.toString();
	}

} //BindingImpl
