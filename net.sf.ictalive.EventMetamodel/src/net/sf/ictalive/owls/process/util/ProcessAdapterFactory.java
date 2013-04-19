/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process.util;

import net.sf.ictalive.owls.process.AnyOrder;
import net.sf.ictalive.owls.process.AtomicProcess;
import net.sf.ictalive.owls.process.Binding;
import net.sf.ictalive.owls.process.Choice;
import net.sf.ictalive.owls.process.Components;
import net.sf.ictalive.owls.process.CompositeProcess;
import net.sf.ictalive.owls.process.ControlConstruct;
import net.sf.ictalive.owls.process.ControlConstructBag;
import net.sf.ictalive.owls.process.ControlConstructList;
import net.sf.ictalive.owls.process.IfThenElse;
import net.sf.ictalive.owls.process.Input;
import net.sf.ictalive.owls.process.InputBinding;
import net.sf.ictalive.owls.process.Iterate;
import net.sf.ictalive.owls.process.Local;
import net.sf.ictalive.owls.process.Output;
import net.sf.ictalive.owls.process.OutputBinding;
import net.sf.ictalive.owls.process.Parameter;
import net.sf.ictalive.owls.process.Participant;
import net.sf.ictalive.owls.process.Perform;
import net.sf.ictalive.owls.process.ProcessPackage;
import net.sf.ictalive.owls.process.Produce;
import net.sf.ictalive.owls.process.RepeatUntil;
import net.sf.ictalive.owls.process.RepeatWhile;
import net.sf.ictalive.owls.process.Result;
import net.sf.ictalive.owls.process.ResultVar;
import net.sf.ictalive.owls.process.Sequence;
import net.sf.ictalive.owls.process.SimpleProcess;
import net.sf.ictalive.owls.process.Split;
import net.sf.ictalive.owls.process.SplitJoin;
import net.sf.ictalive.owls.process.ValueOf;

import net.sf.ictalive.owls.service.ServiceModel;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.owls.process.ProcessPackage
 * @generated
 */
public class ProcessAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProcessPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = ProcessPackage.eINSTANCE;
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
	protected ProcessSwitch<Adapter> modelSwitch =
		new ProcessSwitch<Adapter>()
		{
			@Override
			public Adapter caseAnyOrder(AnyOrder object)
			{
				return createAnyOrderAdapter();
			}
			@Override
			public Adapter caseAtomicProcess(AtomicProcess object)
			{
				return createAtomicProcessAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object)
			{
				return createBindingAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object)
			{
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseCompositeProcess(CompositeProcess object)
			{
				return createCompositeProcessAdapter();
			}
			@Override
			public Adapter caseControlConstruct(ControlConstruct object)
			{
				return createControlConstructAdapter();
			}
			@Override
			public Adapter caseControlConstructBag(ControlConstructBag object)
			{
				return createControlConstructBagAdapter();
			}
			@Override
			public Adapter caseControlConstructList(ControlConstructList object)
			{
				return createControlConstructListAdapter();
			}
			@Override
			public Adapter caseIfThenElse(IfThenElse object)
			{
				return createIfThenElseAdapter();
			}
			@Override
			public Adapter caseInput(Input object)
			{
				return createInputAdapter();
			}
			@Override
			public Adapter caseInputBinding(InputBinding object)
			{
				return createInputBindingAdapter();
			}
			@Override
			public Adapter caseIterate(Iterate object)
			{
				return createIterateAdapter();
			}
			@Override
			public Adapter caseLocal(Local object)
			{
				return createLocalAdapter();
			}
			@Override
			public Adapter caseOutput(Output object)
			{
				return createOutputAdapter();
			}
			@Override
			public Adapter caseOutputBinding(OutputBinding object)
			{
				return createOutputBindingAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object)
			{
				return createParameterAdapter();
			}
			@Override
			public Adapter caseParticipant(Participant object)
			{
				return createParticipantAdapter();
			}
			@Override
			public Adapter casePerform(Perform object)
			{
				return createPerformAdapter();
			}
			@Override
			public Adapter caseProcess(net.sf.ictalive.owls.process.Process object)
			{
				return createProcessAdapter();
			}
			@Override
			public Adapter caseProduce(Produce object)
			{
				return createProduceAdapter();
			}
			@Override
			public Adapter caseRepeatUntil(RepeatUntil object)
			{
				return createRepeatUntilAdapter();
			}
			@Override
			public Adapter caseRepeatWhile(RepeatWhile object)
			{
				return createRepeatWhileAdapter();
			}
			@Override
			public Adapter caseResult(Result object)
			{
				return createResultAdapter();
			}
			@Override
			public Adapter caseResultVar(ResultVar object)
			{
				return createResultVarAdapter();
			}
			@Override
			public Adapter caseSequence(Sequence object)
			{
				return createSequenceAdapter();
			}
			@Override
			public Adapter caseSimpleProcess(SimpleProcess object)
			{
				return createSimpleProcessAdapter();
			}
			@Override
			public Adapter caseSplit(Split object)
			{
				return createSplitAdapter();
			}
			@Override
			public Adapter caseSplitJoin(SplitJoin object)
			{
				return createSplitJoinAdapter();
			}
			@Override
			public Adapter caseValueOf(ValueOf object)
			{
				return createValueOfAdapter();
			}
			@Override
			public Adapter caseComponents(Components object)
			{
				return createComponentsAdapter();
			}
			@Override
			public Adapter caseServiceModel(ServiceModel object)
			{
				return createServiceModelAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.AnyOrder <em>Any Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.AnyOrder
	 * @generated
	 */
	public Adapter createAnyOrderAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.AtomicProcess <em>Atomic Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.AtomicProcess
	 * @generated
	 */
	public Adapter createAtomicProcessAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.CompositeProcess <em>Composite Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.CompositeProcess
	 * @generated
	 */
	public Adapter createCompositeProcessAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.ControlConstruct <em>Control Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.ControlConstruct
	 * @generated
	 */
	public Adapter createControlConstructAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.ControlConstructBag <em>Control Construct Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.ControlConstructBag
	 * @generated
	 */
	public Adapter createControlConstructBagAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.ControlConstructList <em>Control Construct List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.ControlConstructList
	 * @generated
	 */
	public Adapter createControlConstructListAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.IfThenElse <em>If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.IfThenElse
	 * @generated
	 */
	public Adapter createIfThenElseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.Input
	 * @generated
	 */
	public Adapter createInputAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.InputBinding <em>Input Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.InputBinding
	 * @generated
	 */
	public Adapter createInputBindingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.Iterate <em>Iterate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.Iterate
	 * @generated
	 */
	public Adapter createIterateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.Local <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.Local
	 * @generated
	 */
	public Adapter createLocalAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.Output
	 * @generated
	 */
	public Adapter createOutputAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.OutputBinding <em>Output Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.OutputBinding
	 * @generated
	 */
	public Adapter createOutputBindingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.Perform <em>Perform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.Perform
	 * @generated
	 */
	public Adapter createPerformAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.Process
	 * @generated
	 */
	public Adapter createProcessAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.Produce <em>Produce</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.Produce
	 * @generated
	 */
	public Adapter createProduceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.RepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.RepeatUntil
	 * @generated
	 */
	public Adapter createRepeatUntilAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.RepeatWhile <em>Repeat While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.RepeatWhile
	 * @generated
	 */
	public Adapter createRepeatWhileAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.Result
	 * @generated
	 */
	public Adapter createResultAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.ResultVar <em>Result Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.ResultVar
	 * @generated
	 */
	public Adapter createResultVarAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.SimpleProcess <em>Simple Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.SimpleProcess
	 * @generated
	 */
	public Adapter createSimpleProcessAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.Split
	 * @generated
	 */
	public Adapter createSplitAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.SplitJoin <em>Split Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.SplitJoin
	 * @generated
	 */
	public Adapter createSplitJoinAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.ValueOf <em>Value Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.ValueOf
	 * @generated
	 */
	public Adapter createValueOfAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.process.Components <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.process.Components
	 * @generated
	 */
	public Adapter createComponentsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.owls.service.ServiceModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.owls.service.ServiceModel
	 * @generated
	 */
	public Adapter createServiceModelAdapter()
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

} //ProcessAdapterFactory
