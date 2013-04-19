/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.coordination.wfvv;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.coordination.wfvv.WfvvPackage
 * @generated
 */
public interface WfvvFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WfvvFactory eINSTANCE = net.sf.ictalive.coordination.wfvv.impl.WfvvFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Event Model Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Model Container</em>'.
	 * @generated
	 */
	EventModelContainer createEventModelContainer();

	/**
	 * Returns a new object of class '<em>Event Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Group</em>'.
	 * @generated
	 */
	EventGroup createEventGroup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WfvvPackage getWfvvPackage();

} //WfvvFactory
