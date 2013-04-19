/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.impl;

import control.AbstractProcess;
import control.AnyOrder;
import control.AtomicProcess;
import control.Binding;
import control.Body;
import control.Choice;
import control.CompositeProcess;
import control.Condition;
import control.ControlConstruct;
import control.ControlConstructBag;
import control.ControlConstructList;
import control.ControlFactory;
import control.ControlPackage;
import control.Expr;
import control.ExpressionLanguage;
import control.Head;
import control.IfThenElse;
import control.Implies;
import control.InnerProcess;
import control.Input;
import control.InputBinding;
import control.Link;
import control.LinkBinding;
import control.Loc;
import control.LocBinding;
import control.Local;
import control.NamedElement;
import control.Ontology;
import control.OuterProcess;
import control.Output;
import control.OutputBinding;
import control.Parameter;
import control.Perform;
import control.ProcessVar;
import control.Produce;
import control.RemoteProcess;
import control.RepeatUntil;
import control.RepeatWhile;
import control.Result;
import control.ResultVar;
import control.Sequence;
import control.Set;
import control.SetBinding;
import control.Split;
import control.SplitJoin;
import control.TemplateConstraint;
import control.TemplateProcess;
import control.ValueForm;
import control.ValueFunction;
import control.ValueSource;
import control.ValueSpecifier;
import control.ValueSpecifierElement;
import control.outputBindingSource;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlPackageImpl extends EPackageImpl implements ControlPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass namedElementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass processVarEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass parameterEClass = null;

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
	private EClass templateConstraintEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass inputEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass outputEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass outerProcessEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractProcessEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass remoteProcessEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass templateProcessEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass controlConstructEClass = null;

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
  private EClass choiceEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass anyOrderEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass splitEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass splitJoinEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass ifThenElseEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass repeatUntilEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass repeatWhileEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass performEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass produceEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass setEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass valueSpecifierEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass valueSpecifierElementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass valueSourceEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass valueFormEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass valueFunctionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass bindingEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass setBindingEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass inputBindingEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass outputBindingEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass locBindingEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass linkBindingEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass outputBindingSourceEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass resultEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass resultVarEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass localEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass locEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass linkEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass controlConstructBagEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass controlConstructListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass conditionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass exprEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum expressionLanguageEEnum = null;

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
	 * @see control.ControlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ControlPackageImpl()
  {
		super(eNS_URI, ControlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ControlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ControlPackage init()
  {
		if (isInited) return (ControlPackage)EPackage.Registry.INSTANCE.getEPackage(ControlPackage.eNS_URI);

		// Obtain or create and register package
		ControlPackageImpl theControlPackage = (ControlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ControlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ControlPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theControlPackage.createPackageContents();

		// Initialize created meta-data
		theControlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theControlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ControlPackage.eNS_URI, theControlPackage);
		return theControlPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getNamedElement()
  {
		return namedElementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNamedElement_Name()
  {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getProcessVar()
  {
		return processVarEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getProcessVar_ParameterType()
  {
		return (EAttribute)processVarEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getProcessVar_ParameterValue()
  {
		return (EAttribute)processVarEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getParameter()
  {
		return parameterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOntology() {
		return ontologyEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOntology_OntologyURI() {
		return (EAttribute)ontologyEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateConstraint() {
		return templateConstraintEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateConstraint_AspCode() {
		return (EAttribute)templateConstraintEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateConstraint_AspBinding() {
		return (EAttribute)templateConstraintEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getInput()
  {
		return inputEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getOutput()
  {
		return outputEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getOuterProcess()
  {
		return outerProcessEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOuterProcess_Construct()
  {
		return (EReference)outerProcessEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOuterProcess_HasInput()
  {
		return (EReference)outerProcessEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOuterProcess_HasOutput()
  {
		return (EReference)outerProcessEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOuterProcess_HasPrecondition()
  {
		return (EReference)outerProcessEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOuterProcess_HasResult()
  {
		return (EReference)outerProcessEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOuterProcess_Bindings()
  {
		return (EReference)outerProcessEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOuterProcess_OuterLocals()
  {
		return (EReference)outerProcessEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOuterProcess_OuterLinks()
  {
		return (EReference)outerProcessEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOuterProcess_Ontologies() {
		return (EReference)outerProcessEClass.getEStructuralFeatures().get(8);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOuterProcess_TemplateConstraints() {
		return (EReference)outerProcessEClass.getEStructuralFeatures().get(9);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOuterProcess_ServiceName() {
		return (EAttribute)outerProcessEClass.getEStructuralFeatures().get(10);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getOuterProcess_ServiceURI()
  {
		return (EAttribute)outerProcessEClass.getEStructuralFeatures().get(11);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getOuterProcess_ServiceDescription()
  {
		return (EAttribute)outerProcessEClass.getEStructuralFeatures().get(12);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractProcess()
  {
		return abstractProcessEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractProcess_HasInput()
  {
		return (EReference)abstractProcessEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractProcess_HasOutput()
  {
		return (EReference)abstractProcessEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRemoteProcess()
  {
		return remoteProcessEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRemoteProcess_RemoteURI()
  {
		return (EAttribute)remoteProcessEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRemoteProcess_RemoteURL()
  {
		return (EAttribute)remoteProcessEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRemoteProcess_HasResult()
  {
		return (EReference)remoteProcessEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRemoteProcess_Expressions()
  {
		return (EReference)remoteProcessEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTemplateProcess()
  {
		return templateProcessEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTemplateProcess_SlotName()
  {
		return (EAttribute)templateProcessEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getControlConstruct()
  {
		return controlConstructEClass;
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
  public EReference getSequence_Components()
  {
		return (EReference)sequenceEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getChoice()
  {
		return choiceEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getChoice_Components()
  {
		return (EReference)choiceEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAnyOrder()
  {
		return anyOrderEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAnyOrder_Components()
  {
		return (EReference)anyOrderEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSplit()
  {
		return splitEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSplit_Components()
  {
		return (EReference)splitEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSplitJoin()
  {
		return splitJoinEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSplitJoin_Components()
  {
		return (EReference)splitJoinEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getIfThenElse()
  {
		return ifThenElseEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getIfThenElse_IfCondition()
  {
		return (EReference)ifThenElseEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getIfThenElse_Then()
  {
		return (EReference)ifThenElseEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getIfThenElse_Else()
  {
		return (EReference)ifThenElseEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRepeatUntil()
  {
		return repeatUntilEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRepeatUntil_UntilCondition()
  {
		return (EReference)repeatUntilEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRepeatUntil_UntilProcess()
  {
		return (EReference)repeatUntilEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRepeatWhile()
  {
		return repeatWhileEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRepeatWhile_WhileCondition()
  {
		return (EReference)repeatWhileEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRepeatWhile_WhileProcess()
  {
		return (EReference)repeatWhileEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPerform()
  {
		return performEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getPerform_TheProcess()
  {
		return (EReference)performEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getProduce()
  {
		return produceEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getProduce_ProducedBindingValueSpecifier()
  {
		return (EReference)produceEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSet()
  {
		return setEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSet_ProducedBindingValueSpecifier()
  {
		return (EReference)setEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getValueSpecifier()
  {
		return valueSpecifierEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getValueSpecifierElement()
  {
		return valueSpecifierElementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getValueSource()
  {
		return valueSourceEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getValueSource_Body()
  {
		return (EAttribute)valueSourceEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getValueForm()
  {
		return valueFormEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getValueForm_Body()
  {
		return (EAttribute)valueFormEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getValueFunction()
  {
		return valueFunctionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getValueFunction_Body()
  {
		return (EAttribute)valueFunctionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getBinding()
  {
		return bindingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSetBinding()
  {
		return setBindingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getInputBinding()
  {
		return inputBindingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getInputBinding_ToParam()
  {
		return (EReference)inputBindingEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getInputBinding_ValueSource()
  {
		return (EReference)inputBindingEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getOutputBinding()
  {
		return outputBindingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOutputBinding_ToParam()
  {
		return (EReference)outputBindingEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOutputBinding_Origin()
  {
		return (EReference)outputBindingEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLocBinding()
  {
		return locBindingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLocBinding_ToLoc()
  {
		return (EReference)locBindingEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLocBinding_Origin()
  {
		return (EReference)locBindingEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLinkBinding()
  {
		return linkBindingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLinkBinding_ToLink()
  {
		return (EReference)linkBindingEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLinkBinding_Origin()
  {
		return (EReference)linkBindingEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getoutputBindingSource()
  {
		return outputBindingSourceEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getoutputBindingSource_Source()
  {
		return (EReference)outputBindingSourceEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getoutputBindingSource_SpecifierElement()
  {
		return (EReference)outputBindingSourceEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getResult()
  {
		return resultEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getResult_InCondition()
  {
		return (EReference)resultEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getResult_HasResultVar()
  {
		return (EReference)resultEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getResult_HasEffect()
  {
		return (EReference)resultEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getResult_BindingSource()
  {
		return (EReference)resultEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getResultVar()
  {
		return resultVarEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLocal()
  {
		return localEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLoc()
  {
		return locEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLink()
  {
		return linkEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLink_HasBeenWritten()
  {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getControlConstructBag()
  {
		return controlConstructBagEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getControlConstructBag_First()
  {
		return (EReference)controlConstructBagEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getControlConstructBag_Rest()
  {
		return (EReference)controlConstructBagEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getControlConstructList()
  {
		return controlConstructListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getControlConstructList_First()
  {
		return (EReference)controlConstructListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getControlConstructList_Rest()
  {
		return (EReference)controlConstructListEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCondition()
  {
		return conditionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getExpr()
  {
		return exprEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getExpr_Name()
  {
		return (EAttribute)exprEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getExpr_LogicLanguage()
  {
		return (EAttribute)exprEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpr_BodyLiteral() {
		return (EAttribute)exprEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getExpr_Version()
  {
		return (EAttribute)exprEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getExpressionLanguage()
  {
		return expressionLanguageEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ControlFactory getControlFactory()
  {
		return (ControlFactory)getEFactoryInstance();
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
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		processVarEClass = createEClass(PROCESS_VAR);
		createEAttribute(processVarEClass, PROCESS_VAR__PARAMETER_TYPE);
		createEAttribute(processVarEClass, PROCESS_VAR__PARAMETER_VALUE);

		parameterEClass = createEClass(PARAMETER);

		ontologyEClass = createEClass(ONTOLOGY);
		createEAttribute(ontologyEClass, ONTOLOGY__ONTOLOGY_URI);

		templateConstraintEClass = createEClass(TEMPLATE_CONSTRAINT);
		createEAttribute(templateConstraintEClass, TEMPLATE_CONSTRAINT__ASP_CODE);
		createEAttribute(templateConstraintEClass, TEMPLATE_CONSTRAINT__ASP_BINDING);

		inputEClass = createEClass(INPUT);

		outputEClass = createEClass(OUTPUT);

		outerProcessEClass = createEClass(OUTER_PROCESS);
		createEReference(outerProcessEClass, OUTER_PROCESS__CONSTRUCT);
		createEReference(outerProcessEClass, OUTER_PROCESS__HAS_INPUT);
		createEReference(outerProcessEClass, OUTER_PROCESS__HAS_OUTPUT);
		createEReference(outerProcessEClass, OUTER_PROCESS__HAS_PRECONDITION);
		createEReference(outerProcessEClass, OUTER_PROCESS__HAS_RESULT);
		createEReference(outerProcessEClass, OUTER_PROCESS__BINDINGS);
		createEReference(outerProcessEClass, OUTER_PROCESS__OUTER_LOCALS);
		createEReference(outerProcessEClass, OUTER_PROCESS__OUTER_LINKS);
		createEReference(outerProcessEClass, OUTER_PROCESS__ONTOLOGIES);
		createEReference(outerProcessEClass, OUTER_PROCESS__TEMPLATE_CONSTRAINTS);
		createEAttribute(outerProcessEClass, OUTER_PROCESS__SERVICE_NAME);
		createEAttribute(outerProcessEClass, OUTER_PROCESS__SERVICE_URI);
		createEAttribute(outerProcessEClass, OUTER_PROCESS__SERVICE_DESCRIPTION);

		abstractProcessEClass = createEClass(ABSTRACT_PROCESS);
		createEReference(abstractProcessEClass, ABSTRACT_PROCESS__HAS_INPUT);
		createEReference(abstractProcessEClass, ABSTRACT_PROCESS__HAS_OUTPUT);

		remoteProcessEClass = createEClass(REMOTE_PROCESS);
		createEAttribute(remoteProcessEClass, REMOTE_PROCESS__REMOTE_URI);
		createEAttribute(remoteProcessEClass, REMOTE_PROCESS__REMOTE_URL);
		createEReference(remoteProcessEClass, REMOTE_PROCESS__HAS_RESULT);
		createEReference(remoteProcessEClass, REMOTE_PROCESS__EXPRESSIONS);

		templateProcessEClass = createEClass(TEMPLATE_PROCESS);
		createEAttribute(templateProcessEClass, TEMPLATE_PROCESS__SLOT_NAME);

		controlConstructEClass = createEClass(CONTROL_CONSTRUCT);

		sequenceEClass = createEClass(SEQUENCE);
		createEReference(sequenceEClass, SEQUENCE__COMPONENTS);

		choiceEClass = createEClass(CHOICE);
		createEReference(choiceEClass, CHOICE__COMPONENTS);

		anyOrderEClass = createEClass(ANY_ORDER);
		createEReference(anyOrderEClass, ANY_ORDER__COMPONENTS);

		splitEClass = createEClass(SPLIT);
		createEReference(splitEClass, SPLIT__COMPONENTS);

		splitJoinEClass = createEClass(SPLIT_JOIN);
		createEReference(splitJoinEClass, SPLIT_JOIN__COMPONENTS);

		ifThenElseEClass = createEClass(IF_THEN_ELSE);
		createEReference(ifThenElseEClass, IF_THEN_ELSE__IF_CONDITION);
		createEReference(ifThenElseEClass, IF_THEN_ELSE__THEN);
		createEReference(ifThenElseEClass, IF_THEN_ELSE__ELSE);

		repeatUntilEClass = createEClass(REPEAT_UNTIL);
		createEReference(repeatUntilEClass, REPEAT_UNTIL__UNTIL_CONDITION);
		createEReference(repeatUntilEClass, REPEAT_UNTIL__UNTIL_PROCESS);

		repeatWhileEClass = createEClass(REPEAT_WHILE);
		createEReference(repeatWhileEClass, REPEAT_WHILE__WHILE_CONDITION);
		createEReference(repeatWhileEClass, REPEAT_WHILE__WHILE_PROCESS);

		performEClass = createEClass(PERFORM);
		createEReference(performEClass, PERFORM__THE_PROCESS);

		produceEClass = createEClass(PRODUCE);
		createEReference(produceEClass, PRODUCE__PRODUCED_BINDING_VALUE_SPECIFIER);

		setEClass = createEClass(SET);
		createEReference(setEClass, SET__PRODUCED_BINDING_VALUE_SPECIFIER);

		valueSpecifierEClass = createEClass(VALUE_SPECIFIER);

		valueSpecifierElementEClass = createEClass(VALUE_SPECIFIER_ELEMENT);

		valueSourceEClass = createEClass(VALUE_SOURCE);
		createEAttribute(valueSourceEClass, VALUE_SOURCE__BODY);

		valueFormEClass = createEClass(VALUE_FORM);
		createEAttribute(valueFormEClass, VALUE_FORM__BODY);

		valueFunctionEClass = createEClass(VALUE_FUNCTION);
		createEAttribute(valueFunctionEClass, VALUE_FUNCTION__BODY);

		bindingEClass = createEClass(BINDING);

		setBindingEClass = createEClass(SET_BINDING);

		inputBindingEClass = createEClass(INPUT_BINDING);
		createEReference(inputBindingEClass, INPUT_BINDING__TO_PARAM);
		createEReference(inputBindingEClass, INPUT_BINDING__VALUE_SOURCE);

		outputBindingEClass = createEClass(OUTPUT_BINDING);
		createEReference(outputBindingEClass, OUTPUT_BINDING__TO_PARAM);
		createEReference(outputBindingEClass, OUTPUT_BINDING__ORIGIN);

		locBindingEClass = createEClass(LOC_BINDING);
		createEReference(locBindingEClass, LOC_BINDING__TO_LOC);
		createEReference(locBindingEClass, LOC_BINDING__ORIGIN);

		linkBindingEClass = createEClass(LINK_BINDING);
		createEReference(linkBindingEClass, LINK_BINDING__TO_LINK);
		createEReference(linkBindingEClass, LINK_BINDING__ORIGIN);

		outputBindingSourceEClass = createEClass(OUTPUT_BINDING_SOURCE);
		createEReference(outputBindingSourceEClass, OUTPUT_BINDING_SOURCE__SOURCE);
		createEReference(outputBindingSourceEClass, OUTPUT_BINDING_SOURCE__SPECIFIER_ELEMENT);

		resultEClass = createEClass(RESULT);
		createEReference(resultEClass, RESULT__IN_CONDITION);
		createEReference(resultEClass, RESULT__HAS_RESULT_VAR);
		createEReference(resultEClass, RESULT__HAS_EFFECT);
		createEReference(resultEClass, RESULT__BINDING_SOURCE);

		resultVarEClass = createEClass(RESULT_VAR);

		localEClass = createEClass(LOCAL);

		locEClass = createEClass(LOC);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__HAS_BEEN_WRITTEN);

		controlConstructBagEClass = createEClass(CONTROL_CONSTRUCT_BAG);
		createEReference(controlConstructBagEClass, CONTROL_CONSTRUCT_BAG__FIRST);
		createEReference(controlConstructBagEClass, CONTROL_CONSTRUCT_BAG__REST);

		controlConstructListEClass = createEClass(CONTROL_CONSTRUCT_LIST);
		createEReference(controlConstructListEClass, CONTROL_CONSTRUCT_LIST__FIRST);
		createEReference(controlConstructListEClass, CONTROL_CONSTRUCT_LIST__REST);

		conditionEClass = createEClass(CONDITION);

		exprEClass = createEClass(EXPR);
		createEAttribute(exprEClass, EXPR__NAME);
		createEAttribute(exprEClass, EXPR__LOGIC_LANGUAGE);
		createEAttribute(exprEClass, EXPR__BODY_LITERAL);
		createEAttribute(exprEClass, EXPR__VERSION);

		// Create enums
		expressionLanguageEEnum = createEEnum(EXPRESSION_LANGUAGE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		processVarEClass.getESuperTypes().add(this.getNamedElement());
		parameterEClass.getESuperTypes().add(this.getProcessVar());
		parameterEClass.getESuperTypes().add(this.getValueSpecifier());
		ontologyEClass.getESuperTypes().add(this.getNamedElement());
		templateConstraintEClass.getESuperTypes().add(this.getNamedElement());
		inputEClass.getESuperTypes().add(this.getParameter());
		outputEClass.getESuperTypes().add(this.getParameter());
		outerProcessEClass.getESuperTypes().add(this.getNamedElement());
		abstractProcessEClass.getESuperTypes().add(this.getNamedElement());
		remoteProcessEClass.getESuperTypes().add(this.getAbstractProcess());
		templateProcessEClass.getESuperTypes().add(this.getAbstractProcess());
		controlConstructEClass.getESuperTypes().add(this.getNamedElement());
		sequenceEClass.getESuperTypes().add(this.getControlConstruct());
		choiceEClass.getESuperTypes().add(this.getControlConstruct());
		anyOrderEClass.getESuperTypes().add(this.getControlConstruct());
		splitEClass.getESuperTypes().add(this.getControlConstruct());
		splitJoinEClass.getESuperTypes().add(this.getControlConstruct());
		ifThenElseEClass.getESuperTypes().add(this.getControlConstruct());
		repeatUntilEClass.getESuperTypes().add(this.getControlConstruct());
		repeatWhileEClass.getESuperTypes().add(this.getControlConstruct());
		performEClass.getESuperTypes().add(this.getControlConstruct());
		produceEClass.getESuperTypes().add(this.getControlConstruct());
		setEClass.getESuperTypes().add(this.getControlConstruct());
		valueSpecifierElementEClass.getESuperTypes().add(this.getValueSpecifier());
		valueSourceEClass.getESuperTypes().add(this.getNamedElement());
		valueSourceEClass.getESuperTypes().add(this.getValueSpecifierElement());
		valueFormEClass.getESuperTypes().add(this.getNamedElement());
		valueFormEClass.getESuperTypes().add(this.getValueSpecifierElement());
		valueFunctionEClass.getESuperTypes().add(this.getNamedElement());
		valueFunctionEClass.getESuperTypes().add(this.getValueSpecifierElement());
		bindingEClass.getESuperTypes().add(this.getProcessVar());
		setBindingEClass.getESuperTypes().add(this.getBinding());
		inputBindingEClass.getESuperTypes().add(this.getBinding());
		outputBindingEClass.getESuperTypes().add(this.getBinding());
		locBindingEClass.getESuperTypes().add(this.getSetBinding());
		linkBindingEClass.getESuperTypes().add(this.getBinding());
		outputBindingSourceEClass.getESuperTypes().add(this.getBinding());
		resultEClass.getESuperTypes().add(this.getNamedElement());
		resultVarEClass.getESuperTypes().add(this.getProcessVar());
		localEClass.getESuperTypes().add(this.getProcessVar());
		locEClass.getESuperTypes().add(this.getLocal());
		linkEClass.getESuperTypes().add(this.getProcessVar());
		controlConstructBagEClass.getESuperTypes().add(this.getNamedElement());
		controlConstructListEClass.getESuperTypes().add(this.getNamedElement());
		conditionEClass.getESuperTypes().add(this.getExpr());

		// Initialize classes and features; add operations and parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processVarEClass, ProcessVar.class, "ProcessVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessVar_ParameterType(), ecorePackage.getEString(), "parameterType", null, 0, 1, ProcessVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessVar_ParameterValue(), ecorePackage.getEString(), "parameterValue", null, 0, 1, ProcessVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ontologyEClass, Ontology.class, "Ontology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntology_OntologyURI(), ecorePackage.getEString(), "ontologyURI", null, 0, 1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateConstraintEClass, TemplateConstraint.class, "TemplateConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemplateConstraint_AspCode(), ecorePackage.getEString(), "aspCode", null, 0, 1, TemplateConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateConstraint_AspBinding(), ecorePackage.getEString(), "aspBinding", null, 0, 1, TemplateConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outerProcessEClass, OuterProcess.class, "OuterProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOuterProcess_Construct(), this.getControlConstruct(), null, "construct", null, 0, 1, OuterProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOuterProcess_HasInput(), this.getInput(), null, "hasInput", null, 0, -1, OuterProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOuterProcess_HasOutput(), this.getOutput(), null, "hasOutput", null, 0, -1, OuterProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOuterProcess_HasPrecondition(), this.getExpr(), null, "hasPrecondition", null, 0, -1, OuterProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOuterProcess_HasResult(), this.getResult(), null, "hasResult", null, 0, -1, OuterProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOuterProcess_Bindings(), this.getBinding(), null, "bindings", null, 0, -1, OuterProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOuterProcess_OuterLocals(), this.getLoc(), null, "outerLocals", null, 0, -1, OuterProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOuterProcess_OuterLinks(), this.getLink(), null, "outerLinks", null, 0, -1, OuterProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOuterProcess_Ontologies(), this.getOntology(), null, "ontologies", null, 0, -1, OuterProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOuterProcess_TemplateConstraints(), this.getTemplateConstraint(), null, "templateConstraints", null, 1, 1, OuterProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOuterProcess_ServiceName(), ecorePackage.getEString(), "serviceName", null, 0, 1, OuterProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOuterProcess_ServiceURI(), ecorePackage.getEString(), "serviceURI", null, 0, 1, OuterProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOuterProcess_ServiceDescription(), ecorePackage.getEString(), "serviceDescription", null, 0, 1, OuterProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractProcessEClass, AbstractProcess.class, "AbstractProcess", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractProcess_HasInput(), this.getInput(), null, "hasInput", null, 0, -1, AbstractProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractProcess_HasOutput(), this.getOutput(), null, "hasOutput", null, 0, -1, AbstractProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteProcessEClass, RemoteProcess.class, "RemoteProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoteProcess_RemoteURI(), ecorePackage.getEString(), "remoteURI", null, 0, 1, RemoteProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteProcess_RemoteURL(), ecorePackage.getEString(), "remoteURL", null, 0, 1, RemoteProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRemoteProcess_HasResult(), this.getResult(), null, "hasResult", null, 0, -1, RemoteProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRemoteProcess_Expressions(), this.getExpr(), null, "expressions", null, 0, -1, RemoteProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateProcessEClass, TemplateProcess.class, "TemplateProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemplateProcess_SlotName(), ecorePackage.getEString(), "slotName", null, 0, 1, TemplateProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlConstructEClass, ControlConstruct.class, "ControlConstruct", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequence_Components(), this.getControlConstructList(), null, "components", null, 1, 1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChoice_Components(), this.getControlConstructBag(), null, "components", null, 1, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anyOrderEClass, AnyOrder.class, "AnyOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnyOrder_Components(), this.getControlConstructBag(), null, "components", null, 1, 1, AnyOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(splitEClass, Split.class, "Split", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSplit_Components(), this.getControlConstructBag(), null, "components", null, 1, 1, Split.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(splitJoinEClass, SplitJoin.class, "SplitJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSplitJoin_Components(), this.getControlConstructBag(), null, "components", null, 1, 1, SplitJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifThenElseEClass, IfThenElse.class, "IfThenElse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfThenElse_IfCondition(), this.getExpr(), null, "ifCondition", null, 1, 1, IfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfThenElse_Then(), this.getControlConstruct(), null, "then", null, 1, 1, IfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfThenElse_Else(), this.getControlConstruct(), null, "else", null, 1, 1, IfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatUntilEClass, RepeatUntil.class, "RepeatUntil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepeatUntil_UntilCondition(), this.getExpr(), null, "untilCondition", null, 1, 1, RepeatUntil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatUntil_UntilProcess(), this.getControlConstruct(), null, "untilProcess", null, 1, 1, RepeatUntil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatWhileEClass, RepeatWhile.class, "RepeatWhile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepeatWhile_WhileCondition(), this.getExpr(), null, "whileCondition", null, 1, 1, RepeatWhile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatWhile_WhileProcess(), this.getControlConstruct(), null, "whileProcess", null, 1, 1, RepeatWhile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performEClass, Perform.class, "Perform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerform_TheProcess(), this.getAbstractProcess(), null, "theProcess", null, 1, 1, Perform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(produceEClass, Produce.class, "Produce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProduce_ProducedBindingValueSpecifier(), this.getValueSpecifierElement(), null, "producedBindingValueSpecifier", null, 0, 1, Produce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setEClass, Set.class, "Set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSet_ProducedBindingValueSpecifier(), this.getValueSpecifierElement(), null, "producedBindingValueSpecifier", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueSpecifierEClass, ValueSpecifier.class, "ValueSpecifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueSpecifierElementEClass, ValueSpecifierElement.class, "ValueSpecifierElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueSourceEClass, ValueSource.class, "ValueSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueSource_Body(), ecorePackage.getEString(), "body", null, 0, 1, ValueSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueFormEClass, ValueForm.class, "ValueForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueForm_Body(), ecorePackage.getEString(), "body", null, 0, 1, ValueForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueFunctionEClass, ValueFunction.class, "ValueFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueFunction_Body(), ecorePackage.getEString(), "body", null, 0, 1, ValueFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingEClass, Binding.class, "Binding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setBindingEClass, SetBinding.class, "SetBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputBindingEClass, InputBinding.class, "InputBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputBinding_ToParam(), this.getInput(), null, "toParam", null, 0, 1, InputBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputBinding_ValueSource(), this.getParameter(), null, "valueSource", null, 0, 1, InputBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputBindingEClass, OutputBinding.class, "OutputBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputBinding_ToParam(), this.getOutput(), null, "toParam", null, 0, 1, OutputBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputBinding_Origin(), this.getValueSpecifier(), null, "origin", null, 0, 1, OutputBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locBindingEClass, LocBinding.class, "LocBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocBinding_ToLoc(), this.getLoc(), null, "toLoc", null, 0, 1, LocBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocBinding_Origin(), this.getValueSpecifier(), null, "origin", null, 0, 1, LocBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkBindingEClass, LinkBinding.class, "LinkBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkBinding_ToLink(), this.getLink(), null, "toLink", null, 0, 1, LinkBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkBinding_Origin(), this.getValueSpecifier(), null, "origin", null, 0, 1, LinkBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputBindingSourceEClass, outputBindingSource.class, "outputBindingSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getoutputBindingSource_Source(), this.getParameter(), null, "source", null, 0, 1, outputBindingSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getoutputBindingSource_SpecifierElement(), this.getValueSpecifierElement(), null, "specifierElement", null, 0, 1, outputBindingSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultEClass, Result.class, "Result", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResult_InCondition(), this.getExpr(), null, "inCondition", null, 0, -1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResult_HasResultVar(), this.getResultVar(), null, "hasResultVar", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResult_HasEffect(), this.getExpr(), null, "hasEffect", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResult_BindingSource(), this.getValueSpecifierElement(), null, "bindingSource", null, 0, -1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultVarEClass, ResultVar.class, "ResultVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(localEClass, Local.class, "Local", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locEClass, Loc.class, "Loc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_HasBeenWritten(), ecorePackage.getEBooleanObject(), "hasBeenWritten", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlConstructBagEClass, ControlConstructBag.class, "ControlConstructBag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlConstructBag_First(), this.getControlConstruct(), null, "first", null, 1, 1, ControlConstructBag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlConstructBag_Rest(), this.getControlConstructBag(), null, "rest", null, 1, 1, ControlConstructBag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlConstructListEClass, ControlConstructList.class, "ControlConstructList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlConstructList_First(), this.getControlConstruct(), null, "first", null, 0, 1, ControlConstructList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlConstructList_Rest(), this.getControlConstructList(), null, "rest", null, 1, 1, ControlConstructList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exprEClass, Expr.class, "Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpr_Name(), ecorePackage.getEString(), "name", null, 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpr_LogicLanguage(), this.getExpressionLanguage(), "logicLanguage", "1", 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpr_BodyLiteral(), ecorePackage.getEString(), "bodyLiteral", null, 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpr_Version(), ecorePackage.getEInt(), "version", null, 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(expressionLanguageEEnum, ExpressionLanguage.class, "ExpressionLanguage");
		addEEnumLiteral(expressionLanguageEEnum, ExpressionLanguage.KIF);
		addEEnumLiteral(expressionLanguageEEnum, ExpressionLanguage.SWRL);
		addEEnumLiteral(expressionLanguageEEnum, ExpressionLanguage.DRS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.diagram
		createGmf_2Annotations();
		// gmf.affixed
		createGmf_3Annotations();
		// gmf.compartment
		createGmf_4Annotations();
		// gmf.link
		createGmf_5Annotations();
	}

  /**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmfAnnotations()
  {
		String source = "gmf";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });																																																	
	}

  /**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmf_1Annotations()
  {
		String source = "gmf.node";			
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });		
		addAnnotation
		  (ontologyEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });		
		addAnnotation
		  (templateConstraintEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });			
		addAnnotation
		  (abstractProcessEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });						
		addAnnotation
		  (controlConstructEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });																	
		addAnnotation
		  (valueSourceEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });		
		addAnnotation
		  (valueFormEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });		
		addAnnotation
		  (valueFunctionEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });							
		addAnnotation
		  (resultEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });						
		addAnnotation
		  (resultVarEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });		
		addAnnotation
		  (locEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });		
		addAnnotation
		  (linkEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });		
		addAnnotation
		  (controlConstructBagEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });				
		addAnnotation
		  (controlConstructListEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });				
		addAnnotation
		  (exprEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
	}

  /**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmf_2Annotations()
  {
		String source = "gmf.diagram";						
		addAnnotation
		  (outerProcessEClass, 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });																																													
	}

  /**
	 * Initializes the annotations for <b>gmf.affixed</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmf_3Annotations()
  {
		String source = "gmf.affixed";								
		addAnnotation
		  (getAbstractProcess_HasInput(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getAbstractProcess_HasOutput(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getRemoteProcess_HasResult(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getRemoteProcess_Expressions(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });																																								
	}

  /**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmf_4Annotations()
  {
		String source = "gmf.compartment";													
		addAnnotation
		  (getSequence_Components(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getChoice_Components(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getAnyOrder_Components(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getSplit_Components(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getSplitJoin_Components(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getIfThenElse_IfCondition(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getIfThenElse_Then(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getIfThenElse_Else(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getRepeatUntil_UntilCondition(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getRepeatUntil_UntilProcess(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getRepeatWhile_WhileCondition(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getRepeatWhile_WhileProcess(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getPerform_TheProcess(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getProduce_ProducedBindingValueSpecifier(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getSet_ProducedBindingValueSpecifier(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });											
		addAnnotation
		  (getResult_InCondition(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getResult_HasResultVar(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getResult_HasEffect(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getResult_BindingSource(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });						
		addAnnotation
		  (getControlConstructBag_First(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getControlConstructBag_Rest(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });			
		addAnnotation
		  (getControlConstructList_First(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getControlConstructList_Rest(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });			
		addAnnotation
		  (getExpr_BodyLiteral(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });
	}

  /**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmf_5Annotations()
  {
		String source = "gmf.link";																															
		addAnnotation
		  (inputBindingEClass, 
		   source, 
		   new String[] {
			 "source", "valueSource",
			 "target", "toParam",
			 "target.decoration", "arrow",
			 "width", "2",
			 "color", "120,181,0"
		   });		
		addAnnotation
		  (outputBindingEClass, 
		   source, 
		   new String[] {
			 "source", "origin",
			 "target", "toParam",
			 "target.decoration", "arrow",
			 "width", "2",
			 "color", "255,0,0"
		   });		
		addAnnotation
		  (locBindingEClass, 
		   source, 
		   new String[] {
			 "source", "origin",
			 "target", "toLoc",
			 "target.decoration", "arrow",
			 "width", "2",
			 "color", "0,0,255"
		   });		
		addAnnotation
		  (linkBindingEClass, 
		   source, 
		   new String[] {
			 "source", "origin",
			 "target", "toLink",
			 "target.decoration", "arrow",
			 "width", "2",
			 "color", "0,0,255"
		   });		
		addAnnotation
		  (outputBindingSourceEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "specifierElement",
			 "style", "dash",
			 "target.decoration", "arrow",
			 "width", "2",
			 "color", "255,0,0"
		   });																
	}

} //ControlPackageImpl
