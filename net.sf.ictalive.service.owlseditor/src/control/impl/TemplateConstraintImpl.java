/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.impl;

import control.ControlPackage;
import control.TemplateConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link control.impl.TemplateConstraintImpl#getAspCode <em>Asp Code</em>}</li>
 *   <li>{@link control.impl.TemplateConstraintImpl#getAspBinding <em>Asp Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateConstraintImpl extends NamedElementImpl implements TemplateConstraint {
	/**
	 * The default value of the '{@link #getAspCode() <em>Asp Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ASP_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAspCode() <em>Asp Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspCode()
	 * @generated
	 * @ordered
	 */
	protected String aspCode = ASP_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAspBinding() <em>Asp Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspBinding()
	 * @generated
	 * @ordered
	 */
	protected static final String ASP_BINDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAspBinding() <em>Asp Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspBinding()
	 * @generated
	 * @ordered
	 */
	protected String aspBinding = ASP_BINDING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlPackage.Literals.TEMPLATE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAspCode() {
		return aspCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspCode(String newAspCode) {
		String oldAspCode = aspCode;
		aspCode = newAspCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.TEMPLATE_CONSTRAINT__ASP_CODE, oldAspCode, aspCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAspBinding() {
		return aspBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspBinding(String newAspBinding) {
		String oldAspBinding = aspBinding;
		aspBinding = newAspBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.TEMPLATE_CONSTRAINT__ASP_BINDING, oldAspBinding, aspBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControlPackage.TEMPLATE_CONSTRAINT__ASP_CODE:
				return getAspCode();
			case ControlPackage.TEMPLATE_CONSTRAINT__ASP_BINDING:
				return getAspBinding();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ControlPackage.TEMPLATE_CONSTRAINT__ASP_CODE:
				setAspCode((String)newValue);
				return;
			case ControlPackage.TEMPLATE_CONSTRAINT__ASP_BINDING:
				setAspBinding((String)newValue);
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
			case ControlPackage.TEMPLATE_CONSTRAINT__ASP_CODE:
				setAspCode(ASP_CODE_EDEFAULT);
				return;
			case ControlPackage.TEMPLATE_CONSTRAINT__ASP_BINDING:
				setAspBinding(ASP_BINDING_EDEFAULT);
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
			case ControlPackage.TEMPLATE_CONSTRAINT__ASP_CODE:
				return ASP_CODE_EDEFAULT == null ? aspCode != null : !ASP_CODE_EDEFAULT.equals(aspCode);
			case ControlPackage.TEMPLATE_CONSTRAINT__ASP_BINDING:
				return ASP_BINDING_EDEFAULT == null ? aspBinding != null : !ASP_BINDING_EDEFAULT.equals(aspBinding);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (aspCode: ");
		result.append(aspCode);
		result.append(", aspBinding: ");
		result.append(aspBinding);
		result.append(')');
		return result.toString();
	}

} //TemplateConstraintImpl
