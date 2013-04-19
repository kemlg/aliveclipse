/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.syntax;

import net.sf.ictalive.schema.SchemaType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.syntax.InterfaceDescription#getOperation <em>Operation</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.InterfaceDescription#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.InterfaceDescription#getBinding <em>Binding</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.InterfaceDescription#getInLineSchema <em>In Line Schema</em>}</li>
 *   <li>{@link net.sf.ictalive.service.syntax.InterfaceDescription#getOutLineSchema <em>Out Line Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getInterfaceDescription()
 * @model
 * @generated
 */
public interface InterfaceDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.syntax.OperationDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getInterfaceDescription_Operation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OperationDescription> getOperation();

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
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getInterfaceDescription_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.syntax.InterfaceDescription#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.service.syntax.Binding}.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.service.syntax.Binding#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference list.
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getInterfaceDescription_Binding()
	 * @see net.sf.ictalive.service.syntax.Binding#getType
	 * @model opposite="type"
	 * @generated
	 */
	EList<Binding> getBinding();

	/**
	 * Returns the value of the '<em><b>In Line Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Line Schema</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Line Schema</em>' containment reference.
	 * @see #setInLineSchema(SchemaType)
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getInterfaceDescription_InLineSchema()
	 * @model containment="true"
	 * @generated
	 */
	SchemaType getInLineSchema();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.syntax.InterfaceDescription#getInLineSchema <em>In Line Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Line Schema</em>' containment reference.
	 * @see #getInLineSchema()
	 * @generated
	 */
	void setInLineSchema(SchemaType value);

	/**
	 * Returns the value of the '<em><b>Out Line Schema</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.schema.SchemaType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Line Schema</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Line Schema</em>' reference list.
	 * @see net.sf.ictalive.service.syntax.SyntaxPackage#getInterfaceDescription_OutLineSchema()
	 * @model
	 * @generated
	 */
	EList<SchemaType> getOutLineSchema();

} // InterfaceDescription
