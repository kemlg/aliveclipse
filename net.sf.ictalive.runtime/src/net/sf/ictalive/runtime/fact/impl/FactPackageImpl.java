/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact.impl;

import net.sf.ictalive.coordination.tasks.TasksPackage;

import net.sf.ictalive.operetta.OM.OMPackage;

import net.sf.ictalive.runtime.NormInstances.NormInstancesPackage;

import net.sf.ictalive.runtime.action.ActionPackage;

import net.sf.ictalive.runtime.action.impl.ActionPackageImpl;

import net.sf.ictalive.runtime.enactment.EnactmentPackage;

import net.sf.ictalive.runtime.enactment.impl.EnactmentPackageImpl;

import net.sf.ictalive.runtime.event.EventPackage;

import net.sf.ictalive.runtime.event.impl.EventPackageImpl;

import net.sf.ictalive.runtime.fact.Availability;
import net.sf.ictalive.runtime.fact.AvailabilityKind;
import net.sf.ictalive.runtime.fact.CommunicativeAct;
import net.sf.ictalive.runtime.fact.Content;
import net.sf.ictalive.runtime.fact.DeadlineViolation;
import net.sf.ictalive.runtime.fact.Disaster;
import net.sf.ictalive.runtime.fact.ExecutedAct;
import net.sf.ictalive.runtime.fact.Fact;
import net.sf.ictalive.runtime.fact.FactFactory;
import net.sf.ictalive.runtime.fact.FactPackage;
import net.sf.ictalive.runtime.fact.FailureAct;
import net.sf.ictalive.runtime.fact.FailureReasons;
import net.sf.ictalive.runtime.fact.FulfilmentAct;
import net.sf.ictalive.runtime.fact.InvocativeAct;
import net.sf.ictalive.runtime.fact.LandmarkFulfilment;
import net.sf.ictalive.runtime.fact.Message;
import net.sf.ictalive.runtime.fact.NormAct;
import net.sf.ictalive.runtime.fact.NormConditionFulfilment;
import net.sf.ictalive.runtime.fact.NormInstanceAct;
import net.sf.ictalive.runtime.fact.NormInstanceActivated;
import net.sf.ictalive.runtime.fact.NormInstanceExpired;
import net.sf.ictalive.runtime.fact.NormInstanceViolated;
import net.sf.ictalive.runtime.fact.NormType;
import net.sf.ictalive.runtime.fact.ObjectiveFulfilment;
import net.sf.ictalive.runtime.fact.OrganisationAct;
import net.sf.ictalive.runtime.fact.PlayerFulfilment;
import net.sf.ictalive.runtime.fact.ReceiveAct;
import net.sf.ictalive.runtime.fact.SendAct;
import net.sf.ictalive.runtime.fact.StartedAct;
import net.sf.ictalive.runtime.fact.TaskViolation;

import net.sf.ictalive.service.ServicePackage;

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
public class FactPackageImpl extends EPackageImpl implements FactPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startedActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executedActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disasterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicativeActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocativeActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deadlineViolationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskViolationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fulfilmentActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass landmarkFulfilmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normConditionFulfilmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveFulfilmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerFulfilmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normInstanceActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normInstanceViolatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normInstanceActivatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normInstanceExpiredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum availabilityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum normTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum failureReasonsEEnum = null;

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
	 * @see net.sf.ictalive.runtime.fact.FactPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FactPackageImpl() {
		super(eNS_URI, FactFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FactPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FactPackage init() {
		if (isInited) return (FactPackage)EPackage.Registry.INSTANCE.getEPackage(FactPackage.eNS_URI);

		// Obtain or create and register package
		FactPackageImpl theFactPackage = (FactPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FactPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FactPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TasksPackage.eINSTANCE.eClass();
		NormInstancesPackage.eINSTANCE.eClass();
		ServicePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);
		EnactmentPackageImpl theEnactmentPackage = (EnactmentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnactmentPackage.eNS_URI) instanceof EnactmentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnactmentPackage.eNS_URI) : EnactmentPackage.eINSTANCE);
		EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);

		// Create package meta-data objects
		theFactPackage.createPackageContents();
		theActionPackage.createPackageContents();
		theEnactmentPackage.createPackageContents();
		theEventPackage.createPackageContents();

		// Initialize created meta-data
		theFactPackage.initializePackageContents();
		theActionPackage.initializePackageContents();
		theEnactmentPackage.initializePackageContents();
		theEventPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFactPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FactPackage.eNS_URI, theFactPackage);
		return theFactPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFact() {
		return factEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFact_DueTo() {
		return (EReference)factEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFact_Effect() {
		return (EReference)factEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFact_Relate() {
		return (EReference)factEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartedAct() {
		return startedActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutedAct() {
		return executedActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureAct() {
		return failureActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureAct_Reason() {
		return (EReference)failureActEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailureAct_FailureReason() {
		return (EAttribute)failureActEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisaster() {
		return disasterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisaster_Reason() {
		return (EReference)disasterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormAct() {
		return normActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormAct_Who() {
		return (EReference)normActEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormAct_Norm() {
		return (EReference)normActEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicativeAct() {
		return communicativeActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicativeAct_Sender() {
		return (EReference)communicativeActEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicativeAct_Receiver() {
		return (EReference)communicativeActEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveAct() {
		return receiveActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveAct_ReceivedMessage() {
		return (EReference)receiveActEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendAct() {
		return sendActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendAct_SendMessage() {
		return (EReference)sendActEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocativeAct() {
		return invocativeActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Object() {
		return (EReference)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Body() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContent() {
		return contentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_Fact() {
		return (EReference)contentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_Effect() {
		return (EReference)contentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeadlineViolation() {
		return deadlineViolationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeadlineViolation_Dealine() {
		return (EAttribute)deadlineViolationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskViolation() {
		return taskViolationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskViolation_UnmetRequirement() {
		return (EReference)taskViolationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskViolation_Task() {
		return (EReference)taskViolationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvailability() {
		return availabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAvailability_OfResource() {
		return (EReference)availabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailability_Status() {
		return (EAttribute)availabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFulfilmentAct() {
		return fulfilmentActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFulfilmentAct_RelatedEvent() {
		return (EReference)fulfilmentActEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFulfilmentAct_Satisfy() {
		return (EAttribute)fulfilmentActEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLandmarkFulfilment() {
		return landmarkFulfilmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLandmarkFulfilment_Landmark() {
		return (EReference)landmarkFulfilmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormConditionFulfilment() {
		return normConditionFulfilmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormConditionFulfilment_Norm() {
		return (EReference)normConditionFulfilmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormConditionFulfilment_Type() {
		return (EAttribute)normConditionFulfilmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectiveFulfilment() {
		return objectiveFulfilmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectiveFulfilment_Objective() {
		return (EReference)objectiveFulfilmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganisationAct() {
		return organisationActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayerFulfilment() {
		return playerFulfilmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayerFulfilment_Player() {
		return (EReference)playerFulfilmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayerFulfilment_Satisfy() {
		return (EAttribute)playerFulfilmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormInstanceAct() {
		return normInstanceActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormInstanceAct_NormInstance() {
		return (EReference)normInstanceActEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormInstanceViolated() {
		return normInstanceViolatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormInstanceActivated() {
		return normInstanceActivatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormInstanceExpired() {
		return normInstanceExpiredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAvailabilityKind() {
		return availabilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNormType() {
		return normTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFailureReasons() {
		return failureReasonsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactFactory getFactFactory() {
		return (FactFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		factEClass = createEClass(FACT);
		createEReference(factEClass, FACT__DUE_TO);
		createEReference(factEClass, FACT__EFFECT);
		createEReference(factEClass, FACT__RELATE);

		startedActEClass = createEClass(STARTED_ACT);

		executedActEClass = createEClass(EXECUTED_ACT);

		failureActEClass = createEClass(FAILURE_ACT);
		createEReference(failureActEClass, FAILURE_ACT__REASON);
		createEAttribute(failureActEClass, FAILURE_ACT__FAILURE_REASON);

		disasterEClass = createEClass(DISASTER);
		createEReference(disasterEClass, DISASTER__REASON);

		normActEClass = createEClass(NORM_ACT);
		createEReference(normActEClass, NORM_ACT__WHO);
		createEReference(normActEClass, NORM_ACT__NORM);

		communicativeActEClass = createEClass(COMMUNICATIVE_ACT);
		createEReference(communicativeActEClass, COMMUNICATIVE_ACT__SENDER);
		createEReference(communicativeActEClass, COMMUNICATIVE_ACT__RECEIVER);

		receiveActEClass = createEClass(RECEIVE_ACT);
		createEReference(receiveActEClass, RECEIVE_ACT__RECEIVED_MESSAGE);

		sendActEClass = createEClass(SEND_ACT);
		createEReference(sendActEClass, SEND_ACT__SEND_MESSAGE);

		invocativeActEClass = createEClass(INVOCATIVE_ACT);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__OBJECT);
		createEAttribute(messageEClass, MESSAGE__BODY);

		contentEClass = createEClass(CONTENT);
		createEReference(contentEClass, CONTENT__FACT);
		createEReference(contentEClass, CONTENT__EFFECT);

		deadlineViolationEClass = createEClass(DEADLINE_VIOLATION);
		createEAttribute(deadlineViolationEClass, DEADLINE_VIOLATION__DEALINE);

		taskViolationEClass = createEClass(TASK_VIOLATION);
		createEReference(taskViolationEClass, TASK_VIOLATION__UNMET_REQUIREMENT);
		createEReference(taskViolationEClass, TASK_VIOLATION__TASK);

		availabilityEClass = createEClass(AVAILABILITY);
		createEReference(availabilityEClass, AVAILABILITY__OF_RESOURCE);
		createEAttribute(availabilityEClass, AVAILABILITY__STATUS);

		fulfilmentActEClass = createEClass(FULFILMENT_ACT);
		createEReference(fulfilmentActEClass, FULFILMENT_ACT__RELATED_EVENT);
		createEAttribute(fulfilmentActEClass, FULFILMENT_ACT__SATISFY);

		landmarkFulfilmentEClass = createEClass(LANDMARK_FULFILMENT);
		createEReference(landmarkFulfilmentEClass, LANDMARK_FULFILMENT__LANDMARK);

		normConditionFulfilmentEClass = createEClass(NORM_CONDITION_FULFILMENT);
		createEReference(normConditionFulfilmentEClass, NORM_CONDITION_FULFILMENT__NORM);
		createEAttribute(normConditionFulfilmentEClass, NORM_CONDITION_FULFILMENT__TYPE);

		objectiveFulfilmentEClass = createEClass(OBJECTIVE_FULFILMENT);
		createEReference(objectiveFulfilmentEClass, OBJECTIVE_FULFILMENT__OBJECTIVE);

		organisationActEClass = createEClass(ORGANISATION_ACT);

		playerFulfilmentEClass = createEClass(PLAYER_FULFILMENT);
		createEReference(playerFulfilmentEClass, PLAYER_FULFILMENT__PLAYER);
		createEAttribute(playerFulfilmentEClass, PLAYER_FULFILMENT__SATISFY);

		normInstanceActEClass = createEClass(NORM_INSTANCE_ACT);
		createEReference(normInstanceActEClass, NORM_INSTANCE_ACT__NORM_INSTANCE);

		normInstanceViolatedEClass = createEClass(NORM_INSTANCE_VIOLATED);

		normInstanceActivatedEClass = createEClass(NORM_INSTANCE_ACTIVATED);

		normInstanceExpiredEClass = createEClass(NORM_INSTANCE_EXPIRED);

		// Create enums
		availabilityKindEEnum = createEEnum(AVAILABILITY_KIND);
		normTypeEEnum = createEEnum(NORM_TYPE);
		failureReasonsEEnum = createEEnum(FAILURE_REASONS);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ActionPackage theActionPackage = (ActionPackage)EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI);
		EventPackage theEventPackage = (EventPackage)EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI);
		OMPackage theOMPackage = (OMPackage)EPackage.Registry.INSTANCE.getEPackage(OMPackage.eNS_URI);
		TasksPackage theTasksPackage = (TasksPackage)EPackage.Registry.INSTANCE.getEPackage(TasksPackage.eNS_URI);
		EnactmentPackage theEnactmentPackage = (EnactmentPackage)EPackage.Registry.INSTANCE.getEPackage(EnactmentPackage.eNS_URI);
		NormInstancesPackage theNormInstancesPackage = (NormInstancesPackage)EPackage.Registry.INSTANCE.getEPackage(NormInstancesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		startedActEClass.getESuperTypes().add(this.getInvocativeAct());
		executedActEClass.getESuperTypes().add(this.getInvocativeAct());
		failureActEClass.getESuperTypes().add(this.getInvocativeAct());
		disasterEClass.getESuperTypes().add(this.getFact());
		normActEClass.getESuperTypes().add(this.getFact());
		communicativeActEClass.getESuperTypes().add(this.getFact());
		receiveActEClass.getESuperTypes().add(this.getCommunicativeAct());
		sendActEClass.getESuperTypes().add(this.getCommunicativeAct());
		invocativeActEClass.getESuperTypes().add(this.getFact());
		deadlineViolationEClass.getESuperTypes().add(this.getNormAct());
		taskViolationEClass.getESuperTypes().add(this.getNormAct());
		availabilityEClass.getESuperTypes().add(this.getFact());
		fulfilmentActEClass.getESuperTypes().add(this.getFact());
		landmarkFulfilmentEClass.getESuperTypes().add(this.getFulfilmentAct());
		normConditionFulfilmentEClass.getESuperTypes().add(this.getFulfilmentAct());
		objectiveFulfilmentEClass.getESuperTypes().add(this.getFulfilmentAct());
		organisationActEClass.getESuperTypes().add(this.getFact());
		playerFulfilmentEClass.getESuperTypes().add(this.getOrganisationAct());
		normInstanceActEClass.getESuperTypes().add(this.getFact());
		normInstanceViolatedEClass.getESuperTypes().add(this.getNormInstanceAct());
		normInstanceActivatedEClass.getESuperTypes().add(this.getNormInstanceAct());
		normInstanceExpiredEClass.getESuperTypes().add(this.getNormInstanceAct());

		// Initialize classes and features; add operations and parameters
		initEClass(factEClass, Fact.class, "Fact", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFact_DueTo(), theActionPackage.getAction(), null, "dueTo", null, 0, 1, Fact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFact_Effect(), theActionPackage.getAction(), null, "effect", null, 0, 1, Fact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFact_Relate(), this.getFact(), null, "relate", null, 0, -1, Fact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startedActEClass, StartedAct.class, "StartedAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executedActEClass, ExecutedAct.class, "ExecutedAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(failureActEClass, FailureAct.class, "FailureAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureAct_Reason(), ecorePackage.getEObject(), null, "reason", null, 0, 1, FailureAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailureAct_FailureReason(), this.getFailureReasons(), "failureReason", null, 0, 1, FailureAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disasterEClass, Disaster.class, "Disaster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisaster_Reason(), ecorePackage.getEObject(), null, "reason", null, 0, 1, Disaster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normActEClass, NormAct.class, "NormAct", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormAct_Who(), theEventPackage.getActor(), null, "who", null, 0, 1, NormAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNormAct_Norm(), theOMPackage.getNorm(), null, "norm", null, 0, 1, NormAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicativeActEClass, CommunicativeAct.class, "CommunicativeAct", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicativeAct_Sender(), theEventPackage.getActor(), null, "sender", null, 0, 1, CommunicativeAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicativeAct_Receiver(), theEventPackage.getActor(), null, "receiver", null, 0, 1, CommunicativeAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(receiveActEClass, ReceiveAct.class, "ReceiveAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceiveAct_ReceivedMessage(), this.getMessage(), null, "receivedMessage", null, 0, 1, ReceiveAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendActEClass, SendAct.class, "SendAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendAct_SendMessage(), this.getMessage(), null, "sendMessage", null, 0, 1, SendAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invocativeActEClass, InvocativeAct.class, "InvocativeAct", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessage_Object(), ecorePackage.getEObject(), null, "object", null, 1, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Body(), ecorePackage.getEString(), "body", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentEClass, Content.class, "Content", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContent_Fact(), this.getFact(), null, "fact", null, 1, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_Effect(), theActionPackage.getAction(), null, "effect", null, 0, -1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deadlineViolationEClass, DeadlineViolation.class, "DeadlineViolation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeadlineViolation_Dealine(), ecorePackage.getEDate(), "dealine", null, 0, 1, DeadlineViolation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskViolationEClass, TaskViolation.class, "TaskViolation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskViolation_UnmetRequirement(), theOMPackage.getObjective(), null, "unmetRequirement", null, 0, -1, TaskViolation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskViolation_Task(), theTasksPackage.getTask(), null, "task", null, 0, 1, TaskViolation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(availabilityEClass, Availability.class, "Availability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAvailability_OfResource(), theEnactmentPackage.getResource(), null, "ofResource", null, 0, 1, Availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAvailability_Status(), this.getAvailabilityKind(), "status", null, 0, 1, Availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fulfilmentActEClass, FulfilmentAct.class, "FulfilmentAct", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFulfilmentAct_RelatedEvent(), theEventPackage.getEvent(), null, "relatedEvent", null, 1, -1, FulfilmentAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFulfilmentAct_Satisfy(), ecorePackage.getEBoolean(), "satisfy", null, 0, 1, FulfilmentAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(landmarkFulfilmentEClass, LandmarkFulfilment.class, "LandmarkFulfilment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLandmarkFulfilment_Landmark(), theOMPackage.getLandmark(), null, "landmark", null, 1, 1, LandmarkFulfilment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normConditionFulfilmentEClass, NormConditionFulfilment.class, "NormConditionFulfilment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormConditionFulfilment_Norm(), theOMPackage.getNorm(), null, "norm", null, 1, 1, NormConditionFulfilment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNormConditionFulfilment_Type(), this.getNormType(), "type", null, 0, 1, NormConditionFulfilment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectiveFulfilmentEClass, ObjectiveFulfilment.class, "ObjectiveFulfilment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectiveFulfilment_Objective(), theOMPackage.getObjective(), null, "objective", null, 1, 1, ObjectiveFulfilment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organisationActEClass, OrganisationAct.class, "OrganisationAct", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(playerFulfilmentEClass, PlayerFulfilment.class, "PlayerFulfilment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlayerFulfilment_Player(), theOMPackage.getPlayer(), null, "player", null, 0, 1, PlayerFulfilment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerFulfilment_Satisfy(), ecorePackage.getEBoolean(), "satisfy", null, 0, 1, PlayerFulfilment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normInstanceActEClass, NormInstanceAct.class, "NormInstanceAct", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormInstanceAct_NormInstance(), theNormInstancesPackage.getNormInstance(), null, "normInstance", null, 0, 1, NormInstanceAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normInstanceViolatedEClass, NormInstanceViolated.class, "NormInstanceViolated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(normInstanceActivatedEClass, NormInstanceActivated.class, "NormInstanceActivated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(normInstanceExpiredEClass, NormInstanceExpired.class, "NormInstanceExpired", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(availabilityKindEEnum, AvailabilityKind.class, "AvailabilityKind");
		addEEnumLiteral(availabilityKindEEnum, AvailabilityKind.AVAILABLE);
		addEEnumLiteral(availabilityKindEEnum, AvailabilityKind.NO_AVAILABLE);
		addEEnumLiteral(availabilityKindEEnum, AvailabilityKind.BUSY);

		initEEnum(normTypeEEnum, NormType.class, "NormType");
		addEEnumLiteral(normTypeEEnum, NormType.DEADLINE);
		addEEnumLiteral(normTypeEEnum, NormType.ACTIVATION_CONDITION);
		addEEnumLiteral(normTypeEEnum, NormType.EXPIRATION_CONDITION);
		addEEnumLiteral(normTypeEEnum, NormType.MAINTAINANCE_CONDITION);
		addEEnumLiteral(normTypeEEnum, NormType.WHAT);

		initEEnum(failureReasonsEEnum, FailureReasons.class, "FailureReasons");
		addEEnumLiteral(failureReasonsEEnum, FailureReasons.UNABLETO_PLAN_FOR_TASK);
		addEEnumLiteral(failureReasonsEEnum, FailureReasons.ACTION_NOT_PERFORMED_BY_AROLE);
		addEEnumLiteral(failureReasonsEEnum, FailureReasons.PRECONDITION_FAIL);
		addEEnumLiteral(failureReasonsEEnum, FailureReasons.ZERO_SERVICE_MATCHES_FOR_ACTION);
		addEEnumLiteral(failureReasonsEEnum, FailureReasons.NO_USABLE_SERVICE_MATCHES_FOR_ACTION);
		addEEnumLiteral(failureReasonsEEnum, FailureReasons.SERVICE_UNAVAILABLE);
		addEEnumLiteral(failureReasonsEEnum, FailureReasons.SERVICE_FAILURE);
		addEEnumLiteral(failureReasonsEEnum, FailureReasons.NULL_POINTER_EXCEPTION);

		// Create resource
		createResource(eNS_URI);
	}

} //FactPackageImpl
