/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template.impl;

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

import net.sf.ictalive.service.syntax.SyntaxPackage;

import net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl;

import net.sf.ictalive.service.template.AbstractProcessModel;
import net.sf.ictalive.service.template.AnyOrder;
import net.sf.ictalive.service.template.BoundProcessModel;
import net.sf.ictalive.service.template.BoundTemplateParameter;
import net.sf.ictalive.service.template.Choice;
import net.sf.ictalive.service.template.ControlConstruct;
import net.sf.ictalive.service.template.ControlConstructBag;
import net.sf.ictalive.service.template.ControlConstructList;
import net.sf.ictalive.service.template.GroundTemplate;
import net.sf.ictalive.service.template.IfThenElse;
import net.sf.ictalive.service.template.IntervalThing;
import net.sf.ictalive.service.template.Iterate;
import net.sf.ictalive.service.template.Perform;
import net.sf.ictalive.service.template.RepeatUntil;
import net.sf.ictalive.service.template.RepeatWhile;
import net.sf.ictalive.service.template.Sequence;
import net.sf.ictalive.service.template.ServiceTemplate;
import net.sf.ictalive.service.template.Split;
import net.sf.ictalive.service.template.SplitJoin;
import net.sf.ictalive.service.template.TemplateConstraint;
import net.sf.ictalive.service.template.TemplateFactory;
import net.sf.ictalive.service.template.TemplateFlow;
import net.sf.ictalive.service.template.TemplatePackage;

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
public class TemplatePackageImpl extends EPackageImpl implements TemplatePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groundTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractProcessModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundTemplateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundProcessModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlConstructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifThenElseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatUntilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatWhileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitJoinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlConstructListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlConstructBagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalThingEClass = null;

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
	 * @see net.sf.ictalive.service.template.TemplatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TemplatePackageImpl()
	{
		super(eNS_URI, TemplateFactory.eINSTANCE);
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
	public static TemplatePackage init()
	{
		if (isInited) return (TemplatePackage)EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI);

		// Obtain or create and register package
		TemplatePackageImpl theTemplatePackage = (TemplatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof TemplatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new TemplatePackageImpl());

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
		SemanticsPackageImpl theSemanticsPackage = (SemanticsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SemanticsPackage.eNS_URI) instanceof SemanticsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SemanticsPackage.eNS_URI) : SemanticsPackage.eINSTANCE);
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
		theTemplatePackage.createPackageContents();
		theEventPackage.createPackageContents();
		theActionPackage.createPackageContents();
		theFactPackage.createPackageContents();
		theObjectsPackage.createPackageContents();
		theTasksPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theAgentsPackage.createPackageContents();
		theServicePackage.createPackageContents();
		theSyntaxPackage.createPackageContents();
		theSemanticsPackage.createPackageContents();
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
		theTemplatePackage.initializePackageContents();
		theEventPackage.initializePackageContents();
		theActionPackage.initializePackageContents();
		theFactPackage.initializePackageContents();
		theObjectsPackage.initializePackageContents();
		theTasksPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theAgentsPackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theSyntaxPackage.initializePackageContents();
		theSemanticsPackage.initializePackageContents();
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
		theTemplatePackage.freeze();

		return theTemplatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceTemplate()
	{
		return serviceTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTemplate_Flow()
	{
		return (EReference)serviceTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTemplate_TemplateParameter()
	{
		return (EReference)serviceTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTemplate_Expose()
	{
		return (EReference)serviceTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTemplate_Constraints()
	{
		return (EReference)serviceTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceTemplate_URI()
	{
		return (EAttribute)serviceTemplateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateFlow()
	{
		return templateFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateFlow_ComposedOf()
	{
		return (EReference)templateFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroundTemplate()
	{
		return groundTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroundTemplate_Implement()
	{
		return (EReference)groundTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroundTemplate_BindTemplateParameter()
	{
		return (EReference)groundTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroundTemplate_BindProcessModel()
	{
		return (EReference)groundTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroundTemplate_Expose()
	{
		return (EReference)groundTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroundTemplate_Name()
	{
		return (EAttribute)groundTemplateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractProcessModel()
	{
		return abstractProcessModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractProcessModel_Name()
	{
		return (EAttribute)abstractProcessModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundTemplateParameter()
	{
		return boundTemplateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundTemplateParameter_Abstract()
	{
		return (EReference)boundTemplateParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundTemplateParameter_Concrete()
	{
		return (EReference)boundTemplateParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundProcessModel()
	{
		return boundProcessModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundProcessModel_Abstract()
	{
		return (EReference)boundProcessModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundProcessModel_Concrete()
	{
		return (EReference)boundProcessModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateConstraint()
	{
		return templateConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateConstraint_Body()
	{
		return (EReference)templateConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlConstruct()
	{
		return controlConstructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlConstruct_Timeout()
	{
		return (EReference)controlConstructEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyOrder()
	{
		return anyOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnyOrder_Components()
	{
		return (EReference)anyOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoice()
	{
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoice_Components()
	{
		return (EReference)choiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfThenElse()
	{
		return ifThenElseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfThenElse_IfCondition()
	{
		return (EReference)ifThenElseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfThenElse_Then()
	{
		return (EReference)ifThenElseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfThenElse_Else()
	{
		return (EReference)ifThenElseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterate()
	{
		return iterateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerform()
	{
		return performEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerform_PartnerProcess()
	{
		return (EReference)performEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerform_HasDataFromProcess()
	{
		return (EReference)performEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerform_ValueData()
	{
		return (EReference)performEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerform_HasDataFromTemplate()
	{
		return (EReference)performEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatUntil()
	{
		return repeatUntilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatUntil_UntilCondition()
	{
		return (EReference)repeatUntilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatUntil_UntilProcess()
	{
		return (EReference)repeatUntilEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatWhile()
	{
		return repeatWhileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatWhile_WhileCondition()
	{
		return (EReference)repeatWhileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatWhile_WhileProcess()
	{
		return (EReference)repeatWhileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence()
	{
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Components()
	{
		return (EReference)sequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplit()
	{
		return splitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplit_Components()
	{
		return (EReference)splitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitJoin()
	{
		return splitJoinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplitJoin_Components()
	{
		return (EReference)splitJoinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlConstructList()
	{
		return controlConstructListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlConstructList_First()
	{
		return (EReference)controlConstructListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlConstructList_Rest()
	{
		return (EReference)controlConstructListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlConstructBag()
	{
		return controlConstructBagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlConstructBag_First()
	{
		return (EReference)controlConstructBagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlConstructBag_Rest()
	{
		return (EReference)controlConstructBagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntervalThing()
	{
		return intervalThingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateFactory getTemplateFactory()
	{
		return (TemplateFactory)getEFactoryInstance();
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
		serviceTemplateEClass = createEClass(SERVICE_TEMPLATE);
		createEReference(serviceTemplateEClass, SERVICE_TEMPLATE__FLOW);
		createEReference(serviceTemplateEClass, SERVICE_TEMPLATE__TEMPLATE_PARAMETER);
		createEReference(serviceTemplateEClass, SERVICE_TEMPLATE__EXPOSE);
		createEReference(serviceTemplateEClass, SERVICE_TEMPLATE__CONSTRAINTS);
		createEAttribute(serviceTemplateEClass, SERVICE_TEMPLATE__URI);

		templateFlowEClass = createEClass(TEMPLATE_FLOW);
		createEReference(templateFlowEClass, TEMPLATE_FLOW__COMPOSED_OF);

		groundTemplateEClass = createEClass(GROUND_TEMPLATE);
		createEReference(groundTemplateEClass, GROUND_TEMPLATE__IMPLEMENT);
		createEReference(groundTemplateEClass, GROUND_TEMPLATE__BIND_TEMPLATE_PARAMETER);
		createEReference(groundTemplateEClass, GROUND_TEMPLATE__BIND_PROCESS_MODEL);
		createEReference(groundTemplateEClass, GROUND_TEMPLATE__EXPOSE);
		createEAttribute(groundTemplateEClass, GROUND_TEMPLATE__NAME);

		abstractProcessModelEClass = createEClass(ABSTRACT_PROCESS_MODEL);
		createEAttribute(abstractProcessModelEClass, ABSTRACT_PROCESS_MODEL__NAME);

		boundTemplateParameterEClass = createEClass(BOUND_TEMPLATE_PARAMETER);
		createEReference(boundTemplateParameterEClass, BOUND_TEMPLATE_PARAMETER__ABSTRACT);
		createEReference(boundTemplateParameterEClass, BOUND_TEMPLATE_PARAMETER__CONCRETE);

		boundProcessModelEClass = createEClass(BOUND_PROCESS_MODEL);
		createEReference(boundProcessModelEClass, BOUND_PROCESS_MODEL__ABSTRACT);
		createEReference(boundProcessModelEClass, BOUND_PROCESS_MODEL__CONCRETE);

		templateConstraintEClass = createEClass(TEMPLATE_CONSTRAINT);
		createEReference(templateConstraintEClass, TEMPLATE_CONSTRAINT__BODY);

		controlConstructEClass = createEClass(CONTROL_CONSTRUCT);
		createEReference(controlConstructEClass, CONTROL_CONSTRUCT__TIMEOUT);

		anyOrderEClass = createEClass(ANY_ORDER);
		createEReference(anyOrderEClass, ANY_ORDER__COMPONENTS);

		choiceEClass = createEClass(CHOICE);
		createEReference(choiceEClass, CHOICE__COMPONENTS);

		ifThenElseEClass = createEClass(IF_THEN_ELSE);
		createEReference(ifThenElseEClass, IF_THEN_ELSE__IF_CONDITION);
		createEReference(ifThenElseEClass, IF_THEN_ELSE__THEN);
		createEReference(ifThenElseEClass, IF_THEN_ELSE__ELSE);

		iterateEClass = createEClass(ITERATE);

		performEClass = createEClass(PERFORM);
		createEReference(performEClass, PERFORM__PARTNER_PROCESS);
		createEReference(performEClass, PERFORM__HAS_DATA_FROM_PROCESS);
		createEReference(performEClass, PERFORM__VALUE_DATA);
		createEReference(performEClass, PERFORM__HAS_DATA_FROM_TEMPLATE);

		repeatUntilEClass = createEClass(REPEAT_UNTIL);
		createEReference(repeatUntilEClass, REPEAT_UNTIL__UNTIL_CONDITION);
		createEReference(repeatUntilEClass, REPEAT_UNTIL__UNTIL_PROCESS);

		repeatWhileEClass = createEClass(REPEAT_WHILE);
		createEReference(repeatWhileEClass, REPEAT_WHILE__WHILE_CONDITION);
		createEReference(repeatWhileEClass, REPEAT_WHILE__WHILE_PROCESS);

		sequenceEClass = createEClass(SEQUENCE);
		createEReference(sequenceEClass, SEQUENCE__COMPONENTS);

		splitEClass = createEClass(SPLIT);
		createEReference(splitEClass, SPLIT__COMPONENTS);

		splitJoinEClass = createEClass(SPLIT_JOIN);
		createEReference(splitJoinEClass, SPLIT_JOIN__COMPONENTS);

		controlConstructListEClass = createEClass(CONTROL_CONSTRUCT_LIST);
		createEReference(controlConstructListEClass, CONTROL_CONSTRUCT_LIST__FIRST);
		createEReference(controlConstructListEClass, CONTROL_CONSTRUCT_LIST__REST);

		controlConstructBagEClass = createEClass(CONTROL_CONSTRUCT_BAG);
		createEReference(controlConstructBagEClass, CONTROL_CONSTRUCT_BAG__FIRST);
		createEReference(controlConstructBagEClass, CONTROL_CONSTRUCT_BAG__REST);

		intervalThingEClass = createEClass(INTERVAL_THING);
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
		SemanticsPackage theSemanticsPackage = (SemanticsPackage)EPackage.Registry.INSTANCE.getEPackage(SemanticsPackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		SwrlPackage theSwrlPackage = (SwrlPackage)EPackage.Registry.INSTANCE.getEPackage(SwrlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractProcessModelEClass.getESuperTypes().add(theSemanticsPackage.getIOEP());
		anyOrderEClass.getESuperTypes().add(this.getControlConstruct());
		choiceEClass.getESuperTypes().add(this.getControlConstruct());
		ifThenElseEClass.getESuperTypes().add(this.getControlConstruct());
		iterateEClass.getESuperTypes().add(this.getControlConstruct());
		performEClass.getESuperTypes().add(this.getControlConstruct());
		repeatUntilEClass.getESuperTypes().add(this.getIterate());
		repeatWhileEClass.getESuperTypes().add(this.getIterate());
		sequenceEClass.getESuperTypes().add(this.getControlConstruct());
		splitEClass.getESuperTypes().add(this.getControlConstruct());
		splitJoinEClass.getESuperTypes().add(this.getControlConstruct());

		// Initialize classes and features; add operations and parameters
		initEClass(serviceTemplateEClass, ServiceTemplate.class, "ServiceTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceTemplate_Flow(), this.getTemplateFlow(), null, "flow", null, 0, 1, ServiceTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceTemplate_TemplateParameter(), theSemanticsPackage.getServiceParameter(), null, "templateParameter", null, 0, -1, ServiceTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceTemplate_Expose(), this.getAbstractProcessModel(), null, "expose", null, 1, 1, ServiceTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceTemplate_Constraints(), this.getTemplateConstraint(), null, "constraints", null, 0, -1, ServiceTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceTemplate_URI(), ecorePackage.getEString(), "URI", null, 0, 1, ServiceTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateFlowEClass, TemplateFlow.class, "TemplateFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateFlow_ComposedOf(), this.getControlConstruct(), null, "composedOf", null, 0, -1, TemplateFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groundTemplateEClass, GroundTemplate.class, "GroundTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroundTemplate_Implement(), this.getServiceTemplate(), null, "implement", null, 0, 1, GroundTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroundTemplate_BindTemplateParameter(), this.getBoundTemplateParameter(), null, "bindTemplateParameter", null, 0, -1, GroundTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroundTemplate_BindProcessModel(), this.getBoundProcessModel(), null, "bindProcessModel", null, 0, -1, GroundTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroundTemplate_Expose(), theServicePackage.getService(), theServicePackage.getService_AdaptedBy(), "expose", null, 1, 1, GroundTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroundTemplate_Name(), ecorePackage.getEString(), "name", null, 0, 1, GroundTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractProcessModelEClass, AbstractProcessModel.class, "AbstractProcessModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractProcessModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundTemplateParameterEClass, BoundTemplateParameter.class, "BoundTemplateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoundTemplateParameter_Abstract(), theSemanticsPackage.getServiceParameter(), null, "abstract", null, 1, 1, BoundTemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoundTemplateParameter_Concrete(), theSemanticsPackage.getServiceParameter(), null, "concrete", null, 1, 1, BoundTemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundProcessModelEClass, BoundProcessModel.class, "BoundProcessModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoundProcessModel_Abstract(), this.getAbstractProcessModel(), null, "abstract", null, 1, 1, BoundProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoundProcessModel_Concrete(), theSemanticsPackage.getProcessModel(), null, "concrete", null, 1, 1, BoundProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateConstraintEClass, TemplateConstraint.class, "TemplateConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateConstraint_Body(), theSwrlPackage.getAntecedent(), null, "body", null, 0, -1, TemplateConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlConstructEClass, ControlConstruct.class, "ControlConstruct", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlConstruct_Timeout(), this.getIntervalThing(), null, "timeout", null, 0, 1, ControlConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anyOrderEClass, AnyOrder.class, "AnyOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnyOrder_Components(), this.getControlConstructBag(), null, "components", null, 1, 1, AnyOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChoice_Components(), this.getControlConstructBag(), null, "components", null, 1, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifThenElseEClass, IfThenElse.class, "IfThenElse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfThenElse_IfCondition(), theSwrlPackage.getAntecedent(), null, "ifCondition", null, 1, 1, IfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfThenElse_Then(), this.getControlConstruct(), null, "then", null, 1, 1, IfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfThenElse_Else(), this.getControlConstruct(), null, "else", null, 0, 1, IfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iterateEClass, Iterate.class, "Iterate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(performEClass, Perform.class, "Perform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerform_PartnerProcess(), this.getAbstractProcessModel(), null, "partnerProcess", null, 1, 1, Perform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerform_HasDataFromProcess(), this.getAbstractProcessModel(), null, "hasDataFromProcess", null, 0, 1, Perform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerform_ValueData(), theSemanticsPackage.getServiceParameter(), null, "valueData", null, 0, 1, Perform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerform_HasDataFromTemplate(), this.getServiceTemplate(), null, "hasDataFromTemplate", null, 0, 1, Perform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatUntilEClass, RepeatUntil.class, "RepeatUntil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepeatUntil_UntilCondition(), theSwrlPackage.getAntecedent(), null, "untilCondition", null, 1, 1, RepeatUntil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatUntil_UntilProcess(), this.getControlConstruct(), null, "untilProcess", null, 1, 1, RepeatUntil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatWhileEClass, RepeatWhile.class, "RepeatWhile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepeatWhile_WhileCondition(), theSwrlPackage.getAntecedent(), null, "whileCondition", null, 1, 1, RepeatWhile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatWhile_WhileProcess(), this.getControlConstruct(), null, "whileProcess", null, 1, 1, RepeatWhile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequence_Components(), this.getControlConstructList(), null, "components", null, 1, 1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(splitEClass, Split.class, "Split", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSplit_Components(), this.getControlConstructBag(), null, "components", null, 1, 1, Split.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(splitJoinEClass, SplitJoin.class, "SplitJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSplitJoin_Components(), this.getControlConstructBag(), null, "components", null, 0, 1, SplitJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlConstructListEClass, ControlConstructList.class, "ControlConstructList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlConstructList_First(), this.getControlConstruct(), null, "first", null, 0, 1, ControlConstructList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlConstructList_Rest(), this.getControlConstructList(), null, "rest", null, 0, 1, ControlConstructList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlConstructBagEClass, ControlConstructBag.class, "ControlConstructBag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlConstructBag_First(), this.getControlConstruct(), null, "first", null, 0, 1, ControlConstructBag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlConstructBag_Rest(), this.getControlConstructBag(), null, "rest", null, 0, 1, ControlConstructBag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intervalThingEClass, IntervalThing.class, "IntervalThing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //TemplatePackageImpl
