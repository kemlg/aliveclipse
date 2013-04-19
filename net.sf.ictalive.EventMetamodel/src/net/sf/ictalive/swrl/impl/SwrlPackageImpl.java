/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.swrl.impl;

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

import net.sf.ictalive.service.template.TemplatePackage;

import net.sf.ictalive.service.template.impl.TemplatePackageImpl;

import net.sf.ictalive.swrl.Annotation;
import net.sf.ictalive.swrl.Antecedent;
import net.sf.ictalive.swrl.Atom;
import net.sf.ictalive.swrl.BuiltInAtom;
import net.sf.ictalive.swrl.ClassAtom;
import net.sf.ictalive.swrl.Consequent;
import net.sf.ictalive.swrl.DataLiteral;
import net.sf.ictalive.swrl.DataObject;
import net.sf.ictalive.swrl.DataRangeAtom;
import net.sf.ictalive.swrl.DataValuedPropertyAtom;
import net.sf.ictalive.swrl.DataVariable;
import net.sf.ictalive.swrl.DifferentFromAtom;
import net.sf.ictalive.swrl.IndividualID;
import net.sf.ictalive.swrl.IndividualObject;
import net.sf.ictalive.swrl.IndividualPropertyAtom;
import net.sf.ictalive.swrl.IndividualVariable;
import net.sf.ictalive.swrl.Rule;
import net.sf.ictalive.swrl.RuleType;
import net.sf.ictalive.swrl.SameAsAtom;
import net.sf.ictalive.swrl.SwrlFactory;
import net.sf.ictalive.swrl.SwrlPackage;

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
public class SwrlPackageImpl extends EPackageImpl implements SwrlPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antecedentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consequentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualPropertyAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sameAsAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass differentFromAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builtInAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRangeAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataValuedPropertyAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ruleTypeEEnum = null;

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
	 * @see net.sf.ictalive.swrl.SwrlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SwrlPackageImpl()
	{
		super(eNS_URI, SwrlFactory.eINSTANCE);
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
	public static SwrlPackage init()
	{
		if (isInited) return (SwrlPackage)EPackage.Registry.INSTANCE.getEPackage(SwrlPackage.eNS_URI);

		// Obtain or create and register package
		SwrlPackageImpl theSwrlPackage = (SwrlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SwrlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SwrlPackageImpl());

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

		// Create package meta-data objects
		theSwrlPackage.createPackageContents();
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

		// Initialize created meta-data
		theSwrlPackage.initializePackageContents();
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

		// Mark meta-data to indicate it can't be changed
		theSwrlPackage.freeze();

		return theSwrlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule()
	{
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_URIReference()
	{
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Type()
	{
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Annotation()
	{
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Body()
	{
		return (EReference)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Head()
	{
		return (EReference)ruleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation()
	{
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Desc()
	{
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtom()
	{
		return atomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAntecedent()
	{
		return antecedentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAntecedent_Atom()
	{
		return (EReference)antecedentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsequent()
	{
		return consequentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsequent_Atom()
	{
		return (EReference)consequentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassAtom()
	{
		return classAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassAtom_Description()
	{
		return (EAttribute)classAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAtom_Arg()
	{
		return (EReference)classAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualPropertyAtom()
	{
		return individualPropertyAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndividualPropertyAtom_Predicate()
	{
		return (EAttribute)individualPropertyAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualPropertyAtom_Arg1()
	{
		return (EReference)individualPropertyAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualPropertyAtom_Arg2()
	{
		return (EReference)individualPropertyAtomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualObject()
	{
		return individualObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualVariable()
	{
		return individualVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndividualVariable_Name()
	{
		return (EAttribute)individualVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualID()
	{
		return individualIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndividualID_Id()
	{
		return (EAttribute)individualIDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSameAsAtom()
	{
		return sameAsAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSameAsAtom_Arg1()
	{
		return (EReference)sameAsAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSameAsAtom_Arg2()
	{
		return (EReference)sameAsAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDifferentFromAtom()
	{
		return differentFromAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDifferentFromAtom_Arg1()
	{
		return (EReference)differentFromAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDifferentFromAtom_Arg2()
	{
		return (EReference)differentFromAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuiltInAtom()
	{
		return builtInAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuiltInAtom_BuiltInID()
	{
		return (EAttribute)builtInAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuiltInAtom_Arg()
	{
		return (EReference)builtInAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataObject()
	{
		return dataObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataVariable()
	{
		return dataVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataVariable_URI()
	{
		return (EAttribute)dataVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataLiteral()
	{
		return dataLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataLiteral_Value()
	{
		return (EAttribute)dataLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRangeAtom()
	{
		return dataRangeAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataRangeAtom_Predicate()
	{
		return (EAttribute)dataRangeAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataRangeAtom_Arg()
	{
		return (EReference)dataRangeAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataValuedPropertyAtom()
	{
		return dataValuedPropertyAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataValuedPropertyAtom_Predicate()
	{
		return (EAttribute)dataValuedPropertyAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataValuedPropertyAtom_Arg1()
	{
		return (EReference)dataValuedPropertyAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataValuedPropertyAtom_Arg2()
	{
		return (EReference)dataValuedPropertyAtomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRuleType()
	{
		return ruleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwrlFactory getSwrlFactory()
	{
		return (SwrlFactory)getEFactoryInstance();
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
		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__URI_REFERENCE);
		createEAttribute(ruleEClass, RULE__TYPE);
		createEReference(ruleEClass, RULE__ANNOTATION);
		createEReference(ruleEClass, RULE__BODY);
		createEReference(ruleEClass, RULE__HEAD);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__DESC);

		atomEClass = createEClass(ATOM);

		antecedentEClass = createEClass(ANTECEDENT);
		createEReference(antecedentEClass, ANTECEDENT__ATOM);

		consequentEClass = createEClass(CONSEQUENT);
		createEReference(consequentEClass, CONSEQUENT__ATOM);

		classAtomEClass = createEClass(CLASS_ATOM);
		createEAttribute(classAtomEClass, CLASS_ATOM__DESCRIPTION);
		createEReference(classAtomEClass, CLASS_ATOM__ARG);

		individualPropertyAtomEClass = createEClass(INDIVIDUAL_PROPERTY_ATOM);
		createEAttribute(individualPropertyAtomEClass, INDIVIDUAL_PROPERTY_ATOM__PREDICATE);
		createEReference(individualPropertyAtomEClass, INDIVIDUAL_PROPERTY_ATOM__ARG1);
		createEReference(individualPropertyAtomEClass, INDIVIDUAL_PROPERTY_ATOM__ARG2);

		individualObjectEClass = createEClass(INDIVIDUAL_OBJECT);

		individualVariableEClass = createEClass(INDIVIDUAL_VARIABLE);
		createEAttribute(individualVariableEClass, INDIVIDUAL_VARIABLE__NAME);

		individualIDEClass = createEClass(INDIVIDUAL_ID);
		createEAttribute(individualIDEClass, INDIVIDUAL_ID__ID);

		sameAsAtomEClass = createEClass(SAME_AS_ATOM);
		createEReference(sameAsAtomEClass, SAME_AS_ATOM__ARG1);
		createEReference(sameAsAtomEClass, SAME_AS_ATOM__ARG2);

		differentFromAtomEClass = createEClass(DIFFERENT_FROM_ATOM);
		createEReference(differentFromAtomEClass, DIFFERENT_FROM_ATOM__ARG1);
		createEReference(differentFromAtomEClass, DIFFERENT_FROM_ATOM__ARG2);

		builtInAtomEClass = createEClass(BUILT_IN_ATOM);
		createEAttribute(builtInAtomEClass, BUILT_IN_ATOM__BUILT_IN_ID);
		createEReference(builtInAtomEClass, BUILT_IN_ATOM__ARG);

		dataObjectEClass = createEClass(DATA_OBJECT);

		dataVariableEClass = createEClass(DATA_VARIABLE);
		createEAttribute(dataVariableEClass, DATA_VARIABLE__URI);

		dataLiteralEClass = createEClass(DATA_LITERAL);
		createEAttribute(dataLiteralEClass, DATA_LITERAL__VALUE);

		dataRangeAtomEClass = createEClass(DATA_RANGE_ATOM);
		createEAttribute(dataRangeAtomEClass, DATA_RANGE_ATOM__PREDICATE);
		createEReference(dataRangeAtomEClass, DATA_RANGE_ATOM__ARG);

		dataValuedPropertyAtomEClass = createEClass(DATA_VALUED_PROPERTY_ATOM);
		createEAttribute(dataValuedPropertyAtomEClass, DATA_VALUED_PROPERTY_ATOM__PREDICATE);
		createEReference(dataValuedPropertyAtomEClass, DATA_VALUED_PROPERTY_ATOM__ARG1);
		createEReference(dataValuedPropertyAtomEClass, DATA_VALUED_PROPERTY_ATOM__ARG2);

		// Create enums
		ruleTypeEEnum = createEEnum(RULE_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classAtomEClass.getESuperTypes().add(this.getAtom());
		individualPropertyAtomEClass.getESuperTypes().add(this.getAtom());
		individualVariableEClass.getESuperTypes().add(this.getIndividualObject());
		individualIDEClass.getESuperTypes().add(this.getIndividualObject());
		sameAsAtomEClass.getESuperTypes().add(this.getAtom());
		differentFromAtomEClass.getESuperTypes().add(this.getAtom());
		builtInAtomEClass.getESuperTypes().add(this.getAtom());
		dataVariableEClass.getESuperTypes().add(this.getDataObject());
		dataLiteralEClass.getESuperTypes().add(this.getDataObject());
		dataRangeAtomEClass.getESuperTypes().add(this.getAtom());
		dataValuedPropertyAtomEClass.getESuperTypes().add(this.getAtom());

		// Initialize classes and features; add operations and parameters
		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_URIReference(), ecorePackage.getEString(), "URIReference", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Type(), this.getRuleType(), "type", "0", 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Annotation(), this.getAnnotation(), null, "annotation", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Body(), this.getAntecedent(), null, "body", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Head(), this.getConsequent(), null, "head", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Desc(), ecorePackage.getEString(), "desc", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomEClass, Atom.class, "Atom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(antecedentEClass, Antecedent.class, "Antecedent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAntecedent_Atom(), this.getAtom(), null, "atom", null, 0, -1, Antecedent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consequentEClass, Consequent.class, "Consequent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConsequent_Atom(), this.getAtom(), null, "atom", null, 0, -1, Consequent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classAtomEClass, ClassAtom.class, "ClassAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassAtom_Description(), ecorePackage.getEString(), "description", null, 0, 1, ClassAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassAtom_Arg(), this.getIndividualObject(), null, "arg", null, 1, 1, ClassAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(individualPropertyAtomEClass, IndividualPropertyAtom.class, "IndividualPropertyAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndividualPropertyAtom_Predicate(), ecorePackage.getEString(), "predicate", null, 0, 1, IndividualPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividualPropertyAtom_Arg1(), this.getIndividualObject(), null, "arg1", null, 1, 1, IndividualPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividualPropertyAtom_Arg2(), this.getIndividualObject(), null, "arg2", null, 1, 1, IndividualPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(individualObjectEClass, IndividualObject.class, "IndividualObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(individualVariableEClass, IndividualVariable.class, "IndividualVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndividualVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, IndividualVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(individualIDEClass, IndividualID.class, "IndividualID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndividualID_Id(), ecorePackage.getEString(), "id", null, 1, 1, IndividualID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sameAsAtomEClass, SameAsAtom.class, "SameAsAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSameAsAtom_Arg1(), this.getIndividualObject(), null, "arg1", null, 1, 1, SameAsAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSameAsAtom_Arg2(), this.getIndividualObject(), null, "arg2", null, 1, 1, SameAsAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(differentFromAtomEClass, DifferentFromAtom.class, "DifferentFromAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDifferentFromAtom_Arg1(), this.getIndividualObject(), null, "arg1", null, 1, 1, DifferentFromAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDifferentFromAtom_Arg2(), this.getIndividualObject(), null, "arg2", null, 1, 1, DifferentFromAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(builtInAtomEClass, BuiltInAtom.class, "BuiltInAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuiltInAtom_BuiltInID(), ecorePackage.getEString(), "builtInID", null, 0, 1, BuiltInAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuiltInAtom_Arg(), this.getDataObject(), null, "arg", null, 0, -1, BuiltInAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataObjectEClass, DataObject.class, "DataObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataVariableEClass, DataVariable.class, "DataVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataVariable_URI(), ecorePackage.getEString(), "URI", null, 0, 1, DataVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataLiteralEClass, DataLiteral.class, "DataLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, DataLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataRangeAtomEClass, DataRangeAtom.class, "DataRangeAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataRangeAtom_Predicate(), ecorePackage.getEString(), "predicate", null, 1, 1, DataRangeAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRangeAtom_Arg(), this.getDataObject(), null, "arg", null, 1, 1, DataRangeAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataValuedPropertyAtomEClass, DataValuedPropertyAtom.class, "DataValuedPropertyAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataValuedPropertyAtom_Predicate(), ecorePackage.getEString(), "predicate", null, 0, 1, DataValuedPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataValuedPropertyAtom_Arg1(), this.getIndividualObject(), null, "arg1", null, 1, 1, DataValuedPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataValuedPropertyAtom_Arg2(), this.getDataObject(), null, "arg2", null, 1, 1, DataValuedPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ruleTypeEEnum, RuleType.class, "RuleType");
		addEEnumLiteral(ruleTypeEEnum, RuleType.IMPLIES);

		// Create resource
		createResource(eNS_URI);
	}

} //SwrlPackageImpl
