/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.fact;

import net.sf.ictalive.operetta.OM.Player;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Fulfilment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ictalive.runtime.fact.PlayerFulfilment#getPlayer <em>Player</em>}</li>
 *   <li>{@link net.sf.ictalive.runtime.fact.PlayerFulfilment#isSatisfy <em>Satisfy</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ictalive.runtime.fact.FactPackage#getPlayerFulfilment()
 * @model
 * @generated
 */
public interface PlayerFulfilment extends OrganisationAct {
	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference.
	 * @see #setPlayer(Player)
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getPlayerFulfilment_Player()
	 * @model
	 * @generated
	 */
	Player getPlayer();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.fact.PlayerFulfilment#getPlayer <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(Player value);

	/**
	 * Returns the value of the '<em><b>Satisfy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfy</em>' attribute.
	 * @see #setSatisfy(boolean)
	 * @see net.sf.ictalive.runtime.fact.FactPackage#getPlayerFulfilment_Satisfy()
	 * @model
	 * @generated
	 */
	boolean isSatisfy();

	/**
	 * Sets the value of the '{@link net.sf.ictalive.runtime.fact.PlayerFulfilment#isSatisfy <em>Satisfy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfy</em>' attribute.
	 * @see #isSatisfy()
	 * @generated
	 */
	void setSatisfy(boolean value);

} // PlayerFulfilment
