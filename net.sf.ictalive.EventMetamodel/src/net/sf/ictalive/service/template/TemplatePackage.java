/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.template;

import net.sf.ictalive.service.semantics.SemanticsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.service.template.TemplateFactory
 * @model kind="package"
 * @generated
 */
public interface TemplatePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "template";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://alive/serviceLevel/template/0.5";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "temp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TemplatePackage eINSTANCE = net.sf.ictalive.service.template.impl.TemplatePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.template.impl.ServiceTemplateImpl <em>Service Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.template.impl.ServiceTemplateImpl
	 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getServiceTemplate()
	 * @generated
	 */
	int SERVICE_TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE__FLOW = 0;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE__TEMPLATE_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Expose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE__EXPOSE = 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE__CONSTRAINTS = 3;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE__URI = 4;

	/**
	 * The number of structural features of the '<em>Service Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.template.impl.TemplateFlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.template.impl.TemplateFlowImpl
	 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getTemplateFlow()
	 * @generated
	 */
	int TEMPLATE_FLOW = 1;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FLOW__COMPOSED_OF = 0;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FLOW_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.template.impl.GroundTemplateImpl <em>Ground Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.template.impl.GroundTemplateImpl
	 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getGroundTemplate()
	 * @generated
	 */
	int GROUND_TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Implement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_TEMPLATE__IMPLEMENT = 0;

	/**
	 * The feature id for the '<em><b>Bind Template Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_TEMPLATE__BIND_TEMPLATE_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Bind Process Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_TEMPLATE__BIND_PROCESS_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Expose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_TEMPLATE__EXPOSE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_TEMPLATE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Ground Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_TEMPLATE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.template.impl.AbstractProcessModelImpl <em>Abstract Process Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.template.impl.AbstractProcessModelImpl
	 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getAbstractProcessModel()
	 * @generated
	 */
	int ABSTRACT_PROCESS_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Has Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS_MODEL__HAS_INPUT = SemanticsPackage.IOEP__HAS_INPUT;

	/**
	 * The feature id for the '<em><b>Has Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS_MODEL__HAS_CONDITION = SemanticsPackage.IOEP__HAS_CONDITION;

	/**
	 * The feature id for the '<em><b>Has Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS_MODEL__HAS_OUTPUT = SemanticsPackage.IOEP__HAS_OUTPUT;

	/**
	 * The feature id for the '<em><b>Has Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS_MODEL__HAS_RESULT = SemanticsPackage.IOEP__HAS_RESULT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS_MODEL__NAME = SemanticsPackage.IOEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Process Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS_MODEL_FEATURE_COUNT = SemanticsPackage.IOEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.template.impl.BoundTemplateParameterImpl <em>Bound Template Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.template.impl.BoundTemplateParameterImpl
	 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getBoundTemplateParameter()
	 * @generated
	 */
	int BOUND_TEMPLATE_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_TEMPLATE_PARAMETER__ABSTRACT = 0;

	/**
	 * The feature id for the '<em><b>Concrete</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_TEMPLATE_PARAMETER__CONCRETE = 1;

	/**
	 * The number of structural features of the '<em>Bound Template Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_TEMPLATE_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.template.impl.BoundProcessModelImpl <em>Bound Process Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.template.impl.BoundProcessModelImpl
	 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getBoundProcessModel()
	 * @generated
	 */
	int BOUND_PROCESS_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_PROCESS_MODEL__ABSTRACT = 0;

	/**
	 * The feature id for the '<em><b>Concrete</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_PROCESS_MODEL__CONCRETE = 1;

	/**
	 * The number of structural features of the '<em>Bound Process Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_PROCESS_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.template.impl.TemplateConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.template.impl.TemplateConstraintImpl
	 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getTemplateConstraint()
	 * @generated
	 */
	int TEMPLATE_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_CONSTRAINT__BODY = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.template.impl.ControlConstructImpl <em>Control Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.template.impl.ControlConstructImpl
	 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getControlConstruct()
	 * @generated
	 */
	int CONTROL_CONSTRUCT = 7;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT__TIMEOUT = 0;

	/**
	 * The number of structural features of the '<em>Control Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.template.impl.AnyOrderImpl <em>Any Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.template.impl.AnyOrderImpl
	 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getAnyOrder()
	 * @generated
	 */
	int ANY_ORDER = 8;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ORDER__TIMEOUT = CONTROL_CONSTRUCT__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ORDER__COMPONENTS = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Any Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ORDER_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.template.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.template.impl.ChoiceImpl
	 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 9;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__TIMEOUT = CONTROL_CONSTRUCT__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__COMPONENTS = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.template.impl.IfThenElseImpl <em>If Then Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.template.impl.IfThenElseImpl
	 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getIfThenElse()
	 * @generated
	 */
	int IF_THEN_ELSE = 10;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__TIMEOUT = CONTROL_CONSTRUCT__TIMEOUT;

	/**
	 * The feature id for the '<em><b>If Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__IF_CONDITION = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__THEN = CONTROL_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__ELSE = CONTROL_CONSTRUCT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Then Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.template.impl.IterateImpl <em>Iterate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.template.impl.IterateImpl
	 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getIterate()
	 * @generated
	 */
	int ITERATE = 11;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE__TIMEOUT = CONTROL_CONSTRUCT__TIMEOUT;

	/**
	 * The number of structural features of the '<em>Iterate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.template.impl.PerformImpl <em>Perform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.template.impl.PerformImpl
	 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getPerform()
	 * @generated
	 */
	int PERFORM = 12;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__TIMEOUT = CONTROL_CONSTRUCT__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Partner Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__PARTNER_PROCESS = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Data From Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__HAS_DATA_FROM_PROCESS = CONTROL_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__VALUE_DATA = CONTROL_CONSTRUCT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Data From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__HAS_DATA_FROM_TEMPLATE = CONTROL_CONSTRUCT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Perform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.template.impl.RepeatUntilImpl <em>Repeat Until</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.template.impl.RepeatUntilImpl
	 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getRepeatUntil()
	 * @generated
	 */
	int REPEAT_UNTIL = 13;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__TIMEOUT = ITERATE__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Until Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__UNTIL_CONDITION = ITERATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Until Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__UNTIL_PROCESS = ITERATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repeat Until</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL_FEATURE_COUNT = ITERATE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.template.impl.RepeatWhileImpl <em>Repeat While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.template.impl.RepeatWhileImpl
	 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getRepeatWhile()
	 * @generated
	 */
	int REPEAT_WHILE = 14;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_WHILE__TIMEOUT = ITERATE__TIMEOUT;

	/**
	 * The feature id for the '<em><b>While Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_WHILE__WHILE_CONDITION = ITERATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>While Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_WHILE__WHILE_PROCESS = ITERATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repeat While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_WHILE_FEATURE_COUNT = ITERATE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.template.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.template.impl.SequenceImpl
	 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 15;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__TIMEOUT = CONTROL_CONSTRUCT__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__COMPONENTS = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.template.impl.SplitImpl <em>Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.template.impl.SplitImpl
	 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getSplit()
	 * @generated
	 */
	int SPLIT = 16;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__TIMEOUT = CONTROL_CONSTRUCT__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__COMPONENTS = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.template.impl.SplitJoinImpl <em>Split Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.template.impl.SplitJoinImpl
	 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getSplitJoin()
	 * @generated
	 */
	int SPLIT_JOIN = 17;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_JOIN__TIMEOUT = CONTROL_CONSTRUCT__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_JOIN__COMPONENTS = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Split Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_JOIN_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.template.impl.ControlConstructListImpl <em>Control Construct List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.template.impl.ControlConstructListImpl
	 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getControlConstructList()
	 * @generated
	 */
	int CONTROL_CONSTRUCT_LIST = 18;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_LIST__FIRST = 0;

	/**
	 * The feature id for the '<em><b>Rest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_LIST__REST = 1;

	/**
	 * The number of structural features of the '<em>Control Construct List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.template.impl.ControlConstructBagImpl <em>Control Construct Bag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.template.impl.ControlConstructBagImpl
	 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getControlConstructBag()
	 * @generated
	 */
	int CONTROL_CONSTRUCT_BAG = 19;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_BAG__FIRST = 0;

	/**
	 * The feature id for the '<em><b>Rest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_BAG__REST = 1;

	/**
	 * The number of structural features of the '<em>Control Construct Bag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_BAG_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.template.impl.IntervalThingImpl <em>Interval Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.template.impl.IntervalThingImpl
	 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getIntervalThing()
	 * @generated
	 */
	int INTERVAL_THING = 20;

	/**
	 * The number of structural features of the '<em>Interval Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_THING_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.template.ServiceTemplate <em>Service Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Template</em>'.
	 * @see net.sf.ictalive.service.template.ServiceTemplate
	 * @generated
	 */
	EClass getServiceTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.template.ServiceTemplate#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flow</em>'.
	 * @see net.sf.ictalive.service.template.ServiceTemplate#getFlow()
	 * @see #getServiceTemplate()
	 * @generated
	 */
	EReference getServiceTemplate_Flow();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.template.ServiceTemplate#getTemplateParameter <em>Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Parameter</em>'.
	 * @see net.sf.ictalive.service.template.ServiceTemplate#getTemplateParameter()
	 * @see #getServiceTemplate()
	 * @generated
	 */
	EReference getServiceTemplate_TemplateParameter();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.template.ServiceTemplate#getExpose <em>Expose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expose</em>'.
	 * @see net.sf.ictalive.service.template.ServiceTemplate#getExpose()
	 * @see #getServiceTemplate()
	 * @generated
	 */
	EReference getServiceTemplate_Expose();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.template.ServiceTemplate#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see net.sf.ictalive.service.template.ServiceTemplate#getConstraints()
	 * @see #getServiceTemplate()
	 * @generated
	 */
	EReference getServiceTemplate_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.template.ServiceTemplate#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see net.sf.ictalive.service.template.ServiceTemplate#getURI()
	 * @see #getServiceTemplate()
	 * @generated
	 */
	EAttribute getServiceTemplate_URI();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.template.TemplateFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see net.sf.ictalive.service.template.TemplateFlow
	 * @generated
	 */
	EClass getTemplateFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.template.TemplateFlow#getComposedOf <em>Composed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed Of</em>'.
	 * @see net.sf.ictalive.service.template.TemplateFlow#getComposedOf()
	 * @see #getTemplateFlow()
	 * @generated
	 */
	EReference getTemplateFlow_ComposedOf();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.template.GroundTemplate <em>Ground Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ground Template</em>'.
	 * @see net.sf.ictalive.service.template.GroundTemplate
	 * @generated
	 */
	EClass getGroundTemplate();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.template.GroundTemplate#getImplement <em>Implement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implement</em>'.
	 * @see net.sf.ictalive.service.template.GroundTemplate#getImplement()
	 * @see #getGroundTemplate()
	 * @generated
	 */
	EReference getGroundTemplate_Implement();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.template.GroundTemplate#getBindTemplateParameter <em>Bind Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bind Template Parameter</em>'.
	 * @see net.sf.ictalive.service.template.GroundTemplate#getBindTemplateParameter()
	 * @see #getGroundTemplate()
	 * @generated
	 */
	EReference getGroundTemplate_BindTemplateParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.template.GroundTemplate#getBindProcessModel <em>Bind Process Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bind Process Model</em>'.
	 * @see net.sf.ictalive.service.template.GroundTemplate#getBindProcessModel()
	 * @see #getGroundTemplate()
	 * @generated
	 */
	EReference getGroundTemplate_BindProcessModel();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.template.GroundTemplate#getExpose <em>Expose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expose</em>'.
	 * @see net.sf.ictalive.service.template.GroundTemplate#getExpose()
	 * @see #getGroundTemplate()
	 * @generated
	 */
	EReference getGroundTemplate_Expose();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.template.GroundTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.service.template.GroundTemplate#getName()
	 * @see #getGroundTemplate()
	 * @generated
	 */
	EAttribute getGroundTemplate_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.template.AbstractProcessModel <em>Abstract Process Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Process Model</em>'.
	 * @see net.sf.ictalive.service.template.AbstractProcessModel
	 * @generated
	 */
	EClass getAbstractProcessModel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.template.AbstractProcessModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.service.template.AbstractProcessModel#getName()
	 * @see #getAbstractProcessModel()
	 * @generated
	 */
	EAttribute getAbstractProcessModel_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.template.BoundTemplateParameter <em>Bound Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bound Template Parameter</em>'.
	 * @see net.sf.ictalive.service.template.BoundTemplateParameter
	 * @generated
	 */
	EClass getBoundTemplateParameter();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.template.BoundTemplateParameter#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstract</em>'.
	 * @see net.sf.ictalive.service.template.BoundTemplateParameter#getAbstract()
	 * @see #getBoundTemplateParameter()
	 * @generated
	 */
	EReference getBoundTemplateParameter_Abstract();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.template.BoundTemplateParameter#getConcrete <em>Concrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete</em>'.
	 * @see net.sf.ictalive.service.template.BoundTemplateParameter#getConcrete()
	 * @see #getBoundTemplateParameter()
	 * @generated
	 */
	EReference getBoundTemplateParameter_Concrete();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.template.BoundProcessModel <em>Bound Process Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bound Process Model</em>'.
	 * @see net.sf.ictalive.service.template.BoundProcessModel
	 * @generated
	 */
	EClass getBoundProcessModel();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.template.BoundProcessModel#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstract</em>'.
	 * @see net.sf.ictalive.service.template.BoundProcessModel#getAbstract()
	 * @see #getBoundProcessModel()
	 * @generated
	 */
	EReference getBoundProcessModel_Abstract();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.template.BoundProcessModel#getConcrete <em>Concrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete</em>'.
	 * @see net.sf.ictalive.service.template.BoundProcessModel#getConcrete()
	 * @see #getBoundProcessModel()
	 * @generated
	 */
	EReference getBoundProcessModel_Concrete();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.template.TemplateConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see net.sf.ictalive.service.template.TemplateConstraint
	 * @generated
	 */
	EClass getTemplateConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.template.TemplateConstraint#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see net.sf.ictalive.service.template.TemplateConstraint#getBody()
	 * @see #getTemplateConstraint()
	 * @generated
	 */
	EReference getTemplateConstraint_Body();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.template.ControlConstruct <em>Control Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Construct</em>'.
	 * @see net.sf.ictalive.service.template.ControlConstruct
	 * @generated
	 */
	EClass getControlConstruct();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.template.ControlConstruct#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timeout</em>'.
	 * @see net.sf.ictalive.service.template.ControlConstruct#getTimeout()
	 * @see #getControlConstruct()
	 * @generated
	 */
	EReference getControlConstruct_Timeout();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.template.AnyOrder <em>Any Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Order</em>'.
	 * @see net.sf.ictalive.service.template.AnyOrder
	 * @generated
	 */
	EClass getAnyOrder();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.template.AnyOrder#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see net.sf.ictalive.service.template.AnyOrder#getComponents()
	 * @see #getAnyOrder()
	 * @generated
	 */
	EReference getAnyOrder_Components();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.template.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see net.sf.ictalive.service.template.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.template.Choice#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see net.sf.ictalive.service.template.Choice#getComponents()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Components();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.template.IfThenElse <em>If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Then Else</em>'.
	 * @see net.sf.ictalive.service.template.IfThenElse
	 * @generated
	 */
	EClass getIfThenElse();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.template.IfThenElse#getIfCondition <em>If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If Condition</em>'.
	 * @see net.sf.ictalive.service.template.IfThenElse#getIfCondition()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_IfCondition();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.template.IfThenElse#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Then</em>'.
	 * @see net.sf.ictalive.service.template.IfThenElse#getThen()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_Then();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.template.IfThenElse#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else</em>'.
	 * @see net.sf.ictalive.service.template.IfThenElse#getElse()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_Else();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.template.Iterate <em>Iterate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterate</em>'.
	 * @see net.sf.ictalive.service.template.Iterate
	 * @generated
	 */
	EClass getIterate();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.template.Perform <em>Perform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perform</em>'.
	 * @see net.sf.ictalive.service.template.Perform
	 * @generated
	 */
	EClass getPerform();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.template.Perform#getPartnerProcess <em>Partner Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partner Process</em>'.
	 * @see net.sf.ictalive.service.template.Perform#getPartnerProcess()
	 * @see #getPerform()
	 * @generated
	 */
	EReference getPerform_PartnerProcess();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.template.Perform#getHasDataFromProcess <em>Has Data From Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Data From Process</em>'.
	 * @see net.sf.ictalive.service.template.Perform#getHasDataFromProcess()
	 * @see #getPerform()
	 * @generated
	 */
	EReference getPerform_HasDataFromProcess();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.template.Perform#getValueData <em>Value Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Data</em>'.
	 * @see net.sf.ictalive.service.template.Perform#getValueData()
	 * @see #getPerform()
	 * @generated
	 */
	EReference getPerform_ValueData();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.template.Perform#getHasDataFromTemplate <em>Has Data From Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Data From Template</em>'.
	 * @see net.sf.ictalive.service.template.Perform#getHasDataFromTemplate()
	 * @see #getPerform()
	 * @generated
	 */
	EReference getPerform_HasDataFromTemplate();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.template.RepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Until</em>'.
	 * @see net.sf.ictalive.service.template.RepeatUntil
	 * @generated
	 */
	EClass getRepeatUntil();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.template.RepeatUntil#getUntilCondition <em>Until Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Until Condition</em>'.
	 * @see net.sf.ictalive.service.template.RepeatUntil#getUntilCondition()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_UntilCondition();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.template.RepeatUntil#getUntilProcess <em>Until Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Until Process</em>'.
	 * @see net.sf.ictalive.service.template.RepeatUntil#getUntilProcess()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_UntilProcess();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.template.RepeatWhile <em>Repeat While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat While</em>'.
	 * @see net.sf.ictalive.service.template.RepeatWhile
	 * @generated
	 */
	EClass getRepeatWhile();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.template.RepeatWhile#getWhileCondition <em>While Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>While Condition</em>'.
	 * @see net.sf.ictalive.service.template.RepeatWhile#getWhileCondition()
	 * @see #getRepeatWhile()
	 * @generated
	 */
	EReference getRepeatWhile_WhileCondition();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.template.RepeatWhile#getWhileProcess <em>While Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>While Process</em>'.
	 * @see net.sf.ictalive.service.template.RepeatWhile#getWhileProcess()
	 * @see #getRepeatWhile()
	 * @generated
	 */
	EReference getRepeatWhile_WhileProcess();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.template.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see net.sf.ictalive.service.template.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.template.Sequence#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see net.sf.ictalive.service.template.Sequence#getComponents()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Components();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.template.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split</em>'.
	 * @see net.sf.ictalive.service.template.Split
	 * @generated
	 */
	EClass getSplit();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.template.Split#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see net.sf.ictalive.service.template.Split#getComponents()
	 * @see #getSplit()
	 * @generated
	 */
	EReference getSplit_Components();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.template.SplitJoin <em>Split Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Join</em>'.
	 * @see net.sf.ictalive.service.template.SplitJoin
	 * @generated
	 */
	EClass getSplitJoin();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.template.SplitJoin#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see net.sf.ictalive.service.template.SplitJoin#getComponents()
	 * @see #getSplitJoin()
	 * @generated
	 */
	EReference getSplitJoin_Components();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.template.ControlConstructList <em>Control Construct List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Construct List</em>'.
	 * @see net.sf.ictalive.service.template.ControlConstructList
	 * @generated
	 */
	EClass getControlConstructList();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.template.ControlConstructList#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see net.sf.ictalive.service.template.ControlConstructList#getFirst()
	 * @see #getControlConstructList()
	 * @generated
	 */
	EReference getControlConstructList_First();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.template.ControlConstructList#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rest</em>'.
	 * @see net.sf.ictalive.service.template.ControlConstructList#getRest()
	 * @see #getControlConstructList()
	 * @generated
	 */
	EReference getControlConstructList_Rest();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.template.ControlConstructBag <em>Control Construct Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Construct Bag</em>'.
	 * @see net.sf.ictalive.service.template.ControlConstructBag
	 * @generated
	 */
	EClass getControlConstructBag();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.template.ControlConstructBag#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see net.sf.ictalive.service.template.ControlConstructBag#getFirst()
	 * @see #getControlConstructBag()
	 * @generated
	 */
	EReference getControlConstructBag_First();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.template.ControlConstructBag#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rest</em>'.
	 * @see net.sf.ictalive.service.template.ControlConstructBag#getRest()
	 * @see #getControlConstructBag()
	 * @generated
	 */
	EReference getControlConstructBag_Rest();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.template.IntervalThing <em>Interval Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Thing</em>'.
	 * @see net.sf.ictalive.service.template.IntervalThing
	 * @generated
	 */
	EClass getIntervalThing();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TemplateFactory getTemplateFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.template.impl.ServiceTemplateImpl <em>Service Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.template.impl.ServiceTemplateImpl
		 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getServiceTemplate()
		 * @generated
		 */
		EClass SERVICE_TEMPLATE = eINSTANCE.getServiceTemplate();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE__FLOW = eINSTANCE.getServiceTemplate_Flow();

		/**
		 * The meta object literal for the '<em><b>Template Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE__TEMPLATE_PARAMETER = eINSTANCE.getServiceTemplate_TemplateParameter();

		/**
		 * The meta object literal for the '<em><b>Expose</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE__EXPOSE = eINSTANCE.getServiceTemplate_Expose();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE__CONSTRAINTS = eINSTANCE.getServiceTemplate_Constraints();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TEMPLATE__URI = eINSTANCE.getServiceTemplate_URI();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.template.impl.TemplateFlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.template.impl.TemplateFlowImpl
		 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getTemplateFlow()
		 * @generated
		 */
		EClass TEMPLATE_FLOW = eINSTANCE.getTemplateFlow();

		/**
		 * The meta object literal for the '<em><b>Composed Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_FLOW__COMPOSED_OF = eINSTANCE.getTemplateFlow_ComposedOf();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.template.impl.GroundTemplateImpl <em>Ground Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.template.impl.GroundTemplateImpl
		 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getGroundTemplate()
		 * @generated
		 */
		EClass GROUND_TEMPLATE = eINSTANCE.getGroundTemplate();

		/**
		 * The meta object literal for the '<em><b>Implement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND_TEMPLATE__IMPLEMENT = eINSTANCE.getGroundTemplate_Implement();

		/**
		 * The meta object literal for the '<em><b>Bind Template Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND_TEMPLATE__BIND_TEMPLATE_PARAMETER = eINSTANCE.getGroundTemplate_BindTemplateParameter();

		/**
		 * The meta object literal for the '<em><b>Bind Process Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND_TEMPLATE__BIND_PROCESS_MODEL = eINSTANCE.getGroundTemplate_BindProcessModel();

		/**
		 * The meta object literal for the '<em><b>Expose</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND_TEMPLATE__EXPOSE = eINSTANCE.getGroundTemplate_Expose();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUND_TEMPLATE__NAME = eINSTANCE.getGroundTemplate_Name();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.template.impl.AbstractProcessModelImpl <em>Abstract Process Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.template.impl.AbstractProcessModelImpl
		 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getAbstractProcessModel()
		 * @generated
		 */
		EClass ABSTRACT_PROCESS_MODEL = eINSTANCE.getAbstractProcessModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PROCESS_MODEL__NAME = eINSTANCE.getAbstractProcessModel_Name();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.template.impl.BoundTemplateParameterImpl <em>Bound Template Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.template.impl.BoundTemplateParameterImpl
		 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getBoundTemplateParameter()
		 * @generated
		 */
		EClass BOUND_TEMPLATE_PARAMETER = eINSTANCE.getBoundTemplateParameter();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUND_TEMPLATE_PARAMETER__ABSTRACT = eINSTANCE.getBoundTemplateParameter_Abstract();

		/**
		 * The meta object literal for the '<em><b>Concrete</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUND_TEMPLATE_PARAMETER__CONCRETE = eINSTANCE.getBoundTemplateParameter_Concrete();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.template.impl.BoundProcessModelImpl <em>Bound Process Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.template.impl.BoundProcessModelImpl
		 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getBoundProcessModel()
		 * @generated
		 */
		EClass BOUND_PROCESS_MODEL = eINSTANCE.getBoundProcessModel();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUND_PROCESS_MODEL__ABSTRACT = eINSTANCE.getBoundProcessModel_Abstract();

		/**
		 * The meta object literal for the '<em><b>Concrete</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUND_PROCESS_MODEL__CONCRETE = eINSTANCE.getBoundProcessModel_Concrete();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.template.impl.TemplateConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.template.impl.TemplateConstraintImpl
		 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getTemplateConstraint()
		 * @generated
		 */
		EClass TEMPLATE_CONSTRAINT = eINSTANCE.getTemplateConstraint();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_CONSTRAINT__BODY = eINSTANCE.getTemplateConstraint_Body();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.template.impl.ControlConstructImpl <em>Control Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.template.impl.ControlConstructImpl
		 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getControlConstruct()
		 * @generated
		 */
		EClass CONTROL_CONSTRUCT = eINSTANCE.getControlConstruct();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_CONSTRUCT__TIMEOUT = eINSTANCE.getControlConstruct_Timeout();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.template.impl.AnyOrderImpl <em>Any Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.template.impl.AnyOrderImpl
		 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getAnyOrder()
		 * @generated
		 */
		EClass ANY_ORDER = eINSTANCE.getAnyOrder();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_ORDER__COMPONENTS = eINSTANCE.getAnyOrder_Components();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.template.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.template.impl.ChoiceImpl
		 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__COMPONENTS = eINSTANCE.getChoice_Components();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.template.impl.IfThenElseImpl <em>If Then Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.template.impl.IfThenElseImpl
		 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getIfThenElse()
		 * @generated
		 */
		EClass IF_THEN_ELSE = eINSTANCE.getIfThenElse();

		/**
		 * The meta object literal for the '<em><b>If Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE__IF_CONDITION = eINSTANCE.getIfThenElse_IfCondition();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE__THEN = eINSTANCE.getIfThenElse_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE__ELSE = eINSTANCE.getIfThenElse_Else();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.template.impl.IterateImpl <em>Iterate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.template.impl.IterateImpl
		 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getIterate()
		 * @generated
		 */
		EClass ITERATE = eINSTANCE.getIterate();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.template.impl.PerformImpl <em>Perform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.template.impl.PerformImpl
		 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getPerform()
		 * @generated
		 */
		EClass PERFORM = eINSTANCE.getPerform();

		/**
		 * The meta object literal for the '<em><b>Partner Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM__PARTNER_PROCESS = eINSTANCE.getPerform_PartnerProcess();

		/**
		 * The meta object literal for the '<em><b>Has Data From Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM__HAS_DATA_FROM_PROCESS = eINSTANCE.getPerform_HasDataFromProcess();

		/**
		 * The meta object literal for the '<em><b>Value Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM__VALUE_DATA = eINSTANCE.getPerform_ValueData();

		/**
		 * The meta object literal for the '<em><b>Has Data From Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM__HAS_DATA_FROM_TEMPLATE = eINSTANCE.getPerform_HasDataFromTemplate();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.template.impl.RepeatUntilImpl <em>Repeat Until</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.template.impl.RepeatUntilImpl
		 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getRepeatUntil()
		 * @generated
		 */
		EClass REPEAT_UNTIL = eINSTANCE.getRepeatUntil();

		/**
		 * The meta object literal for the '<em><b>Until Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__UNTIL_CONDITION = eINSTANCE.getRepeatUntil_UntilCondition();

		/**
		 * The meta object literal for the '<em><b>Until Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__UNTIL_PROCESS = eINSTANCE.getRepeatUntil_UntilProcess();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.template.impl.RepeatWhileImpl <em>Repeat While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.template.impl.RepeatWhileImpl
		 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getRepeatWhile()
		 * @generated
		 */
		EClass REPEAT_WHILE = eINSTANCE.getRepeatWhile();

		/**
		 * The meta object literal for the '<em><b>While Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_WHILE__WHILE_CONDITION = eINSTANCE.getRepeatWhile_WhileCondition();

		/**
		 * The meta object literal for the '<em><b>While Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_WHILE__WHILE_PROCESS = eINSTANCE.getRepeatWhile_WhileProcess();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.template.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.template.impl.SequenceImpl
		 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__COMPONENTS = eINSTANCE.getSequence_Components();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.template.impl.SplitImpl <em>Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.template.impl.SplitImpl
		 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getSplit()
		 * @generated
		 */
		EClass SPLIT = eINSTANCE.getSplit();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT__COMPONENTS = eINSTANCE.getSplit_Components();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.template.impl.SplitJoinImpl <em>Split Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.template.impl.SplitJoinImpl
		 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getSplitJoin()
		 * @generated
		 */
		EClass SPLIT_JOIN = eINSTANCE.getSplitJoin();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT_JOIN__COMPONENTS = eINSTANCE.getSplitJoin_Components();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.template.impl.ControlConstructListImpl <em>Control Construct List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.template.impl.ControlConstructListImpl
		 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getControlConstructList()
		 * @generated
		 */
		EClass CONTROL_CONSTRUCT_LIST = eINSTANCE.getControlConstructList();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_CONSTRUCT_LIST__FIRST = eINSTANCE.getControlConstructList_First();

		/**
		 * The meta object literal for the '<em><b>Rest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_CONSTRUCT_LIST__REST = eINSTANCE.getControlConstructList_Rest();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.template.impl.ControlConstructBagImpl <em>Control Construct Bag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.template.impl.ControlConstructBagImpl
		 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getControlConstructBag()
		 * @generated
		 */
		EClass CONTROL_CONSTRUCT_BAG = eINSTANCE.getControlConstructBag();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_CONSTRUCT_BAG__FIRST = eINSTANCE.getControlConstructBag_First();

		/**
		 * The meta object literal for the '<em><b>Rest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_CONSTRUCT_BAG__REST = eINSTANCE.getControlConstructBag_Rest();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.template.impl.IntervalThingImpl <em>Interval Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.template.impl.IntervalThingImpl
		 * @see net.sf.ictalive.service.template.impl.TemplatePackageImpl#getIntervalThing()
		 * @generated
		 */
		EClass INTERVAL_THING = eINSTANCE.getIntervalThing();

	}

} //TemplatePackage
