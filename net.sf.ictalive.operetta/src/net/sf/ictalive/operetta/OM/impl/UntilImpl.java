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
import net.sf.ictalive.operetta.OM.Until;
import net.sf.ictalive.operetta.OM.util.PrettyPrint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Until</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.UntilImpl#getFromPathFormula <em>From Path Formula</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.UntilImpl#getUntilPathFormula <em>Until Path Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UntilImpl extends PathFormulaImpl implements Until {
	/**
	 * The cached value of the '{@link #getFromPathFormula() <em>From Path Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPathFormula()
	 * @generated
	 * @ordered
	 */
	protected PathFormula fromPathFormula;

	/**
	 * The cached value of the '{@link #getUntilPathFormula() <em>Until Path Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilPathFormula()
	 * @generated
	 * @ordered
	 */
	protected PathFormula untilPathFormula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UntilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMPackage.Literals.UNTIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathFormula getFromPathFormula() {
		if (fromPathFormula != null && fromPathFormula.eIsProxy()) {
			InternalEObject oldFromPathFormula = (InternalEObject)fromPathFormula;
			fromPathFormula = (PathFormula)eResolveProxy(oldFromPathFormula);
			if (fromPathFormula != oldFromPathFormula) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.UNTIL__FROM_PATH_FORMULA, oldFromPathFormula, fromPathFormula));
			}
		}
		return fromPathFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathFormula basicGetFromPathFormula() {
		return fromPathFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setFromPathFormula(PathFormula newFromPathFormula) {
		PathFormula oldFromPathFormula = fromPathFormula;
		if (newFromPathFormula == this) {
			//System.err.println("Cannot set formula as its own sub-formula!");
			return;
		}
		fromPathFormula = newFromPathFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.UNTIL__FROM_PATH_FORMULA, oldFromPathFormula, fromPathFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathFormula getUntilPathFormula() {
		if (untilPathFormula != null && untilPathFormula.eIsProxy()) {
			InternalEObject oldUntilPathFormula = (InternalEObject)untilPathFormula;
			untilPathFormula = (PathFormula)eResolveProxy(oldUntilPathFormula);
			if (untilPathFormula != oldUntilPathFormula) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.UNTIL__UNTIL_PATH_FORMULA, oldUntilPathFormula, untilPathFormula));
			}
		}
		return untilPathFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathFormula basicGetUntilPathFormula() {
		return untilPathFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setUntilPathFormula(PathFormula newUntilPathFormula) {
		PathFormula oldUntilPathFormula = untilPathFormula;
		if (newUntilPathFormula == this) {
			//System.err.println("Cannot set formula as its own sub-formula!");
			return;
		}
		untilPathFormula = newUntilPathFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.UNTIL__UNTIL_PATH_FORMULA, oldUntilPathFormula, untilPathFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMPackage.UNTIL__FROM_PATH_FORMULA:
				if (resolve) return getFromPathFormula();
				return basicGetFromPathFormula();
			case OMPackage.UNTIL__UNTIL_PATH_FORMULA:
				if (resolve) return getUntilPathFormula();
				return basicGetUntilPathFormula();
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
			case OMPackage.UNTIL__FROM_PATH_FORMULA:
				setFromPathFormula((PathFormula)newValue);
				return;
			case OMPackage.UNTIL__UNTIL_PATH_FORMULA:
				setUntilPathFormula((PathFormula)newValue);
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
			case OMPackage.UNTIL__FROM_PATH_FORMULA:
				setFromPathFormula((PathFormula)null);
				return;
			case OMPackage.UNTIL__UNTIL_PATH_FORMULA:
				setUntilPathFormula((PathFormula)null);
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
			case OMPackage.UNTIL__FROM_PATH_FORMULA:
				return fromPathFormula != null;
			case OMPackage.UNTIL__UNTIL_PATH_FORMULA:
				return untilPathFormula != null;
		}
		return super.eIsSet(featureID);
	}
		
	public EList<PartialStateDescription> getSubFormulas() {
		EList<PartialStateDescription> result = new BasicEList<PartialStateDescription>();
		
		if (fromPathFormula != null) {
			result.add(fromPathFormula);
			result.addAll(fromPathFormula.getSubFormulas());
		}
		if (untilPathFormula != null) {
			result.add(untilPathFormula);
			result.addAll(untilPathFormula.getSubFormulas());
		}
		
		return result;
	}
	
	/**
	 * Implementation of Pretty interface, for pretty printing
	 */
	public int getPrecedence() {
		return 10;
	}
	
	public String prettyPrint() {
		return PrettyPrint.prettyPrintBinary(this, " U ", fromPathFormula, untilPathFormula);
	}

} //UntilImpl
