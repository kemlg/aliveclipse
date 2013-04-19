/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM.util;

import net.sf.ictalive.opera.OM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.opera.OM.OMPackage
 * @generated
 */
public class OMAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = OMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMSwitch<Adapter> modelSwitch =
		new OMSwitch<Adapter>()
		{
			@Override
			public Adapter caseOM(OM object)
			{
				return createOMAdapter();
			}
			@Override
			public Adapter caseSS(SS object)
			{
				return createSSAdapter();
			}
			@Override
			public Adapter caseIS(IS object)
			{
				return createISAdapter();
			}
			@Override
			public Adapter caseNS(NS object)
			{
				return createNSAdapter();
			}
			@Override
			public Adapter caseCS(CS object)
			{
				return createCSAdapter();
			}
			@Override
			public Adapter caseRole(Role object)
			{
				return createRoleAdapter();
			}
			@Override
			public Adapter caseObjective(Objective object)
			{
				return createObjectiveAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object)
			{
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseNorm(Norm object)
			{
				return createNormAdapter();
			}
			@Override
			public Adapter caseDeonticStatement(DeonticStatement object)
			{
				return createDeonticStatementAdapter();
			}
			@Override
			public Adapter caseIndividualDeonticStatement(IndividualDeonticStatement object)
			{
				return createIndividualDeonticStatementAdapter();
			}
			@Override
			public Adapter caseRoleDeonticStatement(RoleDeonticStatement object)
			{
				return createRoleDeonticStatementAdapter();
			}
			@Override
			public Adapter caseRight(Right object)
			{
				return createRightAdapter();
			}
			@Override
			public Adapter caseHierarchyDependency(HierarchyDependency object)
			{
				return createHierarchyDependencyAdapter();
			}
			@Override
			public Adapter caseMarketDependency(MarketDependency object)
			{
				return createMarketDependencyAdapter();
			}
			@Override
			public Adapter caseNetworkDependency(NetworkDependency object)
			{
				return createNetworkDependencyAdapter();
			}
			@Override
			public Adapter caseScene(Scene object)
			{
				return createSceneAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object)
			{
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseArc(Arc object)
			{
				return createArcAdapter();
			}
			@Override
			public Adapter caseSceneToTransitionArc(SceneToTransitionArc object)
			{
				return createSceneToTransitionArcAdapter();
			}
			@Override
			public Adapter caseTransitionToSceneArc(TransitionToSceneArc object)
			{
				return createTransitionToSceneArcAdapter();
			}
			@Override
			public Adapter casePlayer(Player object)
			{
				return createPlayerAdapter();
			}
			@Override
			public Adapter caseLandmarkPattern(LandmarkPattern object)
			{
				return createLandmarkPatternAdapter();
			}
			@Override
			public Adapter caseLandmark(Landmark object)
			{
				return createLandmarkAdapter();
			}
			@Override
			public Adapter casePartialOrder(PartialOrder object)
			{
				return createPartialOrderAdapter();
			}
			@Override
			public Adapter casePartialStateDescription(PartialStateDescription object)
			{
				return createPartialStateDescriptionAdapter();
			}
			@Override
			public Adapter casePathFormula(PathFormula object)
			{
				return createPathFormulaAdapter();
			}
			@Override
			public Adapter caseStateFormula(StateFormula object)
			{
				return createStateFormulaAdapter();
			}
			@Override
			public Adapter caseAtom(Atom object)
			{
				return createAtomAdapter();
			}
			@Override
			public Adapter caseNegation(Negation object)
			{
				return createNegationAdapter();
			}
			@Override
			public Adapter caseConjunction(Conjunction object)
			{
				return createConjunctionAdapter();
			}
			@Override
			public Adapter caseDisjunction(Disjunction object)
			{
				return createDisjunctionAdapter();
			}
			@Override
			public Adapter caseImplication(Implication object)
			{
				return createImplicationAdapter();
			}
			@Override
			public Adapter caseForAllPaths(ForAllPaths object)
			{
				return createForAllPathsAdapter();
			}
			@Override
			public Adapter caseExistsPath(ExistsPath object)
			{
				return createExistsPathAdapter();
			}
			@Override
			public Adapter casePathNegation(PathNegation object)
			{
				return createPathNegationAdapter();
			}
			@Override
			public Adapter casePathConjunction(PathConjunction object)
			{
				return createPathConjunctionAdapter();
			}
			@Override
			public Adapter casePathDisjunction(PathDisjunction object)
			{
				return createPathDisjunctionAdapter();
			}
			@Override
			public Adapter casePathImplication(PathImplication object)
			{
				return createPathImplicationAdapter();
			}
			@Override
			public Adapter caseNext(Next object)
			{
				return createNextAdapter();
			}
			@Override
			public Adapter caseSometime(Sometime object)
			{
				return createSometimeAdapter();
			}
			@Override
			public Adapter caseAlways(Always object)
			{
				return createAlwaysAdapter();
			}
			@Override
			public Adapter caseUntil(Until object)
			{
				return createUntilAdapter();
			}
			@Override
			public Adapter caseOntology(Ontology object)
			{
				return createOntologyAdapter();
			}
			@Override
			public Adapter caseConcept(Concept object)
			{
				return createConceptAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.OM <em>OM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.OM
	 * @generated
	 */
	public Adapter createOMAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.SS <em>SS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.SS
	 * @generated
	 */
	public Adapter createSSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.IS <em>IS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.IS
	 * @generated
	 */
	public Adapter createISAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.NS <em>NS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.NS
	 * @generated
	 */
	public Adapter createNSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.CS <em>CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.CS
	 * @generated
	 */
	public Adapter createCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.Role
	 * @generated
	 */
	public Adapter createRoleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.Objective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.Objective
	 * @generated
	 */
	public Adapter createObjectiveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.Norm <em>Norm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.Norm
	 * @generated
	 */
	public Adapter createNormAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.DeonticStatement <em>Deontic Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.DeonticStatement
	 * @generated
	 */
	public Adapter createDeonticStatementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.IndividualDeonticStatement <em>Individual Deontic Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.IndividualDeonticStatement
	 * @generated
	 */
	public Adapter createIndividualDeonticStatementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.RoleDeonticStatement <em>Role Deontic Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.RoleDeonticStatement
	 * @generated
	 */
	public Adapter createRoleDeonticStatementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.Right
	 * @generated
	 */
	public Adapter createRightAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.HierarchyDependency <em>Hierarchy Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.HierarchyDependency
	 * @generated
	 */
	public Adapter createHierarchyDependencyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.MarketDependency <em>Market Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.MarketDependency
	 * @generated
	 */
	public Adapter createMarketDependencyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.NetworkDependency <em>Network Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.NetworkDependency
	 * @generated
	 */
	public Adapter createNetworkDependencyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.Scene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.Scene
	 * @generated
	 */
	public Adapter createSceneAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.Arc
	 * @generated
	 */
	public Adapter createArcAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.SceneToTransitionArc <em>Scene To Transition Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.SceneToTransitionArc
	 * @generated
	 */
	public Adapter createSceneToTransitionArcAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.TransitionToSceneArc <em>Transition To Scene Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.TransitionToSceneArc
	 * @generated
	 */
	public Adapter createTransitionToSceneArcAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.Player
	 * @generated
	 */
	public Adapter createPlayerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.LandmarkPattern <em>Landmark Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.LandmarkPattern
	 * @generated
	 */
	public Adapter createLandmarkPatternAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.Landmark <em>Landmark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.Landmark
	 * @generated
	 */
	public Adapter createLandmarkAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.PartialOrder <em>Partial Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.PartialOrder
	 * @generated
	 */
	public Adapter createPartialOrderAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.PartialStateDescription <em>Partial State Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.PartialStateDescription
	 * @generated
	 */
	public Adapter createPartialStateDescriptionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.PathFormula <em>Path Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.PathFormula
	 * @generated
	 */
	public Adapter createPathFormulaAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.StateFormula <em>State Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.StateFormula
	 * @generated
	 */
	public Adapter createStateFormulaAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.Atom
	 * @generated
	 */
	public Adapter createAtomAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.Negation
	 * @generated
	 */
	public Adapter createNegationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.Conjunction <em>Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.Conjunction
	 * @generated
	 */
	public Adapter createConjunctionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.Disjunction <em>Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.Disjunction
	 * @generated
	 */
	public Adapter createDisjunctionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.Implication <em>Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.Implication
	 * @generated
	 */
	public Adapter createImplicationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.ForAllPaths <em>For All Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.ForAllPaths
	 * @generated
	 */
	public Adapter createForAllPathsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.ExistsPath <em>Exists Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.ExistsPath
	 * @generated
	 */
	public Adapter createExistsPathAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.PathNegation <em>Path Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.PathNegation
	 * @generated
	 */
	public Adapter createPathNegationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.PathConjunction <em>Path Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.PathConjunction
	 * @generated
	 */
	public Adapter createPathConjunctionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.PathDisjunction <em>Path Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.PathDisjunction
	 * @generated
	 */
	public Adapter createPathDisjunctionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.PathImplication <em>Path Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.PathImplication
	 * @generated
	 */
	public Adapter createPathImplicationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.Next <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.Next
	 * @generated
	 */
	public Adapter createNextAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.Sometime <em>Sometime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.Sometime
	 * @generated
	 */
	public Adapter createSometimeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.Always <em>Always</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.Always
	 * @generated
	 */
	public Adapter createAlwaysAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.Until <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.Until
	 * @generated
	 */
	public Adapter createUntilAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.Ontology
	 * @generated
	 */
	public Adapter createOntologyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.opera.OM.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.opera.OM.Concept
	 * @generated
	 */
	public Adapter createConceptAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //OMAdapterFactory
