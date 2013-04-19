/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process.impl;

import java.util.Collection;

import net.sf.ictalive.owls.expr.Condition;
import net.sf.ictalive.owls.expr.Expression;

import net.sf.ictalive.owls.process.OutputBinding;
import net.sf.ictalive.owls.process.ProcessPackage;
import net.sf.ictalive.owls.process.Result;
import net.sf.ictalive.owls.process.ResultVar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.process.impl.ResultImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.ResultImpl#getHasResultVar <em>Has Result Var</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.ResultImpl#getInCondition <em>In Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.ResultImpl#getHasEffect <em>Has Effect</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.impl.ResultImpl#getWithOutput <em>With Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultImpl extends EObjectImpl implements Result
{
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
	 * The cached value of the '{@link #getHasResultVar() <em>Has Result Var</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResultVar()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultVar> hasResultVar;

	/**
	 * The cached value of the '{@link #getInCondition() <em>In Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition inCondition;

	/**
	 * The cached value of the '{@link #getHasEffect() <em>Has Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEffect()
	 * @generated
	 * @ordered
	 */
	protected Expression hasEffect;

	/**
	 * The cached value of the '{@link #getWithOutput() <em>With Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithOutput()
	 * @generated
	 * @ordered
	 */
	protected OutputBinding withOutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultImpl()
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
		return ProcessPackage.Literals.RESULT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.RESULT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultVar> getHasResultVar()
	{
		if (hasResultVar == null)
		{
			hasResultVar = new EObjectContainmentEList<ResultVar>(ResultVar.class, this, ProcessPackage.RESULT__HAS_RESULT_VAR);
		}
		return hasResultVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getInCondition()
	{
		if (inCondition != null && inCondition.eIsProxy())
		{
			InternalEObject oldInCondition = (InternalEObject)inCondition;
			inCondition = (Condition)eResolveProxy(oldInCondition);
			if (inCondition != oldInCondition)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.RESULT__IN_CONDITION, oldInCondition, inCondition));
			}
		}
		return inCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition basicGetInCondition()
	{
		return inCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInCondition(Condition newInCondition)
	{
		Condition oldInCondition = inCondition;
		inCondition = newInCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.RESULT__IN_CONDITION, oldInCondition, inCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getHasEffect()
	{
		return hasEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasEffect(Expression newHasEffect, NotificationChain msgs)
	{
		Expression oldHasEffect = hasEffect;
		hasEffect = newHasEffect;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.RESULT__HAS_EFFECT, oldHasEffect, newHasEffect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasEffect(Expression newHasEffect)
	{
		if (newHasEffect != hasEffect)
		{
			NotificationChain msgs = null;
			if (hasEffect != null)
				msgs = ((InternalEObject)hasEffect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.RESULT__HAS_EFFECT, null, msgs);
			if (newHasEffect != null)
				msgs = ((InternalEObject)newHasEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.RESULT__HAS_EFFECT, null, msgs);
			msgs = basicSetHasEffect(newHasEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.RESULT__HAS_EFFECT, newHasEffect, newHasEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputBinding getWithOutput()
	{
		return withOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWithOutput(OutputBinding newWithOutput, NotificationChain msgs)
	{
		OutputBinding oldWithOutput = withOutput;
		withOutput = newWithOutput;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.RESULT__WITH_OUTPUT, oldWithOutput, newWithOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithOutput(OutputBinding newWithOutput)
	{
		if (newWithOutput != withOutput)
		{
			NotificationChain msgs = null;
			if (withOutput != null)
				msgs = ((InternalEObject)withOutput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.RESULT__WITH_OUTPUT, null, msgs);
			if (newWithOutput != null)
				msgs = ((InternalEObject)newWithOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.RESULT__WITH_OUTPUT, null, msgs);
			msgs = basicSetWithOutput(newWithOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.RESULT__WITH_OUTPUT, newWithOutput, newWithOutput));
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
			case ProcessPackage.RESULT__HAS_RESULT_VAR:
				return ((InternalEList<?>)getHasResultVar()).basicRemove(otherEnd, msgs);
			case ProcessPackage.RESULT__HAS_EFFECT:
				return basicSetHasEffect(null, msgs);
			case ProcessPackage.RESULT__WITH_OUTPUT:
				return basicSetWithOutput(null, msgs);
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
			case ProcessPackage.RESULT__NAME:
				return getName();
			case ProcessPackage.RESULT__HAS_RESULT_VAR:
				return getHasResultVar();
			case ProcessPackage.RESULT__IN_CONDITION:
				if (resolve) return getInCondition();
				return basicGetInCondition();
			case ProcessPackage.RESULT__HAS_EFFECT:
				return getHasEffect();
			case ProcessPackage.RESULT__WITH_OUTPUT:
				return getWithOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ProcessPackage.RESULT__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.RESULT__HAS_RESULT_VAR:
				getHasResultVar().clear();
				getHasResultVar().addAll((Collection<? extends ResultVar>)newValue);
				return;
			case ProcessPackage.RESULT__IN_CONDITION:
				setInCondition((Condition)newValue);
				return;
			case ProcessPackage.RESULT__HAS_EFFECT:
				setHasEffect((Expression)newValue);
				return;
			case ProcessPackage.RESULT__WITH_OUTPUT:
				setWithOutput((OutputBinding)newValue);
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
			case ProcessPackage.RESULT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.RESULT__HAS_RESULT_VAR:
				getHasResultVar().clear();
				return;
			case ProcessPackage.RESULT__IN_CONDITION:
				setInCondition((Condition)null);
				return;
			case ProcessPackage.RESULT__HAS_EFFECT:
				setHasEffect((Expression)null);
				return;
			case ProcessPackage.RESULT__WITH_OUTPUT:
				setWithOutput((OutputBinding)null);
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
			case ProcessPackage.RESULT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.RESULT__HAS_RESULT_VAR:
				return hasResultVar != null && !hasResultVar.isEmpty();
			case ProcessPackage.RESULT__IN_CONDITION:
				return inCondition != null;
			case ProcessPackage.RESULT__HAS_EFFECT:
				return hasEffect != null;
			case ProcessPackage.RESULT__WITH_OUTPUT:
				return withOutput != null;
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

} //ResultImpl
