/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.wsdlGrounding;

import net.sf.ictalive.owls.process.Parameter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wsdl Message Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.WsdlMessageMap#getOwlsParameter <em>Owls Parameter</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.WsdlMessageMap#getWsdlMessagePart <em>Wsdl Message Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getWsdlMessageMap()
 * @model
 * @generated
 */
public interface WsdlMessageMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Owls Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owls Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owls Parameter</em>' containment reference.
	 * @see #setOwlsParameter(Parameter)
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getWsdlMessageMap_OwlsParameter()
	 * @model containment="true"
	 * @generated
	 */
	Parameter getOwlsParameter();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.wsdlGrounding.WsdlMessageMap#getOwlsParameter <em>Owls Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owls Parameter</em>' containment reference.
	 * @see #getOwlsParameter()
	 * @generated
	 */
	void setOwlsParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Wsdl Message Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Message Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Message Part</em>' containment reference.
	 * @see #setWsdlMessagePart(EObject)
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getWsdlMessageMap_WsdlMessagePart()
	 * @model containment="true"
	 * @generated
	 */
	EObject getWsdlMessagePart();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.wsdlGrounding.WsdlMessageMap#getWsdlMessagePart <em>Wsdl Message Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Message Part</em>' containment reference.
	 * @see #getWsdlMessagePart()
	 * @generated
	 */
	void setWsdlMessagePart(EObject value);

} // WsdlMessageMap
