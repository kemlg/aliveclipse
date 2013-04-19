/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template.impl;

import net.sf.ictalive.service.semantics.ProcessModel;

import net.sf.ictalive.service.template.AbstractProcessModel;
import net.sf.ictalive.service.template.BoundProcessModel;
import net.sf.ictalive.service.template.TemplatePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bound Process Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.template.impl.BoundProcessModelImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.sf.ictalive.service.template.impl.BoundProcessModelImpl#getConcrete <em>Concrete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoundProcessModelImpl extends EObjectImpl implements BoundProcessModel {
	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected AbstractProcessModel abstract_;

	/**
	 * The cached value of the '{@link #getConcrete() <em>Concrete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcrete()
	 * @generated
	 * @ordered
	 */
	protected ProcessModel concrete;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundProcessModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemplatePackage.Literals.BOUND_PROCESS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractProcessModel getAbstract() {
		if (abstract_ != null && abstract_.eIsProxy()) {
			InternalEObject oldAbstract = (InternalEObject)abstract_;
			abstract_ = (AbstractProcessModel)eResolveProxy(oldAbstract);
			if (abstract_ != oldAbstract) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.BOUND_PROCESS_MODEL__ABSTRACT, oldAbstract, abstract_));
			}
		}
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractProcessModel basicGetAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(AbstractProcessModel newAbstract) {
		AbstractProcessModel oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.BOUND_PROCESS_MODEL__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModel getConcrete() {
		if (concrete != null && concrete.eIsProxy()) {
			InternalEObject oldConcrete = (InternalEObject)concrete;
			concrete = (ProcessModel)eResolveProxy(oldConcrete);
			if (concrete != oldConcrete) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.BOUND_PROCESS_MODEL__CONCRETE, oldConcrete, concrete));
			}
		}
		return concrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModel basicGetConcrete() {
		return concrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcrete(ProcessModel newConcrete) {
		ProcessModel oldConcrete = concrete;
		concrete = newConcrete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.BOUND_PROCESS_MODEL__CONCRETE, oldConcrete, concrete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TemplatePackage.BOUND_PROCESS_MODEL__ABSTRACT:
				if (resolve) return getAbstract();
				return basicGetAbstract();
			case TemplatePackage.BOUND_PROCESS_MODEL__CONCRETE:
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
			case TemplatePackage.BOUND_PROCESS_MODEL__ABSTRACT:
				setAbstract((AbstractProcessModel)newValue);
				return;
			case TemplatePackage.BOUND_PROCESS_MODEL__CONCRETE:
				setConcrete((ProcessModel)newValue);
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
			case TemplatePackage.BOUND_PROCESS_MODEL__ABSTRACT:
				setAbstract((AbstractProcessModel)null);
				return;
			case TemplatePackage.BOUND_PROCESS_MODEL__CONCRETE:
				setConcrete((ProcessModel)null);
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
			case TemplatePackage.BOUND_PROCESS_MODEL__ABSTRACT:
				return abstract_ != null;
			case TemplatePackage.BOUND_PROCESS_MODEL__CONCRETE:
				return concrete != null;
		}
		return super.eIsSet(featureID);
	}

} //BoundProcessModelImpl
