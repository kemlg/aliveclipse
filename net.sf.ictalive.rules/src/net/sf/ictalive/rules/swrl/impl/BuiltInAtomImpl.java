/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.swrl.impl;

import java.util.Collection;

import net.sf.ictalive.rules.swrl.BuiltInAtom;
import net.sf.ictalive.rules.swrl.DObject;
import net.sf.ictalive.rules.swrl.DefaultBuiltIn;
import net.sf.ictalive.rules.swrl.SwrlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Built In Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.rules.swrl.impl.BuiltInAtomImpl#getBuiltInAtom <em>Built In Atom</em>}</li>
 *   <li>{@link net.sf.ictalive.rules.swrl.impl.BuiltInAtomImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link net.sf.ictalive.rules.swrl.impl.BuiltInAtomImpl#getBuiltIn <em>Built In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuiltInAtomImpl extends AtomImpl implements BuiltInAtom {
	/**
	 * The cached value of the '{@link #getBuiltInAtom() <em>Built In Atom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuiltInAtom()
	 * @generated
	 * @ordered
	 */
	protected BuiltInAtom builtInAtom;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected EList<DObject> args;

	/**
	 * The default value of the '{@link #getBuiltIn() <em>Built In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuiltIn()
	 * @generated
	 * @ordered
	 */
	protected static final DefaultBuiltIn BUILT_IN_EDEFAULT = DefaultBuiltIn.GREATER;

	/**
	 * The cached value of the '{@link #getBuiltIn() <em>Built In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuiltIn()
	 * @generated
	 * @ordered
	 */
	protected DefaultBuiltIn builtIn = BUILT_IN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuiltInAtomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SwrlPackage.Literals.BUILT_IN_ATOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultBuiltIn getBuiltIn() {
		return builtIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuiltIn(DefaultBuiltIn newBuiltIn) {
		DefaultBuiltIn oldBuiltIn = builtIn;
		builtIn = newBuiltIn == null ? BUILT_IN_EDEFAULT : newBuiltIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwrlPackage.BUILT_IN_ATOM__BUILT_IN, oldBuiltIn, builtIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInAtom getBuiltInAtom() {
		return builtInAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuiltInAtom(BuiltInAtom newBuiltInAtom, NotificationChain msgs) {
		BuiltInAtom oldBuiltInAtom = builtInAtom;
		builtInAtom = newBuiltInAtom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrlPackage.BUILT_IN_ATOM__BUILT_IN_ATOM, oldBuiltInAtom, newBuiltInAtom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuiltInAtom(BuiltInAtom newBuiltInAtom) {
		if (newBuiltInAtom != builtInAtom) {
			NotificationChain msgs = null;
			if (builtInAtom != null)
				msgs = ((InternalEObject)builtInAtom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrlPackage.BUILT_IN_ATOM__BUILT_IN_ATOM, null, msgs);
			if (newBuiltInAtom != null)
				msgs = ((InternalEObject)newBuiltInAtom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrlPackage.BUILT_IN_ATOM__BUILT_IN_ATOM, null, msgs);
			msgs = basicSetBuiltInAtom(newBuiltInAtom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwrlPackage.BUILT_IN_ATOM__BUILT_IN_ATOM, newBuiltInAtom, newBuiltInAtom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DObject> getArgs() {
		if (args == null) {
			args = new EObjectResolvingEList<DObject>(DObject.class, this, SwrlPackage.BUILT_IN_ATOM__ARGS);
		}
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SwrlPackage.BUILT_IN_ATOM__BUILT_IN_ATOM:
				return basicSetBuiltInAtom(null, msgs);
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
			case SwrlPackage.BUILT_IN_ATOM__BUILT_IN_ATOM:
				return getBuiltInAtom();
			case SwrlPackage.BUILT_IN_ATOM__ARGS:
				return getArgs();
			case SwrlPackage.BUILT_IN_ATOM__BUILT_IN:
				return getBuiltIn();
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
			case SwrlPackage.BUILT_IN_ATOM__BUILT_IN_ATOM:
				setBuiltInAtom((BuiltInAtom)newValue);
				return;
			case SwrlPackage.BUILT_IN_ATOM__ARGS:
				getArgs().clear();
				getArgs().addAll((Collection<? extends DObject>)newValue);
				return;
			case SwrlPackage.BUILT_IN_ATOM__BUILT_IN:
				setBuiltIn((DefaultBuiltIn)newValue);
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
			case SwrlPackage.BUILT_IN_ATOM__BUILT_IN_ATOM:
				setBuiltInAtom((BuiltInAtom)null);
				return;
			case SwrlPackage.BUILT_IN_ATOM__ARGS:
				getArgs().clear();
				return;
			case SwrlPackage.BUILT_IN_ATOM__BUILT_IN:
				setBuiltIn(BUILT_IN_EDEFAULT);
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
			case SwrlPackage.BUILT_IN_ATOM__BUILT_IN_ATOM:
				return builtInAtom != null;
			case SwrlPackage.BUILT_IN_ATOM__ARGS:
				return args != null && !args.isEmpty();
			case SwrlPackage.BUILT_IN_ATOM__BUILT_IN:
				return builtIn != BUILT_IN_EDEFAULT;
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
		result.append(" (builtIn: ");
		result.append(builtIn);
		result.append(')');
		return result.toString();
	}

} //BuiltInAtomImpl
