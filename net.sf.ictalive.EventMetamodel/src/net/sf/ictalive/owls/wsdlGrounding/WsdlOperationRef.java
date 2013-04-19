/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.wsdlGrounding;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wsdl Operation Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.WsdlOperationRef#getPortType <em>Port Type</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.WsdlOperationRef#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getWsdlOperationRef()
 * @model
 * @generated
 */
public interface WsdlOperationRef extends EObject
{
	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type</em>' reference.
	 * @see #setPortType(EObject)
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getWsdlOperationRef_PortType()
	 * @model
	 * @generated
	 */
	EObject getPortType();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.wsdlGrounding.WsdlOperationRef#getPortType <em>Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type</em>' reference.
	 * @see #getPortType()
	 * @generated
	 */
	void setPortType(EObject value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(EObject)
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getWsdlOperationRef_Operation()
	 * @model
	 * @generated
	 */
	EObject getOperation();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.wsdlGrounding.WsdlOperationRef#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(EObject value);

} // WsdlOperationRef
