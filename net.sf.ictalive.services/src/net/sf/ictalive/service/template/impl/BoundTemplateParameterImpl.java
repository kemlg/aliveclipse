/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template.impl;

import net.sf.ictalive.service.semantics.ServiceParameter;

import net.sf.ictalive.service.template.BoundTemplateParameter;
import net.sf.ictalive.service.template.TemplatePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bound Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.template.impl.BoundTemplateParameterImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.impl.BoundTemplateParameterImpl#getConcrete <em>Concrete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoundTemplateParameterImpl extends EObjectImpl implements BoundTemplateParameter {
	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected ServiceParameter abstract_;

	/**
	 * The cached value of the '{@link #getConcrete() <em>Concrete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcrete()
	 * @generated
	 * @ordered
	 */
	protected ServiceParameter concrete;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundTemplateParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemplatePackage.Literals.BOUND_TEMPLATE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceParameter getAbstract() {
		if (abstract_ != null && abstract_.eIsProxy()) {
			InternalEObject oldAbstract = (InternalEObject)abstract_;
			abstract_ = (ServiceParameter)eResolveProxy(oldAbstract);
			if (abstract_ != oldAbstract) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.BOUND_TEMPLATE_PARAMETER__ABSTRACT, oldAbstract, abstract_));
			}
		}
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceParameter basicGetAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(ServiceParameter newAbstract) {
		ServiceParameter oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.BOUND_TEMPLATE_PARAMETER__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceParameter getConcrete() {
		if (concrete != null && concrete.eIsProxy()) {
			InternalEObject oldConcrete = (InternalEObject)concrete;
			concrete = (ServiceParameter)eResolveProxy(oldConcrete);
			if (concrete != oldConcrete) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.BOUND_TEMPLATE_PARAMETER__CONCRETE, oldConcrete, concrete));
			}
		}
		return concrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceParameter basicGetConcrete() {
		return concrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcrete(ServiceParameter newConcrete) {
		ServiceParameter oldConcrete = concrete;
		concrete = newConcrete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.BOUND_TEMPLATE_PARAMETER__CONCRETE, oldConcrete, concrete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TemplatePackage.BOUND_TEMPLATE_PARAMETER__ABSTRACT:
				if (resolve) return getAbstract();
				return basicGetAbstract();
			case TemplatePackage.BOUND_TEMPLATE_PARAMETER__CONCRETE:
				if (resolve) return getConcrete();
				return basicGetConcrete();
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
			case TemplatePackage.BOUND_TEMPLATE_PARAMETER__ABSTRACT:
				setAbstract((ServiceParameter)newValue);
				return;
			case TemplatePackage.BOUND_TEMPLATE_PARAMETER__CONCRETE:
				setConcrete((ServiceParameter)newValue);
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
			case TemplatePackage.BOUND_TEMPLATE_PARAMETER__ABSTRACT:
				setAbstract((ServiceParameter)null);
				return;
			case TemplatePackage.BOUND_TEMPLATE_PARAMETER__CONCRETE:
				setConcrete((ServiceParameter)null);
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
			case TemplatePackage.BOUND_TEMPLATE_PARAMETER__ABSTRACT:
				return abstract_ != null;
			case TemplatePackage.BOUND_TEMPLATE_PARAMETER__CONCRETE:
				return concrete != null;
		}
		return super.eIsSet(featureID);
	}

} //BoundTemplateParameterImpl
