/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.action.impl;

import net.sf.ictalive.runtime.action.ActionPackage;
import net.sf.ictalive.runtime.action.MatchmakerResult;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matchmaker Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.action.impl.MatchmakerResultImpl#getServiceURI <em>Service URI</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.impl.MatchmakerResultImpl#getReliability <em>Reliability</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.action.impl.MatchmakerResultImpl#getPerformance <em>Performance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchmakerResultImpl extends EObjectImpl implements MatchmakerResult {
	/**
	 * The default value of the '{@link #getServiceURI() <em>Service URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceURI()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceURI() <em>Service URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceURI()
	 * @generated
	 * @ordered
	 */
	protected String serviceURI = SERVICE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getReliability() <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliability()
	 * @generated
	 * @ordered
	 */
	protected static final double RELIABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReliability() <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliability()
	 * @generated
	 * @ordered
	 */
	protected double reliability = RELIABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerformance() <em>Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformance()
	 * @generated
	 * @ordered
	 */
	protected static final long PERFORMANCE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPerformance() <em>Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformance()
	 * @generated
	 * @ordered
	 */
	protected long performance = PERFORMANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchmakerResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionPackage.Literals.MATCHMAKER_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceURI() {
		return serviceURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceURI(String newServiceURI) {
		String oldServiceURI = serviceURI;
		serviceURI = newServiceURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.MATCHMAKER_RESULT__SERVICE_URI, oldServiceURI, serviceURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReliability() {
		return reliability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliability(double newReliability) {
		double oldReliability = reliability;
		reliability = newReliability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.MATCHMAKER_RESULT__RELIABILITY, oldReliability, reliability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPerformance() {
		return performance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformance(long newPerformance) {
		long oldPerformance = performance;
		performance = newPerformance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.MATCHMAKER_RESULT__PERFORMANCE, oldPerformance, performance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActionPackage.MATCHMAKER_RESULT__SERVICE_URI:
				return getServiceURI();
			case ActionPackage.MATCHMAKER_RESULT__RELIABILITY:
				return getReliability();
			case ActionPackage.MATCHMAKER_RESULT__PERFORMANCE:
				return getPerformance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActionPackage.MATCHMAKER_RESULT__SERVICE_URI:
				setServiceURI((String)newValue);
				return;
			case ActionPackage.MATCHMAKER_RESULT__RELIABILITY:
				setReliability((Double)newValue);
				return;
			case ActionPackage.MATCHMAKER_RESULT__PERFORMANCE:
				setPerformance((Long)newValue);
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
			case ActionPackage.MATCHMAKER_RESULT__SERVICE_URI:
				setServiceURI(SERVICE_URI_EDEFAULT);
				return;
			case ActionPackage.MATCHMAKER_RESULT__RELIABILITY:
				setReliability(RELIABILITY_EDEFAULT);
				return;
			case ActionPackage.MATCHMAKER_RESULT__PERFORMANCE:
				setPerformance(PERFORMANCE_EDEFAULT);
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
			case ActionPackage.MATCHMAKER_RESULT__SERVICE_URI:
				return SERVICE_URI_EDEFAULT == null ? serviceURI != null : !SERVICE_URI_EDEFAULT.equals(serviceURI);
			case ActionPackage.MATCHMAKER_RESULT__RELIABILITY:
				return reliability != RELIABILITY_EDEFAULT;
			case ActionPackage.MATCHMAKER_RESULT__PERFORMANCE:
				return performance != PERFORMANCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (serviceURI: ");
		result.append(serviceURI);
		result.append(", reliability: ");
		result.append(reliability);
		result.append(", performance: ");
		result.append(performance);
		result.append(')');
		return result.toString();
	}

} //MatchmakerResultImpl
