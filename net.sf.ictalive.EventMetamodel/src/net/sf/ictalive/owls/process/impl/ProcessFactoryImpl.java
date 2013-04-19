/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process.impl;

import net.sf.ictalive.owls.process.AnyOrder;
import net.sf.ictalive.owls.process.AtomicProcess;
import net.sf.ictalive.owls.process.Binding;
import net.sf.ictalive.owls.process.Choice;
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
import net.sf.ictalive.owls.process.ProcessFactory;
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

import org.eclipse.emf.ecore.EClass;
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
public class ProcessFactoryImpl extends EFactoryImpl implements ProcessFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessFactory init()
	{
		try
		{
			ProcessFactory theProcessFactory = (ProcessFactory)EPackage.Registry.INSTANCE.getEFactory("http://owls/process/1.1"); 
			if (theProcessFactory != null)
			{
				return theProcessFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProcessFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessFactoryImpl()
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
			case ProcessPackage.ANY_ORDER: return createAnyOrder();
			case ProcessPackage.ATOMIC_PROCESS: return createAtomicProcess();
			case ProcessPackage.BINDING: return createBinding();
			case ProcessPackage.CHOICE: return createChoice();
			case ProcessPackage.COMPOSITE_PROCESS: return createCompositeProcess();
			case ProcessPackage.CONTROL_CONSTRUCT: return createControlConstruct();
			case ProcessPackage.CONTROL_CONSTRUCT_BAG: return createControlConstructBag();
			case ProcessPackage.CONTROL_CONSTRUCT_LIST: return createControlConstructList();
			case ProcessPackage.IF_THEN_ELSE: return createIfThenElse();
			case ProcessPackage.INPUT: return createInput();
			case ProcessPackage.INPUT_BINDING: return createInputBinding();
			case ProcessPackage.ITERATE: return createIterate();
			case ProcessPackage.LOCAL: return createLocal();
			case ProcessPackage.OUTPUT: return createOutput();
			case ProcessPackage.OUTPUT_BINDING: return createOutputBinding();
			case ProcessPackage.PARAMETER: return createParameter();
			case ProcessPackage.PARTICIPANT: return createParticipant();
			case ProcessPackage.PERFORM: return createPerform();
			case ProcessPackage.PROCESS: return createProcess();
			case ProcessPackage.PRODUCE: return createProduce();
			case ProcessPackage.REPEAT_UNTIL: return createRepeatUntil();
			case ProcessPackage.REPEAT_WHILE: return createRepeatWhile();
			case ProcessPackage.RESULT: return createResult();
			case ProcessPackage.RESULT_VAR: return createResultVar();
			case ProcessPackage.SEQUENCE: return createSequence();
			case ProcessPackage.SIMPLE_PROCESS: return createSimpleProcess();
			case ProcessPackage.SPLIT: return createSplit();
			case ProcessPackage.SPLIT_JOIN: return createSplitJoin();
			case ProcessPackage.VALUE_OF: return createValueOf();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public AtomicProcess createAtomicProcess()
	{
		AtomicProcessImpl atomicProcess = new AtomicProcessImpl();
		return atomicProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding()
	{
		BindingImpl binding = new BindingImpl();
		return binding;
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
	public CompositeProcess createCompositeProcess()
	{
		CompositeProcessImpl compositeProcess = new CompositeProcessImpl();
		return compositeProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstruct createControlConstruct()
	{
		ControlConstructImpl controlConstruct = new ControlConstructImpl();
		return controlConstruct;
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
	public Iterate createIterate()
	{
		IterateImpl iterate = new IterateImpl();
		return iterate;
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
	public Parameter createParameter()
	{
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant()
	{
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
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
	public net.sf.ictalive.owls.process.Process createProcess()
	{
		ProcessImpl process = new ProcessImpl();
		return process;
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
	public SimpleProcess createSimpleProcess()
	{
		SimpleProcessImpl simpleProcess = new SimpleProcessImpl();
		return simpleProcess;
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
	public ValueOf createValueOf()
	{
		ValueOfImpl valueOf = new ValueOfImpl();
		return valueOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPackage getProcessPackage()
	{
		return (ProcessPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProcessPackage getPackage()
	{
		return ProcessPackage.eINSTANCE;
	}

} //ProcessFactoryImpl
