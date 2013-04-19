/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.impl;

import control.AbstractProcess;
import control.ControlPackage;
import control.Input;
import control.Output;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link control.impl.AbstractProcessImpl#getHasInput <em>Has Input</em>}</li>
 *   <li>{@link control.impl.AbstractProcessImpl#getHasOutput <em>Has Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractProcessImpl extends NamedElementImpl implements AbstractProcess
{
  /**
	 * The cached value of the '{@link #getHasInput() <em>Has Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHasInput()
	 * @generated
	 * @ordered
	 */
  protected EList<Input> hasInput;

  /**
	 * The cached value of the '{@link #getHasOutput() <em>Has Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHasOutput()
	 * @generated
	 * @ordered
	 */
  protected EList<Output> hasOutput;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AbstractProcessImpl()
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
		return ControlPackage.Literals.ABSTRACT_PROCESS;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Input> getHasInput()
  {
		if (hasInput == null) {
			hasInput = new EObjectContainmentEList<Input>(Input.class, this, ControlPackage.ABSTRACT_PROCESS__HAS_INPUT);
		}
		return hasInput;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Output> getHasOutput()
  {
		if (hasOutput == null) {
			hasOutput = new EObjectContainmentEList<Output>(Output.class, this, ControlPackage.ABSTRACT_PROCESS__HAS_OUTPUT);
		}
		return hasOutput;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ControlPackage.ABSTRACT_PROCESS__HAS_INPUT:
				return ((InternalEList<?>)getHasInput()).basicRemove(otherEnd, msgs);
			case ControlPackage.ABSTRACT_PROCESS__HAS_OUTPUT:
				return ((InternalEList<?>)getHasOutput()).basicRemove(otherEnd, msgs);
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
		switch (featureID) {
			case ControlPackage.ABSTRACT_PROCESS__HAS_INPUT:
				return getHasInput();
			case ControlPackage.ABSTRACT_PROCESS__HAS_OUTPUT:
				return getHasOutput();
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
		switch (featureID) {
			case ControlPackage.ABSTRACT_PROCESS__HAS_INPUT:
				getHasInput().clear();
				getHasInput().addAll((Collection<? extends Input>)newValue);
				return;
			case ControlPackage.ABSTRACT_PROCESS__HAS_OUTPUT:
				getHasOutput().clear();
				getHasOutput().addAll((Collection<? extends Output>)newValue);
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
		switch (featureID) {
			case ControlPackage.ABSTRACT_PROCESS__HAS_INPUT:
				getHasInput().clear();
				return;
			case ControlPackage.ABSTRACT_PROCESS__HAS_OUTPUT:
				getHasOutput().clear();
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
		switch (featureID) {
			case ControlPackage.ABSTRACT_PROCESS__HAS_INPUT:
				return hasInput != null && !hasInput.isEmpty();
			case ControlPackage.ABSTRACT_PROCESS__HAS_OUTPUT:
				return hasOutput != null && !hasOutput.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractProcessImpl
