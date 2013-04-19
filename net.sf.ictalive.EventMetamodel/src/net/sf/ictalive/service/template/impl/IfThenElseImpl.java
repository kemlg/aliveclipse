/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template.impl;

import net.sf.ictalive.service.template.ControlConstruct;
import net.sf.ictalive.service.template.IfThenElse;
import net.sf.ictalive.service.template.TemplatePackage;

import net.sf.ictalive.swrl.Antecedent;

import org.eclipse.emf.common.notify.Notification;

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
 *   <li>{@link net.sf.ictalive.service.template.impl.IfThenElseImpl#getIfCondition <em>If Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.impl.IfThenElseImpl#getThen <em>Then</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.impl.IfThenElseImpl#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfThenElseImpl extends ControlConstructImpl implements IfThenElse
{
	/**
	 * The cached value of the '{@link #getIfCondition() <em>If Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfCondition()
	 * @generated
	 * @ordered
	 */
	protected Antecedent ifCondition;

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
		return TemplatePackage.Literals.IF_THEN_ELSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Antecedent getIfCondition()
	{
		if (ifCondition != null && ifCondition.eIsProxy())
		{
			InternalEObject oldIfCondition = (InternalEObject)ifCondition;
			ifCondition = (Antecedent)eResolveProxy(oldIfCondition);
			if (ifCondition != oldIfCondition)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.IF_THEN_ELSE__IF_CONDITION, oldIfCondition, ifCondition));
			}
		}
		return ifCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Antecedent basicGetIfCondition()
	{
		return ifCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfCondition(Antecedent newIfCondition)
	{
		Antecedent oldIfCondition = ifCondition;
		ifCondition = newIfCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.IF_THEN_ELSE__IF_CONDITION, oldIfCondition, ifCondition));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.IF_THEN_ELSE__THEN, oldThen, then));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.IF_THEN_ELSE__THEN, oldThen, then));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.IF_THEN_ELSE__ELSE, oldElse, else_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.IF_THEN_ELSE__ELSE, oldElse, else_));
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
			case TemplatePackage.IF_THEN_ELSE__IF_CONDITION:
				if (resolve) return getIfCondition();
				return basicGetIfCondition();
			case TemplatePackage.IF_THEN_ELSE__THEN:
				if (resolve) return getThen();
				return basicGetThen();
			case TemplatePackage.IF_THEN_ELSE__ELSE:
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
			case TemplatePackage.IF_THEN_ELSE__IF_CONDITION:
				setIfCondition((Antecedent)newValue);
				return;
			case TemplatePackage.IF_THEN_ELSE__THEN:
				setThen((ControlConstruct)newValue);
				return;
			case TemplatePackage.IF_THEN_ELSE__ELSE:
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
			case TemplatePackage.IF_THEN_ELSE__IF_CONDITION:
				setIfCondition((Antecedent)null);
				return;
			case TemplatePackage.IF_THEN_ELSE__THEN:
				setThen((ControlConstruct)null);
				return;
			case TemplatePackage.IF_THEN_ELSE__ELSE:
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
			case TemplatePackage.IF_THEN_ELSE__IF_CONDITION:
				return ifCondition != null;
			case TemplatePackage.IF_THEN_ELSE__THEN:
				return then != null;
			case TemplatePackage.IF_THEN_ELSE__ELSE:
				return else_ != null;
		}
		return super.eIsSet(featureID);
	}

} //IfThenElseImpl
