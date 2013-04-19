/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.opera.OM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deontic Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.opera.OM.DeonticStatement#getModality <em>Modality</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.DeonticStatement#getActor <em>Actor</em>}</li>
 *   <li>{@link net.sf.ictalive.opera.OM.DeonticStatement#getWhat <em>What</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.opera.OM.OMPackage#getDeonticStatement()
 * @model abstract="true"
 * @generated
 */
public interface DeonticStatement extends EObject
{
	/**
	 * Returns the value of the '<em><b>Modality</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.ictalive.opera.OM.DeonticModality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modality</em>' attribute.
	 * @see net.sf.ictalive.opera.OM.DeonticModality
	 * @see #setModality(DeonticModality)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getDeonticStatement_Modality()
	 * @model required="true"
	 * @generated
	 */
	DeonticModality getModality();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.DeonticStatement#getModality <em>Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modality</em>' attribute.
	 * @see net.sf.ictalive.opera.OM.DeonticModality
	 * @see #getModality()
	 * @generated
	 */
	void setModality(DeonticModality value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(Player)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getDeonticStatement_Actor()
	 * @model keys="playerID" required="true"
	 * @generated
	 */
	Player getActor();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.DeonticStatement#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Player value);

	/**
	 * Returns the value of the '<em><b>What</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>What</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>What</em>' reference.
	 * @see #setWhat(PartialStateDescription)
	 * @see net.sf.ictalive.opera.OM.OMPackage#getDeonticStatement_What()
	 * @model required="true"
	 * @generated
	 */
	PartialStateDescription getWhat();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.opera.OM.DeonticStatement#getWhat <em>What</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>What</em>' reference.
	 * @see #getWhat()
	 * @generated
	 */
	void setWhat(PartialStateDescription value);

} // DeonticStatement
