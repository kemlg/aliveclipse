/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process.impl;

import net.sf.ictalive.owls.process.OutputBinding;
import net.sf.ictalive.owls.process.ProcessPackage;
import net.sf.ictalive.owls.process.Produce;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Produce</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.process.impl.ProduceImpl#getProducedBinding <em>Produced Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProduceImpl extends EObjectImpl implements Produce {
	/**
	 * The cached value of the '{@link #getProducedBinding() <em>Produced Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedBinding()
	 * @generated
	 * @ordered
	 */
	protected OutputBinding producedBinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProduceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.PRODUCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputBinding getProducedBinding() {
		if (producedBinding != null && producedBinding.eIsProxy()) {
			InternalEObject oldProducedBinding = (InternalEObject)producedBinding;
			producedBinding = (OutputBinding)eResolveProxy(oldProducedBinding);
			if (producedBinding != oldProducedBinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.PRODUCE__PRODUCED_BINDING, oldProducedBinding, producedBinding));
			}
		}
		return producedBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputBinding basicGetProducedBinding() {
		return producedBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProducedBinding(OutputBinding newProducedBinding) {
		OutputBinding oldProducedBinding = producedBinding;
		producedBinding = newProducedBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PRODUCE__PRODUCED_BINDING, oldProducedBinding, producedBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessPackage.PRODUCE__PRODUCED_BINDING:
				if (resolve) return getProducedBinding();
				return basicGetProducedBinding();
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
			case ProcessPackage.PRODUCE__PRODUCED_BINDING:
				setProducedBinding((OutputBinding)newValue);
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
			case ProcessPackage.PRODUCE__PRODUCED_BINDING:
				setProducedBinding((OutputBinding)null);
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
			case ProcessPackage.PRODUCE__PRODUCED_BINDING:
				return producedBinding != null;
		}
		return super.eIsSet(featureID);
	}

} //ProduceImpl
