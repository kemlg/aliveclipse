/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM.impl;

import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.PartialStateDescription;
import net.sf.ictalive.operetta.OM.PathFormula;
import net.sf.ictalive.operetta.OM.Sometime;
import net.sf.ictalive.operetta.OM.util.PrettyPrint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sometime</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.SometimeImpl#getPathFormula <em>Path Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SometimeImpl extends PathFormulaImpl implements Sometime {
	/**
	 * The cached value of the '{@link #getPathFormula() <em>Path Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathFormula()
	 * @generated
	 * @ordered
	 */
	protected PathFormula pathFormula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SometimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMPackage.Literals.SOMETIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathFormula getPathFormula() {
		if (pathFormula != null && pathFormula.eIsProxy()) {
			InternalEObject oldPathFormula = (InternalEObject)pathFormula;
			pathFormula = (PathFormula)eResolveProxy(oldPathFormula);
			if (pathFormula != oldPathFormula) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.SOMETIME__PATH_FORMULA, oldPathFormula, pathFormula));
			}
		}
		return pathFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathFormula basicGetPathFormula() {
		return pathFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setPathFormula(PathFormula newPathFormula) {
		PathFormula oldPathFormula = pathFormula;
		if (newPathFormula == this) {
			//System.err.println("Cannot set formula as its own sub-formula!");
			return;
		}
		pathFormula = newPathFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.SOMETIME__PATH_FORMULA, oldPathFormula, pathFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMPackage.SOMETIME__PATH_FORMULA:
				if (resolve) return getPathFormula();
				return basicGetPathFormula();
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
			case OMPackage.SOMETIME__PATH_FORMULA:
				setPathFormula((PathFormula)newValue);
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
			case OMPackage.SOMETIME__PATH_FORMULA:
				setPathFormula((PathFormula)null);
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
			case OMPackage.SOMETIME__PATH_FORMULA:
				return pathFormula != null;
		}
		return super.eIsSet(featureID);
	}
	
	public EList<PartialStateDescription> getSubFormulas() {
		EList<PartialStateDescription> result = new BasicEList<PartialStateDescription>();
		
		if (pathFormula != null) {
			result.add(pathFormula);
			result.addAll(pathFormula.getSubFormulas());
		}
		
		return result;
	}

	/**
	 * Implementation of Pretty interface, for pretty printing
	 */
	public int getPrecedence() {
		return 12;
	}
	
	public String prettyPrint() {
		return PrettyPrint.prettyPrintPrefix(this, "F ", pathFormula);
	}

} //SometimeImpl
