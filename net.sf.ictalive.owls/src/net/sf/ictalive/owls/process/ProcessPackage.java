/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process;

import net.sf.ictalive.owls.service.ServicePackage;

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
 * @see net.sf.ictalive.owls.process.ProcessFactory
 * @model kind="package"
 * @generated
 */
public interface ProcessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "process";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ict-alive.sourceforge.net/owls/process";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "process";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessPackage eINSTANCE = net.sf.ictalive.owls.process.impl.ProcessPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.ControlConstructImpl <em>Control Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.ControlConstructImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getControlConstruct()
	 * @generated
	 */
	int CONTROL_CONSTRUCT = 5;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT__TIMEOUT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT__ID = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT__VERSION = 2;

	/**
	 * The number of structural features of the '<em>Control Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.AnyOrderImpl <em>Any Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.AnyOrderImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getAnyOrder()
	 * @generated
	 */
	int ANY_ORDER = 0;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ORDER__TIMEOUT = CONTROL_CONSTRUCT__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ORDER__ID = CONTROL_CONSTRUCT__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ORDER__VERSION = CONTROL_CONSTRUCT__VERSION;

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
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.ProcessImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ID = ServicePackage.SERVICE_MODEL__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__VERSION = ServicePackage.SERVICE_MODEL__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = ServicePackage.SERVICE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__HAS_PARAMETER = ServicePackage.SERVICE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__HAS_INPUT = ServicePackage.SERVICE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__HAS_OUTPUT = ServicePackage.SERVICE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has Local</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__HAS_LOCAL = ServicePackage.SERVICE_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Has Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__HAS_RESULT = ServicePackage.SERVICE_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__HAS_CLIENT = ServicePackage.SERVICE_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Has Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__HAS_PARTICIPANT = ServicePackage.SERVICE_MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Performed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PERFORMED_BY = ServicePackage.SERVICE_MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Has Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__HAS_PRECONDITION = ServicePackage.SERVICE_MODEL_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = ServicePackage.SERVICE_MODEL_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.AtomicProcessImpl <em>Atomic Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.AtomicProcessImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getAtomicProcess()
	 * @generated
	 */
	int ATOMIC_PROCESS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__ID = PROCESS__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__VERSION = PROCESS__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Has Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__HAS_PARAMETER = PROCESS__HAS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Has Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__HAS_INPUT = PROCESS__HAS_INPUT;

	/**
	 * The feature id for the '<em><b>Has Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__HAS_OUTPUT = PROCESS__HAS_OUTPUT;

	/**
	 * The feature id for the '<em><b>Has Local</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__HAS_LOCAL = PROCESS__HAS_LOCAL;

	/**
	 * The feature id for the '<em><b>Has Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__HAS_RESULT = PROCESS__HAS_RESULT;

	/**
	 * The feature id for the '<em><b>Has Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__HAS_CLIENT = PROCESS__HAS_CLIENT;

	/**
	 * The feature id for the '<em><b>Has Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__HAS_PARTICIPANT = PROCESS__HAS_PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Performed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__PERFORMED_BY = PROCESS__PERFORMED_BY;

	/**
	 * The feature id for the '<em><b>Has Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__HAS_PRECONDITION = PROCESS__HAS_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__REALIZES = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.BindingImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 2;

	/**
	 * The feature id for the '<em><b>To Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TO_PARAM = 0;

	/**
	 * The feature id for the '<em><b>Value Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__VALUE_SPECIFIER = 1;

	/**
	 * The feature id for the '<em><b>Value Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__VALUE_DATA = 2;

	/**
	 * The feature id for the '<em><b>Value From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__VALUE_FROM = 3;

	/**
	 * The feature id for the '<em><b>Value Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__VALUE_FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Value Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__VALUE_SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__VALUE_TYPE = 6;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.ChoiceImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 3;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__TIMEOUT = CONTROL_CONSTRUCT__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ID = CONTROL_CONSTRUCT__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__VERSION = CONTROL_CONSTRUCT__VERSION;

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
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.CompositeProcessImpl <em>Composite Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.CompositeProcessImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getCompositeProcess()
	 * @generated
	 */
	int COMPOSITE_PROCESS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__ID = PROCESS__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__VERSION = PROCESS__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Has Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__HAS_PARAMETER = PROCESS__HAS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Has Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__HAS_INPUT = PROCESS__HAS_INPUT;

	/**
	 * The feature id for the '<em><b>Has Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__HAS_OUTPUT = PROCESS__HAS_OUTPUT;

	/**
	 * The feature id for the '<em><b>Has Local</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__HAS_LOCAL = PROCESS__HAS_LOCAL;

	/**
	 * The feature id for the '<em><b>Has Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__HAS_RESULT = PROCESS__HAS_RESULT;

	/**
	 * The feature id for the '<em><b>Has Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__HAS_CLIENT = PROCESS__HAS_CLIENT;

	/**
	 * The feature id for the '<em><b>Has Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__HAS_PARTICIPANT = PROCESS__HAS_PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Performed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__PERFORMED_BY = PROCESS__PERFORMED_BY;

	/**
	 * The feature id for the '<em><b>Has Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__HAS_PRECONDITION = PROCESS__HAS_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Collapses To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__COLLAPSES_TO = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__COMPOSED_OF = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invocable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__INVOCABLE = PROCESS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Computed Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__COMPUTED_INPUT = PROCESS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Computed Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__COMPUTED_OUTPUT = PROCESS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Computed Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__COMPUTED_PRECONDITION = PROCESS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Computed Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__COMPUTED_EFFECT = PROCESS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Composite Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.ControlConstructBagImpl <em>Control Construct Bag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.ControlConstructBagImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getControlConstructBag()
	 * @generated
	 */
	int CONTROL_CONSTRUCT_BAG = 6;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_BAG__ID = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_BAG__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Control Construct Bag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_BAG_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.ControlConstructListImpl <em>Control Construct List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.ControlConstructListImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getControlConstructList()
	 * @generated
	 */
	int CONTROL_CONSTRUCT_LIST = 7;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_LIST__ID = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_LIST__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Control Construct List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_LIST_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.IfThenElseImpl <em>If Then Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.IfThenElseImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getIfThenElse()
	 * @generated
	 */
	int IF_THEN_ELSE = 8;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__TIMEOUT = CONTROL_CONSTRUCT__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__ID = CONTROL_CONSTRUCT__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__VERSION = CONTROL_CONSTRUCT__VERSION;

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
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.ParameterImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NS = 4;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.InputImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__PARAMETER_VALUE = PARAMETER__PARAMETER_VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__VERSION = PARAMETER__VERSION;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NS = PARAMETER__NS;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__PARAMETER_TYPE = PARAMETER__PARAMETER_TYPE;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.InputBindingImpl <em>Input Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.InputBindingImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getInputBinding()
	 * @generated
	 */
	int INPUT_BINDING = 10;

	/**
	 * The feature id for the '<em><b>To Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING__TO_PARAM = BINDING__TO_PARAM;

	/**
	 * The feature id for the '<em><b>Value Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING__VALUE_SPECIFIER = BINDING__VALUE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Value Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING__VALUE_DATA = BINDING__VALUE_DATA;

	/**
	 * The feature id for the '<em><b>Value From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING__VALUE_FROM = BINDING__VALUE_FROM;

	/**
	 * The feature id for the '<em><b>Value Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING__VALUE_FUNCTION = BINDING__VALUE_FUNCTION;

	/**
	 * The feature id for the '<em><b>Value Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING__VALUE_SOURCE = BINDING__VALUE_SOURCE;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING__VALUE_TYPE = BINDING__VALUE_TYPE;

	/**
	 * The number of structural features of the '<em>Input Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BINDING_FEATURE_COUNT = BINDING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.IterateImpl <em>Iterate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.IterateImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getIterate()
	 * @generated
	 */
	int ITERATE = 11;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE__TIMEOUT = CONTROL_CONSTRUCT__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE__ID = CONTROL_CONSTRUCT__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE__VERSION = CONTROL_CONSTRUCT__VERSION;

	/**
	 * The number of structural features of the '<em>Iterate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.LocalImpl <em>Local</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.LocalImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getLocal()
	 * @generated
	 */
	int LOCAL = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL__PARAMETER_VALUE = PARAMETER__PARAMETER_VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL__VERSION = PARAMETER__VERSION;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL__NS = PARAMETER__NS;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL__PARAMETER_TYPE = PARAMETER__PARAMETER_TYPE;

	/**
	 * The number of structural features of the '<em>Local</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.OutputImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__PARAMETER_VALUE = PARAMETER__PARAMETER_VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__VERSION = PARAMETER__VERSION;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NS = PARAMETER__NS;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__PARAMETER_TYPE = PARAMETER__PARAMETER_TYPE;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.OutputBindingImpl <em>Output Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.OutputBindingImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getOutputBinding()
	 * @generated
	 */
	int OUTPUT_BINDING = 14;

	/**
	 * The feature id for the '<em><b>To Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__TO_PARAM = BINDING__TO_PARAM;

	/**
	 * The feature id for the '<em><b>Value Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__VALUE_SPECIFIER = BINDING__VALUE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Value Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__VALUE_DATA = BINDING__VALUE_DATA;

	/**
	 * The feature id for the '<em><b>Value From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__VALUE_FROM = BINDING__VALUE_FROM;

	/**
	 * The feature id for the '<em><b>Value Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__VALUE_FUNCTION = BINDING__VALUE_FUNCTION;

	/**
	 * The feature id for the '<em><b>Value Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__VALUE_SOURCE = BINDING__VALUE_SOURCE;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING__VALUE_TYPE = BINDING__VALUE_TYPE;

	/**
	 * The number of structural features of the '<em>Output Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BINDING_FEATURE_COUNT = BINDING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.ParticipantImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__ID = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__NS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.PerformImpl <em>Perform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.PerformImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getPerform()
	 * @generated
	 */
	int PERFORM = 17;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__TIMEOUT = CONTROL_CONSTRUCT__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__ID = CONTROL_CONSTRUCT__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__VERSION = CONTROL_CONSTRUCT__VERSION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__PROCESS = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Data From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__HAS_DATA_FROM = CONTROL_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__NAME = CONTROL_CONSTRUCT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Perform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.ProduceImpl <em>Produce</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.ProduceImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getProduce()
	 * @generated
	 */
	int PRODUCE = 19;

	/**
	 * The feature id for the '<em><b>Produced Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCE__PRODUCED_BINDING = 0;

	/**
	 * The number of structural features of the '<em>Produce</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.RepeatUntilImpl <em>Repeat Until</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.RepeatUntilImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getRepeatUntil()
	 * @generated
	 */
	int REPEAT_UNTIL = 20;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__TIMEOUT = ITERATE__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__ID = ITERATE__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__VERSION = ITERATE__VERSION;

	/**
	 * The feature id for the '<em><b>Until Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__UNTIL_CONDITION = ITERATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Until Process</b></em>' containment reference.
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
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.RepeatWhileImpl <em>Repeat While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.RepeatWhileImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getRepeatWhile()
	 * @generated
	 */
	int REPEAT_WHILE = 21;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_WHILE__TIMEOUT = ITERATE__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_WHILE__ID = ITERATE__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_WHILE__VERSION = ITERATE__VERSION;

	/**
	 * The feature id for the '<em><b>While Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_WHILE__WHILE_CONDITION = ITERATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>While Process</b></em>' containment reference.
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
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.ResultImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Result Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__HAS_RESULT_VAR = 1;

	/**
	 * The feature id for the '<em><b>In Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__IN_CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Has Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__HAS_EFFECT = 3;

	/**
	 * The feature id for the '<em><b>With Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__WITH_OUTPUT = 4;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.ResultVarImpl <em>Result Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.ResultVarImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getResultVar()
	 * @generated
	 */
	int RESULT_VAR = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VAR__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VAR__PARAMETER_VALUE = PARAMETER__PARAMETER_VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VAR__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VAR__VERSION = PARAMETER__VERSION;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VAR__NS = PARAMETER__NS;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VAR__PARAMETER_TYPE = PARAMETER__PARAMETER_TYPE;

	/**
	 * The number of structural features of the '<em>Result Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VAR_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.SequenceImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 24;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__TIMEOUT = CONTROL_CONSTRUCT__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ID = CONTROL_CONSTRUCT__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__VERSION = CONTROL_CONSTRUCT__VERSION;

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
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.SimpleProcessImpl <em>Simple Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.SimpleProcessImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getSimpleProcess()
	 * @generated
	 */
	int SIMPLE_PROCESS = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROCESS__ID = PROCESS__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROCESS__VERSION = PROCESS__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROCESS__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Has Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROCESS__HAS_PARAMETER = PROCESS__HAS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Has Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROCESS__HAS_INPUT = PROCESS__HAS_INPUT;

	/**
	 * The feature id for the '<em><b>Has Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROCESS__HAS_OUTPUT = PROCESS__HAS_OUTPUT;

	/**
	 * The feature id for the '<em><b>Has Local</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROCESS__HAS_LOCAL = PROCESS__HAS_LOCAL;

	/**
	 * The feature id for the '<em><b>Has Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROCESS__HAS_RESULT = PROCESS__HAS_RESULT;

	/**
	 * The feature id for the '<em><b>Has Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROCESS__HAS_CLIENT = PROCESS__HAS_CLIENT;

	/**
	 * The feature id for the '<em><b>Has Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROCESS__HAS_PARTICIPANT = PROCESS__HAS_PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Performed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROCESS__PERFORMED_BY = PROCESS__PERFORMED_BY;

	/**
	 * The feature id for the '<em><b>Has Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROCESS__HAS_PRECONDITION = PROCESS__HAS_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Realized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROCESS__REALIZED_BY = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expands To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROCESS__EXPANDS_TO = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROCESS_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.SplitImpl <em>Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.SplitImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getSplit()
	 * @generated
	 */
	int SPLIT = 26;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__TIMEOUT = CONTROL_CONSTRUCT__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__ID = CONTROL_CONSTRUCT__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__VERSION = CONTROL_CONSTRUCT__VERSION;

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
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.SplitJoinImpl <em>Split Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.SplitJoinImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getSplitJoin()
	 * @generated
	 */
	int SPLIT_JOIN = 27;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_JOIN__TIMEOUT = CONTROL_CONSTRUCT__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_JOIN__ID = CONTROL_CONSTRUCT__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_JOIN__VERSION = CONTROL_CONSTRUCT__VERSION;

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
	 * The meta object id for the '{@link net.sf.ictalive.owls.process.impl.ValueOfImpl <em>Value Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.process.impl.ValueOfImpl
	 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getValueOf()
	 * @generated
	 */
	int VALUE_OF = 28;

	/**
	 * The feature id for the '<em><b>The Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OF__THE_VAR = 0;

	/**
	 * The feature id for the '<em><b>From Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OF__FROM_PROCESS = 1;

	/**
	 * The number of structural features of the '<em>Value Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OF_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.AnyOrder <em>Any Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Order</em>'.
	 * @see net.sf.ictalive.owls.process.AnyOrder
	 * @generated
	 */
	EClass getAnyOrder();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.process.AnyOrder#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see net.sf.ictalive.owls.process.AnyOrder#getComponents()
	 * @see #getAnyOrder()
	 * @generated
	 */
	EReference getAnyOrder_Components();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.AtomicProcess <em>Atomic Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Process</em>'.
	 * @see net.sf.ictalive.owls.process.AtomicProcess
	 * @generated
	 */
	EClass getAtomicProcess();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.process.AtomicProcess#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see net.sf.ictalive.owls.process.AtomicProcess#getRealizes()
	 * @see #getAtomicProcess()
	 * @generated
	 */
	EReference getAtomicProcess_Realizes();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see net.sf.ictalive.owls.process.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.process.Binding#getToParam <em>To Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Param</em>'.
	 * @see net.sf.ictalive.owls.process.Binding#getToParam()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_ToParam();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.process.Binding#getValueSpecifier <em>Value Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Specifier</em>'.
	 * @see net.sf.ictalive.owls.process.Binding#getValueSpecifier()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_ValueSpecifier();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.process.Binding#getValueData <em>Value Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Data</em>'.
	 * @see net.sf.ictalive.owls.process.Binding#getValueData()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_ValueData();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.process.Binding#getValueFrom <em>Value From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value From</em>'.
	 * @see net.sf.ictalive.owls.process.Binding#getValueFrom()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_ValueFrom();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.process.Binding#getValueFunction <em>Value Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Function</em>'.
	 * @see net.sf.ictalive.owls.process.Binding#getValueFunction()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_ValueFunction();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.process.Binding#getValueSource <em>Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Source</em>'.
	 * @see net.sf.ictalive.owls.process.Binding#getValueSource()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_ValueSource();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.process.Binding#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see net.sf.ictalive.owls.process.Binding#getValueType()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_ValueType();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see net.sf.ictalive.owls.process.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.process.Choice#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see net.sf.ictalive.owls.process.Choice#getComponents()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Components();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.CompositeProcess <em>Composite Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Process</em>'.
	 * @see net.sf.ictalive.owls.process.CompositeProcess
	 * @generated
	 */
	EClass getCompositeProcess();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.process.CompositeProcess#getCollapsesTo <em>Collapses To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Collapses To</em>'.
	 * @see net.sf.ictalive.owls.process.CompositeProcess#getCollapsesTo()
	 * @see #getCompositeProcess()
	 * @generated
	 */
	EReference getCompositeProcess_CollapsesTo();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.process.CompositeProcess#getComposedOf <em>Composed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composed Of</em>'.
	 * @see net.sf.ictalive.owls.process.CompositeProcess#getComposedOf()
	 * @see #getCompositeProcess()
	 * @generated
	 */
	EReference getCompositeProcess_ComposedOf();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.process.CompositeProcess#isInvocable <em>Invocable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invocable</em>'.
	 * @see net.sf.ictalive.owls.process.CompositeProcess#isInvocable()
	 * @see #getCompositeProcess()
	 * @generated
	 */
	EAttribute getCompositeProcess_Invocable();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.process.CompositeProcess#getComputedInput <em>Computed Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Computed Input</em>'.
	 * @see net.sf.ictalive.owls.process.CompositeProcess#getComputedInput()
	 * @see #getCompositeProcess()
	 * @generated
	 */
	EReference getCompositeProcess_ComputedInput();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.process.CompositeProcess#getComputedOutput <em>Computed Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Computed Output</em>'.
	 * @see net.sf.ictalive.owls.process.CompositeProcess#getComputedOutput()
	 * @see #getCompositeProcess()
	 * @generated
	 */
	EReference getCompositeProcess_ComputedOutput();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.process.CompositeProcess#getComputedPrecondition <em>Computed Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Computed Precondition</em>'.
	 * @see net.sf.ictalive.owls.process.CompositeProcess#getComputedPrecondition()
	 * @see #getCompositeProcess()
	 * @generated
	 */
	EReference getCompositeProcess_ComputedPrecondition();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.process.CompositeProcess#getComputedEffect <em>Computed Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Computed Effect</em>'.
	 * @see net.sf.ictalive.owls.process.CompositeProcess#getComputedEffect()
	 * @see #getCompositeProcess()
	 * @generated
	 */
	EReference getCompositeProcess_ComputedEffect();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.ControlConstruct <em>Control Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Construct</em>'.
	 * @see net.sf.ictalive.owls.process.ControlConstruct
	 * @generated
	 */
	EClass getControlConstruct();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.process.ControlConstruct#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timeout</em>'.
	 * @see net.sf.ictalive.owls.process.ControlConstruct#getTimeout()
	 * @see #getControlConstruct()
	 * @generated
	 */
	EReference getControlConstruct_Timeout();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.process.ControlConstruct#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.ictalive.owls.process.ControlConstruct#getId()
	 * @see #getControlConstruct()
	 * @generated
	 */
	EAttribute getControlConstruct_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.process.ControlConstruct#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.ictalive.owls.process.ControlConstruct#getVersion()
	 * @see #getControlConstruct()
	 * @generated
	 */
	EAttribute getControlConstruct_Version();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.ControlConstructBag <em>Control Construct Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Construct Bag</em>'.
	 * @see net.sf.ictalive.owls.process.ControlConstructBag
	 * @generated
	 */
	EClass getControlConstructBag();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.process.ControlConstructBag#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see net.sf.ictalive.owls.process.ControlConstructBag#getFirst()
	 * @see #getControlConstructBag()
	 * @generated
	 */
	EReference getControlConstructBag_First();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.process.ControlConstructBag#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rest</em>'.
	 * @see net.sf.ictalive.owls.process.ControlConstructBag#getRest()
	 * @see #getControlConstructBag()
	 * @generated
	 */
	EReference getControlConstructBag_Rest();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.process.ControlConstructBag#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.ictalive.owls.process.ControlConstructBag#getId()
	 * @see #getControlConstructBag()
	 * @generated
	 */
	EAttribute getControlConstructBag_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.process.ControlConstructBag#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.ictalive.owls.process.ControlConstructBag#getVersion()
	 * @see #getControlConstructBag()
	 * @generated
	 */
	EAttribute getControlConstructBag_Version();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.ControlConstructList <em>Control Construct List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Construct List</em>'.
	 * @see net.sf.ictalive.owls.process.ControlConstructList
	 * @generated
	 */
	EClass getControlConstructList();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.process.ControlConstructList#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see net.sf.ictalive.owls.process.ControlConstructList#getFirst()
	 * @see #getControlConstructList()
	 * @generated
	 */
	EReference getControlConstructList_First();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.process.ControlConstructList#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rest</em>'.
	 * @see net.sf.ictalive.owls.process.ControlConstructList#getRest()
	 * @see #getControlConstructList()
	 * @generated
	 */
	EReference getControlConstructList_Rest();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.process.ControlConstructList#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.ictalive.owls.process.ControlConstructList#getId()
	 * @see #getControlConstructList()
	 * @generated
	 */
	EAttribute getControlConstructList_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.process.ControlConstructList#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.ictalive.owls.process.ControlConstructList#getVersion()
	 * @see #getControlConstructList()
	 * @generated
	 */
	EAttribute getControlConstructList_Version();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.IfThenElse <em>If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Then Else</em>'.
	 * @see net.sf.ictalive.owls.process.IfThenElse
	 * @generated
	 */
	EClass getIfThenElse();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.process.IfThenElse#getIfCondition <em>If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Condition</em>'.
	 * @see net.sf.ictalive.owls.process.IfThenElse#getIfCondition()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_IfCondition();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.process.IfThenElse#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see net.sf.ictalive.owls.process.IfThenElse#getThen()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_Then();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.process.IfThenElse#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see net.sf.ictalive.owls.process.IfThenElse#getElse()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_Else();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see net.sf.ictalive.owls.process.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.InputBinding <em>Input Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Binding</em>'.
	 * @see net.sf.ictalive.owls.process.InputBinding
	 * @generated
	 */
	EClass getInputBinding();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.Iterate <em>Iterate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterate</em>'.
	 * @see net.sf.ictalive.owls.process.Iterate
	 * @generated
	 */
	EClass getIterate();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.Local <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local</em>'.
	 * @see net.sf.ictalive.owls.process.Local
	 * @generated
	 */
	EClass getLocal();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see net.sf.ictalive.owls.process.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.OutputBinding <em>Output Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Binding</em>'.
	 * @see net.sf.ictalive.owls.process.OutputBinding
	 * @generated
	 */
	EClass getOutputBinding();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see net.sf.ictalive.owls.process.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.process.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.owls.process.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.process.Parameter#getParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Value</em>'.
	 * @see net.sf.ictalive.owls.process.Parameter#getParameterValue()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ParameterValue();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.process.Parameter#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.ictalive.owls.process.Parameter#getId()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.process.Parameter#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.ictalive.owls.process.Parameter#getVersion()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Version();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.process.Parameter#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see net.sf.ictalive.owls.process.Parameter#getNs()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Ns();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.owls.process.Parameter#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter Type</em>'.
	 * @see net.sf.ictalive.owls.process.Parameter#getParameterType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ParameterType();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see net.sf.ictalive.owls.process.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.process.Participant#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.ictalive.owls.process.Participant#getId()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.process.Participant#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.ictalive.owls.process.Participant#getVersion()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Version();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.process.Participant#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see net.sf.ictalive.owls.process.Participant#getNs()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Ns();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.process.Participant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.owls.process.Participant#getName()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.Perform <em>Perform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perform</em>'.
	 * @see net.sf.ictalive.owls.process.Perform
	 * @generated
	 */
	EClass getPerform();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.process.Perform#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see net.sf.ictalive.owls.process.Perform#getProcess()
	 * @see #getPerform()
	 * @generated
	 */
	EReference getPerform_Process();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.owls.process.Perform#getHasDataFrom <em>Has Data From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Data From</em>'.
	 * @see net.sf.ictalive.owls.process.Perform#getHasDataFrom()
	 * @see #getPerform()
	 * @generated
	 */
	EReference getPerform_HasDataFrom();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.process.Perform#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.owls.process.Perform#getName()
	 * @see #getPerform()
	 * @generated
	 */
	EAttribute getPerform_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see net.sf.ictalive.owls.process.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.process.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.owls.process.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.owls.process.Process#getHasParameter <em>Has Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Parameter</em>'.
	 * @see net.sf.ictalive.owls.process.Process#getHasParameter()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_HasParameter();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.owls.process.Process#getHasInput <em>Has Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Input</em>'.
	 * @see net.sf.ictalive.owls.process.Process#getHasInput()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_HasInput();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.owls.process.Process#getHasOutput <em>Has Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Output</em>'.
	 * @see net.sf.ictalive.owls.process.Process#getHasOutput()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_HasOutput();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.owls.process.Process#getHasLocal <em>Has Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Local</em>'.
	 * @see net.sf.ictalive.owls.process.Process#getHasLocal()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_HasLocal();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.owls.process.Process#getHasResult <em>Has Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Result</em>'.
	 * @see net.sf.ictalive.owls.process.Process#getHasResult()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_HasResult();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.process.Process#getHasClient <em>Has Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Client</em>'.
	 * @see net.sf.ictalive.owls.process.Process#getHasClient()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_HasClient();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.process.Process#getHasParticipant <em>Has Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Participant</em>'.
	 * @see net.sf.ictalive.owls.process.Process#getHasParticipant()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_HasParticipant();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.process.Process#getPerformedBy <em>Performed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Performed By</em>'.
	 * @see net.sf.ictalive.owls.process.Process#getPerformedBy()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_PerformedBy();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.process.Process#getHasPrecondition <em>Has Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Precondition</em>'.
	 * @see net.sf.ictalive.owls.process.Process#getHasPrecondition()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_HasPrecondition();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.Produce <em>Produce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Produce</em>'.
	 * @see net.sf.ictalive.owls.process.Produce
	 * @generated
	 */
	EClass getProduce();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.process.Produce#getProducedBinding <em>Produced Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Produced Binding</em>'.
	 * @see net.sf.ictalive.owls.process.Produce#getProducedBinding()
	 * @see #getProduce()
	 * @generated
	 */
	EReference getProduce_ProducedBinding();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.RepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Until</em>'.
	 * @see net.sf.ictalive.owls.process.RepeatUntil
	 * @generated
	 */
	EClass getRepeatUntil();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.process.RepeatUntil#getUntilCondition <em>Until Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Until Condition</em>'.
	 * @see net.sf.ictalive.owls.process.RepeatUntil#getUntilCondition()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_UntilCondition();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.process.RepeatUntil#getUntilProcess <em>Until Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Until Process</em>'.
	 * @see net.sf.ictalive.owls.process.RepeatUntil#getUntilProcess()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_UntilProcess();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.RepeatWhile <em>Repeat While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat While</em>'.
	 * @see net.sf.ictalive.owls.process.RepeatWhile
	 * @generated
	 */
	EClass getRepeatWhile();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.process.RepeatWhile#getWhileCondition <em>While Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While Condition</em>'.
	 * @see net.sf.ictalive.owls.process.RepeatWhile#getWhileCondition()
	 * @see #getRepeatWhile()
	 * @generated
	 */
	EReference getRepeatWhile_WhileCondition();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.process.RepeatWhile#getWhileProcess <em>While Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While Process</em>'.
	 * @see net.sf.ictalive.owls.process.RepeatWhile#getWhileProcess()
	 * @see #getRepeatWhile()
	 * @generated
	 */
	EReference getRepeatWhile_WhileProcess();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see net.sf.ictalive.owls.process.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.owls.process.Result#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.owls.process.Result#getName()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.owls.process.Result#getHasResultVar <em>Has Result Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Result Var</em>'.
	 * @see net.sf.ictalive.owls.process.Result#getHasResultVar()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_HasResultVar();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.process.Result#getInCondition <em>In Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Condition</em>'.
	 * @see net.sf.ictalive.owls.process.Result#getInCondition()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_InCondition();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.process.Result#getHasEffect <em>Has Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Effect</em>'.
	 * @see net.sf.ictalive.owls.process.Result#getHasEffect()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_HasEffect();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.process.Result#getWithOutput <em>With Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>With Output</em>'.
	 * @see net.sf.ictalive.owls.process.Result#getWithOutput()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_WithOutput();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.ResultVar <em>Result Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Var</em>'.
	 * @see net.sf.ictalive.owls.process.ResultVar
	 * @generated
	 */
	EClass getResultVar();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see net.sf.ictalive.owls.process.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.process.Sequence#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see net.sf.ictalive.owls.process.Sequence#getComponents()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Components();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.SimpleProcess <em>Simple Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Process</em>'.
	 * @see net.sf.ictalive.owls.process.SimpleProcess
	 * @generated
	 */
	EClass getSimpleProcess();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.process.SimpleProcess#getRealizedBy <em>Realized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realized By</em>'.
	 * @see net.sf.ictalive.owls.process.SimpleProcess#getRealizedBy()
	 * @see #getSimpleProcess()
	 * @generated
	 */
	EReference getSimpleProcess_RealizedBy();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.process.SimpleProcess#getExpandsTo <em>Expands To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expands To</em>'.
	 * @see net.sf.ictalive.owls.process.SimpleProcess#getExpandsTo()
	 * @see #getSimpleProcess()
	 * @generated
	 */
	EReference getSimpleProcess_ExpandsTo();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split</em>'.
	 * @see net.sf.ictalive.owls.process.Split
	 * @generated
	 */
	EClass getSplit();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.process.Split#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see net.sf.ictalive.owls.process.Split#getComponents()
	 * @see #getSplit()
	 * @generated
	 */
	EReference getSplit_Components();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.SplitJoin <em>Split Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Join</em>'.
	 * @see net.sf.ictalive.owls.process.SplitJoin
	 * @generated
	 */
	EClass getSplitJoin();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.owls.process.SplitJoin#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see net.sf.ictalive.owls.process.SplitJoin#getComponents()
	 * @see #getSplitJoin()
	 * @generated
	 */
	EReference getSplitJoin_Components();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.process.ValueOf <em>Value Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Of</em>'.
	 * @see net.sf.ictalive.owls.process.ValueOf
	 * @generated
	 */
	EClass getValueOf();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.process.ValueOf#getTheVar <em>The Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Var</em>'.
	 * @see net.sf.ictalive.owls.process.ValueOf#getTheVar()
	 * @see #getValueOf()
	 * @generated
	 */
	EReference getValueOf_TheVar();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.owls.process.ValueOf#getFromProcess <em>From Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Process</em>'.
	 * @see net.sf.ictalive.owls.process.ValueOf#getFromProcess()
	 * @see #getValueOf()
	 * @generated
	 */
	EReference getValueOf_FromProcess();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProcessFactory getProcessFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.AnyOrderImpl <em>Any Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.AnyOrderImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getAnyOrder()
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
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.AtomicProcessImpl <em>Atomic Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.AtomicProcessImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getAtomicProcess()
		 * @generated
		 */
		EClass ATOMIC_PROCESS = eINSTANCE.getAtomicProcess();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_PROCESS__REALIZES = eINSTANCE.getAtomicProcess_Realizes();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.BindingImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>To Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__TO_PARAM = eINSTANCE.getBinding_ToParam();

		/**
		 * The meta object literal for the '<em><b>Value Specifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__VALUE_SPECIFIER = eINSTANCE.getBinding_ValueSpecifier();

		/**
		 * The meta object literal for the '<em><b>Value Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__VALUE_DATA = eINSTANCE.getBinding_ValueData();

		/**
		 * The meta object literal for the '<em><b>Value From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__VALUE_FROM = eINSTANCE.getBinding_ValueFrom();

		/**
		 * The meta object literal for the '<em><b>Value Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__VALUE_FUNCTION = eINSTANCE.getBinding_ValueFunction();

		/**
		 * The meta object literal for the '<em><b>Value Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__VALUE_SOURCE = eINSTANCE.getBinding_ValueSource();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__VALUE_TYPE = eINSTANCE.getBinding_ValueType();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.ChoiceImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getChoice()
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
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.CompositeProcessImpl <em>Composite Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.CompositeProcessImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getCompositeProcess()
		 * @generated
		 */
		EClass COMPOSITE_PROCESS = eINSTANCE.getCompositeProcess();

		/**
		 * The meta object literal for the '<em><b>Collapses To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_PROCESS__COLLAPSES_TO = eINSTANCE.getCompositeProcess_CollapsesTo();

		/**
		 * The meta object literal for the '<em><b>Composed Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_PROCESS__COMPOSED_OF = eINSTANCE.getCompositeProcess_ComposedOf();

		/**
		 * The meta object literal for the '<em><b>Invocable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_PROCESS__INVOCABLE = eINSTANCE.getCompositeProcess_Invocable();

		/**
		 * The meta object literal for the '<em><b>Computed Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_PROCESS__COMPUTED_INPUT = eINSTANCE.getCompositeProcess_ComputedInput();

		/**
		 * The meta object literal for the '<em><b>Computed Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_PROCESS__COMPUTED_OUTPUT = eINSTANCE.getCompositeProcess_ComputedOutput();

		/**
		 * The meta object literal for the '<em><b>Computed Precondition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_PROCESS__COMPUTED_PRECONDITION = eINSTANCE.getCompositeProcess_ComputedPrecondition();

		/**
		 * The meta object literal for the '<em><b>Computed Effect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_PROCESS__COMPUTED_EFFECT = eINSTANCE.getCompositeProcess_ComputedEffect();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.ControlConstructImpl <em>Control Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.ControlConstructImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getControlConstruct()
		 * @generated
		 */
		EClass CONTROL_CONSTRUCT = eINSTANCE.getControlConstruct();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_CONSTRUCT__TIMEOUT = eINSTANCE.getControlConstruct_Timeout();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_CONSTRUCT__ID = eINSTANCE.getControlConstruct_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_CONSTRUCT__VERSION = eINSTANCE.getControlConstruct_Version();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.ControlConstructBagImpl <em>Control Construct Bag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.ControlConstructBagImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getControlConstructBag()
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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_CONSTRUCT_BAG__ID = eINSTANCE.getControlConstructBag_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_CONSTRUCT_BAG__VERSION = eINSTANCE.getControlConstructBag_Version();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.ControlConstructListImpl <em>Control Construct List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.ControlConstructListImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getControlConstructList()
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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_CONSTRUCT_LIST__ID = eINSTANCE.getControlConstructList_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_CONSTRUCT_LIST__VERSION = eINSTANCE.getControlConstructList_Version();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.IfThenElseImpl <em>If Then Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.IfThenElseImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getIfThenElse()
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
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.InputImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.InputBindingImpl <em>Input Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.InputBindingImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getInputBinding()
		 * @generated
		 */
		EClass INPUT_BINDING = eINSTANCE.getInputBinding();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.IterateImpl <em>Iterate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.IterateImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getIterate()
		 * @generated
		 */
		EClass ITERATE = eINSTANCE.getIterate();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.LocalImpl <em>Local</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.LocalImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getLocal()
		 * @generated
		 */
		EClass LOCAL = eINSTANCE.getLocal();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.OutputImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.OutputBindingImpl <em>Output Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.OutputBindingImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getOutputBinding()
		 * @generated
		 */
		EClass OUTPUT_BINDING = eINSTANCE.getOutputBinding();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.ParameterImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PARAMETER_VALUE = eINSTANCE.getParameter_ParameterValue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ID = eINSTANCE.getParameter_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VERSION = eINSTANCE.getParameter_Version();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NS = eINSTANCE.getParameter_Ns();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PARAMETER_TYPE = eINSTANCE.getParameter_ParameterType();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.ParticipantImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__ID = eINSTANCE.getParticipant_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__VERSION = eINSTANCE.getParticipant_Version();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__NS = eINSTANCE.getParticipant_Ns();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__NAME = eINSTANCE.getParticipant_Name();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.PerformImpl <em>Perform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.PerformImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getPerform()
		 * @generated
		 */
		EClass PERFORM = eINSTANCE.getPerform();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM__PROCESS = eINSTANCE.getPerform_Process();

		/**
		 * The meta object literal for the '<em><b>Has Data From</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM__HAS_DATA_FROM = eINSTANCE.getPerform_HasDataFrom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORM__NAME = eINSTANCE.getPerform_Name();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.ProcessImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Has Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__HAS_PARAMETER = eINSTANCE.getProcess_HasParameter();

		/**
		 * The meta object literal for the '<em><b>Has Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__HAS_INPUT = eINSTANCE.getProcess_HasInput();

		/**
		 * The meta object literal for the '<em><b>Has Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__HAS_OUTPUT = eINSTANCE.getProcess_HasOutput();

		/**
		 * The meta object literal for the '<em><b>Has Local</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__HAS_LOCAL = eINSTANCE.getProcess_HasLocal();

		/**
		 * The meta object literal for the '<em><b>Has Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__HAS_RESULT = eINSTANCE.getProcess_HasResult();

		/**
		 * The meta object literal for the '<em><b>Has Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__HAS_CLIENT = eINSTANCE.getProcess_HasClient();

		/**
		 * The meta object literal for the '<em><b>Has Participant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__HAS_PARTICIPANT = eINSTANCE.getProcess_HasParticipant();

		/**
		 * The meta object literal for the '<em><b>Performed By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PERFORMED_BY = eINSTANCE.getProcess_PerformedBy();

		/**
		 * The meta object literal for the '<em><b>Has Precondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__HAS_PRECONDITION = eINSTANCE.getProcess_HasPrecondition();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.ProduceImpl <em>Produce</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.ProduceImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getProduce()
		 * @generated
		 */
		EClass PRODUCE = eINSTANCE.getProduce();

		/**
		 * The meta object literal for the '<em><b>Produced Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCE__PRODUCED_BINDING = eINSTANCE.getProduce_ProducedBinding();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.RepeatUntilImpl <em>Repeat Until</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.RepeatUntilImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getRepeatUntil()
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
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.RepeatWhileImpl <em>Repeat While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.RepeatWhileImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getRepeatWhile()
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
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.ResultImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__NAME = eINSTANCE.getResult_Name();

		/**
		 * The meta object literal for the '<em><b>Has Result Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__HAS_RESULT_VAR = eINSTANCE.getResult_HasResultVar();

		/**
		 * The meta object literal for the '<em><b>In Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__IN_CONDITION = eINSTANCE.getResult_InCondition();

		/**
		 * The meta object literal for the '<em><b>Has Effect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__HAS_EFFECT = eINSTANCE.getResult_HasEffect();

		/**
		 * The meta object literal for the '<em><b>With Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__WITH_OUTPUT = eINSTANCE.getResult_WithOutput();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.ResultVarImpl <em>Result Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.ResultVarImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getResultVar()
		 * @generated
		 */
		EClass RESULT_VAR = eINSTANCE.getResultVar();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.SequenceImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getSequence()
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
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.SimpleProcessImpl <em>Simple Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.SimpleProcessImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getSimpleProcess()
		 * @generated
		 */
		EClass SIMPLE_PROCESS = eINSTANCE.getSimpleProcess();

		/**
		 * The meta object literal for the '<em><b>Realized By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PROCESS__REALIZED_BY = eINSTANCE.getSimpleProcess_RealizedBy();

		/**
		 * The meta object literal for the '<em><b>Expands To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PROCESS__EXPANDS_TO = eINSTANCE.getSimpleProcess_ExpandsTo();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.SplitImpl <em>Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.SplitImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getSplit()
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
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.SplitJoinImpl <em>Split Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.SplitJoinImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getSplitJoin()
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
		 * The meta object literal for the '{@link net.sf.ictalive.owls.process.impl.ValueOfImpl <em>Value Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.process.impl.ValueOfImpl
		 * @see net.sf.ictalive.owls.process.impl.ProcessPackageImpl#getValueOf()
		 * @generated
		 */
		EClass VALUE_OF = eINSTANCE.getValueOf();

		/**
		 * The meta object literal for the '<em><b>The Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_OF__THE_VAR = eINSTANCE.getValueOf_TheVar();

		/**
		 * The meta object literal for the '<em><b>From Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_OF__FROM_PROCESS = eINSTANCE.getValueOf_FromProcess();

	}

} //ProcessPackage
