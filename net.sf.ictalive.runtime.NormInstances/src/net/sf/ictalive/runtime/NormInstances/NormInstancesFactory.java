/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.runtime.NormInstances;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.runtime.NormInstances.NormInstancesPackage
 * @generated
 */
public interface NormInstancesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NormInstancesFactory eINSTANCE = net.sf.ictalive.runtime.NormInstances.impl.NormInstancesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Norm Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Norm Instance</em>'.
	 * @generated
	 */
	NormInstance createNormInstance();

	/**
	 * Returns a new object of class '<em>Partial State Description Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partial State Description Instance</em>'.
	 * @generated
	 */
	PartialStateDescriptionInstance createPartialStateDescriptionInstance();

	/**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
	Value createValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NormInstancesPackage getNormInstancesPackage();

} //NormInstancesFactory
