/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.architecture;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.service.architecture.ArchitecturePackage
 * @generated
 */
public interface ArchitectureFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchitectureFactory eINSTANCE = net.sf.ictalive.service.architecture.impl.ArchitectureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Service Framework</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Framework</em>'.
	 * @generated
	 */
	ServiceFramework createServiceFramework();

	/**
	 * Returns a new object of class '<em>Template Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Repository</em>'.
	 * @generated
	 */
	TemplateRepository createTemplateRepository();

	/**
	 * Returns a new object of class '<em>Template Matchmaker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Matchmaker</em>'.
	 * @generated
	 */
	TemplateMatchmaker createTemplateMatchmaker();

	/**
	 * Returns a new object of class '<em>Service Matchmaker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Matchmaker</em>'.
	 * @generated
	 */
	ServiceMatchmaker createServiceMatchmaker();

	/**
	 * Returns a new object of class '<em>Service Template Matchmaker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Template Matchmaker</em>'.
	 * @generated
	 */
	ServiceTemplateMatchmaker createServiceTemplateMatchmaker();

	/**
	 * Returns a new object of class '<em>Service Directory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Directory</em>'.
	 * @generated
	 */
	ServiceDirectory createServiceDirectory();

	/**
	 * Returns a new object of class '<em>Execution Framework</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Framework</em>'.
	 * @generated
	 */
	ExecutionFramework createExecutionFramework();

	/**
	 * Returns a new object of class '<em>Deployed Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployed Service</em>'.
	 * @generated
	 */
	DeployedService createDeployedService();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArchitecturePackage getArchitecturePackage();

} //ArchitectureFactory
