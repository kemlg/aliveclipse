/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics.grounding;

import net.sf.ictalive.service.semantics.ServiceParameter;

import net.sf.ictalive.service.syntax.Part;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wsdl Message Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.WsdlMessageMap#getOwlsParameter <em>Owls Parameter</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.grounding.WsdlMessageMap#getWsdlMessagePart <em>Wsdl Message Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.semantics.grounding.GroundingPackage#getWsdlMessageMap()
 * @model
 * @generated
 */
public interface WsdlMessageMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Owls Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owls Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owls Parameter</em>' reference.
	 * @see #setOwlsParameter(ServiceParameter)
	 * @see net.sf.ictalive.service.semantics.grounding.GroundingPackage#getWsdlMessageMap_OwlsParameter()
	 * @model
	 * @generated
	 */
	ServiceParameter getOwlsParameter();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.grounding.WsdlMessageMap#getOwlsParameter <em>Owls Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owls Parameter</em>' reference.
	 * @see #getOwlsParameter()
	 * @generated
	 */
	void setOwlsParameter(ServiceParameter value);

	/**
	 * Returns the value of the '<em><b>Wsdl Message Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Message Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Message Part</em>' reference.
	 * @see #setWsdlMessagePart(Part)
	 * @see net.sf.ictalive.service.semantics.grounding.GroundingPackage#getWsdlMessageMap_WsdlMessagePart()
	 * @model
	 * @generated
	 */
	Part getWsdlMessagePart();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.grounding.WsdlMessageMap#getWsdlMessagePart <em>Wsdl Message Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Message Part</em>' reference.
	 * @see #getWsdlMessagePart()
	 * @generated
	 */
	void setWsdlMessagePart(Part value);

} // WsdlMessageMap
