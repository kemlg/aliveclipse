/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.impl;

import control.ControlPackage;
import control.Expr;
import control.Result;
import control.ResultVar;
import control.ValueSpecifierElement;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link control.impl.ResultImpl#getInCondition <em>In Condition</em>}</li>
 *   <li>{@link control.impl.ResultImpl#getHasResultVar <em>Has Result Var</em>}</li>
 *   <li>{@link control.impl.ResultImpl#getHasEffect <em>Has Effect</em>}</li>
 *   <li>{@link control.impl.ResultImpl#getBindingSource <em>Binding Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultImpl extends NamedElementImpl implements Result
{
  /**
	 * The cached value of the '{@link #getInCondition() <em>In Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInCondition()
	 * @generated
	 * @ordered
	 */
  protected EList<Expr> inCondition;

  /**
	 * The cached value of the '{@link #getHasResultVar() <em>Has Result Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHasResultVar()
	 * @generated
	 * @ordered
	 */
  protected ResultVar hasResultVar;

  /**
	 * The cached value of the '{@link #getHasEffect() <em>Has Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHasEffect()
	 * @generated
	 * @ordered
	 */
  protected Expr hasEffect;

  /**
	 * The cached value of the '{@link #getBindingSource() <em>Binding Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBindingSource()
	 * @generated
	 * @ordered
	 */
  protected EList<ValueSpecifierElement> bindingSource;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ResultImpl()
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
		return ControlPackage.Literals.RESULT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Expr> getInCondition()
  {
		if (inCondition == null) {
			inCondition = new EObjectContainmentEList<Expr>(Expr.class, this, ControlPackage.RESULT__IN_CONDITION);
		}
		return inCondition;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ResultVar getHasResultVar()
  {
		return hasResultVar;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetHasResultVar(ResultVar newHasResultVar, NotificationChain msgs)
  {
		ResultVar oldHasResultVar = hasResultVar;
		hasResultVar = newHasResultVar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlPackage.RESULT__HAS_RESULT_VAR, oldHasResultVar, newHasResultVar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setHasResultVar(ResultVar newHasResultVar)
  {
		if (newHasResultVar != hasResultVar) {
			NotificationChain msgs = null;
			if (hasResultVar != null)
				msgs = ((InternalEObject)hasResultVar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControlPackage.RESULT__HAS_RESULT_VAR, null, msgs);
			if (newHasResultVar != null)
				msgs = ((InternalEObject)newHasResultVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControlPackage.RESULT__HAS_RESULT_VAR, null, msgs);
			msgs = basicSetHasResultVar(newHasResultVar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.RESULT__HAS_RESULT_VAR, newHasResultVar, newHasResultVar));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Expr getHasEffect()
  {
		return hasEffect;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetHasEffect(Expr newHasEffect, NotificationChain msgs)
  {
		Expr oldHasEffect = hasEffect;
		hasEffect = newHasEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlPackage.RESULT__HAS_EFFECT, oldHasEffect, newHasEffect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setHasEffect(Expr newHasEffect)
  {
		if (newHasEffect != hasEffect) {
			NotificationChain msgs = null;
			if (hasEffect != null)
				msgs = ((InternalEObject)hasEffect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControlPackage.RESULT__HAS_EFFECT, null, msgs);
			if (newHasEffect != null)
				msgs = ((InternalEObject)newHasEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControlPackage.RESULT__HAS_EFFECT, null, msgs);
			msgs = basicSetHasEffect(newHasEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.RESULT__HAS_EFFECT, newHasEffect, newHasEffect));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ValueSpecifierElement> getBindingSource()
  {
		if (bindingSource == null) {
			bindingSource = new EObjectContainmentEList<ValueSpecifierElement>(ValueSpecifierElement.class, this, ControlPackage.RESULT__BINDING_SOURCE);
		}
		return bindingSource;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ControlPackage.RESULT__IN_CONDITION:
				return ((InternalEList<?>)getInCondition()).basicRemove(otherEnd, msgs);
			case ControlPackage.RESULT__HAS_RESULT_VAR:
				return basicSetHasResultVar(null, msgs);
			case ControlPackage.RESULT__HAS_EFFECT:
				return basicSetHasEffect(null, msgs);
			case ControlPackage.RESULT__BINDING_SOURCE:
				return ((InternalEList<?>)getBindingSource()).basicRemove(otherEnd, msgs);
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
		switch (featureID) {
			case ControlPackage.RESULT__IN_CONDITION:
				return getInCondition();
			case ControlPackage.RESULT__HAS_RESULT_VAR:
				return getHasResultVar();
			case ControlPackage.RESULT__HAS_EFFECT:
				return getHasEffect();
			case ControlPackage.RESULT__BINDING_SOURCE:
				return getBindingSource();
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
		switch (featureID) {
			case ControlPackage.RESULT__IN_CONDITION:
				getInCondition().clear();
				getInCondition().addAll((Collection<? extends Expr>)newValue);
				return;
			case ControlPackage.RESULT__HAS_RESULT_VAR:
				setHasResultVar((ResultVar)newValue);
				return;
			case ControlPackage.RESULT__HAS_EFFECT:
				setHasEffect((Expr)newValue);
				return;
			case ControlPackage.RESULT__BINDING_SOURCE:
				getBindingSource().clear();
				getBindingSource().addAll((Collection<? extends ValueSpecifierElement>)newValue);
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
		switch (featureID) {
			case ControlPackage.RESULT__IN_CONDITION:
				getInCondition().clear();
				return;
			case ControlPackage.RESULT__HAS_RESULT_VAR:
				setHasResultVar((ResultVar)null);
				return;
			case ControlPackage.RESULT__HAS_EFFECT:
				setHasEffect((Expr)null);
				return;
			case ControlPackage.RESULT__BINDING_SOURCE:
				getBindingSource().clear();
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
		switch (featureID) {
			case ControlPackage.RESULT__IN_CONDITION:
				return inCondition != null && !inCondition.isEmpty();
			case ControlPackage.RESULT__HAS_RESULT_VAR:
				return hasResultVar != null;
			case ControlPackage.RESULT__HAS_EFFECT:
				return hasEffect != null;
			case ControlPackage.RESULT__BINDING_SOURCE:
				return bindingSource != null && !bindingSource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResultImpl
