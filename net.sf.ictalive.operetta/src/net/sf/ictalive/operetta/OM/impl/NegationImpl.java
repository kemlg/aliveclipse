/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM.impl;

import net.sf.ictalive.operetta.OM.Negation;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.PartialStateDescription;
import net.sf.ictalive.operetta.OM.StateFormula;
import net.sf.ictalive.operetta.OM.util.PrettyPrint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.NegationImpl#getStateFormula <em>State Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NegationImpl extends StateFormulaImpl implements Negation {
	/**
	 * The cached value of the '{@link #getStateFormula() <em>State Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateFormula()
	 * @generated
	 * @ordered
	 */
	protected StateFormula stateFormula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMPackage.Literals.NEGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateFormula getStateFormula() {
		if (stateFormula != null && stateFormula.eIsProxy()) {
			InternalEObject oldStateFormula = (InternalEObject)stateFormula;
			stateFormula = (StateFormula)eResolveProxy(oldStateFormula);
			if (stateFormula != oldStateFormula) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.NEGATION__STATE_FORMULA, oldStateFormula, stateFormula));
			}
		}
		return stateFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateFormula basicGetStateFormula() {
		return stateFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setStateFormula(StateFormula newStateFormula) {
		StateFormula oldStateFormula = stateFormula;
		if (newStateFormula == this) {
			//System.err.println("Cannot set formula as its own sub-formula!");
			return;
		}
		stateFormula = newStateFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.NEGATION__STATE_FORMULA, oldStateFormula, stateFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMPackage.NEGATION__STATE_FORMULA:
				if (resolve) return getStateFormula();
				return basicGetStateFormula();
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
			case OMPackage.NEGATION__STATE_FORMULA:
				setStateFormula((StateFormula)newValue);
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
			case OMPackage.NEGATION__STATE_FORMULA:
				setStateFormula((StateFormula)null);
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
			case OMPackage.NEGATION__STATE_FORMULA:
				return stateFormula != null;
		}
		return super.eIsSet(featureID);
	}
		
	public EList<PartialStateDescription> getSubFormulas() {
		EList<PartialStateDescription> result = new BasicEList<PartialStateDescription>();
		
		if (stateFormula != null) {
			result.add(stateFormula);
			result.addAll(stateFormula.getSubFormulas());
		}
		
		return result;
	}

	/**
	 * Implementation of Pretty interface, for pretty printing
	 */
	public int getPrecedence() {
		return 27;
	}
	
	public String prettyPrint() {
		return PrettyPrint.prettyPrintPrefix(this, "\u00ac", stateFormula);
	}

} //NegationImpl
