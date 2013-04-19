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
 * A representation of the model object '<em><b>Control Construct Bag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.owls.process.ControlConstructBag#getFirst <em>First</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.ControlConstructBag#getRest <em>Rest</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.ControlConstructBag#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.ictalive.owls.process.ControlConstructBag#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.owls.process.ProcessPackage#getControlConstructBag()
 * @model
 * @generated
 */
public interface ControlConstructBag extends EObject
{
	/**
	 * Returns the value of the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' containment reference.
	 * @see #setFirst(ControlConstruct)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getControlConstructBag_First()
	 * @model containment="true"
	 * @generated
	 */
	ControlConstruct getFirst();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.ControlConstructBag#getFirst <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' containment reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(ControlConstruct value);

	/**
	 * Returns the value of the '<em><b>Rest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rest</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest</em>' containment reference.
	 * @see #setRest(ControlConstructBag)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getControlConstructBag_Rest()
	 * @model containment="true"
	 * @generated
	 */
	ControlConstructBag getRest();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.ControlConstructBag#getRest <em>Rest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest</em>' containment reference.
	 * @see #getRest()
	 * @generated
	 */
	void setRest(ControlConstructBag value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getControlConstructBag_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.ControlConstructBag#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see net.sf.ictalive.owls.process.ProcessPackage#getControlConstructBag_Version()
	 * @model annotation="teneo.jpa appinfo='@Version'"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.owls.process.ControlConstructBag#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

} // ControlConstructBag
