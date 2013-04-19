/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.architecture.impl;

import java.util.Collection;

import net.sf.ictalive.service.architecture.ArchitecturePackage;
import net.sf.ictalive.service.architecture.ContainerType;
import net.sf.ictalive.service.architecture.DeployedService;
import net.sf.ictalive.service.architecture.ExecutionFramework;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Framework</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.architecture.impl.ExecutionFrameworkImpl#getDeployedService <em>Deployed Service</em>}</li>
 *   <li>{@link net.sf.ictalive.service.architecture.impl.ExecutionFrameworkImpl#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionFrameworkImpl extends EObjectImpl implements ExecutionFramework
{
	/**
	 * The cached value of the '{@link #getDeployedService() <em>Deployed Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedService()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployedService> deployedService;

	/**
	 * The default value of the '{@link #getContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected static final ContainerType CONTAINER_EDEFAULT = ContainerType.AXIS;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected ContainerType container = CONTAINER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionFrameworkImpl()
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
		return ArchitecturePackage.Literals.EXECUTION_FRAMEWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployedService> getDeployedService()
	{
		if (deployedService == null)
		{
			deployedService = new EObjectContainmentWithInverseEList<DeployedService>(DeployedService.class, this, ArchitecturePackage.EXECUTION_FRAMEWORK__DEPLOYED_SERVICE, ArchitecturePackage.DEPLOYED_SERVICE__DEPLOY);
		}
		return deployedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerType getContainer()
	{
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(ContainerType newContainer)
	{
		ContainerType oldContainer = container;
		container = newContainer == null ? CONTAINER_EDEFAULT : newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.EXECUTION_FRAMEWORK__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ArchitecturePackage.EXECUTION_FRAMEWORK__DEPLOYED_SERVICE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeployedService()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ArchitecturePackage.EXECUTION_FRAMEWORK__DEPLOYED_SERVICE:
				return ((InternalEList<?>)getDeployedService()).basicRemove(otherEnd, msgs);
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
		switch (featureID)
		{
			case ArchitecturePackage.EXECUTION_FRAMEWORK__DEPLOYED_SERVICE:
				return getDeployedService();
			case ArchitecturePackage.EXECUTION_FRAMEWORK__CONTAINER:
				return getContainer();
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
		switch (featureID)
		{
			case ArchitecturePackage.EXECUTION_FRAMEWORK__DEPLOYED_SERVICE:
				getDeployedService().clear();
				getDeployedService().addAll((Collection<? extends DeployedService>)newValue);
				return;
			case ArchitecturePackage.EXECUTION_FRAMEWORK__CONTAINER:
				setContainer((ContainerType)newValue);
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
		switch (featureID)
		{
			case ArchitecturePackage.EXECUTION_FRAMEWORK__DEPLOYED_SERVICE:
				getDeployedService().clear();
				return;
			case ArchitecturePackage.EXECUTION_FRAMEWORK__CONTAINER:
				setContainer(CONTAINER_EDEFAULT);
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
		switch (featureID)
		{
			case ArchitecturePackage.EXECUTION_FRAMEWORK__DEPLOYED_SERVICE:
				return deployedService != null && !deployedService.isEmpty();
			case ArchitecturePackage.EXECUTION_FRAMEWORK__CONTAINER:
				return container != CONTAINER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (container: ");
		result.append(container);
		result.append(')');
		return result.toString();
	}

} //ExecutionFrameworkImpl
