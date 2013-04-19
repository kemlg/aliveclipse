/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM.impl;

import net.sf.ictalive.operetta.OM.Atom;
import net.sf.ictalive.operetta.OM.Conjunction;
import net.sf.ictalive.operetta.OM.OMPackage;
import net.sf.ictalive.operetta.OM.PartialStateDescription;
import net.sf.ictalive.operetta.OM.StateFormula;
import net.sf.ictalive.operetta.OM.util.Pretty;
import net.sf.ictalive.operetta.OM.util.PrettyPrint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conjunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.ConjunctionImpl#getLeftStateFormula <em>Left State Formula</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.impl.ConjunctionImpl#getRightStateFormula <em>Right State Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConjunctionImpl extends StateFormulaImpl implements Conjunction, Pretty {
	/**
	 * The cached value of the '{@link #getLeftStateFormula() <em>Left State Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftStateFormula()
	 * @generated
	 * @ordered
	 */
	protected StateFormula leftStateFormula;

	/**
	 * The cached value of the '{@link #getRightStateFormula() <em>Right State Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightStateFormula()
	 * @generated
	 * @ordered
	 */
	protected StateFormula rightStateFormula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConjunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMPackage.Literals.CONJUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateFormula getLeftStateFormula() {
		if (leftStateFormula != null && leftStateFormula.eIsProxy()) {
			InternalEObject oldLeftStateFormula = (InternalEObject)leftStateFormula;
			leftStateFormula = (StateFormula)eResolveProxy(oldLeftStateFormula);
			if (leftStateFormula != oldLeftStateFormula) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.CONJUNCTION__LEFT_STATE_FORMULA, oldLeftStateFormula, leftStateFormula));
			}
		}
		return leftStateFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateFormula basicGetLeftStateFormula() {
		return leftStateFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setLeftStateFormula(StateFormula newLeftStateFormula) {
		StateFormula oldLeftStateFormula = leftStateFormula;
		if (newLeftStateFormula == this) {
			//System.err.println("Cannot set formula as its own sub-formula!");
			return;
		}
		leftStateFormula = newLeftStateFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.CONJUNCTION__LEFT_STATE_FORMULA, oldLeftStateFormula, leftStateFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateFormula getRightStateFormula() {
		if (rightStateFormula != null && rightStateFormula.eIsProxy()) {
			InternalEObject oldRightStateFormula = (InternalEObject)rightStateFormula;
			rightStateFormula = (StateFormula)eResolveProxy(oldRightStateFormula);
			if (rightStateFormula != oldRightStateFormula) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMPackage.CONJUNCTION__RIGHT_STATE_FORMULA, oldRightStateFormula, rightStateFormula));
			}
		}
		return rightStateFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateFormula basicGetRightStateFormula() {
		return rightStateFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRightStateFormula(StateFormula newRightStateFormula) {
		StateFormula oldRightStateFormula = rightStateFormula;
		if (newRightStateFormula == this) {
			//System.err.println("Cannot set formula as its own sub-formula!");
			return;
		}
		rightStateFormula = newRightStateFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMPackage.CONJUNCTION__RIGHT_STATE_FORMULA, oldRightStateFormula, rightStateFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMPackage.CONJUNCTION__LEFT_STATE_FORMULA:
				if (resolve) return getLeftStateFormula();
				return basicGetLeftStateFormula();
			case OMPackage.CONJUNCTION__RIGHT_STATE_FORMULA:
				if (resolve) return getRightStateFormula();
				return basicGetRightStateFormula();
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
			case OMPackage.CONJUNCTION__LEFT_STATE_FORMULA:
				setLeftStateFormula((StateFormula)newValue);
				return;
			case OMPackage.CONJUNCTION__RIGHT_STATE_FORMULA:
				setRightStateFormula((StateFormula)newValue);
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
			case OMPackage.CONJUNCTION__LEFT_STATE_FORMULA:
				setLeftStateFormula((StateFormula)null);
				return;
			case OMPackage.CONJUNCTION__RIGHT_STATE_FORMULA:
				setRightStateFormula((StateFormula)null);
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
			case OMPackage.CONJUNCTION__LEFT_STATE_FORMULA:
				return leftStateFormula != null;
			case OMPackage.CONJUNCTION__RIGHT_STATE_FORMULA:
				return rightStateFormula != null;
		}
		return super.eIsSet(featureID);
	}
	
	public EList<PartialStateDescription> getSubFormulas() {
		EList<PartialStateDescription> result = new BasicEList<PartialStateDescription>();
		
		if (leftStateFormula != null) {
			result.add(leftStateFormula);
			result.addAll(leftStateFormula.getSubFormulas());
		}
		if (rightStateFormula != null) {
			result.add(rightStateFormula);
			result.addAll(rightStateFormula.getSubFormulas());
		}
		
		return result;
	}
	
	/**
	 * Implementation of Pretty interface, for pretty printing
	 */
	public int getPrecedence() {
		return 26;
	}
	
	public String prettyPrint() {
		return PrettyPrint.prettyPrintBinary(this, " \u2227 ", leftStateFormula, rightStateFormula);
	}
	
} //ConjunctionImpl
