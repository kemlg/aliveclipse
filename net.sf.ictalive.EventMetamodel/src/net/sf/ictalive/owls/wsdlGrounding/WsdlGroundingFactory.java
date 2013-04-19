/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.wsdlGrounding;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.owls.wsdlGrounding.WsdlGroundingPackage
 * @generated
 */
public interface WsdlGroundingFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WsdlGroundingFactory eINSTANCE = net.sf.ictalive.owls.wsdlGrounding.impl.WsdlGroundingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Wsdl Grounding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wsdl Grounding</em>'.
	 * @generated
	 */
	WsdlGrounding createWsdlGrounding();

	/**
	 * Returns a new object of class '<em>Wsdl Atomic Process Grounding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wsdl Atomic Process Grounding</em>'.
	 * @generated
	 */
	WsdlAtomicProcessGrounding createWsdlAtomicProcessGrounding();

	/**
	 * Returns a new object of class '<em>Wsdl Operation Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wsdl Operation Ref</em>'.
	 * @generated
	 */
	WsdlOperationRef createWsdlOperationRef();

	/**
	 * Returns a new object of class '<em>Wsdl Message Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wsdl Message Map</em>'.
	 * @generated
	 */
	WsdlMessageMap createWsdlMessageMap();

	/**
	 * Returns a new object of class '<em>Wsdl Input Message Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wsdl Input Message Map</em>'.
	 * @generated
	 */
	WsdlInputMessageMap createWsdlInputMessageMap();

	/**
	 * Returns a new object of class '<em>Wsdl Output Message Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wsdl Output Message Map</em>'.
	 * @generated
	 */
	WsdlOutputMessageMap createWsdlOutputMessageMap();

	/**
	 * Returns a new object of class '<em>GD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GD</em>'.
	 * @generated
	 */
	GD createGD();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WsdlGroundingPackage getWsdlGroundingPackage();

} //WsdlGroundingFactory
