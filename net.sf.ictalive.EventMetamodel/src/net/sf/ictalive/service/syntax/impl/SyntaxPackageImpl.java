/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.syntax.impl;

import net.sf.ictalive.EventModel.Action.ActionPackage;

import net.sf.ictalive.EventModel.Action.impl.ActionPackageImpl;

import net.sf.ictalive.EventModel.Event.EventPackage;

import net.sf.ictalive.EventModel.Event.impl.EventPackageImpl;

import net.sf.ictalive.EventModel.Fact.FactPackage;

import net.sf.ictalive.EventModel.Fact.impl.FactPackageImpl;

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

import net.sf.ictalive.service.syntax.Binding;
import net.sf.ictalive.service.syntax.Endpoint;
import net.sf.ictalive.service.syntax.InterfaceDescription;
import net.sf.ictalive.service.syntax.Message;
import net.sf.ictalive.service.syntax.OperationDescription;
import net.sf.ictalive.service.syntax.StyleEncoding;
import net.sf.ictalive.service.syntax.SyntaxFactory;
import net.sf.ictalive.service.syntax.SyntaxPackage;
import net.sf.ictalive.service.syntax.TransportProtocol;

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
public class SyntaxPackageImpl extends EPackageImpl implements SyntaxPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationDescriptionEClass = null;

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
	private EClass endpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum styleEncodingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transportProtocolEEnum = null;

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
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SyntaxPackageImpl()
	{
		super(eNS_URI, SyntaxFactory.eINSTANCE);
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
	public static SyntaxPackage init()
	{
		if (isInited) return (SyntaxPackage)EPackage.Registry.INSTANCE.getEPackage(SyntaxPackage.eNS_URI);

		// Obtain or create and register package
		SyntaxPackageImpl theSyntaxPackage = (SyntaxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SyntaxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SyntaxPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
		ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);
		FactPackageImpl theFactPackage = (FactPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FactPackage.eNS_URI) instanceof FactPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FactPackage.eNS_URI) : FactPackage.eINSTANCE);
		ObjectsPackageImpl theObjectsPackage = (ObjectsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ObjectsPackage.eNS_URI) instanceof ObjectsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ObjectsPackage.eNS_URI) : ObjectsPackage.eINSTANCE);
		TasksPackageImpl theTasksPackage = (TasksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TasksPackage.eNS_URI) instanceof TasksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TasksPackage.eNS_URI) : TasksPackage.eINSTANCE);
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) instanceof ActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) : ActionsPackage.eINSTANCE);
		AgentsPackageImpl theAgentsPackage = (AgentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AgentsPackage.eNS_URI) instanceof AgentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AgentsPackage.eNS_URI) : AgentsPackage.eINSTANCE);
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) instanceof ServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) : ServicePackage.eINSTANCE);
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
		theSyntaxPackage.createPackageContents();
		theEventPackage.createPackageContents();
		theActionPackage.createPackageContents();
		theFactPackage.createPackageContents();
		theObjectsPackage.createPackageContents();
		theTasksPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theAgentsPackage.createPackageContents();
		theServicePackage.createPackageContents();
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
		theSyntaxPackage.initializePackageContents();
		theEventPackage.initializePackageContents();
		theActionPackage.initializePackageContents();
		theFactPackage.initializePackageContents();
		theObjectsPackage.initializePackageContents();
		theTasksPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theAgentsPackage.initializePackageContents();
		theServicePackage.initializePackageContents();
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
		theSyntaxPackage.freeze();

		return theSyntaxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceDescription()
	{
		return interfaceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDescription_Operation()
	{
		return (EReference)interfaceDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDescription_Name()
	{
		return (EAttribute)interfaceDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDescription_Binding()
	{
		return (EReference)interfaceDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDescription_InLineSchema()
	{
		return (EReference)interfaceDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDescription_OutLineSchema()
	{
		return (EReference)interfaceDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationDescription()
	{
		return operationDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDescription_Input()
	{
		return (EReference)operationDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDescription_Fault()
	{
		return (EReference)operationDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDescription_Output()
	{
		return (EReference)operationDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationDescription_Name()
	{
		return (EAttribute)operationDescriptionEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getMessage_Name()
	{
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Type()
	{
		return (EReference)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Element()
	{
		return (EReference)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpoint()
	{
		return endpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoint_Binding()
	{
		return (EReference)endpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoint_Implementation()
	{
		return (EReference)endpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpoint_Name()
	{
		return (EAttribute)endpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpoint_Location()
	{
		return (EAttribute)endpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoint_DeployedService()
	{
		return (EReference)endpointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinding()
	{
		return bindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinding_Name()
	{
		return (EAttribute)bindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinding_Transport()
	{
		return (EAttribute)bindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_Type()
	{
		return (EReference)bindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinding_Style()
	{
		return (EAttribute)bindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStyleEncoding()
	{
		return styleEncodingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransportProtocol()
	{
		return transportProtocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyntaxFactory getSyntaxFactory()
	{
		return (SyntaxFactory)getEFactoryInstance();
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
		interfaceDescriptionEClass = createEClass(INTERFACE_DESCRIPTION);
		createEReference(interfaceDescriptionEClass, INTERFACE_DESCRIPTION__OPERATION);
		createEAttribute(interfaceDescriptionEClass, INTERFACE_DESCRIPTION__NAME);
		createEReference(interfaceDescriptionEClass, INTERFACE_DESCRIPTION__BINDING);
		createEReference(interfaceDescriptionEClass, INTERFACE_DESCRIPTION__IN_LINE_SCHEMA);
		createEReference(interfaceDescriptionEClass, INTERFACE_DESCRIPTION__OUT_LINE_SCHEMA);

		operationDescriptionEClass = createEClass(OPERATION_DESCRIPTION);
		createEReference(operationDescriptionEClass, OPERATION_DESCRIPTION__INPUT);
		createEReference(operationDescriptionEClass, OPERATION_DESCRIPTION__FAULT);
		createEReference(operationDescriptionEClass, OPERATION_DESCRIPTION__OUTPUT);
		createEAttribute(operationDescriptionEClass, OPERATION_DESCRIPTION__NAME);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__NAME);
		createEReference(messageEClass, MESSAGE__TYPE);
		createEReference(messageEClass, MESSAGE__ELEMENT);

		endpointEClass = createEClass(ENDPOINT);
		createEReference(endpointEClass, ENDPOINT__BINDING);
		createEReference(endpointEClass, ENDPOINT__IMPLEMENTATION);
		createEAttribute(endpointEClass, ENDPOINT__NAME);
		createEAttribute(endpointEClass, ENDPOINT__LOCATION);
		createEReference(endpointEClass, ENDPOINT__DEPLOYED_SERVICE);

		bindingEClass = createEClass(BINDING);
		createEAttribute(bindingEClass, BINDING__NAME);
		createEAttribute(bindingEClass, BINDING__TRANSPORT);
		createEReference(bindingEClass, BINDING__TYPE);
		createEAttribute(bindingEClass, BINDING__STYLE);

		// Create enums
		styleEncodingEEnum = createEEnum(STYLE_ENCODING);
		transportProtocolEEnum = createEEnum(TRANSPORT_PROTOCOL);
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
		SchemaPackage theSchemaPackage = (SchemaPackage)EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		ArchitecturePackage theArchitecturePackage = (ArchitecturePackage)EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(interfaceDescriptionEClass, InterfaceDescription.class, "InterfaceDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceDescription_Operation(), this.getOperationDescription(), null, "operation", null, 1, -1, InterfaceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceDescription_Name(), ecorePackage.getEString(), "name", null, 0, 1, InterfaceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceDescription_Binding(), this.getBinding(), this.getBinding_Type(), "binding", null, 0, -1, InterfaceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceDescription_InLineSchema(), theSchemaPackage.getSchemaType(), null, "inLineSchema", null, 0, 1, InterfaceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceDescription_OutLineSchema(), theSchemaPackage.getSchemaType(), null, "outLineSchema", null, 0, -1, InterfaceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationDescriptionEClass, OperationDescription.class, "OperationDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationDescription_Input(), this.getMessage(), null, "input", null, 0, -1, OperationDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationDescription_Fault(), this.getMessage(), null, "fault", null, 0, -1, OperationDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationDescription_Output(), this.getMessage(), null, "output", null, 0, -1, OperationDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationDescription_Name(), ecorePackage.getEString(), "name", null, 0, 1, OperationDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Type(), theSchemaPackage.getTopLevelComplexType(), null, "type", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Element(), theSchemaPackage.getTopLevelElement(), null, "element", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endpointEClass, Endpoint.class, "Endpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndpoint_Binding(), this.getBinding(), null, "binding", null, 1, 1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndpoint_Implementation(), theServicePackage.getServiceImplemetation(), null, "implementation", null, 0, 1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpoint_Name(), ecorePackage.getEString(), "name", null, 0, 1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpoint_Location(), ecorePackage.getEString(), "location", null, 0, 1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndpoint_DeployedService(), theArchitecturePackage.getDeployedService(), null, "deployedService", null, 0, 1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinding_Name(), ecorePackage.getEString(), "name", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinding_Transport(), this.getTransportProtocol(), "transport", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinding_Type(), this.getInterfaceDescription(), this.getInterfaceDescription_Binding(), "type", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinding_Style(), this.getStyleEncoding(), "style", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(styleEncodingEEnum, StyleEncoding.class, "StyleEncoding");
		addEEnumLiteral(styleEncodingEEnum, StyleEncoding.DOCUMENT_LITERAL);
		addEEnumLiteral(styleEncodingEEnum, StyleEncoding.RPC_ENCODED);

		initEEnum(transportProtocolEEnum, TransportProtocol.class, "TransportProtocol");
		addEEnumLiteral(transportProtocolEEnum, TransportProtocol.SOAP);
		addEEnumLiteral(transportProtocolEEnum, TransportProtocol.HTTP);
		addEEnumLiteral(transportProtocolEEnum, TransportProtocol.MIME);
	}

} //SyntaxPackageImpl
