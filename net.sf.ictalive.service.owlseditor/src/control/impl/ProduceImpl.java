/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.impl;

import control.ControlPackage;
import control.Produce;
import control.ValueSpecifierElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Produce</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link control.impl.ProduceImpl#getProducedBindingValueSpecifier <em>Produced Binding Value Specifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProduceImpl extends ControlConstructImpl implements Produce
{
  /**
	 * The cached value of the '{@link #getProducedBindingValueSpecifier() <em>Produced Binding Value Specifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProducedBindingValueSpecifier()
	 * @generated
	 * @ordered
	 */
  protected ValueSpecifierElement producedBindingValueSpecifier;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ProduceImpl()
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
		return ControlPackage.Literals.PRODUCE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ValueSpecifierElement getProducedBindingValueSpecifier()
  {
		return producedBindingValueSpecifier;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetProducedBindingValueSpecifier(ValueSpecifierElement newProducedBindingValueSpecifier, NotificationChain msgs)
  {
		ValueSpecifierElement oldProducedBindingValueSpecifier = producedBindingValueSpecifier;
		producedBindingValueSpecifier = newProducedBindingValueSpecifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlPackage.PRODUCE__PRODUCED_BINDING_VALUE_SPECIFIER, oldProducedBindingValueSpecifier, newProducedBindingValueSpecifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setProducedBindingValueSpecifier(ValueSpecifierElement newProducedBindingValueSpecifier)
  {
		if (newProducedBindingValueSpecifier != producedBindingValueSpecifier) {
			NotificationChain msgs = null;
			if (producedBindingValueSpecifier != null)
				msgs = ((InternalEObject)producedBindingValueSpecifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControlPackage.PRODUCE__PRODUCED_BINDING_VALUE_SPECIFIER, null, msgs);
			if (newProducedBindingValueSpecifier != null)
				msgs = ((InternalEObject)newProducedBindingValueSpecifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControlPackage.PRODUCE__PRODUCED_BINDING_VALUE_SPECIFIER, null, msgs);
			msgs = basicSetProducedBindingValueSpecifier(newProducedBindingValueSpecifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.PRODUCE__PRODUCED_BINDING_VALUE_SPECIFIER, newProducedBindingValueSpecifier, newProducedBindingValueSpecifier));
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
			case ControlPackage.PRODUCE__PRODUCED_BINDING_VALUE_SPECIFIER:
				return basicSetProducedBindingValueSpecifier(null, msgs);
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
			case ControlPackage.PRODUCE__PRODUCED_BINDING_VALUE_SPECIFIER:
				return getProducedBindingValueSpecifier();
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
		switch (featureID) {
			case ControlPackage.PRODUCE__PRODUCED_BINDING_VALUE_SPECIFIER:
				setProducedBindingValueSpecifier((ValueSpecifierElement)newValue);
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
			case ControlPackage.PRODUCE__PRODUCED_BINDING_VALUE_SPECIFIER:
				setProducedBindingValueSpecifier((ValueSpecifierElement)null);
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
			case ControlPackage.PRODUCE__PRODUCED_BINDING_VALUE_SPECIFIER:
				return producedBindingValueSpecifier != null;
		}
		return super.eIsSet(featureID);
	}

} //ProduceImpl
