/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OLCLMap;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see OLCLMap.OLCLMapPackage
 * @generated
 */
public interface OLCLMapFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OLCLMapFactory eINSTANCE = OLCLMap.impl.OLCLMapFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Objective2 Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective2 Action</em>'.
	 * @generated
	 */
	Objective2Action createObjective2Action();

	/**
	 * Returns a new object of class '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping</em>'.
	 * @generated
	 */
	Mapping createMapping();

	/**
	 * Returns a new object of class '<em>Landmark2 Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Landmark2 Action</em>'.
	 * @generated
	 */
	Landmark2Action createLandmark2Action();

	/**
	 * Returns a new object of class '<em>Landmark Pattern2 Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Landmark Pattern2 Action</em>'.
	 * @generated
	 */
	LandmarkPattern2Action createLandmarkPattern2Action();

	/**
	 * Returns a new object of class '<em>Scene2 Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scene2 Action</em>'.
	 * @generated
	 */
	Scene2Action createScene2Action();

	/**
	 * Returns a new object of class '<em>IS2 Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IS2 Action</em>'.
	 * @generated
	 */
	IS2Action createIS2Action();

	/**
	 * Returns a new object of class '<em>Player2 Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player2 Participant</em>'.
	 * @generated
	 */
	Player2Participant createPlayer2Participant();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OLCLMapPackage getOLCLMapPackage();

} //OLCLMapFactory
