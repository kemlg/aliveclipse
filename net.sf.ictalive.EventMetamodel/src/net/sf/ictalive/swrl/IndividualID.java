/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.swrl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.swrl.IndividualID#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.swrl.SwrlPackage#getIndividualID()
 * @model
 * @generated
 */
public interface IndividualID extends IndividualObject
{
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.sf.ictalive.swrl.SwrlPackage#getIndividualID_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.swrl.IndividualID#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // IndividualID
