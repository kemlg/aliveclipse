/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera;

import net.sf.ictalive.opera.OM.OM;
import net.sf.ictalive.opera.OM.Objective;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oper AModel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.OperAModel#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OperAModel#getOm <em>Om</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OperAModel#getOrganisationObjectives <em>Organisation Objectives</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.opera.OperaPackage#getOperAModel()
 * @model
 * @generated
 */
public interface OperAModel extends EObject
{
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
	 * @see net.sf.ictalive.opera.OperaPackage#getOperAModel_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OperAModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Om</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Om</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Om</em>' containment reference.
	 * @see #setOm(OM)
	 * @see net.sf.ictalive.opera.OperaPackage#getOperAModel_Om()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OM getOm();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OperAModel#getOm <em>Om</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Om</em>' containment reference.
	 * @see #getOm()
	 * @generated
	 */
	void setOm(OM value);

	/**
	 * Returns the value of the '<em><b>Organisation Objectives</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.ictalive.opera.OM.Objective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisation Objectives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation Objectives</em>' containment reference list.
	 * @see net.sf.ictalive.opera.OperaPackage#getOperAModel_OrganisationObjectives()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Objective> getOrganisationObjectives();

} // OperAModel
