/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process.impl;

import net.sf.ictalive.owls.process.Parameter;
import net.sf.ictalive.owls.process.Perform;
import net.sf.ictalive.owls.process.ProcessPackage;
import net.sf.ictalive.owls.process.ValueOf;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.process.impl.ValueOfImpl#getTheVar <em>The Var</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.ValueOfImpl#getFromProcess <em>From Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueOfImpl extends EObjectImpl implements ValueOf
{
	/**
	 * The cached value of the '{@link #getTheVar() <em>The Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheVar()
	 * @generated
	 * @ordered
	 */
	protected Parameter theVar;

	/**
	 * The cached value of the '{@link #getFromProcess() <em>From Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromProcess()
	 * @generated
	 * @ordered
	 */
	protected Perform fromProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueOfImpl()
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
		return ProcessPackage.Literals.VALUE_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getTheVar()
	{
		if (theVar != null && theVar.eIsProxy())
		{
			InternalEObject oldTheVar = (InternalEObject)theVar;
			theVar = (Parameter)eResolveProxy(oldTheVar);
			if (theVar != oldTheVar)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.VALUE_OF__THE_VAR, oldTheVar, theVar));
			}
		}
		return theVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetTheVar()
	{
		return theVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheVar(Parameter newTheVar)
	{
		Parameter oldTheVar = theVar;
		theVar = newTheVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.VALUE_OF__THE_VAR, oldTheVar, theVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Perform getFromProcess()
	{
		if (fromProcess != null && fromProcess.eIsProxy())
		{
			InternalEObject oldFromProcess = (InternalEObject)fromProcess;
			fromProcess = (Perform)eResolveProxy(oldFromProcess);
			if (fromProcess != oldFromProcess)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.VALUE_OF__FROM_PROCESS, oldFromProcess, fromProcess));
			}
		}
		return fromProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Perform basicGetFromProcess()
	{
		return fromProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromProcess(Perform newFromProcess)
	{
		Perform oldFromProcess = fromProcess;
		fromProcess = newFromProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.VALUE_OF__FROM_PROCESS, oldFromProcess, fromProcess));
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
			case ProcessPackage.VALUE_OF__THE_VAR:
				if (resolve) return getTheVar();
				return basicGetTheVar();
			case ProcessPackage.VALUE_OF__FROM_PROCESS:
				if (resolve) return getFromProcess();
				return basicGetFromProcess();
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
			case ProcessPackage.VALUE_OF__THE_VAR:
				setTheVar((Parameter)newValue);
				return;
			case ProcessPackage.VALUE_OF__FROM_PROCESS:
				setFromProcess((Perform)newValue);
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
			case ProcessPackage.VALUE_OF__THE_VAR:
				setTheVar((Parameter)null);
				return;
			case ProcessPackage.VALUE_OF__FROM_PROCESS:
				setFromProcess((Perform)null);
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
			case ProcessPackage.VALUE_OF__THE_VAR:
				return theVar != null;
			case ProcessPackage.VALUE_OF__FROM_PROCESS:
				return fromProcess != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueOfImpl
