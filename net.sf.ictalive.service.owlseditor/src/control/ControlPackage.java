/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see control.ControlFactory
 * @model kind="package"
 *        annotation="gmf foo='bar'"
 * @generated
 */
public interface ControlPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "control";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.example.org";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "control";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ControlPackage eINSTANCE = control.impl.ControlPackageImpl.init();

  /**
	 * The meta object id for the '{@link control.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.NamedElementImpl
	 * @see control.impl.ControlPackageImpl#getNamedElement()
	 * @generated
	 */
  int NAMED_ELEMENT = 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_ELEMENT__NAME = 0;

  /**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_ELEMENT_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link control.impl.ProcessVarImpl <em>Process Var</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.ProcessVarImpl
	 * @see control.impl.ControlPackageImpl#getProcessVar()
	 * @generated
	 */
  int PROCESS_VAR = 1;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROCESS_VAR__NAME = NAMED_ELEMENT__NAME;

  /**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROCESS_VAR__PARAMETER_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Parameter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROCESS_VAR__PARAMETER_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Process Var</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROCESS_VAR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link control.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.ParameterImpl
	 * @see control.impl.ControlPackageImpl#getParameter()
	 * @generated
	 */
  int PARAMETER = 2;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PARAMETER__NAME = PROCESS_VAR__NAME;

  /**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PARAMETER__PARAMETER_TYPE = PROCESS_VAR__PARAMETER_TYPE;

  /**
	 * The feature id for the '<em><b>Parameter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PARAMETER__PARAMETER_VALUE = PROCESS_VAR__PARAMETER_VALUE;

  /**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PARAMETER_FEATURE_COUNT = PROCESS_VAR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link control.impl.OntologyImpl <em>Ontology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see control.impl.OntologyImpl
	 * @see control.impl.ControlPackageImpl#getOntology()
	 * @generated
	 */
	int ONTOLOGY = 3;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__NAME = NAMED_ELEMENT__NAME;

		/**
	 * The feature id for the '<em><b>Ontology URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__ONTOLOGY_URI = NAMED_ELEMENT_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Ontology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

		/**
	 * The meta object id for the '{@link control.impl.TemplateConstraintImpl <em>Template Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see control.impl.TemplateConstraintImpl
	 * @see control.impl.ControlPackageImpl#getTemplateConstraint()
	 * @generated
	 */
	int TEMPLATE_CONSTRAINT = 4;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_CONSTRAINT__NAME = NAMED_ELEMENT__NAME;

		/**
	 * The feature id for the '<em><b>Asp Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_CONSTRAINT__ASP_CODE = NAMED_ELEMENT_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Asp Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_CONSTRAINT__ASP_BINDING = NAMED_ELEMENT_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Template Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_CONSTRAINT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

		/**
	 * The meta object id for the '{@link control.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.InputImpl
	 * @see control.impl.ControlPackageImpl#getInput()
	 * @generated
	 */
  int INPUT = 5;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INPUT__NAME = PARAMETER__NAME;

  /**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INPUT__PARAMETER_TYPE = PARAMETER__PARAMETER_TYPE;

  /**
	 * The feature id for the '<em><b>Parameter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INPUT__PARAMETER_VALUE = PARAMETER__PARAMETER_VALUE;

  /**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INPUT_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link control.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.OutputImpl
	 * @see control.impl.ControlPackageImpl#getOutput()
	 * @generated
	 */
  int OUTPUT = 6;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTPUT__NAME = PARAMETER__NAME;

  /**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTPUT__PARAMETER_TYPE = PARAMETER__PARAMETER_TYPE;

  /**
	 * The feature id for the '<em><b>Parameter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTPUT__PARAMETER_VALUE = PARAMETER__PARAMETER_VALUE;

  /**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTPUT_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link control.impl.OuterProcessImpl <em>Outer Process</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.OuterProcessImpl
	 * @see control.impl.ControlPackageImpl#getOuterProcess()
	 * @generated
	 */
  int OUTER_PROCESS = 7;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTER_PROCESS__NAME = NAMED_ELEMENT__NAME;

  /**
	 * The feature id for the '<em><b>Construct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTER_PROCESS__CONSTRUCT = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Has Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTER_PROCESS__HAS_INPUT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Has Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTER_PROCESS__HAS_OUTPUT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Has Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTER_PROCESS__HAS_PRECONDITION = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Has Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTER_PROCESS__HAS_RESULT = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTER_PROCESS__BINDINGS = NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Outer Locals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTER_PROCESS__OUTER_LOCALS = NAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
	 * The feature id for the '<em><b>Outer Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTER_PROCESS__OUTER_LINKS = NAMED_ELEMENT_FEATURE_COUNT + 7;

  /**
	 * The feature id for the '<em><b>Ontologies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTER_PROCESS__ONTOLOGIES = NAMED_ELEMENT_FEATURE_COUNT + 8;

		/**
	 * The feature id for the '<em><b>Template Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTER_PROCESS__TEMPLATE_CONSTRAINTS = NAMED_ELEMENT_FEATURE_COUNT + 9;

		/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTER_PROCESS__SERVICE_NAME = NAMED_ELEMENT_FEATURE_COUNT + 10;

		/**
	 * The feature id for the '<em><b>Service URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTER_PROCESS__SERVICE_URI = NAMED_ELEMENT_FEATURE_COUNT + 11;

  /**
	 * The feature id for the '<em><b>Service Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTER_PROCESS__SERVICE_DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 12;

  /**
	 * The number of structural features of the '<em>Outer Process</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTER_PROCESS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 13;

  /**
	 * The meta object id for the '{@link control.impl.AbstractProcessImpl <em>Abstract Process</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.AbstractProcessImpl
	 * @see control.impl.ControlPackageImpl#getAbstractProcess()
	 * @generated
	 */
  int ABSTRACT_PROCESS = 8;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PROCESS__NAME = NAMED_ELEMENT__NAME;

  /**
	 * The feature id for the '<em><b>Has Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PROCESS__HAS_INPUT = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Has Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PROCESS__HAS_OUTPUT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Abstract Process</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PROCESS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link control.impl.RemoteProcessImpl <em>Remote Process</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.RemoteProcessImpl
	 * @see control.impl.ControlPackageImpl#getRemoteProcess()
	 * @generated
	 */
  int REMOTE_PROCESS = 9;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REMOTE_PROCESS__NAME = ABSTRACT_PROCESS__NAME;

  /**
	 * The feature id for the '<em><b>Has Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REMOTE_PROCESS__HAS_INPUT = ABSTRACT_PROCESS__HAS_INPUT;

  /**
	 * The feature id for the '<em><b>Has Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REMOTE_PROCESS__HAS_OUTPUT = ABSTRACT_PROCESS__HAS_OUTPUT;

  /**
	 * The feature id for the '<em><b>Remote URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REMOTE_PROCESS__REMOTE_URI = ABSTRACT_PROCESS_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Remote URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REMOTE_PROCESS__REMOTE_URL = ABSTRACT_PROCESS_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Has Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REMOTE_PROCESS__HAS_RESULT = ABSTRACT_PROCESS_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REMOTE_PROCESS__EXPRESSIONS = ABSTRACT_PROCESS_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Remote Process</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REMOTE_PROCESS_FEATURE_COUNT = ABSTRACT_PROCESS_FEATURE_COUNT + 4;

  /**
	 * The meta object id for the '{@link control.impl.TemplateProcessImpl <em>Template Process</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.TemplateProcessImpl
	 * @see control.impl.ControlPackageImpl#getTemplateProcess()
	 * @generated
	 */
  int TEMPLATE_PROCESS = 10;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEMPLATE_PROCESS__NAME = ABSTRACT_PROCESS__NAME;

  /**
	 * The feature id for the '<em><b>Has Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEMPLATE_PROCESS__HAS_INPUT = ABSTRACT_PROCESS__HAS_INPUT;

  /**
	 * The feature id for the '<em><b>Has Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEMPLATE_PROCESS__HAS_OUTPUT = ABSTRACT_PROCESS__HAS_OUTPUT;

  /**
	 * The feature id for the '<em><b>Slot Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEMPLATE_PROCESS__SLOT_NAME = ABSTRACT_PROCESS_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Template Process</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEMPLATE_PROCESS_FEATURE_COUNT = ABSTRACT_PROCESS_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link control.impl.ControlConstructImpl <em>Construct</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.ControlConstructImpl
	 * @see control.impl.ControlPackageImpl#getControlConstruct()
	 * @generated
	 */
  int CONTROL_CONSTRUCT = 11;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL_CONSTRUCT__NAME = NAMED_ELEMENT__NAME;

  /**
	 * The number of structural features of the '<em>Construct</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL_CONSTRUCT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link control.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.SequenceImpl
	 * @see control.impl.ControlPackageImpl#getSequence()
	 * @generated
	 */
  int SEQUENCE = 12;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEQUENCE__NAME = CONTROL_CONSTRUCT__NAME;

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
	 * The meta object id for the '{@link control.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.ChoiceImpl
	 * @see control.impl.ControlPackageImpl#getChoice()
	 * @generated
	 */
  int CHOICE = 13;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CHOICE__NAME = CONTROL_CONSTRUCT__NAME;

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
	 * The meta object id for the '{@link control.impl.AnyOrderImpl <em>Any Order</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.AnyOrderImpl
	 * @see control.impl.ControlPackageImpl#getAnyOrder()
	 * @generated
	 */
  int ANY_ORDER = 14;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ANY_ORDER__NAME = CONTROL_CONSTRUCT__NAME;

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
	 * The meta object id for the '{@link control.impl.SplitImpl <em>Split</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.SplitImpl
	 * @see control.impl.ControlPackageImpl#getSplit()
	 * @generated
	 */
  int SPLIT = 15;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPLIT__NAME = CONTROL_CONSTRUCT__NAME;

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
	 * The meta object id for the '{@link control.impl.SplitJoinImpl <em>Split Join</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.SplitJoinImpl
	 * @see control.impl.ControlPackageImpl#getSplitJoin()
	 * @generated
	 */
  int SPLIT_JOIN = 16;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPLIT_JOIN__NAME = CONTROL_CONSTRUCT__NAME;

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
	 * The meta object id for the '{@link control.impl.IfThenElseImpl <em>If Then Else</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.IfThenElseImpl
	 * @see control.impl.ControlPackageImpl#getIfThenElse()
	 * @generated
	 */
  int IF_THEN_ELSE = 17;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_THEN_ELSE__NAME = CONTROL_CONSTRUCT__NAME;

  /**
	 * The feature id for the '<em><b>If Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_THEN_ELSE__IF_CONDITION = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_THEN_ELSE__THEN = CONTROL_CONSTRUCT_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
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
	 * The meta object id for the '{@link control.impl.RepeatUntilImpl <em>Repeat Until</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.RepeatUntilImpl
	 * @see control.impl.ControlPackageImpl#getRepeatUntil()
	 * @generated
	 */
  int REPEAT_UNTIL = 18;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REPEAT_UNTIL__NAME = CONTROL_CONSTRUCT__NAME;

  /**
	 * The feature id for the '<em><b>Until Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REPEAT_UNTIL__UNTIL_CONDITION = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Until Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REPEAT_UNTIL__UNTIL_PROCESS = CONTROL_CONSTRUCT_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Repeat Until</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REPEAT_UNTIL_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link control.impl.RepeatWhileImpl <em>Repeat While</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.RepeatWhileImpl
	 * @see control.impl.ControlPackageImpl#getRepeatWhile()
	 * @generated
	 */
  int REPEAT_WHILE = 19;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REPEAT_WHILE__NAME = CONTROL_CONSTRUCT__NAME;

  /**
	 * The feature id for the '<em><b>While Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REPEAT_WHILE__WHILE_CONDITION = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>While Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REPEAT_WHILE__WHILE_PROCESS = CONTROL_CONSTRUCT_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Repeat While</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REPEAT_WHILE_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link control.impl.PerformImpl <em>Perform</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.PerformImpl
	 * @see control.impl.ControlPackageImpl#getPerform()
	 * @generated
	 */
  int PERFORM = 20;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PERFORM__NAME = CONTROL_CONSTRUCT__NAME;

  /**
	 * The feature id for the '<em><b>The Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PERFORM__THE_PROCESS = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Perform</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PERFORM_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link control.impl.ProduceImpl <em>Produce</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.ProduceImpl
	 * @see control.impl.ControlPackageImpl#getProduce()
	 * @generated
	 */
  int PRODUCE = 21;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUCE__NAME = CONTROL_CONSTRUCT__NAME;

  /**
	 * The feature id for the '<em><b>Produced Binding Value Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUCE__PRODUCED_BINDING_VALUE_SPECIFIER = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Produce</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUCE_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link control.impl.SetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.SetImpl
	 * @see control.impl.ControlPackageImpl#getSet()
	 * @generated
	 */
  int SET = 22;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SET__NAME = CONTROL_CONSTRUCT__NAME;

  /**
	 * The feature id for the '<em><b>Produced Binding Value Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SET__PRODUCED_BINDING_VALUE_SPECIFIER = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SET_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link control.impl.ValueSpecifierImpl <em>Value Specifier</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.ValueSpecifierImpl
	 * @see control.impl.ControlPackageImpl#getValueSpecifier()
	 * @generated
	 */
  int VALUE_SPECIFIER = 23;

  /**
	 * The number of structural features of the '<em>Value Specifier</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE_SPECIFIER_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link control.impl.ValueSpecifierElementImpl <em>Value Specifier Element</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.ValueSpecifierElementImpl
	 * @see control.impl.ControlPackageImpl#getValueSpecifierElement()
	 * @generated
	 */
  int VALUE_SPECIFIER_ELEMENT = 24;

  /**
	 * The number of structural features of the '<em>Value Specifier Element</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE_SPECIFIER_ELEMENT_FEATURE_COUNT = VALUE_SPECIFIER_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link control.impl.ValueSourceImpl <em>Value Source</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.ValueSourceImpl
	 * @see control.impl.ControlPackageImpl#getValueSource()
	 * @generated
	 */
  int VALUE_SOURCE = 25;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE_SOURCE__NAME = NAMED_ELEMENT__NAME;

  /**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE_SOURCE__BODY = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Value Source</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE_SOURCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link control.impl.ValueFormImpl <em>Value Form</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.ValueFormImpl
	 * @see control.impl.ControlPackageImpl#getValueForm()
	 * @generated
	 */
  int VALUE_FORM = 26;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE_FORM__NAME = NAMED_ELEMENT__NAME;

  /**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE_FORM__BODY = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Value Form</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE_FORM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link control.impl.ValueFunctionImpl <em>Value Function</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.ValueFunctionImpl
	 * @see control.impl.ControlPackageImpl#getValueFunction()
	 * @generated
	 */
  int VALUE_FUNCTION = 27;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE_FUNCTION__NAME = NAMED_ELEMENT__NAME;

  /**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE_FUNCTION__BODY = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Value Function</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE_FUNCTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link control.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.BindingImpl
	 * @see control.impl.ControlPackageImpl#getBinding()
	 * @generated
	 */
  int BINDING = 28;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BINDING__NAME = PROCESS_VAR__NAME;

  /**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BINDING__PARAMETER_TYPE = PROCESS_VAR__PARAMETER_TYPE;

  /**
	 * The feature id for the '<em><b>Parameter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BINDING__PARAMETER_VALUE = PROCESS_VAR__PARAMETER_VALUE;

  /**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BINDING_FEATURE_COUNT = PROCESS_VAR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link control.impl.SetBindingImpl <em>Set Binding</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.SetBindingImpl
	 * @see control.impl.ControlPackageImpl#getSetBinding()
	 * @generated
	 */
  int SET_BINDING = 29;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SET_BINDING__NAME = BINDING__NAME;

  /**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SET_BINDING__PARAMETER_TYPE = BINDING__PARAMETER_TYPE;

  /**
	 * The feature id for the '<em><b>Parameter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SET_BINDING__PARAMETER_VALUE = BINDING__PARAMETER_VALUE;

  /**
	 * The number of structural features of the '<em>Set Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SET_BINDING_FEATURE_COUNT = BINDING_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link control.impl.InputBindingImpl <em>Input Binding</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.InputBindingImpl
	 * @see control.impl.ControlPackageImpl#getInputBinding()
	 * @generated
	 */
  int INPUT_BINDING = 30;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INPUT_BINDING__NAME = BINDING__NAME;

  /**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INPUT_BINDING__PARAMETER_TYPE = BINDING__PARAMETER_TYPE;

  /**
	 * The feature id for the '<em><b>Parameter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INPUT_BINDING__PARAMETER_VALUE = BINDING__PARAMETER_VALUE;

  /**
	 * The feature id for the '<em><b>To Param</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INPUT_BINDING__TO_PARAM = BINDING_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Value Source</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INPUT_BINDING__VALUE_SOURCE = BINDING_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Input Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INPUT_BINDING_FEATURE_COUNT = BINDING_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link control.impl.OutputBindingImpl <em>Output Binding</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.OutputBindingImpl
	 * @see control.impl.ControlPackageImpl#getOutputBinding()
	 * @generated
	 */
  int OUTPUT_BINDING = 31;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTPUT_BINDING__NAME = BINDING__NAME;

  /**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTPUT_BINDING__PARAMETER_TYPE = BINDING__PARAMETER_TYPE;

  /**
	 * The feature id for the '<em><b>Parameter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTPUT_BINDING__PARAMETER_VALUE = BINDING__PARAMETER_VALUE;

  /**
	 * The feature id for the '<em><b>To Param</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTPUT_BINDING__TO_PARAM = BINDING_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTPUT_BINDING__ORIGIN = BINDING_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Output Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTPUT_BINDING_FEATURE_COUNT = BINDING_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link control.impl.LocBindingImpl <em>Loc Binding</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.LocBindingImpl
	 * @see control.impl.ControlPackageImpl#getLocBinding()
	 * @generated
	 */
  int LOC_BINDING = 32;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOC_BINDING__NAME = SET_BINDING__NAME;

  /**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOC_BINDING__PARAMETER_TYPE = SET_BINDING__PARAMETER_TYPE;

  /**
	 * The feature id for the '<em><b>Parameter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOC_BINDING__PARAMETER_VALUE = SET_BINDING__PARAMETER_VALUE;

  /**
	 * The feature id for the '<em><b>To Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOC_BINDING__TO_LOC = SET_BINDING_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOC_BINDING__ORIGIN = SET_BINDING_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Loc Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOC_BINDING_FEATURE_COUNT = SET_BINDING_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link control.impl.LinkBindingImpl <em>Link Binding</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.LinkBindingImpl
	 * @see control.impl.ControlPackageImpl#getLinkBinding()
	 * @generated
	 */
  int LINK_BINDING = 33;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINK_BINDING__NAME = BINDING__NAME;

  /**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINK_BINDING__PARAMETER_TYPE = BINDING__PARAMETER_TYPE;

  /**
	 * The feature id for the '<em><b>Parameter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINK_BINDING__PARAMETER_VALUE = BINDING__PARAMETER_VALUE;

  /**
	 * The feature id for the '<em><b>To Link</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINK_BINDING__TO_LINK = BINDING_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINK_BINDING__ORIGIN = BINDING_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Link Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINK_BINDING_FEATURE_COUNT = BINDING_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link control.impl.outputBindingSourceImpl <em>output Binding Source</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.outputBindingSourceImpl
	 * @see control.impl.ControlPackageImpl#getoutputBindingSource()
	 * @generated
	 */
  int OUTPUT_BINDING_SOURCE = 34;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTPUT_BINDING_SOURCE__NAME = BINDING__NAME;

  /**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTPUT_BINDING_SOURCE__PARAMETER_TYPE = BINDING__PARAMETER_TYPE;

  /**
	 * The feature id for the '<em><b>Parameter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTPUT_BINDING_SOURCE__PARAMETER_VALUE = BINDING__PARAMETER_VALUE;

  /**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTPUT_BINDING_SOURCE__SOURCE = BINDING_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Specifier Element</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTPUT_BINDING_SOURCE__SPECIFIER_ELEMENT = BINDING_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>output Binding Source</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OUTPUT_BINDING_SOURCE_FEATURE_COUNT = BINDING_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link control.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.ResultImpl
	 * @see control.impl.ControlPackageImpl#getResult()
	 * @generated
	 */
  int RESULT = 35;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT__NAME = NAMED_ELEMENT__NAME;

  /**
	 * The feature id for the '<em><b>In Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT__IN_CONDITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Has Result Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT__HAS_RESULT_VAR = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Has Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT__HAS_EFFECT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Binding Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT__BINDING_SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
	 * The meta object id for the '{@link control.impl.ResultVarImpl <em>Result Var</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.ResultVarImpl
	 * @see control.impl.ControlPackageImpl#getResultVar()
	 * @generated
	 */
  int RESULT_VAR = 36;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_VAR__NAME = PROCESS_VAR__NAME;

  /**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_VAR__PARAMETER_TYPE = PROCESS_VAR__PARAMETER_TYPE;

  /**
	 * The feature id for the '<em><b>Parameter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_VAR__PARAMETER_VALUE = PROCESS_VAR__PARAMETER_VALUE;

  /**
	 * The number of structural features of the '<em>Result Var</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_VAR_FEATURE_COUNT = PROCESS_VAR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link control.impl.LocalImpl <em>Local</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.LocalImpl
	 * @see control.impl.ControlPackageImpl#getLocal()
	 * @generated
	 */
  int LOCAL = 37;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOCAL__NAME = PROCESS_VAR__NAME;

  /**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOCAL__PARAMETER_TYPE = PROCESS_VAR__PARAMETER_TYPE;

  /**
	 * The feature id for the '<em><b>Parameter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOCAL__PARAMETER_VALUE = PROCESS_VAR__PARAMETER_VALUE;

  /**
	 * The number of structural features of the '<em>Local</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOCAL_FEATURE_COUNT = PROCESS_VAR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link control.impl.LocImpl <em>Loc</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.LocImpl
	 * @see control.impl.ControlPackageImpl#getLoc()
	 * @generated
	 */
  int LOC = 38;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOC__NAME = LOCAL__NAME;

  /**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOC__PARAMETER_TYPE = LOCAL__PARAMETER_TYPE;

  /**
	 * The feature id for the '<em><b>Parameter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOC__PARAMETER_VALUE = LOCAL__PARAMETER_VALUE;

  /**
	 * The number of structural features of the '<em>Loc</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOC_FEATURE_COUNT = LOCAL_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link control.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.LinkImpl
	 * @see control.impl.ControlPackageImpl#getLink()
	 * @generated
	 */
  int LINK = 39;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINK__NAME = PROCESS_VAR__NAME;

  /**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINK__PARAMETER_TYPE = PROCESS_VAR__PARAMETER_TYPE;

  /**
	 * The feature id for the '<em><b>Parameter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINK__PARAMETER_VALUE = PROCESS_VAR__PARAMETER_VALUE;

  /**
	 * The feature id for the '<em><b>Has Been Written</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINK__HAS_BEEN_WRITTEN = PROCESS_VAR_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINK_FEATURE_COUNT = PROCESS_VAR_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link control.impl.ControlConstructBagImpl <em>Construct Bag</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.ControlConstructBagImpl
	 * @see control.impl.ControlPackageImpl#getControlConstructBag()
	 * @generated
	 */
  int CONTROL_CONSTRUCT_BAG = 40;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL_CONSTRUCT_BAG__NAME = NAMED_ELEMENT__NAME;

  /**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL_CONSTRUCT_BAG__FIRST = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Rest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL_CONSTRUCT_BAG__REST = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Construct Bag</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL_CONSTRUCT_BAG_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link control.impl.ControlConstructListImpl <em>Construct List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.ControlConstructListImpl
	 * @see control.impl.ControlPackageImpl#getControlConstructList()
	 * @generated
	 */
  int CONTROL_CONSTRUCT_LIST = 41;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL_CONSTRUCT_LIST__NAME = NAMED_ELEMENT__NAME;

  /**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL_CONSTRUCT_LIST__FIRST = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Rest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL_CONSTRUCT_LIST__REST = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Construct List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL_CONSTRUCT_LIST_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link control.impl.ExprImpl <em>Expr</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.ExprImpl
	 * @see control.impl.ControlPackageImpl#getExpr()
	 * @generated
	 */
  int EXPR = 43;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPR__NAME = 0;

  /**
	 * The feature id for the '<em><b>Logic Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPR__LOGIC_LANGUAGE = 1;

  /**
	 * The feature id for the '<em><b>Body Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__BODY_LITERAL = 2;

		/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPR__VERSION = 3;

  /**
	 * The number of structural features of the '<em>Expr</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPR_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link control.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.impl.ConditionImpl
	 * @see control.impl.ControlPackageImpl#getCondition()
	 * @generated
	 */
  int CONDITION = 42;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONDITION__NAME = EXPR__NAME;

  /**
	 * The feature id for the '<em><b>Logic Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONDITION__LOGIC_LANGUAGE = EXPR__LOGIC_LANGUAGE;

  /**
	 * The feature id for the '<em><b>Body Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__BODY_LITERAL = EXPR__BODY_LITERAL;

		/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONDITION__VERSION = EXPR__VERSION;

  /**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONDITION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link control.ExpressionLanguage <em>Expression Language</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see control.ExpressionLanguage
	 * @see control.impl.ControlPackageImpl#getExpressionLanguage()
	 * @generated
	 */
  int EXPRESSION_LANGUAGE = 44;


  /**
	 * Returns the meta object for class '{@link control.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see control.NamedElement
	 * @generated
	 */
  EClass getNamedElement();

  /**
	 * Returns the meta object for the attribute '{@link control.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see control.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
  EAttribute getNamedElement_Name();

  /**
	 * Returns the meta object for class '{@link control.ProcessVar <em>Process Var</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Var</em>'.
	 * @see control.ProcessVar
	 * @generated
	 */
  EClass getProcessVar();

  /**
	 * Returns the meta object for the attribute '{@link control.ProcessVar#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Type</em>'.
	 * @see control.ProcessVar#getParameterType()
	 * @see #getProcessVar()
	 * @generated
	 */
  EAttribute getProcessVar_ParameterType();

  /**
	 * Returns the meta object for the attribute '{@link control.ProcessVar#getParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Value</em>'.
	 * @see control.ProcessVar#getParameterValue()
	 * @see #getProcessVar()
	 * @generated
	 */
  EAttribute getProcessVar_ParameterValue();

  /**
	 * Returns the meta object for class '{@link control.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see control.Parameter
	 * @generated
	 */
  EClass getParameter();

  /**
	 * Returns the meta object for class '{@link control.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology</em>'.
	 * @see control.Ontology
	 * @generated
	 */
	EClass getOntology();

		/**
	 * Returns the meta object for the attribute '{@link control.Ontology#getOntologyURI <em>Ontology URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ontology URI</em>'.
	 * @see control.Ontology#getOntologyURI()
	 * @see #getOntology()
	 * @generated
	 */
	EAttribute getOntology_OntologyURI();

		/**
	 * Returns the meta object for class '{@link control.TemplateConstraint <em>Template Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Constraint</em>'.
	 * @see control.TemplateConstraint
	 * @generated
	 */
	EClass getTemplateConstraint();

		/**
	 * Returns the meta object for the attribute '{@link control.TemplateConstraint#getAspCode <em>Asp Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asp Code</em>'.
	 * @see control.TemplateConstraint#getAspCode()
	 * @see #getTemplateConstraint()
	 * @generated
	 */
	EAttribute getTemplateConstraint_AspCode();

		/**
	 * Returns the meta object for the attribute '{@link control.TemplateConstraint#getAspBinding <em>Asp Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asp Binding</em>'.
	 * @see control.TemplateConstraint#getAspBinding()
	 * @see #getTemplateConstraint()
	 * @generated
	 */
	EAttribute getTemplateConstraint_AspBinding();

		/**
	 * Returns the meta object for class '{@link control.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see control.Input
	 * @generated
	 */
  EClass getInput();

  /**
	 * Returns the meta object for class '{@link control.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see control.Output
	 * @generated
	 */
  EClass getOutput();

  /**
	 * Returns the meta object for class '{@link control.OuterProcess <em>Outer Process</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outer Process</em>'.
	 * @see control.OuterProcess
	 * @generated
	 */
  EClass getOuterProcess();

  /**
	 * Returns the meta object for the containment reference '{@link control.OuterProcess#getConstruct <em>Construct</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Construct</em>'.
	 * @see control.OuterProcess#getConstruct()
	 * @see #getOuterProcess()
	 * @generated
	 */
  EReference getOuterProcess_Construct();

  /**
	 * Returns the meta object for the containment reference list '{@link control.OuterProcess#getHasInput <em>Has Input</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Input</em>'.
	 * @see control.OuterProcess#getHasInput()
	 * @see #getOuterProcess()
	 * @generated
	 */
  EReference getOuterProcess_HasInput();

  /**
	 * Returns the meta object for the containment reference list '{@link control.OuterProcess#getHasOutput <em>Has Output</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Output</em>'.
	 * @see control.OuterProcess#getHasOutput()
	 * @see #getOuterProcess()
	 * @generated
	 */
  EReference getOuterProcess_HasOutput();

  /**
	 * Returns the meta object for the containment reference list '{@link control.OuterProcess#getHasPrecondition <em>Has Precondition</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Precondition</em>'.
	 * @see control.OuterProcess#getHasPrecondition()
	 * @see #getOuterProcess()
	 * @generated
	 */
  EReference getOuterProcess_HasPrecondition();

  /**
	 * Returns the meta object for the containment reference list '{@link control.OuterProcess#getHasResult <em>Has Result</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Result</em>'.
	 * @see control.OuterProcess#getHasResult()
	 * @see #getOuterProcess()
	 * @generated
	 */
  EReference getOuterProcess_HasResult();

  /**
	 * Returns the meta object for the containment reference list '{@link control.OuterProcess#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see control.OuterProcess#getBindings()
	 * @see #getOuterProcess()
	 * @generated
	 */
  EReference getOuterProcess_Bindings();

  /**
	 * Returns the meta object for the containment reference list '{@link control.OuterProcess#getOuterLocals <em>Outer Locals</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outer Locals</em>'.
	 * @see control.OuterProcess#getOuterLocals()
	 * @see #getOuterProcess()
	 * @generated
	 */
  EReference getOuterProcess_OuterLocals();

  /**
	 * Returns the meta object for the containment reference list '{@link control.OuterProcess#getOuterLinks <em>Outer Links</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outer Links</em>'.
	 * @see control.OuterProcess#getOuterLinks()
	 * @see #getOuterProcess()
	 * @generated
	 */
  EReference getOuterProcess_OuterLinks();

  /**
	 * Returns the meta object for the containment reference list '{@link control.OuterProcess#getOntologies <em>Ontologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ontologies</em>'.
	 * @see control.OuterProcess#getOntologies()
	 * @see #getOuterProcess()
	 * @generated
	 */
	EReference getOuterProcess_Ontologies();

		/**
	 * Returns the meta object for the containment reference '{@link control.OuterProcess#getTemplateConstraints <em>Template Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template Constraints</em>'.
	 * @see control.OuterProcess#getTemplateConstraints()
	 * @see #getOuterProcess()
	 * @generated
	 */
	EReference getOuterProcess_TemplateConstraints();

		/**
	 * Returns the meta object for the attribute '{@link control.OuterProcess#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see control.OuterProcess#getServiceName()
	 * @see #getOuterProcess()
	 * @generated
	 */
	EAttribute getOuterProcess_ServiceName();

		/**
	 * Returns the meta object for the attribute '{@link control.OuterProcess#getServiceURI <em>Service URI</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service URI</em>'.
	 * @see control.OuterProcess#getServiceURI()
	 * @see #getOuterProcess()
	 * @generated
	 */
  EAttribute getOuterProcess_ServiceURI();

  /**
	 * Returns the meta object for the attribute '{@link control.OuterProcess#getServiceDescription <em>Service Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Description</em>'.
	 * @see control.OuterProcess#getServiceDescription()
	 * @see #getOuterProcess()
	 * @generated
	 */
  EAttribute getOuterProcess_ServiceDescription();

  /**
	 * Returns the meta object for class '{@link control.AbstractProcess <em>Abstract Process</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Process</em>'.
	 * @see control.AbstractProcess
	 * @generated
	 */
  EClass getAbstractProcess();

  /**
	 * Returns the meta object for the containment reference list '{@link control.AbstractProcess#getHasInput <em>Has Input</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Input</em>'.
	 * @see control.AbstractProcess#getHasInput()
	 * @see #getAbstractProcess()
	 * @generated
	 */
  EReference getAbstractProcess_HasInput();

  /**
	 * Returns the meta object for the containment reference list '{@link control.AbstractProcess#getHasOutput <em>Has Output</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Output</em>'.
	 * @see control.AbstractProcess#getHasOutput()
	 * @see #getAbstractProcess()
	 * @generated
	 */
  EReference getAbstractProcess_HasOutput();

  /**
	 * Returns the meta object for class '{@link control.RemoteProcess <em>Remote Process</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Process</em>'.
	 * @see control.RemoteProcess
	 * @generated
	 */
  EClass getRemoteProcess();

  /**
	 * Returns the meta object for the attribute '{@link control.RemoteProcess#getRemoteURI <em>Remote URI</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote URI</em>'.
	 * @see control.RemoteProcess#getRemoteURI()
	 * @see #getRemoteProcess()
	 * @generated
	 */
  EAttribute getRemoteProcess_RemoteURI();

  /**
	 * Returns the meta object for the attribute '{@link control.RemoteProcess#getRemoteURL <em>Remote URL</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote URL</em>'.
	 * @see control.RemoteProcess#getRemoteURL()
	 * @see #getRemoteProcess()
	 * @generated
	 */
  EAttribute getRemoteProcess_RemoteURL();

  /**
	 * Returns the meta object for the containment reference list '{@link control.RemoteProcess#getHasResult <em>Has Result</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Result</em>'.
	 * @see control.RemoteProcess#getHasResult()
	 * @see #getRemoteProcess()
	 * @generated
	 */
  EReference getRemoteProcess_HasResult();

  /**
	 * Returns the meta object for the containment reference list '{@link control.RemoteProcess#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see control.RemoteProcess#getExpressions()
	 * @see #getRemoteProcess()
	 * @generated
	 */
  EReference getRemoteProcess_Expressions();

  /**
	 * Returns the meta object for class '{@link control.TemplateProcess <em>Template Process</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Process</em>'.
	 * @see control.TemplateProcess
	 * @generated
	 */
  EClass getTemplateProcess();

  /**
	 * Returns the meta object for the attribute '{@link control.TemplateProcess#getSlotName <em>Slot Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slot Name</em>'.
	 * @see control.TemplateProcess#getSlotName()
	 * @see #getTemplateProcess()
	 * @generated
	 */
  EAttribute getTemplateProcess_SlotName();

  /**
	 * Returns the meta object for class '{@link control.ControlConstruct <em>Construct</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Construct</em>'.
	 * @see control.ControlConstruct
	 * @generated
	 */
  EClass getControlConstruct();

  /**
	 * Returns the meta object for class '{@link control.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see control.Sequence
	 * @generated
	 */
  EClass getSequence();

  /**
	 * Returns the meta object for the containment reference '{@link control.Sequence#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see control.Sequence#getComponents()
	 * @see #getSequence()
	 * @generated
	 */
  EReference getSequence_Components();

  /**
	 * Returns the meta object for class '{@link control.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see control.Choice
	 * @generated
	 */
  EClass getChoice();

  /**
	 * Returns the meta object for the containment reference '{@link control.Choice#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see control.Choice#getComponents()
	 * @see #getChoice()
	 * @generated
	 */
  EReference getChoice_Components();

  /**
	 * Returns the meta object for class '{@link control.AnyOrder <em>Any Order</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Order</em>'.
	 * @see control.AnyOrder
	 * @generated
	 */
  EClass getAnyOrder();

  /**
	 * Returns the meta object for the containment reference '{@link control.AnyOrder#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see control.AnyOrder#getComponents()
	 * @see #getAnyOrder()
	 * @generated
	 */
  EReference getAnyOrder_Components();

  /**
	 * Returns the meta object for class '{@link control.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split</em>'.
	 * @see control.Split
	 * @generated
	 */
  EClass getSplit();

  /**
	 * Returns the meta object for the containment reference '{@link control.Split#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see control.Split#getComponents()
	 * @see #getSplit()
	 * @generated
	 */
  EReference getSplit_Components();

  /**
	 * Returns the meta object for class '{@link control.SplitJoin <em>Split Join</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Join</em>'.
	 * @see control.SplitJoin
	 * @generated
	 */
  EClass getSplitJoin();

  /**
	 * Returns the meta object for the containment reference '{@link control.SplitJoin#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see control.SplitJoin#getComponents()
	 * @see #getSplitJoin()
	 * @generated
	 */
  EReference getSplitJoin_Components();

  /**
	 * Returns the meta object for class '{@link control.IfThenElse <em>If Then Else</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Then Else</em>'.
	 * @see control.IfThenElse
	 * @generated
	 */
  EClass getIfThenElse();

  /**
	 * Returns the meta object for the containment reference '{@link control.IfThenElse#getIfCondition <em>If Condition</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Condition</em>'.
	 * @see control.IfThenElse#getIfCondition()
	 * @see #getIfThenElse()
	 * @generated
	 */
  EReference getIfThenElse_IfCondition();

  /**
	 * Returns the meta object for the containment reference '{@link control.IfThenElse#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see control.IfThenElse#getThen()
	 * @see #getIfThenElse()
	 * @generated
	 */
  EReference getIfThenElse_Then();

  /**
	 * Returns the meta object for the containment reference '{@link control.IfThenElse#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see control.IfThenElse#getElse()
	 * @see #getIfThenElse()
	 * @generated
	 */
  EReference getIfThenElse_Else();

  /**
	 * Returns the meta object for class '{@link control.RepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Until</em>'.
	 * @see control.RepeatUntil
	 * @generated
	 */
  EClass getRepeatUntil();

  /**
	 * Returns the meta object for the containment reference '{@link control.RepeatUntil#getUntilCondition <em>Until Condition</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Until Condition</em>'.
	 * @see control.RepeatUntil#getUntilCondition()
	 * @see #getRepeatUntil()
	 * @generated
	 */
  EReference getRepeatUntil_UntilCondition();

  /**
	 * Returns the meta object for the containment reference '{@link control.RepeatUntil#getUntilProcess <em>Until Process</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Until Process</em>'.
	 * @see control.RepeatUntil#getUntilProcess()
	 * @see #getRepeatUntil()
	 * @generated
	 */
  EReference getRepeatUntil_UntilProcess();

  /**
	 * Returns the meta object for class '{@link control.RepeatWhile <em>Repeat While</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat While</em>'.
	 * @see control.RepeatWhile
	 * @generated
	 */
  EClass getRepeatWhile();

  /**
	 * Returns the meta object for the containment reference '{@link control.RepeatWhile#getWhileCondition <em>While Condition</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While Condition</em>'.
	 * @see control.RepeatWhile#getWhileCondition()
	 * @see #getRepeatWhile()
	 * @generated
	 */
  EReference getRepeatWhile_WhileCondition();

  /**
	 * Returns the meta object for the containment reference '{@link control.RepeatWhile#getWhileProcess <em>While Process</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While Process</em>'.
	 * @see control.RepeatWhile#getWhileProcess()
	 * @see #getRepeatWhile()
	 * @generated
	 */
  EReference getRepeatWhile_WhileProcess();

  /**
	 * Returns the meta object for class '{@link control.Perform <em>Perform</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perform</em>'.
	 * @see control.Perform
	 * @generated
	 */
  EClass getPerform();

  /**
	 * Returns the meta object for the containment reference '{@link control.Perform#getTheProcess <em>The Process</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Process</em>'.
	 * @see control.Perform#getTheProcess()
	 * @see #getPerform()
	 * @generated
	 */
  EReference getPerform_TheProcess();

  /**
	 * Returns the meta object for class '{@link control.Produce <em>Produce</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Produce</em>'.
	 * @see control.Produce
	 * @generated
	 */
  EClass getProduce();

  /**
	 * Returns the meta object for the containment reference '{@link control.Produce#getProducedBindingValueSpecifier <em>Produced Binding Value Specifier</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Produced Binding Value Specifier</em>'.
	 * @see control.Produce#getProducedBindingValueSpecifier()
	 * @see #getProduce()
	 * @generated
	 */
  EReference getProduce_ProducedBindingValueSpecifier();

  /**
	 * Returns the meta object for class '{@link control.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see control.Set
	 * @generated
	 */
  EClass getSet();

  /**
	 * Returns the meta object for the containment reference '{@link control.Set#getProducedBindingValueSpecifier <em>Produced Binding Value Specifier</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Produced Binding Value Specifier</em>'.
	 * @see control.Set#getProducedBindingValueSpecifier()
	 * @see #getSet()
	 * @generated
	 */
  EReference getSet_ProducedBindingValueSpecifier();

  /**
	 * Returns the meta object for class '{@link control.ValueSpecifier <em>Value Specifier</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specifier</em>'.
	 * @see control.ValueSpecifier
	 * @generated
	 */
  EClass getValueSpecifier();

  /**
	 * Returns the meta object for class '{@link control.ValueSpecifierElement <em>Value Specifier Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specifier Element</em>'.
	 * @see control.ValueSpecifierElement
	 * @generated
	 */
  EClass getValueSpecifierElement();

  /**
	 * Returns the meta object for class '{@link control.ValueSource <em>Value Source</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Source</em>'.
	 * @see control.ValueSource
	 * @generated
	 */
  EClass getValueSource();

  /**
	 * Returns the meta object for the attribute '{@link control.ValueSource#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see control.ValueSource#getBody()
	 * @see #getValueSource()
	 * @generated
	 */
  EAttribute getValueSource_Body();

  /**
	 * Returns the meta object for class '{@link control.ValueForm <em>Value Form</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Form</em>'.
	 * @see control.ValueForm
	 * @generated
	 */
  EClass getValueForm();

  /**
	 * Returns the meta object for the attribute '{@link control.ValueForm#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see control.ValueForm#getBody()
	 * @see #getValueForm()
	 * @generated
	 */
  EAttribute getValueForm_Body();

  /**
	 * Returns the meta object for class '{@link control.ValueFunction <em>Value Function</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Function</em>'.
	 * @see control.ValueFunction
	 * @generated
	 */
  EClass getValueFunction();

  /**
	 * Returns the meta object for the attribute '{@link control.ValueFunction#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see control.ValueFunction#getBody()
	 * @see #getValueFunction()
	 * @generated
	 */
  EAttribute getValueFunction_Body();

  /**
	 * Returns the meta object for class '{@link control.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see control.Binding
	 * @generated
	 */
  EClass getBinding();

  /**
	 * Returns the meta object for class '{@link control.SetBinding <em>Set Binding</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Binding</em>'.
	 * @see control.SetBinding
	 * @generated
	 */
  EClass getSetBinding();

  /**
	 * Returns the meta object for class '{@link control.InputBinding <em>Input Binding</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Binding</em>'.
	 * @see control.InputBinding
	 * @generated
	 */
  EClass getInputBinding();

  /**
	 * Returns the meta object for the reference '{@link control.InputBinding#getToParam <em>To Param</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Param</em>'.
	 * @see control.InputBinding#getToParam()
	 * @see #getInputBinding()
	 * @generated
	 */
  EReference getInputBinding_ToParam();

  /**
	 * Returns the meta object for the reference '{@link control.InputBinding#getValueSource <em>Value Source</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Source</em>'.
	 * @see control.InputBinding#getValueSource()
	 * @see #getInputBinding()
	 * @generated
	 */
  EReference getInputBinding_ValueSource();

  /**
	 * Returns the meta object for class '{@link control.OutputBinding <em>Output Binding</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Binding</em>'.
	 * @see control.OutputBinding
	 * @generated
	 */
  EClass getOutputBinding();

  /**
	 * Returns the meta object for the reference '{@link control.OutputBinding#getToParam <em>To Param</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Param</em>'.
	 * @see control.OutputBinding#getToParam()
	 * @see #getOutputBinding()
	 * @generated
	 */
  EReference getOutputBinding_ToParam();

  /**
	 * Returns the meta object for the reference '{@link control.OutputBinding#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see control.OutputBinding#getOrigin()
	 * @see #getOutputBinding()
	 * @generated
	 */
  EReference getOutputBinding_Origin();

  /**
	 * Returns the meta object for class '{@link control.LocBinding <em>Loc Binding</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loc Binding</em>'.
	 * @see control.LocBinding
	 * @generated
	 */
  EClass getLocBinding();

  /**
	 * Returns the meta object for the reference '{@link control.LocBinding#getToLoc <em>To Loc</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Loc</em>'.
	 * @see control.LocBinding#getToLoc()
	 * @see #getLocBinding()
	 * @generated
	 */
  EReference getLocBinding_ToLoc();

  /**
	 * Returns the meta object for the reference '{@link control.LocBinding#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see control.LocBinding#getOrigin()
	 * @see #getLocBinding()
	 * @generated
	 */
  EReference getLocBinding_Origin();

  /**
	 * Returns the meta object for class '{@link control.LinkBinding <em>Link Binding</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Binding</em>'.
	 * @see control.LinkBinding
	 * @generated
	 */
  EClass getLinkBinding();

  /**
	 * Returns the meta object for the reference '{@link control.LinkBinding#getToLink <em>To Link</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Link</em>'.
	 * @see control.LinkBinding#getToLink()
	 * @see #getLinkBinding()
	 * @generated
	 */
  EReference getLinkBinding_ToLink();

  /**
	 * Returns the meta object for the reference '{@link control.LinkBinding#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see control.LinkBinding#getOrigin()
	 * @see #getLinkBinding()
	 * @generated
	 */
  EReference getLinkBinding_Origin();

  /**
	 * Returns the meta object for class '{@link control.outputBindingSource <em>output Binding Source</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>output Binding Source</em>'.
	 * @see control.outputBindingSource
	 * @generated
	 */
  EClass getoutputBindingSource();

  /**
	 * Returns the meta object for the reference '{@link control.outputBindingSource#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see control.outputBindingSource#getSource()
	 * @see #getoutputBindingSource()
	 * @generated
	 */
  EReference getoutputBindingSource_Source();

  /**
	 * Returns the meta object for the reference '{@link control.outputBindingSource#getSpecifierElement <em>Specifier Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specifier Element</em>'.
	 * @see control.outputBindingSource#getSpecifierElement()
	 * @see #getoutputBindingSource()
	 * @generated
	 */
  EReference getoutputBindingSource_SpecifierElement();

  /**
	 * Returns the meta object for class '{@link control.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see control.Result
	 * @generated
	 */
  EClass getResult();

  /**
	 * Returns the meta object for the containment reference list '{@link control.Result#getInCondition <em>In Condition</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Condition</em>'.
	 * @see control.Result#getInCondition()
	 * @see #getResult()
	 * @generated
	 */
  EReference getResult_InCondition();

  /**
	 * Returns the meta object for the containment reference '{@link control.Result#getHasResultVar <em>Has Result Var</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Result Var</em>'.
	 * @see control.Result#getHasResultVar()
	 * @see #getResult()
	 * @generated
	 */
  EReference getResult_HasResultVar();

  /**
	 * Returns the meta object for the containment reference '{@link control.Result#getHasEffect <em>Has Effect</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Effect</em>'.
	 * @see control.Result#getHasEffect()
	 * @see #getResult()
	 * @generated
	 */
  EReference getResult_HasEffect();

  /**
	 * Returns the meta object for the containment reference list '{@link control.Result#getBindingSource <em>Binding Source</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding Source</em>'.
	 * @see control.Result#getBindingSource()
	 * @see #getResult()
	 * @generated
	 */
  EReference getResult_BindingSource();

  /**
	 * Returns the meta object for class '{@link control.ResultVar <em>Result Var</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Var</em>'.
	 * @see control.ResultVar
	 * @generated
	 */
  EClass getResultVar();

  /**
	 * Returns the meta object for class '{@link control.Local <em>Local</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local</em>'.
	 * @see control.Local
	 * @generated
	 */
  EClass getLocal();

  /**
	 * Returns the meta object for class '{@link control.Loc <em>Loc</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loc</em>'.
	 * @see control.Loc
	 * @generated
	 */
  EClass getLoc();

  /**
	 * Returns the meta object for class '{@link control.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see control.Link
	 * @generated
	 */
  EClass getLink();

  /**
	 * Returns the meta object for the attribute '{@link control.Link#getHasBeenWritten <em>Has Been Written</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Been Written</em>'.
	 * @see control.Link#getHasBeenWritten()
	 * @see #getLink()
	 * @generated
	 */
  EAttribute getLink_HasBeenWritten();

  /**
	 * Returns the meta object for class '{@link control.ControlConstructBag <em>Construct Bag</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Construct Bag</em>'.
	 * @see control.ControlConstructBag
	 * @generated
	 */
  EClass getControlConstructBag();

  /**
	 * Returns the meta object for the containment reference '{@link control.ControlConstructBag#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see control.ControlConstructBag#getFirst()
	 * @see #getControlConstructBag()
	 * @generated
	 */
  EReference getControlConstructBag_First();

  /**
	 * Returns the meta object for the containment reference '{@link control.ControlConstructBag#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rest</em>'.
	 * @see control.ControlConstructBag#getRest()
	 * @see #getControlConstructBag()
	 * @generated
	 */
  EReference getControlConstructBag_Rest();

  /**
	 * Returns the meta object for class '{@link control.ControlConstructList <em>Construct List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Construct List</em>'.
	 * @see control.ControlConstructList
	 * @generated
	 */
  EClass getControlConstructList();

  /**
	 * Returns the meta object for the containment reference '{@link control.ControlConstructList#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see control.ControlConstructList#getFirst()
	 * @see #getControlConstructList()
	 * @generated
	 */
  EReference getControlConstructList_First();

  /**
	 * Returns the meta object for the containment reference '{@link control.ControlConstructList#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rest</em>'.
	 * @see control.ControlConstructList#getRest()
	 * @see #getControlConstructList()
	 * @generated
	 */
  EReference getControlConstructList_Rest();

  /**
	 * Returns the meta object for class '{@link control.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see control.Condition
	 * @generated
	 */
  EClass getCondition();

  /**
	 * Returns the meta object for class '{@link control.Expr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expr</em>'.
	 * @see control.Expr
	 * @generated
	 */
  EClass getExpr();

  /**
	 * Returns the meta object for the attribute '{@link control.Expr#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see control.Expr#getName()
	 * @see #getExpr()
	 * @generated
	 */
  EAttribute getExpr_Name();

  /**
	 * Returns the meta object for the attribute '{@link control.Expr#getLogicLanguage <em>Logic Language</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logic Language</em>'.
	 * @see control.Expr#getLogicLanguage()
	 * @see #getExpr()
	 * @generated
	 */
  EAttribute getExpr_LogicLanguage();

  /**
	 * Returns the meta object for the attribute '{@link control.Expr#getBodyLiteral <em>Body Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body Literal</em>'.
	 * @see control.Expr#getBodyLiteral()
	 * @see #getExpr()
	 * @generated
	 */
	EAttribute getExpr_BodyLiteral();

		/**
	 * Returns the meta object for the attribute '{@link control.Expr#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see control.Expr#getVersion()
	 * @see #getExpr()
	 * @generated
	 */
  EAttribute getExpr_Version();

  /**
	 * Returns the meta object for enum '{@link control.ExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expression Language</em>'.
	 * @see control.ExpressionLanguage
	 * @generated
	 */
  EEnum getExpressionLanguage();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  ControlFactory getControlFactory();

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
		 * The meta object literal for the '{@link control.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.NamedElementImpl
		 * @see control.impl.ControlPackageImpl#getNamedElement()
		 * @generated
		 */
    EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

    /**
		 * The meta object literal for the '{@link control.impl.ProcessVarImpl <em>Process Var</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.ProcessVarImpl
		 * @see control.impl.ControlPackageImpl#getProcessVar()
		 * @generated
		 */
    EClass PROCESS_VAR = eINSTANCE.getProcessVar();

    /**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PROCESS_VAR__PARAMETER_TYPE = eINSTANCE.getProcessVar_ParameterType();

    /**
		 * The meta object literal for the '<em><b>Parameter Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PROCESS_VAR__PARAMETER_VALUE = eINSTANCE.getProcessVar_ParameterValue();

    /**
		 * The meta object literal for the '{@link control.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.ParameterImpl
		 * @see control.impl.ControlPackageImpl#getParameter()
		 * @generated
		 */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
		 * The meta object literal for the '{@link control.impl.OntologyImpl <em>Ontology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see control.impl.OntologyImpl
		 * @see control.impl.ControlPackageImpl#getOntology()
		 * @generated
		 */
		EClass ONTOLOGY = eINSTANCE.getOntology();

				/**
		 * The meta object literal for the '<em><b>Ontology URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY__ONTOLOGY_URI = eINSTANCE.getOntology_OntologyURI();

				/**
		 * The meta object literal for the '{@link control.impl.TemplateConstraintImpl <em>Template Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see control.impl.TemplateConstraintImpl
		 * @see control.impl.ControlPackageImpl#getTemplateConstraint()
		 * @generated
		 */
		EClass TEMPLATE_CONSTRAINT = eINSTANCE.getTemplateConstraint();

				/**
		 * The meta object literal for the '<em><b>Asp Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_CONSTRAINT__ASP_CODE = eINSTANCE.getTemplateConstraint_AspCode();

				/**
		 * The meta object literal for the '<em><b>Asp Binding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_CONSTRAINT__ASP_BINDING = eINSTANCE.getTemplateConstraint_AspBinding();

				/**
		 * The meta object literal for the '{@link control.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.InputImpl
		 * @see control.impl.ControlPackageImpl#getInput()
		 * @generated
		 */
    EClass INPUT = eINSTANCE.getInput();

    /**
		 * The meta object literal for the '{@link control.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.OutputImpl
		 * @see control.impl.ControlPackageImpl#getOutput()
		 * @generated
		 */
    EClass OUTPUT = eINSTANCE.getOutput();

    /**
		 * The meta object literal for the '{@link control.impl.OuterProcessImpl <em>Outer Process</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.OuterProcessImpl
		 * @see control.impl.ControlPackageImpl#getOuterProcess()
		 * @generated
		 */
    EClass OUTER_PROCESS = eINSTANCE.getOuterProcess();

    /**
		 * The meta object literal for the '<em><b>Construct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OUTER_PROCESS__CONSTRUCT = eINSTANCE.getOuterProcess_Construct();

    /**
		 * The meta object literal for the '<em><b>Has Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OUTER_PROCESS__HAS_INPUT = eINSTANCE.getOuterProcess_HasInput();

    /**
		 * The meta object literal for the '<em><b>Has Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OUTER_PROCESS__HAS_OUTPUT = eINSTANCE.getOuterProcess_HasOutput();

    /**
		 * The meta object literal for the '<em><b>Has Precondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OUTER_PROCESS__HAS_PRECONDITION = eINSTANCE.getOuterProcess_HasPrecondition();

    /**
		 * The meta object literal for the '<em><b>Has Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OUTER_PROCESS__HAS_RESULT = eINSTANCE.getOuterProcess_HasResult();

    /**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OUTER_PROCESS__BINDINGS = eINSTANCE.getOuterProcess_Bindings();

    /**
		 * The meta object literal for the '<em><b>Outer Locals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OUTER_PROCESS__OUTER_LOCALS = eINSTANCE.getOuterProcess_OuterLocals();

    /**
		 * The meta object literal for the '<em><b>Outer Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OUTER_PROCESS__OUTER_LINKS = eINSTANCE.getOuterProcess_OuterLinks();

    /**
		 * The meta object literal for the '<em><b>Ontologies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTER_PROCESS__ONTOLOGIES = eINSTANCE.getOuterProcess_Ontologies();

				/**
		 * The meta object literal for the '<em><b>Template Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTER_PROCESS__TEMPLATE_CONSTRAINTS = eINSTANCE.getOuterProcess_TemplateConstraints();

				/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTER_PROCESS__SERVICE_NAME = eINSTANCE.getOuterProcess_ServiceName();

				/**
		 * The meta object literal for the '<em><b>Service URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute OUTER_PROCESS__SERVICE_URI = eINSTANCE.getOuterProcess_ServiceURI();

    /**
		 * The meta object literal for the '<em><b>Service Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute OUTER_PROCESS__SERVICE_DESCRIPTION = eINSTANCE.getOuterProcess_ServiceDescription();

    /**
		 * The meta object literal for the '{@link control.impl.AbstractProcessImpl <em>Abstract Process</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.AbstractProcessImpl
		 * @see control.impl.ControlPackageImpl#getAbstractProcess()
		 * @generated
		 */
    EClass ABSTRACT_PROCESS = eINSTANCE.getAbstractProcess();

    /**
		 * The meta object literal for the '<em><b>Has Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_PROCESS__HAS_INPUT = eINSTANCE.getAbstractProcess_HasInput();

    /**
		 * The meta object literal for the '<em><b>Has Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_PROCESS__HAS_OUTPUT = eINSTANCE.getAbstractProcess_HasOutput();

    /**
		 * The meta object literal for the '{@link control.impl.RemoteProcessImpl <em>Remote Process</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.RemoteProcessImpl
		 * @see control.impl.ControlPackageImpl#getRemoteProcess()
		 * @generated
		 */
    EClass REMOTE_PROCESS = eINSTANCE.getRemoteProcess();

    /**
		 * The meta object literal for the '<em><b>Remote URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute REMOTE_PROCESS__REMOTE_URI = eINSTANCE.getRemoteProcess_RemoteURI();

    /**
		 * The meta object literal for the '<em><b>Remote URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute REMOTE_PROCESS__REMOTE_URL = eINSTANCE.getRemoteProcess_RemoteURL();

    /**
		 * The meta object literal for the '<em><b>Has Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference REMOTE_PROCESS__HAS_RESULT = eINSTANCE.getRemoteProcess_HasResult();

    /**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference REMOTE_PROCESS__EXPRESSIONS = eINSTANCE.getRemoteProcess_Expressions();

    /**
		 * The meta object literal for the '{@link control.impl.TemplateProcessImpl <em>Template Process</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.TemplateProcessImpl
		 * @see control.impl.ControlPackageImpl#getTemplateProcess()
		 * @generated
		 */
    EClass TEMPLATE_PROCESS = eINSTANCE.getTemplateProcess();

    /**
		 * The meta object literal for the '<em><b>Slot Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TEMPLATE_PROCESS__SLOT_NAME = eINSTANCE.getTemplateProcess_SlotName();

    /**
		 * The meta object literal for the '{@link control.impl.ControlConstructImpl <em>Construct</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.ControlConstructImpl
		 * @see control.impl.ControlPackageImpl#getControlConstruct()
		 * @generated
		 */
    EClass CONTROL_CONSTRUCT = eINSTANCE.getControlConstruct();

    /**
		 * The meta object literal for the '{@link control.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.SequenceImpl
		 * @see control.impl.ControlPackageImpl#getSequence()
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
		 * The meta object literal for the '{@link control.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.ChoiceImpl
		 * @see control.impl.ControlPackageImpl#getChoice()
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
		 * The meta object literal for the '{@link control.impl.AnyOrderImpl <em>Any Order</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.AnyOrderImpl
		 * @see control.impl.ControlPackageImpl#getAnyOrder()
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
		 * The meta object literal for the '{@link control.impl.SplitImpl <em>Split</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.SplitImpl
		 * @see control.impl.ControlPackageImpl#getSplit()
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
		 * The meta object literal for the '{@link control.impl.SplitJoinImpl <em>Split Join</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.SplitJoinImpl
		 * @see control.impl.ControlPackageImpl#getSplitJoin()
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
		 * The meta object literal for the '{@link control.impl.IfThenElseImpl <em>If Then Else</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.IfThenElseImpl
		 * @see control.impl.ControlPackageImpl#getIfThenElse()
		 * @generated
		 */
    EClass IF_THEN_ELSE = eINSTANCE.getIfThenElse();

    /**
		 * The meta object literal for the '<em><b>If Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IF_THEN_ELSE__IF_CONDITION = eINSTANCE.getIfThenElse_IfCondition();

    /**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IF_THEN_ELSE__THEN = eINSTANCE.getIfThenElse_Then();

    /**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IF_THEN_ELSE__ELSE = eINSTANCE.getIfThenElse_Else();

    /**
		 * The meta object literal for the '{@link control.impl.RepeatUntilImpl <em>Repeat Until</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.RepeatUntilImpl
		 * @see control.impl.ControlPackageImpl#getRepeatUntil()
		 * @generated
		 */
    EClass REPEAT_UNTIL = eINSTANCE.getRepeatUntil();

    /**
		 * The meta object literal for the '<em><b>Until Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference REPEAT_UNTIL__UNTIL_CONDITION = eINSTANCE.getRepeatUntil_UntilCondition();

    /**
		 * The meta object literal for the '<em><b>Until Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference REPEAT_UNTIL__UNTIL_PROCESS = eINSTANCE.getRepeatUntil_UntilProcess();

    /**
		 * The meta object literal for the '{@link control.impl.RepeatWhileImpl <em>Repeat While</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.RepeatWhileImpl
		 * @see control.impl.ControlPackageImpl#getRepeatWhile()
		 * @generated
		 */
    EClass REPEAT_WHILE = eINSTANCE.getRepeatWhile();

    /**
		 * The meta object literal for the '<em><b>While Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference REPEAT_WHILE__WHILE_CONDITION = eINSTANCE.getRepeatWhile_WhileCondition();

    /**
		 * The meta object literal for the '<em><b>While Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference REPEAT_WHILE__WHILE_PROCESS = eINSTANCE.getRepeatWhile_WhileProcess();

    /**
		 * The meta object literal for the '{@link control.impl.PerformImpl <em>Perform</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.PerformImpl
		 * @see control.impl.ControlPackageImpl#getPerform()
		 * @generated
		 */
    EClass PERFORM = eINSTANCE.getPerform();

    /**
		 * The meta object literal for the '<em><b>The Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference PERFORM__THE_PROCESS = eINSTANCE.getPerform_TheProcess();

    /**
		 * The meta object literal for the '{@link control.impl.ProduceImpl <em>Produce</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.ProduceImpl
		 * @see control.impl.ControlPackageImpl#getProduce()
		 * @generated
		 */
    EClass PRODUCE = eINSTANCE.getProduce();

    /**
		 * The meta object literal for the '<em><b>Produced Binding Value Specifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference PRODUCE__PRODUCED_BINDING_VALUE_SPECIFIER = eINSTANCE.getProduce_ProducedBindingValueSpecifier();

    /**
		 * The meta object literal for the '{@link control.impl.SetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.SetImpl
		 * @see control.impl.ControlPackageImpl#getSet()
		 * @generated
		 */
    EClass SET = eINSTANCE.getSet();

    /**
		 * The meta object literal for the '<em><b>Produced Binding Value Specifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SET__PRODUCED_BINDING_VALUE_SPECIFIER = eINSTANCE.getSet_ProducedBindingValueSpecifier();

    /**
		 * The meta object literal for the '{@link control.impl.ValueSpecifierImpl <em>Value Specifier</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.ValueSpecifierImpl
		 * @see control.impl.ControlPackageImpl#getValueSpecifier()
		 * @generated
		 */
    EClass VALUE_SPECIFIER = eINSTANCE.getValueSpecifier();

    /**
		 * The meta object literal for the '{@link control.impl.ValueSpecifierElementImpl <em>Value Specifier Element</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.ValueSpecifierElementImpl
		 * @see control.impl.ControlPackageImpl#getValueSpecifierElement()
		 * @generated
		 */
    EClass VALUE_SPECIFIER_ELEMENT = eINSTANCE.getValueSpecifierElement();

    /**
		 * The meta object literal for the '{@link control.impl.ValueSourceImpl <em>Value Source</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.ValueSourceImpl
		 * @see control.impl.ControlPackageImpl#getValueSource()
		 * @generated
		 */
    EClass VALUE_SOURCE = eINSTANCE.getValueSource();

    /**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VALUE_SOURCE__BODY = eINSTANCE.getValueSource_Body();

    /**
		 * The meta object literal for the '{@link control.impl.ValueFormImpl <em>Value Form</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.ValueFormImpl
		 * @see control.impl.ControlPackageImpl#getValueForm()
		 * @generated
		 */
    EClass VALUE_FORM = eINSTANCE.getValueForm();

    /**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VALUE_FORM__BODY = eINSTANCE.getValueForm_Body();

    /**
		 * The meta object literal for the '{@link control.impl.ValueFunctionImpl <em>Value Function</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.ValueFunctionImpl
		 * @see control.impl.ControlPackageImpl#getValueFunction()
		 * @generated
		 */
    EClass VALUE_FUNCTION = eINSTANCE.getValueFunction();

    /**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VALUE_FUNCTION__BODY = eINSTANCE.getValueFunction_Body();

    /**
		 * The meta object literal for the '{@link control.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.BindingImpl
		 * @see control.impl.ControlPackageImpl#getBinding()
		 * @generated
		 */
    EClass BINDING = eINSTANCE.getBinding();

    /**
		 * The meta object literal for the '{@link control.impl.SetBindingImpl <em>Set Binding</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.SetBindingImpl
		 * @see control.impl.ControlPackageImpl#getSetBinding()
		 * @generated
		 */
    EClass SET_BINDING = eINSTANCE.getSetBinding();

    /**
		 * The meta object literal for the '{@link control.impl.InputBindingImpl <em>Input Binding</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.InputBindingImpl
		 * @see control.impl.ControlPackageImpl#getInputBinding()
		 * @generated
		 */
    EClass INPUT_BINDING = eINSTANCE.getInputBinding();

    /**
		 * The meta object literal for the '<em><b>To Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference INPUT_BINDING__TO_PARAM = eINSTANCE.getInputBinding_ToParam();

    /**
		 * The meta object literal for the '<em><b>Value Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference INPUT_BINDING__VALUE_SOURCE = eINSTANCE.getInputBinding_ValueSource();

    /**
		 * The meta object literal for the '{@link control.impl.OutputBindingImpl <em>Output Binding</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.OutputBindingImpl
		 * @see control.impl.ControlPackageImpl#getOutputBinding()
		 * @generated
		 */
    EClass OUTPUT_BINDING = eINSTANCE.getOutputBinding();

    /**
		 * The meta object literal for the '<em><b>To Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OUTPUT_BINDING__TO_PARAM = eINSTANCE.getOutputBinding_ToParam();

    /**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OUTPUT_BINDING__ORIGIN = eINSTANCE.getOutputBinding_Origin();

    /**
		 * The meta object literal for the '{@link control.impl.LocBindingImpl <em>Loc Binding</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.LocBindingImpl
		 * @see control.impl.ControlPackageImpl#getLocBinding()
		 * @generated
		 */
    EClass LOC_BINDING = eINSTANCE.getLocBinding();

    /**
		 * The meta object literal for the '<em><b>To Loc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LOC_BINDING__TO_LOC = eINSTANCE.getLocBinding_ToLoc();

    /**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LOC_BINDING__ORIGIN = eINSTANCE.getLocBinding_Origin();

    /**
		 * The meta object literal for the '{@link control.impl.LinkBindingImpl <em>Link Binding</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.LinkBindingImpl
		 * @see control.impl.ControlPackageImpl#getLinkBinding()
		 * @generated
		 */
    EClass LINK_BINDING = eINSTANCE.getLinkBinding();

    /**
		 * The meta object literal for the '<em><b>To Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LINK_BINDING__TO_LINK = eINSTANCE.getLinkBinding_ToLink();

    /**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LINK_BINDING__ORIGIN = eINSTANCE.getLinkBinding_Origin();

    /**
		 * The meta object literal for the '{@link control.impl.outputBindingSourceImpl <em>output Binding Source</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.outputBindingSourceImpl
		 * @see control.impl.ControlPackageImpl#getoutputBindingSource()
		 * @generated
		 */
    EClass OUTPUT_BINDING_SOURCE = eINSTANCE.getoutputBindingSource();

    /**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OUTPUT_BINDING_SOURCE__SOURCE = eINSTANCE.getoutputBindingSource_Source();

    /**
		 * The meta object literal for the '<em><b>Specifier Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OUTPUT_BINDING_SOURCE__SPECIFIER_ELEMENT = eINSTANCE.getoutputBindingSource_SpecifierElement();

    /**
		 * The meta object literal for the '{@link control.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.ResultImpl
		 * @see control.impl.ControlPackageImpl#getResult()
		 * @generated
		 */
    EClass RESULT = eINSTANCE.getResult();

    /**
		 * The meta object literal for the '<em><b>In Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RESULT__IN_CONDITION = eINSTANCE.getResult_InCondition();

    /**
		 * The meta object literal for the '<em><b>Has Result Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RESULT__HAS_RESULT_VAR = eINSTANCE.getResult_HasResultVar();

    /**
		 * The meta object literal for the '<em><b>Has Effect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RESULT__HAS_EFFECT = eINSTANCE.getResult_HasEffect();

    /**
		 * The meta object literal for the '<em><b>Binding Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RESULT__BINDING_SOURCE = eINSTANCE.getResult_BindingSource();

    /**
		 * The meta object literal for the '{@link control.impl.ResultVarImpl <em>Result Var</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.ResultVarImpl
		 * @see control.impl.ControlPackageImpl#getResultVar()
		 * @generated
		 */
    EClass RESULT_VAR = eINSTANCE.getResultVar();

    /**
		 * The meta object literal for the '{@link control.impl.LocalImpl <em>Local</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.LocalImpl
		 * @see control.impl.ControlPackageImpl#getLocal()
		 * @generated
		 */
    EClass LOCAL = eINSTANCE.getLocal();

    /**
		 * The meta object literal for the '{@link control.impl.LocImpl <em>Loc</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.LocImpl
		 * @see control.impl.ControlPackageImpl#getLoc()
		 * @generated
		 */
    EClass LOC = eINSTANCE.getLoc();

    /**
		 * The meta object literal for the '{@link control.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.LinkImpl
		 * @see control.impl.ControlPackageImpl#getLink()
		 * @generated
		 */
    EClass LINK = eINSTANCE.getLink();

    /**
		 * The meta object literal for the '<em><b>Has Been Written</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LINK__HAS_BEEN_WRITTEN = eINSTANCE.getLink_HasBeenWritten();

    /**
		 * The meta object literal for the '{@link control.impl.ControlConstructBagImpl <em>Construct Bag</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.ControlConstructBagImpl
		 * @see control.impl.ControlPackageImpl#getControlConstructBag()
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
		 * The meta object literal for the '{@link control.impl.ControlConstructListImpl <em>Construct List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.ControlConstructListImpl
		 * @see control.impl.ControlPackageImpl#getControlConstructList()
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
		 * The meta object literal for the '{@link control.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.ConditionImpl
		 * @see control.impl.ControlPackageImpl#getCondition()
		 * @generated
		 */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
		 * The meta object literal for the '{@link control.impl.ExprImpl <em>Expr</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.impl.ExprImpl
		 * @see control.impl.ControlPackageImpl#getExpr()
		 * @generated
		 */
    EClass EXPR = eINSTANCE.getExpr();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EXPR__NAME = eINSTANCE.getExpr_Name();

    /**
		 * The meta object literal for the '<em><b>Logic Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EXPR__LOGIC_LANGUAGE = eINSTANCE.getExpr_LogicLanguage();

    /**
		 * The meta object literal for the '<em><b>Body Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPR__BODY_LITERAL = eINSTANCE.getExpr_BodyLiteral();

				/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EXPR__VERSION = eINSTANCE.getExpr_Version();

    /**
		 * The meta object literal for the '{@link control.ExpressionLanguage <em>Expression Language</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see control.ExpressionLanguage
		 * @see control.impl.ControlPackageImpl#getExpressionLanguage()
		 * @generated
		 */
    EEnum EXPRESSION_LANGUAGE = eINSTANCE.getExpressionLanguage();

  }

} //ControlPackage
