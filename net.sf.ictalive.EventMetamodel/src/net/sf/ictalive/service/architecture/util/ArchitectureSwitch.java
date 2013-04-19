/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.architecture.util;

import java.util.List;

import net.sf.ictalive.service.architecture.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.service.architecture.ArchitecturePackage
 * @generated
 */
public class ArchitectureSwitch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArchitecturePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = ArchitecturePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject)
	{
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject)
	{
		if (theEClass.eContainer() == modelPackage)
		{
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else
		{
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case ArchitecturePackage.SERVICE_FRAMEWORK:
			{
				ServiceFramework serviceFramework = (ServiceFramework)theEObject;
				T result = caseServiceFramework(serviceFramework);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.TEMPLATE_REPOSITORY:
			{
				TemplateRepository templateRepository = (TemplateRepository)theEObject;
				T result = caseTemplateRepository(templateRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.TEMPLATE_MATCHMAKER:
			{
				TemplateMatchmaker templateMatchmaker = (TemplateMatchmaker)theEObject;
				T result = caseTemplateMatchmaker(templateMatchmaker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.SERVICE_MATCHMAKER:
			{
				ServiceMatchmaker serviceMatchmaker = (ServiceMatchmaker)theEObject;
				T result = caseServiceMatchmaker(serviceMatchmaker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.SERVICE_TEMPLATE_MATCHMAKER:
			{
				ServiceTemplateMatchmaker serviceTemplateMatchmaker = (ServiceTemplateMatchmaker)theEObject;
				T result = caseServiceTemplateMatchmaker(serviceTemplateMatchmaker);
				if (result == null) result = caseServiceMatchmaker(serviceTemplateMatchmaker);
				if (result == null) result = caseTemplateMatchmaker(serviceTemplateMatchmaker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.SERVICE_DIRECTORY:
			{
				ServiceDirectory serviceDirectory = (ServiceDirectory)theEObject;
				T result = caseServiceDirectory(serviceDirectory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.EXECUTION_FRAMEWORK:
			{
				ExecutionFramework executionFramework = (ExecutionFramework)theEObject;
				T result = caseExecutionFramework(executionFramework);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.DEPLOYED_SERVICE:
			{
				DeployedService deployedService = (DeployedService)theEObject;
				T result = caseDeployedService(deployedService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Framework</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Framework</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceFramework(ServiceFramework object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateRepository(TemplateRepository object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Matchmaker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Matchmaker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateMatchmaker(TemplateMatchmaker object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Matchmaker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Matchmaker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceMatchmaker(ServiceMatchmaker object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Template Matchmaker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Template Matchmaker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceTemplateMatchmaker(ServiceTemplateMatchmaker object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Directory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Directory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDirectory(ServiceDirectory object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Framework</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Framework</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionFramework(ExecutionFramework object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployed Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployed Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployedService(DeployedService object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object)
	{
		return null;
	}

} //ArchitectureSwitch
