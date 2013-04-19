/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.actions.impl;

import net.sf.ictalive.coordination.actions.ActionsPackage;
import net.sf.ictalive.coordination.actions.CompositeAction;

import net.sf.ictalive.owls.process.CompositeProcess;
import net.sf.ictalive.owls.process.ControlConstruct;
import net.sf.ictalive.owls.process.ProcessPackage;
import net.sf.ictalive.owls.process.SimpleProcess;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.CompositeActionImpl#getCollapsesTo <em>Collapses To</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.CompositeActionImpl#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.CompositeActionImpl#isInvocable <em>Invocable</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.CompositeActionImpl#getComputedInput <em>Computed Input</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.CompositeActionImpl#getComputedOutput <em>Computed Output</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.CompositeActionImpl#getComputedPrecondition <em>Computed Precondition</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.impl.CompositeActionImpl#getComputedEffect <em>Computed Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeActionImpl extends ActionImpl implements CompositeAction
{
	/**
	 * The cached value of the '{@link #getCollapsesTo() <em>Collapses To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollapsesTo()
	 * @generated
	 * @ordered
	 */
	protected SimpleProcess collapsesTo;

	/**
	 * The cached value of the '{@link #getComposedOf() <em>Composed Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedOf()
	 * @generated
	 * @ordered
	 */
	protected ControlConstruct composedOf;

	/**
	 * The default value of the '{@link #isInvocable() <em>Invocable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvocable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVOCABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInvocable() <em>Invocable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvocable()
	 * @generated
	 * @ordered
	 */
	protected boolean invocable = INVOCABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComputedInput() <em>Computed Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputedInput()
	 * @generated
	 * @ordered
	 */
	protected EObject computedInput;

	/**
	 * The cached value of the '{@link #getComputedOutput() <em>Computed Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputedOutput()
	 * @generated
	 * @ordered
	 */
	protected EObject computedOutput;

	/**
	 * The cached value of the '{@link #getComputedPrecondition() <em>Computed Precondition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputedPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EObject computedPrecondition;

	/**
	 * The cached value of the '{@link #getComputedEffect() <em>Computed Effect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputedEffect()
	 * @generated
	 * @ordered
	 */
	protected EObject computedEffect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeActionImpl()
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
		return ActionsPackage.Literals.COMPOSITE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleProcess getCollapsesTo()
	{
		if (collapsesTo != null && collapsesTo.eIsProxy())
		{
			InternalEObject oldCollapsesTo = (InternalEObject)collapsesTo;
			collapsesTo = (SimpleProcess)eResolveProxy(oldCollapsesTo);
			if (collapsesTo != oldCollapsesTo)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionsPackage.COMPOSITE_ACTION__COLLAPSES_TO, oldCollapsesTo, collapsesTo));
			}
		}
		return collapsesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleProcess basicGetCollapsesTo()
	{
		return collapsesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollapsesTo(SimpleProcess newCollapsesTo, NotificationChain msgs)
	{
		SimpleProcess oldCollapsesTo = collapsesTo;
		collapsesTo = newCollapsesTo;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionsPackage.COMPOSITE_ACTION__COLLAPSES_TO, oldCollapsesTo, newCollapsesTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollapsesTo(SimpleProcess newCollapsesTo)
	{
		if (newCollapsesTo != collapsesTo)
		{
			NotificationChain msgs = null;
			if (collapsesTo != null)
				msgs = ((InternalEObject)collapsesTo).eInverseRemove(this, ProcessPackage.SIMPLE_PROCESS__EXPANDS_TO, SimpleProcess.class, msgs);
			if (newCollapsesTo != null)
				msgs = ((InternalEObject)newCollapsesTo).eInverseAdd(this, ProcessPackage.SIMPLE_PROCESS__EXPANDS_TO, SimpleProcess.class, msgs);
			msgs = basicSetCollapsesTo(newCollapsesTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.COMPOSITE_ACTION__COLLAPSES_TO, newCollapsesTo, newCollapsesTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstruct getComposedOf()
	{
		if (composedOf != null && composedOf.eIsProxy())
		{
			InternalEObject oldComposedOf = (InternalEObject)composedOf;
			composedOf = (ControlConstruct)eResolveProxy(oldComposedOf);
			if (composedOf != oldComposedOf)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionsPackage.COMPOSITE_ACTION__COMPOSED_OF, oldComposedOf, composedOf));
			}
		}
		return composedOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstruct basicGetComposedOf()
	{
		return composedOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposedOf(ControlConstruct newComposedOf)
	{
		ControlConstruct oldComposedOf = composedOf;
		composedOf = newComposedOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.COMPOSITE_ACTION__COMPOSED_OF, oldComposedOf, composedOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInvocable()
	{
		return invocable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvocable(boolean newInvocable)
	{
		boolean oldInvocable = invocable;
		invocable = newInvocable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.COMPOSITE_ACTION__INVOCABLE, oldInvocable, invocable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getComputedInput()
	{
		if (computedInput != null && computedInput.eIsProxy())
		{
			InternalEObject oldComputedInput = (InternalEObject)computedInput;
			computedInput = eResolveProxy(oldComputedInput);
			if (computedInput != oldComputedInput)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionsPackage.COMPOSITE_ACTION__COMPUTED_INPUT, oldComputedInput, computedInput));
			}
		}
		return computedInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetComputedInput()
	{
		return computedInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputedInput(EObject newComputedInput)
	{
		EObject oldComputedInput = computedInput;
		computedInput = newComputedInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.COMPOSITE_ACTION__COMPUTED_INPUT, oldComputedInput, computedInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getComputedOutput()
	{
		if (computedOutput != null && computedOutput.eIsProxy())
		{
			InternalEObject oldComputedOutput = (InternalEObject)computedOutput;
			computedOutput = eResolveProxy(oldComputedOutput);
			if (computedOutput != oldComputedOutput)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionsPackage.COMPOSITE_ACTION__COMPUTED_OUTPUT, oldComputedOutput, computedOutput));
			}
		}
		return computedOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetComputedOutput()
	{
		return computedOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputedOutput(EObject newComputedOutput)
	{
		EObject oldComputedOutput = computedOutput;
		computedOutput = newComputedOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.COMPOSITE_ACTION__COMPUTED_OUTPUT, oldComputedOutput, computedOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getComputedPrecondition()
	{
		if (computedPrecondition != null && computedPrecondition.eIsProxy())
		{
			InternalEObject oldComputedPrecondition = (InternalEObject)computedPrecondition;
			computedPrecondition = eResolveProxy(oldComputedPrecondition);
			if (computedPrecondition != oldComputedPrecondition)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionsPackage.COMPOSITE_ACTION__COMPUTED_PRECONDITION, oldComputedPrecondition, computedPrecondition));
			}
		}
		return computedPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetComputedPrecondition()
	{
		return computedPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputedPrecondition(EObject newComputedPrecondition)
	{
		EObject oldComputedPrecondition = computedPrecondition;
		computedPrecondition = newComputedPrecondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.COMPOSITE_ACTION__COMPUTED_PRECONDITION, oldComputedPrecondition, computedPrecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getComputedEffect()
	{
		if (computedEffect != null && computedEffect.eIsProxy())
		{
			InternalEObject oldComputedEffect = (InternalEObject)computedEffect;
			computedEffect = eResolveProxy(oldComputedEffect);
			if (computedEffect != oldComputedEffect)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionsPackage.COMPOSITE_ACTION__COMPUTED_EFFECT, oldComputedEffect, computedEffect));
			}
		}
		return computedEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetComputedEffect()
	{
		return computedEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputedEffect(EObject newComputedEffect)
	{
		EObject oldComputedEffect = computedEffect;
		computedEffect = newComputedEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.COMPOSITE_ACTION__COMPUTED_EFFECT, oldComputedEffect, computedEffect));
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
			case ActionsPackage.COMPOSITE_ACTION__COLLAPSES_TO:
				if (collapsesTo != null)
					msgs = ((InternalEObject)collapsesTo).eInverseRemove(this, ProcessPackage.SIMPLE_PROCESS__EXPANDS_TO, SimpleProcess.class, msgs);
				return basicSetCollapsesTo((SimpleProcess)otherEnd, msgs);
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
			case ActionsPackage.COMPOSITE_ACTION__COLLAPSES_TO:
				return basicSetCollapsesTo(null, msgs);
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
			case ActionsPackage.COMPOSITE_ACTION__COLLAPSES_TO:
				if (resolve) return getCollapsesTo();
				return basicGetCollapsesTo();
			case ActionsPackage.COMPOSITE_ACTION__COMPOSED_OF:
				if (resolve) return getComposedOf();
				return basicGetComposedOf();
			case ActionsPackage.COMPOSITE_ACTION__INVOCABLE:
				return isInvocable() ? Boolean.TRUE : Boolean.FALSE;
			case ActionsPackage.COMPOSITE_ACTION__COMPUTED_INPUT:
				if (resolve) return getComputedInput();
				return basicGetComputedInput();
			case ActionsPackage.COMPOSITE_ACTION__COMPUTED_OUTPUT:
				if (resolve) return getComputedOutput();
				return basicGetComputedOutput();
			case ActionsPackage.COMPOSITE_ACTION__COMPUTED_PRECONDITION:
				if (resolve) return getComputedPrecondition();
				return basicGetComputedPrecondition();
			case ActionsPackage.COMPOSITE_ACTION__COMPUTED_EFFECT:
				if (resolve) return getComputedEffect();
				return basicGetComputedEffect();
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
			case ActionsPackage.COMPOSITE_ACTION__COLLAPSES_TO:
				setCollapsesTo((SimpleProcess)newValue);
				return;
			case ActionsPackage.COMPOSITE_ACTION__COMPOSED_OF:
				setComposedOf((ControlConstruct)newValue);
				return;
			case ActionsPackage.COMPOSITE_ACTION__INVOCABLE:
				setInvocable(((Boolean)newValue).booleanValue());
				return;
			case ActionsPackage.COMPOSITE_ACTION__COMPUTED_INPUT:
				setComputedInput((EObject)newValue);
				return;
			case ActionsPackage.COMPOSITE_ACTION__COMPUTED_OUTPUT:
				setComputedOutput((EObject)newValue);
				return;
			case ActionsPackage.COMPOSITE_ACTION__COMPUTED_PRECONDITION:
				setComputedPrecondition((EObject)newValue);
				return;
			case ActionsPackage.COMPOSITE_ACTION__COMPUTED_EFFECT:
				setComputedEffect((EObject)newValue);
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
			case ActionsPackage.COMPOSITE_ACTION__COLLAPSES_TO:
				setCollapsesTo((SimpleProcess)null);
				return;
			case ActionsPackage.COMPOSITE_ACTION__COMPOSED_OF:
				setComposedOf((ControlConstruct)null);
				return;
			case ActionsPackage.COMPOSITE_ACTION__INVOCABLE:
				setInvocable(INVOCABLE_EDEFAULT);
				return;
			case ActionsPackage.COMPOSITE_ACTION__COMPUTED_INPUT:
				setComputedInput((EObject)null);
				return;
			case ActionsPackage.COMPOSITE_ACTION__COMPUTED_OUTPUT:
				setComputedOutput((EObject)null);
				return;
			case ActionsPackage.COMPOSITE_ACTION__COMPUTED_PRECONDITION:
				setComputedPrecondition((EObject)null);
				return;
			case ActionsPackage.COMPOSITE_ACTION__COMPUTED_EFFECT:
				setComputedEffect((EObject)null);
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
			case ActionsPackage.COMPOSITE_ACTION__COLLAPSES_TO:
				return collapsesTo != null;
			case ActionsPackage.COMPOSITE_ACTION__COMPOSED_OF:
				return composedOf != null;
			case ActionsPackage.COMPOSITE_ACTION__INVOCABLE:
				return invocable != INVOCABLE_EDEFAULT;
			case ActionsPackage.COMPOSITE_ACTION__COMPUTED_INPUT:
				return computedInput != null;
			case ActionsPackage.COMPOSITE_ACTION__COMPUTED_OUTPUT:
				return computedOutput != null;
			case ActionsPackage.COMPOSITE_ACTION__COMPUTED_PRECONDITION:
				return computedPrecondition != null;
			case ActionsPackage.COMPOSITE_ACTION__COMPUTED_EFFECT:
				return computedEffect != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == CompositeProcess.class)
		{
			switch (derivedFeatureID)
			{
				case ActionsPackage.COMPOSITE_ACTION__COLLAPSES_TO: return ProcessPackage.COMPOSITE_PROCESS__COLLAPSES_TO;
				case ActionsPackage.COMPOSITE_ACTION__COMPOSED_OF: return ProcessPackage.COMPOSITE_PROCESS__COMPOSED_OF;
				case ActionsPackage.COMPOSITE_ACTION__INVOCABLE: return ProcessPackage.COMPOSITE_PROCESS__INVOCABLE;
				case ActionsPackage.COMPOSITE_ACTION__COMPUTED_INPUT: return ProcessPackage.COMPOSITE_PROCESS__COMPUTED_INPUT;
				case ActionsPackage.COMPOSITE_ACTION__COMPUTED_OUTPUT: return ProcessPackage.COMPOSITE_PROCESS__COMPUTED_OUTPUT;
				case ActionsPackage.COMPOSITE_ACTION__COMPUTED_PRECONDITION: return ProcessPackage.COMPOSITE_PROCESS__COMPUTED_PRECONDITION;
				case ActionsPackage.COMPOSITE_ACTION__COMPUTED_EFFECT: return ProcessPackage.COMPOSITE_PROCESS__COMPUTED_EFFECT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == CompositeProcess.class)
		{
			switch (baseFeatureID)
			{
				case ProcessPackage.COMPOSITE_PROCESS__COLLAPSES_TO: return ActionsPackage.COMPOSITE_ACTION__COLLAPSES_TO;
				case ProcessPackage.COMPOSITE_PROCESS__COMPOSED_OF: return ActionsPackage.COMPOSITE_ACTION__COMPOSED_OF;
				case ProcessPackage.COMPOSITE_PROCESS__INVOCABLE: return ActionsPackage.COMPOSITE_ACTION__INVOCABLE;
				case ProcessPackage.COMPOSITE_PROCESS__COMPUTED_INPUT: return ActionsPackage.COMPOSITE_ACTION__COMPUTED_INPUT;
				case ProcessPackage.COMPOSITE_PROCESS__COMPUTED_OUTPUT: return ActionsPackage.COMPOSITE_ACTION__COMPUTED_OUTPUT;
				case ProcessPackage.COMPOSITE_PROCESS__COMPUTED_PRECONDITION: return ActionsPackage.COMPOSITE_ACTION__COMPUTED_PRECONDITION;
				case ProcessPackage.COMPOSITE_PROCESS__COMPUTED_EFFECT: return ActionsPackage.COMPOSITE_ACTION__COMPUTED_EFFECT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (invocable: ");
		result.append(invocable);
		result.append(')');
		return result.toString();
	}

} //CompositeActionImpl
