/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics;

import net.sf.ictalive.swrl.Antecedent;
import net.sf.ictalive.swrl.Consequent;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.semantics.ServiceResult#getExpression <em>Expression</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.ServiceResult#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceResult()
 * @model
 * @generated
 */
public interface ServiceResult extends EObject
{
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Antecedent)
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceResult_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Antecedent getExpression();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.ServiceResult#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Antecedent value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(Consequent)
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceResult_Result()
	 * @model
	 * @generated
	 */
	Consequent getResult();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.ServiceResult#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Consequent value);

} // ServiceResult
