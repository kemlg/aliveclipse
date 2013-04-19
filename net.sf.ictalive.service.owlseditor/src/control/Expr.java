/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.Expr#getName <em>Name</em>}</li>
 *   <li>{@link control.Expr#getLogicLanguage <em>Logic Language</em>}</li>
 *   <li>{@link control.Expr#getBodyLiteral <em>Body Literal</em>}</li>
 *   <li>{@link control.Expr#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getExpr()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Expr extends EObject
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see control.ControlPackage#getExpr_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link control.Expr#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Logic Language</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * The literals are from the enumeration {@link control.ExpressionLanguage}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logic Language</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic Language</em>' attribute.
	 * @see control.ExpressionLanguage
	 * @see #setLogicLanguage(ExpressionLanguage)
	 * @see control.ControlPackage#getExpr_LogicLanguage()
	 * @model default="1"
	 * @generated
	 */
  ExpressionLanguage getLogicLanguage();

  /**
	 * Sets the value of the '{@link control.Expr#getLogicLanguage <em>Logic Language</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic Language</em>' attribute.
	 * @see control.ExpressionLanguage
	 * @see #getLogicLanguage()
	 * @generated
	 */
  void setLogicLanguage(ExpressionLanguage value);

  /**
	 * Returns the value of the '<em><b>Body Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Literal</em>' attribute.
	 * @see #setBodyLiteral(String)
	 * @see control.ControlPackage#getExpr_BodyLiteral()
	 * @model annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	String getBodyLiteral();

		/**
	 * Sets the value of the '{@link control.Expr#getBodyLiteral <em>Body Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Literal</em>' attribute.
	 * @see #getBodyLiteral()
	 * @generated
	 */
	void setBodyLiteral(String value);

		/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see control.ControlPackage#getExpr_Version()
	 * @model
	 * @generated
	 */
  int getVersion();

  /**
	 * Sets the value of the '{@link control.Expr#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
  void setVersion(int value);

} // Expr
