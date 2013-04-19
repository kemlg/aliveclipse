/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process;

import net.sf.ictalive.owls.expr.Condition;
import net.sf.ictalive.owls.expr.Expression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.process.Result#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.Result#getHasResultVar <em>Has Result Var</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.Result#getInCondition <em>In Condition</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.Result#getHasEffect <em>Has Effect</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.Result#getWithOutput <em>With Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.process.ProcessPackage#getResult()
 * @model
 * @generated
 */
public interface Result extends EObject
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
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getResult_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.Result#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Result Var</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.owls.process.ResultVar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Result Var</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Result Var</em>' containment reference list.
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getResult_HasResultVar()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResultVar> getHasResultVar();

	/**
	 * Returns the value of the '<em><b>In Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Condition</em>' reference.
	 * @see #setInCondition(Condition)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getResult_InCondition()
	 * @model
	 * @generated
	 */
	Condition getInCondition();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.Result#getInCondition <em>In Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Condition</em>' reference.
	 * @see #getInCondition()
	 * @generated
	 */
	void setInCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Has Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Effect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Effect</em>' containment reference.
	 * @see #setHasEffect(Expression)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getResult_HasEffect()
	 * @model containment="true"
	 * @generated
	 */
	Expression getHasEffect();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.Result#getHasEffect <em>Has Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Effect</em>' containment reference.
	 * @see #getHasEffect()
	 * @generated
	 */
	void setHasEffect(Expression value);

	/**
	 * Returns the value of the '<em><b>With Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With Output</em>' containment reference.
	 * @see #setWithOutput(OutputBinding)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getResult_WithOutput()
	 * @model containment="true"
	 * @generated
	 */
	OutputBinding getWithOutput();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.Result#getWithOutput <em>With Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With Output</em>' containment reference.
	 * @see #getWithOutput()
	 * @generated
	 */
	void setWithOutput(OutputBinding value);

} // Result
