/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.architecture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployed Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.architecture.DeployedService#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link net.sf.ictalive.service.architecture.DeployedService#getDeploy <em>Deploy</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getDeployedService()
 * @model
 * @generated
 */
public interface DeployedService extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' attribute.
	 * @see #setArtifact(String)
	 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getDeployedService_Artifact()
	 * @model
	 * @generated
	 */
	String getArtifact();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.architecture.DeployedService#getArtifact <em>Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact</em>' attribute.
	 * @see #getArtifact()
	 * @generated
	 */
	void setArtifact(String value);

	/**
	 * Returns the value of the '<em><b>Deploy</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.service.architecture.ExecutionFramework#getDeployedService <em>Deployed Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deploy</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy</em>' container reference.
	 * @see #setDeploy(ExecutionFramework)
	 * @see net.sf.ictalive.service.architecture.ArchitecturePackage#getDeployedService_Deploy()
	 * @see net.sf.ictalive.service.architecture.ExecutionFramework#getDeployedService
	 * @model opposite="deployedService" required="true" transient="false"
	 * @generated
	 */
	ExecutionFramework getDeploy();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.architecture.DeployedService#getDeploy <em>Deploy</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy</em>' container reference.
	 * @see #getDeploy()
	 * @generated
	 */
	void setDeploy(ExecutionFramework value);

} // DeployedService
