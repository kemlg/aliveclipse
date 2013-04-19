/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.architecture.impl;

import java.util.Collection;

import net.sf.ictalive.service.architecture.ArchitecturePackage;
import net.sf.ictalive.service.architecture.TemplateRepository;

import net.sf.ictalive.service.template.GroundTemplate;
import net.sf.ictalive.service.template.ServiceTemplate;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.architecture.impl.TemplateRepositoryImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link net.sf.ictalive.service.architecture.impl.TemplateRepositoryImpl#getGroundTemplate <em>Ground Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateRepositoryImpl extends EObjectImpl implements TemplateRepository
{
	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceTemplate> template;

	/**
	 * The cached value of the '{@link #getGroundTemplate() <em>Ground Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<GroundTemplate> groundTemplate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateRepositoryImpl()
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
		return ArchitecturePackage.Literals.TEMPLATE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceTemplate> getTemplate()
	{
		if (template == null)
		{
			template = new EObjectContainmentEList<ServiceTemplate>(ServiceTemplate.class, this, ArchitecturePackage.TEMPLATE_REPOSITORY__TEMPLATE);
		}
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroundTemplate> getGroundTemplate()
	{
		if (groundTemplate == null)
		{
			groundTemplate = new EObjectContainmentEList<GroundTemplate>(GroundTemplate.class, this, ArchitecturePackage.TEMPLATE_REPOSITORY__GROUND_TEMPLATE);
		}
		return groundTemplate;
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
			case ArchitecturePackage.TEMPLATE_REPOSITORY__TEMPLATE:
				return ((InternalEList<?>)getTemplate()).basicRemove(otherEnd, msgs);
			case ArchitecturePackage.TEMPLATE_REPOSITORY__GROUND_TEMPLATE:
				return ((InternalEList<?>)getGroundTemplate()).basicRemove(otherEnd, msgs);
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
			case ArchitecturePackage.TEMPLATE_REPOSITORY__TEMPLATE:
				return getTemplate();
			case ArchitecturePackage.TEMPLATE_REPOSITORY__GROUND_TEMPLATE:
				return getGroundTemplate();
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
			case ArchitecturePackage.TEMPLATE_REPOSITORY__TEMPLATE:
				getTemplate().clear();
				getTemplate().addAll((Collection<? extends ServiceTemplate>)newValue);
				return;
			case ArchitecturePackage.TEMPLATE_REPOSITORY__GROUND_TEMPLATE:
				getGroundTemplate().clear();
				getGroundTemplate().addAll((Collection<? extends GroundTemplate>)newValue);
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
			case ArchitecturePackage.TEMPLATE_REPOSITORY__TEMPLATE:
				getTemplate().clear();
				return;
			case ArchitecturePackage.TEMPLATE_REPOSITORY__GROUND_TEMPLATE:
				getGroundTemplate().clear();
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
			case ArchitecturePackage.TEMPLATE_REPOSITORY__TEMPLATE:
				return template != null && !template.isEmpty();
			case ArchitecturePackage.TEMPLATE_REPOSITORY__GROUND_TEMPLATE:
				return groundTemplate != null && !groundTemplate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TemplateRepositoryImpl
