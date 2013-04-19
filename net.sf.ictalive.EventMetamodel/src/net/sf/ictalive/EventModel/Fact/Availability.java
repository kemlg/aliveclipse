/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Fact;

import net.sf.ictalive.EventModel.Objects.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Availability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.Availability#getOfResource <em>Of Resource</em>}</li>
 *   <li>{@link net.sf.ictalive.EventModel.Fact.Availability#getStutus <em>Stutus</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getAvailability()
 * @model
 * @generated
 */
public interface Availability extends Fact
{
	/**
	 * Returns the value of the '<em><b>Of Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of Resource</em>' reference.
	 * @see #setOfResource(Resource)
	 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getAvailability_OfResource()
	 * @model
	 * @generated
	 */
	Resource getOfResource();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Fact.Availability#getOfResource <em>Of Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Of Resource</em>' reference.
	 * @see #getOfResource()
	 * @generated
	 */
	void setOfResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Stutus</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.ictalive.EventModel.Fact.AvailabilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stutus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stutus</em>' attribute.
	 * @see net.sf.ictalive.EventModel.Fact.AvailabilityKind
	 * @see #setStutus(AvailabilityKind)
	 * @see net.sf.ictalive.EventModel.Fact.FactPackage#getAvailability_Stutus()
	 * @model
	 * @generated
	 */
	AvailabilityKind getStutus();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.EventModel.Fact.Availability#getStutus <em>Stutus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stutus</em>' attribute.
	 * @see net.sf.ictalive.EventModel.Fact.AvailabilityKind
	 * @see #getStutus()
	 * @generated
	 */
	void setStutus(AvailabilityKind value);

} // Availability
