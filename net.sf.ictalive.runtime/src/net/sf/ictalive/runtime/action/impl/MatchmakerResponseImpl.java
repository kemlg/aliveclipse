/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action.impl;

import java.util.Collection;

import net.sf.ictalive.runtime.action.ActionPackage;
import net.sf.ictalive.runtime.action.MatchmakerQuery;
import net.sf.ictalive.runtime.action.MatchmakerResponse;
import net.sf.ictalive.runtime.action.MatchmakerResult;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matchmaker Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.action.impl.MatchmakerResponseImpl#getQueryResult <em>Query Result</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.impl.MatchmakerResponseImpl#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchmakerResponseImpl extends ActionImpl implements MatchmakerResponse {
	/**
	 * The cached value of the '{@link #getQueryResult() <em>Query Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryResult()
	 * @generated
	 * @ordered
	 */
	protected EList<MatchmakerResult> queryResult;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected MatchmakerQuery query;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchmakerResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionPackage.Literals.MATCHMAKER_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MatchmakerResult> getQueryResult() {
		if (queryResult == null) {
			queryResult = new EObjectContainmentEList<MatchmakerResult>(MatchmakerResult.class, this, ActionPackage.MATCHMAKER_RESPONSE__QUERY_RESULT);
		}
		return queryResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchmakerQuery getQuery() {
		if (query != null && query.eIsProxy()) {
			InternalEObject oldQuery = (InternalEObject)query;
			query = (MatchmakerQuery)eResolveProxy(oldQuery);
			if (query != oldQuery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionPackage.MATCHMAKER_RESPONSE__QUERY, oldQuery, query));
			}
		}
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchmakerQuery basicGetQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(MatchmakerQuery newQuery) {
		MatchmakerQuery oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.MATCHMAKER_RESPONSE__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionPackage.MATCHMAKER_RESPONSE__QUERY_RESULT:
				return ((InternalEList<?>)getQueryResult()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActionPackage.MATCHMAKER_RESPONSE__QUERY_RESULT:
				return getQueryResult();
			case ActionPackage.MATCHMAKER_RESPONSE__QUERY:
				if (resolve) return getQuery();
				return basicGetQuery();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActionPackage.MATCHMAKER_RESPONSE__QUERY_RESULT:
				getQueryResult().clear();
				getQueryResult().addAll((Collection<? extends MatchmakerResult>)newValue);
				return;
			case ActionPackage.MATCHMAKER_RESPONSE__QUERY:
				setQuery((MatchmakerQuery)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActionPackage.MATCHMAKER_RESPONSE__QUERY_RESULT:
				getQueryResult().clear();
				return;
			case ActionPackage.MATCHMAKER_RESPONSE__QUERY:
				setQuery((MatchmakerQuery)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActionPackage.MATCHMAKER_RESPONSE__QUERY_RESULT:
				return queryResult != null && !queryResult.isEmpty();
			case ActionPackage.MATCHMAKER_RESPONSE__QUERY:
				return query != null;
		}
		return super.eIsSet(featureID);
	}

} //MatchmakerResponseImpl
