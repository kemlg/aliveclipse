/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control.impl;

import control.Body;
import control.ControlPackage;
import control.Expr;
import control.ExpressionLanguage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link control.impl.ExprImpl#getName <em>Name</em>}</li>
 *   <li>{@link control.impl.ExprImpl#getLogicLanguage <em>Logic Language</em>}</li>
 *   <li>{@link control.impl.ExprImpl#getBodyLiteral <em>Body Literal</em>}</li>
 *   <li>{@link control.impl.ExprImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprImpl extends EObjectImpl implements Expr
{
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
	 * The default value of the '{@link #getBodyLiteral() <em>Body Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_LITERAL_EDEFAULT = null;

		/**
	 * The cached value of the '{@link #getBodyLiteral() <em>Body Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyLiteral()
	 * @generated
	 * @ordered
	 */
	protected String bodyLiteral = BODY_LITERAL_EDEFAULT;

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
  protected ExprImpl()
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
		return ControlPackage.Literals.EXPR;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.EXPR__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ExpressionLanguage getLogicLanguage()
  {
		return logicLanguage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLogicLanguage(ExpressionLanguage newLogicLanguage)
  {
		ExpressionLanguage oldLogicLanguage = logicLanguage;
		logicLanguage = newLogicLanguage == null ? LOGIC_LANGUAGE_EDEFAULT : newLogicLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.EXPR__LOGIC_LANGUAGE, oldLogicLanguage, logicLanguage));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBodyLiteral() {
		return bodyLiteral;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyLiteral(String newBodyLiteral) {
		String oldBodyLiteral = bodyLiteral;
		bodyLiteral = newBodyLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.EXPR__BODY_LITERAL, oldBodyLiteral, bodyLiteral));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getVersion()
  {
		return version;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVersion(int newVersion)
  {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.EXPR__VERSION, oldVersion, version));
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
			case ControlPackage.EXPR__NAME:
				return getName();
			case ControlPackage.EXPR__LOGIC_LANGUAGE:
				return getLogicLanguage();
			case ControlPackage.EXPR__BODY_LITERAL:
				return getBodyLiteral();
			case ControlPackage.EXPR__VERSION:
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
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ControlPackage.EXPR__NAME:
				setName((String)newValue);
				return;
			case ControlPackage.EXPR__LOGIC_LANGUAGE:
				setLogicLanguage((ExpressionLanguage)newValue);
				return;
			case ControlPackage.EXPR__BODY_LITERAL:
				setBodyLiteral((String)newValue);
				return;
			case ControlPackage.EXPR__VERSION:
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case ControlPackage.EXPR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ControlPackage.EXPR__LOGIC_LANGUAGE:
				setLogicLanguage(LOGIC_LANGUAGE_EDEFAULT);
				return;
			case ControlPackage.EXPR__BODY_LITERAL:
				setBodyLiteral(BODY_LITERAL_EDEFAULT);
				return;
			case ControlPackage.EXPR__VERSION:
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case ControlPackage.EXPR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ControlPackage.EXPR__LOGIC_LANGUAGE:
				return logicLanguage != LOGIC_LANGUAGE_EDEFAULT;
			case ControlPackage.EXPR__BODY_LITERAL:
				return BODY_LITERAL_EDEFAULT == null ? bodyLiteral != null : !BODY_LITERAL_EDEFAULT.equals(bodyLiteral);
			case ControlPackage.EXPR__VERSION:
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
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", logicLanguage: ");
		result.append(logicLanguage);
		result.append(", bodyLiteral: ");
		result.append(bodyLiteral);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ExprImpl
