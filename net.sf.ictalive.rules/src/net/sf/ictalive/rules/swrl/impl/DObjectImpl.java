/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.rules.swrl.impl;

import net.sf.ictalive.operetta.OM.Variable;

import net.sf.ictalive.rules.swrl.DObject;
import net.sf.ictalive.rules.swrl.DataValue;
import net.sf.ictalive.rules.swrl.SwrlPackage;

import net.sf.ictalive.runtime.NormInstances.Value;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DObject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class DObjectImpl extends EObjectImpl implements DObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SwrlPackage.Literals.DOBJECT;
	}

} //DObjectImpl
