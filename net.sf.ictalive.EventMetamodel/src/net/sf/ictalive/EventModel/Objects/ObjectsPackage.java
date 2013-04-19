/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.ictalive.EventModel.Objects;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see net.sf.ictalive.EventModel.Objects.ObjectsFactory
 * @model kind="package"
 * @generated
 */
public interface ObjectsPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Objects";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://alive/architecture/objects";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "obj";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjectsPackage eINSTANCE = net.sf.ictalive.EventModel.Objects.impl.ObjectsPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Objects.impl.EnactmentImpl <em>Enactment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Objects.impl.EnactmentImpl
	 * @see net.sf.ictalive.EventModel.Objects.impl.ObjectsPackageImpl#getEnactment()
	 * @generated
	 */
	int ENACTMENT = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENACTMENT__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Session Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENACTMENT__SESSION_ID = 1;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENACTMENT__START_TIME = 2;

	/**
	 * The feature id for the '<em><b>Expire Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENACTMENT__EXPIRE_TIME = 3;

	/**
	 * The feature id for the '<em><b>Finish Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENACTMENT__FINISH_TIME = 4;

	/**
	 * The feature id for the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENACTMENT__TIME = 5;

	/**
	 * The number of structural features of the '<em>Enactment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENACTMENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Objects.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Objects.impl.ResourceImpl
	 * @see net.sf.ictalive.EventModel.Objects.impl.ObjectsPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.ictalive.EventModel.Objects.impl.timeImpl <em>time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ictalive.EventModel.Objects.impl.timeImpl
	 * @see net.sf.ictalive.EventModel.Objects.impl.ObjectsPackageImpl#gettime()
	 * @generated
	 */
	int TIME = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__TIME = 0;

	/**
	 * The number of structural features of the '<em>time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Objects.Enactment <em>Enactment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enactment</em>'.
	 * @see net.sf.ictalive.EventModel.Objects.Enactment
	 * @generated
	 */
	EClass getEnactment();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.ictalive.EventModel.Objects.Enactment#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource</em>'.
	 * @see net.sf.ictalive.EventModel.Objects.Enactment#getResource()
	 * @see #getEnactment()
	 * @generated
	 */
	EReference getEnactment_Resource();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.EventModel.Objects.Enactment#getSessionId <em>Session Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session Id</em>'.
	 * @see net.sf.ictalive.EventModel.Objects.Enactment#getSessionId()
	 * @see #getEnactment()
	 * @generated
	 */
	EAttribute getEnactment_SessionId();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.EventModel.Objects.Enactment#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see net.sf.ictalive.EventModel.Objects.Enactment#getStartTime()
	 * @see #getEnactment()
	 * @generated
	 */
	EAttribute getEnactment_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.EventModel.Objects.Enactment#getExpireTime <em>Expire Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expire Time</em>'.
	 * @see net.sf.ictalive.EventModel.Objects.Enactment#getExpireTime()
	 * @see #getEnactment()
	 * @generated
	 */
	EAttribute getEnactment_ExpireTime();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.EventModel.Objects.Enactment#getFinishTime <em>Finish Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finish Time</em>'.
	 * @see net.sf.ictalive.EventModel.Objects.Enactment#getFinishTime()
	 * @see #getEnactment()
	 * @generated
	 */
	EAttribute getEnactment_FinishTime();

	/**
	 * Returns the meta object for the reference '{@link net.sf.ictalive.EventModel.Objects.Enactment#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time</em>'.
	 * @see net.sf.ictalive.EventModel.Objects.Enactment#getTime()
	 * @see #getEnactment()
	 * @generated
	 */
	EReference getEnactment_Time();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Objects.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see net.sf.ictalive.EventModel.Objects.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for class '{@link net.sf.ictalive.EventModel.Objects.time <em>time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>time</em>'.
	 * @see net.sf.ictalive.EventModel.Objects.time
	 * @generated
	 */
	EClass gettime();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ictalive.EventModel.Objects.time#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see net.sf.ictalive.EventModel.Objects.time#getTime()
	 * @see #gettime()
	 * @generated
	 */
	EAttribute gettime_Time();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ObjectsFactory getObjectsFactory();

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
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Objects.impl.EnactmentImpl <em>Enactment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Objects.impl.EnactmentImpl
		 * @see net.sf.ictalive.EventModel.Objects.impl.ObjectsPackageImpl#getEnactment()
		 * @generated
		 */
		EClass ENACTMENT = eINSTANCE.getEnactment();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENACTMENT__RESOURCE = eINSTANCE.getEnactment_Resource();

		/**
		 * The meta object literal for the '<em><b>Session Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENACTMENT__SESSION_ID = eINSTANCE.getEnactment_SessionId();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENACTMENT__START_TIME = eINSTANCE.getEnactment_StartTime();

		/**
		 * The meta object literal for the '<em><b>Expire Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENACTMENT__EXPIRE_TIME = eINSTANCE.getEnactment_ExpireTime();

		/**
		 * The meta object literal for the '<em><b>Finish Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENACTMENT__FINISH_TIME = eINSTANCE.getEnactment_FinishTime();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENACTMENT__TIME = eINSTANCE.getEnactment_Time();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Objects.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Objects.impl.ResourceImpl
		 * @see net.sf.ictalive.EventModel.Objects.impl.ObjectsPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '{@link net.sf.ictalive.EventModel.Objects.impl.timeImpl <em>time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ictalive.EventModel.Objects.impl.timeImpl
		 * @see net.sf.ictalive.EventModel.Objects.impl.ObjectsPackageImpl#gettime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.gettime();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__TIME = eINSTANCE.gettime_Time();

	}

} //ObjectsPackage
