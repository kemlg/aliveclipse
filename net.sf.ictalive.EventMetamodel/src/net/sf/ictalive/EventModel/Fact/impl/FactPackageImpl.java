/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Fact.impl;

import net.sf.ictalive.EventModel.Action.ActionPackage;

import net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl;

import net.sf.ictalive.EventModel.Event.EventPackage;

import net.sf.ictalive.EventModel.Event.impl.EventPackageImpl;

import net.sf.ictalive.EventModel.Fact.Availability;
import net.sf.ictalive.EventModel.Fact.AvailabilityKind;
import net.sf.ictalive.EventModel.Fact.CommunicativeAct;
import net.sf.ictalive.EventModel.Fact.Content;
import net.sf.ictalive.EventModel.Fact.DeadlineViolation;
import net.sf.ictalive.EventModel.Fact.Disaster;
import net.sf.ictalive.EventModel.Fact.ExecutedAct;
import net.sf.ictalive.EventModel.Fact.Fact;
import net.sf.ictalive.EventModel.Fact.FactFactory;
import net.sf.ictalive.EventModel.Fact.FactPackage;
import net.sf.ictalive.EventModel.Fact.FailureAct;
import net.sf.ictalive.EventModel.Fact.InvocativeAct;
import net.sf.ictalive.EventModel.Fact.Message;
import net.sf.ictalive.EventModel.Fact.NormViolated;
import net.sf.ictalive.EventModel.Fact.ReceiveAct;
import net.sf.ictalive.EventModel.Fact.SendAct;
import net.sf.ictalive.EventModel.Fact.SessionTimeout;
import net.sf.ictalive.EventModel.Fact.StartedAct;
import net.sf.ictalive.EventModel.Fact.TaskViolation;

import net.sf.ictalive.EventModel.Objects.ObjectsPackage;

import net.sf.ictalive.EventModel.Objects.impl.ObjectsPackageImpl;

import net.sf.ictalive.coordination.actions.ActionsPackage;

import net.sf.ictalive.coordination.actions.impl.ActionsPackageImpl;

import net.sf.ictalive.coordination.agents.AgentsPackage;

import net.sf.ictalive.coordination.agents.impl.AgentsPackageImpl;

import net.sf.ictalive.coordination.tasks.TasksPackage;

import net.sf.ictalive.coordination.tasks.impl.TasksPackageImpl;

import net.sf.ictalive.opera.OM.OMPackage;

import net.sf.ictalive.opera.OM.impl.OMPackageImpl;

import net.sf.ictalive.opera.OperaPackage;

import net.sf.ictalive.opera.impl.OperaPackageImpl;

import net.sf.ictalive.owls.expr.ExprPackage;

import net.sf.ictalive.owls.expr.impl.ExprPackageImpl;

import net.sf.ictalive.owls.process.ProcessPackage;

import net.sf.ictalive.owls.process.impl.ProcessPackageImpl;

import net.sf.ictalive.owls.profile.ProfilePackage;

import net.sf.ictalive.owls.profile.impl.ProfilePackageImpl;

import net.sf.ictalive.owls.time.TimePackage;

import net.sf.ictalive.owls.time.impl.TimePackageImpl;

import net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage;

import net.sf.ictalive.owls.wsdlGrounding.impl.WsdlGroundingPackageImpl;

import net.sf.ictalive.schema.SchemaPackage;

import net.sf.ictalive.schema.impl.SchemaPackageImpl;

import net.sf.ictalive.service.ServicePackage;

import net.sf.ictalive.service.architecture.ArchitecturePackage;

import net.sf.ictalive.service.architecture.impl.ArchitecturePackageImpl;

import net.sf.ictalive.service.impl.ServicePackageImpl;

import net.sf.ictalive.service.semantics.SemanticsPackage;

import net.sf.ictalive.service.semantics.impl.SemanticsPackageImpl;

import net.sf.ictalive.service.syntax.SyntaxPackage;

import net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl;

import net.sf.ictalive.service.template.TemplatePackage;

import net.sf.ictalive.service.template.impl.TemplatePackageImpl;

import net.sf.ictalive.swrl.SwrlPackage;

import net.sf.ictalive.swrl.impl.SwrlPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FactPackageImpl extends EPackageImpl implements FactPackage
{
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
	private EClass normViolatedEClass = null;

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
	private EClass sessionTimeoutEClass = null;

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
	private EEnum availabilityKindEEnum = null;

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
	 * @see net.sf.ictalive.EventModel.Fact.FactPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FactPackageImpl()
	{
		super(eNS_URI, FactFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FactPackage init()
	{
		if (isInited) return (FactPackage)EPackage.Registry.INSTANCE.getEPackage(FactPackage.eNS_URI);

		// Obtain or create and register package
		FactPackageImpl theFactPackage = (FactPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof FactPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new FactPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
		ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);
		ObjectsPackageImpl theObjectsPackage = (ObjectsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ObjectsPackage.eNS_URI) instanceof ObjectsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ObjectsPackage.eNS_URI) : ObjectsPackage.eINSTANCE);
		TasksPackageImpl theTasksPackage = (TasksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TasksPackage.eNS_URI) instanceof TasksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TasksPackage.eNS_URI) : TasksPackage.eINSTANCE);
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) instanceof ActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) : ActionsPackage.eINSTANCE);
		AgentsPackageImpl theAgentsPackage = (AgentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AgentsPackage.eNS_URI) instanceof AgentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AgentsPackage.eNS_URI) : AgentsPackage.eINSTANCE);
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) instanceof ServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) : ServicePackage.eINSTANCE);
		SyntaxPackageImpl theSyntaxPackage = (SyntaxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SyntaxPackage.eNS_URI) instanceof SyntaxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SyntaxPackage.eNS_URI) : SyntaxPackage.eINSTANCE);
		SemanticsPackageImpl theSemanticsPackage = (SemanticsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SemanticsPackage.eNS_URI) instanceof SemanticsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SemanticsPackage.eNS_URI) : SemanticsPackage.eINSTANCE);
		TemplatePackageImpl theTemplatePackage = (TemplatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI) instanceof TemplatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI) : TemplatePackage.eINSTANCE);
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) instanceof ArchitecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) : ArchitecturePackage.eINSTANCE);
		OperaPackageImpl theOperaPackage = (OperaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperaPackage.eNS_URI) instanceof OperaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperaPackage.eNS_URI) : OperaPackage.eINSTANCE);
		OMPackageImpl theOMPackage = (OMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OMPackage.eNS_URI) instanceof OMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OMPackage.eNS_URI) : OMPackage.eINSTANCE);
		WsdlGroundingPackageImpl theWsdlGroundingPackage = (WsdlGroundingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WsdlGroundingPackage.eNS_URI) instanceof WsdlGroundingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WsdlGroundingPackage.eNS_URI) : WsdlGroundingPackage.eINSTANCE);
		ProcessPackageImpl theProcessPackage = (ProcessPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI) instanceof ProcessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI) : ProcessPackage.eINSTANCE);
		net.sf.ictalive.owls.service.impl.ServicePackageImpl theServicePackage_1 = (net.sf.ictalive.owls.service.impl.ServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(net.sf.ictalive.owls.service.ServicePackage.eNS_URI) instanceof net.sf.ictalive.owls.service.impl.ServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(net.sf.ictalive.owls.service.ServicePackage.eNS_URI) : net.sf.ictalive.owls.service.ServicePackage.eINSTANCE);
		ProfilePackageImpl theProfilePackage = (ProfilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProfilePackage.eNS_URI) instanceof ProfilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProfilePackage.eNS_URI) : ProfilePackage.eINSTANCE);
		ExprPackageImpl theExprPackage = (ExprPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExprPackage.eNS_URI) instanceof ExprPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExprPackage.eNS_URI) : ExprPackage.eINSTANCE);
		TimePackageImpl theTimePackage = (TimePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI) instanceof TimePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI) : TimePackage.eINSTANCE);
		SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI) instanceof SchemaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI) : SchemaPackage.eINSTANCE);
		SwrlPackageImpl theSwrlPackage = (SwrlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SwrlPackage.eNS_URI) instanceof SwrlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SwrlPackage.eNS_URI) : SwrlPackage.eINSTANCE);

		// Create package meta-data objects
		theFactPackage.createPackageContents();
		theEventPackage.createPackageContents();
		theActionPackage.createPackageContents();
		theObjectsPackage.createPackageContents();
		theTasksPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theAgentsPackage.createPackageContents();
		theServicePackage.createPackageContents();
		theSyntaxPackage.createPackageContents();
		theSemanticsPackage.createPackageContents();
		theTemplatePackage.createPackageContents();
		theArchitecturePackage.createPackageContents();
		theOperaPackage.createPackageContents();
		theOMPackage.createPackageContents();
		theWsdlGroundingPackage.createPackageContents();
		theProcessPackage.createPackageContents();
		theServicePackage_1.createPackageContents();
		theProfilePackage.createPackageContents();
		theExprPackage.createPackageContents();
		theTimePackage.createPackageContents();
		theSchemaPackage.createPackageContents();
		theSwrlPackage.createPackageContents();

		// Initialize created meta-data
		theFactPackage.initializePackageContents();
		theEventPackage.initializePackageContents();
		theActionPackage.initializePackageContents();
		theObjectsPackage.initializePackageContents();
		theTasksPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theAgentsPackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theSyntaxPackage.initializePackageContents();
		theSemanticsPackage.initializePackageContents();
		theTemplatePackage.initializePackageContents();
		theArchitecturePackage.initializePackageContents();
		theOperaPackage.initializePackageContents();
		theOMPackage.initializePackageContents();
		theWsdlGroundingPackage.initializePackageContents();
		theProcessPackage.initializePackageContents();
		theServicePackage_1.initializePackageContents();
		theProfilePackage.initializePackageContents();
		theExprPackage.initializePackageContents();
		theTimePackage.initializePackageContents();
		theSchemaPackage.initializePackageContents();
		theSwrlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFactPackage.freeze();

		return theFactPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFact()
	{
		return factEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFact_DueTo()
	{
		return (EReference)factEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFact_Effect()
	{
		return (EReference)factEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFact_Relate()
	{
		return (EReference)factEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartedAct()
	{
		return startedActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutedAct()
	{
		return executedActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureAct()
	{
		return failureActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureAct_Reason()
	{
		return (EReference)failureActEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisaster()
	{
		return disasterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisaster_Reason()
	{
		return (EReference)disasterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormViolated()
	{
		return normViolatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormViolated_Who()
	{
		return (EReference)normViolatedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormViolated_Norm()
	{
		return (EReference)normViolatedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicativeAct()
	{
		return communicativeActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicativeAct_Sender()
	{
		return (EReference)communicativeActEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicativeAct_Receiver()
	{
		return (EReference)communicativeActEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicativeAct_Action()
	{
		return (EReference)communicativeActEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveAct()
	{
		return receiveActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveAct_ReceivedMessage()
	{
		return (EReference)receiveActEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendAct()
	{
		return sendActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendAct_SendMessage()
	{
		return (EReference)sendActEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocativeAct()
	{
		return invocativeActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocativeAct_Action()
	{
		return (EReference)invocativeActEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage()
	{
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Object()
	{
		return (EReference)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContent()
	{
		return contentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_Fact()
	{
		return (EReference)contentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_Effect()
	{
		return (EReference)contentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeadlineViolation()
	{
		return deadlineViolationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeadlineViolation_Dealine()
	{
		return (EAttribute)deadlineViolationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskViolation()
	{
		return taskViolationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskViolation_UnmetRequirement()
	{
		return (EReference)taskViolationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSessionTimeout()
	{
		return sessionTimeoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvailability()
	{
		return availabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAvailability_OfResource()
	{
		return (EReference)availabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailability_Stutus()
	{
		return (EAttribute)availabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAvailabilityKind()
	{
		return availabilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactFactory getFactFactory()
	{
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
	public void createPackageContents()
	{
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

		disasterEClass = createEClass(DISASTER);
		createEReference(disasterEClass, DISASTER__REASON);

		normViolatedEClass = createEClass(NORM_VIOLATED);
		createEReference(normViolatedEClass, NORM_VIOLATED__WHO);
		createEReference(normViolatedEClass, NORM_VIOLATED__NORM);

		communicativeActEClass = createEClass(COMMUNICATIVE_ACT);
		createEReference(communicativeActEClass, COMMUNICATIVE_ACT__SENDER);
		createEReference(communicativeActEClass, COMMUNICATIVE_ACT__RECEIVER);
		createEReference(communicativeActEClass, COMMUNICATIVE_ACT__ACTION);

		receiveActEClass = createEClass(RECEIVE_ACT);
		createEReference(receiveActEClass, RECEIVE_ACT__RECEIVED_MESSAGE);

		sendActEClass = createEClass(SEND_ACT);
		createEReference(sendActEClass, SEND_ACT__SEND_MESSAGE);

		invocativeActEClass = createEClass(INVOCATIVE_ACT);
		createEReference(invocativeActEClass, INVOCATIVE_ACT__ACTION);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__OBJECT);

		contentEClass = createEClass(CONTENT);
		createEReference(contentEClass, CONTENT__FACT);
		createEReference(contentEClass, CONTENT__EFFECT);

		deadlineViolationEClass = createEClass(DEADLINE_VIOLATION);
		createEAttribute(deadlineViolationEClass, DEADLINE_VIOLATION__DEALINE);

		taskViolationEClass = createEClass(TASK_VIOLATION);
		createEReference(taskViolationEClass, TASK_VIOLATION__UNMET_REQUIREMENT);

		sessionTimeoutEClass = createEClass(SESSION_TIMEOUT);

		availabilityEClass = createEClass(AVAILABILITY);
		createEReference(availabilityEClass, AVAILABILITY__OF_RESOURCE);
		createEAttribute(availabilityEClass, AVAILABILITY__STUTUS);

		// Create enums
		availabilityKindEEnum = createEEnum(AVAILABILITY_KIND);
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

		// Obtain other dependent packages
		ActionPackage theActionPackage = (ActionPackage)EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI);
		EventPackage theEventPackage = (EventPackage)EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI);
		OMPackage theOMPackage = (OMPackage)EPackage.Registry.INSTANCE.getEPackage(OMPackage.eNS_URI);
		ObjectsPackage theObjectsPackage = (ObjectsPackage)EPackage.Registry.INSTANCE.getEPackage(ObjectsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		startedActEClass.getESuperTypes().add(this.getInvocativeAct());
		executedActEClass.getESuperTypes().add(this.getInvocativeAct());
		failureActEClass.getESuperTypes().add(this.getInvocativeAct());
		disasterEClass.getESuperTypes().add(this.getFact());
		normViolatedEClass.getESuperTypes().add(this.getFact());
		communicativeActEClass.getESuperTypes().add(this.getFact());
		receiveActEClass.getESuperTypes().add(this.getCommunicativeAct());
		sendActEClass.getESuperTypes().add(this.getCommunicativeAct());
		invocativeActEClass.getESuperTypes().add(this.getFact());
		deadlineViolationEClass.getESuperTypes().add(this.getNormViolated());
		taskViolationEClass.getESuperTypes().add(this.getNormViolated());
		sessionTimeoutEClass.getESuperTypes().add(this.getNormViolated());
		availabilityEClass.getESuperTypes().add(this.getFact());

		// Initialize classes and features; add operations and parameters
		initEClass(factEClass, Fact.class, "Fact", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFact_DueTo(), theActionPackage.getAction(), null, "dueTo", null, 0, 1, Fact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFact_Effect(), theActionPackage.getAction(), null, "effect", null, 0, 1, Fact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFact_Relate(), this.getFact(), null, "relate", null, 0, 1, Fact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startedActEClass, StartedAct.class, "StartedAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executedActEClass, ExecutedAct.class, "ExecutedAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(failureActEClass, FailureAct.class, "FailureAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureAct_Reason(), ecorePackage.getEObject(), null, "reason", null, 0, 1, FailureAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disasterEClass, Disaster.class, "Disaster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisaster_Reason(), ecorePackage.getEObject(), null, "reason", null, 0, 1, Disaster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normViolatedEClass, NormViolated.class, "NormViolated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormViolated_Who(), theEventPackage.getActor(), null, "who", null, 0, 1, NormViolated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNormViolated_Norm(), theOMPackage.getNorm(), null, "norm", null, 0, 1, NormViolated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicativeActEClass, CommunicativeAct.class, "CommunicativeAct", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicativeAct_Sender(), theEventPackage.getActor(), null, "sender", null, 0, 1, CommunicativeAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicativeAct_Receiver(), theEventPackage.getActor(), null, "receiver", null, 0, 1, CommunicativeAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicativeAct_Action(), theActionPackage.getCommunicativeAction(), null, "action", null, 0, 1, CommunicativeAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(receiveActEClass, ReceiveAct.class, "ReceiveAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceiveAct_ReceivedMessage(), this.getMessage(), null, "receivedMessage", null, 0, 1, ReceiveAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendActEClass, SendAct.class, "SendAct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendAct_SendMessage(), this.getMessage(), null, "sendMessage", null, 0, 1, SendAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invocativeActEClass, InvocativeAct.class, "InvocativeAct", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvocativeAct_Action(), theActionPackage.getCoordinationAction(), null, "action", null, 1, 1, InvocativeAct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessage_Object(), ecorePackage.getEObject(), null, "object", null, 1, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentEClass, Content.class, "Content", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContent_Fact(), this.getFact(), null, "fact", null, 1, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_Effect(), theActionPackage.getAction(), null, "effect", null, 0, -1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deadlineViolationEClass, DeadlineViolation.class, "DeadlineViolation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeadlineViolation_Dealine(), ecorePackage.getEDate(), "dealine", null, 0, 1, DeadlineViolation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskViolationEClass, TaskViolation.class, "TaskViolation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskViolation_UnmetRequirement(), theOMPackage.getObjective(), null, "unmetRequirement", null, 0, -1, TaskViolation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sessionTimeoutEClass, SessionTimeout.class, "SessionTimeout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(availabilityEClass, Availability.class, "Availability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAvailability_OfResource(), theObjectsPackage.getResource(), null, "ofResource", null, 0, 1, Availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAvailability_Stutus(), this.getAvailabilityKind(), "stutus", null, 0, 1, Availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(availabilityKindEEnum, AvailabilityKind.class, "AvailabilityKind");
		addEEnumLiteral(availabilityKindEEnum, AvailabilityKind.AVAILABLE);
		addEEnumLiteral(availabilityKindEEnum, AvailabilityKind.NO_AVAILABLE);
		addEEnumLiteral(availabilityKindEEnum, AvailabilityKind.BUSY);

		// Create resource
		createResource(eNS_URI);
	}

} //FactPackageImpl
