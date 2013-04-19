/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.Perform#getTheProcess <em>The Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getPerform()
 * @model
 * @generated
 */
public interface Perform extends ControlConstruct
{
  /**
	 * Returns the value of the '<em><b>The Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>The Process</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>The Process</em>' containment reference.
	 * @see #setTheProcess(AbstractProcess)
	 * @see control.ControlPackage#getPerform_TheProcess()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
  AbstractProcess getTheProcess();

  /**
	 * Sets the value of the '{@link control.Perform#getTheProcess <em>The Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Process</em>' containment reference.
	 * @see #getTheProcess()
	 * @generated
	 */
  void setTheProcess(AbstractProcess value);

} // Perform
