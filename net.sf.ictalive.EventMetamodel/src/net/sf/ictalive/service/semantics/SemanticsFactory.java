/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.service.semantics.SemanticsPackage
 * @generated
 */
public interface SemanticsFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SemanticsFactory eINSTANCE = net.sf.ictalive.service.semantics.impl.SemanticsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Service Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Profile</em>'.
	 * @generated
	 */
	ServiceProfile createServiceProfile();

	/**
	 * Returns a new object of class '<em>Service Grounding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Grounding</em>'.
	 * @generated
	 */
	ServiceGrounding createServiceGrounding();

	/**
	 * Returns a new object of class '<em>Process Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Model</em>'.
	 * @generated
	 */
	ProcessModel createProcessModel();

	/**
	 * Returns a new object of class '<em>Service Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Category</em>'.
	 * @generated
	 */
	ServiceCategory createServiceCategory();

	/**
	 * Returns a new object of class '<em>Service Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Input</em>'.
	 * @generated
	 */
	ServiceInput createServiceInput();

	/**
	 * Returns a new object of class '<em>Service Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Output</em>'.
	 * @generated
	 */
	ServiceOutput createServiceOutput();

	/**
	 * Returns a new object of class '<em>Service Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Condition</em>'.
	 * @generated
	 */
	ServiceCondition createServiceCondition();

	/**
	 * Returns a new object of class '<em>Service Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Result</em>'.
	 * @generated
	 */
	ServiceResult createServiceResult();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SemanticsPackage getSemanticsPackage();

} //SemanticsFactory
