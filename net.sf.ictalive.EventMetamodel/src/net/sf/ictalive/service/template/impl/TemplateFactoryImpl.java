/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template.impl;

import net.sf.ictalive.service.template.*;

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
public class TemplateFactoryImpl extends EFactoryImpl implements TemplateFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TemplateFactory init()
	{
		try
		{
			TemplateFactory theTemplateFactory = (TemplateFactory)EPackage.Registry.INSTANCE.getEFactory("http://alive/serviceLevel/template/0.5"); 
			if (theTemplateFactory != null)
			{
				return theTemplateFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TemplateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateFactoryImpl()
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
			case TemplatePackage.SERVICE_TEMPLATE: return createServiceTemplate();
			case TemplatePackage.TEMPLATE_FLOW: return createTemplateFlow();
			case TemplatePackage.GROUND_TEMPLATE: return createGroundTemplate();
			case TemplatePackage.ABSTRACT_PROCESS_MODEL: return createAbstractProcessModel();
			case TemplatePackage.BOUND_TEMPLATE_PARAMETER: return createBoundTemplateParameter();
			case TemplatePackage.BOUND_PROCESS_MODEL: return createBoundProcessModel();
			case TemplatePackage.TEMPLATE_CONSTRAINT: return createTemplateConstraint();
			case TemplatePackage.ANY_ORDER: return createAnyOrder();
			case TemplatePackage.CHOICE: return createChoice();
			case TemplatePackage.IF_THEN_ELSE: return createIfThenElse();
			case TemplatePackage.PERFORM: return createPerform();
			case TemplatePackage.REPEAT_UNTIL: return createRepeatUntil();
			case TemplatePackage.REPEAT_WHILE: return createRepeatWhile();
			case TemplatePackage.SEQUENCE: return createSequence();
			case TemplatePackage.SPLIT: return createSplit();
			case TemplatePackage.SPLIT_JOIN: return createSplitJoin();
			case TemplatePackage.CONTROL_CONSTRUCT_LIST: return createControlConstructList();
			case TemplatePackage.CONTROL_CONSTRUCT_BAG: return createControlConstructBag();
			case TemplatePackage.INTERVAL_THING: return createIntervalThing();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTemplate createServiceTemplate()
	{
		ServiceTemplateImpl serviceTemplate = new ServiceTemplateImpl();
		return serviceTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateFlow createTemplateFlow()
	{
		TemplateFlowImpl templateFlow = new TemplateFlowImpl();
		return templateFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundTemplate createGroundTemplate()
	{
		GroundTemplateImpl groundTemplate = new GroundTemplateImpl();
		return groundTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractProcessModel createAbstractProcessModel()
	{
		AbstractProcessModelImpl abstractProcessModel = new AbstractProcessModelImpl();
		return abstractProcessModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundTemplateParameter createBoundTemplateParameter()
	{
		BoundTemplateParameterImpl boundTemplateParameter = new BoundTemplateParameterImpl();
		return boundTemplateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundProcessModel createBoundProcessModel()
	{
		BoundProcessModelImpl boundProcessModel = new BoundProcessModelImpl();
		return boundProcessModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateConstraint createTemplateConstraint()
	{
		TemplateConstraintImpl templateConstraint = new TemplateConstraintImpl();
		return templateConstraint;
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
	public IntervalThing createIntervalThing()
	{
		IntervalThingImpl intervalThing = new IntervalThingImpl();
		return intervalThing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplatePackage getTemplatePackage()
	{
		return (TemplatePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TemplatePackage getPackage()
	{
		return TemplatePackage.eINSTANCE;
	}

} //TemplateFactoryImpl
