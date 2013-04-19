/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.swrl.util;

import java.util.List;

import net.sf.ictalive.rules.ruleml.Body;
import net.sf.ictalive.rules.ruleml.Head;

import net.sf.ictalive.rules.swrl.*;

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
 * @see net.sf.ictalive.rules.swrl.SwrlPackage
 * @generated
 */
public class SwrlSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SwrlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwrlSwitch() {
		if (modelPackage == null) {
			modelPackage = SwrlPackage.eINSTANCE;
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
			case SwrlPackage.ATOM_LIST: {
				AtomList atomList = (AtomList)theEObject;
				T result = caseAtomList(atomList);
				if (result == null) result = caseBody(atomList);
				if (result == null) result = caseHead(atomList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.BUILT_IN_ATOM: {
				BuiltInAtom builtInAtom = (BuiltInAtom)theEObject;
				T result = caseBuiltInAtom(builtInAtom);
				if (result == null) result = caseAtom(builtInAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.CLASS_ATOM: {
				ClassAtom classAtom = (ClassAtom)theEObject;
				T result = caseClassAtom(classAtom);
				if (result == null) result = caseAtom(classAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.INDIVIDUAL_PROPERTY_ATOM: {
				IndividualPropertyAtom individualPropertyAtom = (IndividualPropertyAtom)theEObject;
				T result = caseIndividualPropertyAtom(individualPropertyAtom);
				if (result == null) result = caseAtom(individualPropertyAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.SAME_INDIVIDUAL_ATOM: {
				SameIndividualAtom sameIndividualAtom = (SameIndividualAtom)theEObject;
				T result = caseSameIndividualAtom(sameIndividualAtom);
				if (result == null) result = caseAtom(sameIndividualAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.DIFFERENT_INDIVIDUALS_ATOM: {
				DifferentIndividualsAtom differentIndividualsAtom = (DifferentIndividualsAtom)theEObject;
				T result = caseDifferentIndividualsAtom(differentIndividualsAtom);
				if (result == null) result = caseAtom(differentIndividualsAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.DATAVALUED_PROPERTY_ATOM: {
				DatavaluedPropertyAtom datavaluedPropertyAtom = (DatavaluedPropertyAtom)theEObject;
				T result = caseDatavaluedPropertyAtom(datavaluedPropertyAtom);
				if (result == null) result = caseAtom(datavaluedPropertyAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.DATA_RANGE_ATOM: {
				DataRangeAtom dataRangeAtom = (DataRangeAtom)theEObject;
				T result = caseDataRangeAtom(dataRangeAtom);
				if (result == null) result = caseAtom(dataRangeAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.DATA_VALUE: {
				DataValue dataValue = (DataValue)theEObject;
				T result = caseDataValue(dataValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.ATOM: {
				Atom atom = (Atom)theEObject;
				T result = caseAtom(atom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.IOBJECT: {
				IObject iObject = (IObject)theEObject;
				T result = caseIObject(iObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.DOBJECT: {
				DObject dObject = (DObject)theEObject;
				T result = caseDObject(dObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.INDIVIDUAL_VARIABLE: {
				IndividualVariable individualVariable = (IndividualVariable)theEObject;
				T result = caseIndividualVariable(individualVariable);
				if (result == null) result = caseIObject(individualVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.INDIVIDUAL_ID: {
				IndividualID individualID = (IndividualID)theEObject;
				T result = caseIndividualID(individualID);
				if (result == null) result = caseIObject(individualID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.DATA_VARIABLE: {
				DataVariable dataVariable = (DataVariable)theEObject;
				T result = caseDataVariable(dataVariable);
				if (result == null) result = caseDObject(dataVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.DATA_LITERAL: {
				DataLiteral dataLiteral = (DataLiteral)theEObject;
				T result = caseDataLiteral(dataLiteral);
				if (result == null) result = caseDObject(dataLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atom List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atom List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomList(AtomList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Built In Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Built In Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuiltInAtom(BuiltInAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassAtom(ClassAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual Property Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual Property Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividualPropertyAtom(IndividualPropertyAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Same Individual Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Same Individual Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSameIndividualAtom(SameIndividualAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Different Individuals Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Different Individuals Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifferentIndividualsAtom(DifferentIndividualsAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datavalued Property Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datavalued Property Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatavaluedPropertyAtom(DatavaluedPropertyAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Range Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Range Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRangeAtom(DataRangeAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataValue(DataValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtom(Atom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIObject(IObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDObject(DObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividualVariable(IndividualVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividualID(IndividualID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataVariable(DataVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataLiteral(DataLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBody(Body object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Head</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Head</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHead(Head object) {
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

} //SwrlSwitch
