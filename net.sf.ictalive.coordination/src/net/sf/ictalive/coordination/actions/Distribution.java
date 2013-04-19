/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.actions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.actions.Distribution#getDatapoint <em>Datapoint</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.Distribution#getDensity <em>Density</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.Distribution#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.Distribution#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.actions.ActionsPackage#getDistribution()
 * @model
 * @generated
 */
public interface Distribution extends EObject {
	/**
	 * Returns the value of the '<em><b>Datapoint</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datapoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datapoint</em>' attribute.
	 * @see #setDatapoint(float)
	 * @see net.sf.ictalive.coordination.actions.ActionsPackage#getDistribution_Datapoint()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	float getDatapoint();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.actions.Distribution#getDatapoint <em>Datapoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datapoint</em>' attribute.
	 * @see #getDatapoint()
	 * @generated
	 */
	void setDatapoint(float value);

	/**
	 * Returns the value of the '<em><b>Density</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Density</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Density</em>' attribute.
	 * @see #setDensity(float)
	 * @see net.sf.ictalive.coordination.actions.ActionsPackage#getDistribution_Density()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	float getDensity();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.actions.Distribution#getDensity <em>Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Density</em>' attribute.
	 * @see #getDensity()
	 * @generated
	 */
	void setDensity(float value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see net.sf.ictalive.coordination.actions.ActionsPackage#getDistribution_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.actions.Distribution#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see net.sf.ictalive.coordination.actions.ActionsPackage#getDistribution_Version()
	 * @model annotation="teneo.jpa appinfo='@Version'"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.actions.Distribution#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

} // Distribution
