/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.swrl.impl;

import java.util.Collection;

import net.sf.ictalive.swrl.BuiltInAtom;
import net.sf.ictalive.swrl.DataObject;
import net.sf.ictalive.swrl.SwrlPackage;

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
 * An implementation of the model object '<em><b>Built In Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.swrl.impl.BuiltInAtomImpl#getBuiltInID <em>Built In ID</em>}</li>
 *   <li>{@link net.sf.ictalive.swrl.impl.BuiltInAtomImpl#getArg <em>Arg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuiltInAtomImpl extends AtomImpl implements BuiltInAtom
{
	/**
	 * The default value of the '{@link #getBuiltInID() <em>Built In ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuiltInID()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILT_IN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuiltInID() <em>Built In ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuiltInID()
	 * @generated
	 * @ordered
	 */
	protected String builtInID = BUILT_IN_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArg() <em>Arg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArg()
	 * @generated
	 * @ordered
	 */
	protected EList<DataObject> arg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuiltInAtomImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SwrlPackage.Literals.BUILT_IN_ATOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBuiltInID()
	{
		return builtInID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuiltInID(String newBuiltInID)
	{
		String oldBuiltInID = builtInID;
		builtInID = newBuiltInID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwrlPackage.BUILT_IN_ATOM__BUILT_IN_ID, oldBuiltInID, builtInID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataObject> getArg()
	{
		if (arg == null)
		{
			arg = new EObjectContainmentEList<DataObject>(DataObject.class, this, SwrlPackage.BUILT_IN_ATOM__ARG);
		}
		return arg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case SwrlPackage.BUILT_IN_ATOM__ARG:
				return ((InternalEList<?>)getArg()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SwrlPackage.BUILT_IN_ATOM__BUILT_IN_ID:
				return getBuiltInID();
			case SwrlPackage.BUILT_IN_ATOM__ARG:
				return getArg();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SwrlPackage.BUILT_IN_ATOM__BUILT_IN_ID:
				setBuiltInID((String)newValue);
				return;
			case SwrlPackage.BUILT_IN_ATOM__ARG:
				getArg().clear();
				getArg().addAll((Collection<? extends DataObject>)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case SwrlPackage.BUILT_IN_ATOM__BUILT_IN_ID:
				setBuiltInID(BUILT_IN_ID_EDEFAULT);
				return;
			case SwrlPackage.BUILT_IN_ATOM__ARG:
				getArg().clear();
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case SwrlPackage.BUILT_IN_ATOM__BUILT_IN_ID:
				return BUILT_IN_ID_EDEFAULT == null ? builtInID != null : !BUILT_IN_ID_EDEFAULT.equals(builtInID);
			case SwrlPackage.BUILT_IN_ATOM__ARG:
				return arg != null && !arg.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (builtInID: ");
		result.append(builtInID);
		result.append(')');
		return result.toString();
	}

} //BuiltInAtomImpl
