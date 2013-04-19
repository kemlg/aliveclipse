/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process.impl;

import net.sf.ictalive.owls.process.AtomicProcess;
import net.sf.ictalive.owls.process.CompositeProcess;
import net.sf.ictalive.owls.process.ProcessPackage;
import net.sf.ictalive.owls.process.SimpleProcess;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.process.impl.SimpleProcessImpl#getRealizedBy <em>Realized By</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.SimpleProcessImpl#getExpandsTo <em>Expands To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleProcessImpl extends ProcessImpl implements SimpleProcess
{
	/**
	 * The cached value of the '{@link #getRealizedBy() <em>Realized By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedBy()
	 * @generated
	 * @ordered
	 */
	protected AtomicProcess realizedBy;

	/**
	 * The cached value of the '{@link #getExpandsTo() <em>Expands To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpandsTo()
	 * @generated
	 * @ordered
	 */
	protected CompositeProcess expandsTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleProcessImpl()
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
		return ProcessPackage.Literals.SIMPLE_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicProcess getRealizedBy()
	{
		if (realizedBy != null && realizedBy.eIsProxy())
		{
			InternalEObject oldRealizedBy = (InternalEObject)realizedBy;
			realizedBy = (AtomicProcess)eResolveProxy(oldRealizedBy);
			if (realizedBy != oldRealizedBy)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.SIMPLE_PROCESS__REALIZED_BY, oldRealizedBy, realizedBy));
			}
		}
		return realizedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicProcess basicGetRealizedBy()
	{
		return realizedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealizedBy(AtomicProcess newRealizedBy, NotificationChain msgs)
	{
		AtomicProcess oldRealizedBy = realizedBy;
		realizedBy = newRealizedBy;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.SIMPLE_PROCESS__REALIZED_BY, oldRealizedBy, newRealizedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizedBy(AtomicProcess newRealizedBy)
	{
		if (newRealizedBy != realizedBy)
		{
			NotificationChain msgs = null;
			if (realizedBy != null)
				msgs = ((InternalEObject)realizedBy).eInverseRemove(this, ProcessPackage.ATOMIC_PROCESS__REALIZES, AtomicProcess.class, msgs);
			if (newRealizedBy != null)
				msgs = ((InternalEObject)newRealizedBy).eInverseAdd(this, ProcessPackage.ATOMIC_PROCESS__REALIZES, AtomicProcess.class, msgs);
			msgs = basicSetRealizedBy(newRealizedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.SIMPLE_PROCESS__REALIZED_BY, newRealizedBy, newRealizedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeProcess getExpandsTo()
	{
		if (expandsTo != null && expandsTo.eIsProxy())
		{
			InternalEObject oldExpandsTo = (InternalEObject)expandsTo;
			expandsTo = (CompositeProcess)eResolveProxy(oldExpandsTo);
			if (expandsTo != oldExpandsTo)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.SIMPLE_PROCESS__EXPANDS_TO, oldExpandsTo, expandsTo));
			}
		}
		return expandsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeProcess basicGetExpandsTo()
	{
		return expandsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpandsTo(CompositeProcess newExpandsTo, NotificationChain msgs)
	{
		CompositeProcess oldExpandsTo = expandsTo;
		expandsTo = newExpandsTo;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.SIMPLE_PROCESS__EXPANDS_TO, oldExpandsTo, newExpandsTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpandsTo(CompositeProcess newExpandsTo)
	{
		if (newExpandsTo != expandsTo)
		{
			NotificationChain msgs = null;
			if (expandsTo != null)
				msgs = ((InternalEObject)expandsTo).eInverseRemove(this, ProcessPackage.COMPOSITE_PROCESS__COLLAPSES_TO, CompositeProcess.class, msgs);
			if (newExpandsTo != null)
				msgs = ((InternalEObject)newExpandsTo).eInverseAdd(this, ProcessPackage.COMPOSITE_PROCESS__COLLAPSES_TO, CompositeProcess.class, msgs);
			msgs = basicSetExpandsTo(newExpandsTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.SIMPLE_PROCESS__EXPANDS_TO, newExpandsTo, newExpandsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ProcessPackage.SIMPLE_PROCESS__REALIZED_BY:
				if (realizedBy != null)
					msgs = ((InternalEObject)realizedBy).eInverseRemove(this, ProcessPackage.ATOMIC_PROCESS__REALIZES, AtomicProcess.class, msgs);
				return basicSetRealizedBy((AtomicProcess)otherEnd, msgs);
			case ProcessPackage.SIMPLE_PROCESS__EXPANDS_TO:
				if (expandsTo != null)
					msgs = ((InternalEObject)expandsTo).eInverseRemove(this, ProcessPackage.COMPOSITE_PROCESS__COLLAPSES_TO, CompositeProcess.class, msgs);
				return basicSetExpandsTo((CompositeProcess)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case ProcessPackage.SIMPLE_PROCESS__REALIZED_BY:
				return basicSetRealizedBy(null, msgs);
			case ProcessPackage.SIMPLE_PROCESS__EXPANDS_TO:
				return basicSetExpandsTo(null, msgs);
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
			case ProcessPackage.SIMPLE_PROCESS__REALIZED_BY:
				if (resolve) return getRealizedBy();
				return basicGetRealizedBy();
			case ProcessPackage.SIMPLE_PROCESS__EXPANDS_TO:
				if (resolve) return getExpandsTo();
				return basicGetExpandsTo();
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
			case ProcessPackage.SIMPLE_PROCESS__REALIZED_BY:
				setRealizedBy((AtomicProcess)newValue);
				return;
			case ProcessPackage.SIMPLE_PROCESS__EXPANDS_TO:
				setExpandsTo((CompositeProcess)newValue);
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
			case ProcessPackage.SIMPLE_PROCESS__REALIZED_BY:
				setRealizedBy((AtomicProcess)null);
				return;
			case ProcessPackage.SIMPLE_PROCESS__EXPANDS_TO:
				setExpandsTo((CompositeProcess)null);
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
			case ProcessPackage.SIMPLE_PROCESS__REALIZED_BY:
				return realizedBy != null;
			case ProcessPackage.SIMPLE_PROCESS__EXPANDS_TO:
				return expandsTo != null;
		}
		return super.eIsSet(featureID);
	}

} //SimpleProcessImpl
