/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics.grounding.impl;

import java.util.Collection;

import net.sf.ictalive.service.semantics.grounding.GroundingPackage;
import net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding;
import net.sf.ictalive.service.semantics.grounding.WsdlGrounding;

import net.sf.ictalive.service.semantics.impl.ServiceGroundingImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wsdl Grounding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlGroundingImpl#getHasAtomicProcessGrounding <em>Has Atomic Process Grounding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WsdlGroundingImpl extends ServiceGroundingImpl implements WsdlGrounding {
	/**
	 * The cached value of the '{@link #getHasAtomicProcessGrounding() <em>Has Atomic Process Grounding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAtomicProcessGrounding()
	 * @generated
	 * @ordered
	 */
	protected EList<WsdlAtomicProcessGrounding> hasAtomicProcessGrounding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WsdlGroundingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroundingPackage.Literals.WSDL_GROUNDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WsdlAtomicProcessGrounding> getHasAtomicProcessGrounding() {
		if (hasAtomicProcessGrounding == null) {
			hasAtomicProcessGrounding = new EObjectContainmentEList<WsdlAtomicProcessGrounding>(WsdlAtomicProcessGrounding.class, this, GroundingPackage.WSDL_GROUNDING__HAS_ATOMIC_PROCESS_GROUNDING);
		}
		return hasAtomicProcessGrounding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GroundingPackage.WSDL_GROUNDING__HAS_ATOMIC_PROCESS_GROUNDING:
				return ((InternalEList<?>)getHasAtomicProcessGrounding()).basicRemove(otherEnd, msgs);
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
			case GroundingPackage.WSDL_GROUNDING__HAS_ATOMIC_PROCESS_GROUNDING:
				return getHasAtomicProcessGrounding();
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
			case GroundingPackage.WSDL_GROUNDING__HAS_ATOMIC_PROCESS_GROUNDING:
				getHasAtomicProcessGrounding().clear();
				getHasAtomicProcessGrounding().addAll((Collection<? extends WsdlAtomicProcessGrounding>)newValue);
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
			case GroundingPackage.WSDL_GROUNDING__HAS_ATOMIC_PROCESS_GROUNDING:
				getHasAtomicProcessGrounding().clear();
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
			case GroundingPackage.WSDL_GROUNDING__HAS_ATOMIC_PROCESS_GROUNDING:
				return hasAtomicProcessGrounding != null && !hasAtomicProcessGrounding.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WsdlGroundingImpl
