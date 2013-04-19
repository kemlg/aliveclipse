/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Norm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.OM.Norm#getNormID <em>Norm ID</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.Norm#getActivationCondition <em>Activation Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.Norm#getExpirationCondition <em>Expiration Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.Norm#getMaintenanceCondition <em>Maintenance Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.Norm#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.Norm#getDeontics <em>Deontics</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.opera.OM.OMPackage#getNorm()
 * @model
 * @generated
 */
public interface Norm extends EObject
{
	/**
	 * Returns the value of the '<em><b>Norm ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Norm ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Norm ID</em>' attribute.
	 * @see #setNormID(String)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getNorm_NormID()
	 * @model required="true"
	 * @generated
	 */
	String getNormID();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.Norm#getNormID <em>Norm ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Norm ID</em>' attribute.
	 * @see #getNormID()
	 * @generated
	 */
	void setNormID(String value);

	/**
	 * Returns the value of the '<em><b>Activation Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Condition</em>' reference.
	 * @see #setActivationCondition(PartialStateDescription)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getNorm_ActivationCondition()
	 * @model required="true"
	 * @generated
	 */
	PartialStateDescription getActivationCondition();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.Norm#getActivationCondition <em>Activation Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Condition</em>' reference.
	 * @see #getActivationCondition()
	 * @generated
	 */
	void setActivationCondition(PartialStateDescription value);

	/**
	 * Returns the value of the '<em><b>Expiration Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Condition</em>' reference.
	 * @see #setExpirationCondition(PartialStateDescription)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getNorm_ExpirationCondition()
	 * @model required="true"
	 * @generated
	 */
	PartialStateDescription getExpirationCondition();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.Norm#getExpirationCondition <em>Expiration Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Condition</em>' reference.
	 * @see #getExpirationCondition()
	 * @generated
	 */
	void setExpirationCondition(PartialStateDescription value);

	/**
	 * Returns the value of the '<em><b>Maintenance Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maintenance Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintenance Condition</em>' reference.
	 * @see #setMaintenanceCondition(PartialStateDescription)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getNorm_MaintenanceCondition()
	 * @model
	 * @generated
	 */
	PartialStateDescription getMaintenanceCondition();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.Norm#getMaintenanceCondition <em>Maintenance Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintenance Condition</em>' reference.
	 * @see #getMaintenanceCondition()
	 * @generated
	 */
	void setMaintenanceCondition(PartialStateDescription value);

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' reference.
	 * @see #setDeadline(PartialStateDescription)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getNorm_Deadline()
	 * @model
	 * @generated
	 */
	PartialStateDescription getDeadline();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.Norm#getDeadline <em>Deadline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' reference.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(PartialStateDescription value);

	/**
	 * Returns the value of the '<em><b>Deontics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deontics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deontics</em>' containment reference.
	 * @see #setDeontics(DeonticStatement)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getNorm_Deontics()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DeonticStatement getDeontics();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.Norm#getDeontics <em>Deontics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deontics</em>' containment reference.
	 * @see #getDeontics()
	 * @generated
	 */
	void setDeontics(DeonticStatement value);

} // Norm
