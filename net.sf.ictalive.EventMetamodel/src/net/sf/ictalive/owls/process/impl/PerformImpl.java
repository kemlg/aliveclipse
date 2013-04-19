/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process.impl;

import net.sf.ictalive.owls.process.Binding;
import net.sf.ictalive.owls.process.Perform;
import net.sf.ictalive.owls.process.ProcessPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.process.impl.PerformImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.PerformImpl#getHasDataFrom <em>Has Data From</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.PerformImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerformImpl extends ControlConstructImpl implements Perform
{
	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected net.sf.ictalive.owls.process.Process process;

	/**
	 * The cached value of the '{@link #getHasDataFrom() <em>Has Data From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDataFrom()
	 * @generated
	 * @ordered
	 */
	protected Binding hasDataFrom;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformImpl()
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
		return ProcessPackage.Literals.PERFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.sf.ictalive.owls.process.Process getProcess()
	{
		if (process != null && process.eIsProxy())
		{
			InternalEObject oldProcess = (InternalEObject)process;
			process = (net.sf.ictalive.owls.process.Process)eResolveProxy(oldProcess);
			if (process != oldProcess)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.PERFORM__PROCESS, oldProcess, process));
			}
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.sf.ictalive.owls.process.Process basicGetProcess()
	{
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(net.sf.ictalive.owls.process.Process newProcess)
	{
		net.sf.ictalive.owls.process.Process oldProcess = process;
		process = newProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PERFORM__PROCESS, oldProcess, process));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding getHasDataFrom()
	{
		return hasDataFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasDataFrom(Binding newHasDataFrom, NotificationChain msgs)
	{
		Binding oldHasDataFrom = hasDataFrom;
		hasDataFrom = newHasDataFrom;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.PERFORM__HAS_DATA_FROM, oldHasDataFrom, newHasDataFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasDataFrom(Binding newHasDataFrom)
	{
		if (newHasDataFrom != hasDataFrom)
		{
			NotificationChain msgs = null;
			if (hasDataFrom != null)
				msgs = ((InternalEObject)hasDataFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.PERFORM__HAS_DATA_FROM, null, msgs);
			if (newHasDataFrom != null)
				msgs = ((InternalEObject)newHasDataFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.PERFORM__HAS_DATA_FROM, null, msgs);
			msgs = basicSetHasDataFrom(newHasDataFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PERFORM__HAS_DATA_FROM, newHasDataFrom, newHasDataFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PERFORM__NAME, oldName, name));
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
			case ProcessPackage.PERFORM__HAS_DATA_FROM:
				return basicSetHasDataFrom(null, msgs);
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
			case ProcessPackage.PERFORM__PROCESS:
				if (resolve) return getProcess();
				return basicGetProcess();
			case ProcessPackage.PERFORM__HAS_DATA_FROM:
				return getHasDataFrom();
			case ProcessPackage.PERFORM__NAME:
				return getName();
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
			case ProcessPackage.PERFORM__PROCESS:
				setProcess((net.sf.ictalive.owls.process.Process)newValue);
				return;
			case ProcessPackage.PERFORM__HAS_DATA_FROM:
				setHasDataFrom((Binding)newValue);
				return;
			case ProcessPackage.PERFORM__NAME:
				setName((String)newValue);
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
			case ProcessPackage.PERFORM__PROCESS:
				setProcess((net.sf.ictalive.owls.process.Process)null);
				return;
			case ProcessPackage.PERFORM__HAS_DATA_FROM:
				setHasDataFrom((Binding)null);
				return;
			case ProcessPackage.PERFORM__NAME:
				setName(NAME_EDEFAULT);
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
			case ProcessPackage.PERFORM__PROCESS:
				return process != null;
			case ProcessPackage.PERFORM__HAS_DATA_FROM:
				return hasDataFrom != null;
			case ProcessPackage.PERFORM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PerformImpl
