/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.wsdlGrounding;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.GD#getWsdlGrounding <em>Wsdl Grounding</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.GD#getWsdlAtomicProcessGrounding <em>Wsdl Atomic Process Grounding</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getGD()
 * @model
 * @generated
 */
public interface GD extends EObject {
	/**
	 * Returns the value of the '<em><b>Wsdl Grounding</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.owls.wsdlGrounding.WsdlGrounding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Grounding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Grounding</em>' containment reference list.
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getGD_WsdlGrounding()
	 * @model containment="true"
	 * @generated
	 */
	EList<WsdlGrounding> getWsdlGrounding();

	/**
	 * Returns the value of the '<em><b>Wsdl Atomic Process Grounding</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl Atomic Process Grounding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Atomic Process Grounding</em>' containment reference list.
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getGD_WsdlAtomicProcessGrounding()
	 * @model containment="true"
	 * @generated
	 */
	EList<WsdlAtomicProcessGrounding> getWsdlAtomicProcessGrounding();

} // GD
