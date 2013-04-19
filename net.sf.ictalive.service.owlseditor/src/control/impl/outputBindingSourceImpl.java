/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.impl;

import control.ControlPackage;
import control.Parameter;
import control.ValueSpecifierElement;
import control.outputBindingSource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>output Binding Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link control.impl.outputBindingSourceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link control.impl.outputBindingSourceImpl#getSpecifierElement <em>Specifier Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class outputBindingSourceImpl extends BindingImpl implements outputBindingSource
{
  /**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
  protected Parameter source;

  /**
	 * The cached value of the '{@link #getSpecifierElement() <em>Specifier Element</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSpecifierElement()
	 * @generated
	 * @ordered
	 */
  protected ValueSpecifierElement specifierElement;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected outputBindingSourceImpl()
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
		return ControlPackage.Literals.OUTPUT_BINDING_SOURCE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Parameter getSource()
  {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Parameter)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlPackage.OUTPUT_BINDING_SOURCE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Parameter basicGetSource()
  {
		return source;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSource(Parameter newSource)
  {
		Parameter oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.OUTPUT_BINDING_SOURCE__SOURCE, oldSource, source));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ValueSpecifierElement getSpecifierElement()
  {
		if (specifierElement != null && specifierElement.eIsProxy()) {
			InternalEObject oldSpecifierElement = (InternalEObject)specifierElement;
			specifierElement = (ValueSpecifierElement)eResolveProxy(oldSpecifierElement);
			if (specifierElement != oldSpecifierElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlPackage.OUTPUT_BINDING_SOURCE__SPECIFIER_ELEMENT, oldSpecifierElement, specifierElement));
			}
		}
		return specifierElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ValueSpecifierElement basicGetSpecifierElement()
  {
		return specifierElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSpecifierElement(ValueSpecifierElement newSpecifierElement)
  {
		ValueSpecifierElement oldSpecifierElement = specifierElement;
		specifierElement = newSpecifierElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.OUTPUT_BINDING_SOURCE__SPECIFIER_ELEMENT, oldSpecifierElement, specifierElement));
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
			case ControlPackage.OUTPUT_BINDING_SOURCE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ControlPackage.OUTPUT_BINDING_SOURCE__SPECIFIER_ELEMENT:
				if (resolve) return getSpecifierElement();
				return basicGetSpecifierElement();
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
			case ControlPackage.OUTPUT_BINDING_SOURCE__SOURCE:
				setSource((Parameter)newValue);
				return;
			case ControlPackage.OUTPUT_BINDING_SOURCE__SPECIFIER_ELEMENT:
				setSpecifierElement((ValueSpecifierElement)newValue);
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
			case ControlPackage.OUTPUT_BINDING_SOURCE__SOURCE:
				setSource((Parameter)null);
				return;
			case ControlPackage.OUTPUT_BINDING_SOURCE__SPECIFIER_ELEMENT:
				setSpecifierElement((ValueSpecifierElement)null);
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
			case ControlPackage.OUTPUT_BINDING_SOURCE__SOURCE:
				return source != null;
			case ControlPackage.OUTPUT_BINDING_SOURCE__SPECIFIER_ELEMENT:
				return specifierElement != null;
		}
		return super.eIsSet(featureID);
	}

} //outputBindingSourceImpl
