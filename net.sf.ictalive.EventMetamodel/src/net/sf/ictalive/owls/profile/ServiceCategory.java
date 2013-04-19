/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.profile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.profile.ServiceCategory#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.ServiceCategory#getTaxonomy <em>Taxonomy</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.ServiceCategory#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.profile.ServiceCategory#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.profile.ProfilePackage#getServiceCategory()
 * @model
 * @generated
 */
public interface ServiceCategory extends EObject
{
	/**
	 * Returns the value of the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Name</em>' attribute.
	 * @see #setCategoryName(String)
	 * @see net.sf.ictalive.owls.profile.ProfilePackage#getServiceCategory_CategoryName()
	 * @model required="true"
	 * @generated
	 */
	String getCategoryName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.profile.ServiceCategory#getCategoryName <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Name</em>' attribute.
	 * @see #getCategoryName()
	 * @generated
	 */
	void setCategoryName(String value);

	/**
	 * Returns the value of the '<em><b>Taxonomy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taxonomy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taxonomy</em>' attribute.
	 * @see #setTaxonomy(Object)
	 * @see net.sf.ictalive.owls.profile.ProfilePackage#getServiceCategory_Taxonomy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 * @generated
	 */
	Object getTaxonomy();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.profile.ServiceCategory#getTaxonomy <em>Taxonomy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taxonomy</em>' attribute.
	 * @see #getTaxonomy()
	 * @generated
	 */
	void setTaxonomy(Object value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see net.sf.ictalive.owls.profile.ProfilePackage#getServiceCategory_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.profile.ServiceCategory#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(Object)
	 * @see net.sf.ictalive.owls.profile.ProfilePackage#getServiceCategory_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 * @generated
	 */
	Object getCode();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.profile.ServiceCategory#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Object value);

} // ServiceCategory
