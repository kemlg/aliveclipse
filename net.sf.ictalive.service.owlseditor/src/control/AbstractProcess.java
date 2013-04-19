/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.AbstractProcess#getHasInput <em>Has Input</em>}</li>
 *   <li>{@link control.AbstractProcess#getHasOutput <em>Has Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getAbstractProcess()
 * @model abstract="true"
 *        annotation="gmf.node label='name'"
 * @generated
 */
public interface AbstractProcess extends NamedElement
{
  /**
	 * Returns the value of the '<em><b>Has Input</b></em>' containment reference list.
	 * The list contents are of type {@link control.Input}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Input</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Input</em>' containment reference list.
	 * @see control.ControlPackage#getAbstractProcess_HasInput()
	 * @model containment="true"
	 *        annotation="gmf.affixed foo='bar'"
	 * @generated
	 */
  EList<Input> getHasInput();

  /**
	 * Returns the value of the '<em><b>Has Output</b></em>' containment reference list.
	 * The list contents are of type {@link control.Output}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Output</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Output</em>' containment reference list.
	 * @see control.ControlPackage#getAbstractProcess_HasOutput()
	 * @model containment="true"
	 *        annotation="gmf.affixed foo='bar'"
	 * @generated
	 */
  EList<Output> getHasOutput();

} // AbstractProcess
