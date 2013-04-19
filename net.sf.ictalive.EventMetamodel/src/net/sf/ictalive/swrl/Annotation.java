/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.swrl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.swrl.Annotation#getDesc <em>Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.swrl.SwrlPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject
{
	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see net.sf.ictalive.swrl.SwrlPackage#getAnnotation_Desc()
	 * @model required="true"
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.swrl.Annotation#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

} // Annotation
