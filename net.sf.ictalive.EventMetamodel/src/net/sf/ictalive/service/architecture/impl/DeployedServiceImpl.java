/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.architecture.impl;

import net.sf.ictalive.service.architecture.ArchitecturePackage;
import net.sf.ictalive.service.architecture.DeployedService;
import net.sf.ictalive.service.architecture.ExecutionFramework;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployed Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.architecture.impl.DeployedServiceImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link net.sf.ictalive.service.architecture.impl.DeployedServiceImpl#getDeploy <em>Deploy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeployedServiceImpl extends EObjectImpl implements DeployedService
{
	/**
	 * The default value of the '{@link #getArtifact() <em>Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected String artifact = ARTIFACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployedServiceImpl()
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
		return ArchitecturePackage.Literals.DEPLOYED_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArtifact()
	{
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifact(String newArtifact)
	{
		String oldArtifact = artifact;
		artifact = newArtifact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.DEPLOYED_SERVICE__ARTIFACT, oldArtifact, artifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionFramework getDeploy()
	{
		if (eContainerFeatureID != ArchitecturePackage.DEPLOYED_SERVICE__DEPLOY) return null;
		return (ExecutionFramework)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeploy(ExecutionFramework newDeploy, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newDeploy, ArchitecturePackage.DEPLOYED_SERVICE__DEPLOY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploy(ExecutionFramework newDeploy)
	{
		if (newDeploy != eInternalContainer() || (eContainerFeatureID != ArchitecturePackage.DEPLOYED_SERVICE__DEPLOY && newDeploy != null))
		{
			if (EcoreUtil.isAncestor(this, newDeploy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDeploy != null)
				msgs = ((InternalEObject)newDeploy).eInverseAdd(this, ArchitecturePackage.EXECUTION_FRAMEWORK__DEPLOYED_SERVICE, ExecutionFramework.class, msgs);
			msgs = basicSetDeploy(newDeploy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.DEPLOYED_SERVICE__DEPLOY, newDeploy, newDeploy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ArchitecturePackage.DEPLOYED_SERVICE__DEPLOY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDeploy((ExecutionFramework)otherEnd, msgs);
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
			case ArchitecturePackage.DEPLOYED_SERVICE__DEPLOY:
				return basicSetDeploy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID)
		{
			case ArchitecturePackage.DEPLOYED_SERVICE__DEPLOY:
				return eInternalContainer().eInverseRemove(this, ArchitecturePackage.EXECUTION_FRAMEWORK__DEPLOYED_SERVICE, ExecutionFramework.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case ArchitecturePackage.DEPLOYED_SERVICE__ARTIFACT:
				return getArtifact();
			case ArchitecturePackage.DEPLOYED_SERVICE__DEPLOY:
				return getDeploy();
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
		switch (featureID)
		{
			case ArchitecturePackage.DEPLOYED_SERVICE__ARTIFACT:
				setArtifact((String)newValue);
				return;
			case ArchitecturePackage.DEPLOYED_SERVICE__DEPLOY:
				setDeploy((ExecutionFramework)newValue);
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
			case ArchitecturePackage.DEPLOYED_SERVICE__ARTIFACT:
				setArtifact(ARTIFACT_EDEFAULT);
				return;
			case ArchitecturePackage.DEPLOYED_SERVICE__DEPLOY:
				setDeploy((ExecutionFramework)null);
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
			case ArchitecturePackage.DEPLOYED_SERVICE__ARTIFACT:
				return ARTIFACT_EDEFAULT == null ? artifact != null : !ARTIFACT_EDEFAULT.equals(artifact);
			case ArchitecturePackage.DEPLOYED_SERVICE__DEPLOY:
				return getDeploy() != null;
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
		result.append(" (artifact: ");
		result.append(artifact);
		result.append(')');
		return result.toString();
	}

} //DeployedServiceImpl
