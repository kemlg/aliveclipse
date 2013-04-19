/**
 */
package net.sf.ictalive.operetta.OM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see OM.OMPackage
 * @generated
 */
public interface OMFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OMFactory eINSTANCE = net.sf.ictalive.operetta.OM.impl.OMFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Oper AModel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Oper AModel</em>'.
   * @generated
   */
  OperAModel createOperAModel();

  /**
   * Returns a new object of class '<em>OM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OM</em>'.
   * @generated
   */
  OM createOM();

  /**
   * Returns a new object of class '<em>SS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SS</em>'.
   * @generated
   */
  SS createSS();

  /**
   * Returns a new object of class '<em>IS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IS</em>'.
   * @generated
   */
  IS createIS();

  /**
   * Returns a new object of class '<em>NS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NS</em>'.
   * @generated
   */
  NS createNS();

  /**
   * Returns a new object of class '<em>CS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CS</em>'.
   * @generated
   */
  CS createCS();

  /**
   * Returns a new object of class '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Role</em>'.
   * @generated
   */
  Role createRole();

  /**
   * Returns a new object of class '<em>Objective</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Objective</em>'.
   * @generated
   */
  Objective createObjective();

  /**
   * Returns a new object of class '<em>Norm</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Norm</em>'.
   * @generated
   */
  Norm createNorm();

  /**
   * Returns a new object of class '<em>Individual Deontic Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Individual Deontic Statement</em>'.
   * @generated
   */
  IndividualDeonticStatement createIndividualDeonticStatement();

  /**
   * Returns a new object of class '<em>Role Deontic Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Role Deontic Statement</em>'.
   * @generated
   */
  RoleDeonticStatement createRoleDeonticStatement();

  /**
   * Returns a new object of class '<em>Right</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Right</em>'.
   * @generated
   */
  Right createRight();

  /**
   * Returns a new object of class '<em>Hierarchy Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hierarchy Dependency</em>'.
   * @generated
   */
  HierarchyDependency createHierarchyDependency();

  /**
   * Returns a new object of class '<em>Market Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Market Dependency</em>'.
   * @generated
   */
  MarketDependency createMarketDependency();

  /**
   * Returns a new object of class '<em>Network Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Network Dependency</em>'.
   * @generated
   */
  NetworkDependency createNetworkDependency();

  /**
   * Returns a new object of class '<em>Scene</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scene</em>'.
   * @generated
   */
  Scene createScene();

  /**
   * Returns a new object of class '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition</em>'.
   * @generated
   */
  Transition createTransition();

  /**
   * Returns a new object of class '<em>Scene To Transition Arc</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scene To Transition Arc</em>'.
   * @generated
   */
  SceneToTransitionArc createSceneToTransitionArc();

  /**
   * Returns a new object of class '<em>Transition To Scene Arc</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition To Scene Arc</em>'.
   * @generated
   */
  TransitionToSceneArc createTransitionToSceneArc();

  /**
   * Returns a new object of class '<em>Player</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Player</em>'.
   * @generated
   */
  Player createPlayer();

  /**
   * Returns a new object of class '<em>Landmark Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Landmark Pattern</em>'.
   * @generated
   */
  LandmarkPattern createLandmarkPattern();

  /**
   * Returns a new object of class '<em>Landmark</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Landmark</em>'.
   * @generated
   */
  Landmark createLandmark();

  /**
   * Returns a new object of class '<em>Transition Norm</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Norm</em>'.
   * @generated
   */
  TransitionNorm createTransitionNorm();

  /**
   * Returns a new object of class '<em>Partial Order</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Partial Order</em>'.
   * @generated
   */
  PartialOrder createPartialOrder();

  /**
   * Returns a new object of class '<em>Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atom</em>'.
   * @generated
   */
  Atom createAtom();

  /**
   * Returns a new object of class '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant</em>'.
   * @generated
   */
  Constant createConstant();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>Negation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Negation</em>'.
   * @generated
   */
  Negation createNegation();

  /**
   * Returns a new object of class '<em>Conjunction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conjunction</em>'.
   * @generated
   */
  Conjunction createConjunction();

  /**
   * Returns a new object of class '<em>Disjunction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disjunction</em>'.
   * @generated
   */
  Disjunction createDisjunction();

  /**
   * Returns a new object of class '<em>Implication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implication</em>'.
   * @generated
   */
  Implication createImplication();

  /**
   * Returns a new object of class '<em>For All Paths</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For All Paths</em>'.
   * @generated
   */
  ForAllPaths createForAllPaths();

  /**
   * Returns a new object of class '<em>Exists Path</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exists Path</em>'.
   * @generated
   */
  ExistsPath createExistsPath();

  /**
   * Returns a new object of class '<em>Path Negation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Negation</em>'.
   * @generated
   */
  PathNegation createPathNegation();

  /**
   * Returns a new object of class '<em>Path Conjunction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Conjunction</em>'.
   * @generated
   */
  PathConjunction createPathConjunction();

  /**
   * Returns a new object of class '<em>Path Disjunction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Disjunction</em>'.
   * @generated
   */
  PathDisjunction createPathDisjunction();

  /**
   * Returns a new object of class '<em>Path Implication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Implication</em>'.
   * @generated
   */
  PathImplication createPathImplication();

  /**
   * Returns a new object of class '<em>Next</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Next</em>'.
   * @generated
   */
  Next createNext();

  /**
   * Returns a new object of class '<em>Sometime</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sometime</em>'.
   * @generated
   */
  Sometime createSometime();

  /**
   * Returns a new object of class '<em>Always</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Always</em>'.
   * @generated
   */
  Always createAlways();

  /**
   * Returns a new object of class '<em>Until</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Until</em>'.
   * @generated
   */
  Until createUntil();

  /**
   * Returns a new object of class '<em>Ontology</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ontology</em>'.
   * @generated
   */
  Ontology createOntology();

  /**
   * Returns a new object of class '<em>Concept</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concept</em>'.
   * @generated
   */
  Concept createConcept();

  /**
   * Returns a new object of class '<em>Counts As</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Counts As</em>'.
   * @generated
   */
  CountsAs createCountsAs();

  /**
   * Returns a new object of class '<em>Actions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actions</em>'.
   * @generated
   */
  Actions createActions();

  /**
   * Returns a new object of class '<em>Atomic Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomic Action</em>'.
   * @generated
   */
  AtomicAction createAtomicAction();

  /**
   * Returns a new object of class '<em>Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence</em>'.
   * @generated
   */
  Sequence createSequence();

  /**
   * Returns a new object of class '<em>Conditional</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional</em>'.
   * @generated
   */
  Conditional createConditional();

  /**
   * Returns a new object of class '<em>Context</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context</em>'.
   * @generated
   */
  Context createContext();

  /**
   * Returns a new object of class '<em>Exists</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exists</em>'.
   * @generated
   */
  Exists createExists();

  /**
   * Returns a new object of class '<em>For All</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For All</em>'.
   * @generated
   */
  ForAll createForAll();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  OMPackage getOMPackage();

} //OMFactory
