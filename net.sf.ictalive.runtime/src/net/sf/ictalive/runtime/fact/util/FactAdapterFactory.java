/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact.util;

import net.sf.ictalive.runtime.fact.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.runtime.fact.FactPackage
 * @generated
 */
public class FactAdapterFactory extends AdapterFactoryImpl {
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
	public FactAdapterFactory() {
		if (modelPackage == null) {
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
	public boolean isFactoryForType(Object object) {
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
	protected FactSwitch<Adapter> modelSwitch =
		new FactSwitch<Adapter>() {
			@Override
			public Adapter caseFact(Fact object) {
				return createFactAdapter();
			}
			@Override
			public Adapter caseStartedAct(StartedAct object) {
				return createStartedActAdapter();
			}
			@Override
			public Adapter caseExecutedAct(ExecutedAct object) {
				return createExecutedActAdapter();
			}
			@Override
			public Adapter caseFailureAct(FailureAct object) {
				return createFailureActAdapter();
			}
			@Override
			public Adapter caseDisaster(Disaster object) {
				return createDisasterAdapter();
			}
			@Override
			public Adapter caseNormAct(NormAct object) {
				return createNormActAdapter();
			}
			@Override
			public Adapter caseCommunicativeAct(CommunicativeAct object) {
				return createCommunicativeActAdapter();
			}
			@Override
			public Adapter caseReceiveAct(ReceiveAct object) {
				return createReceiveActAdapter();
			}
			@Override
			public Adapter caseSendAct(SendAct object) {
				return createSendActAdapter();
			}
			@Override
			public Adapter caseInvocativeAct(InvocativeAct object) {
				return createInvocativeActAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseContent(Content object) {
				return createContentAdapter();
			}
			@Override
			public Adapter caseDeadlineViolation(DeadlineViolation object) {
				return createDeadlineViolationAdapter();
			}
			@Override
			public Adapter caseTaskViolation(TaskViolation object) {
				return createTaskViolationAdapter();
			}
			@Override
			public Adapter caseAvailability(Availability object) {
				return createAvailabilityAdapter();
			}
			@Override
			public Adapter caseFulfilmentAct(FulfilmentAct object) {
				return createFulfilmentActAdapter();
			}
			@Override
			public Adapter caseLandmarkFulfilment(LandmarkFulfilment object) {
				return createLandmarkFulfilmentAdapter();
			}
			@Override
			public Adapter caseNormConditionFulfilment(NormConditionFulfilment object) {
				return createNormConditionFulfilmentAdapter();
			}
			@Override
			public Adapter caseObjectiveFulfilment(ObjectiveFulfilment object) {
				return createObjectiveFulfilmentAdapter();
			}
			@Override
			public Adapter caseOrganisationAct(OrganisationAct object) {
				return createOrganisationActAdapter();
			}
			@Override
			public Adapter casePlayerFulfilment(PlayerFulfilment object) {
				return createPlayerFulfilmentAdapter();
			}
			@Override
			public Adapter caseNormInstanceAct(NormInstanceAct object) {
				return createNormInstanceActAdapter();
			}
			@Override
			public Adapter caseNormInstanceViolated(NormInstanceViolated object) {
				return createNormInstanceViolatedAdapter();
			}
			@Override
			public Adapter caseNormInstanceActivated(NormInstanceActivated object) {
				return createNormInstanceActivatedAdapter();
			}
			@Override
			public Adapter caseNormInstanceExpired(NormInstanceExpired object) {
				return createNormInstanceExpiredAdapter();
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.Fact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.Fact
	 * @generated
	 */
	public Adapter createFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.StartedAct <em>Started Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.StartedAct
	 * @generated
	 */
	public Adapter createStartedActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.ExecutedAct <em>Executed Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.ExecutedAct
	 * @generated
	 */
	public Adapter createExecutedActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.FailureAct <em>Failure Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.FailureAct
	 * @generated
	 */
	public Adapter createFailureActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.Disaster <em>Disaster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.Disaster
	 * @generated
	 */
	public Adapter createDisasterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.NormAct <em>Norm Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.NormAct
	 * @generated
	 */
	public Adapter createNormActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.CommunicativeAct <em>Communicative Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.CommunicativeAct
	 * @generated
	 */
	public Adapter createCommunicativeActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.ReceiveAct <em>Receive Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.ReceiveAct
	 * @generated
	 */
	public Adapter createReceiveActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.SendAct <em>Send Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.SendAct
	 * @generated
	 */
	public Adapter createSendActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.InvocativeAct <em>Invocative Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.InvocativeAct
	 * @generated
	 */
	public Adapter createInvocativeActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.Content
	 * @generated
	 */
	public Adapter createContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.DeadlineViolation <em>Deadline Violation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.DeadlineViolation
	 * @generated
	 */
	public Adapter createDeadlineViolationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.TaskViolation <em>Task Violation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.TaskViolation
	 * @generated
	 */
	public Adapter createTaskViolationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.Availability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.Availability
	 * @generated
	 */
	public Adapter createAvailabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.FulfilmentAct <em>Fulfilment Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.FulfilmentAct
	 * @generated
	 */
	public Adapter createFulfilmentActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.LandmarkFulfilment <em>Landmark Fulfilment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.LandmarkFulfilment
	 * @generated
	 */
	public Adapter createLandmarkFulfilmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.NormConditionFulfilment <em>Norm Condition Fulfilment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.NormConditionFulfilment
	 * @generated
	 */
	public Adapter createNormConditionFulfilmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.ObjectiveFulfilment <em>Objective Fulfilment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.ObjectiveFulfilment
	 * @generated
	 */
	public Adapter createObjectiveFulfilmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.OrganisationAct <em>Organisation Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.OrganisationAct
	 * @generated
	 */
	public Adapter createOrganisationActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.PlayerFulfilment <em>Player Fulfilment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.PlayerFulfilment
	 * @generated
	 */
	public Adapter createPlayerFulfilmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.NormInstanceAct <em>Norm Instance Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.NormInstanceAct
	 * @generated
	 */
	public Adapter createNormInstanceActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.NormInstanceViolated <em>Norm Instance Violated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.NormInstanceViolated
	 * @generated
	 */
	public Adapter createNormInstanceViolatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.NormInstanceActivated <em>Norm Instance Activated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.NormInstanceActivated
	 * @generated
	 */
	public Adapter createNormInstanceActivatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.ictalive.runtime.fact.NormInstanceExpired <em>Norm Instance Expired</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.ictalive.runtime.fact.NormInstanceExpired
	 * @generated
	 */
	public Adapter createNormInstanceExpiredAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FactAdapterFactory
