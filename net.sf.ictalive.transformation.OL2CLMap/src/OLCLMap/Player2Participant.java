/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OLCLMap;

import net.sf.ictalive.operetta.OM.Player;

import net.sf.ictalive.owls.process.Participant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player2 Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OLCLMap.Player2Participant#getPlayer <em>Player</em>}</li>
 *   <li>{@link OLCLMap.Player2Participant#getParticipant <em>Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @see OLCLMap.OLCLMapPackage#getPlayer2Participant()
 * @model
 * @generated
 */
public interface Player2Participant extends MapEntry {
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
	 * @see OLCLMap.OLCLMapPackage#getPlayer2Participant_Player()
	 * @model
	 * @generated
	 */
	Player getPlayer();

	/**
	 * Sets the value of the '{@link OLCLMap.Player2Participant#getPlayer <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(Player value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' reference.
	 * @see #setParticipant(Participant)
	 * @see OLCLMap.OLCLMapPackage#getPlayer2Participant_Participant()
	 * @model
	 * @generated
	 */
	Participant getParticipant();

	/**
	 * Sets the value of the '{@link OLCLMap.Player2Participant#getParticipant <em>Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant</em>' reference.
	 * @see #getParticipant()
	 * @generated
	 */
	void setParticipant(Participant value);

} // Player2Participant
