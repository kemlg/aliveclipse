/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics.grounding.util;

import java.util.List;

import net.sf.ictalive.service.semantics.ServiceGrounding;

import net.sf.ictalive.service.semantics.grounding.*;

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
 * @see net.sf.ictalive.service.semantics.grounding.GroundingPackage
 * @generated
 */
public class GroundingSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GroundingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundingSwitch() {
		if (modelPackage == null) {
			modelPackage = GroundingPackage.eINSTANCE;
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
			case GroundingPackage.WSDL_GROUNDING: {
				WsdlGrounding wsdlGrounding = (WsdlGrounding)theEObject;
				T result = caseWsdlGrounding(wsdlGrounding);
				if (result == null) result = caseServiceGrounding(wsdlGrounding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GroundingPackage.WSDL_ATOMIC_PROCESS_GROUNDING: {
				WsdlAtomicProcessGrounding wsdlAtomicProcessGrounding = (WsdlAtomicProcessGrounding)theEObject;
				T result = caseWsdlAtomicProcessGrounding(wsdlAtomicProcessGrounding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GroundingPackage.WSDL_OPERATION_REF: {
				WsdlOperationRef wsdlOperationRef = (WsdlOperationRef)theEObject;
				T result = caseWsdlOperationRef(wsdlOperationRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GroundingPackage.WSDL_MESSAGE_MAP: {
				WsdlMessageMap wsdlMessageMap = (WsdlMessageMap)theEObject;
				T result = caseWsdlMessageMap(wsdlMessageMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GroundingPackage.WSDL_INPUT_MESSAGE_MAP: {
				WsdlInputMessageMap wsdlInputMessageMap = (WsdlInputMessageMap)theEObject;
				T result = caseWsdlInputMessageMap(wsdlInputMessageMap);
				if (result == null) result = caseWsdlMessageMap(wsdlInputMessageMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GroundingPackage.WSDL_OUTPUT_MESSAGE_MAP: {
				WsdlOutputMessageMap wsdlOutputMessageMap = (WsdlOutputMessageMap)theEObject;
				T result = caseWsdlOutputMessageMap(wsdlOutputMessageMap);
				if (result == null) result = caseWsdlMessageMap(wsdlOutputMessageMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wsdl Grounding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wsdl Grounding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWsdlGrounding(WsdlGrounding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wsdl Atomic Process Grounding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wsdl Atomic Process Grounding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWsdlAtomicProcessGrounding(WsdlAtomicProcessGrounding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wsdl Operation Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wsdl Operation Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWsdlOperationRef(WsdlOperationRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wsdl Message Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wsdl Message Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWsdlMessageMap(WsdlMessageMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wsdl Input Message Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wsdl Input Message Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWsdlInputMessageMap(WsdlInputMessageMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wsdl Output Message Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wsdl Output Message Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWsdlOutputMessageMap(WsdlOutputMessageMap object) {
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

} //GroundingSwitch
