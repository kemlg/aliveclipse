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

import net.sf.ictalive.service.semantics.ServiceProfile;

import net.sf.ictalive.service.syntax.Endpoint;
import net.sf.ictalive.service.syntax.InterfaceDescription;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Directory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.architecture.impl.ServiceDirectoryImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link net.sf.ictalive.service.architecture.impl.ServiceDirectoryImpl#getSemantic <em>Semantic</em>}</li>
 *   <li>{@link net.sf.ictalive.service.architecture.impl.ServiceDirectoryImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceDirectoryImpl extends EObjectImpl implements ServiceDirectory
{
	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Endpoint> endpoint;

	/**
	 * The cached value of the '{@link #getSemantic() <em>Semantic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemantic()
	 * @generated
	 * @ordered
	 */
	protected ServiceProfile semantic;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceDescription> interface_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDirectoryImpl()
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
		return ArchitecturePackage.Literals.SERVICE_DIRECTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Endpoint> getEndpoint()
	{
		if (endpoint == null)
		{
			endpoint = new EObjectResolvingEList<Endpoint>(Endpoint.class, this, ArchitecturePackage.SERVICE_DIRECTORY__ENDPOINT);
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProfile getSemantic()
	{
		if (semantic != null && semantic.eIsProxy())
		{
			InternalEObject oldSemantic = (InternalEObject)semantic;
			semantic = (ServiceProfile)eResolveProxy(oldSemantic);
			if (semantic != oldSemantic)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.SERVICE_DIRECTORY__SEMANTIC, oldSemantic, semantic));
			}
		}
		return semantic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProfile basicGetSemantic()
	{
		return semantic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemantic(ServiceProfile newSemantic)
	{
		ServiceProfile oldSemantic = semantic;
		semantic = newSemantic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.SERVICE_DIRECTORY__SEMANTIC, oldSemantic, semantic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceDescription> getInterface()
	{
		if (interface_ == null)
		{
			interface_ = new EObjectResolvingEList<InterfaceDescription>(InterfaceDescription.class, this, ArchitecturePackage.SERVICE_DIRECTORY__INTERFACE);
		}
		return interface_;
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
			case ArchitecturePackage.SERVICE_DIRECTORY__ENDPOINT:
				return getEndpoint();
			case ArchitecturePackage.SERVICE_DIRECTORY__SEMANTIC:
				if (resolve) return getSemantic();
				return basicGetSemantic();
			case ArchitecturePackage.SERVICE_DIRECTORY__INTERFACE:
				return getInterface();
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
			case ArchitecturePackage.SERVICE_DIRECTORY__ENDPOINT:
				getEndpoint().clear();
				getEndpoint().addAll((Collection<? extends Endpoint>)newValue);
				return;
			case ArchitecturePackage.SERVICE_DIRECTORY__SEMANTIC:
				setSemantic((ServiceProfile)newValue);
				return;
			case ArchitecturePackage.SERVICE_DIRECTORY__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends InterfaceDescription>)newValue);
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
			case ArchitecturePackage.SERVICE_DIRECTORY__ENDPOINT:
				getEndpoint().clear();
				return;
			case ArchitecturePackage.SERVICE_DIRECTORY__SEMANTIC:
				setSemantic((ServiceProfile)null);
				return;
			case ArchitecturePackage.SERVICE_DIRECTORY__INTERFACE:
				getInterface().clear();
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
			case ArchitecturePackage.SERVICE_DIRECTORY__ENDPOINT:
				return endpoint != null && !endpoint.isEmpty();
			case ArchitecturePackage.SERVICE_DIRECTORY__SEMANTIC:
				return semantic != null;
			case ArchitecturePackage.SERVICE_DIRECTORY__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceDirectoryImpl
