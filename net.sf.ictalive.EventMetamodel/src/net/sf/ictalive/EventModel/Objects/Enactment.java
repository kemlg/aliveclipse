/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Objects;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enactment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Objects.Enactment#getResource <em>Resource</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Objects.Enactment#getSessionId <em>Session Id</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Objects.Enactment#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Objects.Enactment#getExpireTime <em>Expire Time</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Objects.Enactment#getFinishTime <em>Finish Time</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Objects.Enactment#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.EventModel.Objects.ObjectsPackage#getEnactment()
 * @model
 * @generated
 */
public interface Enactment extends EObject
{
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.EventModel.Objects.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference list.
	 * @see net.sf.ictalive.EventModel.Objects.ObjectsPackage#getEnactment_Resource()
	 * @model
	 * @generated
	 */
	EList<Resource> getResource();

	/**
	 * Returns the value of the '<em><b>Session Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Id</em>' attribute.
	 * @see #setSessionId(String)
	 * @see net.sf.ictalive.EventModel.Objects.ObjectsPackage#getEnactment_SessionId()
	 * @model
	 * @generated
	 */
	String getSessionId();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Objects.Enactment#getSessionId <em>Session Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Id</em>' attribute.
	 * @see #getSessionId()
	 * @generated
	 */
	void setSessionId(String value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see net.sf.ictalive.EventModel.Objects.ObjectsPackage#getEnactment_StartTime()
	 * @model
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Objects.Enactment#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>Expire Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expire Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expire Time</em>' attribute.
	 * @see #setExpireTime(Date)
	 * @see net.sf.ictalive.EventModel.Objects.ObjectsPackage#getEnactment_ExpireTime()
	 * @model
	 * @generated
	 */
	Date getExpireTime();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Objects.Enactment#getExpireTime <em>Expire Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expire Time</em>' attribute.
	 * @see #getExpireTime()
	 * @generated
	 */
	void setExpireTime(Date value);

	/**
	 * Returns the value of the '<em><b>Finish Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish Time</em>' attribute.
	 * @see #setFinishTime(Date)
	 * @see net.sf.ictalive.EventModel.Objects.ObjectsPackage#getEnactment_FinishTime()
	 * @model
	 * @generated
	 */
	Date getFinishTime();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Objects.Enactment#getFinishTime <em>Finish Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish Time</em>' attribute.
	 * @see #getFinishTime()
	 * @generated
	 */
	void setFinishTime(Date value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' reference.
	 * @see #setTime(time)
	 * @see net.sf.ictalive.EventModel.Objects.ObjectsPackage#getEnactment_Time()
	 * @model
	 * @generated
	 */
	time getTime();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Objects.Enactment#getTime <em>Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(time value);

} // Enactment
