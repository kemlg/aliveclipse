/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.semantics.ServiceCategory#getTaxonomy <em>Taxonomy</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.ServiceCategory#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.ServiceCategory#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.ServiceCategory#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceCategory()
 * @model
 * @generated
 */
public interface ServiceCategory extends EObject
{
	/**
	 * Returns the value of the '<em><b>Taxonomy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taxonomy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taxonomy</em>' attribute.
	 * @see #setTaxonomy(String)
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceCategory_Taxonomy()
	 * @model
	 * @generated
	 */
	String getTaxonomy();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.ServiceCategory#getTaxonomy <em>Taxonomy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taxonomy</em>' attribute.
	 * @see #getTaxonomy()
	 * @generated
	 */
	void setTaxonomy(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceCategory_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.ServiceCategory#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

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
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceCategory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.ServiceCategory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getServiceCategory_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.ServiceCategory#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // ServiceCategory
