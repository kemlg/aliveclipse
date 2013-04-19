/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.expr.impl;

import net.sf.ictalive.owls.expr.ExprPackage;
import net.sf.ictalive.owls.expr.Expression;
import net.sf.ictalive.owls.expr.ExpressionLanguage;

import net.sf.ictalive.rules.ruleml.Body;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.expr.impl.ExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.expr.impl.ExpressionImpl#getLogicLanguage <em>Logic Language</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.expr.impl.ExpressionImpl#getExpressionBody <em>Expression Body</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.expr.impl.ExpressionImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.expr.impl.ExpressionImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends EObjectImpl implements Expression {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicLanguage() <em>Logic Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final ExpressionLanguage LOGIC_LANGUAGE_EDEFAULT = ExpressionLanguage.KIF;

	/**
	 * The cached value of the '{@link #getLogicLanguage() <em>Logic Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicLanguage()
	 * @generated
	 * @ordered
	 */
	protected ExpressionLanguage logicLanguage = LOGIC_LANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpressionBody() <em>Expression Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionBody()
	 * @generated
	 * @ordered
	 */
	protected Body expressionBody;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExprPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExprPackage.EXPRESSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionLanguage getLogicLanguage() {
		return logicLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicLanguage(ExpressionLanguage newLogicLanguage) {
		ExpressionLanguage oldLogicLanguage = logicLanguage;
		logicLanguage = newLogicLanguage == null ? LOGIC_LANGUAGE_EDEFAULT : newLogicLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExprPackage.EXPRESSION__LOGIC_LANGUAGE, oldLogicLanguage, logicLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Body getExpressionBody() {
		return expressionBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressionBody(Body newExpressionBody, NotificationChain msgs) {
		Body oldExpressionBody = expressionBody;
		expressionBody = newExpressionBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExprPackage.EXPRESSION__EXPRESSION_BODY, oldExpressionBody, newExpressionBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionBody(Body newExpressionBody) {
		if (newExpressionBody != expressionBody) {
			NotificationChain msgs = null;
			if (expressionBody != null)
				msgs = ((InternalEObject)expressionBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExprPackage.EXPRESSION__EXPRESSION_BODY, null, msgs);
			if (newExpressionBody != null)
				msgs = ((InternalEObject)newExpressionBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExprPackage.EXPRESSION__EXPRESSION_BODY, null, msgs);
			msgs = basicSetExpressionBody(newExpressionBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExprPackage.EXPRESSION__EXPRESSION_BODY, newExpressionBody, newExpressionBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExprPackage.EXPRESSION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExprPackage.EXPRESSION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExprPackage.EXPRESSION__EXPRESSION_BODY:
				return basicSetExpressionBody(null, msgs);
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
			case ExprPackage.EXPRESSION__NAME:
				return getName();
			case ExprPackage.EXPRESSION__LOGIC_LANGUAGE:
				return getLogicLanguage();
			case ExprPackage.EXPRESSION__EXPRESSION_BODY:
				return getExpressionBody();
			case ExprPackage.EXPRESSION__ID:
				return getId();
			case ExprPackage.EXPRESSION__VERSION:
				return getVersion();
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
			case ExprPackage.EXPRESSION__NAME:
				setName((String)newValue);
				return;
			case ExprPackage.EXPRESSION__LOGIC_LANGUAGE:
				setLogicLanguage((ExpressionLanguage)newValue);
				return;
			case ExprPackage.EXPRESSION__EXPRESSION_BODY:
				setExpressionBody((Body)newValue);
				return;
			case ExprPackage.EXPRESSION__ID:
				setId((Integer)newValue);
				return;
			case ExprPackage.EXPRESSION__VERSION:
				setVersion((Integer)newValue);
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
			case ExprPackage.EXPRESSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExprPackage.EXPRESSION__LOGIC_LANGUAGE:
				setLogicLanguage(LOGIC_LANGUAGE_EDEFAULT);
				return;
			case ExprPackage.EXPRESSION__EXPRESSION_BODY:
				setExpressionBody((Body)null);
				return;
			case ExprPackage.EXPRESSION__ID:
				setId(ID_EDEFAULT);
				return;
			case ExprPackage.EXPRESSION__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case ExprPackage.EXPRESSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExprPackage.EXPRESSION__LOGIC_LANGUAGE:
				return logicLanguage != LOGIC_LANGUAGE_EDEFAULT;
			case ExprPackage.EXPRESSION__EXPRESSION_BODY:
				return expressionBody != null;
			case ExprPackage.EXPRESSION__ID:
				return id != ID_EDEFAULT;
			case ExprPackage.EXPRESSION__VERSION:
				return version != VERSION_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", logicLanguage: ");
		result.append(logicLanguage);
		result.append(", id: ");
		result.append(id);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ExpressionImpl
