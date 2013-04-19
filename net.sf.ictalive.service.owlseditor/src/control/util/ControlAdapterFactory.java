/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.util;

import control.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see control.ControlPackage
 * @generated
 */
public class ControlAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ControlPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ControlAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = ControlPackage.eINSTANCE;
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
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
  protected ControlSwitch<Adapter> modelSwitch =
    new ControlSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseProcessVar(ProcessVar object) {
				return createProcessVarAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseOntology(Ontology object) {
				return createOntologyAdapter();
			}
			@Override
			public Adapter caseTemplateConstraint(TemplateConstraint object) {
				return createTemplateConstraintAdapter();
			}
			@Override
			public Adapter caseInput(Input object) {
				return createInputAdapter();
			}
			@Override
			public Adapter caseOutput(Output object) {
				return createOutputAdapter();
			}
			@Override
			public Adapter caseOuterProcess(OuterProcess object) {
				return createOuterProcessAdapter();
			}
			@Override
			public Adapter caseAbstractProcess(AbstractProcess object) {
				return createAbstractProcessAdapter();
			}
			@Override
			public Adapter caseRemoteProcess(RemoteProcess object) {
				return createRemoteProcessAdapter();
			}
			@Override
			public Adapter caseTemplateProcess(TemplateProcess object) {
				return createTemplateProcessAdapter();
			}
			@Override
			public Adapter caseControlConstruct(ControlConstruct object) {
				return createControlConstructAdapter();
			}
			@Override
			public Adapter caseSequence(Sequence object) {
				return createSequenceAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseAnyOrder(AnyOrder object) {
				return createAnyOrderAdapter();
			}
			@Override
			public Adapter caseSplit(Split object) {
				return createSplitAdapter();
			}
			@Override
			public Adapter caseSplitJoin(SplitJoin object) {
				return createSplitJoinAdapter();
			}
			@Override
			public Adapter caseIfThenElse(IfThenElse object) {
				return createIfThenElseAdapter();
			}
			@Override
			public Adapter caseRepeatUntil(RepeatUntil object) {
				return createRepeatUntilAdapter();
			}
			@Override
			public Adapter caseRepeatWhile(RepeatWhile object) {
				return createRepeatWhileAdapter();
			}
			@Override
			public Adapter casePerform(Perform object) {
				return createPerformAdapter();
			}
			@Override
			public Adapter caseProduce(Produce object) {
				return createProduceAdapter();
			}
			@Override
			public Adapter caseSet(Set object) {
				return createSetAdapter();
			}
			@Override
			public Adapter caseValueSpecifier(ValueSpecifier object) {
				return createValueSpecifierAdapter();
			}
			@Override
			public Adapter caseValueSpecifierElement(ValueSpecifierElement object) {
				return createValueSpecifierElementAdapter();
			}
			@Override
			public Adapter caseValueSource(ValueSource object) {
				return createValueSourceAdapter();
			}
			@Override
			public Adapter caseValueForm(ValueForm object) {
				return createValueFormAdapter();
			}
			@Override
			public Adapter caseValueFunction(ValueFunction object) {
				return createValueFunctionAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter caseSetBinding(SetBinding object) {
				return createSetBindingAdapter();
			}
			@Override
			public Adapter caseInputBinding(InputBinding object) {
				return createInputBindingAdapter();
			}
			@Override
			public Adapter caseOutputBinding(OutputBinding object) {
				return createOutputBindingAdapter();
			}
			@Override
			public Adapter caseLocBinding(LocBinding object) {
				return createLocBindingAdapter();
			}
			@Override
			public Adapter caseLinkBinding(LinkBinding object) {
				return createLinkBindingAdapter();
			}
			@Override
			public Adapter caseoutputBindingSource(outputBindingSource object) {
				return createoutputBindingSourceAdapter();
			}
			@Override
			public Adapter caseResult(Result object) {
				return createResultAdapter();
			}
			@Override
			public Adapter caseResultVar(ResultVar object) {
				return createResultVarAdapter();
			}
			@Override
			public Adapter caseLocal(Local object) {
				return createLocalAdapter();
			}
			@Override
			public Adapter caseLoc(Loc object) {
				return createLocAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseControlConstructBag(ControlConstructBag object) {
				return createControlConstructBagAdapter();
			}
			@Override
			public Adapter caseControlConstructList(ControlConstructList object) {
				return createControlConstructListAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseExpr(Expr object) {
				return createExprAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	 * Creates a new adapter for an object of class '{@link control.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.NamedElement
	 * @generated
	 */
  public Adapter createNamedElementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.ProcessVar <em>Process Var</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.ProcessVar
	 * @generated
	 */
  public Adapter createProcessVarAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.Parameter
	 * @generated
	 */
  public Adapter createParameterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.Ontology
	 * @generated
	 */
	public Adapter createOntologyAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link control.TemplateConstraint <em>Template Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.TemplateConstraint
	 * @generated
	 */
	public Adapter createTemplateConstraintAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link control.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.Input
	 * @generated
	 */
  public Adapter createInputAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.Output
	 * @generated
	 */
  public Adapter createOutputAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.OuterProcess <em>Outer Process</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.OuterProcess
	 * @generated
	 */
  public Adapter createOuterProcessAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.AbstractProcess <em>Abstract Process</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.AbstractProcess
	 * @generated
	 */
  public Adapter createAbstractProcessAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.RemoteProcess <em>Remote Process</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.RemoteProcess
	 * @generated
	 */
  public Adapter createRemoteProcessAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.TemplateProcess <em>Template Process</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.TemplateProcess
	 * @generated
	 */
  public Adapter createTemplateProcessAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.ControlConstruct <em>Construct</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.ControlConstruct
	 * @generated
	 */
  public Adapter createControlConstructAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.Sequence
	 * @generated
	 */
  public Adapter createSequenceAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.Choice
	 * @generated
	 */
  public Adapter createChoiceAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.AnyOrder <em>Any Order</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.AnyOrder
	 * @generated
	 */
  public Adapter createAnyOrderAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.Split
	 * @generated
	 */
  public Adapter createSplitAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.SplitJoin <em>Split Join</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.SplitJoin
	 * @generated
	 */
  public Adapter createSplitJoinAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.IfThenElse <em>If Then Else</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.IfThenElse
	 * @generated
	 */
  public Adapter createIfThenElseAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.RepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.RepeatUntil
	 * @generated
	 */
  public Adapter createRepeatUntilAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.RepeatWhile <em>Repeat While</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.RepeatWhile
	 * @generated
	 */
  public Adapter createRepeatWhileAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.Perform <em>Perform</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.Perform
	 * @generated
	 */
  public Adapter createPerformAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.Produce <em>Produce</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.Produce
	 * @generated
	 */
  public Adapter createProduceAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.Set
	 * @generated
	 */
  public Adapter createSetAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.ValueSpecifier <em>Value Specifier</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.ValueSpecifier
	 * @generated
	 */
  public Adapter createValueSpecifierAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.ValueSpecifierElement <em>Value Specifier Element</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.ValueSpecifierElement
	 * @generated
	 */
  public Adapter createValueSpecifierElementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.ValueSource <em>Value Source</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.ValueSource
	 * @generated
	 */
  public Adapter createValueSourceAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.ValueForm <em>Value Form</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.ValueForm
	 * @generated
	 */
  public Adapter createValueFormAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.ValueFunction <em>Value Function</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.ValueFunction
	 * @generated
	 */
  public Adapter createValueFunctionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.Binding
	 * @generated
	 */
  public Adapter createBindingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.SetBinding <em>Set Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.SetBinding
	 * @generated
	 */
  public Adapter createSetBindingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.InputBinding <em>Input Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.InputBinding
	 * @generated
	 */
  public Adapter createInputBindingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.OutputBinding <em>Output Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.OutputBinding
	 * @generated
	 */
  public Adapter createOutputBindingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.LocBinding <em>Loc Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.LocBinding
	 * @generated
	 */
  public Adapter createLocBindingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.LinkBinding <em>Link Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.LinkBinding
	 * @generated
	 */
  public Adapter createLinkBindingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.outputBindingSource <em>output Binding Source</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.outputBindingSource
	 * @generated
	 */
  public Adapter createoutputBindingSourceAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.Result
	 * @generated
	 */
  public Adapter createResultAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.ResultVar <em>Result Var</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.ResultVar
	 * @generated
	 */
  public Adapter createResultVarAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.Local <em>Local</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.Local
	 * @generated
	 */
  public Adapter createLocalAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.Loc <em>Loc</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.Loc
	 * @generated
	 */
  public Adapter createLocAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.Link
	 * @generated
	 */
  public Adapter createLinkAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.ControlConstructBag <em>Construct Bag</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.ControlConstructBag
	 * @generated
	 */
  public Adapter createControlConstructBagAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.ControlConstructList <em>Construct List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.ControlConstructList
	 * @generated
	 */
  public Adapter createControlConstructListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.Condition
	 * @generated
	 */
  public Adapter createConditionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link control.Expr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see control.Expr
	 * @generated
	 */
  public Adapter createExprAdapter()
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

} //ControlAdapterFactory
