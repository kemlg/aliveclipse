/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.actions;

import net.sf.ictalive.owls.expr.Condition;
import net.sf.ictalive.owls.expr.Expression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.coordination.actions.ActionResult#getInCondition <em>In Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.ActionResult#getHasAddEffect <em>Has Add Effect</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.ActionResult#getHasDeleteEffect <em>Has Delete Effect</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.ActionResult#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.ictalive.coordination.actions.ActionResult#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.coordination.actions.ActionsPackage#getActionResult()
 * @model
 * @generated
 */
public interface ActionResult extends EObject
{
	/**
	 * Returns the value of the '<em><b>In Condition</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.owls.expr.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Condition</em>' containment reference list.
	 * @see net.sf.ictalive.coordination.actions.ActionsPackage#getActionResult_InCondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getInCondition();

	/**
	 * Returns the value of the '<em><b>Has Add Effect</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.owls.expr.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Add Effect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Add Effect</em>' containment reference list.
	 * @see net.sf.ictalive.coordination.actions.ActionsPackage#getActionResult_HasAddEffect()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getHasAddEffect();

	/**
	 * Returns the value of the '<em><b>Has Delete Effect</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.owls.expr.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Delete Effect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Delete Effect</em>' containment reference list.
	 * @see net.sf.ictalive.coordination.actions.ActionsPackage#getActionResult_HasDeleteEffect()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getHasDeleteEffect();

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
	 * @see net.sf.ictalive.coordination.actions.ActionsPackage#getActionResult_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.actions.ActionResult#getId <em>Id</em>}' attribute.
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
	 * @see net.sf.ictalive.coordination.actions.ActionsPackage#getActionResult_Version()
	 * @model annotation="teneo.jpa appinfo='@Version'"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.coordination.actions.ActionResult#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

} // ActionResult
