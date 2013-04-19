/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics.impl;

import java.util.Collection;

import net.sf.ictalive.service.semantics.IOEP;
import net.sf.ictalive.service.semantics.SemanticsPackage;
import net.sf.ictalive.service.semantics.ServiceCondition;
import net.sf.ictalive.service.semantics.ServiceInput;
import net.sf.ictalive.service.semantics.ServiceOutput;
import net.sf.ictalive.service.semantics.ServiceResult;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IOEP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.semantics.impl.IOEPImpl#getHasInput <em>Has Input</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.impl.IOEPImpl#getHasCondition <em>Has Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.impl.IOEPImpl#getHasOutput <em>Has Output</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.impl.IOEPImpl#getHasResult <em>Has Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IOEPImpl extends EObjectImpl implements IOEP {
	/**
	 * The cached value of the '{@link #getHasInput() <em>Has Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInput()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInput> hasInput;

	/**
	 * The cached value of the '{@link #getHasCondition() <em>Has Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceCondition> hasCondition;

	/**
	 * The cached value of the '{@link #getHasOutput() <em>Has Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceOutput> hasOutput;

	/**
	 * The cached value of the '{@link #getHasResult() <em>Has Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResult()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceResult> hasResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IOEPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticsPackage.Literals.IOEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceInput> getHasInput() {
		if (hasInput == null) {
			hasInput = new EObjectContainmentEList<ServiceInput>(ServiceInput.class, this, SemanticsPackage.IOEP__HAS_INPUT);
		}
		return hasInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceCondition> getHasCondition() {
		if (hasCondition == null) {
			hasCondition = new EObjectContainmentEList<ServiceCondition>(ServiceCondition.class, this, SemanticsPackage.IOEP__HAS_CONDITION);
		}
		return hasCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceOutput> getHasOutput() {
		if (hasOutput == null) {
			hasOutput = new EObjectContainmentEList<ServiceOutput>(ServiceOutput.class, this, SemanticsPackage.IOEP__HAS_OUTPUT);
		}
		return hasOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceResult> getHasResult() {
		if (hasResult == null) {
			hasResult = new EObjectContainmentEList<ServiceResult>(ServiceResult.class, this, SemanticsPackage.IOEP__HAS_RESULT);
		}
		return hasResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SemanticsPackage.IOEP__HAS_INPUT:
				return ((InternalEList<?>)getHasInput()).basicRemove(otherEnd, msgs);
			case SemanticsPackage.IOEP__HAS_CONDITION:
				return ((InternalEList<?>)getHasCondition()).basicRemove(otherEnd, msgs);
			case SemanticsPackage.IOEP__HAS_OUTPUT:
				return ((InternalEList<?>)getHasOutput()).basicRemove(otherEnd, msgs);
			case SemanticsPackage.IOEP__HAS_RESULT:
				return ((InternalEList<?>)getHasResult()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SemanticsPackage.IOEP__HAS_INPUT:
				return getHasInput();
			case SemanticsPackage.IOEP__HAS_CONDITION:
				return getHasCondition();
			case SemanticsPackage.IOEP__HAS_OUTPUT:
				return getHasOutput();
			case SemanticsPackage.IOEP__HAS_RESULT:
				return getHasResult();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SemanticsPackage.IOEP__HAS_INPUT:
				getHasInput().clear();
				getHasInput().addAll((Collection<? extends ServiceInput>)newValue);
				return;
			case SemanticsPackage.IOEP__HAS_CONDITION:
				getHasCondition().clear();
				getHasCondition().addAll((Collection<? extends ServiceCondition>)newValue);
				return;
			case SemanticsPackage.IOEP__HAS_OUTPUT:
				getHasOutput().clear();
				getHasOutput().addAll((Collection<? extends ServiceOutput>)newValue);
				return;
			case SemanticsPackage.IOEP__HAS_RESULT:
				getHasResult().clear();
				getHasResult().addAll((Collection<? extends ServiceResult>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SemanticsPackage.IOEP__HAS_INPUT:
				getHasInput().clear();
				return;
			case SemanticsPackage.IOEP__HAS_CONDITION:
				getHasCondition().clear();
				return;
			case SemanticsPackage.IOEP__HAS_OUTPUT:
				getHasOutput().clear();
				return;
			case SemanticsPackage.IOEP__HAS_RESULT:
				getHasResult().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SemanticsPackage.IOEP__HAS_INPUT:
				return hasInput != null && !hasInput.isEmpty();
			case SemanticsPackage.IOEP__HAS_CONDITION:
				return hasCondition != null && !hasCondition.isEmpty();
			case SemanticsPackage.IOEP__HAS_OUTPUT:
				return hasOutput != null && !hasOutput.isEmpty();
			case SemanticsPackage.IOEP__HAS_RESULT:
				return hasResult != null && !hasResult.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IOEPImpl
