/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.architecture.impl;

import java.util.Collection;

import net.sf.ictalive.service.architecture.ArchitecturePackage;
import net.sf.ictalive.service.architecture.ServiceDirectory;
import net.sf.ictalive.service.architecture.ServiceMatchmaker;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Matchmaker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.architecture.impl.ServiceMatchmakerImpl#getServiceDirectory <em>Service Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceMatchmakerImpl extends EObjectImpl implements ServiceMatchmaker {
	/**
	 * The cached value of the '{@link #getServiceDirectory() <em>Service Directory</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDirectory()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDirectory> serviceDirectory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceMatchmakerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.SERVICE_MATCHMAKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDirectory> getServiceDirectory() {
		if (serviceDirectory == null) {
			serviceDirectory = new EObjectResolvingEList<ServiceDirectory>(ServiceDirectory.class, this, ArchitecturePackage.SERVICE_MATCHMAKER__SERVICE_DIRECTORY);
		}
		return serviceDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturePackage.SERVICE_MATCHMAKER__SERVICE_DIRECTORY:
				return getServiceDirectory();
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
			case ArchitecturePackage.SERVICE_MATCHMAKER__SERVICE_DIRECTORY:
				getServiceDirectory().clear();
				getServiceDirectory().addAll((Collection<? extends ServiceDirectory>)newValue);
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
			case ArchitecturePackage.SERVICE_MATCHMAKER__SERVICE_DIRECTORY:
				getServiceDirectory().clear();
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
			case ArchitecturePackage.SERVICE_MATCHMAKER__SERVICE_DIRECTORY:
				return serviceDirectory != null && !serviceDirectory.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceMatchmakerImpl
