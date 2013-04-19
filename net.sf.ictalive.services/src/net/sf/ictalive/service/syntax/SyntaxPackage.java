/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.syntax;

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
 * @see net.sf.ictalive.service.syntax.SyntaxFactory
 * @model kind="package"
 * @generated
 */
public interface SyntaxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "syntax";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ict-alive.sourceforge.net/services/syntax";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "syntax";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SyntaxPackage eINSTANCE = net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.syntax.impl.InterfaceDescriptionImpl <em>Interface Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.syntax.impl.InterfaceDescriptionImpl
	 * @see net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl#getInterfaceDescription()
	 * @generated
	 */
	int INTERFACE_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESCRIPTION__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESCRIPTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESCRIPTION__BINDING = 2;

	/**
	 * The feature id for the '<em><b>In Line Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESCRIPTION__IN_LINE_SCHEMA = 3;

	/**
	 * The feature id for the '<em><b>Out Line Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESCRIPTION__OUT_LINE_SCHEMA = 4;

	/**
	 * The number of structural features of the '<em>Interface Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESCRIPTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.syntax.impl.OperationDescriptionImpl <em>Operation Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.syntax.impl.OperationDescriptionImpl
	 * @see net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl#getOperationDescription()
	 * @generated
	 */
	int OPERATION_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DESCRIPTION__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DESCRIPTION__FAULT = 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DESCRIPTION__OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DESCRIPTION__NAME = 3;

	/**
	 * The number of structural features of the '<em>Operation Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DESCRIPTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.syntax.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.syntax.impl.MessageImpl
	 * @see net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PART = 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.syntax.impl.EndpointImpl <em>Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.syntax.impl.EndpointImpl
	 * @see net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl#getEndpoint()
	 * @generated
	 */
	int ENDPOINT = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__BINDING = 0;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__IMPLEMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Deployed Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__DEPLOYED_SERVICE = 4;

	/**
	 * The number of structural features of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.syntax.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.syntax.impl.BindingImpl
	 * @see net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Transport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TRANSPORT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__STYLE = 3;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.syntax.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.syntax.impl.PartImpl
	 * @see net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl#getPart()
	 * @generated
	 */
	int PART = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Xsd Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__XSD_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Xsd Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__XSD_ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.syntax.StyleEncoding <em>Style Encoding</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.syntax.StyleEncoding
	 * @see net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl#getStyleEncoding()
	 * @generated
	 */
	int STYLE_ENCODING = 6;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.service.syntax.TransportProtocol <em>Transport Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.service.syntax.TransportProtocol
	 * @see net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl#getTransportProtocol()
	 * @generated
	 */
	int TRANSPORT_PROTOCOL = 7;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.syntax.InterfaceDescription <em>Interface Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Description</em>'.
	 * @see net.sf.ictalive.service.syntax.InterfaceDescription
	 * @generated
	 */
	EClass getInterfaceDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.syntax.InterfaceDescription#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see net.sf.ictalive.service.syntax.InterfaceDescription#getOperation()
	 * @see #getInterfaceDescription()
	 * @generated
	 */
	EReference getInterfaceDescription_Operation();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.syntax.InterfaceDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.service.syntax.InterfaceDescription#getName()
	 * @see #getInterfaceDescription()
	 * @generated
	 */
	EAttribute getInterfaceDescription_Name();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.service.syntax.InterfaceDescription#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Binding</em>'.
	 * @see net.sf.ictalive.service.syntax.InterfaceDescription#getBinding()
	 * @see #getInterfaceDescription()
	 * @generated
	 */
	EReference getInterfaceDescription_Binding();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.syntax.InterfaceDescription#getInLineSchema <em>In Line Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Line Schema</em>'.
	 * @see net.sf.ictalive.service.syntax.InterfaceDescription#getInLineSchema()
	 * @see #getInterfaceDescription()
	 * @generated
	 */
	EReference getInterfaceDescription_InLineSchema();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.service.syntax.InterfaceDescription#getOutLineSchema <em>Out Line Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Line Schema</em>'.
	 * @see net.sf.ictalive.service.syntax.InterfaceDescription#getOutLineSchema()
	 * @see #getInterfaceDescription()
	 * @generated
	 */
	EReference getInterfaceDescription_OutLineSchema();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.syntax.OperationDescription <em>Operation Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Description</em>'.
	 * @see net.sf.ictalive.service.syntax.OperationDescription
	 * @generated
	 */
	EClass getOperationDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.syntax.OperationDescription#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see net.sf.ictalive.service.syntax.OperationDescription#getInput()
	 * @see #getOperationDescription()
	 * @generated
	 */
	EReference getOperationDescription_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.syntax.OperationDescription#getFault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fault</em>'.
	 * @see net.sf.ictalive.service.syntax.OperationDescription#getFault()
	 * @see #getOperationDescription()
	 * @generated
	 */
	EReference getOperationDescription_Fault();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.syntax.OperationDescription#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see net.sf.ictalive.service.syntax.OperationDescription#getOutput()
	 * @see #getOperationDescription()
	 * @generated
	 */
	EReference getOperationDescription_Output();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.syntax.OperationDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.service.syntax.OperationDescription#getName()
	 * @see #getOperationDescription()
	 * @generated
	 */
	EAttribute getOperationDescription_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.syntax.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see net.sf.ictalive.service.syntax.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.syntax.Message#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.service.syntax.Message#getName()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.ictalive.service.syntax.Message#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see net.sf.ictalive.service.syntax.Message#getPart()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Part();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.syntax.Endpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint</em>'.
	 * @see net.sf.ictalive.service.syntax.Endpoint
	 * @generated
	 */
	EClass getEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.ictalive.service.syntax.Endpoint#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding</em>'.
	 * @see net.sf.ictalive.service.syntax.Endpoint#getBinding()
	 * @see #getEndpoint()
	 * @generated
	 */
	EReference getEndpoint_Binding();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.syntax.Endpoint#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation</em>'.
	 * @see net.sf.ictalive.service.syntax.Endpoint#getImplementation()
	 * @see #getEndpoint()
	 * @generated
	 */
	EReference getEndpoint_Implementation();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.syntax.Endpoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.service.syntax.Endpoint#getName()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.syntax.Endpoint#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see net.sf.ictalive.service.syntax.Endpoint#getLocation()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_Location();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.syntax.Endpoint#getDeployedService <em>Deployed Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deployed Service</em>'.
	 * @see net.sf.ictalive.service.syntax.Endpoint#getDeployedService()
	 * @see #getEndpoint()
	 * @generated
	 */
	EReference getEndpoint_DeployedService();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.syntax.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see net.sf.ictalive.service.syntax.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.syntax.Binding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.service.syntax.Binding#getName()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.syntax.Binding#getTransport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport</em>'.
	 * @see net.sf.ictalive.service.syntax.Binding#getTransport()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Transport();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.syntax.Binding#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see net.sf.ictalive.service.syntax.Binding#getType()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.syntax.Binding#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see net.sf.ictalive.service.syntax.Binding#getStyle()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Style();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.service.syntax.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see net.sf.ictalive.service.syntax.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.syntax.Part#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.ictalive.service.syntax.Part#getName()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.service.syntax.Part#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.ictalive.service.syntax.Part#getType()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Type();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.syntax.Part#getXsdType <em>Xsd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xsd Type</em>'.
	 * @see net.sf.ictalive.service.syntax.Part#getXsdType()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_XsdType();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.service.syntax.Part#getXsdElement <em>Xsd Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xsd Element</em>'.
	 * @see net.sf.ictalive.service.syntax.Part#getXsdElement()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_XsdElement();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.service.syntax.StyleEncoding <em>Style Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Style Encoding</em>'.
	 * @see net.sf.ictalive.service.syntax.StyleEncoding
	 * @generated
	 */
	EEnum getStyleEncoding();

	/**
	 * Returns the meta object for enum '{@link net.sf.ictalive.service.syntax.TransportProtocol <em>Transport Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transport Protocol</em>'.
	 * @see net.sf.ictalive.service.syntax.TransportProtocol
	 * @generated
	 */
	EEnum getTransportProtocol();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SyntaxFactory getSyntaxFactory();

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
		 * The meta object literal for the '{@link net.sf.ictalive.service.syntax.impl.InterfaceDescriptionImpl <em>Interface Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.syntax.impl.InterfaceDescriptionImpl
		 * @see net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl#getInterfaceDescription()
		 * @generated
		 */
		EClass INTERFACE_DESCRIPTION = eINSTANCE.getInterfaceDescription();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DESCRIPTION__OPERATION = eINSTANCE.getInterfaceDescription_Operation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DESCRIPTION__NAME = eINSTANCE.getInterfaceDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DESCRIPTION__BINDING = eINSTANCE.getInterfaceDescription_Binding();

		/**
		 * The meta object literal for the '<em><b>In Line Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DESCRIPTION__IN_LINE_SCHEMA = eINSTANCE.getInterfaceDescription_InLineSchema();

		/**
		 * The meta object literal for the '<em><b>Out Line Schema</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DESCRIPTION__OUT_LINE_SCHEMA = eINSTANCE.getInterfaceDescription_OutLineSchema();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.syntax.impl.OperationDescriptionImpl <em>Operation Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.syntax.impl.OperationDescriptionImpl
		 * @see net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl#getOperationDescription()
		 * @generated
		 */
		EClass OPERATION_DESCRIPTION = eINSTANCE.getOperationDescription();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DESCRIPTION__INPUT = eINSTANCE.getOperationDescription_Input();

		/**
		 * The meta object literal for the '<em><b>Fault</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DESCRIPTION__FAULT = eINSTANCE.getOperationDescription_Fault();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DESCRIPTION__OUTPUT = eINSTANCE.getOperationDescription_Output();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_DESCRIPTION__NAME = eINSTANCE.getOperationDescription_Name();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.syntax.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.syntax.impl.MessageImpl
		 * @see net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__NAME = eINSTANCE.getMessage_Name();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__PART = eINSTANCE.getMessage_Part();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.syntax.impl.EndpointImpl <em>Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.syntax.impl.EndpointImpl
		 * @see net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl#getEndpoint()
		 * @generated
		 */
		EClass ENDPOINT = eINSTANCE.getEndpoint();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT__BINDING = eINSTANCE.getEndpoint_Binding();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT__IMPLEMENTATION = eINSTANCE.getEndpoint_Implementation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__NAME = eINSTANCE.getEndpoint_Name();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__LOCATION = eINSTANCE.getEndpoint_Location();

		/**
		 * The meta object literal for the '<em><b>Deployed Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT__DEPLOYED_SERVICE = eINSTANCE.getEndpoint_DeployedService();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.syntax.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.syntax.impl.BindingImpl
		 * @see net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__NAME = eINSTANCE.getBinding_Name();

		/**
		 * The meta object literal for the '<em><b>Transport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__TRANSPORT = eINSTANCE.getBinding_Transport();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__TYPE = eINSTANCE.getBinding_Type();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__STYLE = eINSTANCE.getBinding_Style();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.syntax.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.syntax.impl.PartImpl
		 * @see net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__NAME = eINSTANCE.getPart_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__TYPE = eINSTANCE.getPart_Type();

		/**
		 * The meta object literal for the '<em><b>Xsd Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__XSD_TYPE = eINSTANCE.getPart_XsdType();

		/**
		 * The meta object literal for the '<em><b>Xsd Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__XSD_ELEMENT = eINSTANCE.getPart_XsdElement();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.syntax.StyleEncoding <em>Style Encoding</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.syntax.StyleEncoding
		 * @see net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl#getStyleEncoding()
		 * @generated
		 */
		EEnum STYLE_ENCODING = eINSTANCE.getStyleEncoding();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.service.syntax.TransportProtocol <em>Transport Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.service.syntax.TransportProtocol
		 * @see net.sf.ictalive.service.syntax.impl.SyntaxPackageImpl#getTransportProtocol()
		 * @generated
		 */
		EEnum TRANSPORT_PROTOCOL = eINSTANCE.getTransportProtocol();

	}

} //SyntaxPackage
