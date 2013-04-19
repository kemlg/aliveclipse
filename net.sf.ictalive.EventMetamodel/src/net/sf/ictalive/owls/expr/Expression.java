/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.expr;

import net.sf.ictalive.swrl.Antecedent;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.expr.Expression#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.expr.Expression#getLogicLanguage <em>Logic Language</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.expr.Expression#getExpressionBody <em>Expression Body</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.expr.Expression#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.expr.Expression#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.expr.ExprPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
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
	 * @see net.sf.ictalive.owls.expr.ExprPackage#getExpression_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.expr.Expression#getName <em>Name</em>}' attribute.
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
	 * The literals are from the enumeration {@link net.sf.ictalive.owls.expr.ExpressionLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logic Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic Language</em>' attribute.
	 * @see net.sf.ictalive.owls.expr.ExpressionLanguage
	 * @see #setLogicLanguage(ExpressionLanguage)
	 * @see net.sf.ictalive.owls.expr.ExprPackage#getExpression_LogicLanguage()
	 * @model default="1"
	 * @generated
	 */
	ExpressionLanguage getLogicLanguage();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.expr.Expression#getLogicLanguage <em>Logic Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic Language</em>' attribute.
	 * @see net.sf.ictalive.owls.expr.ExpressionLanguage
	 * @see #getLogicLanguage()
	 * @generated
	 */
	void setLogicLanguage(ExpressionLanguage value);

	/**
	 * Returns the value of the '<em><b>Expression Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Body</em>' containment reference.
	 * @see #setExpressionBody(Antecedent)
	 * @see net.sf.ictalive.owls.expr.ExprPackage#getExpression_ExpressionBody()
	 * @model containment="true"
	 * @generated
	 */
	Antecedent getExpressionBody();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.expr.Expression#getExpressionBody <em>Expression Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Body</em>' containment reference.
	 * @see #getExpressionBody()
	 * @generated
	 */
	void setExpressionBody(Antecedent value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see net.sf.ictalive.owls.expr.ExprPackage#getExpression_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.expr.Expression#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see net.sf.ictalive.owls.expr.ExprPackage#getExpression_Version()
	 * @model annotation="teneo.jpa appinfo='@Version'"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.expr.Expression#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

} // Expression
