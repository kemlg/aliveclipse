/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OLCLMap.util;

import OLCLMap.*;

import java.util.List;

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
 * @see OLCLMap.OLCLMapPackage
 * @generated
 */
public class OLCLMapSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OLCLMapPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OLCLMapSwitch() {
		if (modelPackage == null) {
			modelPackage = OLCLMapPackage.eINSTANCE;
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
			case OLCLMapPackage.OBJECTIVE2_ACTION: {
				Objective2Action objective2Action = (Objective2Action)theEObject;
				T result = caseObjective2Action(objective2Action);
				if (result == null) result = caseMapEntry(objective2Action);
				if (result == null) result = caseToAction(objective2Action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OLCLMapPackage.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				T result = caseMapping(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OLCLMapPackage.MAP_ENTRY: {
				MapEntry mapEntry = (MapEntry)theEObject;
				T result = caseMapEntry(mapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OLCLMapPackage.LANDMARK2_ACTION: {
				Landmark2Action landmark2Action = (Landmark2Action)theEObject;
				T result = caseLandmark2Action(landmark2Action);
				if (result == null) result = caseMapEntry(landmark2Action);
				if (result == null) result = caseToAction(landmark2Action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OLCLMapPackage.LANDMARK_PATTERN2_ACTION: {
				LandmarkPattern2Action landmarkPattern2Action = (LandmarkPattern2Action)theEObject;
				T result = caseLandmarkPattern2Action(landmarkPattern2Action);
				if (result == null) result = caseMapEntry(landmarkPattern2Action);
				if (result == null) result = caseToAction(landmarkPattern2Action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OLCLMapPackage.SCENE2_ACTION: {
				Scene2Action scene2Action = (Scene2Action)theEObject;
				T result = caseScene2Action(scene2Action);
				if (result == null) result = caseMapEntry(scene2Action);
				if (result == null) result = caseToAction(scene2Action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OLCLMapPackage.IS2_ACTION: {
				IS2Action is2Action = (IS2Action)theEObject;
				T result = caseIS2Action(is2Action);
				if (result == null) result = caseMapEntry(is2Action);
				if (result == null) result = caseToAction(is2Action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OLCLMapPackage.PLAYER2_PARTICIPANT: {
				Player2Participant player2Participant = (Player2Participant)theEObject;
				T result = casePlayer2Participant(player2Participant);
				if (result == null) result = caseMapEntry(player2Participant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OLCLMapPackage.TO_ACTION: {
				ToAction toAction = (ToAction)theEObject;
				T result = caseToAction(toAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective2 Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective2 Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjective2Action(Objective2Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapEntry(MapEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Landmark2 Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Landmark2 Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLandmark2Action(Landmark2Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Landmark Pattern2 Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Landmark Pattern2 Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLandmarkPattern2Action(LandmarkPattern2Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scene2 Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scene2 Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScene2Action(Scene2Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS2 Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS2 Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIS2Action(IS2Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player2 Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player2 Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayer2Participant(Player2Participant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToAction(ToAction object) {
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

} //OLCLMapSwitch
