/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics.impl;

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

import net.sf.ictalive.service.semantics.ProcessModel;
import net.sf.ictalive.service.semantics.SemanticsFactory;
import net.sf.ictalive.service.semantics.SemanticsPackage;
import net.sf.ictalive.service.semantics.ServiceCategory;
import net.sf.ictalive.service.semantics.ServiceCondition;
import net.sf.ictalive.service.semantics.ServiceGrounding;
import net.sf.ictalive.service.semantics.ServiceInput;
import net.sf.ictalive.service.semantics.ServiceOutput;
import net.sf.ictalive.service.semantics.ServiceParameter;
import net.sf.ictalive.service.semantics.ServiceProfile;
import net.sf.ictalive.service.semantics.ServiceResult;

import net.sf.ictalive.service.syntax.SyntaxPackage;

import net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl;

import net.sf.ictalive.service.template.TemplatePackage;

import net.sf.ictalive.service.template.impl.TemplatePackageImpl;

import net.sf.ictalive.swrl.SwrlPackage;

import net.sf.ictalive.swrl.impl.SwrlPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class SemanticsPackageImpl extends EPackageImpl implements SemanticsPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceGroundingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioepEClass = null;

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
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SemanticsPackageImpl()
	{
		super(eNS_URI, SemanticsFactory.eINSTANCE);
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
	public static SemanticsPackage init()
	{
		if (isInited) return (SemanticsPackage)EPackage.Registry.INSTANCE.getEPackage(SemanticsPackage.eNS_URI);

		// Obtain or create and register package
		SemanticsPackageImpl theSemanticsPackage = (SemanticsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SemanticsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SemanticsPackageImpl());

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
		SyntaxPackageImpl theSyntaxPackage = (SyntaxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SyntaxPackage.eNS_URI) instanceof SyntaxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SyntaxPackage.eNS_URI) : SyntaxPackage.eINSTANCE);
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
		theSemanticsPackage.createPackageContents();
		theEventPackage.createPackageContents();
		theActionPackage.createPackageContents();
		theFactPackage.createPackageContents();
		theObjectsPackage.createPackageContents();
		theTasksPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theAgentsPackage.createPackageContents();
		theServicePackage.createPackageContents();
		theSyntaxPackage.createPackageContents();
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
		theSemanticsPackage.initializePackageContents();
		theEventPackage.initializePackageContents();
		theActionPackage.initializePackageContents();
		theFactPackage.initializePackageContents();
		theObjectsPackage.initializePackageContents();
		theTasksPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theAgentsPackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theSyntaxPackage.initializePackageContents();
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
		theSemanticsPackage.freeze();

		return theSemanticsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceProfile()
	{
		return serviceProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProfile_PresentedBy()
	{
		return (EReference)serviceProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProfile_HasProcess()
	{
		return (EReference)serviceProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProfile_ServiceCategory()
	{
		return (EReference)serviceProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceProfile_Name()
	{
		return (EAttribute)serviceProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProfile_HasInput()
	{
		return (EReference)serviceProfileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProfile_HasOutput()
	{
		return (EReference)serviceProfileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProfile_HasResult()
	{
		return (EReference)serviceProfileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProfile_HasCondition()
	{
		return (EReference)serviceProfileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceProfile_ServiceClassification()
	{
		return (EAttribute)serviceProfileEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceGrounding()
	{
		return serviceGroundingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceGrounding_SupportedBy()
	{
		return (EReference)serviceGroundingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceGrounding_ProcessModel()
	{
		return (EReference)serviceGroundingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceGrounding_Interface()
	{
		return (EReference)serviceGroundingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceGrounding_Name()
	{
		return (EAttribute)serviceGroundingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceGrounding_BindParams()
	{
		return (EAttribute)serviceGroundingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessModel()
	{
		return processModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessModel_Name()
	{
		return (EAttribute)processModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessModel_Describes()
	{
		return (EReference)processModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceCategory()
	{
		return serviceCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceCategory_Taxonomy()
	{
		return (EAttribute)serviceCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceCategory_Value()
	{
		return (EAttribute)serviceCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceCategory_Name()
	{
		return (EAttribute)serviceCategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceCategory_Code()
	{
		return (EAttribute)serviceCategoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceParameter()
	{
		return serviceParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceParameter_Type()
	{
		return (EReference)serviceParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceParameter_Name()
	{
		return (EAttribute)serviceParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceInput()
	{
		return serviceInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceOutput()
	{
		return serviceOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceCondition()
	{
		return serviceConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceCondition_Expression()
	{
		return (EReference)serviceConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceResult()
	{
		return serviceResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceResult_Expression()
	{
		return (EReference)serviceResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceResult_Result()
	{
		return (EReference)serviceResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOEP()
	{
		return ioepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIOEP_HasInput()
	{
		return (EReference)ioepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIOEP_HasCondition()
	{
		return (EReference)ioepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIOEP_HasOutput()
	{
		return (EReference)ioepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIOEP_HasResult()
	{
		return (EReference)ioepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticsFactory getSemanticsFactory()
	{
		return (SemanticsFactory)getEFactoryInstance();
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
		serviceProfileEClass = createEClass(SERVICE_PROFILE);
		createEReference(serviceProfileEClass, SERVICE_PROFILE__PRESENTED_BY);
		createEReference(serviceProfileEClass, SERVICE_PROFILE__HAS_PROCESS);
		createEReference(serviceProfileEClass, SERVICE_PROFILE__SERVICE_CATEGORY);
		createEAttribute(serviceProfileEClass, SERVICE_PROFILE__NAME);
		createEReference(serviceProfileEClass, SERVICE_PROFILE__HAS_INPUT);
		createEReference(serviceProfileEClass, SERVICE_PROFILE__HAS_OUTPUT);
		createEReference(serviceProfileEClass, SERVICE_PROFILE__HAS_RESULT);
		createEReference(serviceProfileEClass, SERVICE_PROFILE__HAS_CONDITION);
		createEAttribute(serviceProfileEClass, SERVICE_PROFILE__SERVICE_CLASSIFICATION);

		serviceGroundingEClass = createEClass(SERVICE_GROUNDING);
		createEReference(serviceGroundingEClass, SERVICE_GROUNDING__SUPPORTED_BY);
		createEReference(serviceGroundingEClass, SERVICE_GROUNDING__PROCESS_MODEL);
		createEReference(serviceGroundingEClass, SERVICE_GROUNDING__INTERFACE);
		createEAttribute(serviceGroundingEClass, SERVICE_GROUNDING__NAME);
		createEAttribute(serviceGroundingEClass, SERVICE_GROUNDING__BIND_PARAMS);

		processModelEClass = createEClass(PROCESS_MODEL);
		createEAttribute(processModelEClass, PROCESS_MODEL__NAME);
		createEReference(processModelEClass, PROCESS_MODEL__DESCRIBES);

		serviceCategoryEClass = createEClass(SERVICE_CATEGORY);
		createEAttribute(serviceCategoryEClass, SERVICE_CATEGORY__TAXONOMY);
		createEAttribute(serviceCategoryEClass, SERVICE_CATEGORY__VALUE);
		createEAttribute(serviceCategoryEClass, SERVICE_CATEGORY__NAME);
		createEAttribute(serviceCategoryEClass, SERVICE_CATEGORY__CODE);

		serviceParameterEClass = createEClass(SERVICE_PARAMETER);
		createEReference(serviceParameterEClass, SERVICE_PARAMETER__TYPE);
		createEAttribute(serviceParameterEClass, SERVICE_PARAMETER__NAME);

		serviceInputEClass = createEClass(SERVICE_INPUT);

		serviceOutputEClass = createEClass(SERVICE_OUTPUT);

		serviceConditionEClass = createEClass(SERVICE_CONDITION);
		createEReference(serviceConditionEClass, SERVICE_CONDITION__EXPRESSION);

		serviceResultEClass = createEClass(SERVICE_RESULT);
		createEReference(serviceResultEClass, SERVICE_RESULT__EXPRESSION);
		createEReference(serviceResultEClass, SERVICE_RESULT__RESULT);

		ioepEClass = createEClass(IOEP);
		createEReference(ioepEClass, IOEP__HAS_INPUT);
		createEReference(ioepEClass, IOEP__HAS_CONDITION);
		createEReference(ioepEClass, IOEP__HAS_OUTPUT);
		createEReference(ioepEClass, IOEP__HAS_RESULT);
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
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		SyntaxPackage theSyntaxPackage = (SyntaxPackage)EPackage.Registry.INSTANCE.getEPackage(SyntaxPackage.eNS_URI);
		SwrlPackage theSwrlPackage = (SwrlPackage)EPackage.Registry.INSTANCE.getEPackage(SwrlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		processModelEClass.getESuperTypes().add(this.getIOEP());
		serviceInputEClass.getESuperTypes().add(this.getServiceParameter());
		serviceOutputEClass.getESuperTypes().add(this.getServiceParameter());

		// Initialize classes and features; add operations and parameters
		initEClass(serviceProfileEClass, ServiceProfile.class, "ServiceProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceProfile_PresentedBy(), theServicePackage.getService(), theServicePackage.getService_Presents(), "presentedBy", null, 0, 1, ServiceProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceProfile_HasProcess(), this.getProcessModel(), null, "hasProcess", null, 0, 1, ServiceProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceProfile_ServiceCategory(), this.getServiceCategory(), null, "serviceCategory", null, 0, 1, ServiceProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceProfile_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceProfile_HasInput(), this.getServiceInput(), null, "hasInput", null, 0, -1, ServiceProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceProfile_HasOutput(), this.getServiceOutput(), null, "hasOutput", null, 0, -1, ServiceProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceProfile_HasResult(), this.getServiceResult(), null, "hasResult", null, 0, -1, ServiceProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceProfile_HasCondition(), this.getServiceCondition(), null, "hasCondition", null, 0, -1, ServiceProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceProfile_ServiceClassification(), ecorePackage.getEString(), "serviceClassification", null, 0, 1, ServiceProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceGroundingEClass, ServiceGrounding.class, "ServiceGrounding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceGrounding_SupportedBy(), theServicePackage.getService(), theServicePackage.getService_Supports(), "supportedBy", null, 0, 1, ServiceGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceGrounding_ProcessModel(), this.getProcessModel(), null, "processModel", null, 0, 1, ServiceGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceGrounding_Interface(), theSyntaxPackage.getInterfaceDescription(), null, "interface", null, 0, 1, ServiceGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceGrounding_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceGrounding_BindParams(), ecorePackage.getEString(), "bindParams", null, 0, -1, ServiceGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processModelEClass, ProcessModel.class, "ProcessModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModel_Describes(), theServicePackage.getService(), theServicePackage.getService_DescribedBy(), "describes", null, 0, 1, ProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceCategoryEClass, ServiceCategory.class, "ServiceCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceCategory_Taxonomy(), ecorePackage.getEString(), "taxonomy", null, 0, 1, ServiceCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceCategory_Value(), ecorePackage.getEString(), "value", null, 0, 1, ServiceCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceCategory_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceCategory_Code(), ecorePackage.getEString(), "code", null, 0, 1, ServiceCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceParameterEClass, ServiceParameter.class, "ServiceParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceParameter_Type(), ecorePackage.getEObject(), null, "type", null, 0, 1, ServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInputEClass, ServiceInput.class, "ServiceInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceOutputEClass, ServiceOutput.class, "ServiceOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceConditionEClass, ServiceCondition.class, "ServiceCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceCondition_Expression(), theSwrlPackage.getAntecedent(), null, "expression", null, 0, 1, ServiceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceResultEClass, ServiceResult.class, "ServiceResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceResult_Expression(), theSwrlPackage.getAntecedent(), null, "expression", null, 0, 1, ServiceResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceResult_Result(), theSwrlPackage.getConsequent(), null, "result", null, 0, 1, ServiceResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ioepEClass, net.sf.ictalive.service.semantics.IOEP.class, "IOEP", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIOEP_HasInput(), this.getServiceInput(), null, "hasInput", null, 0, -1, net.sf.ictalive.service.semantics.IOEP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIOEP_HasCondition(), this.getServiceCondition(), null, "hasCondition", null, 0, -1, net.sf.ictalive.service.semantics.IOEP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIOEP_HasOutput(), this.getServiceOutput(), null, "hasOutput", null, 0, -1, net.sf.ictalive.service.semantics.IOEP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIOEP_HasResult(), this.getServiceResult(), null, "hasResult", null, 0, -1, net.sf.ictalive.service.semantics.IOEP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //SemanticsPackageImpl
