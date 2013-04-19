/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.operetta.OM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import net.sf.ictalive.operetta.OM.impl.ObjectiveImpl.ObjectiveException; // @added
/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.operetta.OM.Objective#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.Objective#getConceptName <em>Concept Name</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.Objective#getStateDescription <em>State Description</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.Objective#getSubObjectives <em>Sub Objectives</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.Objective#getParentObjective <em>Parent Objective</em>}</li>
 *   <li>{@link net.sf.ictalive.operetta.OM.Objective#getUsedByRole <em>Used By Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.operetta.OM.OMPackage#getObjective()
 * @model
 * @generated
 */
public interface Objective extends EObject {
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
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getObjective_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.Objective#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Concept Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept Name</em>' reference.
	 * @see #setConceptName(Concept)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getObjective_ConceptName()
	 * @model required="true"
	 * @generated
	 */
	Concept getConceptName();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.Objective#getConceptName <em>Concept Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept Name</em>' reference.
	 * @see #getConceptName()
	 * @generated
	 */
	void setConceptName(Concept value);

	/**
	 * Returns the value of the '<em><b>State Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Description</em>' reference.
	 * @see #setStateDescription(PartialStateDescription)
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getObjective_StateDescription()
	 * @model required="true"
	 * @generated
	 */
	PartialStateDescription getStateDescription();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.operetta.OM.Objective#getStateDescription <em>State Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Description</em>' reference.
	 * @see #getStateDescription()
	 * @generated
	 */
	void setStateDescription(PartialStateDescription value);

	/**
	 * Returns the value of the '<em><b>Sub Objectives</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.operetta.OM.Objective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Objectives</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Objectives</em>' reference list.
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getObjective_SubObjectives()
	 * @model keys="Name"
	 * @generated
	 */
	EList<Objective> getSubObjectives();

	/**
	 * Returns the value of the '<em><b>Parent Objective</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.operetta.OM.Objective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Objective</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Objective</em>' reference list.
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getObjective_ParentObjective()
	 * @model keys="Name" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Objective> getParentObjective();

	/**
	 * Returns the value of the '<em><b>Used By Role</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.operetta.OM.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used By Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used By Role</em>' reference list.
	 * @see net.sf.ictalive.operetta.OM.OMPackage#getObjective_UsedByRole()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Role> getUsedByRole();

	// @added
	EList<Objective> getParent();
	
	// @added
	void addParent(Objective objective) throws ObjectiveException;
	
	// @added
	void removeParent(Objective objective);
	
	// @added
	public EList<Objective> getAllChildren();

} // Objective
