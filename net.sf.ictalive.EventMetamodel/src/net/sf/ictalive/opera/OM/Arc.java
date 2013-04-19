/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.OM.Arc#getArcID <em>Arc ID</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.Arc#getAccessible <em>Accessible</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.opera.OM.OMPackage#getArc()
 * @model abstract="true"
 * @generated
 */
public interface Arc extends EObject
{
	/**
	 * Returns the value of the '<em><b>Arc ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arc ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc ID</em>' attribute.
	 * @see #setArcID(String)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getArc_ArcID()
	 * @model id="true" required="true" derived="true"
	 * @generated
	 */
	String getArcID();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.Arc#getArcID <em>Arc ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arc ID</em>' attribute.
	 * @see #getArcID()
	 * @generated
	 */
	void setArcID(String value);

	/**
	 * Returns the value of the '<em><b>Accessible</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.opera.OM.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessible</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessible</em>' reference list.
	 * @see net.sf.ictalive.opera.OM.OMPackage#getArc_Accessible()
	 * @model required="true"
	 * @generated
	 */
	EList<Role> getAccessible();

} // Arc
