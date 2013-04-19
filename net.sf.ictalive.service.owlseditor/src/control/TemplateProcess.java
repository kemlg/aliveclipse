/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package control;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link control.TemplateProcess#getSlotName <em>Slot Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see control.ControlPackage#getTemplateProcess()
 * @model
 * @generated
 */
public interface TemplateProcess extends AbstractProcess
{
  /**
	 * Returns the value of the '<em><b>Slot Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Slot Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot Name</em>' attribute.
	 * @see #setSlotName(String)
	 * @see control.ControlPackage#getTemplateProcess_SlotName()
	 * @model
	 * @generated
	 */
  String getSlotName();

  /**
	 * Sets the value of the '{@link control.TemplateProcess#getSlotName <em>Slot Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot Name</em>' attribute.
	 * @see #getSlotName()
	 * @generated
	 */
  void setSlotName(String value);

} // TemplateProcess
