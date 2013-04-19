/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.architecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Framework</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.architecture.ExecutionFramework#getDeployedService <em>Deployed Service</em>}</li>
 *   <li>{@link net.sf.ictalive.service.architecture.ExecutionFramework#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getExecutionFramework()
 * @model
 * @generated
 */
public interface ExecutionFramework extends EObject {
	/**
	 * Returns the value of the '<em><b>Deployed Service</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.architecture.DeployedService}.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.service.architecture.DeployedService#getDeploy <em>Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Service</em>' containment reference list.
	 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getExecutionFramework_DeployedService()
	 * @see net.sf.ictalive.service.architecture.DeployedService#getDeploy
	 * @model opposite="deploy" containment="true"
	 * @generated
	 */
	EList<DeployedService> getDeployedService();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.ictalive.service.architecture.ContainerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' attribute.
	 * @see net.sf.ictalive.service.architecture.ContainerType
	 * @see #setContainer(ContainerType)
	 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getExecutionFramework_Container()
	 * @model
	 * @generated
	 */
	ContainerType getContainer();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.architecture.ExecutionFramework#getContainer <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' attribute.
	 * @see net.sf.ictalive.service.architecture.ContainerType
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(ContainerType value);

} // ExecutionFramework
