/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.owls.time;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.ictalive.owls.time.TimeFactory
 * @model kind="package"
 * @generated
 */
public interface TimePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "time";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://owls1.1/time";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "time";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimePackage eINSTANCE = net.sf.ictalive.owls.time.impl.TimePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.owls.time.impl.IntervalThingImpl <em>Interval Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.owls.time.impl.IntervalThingImpl
	 * @see net.sf.ictalive.owls.time.impl.TimePackageImpl#getIntervalThing()
	 * @generated
	 */
	int INTERVAL_THING = 0;

	/**
	 * The number of structural features of the '<em>Interval Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_THING_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.owls.time.IntervalThing <em>Interval Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Thing</em>'.
	 * @see net.sf.ictalive.owls.time.IntervalThing
	 * @generated
	 */
	EClass getIntervalThing();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimeFactory getTimeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link net.sf.ictalive.owls.time.impl.IntervalThingImpl <em>Interval Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.owls.time.impl.IntervalThingImpl
		 * @see net.sf.ictalive.owls.time.impl.TimePackageImpl#getIntervalThing()
		 * @generated
		 */
		EClass INTERVAL_THING = eINSTANCE.getIntervalThing();

	}

} //TimePackage
