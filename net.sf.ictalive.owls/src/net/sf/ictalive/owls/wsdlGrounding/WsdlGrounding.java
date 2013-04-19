/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.wsdlGrounding;

import net.sf.ictalive.owls.service.ServiceGrounding;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wsdl Grounding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.wsdlGrounding.WsdlGrounding#getHasAtomicProcessGrounding <em>Has Atomic Process Grounding</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getWsdlGrounding()
 * @model
 * @generated
 */
public interface WsdlGrounding extends ServiceGrounding {
	/**
	 * Returns the value of the '<em><b>Has Atomic Process Grounding</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.owls.wsdlGrounding.WsdlAtomicProcessGrounding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Atomic Process Grounding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Atomic Process Grounding</em>' containment reference list.
	 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage#getWsdlGrounding_HasAtomicProcessGrounding()
	 * @model containment="true"
	 * @generated
	 */
	EList<WsdlAtomicProcessGrounding> getHasAtomicProcessGrounding();

} // WsdlGrounding
