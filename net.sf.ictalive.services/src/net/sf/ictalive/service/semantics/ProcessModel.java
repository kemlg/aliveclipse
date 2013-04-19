/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.service.semantics;

import net.sf.ictalive.service.Service;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.service.semantics.ProcessModel#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.service.semantics.ProcessModel#getDescribes <em>Describes</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getProcessModel()
 * @model
 * @generated
 */
public interface ProcessModel extends IOEP {
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
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getProcessModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.ProcessModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Describes</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.sf.ictalive.service.Service#getDescribedBy <em>Described By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Describes</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Describes</em>' container reference.
	 * @see #setDescribes(Service)
	 * @see net.sf.ictalive.service.semantics.SemanticsPackage#getProcessModel_Describes()
	 * @see net.sf.ictalive.service.Service#getDescribedBy
	 * @model opposite="describedBy" transient="false"
	 * @generated
	 */
	Service getDescribes();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.service.semantics.ProcessModel#getDescribes <em>Describes</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Describes</em>' container reference.
	 * @see #getDescribes()
	 * @generated
	 */
	void setDescribes(Service value);

} // ProcessModel
