/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM.impl;

import net.sf.ictalive.operetta.OM.CS;
import net.sf.ictalive.operetta.OM.IS;
import net.sf.ictalive.operetta.OM.NS;
import net.sf.ictalive.operetta.OM.OM;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.SS;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.OMImpl#getSs <em>Ss</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.OMImpl#getIs <em>Is</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.OMImpl#getNs <em>Ns</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.OMImpl#getCs <em>Cs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OMImpl extends EObjectImpl implements OM {
	/**
	 * The cached value of the '{@link #getSs() <em>Ss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSs()
	 * @generated
	 * @ordered
	 */
	protected SS ss;

	/**
	 * The cached value of the '{@link #getIs() <em>Is</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIs()
	 * @generated
	 * @ordered
	 */
	protected IS is;

	/**
	 * The cached value of the '{@link #getNs() <em>Ns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNs()
	 * @generated
	 * @ordered
	 */
	protected NS ns;

	/**
	 * The cached value of the '{@link #getCs() <em>Cs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCs()
	 * @generated
	 * @ordered
	 */
	protected CS cs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMPackage.Literals.OM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SS getSs() {
		return ss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSs(SS newSs, NotificationChain msgs) {
		SS oldSs = ss;
		ss = newSs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMPackage.OM__SS, oldSs, newSs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSs(SS newSs) {
		if (newSs != ss) {
			NotificationChain msgs = null;
			if (ss != null)
				msgs = ((InternalEObject)ss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMPackage.OM__SS, null, msgs);
			if (newSs != null)
				msgs = ((InternalEObject)newSs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMPackage.OM__SS, null, msgs);
			msgs = basicSetSs(newSs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.OM__SS, newSs, newSs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IS getIs() {
		return is;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIs(IS newIs, NotificationChain msgs) {
		IS oldIs = is;
		is = newIs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMPackage.OM__IS, oldIs, newIs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs(IS newIs) {
		if (newIs != is) {
			NotificationChain msgs = null;
			if (is != null)
				msgs = ((InternalEObject)is).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMPackage.OM__IS, null, msgs);
			if (newIs != null)
				msgs = ((InternalEObject)newIs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMPackage.OM__IS, null, msgs);
			msgs = basicSetIs(newIs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.OM__IS, newIs, newIs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NS getNs() {
		return ns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNs(NS newNs, NotificationChain msgs) {
		NS oldNs = ns;
		ns = newNs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMPackage.OM__NS, oldNs, newNs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNs(NS newNs) {
		if (newNs != ns) {
			NotificationChain msgs = null;
			if (ns != null)
				msgs = ((InternalEObject)ns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMPackage.OM__NS, null, msgs);
			if (newNs != null)
				msgs = ((InternalEObject)newNs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMPackage.OM__NS, null, msgs);
			msgs = basicSetNs(newNs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.OM__NS, newNs, newNs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS getCs() {
		return cs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCs(CS newCs, NotificationChain msgs) {
		CS oldCs = cs;
		cs = newCs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMPackage.OM__CS, oldCs, newCs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCs(CS newCs) {
		if (newCs != cs) {
			NotificationChain msgs = null;
			if (cs != null)
				msgs = ((InternalEObject)cs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMPackage.OM__CS, null, msgs);
			if (newCs != null)
				msgs = ((InternalEObject)newCs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMPackage.OM__CS, null, msgs);
			msgs = basicSetCs(newCs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.OM__CS, newCs, newCs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMPackage.OM__SS:
				return basicSetSs(null, msgs);
			case OMPackage.OM__IS:
				return basicSetIs(null, msgs);
			case OMPackage.OM__NS:
				return basicSetNs(null, msgs);
			case OMPackage.OM__CS:
				return basicSetCs(null, msgs);
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
			case OMPackage.OM__SS:
				return getSs();
			case OMPackage.OM__IS:
				return getIs();
			case OMPackage.OM__NS:
				return getNs();
			case OMPackage.OM__CS:
				return getCs();
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
			case OMPackage.OM__SS:
				setSs((SS)newValue);
				return;
			case OMPackage.OM__IS:
				setIs((IS)newValue);
				return;
			case OMPackage.OM__NS:
				setNs((NS)newValue);
				return;
			case OMPackage.OM__CS:
				setCs((CS)newValue);
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
			case OMPackage.OM__SS:
				setSs((SS)null);
				return;
			case OMPackage.OM__IS:
				setIs((IS)null);
				return;
			case OMPackage.OM__NS:
				setNs((NS)null);
				return;
			case OMPackage.OM__CS:
				setCs((CS)null);
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
			case OMPackage.OM__SS:
				return ss != null;
			case OMPackage.OM__IS:
				return is != null;
			case OMPackage.OM__NS:
				return ns != null;
			case OMPackage.OM__CS:
				return cs != null;
		}
		return super.eIsSet(featureID);
	}

} //OMImpl
