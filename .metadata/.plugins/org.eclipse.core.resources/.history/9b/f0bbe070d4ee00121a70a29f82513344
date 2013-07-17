/**
 */
package OM.impl;

import OM.*;

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
public class OMFactoryImpl extends EFactoryImpl implements OMFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OMFactory init()
  {
    try
    {
      OMFactory theOMFactory = (OMFactory)EPackage.Registry.INSTANCE.getEFactory(OMPackage.eNS_URI);
      if (theOMFactory != null)
      {
        return theOMFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OMFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OMFactoryImpl()
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
      case OMPackage.OPER_AMODEL: return createOperAModel();
      case OMPackage.OM: return createOM();
      case OMPackage.SS: return createSS();
      case OMPackage.IS: return createIS();
      case OMPackage.NS: return createNS();
      case OMPackage.CS: return createCS();
      case OMPackage.ROLE: return createRole();
      case OMPackage.OBJECTIVE: return createObjective();
      case OMPackage.NORM: return createNorm();
      case OMPackage.INDIVIDUAL_DEONTIC_STATEMENT: return createIndividualDeonticStatement();
      case OMPackage.ROLE_DEONTIC_STATEMENT: return createRoleDeonticStatement();
      case OMPackage.RIGHT: return createRight();
      case OMPackage.HIERARCHY_DEPENDENCY: return createHierarchyDependency();
      case OMPackage.MARKET_DEPENDENCY: return createMarketDependency();
      case OMPackage.NETWORK_DEPENDENCY: return createNetworkDependency();
      case OMPackage.SCENE: return createScene();
      case OMPackage.TRANSITION: return createTransition();
      case OMPackage.SCENE_TO_TRANSITION_ARC: return createSceneToTransitionArc();
      case OMPackage.TRANSITION_TO_SCENE_ARC: return createTransitionToSceneArc();
      case OMPackage.PLAYER: return createPlayer();
      case OMPackage.LANDMARK_PATTERN: return createLandmarkPattern();
      case OMPackage.LANDMARK: return createLandmark();
      case OMPackage.TRANSITION_NORM: return createTransitionNorm();
      case OMPackage.PARTIAL_ORDER: return createPartialOrder();
      case OMPackage.ATOM: return createAtom();
      case OMPackage.CONSTANT: return createConstant();
      case OMPackage.VARIABLE: return createVariable();
      case OMPackage.FUNCTION: return createFunction();
      case OMPackage.NEGATION: return createNegation();
      case OMPackage.CONJUNCTION: return createConjunction();
      case OMPackage.DISJUNCTION: return createDisjunction();
      case OMPackage.IMPLICATION: return createImplication();
      case OMPackage.FOR_ALL_PATHS: return createForAllPaths();
      case OMPackage.EXISTS_PATH: return createExistsPath();
      case OMPackage.PATH_NEGATION: return createPathNegation();
      case OMPackage.PATH_CONJUNCTION: return createPathConjunction();
      case OMPackage.PATH_DISJUNCTION: return createPathDisjunction();
      case OMPackage.PATH_IMPLICATION: return createPathImplication();
      case OMPackage.NEXT: return createNext();
      case OMPackage.SOMETIME: return createSometime();
      case OMPackage.ALWAYS: return createAlways();
      case OMPackage.UNTIL: return createUntil();
      case OMPackage.ONTOLOGY: return createOntology();
      case OMPackage.CONCEPT: return createConcept();
      case OMPackage.COUNTS_AS: return createCountsAs();
      case OMPackage.ACTIONS: return createActions();
      case OMPackage.ATOMIC_ACTION: return createAtomicAction();
      case OMPackage.SEQUENCE: return createSequence();
      case OMPackage.CONDITIONAL: return createConditional();
      case OMPackage.CONTEXT: return createContext();
      case OMPackage.EXISTS: return createExists();
      case OMPackage.FIRST_ORDER_QUANTIFIER: return createFirstOrderQuantifier();
      case OMPackage.FOR_ALL: return createForAll();
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
      case OMPackage.DEONTIC_MODALITY:
        return createDeonticModalityFromString(eDataType, initialValue);
      case OMPackage.ROLE_TYPE:
        return createRoleTypeFromString(eDataType, initialValue);
      case OMPackage.SCENE_TYPE:
        return createSceneTypeFromString(eDataType, initialValue);
      case OMPackage.TRANSITION_TYPE:
        return createTransitionTypeFromString(eDataType, initialValue);
      case OMPackage.TTS_TYPE:
        return createTTSTypeFromString(eDataType, initialValue);
      case OMPackage.CONCEPT_TYPE:
        return createConceptTypeFromString(eDataType, initialValue);
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
      case OMPackage.DEONTIC_MODALITY:
        return convertDeonticModalityToString(eDataType, instanceValue);
      case OMPackage.ROLE_TYPE:
        return convertRoleTypeToString(eDataType, instanceValue);
      case OMPackage.SCENE_TYPE:
        return convertSceneTypeToString(eDataType, instanceValue);
      case OMPackage.TRANSITION_TYPE:
        return convertTransitionTypeToString(eDataType, instanceValue);
      case OMPackage.TTS_TYPE:
        return convertTTSTypeToString(eDataType, instanceValue);
      case OMPackage.CONCEPT_TYPE:
        return convertConceptTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperAModel createOperAModel()
  {
    OperAModelImpl operAModel = new OperAModelImpl();
    return operAModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OM createOM()
  {
    OMImpl om = new OMImpl();
    return om;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SS createSS()
  {
    SSImpl ss = new SSImpl();
    return ss;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IS createIS()
  {
    ISImpl is = new ISImpl();
    return is;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NS createNS()
  {
    NSImpl ns = new NSImpl();
    return ns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CS createCS()
  {
    CSImpl cs = new CSImpl();
    return cs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role createRole()
  {
    RoleImpl role = new RoleImpl();
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objective createObjective()
  {
    ObjectiveImpl objective = new ObjectiveImpl();
    return objective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Norm createNorm()
  {
    NormImpl norm = new NormImpl();
    return norm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndividualDeonticStatement createIndividualDeonticStatement()
  {
    IndividualDeonticStatementImpl individualDeonticStatement = new IndividualDeonticStatementImpl();
    return individualDeonticStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleDeonticStatement createRoleDeonticStatement()
  {
    RoleDeonticStatementImpl roleDeonticStatement = new RoleDeonticStatementImpl();
    return roleDeonticStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Right createRight()
  {
    RightImpl right = new RightImpl();
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HierarchyDependency createHierarchyDependency()
  {
    HierarchyDependencyImpl hierarchyDependency = new HierarchyDependencyImpl();
    return hierarchyDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarketDependency createMarketDependency()
  {
    MarketDependencyImpl marketDependency = new MarketDependencyImpl();
    return marketDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetworkDependency createNetworkDependency()
  {
    NetworkDependencyImpl networkDependency = new NetworkDependencyImpl();
    return networkDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scene createScene()
  {
    SceneImpl scene = new SceneImpl();
    return scene;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SceneToTransitionArc createSceneToTransitionArc()
  {
    SceneToTransitionArcImpl sceneToTransitionArc = new SceneToTransitionArcImpl();
    return sceneToTransitionArc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionToSceneArc createTransitionToSceneArc()
  {
    TransitionToSceneArcImpl transitionToSceneArc = new TransitionToSceneArcImpl();
    return transitionToSceneArc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Player createPlayer()
  {
    PlayerImpl player = new PlayerImpl();
    return player;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LandmarkPattern createLandmarkPattern()
  {
    LandmarkPatternImpl landmarkPattern = new LandmarkPatternImpl();
    return landmarkPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Landmark createLandmark()
  {
    LandmarkImpl landmark = new LandmarkImpl();
    return landmark;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionNorm createTransitionNorm()
  {
    TransitionNormImpl transitionNorm = new TransitionNormImpl();
    return transitionNorm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartialOrder createPartialOrder()
  {
    PartialOrderImpl partialOrder = new PartialOrderImpl();
    return partialOrder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atom createAtom()
  {
    AtomImpl atom = new AtomImpl();
    return atom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Negation createNegation()
  {
    NegationImpl negation = new NegationImpl();
    return negation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conjunction createConjunction()
  {
    ConjunctionImpl conjunction = new ConjunctionImpl();
    return conjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Disjunction createDisjunction()
  {
    DisjunctionImpl disjunction = new DisjunctionImpl();
    return disjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Implication createImplication()
  {
    ImplicationImpl implication = new ImplicationImpl();
    return implication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForAllPaths createForAllPaths()
  {
    ForAllPathsImpl forAllPaths = new ForAllPathsImpl();
    return forAllPaths;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExistsPath createExistsPath()
  {
    ExistsPathImpl existsPath = new ExistsPathImpl();
    return existsPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathNegation createPathNegation()
  {
    PathNegationImpl pathNegation = new PathNegationImpl();
    return pathNegation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathConjunction createPathConjunction()
  {
    PathConjunctionImpl pathConjunction = new PathConjunctionImpl();
    return pathConjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathDisjunction createPathDisjunction()
  {
    PathDisjunctionImpl pathDisjunction = new PathDisjunctionImpl();
    return pathDisjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathImplication createPathImplication()
  {
    PathImplicationImpl pathImplication = new PathImplicationImpl();
    return pathImplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Next createNext()
  {
    NextImpl next = new NextImpl();
    return next;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sometime createSometime()
  {
    SometimeImpl sometime = new SometimeImpl();
    return sometime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Always createAlways()
  {
    AlwaysImpl always = new AlwaysImpl();
    return always;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Until createUntil()
  {
    UntilImpl until = new UntilImpl();
    return until;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ontology createOntology()
  {
    OntologyImpl ontology = new OntologyImpl();
    return ontology;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Concept createConcept()
  {
    ConceptImpl concept = new ConceptImpl();
    return concept;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CountsAs createCountsAs()
  {
    CountsAsImpl countsAs = new CountsAsImpl();
    return countsAs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actions createActions()
  {
    ActionsImpl actions = new ActionsImpl();
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicAction createAtomicAction()
  {
    AtomicActionImpl atomicAction = new AtomicActionImpl();
    return atomicAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sequence createSequence()
  {
    SequenceImpl sequence = new SequenceImpl();
    return sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conditional createConditional()
  {
    ConditionalImpl conditional = new ConditionalImpl();
    return conditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context createContext()
  {
    ContextImpl context = new ContextImpl();
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exists createExists()
  {
    ExistsImpl exists = new ExistsImpl();
    return exists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FirstOrderQuantifier createFirstOrderQuantifier()
  {
    FirstOrderQuantifierImpl firstOrderQuantifier = new FirstOrderQuantifierImpl();
    return firstOrderQuantifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForAll createForAll()
  {
    ForAllImpl forAll = new ForAllImpl();
    return forAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeonticModality createDeonticModalityFromString(EDataType eDataType, String initialValue)
  {
    DeonticModality result = DeonticModality.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDeonticModalityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleType createRoleTypeFromString(EDataType eDataType, String initialValue)
  {
    RoleType result = RoleType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRoleTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SceneType createSceneTypeFromString(EDataType eDataType, String initialValue)
  {
    SceneType result = SceneType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSceneTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionType createTransitionTypeFromString(EDataType eDataType, String initialValue)
  {
    TransitionType result = TransitionType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTransitionTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TTSType createTTSTypeFromString(EDataType eDataType, String initialValue)
  {
    TTSType result = TTSType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTTSTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConceptType createConceptTypeFromString(EDataType eDataType, String initialValue)
  {
    ConceptType result = ConceptType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConceptTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OMPackage getOMPackage()
  {
    return (OMPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OMPackage getPackage()
  {
    return OMPackage.eINSTANCE;
  }

} //OMFactoryImpl
