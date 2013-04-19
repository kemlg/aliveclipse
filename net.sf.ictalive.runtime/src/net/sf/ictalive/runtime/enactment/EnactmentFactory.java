/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.enactment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.runtime.enactment.EnactmentPackage
 * @generated
 */
public interface EnactmentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnactmentFactory eINSTANCE = net.sf.ictalive.runtime.enactment.impl.EnactmentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Enactment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enactment</em>'.
	 * @generated
	 */
	Enactment createEnactment();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Action Enactment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Enactment</em>'.
	 * @generated
	 */
	ActionEnactment createActionEnactment();

	/**
	 * Returns a new object of class '<em>Plan Enactment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Enactment</em>'.
	 * @generated
	 */
	PlanEnactment createPlanEnactment();

	/**
	 * Returns a new object of class '<em>Service Invocation Enactment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Invocation Enactment</em>'.
	 * @generated
	 */
	ServiceInvocationEnactment createServiceInvocationEnactment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EnactmentPackage getEnactmentPackage();

} //EnactmentFactory
