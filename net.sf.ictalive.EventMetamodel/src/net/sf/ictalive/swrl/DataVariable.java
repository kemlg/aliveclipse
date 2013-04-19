/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.swrl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.swrl.DataVariable#getURI <em>URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.swrl.SwrlPackage#getDataVariable()
 * @model
 * @generated
 */
public interface DataVariable extends DataObject
{
	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see net.sf.ictalive.swrl.SwrlPackage#getDataVariable_URI()
	 * @model
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.swrl.DataVariable#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

} // DataVariable
