/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.profile.impl;

import net.sf.ictalive.owls.profile.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfileFactoryImpl extends EFactoryImpl implements ProfileFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProfileFactory init()
	{
		try
		{
			ProfileFactory theProfileFactory = (ProfileFactory)EPackage.Registry.INSTANCE.getEFactory("http://owls1.1/profile"); 
			if (theProfileFactory != null)
			{
				return theProfileFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProfileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case ProfilePackage.SERVICE_CATEGORY: return createServiceCategory();
			case ProfilePackage.SERVICE_PARAMETER: return createServiceParameter();
			case ProfilePackage.PROFILE: return createProfile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCategory createServiceCategory()
	{
		ServiceCategoryImpl serviceCategory = new ServiceCategoryImpl();
		return serviceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceParameter createServiceParameter()
	{
		ServiceParameterImpl serviceParameter = new ServiceParameterImpl();
		return serviceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile createProfile()
	{
		ProfileImpl profile = new ProfileImpl();
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilePackage getProfilePackage()
	{
		return (ProfilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProfilePackage getPackage()
	{
		return ProfilePackage.eINSTANCE;
	}

} //ProfileFactoryImpl
