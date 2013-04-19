/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics.util;

import java.util.List;

import net.sf.ictalive.service.semantics.*;

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
 * @see net.sf.ictalive.service.semantics.SemanticsPackage
 * @generated
 */
public class SemanticsSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SemanticsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticsSwitch() {
		if (modelPackage == null) {
			modelPackage = SemanticsPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SemanticsPackage.SERVICE_PROFILE: {
				ServiceProfile serviceProfile = (ServiceProfile)theEObject;
				T result = caseServiceProfile(serviceProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemanticsPackage.SERVICE_GROUNDING: {
				ServiceGrounding serviceGrounding = (ServiceGrounding)theEObject;
				T result = caseServiceGrounding(serviceGrounding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemanticsPackage.PROCESS_MODEL: {
				ProcessModel processModel = (ProcessModel)theEObject;
				T result = caseProcessModel(processModel);
				if (result == null) result = caseIOEP(processModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemanticsPackage.SERVICE_CATEGORY: {
				ServiceCategory serviceCategory = (ServiceCategory)theEObject;
				T result = caseServiceCategory(serviceCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemanticsPackage.SERVICE_PARAMETER: {
				ServiceParameter serviceParameter = (ServiceParameter)theEObject;
				T result = caseServiceParameter(serviceParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemanticsPackage.SERVICE_INPUT: {
				ServiceInput serviceInput = (ServiceInput)theEObject;
				T result = caseServiceInput(serviceInput);
				if (result == null) result = caseServiceParameter(serviceInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemanticsPackage.SERVICE_OUTPUT: {
				ServiceOutput serviceOutput = (ServiceOutput)theEObject;
				T result = caseServiceOutput(serviceOutput);
				if (result == null) result = caseServiceParameter(serviceOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemanticsPackage.SERVICE_CONDITION: {
				ServiceCondition serviceCondition = (ServiceCondition)theEObject;
				T result = caseServiceCondition(serviceCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemanticsPackage.SERVICE_RESULT: {
				ServiceResult serviceResult = (ServiceResult)theEObject;
				T result = caseServiceResult(serviceResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemanticsPackage.IOEP: {
				IOEP ioep = (IOEP)theEObject;
				T result = caseIOEP(ioep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceProfile(ServiceProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Grounding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Grounding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceGrounding(ServiceGrounding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessModel(ProcessModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceCategory(ServiceCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceParameter(ServiceParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInput(ServiceInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceOutput(ServiceOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceCondition(ServiceCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceResult(ServiceResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IOEP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IOEP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOEP(IOEP object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //SemanticsSwitch
