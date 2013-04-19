/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics.grounding;

import net.sf.ictalive.service.Service;

import net.sf.ictalive.service.semantics.ProcessModel;

import net.sf.ictalive.service.syntax.Endpoint;
import net.sf.ictalive.service.syntax.Message;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wsdl Atomic Process Grounding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getOwlsProcess <em>Owls Process</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlOperation <em>Wsdl Operation</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlInput <em>Wsdl Input</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlOutput <em>Wsdl Output</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlService <em>Wsdl Service</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlPort <em>Wsdl Port</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlInputMessage <em>Wsdl Input Message</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlOutputMessage <em>Wsdl Output Message</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlReference <em>Wsdl Reference</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlVersion <em>Wsdl Version</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlDocument <em>Wsdl Document</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.semantics.grounding.GroundingPackage#getWsdlAtomicProcessGrounding()
 * @model
 * @generated
 */
public interface WsdlAtomicProcessGrounding extends EObject {
	/**
	 * Returns the value of the '<em><b>Owls Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owls Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owls Process</em>' reference.
	 * @see #setOwlsProcess(ProcessModel)
	 * @see net.sf.ictalive.service.semantics.grounding.GroundingPackage#getWsdlAtomicProcessGrounding_OwlsProcess()
	 * @model
	 * @generated
	 */
	ProcessModel getOwlsProcess();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getOwlsProcess <em>Owls Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owls Process</em>' reference.
	 * @see #getOwlsProcess()
	 * @generated
	 */
	void setOwlsProcess(ProcessModel value);

	/**
	 * Returns the value of the '<em><b>Wsdl Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Operation</em>' containment reference.
	 * @see #setWsdlOperation(WsdlOperationRef)
	 * @see net.sf.ictalive.service.semantics.grounding.GroundingPackage#getWsdlAtomicProcessGrounding_WsdlOperation()
	 * @model containment="true"
	 * @generated
	 */
	WsdlOperationRef getWsdlOperation();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlOperation <em>Wsdl Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Operation</em>' containment reference.
	 * @see #getWsdlOperation()
	 * @generated
	 */
	void setWsdlOperation(WsdlOperationRef value);

	/**
	 * Returns the value of the '<em><b>Wsdl Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Input</em>' containment reference.
	 * @see #setWsdlInput(WsdlInputMessageMap)
	 * @see net.sf.ictalive.service.semantics.grounding.GroundingPackage#getWsdlAtomicProcessGrounding_WsdlInput()
	 * @model containment="true"
	 * @generated
	 */
	WsdlInputMessageMap getWsdlInput();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlInput <em>Wsdl Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Input</em>' containment reference.
	 * @see #getWsdlInput()
	 * @generated
	 */
	void setWsdlInput(WsdlInputMessageMap value);

	/**
	 * Returns the value of the '<em><b>Wsdl Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Output</em>' containment reference.
	 * @see #setWsdlOutput(WsdlOutputMessageMap)
	 * @see net.sf.ictalive.service.semantics.grounding.GroundingPackage#getWsdlAtomicProcessGrounding_WsdlOutput()
	 * @model containment="true"
	 * @generated
	 */
	WsdlOutputMessageMap getWsdlOutput();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlOutput <em>Wsdl Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Output</em>' containment reference.
	 * @see #getWsdlOutput()
	 * @generated
	 */
	void setWsdlOutput(WsdlOutputMessageMap value);

	/**
	 * Returns the value of the '<em><b>Wsdl Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Service</em>' reference.
	 * @see #setWsdlService(Service)
	 * @see net.sf.ictalive.service.semantics.grounding.GroundingPackage#getWsdlAtomicProcessGrounding_WsdlService()
	 * @model
	 * @generated
	 */
	Service getWsdlService();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlService <em>Wsdl Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Service</em>' reference.
	 * @see #getWsdlService()
	 * @generated
	 */
	void setWsdlService(Service value);

	/**
	 * Returns the value of the '<em><b>Wsdl Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Port</em>' reference.
	 * @see #setWsdlPort(Endpoint)
	 * @see net.sf.ictalive.service.semantics.grounding.GroundingPackage#getWsdlAtomicProcessGrounding_WsdlPort()
	 * @model
	 * @generated
	 */
	Endpoint getWsdlPort();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlPort <em>Wsdl Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Port</em>' reference.
	 * @see #getWsdlPort()
	 * @generated
	 */
	void setWsdlPort(Endpoint value);

	/**
	 * Returns the value of the '<em><b>Wsdl Input Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Input Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Input Message</em>' reference.
	 * @see #setWsdlInputMessage(Message)
	 * @see net.sf.ictalive.service.semantics.grounding.GroundingPackage#getWsdlAtomicProcessGrounding_WsdlInputMessage()
	 * @model
	 * @generated
	 */
	Message getWsdlInputMessage();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlInputMessage <em>Wsdl Input Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Input Message</em>' reference.
	 * @see #getWsdlInputMessage()
	 * @generated
	 */
	void setWsdlInputMessage(Message value);

	/**
	 * Returns the value of the '<em><b>Wsdl Output Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Output Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Output Message</em>' reference.
	 * @see #setWsdlOutputMessage(Message)
	 * @see net.sf.ictalive.service.semantics.grounding.GroundingPackage#getWsdlAtomicProcessGrounding_WsdlOutputMessage()
	 * @model
	 * @generated
	 */
	Message getWsdlOutputMessage();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlOutputMessage <em>Wsdl Output Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Output Message</em>' reference.
	 * @see #getWsdlOutputMessage()
	 * @generated
	 */
	void setWsdlOutputMessage(Message value);

	/**
	 * Returns the value of the '<em><b>Wsdl Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Reference</em>' attribute.
	 * @see #setWsdlReference(String)
	 * @see net.sf.ictalive.service.semantics.grounding.GroundingPackage#getWsdlAtomicProcessGrounding_WsdlReference()
	 * @model
	 * @generated
	 */
	String getWsdlReference();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlReference <em>Wsdl Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Reference</em>' attribute.
	 * @see #getWsdlReference()
	 * @generated
	 */
	void setWsdlReference(String value);

	/**
	 * Returns the value of the '<em><b>Wsdl Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Version</em>' attribute.
	 * @see #setWsdlVersion(String)
	 * @see net.sf.ictalive.service.semantics.grounding.GroundingPackage#getWsdlAtomicProcessGrounding_WsdlVersion()
	 * @model
	 * @generated
	 */
	String getWsdlVersion();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlVersion <em>Wsdl Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Version</em>' attribute.
	 * @see #getWsdlVersion()
	 * @generated
	 */
	void setWsdlVersion(String value);

	/**
	 * Returns the value of the '<em><b>Wsdl Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Document</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Document</em>' attribute.
	 * @see #setWsdlDocument(String)
	 * @see net.sf.ictalive.service.semantics.grounding.GroundingPackage#getWsdlAtomicProcessGrounding_WsdlDocument()
	 * @model
	 * @generated
	 */
	String getWsdlDocument();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getWsdlDocument <em>Wsdl Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Document</em>' attribute.
	 * @see #getWsdlDocument()
	 * @generated
	 */
	void setWsdlDocument(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.ictalive.service.semantics.grounding.GroundingPackage#getWsdlAtomicProcessGrounding_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.grounding.WsdlAtomicProcessGrounding#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // WsdlAtomicProcessGrounding
