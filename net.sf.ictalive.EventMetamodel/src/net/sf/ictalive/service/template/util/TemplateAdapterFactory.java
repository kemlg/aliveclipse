/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template.util;

import net.sf.ictalive.service.semantics.IOEP;

import net.sf.ictalive.service.template.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.service.template.TemplatePackage
 * @generated
 */
public class TemplateAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TemplatePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = TemplatePackage.eINSTANCE;
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
	protected TemplateSwitch<Adapter> modelSwitch =
		new TemplateSwitch<Adapter>()
		{
			@Override
			public Adapter caseServiceTemplate(ServiceTemplate object)
			{
				return createServiceTemplateAdapter();
			}
			@Override
			public Adapter caseTemplateFlow(TemplateFlow object)
			{
				return createTemplateFlowAdapter();
			}
			@Override
			public Adapter caseGroundTemplate(GroundTemplate object)
			{
				return createGroundTemplateAdapter();
			}
			@Override
			public Adapter caseAbstractProcessModel(AbstractProcessModel object)
			{
				return createAbstractProcessModelAdapter();
			}
			@Override
			public Adapter caseBoundTemplateParameter(BoundTemplateParameter object)
			{
				return createBoundTemplateParameterAdapter();
			}
			@Override
			public Adapter caseBoundProcessModel(BoundProcessModel object)
			{
				return createBoundProcessModelAdapter();
			}
			@Override
			public Adapter caseTemplateConstraint(TemplateConstraint object)
			{
				return createTemplateConstraintAdapter();
			}
			@Override
			public Adapter caseControlConstruct(ControlConstruct object)
			{
				return createControlConstructAdapter();
			}
			@Override
			public Adapter caseAnyOrder(AnyOrder object)
			{
				return createAnyOrderAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object)
			{
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseIfThenElse(IfThenElse object)
			{
				return createIfThenElseAdapter();
			}
			@Override
			public Adapter caseIterate(Iterate object)
			{
				return createIterateAdapter();
			}
			@Override
			public Adapter casePerform(Perform object)
			{
				return createPerformAdapter();
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
			public Adapter caseSequence(Sequence object)
			{
				return createSequenceAdapter();
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
			public Adapter caseControlConstructList(ControlConstructList object)
			{
				return createControlConstructListAdapter();
			}
			@Override
			public Adapter caseControlConstructBag(ControlConstructBag object)
			{
				return createControlConstructBagAdapter();
			}
			@Override
			public Adapter caseIntervalThing(IntervalThing object)
			{
				return createIntervalThingAdapter();
			}
			@Override
			public Adapter caseIOEP(IOEP object)
			{
				return createIOEPAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.template.ServiceTemplate <em>Service Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.template.ServiceTemplate
	 * @generated
	 */
	public Adapter createServiceTemplateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.template.TemplateFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.template.TemplateFlow
	 * @generated
	 */
	public Adapter createTemplateFlowAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.template.GroundTemplate <em>Ground Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.template.GroundTemplate
	 * @generated
	 */
	public Adapter createGroundTemplateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.template.AbstractProcessModel <em>Abstract Process Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.template.AbstractProcessModel
	 * @generated
	 */
	public Adapter createAbstractProcessModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.template.BoundTemplateParameter <em>Bound Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.template.BoundTemplateParameter
	 * @generated
	 */
	public Adapter createBoundTemplateParameterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.template.BoundProcessModel <em>Bound Process Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.template.BoundProcessModel
	 * @generated
	 */
	public Adapter createBoundProcessModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.template.TemplateConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.template.TemplateConstraint
	 * @generated
	 */
	public Adapter createTemplateConstraintAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.template.ControlConstruct <em>Control Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.template.ControlConstruct
	 * @generated
	 */
	public Adapter createControlConstructAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.template.AnyOrder <em>Any Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.template.AnyOrder
	 * @generated
	 */
	public Adapter createAnyOrderAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.template.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.template.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.template.IfThenElse <em>If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.template.IfThenElse
	 * @generated
	 */
	public Adapter createIfThenElseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.template.Iterate <em>Iterate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.template.Iterate
	 * @generated
	 */
	public Adapter createIterateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.template.Perform <em>Perform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.template.Perform
	 * @generated
	 */
	public Adapter createPerformAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.template.RepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.template.RepeatUntil
	 * @generated
	 */
	public Adapter createRepeatUntilAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.template.RepeatWhile <em>Repeat While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.template.RepeatWhile
	 * @generated
	 */
	public Adapter createRepeatWhileAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.template.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.template.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.template.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.template.Split
	 * @generated
	 */
	public Adapter createSplitAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.template.SplitJoin <em>Split Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.template.SplitJoin
	 * @generated
	 */
	public Adapter createSplitJoinAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.template.ControlConstructList <em>Control Construct List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.template.ControlConstructList
	 * @generated
	 */
	public Adapter createControlConstructListAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.template.ControlConstructBag <em>Control Construct Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.template.ControlConstructBag
	 * @generated
	 */
	public Adapter createControlConstructBagAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.template.IntervalThing <em>Interval Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.template.IntervalThing
	 * @generated
	 */
	public Adapter createIntervalThingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.service.semantics.IOEP <em>IOEP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.service.semantics.IOEP
	 * @generated
	 */
	public Adapter createIOEPAdapter()
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

} //TemplateAdapterFactory
