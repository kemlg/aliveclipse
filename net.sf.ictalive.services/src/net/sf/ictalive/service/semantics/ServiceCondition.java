/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics;

import net.sf.ictalive.rules.ruleml.Body;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.semantics.ServiceCondition#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceCondition()
 * @model
 * @generated
 */
public interface ServiceCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Body)
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceCondition_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Body getExpression();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.ServiceCondition#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Body value);

} // ServiceCondition
