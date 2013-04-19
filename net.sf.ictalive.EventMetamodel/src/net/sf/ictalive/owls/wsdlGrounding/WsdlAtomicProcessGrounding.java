/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.wsdlGrounding;

import net.sf.ictalive.owls.process.AtomicProcess;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wsdl Atomic Process Grounding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getOwlsProcess <em>Owls Process</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getWsdlOperation <em>Wsdl Operation</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getWsdlInput <em>Wsdl Input</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getWsdlOutput <em>Wsdl Output</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getWsdlService <em>Wsdl Service</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getWsdlPort <em>Wsdl Port</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getWsdlInputMessage <em>Wsdl Input Message</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getWsdlOutputMessage <em>Wsdl Output Message</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getWsdlVersion <em>Wsdl Version</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getWsdlDocument <em>Wsdl Document</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getWsdlReference <em>Wsdl Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getWsdlAtomicProcessGrounding()
 * @model
 * @generated
 */
public interface WsdlAtomicProcessGrounding extends EObject
{
	/**
	 * Returns the value of the '<em><b>Owls Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owls Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owls Process</em>' reference.
	 * @see #setOwlsProcess(AtomicProcess)
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getWsdlAtomicProcessGrounding_OwlsProcess()
	 * @model
	 * @generated
	 */
	AtomicProcess getOwlsProcess();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getOwlsProcess <em>Owls Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owls Process</em>' reference.
	 * @see #getOwlsProcess()
	 * @generated
	 */
	void setOwlsProcess(AtomicProcess value);

	/**
	 * Returns the value of the '<em><b>Wsdl Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Operation</em>' reference.
	 * @see #setWsdlOperation(WsdlOperationRef)
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getWsdlAtomicProcessGrounding_WsdlOperation()
	 * @model
	 * @generated
	 */
	WsdlOperationRef getWsdlOperation();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getWsdlOperation <em>Wsdl Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Operation</em>' reference.
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
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getWsdlAtomicProcessGrounding_WsdlInput()
	 * @model containment="true"
	 * @generated
	 */
	WsdlInputMessageMap getWsdlInput();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getWsdlInput <em>Wsdl Input</em>}' containment reference.
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
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getWsdlAtomicProcessGrounding_WsdlOutput()
	 * @model containment="true"
	 * @generated
	 */
	WsdlOutputMessageMap getWsdlOutput();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getWsdlOutput <em>Wsdl Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Output</em>' containment reference.
	 * @see #getWsdlOutput()
	 * @generated
	 */
	void setWsdlOutput(WsdlOutputMessageMap value);

	/**
	 * Returns the value of the '<em><b>Wsdl Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Service</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Service</em>' containment reference.
	 * @see #setWsdlService(EObject)
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getWsdlAtomicProcessGrounding_WsdlService()
	 * @model containment="true"
	 * @generated
	 */
	EObject getWsdlService();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getWsdlService <em>Wsdl Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Service</em>' containment reference.
	 * @see #getWsdlService()
	 * @generated
	 */
	void setWsdlService(EObject value);

	/**
	 * Returns the value of the '<em><b>Wsdl Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Port</em>' containment reference.
	 * @see #setWsdlPort(EObject)
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getWsdlAtomicProcessGrounding_WsdlPort()
	 * @model containment="true"
	 * @generated
	 */
	EObject getWsdlPort();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getWsdlPort <em>Wsdl Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Port</em>' containment reference.
	 * @see #getWsdlPort()
	 * @generated
	 */
	void setWsdlPort(EObject value);

	/**
	 * Returns the value of the '<em><b>Wsdl Input Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Input Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Input Message</em>' containment reference.
	 * @see #setWsdlInputMessage(EObject)
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getWsdlAtomicProcessGrounding_WsdlInputMessage()
	 * @model containment="true"
	 * @generated
	 */
	EObject getWsdlInputMessage();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getWsdlInputMessage <em>Wsdl Input Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Input Message</em>' containment reference.
	 * @see #getWsdlInputMessage()
	 * @generated
	 */
	void setWsdlInputMessage(EObject value);

	/**
	 * Returns the value of the '<em><b>Wsdl Output Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Output Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Output Message</em>' containment reference.
	 * @see #setWsdlOutputMessage(EObject)
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getWsdlAtomicProcessGrounding_WsdlOutputMessage()
	 * @model containment="true"
	 * @generated
	 */
	EObject getWsdlOutputMessage();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getWsdlOutputMessage <em>Wsdl Output Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Output Message</em>' containment reference.
	 * @see #getWsdlOutputMessage()
	 * @generated
	 */
	void setWsdlOutputMessage(EObject value);

	/**
	 * Returns the value of the '<em><b>Wsdl Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Version</em>' containment reference.
	 * @see #setWsdlVersion(EObject)
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getWsdlAtomicProcessGrounding_WsdlVersion()
	 * @model containment="true"
	 * @generated
	 */
	EObject getWsdlVersion();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getWsdlVersion <em>Wsdl Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Version</em>' containment reference.
	 * @see #getWsdlVersion()
	 * @generated
	 */
	void setWsdlVersion(EObject value);

	/**
	 * Returns the value of the '<em><b>Wsdl Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Document</em>' reference.
	 * @see #setWsdlDocument(EObject)
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getWsdlAtomicProcessGrounding_WsdlDocument()
	 * @model
	 * @generated
	 */
	EObject getWsdlDocument();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getWsdlDocument <em>Wsdl Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Document</em>' reference.
	 * @see #getWsdlDocument()
	 * @generated
	 */
	void setWsdlDocument(EObject value);

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
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getWsdlAtomicProcessGrounding_WsdlReference()
	 * @model
	 * @generated
	 */
	String getWsdlReference();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding#getWsdlReference <em>Wsdl Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Reference</em>' attribute.
	 * @see #getWsdlReference()
	 * @generated
	 */
	void setWsdlReference(String value);

} // WsdlAtomicProcessGrounding
