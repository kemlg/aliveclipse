/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.architecture.impl;

import net.sf.ictalive.service.architecture.ArchitecturePackage;
import net.sf.ictalive.service.architecture.ServiceTemplateMatchmaker;
import net.sf.ictalive.service.architecture.TemplateMatchmaker;
import net.sf.ictalive.service.architecture.TemplateRepository;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Template Matchmaker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.architecture.impl.ServiceTemplateMatchmakerImpl#getTemplateRepository <em>Template Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceTemplateMatchmakerImpl extends ServiceMatchmakerImpl implements ServiceTemplateMatchmaker
{
	/**
	 * The cached value of the '{@link #getTemplateRepository() <em>Template Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateRepository()
	 * @generated
	 * @ordered
	 */
	protected TemplateRepository templateRepository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceTemplateMatchmakerImpl()
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
		return ArchitecturePackage.Literals.SERVICE_TEMPLATE_MATCHMAKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateRepository getTemplateRepository()
	{
		if (templateRepository != null && templateRepository.eIsProxy())
		{
			InternalEObject oldTemplateRepository = (InternalEObject)templateRepository;
			templateRepository = (TemplateRepository)eResolveProxy(oldTemplateRepository);
			if (templateRepository != oldTemplateRepository)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.SERVICE_TEMPLATE_MATCHMAKER__TEMPLATE_REPOSITORY, oldTemplateRepository, templateRepository));
			}
		}
		return templateRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateRepository basicGetTemplateRepository()
	{
		return templateRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateRepository(TemplateRepository newTemplateRepository)
	{
		TemplateRepository oldTemplateRepository = templateRepository;
		templateRepository = newTemplateRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.SERVICE_TEMPLATE_MATCHMAKER__TEMPLATE_REPOSITORY, oldTemplateRepository, templateRepository));
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
			case ArchitecturePackage.SERVICE_TEMPLATE_MATCHMAKER__TEMPLATE_REPOSITORY:
				if (resolve) return getTemplateRepository();
				return basicGetTemplateRepository();
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
			case ArchitecturePackage.SERVICE_TEMPLATE_MATCHMAKER__TEMPLATE_REPOSITORY:
				setTemplateRepository((TemplateRepository)newValue);
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
			case ArchitecturePackage.SERVICE_TEMPLATE_MATCHMAKER__TEMPLATE_REPOSITORY:
				setTemplateRepository((TemplateRepository)null);
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
			case ArchitecturePackage.SERVICE_TEMPLATE_MATCHMAKER__TEMPLATE_REPOSITORY:
				return templateRepository != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == TemplateMatchmaker.class)
		{
			switch (derivedFeatureID)
			{
				case ArchitecturePackage.SERVICE_TEMPLATE_MATCHMAKER__TEMPLATE_REPOSITORY: return ArchitecturePackage.TEMPLATE_MATCHMAKER__TEMPLATE_REPOSITORY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == TemplateMatchmaker.class)
		{
			switch (baseFeatureID)
			{
				case ArchitecturePackage.TEMPLATE_MATCHMAKER__TEMPLATE_REPOSITORY: return ArchitecturePackage.SERVICE_TEMPLATE_MATCHMAKER__TEMPLATE_REPOSITORY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ServiceTemplateMatchmakerImpl
