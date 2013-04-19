/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics.grounding;

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
 * @see net.sf.ictalive.service.semantics.grounding.GroundingFactory
 * @model kind="package"
 * @generated
 */
public interface GroundingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "grounding";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ict-alive.sourceforge.net/services/semantics/grounding";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "grounding";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GroundingPackage eINSTANCE = net.sf.ictalive.service.semantics.grounding.impl.GroundingPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlGroundingImpl <em>Wsdl Grounding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.semantics.grounding.impl.WsdlGroundingImpl
	 * @see net.sf.ictalive.service.semantics.grounding.impl.GroundingPackageImpl#getWsdlGrounding()
	 * @generated
	 */
	int WSDL_GROUNDING = 0;

	/**
	 * The feature id for the '<em><b>Supported By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_GROUNDING__SUPPORTED_BY = SemanticsPackage.SERVICE_GROUNDING__SUPPORTED_BY;

	/**
	 * The feature id for the '<em><b>Process Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_GROUNDING__PROCESS_MODEL = SemanticsPackage.SERVICE_GROUNDING__PROCESS_MODEL;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_GROUNDING__INTERFACE = SemanticsPackage.SERVICE_GROUNDING__INTERFACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_GROUNDING__NAME = SemanticsPackage.SERVICE_GROUNDING__NAME;

	/**
	 * The feature id for the '<em><b>Has Atomic Process Grounding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_GROUNDING__HAS_ATOMIC_PROCESS_GROUNDING = SemanticsPackage.SERVICE_GROUNDING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wsdl Grounding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_GROUNDING_FEATURE_COUNT = SemanticsPackage.SERVICE_GROUNDING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlAtomicProcessGroundingImpl <em>Wsdl Atomic Process Grounding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.semantics.grounding.impl.WsdlAtomicProcessGroundingImpl
	 * @see net.sf.ictalive.service.semantics.grounding.impl.GroundingPackageImpl#getWsdlAtomicProcessGrounding()
	 * @generated
	 */
	int WSDL_ATOMIC_PROCESS_GROUNDING = 1;

	/**
	 * The feature id for the '<em><b>Owls Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_ATOMIC_PROCESS_GROUNDING__OWLS_PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Wsdl Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Wsdl Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT = 2;

	/**
	 * The feature id for the '<em><b>Wsdl Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Wsdl Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Wsdl Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT = 5;

	/**
	 * The feature id for the '<em><b>Wsdl Input Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE = 6;

	/**
	 * The feature id for the '<em><b>Wsdl Output Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE = 7;

	/**
	 * The feature id for the '<em><b>Wsdl Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Wsdl Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION = 9;

	/**
	 * The feature id for the '<em><b>Wsdl Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_DOCUMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_ATOMIC_PROCESS_GROUNDING__NAME = 11;

	/**
	 * The number of structural features of the '<em>Wsdl Atomic Process Grounding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_ATOMIC_PROCESS_GROUNDING_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlOperationRefImpl <em>Wsdl Operation Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.semantics.grounding.impl.WsdlOperationRefImpl
	 * @see net.sf.ictalive.service.semantics.grounding.impl.GroundingPackageImpl#getWsdlOperationRef()
	 * @generated
	 */
	int WSDL_OPERATION_REF = 2;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION_REF__PORT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION_REF__OPERATION = 1;

	/**
	 * The number of structural features of the '<em>Wsdl Operation Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION_REF_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlMessageMapImpl <em>Wsdl Message Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.semantics.grounding.impl.WsdlMessageMapImpl
	 * @see net.sf.ictalive.service.semantics.grounding.impl.GroundingPackageImpl#getWsdlMessageMap()
	 * @generated
	 */
	int WSDL_MESSAGE_MAP = 3;

	/**
	 * The feature id for the '<em><b>Owls Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE_MAP__OWLS_PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Wsdl Message Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART = 1;

	/**
	 * The number of structural features of the '<em>Wsdl Message Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlInputMessageMapImpl <em>Wsdl Input Message Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.semantics.grounding.impl.WsdlInputMessageMapImpl
	 * @see net.sf.ictalive.service.semantics.grounding.impl.GroundingPackageImpl#getWsdlInputMessageMap()
	 * @generated
	 */
	int WSDL_INPUT_MESSAGE_MAP = 4;

	/**
	 * The feature id for the '<em><b>Owls Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INPUT_MESSAGE_MAP__OWLS_PARAMETER = WSDL_MESSAGE_MAP__OWLS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Wsdl Message Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INPUT_MESSAGE_MAP__WSDL_MESSAGE_PART = WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART;

	/**
	 * The number of structural features of the '<em>Wsdl Input Message Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INPUT_MESSAGE_MAP_FEATURE_COUNT = WSDL_MESSAGE_MAP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlOutputMessageMapImpl <em>Wsdl Output Message Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.semantics.grounding.impl.WsdlOutputMessageMapImpl
	 * @see net.sf.ictalive.service.semantics.grounding.impl.GroundingPackageImpl#getWsdlOutputMessageMap()
	 * @generated
	 */
	int WSDL_OUTPUT_MESSAGE_MAP = 5;

	/**
	 * The feature id for the '<em><b>Owls Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OUTPUT_MESSAGE_MAP__OWLS_PARAMETER = WSDL_MESSAGE_MAP__OWLS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Wsdl Message Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OUTPUT_MESSAGE_MAP__WSDL_MESSAGE_PART = WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART;

	/**
	 * The number of structural features of the '<em>Wsdl Output Message Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OUTPUT_MESSAGE_MAP_FEATURE_COUNT = WSDL_MESSAGE_MAP_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.semantics.grounding.WsdlGrounding <em>Wsdl Grounding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsdl Grounding</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlGrounding
	 * @generated
	 */
	EClass getWsdlGrounding();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.semantics.grounding.WsdlGrounding#getHasAtomicProcessGrounding <em>Has Atomic Process Grounding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Atomic Process Grounding</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlGrounding#getHasAtomicProcessGrounding()
	 * @see #getWsdlGrounding()
	 * @generated
	 */
	EReference getWsdlGrounding_HasAtomicProcessGrounding();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding <em>Wsdl Atomic Process Grounding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsdl Atomic Process Grounding</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding
	 * @generated
	 */
	EClass getWsdlAtomicProcessGrounding();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getOwlsProcess <em>Owls Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owls Process</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getOwlsProcess()
	 * @see #getWsdlAtomicProcessGrounding()
	 * @generated
	 */
	EReference getWsdlAtomicProcessGrounding_OwlsProcess();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlOperation <em>Wsdl Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wsdl Operation</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlOperation()
	 * @see #getWsdlAtomicProcessGrounding()
	 * @generated
	 */
	EReference getWsdlAtomicProcessGrounding_WsdlOperation();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlInput <em>Wsdl Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wsdl Input</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlInput()
	 * @see #getWsdlAtomicProcessGrounding()
	 * @generated
	 */
	EReference getWsdlAtomicProcessGrounding_WsdlInput();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlOutput <em>Wsdl Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wsdl Output</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlOutput()
	 * @see #getWsdlAtomicProcessGrounding()
	 * @generated
	 */
	EReference getWsdlAtomicProcessGrounding_WsdlOutput();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlService <em>Wsdl Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wsdl Service</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlService()
	 * @see #getWsdlAtomicProcessGrounding()
	 * @generated
	 */
	EReference getWsdlAtomicProcessGrounding_WsdlService();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlPort <em>Wsdl Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wsdl Port</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlPort()
	 * @see #getWsdlAtomicProcessGrounding()
	 * @generated
	 */
	EReference getWsdlAtomicProcessGrounding_WsdlPort();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlInputMessage <em>Wsdl Input Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wsdl Input Message</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlInputMessage()
	 * @see #getWsdlAtomicProcessGrounding()
	 * @generated
	 */
	EReference getWsdlAtomicProcessGrounding_WsdlInputMessage();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlOutputMessage <em>Wsdl Output Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wsdl Output Message</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlOutputMessage()
	 * @see #getWsdlAtomicProcessGrounding()
	 * @generated
	 */
	EReference getWsdlAtomicProcessGrounding_WsdlOutputMessage();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlReference <em>Wsdl Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl Reference</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlReference()
	 * @see #getWsdlAtomicProcessGrounding()
	 * @generated
	 */
	EAttribute getWsdlAtomicProcessGrounding_WsdlReference();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlVersion <em>Wsdl Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl Version</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlVersion()
	 * @see #getWsdlAtomicProcessGrounding()
	 * @generated
	 */
	EAttribute getWsdlAtomicProcessGrounding_WsdlVersion();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlDocument <em>Wsdl Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl Document</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlDocument()
	 * @see #getWsdlAtomicProcessGrounding()
	 * @generated
	 */
	EAttribute getWsdlAtomicProcessGrounding_WsdlDocument();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getName()
	 * @see #getWsdlAtomicProcessGrounding()
	 * @generated
	 */
	EAttribute getWsdlAtomicProcessGrounding_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.semantics.grounding.WsdlOperationRef <em>Wsdl Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsdl Operation Ref</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlOperationRef
	 * @generated
	 */
	EClass getWsdlOperationRef();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.semantics.grounding.WsdlOperationRef#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Type</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlOperationRef#getPortType()
	 * @see #getWsdlOperationRef()
	 * @generated
	 */
	EReference getWsdlOperationRef_PortType();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.semantics.grounding.WsdlOperationRef#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlOperationRef#getOperation()
	 * @see #getWsdlOperationRef()
	 * @generated
	 */
	EReference getWsdlOperationRef_Operation();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.semantics.grounding.WsdlMessageMap <em>Wsdl Message Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsdl Message Map</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlMessageMap
	 * @generated
	 */
	EClass getWsdlMessageMap();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.semantics.grounding.WsdlMessageMap#getOwlsParameter <em>Owls Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owls Parameter</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlMessageMap#getOwlsParameter()
	 * @see #getWsdlMessageMap()
	 * @generated
	 */
	EReference getWsdlMessageMap_OwlsParameter();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.semantics.grounding.WsdlMessageMap#getWsdlMessagePart <em>Wsdl Message Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wsdl Message Part</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlMessageMap#getWsdlMessagePart()
	 * @see #getWsdlMessageMap()
	 * @generated
	 */
	EReference getWsdlMessageMap_WsdlMessagePart();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.semantics.grounding.WsdlInputMessageMap <em>Wsdl Input Message Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsdl Input Message Map</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlInputMessageMap
	 * @generated
	 */
	EClass getWsdlInputMessageMap();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.semantics.grounding.WsdlOutputMessageMap <em>Wsdl Output Message Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsdl Output Message Map</em>'.
	 * @see net.sf.ictalive.service.semantics.grounding.WsdlOutputMessageMap
	 * @generated
	 */
	EClass getWsdlOutputMessageMap();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GroundingFactory getGroundingFactory();

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
		 * The meta object literal for the '{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlGroundingImpl <em>Wsdl Grounding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.semantics.grounding.impl.WsdlGroundingImpl
		 * @see net.sf.ictalive.service.semantics.grounding.impl.GroundingPackageImpl#getWsdlGrounding()
		 * @generated
		 */
		EClass WSDL_GROUNDING = eINSTANCE.getWsdlGrounding();

		/**
		 * The meta object literal for the '<em><b>Has Atomic Process Grounding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSDL_GROUNDING__HAS_ATOMIC_PROCESS_GROUNDING = eINSTANCE.getWsdlGrounding_HasAtomicProcessGrounding();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlAtomicProcessGroundingImpl <em>Wsdl Atomic Process Grounding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.semantics.grounding.impl.WsdlAtomicProcessGroundingImpl
		 * @see net.sf.ictalive.service.semantics.grounding.impl.GroundingPackageImpl#getWsdlAtomicProcessGrounding()
		 * @generated
		 */
		EClass WSDL_ATOMIC_PROCESS_GROUNDING = eINSTANCE.getWsdlAtomicProcessGrounding();

		/**
		 * The meta object literal for the '<em><b>Owls Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSDL_ATOMIC_PROCESS_GROUNDING__OWLS_PROCESS = eINSTANCE.getWsdlAtomicProcessGrounding_OwlsProcess();

		/**
		 * The meta object literal for the '<em><b>Wsdl Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OPERATION = eINSTANCE.getWsdlAtomicProcessGrounding_WsdlOperation();

		/**
		 * The meta object literal for the '<em><b>Wsdl Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT = eINSTANCE.getWsdlAtomicProcessGrounding_WsdlInput();

		/**
		 * The meta object literal for the '<em><b>Wsdl Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT = eINSTANCE.getWsdlAtomicProcessGrounding_WsdlOutput();

		/**
		 * The meta object literal for the '<em><b>Wsdl Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_SERVICE = eINSTANCE.getWsdlAtomicProcessGrounding_WsdlService();

		/**
		 * The meta object literal for the '<em><b>Wsdl Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_PORT = eINSTANCE.getWsdlAtomicProcessGrounding_WsdlPort();

		/**
		 * The meta object literal for the '<em><b>Wsdl Input Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_INPUT_MESSAGE = eINSTANCE.getWsdlAtomicProcessGrounding_WsdlInputMessage();

		/**
		 * The meta object literal for the '<em><b>Wsdl Output Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_OUTPUT_MESSAGE = eINSTANCE.getWsdlAtomicProcessGrounding_WsdlOutputMessage();

		/**
		 * The meta object literal for the '<em><b>Wsdl Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_REFERENCE = eINSTANCE.getWsdlAtomicProcessGrounding_WsdlReference();

		/**
		 * The meta object literal for the '<em><b>Wsdl Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_VERSION = eINSTANCE.getWsdlAtomicProcessGrounding_WsdlVersion();

		/**
		 * The meta object literal for the '<em><b>Wsdl Document</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_ATOMIC_PROCESS_GROUNDING__WSDL_DOCUMENT = eINSTANCE.getWsdlAtomicProcessGrounding_WsdlDocument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_ATOMIC_PROCESS_GROUNDING__NAME = eINSTANCE.getWsdlAtomicProcessGrounding_Name();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlOperationRefImpl <em>Wsdl Operation Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.semantics.grounding.impl.WsdlOperationRefImpl
		 * @see net.sf.ictalive.service.semantics.grounding.impl.GroundingPackageImpl#getWsdlOperationRef()
		 * @generated
		 */
		EClass WSDL_OPERATION_REF = eINSTANCE.getWsdlOperationRef();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSDL_OPERATION_REF__PORT_TYPE = eINSTANCE.getWsdlOperationRef_PortType();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSDL_OPERATION_REF__OPERATION = eINSTANCE.getWsdlOperationRef_Operation();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlMessageMapImpl <em>Wsdl Message Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.semantics.grounding.impl.WsdlMessageMapImpl
		 * @see net.sf.ictalive.service.semantics.grounding.impl.GroundingPackageImpl#getWsdlMessageMap()
		 * @generated
		 */
		EClass WSDL_MESSAGE_MAP = eINSTANCE.getWsdlMessageMap();

		/**
		 * The meta object literal for the '<em><b>Owls Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSDL_MESSAGE_MAP__OWLS_PARAMETER = eINSTANCE.getWsdlMessageMap_OwlsParameter();

		/**
		 * The meta object literal for the '<em><b>Wsdl Message Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSDL_MESSAGE_MAP__WSDL_MESSAGE_PART = eINSTANCE.getWsdlMessageMap_WsdlMessagePart();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlInputMessageMapImpl <em>Wsdl Input Message Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.semantics.grounding.impl.WsdlInputMessageMapImpl
		 * @see net.sf.ictalive.service.semantics.grounding.impl.GroundingPackageImpl#getWsdlInputMessageMap()
		 * @generated
		 */
		EClass WSDL_INPUT_MESSAGE_MAP = eINSTANCE.getWsdlInputMessageMap();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.semantics.grounding.impl.WsdlOutputMessageMapImpl <em>Wsdl Output Message Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.semantics.grounding.impl.WsdlOutputMessageMapImpl
		 * @see net.sf.ictalive.service.semantics.grounding.impl.GroundingPackageImpl#getWsdlOutputMessageMap()
		 * @generated
		 */
		EClass WSDL_OUTPUT_MESSAGE_MAP = eINSTANCE.getWsdlOutputMessageMap();

	}

} //GroundingPackage
