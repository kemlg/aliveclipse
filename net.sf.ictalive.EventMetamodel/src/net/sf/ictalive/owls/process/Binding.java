/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.process;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.process.Binding#getToParam <em>To Param</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.Binding#getValueSpecifier <em>Value Specifier</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.Binding#getValueData <em>Value Data</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.Binding#getValueFrom <em>Value From</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.Binding#getValueFunction <em>Value Function</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.Binding#getValueSource <em>Value Source</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.Binding#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.process.ProcessPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject
{
	/**
	 * Returns the value of the '<em><b>To Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Param</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Param</em>' reference.
	 * @see #setToParam(Parameter)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getBinding_ToParam()
	 * @model required="true"
	 * @generated
	 */
	Parameter getToParam();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.Binding#getToParam <em>To Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Param</em>' reference.
	 * @see #getToParam()
	 * @generated
	 */
	void setToParam(Parameter value);

	/**
	 * Returns the value of the '<em><b>Value Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Specifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Specifier</em>' attribute.
	 * @see #setValueSpecifier(String)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getBinding_ValueSpecifier()
	 * @model
	 * @generated
	 */
	String getValueSpecifier();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.Binding#getValueSpecifier <em>Value Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Specifier</em>' attribute.
	 * @see #getValueSpecifier()
	 * @generated
	 */
	void setValueSpecifier(String value);

	/**
	 * Returns the value of the '<em><b>Value Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Data</em>' attribute.
	 * @see #setValueData(String)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getBinding_ValueData()
	 * @model
	 * @generated
	 */
	String getValueData();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.Binding#getValueData <em>Value Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Data</em>' attribute.
	 * @see #getValueData()
	 * @generated
	 */
	void setValueData(String value);

	/**
	 * Returns the value of the '<em><b>Value From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value From</em>' reference.
	 * @see #setValueFrom(EObject)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getBinding_ValueFrom()
	 * @model
	 * @generated
	 */
	EObject getValueFrom();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.Binding#getValueFrom <em>Value From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value From</em>' reference.
	 * @see #getValueFrom()
	 * @generated
	 */
	void setValueFrom(EObject value);

	/**
	 * Returns the value of the '<em><b>Value Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Function</em>' reference.
	 * @see #setValueFunction(EObject)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getBinding_ValueFunction()
	 * @model
	 * @generated
	 */
	EObject getValueFunction();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.Binding#getValueFunction <em>Value Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Function</em>' reference.
	 * @see #getValueFunction()
	 * @generated
	 */
	void setValueFunction(EObject value);

	/**
	 * Returns the value of the '<em><b>Value Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Source</em>' containment reference.
	 * @see #setValueSource(ValueOf)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getBinding_ValueSource()
	 * @model containment="true"
	 * @generated
	 */
	ValueOf getValueSource();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.Binding#getValueSource <em>Value Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Source</em>' containment reference.
	 * @see #getValueSource()
	 * @generated
	 */
	void setValueSource(ValueOf value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see #setValueType(String)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getBinding_ValueType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getValueType();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.Binding#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(String value);

} // Binding
