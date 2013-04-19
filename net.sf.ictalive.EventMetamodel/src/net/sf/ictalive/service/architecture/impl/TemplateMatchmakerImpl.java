/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.architecture.impl;

import net.sf.ictalive.service.architecture.ArchitecturePackage;
import net.sf.ictalive.service.architecture.TemplateMatchmaker;
import net.sf.ictalive.service.architecture.TemplateRepository;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Matchmaker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.architecture.impl.TemplateMatchmakerImpl#getTemplateRepository <em>Template Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateMatchmakerImpl extends EObjectImpl implements TemplateMatchmaker
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
	protected TemplateMatchmakerImpl()
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
		return ArchitecturePackage.Literals.TEMPLATE_MATCHMAKER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.TEMPLATE_MATCHMAKER__TEMPLATE_REPOSITORY, oldTemplateRepository, templateRepository));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.TEMPLATE_MATCHMAKER__TEMPLATE_REPOSITORY, oldTemplateRepository, templateRepository));
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
			case ArchitecturePackage.TEMPLATE_MATCHMAKER__TEMPLATE_REPOSITORY:
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
			case ArchitecturePackage.TEMPLATE_MATCHMAKER__TEMPLATE_REPOSITORY:
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
			case ArchitecturePackage.TEMPLATE_MATCHMAKER__TEMPLATE_REPOSITORY:
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
			case ArchitecturePackage.TEMPLATE_MATCHMAKER__TEMPLATE_REPOSITORY:
				return templateRepository != null;
		}
		return super.eIsSet(featureID);
	}

} //TemplateMatchmakerImpl
