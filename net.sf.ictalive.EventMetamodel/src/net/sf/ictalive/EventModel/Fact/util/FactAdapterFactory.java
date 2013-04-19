/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Fact.util;

import net.sf.ictalive.EventModel.Fact.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.EventModel.Fact.FactPackage
 * @generated
 */
public class FactAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FactPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = FactPackage.eINSTANCE;
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
	protected FactSwitch<Adapter> modelSwitch =
		new FactSwitch<Adapter>()
		{
			@Override
			public Adapter caseFact(Fact object)
			{
				return createFactAdapter();
			}
			@Override
			public Adapter caseStartedAct(StartedAct object)
			{
				return createStartedActAdapter();
			}
			@Override
			public Adapter caseExecutedAct(ExecutedAct object)
			{
				return createExecutedActAdapter();
			}
			@Override
			public Adapter caseFailureAct(FailureAct object)
			{
				return createFailureActAdapter();
			}
			@Override
			public Adapter caseDisaster(Disaster object)
			{
				return createDisasterAdapter();
			}
			@Override
			public Adapter caseNormViolated(NormViolated object)
			{
				return createNormViolatedAdapter();
			}
			@Override
			public Adapter caseCommunicativeAct(CommunicativeAct object)
			{
				return createCommunicativeActAdapter();
			}
			@Override
			public Adapter caseReceiveAct(ReceiveAct object)
			{
				return createReceiveActAdapter();
			}
			@Override
			public Adapter caseSendAct(SendAct object)
			{
				return createSendActAdapter();
			}
			@Override
			public Adapter caseInvocativeAct(InvocativeAct object)
			{
				return createInvocativeActAdapter();
			}
			@Override
			public Adapter caseMessage(Message object)
			{
				return createMessageAdapter();
			}
			@Override
			public Adapter caseContent(Content object)
			{
				return createContentAdapter();
			}
			@Override
			public Adapter caseDeadlineViolation(DeadlineViolation object)
			{
				return createDeadlineViolationAdapter();
			}
			@Override
			public Adapter caseTaskViolation(TaskViolation object)
			{
				return createTaskViolationAdapter();
			}
			@Override
			public Adapter caseSessionTimeout(SessionTimeout object)
			{
				return createSessionTimeoutAdapter();
			}
			@Override
			public Adapter caseAvailability(Availability object)
			{
				return createAvailabilityAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.EventModel.Fact.Fact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.EventModel.Fact.Fact
	 * @generated
	 */
	public Adapter createFactAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.EventModel.Fact.StartedAct <em>Started Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.EventModel.Fact.StartedAct
	 * @generated
	 */
	public Adapter createStartedActAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.EventModel.Fact.ExecutedAct <em>Executed Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.EventModel.Fact.ExecutedAct
	 * @generated
	 */
	public Adapter createExecutedActAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.EventModel.Fact.FailureAct <em>Failure Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.EventModel.Fact.FailureAct
	 * @generated
	 */
	public Adapter createFailureActAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.EventModel.Fact.Disaster <em>Disaster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.EventModel.Fact.Disaster
	 * @generated
	 */
	public Adapter createDisasterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.EventModel.Fact.NormViolated <em>Norm Violated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.EventModel.Fact.NormViolated
	 * @generated
	 */
	public Adapter createNormViolatedAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.EventModel.Fact.CommunicativeAct <em>Communicative Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.EventModel.Fact.CommunicativeAct
	 * @generated
	 */
	public Adapter createCommunicativeActAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.EventModel.Fact.ReceiveAct <em>Receive Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.EventModel.Fact.ReceiveAct
	 * @generated
	 */
	public Adapter createReceiveActAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.EventModel.Fact.SendAct <em>Send Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.EventModel.Fact.SendAct
	 * @generated
	 */
	public Adapter createSendActAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.EventModel.Fact.InvocativeAct <em>Invocative Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.EventModel.Fact.InvocativeAct
	 * @generated
	 */
	public Adapter createInvocativeActAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.EventModel.Fact.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.EventModel.Fact.Message
	 * @generated
	 */
	public Adapter createMessageAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.EventModel.Fact.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.EventModel.Fact.Content
	 * @generated
	 */
	public Adapter createContentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.EventModel.Fact.DeadlineViolation <em>Deadline Violation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.EventModel.Fact.DeadlineViolation
	 * @generated
	 */
	public Adapter createDeadlineViolationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.EventModel.Fact.TaskViolation <em>Task Violation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.EventModel.Fact.TaskViolation
	 * @generated
	 */
	public Adapter createTaskViolationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.EventModel.Fact.SessionTimeout <em>Session Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.EventModel.Fact.SessionTimeout
	 * @generated
	 */
	public Adapter createSessionTimeoutAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.EventModel.Fact.Availability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.EventModel.Fact.Availability
	 * @generated
	 */
	public Adapter createAvailabilityAdapter()
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

} //FactAdapterFactory
