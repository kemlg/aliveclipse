/**
 */
package OM.impl;

import OM.ActionDescription;
import OM.Actions;
import OM.Always;
import OM.Arc;
import OM.Atom;
import OM.AtomicAction;
import OM.Concept;
import OM.ConceptType;
import OM.Conditional;
import OM.Conjunction;
import OM.Constant;
import OM.Context;
import OM.CountsAs;
import OM.CountsAsConcreteFact;
import OM.DeonticModality;
import OM.DeonticStatement;
import OM.Dependency;
import OM.Disjunction;
import OM.Exists;
import OM.ExistsPath;
import OM.FirstOrderQuantifier;
import OM.ForAll;
import OM.ForAllPaths;
import OM.Function;
import OM.HierarchyDependency;
import OM.Implication;
import OM.IndividualDeonticStatement;
import OM.Landmark;
import OM.LandmarkPattern;
import OM.MarketDependency;
import OM.Negation;
import OM.NetworkDependency;
import OM.Next;
import OM.Norm;
import OM.OMFactory;
import OM.OMPackage;
import OM.Objective;
import OM.Ontology;
import OM.OperAModel;
import OM.PartialOrder;
import OM.PartialStateDescription;
import OM.PathConjunction;
import OM.PathDisjunction;
import OM.PathFormula;
import OM.PathImplication;
import OM.PathNegation;
import OM.Player;
import OM.Right;
import OM.Role;
import OM.RoleDeonticStatement;
import OM.RoleType;
import OM.Scene;
import OM.SceneToTransitionArc;
import OM.SceneType;
import OM.Sequence;
import OM.Sometime;
import OM.StateFormula;
import OM.TTSType;
import OM.Term;
import OM.Transition;
import OM.TransitionNorm;
import OM.TransitionToSceneArc;
import OM.TransitionType;
import OM.Until;
import OM.Variable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OMPackageImpl extends EPackageImpl implements OMPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operAModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass omEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ssEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass csEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass normEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deonticStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass individualDeonticStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleDeonticStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rightEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hierarchyDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass marketDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass networkDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sceneEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arcEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sceneToTransitionArcEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionToSceneArcEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass playerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass landmarkPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass landmarkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionNormEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass partialOrderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass partialStateDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathFormulaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateFormulaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conjunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disjunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass implicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forAllPathsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass existsPathEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathNegationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathConjunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathDisjunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathImplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sometimeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alwaysEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass untilEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ontologyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conceptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass countsAsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass countsAsConcreteFactEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomicActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass existsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass firstOrderQuantifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forAllEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum deonticModalityEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum roleTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum sceneTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum transitionTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum ttsTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum conceptTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see OM.OMPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private OMPackageImpl()
  {
    super(eNS_URI, OMFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link OMPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static OMPackage init()
  {
    if (isInited) return (OMPackage)EPackage.Registry.INSTANCE.getEPackage(OMPackage.eNS_URI);

    // Obtain or create and register package
    OMPackageImpl theOMPackage = (OMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OMPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theOMPackage.createPackageContents();

    // Initialize created meta-data
    theOMPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theOMPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(OMPackage.eNS_URI, theOMPackage);
    return theOMPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperAModel()
  {
    return operAModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperAModel_Name()
  {
    return (EAttribute)operAModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperAModel_Om()
  {
    return (EReference)operAModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOM()
  {
    return omEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOM_Ss()
  {
    return (EReference)omEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOM_Is()
  {
    return (EReference)omEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOM_Ns()
  {
    return (EReference)omEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOM_Cs()
  {
    return (EReference)omEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSS()
  {
    return ssEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSS_Roles()
  {
    return (EReference)ssEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSS_Objectives()
  {
    return (EReference)ssEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSS_Dependencies()
  {
    return (EReference)ssEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIS()
  {
    return isEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIS_Scenes()
  {
    return (EReference)isEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIS_Transitions()
  {
    return (EReference)isEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIS_Arcs()
  {
    return (EReference)isEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNS()
  {
    return nsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNS_Norms()
  {
    return (EReference)nsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNS_TransitionNorms()
  {
    return (EReference)nsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCS()
  {
    return csEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCS_Formulas()
  {
    return (EReference)csEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCS_Ontology()
  {
    return (EReference)csEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCS_Terms()
  {
    return (EReference)csEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCS_CountsAsRules()
  {
    return (EReference)csEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCS_Contexts()
  {
    return (EReference)csEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCS_ActionLibrary()
  {
    return (EReference)csEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRole()
  {
    return roleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRole_Name()
  {
    return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRole_ConceptName()
  {
    return (EReference)roleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRole_Objectives()
  {
    return (EReference)roleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRole_Norms()
  {
    return (EReference)roleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRole_Rights()
  {
    return (EReference)roleEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRole_RoleType()
  {
    return (EAttribute)roleEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRole_DependantOn()
  {
    return (EReference)roleEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRole_DependeeIn()
  {
    return (EReference)roleEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjective()
  {
    return objectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjective_Name()
  {
    return (EAttribute)objectiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjective_ConceptName()
  {
    return (EReference)objectiveEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjective_StateDescription()
  {
    return (EReference)objectiveEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjective_SubObjectives()
  {
    return (EReference)objectiveEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjective_ParentObjective()
  {
    return (EReference)objectiveEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjective_UsedByRole()
  {
    return (EReference)objectiveEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDependency()
  {
    return dependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDependency_ID()
  {
    return (EAttribute)dependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDependency_Name()
  {
    return (EAttribute)dependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependency_ObjectOfDependency()
  {
    return (EReference)dependencyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNorm()
  {
    return normEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNorm_NormID()
  {
    return (EAttribute)normEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNorm_ActivatingCondition()
  {
    return (EReference)normEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNorm_DeactivatingCondition()
  {
    return (EReference)normEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNorm_MaintenanceCondition()
  {
    return (EReference)normEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNorm_Timeout()
  {
    return (EReference)normEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNorm_Deontics()
  {
    return (EReference)normEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNorm_RepairCondition()
  {
    return (EReference)normEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeonticStatement()
  {
    return deonticStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeonticStatement_Modality()
  {
    return (EAttribute)deonticStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeonticStatement_What()
  {
    return (EReference)deonticStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndividualDeonticStatement()
  {
    return individualDeonticStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndividualDeonticStatement_Actor()
  {
    return (EReference)individualDeonticStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoleDeonticStatement()
  {
    return roleDeonticStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoleDeonticStatement_Role()
  {
    return (EReference)roleDeonticStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRight()
  {
    return rightEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRight_Name()
  {
    return (EAttribute)rightEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRight_Expr()
  {
    return (EReference)rightEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHierarchyDependency()
  {
    return hierarchyDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHierarchyDependency_Dependant()
  {
    return (EReference)hierarchyDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHierarchyDependency_Dependee()
  {
    return (EReference)hierarchyDependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMarketDependency()
  {
    return marketDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMarketDependency_Dependant()
  {
    return (EReference)marketDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMarketDependency_Dependee()
  {
    return (EReference)marketDependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNetworkDependency()
  {
    return networkDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNetworkDependency_Dependant1()
  {
    return (EReference)networkDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNetworkDependency_Dependant2()
  {
    return (EReference)networkDependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScene()
  {
    return sceneEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScene_SceneID()
  {
    return (EAttribute)sceneEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScene_Players()
  {
    return (EReference)sceneEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScene_Results()
  {
    return (EReference)sceneEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScene_InteractionPattern()
  {
    return (EReference)sceneEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScene_Description()
  {
    return (EAttribute)sceneEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScene_Type()
  {
    return (EAttribute)sceneEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransition()
  {
    return transitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransition_TransitionID()
  {
    return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransition_TransitionType()
  {
    return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransition_Norms()
  {
    return (EReference)transitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArc()
  {
    return arcEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArc_ArcID()
  {
    return (EAttribute)arcEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArc_Accessible()
  {
    return (EReference)arcEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSceneToTransitionArc()
  {
    return sceneToTransitionArcEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSceneToTransitionArc_From()
  {
    return (EReference)sceneToTransitionArcEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSceneToTransitionArc_To()
  {
    return (EReference)sceneToTransitionArcEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionToSceneArc()
  {
    return transitionToSceneArcEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionToSceneArc_From()
  {
    return (EReference)transitionToSceneArcEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionToSceneArc_To()
  {
    return (EReference)transitionToSceneArcEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionToSceneArc_Type()
  {
    return (EAttribute)transitionToSceneArcEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlayer()
  {
    return playerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlayer_PlayerID()
  {
    return (EAttribute)playerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlayer_Role()
  {
    return (EReference)playerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLandmarkPattern()
  {
    return landmarkPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLandmarkPattern_Landmarks()
  {
    return (EReference)landmarkPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLandmarkPattern_LandmarkOrder()
  {
    return (EReference)landmarkPatternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLandmark()
  {
    return landmarkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLandmark_Name()
  {
    return (EAttribute)landmarkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLandmark_StateDescription()
  {
    return (EReference)landmarkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLandmark_Entails()
  {
    return (EReference)landmarkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLandmark_IsResult()
  {
    return (EAttribute)landmarkEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionNorm()
  {
    return transitionNormEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionNorm_ID()
  {
    return (EAttribute)transitionNormEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionNorm_FromScene()
  {
    return (EReference)transitionNormEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionNorm_FromPlayers()
  {
    return (EReference)transitionNormEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionNorm_FromResults()
  {
    return (EReference)transitionNormEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionNorm_ToScene()
  {
    return (EReference)transitionNormEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionNorm_ToPlayer()
  {
    return (EReference)transitionNormEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionNorm_AttachedTo()
  {
    return (EReference)transitionNormEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPartialOrder()
  {
    return partialOrderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPartialOrder_Name()
  {
    return (EAttribute)partialOrderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPartialOrder_From()
  {
    return (EReference)partialOrderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPartialOrder_To()
  {
    return (EReference)partialOrderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPartialStateDescription()
  {
    return partialStateDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPartialStateDescription_ID()
  {
    return (EAttribute)partialStateDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathFormula()
  {
    return pathFormulaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateFormula()
  {
    return stateFormulaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtom()
  {
    return atomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtom_Predicate()
  {
    return (EAttribute)atomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtom_Concept()
  {
    return (EReference)atomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtom_Arguments()
  {
    return (EReference)atomEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTerm()
  {
    return termEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_Name()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstant_Concept()
  {
    return (EReference)constantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Name()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_Name()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Arguments()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNegation()
  {
    return negationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNegation_StateFormula()
  {
    return (EReference)negationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConjunction()
  {
    return conjunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConjunction_LeftStateFormula()
  {
    return (EReference)conjunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConjunction_RightStateFormula()
  {
    return (EReference)conjunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisjunction()
  {
    return disjunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisjunction_LeftStateFormula()
  {
    return (EReference)disjunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisjunction_RightStateFormula()
  {
    return (EReference)disjunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImplication()
  {
    return implicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplication_AntecedentStateFormula()
  {
    return (EReference)implicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplication_ConsequentStateFormula()
  {
    return (EReference)implicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForAllPaths()
  {
    return forAllPathsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForAllPaths_PathFormula()
  {
    return (EReference)forAllPathsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExistsPath()
  {
    return existsPathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExistsPath_PathFormula()
  {
    return (EReference)existsPathEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathNegation()
  {
    return pathNegationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathNegation_PathFormula()
  {
    return (EReference)pathNegationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathConjunction()
  {
    return pathConjunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathConjunction_LeftPathFormula()
  {
    return (EReference)pathConjunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathConjunction_RightPathFormula()
  {
    return (EReference)pathConjunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathDisjunction()
  {
    return pathDisjunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathDisjunction_LeftPathFormula()
  {
    return (EReference)pathDisjunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathDisjunction_RightPathFormula()
  {
    return (EReference)pathDisjunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathImplication()
  {
    return pathImplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathImplication_AntecedentPathFormula()
  {
    return (EReference)pathImplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathImplication_ConsequentPathFormula()
  {
    return (EReference)pathImplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNext()
  {
    return nextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNext_PathFormula()
  {
    return (EReference)nextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSometime()
  {
    return sometimeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSometime_PathFormula()
  {
    return (EReference)sometimeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlways()
  {
    return alwaysEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlways_PathFormula()
  {
    return (EReference)alwaysEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUntil()
  {
    return untilEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUntil_FromPathFormula()
  {
    return (EReference)untilEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUntil_UntilPathFormula()
  {
    return (EReference)untilEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOntology()
  {
    return ontologyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOntology_OntologyID()
  {
    return (EAttribute)ontologyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOntology_Classes()
  {
    return (EReference)ontologyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConcept()
  {
    return conceptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConcept_Concept()
  {
    return (EAttribute)conceptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConcept_URI()
  {
    return (EAttribute)conceptEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConcept_Type()
  {
    return (EAttribute)conceptEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCountsAs()
  {
    return countsAsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCountsAs_ConcreteFact()
  {
    return (EReference)countsAsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCountsAs_AbstractFact()
  {
    return (EReference)countsAsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCountsAs_Context()
  {
    return (EReference)countsAsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCountsAsConcreteFact()
  {
    return countsAsConcreteFactEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActions()
  {
    return actionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActions_Actions()
  {
    return (EReference)actionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionDescription()
  {
    return actionDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtomicAction()
  {
    return atomicActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtomicAction_Statement()
  {
    return (EAttribute)atomicActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSequence()
  {
    return sequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSequence_Actions()
  {
    return (EReference)sequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditional()
  {
    return conditionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditional_Condition()
  {
    return (EReference)conditionalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditional_Action()
  {
    return (EReference)conditionalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContext()
  {
    return contextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContext_Name()
  {
    return (EAttribute)contextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExists()
  {
    return existsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFirstOrderQuantifier()
  {
    return firstOrderQuantifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFirstOrderQuantifier_Variable()
  {
    return (EReference)firstOrderQuantifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFirstOrderQuantifier_Formula()
  {
    return (EReference)firstOrderQuantifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForAll()
  {
    return forAllEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDeonticModality()
  {
    return deonticModalityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRoleType()
  {
    return roleTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSceneType()
  {
    return sceneTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTransitionType()
  {
    return transitionTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTTSType()
  {
    return ttsTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getConceptType()
  {
    return conceptTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OMFactory getOMFactory()
  {
    return (OMFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    operAModelEClass = createEClass(OPER_AMODEL);
    createEAttribute(operAModelEClass, OPER_AMODEL__NAME);
    createEReference(operAModelEClass, OPER_AMODEL__OM);

    omEClass = createEClass(OM);
    createEReference(omEClass, OM__SS);
    createEReference(omEClass, OM__IS);
    createEReference(omEClass, OM__NS);
    createEReference(omEClass, OM__CS);

    ssEClass = createEClass(SS);
    createEReference(ssEClass, SS__ROLES);
    createEReference(ssEClass, SS__OBJECTIVES);
    createEReference(ssEClass, SS__DEPENDENCIES);

    isEClass = createEClass(IS);
    createEReference(isEClass, IS__SCENES);
    createEReference(isEClass, IS__TRANSITIONS);
    createEReference(isEClass, IS__ARCS);

    nsEClass = createEClass(NS);
    createEReference(nsEClass, NS__NORMS);
    createEReference(nsEClass, NS__TRANSITION_NORMS);

    csEClass = createEClass(CS);
    createEReference(csEClass, CS__FORMULAS);
    createEReference(csEClass, CS__ONTOLOGY);
    createEReference(csEClass, CS__TERMS);
    createEReference(csEClass, CS__COUNTS_AS_RULES);
    createEReference(csEClass, CS__CONTEXTS);
    createEReference(csEClass, CS__ACTION_LIBRARY);

    roleEClass = createEClass(ROLE);
    createEAttribute(roleEClass, ROLE__NAME);
    createEReference(roleEClass, ROLE__CONCEPT_NAME);
    createEReference(roleEClass, ROLE__OBJECTIVES);
    createEReference(roleEClass, ROLE__NORMS);
    createEReference(roleEClass, ROLE__RIGHTS);
    createEAttribute(roleEClass, ROLE__ROLE_TYPE);
    createEReference(roleEClass, ROLE__DEPENDANT_ON);
    createEReference(roleEClass, ROLE__DEPENDEE_IN);

    objectiveEClass = createEClass(OBJECTIVE);
    createEAttribute(objectiveEClass, OBJECTIVE__NAME);
    createEReference(objectiveEClass, OBJECTIVE__CONCEPT_NAME);
    createEReference(objectiveEClass, OBJECTIVE__STATE_DESCRIPTION);
    createEReference(objectiveEClass, OBJECTIVE__SUB_OBJECTIVES);
    createEReference(objectiveEClass, OBJECTIVE__PARENT_OBJECTIVE);
    createEReference(objectiveEClass, OBJECTIVE__USED_BY_ROLE);

    dependencyEClass = createEClass(DEPENDENCY);
    createEAttribute(dependencyEClass, DEPENDENCY__ID);
    createEAttribute(dependencyEClass, DEPENDENCY__NAME);
    createEReference(dependencyEClass, DEPENDENCY__OBJECT_OF_DEPENDENCY);

    normEClass = createEClass(NORM);
    createEAttribute(normEClass, NORM__NORM_ID);
    createEReference(normEClass, NORM__ACTIVATING_CONDITION);
    createEReference(normEClass, NORM__DEACTIVATING_CONDITION);
    createEReference(normEClass, NORM__MAINTENANCE_CONDITION);
    createEReference(normEClass, NORM__TIMEOUT);
    createEReference(normEClass, NORM__DEONTICS);
    createEReference(normEClass, NORM__REPAIR_CONDITION);

    deonticStatementEClass = createEClass(DEONTIC_STATEMENT);
    createEAttribute(deonticStatementEClass, DEONTIC_STATEMENT__MODALITY);
    createEReference(deonticStatementEClass, DEONTIC_STATEMENT__WHAT);

    individualDeonticStatementEClass = createEClass(INDIVIDUAL_DEONTIC_STATEMENT);
    createEReference(individualDeonticStatementEClass, INDIVIDUAL_DEONTIC_STATEMENT__ACTOR);

    roleDeonticStatementEClass = createEClass(ROLE_DEONTIC_STATEMENT);
    createEReference(roleDeonticStatementEClass, ROLE_DEONTIC_STATEMENT__ROLE);

    rightEClass = createEClass(RIGHT);
    createEAttribute(rightEClass, RIGHT__NAME);
    createEReference(rightEClass, RIGHT__EXPR);

    hierarchyDependencyEClass = createEClass(HIERARCHY_DEPENDENCY);
    createEReference(hierarchyDependencyEClass, HIERARCHY_DEPENDENCY__DEPENDANT);
    createEReference(hierarchyDependencyEClass, HIERARCHY_DEPENDENCY__DEPENDEE);

    marketDependencyEClass = createEClass(MARKET_DEPENDENCY);
    createEReference(marketDependencyEClass, MARKET_DEPENDENCY__DEPENDANT);
    createEReference(marketDependencyEClass, MARKET_DEPENDENCY__DEPENDEE);

    networkDependencyEClass = createEClass(NETWORK_DEPENDENCY);
    createEReference(networkDependencyEClass, NETWORK_DEPENDENCY__DEPENDANT1);
    createEReference(networkDependencyEClass, NETWORK_DEPENDENCY__DEPENDANT2);

    sceneEClass = createEClass(SCENE);
    createEAttribute(sceneEClass, SCENE__SCENE_ID);
    createEReference(sceneEClass, SCENE__PLAYERS);
    createEReference(sceneEClass, SCENE__RESULTS);
    createEReference(sceneEClass, SCENE__INTERACTION_PATTERN);
    createEAttribute(sceneEClass, SCENE__DESCRIPTION);
    createEAttribute(sceneEClass, SCENE__TYPE);

    transitionEClass = createEClass(TRANSITION);
    createEAttribute(transitionEClass, TRANSITION__TRANSITION_ID);
    createEAttribute(transitionEClass, TRANSITION__TRANSITION_TYPE);
    createEReference(transitionEClass, TRANSITION__NORMS);

    arcEClass = createEClass(ARC);
    createEAttribute(arcEClass, ARC__ARC_ID);
    createEReference(arcEClass, ARC__ACCESSIBLE);

    sceneToTransitionArcEClass = createEClass(SCENE_TO_TRANSITION_ARC);
    createEReference(sceneToTransitionArcEClass, SCENE_TO_TRANSITION_ARC__FROM);
    createEReference(sceneToTransitionArcEClass, SCENE_TO_TRANSITION_ARC__TO);

    transitionToSceneArcEClass = createEClass(TRANSITION_TO_SCENE_ARC);
    createEReference(transitionToSceneArcEClass, TRANSITION_TO_SCENE_ARC__FROM);
    createEReference(transitionToSceneArcEClass, TRANSITION_TO_SCENE_ARC__TO);
    createEAttribute(transitionToSceneArcEClass, TRANSITION_TO_SCENE_ARC__TYPE);

    playerEClass = createEClass(PLAYER);
    createEAttribute(playerEClass, PLAYER__PLAYER_ID);
    createEReference(playerEClass, PLAYER__ROLE);

    landmarkPatternEClass = createEClass(LANDMARK_PATTERN);
    createEReference(landmarkPatternEClass, LANDMARK_PATTERN__LANDMARKS);
    createEReference(landmarkPatternEClass, LANDMARK_PATTERN__LANDMARK_ORDER);

    landmarkEClass = createEClass(LANDMARK);
    createEAttribute(landmarkEClass, LANDMARK__NAME);
    createEReference(landmarkEClass, LANDMARK__STATE_DESCRIPTION);
    createEReference(landmarkEClass, LANDMARK__ENTAILS);
    createEAttribute(landmarkEClass, LANDMARK__IS_RESULT);

    transitionNormEClass = createEClass(TRANSITION_NORM);
    createEAttribute(transitionNormEClass, TRANSITION_NORM__ID);
    createEReference(transitionNormEClass, TRANSITION_NORM__FROM_SCENE);
    createEReference(transitionNormEClass, TRANSITION_NORM__FROM_PLAYERS);
    createEReference(transitionNormEClass, TRANSITION_NORM__FROM_RESULTS);
    createEReference(transitionNormEClass, TRANSITION_NORM__TO_SCENE);
    createEReference(transitionNormEClass, TRANSITION_NORM__TO_PLAYER);
    createEReference(transitionNormEClass, TRANSITION_NORM__ATTACHED_TO);

    partialOrderEClass = createEClass(PARTIAL_ORDER);
    createEAttribute(partialOrderEClass, PARTIAL_ORDER__NAME);
    createEReference(partialOrderEClass, PARTIAL_ORDER__FROM);
    createEReference(partialOrderEClass, PARTIAL_ORDER__TO);

    partialStateDescriptionEClass = createEClass(PARTIAL_STATE_DESCRIPTION);
    createEAttribute(partialStateDescriptionEClass, PARTIAL_STATE_DESCRIPTION__ID);

    pathFormulaEClass = createEClass(PATH_FORMULA);

    stateFormulaEClass = createEClass(STATE_FORMULA);

    atomEClass = createEClass(ATOM);
    createEAttribute(atomEClass, ATOM__PREDICATE);
    createEReference(atomEClass, ATOM__CONCEPT);
    createEReference(atomEClass, ATOM__ARGUMENTS);

    termEClass = createEClass(TERM);

    constantEClass = createEClass(CONSTANT);
    createEAttribute(constantEClass, CONSTANT__NAME);
    createEReference(constantEClass, CONSTANT__CONCEPT);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__NAME);

    functionEClass = createEClass(FUNCTION);
    createEAttribute(functionEClass, FUNCTION__NAME);
    createEReference(functionEClass, FUNCTION__ARGUMENTS);

    negationEClass = createEClass(NEGATION);
    createEReference(negationEClass, NEGATION__STATE_FORMULA);

    conjunctionEClass = createEClass(CONJUNCTION);
    createEReference(conjunctionEClass, CONJUNCTION__LEFT_STATE_FORMULA);
    createEReference(conjunctionEClass, CONJUNCTION__RIGHT_STATE_FORMULA);

    disjunctionEClass = createEClass(DISJUNCTION);
    createEReference(disjunctionEClass, DISJUNCTION__LEFT_STATE_FORMULA);
    createEReference(disjunctionEClass, DISJUNCTION__RIGHT_STATE_FORMULA);

    implicationEClass = createEClass(IMPLICATION);
    createEReference(implicationEClass, IMPLICATION__ANTECEDENT_STATE_FORMULA);
    createEReference(implicationEClass, IMPLICATION__CONSEQUENT_STATE_FORMULA);

    forAllPathsEClass = createEClass(FOR_ALL_PATHS);
    createEReference(forAllPathsEClass, FOR_ALL_PATHS__PATH_FORMULA);

    existsPathEClass = createEClass(EXISTS_PATH);
    createEReference(existsPathEClass, EXISTS_PATH__PATH_FORMULA);

    pathNegationEClass = createEClass(PATH_NEGATION);
    createEReference(pathNegationEClass, PATH_NEGATION__PATH_FORMULA);

    pathConjunctionEClass = createEClass(PATH_CONJUNCTION);
    createEReference(pathConjunctionEClass, PATH_CONJUNCTION__LEFT_PATH_FORMULA);
    createEReference(pathConjunctionEClass, PATH_CONJUNCTION__RIGHT_PATH_FORMULA);

    pathDisjunctionEClass = createEClass(PATH_DISJUNCTION);
    createEReference(pathDisjunctionEClass, PATH_DISJUNCTION__LEFT_PATH_FORMULA);
    createEReference(pathDisjunctionEClass, PATH_DISJUNCTION__RIGHT_PATH_FORMULA);

    pathImplicationEClass = createEClass(PATH_IMPLICATION);
    createEReference(pathImplicationEClass, PATH_IMPLICATION__ANTECEDENT_PATH_FORMULA);
    createEReference(pathImplicationEClass, PATH_IMPLICATION__CONSEQUENT_PATH_FORMULA);

    nextEClass = createEClass(NEXT);
    createEReference(nextEClass, NEXT__PATH_FORMULA);

    sometimeEClass = createEClass(SOMETIME);
    createEReference(sometimeEClass, SOMETIME__PATH_FORMULA);

    alwaysEClass = createEClass(ALWAYS);
    createEReference(alwaysEClass, ALWAYS__PATH_FORMULA);

    untilEClass = createEClass(UNTIL);
    createEReference(untilEClass, UNTIL__FROM_PATH_FORMULA);
    createEReference(untilEClass, UNTIL__UNTIL_PATH_FORMULA);

    ontologyEClass = createEClass(ONTOLOGY);
    createEAttribute(ontologyEClass, ONTOLOGY__ONTOLOGY_ID);
    createEReference(ontologyEClass, ONTOLOGY__CLASSES);

    conceptEClass = createEClass(CONCEPT);
    createEAttribute(conceptEClass, CONCEPT__CONCEPT);
    createEAttribute(conceptEClass, CONCEPT__URI);
    createEAttribute(conceptEClass, CONCEPT__TYPE);

    countsAsEClass = createEClass(COUNTS_AS);
    createEReference(countsAsEClass, COUNTS_AS__CONCRETE_FACT);
    createEReference(countsAsEClass, COUNTS_AS__ABSTRACT_FACT);
    createEReference(countsAsEClass, COUNTS_AS__CONTEXT);

    countsAsConcreteFactEClass = createEClass(COUNTS_AS_CONCRETE_FACT);

    actionsEClass = createEClass(ACTIONS);
    createEReference(actionsEClass, ACTIONS__ACTIONS);

    actionDescriptionEClass = createEClass(ACTION_DESCRIPTION);

    atomicActionEClass = createEClass(ATOMIC_ACTION);
    createEAttribute(atomicActionEClass, ATOMIC_ACTION__STATEMENT);

    sequenceEClass = createEClass(SEQUENCE);
    createEReference(sequenceEClass, SEQUENCE__ACTIONS);

    conditionalEClass = createEClass(CONDITIONAL);
    createEReference(conditionalEClass, CONDITIONAL__CONDITION);
    createEReference(conditionalEClass, CONDITIONAL__ACTION);

    contextEClass = createEClass(CONTEXT);
    createEAttribute(contextEClass, CONTEXT__NAME);

    existsEClass = createEClass(EXISTS);

    firstOrderQuantifierEClass = createEClass(FIRST_ORDER_QUANTIFIER);
    createEReference(firstOrderQuantifierEClass, FIRST_ORDER_QUANTIFIER__VARIABLE);
    createEReference(firstOrderQuantifierEClass, FIRST_ORDER_QUANTIFIER__FORMULA);

    forAllEClass = createEClass(FOR_ALL);

    // Create enums
    deonticModalityEEnum = createEEnum(DEONTIC_MODALITY);
    roleTypeEEnum = createEEnum(ROLE_TYPE);
    sceneTypeEEnum = createEEnum(SCENE_TYPE);
    transitionTypeEEnum = createEEnum(TRANSITION_TYPE);
    ttsTypeEEnum = createEEnum(TTS_TYPE);
    conceptTypeEEnum = createEEnum(CONCEPT_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    individualDeonticStatementEClass.getESuperTypes().add(this.getDeonticStatement());
    roleDeonticStatementEClass.getESuperTypes().add(this.getDeonticStatement());
    hierarchyDependencyEClass.getESuperTypes().add(this.getDependency());
    marketDependencyEClass.getESuperTypes().add(this.getDependency());
    networkDependencyEClass.getESuperTypes().add(this.getDependency());
    sceneToTransitionArcEClass.getESuperTypes().add(this.getArc());
    transitionToSceneArcEClass.getESuperTypes().add(this.getArc());
    pathFormulaEClass.getESuperTypes().add(this.getPartialStateDescription());
    stateFormulaEClass.getESuperTypes().add(this.getPathFormula());
    stateFormulaEClass.getESuperTypes().add(this.getCountsAsConcreteFact());
    atomEClass.getESuperTypes().add(this.getStateFormula());
    constantEClass.getESuperTypes().add(this.getTerm());
    variableEClass.getESuperTypes().add(this.getTerm());
    functionEClass.getESuperTypes().add(this.getTerm());
    negationEClass.getESuperTypes().add(this.getStateFormula());
    conjunctionEClass.getESuperTypes().add(this.getStateFormula());
    disjunctionEClass.getESuperTypes().add(this.getStateFormula());
    implicationEClass.getESuperTypes().add(this.getStateFormula());
    forAllPathsEClass.getESuperTypes().add(this.getStateFormula());
    existsPathEClass.getESuperTypes().add(this.getStateFormula());
    pathNegationEClass.getESuperTypes().add(this.getPathFormula());
    pathConjunctionEClass.getESuperTypes().add(this.getPathFormula());
    pathDisjunctionEClass.getESuperTypes().add(this.getPathFormula());
    pathImplicationEClass.getESuperTypes().add(this.getPathFormula());
    nextEClass.getESuperTypes().add(this.getPathFormula());
    sometimeEClass.getESuperTypes().add(this.getPathFormula());
    alwaysEClass.getESuperTypes().add(this.getPathFormula());
    untilEClass.getESuperTypes().add(this.getPathFormula());
    actionDescriptionEClass.getESuperTypes().add(this.getCountsAsConcreteFact());
    atomicActionEClass.getESuperTypes().add(this.getActionDescription());
    sequenceEClass.getESuperTypes().add(this.getActionDescription());
    conditionalEClass.getESuperTypes().add(this.getActionDescription());
    existsEClass.getESuperTypes().add(this.getFirstOrderQuantifier());
    firstOrderQuantifierEClass.getESuperTypes().add(this.getPartialStateDescription());
    forAllEClass.getESuperTypes().add(this.getFirstOrderQuantifier());

    // Initialize classes, features, and operations; add parameters
    initEClass(operAModelEClass, OperAModel.class, "OperAModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperAModel_Name(), theEcorePackage.getEString(), "Name", null, 1, 1, OperAModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperAModel_Om(), this.getOM(), null, "om", null, 1, 1, OperAModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(omEClass, OM.OM.class, "OM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOM_Ss(), this.getSS(), null, "ss", null, 1, 1, OM.OM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOM_Is(), this.getIS(), null, "is", null, 1, 1, OM.OM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOM_Ns(), this.getNS(), null, "ns", null, 1, 1, OM.OM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOM_Cs(), this.getCS(), null, "cs", null, 1, 1, OM.OM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ssEClass, OM.SS.class, "SS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSS_Roles(), this.getRole(), null, "roles", null, 1, -1, OM.SS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSS_Objectives(), this.getObjective(), null, "objectives", null, 1, -1, OM.SS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSS_Dependencies(), this.getDependency(), null, "dependencies", null, 1, -1, OM.SS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(isEClass, OM.IS.class, "IS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIS_Scenes(), this.getScene(), null, "scenes", null, 2, -1, OM.IS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    getIS_Scenes().getEKeys().add(this.getScene_SceneID());
    initEReference(getIS_Transitions(), this.getTransition(), null, "transitions", null, 1, -1, OM.IS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    getIS_Transitions().getEKeys().add(this.getTransition_TransitionID());
    initEReference(getIS_Arcs(), this.getArc(), null, "arcs", null, 2, -1, OM.IS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    getIS_Arcs().getEKeys().add(this.getArc_ArcID());

    initEClass(nsEClass, OM.NS.class, "NS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNS_Norms(), this.getNorm(), null, "norms", null, 0, -1, OM.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    getNS_Norms().getEKeys().add(this.getNorm_NormID());
    initEReference(getNS_TransitionNorms(), this.getTransitionNorm(), null, "transitionNorms", null, 0, -1, OM.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    getNS_TransitionNorms().getEKeys().add(this.getTransitionNorm_ID());

    initEClass(csEClass, OM.CS.class, "CS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCS_Formulas(), this.getPartialStateDescription(), null, "formulas", null, 0, -1, OM.CS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCS_Ontology(), this.getOntology(), null, "ontology", null, 1, -1, OM.CS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCS_Terms(), this.getTerm(), null, "terms", null, 0, -1, OM.CS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCS_CountsAsRules(), this.getCountsAs(), null, "countsAsRules", null, 0, -1, OM.CS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCS_Contexts(), this.getContext(), null, "contexts", null, 0, -1, OM.CS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCS_ActionLibrary(), this.getActions(), null, "actionLibrary", null, 1, 1, OM.CS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRole_Name(), theEcorePackage.getEString(), "Name", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getRole_ConceptName(), this.getConcept(), null, "conceptName", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    getRole_ConceptName().getEKeys().add(this.getConcept_Concept());
    initEReference(getRole_Objectives(), this.getObjective(), null, "objectives", null, 1, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRole_Norms(), this.getNorm(), null, "norms", null, 0, -1, Role.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getRole_Rights(), this.getRight(), null, "rights", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRole_RoleType(), this.getRoleType(), "RoleType", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRole_DependantOn(), this.getDependency(), null, "DependantOn", null, 0, -1, Role.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getRole_DependeeIn(), this.getDependency(), null, "DependeeIn", null, 0, -1, Role.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(objectiveEClass, Objective.class, "Objective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjective_Name(), theEcorePackage.getEString(), "Name", null, 1, 1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjective_ConceptName(), this.getConcept(), null, "conceptName", null, 1, 1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjective_StateDescription(), this.getPartialStateDescription(), null, "stateDescription", null, 1, 1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjective_SubObjectives(), this.getObjective(), null, "subObjectives", null, 0, -1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    getObjective_SubObjectives().getEKeys().add(this.getObjective_Name());
    initEReference(getObjective_ParentObjective(), this.getObjective(), null, "parentObjective", null, 0, -1, Objective.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    getObjective_ParentObjective().getEKeys().add(this.getObjective_Name());
    initEReference(getObjective_UsedByRole(), this.getRole(), null, "usedByRole", null, 0, -1, Objective.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(dependencyEClass, Dependency.class, "Dependency", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDependency_ID(), theEcorePackage.getEString(), "ID", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDependency_Name(), theEcorePackage.getEString(), "Name", "", 1, 1, Dependency.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDependency_ObjectOfDependency(), this.getObjective(), null, "ObjectOfDependency", null, 1, -1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(normEClass, Norm.class, "Norm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNorm_NormID(), theEcorePackage.getEString(), "normID", null, 1, 1, Norm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNorm_ActivatingCondition(), this.getPartialStateDescription(), null, "activatingCondition", null, 1, 1, Norm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNorm_DeactivatingCondition(), this.getPartialStateDescription(), null, "deactivatingCondition", null, 1, 1, Norm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNorm_MaintenanceCondition(), this.getPartialStateDescription(), null, "maintenanceCondition", null, 1, 1, Norm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNorm_Timeout(), this.getPartialStateDescription(), null, "timeout", null, 0, 1, Norm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNorm_Deontics(), this.getDeonticStatement(), null, "deontics", null, 1, 1, Norm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNorm_RepairCondition(), this.getPartialStateDescription(), null, "repairCondition", null, 0, 1, Norm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deonticStatementEClass, DeonticStatement.class, "DeonticStatement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeonticStatement_Modality(), this.getDeonticModality(), "modality", null, 1, 1, DeonticStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeonticStatement_What(), this.getPartialStateDescription(), null, "what", null, 1, 1, DeonticStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(individualDeonticStatementEClass, IndividualDeonticStatement.class, "IndividualDeonticStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIndividualDeonticStatement_Actor(), this.getPlayer(), null, "actor", null, 1, 1, IndividualDeonticStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    getIndividualDeonticStatement_Actor().getEKeys().add(this.getPlayer_PlayerID());

    initEClass(roleDeonticStatementEClass, RoleDeonticStatement.class, "RoleDeonticStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRoleDeonticStatement_Role(), this.getRole(), null, "role", null, 1, 1, RoleDeonticStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rightEClass, Right.class, "Right", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRight_Name(), theEcorePackage.getEString(), "Name", null, 1, 1, Right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRight_Expr(), this.getPartialStateDescription(), null, "Expr", null, 1, 1, Right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hierarchyDependencyEClass, HierarchyDependency.class, "HierarchyDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHierarchyDependency_Dependant(), this.getRole(), null, "Dependant", null, 1, 1, HierarchyDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHierarchyDependency_Dependee(), this.getRole(), null, "Dependee", null, 1, 1, HierarchyDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(marketDependencyEClass, MarketDependency.class, "MarketDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMarketDependency_Dependant(), this.getRole(), null, "Dependant", null, 1, 1, MarketDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMarketDependency_Dependee(), this.getRole(), null, "Dependee", null, 1, 1, MarketDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(networkDependencyEClass, NetworkDependency.class, "NetworkDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNetworkDependency_Dependant1(), this.getRole(), null, "Dependant1", null, 1, 1, NetworkDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNetworkDependency_Dependant2(), this.getRole(), null, "Dependant2", null, 1, 1, NetworkDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sceneEClass, Scene.class, "Scene", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScene_SceneID(), theEcorePackage.getEString(), "sceneID", null, 1, 1, Scene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScene_Players(), this.getPlayer(), null, "players", null, 1, -1, Scene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScene_Results(), this.getLandmark(), null, "results", null, 1, -1, Scene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScene_InteractionPattern(), this.getLandmarkPattern(), null, "interactionPattern", null, 1, 1, Scene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScene_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Scene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScene_Type(), this.getSceneType(), "type", null, 1, 1, Scene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransition_TransitionID(), theEcorePackage.getEString(), "transitionID", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransition_TransitionType(), this.getTransitionType(), "transitionType", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransition_Norms(), this.getTransitionNorm(), null, "norms", null, 1, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arcEClass, Arc.class, "Arc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArc_ArcID(), theEcorePackage.getEString(), "arcID", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getArc_Accessible(), this.getRole(), null, "accessible", null, 1, -1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sceneToTransitionArcEClass, SceneToTransitionArc.class, "SceneToTransitionArc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSceneToTransitionArc_From(), this.getScene(), null, "from", null, 1, 1, SceneToTransitionArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    getSceneToTransitionArc_From().getEKeys().add(this.getScene_SceneID());
    initEReference(getSceneToTransitionArc_To(), this.getTransition(), null, "to", null, 1, 1, SceneToTransitionArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    getSceneToTransitionArc_To().getEKeys().add(this.getTransition_TransitionID());

    initEClass(transitionToSceneArcEClass, TransitionToSceneArc.class, "TransitionToSceneArc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitionToSceneArc_From(), this.getTransition(), null, "from", null, 1, 1, TransitionToSceneArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    getTransitionToSceneArc_From().getEKeys().add(this.getTransition_TransitionID());
    initEReference(getTransitionToSceneArc_To(), this.getScene(), null, "to", null, 1, 1, TransitionToSceneArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    getTransitionToSceneArc_To().getEKeys().add(this.getScene_SceneID());
    initEAttribute(getTransitionToSceneArc_Type(), this.getTTSType(), "type", null, 1, 1, TransitionToSceneArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(playerEClass, Player.class, "Player", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPlayer_PlayerID(), theEcorePackage.getEChar(), "playerID", null, 1, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlayer_Role(), this.getRole(), null, "role", null, 1, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(landmarkPatternEClass, LandmarkPattern.class, "LandmarkPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLandmarkPattern_Landmarks(), this.getLandmark(), null, "landmarks", null, 2, -1, LandmarkPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    getLandmarkPattern_Landmarks().getEKeys().add(this.getLandmark_Name());
    initEReference(getLandmarkPattern_LandmarkOrder(), this.getPartialOrder(), null, "landmarkOrder", null, 1, -1, LandmarkPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(landmarkEClass, Landmark.class, "Landmark", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLandmark_Name(), theEcorePackage.getEString(), "name", null, 1, 1, Landmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLandmark_StateDescription(), this.getPartialStateDescription(), null, "stateDescription", null, 1, 1, Landmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLandmark_Entails(), this.getObjective(), null, "entails", null, 0, -1, Landmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLandmark_IsResult(), theEcorePackage.getEBoolean(), "isResult", "false", 1, 1, Landmark.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionNormEClass, TransitionNorm.class, "TransitionNorm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransitionNorm_ID(), theEcorePackage.getEString(), "ID", null, 1, 1, TransitionNorm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionNorm_FromScene(), this.getScene(), null, "fromScene", null, 1, 1, TransitionNorm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionNorm_FromPlayers(), this.getPlayer(), null, "fromPlayers", null, 1, -1, TransitionNorm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionNorm_FromResults(), this.getLandmark(), null, "fromResults", null, 1, -1, TransitionNorm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionNorm_ToScene(), this.getScene(), null, "toScene", null, 1, 1, TransitionNorm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionNorm_ToPlayer(), this.getPlayer(), null, "toPlayer", null, 1, 1, TransitionNorm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionNorm_AttachedTo(), this.getTransition(), null, "attachedTo", null, 1, 1, TransitionNorm.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(partialOrderEClass, PartialOrder.class, "PartialOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPartialOrder_Name(), theEcorePackage.getEString(), "name", null, 1, 1, PartialOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getPartialOrder_From(), this.getLandmark(), null, "from", null, 1, 1, PartialOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPartialOrder_To(), this.getLandmark(), null, "to", null, 1, 1, PartialOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(partialStateDescriptionEClass, PartialStateDescription.class, "PartialStateDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPartialStateDescription_ID(), theEcorePackage.getEString(), "ID", null, 1, 1, PartialStateDescription.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(pathFormulaEClass, PathFormula.class, "PathFormula", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stateFormulaEClass, StateFormula.class, "StateFormula", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(atomEClass, Atom.class, "Atom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtom_Predicate(), theEcorePackage.getEString(), "predicate", null, 1, 1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtom_Concept(), this.getConcept(), null, "concept", null, 1, 1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtom_Arguments(), this.getTerm(), null, "arguments", null, 0, -1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(termEClass, Term.class, "Term", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstant_Name(), theEcorePackage.getEString(), "name", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstant_Concept(), this.getConcept(), null, "concept", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_Name(), theEcorePackage.getEString(), "name", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunction_Name(), theEcorePackage.getEString(), "name", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_Arguments(), this.getTerm(), null, "arguments", null, 1, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(negationEClass, Negation.class, "Negation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNegation_StateFormula(), this.getStateFormula(), null, "stateFormula", null, 1, 1, Negation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conjunctionEClass, Conjunction.class, "Conjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConjunction_LeftStateFormula(), this.getStateFormula(), null, "leftStateFormula", null, 1, 1, Conjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConjunction_RightStateFormula(), this.getStateFormula(), null, "rightStateFormula", null, 1, 1, Conjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(disjunctionEClass, Disjunction.class, "Disjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDisjunction_LeftStateFormula(), this.getStateFormula(), null, "leftStateFormula", null, 1, 1, Disjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDisjunction_RightStateFormula(), this.getStateFormula(), null, "rightStateFormula", null, 1, 1, Disjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(implicationEClass, Implication.class, "Implication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImplication_AntecedentStateFormula(), this.getStateFormula(), null, "antecedentStateFormula", null, 1, 1, Implication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImplication_ConsequentStateFormula(), this.getStateFormula(), null, "consequentStateFormula", null, 1, 1, Implication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forAllPathsEClass, ForAllPaths.class, "ForAllPaths", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForAllPaths_PathFormula(), this.getPathFormula(), null, "pathFormula", null, 1, 1, ForAllPaths.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(existsPathEClass, ExistsPath.class, "ExistsPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExistsPath_PathFormula(), this.getPathFormula(), null, "pathFormula", null, 1, 1, ExistsPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathNegationEClass, PathNegation.class, "PathNegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPathNegation_PathFormula(), this.getPathFormula(), null, "pathFormula", null, 1, 1, PathNegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathConjunctionEClass, PathConjunction.class, "PathConjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPathConjunction_LeftPathFormula(), this.getPathFormula(), null, "leftPathFormula", null, 1, 1, PathConjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPathConjunction_RightPathFormula(), this.getPathFormula(), null, "rightPathFormula", null, 1, 1, PathConjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathDisjunctionEClass, PathDisjunction.class, "PathDisjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPathDisjunction_LeftPathFormula(), this.getPathFormula(), null, "leftPathFormula", null, 1, 1, PathDisjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPathDisjunction_RightPathFormula(), this.getPathFormula(), null, "rightPathFormula", null, 1, 1, PathDisjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathImplicationEClass, PathImplication.class, "PathImplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPathImplication_AntecedentPathFormula(), this.getPathFormula(), null, "antecedentPathFormula", null, 1, 1, PathImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPathImplication_ConsequentPathFormula(), this.getPathFormula(), null, "consequentPathFormula", null, 1, 1, PathImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nextEClass, Next.class, "Next", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNext_PathFormula(), this.getPathFormula(), null, "pathFormula", null, 1, 1, Next.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sometimeEClass, Sometime.class, "Sometime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSometime_PathFormula(), this.getPathFormula(), null, "pathFormula", null, 1, 1, Sometime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alwaysEClass, Always.class, "Always", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlways_PathFormula(), this.getPathFormula(), null, "pathFormula", null, 1, 1, Always.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(untilEClass, Until.class, "Until", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUntil_FromPathFormula(), this.getPathFormula(), null, "fromPathFormula", null, 1, 1, Until.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUntil_UntilPathFormula(), this.getPathFormula(), null, "untilPathFormula", null, 1, 1, Until.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ontologyEClass, Ontology.class, "Ontology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOntology_OntologyID(), theEcorePackage.getEString(), "ontologyID", null, 1, 1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOntology_Classes(), this.getConcept(), null, "classes", null, 1, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    getOntology_Classes().getEKeys().add(this.getConcept_Concept());

    initEClass(conceptEClass, Concept.class, "Concept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConcept_Concept(), theEcorePackage.getEString(), "concept", null, 1, 1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConcept_URI(), theEcorePackage.getEString(), "URI", null, 0, 1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConcept_Type(), this.getConceptType(), "type", "", 1, 1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(countsAsEClass, CountsAs.class, "CountsAs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCountsAs_ConcreteFact(), this.getCountsAsConcreteFact(), null, "concreteFact", null, 1, 1, CountsAs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCountsAs_AbstractFact(), this.getPartialStateDescription(), null, "abstractFact", null, 1, 1, CountsAs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCountsAs_Context(), this.getContext(), null, "context", null, 0, 1, CountsAs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(countsAsConcreteFactEClass, CountsAsConcreteFact.class, "CountsAsConcreteFact", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(actionsEClass, Actions.class, "Actions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActions_Actions(), this.getActionDescription(), null, "actions", null, 0, -1, Actions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionDescriptionEClass, ActionDescription.class, "ActionDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(atomicActionEClass, AtomicAction.class, "AtomicAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtomicAction_Statement(), theEcorePackage.getEString(), "statement", null, 1, 1, AtomicAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSequence_Actions(), this.getActionDescription(), null, "actions", null, 2, 2, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionalEClass, Conditional.class, "Conditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditional_Condition(), this.getStateFormula(), null, "condition", null, 1, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditional_Action(), this.getActionDescription(), null, "action", null, 1, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContext_Name(), theEcorePackage.getEString(), "Name", null, 1, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(existsEClass, Exists.class, "Exists", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(firstOrderQuantifierEClass, FirstOrderQuantifier.class, "FirstOrderQuantifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFirstOrderQuantifier_Variable(), this.getVariable(), null, "variable", null, 1, 1, FirstOrderQuantifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFirstOrderQuantifier_Formula(), this.getPartialStateDescription(), null, "formula", null, 1, 1, FirstOrderQuantifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forAllEClass, ForAll.class, "ForAll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(deonticModalityEEnum, DeonticModality.class, "DeonticModality");
    addEEnumLiteral(deonticModalityEEnum, DeonticModality.OBLIGATION);
    addEEnumLiteral(deonticModalityEEnum, DeonticModality.PROHIBITION);
    addEEnumLiteral(deonticModalityEEnum, DeonticModality.PERMISSION);

    initEEnum(roleTypeEEnum, RoleType.class, "RoleType");
    addEEnumLiteral(roleTypeEEnum, RoleType.INTERNAL);
    addEEnumLiteral(roleTypeEEnum, RoleType.EXTERNAL);

    initEEnum(sceneTypeEEnum, SceneType.class, "SceneType");
    addEEnumLiteral(sceneTypeEEnum, SceneType.NORMAL);
    addEEnumLiteral(sceneTypeEEnum, SceneType.START);
    addEEnumLiteral(sceneTypeEEnum, SceneType.END);

    initEEnum(transitionTypeEEnum, TransitionType.class, "TransitionType");
    addEEnumLiteral(transitionTypeEEnum, TransitionType.AND);
    addEEnumLiteral(transitionTypeEEnum, TransitionType.OR);
    addEEnumLiteral(transitionTypeEEnum, TransitionType.XOR);

    initEEnum(ttsTypeEEnum, TTSType.class, "TTSType");
    addEEnumLiteral(ttsTypeEEnum, TTSType.NEW_SCENE);
    addEEnumLiteral(ttsTypeEEnum, TTSType.JOIN_INSTANCE);

    initEEnum(conceptTypeEEnum, ConceptType.class, "ConceptType");
    addEEnumLiteral(conceptTypeEEnum, ConceptType.CLASS);
    addEEnumLiteral(conceptTypeEEnum, ConceptType.PROPERTY);
    addEEnumLiteral(conceptTypeEEnum, ConceptType.INDIVIDUAL);

    // Create resource
    createResource(eNS_URI);
  }

} //OMPackageImpl
