/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Construct List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.ControlConstructList#getFirst <em>First</em>}</li>
 *   <li>{@link control.ControlConstructList#getRest <em>Rest</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getControlConstructList()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface ControlConstructList extends NamedElement
{
  /**
	 * Returns the value of the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' containment reference.
	 * @see #setFirst(ControlConstruct)
	 * @see control.ControlPackage#getControlConstructList_First()
	 * @model containment="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
  ControlConstruct getFirst();

  /**
	 * Sets the value of the '{@link control.ControlConstructList#getFirst <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' containment reference.
	 * @see #getFirst()
	 * @generated
	 */
  void setFirst(ControlConstruct value);

  /**
	 * Returns the value of the '<em><b>Rest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rest</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest</em>' containment reference.
	 * @see #setRest(ControlConstructList)
	 * @see control.ControlPackage#getControlConstructList_Rest()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
  ControlConstructList getRest();

  /**
	 * Sets the value of the '{@link control.ControlConstructList#getRest <em>Rest</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest</em>' containment reference.
	 * @see #getRest()
	 * @generated
	 */
  void setRest(ControlConstructList value);

} // ControlConstructList
