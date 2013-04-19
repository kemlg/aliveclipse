/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.architecture.impl;

import net.sf.ictalive.service.architecture.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ArchitectureFactoryImpl extends EFactoryImpl implements ArchitectureFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArchitectureFactory init()
	{
		try
		{
			ArchitectureFactory theArchitectureFactory = (ArchitectureFactory)EPackage.Registry.INSTANCE.getEFactory("http://alive/serviceLevel/architecture/0.5"); 
			if (theArchitectureFactory != null)
			{
				return theArchitectureFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArchitectureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureFactoryImpl()
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
			case ArchitecturePackage.SERVICE_FRAMEWORK: return createServiceFramework();
			case ArchitecturePackage.TEMPLATE_REPOSITORY: return createTemplateRepository();
			case ArchitecturePackage.TEMPLATE_MATCHMAKER: return createTemplateMatchmaker();
			case ArchitecturePackage.SERVICE_MATCHMAKER: return createServiceMatchmaker();
			case ArchitecturePackage.SERVICE_TEMPLATE_MATCHMAKER: return createServiceTemplateMatchmaker();
			case ArchitecturePackage.SERVICE_DIRECTORY: return createServiceDirectory();
			case ArchitecturePackage.EXECUTION_FRAMEWORK: return createExecutionFramework();
			case ArchitecturePackage.DEPLOYED_SERVICE: return createDeployedService();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case ArchitecturePackage.CONTAINER_TYPE:
				return createContainerTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case ArchitecturePackage.CONTAINER_TYPE:
				return convertContainerTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFramework createServiceFramework()
	{
		ServiceFrameworkImpl serviceFramework = new ServiceFrameworkImpl();
		return serviceFramework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateRepository createTemplateRepository()
	{
		TemplateRepositoryImpl templateRepository = new TemplateRepositoryImpl();
		return templateRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateMatchmaker createTemplateMatchmaker()
	{
		TemplateMatchmakerImpl templateMatchmaker = new TemplateMatchmakerImpl();
		return templateMatchmaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceMatchmaker createServiceMatchmaker()
	{
		ServiceMatchmakerImpl serviceMatchmaker = new ServiceMatchmakerImpl();
		return serviceMatchmaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTemplateMatchmaker createServiceTemplateMatchmaker()
	{
		ServiceTemplateMatchmakerImpl serviceTemplateMatchmaker = new ServiceTemplateMatchmakerImpl();
		return serviceTemplateMatchmaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDirectory createServiceDirectory()
	{
		ServiceDirectoryImpl serviceDirectory = new ServiceDirectoryImpl();
		return serviceDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionFramework createExecutionFramework()
	{
		ExecutionFrameworkImpl executionFramework = new ExecutionFrameworkImpl();
		return executionFramework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedService createDeployedService()
	{
		DeployedServiceImpl deployedService = new DeployedServiceImpl();
		return deployedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerType createContainerTypeFromString(EDataType eDataType, String initialValue)
	{
		ContainerType result = ContainerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContainerTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturePackage getArchitecturePackage()
	{
		return (ArchitecturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArchitecturePackage getPackage()
	{
		return ArchitecturePackage.eINSTANCE;
	}

} //ArchitectureFactoryImpl
