/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matchmaker Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.action.MatchmakerResponse#getQueryResult <em>Query Result</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.MatchmakerResponse#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.action.ActionPackage#getMatchmakerResponse()
 * @model
 * @generated
 */
public interface MatchmakerResponse extends Action {
	/**
	 * Returns the value of the '<em><b>Query Result</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.runtime.action.MatchmakerResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Result</em>' containment reference list.
	 * @see net.sf.ictalive.runtime.action.ActionPackage#getMatchmakerResponse_QueryResult()
	 * @model containment="true"
	 * @generated
	 */
	EList<MatchmakerResult> getQueryResult();

	/**
	 * Returns the value of the '<em><b>Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' reference.
	 * @see #setQuery(MatchmakerQuery)
	 * @see net.sf.ictalive.runtime.action.ActionPackage#getMatchmakerResponse_Query()
	 * @model
	 * @generated
	 */
	MatchmakerQuery getQuery();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.action.MatchmakerResponse#getQuery <em>Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(MatchmakerQuery value);

} // MatchmakerResponse
