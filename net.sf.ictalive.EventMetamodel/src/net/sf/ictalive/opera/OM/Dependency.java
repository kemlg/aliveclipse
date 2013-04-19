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
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.OM.Dependency#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.Dependency#getObjectOfDependency <em>Object Of Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.opera.OM.OMPackage#getDependency()
 * @model abstract="true"
 * @generated
 */
public interface Dependency extends EObject
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see net.sf.ictalive.opera.OM.OMPackage#getDependency_Name()
	 * @model default="" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Object Of Dependency</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.opera.OM.Objective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Of Dependency</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Of Dependency</em>' reference list.
	 * @see net.sf.ictalive.opera.OM.OMPackage#getDependency_ObjectOfDependency()
	 * @model required="true"
	 * @generated
	 */
	EList<Objective> getObjectOfDependency();

} // Dependency
