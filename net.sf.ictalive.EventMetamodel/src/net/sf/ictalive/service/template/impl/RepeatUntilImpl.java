/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template.impl;

import net.sf.ictalive.service.template.ControlConstruct;
import net.sf.ictalive.service.template.RepeatUntil;
import net.sf.ictalive.service.template.TemplatePackage;

import net.sf.ictalive.swrl.Antecedent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat Until</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.template.impl.RepeatUntilImpl#getUntilCondition <em>Until Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.impl.RepeatUntilImpl#getUntilProcess <em>Until Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepeatUntilImpl extends IterateImpl implements RepeatUntil
{
	/**
	 * The cached value of the '{@link #getUntilCondition() <em>Until Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilCondition()
	 * @generated
	 * @ordered
	 */
	protected Antecedent untilCondition;

	/**
	 * The cached value of the '{@link #getUntilProcess() <em>Until Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilProcess()
	 * @generated
	 * @ordered
	 */
	protected ControlConstruct untilProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatUntilImpl()
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
		return TemplatePackage.Literals.REPEAT_UNTIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Antecedent getUntilCondition()
	{
		if (untilCondition != null && untilCondition.eIsProxy())
		{
			InternalEObject oldUntilCondition = (InternalEObject)untilCondition;
			untilCondition = (Antecedent)eResolveProxy(oldUntilCondition);
			if (untilCondition != oldUntilCondition)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.REPEAT_UNTIL__UNTIL_CONDITION, oldUntilCondition, untilCondition));
			}
		}
		return untilCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Antecedent basicGetUntilCondition()
	{
		return untilCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUntilCondition(Antecedent newUntilCondition)
	{
		Antecedent oldUntilCondition = untilCondition;
		untilCondition = newUntilCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.REPEAT_UNTIL__UNTIL_CONDITION, oldUntilCondition, untilCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstruct getUntilProcess()
	{
		if (untilProcess != null && untilProcess.eIsProxy())
		{
			InternalEObject oldUntilProcess = (InternalEObject)untilProcess;
			untilProcess = (ControlConstruct)eResolveProxy(oldUntilProcess);
			if (untilProcess != oldUntilProcess)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.REPEAT_UNTIL__UNTIL_PROCESS, oldUntilProcess, untilProcess));
			}
		}
		return untilProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstruct basicGetUntilProcess()
	{
		return untilProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUntilProcess(ControlConstruct newUntilProcess)
	{
		ControlConstruct oldUntilProcess = untilProcess;
		untilProcess = newUntilProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.REPEAT_UNTIL__UNTIL_PROCESS, oldUntilProcess, untilProcess));
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
			case TemplatePackage.REPEAT_UNTIL__UNTIL_CONDITION:
				if (resolve) return getUntilCondition();
				return basicGetUntilCondition();
			case TemplatePackage.REPEAT_UNTIL__UNTIL_PROCESS:
				if (resolve) return getUntilProcess();
				return basicGetUntilProcess();
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
			case TemplatePackage.REPEAT_UNTIL__UNTIL_CONDITION:
				setUntilCondition((Antecedent)newValue);
				return;
			case TemplatePackage.REPEAT_UNTIL__UNTIL_PROCESS:
				setUntilProcess((ControlConstruct)newValue);
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
			case TemplatePackage.REPEAT_UNTIL__UNTIL_CONDITION:
				setUntilCondition((Antecedent)null);
				return;
			case TemplatePackage.REPEAT_UNTIL__UNTIL_PROCESS:
				setUntilProcess((ControlConstruct)null);
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
			case TemplatePackage.REPEAT_UNTIL__UNTIL_CONDITION:
				return untilCondition != null;
			case TemplatePackage.REPEAT_UNTIL__UNTIL_PROCESS:
				return untilProcess != null;
		}
		return super.eIsSet(featureID);
	}

} //RepeatUntilImpl
