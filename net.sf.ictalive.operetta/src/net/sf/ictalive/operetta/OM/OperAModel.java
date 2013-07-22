/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oper AModel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.OperAModel#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.OperAModel#getOm <em>Om</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.operetta.OM.OMPackage#getOperAModel()
 * @model
 * @generated
 */
public interface OperAModel extends EObject {
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
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getOperAModel_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.OperAModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Om</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Om</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Om</em>' containment reference.
	 * @see #setOm(OM)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getOperAModel_Om()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OM getOm();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.OperAModel#getOm <em>Om</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Om</em>' containment reference.
	 * @see #getOm()
	 * @generated
	 */
	void setOm(OM value);

} // OperAModel
