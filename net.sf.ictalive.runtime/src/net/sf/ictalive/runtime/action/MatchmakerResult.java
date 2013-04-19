/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matchmaker Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.action.MatchmakerResult#getServiceURI <em>Service URI</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.MatchmakerResult#getReliability <em>Reliability</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.MatchmakerResult#getPerformance <em>Performance</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.action.ActionPackage#getMatchmakerResult()
 * @model
 * @generated
 */
public interface MatchmakerResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Service URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service URI</em>' attribute.
	 * @see #setServiceURI(String)
	 * @see net.sf.ictalive.runtime.action.ActionPackage#getMatchmakerResult_ServiceURI()
	 * @model required="true"
	 * @generated
	 */
	String getServiceURI();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.action.MatchmakerResult#getServiceURI <em>Service URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service URI</em>' attribute.
	 * @see #getServiceURI()
	 * @generated
	 */
	void setServiceURI(String value);

	/**
	 * Returns the value of the '<em><b>Reliability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliability</em>' attribute.
	 * @see #setReliability(double)
	 * @see net.sf.ictalive.runtime.action.ActionPackage#getMatchmakerResult_Reliability()
	 * @model
	 * @generated
	 */
	double getReliability();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.action.MatchmakerResult#getReliability <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliability</em>' attribute.
	 * @see #getReliability()
	 * @generated
	 */
	void setReliability(double value);

	/**
	 * Returns the value of the '<em><b>Performance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance</em>' attribute.
	 * @see #setPerformance(long)
	 * @see net.sf.ictalive.runtime.action.ActionPackage#getMatchmakerResult_Performance()
	 * @model
	 * @generated
	 */
	long getPerformance();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.action.MatchmakerResult#getPerformance <em>Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance</em>' attribute.
	 * @see #getPerformance()
	 * @generated
	 */
	void setPerformance(long value);

} // MatchmakerResult
