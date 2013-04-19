/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.swrl.util;

import java.util.List;

import net.sf.ictalive.swrl.*;

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
 * @see net.sf.ictalive.swrl.SwrlPackage
 * @generated
 */
public class SwrlSwitch<T>
{
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
	public SwrlSwitch()
	{
		if (modelPackage == null)
		{
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
			case SwrlPackage.RULE:
			{
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.ANNOTATION:
			{
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.ATOM:
			{
				Atom atom = (Atom)theEObject;
				T result = caseAtom(atom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.ANTECEDENT:
			{
				Antecedent antecedent = (Antecedent)theEObject;
				T result = caseAntecedent(antecedent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.CONSEQUENT:
			{
				Consequent consequent = (Consequent)theEObject;
				T result = caseConsequent(consequent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.CLASS_ATOM:
			{
				ClassAtom classAtom = (ClassAtom)theEObject;
				T result = caseClassAtom(classAtom);
				if (result == null) result = caseAtom(classAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.INDIVIDUAL_PROPERTY_ATOM:
			{
				IndividualPropertyAtom individualPropertyAtom = (IndividualPropertyAtom)theEObject;
				T result = caseIndividualPropertyAtom(individualPropertyAtom);
				if (result == null) result = caseAtom(individualPropertyAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.INDIVIDUAL_OBJECT:
			{
				IndividualObject individualObject = (IndividualObject)theEObject;
				T result = caseIndividualObject(individualObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.INDIVIDUAL_VARIABLE:
			{
				IndividualVariable individualVariable = (IndividualVariable)theEObject;
				T result = caseIndividualVariable(individualVariable);
				if (result == null) result = caseIndividualObject(individualVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.INDIVIDUAL_ID:
			{
				IndividualID individualID = (IndividualID)theEObject;
				T result = caseIndividualID(individualID);
				if (result == null) result = caseIndividualObject(individualID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.SAME_AS_ATOM:
			{
				SameAsAtom sameAsAtom = (SameAsAtom)theEObject;
				T result = caseSameAsAtom(sameAsAtom);
				if (result == null) result = caseAtom(sameAsAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.DIFFERENT_FROM_ATOM:
			{
				DifferentFromAtom differentFromAtom = (DifferentFromAtom)theEObject;
				T result = caseDifferentFromAtom(differentFromAtom);
				if (result == null) result = caseAtom(differentFromAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.BUILT_IN_ATOM:
			{
				BuiltInAtom builtInAtom = (BuiltInAtom)theEObject;
				T result = caseBuiltInAtom(builtInAtom);
				if (result == null) result = caseAtom(builtInAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.DATA_OBJECT:
			{
				DataObject dataObject = (DataObject)theEObject;
				T result = caseDataObject(dataObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.DATA_VARIABLE:
			{
				DataVariable dataVariable = (DataVariable)theEObject;
				T result = caseDataVariable(dataVariable);
				if (result == null) result = caseDataObject(dataVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.DATA_LITERAL:
			{
				DataLiteral dataLiteral = (DataLiteral)theEObject;
				T result = caseDataLiteral(dataLiteral);
				if (result == null) result = caseDataObject(dataLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.DATA_RANGE_ATOM:
			{
				DataRangeAtom dataRangeAtom = (DataRangeAtom)theEObject;
				T result = caseDataRangeAtom(dataRangeAtom);
				if (result == null) result = caseAtom(dataRangeAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwrlPackage.DATA_VALUED_PROPERTY_ATOM:
			{
				DataValuedPropertyAtom dataValuedPropertyAtom = (DataValuedPropertyAtom)theEObject;
				T result = caseDataValuedPropertyAtom(dataValuedPropertyAtom);
				if (result == null) result = caseAtom(dataValuedPropertyAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object)
	{
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
	public T caseAtom(Atom object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antecedent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antecedent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntecedent(Antecedent object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consequent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consequent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsequent(Consequent object)
	{
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
	public T caseClassAtom(ClassAtom object)
	{
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
	public T caseIndividualPropertyAtom(IndividualPropertyAtom object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividualObject(IndividualObject object)
	{
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
	public T caseIndividualVariable(IndividualVariable object)
	{
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
	public T caseIndividualID(IndividualID object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Same As Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Same As Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSameAsAtom(SameAsAtom object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Different From Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Different From Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifferentFromAtom(DifferentFromAtom object)
	{
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
	public T caseBuiltInAtom(BuiltInAtom object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataObject(DataObject object)
	{
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
	public T caseDataVariable(DataVariable object)
	{
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
	public T caseDataLiteral(DataLiteral object)
	{
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
	public T caseDataRangeAtom(DataRangeAtom object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Valued Property Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Valued Property Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataValuedPropertyAtom(DataValuedPropertyAtom object)
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

} //SwrlSwitch
