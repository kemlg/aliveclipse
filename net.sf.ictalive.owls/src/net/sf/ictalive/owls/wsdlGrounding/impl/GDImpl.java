/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.wsdlGrounding.impl;

import java.util.Collection;

import net.sf.ictalive.owls.wsdlGrounding.GD;
import net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding;
import net.sf.ictalive.owls.wsdlGrounding.WsdlGrounding;
import net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.impl.GDImpl#getWsdlGrounding <em>Wsdl Grounding</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.impl.GDImpl#getWsdlAtomicProcessGrounding <em>Wsdl Atomic Process Grounding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GDImpl extends EObjectImpl implements GD {
	/**
	 * The cached value of the '{@link #getWsdlGrounding() <em>Wsdl Grounding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlGrounding()
	 * @generated
	 * @ordered
	 */
	protected EList<WsdlGrounding> wsdlGrounding;

	/**
	 * The cached value of the '{@link #getWsdlAtomicProcessGrounding() <em>Wsdl Atomic Process Grounding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlAtomicProcessGrounding()
	 * @generated
	 * @ordered
	 */
	protected EList<WsdlAtomicProcessGrounding> wsdlAtomicProcessGrounding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsdlGroundingPackage.Literals.GD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WsdlGrounding> getWsdlGrounding() {
		if (wsdlGrounding == null) {
			wsdlGrounding = new EObjectContainmentEList<WsdlGrounding>(WsdlGrounding.class, this, WsdlGroundingPackage.GD__WSDL_GROUNDING);
		}
		return wsdlGrounding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WsdlAtomicProcessGrounding> getWsdlAtomicProcessGrounding() {
		if (wsdlAtomicProcessGrounding == null) {
			wsdlAtomicProcessGrounding = new EObjectContainmentEList<WsdlAtomicProcessGrounding>(WsdlAtomicProcessGrounding.class, this, WsdlGroundingPackage.GD__WSDL_ATOMIC_PROCESS_GROUNDING);
		}
		return wsdlAtomicProcessGrounding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WsdlGroundingPackage.GD__WSDL_GROUNDING:
				return ((InternalEList<?>)getWsdlGrounding()).basicRemove(otherEnd, msgs);
			case WsdlGroundingPackage.GD__WSDL_ATOMIC_PROCESS_GROUNDING:
				return ((InternalEList<?>)getWsdlAtomicProcessGrounding()).basicRemove(otherEnd, msgs);
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
			case WsdlGroundingPackage.GD__WSDL_GROUNDING:
				return getWsdlGrounding();
			case WsdlGroundingPackage.GD__WSDL_ATOMIC_PROCESS_GROUNDING:
				return getWsdlAtomicProcessGrounding();
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
			case WsdlGroundingPackage.GD__WSDL_GROUNDING:
				getWsdlGrounding().clear();
				getWsdlGrounding().addAll((Collection<? extends WsdlGrounding>)newValue);
				return;
			case WsdlGroundingPackage.GD__WSDL_ATOMIC_PROCESS_GROUNDING:
				getWsdlAtomicProcessGrounding().clear();
				getWsdlAtomicProcessGrounding().addAll((Collection<? extends WsdlAtomicProcessGrounding>)newValue);
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
			case WsdlGroundingPackage.GD__WSDL_GROUNDING:
				getWsdlGrounding().clear();
				return;
			case WsdlGroundingPackage.GD__WSDL_ATOMIC_PROCESS_GROUNDING:
				getWsdlAtomicProcessGrounding().clear();
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
			case WsdlGroundingPackage.GD__WSDL_GROUNDING:
				return wsdlGrounding != null && !wsdlGrounding.isEmpty();
			case WsdlGroundingPackage.GD__WSDL_ATOMIC_PROCESS_GROUNDING:
				return wsdlAtomicProcessGrounding != null && !wsdlAtomicProcessGrounding.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GDImpl
