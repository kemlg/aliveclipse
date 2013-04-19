/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics.impl;

import net.sf.ictalive.service.semantics.*;

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
public class SemanticsFactoryImpl extends EFactoryImpl implements SemanticsFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SemanticsFactory init()
	{
		try
		{
			SemanticsFactory theSemanticsFactory = (SemanticsFactory)EPackage.Registry.INSTANCE.getEFactory("http://alive/serviceLevel/semantics/0.5"); 
			if (theSemanticsFactory != null)
			{
				return theSemanticsFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SemanticsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticsFactoryImpl()
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
			case SemanticsPackage.SERVICE_PROFILE: return createServiceProfile();
			case SemanticsPackage.SERVICE_GROUNDING: return createServiceGrounding();
			case SemanticsPackage.PROCESS_MODEL: return createProcessModel();
			case SemanticsPackage.SERVICE_CATEGORY: return createServiceCategory();
			case SemanticsPackage.SERVICE_INPUT: return createServiceInput();
			case SemanticsPackage.SERVICE_OUTPUT: return createServiceOutput();
			case SemanticsPackage.SERVICE_CONDITION: return createServiceCondition();
			case SemanticsPackage.SERVICE_RESULT: return createServiceResult();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProfile createServiceProfile()
	{
		ServiceProfileImpl serviceProfile = new ServiceProfileImpl();
		return serviceProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceGrounding createServiceGrounding()
	{
		ServiceGroundingImpl serviceGrounding = new ServiceGroundingImpl();
		return serviceGrounding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModel createProcessModel()
	{
		ProcessModelImpl processModel = new ProcessModelImpl();
		return processModel;
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
	public ServiceInput createServiceInput()
	{
		ServiceInputImpl serviceInput = new ServiceInputImpl();
		return serviceInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOutput createServiceOutput()
	{
		ServiceOutputImpl serviceOutput = new ServiceOutputImpl();
		return serviceOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCondition createServiceCondition()
	{
		ServiceConditionImpl serviceCondition = new ServiceConditionImpl();
		return serviceCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceResult createServiceResult()
	{
		ServiceResultImpl serviceResult = new ServiceResultImpl();
		return serviceResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticsPackage getSemanticsPackage()
	{
		return (SemanticsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SemanticsPackage getPackage()
	{
		return SemanticsPackage.eINSTANCE;
	}

} //SemanticsFactoryImpl
