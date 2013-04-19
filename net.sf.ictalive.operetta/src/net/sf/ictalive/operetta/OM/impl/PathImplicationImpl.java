/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM.impl;

import net.sf.ictalive.operetta.OM.Atom;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.PartialStateDescription;
import net.sf.ictalive.operetta.OM.PathFormula;
import net.sf.ictalive.operetta.OM.PathImplication;
import net.sf.ictalive.operetta.OM.util.PrettyPrint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Implication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.PathImplicationImpl#getAntecedentPathFormula <em>Antecedent Path Formula</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.PathImplicationImpl#getConsequentPathFormula <em>Consequent Path Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathImplicationImpl extends PathFormulaImpl implements PathImplication {
	/**
	 * The cached value of the '{@link #getAntecedentPathFormula() <em>Antecedent Path Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentPathFormula()
	 * @generated
	 * @ordered
	 */
	protected PathFormula antecedentPathFormula;

	/**
	 * The cached value of the '{@link #getConsequentPathFormula() <em>Consequent Path Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequentPathFormula()
	 * @generated
	 * @ordered
	 */
	protected PathFormula consequentPathFormula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathImplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMPackage.Literals.PATH_IMPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathFormula getAntecedentPathFormula() {
		if (antecedentPathFormula != null && antecedentPathFormula.eIsProxy()) {
			InternalEObject oldAntecedentPathFormula = (InternalEObject)antecedentPathFormula;
			antecedentPathFormula = (PathFormula)eResolveProxy(oldAntecedentPathFormula);
			if (antecedentPathFormula != oldAntecedentPathFormula) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.PATH_IMPLICATION__ANTECEDENT_PATH_FORMULA, oldAntecedentPathFormula, antecedentPathFormula));
			}
		}
		return antecedentPathFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathFormula basicGetAntecedentPathFormula() {
		return antecedentPathFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAntecedentPathFormula(PathFormula newAntecedentPathFormula) {
		PathFormula oldAntecedentPathFormula = antecedentPathFormula;
		if (newAntecedentPathFormula == this) {
			//System.err.println("Cannot set formula as its own sub-formula!");
			return;
		}
		antecedentPathFormula = newAntecedentPathFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.PATH_IMPLICATION__ANTECEDENT_PATH_FORMULA, oldAntecedentPathFormula, antecedentPathFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathFormula getConsequentPathFormula() {
		if (consequentPathFormula != null && consequentPathFormula.eIsProxy()) {
			InternalEObject oldConsequentPathFormula = (InternalEObject)consequentPathFormula;
			consequentPathFormula = (PathFormula)eResolveProxy(oldConsequentPathFormula);
			if (consequentPathFormula != oldConsequentPathFormula) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.PATH_IMPLICATION__CONSEQUENT_PATH_FORMULA, oldConsequentPathFormula, consequentPathFormula));
			}
		}
		return consequentPathFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathFormula basicGetConsequentPathFormula() {
		return consequentPathFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setConsequentPathFormula(PathFormula newConsequentPathFormula) {
		PathFormula oldConsequentPathFormula = consequentPathFormula;
		if (newConsequentPathFormula == this) {
			//System.err.println("Cannot set formula as its own sub-formula!");
			return;
		}
		consequentPathFormula = newConsequentPathFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.PATH_IMPLICATION__CONSEQUENT_PATH_FORMULA, oldConsequentPathFormula, consequentPathFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMPackage.PATH_IMPLICATION__ANTECEDENT_PATH_FORMULA:
				if (resolve) return getAntecedentPathFormula();
				return basicGetAntecedentPathFormula();
			case OMPackage.PATH_IMPLICATION__CONSEQUENT_PATH_FORMULA:
				if (resolve) return getConsequentPathFormula();
				return basicGetConsequentPathFormula();
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
			case OMPackage.PATH_IMPLICATION__ANTECEDENT_PATH_FORMULA:
				setAntecedentPathFormula((PathFormula)newValue);
				return;
			case OMPackage.PATH_IMPLICATION__CONSEQUENT_PATH_FORMULA:
				setConsequentPathFormula((PathFormula)newValue);
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
			case OMPackage.PATH_IMPLICATION__ANTECEDENT_PATH_FORMULA:
				setAntecedentPathFormula((PathFormula)null);
				return;
			case OMPackage.PATH_IMPLICATION__CONSEQUENT_PATH_FORMULA:
				setConsequentPathFormula((PathFormula)null);
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
			case OMPackage.PATH_IMPLICATION__ANTECEDENT_PATH_FORMULA:
				return antecedentPathFormula != null;
			case OMPackage.PATH_IMPLICATION__CONSEQUENT_PATH_FORMULA:
				return consequentPathFormula != null;
		}
		return super.eIsSet(featureID);
	}
		
	public EList<PartialStateDescription> getSubFormulas() {
		EList<PartialStateDescription> result = new BasicEList<PartialStateDescription>();
		
		if (antecedentPathFormula != null) {
			result.add(antecedentPathFormula);
			result.addAll(antecedentPathFormula.getSubFormulas());
		}
		if (consequentPathFormula != null) {
			result.add(consequentPathFormula);
			result.addAll(consequentPathFormula.getSubFormulas());
		}
		
		return result;
	}
	
	/**
	 * Implementation of Pretty interface, for pretty printing
	 */
	public int getPrecedence() {
		return 14;
	}
	
	public String prettyPrint() {
		return PrettyPrint.prettyPrintBinary(this, " \u2192 ", antecedentPathFormula, consequentPathFormula);
	}

} //PathImplicationImpl
