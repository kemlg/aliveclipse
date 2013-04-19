/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Fact;

import net.sf.ictalive.opera.OM.Objective;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Violation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.TaskViolation#getUnmetRequirement <em>Unmet Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getTaskViolation()
 * @model
 * @generated
 */
public interface TaskViolation extends NormViolated
{
	/**
	 * Returns the value of the '<em><b>Unmet Requirement</b></em>' reference list.
	 * The list contents are of type {@link net.sf.ictalive.opera.OM.Objective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unmet Requirement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unmet Requirement</em>' reference list.
	 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getTaskViolation_UnmetRequirement()
	 * @model
	 * @generated
	 */
	EList<Objective> getUnmetRequirement();

} // TaskViolation
