/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.impl;

import control.*;

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
public class ControlFactoryImpl extends EFactoryImpl implements ControlFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ControlFactory init()
  {
		try {
			ControlFactory theControlFactory = (ControlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.example.org"); 
			if (theControlFactory != null) {
				return theControlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ControlFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ControlFactoryImpl()
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
		switch (eClass.getClassifierID()) {
			case ControlPackage.NAMED_ELEMENT: return createNamedElement();
			case ControlPackage.PROCESS_VAR: return createProcessVar();
			case ControlPackage.ONTOLOGY: return createOntology();
			case ControlPackage.TEMPLATE_CONSTRAINT: return createTemplateConstraint();
			case ControlPackage.INPUT: return createInput();
			case ControlPackage.OUTPUT: return createOutput();
			case ControlPackage.OUTER_PROCESS: return createOuterProcess();
			case ControlPackage.REMOTE_PROCESS: return createRemoteProcess();
			case ControlPackage.TEMPLATE_PROCESS: return createTemplateProcess();
			case ControlPackage.SEQUENCE: return createSequence();
			case ControlPackage.CHOICE: return createChoice();
			case ControlPackage.ANY_ORDER: return createAnyOrder();
			case ControlPackage.SPLIT: return createSplit();
			case ControlPackage.SPLIT_JOIN: return createSplitJoin();
			case ControlPackage.IF_THEN_ELSE: return createIfThenElse();
			case ControlPackage.REPEAT_UNTIL: return createRepeatUntil();
			case ControlPackage.REPEAT_WHILE: return createRepeatWhile();
			case ControlPackage.PERFORM: return createPerform();
			case ControlPackage.PRODUCE: return createProduce();
			case ControlPackage.SET: return createSet();
			case ControlPackage.VALUE_SOURCE: return createValueSource();
			case ControlPackage.VALUE_FORM: return createValueForm();
			case ControlPackage.VALUE_FUNCTION: return createValueFunction();
			case ControlPackage.INPUT_BINDING: return createInputBinding();
			case ControlPackage.OUTPUT_BINDING: return createOutputBinding();
			case ControlPackage.LOC_BINDING: return createLocBinding();
			case ControlPackage.LINK_BINDING: return createLinkBinding();
			case ControlPackage.OUTPUT_BINDING_SOURCE: return createoutputBindingSource();
			case ControlPackage.RESULT: return createResult();
			case ControlPackage.RESULT_VAR: return createResultVar();
			case ControlPackage.LOCAL: return createLocal();
			case ControlPackage.LOC: return createLoc();
			case ControlPackage.LINK: return createLink();
			case ControlPackage.CONTROL_CONSTRUCT_BAG: return createControlConstructBag();
			case ControlPackage.CONTROL_CONSTRUCT_LIST: return createControlConstructList();
			case ControlPackage.CONDITION: return createCondition();
			case ControlPackage.EXPR: return createExpr();
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
		switch (eDataType.getClassifierID()) {
			case ControlPackage.EXPRESSION_LANGUAGE:
				return createExpressionLanguageFromString(eDataType, initialValue);
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
		switch (eDataType.getClassifierID()) {
			case ControlPackage.EXPRESSION_LANGUAGE:
				return convertExpressionLanguageToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NamedElement createNamedElement()
  {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ProcessVar createProcessVar()
  {
		ProcessVarImpl processVar = new ProcessVarImpl();
		return processVar;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontology createOntology() {
		OntologyImpl ontology = new OntologyImpl();
		return ontology;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateConstraint createTemplateConstraint() {
		TemplateConstraintImpl templateConstraint = new TemplateConstraintImpl();
		return templateConstraint;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Input createInput()
  {
		InputImpl input = new InputImpl();
		return input;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Output createOutput()
  {
		OutputImpl output = new OutputImpl();
		return output;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OuterProcess createOuterProcess()
  {
		OuterProcessImpl outerProcess = new OuterProcessImpl();
		return outerProcess;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RemoteProcess createRemoteProcess()
  {
		RemoteProcessImpl remoteProcess = new RemoteProcessImpl();
		return remoteProcess;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TemplateProcess createTemplateProcess()
  {
		TemplateProcessImpl templateProcess = new TemplateProcessImpl();
		return templateProcess;
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
  public Choice createChoice()
  {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AnyOrder createAnyOrder()
  {
		AnyOrderImpl anyOrder = new AnyOrderImpl();
		return anyOrder;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Split createSplit()
  {
		SplitImpl split = new SplitImpl();
		return split;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SplitJoin createSplitJoin()
  {
		SplitJoinImpl splitJoin = new SplitJoinImpl();
		return splitJoin;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IfThenElse createIfThenElse()
  {
		IfThenElseImpl ifThenElse = new IfThenElseImpl();
		return ifThenElse;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RepeatUntil createRepeatUntil()
  {
		RepeatUntilImpl repeatUntil = new RepeatUntilImpl();
		return repeatUntil;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RepeatWhile createRepeatWhile()
  {
		RepeatWhileImpl repeatWhile = new RepeatWhileImpl();
		return repeatWhile;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Perform createPerform()
  {
		PerformImpl perform = new PerformImpl();
		return perform;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Produce createProduce()
  {
		ProduceImpl produce = new ProduceImpl();
		return produce;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Set createSet()
  {
		SetImpl set = new SetImpl();
		return set;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ValueSource createValueSource()
  {
		ValueSourceImpl valueSource = new ValueSourceImpl();
		return valueSource;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ValueForm createValueForm()
  {
		ValueFormImpl valueForm = new ValueFormImpl();
		return valueForm;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ValueFunction createValueFunction()
  {
		ValueFunctionImpl valueFunction = new ValueFunctionImpl();
		return valueFunction;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InputBinding createInputBinding()
  {
		InputBindingImpl inputBinding = new InputBindingImpl();
		return inputBinding;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OutputBinding createOutputBinding()
  {
		OutputBindingImpl outputBinding = new OutputBindingImpl();
		return outputBinding;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LocBinding createLocBinding()
  {
		LocBindingImpl locBinding = new LocBindingImpl();
		return locBinding;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LinkBinding createLinkBinding()
  {
		LinkBindingImpl linkBinding = new LinkBindingImpl();
		return linkBinding;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public outputBindingSource createoutputBindingSource()
  {
		outputBindingSourceImpl outputBindingSource = new outputBindingSourceImpl();
		return outputBindingSource;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Result createResult()
  {
		ResultImpl result = new ResultImpl();
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ResultVar createResultVar()
  {
		ResultVarImpl resultVar = new ResultVarImpl();
		return resultVar;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Local createLocal()
  {
		LocalImpl local = new LocalImpl();
		return local;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Loc createLoc()
  {
		LocImpl loc = new LocImpl();
		return loc;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Link createLink()
  {
		LinkImpl link = new LinkImpl();
		return link;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ControlConstructBag createControlConstructBag()
  {
		ControlConstructBagImpl controlConstructBag = new ControlConstructBagImpl();
		return controlConstructBag;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ControlConstructList createControlConstructList()
  {
		ControlConstructListImpl controlConstructList = new ControlConstructListImpl();
		return controlConstructList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Condition createCondition()
  {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Expr createExpr()
  {
		ExprImpl expr = new ExprImpl();
		return expr;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ExpressionLanguage createExpressionLanguageFromString(EDataType eDataType, String initialValue)
  {
		ExpressionLanguage result = ExpressionLanguage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertExpressionLanguageToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ControlPackage getControlPackage()
  {
		return (ControlPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ControlPackage getPackage()
  {
		return ControlPackage.eINSTANCE;
	}

} //ControlFactoryImpl
