/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM.util;

import java.util.List;

import net.sf.ictalive.opera.OM.*;

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
 * @see net.sf.ictalive.opera.OM.OMPackage
 * @generated
 */
public class OMSwitch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = OMPackage.eINSTANCE;
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
			case OMPackage.OM:
			{
				OM om = (OM)theEObject;
				T result = caseOM(om);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.SS:
			{
				SS ss = (SS)theEObject;
				T result = caseSS(ss);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.IS:
			{
				IS is = (IS)theEObject;
				T result = caseIS(is);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.NS:
			{
				NS ns = (NS)theEObject;
				T result = caseNS(ns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.CS:
			{
				CS cs = (CS)theEObject;
				T result = caseCS(cs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.ROLE:
			{
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.OBJECTIVE:
			{
				Objective objective = (Objective)theEObject;
				T result = caseObjective(objective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.DEPENDENCY:
			{
				Dependency dependency = (Dependency)theEObject;
				T result = caseDependency(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.NORM:
			{
				Norm norm = (Norm)theEObject;
				T result = caseNorm(norm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.DEONTIC_STATEMENT:
			{
				DeonticStatement deonticStatement = (DeonticStatement)theEObject;
				T result = caseDeonticStatement(deonticStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.INDIVIDUAL_DEONTIC_STATEMENT:
			{
				IndividualDeonticStatement individualDeonticStatement = (IndividualDeonticStatement)theEObject;
				T result = caseIndividualDeonticStatement(individualDeonticStatement);
				if (result == null) result = caseDeonticStatement(individualDeonticStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.ROLE_DEONTIC_STATEMENT:
			{
				RoleDeonticStatement roleDeonticStatement = (RoleDeonticStatement)theEObject;
				T result = caseRoleDeonticStatement(roleDeonticStatement);
				if (result == null) result = caseDeonticStatement(roleDeonticStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.RIGHT:
			{
				Right right = (Right)theEObject;
				T result = caseRight(right);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.HIERARCHY_DEPENDENCY:
			{
				HierarchyDependency hierarchyDependency = (HierarchyDependency)theEObject;
				T result = caseHierarchyDependency(hierarchyDependency);
				if (result == null) result = caseDependency(hierarchyDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.MARKET_DEPENDENCY:
			{
				MarketDependency marketDependency = (MarketDependency)theEObject;
				T result = caseMarketDependency(marketDependency);
				if (result == null) result = caseDependency(marketDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.NETWORK_DEPENDENCY:
			{
				NetworkDependency networkDependency = (NetworkDependency)theEObject;
				T result = caseNetworkDependency(networkDependency);
				if (result == null) result = caseDependency(networkDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.SCENE:
			{
				Scene scene = (Scene)theEObject;
				T result = caseScene(scene);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.TRANSITION:
			{
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.ARC:
			{
				Arc arc = (Arc)theEObject;
				T result = caseArc(arc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.SCENE_TO_TRANSITION_ARC:
			{
				SceneToTransitionArc sceneToTransitionArc = (SceneToTransitionArc)theEObject;
				T result = caseSceneToTransitionArc(sceneToTransitionArc);
				if (result == null) result = caseArc(sceneToTransitionArc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.TRANSITION_TO_SCENE_ARC:
			{
				TransitionToSceneArc transitionToSceneArc = (TransitionToSceneArc)theEObject;
				T result = caseTransitionToSceneArc(transitionToSceneArc);
				if (result == null) result = caseArc(transitionToSceneArc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.PLAYER:
			{
				Player player = (Player)theEObject;
				T result = casePlayer(player);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.LANDMARK_PATTERN:
			{
				LandmarkPattern landmarkPattern = (LandmarkPattern)theEObject;
				T result = caseLandmarkPattern(landmarkPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.LANDMARK:
			{
				Landmark landmark = (Landmark)theEObject;
				T result = caseLandmark(landmark);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.PARTIAL_ORDER:
			{
				PartialOrder partialOrder = (PartialOrder)theEObject;
				T result = casePartialOrder(partialOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.PARTIAL_STATE_DESCRIPTION:
			{
				PartialStateDescription partialStateDescription = (PartialStateDescription)theEObject;
				T result = casePartialStateDescription(partialStateDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.PATH_FORMULA:
			{
				PathFormula pathFormula = (PathFormula)theEObject;
				T result = casePathFormula(pathFormula);
				if (result == null) result = casePartialStateDescription(pathFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.STATE_FORMULA:
			{
				StateFormula stateFormula = (StateFormula)theEObject;
				T result = caseStateFormula(stateFormula);
				if (result == null) result = casePathFormula(stateFormula);
				if (result == null) result = casePartialStateDescription(stateFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.ATOM:
			{
				Atom atom = (Atom)theEObject;
				T result = caseAtom(atom);
				if (result == null) result = caseStateFormula(atom);
				if (result == null) result = casePathFormula(atom);
				if (result == null) result = casePartialStateDescription(atom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.NEGATION:
			{
				Negation negation = (Negation)theEObject;
				T result = caseNegation(negation);
				if (result == null) result = caseStateFormula(negation);
				if (result == null) result = casePathFormula(negation);
				if (result == null) result = casePartialStateDescription(negation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.CONJUNCTION:
			{
				Conjunction conjunction = (Conjunction)theEObject;
				T result = caseConjunction(conjunction);
				if (result == null) result = caseStateFormula(conjunction);
				if (result == null) result = casePathFormula(conjunction);
				if (result == null) result = casePartialStateDescription(conjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.DISJUNCTION:
			{
				Disjunction disjunction = (Disjunction)theEObject;
				T result = caseDisjunction(disjunction);
				if (result == null) result = caseStateFormula(disjunction);
				if (result == null) result = casePathFormula(disjunction);
				if (result == null) result = casePartialStateDescription(disjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.IMPLICATION:
			{
				Implication implication = (Implication)theEObject;
				T result = caseImplication(implication);
				if (result == null) result = caseStateFormula(implication);
				if (result == null) result = casePathFormula(implication);
				if (result == null) result = casePartialStateDescription(implication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.FOR_ALL_PATHS:
			{
				ForAllPaths forAllPaths = (ForAllPaths)theEObject;
				T result = caseForAllPaths(forAllPaths);
				if (result == null) result = caseStateFormula(forAllPaths);
				if (result == null) result = casePathFormula(forAllPaths);
				if (result == null) result = casePartialStateDescription(forAllPaths);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.EXISTS_PATH:
			{
				ExistsPath existsPath = (ExistsPath)theEObject;
				T result = caseExistsPath(existsPath);
				if (result == null) result = caseStateFormula(existsPath);
				if (result == null) result = casePathFormula(existsPath);
				if (result == null) result = casePartialStateDescription(existsPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.PATH_NEGATION:
			{
				PathNegation pathNegation = (PathNegation)theEObject;
				T result = casePathNegation(pathNegation);
				if (result == null) result = casePathFormula(pathNegation);
				if (result == null) result = casePartialStateDescription(pathNegation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.PATH_CONJUNCTION:
			{
				PathConjunction pathConjunction = (PathConjunction)theEObject;
				T result = casePathConjunction(pathConjunction);
				if (result == null) result = casePathFormula(pathConjunction);
				if (result == null) result = casePartialStateDescription(pathConjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.PATH_DISJUNCTION:
			{
				PathDisjunction pathDisjunction = (PathDisjunction)theEObject;
				T result = casePathDisjunction(pathDisjunction);
				if (result == null) result = casePathFormula(pathDisjunction);
				if (result == null) result = casePartialStateDescription(pathDisjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.PATH_IMPLICATION:
			{
				PathImplication pathImplication = (PathImplication)theEObject;
				T result = casePathImplication(pathImplication);
				if (result == null) result = casePathFormula(pathImplication);
				if (result == null) result = casePartialStateDescription(pathImplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.NEXT:
			{
				Next next = (Next)theEObject;
				T result = caseNext(next);
				if (result == null) result = casePathFormula(next);
				if (result == null) result = casePartialStateDescription(next);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.SOMETIME:
			{
				Sometime sometime = (Sometime)theEObject;
				T result = caseSometime(sometime);
				if (result == null) result = casePathFormula(sometime);
				if (result == null) result = casePartialStateDescription(sometime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.ALWAYS:
			{
				Always always = (Always)theEObject;
				T result = caseAlways(always);
				if (result == null) result = casePathFormula(always);
				if (result == null) result = casePartialStateDescription(always);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.UNTIL:
			{
				Until until = (Until)theEObject;
				T result = caseUntil(until);
				if (result == null) result = casePathFormula(until);
				if (result == null) result = casePartialStateDescription(until);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.ONTOLOGY:
			{
				Ontology ontology = (Ontology)theEObject;
				T result = caseOntology(ontology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMPackage.CONCEPT:
			{
				Concept concept = (Concept)theEObject;
				T result = caseConcept(concept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOM(OM object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSS(SS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIS(IS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNS(NS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCS(CS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjective(Objective object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Norm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Norm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNorm(Norm object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deontic Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deontic Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeonticStatement(DeonticStatement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual Deontic Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual Deontic Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividualDeonticStatement(IndividualDeonticStatement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Deontic Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Deontic Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleDeonticStatement(RoleDeonticStatement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRight(Right object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hierarchy Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hierarchy Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHierarchyDependency(HierarchyDependency object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Market Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Market Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarketDependency(MarketDependency object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkDependency(NetworkDependency object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scene</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScene(Scene object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArc(Arc object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scene To Transition Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scene To Transition Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSceneToTransitionArc(SceneToTransitionArc object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition To Scene Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition To Scene Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionToSceneArc(TransitionToSceneArc object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayer(Player object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Landmark Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Landmark Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLandmarkPattern(LandmarkPattern object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Landmark</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Landmark</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLandmark(Landmark object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialOrder(PartialOrder object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial State Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial State Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialStateDescription(PartialStateDescription object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathFormula(PathFormula object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateFormula(StateFormula object)
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
	 * Returns the result of interpreting the object as an instance of '<em>Negation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegation(Negation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConjunction(Conjunction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisjunction(Disjunction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplication(Implication object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For All Paths</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For All Paths</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForAllPaths(ForAllPaths object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exists Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exists Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistsPath(ExistsPath object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Negation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Negation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathNegation(PathNegation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Conjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathConjunction(PathConjunction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Disjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathDisjunction(PathDisjunction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Implication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Implication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathImplication(PathImplication object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNext(Next object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sometime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sometime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSometime(Sometime object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Always</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Always</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlways(Always object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Until</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Until</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUntil(Until object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntology(Ontology object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcept(Concept object)
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

} //OMSwitch
