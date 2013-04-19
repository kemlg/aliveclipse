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
 * A representation of the model object '<em><b>NS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.OM.NS#getNorms <em>Norms</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.opera.OM.OMPackage#getNS()
 * @model
 * @generated
 */
public interface NS extends EObject
{
	/**
	 * Returns the value of the '<em><b>Norms</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.opera.OM.Norm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Norms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Norms</em>' containment reference list.
	 * @see net.sf.ictalive.opera.OM.OMPackage#getNS_Norms()
	 * @model containment="true" keys="normID"
	 * @generated
	 */
	EList<Norm> getNorms();

} // NS
